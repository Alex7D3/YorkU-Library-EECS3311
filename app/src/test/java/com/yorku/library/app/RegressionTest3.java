package com.yorku.library.app;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest3 {

    public static boolean debug = false;

    @Test
    public void test1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test1");
        com.yorku.library.app.services.requests.RequestService requestService0 = null;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.yorku.library.app.services.requests.RequestServiceProxy requestServiceProxy2 = new com.yorku.library.app.services.requests.RequestServiceProxy(requestService0, scheduledExecutorService1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.concurrent.ScheduledExecutorService.scheduleAtFixedRate(java.lang.Runnable, long, long, java.util.concurrent.TimeUnit)\" because \"scheduler\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }
}

