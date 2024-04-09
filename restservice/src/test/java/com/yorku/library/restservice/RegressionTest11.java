package com.yorku.library.restservice;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest11 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test01");
        com.yorku.library.restservice.models.UserItem userItem0 = new com.yorku.library.restservice.models.UserItem();
        com.yorku.library.restservice.models.Ownership ownership1 = userItem0.getOwntype();
        com.yorku.library.restservice.models.Item item2 = null;
        userItem0.setItem(item2);
        java.util.Date date4 = null;
        userItem0.setTimestamp(date4);
        org.junit.Assert.assertNull(ownership1);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        com.yorku.library.restservice.models.UserItem userItem0 = new com.yorku.library.restservice.models.UserItem();
        com.yorku.library.restservice.models.Ownership ownership1 = userItem0.getOwntype();
        java.lang.Class<?> wildcardClass2 = userItem0.getClass();
        org.junit.Assert.assertNull(ownership1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        com.yorku.library.restservice.models.UserItem userItem0 = new com.yorku.library.restservice.models.UserItem();
        com.yorku.library.restservice.models.Ownership ownership1 = userItem0.getOwntype();
        com.yorku.library.restservice.models.Item item2 = null;
        userItem0.setItem(item2);
        com.yorku.library.restservice.models.Ownership ownership4 = null;
        userItem0.setOwntype(ownership4);
        org.junit.Assert.assertNull(ownership1);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        com.yorku.library.restservice.models.UserItem userItem0 = new com.yorku.library.restservice.models.UserItem();
        com.yorku.library.restservice.models.Ownership ownership1 = userItem0.getOwntype();
        java.util.Date date2 = userItem0.getTimestamp();
        java.lang.Class<?> wildcardClass3 = userItem0.getClass();
        org.junit.Assert.assertNull(ownership1);
        org.junit.Assert.assertNull(date2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        com.yorku.library.restservice.models.UserItem userItem0 = new com.yorku.library.restservice.models.UserItem();
        com.yorku.library.restservice.models.Ownership ownership1 = null;
        userItem0.setOwntype(ownership1);
        com.yorku.library.restservice.models.UserItemPrimaryKey userItemPrimaryKey3 = null;
        userItem0.setPk(userItemPrimaryKey3);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        com.yorku.library.restservice.models.UserItem userItem0 = new com.yorku.library.restservice.models.UserItem();
        com.yorku.library.restservice.models.Ownership ownership1 = userItem0.getOwntype();
        com.yorku.library.restservice.models.Item item2 = null;
        userItem0.setItem(item2);
        com.yorku.library.restservice.models.User user4 = null;
        userItem0.setUser(user4);
        com.yorku.library.restservice.models.User user6 = null;
        userItem0.setUser(user6);
        org.junit.Assert.assertNull(ownership1);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        com.yorku.library.restservice.models.User user0 = null;
        com.yorku.library.restservice.models.Item item1 = null;
        java.util.Date date2 = null;
        com.yorku.library.restservice.models.Ownership ownership3 = null;
        com.yorku.library.restservice.models.UserItem userItem4 = new com.yorku.library.restservice.models.UserItem(user0, item1, date2, ownership3);
        com.yorku.library.restservice.models.UserItemPrimaryKey userItemPrimaryKey5 = null;
        userItem4.setPk(userItemPrimaryKey5);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        com.yorku.library.restservice.models.User user0 = null;
        com.yorku.library.restservice.models.Item item1 = null;
        java.util.Date date2 = null;
        com.yorku.library.restservice.models.Ownership ownership3 = null;
        com.yorku.library.restservice.models.UserItem userItem4 = new com.yorku.library.restservice.models.UserItem(user0, item1, date2, ownership3);
        com.yorku.library.restservice.models.Item item5 = userItem4.getItem();
        org.junit.Assert.assertNull(item5);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        com.yorku.library.restservice.models.UserItem userItem0 = new com.yorku.library.restservice.models.UserItem();
        com.yorku.library.restservice.models.Item item1 = userItem0.getItem();
        com.yorku.library.restservice.models.Ownership ownership2 = userItem0.getOwntype();
        org.junit.Assert.assertNull(item1);
        org.junit.Assert.assertNull(ownership2);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        com.yorku.library.restservice.models.UserItem userItem0 = new com.yorku.library.restservice.models.UserItem();
        com.yorku.library.restservice.models.Ownership ownership1 = null;
        userItem0.setOwntype(ownership1);
        com.yorku.library.restservice.models.Item item3 = null;
        userItem0.setItem(item3);
        com.yorku.library.restservice.models.User user5 = userItem0.getUser();
        com.yorku.library.restservice.models.Item item6 = userItem0.getItem();
        org.junit.Assert.assertNull(user5);
        org.junit.Assert.assertNull(item6);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        com.yorku.library.restservice.models.UserItem userItem0 = new com.yorku.library.restservice.models.UserItem();
        com.yorku.library.restservice.models.User user1 = null;
        userItem0.setUser(user1);
        com.yorku.library.restservice.models.Ownership ownership3 = null;
        userItem0.setOwntype(ownership3);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        com.yorku.library.restservice.models.UserItem userItem0 = new com.yorku.library.restservice.models.UserItem();
        com.yorku.library.restservice.models.Item item1 = null;
        userItem0.setItem(item1);
        com.yorku.library.restservice.models.Item item3 = null;
        userItem0.setItem(item3);
        com.yorku.library.restservice.models.Ownership ownership5 = userItem0.getOwntype();
        org.junit.Assert.assertNull(ownership5);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        com.yorku.library.restservice.models.UserItem userItem0 = new com.yorku.library.restservice.models.UserItem();
        com.yorku.library.restservice.models.Ownership ownership1 = userItem0.getOwntype();
        com.yorku.library.restservice.models.Item item2 = null;
        userItem0.setItem(item2);
        com.yorku.library.restservice.models.Item item4 = null;
        userItem0.setItem(item4);
        java.util.Date date6 = userItem0.getTimestamp();
        org.junit.Assert.assertNull(ownership1);
        org.junit.Assert.assertNull(date6);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        com.yorku.library.restservice.models.UserItem userItem0 = new com.yorku.library.restservice.models.UserItem();
        com.yorku.library.restservice.models.Item item1 = userItem0.getItem();
        java.lang.Class<?> wildcardClass2 = userItem0.getClass();
        org.junit.Assert.assertNull(item1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        com.yorku.library.restservice.models.UserItem userItem0 = new com.yorku.library.restservice.models.UserItem();
        com.yorku.library.restservice.models.Item item1 = null;
        userItem0.setItem(item1);
        java.util.Date date3 = userItem0.getTimestamp();
        com.yorku.library.restservice.models.Item item4 = null;
        userItem0.setItem(item4);
        com.yorku.library.restservice.models.Ownership ownership6 = null;
        userItem0.setOwntype(ownership6);
        org.junit.Assert.assertNull(date3);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        com.yorku.library.restservice.models.UserItem userItem0 = new com.yorku.library.restservice.models.UserItem();
        com.yorku.library.restservice.models.Ownership ownership1 = null;
        userItem0.setOwntype(ownership1);
        com.yorku.library.restservice.models.Item item3 = null;
        userItem0.setItem(item3);
        com.yorku.library.restservice.models.Ownership ownership5 = userItem0.getOwntype();
        com.yorku.library.restservice.models.Item item6 = userItem0.getItem();
        java.util.Date date7 = userItem0.getTimestamp();
        org.junit.Assert.assertNull(ownership5);
        org.junit.Assert.assertNull(item6);
        org.junit.Assert.assertNull(date7);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        com.yorku.library.restservice.models.UserItem userItem0 = new com.yorku.library.restservice.models.UserItem();
        com.yorku.library.restservice.models.Ownership ownership1 = userItem0.getOwntype();
        com.yorku.library.restservice.models.Item item2 = null;
        userItem0.setItem(item2);
        com.yorku.library.restservice.models.Item item4 = null;
        userItem0.setItem(item4);
        java.util.Date date6 = null;
        userItem0.setTimestamp(date6);
        java.lang.Class<?> wildcardClass8 = userItem0.getClass();
        org.junit.Assert.assertNull(ownership1);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        com.yorku.library.restservice.models.UserItem userItem0 = new com.yorku.library.restservice.models.UserItem();
        com.yorku.library.restservice.models.Ownership ownership1 = null;
        userItem0.setOwntype(ownership1);
        com.yorku.library.restservice.models.Item item3 = null;
        userItem0.setItem(item3);
        com.yorku.library.restservice.models.User user5 = userItem0.getUser();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass6 = user5.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(user5);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        com.yorku.library.restservice.models.UserItem userItem0 = new com.yorku.library.restservice.models.UserItem();
        com.yorku.library.restservice.models.Item item1 = null;
        userItem0.setItem(item1);
        java.util.Date date3 = userItem0.getTimestamp();
        java.util.Date date4 = userItem0.getTimestamp();
        com.yorku.library.restservice.models.Ownership ownership5 = userItem0.getOwntype();
        org.junit.Assert.assertNull(date3);
        org.junit.Assert.assertNull(date4);
        org.junit.Assert.assertNull(ownership5);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        com.yorku.library.restservice.models.UserItem userItem0 = new com.yorku.library.restservice.models.UserItem();
        com.yorku.library.restservice.models.Ownership ownership1 = userItem0.getOwntype();
        com.yorku.library.restservice.models.Item item2 = null;
        userItem0.setItem(item2);
        com.yorku.library.restservice.models.UserItemPrimaryKey userItemPrimaryKey4 = null;
        userItem0.setPk(userItemPrimaryKey4);
        java.util.Date date6 = userItem0.getTimestamp();
        org.junit.Assert.assertNull(ownership1);
        org.junit.Assert.assertNull(date6);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        com.yorku.library.restservice.models.UserItem userItem0 = new com.yorku.library.restservice.models.UserItem();
        com.yorku.library.restservice.models.Ownership ownership1 = userItem0.getOwntype();
        com.yorku.library.restservice.models.Item item2 = null;
        userItem0.setItem(item2);
        com.yorku.library.restservice.models.Item item4 = null;
        userItem0.setItem(item4);
        java.util.Date date6 = null;
        userItem0.setTimestamp(date6);
        com.yorku.library.restservice.models.User user8 = userItem0.getUser();
        org.junit.Assert.assertNull(ownership1);
        org.junit.Assert.assertNull(user8);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        com.yorku.library.restservice.models.UserItem userItem0 = new com.yorku.library.restservice.models.UserItem();
        com.yorku.library.restservice.models.Ownership ownership1 = userItem0.getOwntype();
        com.yorku.library.restservice.models.Item item2 = null;
        userItem0.setItem(item2);
        com.yorku.library.restservice.models.Item item4 = null;
        userItem0.setItem(item4);
        java.util.Date date6 = null;
        userItem0.setTimestamp(date6);
        com.yorku.library.restservice.models.UserItemPrimaryKey userItemPrimaryKey8 = null;
        userItem0.setPk(userItemPrimaryKey8);
        org.junit.Assert.assertNull(ownership1);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        com.yorku.library.restservice.models.UserItem userItem0 = new com.yorku.library.restservice.models.UserItem();
        com.yorku.library.restservice.models.Item item1 = null;
        userItem0.setItem(item1);
        java.util.Date date3 = userItem0.getTimestamp();
        com.yorku.library.restservice.models.Item item4 = null;
        userItem0.setItem(item4);
        com.yorku.library.restservice.models.UserItemPrimaryKey userItemPrimaryKey6 = null;
        userItem0.setPk(userItemPrimaryKey6);
        com.yorku.library.restservice.models.User user8 = null;
        userItem0.setUser(user8);
        java.util.Date date10 = userItem0.getTimestamp();
        org.junit.Assert.assertNull(date3);
        org.junit.Assert.assertNull(date10);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        com.yorku.library.restservice.models.UserItem userItem0 = new com.yorku.library.restservice.models.UserItem();
        com.yorku.library.restservice.models.Ownership ownership1 = userItem0.getOwntype();
        com.yorku.library.restservice.models.Item item2 = null;
        userItem0.setItem(item2);
        com.yorku.library.restservice.models.User user4 = null;
        userItem0.setUser(user4);
        java.util.Date date6 = userItem0.getTimestamp();
        org.junit.Assert.assertNull(ownership1);
        org.junit.Assert.assertNull(date6);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        com.yorku.library.restservice.models.UserItem userItem0 = new com.yorku.library.restservice.models.UserItem();
        com.yorku.library.restservice.models.Ownership ownership1 = userItem0.getOwntype();
        com.yorku.library.restservice.models.Item item2 = null;
        userItem0.setItem(item2);
        com.yorku.library.restservice.models.UserItemPrimaryKey userItemPrimaryKey4 = null;
        userItem0.setPk(userItemPrimaryKey4);
        java.util.Date date6 = null;
        userItem0.setTimestamp(date6);
        org.junit.Assert.assertNull(ownership1);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        com.yorku.library.restservice.models.UserItem userItem0 = new com.yorku.library.restservice.models.UserItem();
        com.yorku.library.restservice.models.Ownership ownership1 = userItem0.getOwntype();
        com.yorku.library.restservice.models.User user2 = userItem0.getUser();
        java.util.Date date3 = userItem0.getTimestamp();
        org.junit.Assert.assertNull(ownership1);
        org.junit.Assert.assertNull(user2);
        org.junit.Assert.assertNull(date3);
    }
}

