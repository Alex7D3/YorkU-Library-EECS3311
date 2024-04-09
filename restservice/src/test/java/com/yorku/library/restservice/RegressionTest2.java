package com.yorku.library.restservice;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest2 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test01");
        com.yorku.library.restservice.models.Item item0 = new com.yorku.library.restservice.models.Item();
        java.lang.String str1 = item0.getDescription();
        java.lang.String str2 = item0.getLocation();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        com.yorku.library.restservice.models.Item item0 = new com.yorku.library.restservice.models.Item();
        java.lang.String str1 = item0.getDescription();
        com.yorku.library.restservice.models.Request request2 = null;
        // The following exception was thrown during execution in test generation
        try {
            item0.setRequest(request2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.library.restservice.models.Request.setItem(com.yorku.library.restservice.models.Item)\" because \"request\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        com.yorku.library.restservice.models.Item item0 = new com.yorku.library.restservice.models.Item();
        java.lang.String str1 = item0.getTitle();
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        com.yorku.library.restservice.models.Item item0 = new com.yorku.library.restservice.models.Item();
        item0.setTitle("");
        item0.setLocation("hi!");
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        com.yorku.library.restservice.models.Item item0 = new com.yorku.library.restservice.models.Item();
        java.lang.String str1 = item0.getDescription();
        item0.setId((java.lang.Integer) 10);
        byte[] byteArray12 = new byte[] { (byte) -1, (byte) 10, (byte) 10, (byte) 1, (byte) 0 };
        com.yorku.library.restservice.models.Item item13 = new com.yorku.library.restservice.models.Item("hi!", "hi!", "", byteArray12);
        item0.setImage(byteArray12);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[-1, 10, 10, 1, 0]");
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        com.yorku.library.restservice.models.Item item0 = new com.yorku.library.restservice.models.Item();
        item0.setDescription("");
        int int3 = item0.getStock();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        com.yorku.library.restservice.models.Item item0 = new com.yorku.library.restservice.models.Item();
        java.lang.String str1 = item0.getDescription();
        item0.setId((java.lang.Integer) 10);
        java.lang.Class<?> wildcardClass4 = item0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        com.yorku.library.restservice.models.Item item0 = new com.yorku.library.restservice.models.Item();
        java.lang.String str1 = item0.getDescription();
        item0.setId((java.lang.Integer) 1);
        java.lang.String str4 = item0.getLocation();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 10, (byte) 10, (byte) 1, (byte) 0 };
        com.yorku.library.restservice.models.Item item9 = new com.yorku.library.restservice.models.Item("hi!", "hi!", "", byteArray8);
        java.lang.String str10 = item9.getLocation();
        java.lang.String str11 = item9.getLocation();
        byte[] byteArray12 = item9.getImage();
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[-1, 10, 10, 1, 0]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray12), "[-1, 10, 10, 1, 0]");
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 10, (byte) 10, (byte) 1, (byte) 0 };
        com.yorku.library.restservice.models.Item item9 = new com.yorku.library.restservice.models.Item("hi!", "hi!", "", byteArray8);
        item9.setDescription("");
        item9.setLocation("");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[-1, 10, 10, 1, 0]");
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        com.yorku.library.restservice.models.Item item0 = new com.yorku.library.restservice.models.Item();
        java.lang.String str1 = item0.getDescription();
        java.lang.String str2 = item0.getDescription();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        com.yorku.library.restservice.models.Item item0 = new com.yorku.library.restservice.models.Item();
        java.lang.String str1 = item0.getDescription();
        item0.setId((java.lang.Integer) 1);
        java.lang.String str4 = item0.getTitle();
        item0.setDescription("Item [id=null, name=null, description=null, location=null, request=null]");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        byte[] byteArray8 = new byte[] { (byte) -1, (byte) 10, (byte) 10, (byte) 1, (byte) 0 };
        com.yorku.library.restservice.models.Item item9 = new com.yorku.library.restservice.models.Item("hi!", "hi!", "", byteArray8);
        java.lang.String str10 = item9.getLocation();
        item9.setLocation("");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[-1, 10, 10, 1, 0]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        com.yorku.library.restservice.models.Item item0 = new com.yorku.library.restservice.models.Item();
        item0.setTitle("");
        int int3 = item0.getStock();
        java.lang.String str4 = item0.toString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Item [id=null, name=, description=null, location=null, request=null]" + "'", str4, "Item [id=null, name=, description=null, location=null, request=null]");
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        com.yorku.library.restservice.models.Item item0 = new com.yorku.library.restservice.models.Item();
        java.lang.String str1 = item0.getDescription();
        java.lang.String str2 = item0.toString();
        item0.setLocation("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Item [id=null, name=null, description=null, location=null, request=null]" + "'", str2, "Item [id=null, name=null, description=null, location=null, request=null]");
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        com.yorku.library.restservice.models.Item item0 = new com.yorku.library.restservice.models.Item();
        item0.setStock((int) (short) -1);
        java.lang.Integer int3 = item0.getId();
        item0.setLocation("");
        org.junit.Assert.assertNull(int3);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        com.yorku.library.restservice.models.Item item0 = new com.yorku.library.restservice.models.Item();
        item0.setStock((int) (short) -1);
        java.lang.Integer int3 = item0.getId();
        item0.setDescription("hi!");
        item0.setStock((int) (short) 10);
        item0.setStock((int) ' ');
        item0.setStock(1);
        org.junit.Assert.assertNull(int3);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        com.yorku.library.restservice.models.Item item0 = new com.yorku.library.restservice.models.Item();
        java.lang.String str1 = item0.getDescription();
        item0.updateNotification();
        java.lang.String str3 = item0.getLocation();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        com.yorku.library.restservice.models.Item item0 = new com.yorku.library.restservice.models.Item();
        java.lang.String str1 = item0.getDescription();
        item0.setId((java.lang.Integer) 1);
        java.lang.String str4 = item0.getTitle();
        com.yorku.library.restservice.models.User user5 = null;
        com.yorku.library.restservice.models.Ownership ownership6 = null;
        java.sql.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.yorku.library.restservice.models.UserItem userItem8 = item0.addUser(user5, ownership6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Out Of Stock");
        } catch (java.lang.Exception e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        com.yorku.library.restservice.models.Item item0 = new com.yorku.library.restservice.models.Item();
        item0.setDescription("");
        item0.setDescription("Item [id=null, name=null, description=null, location=null, request=null]");
        java.lang.String str5 = item0.getItemType();
        item0.setId((java.lang.Integer) 100);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        com.yorku.library.restservice.models.Item item0 = new com.yorku.library.restservice.models.Item();
        java.lang.String str1 = item0.getDescription();
        item0.setId((java.lang.Integer) 10);
        item0.setLocation("");
        com.yorku.library.restservice.models.Request request6 = null;
        // The following exception was thrown during execution in test generation
        try {
            item0.setRequest(request6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.library.restservice.models.Request.setItem(com.yorku.library.restservice.models.Item)\" because \"request\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        com.yorku.library.restservice.models.Item item0 = new com.yorku.library.restservice.models.Item();
        java.lang.String str1 = item0.getDescription();
        item0.updateNotification();
        java.lang.String str3 = item0.getTitle();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        com.yorku.library.restservice.models.Item item0 = new com.yorku.library.restservice.models.Item();
        java.lang.String str1 = item0.getDescription();
        java.lang.Integer int2 = item0.getId();
        item0.updateNotification();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(int2);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        com.yorku.library.restservice.models.Item item3 = new com.yorku.library.restservice.models.Item();
        item3.setTitle("");
        int int6 = item3.getStock();
        byte[] byteArray11 = new byte[] { (byte) 100, (byte) 0, (byte) 1, (byte) 0 };
        item3.setImage(byteArray11);
        com.yorku.library.restservice.models.Item item13 = new com.yorku.library.restservice.models.Item("Item [id=null, name=, description=null, location=null, request=null]", "Item [id=null, name=null, description=null, location=null, request=null]", "hi!", byteArray11);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[100, 0, 1, 0]");
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        byte[] byteArray11 = new byte[] { (byte) -1, (byte) 10, (byte) 10, (byte) 1, (byte) 0 };
        com.yorku.library.restservice.models.Item item12 = new com.yorku.library.restservice.models.Item("hi!", "hi!", "", byteArray11);
        com.yorku.library.restservice.models.Item item13 = new com.yorku.library.restservice.models.Item("", "", "hi!", byteArray11);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[-1, 10, 10, 1, 0]");
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        com.yorku.library.restservice.models.Item item0 = new com.yorku.library.restservice.models.Item();
        item0.setDescription("");
        item0.setDescription("Item [id=null, name=null, description=null, location=null, request=null]");
        java.lang.String str5 = item0.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Item [id=null, name=null, description=Item [id=null, name=null, description=null, location=null, request=null], location=null, request=null]" + "'", str5, "Item [id=null, name=null, description=Item [id=null, name=null, description=null, location=null, request=null], location=null, request=null]");
    }
}

