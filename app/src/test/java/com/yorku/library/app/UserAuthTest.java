package com.yorku.library.app;

import com.yorku.library.app.auth.UserAuth;
import org.junit.jupiter.api.Test;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.*;

public class UserAuthTest {

    @Test
    public void testSingletonInstance() {
        UserAuth instance1 = UserAuth.getInstance();
        UserAuth instance2 = UserAuth.getInstance();
        assertEquals(instance1, instance2);
    }

    @Test
    public void testSingletonMultiThreadInstance() throws InterruptedException {
        final CountDownLatch latch = new CountDownLatch(2);
        final UserAuth[] auth = new UserAuth[2];

        Thread thread1 = new Thread(() -> {
            auth[0] = UserAuth.getInstance();
            latch.countDown();
        });

        Thread thread2 = new Thread(() -> {
            auth[1] = UserAuth.getInstance();
            latch.countDown();
        });

        thread1.start();
        thread2.start();

        latch.await();
        assertEquals(auth[0], auth[1]);
    }

    @Test
    public void testSingletonMultiThreadInstance2() throws InterruptedException {
        final int numThreads = 10;
        ExecutorService executor = Executors.newFixedThreadPool(numThreads);
        final CountDownLatch latch = new CountDownLatch(numThreads);
        final UserAuth[] auth = new UserAuth[numThreads];

        IntStream.range(0, numThreads).forEach(
                i -> executor.execute(() -> {
                    auth[i] = UserAuth.getInstance();
                    latch.countDown();
                })
        );

        latch.await();
        executor.shutdown();
        for(int i = 0; i < numThreads - 1; i++) {
            assertEquals(auth[i], auth[i+1]);
        }
    }

    @Test
    public void testSetAndGetAuthData() {
        UserAuth instance = UserAuth.getInstance();
        instance.setAuthData("user1", "xxx@xxx.net", "faculty");
        assertEquals("faculty", instance.getRole());
    }

    @Test
    public void testClearAuthData() {
        UserAuth instance = UserAuth.getInstance();
        instance.setAuthData("user1", "xxx@xxx.net", "student");
        instance.clearAuthData();
        assertNull(instance.getUsername());
    }

    @Test
    public void testMultipleThreads() throws InterruptedException {
        UserAuth instance = UserAuth.getInstance();
        Thread[] threads = new Thread[10];

        for (int i = 0; i < 10; i++) {
            threads[i] = new Thread(() ->
                    instance.setAuthData("user1", "xxx@xxx.net", "staff")
            );
            threads[i].start();
        }

        for (Thread t : threads) {
            t.join();
        }

        assertEquals("xxx@xxx.net", instance.getEmail());
    }

    @Test
    public void testNonBlockingReads() throws InterruptedException {
        final UserAuth instance = UserAuth.getInstance();
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        final int numThreads = 10;
        final CountDownLatch writeLatch = new CountDownLatch(numThreads);
        final CountDownLatch readLatch = new CountDownLatch(numThreads);

        for (int i = 0; i < numThreads; i++) {//Writing
            executorService.submit(() -> {
                instance.setAuthData("user1", "xxx@xxx.net", "staff");
                writeLatch.countDown();
            });
        }

        for (int i = 0; i < numThreads; i++) {//Reading
            executorService.submit(() -> {
                String username = instance.getUsername();
                assertEquals("user1", username);
                readLatch.countDown();
            });
        }

        writeLatch.await();
        readLatch.await();

        executorService.shutdown();
    }

    @Test
    public void testSingletonMultiThreaded() throws InterruptedException {
        final CountDownLatch latch = new CountDownLatch(2);
        final UserAuth auth = UserAuth.getInstance();
        final String expectedEmail = "xxx@xxx.net";
        final String expectedUsername = "user";
        final String expectedRole = "visitor";
        final String[] expected = new String[3];
        Thread thread1 = new Thread(() -> {
            auth.setAuthData("user", "xxx@xxx.net", "visitor");
            latch.countDown();
        });

        Thread thread2 = new Thread(() -> {
            expected[0] = auth.getEmail();
            expected[1] = auth.getUsername();
            expected[2] = auth.getRole();

            latch.countDown();
        });

        thread1.start();
        Thread.sleep(10);
        thread2.start();

        latch.await();
        assertEquals(expected[0], expectedEmail);
        assertEquals(expected[1], expectedUsername);
        assertEquals(expected[2], expectedRole);
    }

    @Test
    public void testRewriteMultiThreaded() throws InterruptedException {
        final CountDownLatch latch = new CountDownLatch(3);
        final UserAuth auth = UserAuth.getInstance();
        final String expectedEmail = "xxx@xxx.net";
        final String expectedUsername = "user1";
        final String expectedRole = "visitor";
        final String[] expected = new String[3];
        Thread thread1 = new Thread(() -> {
            auth.setAuthData("user1", "xxx@xxx.net", "visitor");
            latch.countDown();
        });
        Thread thread2 = new Thread(() -> {
            auth.setAuthData("user2", "yyy@yyy.net", "staff");
            latch.countDown();
        });

        Thread thread3 = new Thread(() -> {
            expected[0] = auth.getEmail();
            expected[1] = auth.getUsername();
            expected[2] = auth.getRole();

            latch.countDown();
        });

        thread1.start();
        Thread.sleep(10);
        thread3.start();
        thread2.start();

        latch.await();
        assertEquals(expected[0], expectedEmail);
        assertEquals(expected[1], expectedUsername);
        assertEquals(expected[2], expectedRole);
    }

    @Test
    public void testSingletonClearMultiThreaded() throws InterruptedException {
        final CountDownLatch latch = new CountDownLatch(2);
        final UserAuth auth = UserAuth.getInstance();
        Thread thread1 = new Thread(() -> {
            auth.setAuthData("user", "xxx@xxx.net", "visitor");
            latch.countDown();
        });

        Thread thread2 = new Thread(() -> {
            auth.clearAuthData();
            latch.countDown();
        });

        thread1.start();
        Thread.sleep(10);
        thread2.start();

        latch.await();
        assertNull(auth.getEmail());
        assertNull(auth.getUsername());
        assertNull(auth.getRole());
    }
}
