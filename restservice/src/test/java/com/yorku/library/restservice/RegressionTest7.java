package com.yorku.library.restservice;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest7 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test01");
        com.yorku.library.restservice.models.Staff staff0 = new com.yorku.library.restservice.models.Staff();
        staff0.setUsername("");
        java.lang.Class<?> wildcardClass3 = staff0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        com.yorku.library.restservice.models.Staff staff0 = new com.yorku.library.restservice.models.Staff();
        java.util.Set<com.yorku.library.restservice.models.Course> courseSet1 = staff0.getCourses();
        java.lang.String str2 = staff0.getPassword();
        com.yorku.library.restservice.models.Request request3 = null;
        // The following exception was thrown during execution in test generation
        try {
            staff0.addRequest(request3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.library.restservice.models.Request.setUser(com.yorku.library.restservice.models.User)\" because \"req\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(courseSet1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        com.yorku.library.restservice.models.Staff staff0 = new com.yorku.library.restservice.models.Staff();
        java.util.Set<com.yorku.library.restservice.models.Course> courseSet1 = staff0.getCourses();
        staff0.setPassword("");
        staff0.setPassword("hi!");
        org.junit.Assert.assertNotNull(courseSet1);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        com.yorku.library.restservice.models.Staff staff0 = new com.yorku.library.restservice.models.Staff();
        java.util.Set<com.yorku.library.restservice.models.Course> courseSet1 = staff0.getCourses();
        java.util.Set<com.yorku.library.restservice.models.Course> courseSet2 = staff0.getCourses();
        staff0.setPassword("hi!");
        org.junit.Assert.assertNotNull(courseSet1);
        org.junit.Assert.assertNotNull(courseSet2);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        com.yorku.library.restservice.models.Staff staff0 = new com.yorku.library.restservice.models.Staff();
        java.util.Set<com.yorku.library.restservice.models.Course> courseSet1 = staff0.getCourses();
        java.util.Set<com.yorku.library.restservice.models.Course> courseSet2 = staff0.getCourses();
        com.yorku.library.restservice.models.Role role3 = null;
        staff0.setRole(role3);
        org.junit.Assert.assertNotNull(courseSet1);
        org.junit.Assert.assertNotNull(courseSet2);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        com.yorku.library.restservice.models.Staff staff0 = new com.yorku.library.restservice.models.Staff();
        java.util.Set<com.yorku.library.restservice.models.Request> requestSet1 = staff0.getRequests();
        org.junit.Assert.assertNotNull(requestSet1);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        com.yorku.library.restservice.models.Staff staff0 = new com.yorku.library.restservice.models.Staff();
        java.lang.String str1 = staff0.getPassword();
        java.lang.String str2 = staff0.getUsername();
        staff0.setId((java.lang.Integer) 1);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        com.yorku.library.restservice.models.Staff staff0 = new com.yorku.library.restservice.models.Staff();
        staff0.setUsername("");
        com.yorku.library.restservice.models.Role role3 = staff0.getRole();
        staff0.setVerified(false);
        java.lang.String str6 = staff0.getUsername();
        org.junit.Assert.assertNull(role3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        com.yorku.library.restservice.models.Staff staff0 = new com.yorku.library.restservice.models.Staff();
        staff0.setUsername("");
        staff0.setEmail("");
        com.yorku.library.restservice.models.Request request5 = null;
        // The following exception was thrown during execution in test generation
        try {
            staff0.addRequest(request5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.library.restservice.models.Request.setUser(com.yorku.library.restservice.models.User)\" because \"req\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        com.yorku.library.restservice.models.Staff staff0 = new com.yorku.library.restservice.models.Staff();
        java.util.Set<com.yorku.library.restservice.models.Course> courseSet1 = staff0.getCourses();
        java.util.Set<com.yorku.library.restservice.models.Course> courseSet2 = staff0.getCourses();
        com.yorku.library.restservice.models.Role role3 = staff0.getRole();
        org.junit.Assert.assertNotNull(courseSet1);
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNull(role3);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        com.yorku.library.restservice.models.Staff staff0 = new com.yorku.library.restservice.models.Staff();
        staff0.setVerified(false);
        staff0.setUsername("hi!");
        staff0.removeRequest((java.lang.Integer) (-1));
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        com.yorku.library.restservice.models.Staff staff0 = new com.yorku.library.restservice.models.Staff();
        java.util.Set<com.yorku.library.restservice.models.Course> courseSet1 = staff0.getCourses();
        java.lang.String str2 = staff0.getPassword();
        boolean boolean3 = staff0.isVerified();
        java.util.Set<com.yorku.library.restservice.models.UserItem> userItemSet4 = staff0.getItems();
        org.junit.Assert.assertNotNull(courseSet1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(userItemSet4);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        com.yorku.library.restservice.models.Staff staff0 = new com.yorku.library.restservice.models.Staff();
        staff0.setUsername("");
        com.yorku.library.restservice.models.Role role3 = staff0.getRole();
        staff0.setVerified(false);
        java.lang.String str6 = staff0.getEmail();
        java.util.Set<com.yorku.library.restservice.models.Request> requestSet7 = staff0.getRequests();
        com.yorku.library.restservice.models.Request request8 = null;
        // The following exception was thrown during execution in test generation
        try {
            staff0.addRequest(request8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.library.restservice.models.Request.setUser(com.yorku.library.restservice.models.User)\" because \"req\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(role3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(requestSet7);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        com.yorku.library.restservice.models.Staff staff0 = new com.yorku.library.restservice.models.Staff();
        staff0.setUsername("");
        com.yorku.library.restservice.models.Role role3 = staff0.getRole();
        staff0.setVerified(false);
        staff0.removeRequest((java.lang.Integer) 10);
        com.yorku.library.restservice.models.Request request8 = null;
        // The following exception was thrown during execution in test generation
        try {
            staff0.addRequest(request8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.library.restservice.models.Request.setUser(com.yorku.library.restservice.models.User)\" because \"req\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(role3);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        com.yorku.library.restservice.models.Staff staff0 = new com.yorku.library.restservice.models.Staff();
        java.util.Set<com.yorku.library.restservice.models.Course> courseSet1 = staff0.getCourses();
        staff0.setUsername("hi!");
        staff0.setEmail("hi!");
        org.junit.Assert.assertNotNull(courseSet1);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        com.yorku.library.restservice.models.Staff staff0 = new com.yorku.library.restservice.models.Staff();
        staff0.setUsername("");
        staff0.setEmail("");
        java.util.Set<com.yorku.library.restservice.models.UserItem> userItemSet5 = staff0.getItems();
        org.junit.Assert.assertNotNull(userItemSet5);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        com.yorku.library.restservice.models.Staff staff0 = new com.yorku.library.restservice.models.Staff();
        java.util.Set<com.yorku.library.restservice.models.Course> courseSet1 = staff0.getCourses();
        java.lang.String str2 = staff0.getPassword();
        boolean boolean3 = staff0.isVerified();
        java.util.Set<com.yorku.library.restservice.models.Course> courseSet4 = staff0.getCourses();
        org.junit.Assert.assertNotNull(courseSet1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(courseSet4);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        com.yorku.library.restservice.models.Staff staff0 = new com.yorku.library.restservice.models.Staff();
        java.util.Set<com.yorku.library.restservice.models.Course> courseSet1 = staff0.getCourses();
        java.util.Set<com.yorku.library.restservice.models.Course> courseSet2 = staff0.getCourses();
        staff0.setPassword("");
        java.lang.Class<?> wildcardClass5 = staff0.getClass();
        org.junit.Assert.assertNotNull(courseSet1);
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        com.yorku.library.restservice.models.Staff staff0 = new com.yorku.library.restservice.models.Staff();
        staff0.setUsername("");
        staff0.setEmail("");
        staff0.setUsername("hi!");
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        com.yorku.library.restservice.models.Staff staff0 = new com.yorku.library.restservice.models.Staff();
        java.util.Set<com.yorku.library.restservice.models.Course> courseSet1 = staff0.getCourses();
        java.lang.Integer int2 = staff0.getId();
        staff0.setUsername("");
        org.junit.Assert.assertNotNull(courseSet1);
        org.junit.Assert.assertNull(int2);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        com.yorku.library.restservice.models.Staff staff0 = new com.yorku.library.restservice.models.Staff();
        staff0.setUsername("");
        com.yorku.library.restservice.models.Role role3 = staff0.getRole();
        staff0.setVerified(false);
        java.lang.String str6 = staff0.getEmail();
        staff0.setId((java.lang.Integer) 10);
        java.util.Set<com.yorku.library.restservice.models.UserItem> userItemSet9 = staff0.getItems();
        org.junit.Assert.assertNull(role3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(userItemSet9);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        com.yorku.library.restservice.models.Staff staff0 = new com.yorku.library.restservice.models.Staff();
        java.util.Set<com.yorku.library.restservice.models.Course> courseSet1 = staff0.getCourses();
        java.lang.String str2 = staff0.getUsername();
        org.junit.Assert.assertNotNull(courseSet1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        com.yorku.library.restservice.models.Staff staff0 = new com.yorku.library.restservice.models.Staff();
        java.lang.String str1 = staff0.getPassword();
        boolean boolean2 = staff0.isVerified();
        com.yorku.library.restservice.models.Role role3 = null;
        staff0.setRole(role3);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        com.yorku.library.restservice.models.Staff staff3 = new com.yorku.library.restservice.models.Staff("hi!", "hi!", "");
        java.lang.String str4 = staff3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        com.yorku.library.restservice.models.Staff staff0 = new com.yorku.library.restservice.models.Staff();
        staff0.setUsername("");
        com.yorku.library.restservice.models.Role role3 = staff0.getRole();
        staff0.setVerified(false);
        staff0.removeRequest((java.lang.Integer) 10);
        java.util.Set<com.yorku.library.restservice.models.Request> requestSet8 = staff0.getRequests();
        staff0.setEmail("hi!");
        org.junit.Assert.assertNull(role3);
        org.junit.Assert.assertNotNull(requestSet8);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        com.yorku.library.restservice.models.Staff staff0 = new com.yorku.library.restservice.models.Staff();
        staff0.setUsername("");
        com.yorku.library.restservice.models.Role role3 = staff0.getRole();
        staff0.setVerified(false);
        java.lang.String str6 = staff0.getEmail();
        staff0.setId((java.lang.Integer) 10);
        java.lang.Class<?> wildcardClass9 = staff0.getClass();
        org.junit.Assert.assertNull(role3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }
}

