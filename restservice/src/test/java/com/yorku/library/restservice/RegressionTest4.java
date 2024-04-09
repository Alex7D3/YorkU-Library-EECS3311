package com.yorku.library.restservice;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest4 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test01");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        byte[] byteArray5 = new byte[] { (byte) 1, (byte) 10 };
        com.yorku.library.restservice.models.NewsLetter newsLetter7 = new com.yorku.library.restservice.models.NewsLetter("", "hi!", "", byteArray5, "");
        java.lang.Class<?> wildcardClass8 = newsLetter7.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 10]");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        byte[] byteArray5 = new byte[] { (byte) 1, (byte) 10 };
        com.yorku.library.restservice.models.NewsLetter newsLetter7 = new com.yorku.library.restservice.models.NewsLetter("", "hi!", "", byteArray5, "");
        com.yorku.library.restservice.models.Request request8 = null;
        // The following exception was thrown during execution in test generation
        try {
            newsLetter7.setRequest(request8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.library.restservice.models.Request.setItem(com.yorku.library.restservice.models.Item)\" because \"request\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 10]");
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        byte[] byteArray5 = new byte[] { (byte) 1, (byte) 10 };
        com.yorku.library.restservice.models.NewsLetter newsLetter7 = new com.yorku.library.restservice.models.NewsLetter("", "hi!", "", byteArray5, "");
        com.yorku.library.restservice.models.User user8 = null;
        com.yorku.library.restservice.models.Ownership ownership9 = null;
        java.sql.Date date10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.yorku.library.restservice.models.UserItem userItem11 = newsLetter7.addUser(user8, ownership9, date10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.library.restservice.models.User.getId()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 10]");
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        byte[] byteArray5 = new byte[] { (byte) 1, (byte) 10 };
        com.yorku.library.restservice.models.NewsLetter newsLetter7 = new com.yorku.library.restservice.models.NewsLetter("", "hi!", "", byteArray5, "");
        java.lang.String str8 = newsLetter7.getSource();
        java.lang.String str9 = newsLetter7.getDescription();
        java.lang.Class<?> wildcardClass10 = newsLetter7.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 10]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        byte[] byteArray8 = new byte[] { (byte) 1, (byte) 10 };
        com.yorku.library.restservice.models.NewsLetter newsLetter10 = new com.yorku.library.restservice.models.NewsLetter("", "hi!", "", byteArray8, "");
        com.yorku.library.restservice.models.NewsLetter newsLetter12 = new com.yorku.library.restservice.models.NewsLetter("hi!", "hi!", "hi!", byteArray8, "hi!");
        com.yorku.library.restservice.models.Request request13 = null;
        // The following exception was thrown during execution in test generation
        try {
            newsLetter12.setRequest(request13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.library.restservice.models.Request.setItem(com.yorku.library.restservice.models.Item)\" because \"request\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[1, 10]");
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        byte[] byteArray5 = new byte[] { (byte) 1, (byte) 10 };
        com.yorku.library.restservice.models.NewsLetter newsLetter7 = new com.yorku.library.restservice.models.NewsLetter("", "hi!", "", byteArray5, "");
        java.lang.String str8 = newsLetter7.getSource();
        byte[] byteArray14 = new byte[] { (byte) 1, (byte) 10 };
        com.yorku.library.restservice.models.NewsLetter newsLetter16 = new com.yorku.library.restservice.models.NewsLetter("", "hi!", "", byteArray14, "");
        newsLetter7.setImage(byteArray14);
        int int18 = newsLetter7.getStock();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 10]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[1, 10]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 20 + "'", int18 == 20);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        byte[] byteArray5 = new byte[] { (byte) 1, (byte) 10 };
        com.yorku.library.restservice.models.NewsLetter newsLetter7 = new com.yorku.library.restservice.models.NewsLetter("", "hi!", "", byteArray5, "");
        java.lang.String str8 = newsLetter7.getSource();
        java.lang.String str9 = newsLetter7.getDescription();
        java.lang.String str10 = newsLetter7.getSource();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 10]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        byte[] byteArray5 = new byte[] { (byte) 1, (byte) 10 };
        com.yorku.library.restservice.models.NewsLetter newsLetter7 = new com.yorku.library.restservice.models.NewsLetter("", "hi!", "", byteArray5, "");
        newsLetter7.setTitle("hi!");
        java.lang.String str10 = newsLetter7.getTitle();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 10]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        byte[] byteArray5 = new byte[] { (byte) 1, (byte) 10 };
        com.yorku.library.restservice.models.NewsLetter newsLetter7 = new com.yorku.library.restservice.models.NewsLetter("", "hi!", "", byteArray5, "");
        newsLetter7.setTitle("hi!");
        newsLetter7.setDescription("");
        java.lang.Class<?> wildcardClass12 = newsLetter7.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 10]");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        byte[] byteArray5 = new byte[] { (byte) 1, (byte) 10 };
        com.yorku.library.restservice.models.NewsLetter newsLetter7 = new com.yorku.library.restservice.models.NewsLetter("", "hi!", "", byteArray5, "");
        newsLetter7.setTitle("hi!");
        byte[] byteArray15 = new byte[] { (byte) 1, (byte) 10 };
        com.yorku.library.restservice.models.NewsLetter newsLetter17 = new com.yorku.library.restservice.models.NewsLetter("", "hi!", "", byteArray15, "");
        newsLetter7.setImage(byteArray15);
        java.lang.Integer int19 = newsLetter7.getId();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 10]");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[1, 10]");
        org.junit.Assert.assertNull(int19);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        byte[] byteArray5 = new byte[] { (byte) 1, (byte) 10 };
        com.yorku.library.restservice.models.NewsLetter newsLetter7 = new com.yorku.library.restservice.models.NewsLetter("", "hi!", "", byteArray5, "");
        java.lang.String str8 = newsLetter7.getSource();
        java.lang.String str9 = newsLetter7.getDescription();
        byte[] byteArray15 = new byte[] { (byte) 1, (byte) 10 };
        com.yorku.library.restservice.models.NewsLetter newsLetter17 = new com.yorku.library.restservice.models.NewsLetter("", "hi!", "", byteArray15, "");
        newsLetter7.setImage(byteArray15);
        java.lang.String str19 = newsLetter7.getSource();
        newsLetter7.setStock(10);
        byte[] byteArray22 = newsLetter7.getImage();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 10]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[1, 10]");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray22), "[1, 10]");
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        byte[] byteArray5 = new byte[] { (byte) 1, (byte) 10 };
        com.yorku.library.restservice.models.NewsLetter newsLetter7 = new com.yorku.library.restservice.models.NewsLetter("", "hi!", "", byteArray5, "");
        java.lang.String str8 = newsLetter7.getSource();
        java.lang.String str9 = newsLetter7.toString();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 10]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Item [id=null, name=, description=hi!, location=, request=null]" + "'", str9, "Item [id=null, name=, description=hi!, location=, request=null]");
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        byte[] byteArray8 = new byte[] { (byte) 1, (byte) 10 };
        com.yorku.library.restservice.models.NewsLetter newsLetter10 = new com.yorku.library.restservice.models.NewsLetter("", "hi!", "", byteArray8, "");
        com.yorku.library.restservice.models.NewsLetter newsLetter12 = new com.yorku.library.restservice.models.NewsLetter("hi!", "hi!", "hi!", byteArray8, "hi!");
        com.yorku.library.restservice.models.Request request13 = newsLetter12.getRequest();
        newsLetter12.setId((java.lang.Integer) 100);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[1, 10]");
        org.junit.Assert.assertNull(request13);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        byte[] byteArray5 = new byte[] { (byte) 1, (byte) 10 };
        com.yorku.library.restservice.models.NewsLetter newsLetter7 = new com.yorku.library.restservice.models.NewsLetter("", "hi!", "", byteArray5, "");
        newsLetter7.setTitle("");
        java.lang.String str10 = newsLetter7.getTitle();
        java.lang.String str11 = newsLetter7.getTitle();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 10]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        byte[] byteArray5 = new byte[] { (byte) 1, (byte) 10 };
        com.yorku.library.restservice.models.NewsLetter newsLetter7 = new com.yorku.library.restservice.models.NewsLetter("", "hi!", "", byteArray5, "");
        newsLetter7.setTitle("hi!");
        byte[] byteArray15 = new byte[] { (byte) 1, (byte) 10 };
        com.yorku.library.restservice.models.NewsLetter newsLetter17 = new com.yorku.library.restservice.models.NewsLetter("", "hi!", "", byteArray15, "");
        newsLetter7.setImage(byteArray15);
        java.lang.String str19 = newsLetter7.getDescription();
        java.lang.Integer int20 = newsLetter7.getId();
        byte[] byteArray21 = newsLetter7.getImage();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 10]");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[1, 10]");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNull(int20);
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray21), "[1, 10]");
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        byte[] byteArray5 = new byte[] { (byte) 1, (byte) 10 };
        com.yorku.library.restservice.models.NewsLetter newsLetter7 = new com.yorku.library.restservice.models.NewsLetter("", "hi!", "", byteArray5, "");
        java.lang.String str8 = newsLetter7.getSource();
        byte[] byteArray14 = new byte[] { (byte) 1, (byte) 10 };
        com.yorku.library.restservice.models.NewsLetter newsLetter16 = new com.yorku.library.restservice.models.NewsLetter("", "hi!", "", byteArray14, "");
        newsLetter7.setImage(byteArray14);
        java.lang.String str18 = newsLetter7.getTitle();
        java.lang.String str19 = newsLetter7.toString();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 10]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[1, 10]");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Item [id=null, name=, description=hi!, location=, request=null]" + "'", str19, "Item [id=null, name=, description=hi!, location=, request=null]");
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        byte[] byteArray5 = new byte[] { (byte) 1, (byte) 10 };
        com.yorku.library.restservice.models.NewsLetter newsLetter7 = new com.yorku.library.restservice.models.NewsLetter("", "hi!", "", byteArray5, "");
        java.lang.String str8 = newsLetter7.getSource();
        java.lang.String str9 = newsLetter7.getDescription();
        byte[] byteArray15 = new byte[] { (byte) 1, (byte) 10 };
        com.yorku.library.restservice.models.NewsLetter newsLetter17 = new com.yorku.library.restservice.models.NewsLetter("", "hi!", "", byteArray15, "");
        newsLetter7.setImage(byteArray15);
        java.lang.String str19 = newsLetter7.getSource();
        byte[] byteArray20 = newsLetter7.getImage();
        newsLetter7.setDescription("Item [id=null, name=, description=hi!, location=, request=null]");
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 10]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[1, 10]");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[1, 10]");
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        byte[] byteArray5 = new byte[] { (byte) 1, (byte) 10 };
        com.yorku.library.restservice.models.NewsLetter newsLetter7 = new com.yorku.library.restservice.models.NewsLetter("", "hi!", "", byteArray5, "");
        java.lang.String str8 = newsLetter7.getSource();
        byte[] byteArray14 = new byte[] { (byte) 1, (byte) 10 };
        com.yorku.library.restservice.models.NewsLetter newsLetter16 = new com.yorku.library.restservice.models.NewsLetter("", "hi!", "", byteArray14, "");
        newsLetter7.setImage(byteArray14);
        newsLetter7.setStock(1);
        com.yorku.library.restservice.models.Request request20 = newsLetter7.getRequest();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 10]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[1, 10]");
        org.junit.Assert.assertNull(request20);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        byte[] byteArray5 = new byte[] { (byte) 1, (byte) 10 };
        com.yorku.library.restservice.models.NewsLetter newsLetter7 = new com.yorku.library.restservice.models.NewsLetter("", "hi!", "", byteArray5, "");
        java.lang.String str8 = newsLetter7.getSource();
        com.yorku.library.restservice.models.Request request9 = newsLetter7.getRequest();
        java.lang.String str10 = newsLetter7.getTitle();
        int int11 = newsLetter7.getStock();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 10]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(request9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 20 + "'", int11 == 20);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        byte[] byteArray8 = new byte[] { (byte) 1, (byte) 10 };
        com.yorku.library.restservice.models.NewsLetter newsLetter10 = new com.yorku.library.restservice.models.NewsLetter("", "hi!", "", byteArray8, "");
        java.lang.String str11 = newsLetter10.getSource();
        byte[] byteArray17 = new byte[] { (byte) 1, (byte) 10 };
        com.yorku.library.restservice.models.NewsLetter newsLetter19 = new com.yorku.library.restservice.models.NewsLetter("", "hi!", "", byteArray17, "");
        newsLetter10.setImage(byteArray17);
        com.yorku.library.restservice.models.NewsLetter newsLetter22 = new com.yorku.library.restservice.models.NewsLetter("", "hi!", "hi!", byteArray17, "Item [id=null, name=, description=hi!, location=, request=null]");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[1, 10]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(byteArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray17), "[1, 10]");
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        byte[] byteArray5 = new byte[] { (byte) 1, (byte) 10 };
        com.yorku.library.restservice.models.NewsLetter newsLetter7 = new com.yorku.library.restservice.models.NewsLetter("", "hi!", "", byteArray5, "");
        java.lang.String str8 = newsLetter7.getSource();
        java.lang.String str9 = newsLetter7.getDescription();
        java.lang.String str10 = newsLetter7.getTitle();
        java.lang.String str11 = newsLetter7.toString();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 10]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Item [id=null, name=, description=hi!, location=, request=null]" + "'", str11, "Item [id=null, name=, description=hi!, location=, request=null]");
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        byte[] byteArray5 = new byte[] { (byte) 1, (byte) 10 };
        com.yorku.library.restservice.models.NewsLetter newsLetter7 = new com.yorku.library.restservice.models.NewsLetter("", "hi!", "", byteArray5, "");
        java.lang.String str8 = newsLetter7.getSource();
        java.lang.String str9 = newsLetter7.getDescription();
        byte[] byteArray15 = new byte[] { (byte) 1, (byte) 10 };
        com.yorku.library.restservice.models.NewsLetter newsLetter17 = new com.yorku.library.restservice.models.NewsLetter("", "hi!", "", byteArray15, "");
        newsLetter7.setImage(byteArray15);
        newsLetter7.setSource("");
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 10]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[1, 10]");
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        byte[] byteArray5 = new byte[] { (byte) 1, (byte) 10 };
        com.yorku.library.restservice.models.NewsLetter newsLetter7 = new com.yorku.library.restservice.models.NewsLetter("", "hi!", "", byteArray5, "");
        newsLetter7.setTitle("hi!");
        byte[] byteArray15 = new byte[] { (byte) 1, (byte) 10 };
        com.yorku.library.restservice.models.NewsLetter newsLetter17 = new com.yorku.library.restservice.models.NewsLetter("", "hi!", "", byteArray15, "");
        newsLetter7.setImage(byteArray15);
        newsLetter7.setId((java.lang.Integer) 100);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 10]");
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray15), "[1, 10]");
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        byte[] byteArray8 = new byte[] { (byte) 1, (byte) 10 };
        com.yorku.library.restservice.models.NewsLetter newsLetter10 = new com.yorku.library.restservice.models.NewsLetter("", "hi!", "", byteArray8, "");
        newsLetter10.setTitle("hi!");
        byte[] byteArray18 = new byte[] { (byte) 1, (byte) 10 };
        com.yorku.library.restservice.models.NewsLetter newsLetter20 = new com.yorku.library.restservice.models.NewsLetter("", "hi!", "", byteArray18, "");
        newsLetter10.setImage(byteArray18);
        com.yorku.library.restservice.models.NewsLetter newsLetter23 = new com.yorku.library.restservice.models.NewsLetter("Item [id=null, name=, description=hi!, location=, request=null]", "hi!", "", byteArray18, "");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[1, 10]");
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[1, 10]");
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        byte[] byteArray5 = new byte[] { (byte) 1, (byte) 10 };
        com.yorku.library.restservice.models.NewsLetter newsLetter7 = new com.yorku.library.restservice.models.NewsLetter("", "hi!", "", byteArray5, "");
        java.lang.String str8 = newsLetter7.getSource();
        byte[] byteArray14 = new byte[] { (byte) 1, (byte) 10 };
        com.yorku.library.restservice.models.NewsLetter newsLetter16 = new com.yorku.library.restservice.models.NewsLetter("", "hi!", "", byteArray14, "");
        newsLetter7.setImage(byteArray14);
        java.lang.String str18 = newsLetter7.getLocation();
        newsLetter7.setStock((int) (short) 0);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 10]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[1, 10]");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        byte[] byteArray5 = new byte[] { (byte) 1, (byte) 10 };
        com.yorku.library.restservice.models.NewsLetter newsLetter7 = new com.yorku.library.restservice.models.NewsLetter("", "hi!", "", byteArray5, "");
        java.lang.String str8 = newsLetter7.getSource();
        byte[] byteArray14 = new byte[] { (byte) 1, (byte) 10 };
        com.yorku.library.restservice.models.NewsLetter newsLetter16 = new com.yorku.library.restservice.models.NewsLetter("", "hi!", "", byteArray14, "");
        newsLetter7.setImage(byteArray14);
        newsLetter7.updateNotification();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 10]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[1, 10]");
    }
}
