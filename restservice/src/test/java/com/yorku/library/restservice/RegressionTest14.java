package com.yorku.library.restservice;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest14 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test01");
        com.yorku.library.restservice.models.Visitor visitor3 = new com.yorku.library.restservice.models.Visitor("", "hi!", "");
        java.util.Set<com.yorku.library.restservice.models.Request> requestSet4 = visitor3.getRequests();
        boolean boolean5 = visitor3.isVerified();
        java.lang.Class<?> wildcardClass6 = visitor3.getClass();
        org.junit.Assert.assertNotNull(requestSet4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        com.yorku.library.restservice.models.Visitor visitor3 = new com.yorku.library.restservice.models.Visitor("", "hi!", "");
        com.yorku.library.restservice.models.Request request4 = null;
        // The following exception was thrown during execution in test generation
        try {
            visitor3.addRequest(request4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.library.restservice.models.Request.setUser(com.yorku.library.restservice.models.User)\" because \"req\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        com.yorku.library.restservice.models.Visitor visitor3 = new com.yorku.library.restservice.models.Visitor("", "hi!", "");
        java.util.Set<com.yorku.library.restservice.models.Request> requestSet4 = visitor3.getRequests();
        visitor3.setEmail("");
        visitor3.setId((java.lang.Integer) 0);
        org.junit.Assert.assertNotNull(requestSet4);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        com.yorku.library.restservice.models.Visitor visitor3 = new com.yorku.library.restservice.models.Visitor("", "hi!", "");
        java.util.Set<com.yorku.library.restservice.models.Request> requestSet4 = visitor3.getRequests();
        boolean boolean5 = visitor3.isVerified();
        visitor3.setEmail("");
        org.junit.Assert.assertNotNull(requestSet4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        com.yorku.library.restservice.models.Visitor visitor3 = new com.yorku.library.restservice.models.Visitor("", "hi!", "");
        visitor3.setPassword("");
        com.yorku.library.restservice.models.Role role6 = visitor3.getRole();
        org.junit.Assert.assertTrue("'" + role6 + "' != '" + com.yorku.library.restservice.models.Role.VISITOR + "'", role6.equals(com.yorku.library.restservice.models.Role.VISITOR));
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        com.yorku.library.restservice.models.Visitor visitor3 = new com.yorku.library.restservice.models.Visitor("", "hi!", "");
        visitor3.setPassword("");
        visitor3.setPassword("hi!");
        java.lang.String str8 = visitor3.getPassword();
        java.lang.String str9 = visitor3.toString();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "User [id=null, username=, pw=hi!, email=, requests=[], items=[]]" + "'", str9, "User [id=null, username=, pw=hi!, email=, requests=[], items=[]]");
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        com.yorku.library.restservice.models.Visitor visitor3 = new com.yorku.library.restservice.models.Visitor("", "hi!", "");
        java.lang.Integer int4 = visitor3.getId();
        org.junit.Assert.assertNull(int4);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        com.yorku.library.restservice.models.Visitor visitor3 = new com.yorku.library.restservice.models.Visitor("", "hi!", "");
        java.util.Set<com.yorku.library.restservice.models.Request> requestSet4 = visitor3.getRequests();
        visitor3.setEmail("hi!");
        java.lang.Integer int7 = visitor3.getId();
        java.util.Set<com.yorku.library.restservice.models.UserItem> userItemSet8 = visitor3.getItems();
        visitor3.setPassword("hi!");
        org.junit.Assert.assertNotNull(requestSet4);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNotNull(userItemSet8);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        com.yorku.library.restservice.models.Visitor visitor3 = new com.yorku.library.restservice.models.Visitor("", "hi!", "");
        java.util.Set<com.yorku.library.restservice.models.Request> requestSet4 = visitor3.getRequests();
        boolean boolean5 = visitor3.isVerified();
        com.yorku.library.restservice.models.Role role6 = null;
        visitor3.setRole(role6);
        visitor3.removeRequest((java.lang.Integer) 100);
        java.lang.Class<?> wildcardClass10 = visitor3.getClass();
        org.junit.Assert.assertNotNull(requestSet4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        com.yorku.library.restservice.models.Visitor visitor0 = new com.yorku.library.restservice.models.Visitor();
        java.util.Set<com.yorku.library.restservice.models.Request> requestSet1 = visitor0.getRequests();
        org.junit.Assert.assertNotNull(requestSet1);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        com.yorku.library.restservice.models.Visitor visitor3 = new com.yorku.library.restservice.models.Visitor("", "hi!", "");
        java.util.Set<com.yorku.library.restservice.models.Request> requestSet4 = visitor3.getRequests();
        visitor3.setEmail("");
        java.util.Set<com.yorku.library.restservice.models.Request> requestSet7 = visitor3.getRequests();
        visitor3.setId((java.lang.Integer) 0);
        java.util.Set<com.yorku.library.restservice.models.Request> requestSet10 = visitor3.getRequests();
        java.util.Set<com.yorku.library.restservice.models.Request> requestSet11 = visitor3.getRequests();
        org.junit.Assert.assertNotNull(requestSet4);
        org.junit.Assert.assertNotNull(requestSet7);
        org.junit.Assert.assertNotNull(requestSet10);
        org.junit.Assert.assertNotNull(requestSet11);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        com.yorku.library.restservice.models.Visitor visitor3 = new com.yorku.library.restservice.models.Visitor("", "hi!", "");
        java.util.Set<com.yorku.library.restservice.models.Request> requestSet4 = visitor3.getRequests();
        visitor3.setEmail("");
        java.util.Set<com.yorku.library.restservice.models.UserItem> userItemSet7 = visitor3.getItems();
        org.junit.Assert.assertNotNull(requestSet4);
        org.junit.Assert.assertNotNull(userItemSet7);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        com.yorku.library.restservice.models.Visitor visitor3 = new com.yorku.library.restservice.models.Visitor("", "hi!", "");
        java.util.Set<com.yorku.library.restservice.models.Request> requestSet4 = visitor3.getRequests();
        visitor3.setEmail("hi!");
        java.lang.Integer int7 = visitor3.getId();
        visitor3.setUsername("");
        org.junit.Assert.assertNotNull(requestSet4);
        org.junit.Assert.assertNull(int7);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        com.yorku.library.restservice.models.Visitor visitor3 = new com.yorku.library.restservice.models.Visitor("", "hi!", "");
        visitor3.setPassword("");
        visitor3.setPassword("hi!");
        java.lang.String str8 = visitor3.getPassword();
        visitor3.removeRequest((java.lang.Integer) 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        com.yorku.library.restservice.models.Visitor visitor3 = new com.yorku.library.restservice.models.Visitor("", "hi!", "");
        java.util.Set<com.yorku.library.restservice.models.Request> requestSet4 = visitor3.getRequests();
        visitor3.setEmail("");
        java.util.Set<com.yorku.library.restservice.models.Request> requestSet7 = visitor3.getRequests();
        visitor3.setId((java.lang.Integer) 0);
        java.util.Set<com.yorku.library.restservice.models.Request> requestSet10 = visitor3.getRequests();
        visitor3.setPassword("");
        org.junit.Assert.assertNotNull(requestSet4);
        org.junit.Assert.assertNotNull(requestSet7);
        org.junit.Assert.assertNotNull(requestSet10);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        com.yorku.library.restservice.models.Visitor visitor3 = new com.yorku.library.restservice.models.Visitor("", "hi!", "");
        visitor3.setPassword("");
        java.lang.String str6 = visitor3.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "User [id=null, username=, pw=, email=, requests=[], items=[]]" + "'", str6, "User [id=null, username=, pw=, email=, requests=[], items=[]]");
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        com.yorku.library.restservice.models.Visitor visitor3 = new com.yorku.library.restservice.models.Visitor("", "hi!", "");
        java.util.Set<com.yorku.library.restservice.models.Request> requestSet4 = visitor3.getRequests();
        visitor3.setUsername("hi!");
        visitor3.removeRequest((java.lang.Integer) 100);
        org.junit.Assert.assertNotNull(requestSet4);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        com.yorku.library.restservice.models.Visitor visitor3 = new com.yorku.library.restservice.models.Visitor("", "hi!", "");
        java.util.Set<com.yorku.library.restservice.models.Request> requestSet4 = visitor3.getRequests();
        visitor3.setEmail("");
        visitor3.setPassword("");
        org.junit.Assert.assertNotNull(requestSet4);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        com.yorku.library.restservice.models.Visitor visitor3 = new com.yorku.library.restservice.models.Visitor("", "hi!", "");
        java.util.Set<com.yorku.library.restservice.models.Request> requestSet4 = visitor3.getRequests();
        boolean boolean5 = visitor3.isVerified();
        visitor3.setVerified(true);
        org.junit.Assert.assertNotNull(requestSet4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        com.yorku.library.restservice.models.Visitor visitor3 = new com.yorku.library.restservice.models.Visitor("", "hi!", "");
        visitor3.setPassword("");
        visitor3.setPassword("");
        java.lang.String str8 = visitor3.getUsername();
        java.lang.String str9 = visitor3.getEmail();
        visitor3.setPassword("");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        com.yorku.library.restservice.models.Visitor visitor3 = new com.yorku.library.restservice.models.Visitor("", "hi!", "");
        boolean boolean4 = visitor3.isVerified();
        java.lang.String str5 = visitor3.getPassword();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        com.yorku.library.restservice.models.Visitor visitor3 = new com.yorku.library.restservice.models.Visitor("hi!", "User [id=null, username=, pw=hi!, email=, requests=[], items=[]]", "");
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        com.yorku.library.restservice.models.Visitor visitor3 = new com.yorku.library.restservice.models.Visitor("", "hi!", "");
        java.util.Set<com.yorku.library.restservice.models.Request> requestSet4 = visitor3.getRequests();
        visitor3.setEmail("");
        java.util.Set<com.yorku.library.restservice.models.Request> requestSet7 = visitor3.getRequests();
        visitor3.setId((java.lang.Integer) 0);
        visitor3.removeRequest((java.lang.Integer) 1);
        org.junit.Assert.assertNotNull(requestSet4);
        org.junit.Assert.assertNotNull(requestSet7);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        com.yorku.library.restservice.models.Visitor visitor3 = new com.yorku.library.restservice.models.Visitor("User [id=null, username=, pw=hi!, email=, requests=[], items=[]]", "User [id=null, username=, pw=hi!, email=, requests=[], items=[]]", "hi!");
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        com.yorku.library.restservice.models.Visitor visitor3 = new com.yorku.library.restservice.models.Visitor("User [id=null, username=, pw=, email=, requests=[], items=[]]", "User [id=null, username=, pw=, email=, requests=[], items=[]]", "User [id=null, username=, pw=, email=, requests=[], items=[]]");
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        com.yorku.library.restservice.models.Visitor visitor3 = new com.yorku.library.restservice.models.Visitor("", "hi!", "");
        java.util.Set<com.yorku.library.restservice.models.Request> requestSet4 = visitor3.getRequests();
        visitor3.setEmail("");
        boolean boolean7 = visitor3.isVerified();
        java.util.Set<com.yorku.library.restservice.models.Request> requestSet8 = visitor3.getRequests();
        visitor3.setPassword("");
        visitor3.setPassword("User [id=null, username=, pw=hi!, email=, requests=[], items=[]]");
        org.junit.Assert.assertNotNull(requestSet4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(requestSet8);
    }
}

