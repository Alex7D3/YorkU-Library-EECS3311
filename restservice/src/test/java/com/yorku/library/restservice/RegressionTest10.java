package com.yorku.library.restservice;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest10 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test01");
        com.yorku.library.restservice.models.User user0 = new com.yorku.library.restservice.models.User();
        java.util.Set<com.yorku.library.restservice.models.Course> courseSet1 = user0.getCourses();
        java.lang.String str2 = user0.getPassword();
        boolean boolean3 = user0.isVerified();
        org.junit.Assert.assertNotNull(courseSet1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        com.yorku.library.restservice.models.User user0 = new com.yorku.library.restservice.models.User();
        user0.setUsername("");
        java.lang.Class<?> wildcardClass3 = user0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        com.yorku.library.restservice.models.User user0 = new com.yorku.library.restservice.models.User();
        java.util.Set<com.yorku.library.restservice.models.Course> courseSet1 = user0.getCourses();
        java.lang.String str2 = user0.getPassword();
        com.yorku.library.restservice.models.Request request3 = null;
        // The following exception was thrown during execution in test generation
        try {
            user0.addRequest(request3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.library.restservice.models.Request.setUser(com.yorku.library.restservice.models.User)\" because \"req\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseSet1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        com.yorku.library.restservice.models.Role role3 = null;
        com.yorku.library.restservice.models.User user4 = new com.yorku.library.restservice.models.User("hi!", "hi!", "", role3);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        com.yorku.library.restservice.models.User user0 = new com.yorku.library.restservice.models.User();
        java.util.Set<com.yorku.library.restservice.models.Course> courseSet1 = user0.getCourses();
        java.lang.String str2 = user0.getPassword();
        java.util.Set<com.yorku.library.restservice.models.UserItem> userItemSet3 = user0.getItems();
        org.junit.Assert.assertNotNull(courseSet1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(userItemSet3);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        com.yorku.library.restservice.models.User user0 = new com.yorku.library.restservice.models.User();
        java.util.Set<com.yorku.library.restservice.models.Course> courseSet1 = user0.getCourses();
        user0.setPassword("");
        user0.removeRequest((java.lang.Integer) 10);
        org.junit.Assert.assertNotNull(courseSet1);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        com.yorku.library.restservice.models.User user0 = new com.yorku.library.restservice.models.User();
        java.util.Set<com.yorku.library.restservice.models.Course> courseSet1 = user0.getCourses();
        java.lang.String str2 = user0.getPassword();
        java.lang.String str3 = user0.getUsername();
        org.junit.Assert.assertNotNull(courseSet1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        com.yorku.library.restservice.models.User user0 = new com.yorku.library.restservice.models.User();
        user0.setUsername("");
        com.yorku.library.restservice.models.Role role3 = user0.getRole();
        com.yorku.library.restservice.models.Request request4 = null;
        // The following exception was thrown during execution in test generation
        try {
            user0.addRequest(request4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.library.restservice.models.Request.setUser(com.yorku.library.restservice.models.User)\" because \"req\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(role3);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        com.yorku.library.restservice.models.User user0 = new com.yorku.library.restservice.models.User();
        java.util.Set<com.yorku.library.restservice.models.Course> courseSet1 = user0.getCourses();
        java.util.Set<com.yorku.library.restservice.models.Course> courseSet2 = user0.getCourses();
        user0.setUsername("hi!");
        user0.removeRequest((java.lang.Integer) (-1));
        org.junit.Assert.assertNotNull(courseSet1);
        org.junit.Assert.assertNotNull(courseSet2);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        com.yorku.library.restservice.models.User user0 = new com.yorku.library.restservice.models.User();
        java.util.Set<com.yorku.library.restservice.models.Course> courseSet1 = user0.getCourses();
        user0.setPassword("");
        user0.setPassword("hi!");
        java.util.Set<com.yorku.library.restservice.models.UserItem> userItemSet6 = user0.getItems();
        org.junit.Assert.assertNotNull(courseSet1);
        org.junit.Assert.assertNotNull(userItemSet6);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        com.yorku.library.restservice.models.User user0 = new com.yorku.library.restservice.models.User();
        user0.setVerified(false);
        user0.setId((java.lang.Integer) 1);
        com.yorku.library.restservice.models.Request request5 = null;
        // The following exception was thrown during execution in test generation
        try {
            user0.addRequest(request5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.library.restservice.models.Request.setUser(com.yorku.library.restservice.models.User)\" because \"req\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        com.yorku.library.restservice.models.User user0 = new com.yorku.library.restservice.models.User();
        java.lang.String str1 = user0.getPassword();
        java.lang.String str2 = user0.getUsername();
        com.yorku.library.restservice.models.Role role3 = user0.getRole();
        user0.removeRequest((java.lang.Integer) 10);
        user0.setPassword("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(role3);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        com.yorku.library.restservice.models.User user0 = new com.yorku.library.restservice.models.User();
        user0.setVerified(false);
        java.lang.Integer int3 = user0.getId();
        org.junit.Assert.assertNull(int3);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        com.yorku.library.restservice.models.User user0 = new com.yorku.library.restservice.models.User();
        user0.setVerified(false);
        user0.setId((java.lang.Integer) 1);
        java.util.Set<com.yorku.library.restservice.models.Request> requestSet5 = user0.getRequests();
        user0.setEmail("hi!");
        org.junit.Assert.assertNotNull(requestSet5);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        com.yorku.library.restservice.models.User user0 = new com.yorku.library.restservice.models.User();
        user0.setUsername("");
        java.util.Set<com.yorku.library.restservice.models.UserItem> userItemSet3 = user0.getItems();
        org.junit.Assert.assertNotNull(userItemSet3);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        com.yorku.library.restservice.models.User user0 = new com.yorku.library.restservice.models.User();
        user0.setVerified(false);
        user0.setId((java.lang.Integer) 1);
        boolean boolean5 = user0.isVerified();
        java.util.Set<com.yorku.library.restservice.models.Course> courseSet6 = user0.getCourses();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(courseSet6);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        com.yorku.library.restservice.models.User user0 = new com.yorku.library.restservice.models.User();
        user0.setUsername("");
        com.yorku.library.restservice.models.Role role3 = user0.getRole();
        user0.setVerified(false);
        java.lang.Class<?> wildcardClass6 = user0.getClass();
        org.junit.Assert.assertNull(role3);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        com.yorku.library.restservice.models.User user0 = new com.yorku.library.restservice.models.User();
        user0.setVerified(false);
        user0.setId((java.lang.Integer) 1);
        user0.setUsername("hi!");
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        com.yorku.library.restservice.models.User user0 = new com.yorku.library.restservice.models.User();
        java.util.Set<com.yorku.library.restservice.models.Course> courseSet1 = user0.getCourses();
        java.util.Set<com.yorku.library.restservice.models.Course> courseSet2 = user0.getCourses();
        com.yorku.library.restservice.models.Role role3 = null;
        user0.setRole(role3);
        user0.setId((java.lang.Integer) 10);
        org.junit.Assert.assertNotNull(courseSet1);
        org.junit.Assert.assertNotNull(courseSet2);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        com.yorku.library.restservice.models.User user0 = new com.yorku.library.restservice.models.User();
        java.util.Set<com.yorku.library.restservice.models.Course> courseSet1 = user0.getCourses();
        user0.setUsername("");
        org.junit.Assert.assertNotNull(courseSet1);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        com.yorku.library.restservice.models.User user0 = new com.yorku.library.restservice.models.User();
        java.util.Set<com.yorku.library.restservice.models.Course> courseSet1 = user0.getCourses();
        java.util.Set<com.yorku.library.restservice.models.Course> courseSet2 = user0.getCourses();
        user0.setEmail("hi!");
        user0.removeRequest((java.lang.Integer) 10);
        java.lang.String str7 = user0.getUsername();
        org.junit.Assert.assertNotNull(courseSet1);
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        com.yorku.library.restservice.models.User user0 = new com.yorku.library.restservice.models.User();
        user0.setUsername("");
        com.yorku.library.restservice.models.Role role3 = user0.getRole();
        user0.setVerified(false);
        com.yorku.library.restservice.models.Role role6 = null;
        user0.setRole(role6);
        org.junit.Assert.assertNull(role3);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        com.yorku.library.restservice.models.User user0 = new com.yorku.library.restservice.models.User();
        user0.setVerified(false);
        java.lang.String str3 = user0.getPassword();
        user0.setEmail("hi!");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        com.yorku.library.restservice.models.User user0 = new com.yorku.library.restservice.models.User();
        user0.setVerified(false);
        user0.setId((java.lang.Integer) 1);
        boolean boolean5 = user0.isVerified();
        java.lang.Class<?> wildcardClass6 = user0.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        com.yorku.library.restservice.models.User user0 = new com.yorku.library.restservice.models.User();
        java.util.Set<com.yorku.library.restservice.models.UserItem> userItemSet1 = user0.getItems();
        java.util.Set<com.yorku.library.restservice.models.Course> courseSet2 = user0.getCourses();
        org.junit.Assert.assertNotNull(userItemSet1);
        org.junit.Assert.assertNotNull(courseSet2);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        com.yorku.library.restservice.models.User user0 = new com.yorku.library.restservice.models.User();
        java.util.Set<com.yorku.library.restservice.models.Course> courseSet1 = user0.getCourses();
        java.util.Set<com.yorku.library.restservice.models.Course> courseSet2 = user0.getCourses();
        user0.setPassword("hi!");
        user0.setVerified(false);
        org.junit.Assert.assertNotNull(courseSet1);
        org.junit.Assert.assertNotNull(courseSet2);
    }
}

