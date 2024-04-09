package com.yorku.library.restservice;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest3 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test01");
        com.yorku.library.restservice.models.Faculty faculty0 = new com.yorku.library.restservice.models.Faculty();
        java.util.Set<com.yorku.library.restservice.models.Request> requestSet1 = faculty0.getRequests();
        com.yorku.library.restservice.models.Role role2 = null;
        faculty0.setRole(role2);
        java.lang.String str4 = faculty0.toString();
        org.junit.Assert.assertNotNull(requestSet1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "User [id=null, username=null, pw=null, email=null, requests=[], items=[]]" + "'", str4, "User [id=null, username=null, pw=null, email=null, requests=[], items=[]]");
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        com.yorku.library.restservice.models.Faculty faculty0 = new com.yorku.library.restservice.models.Faculty();
        java.util.Set<com.yorku.library.restservice.models.Request> requestSet1 = faculty0.getRequests();
        faculty0.removeRequest((java.lang.Integer) 0);
        java.lang.String str4 = faculty0.getEmail();
        boolean boolean5 = faculty0.isVerified();
        com.yorku.library.restservice.models.Request request6 = null;
        // The following exception was thrown during execution in test generation
        try {
            faculty0.addRequest(request6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.library.restservice.models.Request.setUser(com.yorku.library.restservice.models.User)\" because \"req\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(requestSet1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        com.yorku.library.restservice.models.Faculty faculty0 = new com.yorku.library.restservice.models.Faculty();
        java.util.Set<com.yorku.library.restservice.models.Request> requestSet1 = faculty0.getRequests();
        com.yorku.library.restservice.models.Request request2 = null;
        // The following exception was thrown during execution in test generation
        try {
            faculty0.addRequest(request2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.library.restservice.models.Request.setUser(com.yorku.library.restservice.models.User)\" because \"req\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(requestSet1);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        com.yorku.library.restservice.models.Faculty faculty0 = new com.yorku.library.restservice.models.Faculty();
        java.util.Set<com.yorku.library.restservice.models.Request> requestSet1 = faculty0.getRequests();
        faculty0.removeRequest((java.lang.Integer) 0);
        faculty0.setId((java.lang.Integer) 1);
        java.lang.String str6 = faculty0.getStaffNum();
        java.lang.String str7 = faculty0.getUsername();
        faculty0.setPassword("");
        org.junit.Assert.assertNotNull(requestSet1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        com.yorku.library.restservice.models.Faculty faculty0 = new com.yorku.library.restservice.models.Faculty();
        java.util.Set<com.yorku.library.restservice.models.Request> requestSet1 = faculty0.getRequests();
        faculty0.removeRequest((java.lang.Integer) 0);
        java.lang.String str4 = faculty0.getEmail();
        java.lang.String str5 = faculty0.getPassword();
        org.junit.Assert.assertNotNull(requestSet1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        com.yorku.library.restservice.models.Faculty faculty0 = new com.yorku.library.restservice.models.Faculty();
        java.util.Set<com.yorku.library.restservice.models.Request> requestSet1 = faculty0.getRequests();
        faculty0.removeRequest((java.lang.Integer) 0);
        faculty0.setId((java.lang.Integer) 1);
        java.lang.String str6 = faculty0.getStaffNum();
        java.lang.String str7 = faculty0.getUsername();
        com.yorku.library.restservice.models.Role role8 = faculty0.getRole();
        org.junit.Assert.assertNotNull(requestSet1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(role8);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        com.yorku.library.restservice.models.Faculty faculty0 = new com.yorku.library.restservice.models.Faculty();
        java.util.Set<com.yorku.library.restservice.models.Request> requestSet1 = faculty0.getRequests();
        faculty0.removeRequest((java.lang.Integer) 0);
        faculty0.setId((java.lang.Integer) 1);
        java.lang.String str6 = faculty0.getStaffNum();
        java.util.Set<com.yorku.library.restservice.models.Course> courseSet7 = faculty0.getCourses();
        boolean boolean8 = faculty0.isVerified();
        org.junit.Assert.assertNotNull(requestSet1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(courseSet7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        com.yorku.library.restservice.models.Faculty faculty0 = new com.yorku.library.restservice.models.Faculty();
        java.util.Set<com.yorku.library.restservice.models.Request> requestSet1 = faculty0.getRequests();
        faculty0.removeRequest((java.lang.Integer) 0);
        faculty0.setId((java.lang.Integer) 1);
        java.lang.String str6 = faculty0.getStaffNum();
        faculty0.removeRequest((java.lang.Integer) 10);
        java.util.Set<com.yorku.library.restservice.models.Course> courseSet9 = faculty0.getCourses();
        faculty0.setUsername("User [id=null, username=null, pw=null, email=null, requests=[], items=[]]");
        java.lang.Class<?> wildcardClass12 = faculty0.getClass();
        org.junit.Assert.assertNotNull(requestSet1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(courseSet9);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        com.yorku.library.restservice.models.Faculty faculty0 = new com.yorku.library.restservice.models.Faculty();
        java.util.Set<com.yorku.library.restservice.models.Request> requestSet1 = faculty0.getRequests();
        faculty0.removeRequest((java.lang.Integer) 0);
        faculty0.setId((java.lang.Integer) 1);
        java.lang.String str6 = faculty0.getStaffNum();
        com.yorku.library.restservice.models.Role role7 = faculty0.getRole();
        java.lang.String str8 = faculty0.getEmail();
        org.junit.Assert.assertNotNull(requestSet1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(role7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        com.yorku.library.restservice.models.Faculty faculty0 = new com.yorku.library.restservice.models.Faculty();
        java.util.Set<com.yorku.library.restservice.models.UserItem> userItemSet1 = faculty0.getItems();
        com.yorku.library.restservice.models.Role role2 = null;
        faculty0.setRole(role2);
        org.junit.Assert.assertNotNull(userItemSet1);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        com.yorku.library.restservice.models.Faculty faculty0 = new com.yorku.library.restservice.models.Faculty();
        java.util.Set<com.yorku.library.restservice.models.UserItem> userItemSet1 = faculty0.getItems();
        java.util.Set<com.yorku.library.restservice.models.Course> courseSet2 = faculty0.getCourses();
        faculty0.setUsername("hi!");
        faculty0.setVerified(false);
        java.util.Set<com.yorku.library.restservice.models.UserItem> userItemSet7 = faculty0.getItems();
        java.util.Set<com.yorku.library.restservice.models.UserItem> userItemSet8 = faculty0.getItems();
        org.junit.Assert.assertNotNull(userItemSet1);
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNotNull(userItemSet7);
        org.junit.Assert.assertNotNull(userItemSet8);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        com.yorku.library.restservice.models.Faculty faculty0 = new com.yorku.library.restservice.models.Faculty();
        java.util.Set<com.yorku.library.restservice.models.Request> requestSet1 = faculty0.getRequests();
        com.yorku.library.restservice.models.Role role2 = null;
        faculty0.setRole(role2);
        java.util.Set<com.yorku.library.restservice.models.UserItem> userItemSet4 = faculty0.getItems();
        org.junit.Assert.assertNotNull(requestSet1);
        org.junit.Assert.assertNotNull(userItemSet4);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        com.yorku.library.restservice.models.Faculty faculty0 = new com.yorku.library.restservice.models.Faculty();
        java.util.Set<com.yorku.library.restservice.models.Request> requestSet1 = faculty0.getRequests();
        faculty0.removeRequest((java.lang.Integer) 0);
        java.lang.String str4 = faculty0.getEmail();
        boolean boolean5 = faculty0.isVerified();
        faculty0.setPassword("hi!");
        com.yorku.library.restservice.models.Role role8 = null;
        faculty0.setRole(role8);
        org.junit.Assert.assertNotNull(requestSet1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        com.yorku.library.restservice.models.Faculty faculty0 = new com.yorku.library.restservice.models.Faculty();
        java.util.Set<com.yorku.library.restservice.models.UserItem> userItemSet1 = faculty0.getItems();
        java.util.Set<com.yorku.library.restservice.models.Course> courseSet2 = faculty0.getCourses();
        faculty0.setUsername("hi!");
        faculty0.setVerified(false);
        java.util.Set<com.yorku.library.restservice.models.UserItem> userItemSet7 = faculty0.getItems();
        java.util.Set<com.yorku.library.restservice.models.Request> requestSet8 = faculty0.getRequests();
        java.lang.Class<?> wildcardClass9 = requestSet8.getClass();
        org.junit.Assert.assertNotNull(userItemSet1);
        org.junit.Assert.assertNotNull(courseSet2);
        org.junit.Assert.assertNotNull(userItemSet7);
        org.junit.Assert.assertNotNull(requestSet8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        com.yorku.library.restservice.models.Faculty faculty0 = new com.yorku.library.restservice.models.Faculty();
        java.util.Set<com.yorku.library.restservice.models.Request> requestSet1 = faculty0.getRequests();
        faculty0.removeRequest((java.lang.Integer) 0);
        java.lang.String str4 = faculty0.getStaffNum();
        java.lang.String str5 = faculty0.getUsername();
        org.junit.Assert.assertNotNull(requestSet1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        com.yorku.library.restservice.models.Faculty faculty0 = new com.yorku.library.restservice.models.Faculty();
        java.util.Set<com.yorku.library.restservice.models.Request> requestSet1 = faculty0.getRequests();
        faculty0.removeRequest((java.lang.Integer) 0);
        faculty0.setId((java.lang.Integer) 1);
        java.lang.String str6 = faculty0.getStaffNum();
        com.yorku.library.restservice.models.Role role7 = faculty0.getRole();
        java.lang.String str8 = faculty0.getPassword();
        org.junit.Assert.assertNotNull(requestSet1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(role7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        com.yorku.library.restservice.models.Faculty faculty0 = new com.yorku.library.restservice.models.Faculty();
        java.util.Set<com.yorku.library.restservice.models.Request> requestSet1 = faculty0.getRequests();
        faculty0.removeRequest((java.lang.Integer) 0);
        faculty0.setId((java.lang.Integer) 1);
        java.lang.String str6 = faculty0.getStaffNum();
        faculty0.removeRequest((java.lang.Integer) 10);
        java.util.Set<com.yorku.library.restservice.models.Course> courseSet9 = faculty0.getCourses();
        faculty0.setUsername("User [id=null, username=null, pw=null, email=null, requests=[], items=[]]");
        java.lang.String str12 = faculty0.toString();
        org.junit.Assert.assertNotNull(requestSet1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(courseSet9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "User [id=1, username=User [id=null, username=null, pw=null, email=null, requests=[], items=[]], pw=null, email=null, requests=[], items=[]]" + "'", str12, "User [id=1, username=User [id=null, username=null, pw=null, email=null, requests=[], items=[]], pw=null, email=null, requests=[], items=[]]");
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        com.yorku.library.restservice.models.Faculty faculty0 = new com.yorku.library.restservice.models.Faculty();
        java.util.Set<com.yorku.library.restservice.models.Request> requestSet1 = faculty0.getRequests();
        java.util.Set<com.yorku.library.restservice.models.Course> courseSet2 = faculty0.getCourses();
        faculty0.setStaffNum("User [id=1, username=User [id=null, username=null, pw=null, email=null, requests=[], items=[]], pw=null, email=null, requests=[], items=[]]");
        org.junit.Assert.assertNotNull(requestSet1);
        org.junit.Assert.assertNotNull(courseSet2);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        com.yorku.library.restservice.models.Faculty faculty0 = new com.yorku.library.restservice.models.Faculty();
        java.util.Set<com.yorku.library.restservice.models.Request> requestSet1 = faculty0.getRequests();
        faculty0.removeRequest((java.lang.Integer) 0);
        java.lang.String str4 = faculty0.getEmail();
        boolean boolean5 = faculty0.isVerified();
        faculty0.setPassword("hi!");
        faculty0.setVerified(false);
        org.junit.Assert.assertNotNull(requestSet1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        com.yorku.library.restservice.models.Faculty faculty0 = new com.yorku.library.restservice.models.Faculty();
        java.util.Set<com.yorku.library.restservice.models.Request> requestSet1 = faculty0.getRequests();
        java.util.Set<com.yorku.library.restservice.models.Course> courseSet2 = faculty0.getCourses();
        faculty0.setEmail("");
        org.junit.Assert.assertNotNull(requestSet1);
        org.junit.Assert.assertNotNull(courseSet2);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        com.yorku.library.restservice.models.Faculty faculty0 = new com.yorku.library.restservice.models.Faculty();
        java.util.Set<com.yorku.library.restservice.models.Request> requestSet1 = faculty0.getRequests();
        faculty0.removeRequest((java.lang.Integer) 0);
        faculty0.setId((java.lang.Integer) 1);
        java.lang.String str6 = faculty0.getStaffNum();
        faculty0.removeRequest((java.lang.Integer) 10);
        java.util.Set<com.yorku.library.restservice.models.Course> courseSet9 = faculty0.getCourses();
        faculty0.setUsername("User [id=null, username=null, pw=null, email=null, requests=[], items=[]]");
        faculty0.setEmail("");
        org.junit.Assert.assertNotNull(requestSet1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(courseSet9);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        com.yorku.library.restservice.models.Faculty faculty4 = new com.yorku.library.restservice.models.Faculty("hi!", "User [id=null, username=null, pw=null, email=null, requests=[], items=[]]", "hi!", "User [id=1, username=User [id=null, username=null, pw=null, email=null, requests=[], items=[]], pw=null, email=null, requests=[], items=[]]");
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        com.yorku.library.restservice.models.Faculty faculty0 = new com.yorku.library.restservice.models.Faculty();
        java.util.Set<com.yorku.library.restservice.models.Request> requestSet1 = faculty0.getRequests();
        faculty0.removeRequest((java.lang.Integer) 0);
        faculty0.setId((java.lang.Integer) 1);
        java.lang.String str6 = faculty0.getStaffNum();
        faculty0.removeRequest((java.lang.Integer) 10);
        java.util.Set<com.yorku.library.restservice.models.Course> courseSet9 = faculty0.getCourses();
        faculty0.setUsername("User [id=null, username=null, pw=null, email=null, requests=[], items=[]]");
        java.lang.String str12 = faculty0.getUsername();
        org.junit.Assert.assertNotNull(requestSet1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(courseSet9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "User [id=null, username=null, pw=null, email=null, requests=[], items=[]]" + "'", str12, "User [id=null, username=null, pw=null, email=null, requests=[], items=[]]");
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        com.yorku.library.restservice.models.Faculty faculty0 = new com.yorku.library.restservice.models.Faculty();
        java.util.Set<com.yorku.library.restservice.models.Request> requestSet1 = faculty0.getRequests();
        faculty0.removeRequest((java.lang.Integer) 0);
        faculty0.setId((java.lang.Integer) 1);
        java.lang.String str6 = faculty0.getStaffNum();
        faculty0.removeRequest((java.lang.Integer) 10);
        faculty0.setVerified(true);
        faculty0.setId((java.lang.Integer) 0);
        org.junit.Assert.assertNotNull(requestSet1);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        com.yorku.library.restservice.models.Faculty faculty0 = new com.yorku.library.restservice.models.Faculty();
        java.util.Set<com.yorku.library.restservice.models.Request> requestSet1 = faculty0.getRequests();
        faculty0.removeRequest((java.lang.Integer) 0);
        java.lang.String str4 = faculty0.getEmail();
        boolean boolean5 = faculty0.isVerified();
        faculty0.setPassword("");
        org.junit.Assert.assertNotNull(requestSet1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        com.yorku.library.restservice.models.Faculty faculty0 = new com.yorku.library.restservice.models.Faculty();
        java.util.Set<com.yorku.library.restservice.models.Request> requestSet1 = faculty0.getRequests();
        faculty0.removeRequest((java.lang.Integer) 0);
        java.lang.String str4 = faculty0.getEmail();
        faculty0.removeRequest((java.lang.Integer) 0);
        org.junit.Assert.assertNotNull(requestSet1);
        org.junit.Assert.assertNull(str4);
    }
}

