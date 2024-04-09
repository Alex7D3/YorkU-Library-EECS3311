package com.yorku.library.app;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test01");
        java.net.http.HttpClient httpClient0 = null;
        com.yorku.library.app.services.requests.RequestServiceImpl requestServiceImpl1 = new com.yorku.library.app.services.requests.RequestServiceImpl(httpClient0);
        java.lang.Class<?> wildcardClass2 = requestServiceImpl1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        java.net.http.HttpClient httpClient0 = null;
        com.yorku.library.app.services.requests.RequestServiceImpl requestServiceImpl1 = new com.yorku.library.app.services.requests.RequestServiceImpl(httpClient0);
        java.util.concurrent.CompletableFuture<java.lang.String> strCompletableFuture3 = requestServiceImpl1.putRequest("");
        java.util.concurrent.CompletableFuture<java.lang.String> strCompletableFuture5 = requestServiceImpl1.deleteRequest("");
        java.util.concurrent.CompletableFuture<java.lang.String> strCompletableFuture7 = requestServiceImpl1.putRequest("hi!");
        java.util.concurrent.CompletableFuture<java.lang.String> strCompletableFuture9 = requestServiceImpl1.postRequest("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = strCompletableFuture9.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strCompletableFuture3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strCompletableFuture5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strCompletableFuture7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strCompletableFuture9);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        java.net.http.HttpClient httpClient0 = null;
        com.yorku.library.app.services.requests.RequestServiceImpl requestServiceImpl1 = new com.yorku.library.app.services.requests.RequestServiceImpl(httpClient0);
        java.util.concurrent.CompletableFuture<java.lang.String> strCompletableFuture3 = requestServiceImpl1.getRequest("hi!");
        java.util.concurrent.CompletableFuture<java.lang.String> strCompletableFuture5 = requestServiceImpl1.getRequest("hi!");
        java.util.concurrent.CompletableFuture<java.lang.String> strCompletableFuture8 = requestServiceImpl1.postRequest("", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = strCompletableFuture8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strCompletableFuture3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strCompletableFuture5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strCompletableFuture8);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        java.net.http.HttpClient httpClient0 = null;
        com.yorku.library.app.services.requests.RequestServiceImpl requestServiceImpl1 = new com.yorku.library.app.services.requests.RequestServiceImpl(httpClient0);
        java.util.concurrent.CompletableFuture<java.lang.String> strCompletableFuture3 = requestServiceImpl1.getRequest("hi!");
        java.util.concurrent.CompletableFuture<java.lang.String> strCompletableFuture5 = requestServiceImpl1.getRequest("hi!");
        java.util.concurrent.CompletableFuture<java.lang.String> strCompletableFuture8 = requestServiceImpl1.postRequest("", "hi!");
        java.util.concurrent.CompletableFuture<java.lang.String> strCompletableFuture10 = requestServiceImpl1.deleteRequest("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strCompletableFuture3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strCompletableFuture5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strCompletableFuture8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strCompletableFuture10);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        java.net.http.HttpClient httpClient0 = null;
        com.yorku.library.app.services.requests.RequestServiceImpl requestServiceImpl1 = new com.yorku.library.app.services.requests.RequestServiceImpl(httpClient0);
        java.util.concurrent.CompletableFuture<java.lang.String> strCompletableFuture3 = requestServiceImpl1.getRequest("hi!");
        java.util.concurrent.CompletableFuture<java.lang.String> strCompletableFuture5 = requestServiceImpl1.getRequest("hi!");
        java.util.concurrent.CompletableFuture<java.lang.String> strCompletableFuture7 = requestServiceImpl1.putRequest("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strCompletableFuture3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strCompletableFuture5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strCompletableFuture7);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        java.net.http.HttpClient httpClient0 = null;
        com.yorku.library.app.services.requests.RequestServiceImpl requestServiceImpl1 = new com.yorku.library.app.services.requests.RequestServiceImpl(httpClient0);
        java.util.concurrent.CompletableFuture<java.lang.String> strCompletableFuture3 = requestServiceImpl1.putRequest("");
        java.util.concurrent.CompletableFuture<java.lang.String> strCompletableFuture5 = requestServiceImpl1.deleteRequest("");
        java.util.concurrent.CompletableFuture<java.lang.String> strCompletableFuture7 = requestServiceImpl1.putRequest("hi!");
        java.util.concurrent.CompletableFuture<java.lang.String> strCompletableFuture9 = requestServiceImpl1.postRequest("hi!");
        java.util.concurrent.CompletableFuture<java.lang.String> strCompletableFuture11 = requestServiceImpl1.getRequest("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strCompletableFuture3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strCompletableFuture5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strCompletableFuture7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strCompletableFuture9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strCompletableFuture11);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        java.net.http.HttpClient httpClient0 = null;
        com.yorku.library.app.services.requests.RequestServiceImpl requestServiceImpl1 = new com.yorku.library.app.services.requests.RequestServiceImpl(httpClient0);
        java.util.concurrent.CompletableFuture<java.lang.String> strCompletableFuture3 = requestServiceImpl1.getRequest("hi!");
        java.util.concurrent.CompletableFuture<java.lang.String> strCompletableFuture5 = requestServiceImpl1.getRequest("hi!");
        java.util.concurrent.CompletableFuture<java.lang.String> strCompletableFuture8 = requestServiceImpl1.postRequest("", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strCompletableFuture3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strCompletableFuture5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strCompletableFuture8);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        java.net.http.HttpClient httpClient0 = null;
        com.yorku.library.app.services.requests.RequestServiceImpl requestServiceImpl1 = new com.yorku.library.app.services.requests.RequestServiceImpl(httpClient0);
        java.util.concurrent.CompletableFuture<java.lang.String> strCompletableFuture3 = requestServiceImpl1.getRequest("hi!");
        java.util.concurrent.CompletableFuture<java.lang.String> strCompletableFuture5 = requestServiceImpl1.postRequest("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strCompletableFuture3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strCompletableFuture5);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        java.net.http.HttpClient httpClient0 = null;
        com.yorku.library.app.services.requests.RequestServiceImpl requestServiceImpl1 = new com.yorku.library.app.services.requests.RequestServiceImpl(httpClient0);
        java.util.concurrent.CompletableFuture<java.lang.String> strCompletableFuture4 = requestServiceImpl1.putRequest("", "hi!");
        java.lang.Class<?> wildcardClass5 = requestServiceImpl1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strCompletableFuture4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        java.net.http.HttpClient httpClient0 = null;
        com.yorku.library.app.services.requests.RequestServiceImpl requestServiceImpl1 = new com.yorku.library.app.services.requests.RequestServiceImpl(httpClient0);
        java.util.concurrent.CompletableFuture<java.lang.String> strCompletableFuture3 = requestServiceImpl1.postRequest("hi!");
        java.util.concurrent.CompletableFuture<java.lang.String> strCompletableFuture5 = requestServiceImpl1.getRequest("");
        java.util.concurrent.CompletableFuture<java.lang.String> strCompletableFuture7 = requestServiceImpl1.putRequest("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strCompletableFuture3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strCompletableFuture5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strCompletableFuture7);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        java.net.http.HttpClient httpClient0 = null;
        com.yorku.library.app.services.requests.RequestServiceImpl requestServiceImpl1 = new com.yorku.library.app.services.requests.RequestServiceImpl(httpClient0);
        java.util.concurrent.CompletableFuture<java.lang.String> strCompletableFuture3 = requestServiceImpl1.getRequest("");
        java.util.concurrent.CompletableFuture<java.lang.String> strCompletableFuture6 = requestServiceImpl1.postRequest("", "hi!");
        java.util.concurrent.CompletableFuture<java.lang.String> strCompletableFuture8 = requestServiceImpl1.getRequest("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strCompletableFuture3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strCompletableFuture6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strCompletableFuture8);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        java.net.http.HttpClient httpClient0 = null;
        com.yorku.library.app.services.requests.RequestServiceImpl requestServiceImpl1 = new com.yorku.library.app.services.requests.RequestServiceImpl(httpClient0);
        java.util.concurrent.CompletableFuture<java.lang.String> strCompletableFuture3 = requestServiceImpl1.getRequest("hi!");
        java.util.concurrent.CompletableFuture<java.lang.String> strCompletableFuture5 = requestServiceImpl1.getRequest("hi!");
        java.util.concurrent.CompletableFuture<java.lang.String> strCompletableFuture8 = requestServiceImpl1.postRequest("", "hi!");
        java.util.concurrent.CompletableFuture<java.lang.String> strCompletableFuture11 = requestServiceImpl1.postRequest("", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strCompletableFuture3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strCompletableFuture5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strCompletableFuture8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strCompletableFuture11);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        java.net.http.HttpClient httpClient0 = null;
        com.yorku.library.app.services.requests.RequestServiceImpl requestServiceImpl1 = new com.yorku.library.app.services.requests.RequestServiceImpl(httpClient0);
        java.util.concurrent.CompletableFuture<java.lang.String> strCompletableFuture3 = requestServiceImpl1.postRequest("hi!");
        java.util.concurrent.CompletableFuture<java.lang.String> strCompletableFuture5 = requestServiceImpl1.getRequest("");
        java.util.concurrent.CompletableFuture<java.lang.String> strCompletableFuture7 = requestServiceImpl1.getRequest("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strCompletableFuture3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strCompletableFuture5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strCompletableFuture7);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        java.net.http.HttpClient httpClient0 = null;
        com.yorku.library.app.services.requests.RequestServiceImpl requestServiceImpl1 = new com.yorku.library.app.services.requests.RequestServiceImpl(httpClient0);
        java.util.concurrent.CompletableFuture<java.lang.String> strCompletableFuture3 = requestServiceImpl1.getRequest("");
        java.util.concurrent.CompletableFuture<java.lang.String> strCompletableFuture6 = requestServiceImpl1.postRequest("", "hi!");
        java.util.concurrent.CompletableFuture<java.lang.String> strCompletableFuture8 = requestServiceImpl1.postRequest("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strCompletableFuture3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strCompletableFuture6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strCompletableFuture8);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        java.net.http.HttpClient httpClient0 = null;
        com.yorku.library.app.services.requests.RequestServiceImpl requestServiceImpl1 = new com.yorku.library.app.services.requests.RequestServiceImpl(httpClient0);
        java.util.concurrent.CompletableFuture<java.lang.String> strCompletableFuture3 = requestServiceImpl1.getRequest("");
        java.util.concurrent.CompletableFuture<java.lang.String> strCompletableFuture5 = requestServiceImpl1.putRequest("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strCompletableFuture3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strCompletableFuture5);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        java.net.http.HttpClient httpClient0 = null;
        com.yorku.library.app.services.requests.RequestServiceImpl requestServiceImpl1 = new com.yorku.library.app.services.requests.RequestServiceImpl(httpClient0);
        java.util.concurrent.CompletableFuture<java.lang.String> strCompletableFuture4 = requestServiceImpl1.putRequest("", "hi!");
        java.util.concurrent.CompletableFuture<java.lang.String> strCompletableFuture7 = requestServiceImpl1.putRequest("", "hi!");
        java.util.concurrent.CompletableFuture<java.lang.String> strCompletableFuture10 = requestServiceImpl1.postRequest("", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strCompletableFuture4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strCompletableFuture7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strCompletableFuture10);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        java.net.http.HttpClient httpClient0 = null;
        com.yorku.library.app.services.requests.RequestServiceImpl requestServiceImpl1 = new com.yorku.library.app.services.requests.RequestServiceImpl(httpClient0);
        java.util.concurrent.CompletableFuture<java.lang.String> strCompletableFuture3 = requestServiceImpl1.postRequest("hi!");
        java.util.concurrent.CompletableFuture<java.lang.String> strCompletableFuture5 = requestServiceImpl1.getRequest("");
        java.util.concurrent.CompletableFuture<java.lang.String> strCompletableFuture8 = requestServiceImpl1.putRequest("hi!", "hi!");
        java.util.concurrent.CompletableFuture<java.lang.String> strCompletableFuture10 = requestServiceImpl1.putRequest("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strCompletableFuture3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strCompletableFuture5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strCompletableFuture8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strCompletableFuture10);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        java.net.http.HttpClient httpClient0 = null;
        com.yorku.library.app.services.requests.RequestServiceImpl requestServiceImpl1 = new com.yorku.library.app.services.requests.RequestServiceImpl(httpClient0);
        java.util.concurrent.CompletableFuture<java.lang.String> strCompletableFuture3 = requestServiceImpl1.putRequest("");
        java.util.concurrent.CompletableFuture<java.lang.String> strCompletableFuture5 = requestServiceImpl1.getRequest("hi!");
        java.util.concurrent.CompletableFuture<java.lang.String> strCompletableFuture8 = requestServiceImpl1.putRequest("", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strCompletableFuture3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strCompletableFuture5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strCompletableFuture8);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        java.net.http.HttpClient httpClient0 = null;
        com.yorku.library.app.services.requests.RequestServiceImpl requestServiceImpl1 = new com.yorku.library.app.services.requests.RequestServiceImpl(httpClient0);
        java.util.concurrent.CompletableFuture<java.lang.String> strCompletableFuture3 = requestServiceImpl1.putRequest("");
        java.util.concurrent.CompletableFuture<java.lang.String> strCompletableFuture5 = requestServiceImpl1.deleteRequest("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strCompletableFuture3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strCompletableFuture5);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        java.net.http.HttpClient httpClient0 = null;
        com.yorku.library.app.services.requests.RequestServiceImpl requestServiceImpl1 = new com.yorku.library.app.services.requests.RequestServiceImpl(httpClient0);
        java.util.concurrent.CompletableFuture<java.lang.String> strCompletableFuture3 = requestServiceImpl1.getRequest("");
        java.util.concurrent.CompletableFuture<java.lang.String> strCompletableFuture5 = requestServiceImpl1.postRequest("");
        java.util.concurrent.CompletableFuture<java.lang.String> strCompletableFuture7 = requestServiceImpl1.putRequest("hi!");
        java.util.concurrent.CompletableFuture<java.lang.String> strCompletableFuture9 = requestServiceImpl1.postRequest("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strCompletableFuture3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strCompletableFuture5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strCompletableFuture7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strCompletableFuture9);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        java.net.http.HttpClient httpClient0 = null;
        com.yorku.library.app.services.requests.RequestServiceImpl requestServiceImpl1 = new com.yorku.library.app.services.requests.RequestServiceImpl(httpClient0);
        java.util.concurrent.CompletableFuture<java.lang.String> strCompletableFuture3 = requestServiceImpl1.putRequest("");
        java.util.concurrent.CompletableFuture<java.lang.String> strCompletableFuture5 = requestServiceImpl1.getRequest("hi!");
        java.util.concurrent.CompletableFuture<java.lang.String> strCompletableFuture7 = requestServiceImpl1.getRequest("hi!");
        java.util.concurrent.CompletableFuture<java.lang.String> strCompletableFuture9 = requestServiceImpl1.getRequest("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strCompletableFuture3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strCompletableFuture5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strCompletableFuture7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strCompletableFuture9);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        java.net.http.HttpClient httpClient0 = null;
        com.yorku.library.app.services.requests.RequestServiceImpl requestServiceImpl1 = new com.yorku.library.app.services.requests.RequestServiceImpl(httpClient0);
        java.util.concurrent.CompletableFuture<java.lang.String> strCompletableFuture3 = requestServiceImpl1.getRequest("hi!");
        java.util.concurrent.CompletableFuture<java.lang.String> strCompletableFuture5 = requestServiceImpl1.getRequest("hi!");
        java.util.concurrent.CompletableFuture<java.lang.String> strCompletableFuture7 = requestServiceImpl1.putRequest("hi!");
        java.util.concurrent.CompletableFuture<java.lang.String> strCompletableFuture9 = requestServiceImpl1.getRequest("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strCompletableFuture3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strCompletableFuture5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strCompletableFuture7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strCompletableFuture9);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        java.net.http.HttpClient httpClient0 = null;
        com.yorku.library.app.services.requests.RequestServiceImpl requestServiceImpl1 = new com.yorku.library.app.services.requests.RequestServiceImpl(httpClient0);
        java.util.concurrent.CompletableFuture<java.lang.String> strCompletableFuture3 = requestServiceImpl1.putRequest("");
        java.util.concurrent.CompletableFuture<java.lang.String> strCompletableFuture5 = requestServiceImpl1.deleteRequest("");
        java.util.concurrent.CompletableFuture<java.lang.String> strCompletableFuture7 = requestServiceImpl1.putRequest("hi!");
        java.util.concurrent.CompletableFuture<java.lang.String> strCompletableFuture9 = requestServiceImpl1.postRequest("hi!");
        java.util.concurrent.CompletableFuture<java.lang.String> strCompletableFuture12 = requestServiceImpl1.putRequest("", "");
        java.util.concurrent.CompletableFuture<java.lang.String> strCompletableFuture14 = requestServiceImpl1.deleteRequest("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strCompletableFuture3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strCompletableFuture5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strCompletableFuture7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strCompletableFuture9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strCompletableFuture12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strCompletableFuture14);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        java.net.http.HttpClient httpClient0 = null;
        com.yorku.library.app.services.requests.RequestServiceImpl requestServiceImpl1 = new com.yorku.library.app.services.requests.RequestServiceImpl(httpClient0);
        java.util.concurrent.CompletableFuture<java.lang.String> strCompletableFuture3 = requestServiceImpl1.getRequest("");
        java.util.concurrent.CompletableFuture<java.lang.String> strCompletableFuture5 = requestServiceImpl1.postRequest("");
        java.util.concurrent.CompletableFuture<java.lang.String> strCompletableFuture7 = requestServiceImpl1.postRequest("hi!");
        java.util.concurrent.CompletableFuture<java.lang.String> strCompletableFuture9 = requestServiceImpl1.deleteRequest("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strCompletableFuture3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strCompletableFuture5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strCompletableFuture7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strCompletableFuture9);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        java.net.http.HttpClient httpClient0 = null;
        com.yorku.library.app.services.requests.RequestServiceImpl requestServiceImpl1 = new com.yorku.library.app.services.requests.RequestServiceImpl(httpClient0);
        java.util.concurrent.CompletableFuture<java.lang.String> strCompletableFuture3 = requestServiceImpl1.deleteRequest("hi!");
        java.lang.Class<?> wildcardClass4 = requestServiceImpl1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strCompletableFuture3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        java.net.http.HttpClient httpClient0 = null;
        com.yorku.library.app.services.requests.RequestServiceImpl requestServiceImpl1 = new com.yorku.library.app.services.requests.RequestServiceImpl(httpClient0);
        java.util.concurrent.CompletableFuture<java.lang.String> strCompletableFuture3 = requestServiceImpl1.getRequest("");
        java.lang.Class<?> wildcardClass4 = requestServiceImpl1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strCompletableFuture3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }
}

