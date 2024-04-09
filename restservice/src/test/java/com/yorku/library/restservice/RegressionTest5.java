package com.yorku.library.restservice;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest5 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test01");
        com.yorku.library.restservice.models.Request request0 = new com.yorku.library.restservice.models.Request();
        java.lang.Class<?> wildcardClass1 = request0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        com.yorku.library.restservice.models.Request request0 = new com.yorku.library.restservice.models.Request();
        com.yorku.library.restservice.models.Item item1 = null;
        request0.setItem(item1);
        com.yorku.library.restservice.models.Item item3 = null;
        request0.setItem(item3);
        java.lang.Class<?> wildcardClass5 = request0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        com.yorku.library.restservice.models.Request request0 = new com.yorku.library.restservice.models.Request();
        request0.setPriority((java.lang.Integer) (-1));
        com.yorku.library.restservice.models.Item item3 = null;
        request0.setItem(item3);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        com.yorku.library.restservice.models.Request request0 = new com.yorku.library.restservice.models.Request();
        request0.setPriority((java.lang.Integer) (-1));
        request0.setId((java.lang.Integer) 0);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        com.yorku.library.restservice.models.User user1 = null;
        com.yorku.library.restservice.models.Item item2 = null;
        com.yorku.library.restservice.models.Request request3 = new com.yorku.library.restservice.models.Request((java.lang.Integer) (-1), user1, item2);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        com.yorku.library.restservice.models.Request request0 = new com.yorku.library.restservice.models.Request();
        com.yorku.library.restservice.models.Item item1 = null;
        request0.setItem(item1);
        request0.setId((java.lang.Integer) 1);
        com.yorku.library.restservice.models.User user5 = null;
        request0.setUser(user5);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        com.yorku.library.restservice.models.Request request0 = new com.yorku.library.restservice.models.Request();
        com.yorku.library.restservice.models.Item item1 = null;
        request0.setItem(item1);
        com.yorku.library.restservice.models.User user3 = null;
        request0.setUser(user3);
        com.yorku.library.restservice.models.User user5 = null;
        request0.setUser(user5);
        com.yorku.library.restservice.models.Item item7 = null;
        request0.setItem(item7);
        com.yorku.library.restservice.models.Item item9 = null;
        request0.setItem(item9);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        com.yorku.library.restservice.models.Request request0 = new com.yorku.library.restservice.models.Request();
        com.yorku.library.restservice.models.Item item1 = null;
        request0.setItem(item1);
        java.lang.Integer int3 = request0.getPriority();
        com.yorku.library.restservice.models.User user4 = null;
        request0.setUser(user4);
        java.lang.String str6 = request0.toString();
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Request [id=null, priority=null]" + "'", str6, "Request [id=null, priority=null]");
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        com.yorku.library.restservice.models.Request request0 = new com.yorku.library.restservice.models.Request();
        com.yorku.library.restservice.models.Item item1 = null;
        request0.setItem(item1);
        request0.setPriority((java.lang.Integer) 0);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        com.yorku.library.restservice.models.Request request0 = new com.yorku.library.restservice.models.Request();
        com.yorku.library.restservice.models.Item item1 = null;
        request0.setItem(item1);
        com.yorku.library.restservice.models.User user3 = null;
        request0.setUser(user3);
        com.yorku.library.restservice.models.User user5 = null;
        request0.setUser(user5);
        java.lang.Integer int7 = request0.getPriority();
        java.lang.Integer int8 = request0.getPriority();
        request0.setPriority((java.lang.Integer) 10);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNull(int8);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        com.yorku.library.restservice.models.Request request0 = new com.yorku.library.restservice.models.Request();
        com.yorku.library.restservice.models.Item item1 = null;
        request0.setItem(item1);
        com.yorku.library.restservice.models.User user3 = null;
        request0.setUser(user3);
        com.yorku.library.restservice.models.User user5 = null;
        request0.setUser(user5);
        java.lang.Integer int7 = request0.getPriority();
        request0.setId((java.lang.Integer) 1);
        com.yorku.library.restservice.models.User user10 = null;
        request0.setUser(user10);
        java.lang.Class<?> wildcardClass12 = request0.getClass();
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        com.yorku.library.restservice.models.Request request0 = new com.yorku.library.restservice.models.Request();
        com.yorku.library.restservice.models.Item item1 = null;
        request0.setItem(item1);
        java.lang.String str3 = request0.toString();
        request0.setId((java.lang.Integer) 10);
        request0.setPriority((java.lang.Integer) (-1));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Request [id=null, priority=null]" + "'", str3, "Request [id=null, priority=null]");
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        com.yorku.library.restservice.models.Request request0 = new com.yorku.library.restservice.models.Request();
        com.yorku.library.restservice.models.Item item1 = null;
        request0.setItem(item1);
        com.yorku.library.restservice.models.User user3 = null;
        request0.setUser(user3);
        com.yorku.library.restservice.models.User user5 = null;
        request0.setUser(user5);
        java.lang.Integer int7 = request0.getPriority();
        java.lang.Integer int8 = request0.getPriority();
        com.yorku.library.restservice.models.User user9 = null;
        request0.setUser(user9);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNull(int8);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        com.yorku.library.restservice.models.User user1 = null;
        com.yorku.library.restservice.models.Item item2 = null;
        com.yorku.library.restservice.models.Request request3 = new com.yorku.library.restservice.models.Request((java.lang.Integer) 0, user1, item2);
        java.lang.Integer int4 = request3.getId();
        com.yorku.library.restservice.models.User user5 = null;
        request3.setUser(user5);
        request3.setPriority((java.lang.Integer) 10);
        org.junit.Assert.assertNull(int4);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        com.yorku.library.restservice.models.User user1 = null;
        com.yorku.library.restservice.models.Item item2 = null;
        com.yorku.library.restservice.models.Request request3 = new com.yorku.library.restservice.models.Request((java.lang.Integer) 1, user1, item2);
        com.yorku.library.restservice.models.User user4 = null;
        request3.setUser(user4);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        com.yorku.library.restservice.models.Request request0 = new com.yorku.library.restservice.models.Request();
        com.yorku.library.restservice.models.Item item1 = null;
        request0.setItem(item1);
        com.yorku.library.restservice.models.User user3 = null;
        request0.setUser(user3);
        java.lang.String str5 = request0.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Request [id=null, priority=null]" + "'", str5, "Request [id=null, priority=null]");
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        com.yorku.library.restservice.models.User user1 = null;
        com.yorku.library.restservice.models.Item item2 = null;
        com.yorku.library.restservice.models.Request request3 = new com.yorku.library.restservice.models.Request((java.lang.Integer) 0, user1, item2);
        java.lang.Class<?> wildcardClass4 = request3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        com.yorku.library.restservice.models.User user1 = null;
        com.yorku.library.restservice.models.Item item2 = null;
        com.yorku.library.restservice.models.Request request3 = new com.yorku.library.restservice.models.Request((java.lang.Integer) 0, user1, item2);
        java.lang.Integer int4 = request3.getId();
        com.yorku.library.restservice.models.User user5 = null;
        request3.setUser(user5);
        com.yorku.library.restservice.models.User user7 = null;
        request3.setUser(user7);
        org.junit.Assert.assertNull(int4);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        com.yorku.library.restservice.models.Request request0 = new com.yorku.library.restservice.models.Request();
        com.yorku.library.restservice.models.Item item1 = null;
        request0.setItem(item1);
        com.yorku.library.restservice.models.User user3 = null;
        request0.setUser(user3);
        com.yorku.library.restservice.models.User user5 = null;
        request0.setUser(user5);
        java.lang.Integer int7 = request0.getPriority();
        request0.setId((java.lang.Integer) 1);
        com.yorku.library.restservice.models.User user10 = null;
        request0.setUser(user10);
        com.yorku.library.restservice.models.User user12 = null;
        request0.setUser(user12);
        org.junit.Assert.assertNull(int7);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        com.yorku.library.restservice.models.Request request0 = new com.yorku.library.restservice.models.Request();
        com.yorku.library.restservice.models.Item item1 = null;
        request0.setItem(item1);
        com.yorku.library.restservice.models.User user3 = null;
        request0.setUser(user3);
        com.yorku.library.restservice.models.User user5 = null;
        request0.setUser(user5);
        java.lang.Integer int7 = request0.getPriority();
        request0.setPriority((java.lang.Integer) 100);
        org.junit.Assert.assertNull(int7);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        com.yorku.library.restservice.models.Request request0 = new com.yorku.library.restservice.models.Request();
        com.yorku.library.restservice.models.Item item1 = null;
        request0.setItem(item1);
        com.yorku.library.restservice.models.User user3 = null;
        request0.setUser(user3);
        com.yorku.library.restservice.models.User user5 = null;
        request0.setUser(user5);
        java.lang.Integer int7 = request0.getPriority();
        request0.setPriority((java.lang.Integer) (-1));
        com.yorku.library.restservice.models.User user10 = null;
        request0.setUser(user10);
        org.junit.Assert.assertNull(int7);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        com.yorku.library.restservice.models.Request request0 = new com.yorku.library.restservice.models.Request();
        com.yorku.library.restservice.models.Item item1 = null;
        request0.setItem(item1);
        java.lang.String str3 = request0.toString();
        request0.setPriority((java.lang.Integer) (-1));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Request [id=null, priority=null]" + "'", str3, "Request [id=null, priority=null]");
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        com.yorku.library.restservice.models.User user1 = null;
        com.yorku.library.restservice.models.Item item2 = null;
        com.yorku.library.restservice.models.Request request3 = new com.yorku.library.restservice.models.Request((java.lang.Integer) 100, user1, item2);
        request3.setPriority((java.lang.Integer) 100);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        com.yorku.library.restservice.models.Request request0 = new com.yorku.library.restservice.models.Request();
        com.yorku.library.restservice.models.Item item1 = null;
        request0.setItem(item1);
        java.lang.String str3 = request0.toString();
        com.yorku.library.restservice.models.User user4 = null;
        request0.setUser(user4);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Request [id=null, priority=null]" + "'", str3, "Request [id=null, priority=null]");
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        com.yorku.library.restservice.models.User user1 = null;
        com.yorku.library.restservice.models.Item item2 = null;
        com.yorku.library.restservice.models.Request request3 = new com.yorku.library.restservice.models.Request((java.lang.Integer) 0, user1, item2);
        request3.setPriority((java.lang.Integer) 10);
        request3.setPriority((java.lang.Integer) (-1));
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        com.yorku.library.restservice.models.Request request0 = new com.yorku.library.restservice.models.Request();
        com.yorku.library.restservice.models.Item item1 = null;
        request0.setItem(item1);
        java.lang.Integer int3 = request0.getPriority();
        request0.setPriority((java.lang.Integer) 1);
        org.junit.Assert.assertNull(int3);
    }
}

