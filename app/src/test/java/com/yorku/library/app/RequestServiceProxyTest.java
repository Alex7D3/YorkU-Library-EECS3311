package com.yorku.library.app;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.util.concurrent.*;

import com.yorku.library.app.services.requests.RequestService;
import com.yorku.library.app.services.requests.RequestServiceProxy;
import org.junit.Before;
import org.junit.Test;

public class RequestServiceProxyTest {

    private RequestService realService;
    private RequestServiceProxy requestServiceProxy;
    private ScheduledExecutorService scheduler;
    @Before
    public void setUp() {
        realService = mock(RequestService.class);
        scheduler = spy(ScheduledExecutorService.class);
        requestServiceProxy = new RequestServiceProxy(realService, scheduler);
    }

    @Test
    public void testGetRequestFromCache() throws Exception {
        String path = "/api/get";
        String expectedResponse = "Generic GET response.";

        when(realService.getRequest(path))
                .thenReturn(CompletableFuture.supplyAsync(() -> "Generic GET response."));

        requestServiceProxy.getRequest(path).join();

        when(realService.getRequest(path))
                .thenThrow(new AssertionError("Real service should not be called"));

        CompletableFuture<String> responseFuture = requestServiceProxy.getRequest(path);
        String result = responseFuture.get();

        assertEquals(expectedResponse, result);

        verify(realService, times(1)).getRequest(path);
    }

    @Test
    public void testGetRequestNotInCache() throws Exception {
        String path = "/api/get";
        String expectedResponse = "Response from real service";

        when(realService.getRequest(path)).thenReturn(CompletableFuture.completedFuture(expectedResponse));

        CompletableFuture<String> responseFuture = requestServiceProxy.getRequest(path);
        String result = responseFuture.get();

        assertEquals(expectedResponse, result);

        verify(realService, times(1)).getRequest(path);
    }

    @Test
    public void testCacheExpiry() throws Exception {
        String path = "/api/get";
        String expectedResponse = "Generic GET response.";
        when(realService.getRequest(path)).thenReturn(CompletableFuture.completedFuture(expectedResponse));
        when(scheduler.scheduleAtFixedRate(any(Runnable.class), anyLong(), anyLong(), eq(TimeUnit.MINUTES)))
                .thenAnswer(invocation -> {
                    Runnable task = invocation.getArgument(0);
                    scheduler.scheduleAtFixedRate(task, 1, 1, TimeUnit.MILLISECONDS);
                    return null;
                });
        requestServiceProxy = new RequestServiceProxy(realService, scheduler);

        requestServiceProxy.getRequest(path).join();
        Thread.sleep(1000);
        CompletableFuture<String> responseFuture = requestServiceProxy.getRequest(path);
        String result = responseFuture.get();

        verify(realService, times(1)).getRequest(path);
        assertEquals(expectedResponse, result);
    }

    @Test
    public void testCacheCleanupTaskRepeatedlyExecutes() throws InterruptedException {
        verify(scheduler, atLeastOnce()).scheduleAtFixedRate(any(Runnable.class), eq(1L), eq(1L), eq(TimeUnit.MINUTES));
    }

    @Test
    public void testPostRequest() throws Exception {
        String path = "/api/post";
        String expectedResponse = "Generic POST response.";

        when(realService.postRequest(path)).thenReturn(CompletableFuture.completedFuture(expectedResponse));

        CompletableFuture<String> responseFuture = requestServiceProxy.postRequest(path);
        String result = responseFuture.get();

        assertEquals(expectedResponse, result);

        verify(realService, times(1)).postRequest(path);
    }

    @Test
    public void testPutRequest() throws Exception {
        String path = "/api/get";
        String expectedResponse = "Generic GET response.";

        when(realService.putRequest(path)).thenReturn(CompletableFuture.completedFuture(expectedResponse));

        CompletableFuture<String> responseFuture = requestServiceProxy.putRequest(path);
        String result = responseFuture.get();

        assertEquals(expectedResponse, result);

        verify(realService, times(1)).putRequest(path);
    }

    @Test
    public void testPostRequestWithBody() throws Exception {
        String path = "/api/post";
        String requestBody = "Request body for POST";
        String expectedResponse = "Response for POST";

        when(realService.postRequest(requestBody, path)).thenReturn(CompletableFuture.completedFuture(expectedResponse));

        CompletableFuture<String> responseFuture = requestServiceProxy.postRequest(requestBody, path);
        String result = responseFuture.get();

        assertEquals(expectedResponse, result);
        verify(realService, times(1)).postRequest(requestBody, path);
    }

    @Test
    public void testPutRequestWithBody() throws Exception {
        String path = "/api/put";
        String requestBody = "Request body for PUT";
        String expectedResponse = "Response for PUT";

        when(realService.putRequest(requestBody, path)).thenReturn(CompletableFuture.completedFuture(expectedResponse));

        CompletableFuture<String> responseFuture = requestServiceProxy.putRequest(requestBody, path);
        String result = responseFuture.get();

        assertEquals(expectedResponse, result);
        verify(realService, times(1)).putRequest(requestBody, path);
    }

    @Test
    public void testDeleteRequest() throws Exception {
        String path = "/api/delete";
        String expectedResponse = "Generic DELETE response.";

        when(realService.deleteRequest(path)).thenReturn(CompletableFuture.completedFuture(expectedResponse));

        CompletableFuture<String> responseFuture = requestServiceProxy.deleteRequest(path);
        String result = responseFuture.get();

        assertEquals(expectedResponse, result);

        verify(realService, times(1)).deleteRequest(path);
    }

    @Test
    public void testConcurrentRequests() throws Exception {
        String path = "/api/get";
        String expectedResponse = "Generic GET response.";
        int threadCount = 10;
        ExecutorService executorService = Executors.newFixedThreadPool(threadCount);
        CountDownLatch latch = new CountDownLatch(threadCount);
        when(realService.getRequest(path)).thenReturn(CompletableFuture.completedFuture(expectedResponse));

        for(int i = 0; i < threadCount; i++) {
            executorService.submit(() -> {
                try {
                    CompletableFuture<String> responseFuture = requestServiceProxy.getRequest(path);
                    String result = responseFuture.get();
                    assertEquals(expectedResponse, result);
                } catch (Exception e) {
                    fail("Exception occurred during concurrent cache access: " + e.getMessage());
                } finally {
                    latch.countDown();
                }
            });
        }

        latch.await();
        verify(realService, atMost(threadCount)).getRequest(path);
    }
}