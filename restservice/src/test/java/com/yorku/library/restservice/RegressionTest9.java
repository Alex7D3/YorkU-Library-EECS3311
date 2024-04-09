package com.yorku.library.restservice;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest9 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test01");
        byte[] byteArray5 = new byte[] { (byte) 1, (byte) 10 };
        com.yorku.library.restservice.models.Course course6 = null;
        com.yorku.library.restservice.models.TextBook textBook7 = new com.yorku.library.restservice.models.TextBook("", "hi!", "", byteArray5, course6);
        java.lang.String str8 = textBook7.getDescription();
        com.yorku.library.restservice.models.Request request9 = null;
        // The following exception was thrown during execution in test generation
        try {
            textBook7.setRequest(request9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.library.restservice.models.Request.setItem(com.yorku.library.restservice.models.Item)\" because \"request\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 10]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        byte[] byteArray5 = new byte[] { (byte) 1, (byte) 10 };
        com.yorku.library.restservice.models.Course course6 = null;
        com.yorku.library.restservice.models.TextBook textBook7 = new com.yorku.library.restservice.models.TextBook("", "hi!", "", byteArray5, course6);
        java.lang.Integer int8 = textBook7.getId();
        int int9 = textBook7.getStock();
        java.lang.Class<?> wildcardClass10 = textBook7.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 10]");
        org.junit.Assert.assertNull(int8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 20 + "'", int9 == 20);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        byte[] byteArray6 = new byte[] {};
        com.yorku.library.restservice.models.Course course7 = null;
        com.yorku.library.restservice.models.TextBook textBook8 = new com.yorku.library.restservice.models.TextBook("", "", "hi!", byteArray6, course7);
        com.yorku.library.restservice.models.Course course9 = null;
        com.yorku.library.restservice.models.TextBook textBook10 = new com.yorku.library.restservice.models.TextBook("", "", "", byteArray6, course9);
        textBook10.updateNotification();
        byte[] byteArray18 = new byte[] {};
        com.yorku.library.restservice.models.Course course19 = null;
        com.yorku.library.restservice.models.TextBook textBook20 = new com.yorku.library.restservice.models.TextBook("", "", "hi!", byteArray18, course19);
        com.yorku.library.restservice.models.Course course21 = null;
        com.yorku.library.restservice.models.TextBook textBook22 = new com.yorku.library.restservice.models.TextBook("", "", "", byteArray18, course21);
        textBook10.setImage(byteArray18);
        textBook10.updateNotification();
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[]");
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[]");
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        byte[] byteArray5 = new byte[] { (byte) 1, (byte) 10 };
        com.yorku.library.restservice.models.Course course6 = null;
        com.yorku.library.restservice.models.TextBook textBook7 = new com.yorku.library.restservice.models.TextBook("", "hi!", "", byteArray5, course6);
        byte[] byteArray11 = new byte[] {};
        com.yorku.library.restservice.models.Course course12 = null;
        com.yorku.library.restservice.models.TextBook textBook13 = new com.yorku.library.restservice.models.TextBook("", "", "hi!", byteArray11, course12);
        textBook7.setImage(byteArray11);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 10]");
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[]");
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        byte[] byteArray5 = new byte[] { (byte) 1, (byte) 10 };
        com.yorku.library.restservice.models.Course course6 = null;
        com.yorku.library.restservice.models.TextBook textBook7 = new com.yorku.library.restservice.models.TextBook("", "hi!", "", byteArray5, course6);
        java.lang.Integer int8 = textBook7.getId();
        com.yorku.library.restservice.models.Request request9 = null;
        // The following exception was thrown during execution in test generation
        try {
            textBook7.setRequest(request9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.library.restservice.models.Request.setItem(com.yorku.library.restservice.models.Item)\" because \"request\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 10]");
        org.junit.Assert.assertNull(int8);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        com.yorku.library.restservice.models.TextBook textBook0 = new com.yorku.library.restservice.models.TextBook();
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        byte[] byteArray5 = new byte[] { (byte) 1, (byte) 10 };
        com.yorku.library.restservice.models.Course course6 = null;
        com.yorku.library.restservice.models.TextBook textBook7 = new com.yorku.library.restservice.models.TextBook("", "hi!", "", byteArray5, course6);
        textBook7.setDescription("");
        com.yorku.library.restservice.models.Course course10 = null;
        textBook7.setCourse(course10);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 10]");
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        byte[] byteArray5 = new byte[] { (byte) 1, (byte) 10 };
        com.yorku.library.restservice.models.Course course6 = null;
        com.yorku.library.restservice.models.TextBook textBook7 = new com.yorku.library.restservice.models.TextBook("", "hi!", "", byteArray5, course6);
        java.lang.String str8 = textBook7.getDescription();
        java.lang.String str9 = textBook7.toString();
        java.lang.String str10 = textBook7.getDescription();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 10]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Item [id=null, name=, description=hi!, location=, request=null]" + "'", str9, "Item [id=null, name=, description=hi!, location=, request=null]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        byte[] byteArray5 = new byte[] { (byte) 1, (byte) 10 };
        com.yorku.library.restservice.models.Course course6 = null;
        com.yorku.library.restservice.models.TextBook textBook7 = new com.yorku.library.restservice.models.TextBook("", "hi!", "", byteArray5, course6);
        java.lang.Integer int8 = textBook7.getId();
        int int9 = textBook7.getStock();
        java.lang.String str10 = textBook7.getDescription();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 10]");
        org.junit.Assert.assertNull(int8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 20 + "'", int9 == 20);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        byte[] byteArray6 = new byte[] {};
        com.yorku.library.restservice.models.Course course7 = null;
        com.yorku.library.restservice.models.TextBook textBook8 = new com.yorku.library.restservice.models.TextBook("", "", "hi!", byteArray6, course7);
        com.yorku.library.restservice.models.Course course9 = null;
        com.yorku.library.restservice.models.TextBook textBook10 = new com.yorku.library.restservice.models.TextBook("", "", "", byteArray6, course9);
        textBook10.updateNotification();
        byte[] byteArray18 = new byte[] {};
        com.yorku.library.restservice.models.Course course19 = null;
        com.yorku.library.restservice.models.TextBook textBook20 = new com.yorku.library.restservice.models.TextBook("", "", "hi!", byteArray18, course19);
        com.yorku.library.restservice.models.Course course21 = null;
        com.yorku.library.restservice.models.TextBook textBook22 = new com.yorku.library.restservice.models.TextBook("", "", "", byteArray18, course21);
        textBook10.setImage(byteArray18);
        java.lang.String str24 = textBook10.getItemType();
        textBook10.setTitle("hi!");
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[]");
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[]");
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        byte[] byteArray5 = new byte[] { (byte) 1, (byte) 10 };
        com.yorku.library.restservice.models.Course course6 = null;
        com.yorku.library.restservice.models.TextBook textBook7 = new com.yorku.library.restservice.models.TextBook("", "hi!", "", byteArray5, course6);
        java.lang.Integer int8 = textBook7.getId();
        int int9 = textBook7.getStock();
        com.yorku.library.restservice.models.Request request10 = null;
        // The following exception was thrown during execution in test generation
        try {
            textBook7.setRequest(request10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.library.restservice.models.Request.setItem(com.yorku.library.restservice.models.Item)\" because \"request\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 10]");
        org.junit.Assert.assertNull(int8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 20 + "'", int9 == 20);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        byte[] byteArray5 = new byte[] { (byte) 1, (byte) 10 };
        com.yorku.library.restservice.models.Course course6 = null;
        com.yorku.library.restservice.models.TextBook textBook7 = new com.yorku.library.restservice.models.TextBook("", "hi!", "", byteArray5, course6);
        textBook7.setDescription("");
        textBook7.setStock((int) (short) -1);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 10]");
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        byte[] byteArray5 = new byte[] { (byte) 1, (byte) 10 };
        com.yorku.library.restservice.models.Course course6 = null;
        com.yorku.library.restservice.models.TextBook textBook7 = new com.yorku.library.restservice.models.TextBook("", "hi!", "", byteArray5, course6);
        java.lang.Integer int8 = textBook7.getId();
        textBook7.setTitle("Item [id=null, name=, description=hi!, location=, request=null]");
        java.lang.String str11 = textBook7.toString();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 10]");
        org.junit.Assert.assertNull(int8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Item [id=null, name=Item [id=null, name=, description=hi!, location=, request=null], description=hi!, location=, request=null]" + "'", str11, "Item [id=null, name=Item [id=null, name=, description=hi!, location=, request=null], description=hi!, location=, request=null]");
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        byte[] byteArray5 = new byte[] { (byte) 1, (byte) 10 };
        com.yorku.library.restservice.models.Course course6 = null;
        com.yorku.library.restservice.models.TextBook textBook7 = new com.yorku.library.restservice.models.TextBook("", "hi!", "", byteArray5, course6);
        textBook7.setId((java.lang.Integer) (-1));
        java.lang.Class<?> wildcardClass10 = textBook7.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 10]");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        byte[] byteArray5 = new byte[] { (byte) 1, (byte) 10 };
        com.yorku.library.restservice.models.Course course6 = null;
        com.yorku.library.restservice.models.TextBook textBook7 = new com.yorku.library.restservice.models.TextBook("", "hi!", "", byteArray5, course6);
        java.lang.String str8 = textBook7.getDescription();
        com.yorku.library.restservice.models.Course course9 = null;
        textBook7.setCourse(course9);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 10]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        byte[] byteArray6 = new byte[] {};
        com.yorku.library.restservice.models.Course course7 = null;
        com.yorku.library.restservice.models.TextBook textBook8 = new com.yorku.library.restservice.models.TextBook("", "", "hi!", byteArray6, course7);
        com.yorku.library.restservice.models.Course course9 = null;
        com.yorku.library.restservice.models.TextBook textBook10 = new com.yorku.library.restservice.models.TextBook("", "", "", byteArray6, course9);
        textBook10.updateNotification();
        java.lang.String str12 = textBook10.toString();
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Item [id=null, name=, description=, location=, request=null]" + "'", str12, "Item [id=null, name=, description=, location=, request=null]");
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        byte[] byteArray6 = new byte[] {};
        com.yorku.library.restservice.models.Course course7 = null;
        com.yorku.library.restservice.models.TextBook textBook8 = new com.yorku.library.restservice.models.TextBook("", "", "hi!", byteArray6, course7);
        com.yorku.library.restservice.models.Course course9 = null;
        com.yorku.library.restservice.models.TextBook textBook10 = new com.yorku.library.restservice.models.TextBook("", "", "", byteArray6, course9);
        textBook10.setDescription("hi!");
        java.lang.Integer int13 = textBook10.getId();
        byte[] byteArray19 = new byte[] { (byte) 1, (byte) 10 };
        com.yorku.library.restservice.models.Course course20 = null;
        com.yorku.library.restservice.models.TextBook textBook21 = new com.yorku.library.restservice.models.TextBook("", "hi!", "", byteArray19, course20);
        textBook10.setImage(byteArray19);
        com.yorku.library.restservice.models.Course course23 = null;
        textBook10.setCourse(course23);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[]");
        org.junit.Assert.assertNull(int13);
        org.junit.Assert.assertNotNull(byteArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray19), "[1, 10]");
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        byte[] byteArray6 = new byte[] {};
        com.yorku.library.restservice.models.Course course7 = null;
        com.yorku.library.restservice.models.TextBook textBook8 = new com.yorku.library.restservice.models.TextBook("", "", "hi!", byteArray6, course7);
        com.yorku.library.restservice.models.Course course9 = null;
        com.yorku.library.restservice.models.TextBook textBook10 = new com.yorku.library.restservice.models.TextBook("", "", "", byteArray6, course9);
        textBook10.updateNotification();
        byte[] byteArray18 = new byte[] {};
        com.yorku.library.restservice.models.Course course19 = null;
        com.yorku.library.restservice.models.TextBook textBook20 = new com.yorku.library.restservice.models.TextBook("", "", "hi!", byteArray18, course19);
        com.yorku.library.restservice.models.Course course21 = null;
        com.yorku.library.restservice.models.TextBook textBook22 = new com.yorku.library.restservice.models.TextBook("", "", "", byteArray18, course21);
        textBook10.setImage(byteArray18);
        java.lang.String str24 = textBook10.getItemType();
        com.yorku.library.restservice.models.Request request25 = textBook10.getRequest();
        com.yorku.library.restservice.models.Request request26 = null;
        // The following exception was thrown during execution in test generation
        try {
            textBook10.setRequest(request26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.library.restservice.models.Request.setItem(com.yorku.library.restservice.models.Item)\" because \"request\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[]");
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[]");
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(request25);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        byte[] byteArray5 = new byte[] { (byte) 1, (byte) 10 };
        com.yorku.library.restservice.models.Course course6 = null;
        com.yorku.library.restservice.models.TextBook textBook7 = new com.yorku.library.restservice.models.TextBook("", "hi!", "", byteArray5, course6);
        java.lang.String str8 = textBook7.getLocation();
        int int9 = textBook7.getStock();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 10]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 20 + "'", int9 == 20);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        byte[] byteArray6 = new byte[] {};
        com.yorku.library.restservice.models.Course course7 = null;
        com.yorku.library.restservice.models.TextBook textBook8 = new com.yorku.library.restservice.models.TextBook("", "", "hi!", byteArray6, course7);
        com.yorku.library.restservice.models.Course course9 = null;
        com.yorku.library.restservice.models.TextBook textBook10 = new com.yorku.library.restservice.models.TextBook("", "", "", byteArray6, course9);
        textBook10.setDescription("hi!");
        com.yorku.library.restservice.models.Course course13 = null;
        textBook10.setCourse(course13);
        textBook10.setTitle("");
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[]");
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        byte[] byteArray6 = new byte[] {};
        com.yorku.library.restservice.models.Course course7 = null;
        com.yorku.library.restservice.models.TextBook textBook8 = new com.yorku.library.restservice.models.TextBook("", "", "hi!", byteArray6, course7);
        com.yorku.library.restservice.models.Course course9 = null;
        com.yorku.library.restservice.models.TextBook textBook10 = new com.yorku.library.restservice.models.TextBook("", "", "", byteArray6, course9);
        textBook10.updateNotification();
        byte[] byteArray20 = new byte[] { (byte) 1, (byte) 10 };
        com.yorku.library.restservice.models.Course course21 = null;
        com.yorku.library.restservice.models.TextBook textBook22 = new com.yorku.library.restservice.models.TextBook("", "hi!", "", byteArray20, course21);
        com.yorku.library.restservice.models.Course course23 = null;
        com.yorku.library.restservice.models.TextBook textBook24 = new com.yorku.library.restservice.models.TextBook("Item [id=null, name=, description=hi!, location=, request=null]", "", "Item [id=null, name=, description=hi!, location=, request=null]", byteArray20, course23);
        textBook10.setImage(byteArray20);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[]");
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[1, 10]");
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        byte[] byteArray5 = new byte[] { (byte) 1, (byte) 10 };
        com.yorku.library.restservice.models.Course course6 = null;
        com.yorku.library.restservice.models.TextBook textBook7 = new com.yorku.library.restservice.models.TextBook("", "hi!", "", byteArray5, course6);
        java.lang.String str8 = textBook7.getDescription();
        java.lang.Integer int9 = textBook7.getId();
        com.yorku.library.restservice.models.Course course10 = null;
        textBook7.setCourse(course10);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 10]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(int9);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        byte[] byteArray6 = new byte[] {};
        com.yorku.library.restservice.models.Course course7 = null;
        com.yorku.library.restservice.models.TextBook textBook8 = new com.yorku.library.restservice.models.TextBook("", "", "hi!", byteArray6, course7);
        com.yorku.library.restservice.models.Course course9 = null;
        com.yorku.library.restservice.models.TextBook textBook10 = new com.yorku.library.restservice.models.TextBook("", "", "", byteArray6, course9);
        textBook10.updateNotification();
        byte[] byteArray18 = new byte[] {};
        com.yorku.library.restservice.models.Course course19 = null;
        com.yorku.library.restservice.models.TextBook textBook20 = new com.yorku.library.restservice.models.TextBook("", "", "hi!", byteArray18, course19);
        com.yorku.library.restservice.models.Course course21 = null;
        com.yorku.library.restservice.models.TextBook textBook22 = new com.yorku.library.restservice.models.TextBook("", "", "", byteArray18, course21);
        textBook10.setImage(byteArray18);
        java.lang.String str24 = textBook10.getItemType();
        com.yorku.library.restservice.models.Request request25 = textBook10.getRequest();
        com.yorku.library.restservice.models.Course course26 = null;
        textBook10.setCourse(course26);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[]");
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[]");
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(request25);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        byte[] byteArray5 = new byte[] { (byte) 1, (byte) 10 };
        com.yorku.library.restservice.models.Course course6 = null;
        com.yorku.library.restservice.models.TextBook textBook7 = new com.yorku.library.restservice.models.TextBook("", "hi!", "", byteArray5, course6);
        java.lang.String str8 = textBook7.getDescription();
        java.lang.String str9 = textBook7.toString();
        byte[] byteArray16 = new byte[] {};
        com.yorku.library.restservice.models.Course course17 = null;
        com.yorku.library.restservice.models.TextBook textBook18 = new com.yorku.library.restservice.models.TextBook("", "", "hi!", byteArray16, course17);
        com.yorku.library.restservice.models.Course course19 = null;
        com.yorku.library.restservice.models.TextBook textBook20 = new com.yorku.library.restservice.models.TextBook("", "", "", byteArray16, course19);
        textBook20.setDescription("hi!");
        java.lang.Integer int23 = textBook20.getId();
        byte[] byteArray29 = new byte[] { (byte) 1, (byte) 10 };
        com.yorku.library.restservice.models.Course course30 = null;
        com.yorku.library.restservice.models.TextBook textBook31 = new com.yorku.library.restservice.models.TextBook("", "hi!", "", byteArray29, course30);
        textBook20.setImage(byteArray29);
        textBook7.setImage(byteArray29);
        java.lang.String str34 = textBook7.getTitle();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 10]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Item [id=null, name=, description=hi!, location=, request=null]" + "'", str9, "Item [id=null, name=, description=hi!, location=, request=null]");
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray16), "[]");
        org.junit.Assert.assertNull(int23);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray29), "[1, 10]");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        byte[] byteArray5 = new byte[] { (byte) 1, (byte) 10 };
        com.yorku.library.restservice.models.Course course6 = null;
        com.yorku.library.restservice.models.TextBook textBook7 = new com.yorku.library.restservice.models.TextBook("", "hi!", "", byteArray5, course6);
        java.lang.Integer int8 = textBook7.getId();
        textBook7.setTitle("hi!");
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 10]");
        org.junit.Assert.assertNull(int8);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        byte[] byteArray5 = new byte[] { (byte) 1, (byte) 10 };
        com.yorku.library.restservice.models.Course course6 = null;
        com.yorku.library.restservice.models.TextBook textBook7 = new com.yorku.library.restservice.models.TextBook("", "hi!", "", byteArray5, course6);
        java.lang.String str8 = textBook7.getDescription();
        java.lang.Integer int9 = textBook7.getId();
        textBook7.setStock((int) (byte) -1);
        com.yorku.library.restservice.models.Course course12 = null;
        textBook7.setCourse(course12);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 10]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(int9);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        byte[] byteArray6 = new byte[] {};
        com.yorku.library.restservice.models.Course course7 = null;
        com.yorku.library.restservice.models.TextBook textBook8 = new com.yorku.library.restservice.models.TextBook("", "", "hi!", byteArray6, course7);
        com.yorku.library.restservice.models.Course course9 = null;
        com.yorku.library.restservice.models.TextBook textBook10 = new com.yorku.library.restservice.models.TextBook("", "", "", byteArray6, course9);
        textBook10.setDescription("hi!");
        java.lang.Integer int13 = textBook10.getId();
        textBook10.updateNotification();
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[]");
        org.junit.Assert.assertNull(int13);
    }
}

