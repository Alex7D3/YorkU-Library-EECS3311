package com.yorku.library.restservice;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test1");
        byte[] byteArray4 = null;
        com.yorku.library.restservice.models.Book book5 = new com.yorku.library.restservice.models.Book("", "", "", "", byteArray4);
        java.lang.String str6 = book5.getIsbn();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test2");
        com.yorku.library.restservice.models.Book book0 = new com.yorku.library.restservice.models.Book();
        com.yorku.library.restservice.models.Request request1 = book0.getRequest();
        book0.setId((java.lang.Integer) 0);
        java.lang.String str4 = book0.getIsbn();
        org.junit.Assert.assertNull(request1);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test3");
        com.yorku.library.restservice.models.Book book0 = new com.yorku.library.restservice.models.Book();
        com.yorku.library.restservice.models.Request request1 = book0.getRequest();
        book0.setStock((int) '4');
        java.lang.String str4 = book0.getLocation();
        java.lang.String str5 = book0.getDescription();
        org.junit.Assert.assertNull(request1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test4");
        com.yorku.library.restservice.models.Book book0 = new com.yorku.library.restservice.models.Book();
        com.yorku.library.restservice.models.Request request1 = book0.getRequest();
        book0.setStock((int) '4');
        java.lang.String str4 = book0.getLocation();
        java.lang.String str5 = book0.getTitle();
        com.yorku.library.restservice.models.Request request6 = null;
        // The following exception was thrown during execution in test generation
        try {
            book0.setRequest(request6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.library.restservice.models.Request.setItem(com.yorku.library.restservice.models.Item)\" because \"request\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(request1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test5() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test5");
        byte[] byteArray9 = new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 10, (byte) 10 };
        com.yorku.library.restservice.models.Book book10 = new com.yorku.library.restservice.models.Book("", "", "hi!", "", byteArray9);
        book10.setLocation("");
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[1, 0, 10, 10, 10]");
    }

    @Test
    public void test6() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test6");
        com.yorku.library.restservice.models.Book book0 = new com.yorku.library.restservice.models.Book();
        book0.setDescription("");
        java.lang.String str3 = book0.toString();
        book0.setLocation("hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Item [id=null, name=null, description=, location=null, request=null]" + "'", str3, "Item [id=null, name=null, description=, location=null, request=null]");
    }

    @Test
    public void test7() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test7");
        byte[] byteArray9 = new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 10, (byte) 10 };
        com.yorku.library.restservice.models.Book book10 = new com.yorku.library.restservice.models.Book("", "", "hi!", "", byteArray9);
        java.lang.String str11 = book10.getTitle();
        com.yorku.library.restservice.models.Request request12 = book10.getRequest();
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[1, 0, 10, 10, 10]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(request12);
    }

    @Test
    public void test8() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test8");
        com.yorku.library.restservice.models.Book book0 = new com.yorku.library.restservice.models.Book();
        book0.setDescription("");
        java.lang.String str3 = book0.getItemType();
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test9() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test9");
        com.yorku.library.restservice.models.Book book0 = new com.yorku.library.restservice.models.Book();
        book0.setDescription("");
        book0.setLocation("Item [id=null, name=null, description=, location=null, request=null]");
    }
}

