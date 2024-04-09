package com.yorku.library.app;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

import com.yorku.library.app.services.requests.RequestServiceImpl;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.mockito.internal.util.Supplier;

public class RequestServiceImplTest {
    private HttpClient httpClient;
    private String expectedResponse;
    private HttpResponse<String> httpResponseMock;
    private RequestServiceImpl requestService;

    @Before
    public void setUp() {
        httpClient = mock(HttpClient.class);
        expectedResponse = "Generic Response";
        httpResponseMock = mock(HttpResponse.class);

    }

    @Test
    public void testGetRequest() throws Exception {
        String path = "api/get";

        when(httpResponseMock.body()).thenReturn(expectedResponse);
        when(httpResponseMock.statusCode()).thenReturn(200);

        Supplier<CompletableFuture<HttpResponse<String>>> futureSupplier = () -> CompletableFuture.completedFuture(httpResponseMock);

        when(httpClient.sendAsync(any(HttpRequest.class), any()))
                .thenAnswer(invocation -> futureSupplier.get());

        requestService = new RequestServiceImpl(httpClient);

        CompletableFuture<String> responseFuture = requestService.getRequest(path);
        String result = responseFuture.get();

        verify(httpClient).sendAsync(argThat(request ->
                request.uri().toString().equals("http://localhost:8080/api/get")), any()
        );

        assertEquals(expectedResponse, result);
    }

    @Test
    public void testPostRequestNoBody() throws Exception {
        String path = "api/post";

        when(httpResponseMock.body()).thenReturn(expectedResponse);
        when(httpResponseMock.statusCode()).thenReturn(200);

        Supplier<CompletableFuture<HttpResponse<String>>> futureSupplier = () -> CompletableFuture.completedFuture(httpResponseMock);

        when(httpClient.sendAsync(any(HttpRequest.class), any()))
                .thenAnswer(invocation -> futureSupplier.get());

        requestService = new RequestServiceImpl(httpClient);
        CompletableFuture<String> responseFuture = requestService.postRequest(path);
        String result = responseFuture.get();

        verify(httpClient).sendAsync(argThat(request ->
                request.uri().toString().equals("http://localhost:8080/api/post")), any()
        );

        assertEquals(expectedResponse, result);
    }

    @Test
    public void testPostRequestBody() throws Exception {
        String path = "api/post";
        String requestBody = "Request body";

        when(httpResponseMock.body()).thenReturn(expectedResponse);
        when(httpResponseMock.statusCode()).thenReturn(200);

        Supplier<CompletableFuture<HttpResponse<String>>> futureSupplier = () -> CompletableFuture.completedFuture(httpResponseMock);

        when(httpClient.sendAsync(any(HttpRequest.class), any()))
                .thenAnswer(invocation -> futureSupplier.get());

        requestService = new RequestServiceImpl(httpClient);

        CompletableFuture<String> responseFuture = requestService.postRequest(requestBody, path);
        String result = responseFuture.get();

        verify(httpClient).sendAsync(argThat(request ->
                request.uri().toString().equals("http://localhost:8080/api/post")), any()
        );

        assertEquals(expectedResponse, result);
    }

    @Test
    public void testPutRequestNoBody() throws Exception {
        String path = "api/put";

        when(httpResponseMock.body()).thenReturn(expectedResponse);
        when(httpResponseMock.statusCode()).thenReturn(200);

        Supplier<CompletableFuture<HttpResponse<String>>> futureSupplier = () -> CompletableFuture.completedFuture(httpResponseMock);

        when(httpClient.sendAsync(any(HttpRequest.class), any()))
                .thenAnswer(invocation -> futureSupplier.get());

        requestService = new RequestServiceImpl(httpClient);
        CompletableFuture<String> responseFuture = requestService.putRequest(path);
        String result = responseFuture.get();

        verify(httpClient).sendAsync(argThat(request ->
                request.uri().toString().equals("http://localhost:8080/api/put")), any()
        );

        assertEquals(expectedResponse, result);
    }

    @Test
    public void testPutRequestBody() throws Exception {
        String path = "api/put";
        String requestBody = "Request body";

        when(httpResponseMock.body()).thenReturn(expectedResponse);
        when(httpResponseMock.statusCode()).thenReturn(200);

        Supplier<CompletableFuture<HttpResponse<String>>> futureSupplier = () -> CompletableFuture.completedFuture(httpResponseMock);

        when(httpClient.sendAsync(any(HttpRequest.class), any()))
                .thenAnswer(invocation -> futureSupplier.get());

        requestService = new RequestServiceImpl(httpClient);
        CompletableFuture<String> responseFuture = requestService.putRequest(requestBody, path);
        String result = responseFuture.get();

        verify(httpClient).sendAsync(argThat(request ->
                request.uri().toString().equals("http://localhost:8080/api/put")), any()
        );

        assertEquals(expectedResponse, result);
    }

    @Test
    public void testDeleteRequest() throws Exception {
        String path = "api/delete";

        when(httpResponseMock.body()).thenReturn(expectedResponse);
        when(httpResponseMock.statusCode()).thenReturn(200);

        Supplier<CompletableFuture<HttpResponse<String>>> futureSupplier = () -> CompletableFuture.completedFuture(httpResponseMock);

        when(httpClient.sendAsync(any(HttpRequest.class), any()))
                .thenAnswer(invocation -> futureSupplier.get());

        requestService = new RequestServiceImpl(httpClient);
        CompletableFuture<String> responseFuture = requestService.deleteRequest(path);
        String result = responseFuture.get();

        verify(httpClient).sendAsync(argThat(request ->
                request.uri().toString().equals("http://localhost:8080/api/delete")), any()
        );

        assertEquals(expectedResponse, result);
    }

    @Test
    public void testGetRequestWithCustomPath() throws Exception {
        String customPath = "custom/path";

        when(httpResponseMock.body()).thenReturn(expectedResponse);
        when(httpResponseMock.statusCode()).thenReturn(200);

        Supplier<CompletableFuture<HttpResponse<String>>> futureSupplier = () -> CompletableFuture.completedFuture(httpResponseMock);

        when(httpClient.sendAsync(any(HttpRequest.class), any()))
                .thenAnswer(invocation -> futureSupplier.get());

        requestService = new RequestServiceImpl(httpClient);
        CompletableFuture<String> responseFuture = requestService.getRequest(customPath);
        String result = responseFuture.get();

        verify(httpClient).sendAsync(argThat(request ->
                request.uri().toString().equals("http://localhost:8080/" + customPath)), any()
        );

        assertEquals(expectedResponse, result);
    }

    @Test
    public void testGetRequestWithQueryParameters() throws Exception {
        String pathWithQuery = "api/get?param=value";

        when(httpResponseMock.body()).thenReturn(expectedResponse);
        when(httpResponseMock.statusCode()).thenReturn(200);

        Supplier<CompletableFuture<HttpResponse<String>>> futureSupplier = () -> CompletableFuture.completedFuture(httpResponseMock);

        when(httpClient.sendAsync(any(HttpRequest.class), any()))
                .thenAnswer(invocation -> futureSupplier.get());

        requestService = new RequestServiceImpl(httpClient);
        CompletableFuture<String> responseFuture = requestService.getRequest(pathWithQuery);
        String result = responseFuture.get();

        verify(httpClient).sendAsync(argThat(request ->
                request.uri().toString().equals("http://localhost:8080/api/get?param=value")), any()
        );

        assertEquals(expectedResponse, result);
    }

    @Test
    public void testGetRequestWithInvalidPath() throws Exception {
        String invalidPath = "invalid/path";

        when(httpResponseMock.body()).thenReturn(expectedResponse);
        when(httpResponseMock.statusCode()).thenReturn(404);

        Supplier<CompletableFuture<HttpResponse<String>>> futureSupplier = () -> CompletableFuture.completedFuture(httpResponseMock);

        when(httpClient.sendAsync(any(HttpRequest.class), any()))
                .thenAnswer(invocation -> futureSupplier.get());

        requestService = new RequestServiceImpl(httpClient);
        CompletableFuture<String> responseFuture = requestService.getRequest(invalidPath);
        String result = responseFuture.get();

        verify(httpClient).sendAsync(argThat(request ->
                request.uri().toString().equals("http://localhost:8080/invalid/path")), any()
        );

        assertEquals(expectedResponse, result);
    }

    @Test
    public void testGetRequestWithEmptyPath() throws Exception {
        String emptyPath = "";

        when(httpResponseMock.body()).thenReturn(expectedResponse);
        when(httpResponseMock.statusCode()).thenReturn(501);

        Supplier<CompletableFuture<HttpResponse<String>>> futureSupplier = () -> CompletableFuture.completedFuture(httpResponseMock);

        when(httpClient.sendAsync(any(HttpRequest.class), any()))
                .thenAnswer(invocation -> futureSupplier.get());

        requestService = new RequestServiceImpl(httpClient);
        CompletableFuture<String> responseFuture = requestService.getRequest(emptyPath);
        String result = responseFuture.get();

        verify(httpClient).sendAsync(argThat(request ->
                request.uri().toString().equals("http://localhost:8080/")), any()
        );

        assertEquals(expectedResponse, result);
    }
}