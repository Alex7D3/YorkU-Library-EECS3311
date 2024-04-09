package com.yorku.library.app;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test01");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        com.yorku.library.app.auth.UserAuth userAuth0 = com.yorku.library.app.auth.UserAuth.getInstance();
        java.lang.String str1 = userAuth0.getUsername();
        java.lang.Class<?> wildcardClass2 = userAuth0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userAuth0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        com.yorku.library.app.auth.UserAuth userAuth0 = com.yorku.library.app.auth.UserAuth.getInstance();
        java.lang.Class<?> wildcardClass1 = userAuth0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userAuth0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        com.yorku.library.app.auth.UserAuth userAuth0 = com.yorku.library.app.auth.UserAuth.getInstance();
        userAuth0.setAuthData("", "", "");
        userAuth0.setAuthData("", "hi!", "");
        java.lang.String str9 = userAuth0.getEmail();
        java.lang.String str10 = userAuth0.getUsername();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userAuth0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        com.yorku.library.app.auth.UserAuth userAuth0 = com.yorku.library.app.auth.UserAuth.getInstance();
        java.lang.String str1 = userAuth0.getUsername();
        java.lang.String str2 = userAuth0.getEmail();
        userAuth0.clearAuthData();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userAuth0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        com.yorku.library.app.auth.UserAuth userAuth0 = com.yorku.library.app.auth.UserAuth.getInstance();
        userAuth0.setAuthData("", "", "");
        userAuth0.setAuthData("", "hi!", "");
        java.lang.String str9 = userAuth0.getRole();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userAuth0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        com.yorku.library.app.auth.UserAuth userAuth0 = com.yorku.library.app.auth.UserAuth.getInstance();
        userAuth0.setAuthData("hi!", "hi!", "");
        userAuth0.setAuthData("", "hi!", "");
        java.lang.String str9 = userAuth0.getRole();
        java.lang.Class<?> wildcardClass10 = userAuth0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userAuth0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        com.yorku.library.app.auth.UserAuth userAuth0 = com.yorku.library.app.auth.UserAuth.getInstance();
        userAuth0.setAuthData("", "", "");
        userAuth0.setAuthData("", "hi!", "");
        java.lang.String str9 = userAuth0.getEmail();
        userAuth0.setAuthData("", "", "hi!");
        java.lang.String str14 = userAuth0.getUsername();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userAuth0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        com.yorku.library.app.auth.UserAuth userAuth0 = com.yorku.library.app.auth.UserAuth.getInstance();
        userAuth0.setAuthData("", "", "");
        userAuth0.setAuthData("", "hi!", "");
        java.lang.String str9 = userAuth0.getEmail();
        java.lang.String str10 = userAuth0.getRole();
        java.lang.String str11 = userAuth0.getUsername();
        java.lang.String str12 = userAuth0.getEmail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userAuth0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        com.yorku.library.app.auth.UserAuth userAuth0 = com.yorku.library.app.auth.UserAuth.getInstance();
        userAuth0.setAuthData("", "", "");
        java.lang.String str5 = userAuth0.getRole();
        java.lang.String str6 = userAuth0.getRole();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userAuth0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        com.yorku.library.app.auth.UserAuth userAuth0 = com.yorku.library.app.auth.UserAuth.getInstance();
        userAuth0.setAuthData("", "", "");
        userAuth0.setAuthData("", "hi!", "");
        java.lang.String str9 = userAuth0.getEmail();
        userAuth0.setAuthData("", "", "hi!");
        userAuth0.clearAuthData();
        java.lang.String str15 = userAuth0.getRole();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userAuth0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        com.yorku.library.app.auth.UserAuth userAuth0 = com.yorku.library.app.auth.UserAuth.getInstance();
        userAuth0.setAuthData("hi!", "hi!", "");
        userAuth0.setAuthData("", "hi!", "");
        java.lang.String str9 = userAuth0.getRole();
        userAuth0.clearAuthData();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userAuth0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        com.yorku.library.app.auth.UserAuth userAuth0 = com.yorku.library.app.auth.UserAuth.getInstance();
        userAuth0.setAuthData("", "", "");
        userAuth0.setAuthData("", "hi!", "");
        java.lang.String str9 = userAuth0.getEmail();
        java.lang.String str10 = userAuth0.getRole();
        java.lang.Class<?> wildcardClass11 = userAuth0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userAuth0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        com.yorku.library.app.auth.UserAuth userAuth0 = com.yorku.library.app.auth.UserAuth.getInstance();
        java.lang.String str1 = userAuth0.getUsername();
        java.lang.String str2 = userAuth0.getUsername();
        userAuth0.setAuthData("hi!", "", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userAuth0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        com.yorku.library.app.auth.UserAuth userAuth0 = com.yorku.library.app.auth.UserAuth.getInstance();
        userAuth0.setAuthData("", "", "");
        userAuth0.setAuthData("", "hi!", "");
        java.lang.String str9 = userAuth0.getEmail();
        java.lang.String str10 = userAuth0.getRole();
        java.lang.String str11 = userAuth0.getUsername();
        userAuth0.clearAuthData();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userAuth0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        com.yorku.library.app.auth.UserAuth userAuth0 = com.yorku.library.app.auth.UserAuth.getInstance();
        userAuth0.setAuthData("", "", "");
        userAuth0.setAuthData("", "hi!", "");
        java.lang.String str9 = userAuth0.getEmail();
        userAuth0.setAuthData("", "", "hi!");
        java.lang.String str14 = userAuth0.getEmail();
        java.lang.String str15 = userAuth0.getUsername();
        java.lang.Class<?> wildcardClass16 = userAuth0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userAuth0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        com.yorku.library.app.auth.UserAuth userAuth0 = com.yorku.library.app.auth.UserAuth.getInstance();
        userAuth0.setAuthData("hi!", "hi!", "");
        userAuth0.setAuthData("", "hi!", "");
        java.lang.Class<?> wildcardClass9 = userAuth0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userAuth0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        com.yorku.library.app.auth.UserAuth userAuth0 = com.yorku.library.app.auth.UserAuth.getInstance();
        userAuth0.setAuthData("", "", "");
        userAuth0.setAuthData("", "hi!", "");
        java.lang.String str9 = userAuth0.getEmail();
        java.lang.String str10 = userAuth0.getRole();
        java.lang.String str11 = userAuth0.getUsername();
        java.lang.Class<?> wildcardClass12 = userAuth0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userAuth0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        com.yorku.library.app.auth.UserAuth userAuth0 = com.yorku.library.app.auth.UserAuth.getInstance();
        userAuth0.setAuthData("", "", "");
        userAuth0.setAuthData("", "hi!", "");
        java.lang.Class<?> wildcardClass9 = userAuth0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userAuth0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        com.yorku.library.app.auth.UserAuth userAuth0 = com.yorku.library.app.auth.UserAuth.getInstance();
        java.lang.String str1 = userAuth0.getUsername();
        java.lang.String str2 = userAuth0.getUsername();
        userAuth0.clearAuthData();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userAuth0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        com.yorku.library.app.auth.UserAuth userAuth0 = com.yorku.library.app.auth.UserAuth.getInstance();
        userAuth0.setAuthData("", "", "");
        userAuth0.setAuthData("", "hi!", "");
        java.lang.String str9 = userAuth0.getEmail();
        java.lang.String str10 = userAuth0.getRole();
        java.lang.String str11 = userAuth0.getUsername();
        java.lang.String str12 = userAuth0.getRole();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userAuth0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        com.yorku.library.app.auth.UserAuth userAuth0 = com.yorku.library.app.auth.UserAuth.getInstance();
        userAuth0.setAuthData("hi!", "hi!", "");
        userAuth0.setAuthData("", "hi!", "");
        java.lang.String str9 = userAuth0.getEmail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userAuth0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        com.yorku.library.app.auth.UserAuth userAuth0 = com.yorku.library.app.auth.UserAuth.getInstance();
        userAuth0.setAuthData("", "", "");
        userAuth0.setAuthData("", "hi!", "");
        java.lang.String str9 = userAuth0.getEmail();
        userAuth0.setAuthData("", "", "hi!");
        java.lang.String str14 = userAuth0.getEmail();
        java.lang.String str15 = userAuth0.getUsername();
        userAuth0.clearAuthData();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userAuth0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        com.yorku.library.app.auth.UserAuth userAuth0 = com.yorku.library.app.auth.UserAuth.getInstance();
        java.lang.String str1 = userAuth0.getUsername();
        java.lang.String str2 = userAuth0.getEmail();
        java.lang.String str3 = userAuth0.getUsername();
        java.lang.String str4 = userAuth0.getUsername();
        userAuth0.setAuthData("hi!", "", "hi!");
        userAuth0.clearAuthData();
        java.lang.Class<?> wildcardClass10 = userAuth0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userAuth0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        com.yorku.library.app.auth.UserAuth userAuth0 = com.yorku.library.app.auth.UserAuth.getInstance();
        userAuth0.setAuthData("hi!", "hi!", "");
        java.lang.String str5 = userAuth0.getEmail();
        userAuth0.setAuthData("", "hi!", "");
        java.lang.String str10 = userAuth0.getUsername();
        java.lang.Class<?> wildcardClass11 = userAuth0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userAuth0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        com.yorku.library.app.auth.UserAuth userAuth0 = com.yorku.library.app.auth.UserAuth.getInstance();
        userAuth0.setAuthData("hi!", "hi!", "");
        java.lang.String str5 = userAuth0.getEmail();
        userAuth0.setAuthData("", "hi!", "");
        java.lang.String str10 = userAuth0.getUsername();
        java.lang.String str11 = userAuth0.getRole();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userAuth0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
    }
}

