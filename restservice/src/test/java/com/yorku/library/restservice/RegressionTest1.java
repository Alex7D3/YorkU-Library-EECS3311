package com.yorku.library.restservice;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test01");
        com.yorku.library.restservice.models.Course course0 = new com.yorku.library.restservice.models.Course();
        java.lang.Integer int1 = course0.getId();
        java.util.Set<com.yorku.library.restservice.models.TextBook> textBookSet2 = course0.getTextbooks();
        java.lang.Class<?> wildcardClass3 = course0.getClass();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNotNull(textBookSet2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        com.yorku.library.restservice.models.Course course0 = new com.yorku.library.restservice.models.Course();
        java.lang.Integer int1 = course0.getId();
        java.util.Set<com.yorku.library.restservice.models.TextBook> textBookSet2 = course0.getTextbooks();
        com.yorku.library.restservice.models.TextBook textBook3 = null;
        // The following exception was thrown during execution in test generation
        try {
            course0.addBook(textBook3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.library.restservice.models.TextBook.setCourse(com.yorku.library.restservice.models.Course)\" because \"book\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNotNull(textBookSet2);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        com.yorku.library.restservice.models.Course course0 = new com.yorku.library.restservice.models.Course();
        com.yorku.library.restservice.models.TextBook textBook1 = null;
        // The following exception was thrown during execution in test generation
        try {
            course0.addBook(textBook1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.library.restservice.models.TextBook.setCourse(com.yorku.library.restservice.models.Course)\" because \"book\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        com.yorku.library.restservice.models.Course course0 = new com.yorku.library.restservice.models.Course();
        java.lang.Integer int1 = course0.getId();
        java.util.Set<com.yorku.library.restservice.models.TextBook> textBookSet2 = course0.getTextbooks();
        java.lang.Integer int3 = course0.getId();
        com.yorku.library.restservice.models.TextBook textBook4 = null;
        // The following exception was thrown during execution in test generation
        try {
            course0.addBook(textBook4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.library.restservice.models.TextBook.setCourse(com.yorku.library.restservice.models.Course)\" because \"book\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNotNull(textBookSet2);
        org.junit.Assert.assertNull(int3);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        com.yorku.library.restservice.models.Course course0 = new com.yorku.library.restservice.models.Course();
        java.lang.Integer int1 = course0.getId();
        java.util.Set<com.yorku.library.restservice.models.TextBook> textBookSet2 = course0.getTextbooks();
        java.lang.Integer int3 = course0.getId();
        java.sql.Date date4 = null;
        course0.setEndDate(date4);
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNotNull(textBookSet2);
        org.junit.Assert.assertNull(int3);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        com.yorku.library.restservice.models.Course course0 = new com.yorku.library.restservice.models.Course();
        java.lang.Integer int1 = course0.getId();
        java.lang.Class<?> wildcardClass2 = course0.getClass();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        com.yorku.library.restservice.models.Course course0 = new com.yorku.library.restservice.models.Course();
        java.lang.Integer int1 = course0.getId();
        java.lang.String str2 = course0.toString();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Course [id=null, courseTitle=null, courseCode=null, endDate=null, textbooks=[]]" + "'", str2, "Course [id=null, courseTitle=null, courseCode=null, endDate=null, textbooks=[]]");
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        com.yorku.library.restservice.models.Course course0 = new com.yorku.library.restservice.models.Course();
        java.lang.Integer int1 = course0.getId();
        java.util.Set<com.yorku.library.restservice.models.TextBook> textBookSet2 = course0.getTextbooks();
        java.lang.Integer int3 = course0.getId();
        java.sql.Date date4 = course0.getEndDate();
        course0.removeBook((java.lang.Integer) 1);
        course0.setCourseCode("");
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNotNull(textBookSet2);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNull(date4);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        com.yorku.library.restservice.models.Course course0 = new com.yorku.library.restservice.models.Course();
        java.lang.Integer int1 = course0.getId();
        java.util.Set<com.yorku.library.restservice.models.TextBook> textBookSet2 = course0.getTextbooks();
        java.lang.Integer int3 = course0.getId();
        java.sql.Date date4 = course0.getEndDate();
        course0.setCourseCode("");
        com.yorku.library.restservice.models.User user7 = null;
        // The following exception was thrown during execution in test generation
        try {
            course0.addUser(user7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.library.restservice.models.User.getCourses()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNotNull(textBookSet2);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNull(date4);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        com.yorku.library.restservice.models.Course course0 = new com.yorku.library.restservice.models.Course();
        java.lang.Integer int1 = course0.getId();
        java.util.Set<com.yorku.library.restservice.models.TextBook> textBookSet2 = course0.getTextbooks();
        java.lang.Integer int3 = course0.getId();
        java.sql.Date date4 = course0.getEndDate();
        java.lang.Class<?> wildcardClass5 = course0.getClass();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNotNull(textBookSet2);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNull(date4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        com.yorku.library.restservice.models.Course course0 = new com.yorku.library.restservice.models.Course();
        java.lang.Integer int1 = course0.getId();
        java.util.Set<com.yorku.library.restservice.models.TextBook> textBookSet2 = course0.getTextbooks();
        java.lang.Integer int3 = course0.getId();
        course0.removeUser((java.lang.Integer) 10);
        java.lang.String str6 = course0.getCourseTitle();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNotNull(textBookSet2);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        com.yorku.library.restservice.models.Course course0 = new com.yorku.library.restservice.models.Course();
        java.lang.Integer int1 = course0.getId();
        java.util.Set<com.yorku.library.restservice.models.TextBook> textBookSet2 = course0.getTextbooks();
        java.lang.Integer int3 = course0.getId();
        java.sql.Date date4 = course0.getEndDate();
        course0.removeBook((java.lang.Integer) 1);
        com.yorku.library.restservice.models.User user7 = null;
        // The following exception was thrown during execution in test generation
        try {
            course0.addUser(user7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.library.restservice.models.User.getCourses()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNotNull(textBookSet2);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNull(date4);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        com.yorku.library.restservice.models.Course course0 = new com.yorku.library.restservice.models.Course();
        java.lang.Integer int1 = course0.getId();
        java.util.Set<com.yorku.library.restservice.models.TextBook> textBookSet2 = course0.getTextbooks();
        java.lang.Integer int3 = course0.getId();
        java.sql.Date date4 = course0.getEndDate();
        course0.setCourseCode("");
        java.sql.Date date7 = null;
        course0.setEndDate(date7);
        com.yorku.library.restservice.models.User user9 = null;
        // The following exception was thrown during execution in test generation
        try {
            course0.addUser(user9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.library.restservice.models.User.getCourses()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNotNull(textBookSet2);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNull(date4);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        com.yorku.library.restservice.models.Course course0 = new com.yorku.library.restservice.models.Course();
        java.lang.Integer int1 = course0.getId();
        java.util.Set<com.yorku.library.restservice.models.TextBook> textBookSet2 = course0.getTextbooks();
        java.lang.Integer int3 = course0.getId();
        java.sql.Date date4 = course0.getEndDate();
        course0.setCourseCode("");
        java.sql.Date date7 = null;
        course0.setEndDate(date7);
        course0.removeBook((java.lang.Integer) 100);
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNotNull(textBookSet2);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNull(date4);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        com.yorku.library.restservice.models.Course course0 = new com.yorku.library.restservice.models.Course();
        java.lang.Integer int1 = course0.getId();
        java.util.Set<com.yorku.library.restservice.models.TextBook> textBookSet2 = course0.getTextbooks();
        java.sql.Date date3 = course0.getEndDate();
        course0.setCourseTitle("");
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNotNull(textBookSet2);
        org.junit.Assert.assertNull(date3);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        com.yorku.library.restservice.models.Course course0 = new com.yorku.library.restservice.models.Course();
        java.lang.String str1 = course0.getCourseCode();
        course0.removeBook((java.lang.Integer) 1);
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        com.yorku.library.restservice.models.Course course0 = new com.yorku.library.restservice.models.Course();
        java.lang.Integer int1 = course0.getId();
        java.util.Set<com.yorku.library.restservice.models.TextBook> textBookSet2 = course0.getTextbooks();
        java.lang.Integer int3 = course0.getId();
        java.sql.Date date4 = course0.getEndDate();
        course0.setCourseCode("");
        course0.setId((java.lang.Integer) 0);
        course0.setId((java.lang.Integer) 0);
        java.lang.String str11 = course0.getCourseTitle();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNotNull(textBookSet2);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNull(date4);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        com.yorku.library.restservice.models.Course course0 = new com.yorku.library.restservice.models.Course();
        java.lang.Integer int1 = course0.getId();
        java.util.Set<com.yorku.library.restservice.models.TextBook> textBookSet2 = course0.getTextbooks();
        java.lang.Integer int3 = course0.getId();
        java.sql.Date date4 = course0.getEndDate();
        course0.setCourseCode("");
        course0.setCourseCode("Course [id=null, courseTitle=null, courseCode=null, endDate=null, textbooks=[]]");
        course0.removeUser((java.lang.Integer) (-1));
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNotNull(textBookSet2);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNull(date4);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        com.yorku.library.restservice.models.Course course0 = new com.yorku.library.restservice.models.Course();
        java.lang.Integer int1 = course0.getId();
        java.util.Set<com.yorku.library.restservice.models.TextBook> textBookSet2 = course0.getTextbooks();
        java.lang.Integer int3 = course0.getId();
        java.sql.Date date4 = course0.getEndDate();
        course0.removeUser((java.lang.Integer) 10);
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNotNull(textBookSet2);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNull(date4);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        com.yorku.library.restservice.models.Course course0 = new com.yorku.library.restservice.models.Course();
        java.lang.Integer int1 = course0.getId();
        java.util.Set<com.yorku.library.restservice.models.TextBook> textBookSet2 = course0.getTextbooks();
        java.sql.Date date3 = course0.getEndDate();
        course0.setCourseCode("hi!");
        java.lang.String str6 = course0.getCourseTitle();
        java.lang.String str7 = course0.toString();
        course0.removeBook((java.lang.Integer) 100);
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNotNull(textBookSet2);
        org.junit.Assert.assertNull(date3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Course [id=null, courseTitle=null, courseCode=hi!, endDate=null, textbooks=[]]" + "'", str7, "Course [id=null, courseTitle=null, courseCode=hi!, endDate=null, textbooks=[]]");
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        com.yorku.library.restservice.models.Course course0 = new com.yorku.library.restservice.models.Course();
        java.lang.Integer int1 = course0.getId();
        java.util.Set<com.yorku.library.restservice.models.TextBook> textBookSet2 = course0.getTextbooks();
        java.lang.Integer int3 = course0.getId();
        java.util.Set<com.yorku.library.restservice.models.TextBook> textBookSet4 = course0.getTextbooks();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNotNull(textBookSet2);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNotNull(textBookSet4);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        com.yorku.library.restservice.models.Course course0 = new com.yorku.library.restservice.models.Course();
        java.lang.Integer int1 = course0.getId();
        java.util.Set<com.yorku.library.restservice.models.TextBook> textBookSet2 = course0.getTextbooks();
        java.sql.Date date3 = course0.getEndDate();
        course0.setCourseCode("hi!");
        java.lang.String str6 = course0.getCourseTitle();
        java.lang.String str7 = course0.toString();
        java.lang.String str8 = course0.getCourseCode();
        java.sql.Date date9 = null;
        course0.setEndDate(date9);
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNotNull(textBookSet2);
        org.junit.Assert.assertNull(date3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Course [id=null, courseTitle=null, courseCode=hi!, endDate=null, textbooks=[]]" + "'", str7, "Course [id=null, courseTitle=null, courseCode=hi!, endDate=null, textbooks=[]]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        com.yorku.library.restservice.models.Course course0 = new com.yorku.library.restservice.models.Course();
        java.lang.Integer int1 = course0.getId();
        java.util.Set<com.yorku.library.restservice.models.TextBook> textBookSet2 = course0.getTextbooks();
        java.sql.Date date3 = course0.getEndDate();
        course0.setCourseCode("hi!");
        java.sql.Date date6 = course0.getEndDate();
        java.lang.String str7 = course0.toString();
        java.lang.String str8 = course0.getCourseCode();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNotNull(textBookSet2);
        org.junit.Assert.assertNull(date3);
        org.junit.Assert.assertNull(date6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Course [id=null, courseTitle=null, courseCode=hi!, endDate=null, textbooks=[]]" + "'", str7, "Course [id=null, courseTitle=null, courseCode=hi!, endDate=null, textbooks=[]]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        com.yorku.library.restservice.models.Course course0 = new com.yorku.library.restservice.models.Course();
        java.sql.Date date1 = null;
        course0.setEndDate(date1);
        java.lang.String str3 = course0.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Course [id=null, courseTitle=null, courseCode=null, endDate=null, textbooks=[]]" + "'", str3, "Course [id=null, courseTitle=null, courseCode=null, endDate=null, textbooks=[]]");
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        com.yorku.library.restservice.models.Course course0 = new com.yorku.library.restservice.models.Course();
        java.lang.Integer int1 = course0.getId();
        java.util.Set<com.yorku.library.restservice.models.TextBook> textBookSet2 = course0.getTextbooks();
        java.sql.Date date3 = course0.getEndDate();
        course0.setCourseCode("hi!");
        course0.setCourseTitle("");
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNotNull(textBookSet2);
        org.junit.Assert.assertNull(date3);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        com.yorku.library.restservice.models.Course course0 = new com.yorku.library.restservice.models.Course();
        java.lang.Integer int1 = course0.getId();
        java.util.Set<com.yorku.library.restservice.models.TextBook> textBookSet2 = course0.getTextbooks();
        java.lang.Integer int3 = course0.getId();
        java.sql.Date date4 = course0.getEndDate();
        java.lang.Integer int5 = course0.getId();
        java.lang.String str6 = course0.getCourseTitle();
        course0.setCourseCode("Course [id=null, courseTitle=null, courseCode=hi!, endDate=null, textbooks=[]]");
        java.lang.Integer int9 = course0.getId();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNotNull(textBookSet2);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNull(date4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(int9);
    }
}

