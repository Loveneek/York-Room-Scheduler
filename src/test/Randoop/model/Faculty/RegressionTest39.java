import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest39 {

    public static boolean debug = false;

    public void assertBooleanArrayEquals(boolean[] expectedArray, boolean[] actualArray) {
        if (expectedArray.length != actualArray.length) {
            throw new AssertionError("Array lengths differ: " + expectedArray.length + " != " + actualArray.length);
        }
        for (int i = 0; i < expectedArray.length; i++) {
            if (expectedArray[i] != actualArray[i]) {
                throw new AssertionError("Arrays differ at index " + i + ": " + expectedArray[i] + " != " + actualArray[i]);
            }
        }
    }

    @Test
    public void test19501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19501");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        java.lang.String str7 = faculty3.getID();
        double double8 = faculty3.getHourlyRate();
        boolean boolean9 = faculty3.isVerified();
        boolean boolean10 = faculty3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test19502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19502");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getAccountType();
        faculty3.logout();
        java.lang.String str8 = faculty3.getEmail();
        faculty3.viewProfile();
        boolean boolean10 = faculty3.isVerified();
        faculty3.viewProfile();
        java.lang.String str12 = faculty3.getID();
        java.lang.String str13 = faculty3.getAccountType();
        faculty3.viewProfile();
        faculty3.viewProfile();
        java.lang.String str16 = faculty3.getPassword();
        java.lang.String str17 = faculty3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "faculty" + "'", str13, "faculty");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test19503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19503");
        model.Faculty faculty3 = new model.Faculty("hi!", "faculty", "");
        java.lang.String str4 = faculty3.getEmail();
        faculty3.logout();
        java.lang.String str6 = faculty3.getID();
        boolean boolean7 = faculty3.isVerified();
        java.lang.String str8 = faculty3.getAccountType();
        faculty3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "faculty" + "'", str8, "faculty");
    }

    @Test
    public void test19504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19504");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        faculty3.setVerified(false);
        faculty3.viewProfile();
        java.lang.String str7 = faculty3.getEmail();
        faculty3.login("hi!", "hi!");
        java.lang.String str11 = faculty3.getEmail();
        java.lang.Class<?> wildcardClass12 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test19505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19505");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        faculty3.setVerified(false);
        java.lang.String str6 = faculty3.getEmail();
        faculty3.setVerified(false);
        faculty3.login("faculty", "hi!");
        java.lang.String str12 = faculty3.getPassword();
        java.lang.String str13 = faculty3.getPassword();
        java.lang.String str14 = faculty3.getPassword();
        faculty3.logout();
        java.lang.String str16 = faculty3.getID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test19506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19506");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getAccountType();
        faculty3.logout();
        double double8 = faculty3.getHourlyRate();
        java.lang.String str9 = faculty3.getEmail();
        java.lang.String str10 = faculty3.getAccountType();
        faculty3.setVerified(true);
        faculty3.login("hi!", "");
        java.lang.String str16 = faculty3.getAccountType();
        faculty3.logout();
        faculty3.login("hi!", "hi!");
        boolean boolean21 = faculty3.isVerified();
        faculty3.viewProfile();
        java.lang.String str23 = faculty3.getEmail();
        faculty3.login("faculty", "hi!");
        faculty3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "faculty" + "'", str10, "faculty");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "faculty" + "'", str16, "faculty");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test19507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19507");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        faculty3.setVerified(false);
        boolean boolean9 = faculty3.isVerified();
        java.lang.String str10 = faculty3.getAccountType();
        faculty3.setVerified(false);
        faculty3.login("faculty", "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "faculty" + "'", str10, "faculty");
    }

    @Test
    public void test19508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19508");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        faculty3.setVerified(false);
        java.lang.String str9 = faculty3.getID();
        java.lang.String str10 = faculty3.getAccountType();
        double double11 = faculty3.getHourlyRate();
        java.lang.String str12 = faculty3.getPassword();
        faculty3.login("faculty", "");
        faculty3.login("faculty", "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "faculty" + "'", str10, "faculty");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 30.0d + "'", double11 == 30.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test19509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19509");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        java.lang.String str7 = faculty3.getID();
        java.lang.String str8 = faculty3.getEmail();
        faculty3.login("", "");
        java.lang.String str12 = faculty3.getAccountType();
        faculty3.viewProfile();
        boolean boolean14 = faculty3.isVerified();
        faculty3.viewProfile();
        double double16 = faculty3.getHourlyRate();
        faculty3.login("hi!", "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "faculty" + "'", str12, "faculty");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 30.0d + "'", double16 == 30.0d);
    }

    @Test
    public void test19510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19510");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        java.lang.String str7 = faculty3.getID();
        faculty3.setVerified(true);
        java.lang.String str10 = faculty3.getEmail();
        faculty3.setVerified(true);
        java.lang.String str13 = faculty3.getAccountType();
        java.lang.String str14 = faculty3.getPassword();
        java.lang.String str15 = faculty3.getEmail();
        java.lang.String str16 = faculty3.getPassword();
        java.lang.String str17 = faculty3.getEmail();
        faculty3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "faculty" + "'", str13, "faculty");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test19511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19511");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        faculty3.login("", "");
        faculty3.viewProfile();
        faculty3.viewProfile();
        faculty3.login("", "");
        java.lang.String str12 = faculty3.getEmail();
        java.lang.String str13 = faculty3.getEmail();
        faculty3.logout();
        java.lang.String str15 = faculty3.getEmail();
        java.lang.String str16 = faculty3.getID();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test19512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19512");
        model.Faculty faculty3 = new model.Faculty("faculty", "hi!", "");
        faculty3.login("hi!", "hi!");
        faculty3.logout();
        faculty3.setVerified(false);
        java.lang.String str10 = faculty3.getPassword();
        java.lang.String str11 = faculty3.getID();
        faculty3.login("faculty", "faculty");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test19513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19513");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        double double6 = faculty3.getHourlyRate();
        java.lang.String str7 = faculty3.getPassword();
        java.lang.String str8 = faculty3.getPassword();
        java.lang.String str9 = faculty3.getAccountType();
        faculty3.viewProfile();
        java.lang.String str11 = faculty3.getEmail();
        faculty3.logout();
        java.lang.String str13 = faculty3.getID();
        faculty3.viewProfile();
        faculty3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "faculty" + "'", str9, "faculty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test19514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19514");
        model.Faculty faculty3 = new model.Faculty("", "hi!", "hi!");
        faculty3.login("faculty", "faculty");
        faculty3.logout();
        faculty3.viewProfile();
        java.lang.Class<?> wildcardClass9 = faculty3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test19515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19515");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getAccountType();
        faculty3.logout();
        java.lang.String str8 = faculty3.getEmail();
        faculty3.viewProfile();
        boolean boolean10 = faculty3.isVerified();
        faculty3.viewProfile();
        double double12 = faculty3.getHourlyRate();
        faculty3.logout();
        java.lang.String str14 = faculty3.getAccountType();
        faculty3.viewProfile();
        faculty3.logout();
        faculty3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 30.0d + "'", double12 == 30.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "faculty" + "'", str14, "faculty");
    }

    @Test
    public void test19516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19516");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        faculty3.setVerified(false);
        java.lang.String str10 = faculty3.getID();
        faculty3.viewProfile();
        java.lang.String str12 = faculty3.getID();
        faculty3.setVerified(false);
        java.lang.String str15 = faculty3.getID();
        boolean boolean16 = faculty3.isVerified();
        java.lang.String str17 = faculty3.getAccountType();
        double double18 = faculty3.getHourlyRate();
        faculty3.setVerified(true);
        faculty3.viewProfile();
        boolean boolean22 = faculty3.isVerified();
        java.lang.String str23 = faculty3.getID();
        java.lang.String str24 = faculty3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "faculty" + "'", str17, "faculty");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 30.0d + "'", double18 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test19517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19517");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        double double6 = faculty3.getHourlyRate();
        java.lang.String str7 = faculty3.getPassword();
        faculty3.login("", "faculty");
        java.lang.String str11 = faculty3.getAccountType();
        java.lang.String str12 = faculty3.getAccountType();
        faculty3.logout();
        java.lang.String str14 = faculty3.getAccountType();
        java.lang.String str15 = faculty3.getAccountType();
        faculty3.setVerified(true);
        java.lang.String str18 = faculty3.getEmail();
        faculty3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "faculty" + "'", str11, "faculty");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "faculty" + "'", str12, "faculty");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "faculty" + "'", str14, "faculty");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "faculty" + "'", str15, "faculty");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test19518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19518");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        faculty3.logout();
        faculty3.login("hi!", "hi!");
        double double8 = faculty3.getHourlyRate();
        boolean boolean9 = faculty3.isVerified();
        java.lang.String str10 = faculty3.getAccountType();
        java.lang.String str11 = faculty3.getPassword();
        java.lang.String str12 = faculty3.getID();
        java.lang.String str13 = faculty3.getID();
        faculty3.setVerified(false);
        faculty3.setVerified(false);
        java.lang.String str18 = faculty3.getPassword();
        double double19 = faculty3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "faculty" + "'", str10, "faculty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 30.0d + "'", double19 == 30.0d);
    }

    @Test
    public void test19519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19519");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        faculty3.login("", "faculty");
        faculty3.login("hi!", "hi!");
        java.lang.String str13 = faculty3.getAccountType();
        java.lang.String str14 = faculty3.getPassword();
        faculty3.setVerified(false);
        faculty3.logout();
        faculty3.viewProfile();
        java.lang.String str19 = faculty3.getEmail();
        java.lang.String str20 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "faculty" + "'", str13, "faculty");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "faculty" + "'", str20, "faculty");
    }

    @Test
    public void test19520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19520");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        java.lang.String str7 = faculty3.getID();
        faculty3.setVerified(true);
        java.lang.String str10 = faculty3.getAccountType();
        java.lang.String str11 = faculty3.getPassword();
        faculty3.login("", "");
        faculty3.logout();
        faculty3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "faculty" + "'", str10, "faculty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test19521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19521");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        java.lang.String str4 = faculty3.getAccountType();
        java.lang.String str5 = faculty3.getID();
        java.lang.String str6 = faculty3.getAccountType();
        faculty3.logout();
        java.lang.String str8 = faculty3.getID();
        faculty3.setVerified(true);
        java.lang.String str11 = faculty3.getEmail();
        faculty3.logout();
        faculty3.viewProfile();
        faculty3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "faculty" + "'", str4, "faculty");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test19522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19522");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        faculty3.logout();
        java.lang.String str5 = faculty3.getID();
        java.lang.String str6 = faculty3.getEmail();
        double double7 = faculty3.getHourlyRate();
        java.lang.String str8 = faculty3.getPassword();
        faculty3.login("hi!", "hi!");
        boolean boolean12 = faculty3.isVerified();
        faculty3.logout();
        java.lang.Class<?> wildcardClass14 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test19523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19523");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        boolean boolean7 = faculty3.isVerified();
        faculty3.logout();
        faculty3.logout();
        faculty3.viewProfile();
        faculty3.viewProfile();
        double double12 = faculty3.getHourlyRate();
        faculty3.login("", "faculty");
        faculty3.setVerified(true);
        faculty3.logout();
        faculty3.viewProfile();
        java.lang.String str20 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 30.0d + "'", double12 == 30.0d);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "faculty" + "'", str20, "faculty");
    }

    @Test
    public void test19524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19524");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        java.lang.String str8 = faculty3.getAccountType();
        faculty3.logout();
        java.lang.String str10 = faculty3.getEmail();
        faculty3.setVerified(false);
        faculty3.login("hi!", "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "faculty" + "'", str8, "faculty");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test19525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19525");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        faculty3.logout();
        java.lang.String str5 = faculty3.getID();
        java.lang.String str6 = faculty3.getEmail();
        double double7 = faculty3.getHourlyRate();
        java.lang.String str8 = faculty3.getPassword();
        faculty3.login("hi!", "hi!");
        faculty3.logout();
        faculty3.viewProfile();
        faculty3.logout();
        java.lang.String str15 = faculty3.getAccountType();
        double double16 = faculty3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "faculty" + "'", str15, "faculty");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 30.0d + "'", double16 == 30.0d);
    }

    @Test
    public void test19526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19526");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        java.lang.String str4 = faculty3.getPassword();
        double double5 = faculty3.getHourlyRate();
        double double6 = faculty3.getHourlyRate();
        faculty3.logout();
        java.lang.String str8 = faculty3.getAccountType();
        double double9 = faculty3.getHourlyRate();
        double double10 = faculty3.getHourlyRate();
        faculty3.login("", "hi!");
        java.lang.String str14 = faculty3.getAccountType();
        java.lang.String str15 = faculty3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 30.0d + "'", double5 == 30.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "faculty" + "'", str8, "faculty");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 30.0d + "'", double9 == 30.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 30.0d + "'", double10 == 30.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "faculty" + "'", str14, "faculty");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test19527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19527");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        faculty3.setVerified(false);
        java.lang.String str9 = faculty3.getID();
        faculty3.setVerified(false);
        java.lang.String str12 = faculty3.getID();
        java.lang.String str13 = faculty3.getID();
        java.lang.String str14 = faculty3.getPassword();
        java.lang.String str15 = faculty3.getEmail();
        faculty3.viewProfile();
        faculty3.login("hi!", "");
        java.lang.String str20 = faculty3.getEmail();
        faculty3.login("", "hi!");
        double double24 = faculty3.getHourlyRate();
        double double25 = faculty3.getHourlyRate();
        java.lang.String str26 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 30.0d + "'", double24 == 30.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 30.0d + "'", double25 == 30.0d);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "faculty" + "'", str26, "faculty");
    }

    @Test
    public void test19528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19528");
        model.Faculty faculty3 = new model.Faculty("", "faculty", "faculty");
        double double4 = faculty3.getHourlyRate();
        java.lang.String str5 = faculty3.getEmail();
        java.lang.String str6 = faculty3.getAccountType();
        double double7 = faculty3.getHourlyRate();
        faculty3.logout();
        faculty3.setVerified(false);
        faculty3.setVerified(true);
        faculty3.login("faculty", "faculty");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 30.0d + "'", double4 == 30.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
    }

    @Test
    public void test19529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19529");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        java.lang.String str8 = faculty3.getAccountType();
        java.lang.String str9 = faculty3.getAccountType();
        java.lang.String str10 = faculty3.getID();
        java.lang.String str11 = faculty3.getID();
        faculty3.login("", "faculty");
        faculty3.setVerified(false);
        double double17 = faculty3.getHourlyRate();
        faculty3.setVerified(false);
        faculty3.login("", "faculty");
        faculty3.login("", "");
        faculty3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "faculty" + "'", str8, "faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "faculty" + "'", str9, "faculty");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 30.0d + "'", double17 == 30.0d);
    }

    @Test
    public void test19530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19530");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        faculty3.login("", "faculty");
        faculty3.setVerified(true);
        faculty3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test19531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19531");
        model.Faculty faculty3 = new model.Faculty("hi!", "hi!", "");
        faculty3.viewProfile();
        java.lang.String str5 = faculty3.getAccountType();
        double double6 = faculty3.getHourlyRate();
        java.lang.String str7 = faculty3.getEmail();
        double double8 = faculty3.getHourlyRate();
        faculty3.login("", "");
        java.lang.String str12 = faculty3.getID();
        java.lang.String str13 = faculty3.getEmail();
        faculty3.viewProfile();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test19532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19532");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        faculty3.setVerified(false);
        boolean boolean7 = faculty3.isVerified();
        faculty3.logout();
        java.lang.String str9 = faculty3.getPassword();
        java.lang.String str10 = faculty3.getEmail();
        boolean boolean11 = faculty3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test19533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19533");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        faculty3.setVerified(false);
        java.lang.String str10 = faculty3.getID();
        faculty3.viewProfile();
        java.lang.String str12 = faculty3.getID();
        faculty3.setVerified(false);
        java.lang.String str15 = faculty3.getID();
        boolean boolean16 = faculty3.isVerified();
        java.lang.String str17 = faculty3.getAccountType();
        double double18 = faculty3.getHourlyRate();
        java.lang.String str19 = faculty3.getEmail();
        faculty3.setVerified(true);
        java.lang.String str22 = faculty3.getAccountType();
        java.lang.String str23 = faculty3.getAccountType();
        faculty3.setVerified(true);
        double double26 = faculty3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "faculty" + "'", str17, "faculty");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 30.0d + "'", double18 == 30.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "faculty" + "'", str22, "faculty");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "faculty" + "'", str23, "faculty");
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 30.0d + "'", double26 == 30.0d);
    }

    @Test
    public void test19534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19534");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        faculty3.logout();
        java.lang.String str5 = faculty3.getID();
        java.lang.String str6 = faculty3.getEmail();
        java.lang.String str7 = faculty3.getEmail();
        faculty3.logout();
        double double9 = faculty3.getHourlyRate();
        faculty3.setVerified(true);
        faculty3.login("", "faculty");
        java.lang.String str15 = faculty3.getEmail();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 30.0d + "'", double9 == 30.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test19535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19535");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        boolean boolean7 = faculty3.isVerified();
        java.lang.String str8 = faculty3.getID();
        java.lang.String str9 = faculty3.getPassword();
        boolean boolean10 = faculty3.isVerified();
        boolean boolean11 = faculty3.isVerified();
        java.lang.String str12 = faculty3.getID();
        boolean boolean13 = faculty3.isVerified();
        java.lang.String str14 = faculty3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test19536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19536");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        faculty3.logout();
        faculty3.login("hi!", "hi!");
        double double8 = faculty3.getHourlyRate();
        java.lang.String str9 = faculty3.getID();
        java.lang.String str10 = faculty3.getAccountType();
        faculty3.login("", "hi!");
        faculty3.logout();
        java.lang.String str15 = faculty3.getEmail();
        double double16 = faculty3.getHourlyRate();
        double double17 = faculty3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "faculty" + "'", str10, "faculty");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 30.0d + "'", double16 == 30.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 30.0d + "'", double17 == 30.0d);
    }

    @Test
    public void test19537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19537");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        java.lang.String str7 = faculty3.getID();
        faculty3.login("hi!", "");
        java.lang.String str11 = faculty3.getPassword();
        boolean boolean12 = faculty3.isVerified();
        faculty3.login("", "faculty");
        faculty3.login("", "faculty");
        java.lang.String str19 = faculty3.getID();
        faculty3.login("", "faculty");
        faculty3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test19538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19538");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        faculty3.setVerified(false);
        java.lang.String str10 = faculty3.getID();
        double double11 = faculty3.getHourlyRate();
        faculty3.viewProfile();
        java.lang.String str13 = faculty3.getID();
        boolean boolean14 = faculty3.isVerified();
        java.lang.String str15 = faculty3.getEmail();
        java.lang.String str16 = faculty3.getPassword();
        java.lang.String str17 = faculty3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 30.0d + "'", double11 == 30.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test19539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19539");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        faculty3.setVerified(false);
        java.lang.String str10 = faculty3.getID();
        faculty3.viewProfile();
        java.lang.String str12 = faculty3.getID();
        faculty3.setVerified(false);
        faculty3.setVerified(false);
        faculty3.logout();
        java.lang.String str18 = faculty3.getID();
        faculty3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test19540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19540");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        java.lang.String str4 = faculty3.getAccountType();
        java.lang.String str5 = faculty3.getID();
        faculty3.login("", "faculty");
        double double9 = faculty3.getHourlyRate();
        faculty3.login("hi!", "");
        faculty3.logout();
        faculty3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "faculty" + "'", str4, "faculty");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 30.0d + "'", double9 == 30.0d);
    }

    @Test
    public void test19541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19541");
        model.Faculty faculty3 = new model.Faculty("hi!", "hi!", "");
        faculty3.viewProfile();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.viewProfile();
        double double8 = faculty3.getHourlyRate();
        faculty3.setVerified(false);
        faculty3.login("faculty", "faculty");
        faculty3.login("", "faculty");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
    }

    @Test
    public void test19542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19542");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        java.lang.String str8 = faculty3.getPassword();
        faculty3.logout();
        double double10 = faculty3.getHourlyRate();
        faculty3.setVerified(false);
        java.lang.String str13 = faculty3.getID();
        boolean boolean14 = faculty3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 30.0d + "'", double10 == 30.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test19543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19543");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        java.lang.String str8 = faculty3.getEmail();
        faculty3.viewProfile();
        java.lang.String str10 = faculty3.getAccountType();
        faculty3.login("faculty", "hi!");
        faculty3.login("", "");
        java.lang.String str17 = faculty3.getAccountType();
        faculty3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "faculty" + "'", str10, "faculty");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "faculty" + "'", str17, "faculty");
    }

    @Test
    public void test19544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19544");
        model.Faculty faculty3 = new model.Faculty("hi!", "hi!", "");
        faculty3.logout();
        java.lang.String str5 = faculty3.getEmail();
        faculty3.logout();
        java.lang.String str7 = faculty3.getEmail();
        boolean boolean8 = faculty3.isVerified();
        java.lang.String str9 = faculty3.getEmail();
        java.lang.String str10 = faculty3.getAccountType();
        faculty3.logout();
        faculty3.viewProfile();
        faculty3.login("faculty", "");
        faculty3.login("hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "faculty" + "'", str10, "faculty");
    }

    @Test
    public void test19545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19545");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        double double6 = faculty3.getHourlyRate();
        faculty3.logout();
        faculty3.viewProfile();
        java.lang.String str9 = faculty3.getEmail();
        boolean boolean10 = faculty3.isVerified();
        java.lang.String str11 = faculty3.getPassword();
        java.lang.String str12 = faculty3.getID();
        faculty3.viewProfile();
        boolean boolean14 = faculty3.isVerified();
        java.lang.String str15 = faculty3.getEmail();
        faculty3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test19546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19546");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        faculty3.setVerified(false);
        java.lang.String str10 = faculty3.getEmail();
        faculty3.logout();
        faculty3.login("faculty", "hi!");
        java.lang.String str15 = faculty3.getPassword();
        faculty3.login("faculty", "");
        faculty3.viewProfile();
        faculty3.login("hi!", "faculty");
        boolean boolean23 = faculty3.isVerified();
        java.lang.String str24 = faculty3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
    }

    @Test
    public void test19547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19547");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        double double6 = faculty3.getHourlyRate();
        faculty3.logout();
        faculty3.viewProfile();
        java.lang.String str9 = faculty3.getEmail();
        boolean boolean10 = faculty3.isVerified();
        java.lang.String str11 = faculty3.getPassword();
        faculty3.login("", "hi!");
        double double15 = faculty3.getHourlyRate();
        faculty3.viewProfile();
        java.lang.String str17 = faculty3.getEmail();
        java.lang.String str18 = faculty3.getAccountType();
        faculty3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 30.0d + "'", double15 == 30.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "faculty" + "'", str18, "faculty");
    }

    @Test
    public void test19548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19548");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        faculty3.setVerified(false);
        java.lang.String str10 = faculty3.getID();
        java.lang.String str11 = faculty3.getAccountType();
        java.lang.String str12 = faculty3.getPassword();
        faculty3.logout();
        faculty3.setVerified(false);
        boolean boolean16 = faculty3.isVerified();
        java.lang.String str17 = faculty3.getID();
        faculty3.viewProfile();
        double double19 = faculty3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "faculty" + "'", str11, "faculty");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 30.0d + "'", double19 == 30.0d);
    }

    @Test
    public void test19549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19549");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        faculty3.setVerified(false);
        java.lang.String str10 = faculty3.getID();
        java.lang.String str11 = faculty3.getAccountType();
        java.lang.String str12 = faculty3.getPassword();
        double double13 = faculty3.getHourlyRate();
        java.lang.String str14 = faculty3.getPassword();
        faculty3.viewProfile();
        java.lang.String str16 = faculty3.getID();
        java.lang.String str17 = faculty3.getPassword();
        java.lang.String str18 = faculty3.getID();
        faculty3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "faculty" + "'", str11, "faculty");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 30.0d + "'", double13 == 30.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test19550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19550");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        java.lang.String str7 = faculty3.getID();
        faculty3.setVerified(true);
        java.lang.String str10 = faculty3.getEmail();
        faculty3.setVerified(true);
        java.lang.String str13 = faculty3.getID();
        java.lang.String str14 = faculty3.getAccountType();
        faculty3.setVerified(true);
        boolean boolean17 = faculty3.isVerified();
        java.lang.String str18 = faculty3.getID();
        faculty3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "faculty" + "'", str14, "faculty");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test19551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19551");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        faculty3.logout();
        faculty3.login("hi!", "hi!");
        java.lang.String str8 = faculty3.getID();
        boolean boolean9 = faculty3.isVerified();
        boolean boolean10 = faculty3.isVerified();
        faculty3.setVerified(false);
        faculty3.viewProfile();
        java.lang.String str14 = faculty3.getEmail();
        faculty3.logout();
        double double16 = faculty3.getHourlyRate();
        boolean boolean17 = faculty3.isVerified();
        java.lang.String str18 = faculty3.getEmail();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 30.0d + "'", double16 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test19552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19552");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        faculty3.logout();
        faculty3.login("hi!", "hi!");
        faculty3.viewProfile();
        java.lang.String str9 = faculty3.getPassword();
        java.lang.String str10 = faculty3.getID();
        faculty3.login("", "faculty");
        java.lang.String str14 = faculty3.getID();
        faculty3.login("", "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test19553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19553");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        faculty3.logout();
        faculty3.login("hi!", "hi!");
        double double8 = faculty3.getHourlyRate();
        java.lang.String str9 = faculty3.getID();
        java.lang.String str10 = faculty3.getAccountType();
        faculty3.setVerified(true);
        java.lang.String str13 = faculty3.getEmail();
        java.lang.String str14 = faculty3.getAccountType();
        java.lang.String str15 = faculty3.getID();
        faculty3.setVerified(true);
        java.lang.String str18 = faculty3.getID();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "faculty" + "'", str10, "faculty");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "faculty" + "'", str14, "faculty");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test19554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19554");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        java.lang.String str8 = faculty3.getAccountType();
        java.lang.String str9 = faculty3.getAccountType();
        java.lang.String str10 = faculty3.getID();
        faculty3.viewProfile();
        faculty3.viewProfile();
        java.lang.String str13 = faculty3.getPassword();
        faculty3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "faculty" + "'", str8, "faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "faculty" + "'", str9, "faculty");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test19555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19555");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        faculty3.logout();
        java.lang.String str5 = faculty3.getID();
        java.lang.String str6 = faculty3.getPassword();
        double double7 = faculty3.getHourlyRate();
        faculty3.login("faculty", "hi!");
        java.lang.String str11 = faculty3.getID();
        java.lang.String str12 = faculty3.getID();
        java.lang.String str13 = faculty3.getAccountType();
        faculty3.login("", "");
        faculty3.viewProfile();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "faculty" + "'", str13, "faculty");
    }

    @Test
    public void test19556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19556");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        faculty3.logout();
        java.lang.String str5 = faculty3.getID();
        java.lang.String str6 = faculty3.getEmail();
        double double7 = faculty3.getHourlyRate();
        boolean boolean8 = faculty3.isVerified();
        boolean boolean9 = faculty3.isVerified();
        faculty3.login("", "faculty");
        faculty3.setVerified(true);
        faculty3.setVerified(true);
        boolean boolean17 = faculty3.isVerified();
        faculty3.setVerified(true);
        java.lang.String str20 = faculty3.getEmail();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test19557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19557");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        faculty3.setVerified(false);
        java.lang.String str10 = faculty3.getID();
        java.lang.String str11 = faculty3.getAccountType();
        java.lang.String str12 = faculty3.getPassword();
        faculty3.logout();
        faculty3.login("hi!", "");
        java.lang.String str17 = faculty3.getEmail();
        faculty3.setVerified(false);
        faculty3.login("faculty", "faculty");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "faculty" + "'", str11, "faculty");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test19558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19558");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getAccountType();
        faculty3.logout();
        boolean boolean8 = faculty3.isVerified();
        java.lang.Class<?> wildcardClass9 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test19559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19559");
        model.Faculty faculty3 = new model.Faculty("", "", "faculty");
        faculty3.login("faculty", "");
        boolean boolean7 = faculty3.isVerified();
        faculty3.logout();
        faculty3.logout();
        java.lang.String str10 = faculty3.getID();
        java.lang.String str11 = faculty3.getID();
        java.lang.String str12 = faculty3.getAccountType();
        java.lang.String str13 = faculty3.getEmail();
        java.lang.String str14 = faculty3.getID();
        faculty3.viewProfile();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "faculty" + "'", str10, "faculty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "faculty" + "'", str11, "faculty");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "faculty" + "'", str12, "faculty");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "faculty" + "'", str14, "faculty");
    }

    @Test
    public void test19560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19560");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        faculty3.setVerified(false);
        java.lang.String str9 = faculty3.getID();
        faculty3.setVerified(false);
        faculty3.logout();
        java.lang.String str13 = faculty3.getAccountType();
        java.lang.String str14 = faculty3.getAccountType();
        java.lang.String str15 = faculty3.getID();
        java.lang.String str16 = faculty3.getAccountType();
        faculty3.viewProfile();
        faculty3.setVerified(true);
        java.lang.String str20 = faculty3.getPassword();
        java.lang.String str21 = faculty3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "faculty" + "'", str13, "faculty");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "faculty" + "'", str14, "faculty");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "faculty" + "'", str16, "faculty");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test19561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19561");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getAccountType();
        faculty3.logout();
        boolean boolean8 = faculty3.isVerified();
        faculty3.logout();
        double double10 = faculty3.getHourlyRate();
        faculty3.viewProfile();
        faculty3.logout();
        java.lang.String str13 = faculty3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 30.0d + "'", double10 == 30.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test19562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19562");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.viewProfile();
        faculty3.login("hi!", "faculty");
        faculty3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test19563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19563");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        faculty3.logout();
        java.lang.String str5 = faculty3.getID();
        java.lang.String str6 = faculty3.getEmail();
        java.lang.String str7 = faculty3.getEmail();
        java.lang.String str8 = faculty3.getEmail();
        boolean boolean9 = faculty3.isVerified();
        faculty3.setVerified(true);
        java.lang.String str12 = faculty3.getEmail();
        boolean boolean13 = faculty3.isVerified();
        faculty3.setVerified(false);
        faculty3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test19564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19564");
        model.Faculty faculty3 = new model.Faculty("hi!", "hi!", "");
        faculty3.logout();
        java.lang.String str5 = faculty3.getEmail();
        boolean boolean6 = faculty3.isVerified();
        java.lang.String str7 = faculty3.getEmail();
        faculty3.login("", "faculty");
        java.lang.String str11 = faculty3.getAccountType();
        java.lang.String str12 = faculty3.getEmail();
        boolean boolean13 = faculty3.isVerified();
        double double14 = faculty3.getHourlyRate();
        faculty3.setVerified(true);
        java.lang.String str17 = faculty3.getID();
        java.lang.String str18 = faculty3.getEmail();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "faculty" + "'", str11, "faculty");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 30.0d + "'", double14 == 30.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test19565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19565");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        faculty3.setVerified(false);
        faculty3.viewProfile();
        java.lang.String str7 = faculty3.getEmail();
        faculty3.login("hi!", "hi!");
        java.lang.String str11 = faculty3.getEmail();
        faculty3.login("faculty", "hi!");
        faculty3.setVerified(true);
        boolean boolean17 = faculty3.isVerified();
        faculty3.viewProfile();
        faculty3.logout();
        java.lang.String str20 = faculty3.getPassword();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test19566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19566");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        double double6 = faculty3.getHourlyRate();
        faculty3.logout();
        faculty3.viewProfile();
        java.lang.String str9 = faculty3.getEmail();
        boolean boolean10 = faculty3.isVerified();
        faculty3.viewProfile();
        boolean boolean12 = faculty3.isVerified();
        boolean boolean13 = faculty3.isVerified();
        faculty3.logout();
        faculty3.logout();
        faculty3.logout();
        faculty3.login("faculty", "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test19567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19567");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.viewProfile();
        java.lang.String str8 = faculty3.getAccountType();
        faculty3.logout();
        faculty3.logout();
        java.lang.String str11 = faculty3.getAccountType();
        java.lang.String str12 = faculty3.getAccountType();
        faculty3.viewProfile();
        faculty3.login("", "");
        boolean boolean17 = faculty3.isVerified();
        faculty3.viewProfile();
        java.lang.String str19 = faculty3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "faculty" + "'", str8, "faculty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "faculty" + "'", str11, "faculty");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "faculty" + "'", str12, "faculty");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test19568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19568");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        faculty3.setVerified(false);
        java.lang.String str9 = faculty3.getID();
        faculty3.setVerified(false);
        java.lang.String str12 = faculty3.getPassword();
        boolean boolean13 = faculty3.isVerified();
        boolean boolean14 = faculty3.isVerified();
        faculty3.viewProfile();
        java.lang.String str16 = faculty3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test19569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19569");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        faculty3.setVerified(false);
        java.lang.String str10 = faculty3.getID();
        double double11 = faculty3.getHourlyRate();
        java.lang.String str12 = faculty3.getPassword();
        faculty3.login("hi!", "hi!");
        faculty3.setVerified(true);
        java.lang.String str18 = faculty3.getID();
        faculty3.setVerified(true);
        double double21 = faculty3.getHourlyRate();
        java.lang.String str22 = faculty3.getAccountType();
        faculty3.setVerified(true);
        double double25 = faculty3.getHourlyRate();
        java.lang.String str26 = faculty3.getAccountType();
        java.lang.String str27 = faculty3.getID();
        java.lang.String str28 = faculty3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 30.0d + "'", double11 == 30.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 30.0d + "'", double21 == 30.0d);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "faculty" + "'", str22, "faculty");
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 30.0d + "'", double25 == 30.0d);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "faculty" + "'", str26, "faculty");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test19570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19570");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        java.lang.String str6 = faculty3.getPassword();
        faculty3.setVerified(false);
        faculty3.setVerified(true);
        faculty3.viewProfile();
        java.lang.String str12 = faculty3.getID();
        java.lang.String str13 = faculty3.getAccountType();
        faculty3.login("", "hi!");
        double double17 = faculty3.getHourlyRate();
        java.lang.String str18 = faculty3.getEmail();
        java.lang.Class<?> wildcardClass19 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "faculty" + "'", str13, "faculty");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 30.0d + "'", double17 == 30.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test19571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19571");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        java.lang.String str7 = faculty3.getID();
        faculty3.setVerified(true);
        java.lang.String str10 = faculty3.getEmail();
        faculty3.setVerified(true);
        faculty3.setVerified(true);
        java.lang.String str15 = faculty3.getPassword();
        java.lang.String str16 = faculty3.getEmail();
        faculty3.login("", "faculty");
        faculty3.setVerified(false);
        boolean boolean22 = faculty3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test19572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19572");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        faculty3.setVerified(false);
        boolean boolean7 = faculty3.isVerified();
        java.lang.String str8 = faculty3.getID();
        java.lang.String str9 = faculty3.getEmail();
        faculty3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test19573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19573");
        model.Faculty faculty3 = new model.Faculty("hi!", "faculty", "");
        faculty3.logout();
        faculty3.logout();
        faculty3.logout();
        double double7 = faculty3.getHourlyRate();
        java.lang.String str8 = faculty3.getID();
        java.lang.String str9 = faculty3.getAccountType();
        java.lang.String str10 = faculty3.getEmail();
        java.lang.String str11 = faculty3.getPassword();
        java.lang.String str12 = faculty3.getEmail();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "faculty" + "'", str9, "faculty");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "faculty" + "'", str11, "faculty");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test19574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19574");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        java.lang.String str7 = faculty3.getID();
        faculty3.setVerified(true);
        java.lang.String str10 = faculty3.getEmail();
        faculty3.setVerified(false);
        faculty3.logout();
        faculty3.login("", "faculty");
        java.lang.Class<?> wildcardClass17 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test19575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19575");
        model.Faculty faculty3 = new model.Faculty("hi!", "faculty", "");
        java.lang.String str4 = faculty3.getEmail();
        faculty3.logout();
        java.lang.String str6 = faculty3.getID();
        java.lang.String str7 = faculty3.getAccountType();
        boolean boolean8 = faculty3.isVerified();
        faculty3.viewProfile();
        faculty3.logout();
        java.lang.String str11 = faculty3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "faculty" + "'", str7, "faculty");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "faculty" + "'", str11, "faculty");
    }

    @Test
    public void test19576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19576");
        model.Faculty faculty3 = new model.Faculty("", "", "");
        faculty3.viewProfile();
        java.lang.String str5 = faculty3.getEmail();
        java.lang.String str6 = faculty3.getEmail();
        faculty3.logout();
        faculty3.setVerified(true);
        faculty3.login("faculty", "");
        faculty3.login("hi!", "faculty");
        java.lang.String str16 = faculty3.getEmail();
        faculty3.login("faculty", "hi!");
        boolean boolean20 = faculty3.isVerified();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test19577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19577");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        faculty3.setVerified(false);
        java.lang.String str6 = faculty3.getEmail();
        java.lang.String str7 = faculty3.getAccountType();
        faculty3.viewProfile();
        java.lang.String str9 = faculty3.getAccountType();
        java.lang.String str10 = faculty3.getPassword();
        double double11 = faculty3.getHourlyRate();
        boolean boolean12 = faculty3.isVerified();
        java.lang.String str13 = faculty3.getEmail();
        faculty3.login("hi!", "hi!");
        faculty3.logout();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "faculty" + "'", str7, "faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "faculty" + "'", str9, "faculty");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 30.0d + "'", double11 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test19578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19578");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getAccountType();
        faculty3.logout();
        java.lang.String str8 = faculty3.getEmail();
        faculty3.viewProfile();
        double double10 = faculty3.getHourlyRate();
        boolean boolean11 = faculty3.isVerified();
        double double12 = faculty3.getHourlyRate();
        faculty3.login("faculty", "");
        faculty3.setVerified(true);
        java.lang.String str18 = faculty3.getPassword();
        double double19 = faculty3.getHourlyRate();
        java.lang.String str20 = faculty3.getEmail();
        java.lang.String str21 = faculty3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 30.0d + "'", double10 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 30.0d + "'", double12 == 30.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 30.0d + "'", double19 == 30.0d);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test19579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19579");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        faculty3.setVerified(false);
        java.lang.String str10 = faculty3.getID();
        faculty3.viewProfile();
        double double12 = faculty3.getHourlyRate();
        java.lang.String str13 = faculty3.getID();
        boolean boolean14 = faculty3.isVerified();
        java.lang.String str15 = faculty3.getAccountType();
        boolean boolean16 = faculty3.isVerified();
        double double17 = faculty3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 30.0d + "'", double12 == 30.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "faculty" + "'", str15, "faculty");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 30.0d + "'", double17 == 30.0d);
    }

    @Test
    public void test19580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19580");
        model.Faculty faculty3 = new model.Faculty("hi!", "hi!", "");
        faculty3.setVerified(true);
        double double6 = faculty3.getHourlyRate();
        java.lang.String str7 = faculty3.getID();
        boolean boolean8 = faculty3.isVerified();
        faculty3.login("hi!", "");
        boolean boolean12 = faculty3.isVerified();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test19581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19581");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        java.lang.String str6 = faculty3.getPassword();
        faculty3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test19582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19582");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        faculty3.logout();
        java.lang.String str5 = faculty3.getID();
        java.lang.String str6 = faculty3.getEmail();
        double double7 = faculty3.getHourlyRate();
        java.lang.String str8 = faculty3.getEmail();
        java.lang.String str9 = faculty3.getID();
        boolean boolean10 = faculty3.isVerified();
        java.lang.String str11 = faculty3.getID();
        faculty3.login("", "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test19583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19583");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.viewProfile();
        double double8 = faculty3.getHourlyRate();
        faculty3.login("faculty", "faculty");
        faculty3.logout();
        faculty3.login("hi!", "faculty");
        java.lang.Class<?> wildcardClass16 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test19584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19584");
        model.Faculty faculty3 = new model.Faculty("", "hi!", "hi!");
        java.lang.String str4 = faculty3.getAccountType();
        faculty3.viewProfile();
        faculty3.logout();
        java.lang.String str7 = faculty3.getPassword();
        java.lang.String str8 = faculty3.getID();
        faculty3.login("hi!", "hi!");
        faculty3.login("hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "faculty" + "'", str4, "faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test19585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19585");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        faculty3.setVerified(false);
        java.lang.String str10 = faculty3.getAccountType();
        java.lang.String str11 = faculty3.getID();
        boolean boolean12 = faculty3.isVerified();
        faculty3.login("hi!", "faculty");
        faculty3.login("faculty", "");
        java.lang.String str19 = faculty3.getAccountType();
        faculty3.login("faculty", "hi!");
        faculty3.login("", "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "faculty" + "'", str10, "faculty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "faculty" + "'", str19, "faculty");
    }

    @Test
    public void test19586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19586");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        double double6 = faculty3.getHourlyRate();
        faculty3.logout();
        faculty3.viewProfile();
        java.lang.String str9 = faculty3.getEmail();
        java.lang.String str10 = faculty3.getEmail();
        faculty3.logout();
        boolean boolean12 = faculty3.isVerified();
        boolean boolean13 = faculty3.isVerified();
        faculty3.login("", "faculty");
        java.lang.String str17 = faculty3.getAccountType();
        faculty3.login("", "hi!");
        java.lang.String str21 = faculty3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "faculty" + "'", str17, "faculty");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test19587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19587");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getAccountType();
        faculty3.logout();
        java.lang.String str8 = faculty3.getEmail();
        faculty3.viewProfile();
        java.lang.String str10 = faculty3.getID();
        java.lang.String str11 = faculty3.getPassword();
        boolean boolean12 = faculty3.isVerified();
        java.lang.String str13 = faculty3.getEmail();
        java.lang.String str14 = faculty3.getPassword();
        double double15 = faculty3.getHourlyRate();
        double double16 = faculty3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 30.0d + "'", double15 == 30.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 30.0d + "'", double16 == 30.0d);
    }

    @Test
    public void test19588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19588");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getAccountType();
        faculty3.logout();
        java.lang.String str8 = faculty3.getEmail();
        faculty3.viewProfile();
        boolean boolean10 = faculty3.isVerified();
        java.lang.String str11 = faculty3.getID();
        java.lang.String str12 = faculty3.getAccountType();
        faculty3.logout();
        java.lang.String str14 = faculty3.getID();
        double double15 = faculty3.getHourlyRate();
        faculty3.setVerified(false);
        java.lang.String str18 = faculty3.getPassword();
        faculty3.login("faculty", "");
        java.lang.String str22 = faculty3.getPassword();
        faculty3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "faculty" + "'", str12, "faculty");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 30.0d + "'", double15 == 30.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test19589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19589");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        faculty3.setVerified(false);
        java.lang.String str10 = faculty3.getID();
        faculty3.viewProfile();
        java.lang.String str12 = faculty3.getID();
        java.lang.String str13 = faculty3.getID();
        faculty3.setVerified(false);
        faculty3.logout();
        double double17 = faculty3.getHourlyRate();
        java.lang.String str18 = faculty3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 30.0d + "'", double17 == 30.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test19590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19590");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        faculty3.setVerified(false);
        java.lang.String str9 = faculty3.getID();
        faculty3.setVerified(false);
        java.lang.String str12 = faculty3.getID();
        java.lang.String str13 = faculty3.getID();
        double double14 = faculty3.getHourlyRate();
        faculty3.viewProfile();
        java.lang.String str16 = faculty3.getEmail();
        boolean boolean17 = faculty3.isVerified();
        faculty3.logout();
        java.lang.String str19 = faculty3.getEmail();
        faculty3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 30.0d + "'", double14 == 30.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test19591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19591");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        java.lang.String str7 = faculty3.getID();
        faculty3.setVerified(true);
        java.lang.String str10 = faculty3.getEmail();
        faculty3.setVerified(true);
        java.lang.String str13 = faculty3.getAccountType();
        java.lang.String str14 = faculty3.getPassword();
        java.lang.String str15 = faculty3.getEmail();
        java.lang.String str16 = faculty3.getPassword();
        faculty3.logout();
        java.lang.String str18 = faculty3.getEmail();
        java.lang.String str19 = faculty3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "faculty" + "'", str13, "faculty");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test19592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19592");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        java.lang.String str8 = faculty3.getEmail();
        faculty3.viewProfile();
        java.lang.String str10 = faculty3.getPassword();
        java.lang.String str11 = faculty3.getAccountType();
        java.lang.String str12 = faculty3.getPassword();
        faculty3.logout();
        java.lang.String str14 = faculty3.getEmail();
        java.lang.String str15 = faculty3.getEmail();
        faculty3.login("", "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "faculty" + "'", str11, "faculty");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test19593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19593");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.viewProfile();
        java.lang.String str8 = faculty3.getAccountType();
        java.lang.String str9 = faculty3.getID();
        double double10 = faculty3.getHourlyRate();
        faculty3.setVerified(true);
        faculty3.viewProfile();
        faculty3.viewProfile();
        java.lang.String str15 = faculty3.getAccountType();
        boolean boolean16 = faculty3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "faculty" + "'", str8, "faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 30.0d + "'", double10 == 30.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "faculty" + "'", str15, "faculty");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test19594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19594");
        model.Faculty faculty3 = new model.Faculty("", "faculty", "");
        faculty3.setVerified(true);
        faculty3.login("", "hi!");
        boolean boolean9 = faculty3.isVerified();
        double double10 = faculty3.getHourlyRate();
        faculty3.setVerified(false);
        java.lang.String str13 = faculty3.getID();
        boolean boolean14 = faculty3.isVerified();
        double double15 = faculty3.getHourlyRate();
        java.lang.String str16 = faculty3.getPassword();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 30.0d + "'", double10 == 30.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 30.0d + "'", double15 == 30.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "faculty" + "'", str16, "faculty");
    }

    @Test
    public void test19595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19595");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        faculty3.logout();
        faculty3.login("hi!", "hi!");
        double double8 = faculty3.getHourlyRate();
        java.lang.String str9 = faculty3.getID();
        java.lang.String str10 = faculty3.getAccountType();
        faculty3.setVerified(true);
        faculty3.logout();
        faculty3.setVerified(false);
        faculty3.viewProfile();
        faculty3.setVerified(false);
        java.lang.String str19 = faculty3.getEmail();
        boolean boolean20 = faculty3.isVerified();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "faculty" + "'", str10, "faculty");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test19596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19596");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        java.lang.String str7 = faculty3.getID();
        faculty3.setVerified(true);
        java.lang.String str10 = faculty3.getEmail();
        faculty3.setVerified(false);
        faculty3.logout();
        java.lang.String str14 = faculty3.getEmail();
        faculty3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test19597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19597");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        faculty3.logout();
        faculty3.login("hi!", "hi!");
        faculty3.viewProfile();
        java.lang.String str9 = faculty3.getPassword();
        java.lang.String str10 = faculty3.getID();
        faculty3.logout();
        boolean boolean12 = faculty3.isVerified();
        double double13 = faculty3.getHourlyRate();
        java.lang.String str14 = faculty3.getEmail();
        java.lang.String str15 = faculty3.getPassword();
        double double16 = faculty3.getHourlyRate();
        faculty3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 30.0d + "'", double13 == 30.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 30.0d + "'", double16 == 30.0d);
    }

    @Test
    public void test19598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19598");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        faculty3.login("", "faculty");
        faculty3.login("hi!", "hi!");
        java.lang.String str13 = faculty3.getAccountType();
        java.lang.String str14 = faculty3.getPassword();
        faculty3.setVerified(false);
        faculty3.logout();
        double double18 = faculty3.getHourlyRate();
        java.lang.String str19 = faculty3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "faculty" + "'", str13, "faculty");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 30.0d + "'", double18 == 30.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test19599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19599");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        java.lang.String str7 = faculty3.getID();
        faculty3.login("hi!", "");
        java.lang.String str11 = faculty3.getPassword();
        boolean boolean12 = faculty3.isVerified();
        double double13 = faculty3.getHourlyRate();
        double double14 = faculty3.getHourlyRate();
        java.lang.String str15 = faculty3.getPassword();
        java.lang.String str16 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 30.0d + "'", double13 == 30.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 30.0d + "'", double14 == 30.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "faculty" + "'", str16, "faculty");
    }

    @Test
    public void test19600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19600");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        faculty3.setVerified(false);
        java.lang.String str9 = faculty3.getID();
        faculty3.setVerified(false);
        java.lang.String str12 = faculty3.getID();
        double double13 = faculty3.getHourlyRate();
        boolean boolean14 = faculty3.isVerified();
        faculty3.logout();
        java.lang.String str16 = faculty3.getID();
        faculty3.viewProfile();
        faculty3.setVerified(true);
        faculty3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 30.0d + "'", double13 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test19601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19601");
        model.Faculty faculty3 = new model.Faculty("hi!", "faculty", "");
        java.lang.String str4 = faculty3.getEmail();
        faculty3.viewProfile();
        faculty3.logout();
        faculty3.viewProfile();
        faculty3.viewProfile();
        double double9 = faculty3.getHourlyRate();
        boolean boolean10 = faculty3.isVerified();
        java.lang.String str11 = faculty3.getID();
        faculty3.viewProfile();
        faculty3.login("faculty", "");
        java.lang.String str16 = faculty3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 30.0d + "'", double9 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "faculty" + "'", str16, "faculty");
    }

    @Test
    public void test19602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19602");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        faculty3.setVerified(false);
        java.lang.String str9 = faculty3.getID();
        faculty3.setVerified(false);
        java.lang.String str12 = faculty3.getID();
        java.lang.String str13 = faculty3.getID();
        faculty3.logout();
        java.lang.String str15 = faculty3.getAccountType();
        java.lang.String str16 = faculty3.getPassword();
        double double17 = faculty3.getHourlyRate();
        java.lang.Class<?> wildcardClass18 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "faculty" + "'", str15, "faculty");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 30.0d + "'", double17 == 30.0d);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test19603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19603");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.login("", "");
        java.lang.String str10 = faculty3.getAccountType();
        faculty3.viewProfile();
        faculty3.login("hi!", "");
        java.lang.String str15 = faculty3.getEmail();
        double double16 = faculty3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "faculty" + "'", str10, "faculty");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 30.0d + "'", double16 == 30.0d);
    }

    @Test
    public void test19604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19604");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        double double4 = faculty3.getHourlyRate();
        boolean boolean5 = faculty3.isVerified();
        double double6 = faculty3.getHourlyRate();
        faculty3.logout();
        faculty3.setVerified(false);
        boolean boolean10 = faculty3.isVerified();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 30.0d + "'", double4 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test19605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19605");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getAccountType();
        faculty3.logout();
        java.lang.String str8 = faculty3.getEmail();
        faculty3.viewProfile();
        boolean boolean10 = faculty3.isVerified();
        java.lang.String str11 = faculty3.getID();
        double double12 = faculty3.getHourlyRate();
        faculty3.login("", "");
        java.lang.String str16 = faculty3.getPassword();
        java.lang.String str17 = faculty3.getEmail();
        faculty3.setVerified(false);
        boolean boolean20 = faculty3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 30.0d + "'", double12 == 30.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test19606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19606");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        java.lang.String str6 = faculty3.getPassword();
        java.lang.String str7 = faculty3.getPassword();
        java.lang.String str8 = faculty3.getEmail();
        double double9 = faculty3.getHourlyRate();
        faculty3.viewProfile();
        java.lang.String str11 = faculty3.getEmail();
        faculty3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 30.0d + "'", double9 == 30.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test19607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19607");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        faculty3.logout();
        faculty3.login("hi!", "hi!");
        double double8 = faculty3.getHourlyRate();
        boolean boolean9 = faculty3.isVerified();
        boolean boolean10 = faculty3.isVerified();
        boolean boolean11 = faculty3.isVerified();
        boolean boolean12 = faculty3.isVerified();
        double double13 = faculty3.getHourlyRate();
        faculty3.login("", "faculty");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 30.0d + "'", double13 == 30.0d);
    }

    @Test
    public void test19608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19608");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        faculty3.logout();
        faculty3.login("hi!", "hi!");
        double double8 = faculty3.getHourlyRate();
        boolean boolean9 = faculty3.isVerified();
        java.lang.String str10 = faculty3.getAccountType();
        java.lang.String str11 = faculty3.getAccountType();
        double double12 = faculty3.getHourlyRate();
        double double13 = faculty3.getHourlyRate();
        faculty3.login("hi!", "");
        boolean boolean17 = faculty3.isVerified();
        faculty3.login("", "faculty");
        java.lang.String str21 = faculty3.getID();
        faculty3.viewProfile();
        java.lang.Class<?> wildcardClass23 = faculty3.getClass();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "faculty" + "'", str10, "faculty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "faculty" + "'", str11, "faculty");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 30.0d + "'", double12 == 30.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 30.0d + "'", double13 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test19609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19609");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        java.lang.String str8 = faculty3.getPassword();
        faculty3.setVerified(false);
        faculty3.logout();
        faculty3.viewProfile();
        java.lang.String str13 = faculty3.getAccountType();
        java.lang.String str14 = faculty3.getEmail();
        java.lang.String str15 = faculty3.getEmail();
        boolean boolean16 = faculty3.isVerified();
        faculty3.viewProfile();
        faculty3.viewProfile();
        faculty3.viewProfile();
        faculty3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "faculty" + "'", str13, "faculty");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test19610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19610");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        faculty3.logout();
        java.lang.String str5 = faculty3.getID();
        java.lang.String str6 = faculty3.getPassword();
        double double7 = faculty3.getHourlyRate();
        double double8 = faculty3.getHourlyRate();
        java.lang.String str9 = faculty3.getEmail();
        boolean boolean10 = faculty3.isVerified();
        faculty3.viewProfile();
        java.lang.String str12 = faculty3.getAccountType();
        faculty3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "faculty" + "'", str12, "faculty");
    }

    @Test
    public void test19611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19611");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        double double6 = faculty3.getHourlyRate();
        java.lang.String str7 = faculty3.getPassword();
        java.lang.String str8 = faculty3.getPassword();
        java.lang.String str9 = faculty3.getPassword();
        double double10 = faculty3.getHourlyRate();
        java.lang.String str11 = faculty3.getID();
        faculty3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 30.0d + "'", double10 == 30.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test19612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19612");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        faculty3.setVerified(false);
        java.lang.String str9 = faculty3.getID();
        faculty3.setVerified(false);
        faculty3.logout();
        faculty3.setVerified(false);
        java.lang.String str15 = faculty3.getEmail();
        faculty3.viewProfile();
        java.lang.String str17 = faculty3.getEmail();
        java.lang.String str18 = faculty3.getPassword();
        faculty3.setVerified(true);
        faculty3.logout();
        faculty3.login("hi!", "");
        java.lang.Class<?> wildcardClass25 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test19613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19613");
        model.Faculty faculty3 = new model.Faculty("", "", "faculty");
        java.lang.String str4 = faculty3.getAccountType();
        java.lang.String str5 = faculty3.getID();
        java.lang.String str6 = faculty3.getAccountType();
        java.lang.String str7 = faculty3.getEmail();
        java.lang.String str8 = faculty3.getPassword();
        faculty3.logout();
        double double10 = faculty3.getHourlyRate();
        java.lang.String str11 = faculty3.getEmail();
        faculty3.login("hi!", "faculty");
        faculty3.setVerified(true);
        faculty3.viewProfile();
        faculty3.logout();
        faculty3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "faculty" + "'", str4, "faculty");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 30.0d + "'", double10 == 30.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test19614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19614");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        faculty3.logout();
        java.lang.String str5 = faculty3.getID();
        java.lang.String str6 = faculty3.getPassword();
        double double7 = faculty3.getHourlyRate();
        faculty3.login("faculty", "hi!");
        java.lang.String str11 = faculty3.getID();
        java.lang.String str12 = faculty3.getID();
        java.lang.String str13 = faculty3.getAccountType();
        faculty3.login("", "hi!");
        faculty3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "faculty" + "'", str13, "faculty");
    }

    @Test
    public void test19615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19615");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        faculty3.logout();
        faculty3.login("hi!", "hi!");
        double double8 = faculty3.getHourlyRate();
        boolean boolean9 = faculty3.isVerified();
        java.lang.String str10 = faculty3.getAccountType();
        java.lang.String str11 = faculty3.getAccountType();
        double double12 = faculty3.getHourlyRate();
        faculty3.viewProfile();
        java.lang.String str14 = faculty3.getAccountType();
        faculty3.login("hi!", "hi!");
        java.lang.String str18 = faculty3.getAccountType();
        faculty3.setVerified(true);
        java.lang.Class<?> wildcardClass21 = faculty3.getClass();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "faculty" + "'", str10, "faculty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "faculty" + "'", str11, "faculty");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 30.0d + "'", double12 == 30.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "faculty" + "'", str14, "faculty");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "faculty" + "'", str18, "faculty");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test19616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19616");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        java.lang.String str4 = faculty3.getAccountType();
        java.lang.String str5 = faculty3.getID();
        faculty3.setVerified(true);
        boolean boolean8 = faculty3.isVerified();
        faculty3.setVerified(false);
        java.lang.String str11 = faculty3.getAccountType();
        faculty3.logout();
        java.lang.String str13 = faculty3.getID();
        double double14 = faculty3.getHourlyRate();
        java.lang.String str15 = faculty3.getPassword();
        faculty3.logout();
        java.lang.String str17 = faculty3.getPassword();
        java.lang.String str18 = faculty3.getID();
        java.lang.String str19 = faculty3.getID();
        faculty3.viewProfile();
        java.lang.String str21 = faculty3.getEmail();
        boolean boolean22 = faculty3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "faculty" + "'", str4, "faculty");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "faculty" + "'", str11, "faculty");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 30.0d + "'", double14 == 30.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test19617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19617");
        model.Faculty faculty3 = new model.Faculty("hi!", "hi!", "hi!");
        faculty3.login("hi!", "faculty");
        boolean boolean7 = faculty3.isVerified();
        java.lang.String str8 = faculty3.getAccountType();
        java.lang.String str9 = faculty3.getEmail();
        faculty3.setVerified(false);
        double double12 = faculty3.getHourlyRate();
        double double13 = faculty3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "faculty" + "'", str8, "faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 30.0d + "'", double12 == 30.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 30.0d + "'", double13 == 30.0d);
    }

    @Test
    public void test19618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19618");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        java.lang.String str4 = faculty3.getAccountType();
        java.lang.String str5 = faculty3.getEmail();
        double double6 = faculty3.getHourlyRate();
        double double7 = faculty3.getHourlyRate();
        java.lang.String str8 = faculty3.getPassword();
        boolean boolean9 = faculty3.isVerified();
        boolean boolean10 = faculty3.isVerified();
        faculty3.logout();
        java.lang.String str12 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "faculty" + "'", str4, "faculty");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "faculty" + "'", str12, "faculty");
    }

    @Test
    public void test19619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19619");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        faculty3.setVerified(false);
        faculty3.viewProfile();
        java.lang.String str7 = faculty3.getEmail();
        java.lang.String str8 = faculty3.getID();
        faculty3.login("hi!", "faculty");
        faculty3.setVerified(true);
        faculty3.viewProfile();
        double double15 = faculty3.getHourlyRate();
        java.lang.String str16 = faculty3.getEmail();
        java.lang.String str17 = faculty3.getEmail();
        faculty3.logout();
        java.lang.String str19 = faculty3.getID();
        faculty3.setVerified(true);
        faculty3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 30.0d + "'", double15 == 30.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test19620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19620");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        faculty3.setVerified(false);
        java.lang.String str6 = faculty3.getPassword();
        java.lang.String str7 = faculty3.getAccountType();
        faculty3.viewProfile();
        faculty3.setVerified(false);
        java.lang.String str11 = faculty3.getEmail();
        java.lang.String str12 = faculty3.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "faculty" + "'", str7, "faculty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test19621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19621");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        double double6 = faculty3.getHourlyRate();
        java.lang.String str7 = faculty3.getPassword();
        faculty3.login("", "faculty");
        java.lang.String str11 = faculty3.getAccountType();
        java.lang.String str12 = faculty3.getEmail();
        java.lang.String str13 = faculty3.getPassword();
        java.lang.String str14 = faculty3.getPassword();
        faculty3.login("", "");
        faculty3.setVerified(false);
        double double20 = faculty3.getHourlyRate();
        faculty3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "faculty" + "'", str11, "faculty");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 30.0d + "'", double20 == 30.0d);
    }

    @Test
    public void test19622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19622");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        java.lang.String str4 = faculty3.getAccountType();
        java.lang.String str5 = faculty3.getID();
        faculty3.setVerified(true);
        faculty3.login("faculty", "faculty");
        java.lang.String str11 = faculty3.getPassword();
        java.lang.String str12 = faculty3.getEmail();
        faculty3.logout();
        java.lang.String str14 = faculty3.getID();
        faculty3.setVerified(false);
        java.lang.String str17 = faculty3.getAccountType();
        faculty3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "faculty" + "'", str4, "faculty");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "faculty" + "'", str17, "faculty");
    }

    @Test
    public void test19623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19623");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        faculty3.setVerified(false);
        java.lang.String str9 = faculty3.getID();
        faculty3.setVerified(false);
        java.lang.String str12 = faculty3.getID();
        java.lang.String str13 = faculty3.getID();
        java.lang.String str14 = faculty3.getPassword();
        java.lang.String str15 = faculty3.getEmail();
        double double16 = faculty3.getHourlyRate();
        boolean boolean17 = faculty3.isVerified();
        java.lang.String str18 = faculty3.getPassword();
        faculty3.login("", "faculty");
        java.lang.String str22 = faculty3.getID();
        java.lang.String str23 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 30.0d + "'", double16 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "faculty" + "'", str23, "faculty");
    }

    @Test
    public void test19624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19624");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        java.lang.String str6 = faculty3.getPassword();
        faculty3.setVerified(false);
        faculty3.setVerified(false);
        java.lang.String str11 = faculty3.getPassword();
        faculty3.viewProfile();
        java.lang.String str13 = faculty3.getAccountType();
        double double14 = faculty3.getHourlyRate();
        java.lang.String str15 = faculty3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "faculty" + "'", str13, "faculty");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 30.0d + "'", double14 == 30.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test19625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19625");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getAccountType();
        faculty3.logout();
        java.lang.String str8 = faculty3.getEmail();
        faculty3.viewProfile();
        java.lang.String str10 = faculty3.getID();
        java.lang.String str11 = faculty3.getPassword();
        boolean boolean12 = faculty3.isVerified();
        java.lang.String str13 = faculty3.getEmail();
        faculty3.setVerified(true);
        double double16 = faculty3.getHourlyRate();
        faculty3.logout();
        faculty3.setVerified(false);
        java.lang.String str20 = faculty3.getAccountType();
        faculty3.login("faculty", "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 30.0d + "'", double16 == 30.0d);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "faculty" + "'", str20, "faculty");
    }

    @Test
    public void test19626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19626");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        boolean boolean7 = faculty3.isVerified();
        faculty3.logout();
        faculty3.logout();
        faculty3.viewProfile();
        faculty3.logout();
        java.lang.String str12 = faculty3.getAccountType();
        faculty3.logout();
        boolean boolean14 = faculty3.isVerified();
        faculty3.viewProfile();
        faculty3.logout();
        boolean boolean17 = faculty3.isVerified();
        faculty3.login("hi!", "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "faculty" + "'", str12, "faculty");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test19627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19627");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        java.lang.String str4 = faculty3.getAccountType();
        java.lang.String str5 = faculty3.getID();
        faculty3.login("", "faculty");
        double double9 = faculty3.getHourlyRate();
        faculty3.login("hi!", "");
        java.lang.String str13 = faculty3.getPassword();
        faculty3.logout();
        faculty3.login("", "hi!");
        double double18 = faculty3.getHourlyRate();
        java.lang.String str19 = faculty3.getAccountType();
        boolean boolean20 = faculty3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "faculty" + "'", str4, "faculty");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 30.0d + "'", double9 == 30.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 30.0d + "'", double18 == 30.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "faculty" + "'", str19, "faculty");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test19628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19628");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        java.lang.String str7 = faculty3.getID();
        java.lang.String str8 = faculty3.getEmail();
        faculty3.login("", "");
        java.lang.String str12 = faculty3.getAccountType();
        faculty3.logout();
        java.lang.String str14 = faculty3.getAccountType();
        double double15 = faculty3.getHourlyRate();
        double double16 = faculty3.getHourlyRate();
        faculty3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "faculty" + "'", str12, "faculty");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "faculty" + "'", str14, "faculty");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 30.0d + "'", double15 == 30.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 30.0d + "'", double16 == 30.0d);
    }

    @Test
    public void test19629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19629");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        faculty3.setVerified(false);
        faculty3.viewProfile();
        java.lang.String str7 = faculty3.getEmail();
        java.lang.String str8 = faculty3.getAccountType();
        java.lang.String str9 = faculty3.getID();
        java.lang.String str10 = faculty3.getAccountType();
        faculty3.logout();
        faculty3.logout();
        boolean boolean13 = faculty3.isVerified();
        boolean boolean14 = faculty3.isVerified();
        double double15 = faculty3.getHourlyRate();
        double double16 = faculty3.getHourlyRate();
        boolean boolean17 = faculty3.isVerified();
        faculty3.login("faculty", "hi!");
        double double21 = faculty3.getHourlyRate();
        faculty3.logout();
        java.lang.String str23 = faculty3.getAccountType();
        java.lang.String str24 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "faculty" + "'", str8, "faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "faculty" + "'", str10, "faculty");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 30.0d + "'", double15 == 30.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 30.0d + "'", double16 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 30.0d + "'", double21 == 30.0d);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "faculty" + "'", str23, "faculty");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "faculty" + "'", str24, "faculty");
    }

    @Test
    public void test19630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19630");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        faculty3.setVerified(false);
        faculty3.viewProfile();
        java.lang.String str7 = faculty3.getEmail();
        java.lang.String str8 = faculty3.getAccountType();
        java.lang.String str9 = faculty3.getID();
        java.lang.String str10 = faculty3.getAccountType();
        faculty3.logout();
        java.lang.String str12 = faculty3.getID();
        java.lang.String str13 = faculty3.getAccountType();
        faculty3.viewProfile();
        faculty3.logout();
        double double16 = faculty3.getHourlyRate();
        faculty3.setVerified(false);
        faculty3.login("hi!", "faculty");
        java.lang.Class<?> wildcardClass22 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "faculty" + "'", str8, "faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "faculty" + "'", str10, "faculty");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "faculty" + "'", str13, "faculty");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 30.0d + "'", double16 == 30.0d);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test19631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19631");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        java.lang.String str8 = faculty3.getPassword();
        java.lang.String str9 = faculty3.getPassword();
        faculty3.logout();
        java.lang.String str11 = faculty3.getAccountType();
        faculty3.logout();
        faculty3.setVerified(false);
        java.lang.String str15 = faculty3.getPassword();
        double double16 = faculty3.getHourlyRate();
        java.lang.String str17 = faculty3.getEmail();
        java.lang.String str18 = faculty3.getAccountType();
        faculty3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "faculty" + "'", str11, "faculty");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 30.0d + "'", double16 == 30.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "faculty" + "'", str18, "faculty");
    }

    @Test
    public void test19632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19632");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        faculty3.setVerified(false);
        java.lang.String str6 = faculty3.getPassword();
        java.lang.String str7 = faculty3.getAccountType();
        java.lang.String str8 = faculty3.getEmail();
        faculty3.setVerified(true);
        boolean boolean11 = faculty3.isVerified();
        faculty3.login("hi!", "faculty");
        double double15 = faculty3.getHourlyRate();
        faculty3.logout();
        boolean boolean17 = faculty3.isVerified();
        faculty3.logout();
        faculty3.logout();
        faculty3.viewProfile();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "faculty" + "'", str7, "faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 30.0d + "'", double15 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test19633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19633");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        faculty3.setVerified(false);
        java.lang.String str10 = faculty3.getID();
        java.lang.String str11 = faculty3.getAccountType();
        java.lang.String str12 = faculty3.getPassword();
        double double13 = faculty3.getHourlyRate();
        java.lang.String str14 = faculty3.getPassword();
        faculty3.logout();
        double double16 = faculty3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "faculty" + "'", str11, "faculty");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 30.0d + "'", double13 == 30.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 30.0d + "'", double16 == 30.0d);
    }

    @Test
    public void test19634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19634");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        faculty3.setVerified(false);
        java.lang.String str10 = faculty3.getID();
        faculty3.viewProfile();
        faculty3.login("", "");
        java.lang.String str15 = faculty3.getID();
        double double16 = faculty3.getHourlyRate();
        java.lang.String str17 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 30.0d + "'", double16 == 30.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "faculty" + "'", str17, "faculty");
    }

    @Test
    public void test19635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19635");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getAccountType();
        faculty3.logout();
        double double8 = faculty3.getHourlyRate();
        java.lang.String str9 = faculty3.getEmail();
        java.lang.String str10 = faculty3.getAccountType();
        faculty3.setVerified(true);
        java.lang.String str13 = faculty3.getPassword();
        java.lang.String str14 = faculty3.getPassword();
        double double15 = faculty3.getHourlyRate();
        boolean boolean16 = faculty3.isVerified();
        double double17 = faculty3.getHourlyRate();
        faculty3.logout();
        java.lang.String str19 = faculty3.getAccountType();
        java.lang.Class<?> wildcardClass20 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "faculty" + "'", str10, "faculty");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 30.0d + "'", double15 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 30.0d + "'", double17 == 30.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "faculty" + "'", str19, "faculty");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test19636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19636");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        faculty3.setVerified(false);
        faculty3.viewProfile();
        java.lang.String str7 = faculty3.getEmail();
        java.lang.String str8 = faculty3.getAccountType();
        faculty3.logout();
        boolean boolean10 = faculty3.isVerified();
        faculty3.login("", "hi!");
        double double14 = faculty3.getHourlyRate();
        java.lang.String str15 = faculty3.getAccountType();
        faculty3.login("", "faculty");
        faculty3.setVerified(false);
        java.lang.String str21 = faculty3.getEmail();
        java.lang.String str22 = faculty3.getEmail();
        java.lang.String str23 = faculty3.getEmail();
        faculty3.login("hi!", "hi!");
        java.lang.String str27 = faculty3.getEmail();
        java.lang.String str28 = faculty3.getAccountType();
        faculty3.login("hi!", "hi!");
        faculty3.login("hi!", "faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "faculty" + "'", str8, "faculty");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 30.0d + "'", double14 == 30.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "faculty" + "'", str15, "faculty");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "faculty" + "'", str28, "faculty");
    }

    @Test
    public void test19637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19637");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.viewProfile();
        java.lang.String str8 = faculty3.getAccountType();
        faculty3.setVerified(false);
        java.lang.String str11 = faculty3.getAccountType();
        double double12 = faculty3.getHourlyRate();
        faculty3.login("hi!", "faculty");
        faculty3.logout();
        faculty3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "faculty" + "'", str8, "faculty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "faculty" + "'", str11, "faculty");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 30.0d + "'", double12 == 30.0d);
    }

    @Test
    public void test19638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19638");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getAccountType();
        faculty3.logout();
        java.lang.String str8 = faculty3.getEmail();
        faculty3.viewProfile();
        java.lang.String str10 = faculty3.getID();
        faculty3.login("", "faculty");
        faculty3.logout();
        faculty3.login("", "faculty");
        faculty3.setVerified(true);
        faculty3.viewProfile();
        java.lang.String str21 = faculty3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test19639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19639");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        faculty3.setVerified(false);
        boolean boolean9 = faculty3.isVerified();
        double double10 = faculty3.getHourlyRate();
        java.lang.String str11 = faculty3.getPassword();
        java.lang.String str12 = faculty3.getID();
        faculty3.logout();
        faculty3.logout();
        java.lang.String str15 = faculty3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 30.0d + "'", double10 == 30.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test19640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19640");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        java.lang.String str4 = faculty3.getAccountType();
        java.lang.String str5 = faculty3.getID();
        faculty3.setVerified(true);
        faculty3.login("faculty", "faculty");
        double double11 = faculty3.getHourlyRate();
        double double12 = faculty3.getHourlyRate();
        faculty3.setVerified(true);
        java.lang.String str15 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "faculty" + "'", str4, "faculty");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 30.0d + "'", double11 == 30.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 30.0d + "'", double12 == 30.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "faculty" + "'", str15, "faculty");
    }

    @Test
    public void test19641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19641");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        faculty3.logout();
        java.lang.String str5 = faculty3.getID();
        java.lang.String str6 = faculty3.getPassword();
        faculty3.logout();
        faculty3.login("faculty", "hi!");
        java.lang.String str11 = faculty3.getAccountType();
        java.lang.String str12 = faculty3.getEmail();
        boolean boolean13 = faculty3.isVerified();
        java.lang.String str14 = faculty3.getEmail();
        faculty3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "faculty" + "'", str11, "faculty");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test19642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19642");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        boolean boolean7 = faculty3.isVerified();
        faculty3.logout();
        java.lang.String str9 = faculty3.getID();
        faculty3.setVerified(true);
        faculty3.viewProfile();
        boolean boolean13 = faculty3.isVerified();
        java.lang.String str14 = faculty3.getEmail();
        boolean boolean15 = faculty3.isVerified();
        double double16 = faculty3.getHourlyRate();
        java.lang.String str17 = faculty3.getPassword();
        boolean boolean18 = faculty3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 30.0d + "'", double16 == 30.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test19643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19643");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getAccountType();
        faculty3.logout();
        double double8 = faculty3.getHourlyRate();
        java.lang.String str9 = faculty3.getEmail();
        java.lang.String str10 = faculty3.getAccountType();
        faculty3.setVerified(true);
        double double13 = faculty3.getHourlyRate();
        double double14 = faculty3.getHourlyRate();
        faculty3.setVerified(false);
        java.lang.String str17 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "faculty" + "'", str10, "faculty");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 30.0d + "'", double13 == 30.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 30.0d + "'", double14 == 30.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "faculty" + "'", str17, "faculty");
    }

    @Test
    public void test19644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19644");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        java.lang.String str4 = faculty3.getAccountType();
        java.lang.String str5 = faculty3.getEmail();
        faculty3.viewProfile();
        boolean boolean7 = faculty3.isVerified();
        java.lang.String str8 = faculty3.getAccountType();
        java.lang.String str9 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "faculty" + "'", str4, "faculty");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "faculty" + "'", str8, "faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "faculty" + "'", str9, "faculty");
    }

    @Test
    public void test19645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19645");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getAccountType();
        faculty3.logout();
        java.lang.String str8 = faculty3.getEmail();
        faculty3.viewProfile();
        boolean boolean10 = faculty3.isVerified();
        java.lang.String str11 = faculty3.getID();
        java.lang.String str12 = faculty3.getAccountType();
        faculty3.logout();
        faculty3.setVerified(true);
        java.lang.String str16 = faculty3.getEmail();
        java.lang.String str17 = faculty3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "faculty" + "'", str12, "faculty");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test19646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19646");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        faculty3.login("", "");
        double double7 = faculty3.getHourlyRate();
        faculty3.login("faculty", "faculty");
        java.lang.String str11 = faculty3.getID();
        faculty3.logout();
        double double13 = faculty3.getHourlyRate();
        java.lang.String str14 = faculty3.getID();
        faculty3.viewProfile();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 30.0d + "'", double13 == 30.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test19647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19647");
        model.Faculty faculty3 = new model.Faculty("hi!", "hi!", "faculty");
        java.lang.String str4 = faculty3.getPassword();
        boolean boolean5 = faculty3.isVerified();
        faculty3.login("faculty", "faculty");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test19648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19648");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        java.lang.String str8 = faculty3.getAccountType();
        faculty3.setVerified(false);
        faculty3.viewProfile();
        java.lang.String str12 = faculty3.getAccountType();
        java.lang.String str13 = faculty3.getID();
        java.lang.String str14 = faculty3.getID();
        faculty3.logout();
        java.lang.String str16 = faculty3.getID();
        java.lang.String str17 = faculty3.getID();
        java.lang.String str18 = faculty3.getID();
        java.lang.String str19 = faculty3.getEmail();
        double double20 = faculty3.getHourlyRate();
        faculty3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "faculty" + "'", str8, "faculty");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "faculty" + "'", str12, "faculty");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 30.0d + "'", double20 == 30.0d);
    }

    @Test
    public void test19649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19649");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        faculty3.login("", "");
        double double7 = faculty3.getHourlyRate();
        faculty3.login("faculty", "faculty");
        java.lang.String str11 = faculty3.getID();
        java.lang.String str12 = faculty3.getAccountType();
        boolean boolean13 = faculty3.isVerified();
        java.lang.String str14 = faculty3.getID();
        java.lang.String str15 = faculty3.getEmail();
        faculty3.setVerified(false);
        java.lang.String str18 = faculty3.getPassword();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "faculty" + "'", str12, "faculty");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test19650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19650");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        java.lang.String str4 = faculty3.getAccountType();
        java.lang.String str5 = faculty3.getID();
        faculty3.setVerified(true);
        faculty3.login("faculty", "faculty");
        java.lang.String str11 = faculty3.getPassword();
        faculty3.logout();
        faculty3.login("faculty", "");
        faculty3.login("hi!", "faculty");
        faculty3.logout();
        boolean boolean20 = faculty3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "faculty" + "'", str4, "faculty");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test19651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19651");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        boolean boolean7 = faculty3.isVerified();
        java.lang.String str8 = faculty3.getEmail();
        boolean boolean9 = faculty3.isVerified();
        java.lang.String str10 = faculty3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test19652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19652");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        java.lang.String str6 = faculty3.getPassword();
        java.lang.String str7 = faculty3.getPassword();
        java.lang.String str8 = faculty3.getID();
        java.lang.String str9 = faculty3.getID();
        double double10 = faculty3.getHourlyRate();
        faculty3.login("faculty", "");
        boolean boolean14 = faculty3.isVerified();
        faculty3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 30.0d + "'", double10 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test19653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19653");
        model.Faculty faculty3 = new model.Faculty("", "", "");
        faculty3.viewProfile();
        double double5 = faculty3.getHourlyRate();
        java.lang.String str6 = faculty3.getEmail();
        boolean boolean7 = faculty3.isVerified();
        faculty3.viewProfile();
        java.lang.String str9 = faculty3.getPassword();
        faculty3.logout();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 30.0d + "'", double5 == 30.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test19654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19654");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        boolean boolean7 = faculty3.isVerified();
        faculty3.logout();
        faculty3.logout();
        double double10 = faculty3.getHourlyRate();
        faculty3.setVerified(true);
        boolean boolean13 = faculty3.isVerified();
        double double14 = faculty3.getHourlyRate();
        faculty3.logout();
        java.lang.String str16 = faculty3.getEmail();
        faculty3.login("", "faculty");
        faculty3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 30.0d + "'", double10 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 30.0d + "'", double14 == 30.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test19655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19655");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        faculty3.setVerified(false);
        java.lang.String str10 = faculty3.getAccountType();
        java.lang.String str11 = faculty3.getEmail();
        faculty3.logout();
        faculty3.setVerified(false);
        faculty3.viewProfile();
        faculty3.setVerified(true);
        double double18 = faculty3.getHourlyRate();
        java.lang.String str19 = faculty3.getAccountType();
        double double20 = faculty3.getHourlyRate();
        java.lang.String str21 = faculty3.getEmail();
        java.lang.Class<?> wildcardClass22 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "faculty" + "'", str10, "faculty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 30.0d + "'", double18 == 30.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "faculty" + "'", str19, "faculty");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 30.0d + "'", double20 == 30.0d);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test19656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19656");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        faculty3.logout();
        faculty3.login("hi!", "hi!");
        double double8 = faculty3.getHourlyRate();
        boolean boolean9 = faculty3.isVerified();
        java.lang.String str10 = faculty3.getAccountType();
        java.lang.String str11 = faculty3.getAccountType();
        double double12 = faculty3.getHourlyRate();
        double double13 = faculty3.getHourlyRate();
        faculty3.viewProfile();
        faculty3.viewProfile();
        faculty3.login("", "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "faculty" + "'", str10, "faculty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "faculty" + "'", str11, "faculty");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 30.0d + "'", double12 == 30.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 30.0d + "'", double13 == 30.0d);
    }

    @Test
    public void test19657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19657");
        model.Faculty faculty3 = new model.Faculty("", "", "faculty");
        faculty3.login("faculty", "");
        boolean boolean7 = faculty3.isVerified();
        faculty3.logout();
        faculty3.logout();
        faculty3.viewProfile();
        java.lang.String str11 = faculty3.getAccountType();
        java.lang.String str12 = faculty3.getEmail();
        boolean boolean13 = faculty3.isVerified();
        faculty3.viewProfile();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "faculty" + "'", str11, "faculty");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test19658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19658");
        model.Faculty faculty3 = new model.Faculty("", "", "");
        faculty3.viewProfile();
        java.lang.String str5 = faculty3.getEmail();
        java.lang.String str6 = faculty3.getEmail();
        faculty3.logout();
        faculty3.setVerified(true);
        faculty3.login("faculty", "");
        faculty3.logout();
        faculty3.setVerified(false);
        java.lang.String str16 = faculty3.getAccountType();
        java.lang.String str17 = faculty3.getEmail();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "faculty" + "'", str16, "faculty");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test19659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19659");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        java.lang.String str6 = faculty3.getPassword();
        faculty3.setVerified(false);
        faculty3.setVerified(false);
        java.lang.String str11 = faculty3.getPassword();
        java.lang.String str12 = faculty3.getEmail();
        faculty3.login("hi!", "hi!");
        faculty3.logout();
        faculty3.login("faculty", "");
        faculty3.viewProfile();
        faculty3.viewProfile();
        faculty3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test19660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19660");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        java.lang.String str8 = faculty3.getPassword();
        java.lang.String str9 = faculty3.getPassword();
        faculty3.logout();
        java.lang.String str11 = faculty3.getAccountType();
        java.lang.String str12 = faculty3.getEmail();
        faculty3.logout();
        faculty3.login("faculty", "");
        boolean boolean17 = faculty3.isVerified();
        java.lang.String str18 = faculty3.getAccountType();
        java.lang.String str19 = faculty3.getEmail();
        java.lang.String str20 = faculty3.getAccountType();
        java.lang.String str21 = faculty3.getID();
        java.lang.String str22 = faculty3.getID();
        faculty3.viewProfile();
        boolean boolean24 = faculty3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "faculty" + "'", str11, "faculty");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "faculty" + "'", str18, "faculty");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "faculty" + "'", str20, "faculty");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test19661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19661");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getID();
        java.lang.String str6 = faculty3.getPassword();
        java.lang.String str7 = faculty3.getEmail();
        boolean boolean8 = faculty3.isVerified();
        java.lang.String str9 = faculty3.getAccountType();
        java.lang.String str10 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "faculty" + "'", str9, "faculty");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "faculty" + "'", str10, "faculty");
    }

    @Test
    public void test19662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19662");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getID();
        java.lang.String str6 = faculty3.getPassword();
        java.lang.String str7 = faculty3.getEmail();
        boolean boolean8 = faculty3.isVerified();
        java.lang.String str9 = faculty3.getID();
        boolean boolean10 = faculty3.isVerified();
        java.lang.String str11 = faculty3.getEmail();
        faculty3.viewProfile();
        boolean boolean13 = faculty3.isVerified();
        faculty3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test19663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19663");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        double double6 = faculty3.getHourlyRate();
        faculty3.setVerified(true);
        faculty3.login("hi!", "");
        java.lang.String str12 = faculty3.getPassword();
        faculty3.login("hi!", "");
        boolean boolean16 = faculty3.isVerified();
        java.lang.String str17 = faculty3.getPassword();
        double double18 = faculty3.getHourlyRate();
        java.lang.String str19 = faculty3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 30.0d + "'", double18 == 30.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test19664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19664");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        faculty3.logout();
        faculty3.login("hi!", "hi!");
        double double8 = faculty3.getHourlyRate();
        boolean boolean9 = faculty3.isVerified();
        java.lang.String str10 = faculty3.getAccountType();
        java.lang.String str11 = faculty3.getAccountType();
        java.lang.String str12 = faculty3.getID();
        faculty3.viewProfile();
        java.lang.Class<?> wildcardClass14 = faculty3.getClass();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "faculty" + "'", str10, "faculty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "faculty" + "'", str11, "faculty");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test19665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19665");
        model.Faculty faculty3 = new model.Faculty("", "faculty", "");
        faculty3.setVerified(true);
        faculty3.login("", "hi!");
        boolean boolean9 = faculty3.isVerified();
        faculty3.logout();
        java.lang.String str11 = faculty3.getID();
        java.lang.String str12 = faculty3.getID();
        java.lang.String str13 = faculty3.getEmail();
        faculty3.setVerified(true);
        java.lang.String str16 = faculty3.getID();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test19666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19666");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        java.lang.String str7 = faculty3.getID();
        double double8 = faculty3.getHourlyRate();
        faculty3.logout();
        faculty3.logout();
        faculty3.setVerified(true);
        faculty3.viewProfile();
        java.lang.String str14 = faculty3.getAccountType();
        java.lang.String str15 = faculty3.getEmail();
        java.lang.String str16 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "faculty" + "'", str14, "faculty");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "faculty" + "'", str16, "faculty");
    }

    @Test
    public void test19667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19667");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        java.lang.String str8 = faculty3.getPassword();
        java.lang.String str9 = faculty3.getEmail();
        faculty3.logout();
        boolean boolean11 = faculty3.isVerified();
        java.lang.String str12 = faculty3.getAccountType();
        faculty3.setVerified(true);
        double double15 = faculty3.getHourlyRate();
        faculty3.viewProfile();
        faculty3.login("hi!", "");
        faculty3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "faculty" + "'", str12, "faculty");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 30.0d + "'", double15 == 30.0d);
    }

    @Test
    public void test19668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19668");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getAccountType();
        faculty3.logout();
        double double8 = faculty3.getHourlyRate();
        java.lang.String str9 = faculty3.getEmail();
        java.lang.String str10 = faculty3.getPassword();
        faculty3.logout();
        java.lang.String str12 = faculty3.getPassword();
        double double13 = faculty3.getHourlyRate();
        java.lang.String str14 = faculty3.getAccountType();
        faculty3.logout();
        double double16 = faculty3.getHourlyRate();
        faculty3.login("", "hi!");
        faculty3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 30.0d + "'", double13 == 30.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "faculty" + "'", str14, "faculty");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 30.0d + "'", double16 == 30.0d);
    }

    @Test
    public void test19669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19669");
        model.Faculty faculty3 = new model.Faculty("hi!", "hi!", "");
        faculty3.logout();
        java.lang.String str5 = faculty3.getEmail();
        double double6 = faculty3.getHourlyRate();
        faculty3.setVerified(false);
        faculty3.login("", "");
        faculty3.login("hi!", "");
        faculty3.login("hi!", "faculty");
        java.lang.String str18 = faculty3.getEmail();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test19670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19670");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        faculty3.setVerified(false);
        java.lang.String str9 = faculty3.getID();
        faculty3.setVerified(false);
        java.lang.String str12 = faculty3.getPassword();
        boolean boolean13 = faculty3.isVerified();
        boolean boolean14 = faculty3.isVerified();
        faculty3.login("", "faculty");
        faculty3.setVerified(false);
        boolean boolean20 = faculty3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test19671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19671");
        model.Faculty faculty3 = new model.Faculty("faculty", "faculty", "hi!");
        faculty3.setVerified(false);
        java.lang.String str6 = faculty3.getID();
        faculty3.setVerified(true);
        double double9 = faculty3.getHourlyRate();
        faculty3.login("faculty", "");
        double double13 = faculty3.getHourlyRate();
        faculty3.logout();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 30.0d + "'", double9 == 30.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 30.0d + "'", double13 == 30.0d);
    }

    @Test
    public void test19672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19672");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        java.lang.String str4 = faculty3.getAccountType();
        java.lang.String str5 = faculty3.getID();
        faculty3.login("", "faculty");
        java.lang.String str9 = faculty3.getAccountType();
        java.lang.String str10 = faculty3.getAccountType();
        faculty3.login("faculty", "faculty");
        java.lang.String str14 = faculty3.getEmail();
        java.lang.String str15 = faculty3.getEmail();
        java.lang.String str16 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "faculty" + "'", str4, "faculty");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "faculty" + "'", str9, "faculty");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "faculty" + "'", str10, "faculty");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "faculty" + "'", str16, "faculty");
    }

    @Test
    public void test19673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19673");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        java.lang.String str8 = faculty3.getPassword();
        java.lang.String str9 = faculty3.getID();
        boolean boolean10 = faculty3.isVerified();
        faculty3.setVerified(false);
        faculty3.viewProfile();
        boolean boolean14 = faculty3.isVerified();
        faculty3.logout();
        boolean boolean16 = faculty3.isVerified();
        java.lang.String str17 = faculty3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test19674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19674");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        boolean boolean7 = faculty3.isVerified();
        faculty3.logout();
        faculty3.logout();
        faculty3.viewProfile();
        faculty3.logout();
        java.lang.String str12 = faculty3.getAccountType();
        faculty3.login("hi!", "faculty");
        double double16 = faculty3.getHourlyRate();
        java.lang.String str17 = faculty3.getID();
        boolean boolean18 = faculty3.isVerified();
        faculty3.login("faculty", "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "faculty" + "'", str12, "faculty");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 30.0d + "'", double16 == 30.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test19675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19675");
        model.Faculty faculty3 = new model.Faculty("faculty", "faculty", "hi!");
        faculty3.setVerified(false);
        java.lang.String str6 = faculty3.getID();
        faculty3.setVerified(true);
        java.lang.String str9 = faculty3.getEmail();
        faculty3.setVerified(false);
        faculty3.viewProfile();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "faculty" + "'", str9, "faculty");
    }

    @Test
    public void test19676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19676");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        faculty3.logout();
        faculty3.login("hi!", "hi!");
        double double8 = faculty3.getHourlyRate();
        java.lang.String str9 = faculty3.getID();
        java.lang.String str10 = faculty3.getEmail();
        faculty3.setVerified(true);
        java.lang.String str13 = faculty3.getEmail();
        double double14 = faculty3.getHourlyRate();
        faculty3.viewProfile();
        double double16 = faculty3.getHourlyRate();
        faculty3.setVerified(false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 30.0d + "'", double14 == 30.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 30.0d + "'", double16 == 30.0d);
    }

    @Test
    public void test19677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19677");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getAccountType();
        faculty3.logout();
        double double8 = faculty3.getHourlyRate();
        java.lang.String str9 = faculty3.getEmail();
        java.lang.String str10 = faculty3.getPassword();
        java.lang.String str11 = faculty3.getAccountType();
        java.lang.String str12 = faculty3.getID();
        faculty3.login("faculty", "faculty");
        java.lang.String str16 = faculty3.getPassword();
        java.lang.String str17 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "faculty" + "'", str11, "faculty");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "faculty" + "'", str17, "faculty");
    }

    @Test
    public void test19678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19678");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        faculty3.login("", "");
        double double7 = faculty3.getHourlyRate();
        faculty3.login("faculty", "faculty");
        java.lang.String str11 = faculty3.getID();
        faculty3.logout();
        faculty3.logout();
        faculty3.setVerified(false);
        java.lang.String str16 = faculty3.getPassword();
        faculty3.logout();
        faculty3.viewProfile();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test19679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19679");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        double double6 = faculty3.getHourlyRate();
        faculty3.logout();
        faculty3.setVerified(false);
        faculty3.login("", "");
        faculty3.viewProfile();
        double double14 = faculty3.getHourlyRate();
        java.lang.String str15 = faculty3.getPassword();
        java.lang.String str16 = faculty3.getEmail();
        boolean boolean17 = faculty3.isVerified();
        java.lang.String str18 = faculty3.getPassword();
        java.lang.String str19 = faculty3.getEmail();
        java.lang.String str20 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 30.0d + "'", double14 == 30.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "faculty" + "'", str20, "faculty");
    }

    @Test
    public void test19680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19680");
        model.Faculty faculty3 = new model.Faculty("faculty", "hi!", "hi!");
        java.lang.String str4 = faculty3.getEmail();
        faculty3.login("hi!", "hi!");
        faculty3.logout();
        double double9 = faculty3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "faculty" + "'", str4, "faculty");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 30.0d + "'", double9 == 30.0d);
    }

    @Test
    public void test19681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19681");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getID();
        java.lang.String str6 = faculty3.getID();
        faculty3.login("", "");
        java.lang.String str10 = faculty3.getID();
        java.lang.String str11 = faculty3.getEmail();
        faculty3.logout();
        faculty3.login("faculty", "faculty");
        java.lang.String str16 = faculty3.getAccountType();
        java.lang.String str17 = faculty3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "faculty" + "'", str16, "faculty");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test19682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19682");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        java.lang.String str7 = faculty3.getID();
        faculty3.setVerified(true);
        java.lang.String str10 = faculty3.getEmail();
        faculty3.setVerified(true);
        faculty3.login("", "");
        java.lang.String str16 = faculty3.getID();
        faculty3.login("", "hi!");
        faculty3.setVerified(true);
        java.lang.String str22 = faculty3.getID();
        faculty3.login("faculty", "faculty");
        java.lang.String str26 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "faculty" + "'", str26, "faculty");
    }

    @Test
    public void test19683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19683");
        model.Faculty faculty3 = new model.Faculty("", "hi!", "hi!");
        faculty3.login("faculty", "faculty");
        java.lang.String str7 = faculty3.getID();
        java.lang.String str8 = faculty3.getPassword();
        double double9 = faculty3.getHourlyRate();
        faculty3.logout();
        faculty3.viewProfile();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 30.0d + "'", double9 == 30.0d);
    }

    @Test
    public void test19684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19684");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        java.lang.String str4 = faculty3.getAccountType();
        java.lang.String str5 = faculty3.getEmail();
        faculty3.viewProfile();
        faculty3.setVerified(true);
        java.lang.String str9 = faculty3.getPassword();
        faculty3.setVerified(false);
        faculty3.setVerified(true);
        faculty3.viewProfile();
        faculty3.logout();
        faculty3.logout();
        faculty3.login("hi!", "faculty");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "faculty" + "'", str4, "faculty");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test19685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19685");
        model.Faculty faculty3 = new model.Faculty("hi!", "faculty", "");
        java.lang.String str4 = faculty3.getEmail();
        faculty3.viewProfile();
        faculty3.logout();
        faculty3.viewProfile();
        faculty3.viewProfile();
        double double9 = faculty3.getHourlyRate();
        boolean boolean10 = faculty3.isVerified();
        faculty3.login("hi!", "faculty");
        java.lang.String str14 = faculty3.getID();
        java.lang.String str15 = faculty3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 30.0d + "'", double9 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test19686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19686");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        faculty3.logout();
        java.lang.String str5 = faculty3.getID();
        java.lang.String str6 = faculty3.getPassword();
        double double7 = faculty3.getHourlyRate();
        java.lang.String str8 = faculty3.getAccountType();
        faculty3.viewProfile();
        faculty3.viewProfile();
        boolean boolean11 = faculty3.isVerified();
        java.lang.String str12 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "faculty" + "'", str8, "faculty");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "faculty" + "'", str12, "faculty");
    }

    @Test
    public void test19687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19687");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        java.lang.String str6 = faculty3.getPassword();
        faculty3.setVerified(false);
        java.lang.String str9 = faculty3.getAccountType();
        faculty3.setVerified(false);
        boolean boolean12 = faculty3.isVerified();
        faculty3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "faculty" + "'", str9, "faculty");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test19688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19688");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        faculty3.setVerified(false);
        faculty3.viewProfile();
        java.lang.String str7 = faculty3.getEmail();
        faculty3.viewProfile();
        java.lang.String str9 = faculty3.getEmail();
        faculty3.viewProfile();
        java.lang.String str11 = faculty3.getPassword();
        java.lang.String str12 = faculty3.getPassword();
        java.lang.String str13 = faculty3.getPassword();
        java.lang.String str14 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "faculty" + "'", str14, "faculty");
    }

    @Test
    public void test19689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19689");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        faculty3.setVerified(false);
        java.lang.String str9 = faculty3.getID();
        faculty3.setVerified(false);
        faculty3.logout();
        faculty3.setVerified(false);
        java.lang.String str15 = faculty3.getPassword();
        faculty3.setVerified(true);
        double double18 = faculty3.getHourlyRate();
        java.lang.String str19 = faculty3.getPassword();
        java.lang.String str20 = faculty3.getID();
        boolean boolean21 = faculty3.isVerified();
        faculty3.login("faculty", "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 30.0d + "'", double18 == 30.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test19690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19690");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        java.lang.String str8 = faculty3.getEmail();
        java.lang.String str9 = faculty3.getPassword();
        boolean boolean10 = faculty3.isVerified();
        java.lang.String str11 = faculty3.getID();
        java.lang.String str12 = faculty3.getPassword();
        faculty3.setVerified(true);
        java.lang.String str15 = faculty3.getPassword();
        java.lang.String str16 = faculty3.getAccountType();
        faculty3.setVerified(true);
        faculty3.setVerified(false);
        boolean boolean21 = faculty3.isVerified();
        faculty3.viewProfile();
        double double23 = faculty3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "faculty" + "'", str16, "faculty");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 30.0d + "'", double23 == 30.0d);
    }

    @Test
    public void test19691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19691");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        faculty3.setVerified(false);
        java.lang.String str9 = faculty3.getID();
        faculty3.setVerified(false);
        faculty3.logout();
        java.lang.String str13 = faculty3.getAccountType();
        java.lang.String str14 = faculty3.getAccountType();
        java.lang.String str15 = faculty3.getID();
        java.lang.String str16 = faculty3.getAccountType();
        faculty3.login("hi!", "hi!");
        double double20 = faculty3.getHourlyRate();
        faculty3.logout();
        faculty3.setVerified(true);
        java.lang.String str24 = faculty3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "faculty" + "'", str13, "faculty");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "faculty" + "'", str14, "faculty");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "faculty" + "'", str16, "faculty");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 30.0d + "'", double20 == 30.0d);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test19692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19692");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        double double6 = faculty3.getHourlyRate();
        java.lang.String str7 = faculty3.getPassword();
        faculty3.login("", "faculty");
        java.lang.String str11 = faculty3.getPassword();
        faculty3.logout();
        double double13 = faculty3.getHourlyRate();
        faculty3.logout();
        double double15 = faculty3.getHourlyRate();
        boolean boolean16 = faculty3.isVerified();
        faculty3.login("hi!", "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 30.0d + "'", double13 == 30.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 30.0d + "'", double15 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test19693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19693");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        faculty3.setVerified(false);
        faculty3.viewProfile();
        java.lang.String str7 = faculty3.getEmail();
        java.lang.String str8 = faculty3.getAccountType();
        faculty3.logout();
        boolean boolean10 = faculty3.isVerified();
        faculty3.login("", "hi!");
        boolean boolean14 = faculty3.isVerified();
        faculty3.login("", "hi!");
        faculty3.login("faculty", "");
        faculty3.viewProfile();
        java.lang.String str22 = faculty3.getPassword();
        faculty3.viewProfile();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "faculty" + "'", str8, "faculty");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test19694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19694");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        double double6 = faculty3.getHourlyRate();
        java.lang.String str7 = faculty3.getPassword();
        java.lang.String str8 = faculty3.getPassword();
        faculty3.viewProfile();
        faculty3.login("", "");
        java.lang.String str13 = faculty3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test19695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19695");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        faculty3.logout();
        java.lang.String str5 = faculty3.getID();
        java.lang.String str6 = faculty3.getEmail();
        double double7 = faculty3.getHourlyRate();
        java.lang.String str8 = faculty3.getPassword();
        faculty3.login("hi!", "hi!");
        faculty3.logout();
        faculty3.login("faculty", "hi!");
        faculty3.setVerified(false);
        boolean boolean18 = faculty3.isVerified();
        double double19 = faculty3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 30.0d + "'", double19 == 30.0d);
    }

    @Test
    public void test19696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19696");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        java.lang.String str8 = faculty3.getPassword();
        java.lang.String str9 = faculty3.getPassword();
        faculty3.logout();
        java.lang.String str11 = faculty3.getAccountType();
        faculty3.logout();
        faculty3.viewProfile();
        boolean boolean14 = faculty3.isVerified();
        double double15 = faculty3.getHourlyRate();
        java.lang.String str16 = faculty3.getPassword();
        java.lang.String str17 = faculty3.getEmail();
        java.lang.String str18 = faculty3.getAccountType();
        faculty3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "faculty" + "'", str11, "faculty");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 30.0d + "'", double15 == 30.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "faculty" + "'", str18, "faculty");
    }

    @Test
    public void test19697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19697");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        faculty3.logout();
        java.lang.String str5 = faculty3.getID();
        java.lang.String str6 = faculty3.getEmail();
        java.lang.String str7 = faculty3.getID();
        boolean boolean8 = faculty3.isVerified();
        java.lang.String str9 = faculty3.getEmail();
        faculty3.viewProfile();
        faculty3.viewProfile();
        faculty3.login("faculty", "");
        faculty3.login("hi!", "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test19698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19698");
        model.Faculty faculty3 = new model.Faculty("hi!", "hi!", "hi!");
        faculty3.login("hi!", "faculty");
        faculty3.logout();
        java.lang.String str8 = faculty3.getPassword();
        faculty3.viewProfile();
        faculty3.setVerified(false);
        faculty3.logout();
        faculty3.viewProfile();
        java.lang.String str14 = faculty3.getAccountType();
        faculty3.logout();
        java.lang.String str16 = faculty3.getPassword();
        java.lang.String str17 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "faculty" + "'", str14, "faculty");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "faculty" + "'", str17, "faculty");
    }

    @Test
    public void test19699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19699");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        faculty3.logout();
        java.lang.String str5 = faculty3.getID();
        java.lang.String str6 = faculty3.getPassword();
        double double7 = faculty3.getHourlyRate();
        faculty3.setVerified(false);
        java.lang.String str10 = faculty3.getID();
        faculty3.viewProfile();
        java.lang.Class<?> wildcardClass12 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test19700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19700");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        faculty3.logout();
        faculty3.viewProfile();
        faculty3.viewProfile();
        double double7 = faculty3.getHourlyRate();
        java.lang.String str8 = faculty3.getPassword();
        java.lang.String str9 = faculty3.getPassword();
        faculty3.setVerified(true);
        boolean boolean12 = faculty3.isVerified();
        faculty3.logout();
        double double14 = faculty3.getHourlyRate();
        java.lang.String str15 = faculty3.getPassword();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 30.0d + "'", double14 == 30.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test19701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19701");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getAccountType();
        faculty3.logout();
        java.lang.String str8 = faculty3.getEmail();
        faculty3.viewProfile();
        java.lang.String str10 = faculty3.getID();
        boolean boolean11 = faculty3.isVerified();
        java.lang.String str12 = faculty3.getAccountType();
        java.lang.String str13 = faculty3.getEmail();
        java.lang.String str14 = faculty3.getID();
        faculty3.logout();
        faculty3.login("faculty", "faculty");
        java.lang.String str19 = faculty3.getPassword();
        faculty3.setVerified(false);
        faculty3.logout();
        faculty3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "faculty" + "'", str12, "faculty");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test19702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19702");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getAccountType();
        faculty3.logout();
        java.lang.String str8 = faculty3.getEmail();
        faculty3.viewProfile();
        boolean boolean10 = faculty3.isVerified();
        java.lang.String str11 = faculty3.getID();
        java.lang.String str12 = faculty3.getAccountType();
        faculty3.viewProfile();
        faculty3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "faculty" + "'", str12, "faculty");
    }

    @Test
    public void test19703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19703");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getAccountType();
        faculty3.logout();
        double double8 = faculty3.getHourlyRate();
        java.lang.String str9 = faculty3.getEmail();
        java.lang.String str10 = faculty3.getAccountType();
        faculty3.setVerified(true);
        faculty3.login("hi!", "");
        java.lang.String str16 = faculty3.getAccountType();
        faculty3.logout();
        faculty3.login("hi!", "hi!");
        faculty3.login("hi!", "faculty");
        java.lang.String str24 = faculty3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "faculty" + "'", str10, "faculty");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "faculty" + "'", str16, "faculty");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test19704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19704");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        faculty3.logout();
        java.lang.String str5 = faculty3.getID();
        java.lang.String str6 = faculty3.getEmail();
        double double7 = faculty3.getHourlyRate();
        java.lang.String str8 = faculty3.getPassword();
        faculty3.login("hi!", "hi!");
        faculty3.setVerified(false);
        java.lang.String str14 = faculty3.getAccountType();
        java.lang.String str15 = faculty3.getEmail();
        faculty3.login("hi!", "faculty");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "faculty" + "'", str14, "faculty");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test19705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19705");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        java.lang.String str4 = faculty3.getAccountType();
        java.lang.String str5 = faculty3.getID();
        faculty3.setVerified(true);
        faculty3.login("faculty", "faculty");
        java.lang.String str11 = faculty3.getPassword();
        faculty3.logout();
        faculty3.setVerified(false);
        boolean boolean15 = faculty3.isVerified();
        java.lang.String str16 = faculty3.getID();
        java.lang.Class<?> wildcardClass17 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "faculty" + "'", str4, "faculty");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test19706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19706");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        java.lang.String str7 = faculty3.getID();
        double double8 = faculty3.getHourlyRate();
        faculty3.logout();
        java.lang.String str10 = faculty3.getEmail();
        faculty3.login("faculty", "faculty");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test19707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19707");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        faculty3.logout();
        faculty3.login("hi!", "hi!");
        double double8 = faculty3.getHourlyRate();
        boolean boolean9 = faculty3.isVerified();
        java.lang.String str10 = faculty3.getAccountType();
        java.lang.String str11 = faculty3.getAccountType();
        double double12 = faculty3.getHourlyRate();
        double double13 = faculty3.getHourlyRate();
        faculty3.login("hi!", "");
        boolean boolean17 = faculty3.isVerified();
        java.lang.String str18 = faculty3.getID();
        faculty3.viewProfile();
        faculty3.logout();
        faculty3.viewProfile();
        java.lang.String str22 = faculty3.getEmail();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "faculty" + "'", str10, "faculty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "faculty" + "'", str11, "faculty");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 30.0d + "'", double12 == 30.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 30.0d + "'", double13 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test19708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19708");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        faculty3.setVerified(false);
        java.lang.String str10 = faculty3.getID();
        faculty3.viewProfile();
        java.lang.String str12 = faculty3.getID();
        java.lang.String str13 = faculty3.getAccountType();
        java.lang.String str14 = faculty3.getID();
        java.lang.String str15 = faculty3.getID();
        java.lang.String str16 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "faculty" + "'", str13, "faculty");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "faculty" + "'", str16, "faculty");
    }

    @Test
    public void test19709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19709");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        faculty3.setVerified(false);
        java.lang.String str10 = faculty3.getEmail();
        faculty3.logout();
        faculty3.login("faculty", "hi!");
        java.lang.String str15 = faculty3.getPassword();
        faculty3.login("faculty", "");
        faculty3.login("", "hi!");
        java.lang.String str22 = faculty3.getEmail();
        faculty3.viewProfile();
        java.lang.String str24 = faculty3.getPassword();
        faculty3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test19710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19710");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        faculty3.setVerified(false);
        java.lang.String str10 = faculty3.getID();
        java.lang.String str11 = faculty3.getAccountType();
        java.lang.String str12 = faculty3.getPassword();
        faculty3.logout();
        faculty3.setVerified(false);
        faculty3.logout();
        java.lang.String str17 = faculty3.getEmail();
        double double18 = faculty3.getHourlyRate();
        java.lang.String str19 = faculty3.getEmail();
        faculty3.setVerified(false);
        faculty3.login("", "");
        java.lang.String str25 = faculty3.getEmail();
        java.lang.String str26 = faculty3.getID();
        faculty3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "faculty" + "'", str11, "faculty");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 30.0d + "'", double18 == 30.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
    }

    @Test
    public void test19711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19711");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        faculty3.login("", "hi!");
        faculty3.login("faculty", "hi!");
        faculty3.setVerified(true);
        java.lang.String str15 = faculty3.getPassword();
        boolean boolean16 = faculty3.isVerified();
        java.lang.String str17 = faculty3.getID();
        faculty3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test19712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19712");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        faculty3.setVerified(false);
        faculty3.viewProfile();
        java.lang.String str11 = faculty3.getEmail();
        java.lang.String str12 = faculty3.getEmail();
        java.lang.String str13 = faculty3.getID();
        java.lang.String str14 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "faculty" + "'", str14, "faculty");
    }

    @Test
    public void test19713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19713");
        model.Faculty faculty3 = new model.Faculty("", "", "faculty");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        faculty3.viewProfile();
        java.lang.String str7 = faculty3.getID();
        faculty3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "faculty" + "'", str4, "faculty");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "faculty" + "'", str7, "faculty");
    }

    @Test
    public void test19714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19714");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getAccountType();
        faculty3.logout();
        double double8 = faculty3.getHourlyRate();
        java.lang.String str9 = faculty3.getEmail();
        java.lang.String str10 = faculty3.getAccountType();
        faculty3.setVerified(true);
        faculty3.login("hi!", "faculty");
        boolean boolean16 = faculty3.isVerified();
        faculty3.login("faculty", "");
        faculty3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "faculty" + "'", str10, "faculty");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test19715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19715");
        model.Faculty faculty3 = new model.Faculty("faculty", "hi!", "faculty");
        java.lang.String str4 = faculty3.getID();
        faculty3.login("", "");
        faculty3.setVerified(false);
        java.lang.String str10 = faculty3.getAccountType();
        faculty3.viewProfile();
        faculty3.setVerified(false);
        faculty3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "faculty" + "'", str4, "faculty");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "faculty" + "'", str10, "faculty");
    }

    @Test
    public void test19716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19716");
        model.Faculty faculty3 = new model.Faculty("", "faculty", "faculty");
        double double4 = faculty3.getHourlyRate();
        java.lang.String str5 = faculty3.getEmail();
        java.lang.String str6 = faculty3.getAccountType();
        faculty3.setVerified(false);
        java.lang.String str9 = faculty3.getAccountType();
        faculty3.viewProfile();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 30.0d + "'", double4 == 30.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "faculty" + "'", str9, "faculty");
    }

    @Test
    public void test19717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19717");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        faculty3.logout();
        faculty3.login("hi!", "hi!");
        faculty3.viewProfile();
        java.lang.String str9 = faculty3.getPassword();
        java.lang.String str10 = faculty3.getID();
        faculty3.logout();
        faculty3.login("", "faculty");
        java.lang.String str15 = faculty3.getID();
        java.lang.String str16 = faculty3.getID();
        faculty3.logout();
        boolean boolean18 = faculty3.isVerified();
        faculty3.setVerified(true);
        java.lang.String str21 = faculty3.getPassword();
        java.lang.Class<?> wildcardClass22 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test19718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19718");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        faculty3.setVerified(false);
        faculty3.viewProfile();
        java.lang.String str11 = faculty3.getAccountType();
        faculty3.logout();
        faculty3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "faculty" + "'", str11, "faculty");
    }

    @Test
    public void test19719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19719");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        java.lang.String str8 = faculty3.getAccountType();
        faculty3.setVerified(false);
        faculty3.logout();
        java.lang.String str12 = faculty3.getEmail();
        faculty3.login("faculty", "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "faculty" + "'", str8, "faculty");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test19720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19720");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        faculty3.setVerified(false);
        java.lang.String str9 = faculty3.getID();
        faculty3.setVerified(false);
        faculty3.logout();
        faculty3.setVerified(false);
        java.lang.String str15 = faculty3.getPassword();
        faculty3.setVerified(true);
        faculty3.setVerified(false);
        faculty3.setVerified(false);
        double double22 = faculty3.getHourlyRate();
        faculty3.viewProfile();
        faculty3.login("faculty", "faculty");
        faculty3.login("faculty", "");
        faculty3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 30.0d + "'", double22 == 30.0d);
    }

    @Test
    public void test19721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19721");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        faculty3.setVerified(false);
        java.lang.String str9 = faculty3.getID();
        faculty3.setVerified(false);
        java.lang.String str12 = faculty3.getID();
        java.lang.String str13 = faculty3.getAccountType();
        boolean boolean14 = faculty3.isVerified();
        faculty3.setVerified(false);
        faculty3.logout();
        faculty3.setVerified(true);
        faculty3.logout();
        faculty3.login("faculty", "");
        faculty3.login("", "hi!");
        faculty3.setVerified(false);
        faculty3.login("", "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "faculty" + "'", str13, "faculty");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test19722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19722");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        faculty3.setVerified(false);
        java.lang.String str10 = faculty3.getEmail();
        faculty3.logout();
        faculty3.login("faculty", "hi!");
        java.lang.String str15 = faculty3.getPassword();
        faculty3.login("faculty", "");
        faculty3.login("", "hi!");
        java.lang.String str22 = faculty3.getEmail();
        faculty3.login("hi!", "");
        faculty3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test19723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19723");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        faculty3.setVerified(false);
        java.lang.String str9 = faculty3.getID();
        faculty3.setVerified(false);
        java.lang.String str12 = faculty3.getID();
        java.lang.String str13 = faculty3.getEmail();
        java.lang.String str14 = faculty3.getID();
        double double15 = faculty3.getHourlyRate();
        java.lang.String str16 = faculty3.getEmail();
        java.lang.String str17 = faculty3.getEmail();
        java.lang.String str18 = faculty3.getPassword();
        faculty3.logout();
        java.lang.String str20 = faculty3.getEmail();
        java.lang.String str21 = faculty3.getID();
        faculty3.viewProfile();
        double double23 = faculty3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 30.0d + "'", double15 == 30.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 30.0d + "'", double23 == 30.0d);
    }

    @Test
    public void test19724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19724");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        faculty3.setVerified(false);
        java.lang.String str10 = faculty3.getEmail();
        faculty3.logout();
        java.lang.String str12 = faculty3.getID();
        faculty3.login("hi!", "");
        double double16 = faculty3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 30.0d + "'", double16 == 30.0d);
    }

    @Test
    public void test19725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19725");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        double double6 = faculty3.getHourlyRate();
        faculty3.logout();
        faculty3.viewProfile();
        java.lang.String str9 = faculty3.getEmail();
        boolean boolean10 = faculty3.isVerified();
        java.lang.String str11 = faculty3.getPassword();
        faculty3.logout();
        faculty3.login("faculty", "");
        faculty3.login("", "faculty");
        faculty3.setVerified(false);
        java.lang.String str21 = faculty3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test19726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19726");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        faculty3.setVerified(false);
        java.lang.String str10 = faculty3.getAccountType();
        java.lang.String str11 = faculty3.getEmail();
        faculty3.logout();
        faculty3.setVerified(false);
        faculty3.login("", "");
        faculty3.login("faculty", "");
        faculty3.setVerified(false);
        java.lang.String str23 = faculty3.getAccountType();
        faculty3.setVerified(true);
        double double26 = faculty3.getHourlyRate();
        double double27 = faculty3.getHourlyRate();
        java.lang.Class<?> wildcardClass28 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "faculty" + "'", str10, "faculty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "faculty" + "'", str23, "faculty");
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 30.0d + "'", double26 == 30.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 30.0d + "'", double27 == 30.0d);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test19727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19727");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "faculty");
        java.lang.String str4 = faculty3.getPassword();
        double double5 = faculty3.getHourlyRate();
        double double6 = faculty3.getHourlyRate();
        java.lang.String str7 = faculty3.getPassword();
        double double8 = faculty3.getHourlyRate();
        faculty3.viewProfile();
        java.lang.String str10 = faculty3.getAccountType();
        java.lang.String str11 = faculty3.getAccountType();
        boolean boolean12 = faculty3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 30.0d + "'", double5 == 30.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "faculty" + "'", str10, "faculty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "faculty" + "'", str11, "faculty");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test19728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19728");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        faculty3.setVerified(false);
        java.lang.String str9 = faculty3.getID();
        faculty3.setVerified(false);
        java.lang.String str12 = faculty3.getID();
        double double13 = faculty3.getHourlyRate();
        boolean boolean14 = faculty3.isVerified();
        faculty3.logout();
        java.lang.String str16 = faculty3.getID();
        java.lang.String str17 = faculty3.getID();
        java.lang.String str18 = faculty3.getEmail();
        java.lang.String str19 = faculty3.getID();
        faculty3.login("faculty", "faculty");
        java.lang.Class<?> wildcardClass23 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 30.0d + "'", double13 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test19729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19729");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        java.lang.String str8 = faculty3.getAccountType();
        java.lang.String str9 = faculty3.getAccountType();
        java.lang.String str10 = faculty3.getID();
        faculty3.setVerified(true);
        faculty3.viewProfile();
        java.lang.String str14 = faculty3.getID();
        faculty3.logout();
        java.lang.String str16 = faculty3.getEmail();
        faculty3.login("faculty", "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "faculty" + "'", str8, "faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "faculty" + "'", str9, "faculty");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test19730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19730");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        faculty3.setVerified(false);
        java.lang.String str10 = faculty3.getID();
        faculty3.viewProfile();
        java.lang.String str12 = faculty3.getID();
        boolean boolean13 = faculty3.isVerified();
        java.lang.String str14 = faculty3.getPassword();
        java.lang.String str15 = faculty3.getPassword();
        double double16 = faculty3.getHourlyRate();
        boolean boolean17 = faculty3.isVerified();
        faculty3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 30.0d + "'", double16 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test19731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19731");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        faculty3.setVerified(false);
        faculty3.viewProfile();
        java.lang.String str7 = faculty3.getEmail();
        java.lang.String str8 = faculty3.getID();
        faculty3.viewProfile();
        java.lang.String str10 = faculty3.getEmail();
        java.lang.String str11 = faculty3.getPassword();
        faculty3.viewProfile();
        faculty3.logout();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test19732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19732");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        faculty3.login("", "");
        double double7 = faculty3.getHourlyRate();
        faculty3.login("faculty", "faculty");
        boolean boolean11 = faculty3.isVerified();
        java.lang.String str12 = faculty3.getID();
        faculty3.logout();
        faculty3.login("faculty", "");
        java.lang.String str17 = faculty3.getAccountType();
        double double18 = faculty3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "faculty" + "'", str17, "faculty");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 30.0d + "'", double18 == 30.0d);
    }

    @Test
    public void test19733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19733");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        boolean boolean7 = faculty3.isVerified();
        faculty3.logout();
        java.lang.String str9 = faculty3.getID();
        faculty3.login("hi!", "");
        java.lang.String str13 = faculty3.getID();
        faculty3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test19734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19734");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        faculty3.setVerified(false);
        java.lang.String str10 = faculty3.getID();
        faculty3.viewProfile();
        java.lang.String str12 = faculty3.getID();
        java.lang.String str13 = faculty3.getAccountType();
        java.lang.String str14 = faculty3.getEmail();
        boolean boolean15 = faculty3.isVerified();
        faculty3.login("", "faculty");
        java.lang.String str19 = faculty3.getID();
        java.lang.String str20 = faculty3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "faculty" + "'", str13, "faculty");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test19735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19735");
        model.Faculty faculty3 = new model.Faculty("hi!", "hi!", "");
        faculty3.setVerified(true);
        faculty3.login("faculty", "");
        faculty3.logout();
        java.lang.String str10 = faculty3.getID();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test19736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19736");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        faculty3.setVerified(false);
        java.lang.String str10 = faculty3.getID();
        double double11 = faculty3.getHourlyRate();
        java.lang.String str12 = faculty3.getPassword();
        faculty3.login("hi!", "hi!");
        faculty3.setVerified(true);
        java.lang.String str18 = faculty3.getID();
        java.lang.String str19 = faculty3.getEmail();
        java.lang.String str20 = faculty3.getEmail();
        boolean boolean21 = faculty3.isVerified();
        faculty3.login("hi!", "faculty");
        java.lang.String str25 = faculty3.getPassword();
        faculty3.viewProfile();
        java.lang.String str27 = faculty3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 30.0d + "'", double11 == 30.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test19737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19737");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        faculty3.logout();
        faculty3.logout();
        java.lang.String str7 = faculty3.getID();
        faculty3.viewProfile();
        java.lang.String str9 = faculty3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test19738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19738");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "faculty");
        java.lang.String str4 = faculty3.getPassword();
        double double5 = faculty3.getHourlyRate();
        java.lang.String str6 = faculty3.getPassword();
        double double7 = faculty3.getHourlyRate();
        faculty3.logout();
        faculty3.login("faculty", "hi!");
        faculty3.setVerified(false);
        faculty3.setVerified(true);
        double double16 = faculty3.getHourlyRate();
        double double17 = faculty3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 30.0d + "'", double5 == 30.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 30.0d + "'", double16 == 30.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 30.0d + "'", double17 == 30.0d);
    }

    @Test
    public void test19739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19739");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        faculty3.logout();
        faculty3.login("hi!", "hi!");
        faculty3.viewProfile();
        java.lang.String str9 = faculty3.getPassword();
        java.lang.String str10 = faculty3.getID();
        faculty3.logout();
        boolean boolean12 = faculty3.isVerified();
        java.lang.String str13 = faculty3.getID();
        faculty3.setVerified(true);
        java.lang.String str16 = faculty3.getEmail();
        faculty3.viewProfile();
        faculty3.viewProfile();
        java.lang.String str19 = faculty3.getPassword();
        faculty3.logout();
        faculty3.logout();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test19740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19740");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        java.lang.String str7 = faculty3.getID();
        double double8 = faculty3.getHourlyRate();
        boolean boolean9 = faculty3.isVerified();
        faculty3.login("", "faculty");
        java.lang.String str13 = faculty3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test19741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19741");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        faculty3.setVerified(false);
        java.lang.String str10 = faculty3.getID();
        java.lang.String str11 = faculty3.getAccountType();
        java.lang.String str12 = faculty3.getPassword();
        faculty3.logout();
        faculty3.setVerified(false);
        java.lang.String str16 = faculty3.getPassword();
        boolean boolean17 = faculty3.isVerified();
        java.lang.String str18 = faculty3.getID();
        java.lang.String str19 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "faculty" + "'", str11, "faculty");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "faculty" + "'", str19, "faculty");
    }

    @Test
    public void test19742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19742");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        double double6 = faculty3.getHourlyRate();
        faculty3.logout();
        faculty3.viewProfile();
        java.lang.String str9 = faculty3.getEmail();
        java.lang.String str10 = faculty3.getEmail();
        faculty3.setVerified(false);
        faculty3.logout();
        boolean boolean14 = faculty3.isVerified();
        faculty3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test19743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19743");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        double double6 = faculty3.getHourlyRate();
        faculty3.logout();
        faculty3.viewProfile();
        java.lang.String str9 = faculty3.getEmail();
        boolean boolean10 = faculty3.isVerified();
        java.lang.String str11 = faculty3.getPassword();
        faculty3.setVerified(false);
        faculty3.viewProfile();
        java.lang.String str15 = faculty3.getAccountType();
        faculty3.login("hi!", "faculty");
        faculty3.logout();
        java.lang.String str20 = faculty3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "faculty" + "'", str15, "faculty");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test19744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19744");
        model.Faculty faculty3 = new model.Faculty("", "", "");
        faculty3.viewProfile();
        java.lang.String str5 = faculty3.getEmail();
        java.lang.String str6 = faculty3.getEmail();
        faculty3.login("hi!", "hi!");
        boolean boolean10 = faculty3.isVerified();
        double double11 = faculty3.getHourlyRate();
        faculty3.viewProfile();
        faculty3.setVerified(true);
        java.lang.String str15 = faculty3.getID();
        faculty3.logout();
        java.lang.String str17 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 30.0d + "'", double11 == 30.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "faculty" + "'", str17, "faculty");
    }

    @Test
    public void test19745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19745");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        faculty3.logout();
        java.lang.String str5 = faculty3.getID();
        java.lang.String str6 = faculty3.getEmail();
        java.lang.String str7 = faculty3.getEmail();
        double double8 = faculty3.getHourlyRate();
        boolean boolean9 = faculty3.isVerified();
        java.lang.String str10 = faculty3.getAccountType();
        faculty3.logout();
        boolean boolean12 = faculty3.isVerified();
        faculty3.setVerified(false);
        faculty3.logout();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "faculty" + "'", str10, "faculty");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test19746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19746");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        java.lang.String str6 = faculty3.getPassword();
        faculty3.setVerified(false);
        java.lang.String str9 = faculty3.getAccountType();
        double double10 = faculty3.getHourlyRate();
        double double11 = faculty3.getHourlyRate();
        java.lang.String str12 = faculty3.getAccountType();
        faculty3.login("", "");
        java.lang.String str16 = faculty3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "faculty" + "'", str9, "faculty");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 30.0d + "'", double10 == 30.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 30.0d + "'", double11 == 30.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "faculty" + "'", str12, "faculty");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test19747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19747");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getAccountType();
        faculty3.logout();
        java.lang.String str8 = faculty3.getEmail();
        faculty3.viewProfile();
        java.lang.String str10 = faculty3.getID();
        java.lang.String str11 = faculty3.getPassword();
        boolean boolean12 = faculty3.isVerified();
        java.lang.String str13 = faculty3.getEmail();
        faculty3.setVerified(true);
        faculty3.login("", "faculty");
        java.lang.String str19 = faculty3.getAccountType();
        java.lang.String str20 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "faculty" + "'", str19, "faculty");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "faculty" + "'", str20, "faculty");
    }

    @Test
    public void test19748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19748");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        boolean boolean7 = faculty3.isVerified();
        java.lang.String str8 = faculty3.getEmail();
        faculty3.logout();
        faculty3.login("hi!", "");
        java.lang.String str13 = faculty3.getEmail();
        java.lang.String str14 = faculty3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test19749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19749");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        java.lang.String str8 = faculty3.getPassword();
        java.lang.String str9 = faculty3.getPassword();
        faculty3.logout();
        java.lang.String str11 = faculty3.getAccountType();
        java.lang.String str12 = faculty3.getEmail();
        faculty3.logout();
        faculty3.login("faculty", "");
        boolean boolean17 = faculty3.isVerified();
        java.lang.String str18 = faculty3.getAccountType();
        faculty3.setVerified(false);
        faculty3.login("hi!", "faculty");
        faculty3.login("hi!", "faculty");
        faculty3.login("hi!", "faculty");
        faculty3.login("hi!", "");
        faculty3.login("hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "faculty" + "'", str11, "faculty");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "faculty" + "'", str18, "faculty");
    }

    @Test
    public void test19750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19750");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        faculty3.setVerified(false);
        java.lang.String str10 = faculty3.getEmail();
        faculty3.logout();
        faculty3.login("faculty", "hi!");
        java.lang.String str15 = faculty3.getPassword();
        faculty3.login("faculty", "");
        double double19 = faculty3.getHourlyRate();
        faculty3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 30.0d + "'", double19 == 30.0d);
    }

    @Test
    public void test19751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19751");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        boolean boolean7 = faculty3.isVerified();
        java.lang.String str8 = faculty3.getEmail();
        faculty3.logout();
        double double10 = faculty3.getHourlyRate();
        faculty3.logout();
        java.lang.String str12 = faculty3.getID();
        faculty3.setVerified(false);
        faculty3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 30.0d + "'", double10 == 30.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test19752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19752");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        faculty3.setVerified(false);
        java.lang.String str10 = faculty3.getAccountType();
        java.lang.String str11 = faculty3.getEmail();
        boolean boolean12 = faculty3.isVerified();
        java.lang.String str13 = faculty3.getPassword();
        java.lang.String str14 = faculty3.getPassword();
        faculty3.viewProfile();
        faculty3.setVerified(true);
        java.lang.String str18 = faculty3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "faculty" + "'", str10, "faculty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test19753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19753");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        double double6 = faculty3.getHourlyRate();
        faculty3.logout();
        faculty3.viewProfile();
        java.lang.String str9 = faculty3.getEmail();
        java.lang.String str10 = faculty3.getEmail();
        java.lang.String str11 = faculty3.getAccountType();
        faculty3.logout();
        java.lang.String str13 = faculty3.getPassword();
        faculty3.logout();
        faculty3.login("hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "faculty" + "'", str11, "faculty");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test19754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19754");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        faculty3.setVerified(false);
        boolean boolean9 = faculty3.isVerified();
        double double10 = faculty3.getHourlyRate();
        java.lang.String str11 = faculty3.getPassword();
        java.lang.String str12 = faculty3.getID();
        boolean boolean13 = faculty3.isVerified();
        faculty3.logout();
        faculty3.login("hi!", "faculty");
        faculty3.viewProfile();
        faculty3.login("", "hi!");
        java.lang.String str22 = faculty3.getPassword();
        java.lang.String str23 = faculty3.getPassword();
        faculty3.logout();
        faculty3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 30.0d + "'", double10 == 30.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test19755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19755");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        faculty3.setVerified(false);
        java.lang.String str6 = faculty3.getEmail();
        faculty3.setVerified(false);
        faculty3.login("faculty", "hi!");
        java.lang.String str12 = faculty3.getPassword();
        faculty3.logout();
        java.lang.String str14 = faculty3.getID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test19756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19756");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        double double6 = faculty3.getHourlyRate();
        faculty3.logout();
        faculty3.viewProfile();
        java.lang.String str9 = faculty3.getEmail();
        boolean boolean10 = faculty3.isVerified();
        java.lang.String str11 = faculty3.getPassword();
        double double12 = faculty3.getHourlyRate();
        java.lang.String str13 = faculty3.getID();
        faculty3.login("", "faculty");
        java.lang.String str17 = faculty3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 30.0d + "'", double12 == 30.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test19757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19757");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        java.lang.String str4 = faculty3.getPassword();
        double double5 = faculty3.getHourlyRate();
        double double6 = faculty3.getHourlyRate();
        faculty3.logout();
        java.lang.String str8 = faculty3.getAccountType();
        double double9 = faculty3.getHourlyRate();
        double double10 = faculty3.getHourlyRate();
        faculty3.login("", "hi!");
        java.lang.String str14 = faculty3.getAccountType();
        double double15 = faculty3.getHourlyRate();
        java.lang.String str16 = faculty3.getEmail();
        java.lang.String str17 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 30.0d + "'", double5 == 30.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "faculty" + "'", str8, "faculty");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 30.0d + "'", double9 == 30.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 30.0d + "'", double10 == 30.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "faculty" + "'", str14, "faculty");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 30.0d + "'", double15 == 30.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "faculty" + "'", str17, "faculty");
    }

    @Test
    public void test19758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19758");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        double double6 = faculty3.getHourlyRate();
        faculty3.logout();
        faculty3.viewProfile();
        java.lang.String str9 = faculty3.getEmail();
        boolean boolean10 = faculty3.isVerified();
        java.lang.String str11 = faculty3.getPassword();
        faculty3.login("", "hi!");
        java.lang.String str15 = faculty3.getPassword();
        boolean boolean16 = faculty3.isVerified();
        double double17 = faculty3.getHourlyRate();
        boolean boolean18 = faculty3.isVerified();
        faculty3.viewProfile();
        faculty3.login("faculty", "hi!");
        double double23 = faculty3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 30.0d + "'", double17 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 30.0d + "'", double23 == 30.0d);
    }

    @Test
    public void test19759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19759");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        faculty3.logout();
        java.lang.String str5 = faculty3.getID();
        java.lang.String str6 = faculty3.getEmail();
        java.lang.String str7 = faculty3.getEmail();
        java.lang.String str8 = faculty3.getEmail();
        boolean boolean9 = faculty3.isVerified();
        faculty3.setVerified(true);
        java.lang.String str12 = faculty3.getEmail();
        faculty3.logout();
        faculty3.logout();
        java.lang.String str15 = faculty3.getEmail();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test19760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19760");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        java.lang.String str6 = faculty3.getPassword();
        faculty3.setVerified(false);
        java.lang.String str9 = faculty3.getAccountType();
        faculty3.setVerified(false);
        java.lang.Class<?> wildcardClass12 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "faculty" + "'", str9, "faculty");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test19761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19761");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        java.lang.String str7 = faculty3.getID();
        java.lang.String str8 = faculty3.getID();
        java.lang.String str9 = faculty3.getID();
        faculty3.setVerified(true);
        boolean boolean12 = faculty3.isVerified();
        java.lang.String str13 = faculty3.getEmail();
        faculty3.login("faculty", "");
        java.lang.String str17 = faculty3.getPassword();
        java.lang.String str18 = faculty3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test19762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19762");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        faculty3.logout();
        java.lang.String str5 = faculty3.getID();
        java.lang.String str6 = faculty3.getEmail();
        double double7 = faculty3.getHourlyRate();
        boolean boolean8 = faculty3.isVerified();
        java.lang.String str9 = faculty3.getID();
        java.lang.String str10 = faculty3.getAccountType();
        faculty3.viewProfile();
        java.lang.String str12 = faculty3.getPassword();
        java.lang.String str13 = faculty3.getEmail();
        java.lang.String str14 = faculty3.getEmail();
        faculty3.logout();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "faculty" + "'", str10, "faculty");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test19763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19763");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        faculty3.setVerified(false);
        java.lang.String str10 = faculty3.getID();
        java.lang.String str11 = faculty3.getAccountType();
        java.lang.String str12 = faculty3.getPassword();
        faculty3.logout();
        faculty3.viewProfile();
        java.lang.String str15 = faculty3.getAccountType();
        java.lang.String str16 = faculty3.getID();
        faculty3.login("", "hi!");
        java.lang.String str20 = faculty3.getID();
        boolean boolean21 = faculty3.isVerified();
        java.lang.String str22 = faculty3.getPassword();
        faculty3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "faculty" + "'", str11, "faculty");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "faculty" + "'", str15, "faculty");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test19764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19764");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        java.lang.String str7 = faculty3.getID();
        faculty3.setVerified(true);
        java.lang.String str10 = faculty3.getEmail();
        faculty3.setVerified(true);
        java.lang.String str13 = faculty3.getAccountType();
        java.lang.String str14 = faculty3.getID();
        faculty3.login("faculty", "hi!");
        java.lang.String str18 = faculty3.getID();
        java.lang.String str19 = faculty3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "faculty" + "'", str13, "faculty");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test19765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19765");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        java.lang.String str4 = faculty3.getAccountType();
        java.lang.String str5 = faculty3.getID();
        faculty3.login("", "faculty");
        double double9 = faculty3.getHourlyRate();
        faculty3.login("hi!", "");
        faculty3.logout();
        faculty3.logout();
        double double15 = faculty3.getHourlyRate();
        java.lang.String str16 = faculty3.getPassword();
        java.lang.String str17 = faculty3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "faculty" + "'", str4, "faculty");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 30.0d + "'", double9 == 30.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 30.0d + "'", double15 == 30.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test19766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19766");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        double double6 = faculty3.getHourlyRate();
        faculty3.logout();
        faculty3.viewProfile();
        java.lang.String str9 = faculty3.getEmail();
        boolean boolean10 = faculty3.isVerified();
        java.lang.String str11 = faculty3.getPassword();
        faculty3.setVerified(false);
        faculty3.viewProfile();
        boolean boolean15 = faculty3.isVerified();
        faculty3.viewProfile();
        java.lang.String str17 = faculty3.getAccountType();
        java.lang.String str18 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "faculty" + "'", str17, "faculty");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "faculty" + "'", str18, "faculty");
    }

    @Test
    public void test19767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19767");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getAccountType();
        faculty3.logout();
        double double8 = faculty3.getHourlyRate();
        java.lang.String str9 = faculty3.getEmail();
        java.lang.String str10 = faculty3.getPassword();
        faculty3.logout();
        java.lang.String str12 = faculty3.getPassword();
        double double13 = faculty3.getHourlyRate();
        java.lang.String str14 = faculty3.getAccountType();
        faculty3.logout();
        faculty3.viewProfile();
        java.lang.String str17 = faculty3.getID();
        java.lang.String str18 = faculty3.getAccountType();
        faculty3.login("", "");
        java.lang.String str22 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 30.0d + "'", double13 == 30.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "faculty" + "'", str14, "faculty");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "faculty" + "'", str18, "faculty");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "faculty" + "'", str22, "faculty");
    }

    @Test
    public void test19768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19768");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        java.lang.String str4 = faculty3.getAccountType();
        java.lang.String str5 = faculty3.getID();
        faculty3.setVerified(true);
        boolean boolean8 = faculty3.isVerified();
        faculty3.setVerified(false);
        java.lang.String str11 = faculty3.getAccountType();
        faculty3.logout();
        java.lang.String str13 = faculty3.getID();
        double double14 = faculty3.getHourlyRate();
        java.lang.String str15 = faculty3.getPassword();
        faculty3.setVerified(true);
        faculty3.logout();
        java.lang.String str19 = faculty3.getPassword();
        java.lang.String str20 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "faculty" + "'", str4, "faculty");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "faculty" + "'", str11, "faculty");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 30.0d + "'", double14 == 30.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "faculty" + "'", str20, "faculty");
    }

    @Test
    public void test19769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19769");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        faculty3.setVerified(false);
        java.lang.String str10 = faculty3.getAccountType();
        java.lang.String str11 = faculty3.getEmail();
        faculty3.logout();
        faculty3.setVerified(false);
        faculty3.logout();
        java.lang.String str16 = faculty3.getEmail();
        java.lang.String str17 = faculty3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "faculty" + "'", str10, "faculty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test19770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19770");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        java.lang.String str7 = faculty3.getID();
        faculty3.setVerified(true);
        java.lang.String str10 = faculty3.getEmail();
        faculty3.setVerified(true);
        boolean boolean13 = faculty3.isVerified();
        faculty3.setVerified(false);
        boolean boolean16 = faculty3.isVerified();
        boolean boolean17 = faculty3.isVerified();
        faculty3.login("faculty", "faculty");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test19771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19771");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        java.lang.String str7 = faculty3.getID();
        faculty3.setVerified(true);
        java.lang.String str10 = faculty3.getEmail();
        faculty3.setVerified(true);
        java.lang.String str13 = faculty3.getID();
        boolean boolean14 = faculty3.isVerified();
        java.lang.String str15 = faculty3.getPassword();
        java.lang.String str16 = faculty3.getEmail();
        java.lang.String str17 = faculty3.getPassword();
        faculty3.setVerified(false);
        faculty3.login("", "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test19772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19772");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        faculty3.logout();
        faculty3.login("hi!", "hi!");
        double double8 = faculty3.getHourlyRate();
        boolean boolean9 = faculty3.isVerified();
        java.lang.String str10 = faculty3.getAccountType();
        java.lang.String str11 = faculty3.getPassword();
        java.lang.String str12 = faculty3.getPassword();
        faculty3.login("hi!", "faculty");
        faculty3.login("hi!", "faculty");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "faculty" + "'", str10, "faculty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test19773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19773");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.login("", "");
        java.lang.String str10 = faculty3.getAccountType();
        java.lang.String str11 = faculty3.getPassword();
        faculty3.viewProfile();
        faculty3.login("", "faculty");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "faculty" + "'", str10, "faculty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test19774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19774");
        model.Faculty faculty3 = new model.Faculty("faculty", "hi!", "hi!");
        java.lang.String str4 = faculty3.getAccountType();
        double double5 = faculty3.getHourlyRate();
        faculty3.setVerified(true);
        boolean boolean8 = faculty3.isVerified();
        boolean boolean9 = faculty3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "faculty" + "'", str4, "faculty");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 30.0d + "'", double5 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test19775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19775");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        faculty3.logout();
        java.lang.String str5 = faculty3.getID();
        java.lang.String str6 = faculty3.getEmail();
        double double7 = faculty3.getHourlyRate();
        boolean boolean8 = faculty3.isVerified();
        java.lang.String str9 = faculty3.getPassword();
        java.lang.String str10 = faculty3.getEmail();
        java.lang.String str11 = faculty3.getAccountType();
        double double12 = faculty3.getHourlyRate();
        faculty3.viewProfile();
        java.lang.String str14 = faculty3.getID();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "faculty" + "'", str11, "faculty");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 30.0d + "'", double12 == 30.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test19776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19776");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        double double6 = faculty3.getHourlyRate();
        faculty3.logout();
        faculty3.viewProfile();
        java.lang.String str9 = faculty3.getEmail();
        boolean boolean10 = faculty3.isVerified();
        java.lang.String str11 = faculty3.getPassword();
        faculty3.login("", "hi!");
        double double15 = faculty3.getHourlyRate();
        faculty3.viewProfile();
        java.lang.String str17 = faculty3.getEmail();
        java.lang.String str18 = faculty3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 30.0d + "'", double15 == 30.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test19777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19777");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        faculty3.setVerified(false);
        java.lang.String str10 = faculty3.getID();
        double double11 = faculty3.getHourlyRate();
        java.lang.String str12 = faculty3.getPassword();
        faculty3.login("hi!", "hi!");
        faculty3.setVerified(true);
        double double18 = faculty3.getHourlyRate();
        boolean boolean19 = faculty3.isVerified();
        faculty3.setVerified(true);
        faculty3.setVerified(true);
        java.lang.String str24 = faculty3.getPassword();
        faculty3.setVerified(false);
        faculty3.viewProfile();
        java.lang.String str28 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 30.0d + "'", double11 == 30.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 30.0d + "'", double18 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "faculty" + "'", str28, "faculty");
    }

    @Test
    public void test19778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19778");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        boolean boolean7 = faculty3.isVerified();
        faculty3.logout();
        faculty3.logout();
        faculty3.viewProfile();
        faculty3.viewProfile();
        double double12 = faculty3.getHourlyRate();
        double double13 = faculty3.getHourlyRate();
        double double14 = faculty3.getHourlyRate();
        faculty3.viewProfile();
        faculty3.logout();
        java.lang.String str17 = faculty3.getID();
        java.lang.String str18 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 30.0d + "'", double12 == 30.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 30.0d + "'", double13 == 30.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 30.0d + "'", double14 == 30.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "faculty" + "'", str18, "faculty");
    }

    @Test
    public void test19779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19779");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getAccountType();
        faculty3.logout();
        java.lang.String str8 = faculty3.getEmail();
        faculty3.viewProfile();
        java.lang.String str10 = faculty3.getID();
        java.lang.String str11 = faculty3.getPassword();
        boolean boolean12 = faculty3.isVerified();
        java.lang.String str13 = faculty3.getEmail();
        boolean boolean14 = faculty3.isVerified();
        faculty3.viewProfile();
        double double16 = faculty3.getHourlyRate();
        faculty3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 30.0d + "'", double16 == 30.0d);
    }

    @Test
    public void test19780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19780");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        java.lang.String str7 = faculty3.getID();
        faculty3.setVerified(true);
        java.lang.String str10 = faculty3.getEmail();
        faculty3.setVerified(false);
        faculty3.logout();
        java.lang.String str14 = faculty3.getEmail();
        java.lang.String str15 = faculty3.getPassword();
        double double16 = faculty3.getHourlyRate();
        faculty3.setVerified(true);
        boolean boolean19 = faculty3.isVerified();
        faculty3.setVerified(false);
        faculty3.login("hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 30.0d + "'", double16 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test19781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19781");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        java.lang.String str7 = faculty3.getID();
        faculty3.setVerified(true);
        java.lang.String str10 = faculty3.getEmail();
        java.lang.String str11 = faculty3.getPassword();
        faculty3.login("faculty", "faculty");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test19782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19782");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        faculty3.logout();
        java.lang.String str5 = faculty3.getID();
        java.lang.String str6 = faculty3.getEmail();
        java.lang.String str7 = faculty3.getPassword();
        java.lang.String str8 = faculty3.getID();
        faculty3.logout();
        double double10 = faculty3.getHourlyRate();
        faculty3.setVerified(false);
        double double13 = faculty3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 30.0d + "'", double10 == 30.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 30.0d + "'", double13 == 30.0d);
    }

    @Test
    public void test19783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19783");
        model.Faculty faculty3 = new model.Faculty("faculty", "", "hi!");
        java.lang.String str4 = faculty3.getAccountType();
        faculty3.setVerified(false);
        double double7 = faculty3.getHourlyRate();
        faculty3.viewProfile();
        faculty3.login("faculty", "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "faculty" + "'", str4, "faculty");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
    }

    @Test
    public void test19784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19784");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.viewProfile();
        java.lang.String str8 = faculty3.getAccountType();
        faculty3.logout();
        faculty3.logout();
        java.lang.String str11 = faculty3.getPassword();
        java.lang.String str12 = faculty3.getID();
        faculty3.viewProfile();
        boolean boolean14 = faculty3.isVerified();
        boolean boolean15 = faculty3.isVerified();
        double double16 = faculty3.getHourlyRate();
        faculty3.login("", "faculty");
        boolean boolean20 = faculty3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "faculty" + "'", str8, "faculty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 30.0d + "'", double16 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test19785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19785");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        double double6 = faculty3.getHourlyRate();
        java.lang.String str7 = faculty3.getPassword();
        faculty3.login("", "faculty");
        boolean boolean11 = faculty3.isVerified();
        double double12 = faculty3.getHourlyRate();
        double double13 = faculty3.getHourlyRate();
        java.lang.String str14 = faculty3.getEmail();
        faculty3.login("", "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 30.0d + "'", double12 == 30.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 30.0d + "'", double13 == 30.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test19786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19786");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        java.lang.String str8 = faculty3.getAccountType();
        faculty3.setVerified(false);
        faculty3.viewProfile();
        java.lang.String str12 = faculty3.getAccountType();
        java.lang.String str13 = faculty3.getID();
        java.lang.String str14 = faculty3.getPassword();
        boolean boolean15 = faculty3.isVerified();
        faculty3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "faculty" + "'", str8, "faculty");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "faculty" + "'", str12, "faculty");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test19787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19787");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        faculty3.setVerified(false);
        java.lang.String str10 = faculty3.getAccountType();
        java.lang.String str11 = faculty3.getEmail();
        boolean boolean12 = faculty3.isVerified();
        faculty3.login("", "faculty");
        double double16 = faculty3.getHourlyRate();
        java.lang.String str17 = faculty3.getID();
        faculty3.logout();
        java.lang.String str19 = faculty3.getAccountType();
        java.lang.String str20 = faculty3.getID();
        faculty3.login("faculty", "");
        faculty3.login("faculty", "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "faculty" + "'", str10, "faculty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 30.0d + "'", double16 == 30.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "faculty" + "'", str19, "faculty");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test19788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19788");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        faculty3.setVerified(false);
        java.lang.String str10 = faculty3.getAccountType();
        java.lang.String str11 = faculty3.getEmail();
        boolean boolean12 = faculty3.isVerified();
        faculty3.login("", "faculty");
        faculty3.login("", "faculty");
        boolean boolean19 = faculty3.isVerified();
        java.lang.String str20 = faculty3.getPassword();
        faculty3.setVerified(false);
        java.lang.String str23 = faculty3.getAccountType();
        java.lang.String str24 = faculty3.getAccountType();
        java.lang.Class<?> wildcardClass25 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "faculty" + "'", str10, "faculty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "faculty" + "'", str23, "faculty");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "faculty" + "'", str24, "faculty");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test19789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19789");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        faculty3.logout();
        faculty3.login("hi!", "hi!");
        java.lang.String str8 = faculty3.getID();
        java.lang.String str9 = faculty3.getPassword();
        java.lang.String str10 = faculty3.getPassword();
        faculty3.logout();
        java.lang.String str12 = faculty3.getPassword();
        java.lang.String str13 = faculty3.getID();
        java.lang.String str14 = faculty3.getID();
        faculty3.logout();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test19790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19790");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        boolean boolean7 = faculty3.isVerified();
        faculty3.logout();
        faculty3.logout();
        faculty3.viewProfile();
        faculty3.logout();
        boolean boolean12 = faculty3.isVerified();
        faculty3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test19791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19791");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        faculty3.setVerified(false);
        java.lang.String str10 = faculty3.getAccountType();
        java.lang.String str11 = faculty3.getEmail();
        boolean boolean12 = faculty3.isVerified();
        java.lang.String str13 = faculty3.getEmail();
        java.lang.String str14 = faculty3.getEmail();
        java.lang.String str15 = faculty3.getPassword();
        faculty3.setVerified(true);
        faculty3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "faculty" + "'", str10, "faculty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test19792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19792");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        boolean boolean7 = faculty3.isVerified();
        faculty3.logout();
        java.lang.String str9 = faculty3.getID();
        faculty3.setVerified(true);
        faculty3.viewProfile();
        double double13 = faculty3.getHourlyRate();
        faculty3.login("", "");
        faculty3.viewProfile();
        faculty3.setVerified(true);
        java.lang.String str20 = faculty3.getID();
        java.lang.String str21 = faculty3.getEmail();
        java.lang.String str22 = faculty3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 30.0d + "'", double13 == 30.0d);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test19793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19793");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        java.lang.String str4 = faculty3.getAccountType();
        java.lang.String str5 = faculty3.getEmail();
        double double6 = faculty3.getHourlyRate();
        faculty3.viewProfile();
        java.lang.String str8 = faculty3.getEmail();
        faculty3.setVerified(false);
        java.lang.String str11 = faculty3.getEmail();
        java.lang.String str12 = faculty3.getAccountType();
        java.lang.String str13 = faculty3.getAccountType();
        java.lang.String str14 = faculty3.getPassword();
        faculty3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "faculty" + "'", str4, "faculty");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "faculty" + "'", str12, "faculty");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "faculty" + "'", str13, "faculty");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test19794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19794");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        double double6 = faculty3.getHourlyRate();
        java.lang.String str7 = faculty3.getPassword();
        java.lang.String str8 = faculty3.getPassword();
        java.lang.String str9 = faculty3.getAccountType();
        faculty3.viewProfile();
        java.lang.String str11 = faculty3.getPassword();
        java.lang.String str12 = faculty3.getID();
        java.lang.String str13 = faculty3.getAccountType();
        java.lang.String str14 = faculty3.getPassword();
        faculty3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "faculty" + "'", str9, "faculty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "faculty" + "'", str13, "faculty");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test19795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19795");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        boolean boolean7 = faculty3.isVerified();
        java.lang.String str8 = faculty3.getID();
        faculty3.logout();
        java.lang.String str10 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "faculty" + "'", str10, "faculty");
    }

    @Test
    public void test19796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19796");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        faculty3.logout();
        faculty3.login("hi!", "hi!");
        double double8 = faculty3.getHourlyRate();
        boolean boolean9 = faculty3.isVerified();
        java.lang.String str10 = faculty3.getAccountType();
        java.lang.String str11 = faculty3.getAccountType();
        double double12 = faculty3.getHourlyRate();
        double double13 = faculty3.getHourlyRate();
        faculty3.logout();
        java.lang.String str15 = faculty3.getAccountType();
        boolean boolean16 = faculty3.isVerified();
        boolean boolean17 = faculty3.isVerified();
        java.lang.String str18 = faculty3.getAccountType();
        java.lang.Class<?> wildcardClass19 = faculty3.getClass();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "faculty" + "'", str10, "faculty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "faculty" + "'", str11, "faculty");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 30.0d + "'", double12 == 30.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 30.0d + "'", double13 == 30.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "faculty" + "'", str15, "faculty");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "faculty" + "'", str18, "faculty");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test19797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19797");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        java.lang.String str4 = faculty3.getAccountType();
        java.lang.String str5 = faculty3.getID();
        faculty3.setVerified(true);
        boolean boolean8 = faculty3.isVerified();
        faculty3.logout();
        faculty3.setVerified(false);
        faculty3.logout();
        java.lang.String str13 = faculty3.getID();
        faculty3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "faculty" + "'", str4, "faculty");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test19798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19798");
        model.Faculty faculty3 = new model.Faculty("hi!", "hi!", "faculty");
        faculty3.login("hi!", "faculty");
        faculty3.viewProfile();
        java.lang.String str8 = faculty3.getEmail();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test19799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19799");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        faculty3.setVerified(false);
        faculty3.viewProfile();
        java.lang.String str7 = faculty3.getEmail();
        java.lang.String str8 = faculty3.getAccountType();
        faculty3.logout();
        boolean boolean10 = faculty3.isVerified();
        faculty3.login("", "hi!");
        faculty3.viewProfile();
        java.lang.String str15 = faculty3.getPassword();
        faculty3.logout();
        java.lang.String str17 = faculty3.getPassword();
        java.lang.String str18 = faculty3.getPassword();
        faculty3.logout();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "faculty" + "'", str8, "faculty");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test19800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19800");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        faculty3.setVerified(false);
        java.lang.String str9 = faculty3.getID();
        faculty3.setVerified(false);
        java.lang.String str12 = faculty3.getID();
        double double13 = faculty3.getHourlyRate();
        boolean boolean14 = faculty3.isVerified();
        faculty3.logout();
        faculty3.logout();
        java.lang.String str17 = faculty3.getAccountType();
        faculty3.viewProfile();
        faculty3.logout();
        java.lang.String str20 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 30.0d + "'", double13 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "faculty" + "'", str17, "faculty");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "faculty" + "'", str20, "faculty");
    }

    @Test
    public void test19801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19801");
        model.Faculty faculty3 = new model.Faculty("", "faculty", "faculty");
        double double4 = faculty3.getHourlyRate();
        double double5 = faculty3.getHourlyRate();
        java.lang.String str6 = faculty3.getID();
        double double7 = faculty3.getHourlyRate();
        java.lang.String str8 = faculty3.getEmail();
        faculty3.login("faculty", "faculty");
        java.lang.String str12 = faculty3.getID();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 30.0d + "'", double4 == 30.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 30.0d + "'", double5 == 30.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "faculty" + "'", str12, "faculty");
    }

    @Test
    public void test19802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19802");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        faculty3.setVerified(false);
        boolean boolean7 = faculty3.isVerified();
        faculty3.logout();
        java.lang.String str9 = faculty3.getPassword();
        java.lang.String str10 = faculty3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test19803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19803");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        faculty3.setVerified(false);
        java.lang.String str9 = faculty3.getID();
        faculty3.setVerified(false);
        faculty3.logout();
        java.lang.String str13 = faculty3.getAccountType();
        java.lang.String str14 = faculty3.getAccountType();
        java.lang.String str15 = faculty3.getID();
        java.lang.String str16 = faculty3.getAccountType();
        faculty3.setVerified(false);
        double double19 = faculty3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "faculty" + "'", str13, "faculty");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "faculty" + "'", str14, "faculty");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "faculty" + "'", str16, "faculty");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 30.0d + "'", double19 == 30.0d);
    }

    @Test
    public void test19804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19804");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        faculty3.logout();
        java.lang.String str5 = faculty3.getID();
        java.lang.String str6 = faculty3.getEmail();
        double double7 = faculty3.getHourlyRate();
        boolean boolean8 = faculty3.isVerified();
        java.lang.String str9 = faculty3.getPassword();
        java.lang.String str10 = faculty3.getID();
        faculty3.setVerified(true);
        faculty3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test19805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19805");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        faculty3.setVerified(false);
        java.lang.String str10 = faculty3.getID();
        double double11 = faculty3.getHourlyRate();
        faculty3.viewProfile();
        faculty3.login("hi!", "faculty");
        faculty3.logout();
        faculty3.setVerified(false);
        faculty3.viewProfile();
        java.lang.String str20 = faculty3.getPassword();
        java.lang.String str21 = faculty3.getAccountType();
        java.lang.String str22 = faculty3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 30.0d + "'", double11 == 30.0d);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "faculty" + "'", str21, "faculty");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test19806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19806");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        faculty3.setVerified(false);
        java.lang.String str9 = faculty3.getID();
        faculty3.setVerified(false);
        java.lang.String str12 = faculty3.getID();
        java.lang.String str13 = faculty3.getAccountType();
        boolean boolean14 = faculty3.isVerified();
        faculty3.setVerified(false);
        faculty3.logout();
        faculty3.setVerified(true);
        faculty3.logout();
        faculty3.login("faculty", "");
        faculty3.login("", "hi!");
        faculty3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "faculty" + "'", str13, "faculty");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test19807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19807");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        java.lang.String str7 = faculty3.getID();
        faculty3.setVerified(true);
        java.lang.String str10 = faculty3.getAccountType();
        java.lang.String str11 = faculty3.getPassword();
        faculty3.login("", "");
        java.lang.String str15 = faculty3.getAccountType();
        faculty3.login("hi!", "faculty");
        java.lang.String str19 = faculty3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "faculty" + "'", str10, "faculty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "faculty" + "'", str15, "faculty");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test19808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19808");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        double double6 = faculty3.getHourlyRate();
        java.lang.String str7 = faculty3.getPassword();
        java.lang.String str8 = faculty3.getPassword();
        faculty3.viewProfile();
        faculty3.login("", "");
        java.lang.String str13 = faculty3.getPassword();
        boolean boolean14 = faculty3.isVerified();
        faculty3.login("", "hi!");
        faculty3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test19809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19809");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getAccountType();
        faculty3.logout();
        faculty3.setVerified(true);
        faculty3.setVerified(true);
        java.lang.String str12 = faculty3.getPassword();
        java.lang.String str13 = faculty3.getEmail();
        double double14 = faculty3.getHourlyRate();
        java.lang.String str15 = faculty3.getPassword();
        faculty3.setVerified(false);
        faculty3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 30.0d + "'", double14 == 30.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test19810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19810");
        model.Faculty faculty3 = new model.Faculty("faculty", "", "faculty");
        double double4 = faculty3.getHourlyRate();
        java.lang.String str5 = faculty3.getID();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 30.0d + "'", double4 == 30.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
    }

    @Test
    public void test19811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19811");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        faculty3.login("", "");
        double double7 = faculty3.getHourlyRate();
        boolean boolean8 = faculty3.isVerified();
        java.lang.String str9 = faculty3.getEmail();
        java.lang.String str10 = faculty3.getEmail();
        faculty3.login("hi!", "");
        faculty3.setVerified(false);
        java.lang.String str16 = faculty3.getID();
        java.lang.String str17 = faculty3.getEmail();
        faculty3.login("faculty", "hi!");
        boolean boolean21 = faculty3.isVerified();
        faculty3.setVerified(false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test19812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19812");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        faculty3.setVerified(false);
        java.lang.String str9 = faculty3.getID();
        faculty3.setVerified(false);
        java.lang.String str12 = faculty3.getID();
        double double13 = faculty3.getHourlyRate();
        boolean boolean14 = faculty3.isVerified();
        faculty3.logout();
        faculty3.setVerified(false);
        java.lang.String str18 = faculty3.getPassword();
        java.lang.String str19 = faculty3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 30.0d + "'", double13 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test19813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19813");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        faculty3.setVerified(false);
        java.lang.String str9 = faculty3.getID();
        faculty3.setVerified(false);
        java.lang.String str12 = faculty3.getID();
        java.lang.String str13 = faculty3.getEmail();
        faculty3.login("", "faculty");
        java.lang.String str17 = faculty3.getPassword();
        faculty3.setVerified(false);
        java.lang.String str20 = faculty3.getAccountType();
        double double21 = faculty3.getHourlyRate();
        faculty3.setVerified(true);
        java.lang.String str24 = faculty3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "faculty" + "'", str20, "faculty");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 30.0d + "'", double21 == 30.0d);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test19814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19814");
        model.Faculty faculty3 = new model.Faculty("", "faculty", "faculty");
        faculty3.viewProfile();
        faculty3.setVerified(false);
        faculty3.setVerified(true);
        java.lang.String str9 = faculty3.getEmail();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test19815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19815");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getAccountType();
        faculty3.logout();
        java.lang.String str8 = faculty3.getEmail();
        faculty3.viewProfile();
        boolean boolean10 = faculty3.isVerified();
        faculty3.viewProfile();
        double double12 = faculty3.getHourlyRate();
        faculty3.logout();
        java.lang.String str14 = faculty3.getAccountType();
        faculty3.viewProfile();
        java.lang.String str16 = faculty3.getEmail();
        java.lang.String str17 = faculty3.getAccountType();
        double double18 = faculty3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 30.0d + "'", double12 == 30.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "faculty" + "'", str14, "faculty");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "faculty" + "'", str17, "faculty");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 30.0d + "'", double18 == 30.0d);
    }

    @Test
    public void test19816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19816");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.viewProfile();
        java.lang.String str8 = faculty3.getAccountType();
        faculty3.logout();
        faculty3.logout();
        java.lang.String str11 = faculty3.getAccountType();
        java.lang.String str12 = faculty3.getEmail();
        faculty3.viewProfile();
        double double14 = faculty3.getHourlyRate();
        faculty3.login("hi!", "hi!");
        double double18 = faculty3.getHourlyRate();
        faculty3.setVerified(true);
        faculty3.setVerified(true);
        faculty3.login("", "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "faculty" + "'", str8, "faculty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "faculty" + "'", str11, "faculty");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 30.0d + "'", double14 == 30.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 30.0d + "'", double18 == 30.0d);
    }

    @Test
    public void test19817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19817");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        faculty3.logout();
        java.lang.String str5 = faculty3.getID();
        java.lang.String str6 = faculty3.getEmail();
        java.lang.String str7 = faculty3.getPassword();
        java.lang.String str8 = faculty3.getID();
        faculty3.logout();
        faculty3.logout();
        faculty3.viewProfile();
        faculty3.login("", "faculty");
        double double15 = faculty3.getHourlyRate();
        java.lang.String str16 = faculty3.getPassword();
        faculty3.logout();
        java.lang.Class<?> wildcardClass18 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 30.0d + "'", double15 == 30.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test19818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19818");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        faculty3.setVerified(false);
        java.lang.String str10 = faculty3.getID();
        faculty3.viewProfile();
        java.lang.String str12 = faculty3.getID();
        java.lang.String str13 = faculty3.getAccountType();
        faculty3.setVerified(false);
        faculty3.viewProfile();
        faculty3.logout();
        java.lang.String str18 = faculty3.getAccountType();
        double double19 = faculty3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "faculty" + "'", str13, "faculty");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "faculty" + "'", str18, "faculty");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 30.0d + "'", double19 == 30.0d);
    }

    @Test
    public void test19819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19819");
        model.Faculty faculty3 = new model.Faculty("hi!", "faculty", "");
        java.lang.String str4 = faculty3.getEmail();
        faculty3.viewProfile();
        faculty3.viewProfile();
        java.lang.String str7 = faculty3.getEmail();
        java.lang.String str8 = faculty3.getAccountType();
        faculty3.login("", "");
        faculty3.setVerified(false);
        faculty3.login("faculty", "faculty");
        boolean boolean17 = faculty3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "faculty" + "'", str8, "faculty");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test19820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19820");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        java.lang.String str8 = faculty3.getPassword();
        faculty3.setVerified(false);
        java.lang.String str11 = faculty3.getEmail();
        java.lang.String str12 = faculty3.getPassword();
        java.lang.String str13 = faculty3.getEmail();
        boolean boolean14 = faculty3.isVerified();
        faculty3.login("", "faculty");
        java.lang.String str18 = faculty3.getAccountType();
        faculty3.login("", "hi!");
        java.lang.String str22 = faculty3.getID();
        java.lang.String str23 = faculty3.getPassword();
        java.lang.String str24 = faculty3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "faculty" + "'", str18, "faculty");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
    }

    @Test
    public void test19821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19821");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        faculty3.logout();
        java.lang.String str5 = faculty3.getID();
        java.lang.String str6 = faculty3.getPassword();
        double double7 = faculty3.getHourlyRate();
        faculty3.setVerified(false);
        java.lang.String str10 = faculty3.getPassword();
        faculty3.viewProfile();
        java.lang.String str12 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "faculty" + "'", str12, "faculty");
    }

    @Test
    public void test19822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19822");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        faculty3.setVerified(false);
        java.lang.String str9 = faculty3.getID();
        faculty3.setVerified(false);
        java.lang.String str12 = faculty3.getID();
        java.lang.String str13 = faculty3.getEmail();
        faculty3.login("", "faculty");
        faculty3.setVerified(true);
        java.lang.String str19 = faculty3.getPassword();
        java.lang.String str20 = faculty3.getPassword();
        java.lang.String str21 = faculty3.getID();
        faculty3.login("", "hi!");
        java.lang.Class<?> wildcardClass25 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test19823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19823");
        model.Faculty faculty3 = new model.Faculty("", "faculty", "faculty");
        faculty3.viewProfile();
        faculty3.viewProfile();
        java.lang.String str6 = faculty3.getAccountType();
        java.lang.String str7 = faculty3.getEmail();
        boolean boolean8 = faculty3.isVerified();
        java.lang.String str9 = faculty3.getPassword();
        faculty3.viewProfile();
        java.lang.Class<?> wildcardClass11 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "faculty" + "'", str9, "faculty");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test19824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19824");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        faculty3.logout();
        java.lang.String str5 = faculty3.getID();
        java.lang.String str6 = faculty3.getEmail();
        faculty3.viewProfile();
        faculty3.login("hi!", "faculty");
        java.lang.String str11 = faculty3.getAccountType();
        faculty3.setVerified(false);
        faculty3.viewProfile();
        java.lang.String str15 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "faculty" + "'", str11, "faculty");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "faculty" + "'", str15, "faculty");
    }

    @Test
    public void test19825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19825");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        java.lang.String str6 = faculty3.getPassword();
        faculty3.setVerified(false);
        boolean boolean9 = faculty3.isVerified();
        java.lang.Class<?> wildcardClass10 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test19826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19826");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        faculty3.setVerified(false);
        java.lang.String str6 = faculty3.getEmail();
        faculty3.setVerified(false);
        faculty3.login("faculty", "hi!");
        java.lang.String str12 = faculty3.getAccountType();
        double double13 = faculty3.getHourlyRate();
        faculty3.setVerified(false);
        java.lang.String str16 = faculty3.getID();
        java.lang.String str17 = faculty3.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "faculty" + "'", str12, "faculty");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 30.0d + "'", double13 == 30.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test19827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19827");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        faculty3.setVerified(false);
        java.lang.String str9 = faculty3.getID();
        faculty3.setVerified(false);
        boolean boolean12 = faculty3.isVerified();
        faculty3.setVerified(true);
        boolean boolean15 = faculty3.isVerified();
        faculty3.login("faculty", "hi!");
        double double19 = faculty3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 30.0d + "'", double19 == 30.0d);
    }

    @Test
    public void test19828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19828");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        java.lang.String str4 = faculty3.getAccountType();
        java.lang.String str5 = faculty3.getID();
        faculty3.setVerified(true);
        boolean boolean8 = faculty3.isVerified();
        faculty3.setVerified(false);
        java.lang.String str11 = faculty3.getAccountType();
        double double12 = faculty3.getHourlyRate();
        java.lang.String str13 = faculty3.getEmail();
        java.lang.String str14 = faculty3.getID();
        faculty3.viewProfile();
        faculty3.setVerified(false);
        boolean boolean18 = faculty3.isVerified();
        java.lang.String str19 = faculty3.getEmail();
        java.lang.String str20 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "faculty" + "'", str4, "faculty");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "faculty" + "'", str11, "faculty");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 30.0d + "'", double12 == 30.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "faculty" + "'", str20, "faculty");
    }

    @Test
    public void test19829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19829");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        faculty3.login("", "faculty");
        java.lang.String str10 = faculty3.getEmail();
        faculty3.login("", "hi!");
        faculty3.setVerified(true);
        java.lang.String str16 = faculty3.getEmail();
        double double17 = faculty3.getHourlyRate();
        boolean boolean18 = faculty3.isVerified();
        java.lang.String str19 = faculty3.getID();
        faculty3.login("", "");
        double double23 = faculty3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 30.0d + "'", double17 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 30.0d + "'", double23 == 30.0d);
    }

    @Test
    public void test19830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19830");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        faculty3.login("", "");
        faculty3.viewProfile();
        faculty3.login("", "");
        double double11 = faculty3.getHourlyRate();
        faculty3.setVerified(true);
        faculty3.login("hi!", "faculty");
        java.lang.String str17 = faculty3.getPassword();
        java.lang.String str18 = faculty3.getID();
        faculty3.logout();
        boolean boolean20 = faculty3.isVerified();
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 30.0d + "'", double11 == 30.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test19831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19831");
        model.Faculty faculty3 = new model.Faculty("faculty", "hi!", "");
        java.lang.String str4 = faculty3.getID();
        double double5 = faculty3.getHourlyRate();
        java.lang.String str6 = faculty3.getID();
        java.lang.String str7 = faculty3.getPassword();
        faculty3.login("faculty", "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 30.0d + "'", double5 == 30.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test19832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19832");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        double double6 = faculty3.getHourlyRate();
        java.lang.String str7 = faculty3.getPassword();
        java.lang.String str8 = faculty3.getPassword();
        faculty3.login("faculty", "hi!");
        faculty3.login("", "hi!");
        faculty3.login("", "hi!");
        faculty3.login("", "");
        double double21 = faculty3.getHourlyRate();
        faculty3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 30.0d + "'", double21 == 30.0d);
    }

    @Test
    public void test19833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19833");
        model.Faculty faculty3 = new model.Faculty("hi!", "hi!", "hi!");
        faculty3.viewProfile();
        java.lang.String str5 = faculty3.getPassword();
        boolean boolean6 = faculty3.isVerified();
        double double7 = faculty3.getHourlyRate();
        boolean boolean8 = faculty3.isVerified();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test19834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19834");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        faculty3.setVerified(false);
        faculty3.viewProfile();
        java.lang.String str7 = faculty3.getEmail();
        java.lang.String str8 = faculty3.getAccountType();
        java.lang.String str9 = faculty3.getID();
        java.lang.String str10 = faculty3.getAccountType();
        faculty3.logout();
        java.lang.String str12 = faculty3.getID();
        java.lang.String str13 = faculty3.getAccountType();
        faculty3.viewProfile();
        faculty3.logout();
        double double16 = faculty3.getHourlyRate();
        faculty3.setVerified(false);
        faculty3.login("hi!", "faculty");
        java.lang.String str22 = faculty3.getID();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "faculty" + "'", str8, "faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "faculty" + "'", str10, "faculty");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "faculty" + "'", str13, "faculty");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 30.0d + "'", double16 == 30.0d);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test19835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19835");
        model.Faculty faculty3 = new model.Faculty("hi!", "hi!", "");
        faculty3.logout();
        java.lang.String str5 = faculty3.getEmail();
        boolean boolean6 = faculty3.isVerified();
        faculty3.login("", "faculty");
        double double10 = faculty3.getHourlyRate();
        faculty3.setVerified(false);
        faculty3.logout();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 30.0d + "'", double10 == 30.0d);
    }

    @Test
    public void test19836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19836");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        java.lang.String str4 = faculty3.getAccountType();
        java.lang.String str5 = faculty3.getEmail();
        double double6 = faculty3.getHourlyRate();
        boolean boolean7 = faculty3.isVerified();
        faculty3.logout();
        java.lang.String str9 = faculty3.getEmail();
        faculty3.setVerified(false);
        boolean boolean12 = faculty3.isVerified();
        faculty3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "faculty" + "'", str4, "faculty");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test19837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19837");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        faculty3.setVerified(false);
        java.lang.String str6 = faculty3.getPassword();
        java.lang.String str7 = faculty3.getAccountType();
        java.lang.String str8 = faculty3.getEmail();
        java.lang.String str9 = faculty3.getAccountType();
        java.lang.String str10 = faculty3.getPassword();
        java.lang.String str11 = faculty3.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "faculty" + "'", str7, "faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "faculty" + "'", str9, "faculty");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test19838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19838");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.login("", "");
        faculty3.login("faculty", "faculty");
        java.lang.String str13 = faculty3.getAccountType();
        java.lang.String str14 = faculty3.getEmail();
        java.lang.String str15 = faculty3.getEmail();
        faculty3.logout();
        java.lang.String str17 = faculty3.getAccountType();
        faculty3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "faculty" + "'", str13, "faculty");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "faculty" + "'", str17, "faculty");
    }

    @Test
    public void test19839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19839");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.login("", "");
        faculty3.login("faculty", "faculty");
        java.lang.String str13 = faculty3.getAccountType();
        faculty3.login("", "hi!");
        double double17 = faculty3.getHourlyRate();
        faculty3.viewProfile();
        faculty3.login("faculty", "");
        faculty3.viewProfile();
        java.lang.String str23 = faculty3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "faculty" + "'", str13, "faculty");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 30.0d + "'", double17 == 30.0d);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test19840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19840");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.viewProfile();
        faculty3.login("faculty", "");
        java.lang.String str11 = faculty3.getAccountType();
        faculty3.login("hi!", "faculty");
        faculty3.setVerified(false);
        faculty3.viewProfile();
        java.lang.String str18 = faculty3.getAccountType();
        java.lang.String str19 = faculty3.getEmail();
        java.lang.String str20 = faculty3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "faculty" + "'", str11, "faculty");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "faculty" + "'", str18, "faculty");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test19841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19841");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        faculty3.setVerified(false);
        faculty3.viewProfile();
        java.lang.String str7 = faculty3.getEmail();
        faculty3.login("hi!", "hi!");
        java.lang.String str11 = faculty3.getEmail();
        faculty3.login("faculty", "hi!");
        faculty3.setVerified(true);
        java.lang.Class<?> wildcardClass17 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test19842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19842");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        java.lang.String str6 = faculty3.getPassword();
        faculty3.setVerified(false);
        java.lang.String str9 = faculty3.getAccountType();
        double double10 = faculty3.getHourlyRate();
        double double11 = faculty3.getHourlyRate();
        faculty3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "faculty" + "'", str9, "faculty");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 30.0d + "'", double10 == 30.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 30.0d + "'", double11 == 30.0d);
    }

    @Test
    public void test19843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19843");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        java.lang.String str7 = faculty3.getID();
        faculty3.setVerified(true);
        java.lang.String str10 = faculty3.getAccountType();
        java.lang.String str11 = faculty3.getPassword();
        faculty3.login("", "");
        double double15 = faculty3.getHourlyRate();
        boolean boolean16 = faculty3.isVerified();
        boolean boolean17 = faculty3.isVerified();
        faculty3.viewProfile();
        boolean boolean19 = faculty3.isVerified();
        double double20 = faculty3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "faculty" + "'", str10, "faculty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 30.0d + "'", double15 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 30.0d + "'", double20 == 30.0d);
    }

    @Test
    public void test19844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19844");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        faculty3.setVerified(false);
        java.lang.String str9 = faculty3.getID();
        faculty3.setVerified(false);
        java.lang.String str12 = faculty3.getID();
        java.lang.String str13 = faculty3.getID();
        java.lang.String str14 = faculty3.getID();
        faculty3.logout();
        faculty3.logout();
        faculty3.setVerified(true);
        java.lang.String str19 = faculty3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test19845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19845");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getAccountType();
        java.lang.String str7 = faculty3.getAccountType();
        java.lang.String str8 = faculty3.getEmail();
        faculty3.logout();
        faculty3.login("faculty", "hi!");
        java.lang.String str13 = faculty3.getID();
        java.lang.String str14 = faculty3.getEmail();
        java.lang.String str15 = faculty3.getAccountType();
        boolean boolean16 = faculty3.isVerified();
        java.lang.String str17 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "faculty" + "'", str7, "faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "faculty" + "'", str15, "faculty");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "faculty" + "'", str17, "faculty");
    }

    @Test
    public void test19846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19846");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        faculty3.setVerified(false);
        java.lang.String str10 = faculty3.getID();
        double double11 = faculty3.getHourlyRate();
        java.lang.String str12 = faculty3.getPassword();
        boolean boolean13 = faculty3.isVerified();
        boolean boolean14 = faculty3.isVerified();
        faculty3.logout();
        faculty3.setVerified(true);
        java.lang.Class<?> wildcardClass18 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 30.0d + "'", double11 == 30.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test19847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19847");
        model.Faculty faculty3 = new model.Faculty("", "faculty", "faculty");
        faculty3.setVerified(true);
        java.lang.String str6 = faculty3.getPassword();
        boolean boolean7 = faculty3.isVerified();
        java.lang.String str8 = faculty3.getPassword();
        boolean boolean9 = faculty3.isVerified();
        faculty3.login("faculty", "hi!");
        faculty3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "faculty" + "'", str8, "faculty");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test19848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19848");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        java.lang.String str8 = faculty3.getPassword();
        faculty3.logout();
        java.lang.String str10 = faculty3.getID();
        faculty3.login("faculty", "");
        faculty3.setVerified(false);
        java.lang.String str16 = faculty3.getID();
        java.lang.String str17 = faculty3.getAccountType();
        java.lang.String str18 = faculty3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "faculty" + "'", str17, "faculty");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test19849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19849");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        faculty3.setVerified(false);
        faculty3.viewProfile();
        java.lang.String str7 = faculty3.getEmail();
        java.lang.String str8 = faculty3.getAccountType();
        java.lang.String str9 = faculty3.getID();
        faculty3.viewProfile();
        faculty3.login("", "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "faculty" + "'", str8, "faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test19850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19850");
        model.Faculty faculty3 = new model.Faculty("hi!", "hi!", "hi!");
        faculty3.login("hi!", "faculty");
        faculty3.logout();
        java.lang.String str8 = faculty3.getPassword();
        faculty3.logout();
        faculty3.login("faculty", "hi!");
        java.lang.String str13 = faculty3.getPassword();
        java.lang.String str14 = faculty3.getPassword();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test19851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19851");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        faculty3.logout();
        java.lang.String str5 = faculty3.getID();
        java.lang.String str6 = faculty3.getEmail();
        java.lang.String str7 = faculty3.getPassword();
        java.lang.String str8 = faculty3.getID();
        faculty3.logout();
        faculty3.logout();
        faculty3.viewProfile();
        java.lang.String str12 = faculty3.getAccountType();
        faculty3.viewProfile();
        boolean boolean14 = faculty3.isVerified();
        java.lang.String str15 = faculty3.getPassword();
        java.lang.String str16 = faculty3.getPassword();
        faculty3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "faculty" + "'", str12, "faculty");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test19852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19852");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        java.lang.String str8 = faculty3.getEmail();
        java.lang.String str9 = faculty3.getID();
        faculty3.logout();
        faculty3.logout();
        java.lang.String str12 = faculty3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test19853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19853");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        faculty3.logout();
        faculty3.login("hi!", "hi!");
        faculty3.viewProfile();
        java.lang.String str9 = faculty3.getPassword();
        java.lang.String str10 = faculty3.getID();
        faculty3.logout();
        faculty3.login("", "faculty");
        java.lang.String str15 = faculty3.getID();
        java.lang.String str16 = faculty3.getEmail();
        faculty3.login("faculty", "hi!");
        double double20 = faculty3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 30.0d + "'", double20 == 30.0d);
    }

    @Test
    public void test19854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19854");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        faculty3.setVerified(false);
        java.lang.String str9 = faculty3.getID();
        faculty3.setVerified(false);
        faculty3.logout();
        faculty3.setVerified(false);
        faculty3.logout();
        java.lang.String str16 = faculty3.getEmail();
        java.lang.String str17 = faculty3.getAccountType();
        double double18 = faculty3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "faculty" + "'", str17, "faculty");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 30.0d + "'", double18 == 30.0d);
    }

    @Test
    public void test19855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19855");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        java.lang.String str7 = faculty3.getID();
        faculty3.setVerified(true);
        java.lang.String str10 = faculty3.getEmail();
        faculty3.setVerified(true);
        faculty3.logout();
        java.lang.String str14 = faculty3.getAccountType();
        java.lang.String str15 = faculty3.getID();
        faculty3.logout();
        java.lang.String str17 = faculty3.getEmail();
        faculty3.setVerified(true);
        java.lang.String str20 = faculty3.getAccountType();
        java.lang.String str21 = faculty3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "faculty" + "'", str14, "faculty");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "faculty" + "'", str20, "faculty");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test19856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19856");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        java.lang.String str8 = faculty3.getPassword();
        java.lang.String str9 = faculty3.getPassword();
        faculty3.logout();
        java.lang.String str11 = faculty3.getAccountType();
        faculty3.logout();
        faculty3.viewProfile();
        boolean boolean14 = faculty3.isVerified();
        faculty3.logout();
        java.lang.String str16 = faculty3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "faculty" + "'", str11, "faculty");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test19857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19857");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        faculty3.setVerified(false);
        faculty3.viewProfile();
        java.lang.String str7 = faculty3.getEmail();
        java.lang.String str8 = faculty3.getAccountType();
        java.lang.String str9 = faculty3.getID();
        java.lang.String str10 = faculty3.getPassword();
        double double11 = faculty3.getHourlyRate();
        faculty3.viewProfile();
        double double13 = faculty3.getHourlyRate();
        boolean boolean14 = faculty3.isVerified();
        java.lang.String str15 = faculty3.getAccountType();
        java.lang.String str16 = faculty3.getAccountType();
        java.lang.String str17 = faculty3.getPassword();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "faculty" + "'", str8, "faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 30.0d + "'", double11 == 30.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 30.0d + "'", double13 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "faculty" + "'", str15, "faculty");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "faculty" + "'", str16, "faculty");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test19858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19858");
        model.Faculty faculty3 = new model.Faculty("", "faculty", "");
        faculty3.setVerified(true);
        faculty3.login("", "hi!");
        faculty3.viewProfile();
        java.lang.String str10 = faculty3.getID();
        faculty3.viewProfile();
        double double12 = faculty3.getHourlyRate();
        boolean boolean13 = faculty3.isVerified();
        java.lang.String str14 = faculty3.getID();
        double double15 = faculty3.getHourlyRate();
        java.lang.String str16 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 30.0d + "'", double12 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 30.0d + "'", double15 == 30.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "faculty" + "'", str16, "faculty");
    }

    @Test
    public void test19859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19859");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        double double8 = faculty3.getHourlyRate();
        boolean boolean9 = faculty3.isVerified();
        faculty3.logout();
        boolean boolean11 = faculty3.isVerified();
        faculty3.setVerified(true);
        faculty3.logout();
        double double15 = faculty3.getHourlyRate();
        java.lang.String str16 = faculty3.getAccountType();
        boolean boolean17 = faculty3.isVerified();
        faculty3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 30.0d + "'", double15 == 30.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "faculty" + "'", str16, "faculty");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test19860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19860");
        model.Faculty faculty3 = new model.Faculty("hi!", "hi!", "");
        faculty3.viewProfile();
        java.lang.String str5 = faculty3.getAccountType();
        java.lang.String str6 = faculty3.getEmail();
        java.lang.String str7 = faculty3.getEmail();
        faculty3.login("", "");
        double double11 = faculty3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 30.0d + "'", double11 == 30.0d);
    }

    @Test
    public void test19861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19861");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        faculty3.logout();
        java.lang.String str5 = faculty3.getID();
        java.lang.String str6 = faculty3.getEmail();
        java.lang.String str7 = faculty3.getPassword();
        java.lang.String str8 = faculty3.getID();
        faculty3.logout();
        java.lang.String str10 = faculty3.getPassword();
        faculty3.login("", "");
        boolean boolean14 = faculty3.isVerified();
        faculty3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test19862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19862");
        model.Faculty faculty3 = new model.Faculty("hi!", "faculty", "");
        java.lang.String str4 = faculty3.getEmail();
        faculty3.viewProfile();
        faculty3.logout();
        faculty3.viewProfile();
        faculty3.viewProfile();
        java.lang.String str9 = faculty3.getAccountType();
        java.lang.String str10 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "faculty" + "'", str9, "faculty");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "faculty" + "'", str10, "faculty");
    }

    @Test
    public void test19863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19863");
        model.Faculty faculty3 = new model.Faculty("hi!", "faculty", "");
        java.lang.String str4 = faculty3.getEmail();
        faculty3.viewProfile();
        faculty3.logout();
        double double7 = faculty3.getHourlyRate();
        boolean boolean8 = faculty3.isVerified();
        boolean boolean9 = faculty3.isVerified();
        faculty3.login("", "faculty");
        faculty3.viewProfile();
        double double14 = faculty3.getHourlyRate();
        java.lang.String str15 = faculty3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 30.0d + "'", double14 == 30.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test19864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19864");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getAccountType();
        faculty3.logout();
        boolean boolean8 = faculty3.isVerified();
        faculty3.logout();
        double double10 = faculty3.getHourlyRate();
        faculty3.logout();
        faculty3.logout();
        java.lang.String str13 = faculty3.getAccountType();
        java.lang.String str14 = faculty3.getID();
        faculty3.logout();
        faculty3.login("faculty", "");
        faculty3.setVerified(false);
        faculty3.login("faculty", "faculty");
        faculty3.setVerified(true);
        java.lang.String str26 = faculty3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 30.0d + "'", double10 == 30.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "faculty" + "'", str13, "faculty");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
    }

    @Test
    public void test19865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19865");
        model.Faculty faculty3 = new model.Faculty("", "faculty", "faculty");
        faculty3.setVerified(true);
        java.lang.String str6 = faculty3.getPassword();
        boolean boolean7 = faculty3.isVerified();
        java.lang.String str8 = faculty3.getEmail();
        boolean boolean9 = faculty3.isVerified();
        java.lang.String str10 = faculty3.getAccountType();
        java.lang.String str11 = faculty3.getEmail();
        java.lang.String str12 = faculty3.getPassword();
        java.lang.String str13 = faculty3.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "faculty" + "'", str10, "faculty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "faculty" + "'", str12, "faculty");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "faculty" + "'", str13, "faculty");
    }

    @Test
    public void test19866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19866");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        faculty3.setVerified(false);
        java.lang.String str6 = faculty3.getPassword();
        java.lang.String str7 = faculty3.getAccountType();
        faculty3.viewProfile();
        faculty3.logout();
        faculty3.logout();
        boolean boolean11 = faculty3.isVerified();
        faculty3.viewProfile();
        faculty3.login("faculty", "faculty");
        faculty3.logout();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "faculty" + "'", str7, "faculty");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test19867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19867");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        faculty3.setVerified(false);
        java.lang.String str10 = faculty3.getID();
        faculty3.viewProfile();
        java.lang.String str12 = faculty3.getID();
        java.lang.String str13 = faculty3.getAccountType();
        faculty3.login("faculty", "hi!");
        double double17 = faculty3.getHourlyRate();
        faculty3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "faculty" + "'", str13, "faculty");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 30.0d + "'", double17 == 30.0d);
    }

    @Test
    public void test19868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19868");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        faculty3.setVerified(false);
        java.lang.String str10 = faculty3.getAccountType();
        java.lang.String str11 = faculty3.getEmail();
        boolean boolean12 = faculty3.isVerified();
        java.lang.String str13 = faculty3.getEmail();
        java.lang.String str14 = faculty3.getEmail();
        faculty3.viewProfile();
        java.lang.String str16 = faculty3.getEmail();
        double double17 = faculty3.getHourlyRate();
        java.lang.String str18 = faculty3.getEmail();
        java.lang.Class<?> wildcardClass19 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "faculty" + "'", str10, "faculty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 30.0d + "'", double17 == 30.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test19869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19869");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        faculty3.setVerified(false);
        java.lang.String str10 = faculty3.getID();
        double double11 = faculty3.getHourlyRate();
        java.lang.String str12 = faculty3.getPassword();
        faculty3.login("hi!", "hi!");
        faculty3.setVerified(true);
        double double18 = faculty3.getHourlyRate();
        boolean boolean19 = faculty3.isVerified();
        faculty3.setVerified(true);
        java.lang.String str22 = faculty3.getPassword();
        double double23 = faculty3.getHourlyRate();
        faculty3.logout();
        java.lang.String str25 = faculty3.getAccountType();
        faculty3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 30.0d + "'", double11 == 30.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 30.0d + "'", double18 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 30.0d + "'", double23 == 30.0d);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "faculty" + "'", str25, "faculty");
    }

    @Test
    public void test19870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19870");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        faculty3.logout();
        faculty3.login("hi!", "hi!");
        double double8 = faculty3.getHourlyRate();
        java.lang.String str9 = faculty3.getID();
        java.lang.String str10 = faculty3.getAccountType();
        faculty3.setVerified(true);
        faculty3.login("hi!", "hi!");
        faculty3.viewProfile();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "faculty" + "'", str10, "faculty");
    }

    @Test
    public void test19871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19871");
        model.Faculty faculty3 = new model.Faculty("hi!", "hi!", "");
        faculty3.logout();
        java.lang.String str5 = faculty3.getEmail();
        java.lang.String str6 = faculty3.getAccountType();
        java.lang.String str7 = faculty3.getPassword();
        faculty3.viewProfile();
        faculty3.logout();
        java.lang.String str10 = faculty3.getAccountType();
        faculty3.logout();
        faculty3.viewProfile();
        java.lang.String str13 = faculty3.getEmail();
        faculty3.login("hi!", "");
        boolean boolean17 = faculty3.isVerified();
        faculty3.login("", "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "faculty" + "'", str10, "faculty");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test19872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19872");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        faculty3.logout();
        java.lang.String str5 = faculty3.getID();
        java.lang.String str6 = faculty3.getEmail();
        java.lang.String str7 = faculty3.getEmail();
        java.lang.String str8 = faculty3.getEmail();
        java.lang.String str9 = faculty3.getAccountType();
        boolean boolean10 = faculty3.isVerified();
        faculty3.setVerified(false);
        boolean boolean13 = faculty3.isVerified();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "faculty" + "'", str9, "faculty");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test19873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19873");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        faculty3.setVerified(true);
        faculty3.logout();
        faculty3.setVerified(false);
        boolean boolean13 = faculty3.isVerified();
        faculty3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test19874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19874");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        faculty3.setVerified(false);
        faculty3.viewProfile();
        java.lang.String str7 = faculty3.getEmail();
        java.lang.String str8 = faculty3.getID();
        double double9 = faculty3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 30.0d + "'", double9 == 30.0d);
    }

    @Test
    public void test19875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19875");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        faculty3.logout();
        java.lang.String str5 = faculty3.getID();
        java.lang.String str6 = faculty3.getEmail();
        java.lang.String str7 = faculty3.getPassword();
        java.lang.String str8 = faculty3.getID();
        faculty3.logout();
        java.lang.String str10 = faculty3.getPassword();
        faculty3.logout();
        java.lang.String str12 = faculty3.getEmail();
        faculty3.setVerified(true);
        java.lang.String str15 = faculty3.getEmail();
        faculty3.logout();
        faculty3.logout();
        java.lang.String str18 = faculty3.getPassword();
        faculty3.login("", "faculty");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test19876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19876");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        java.lang.String str8 = faculty3.getEmail();
        faculty3.viewProfile();
        java.lang.String str10 = faculty3.getPassword();
        java.lang.String str11 = faculty3.getAccountType();
        faculty3.viewProfile();
        faculty3.login("", "faculty");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "faculty" + "'", str11, "faculty");
    }

    @Test
    public void test19877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19877");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        java.lang.String str4 = faculty3.getAccountType();
        java.lang.String str5 = faculty3.getID();
        faculty3.setVerified(true);
        faculty3.login("faculty", "faculty");
        java.lang.String str11 = faculty3.getPassword();
        faculty3.logout();
        faculty3.login("faculty", "");
        faculty3.login("hi!", "hi!");
        double double19 = faculty3.getHourlyRate();
        java.lang.String str20 = faculty3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "faculty" + "'", str4, "faculty");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 30.0d + "'", double19 == 30.0d);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test19878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19878");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        java.lang.String str8 = faculty3.getPassword();
        boolean boolean9 = faculty3.isVerified();
        double double10 = faculty3.getHourlyRate();
        faculty3.logout();
        java.lang.Class<?> wildcardClass12 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 30.0d + "'", double10 == 30.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test19879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19879");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        java.lang.String str7 = faculty3.getID();
        java.lang.String str8 = faculty3.getEmail();
        faculty3.login("", "");
        boolean boolean12 = faculty3.isVerified();
        boolean boolean13 = faculty3.isVerified();
        java.lang.String str14 = faculty3.getPassword();
        java.lang.String str15 = faculty3.getAccountType();
        faculty3.login("faculty", "faculty");
        faculty3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "faculty" + "'", str15, "faculty");
    }

    @Test
    public void test19880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19880");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        faculty3.setVerified(false);
        faculty3.viewProfile();
        java.lang.String str7 = faculty3.getEmail();
        java.lang.String str8 = faculty3.getAccountType();
        faculty3.logout();
        boolean boolean10 = faculty3.isVerified();
        faculty3.login("", "hi!");
        double double14 = faculty3.getHourlyRate();
        faculty3.setVerified(true);
        faculty3.login("", "faculty");
        java.lang.String str20 = faculty3.getID();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "faculty" + "'", str8, "faculty");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 30.0d + "'", double14 == 30.0d);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test19881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19881");
        model.Faculty faculty3 = new model.Faculty("faculty", "hi!", "hi!");
        double double4 = faculty3.getHourlyRate();
        boolean boolean5 = faculty3.isVerified();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 30.0d + "'", double4 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test19882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19882");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        faculty3.setVerified(false);
        java.lang.String str10 = faculty3.getID();
        faculty3.viewProfile();
        faculty3.login("", "");
        java.lang.String str15 = faculty3.getAccountType();
        faculty3.viewProfile();
        faculty3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "faculty" + "'", str15, "faculty");
    }

    @Test
    public void test19883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19883");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        faculty3.login("", "");
        double double7 = faculty3.getHourlyRate();
        faculty3.login("faculty", "faculty");
        java.lang.String str11 = faculty3.getID();
        faculty3.logout();
        double double13 = faculty3.getHourlyRate();
        faculty3.logout();
        faculty3.logout();
        boolean boolean16 = faculty3.isVerified();
        java.lang.String str17 = faculty3.getPassword();
        java.lang.String str18 = faculty3.getPassword();
        double double19 = faculty3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 30.0d + "'", double13 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 30.0d + "'", double19 == 30.0d);
    }

    @Test
    public void test19884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19884");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        java.lang.String str8 = faculty3.getEmail();
        faculty3.viewProfile();
        java.lang.String str10 = faculty3.getID();
        java.lang.String str11 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "faculty" + "'", str11, "faculty");
    }

    @Test
    public void test19885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19885");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        faculty3.setVerified(false);
        java.lang.String str6 = faculty3.getEmail();
        java.lang.String str7 = faculty3.getAccountType();
        faculty3.viewProfile();
        java.lang.String str9 = faculty3.getAccountType();
        java.lang.String str10 = faculty3.getPassword();
        double double11 = faculty3.getHourlyRate();
        java.lang.String str12 = faculty3.getAccountType();
        faculty3.login("", "");
        double double16 = faculty3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "faculty" + "'", str7, "faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "faculty" + "'", str9, "faculty");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 30.0d + "'", double11 == 30.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "faculty" + "'", str12, "faculty");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 30.0d + "'", double16 == 30.0d);
    }

    @Test
    public void test19886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19886");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        faculty3.setVerified(true);
        faculty3.login("hi!", "");
        double double13 = faculty3.getHourlyRate();
        faculty3.viewProfile();
        faculty3.login("", "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 30.0d + "'", double13 == 30.0d);
    }

    @Test
    public void test19887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19887");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        faculty3.logout();
        faculty3.login("hi!", "hi!");
        faculty3.viewProfile();
        faculty3.login("", "faculty");
        boolean boolean12 = faculty3.isVerified();
        java.lang.String str13 = faculty3.getEmail();
        boolean boolean14 = faculty3.isVerified();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test19888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19888");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        faculty3.setVerified(false);
        faculty3.viewProfile();
        java.lang.String str7 = faculty3.getEmail();
        java.lang.String str8 = faculty3.getAccountType();
        java.lang.String str9 = faculty3.getID();
        java.lang.String str10 = faculty3.getID();
        java.lang.String str11 = faculty3.getAccountType();
        faculty3.setVerified(false);
        faculty3.setVerified(false);
        java.lang.String str16 = faculty3.getPassword();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "faculty" + "'", str8, "faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "faculty" + "'", str11, "faculty");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test19889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19889");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        faculty3.logout();
        faculty3.login("hi!", "hi!");
        faculty3.viewProfile();
        java.lang.String str9 = faculty3.getPassword();
        java.lang.String str10 = faculty3.getID();
        faculty3.logout();
        boolean boolean12 = faculty3.isVerified();
        java.lang.String str13 = faculty3.getID();
        faculty3.setVerified(true);
        java.lang.String str16 = faculty3.getEmail();
        faculty3.viewProfile();
        double double18 = faculty3.getHourlyRate();
        java.lang.String str19 = faculty3.getID();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 30.0d + "'", double18 == 30.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test19890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19890");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        faculty3.logout();
        java.lang.String str5 = faculty3.getID();
        java.lang.String str6 = faculty3.getEmail();
        double double7 = faculty3.getHourlyRate();
        java.lang.String str8 = faculty3.getPassword();
        faculty3.login("hi!", "hi!");
        boolean boolean12 = faculty3.isVerified();
        double double13 = faculty3.getHourlyRate();
        faculty3.logout();
        java.lang.String str15 = faculty3.getID();
        java.lang.String str16 = faculty3.getID();
        java.lang.Class<?> wildcardClass17 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 30.0d + "'", double13 == 30.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test19891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19891");
        model.Faculty faculty3 = new model.Faculty("faculty", "", "faculty");
        faculty3.setVerified(false);
        faculty3.login("hi!", "hi!");
        java.lang.String str9 = faculty3.getEmail();
        faculty3.logout();
        faculty3.login("", "faculty");
        boolean boolean14 = faculty3.isVerified();
        faculty3.setVerified(true);
        boolean boolean17 = faculty3.isVerified();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "faculty" + "'", str9, "faculty");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test19892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19892");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        faculty3.logout();
        faculty3.login("hi!", "hi!");
        faculty3.viewProfile();
        java.lang.String str9 = faculty3.getPassword();
        java.lang.String str10 = faculty3.getID();
        java.lang.String str11 = faculty3.getAccountType();
        java.lang.String str12 = faculty3.getEmail();
        faculty3.setVerified(true);
        faculty3.viewProfile();
        faculty3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "faculty" + "'", str11, "faculty");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test19893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19893");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        faculty3.setVerified(false);
        faculty3.viewProfile();
        java.lang.String str7 = faculty3.getEmail();
        java.lang.String str8 = faculty3.getID();
        faculty3.login("hi!", "faculty");
        faculty3.setVerified(true);
        faculty3.viewProfile();
        double double15 = faculty3.getHourlyRate();
        java.lang.String str16 = faculty3.getEmail();
        java.lang.String str17 = faculty3.getAccountType();
        java.lang.String str18 = faculty3.getID();
        java.lang.String str19 = faculty3.getPassword();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 30.0d + "'", double15 == 30.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "faculty" + "'", str17, "faculty");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test19894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19894");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        boolean boolean7 = faculty3.isVerified();
        faculty3.login("", "hi!");
        java.lang.String str11 = faculty3.getEmail();
        faculty3.login("", "hi!");
        faculty3.logout();
        java.lang.String str16 = faculty3.getID();
        double double17 = faculty3.getHourlyRate();
        java.lang.String str18 = faculty3.getEmail();
        boolean boolean19 = faculty3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 30.0d + "'", double17 == 30.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test19895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19895");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        faculty3.setVerified(false);
        java.lang.String str10 = faculty3.getID();
        double double11 = faculty3.getHourlyRate();
        faculty3.viewProfile();
        java.lang.String str13 = faculty3.getID();
        boolean boolean14 = faculty3.isVerified();
        java.lang.String str15 = faculty3.getEmail();
        java.lang.String str16 = faculty3.getPassword();
        faculty3.login("", "");
        double double20 = faculty3.getHourlyRate();
        faculty3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 30.0d + "'", double11 == 30.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 30.0d + "'", double20 == 30.0d);
    }

    @Test
    public void test19896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19896");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        boolean boolean7 = faculty3.isVerified();
        faculty3.logout();
        java.lang.String str9 = faculty3.getID();
        faculty3.setVerified(true);
        faculty3.viewProfile();
        double double13 = faculty3.getHourlyRate();
        java.lang.String str14 = faculty3.getPassword();
        faculty3.viewProfile();
        boolean boolean16 = faculty3.isVerified();
        faculty3.viewProfile();
        java.lang.String str18 = faculty3.getEmail();
        faculty3.login("", "faculty");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 30.0d + "'", double13 == 30.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test19897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19897");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        faculty3.setVerified(false);
        java.lang.String str9 = faculty3.getID();
        faculty3.setVerified(false);
        java.lang.String str12 = faculty3.getID();
        java.lang.String str13 = faculty3.getEmail();
        faculty3.login("", "faculty");
        java.lang.String str17 = faculty3.getPassword();
        faculty3.setVerified(false);
        java.lang.String str20 = faculty3.getAccountType();
        double double21 = faculty3.getHourlyRate();
        boolean boolean22 = faculty3.isVerified();
        java.lang.String str23 = faculty3.getAccountType();
        double double24 = faculty3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "faculty" + "'", str20, "faculty");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 30.0d + "'", double21 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "faculty" + "'", str23, "faculty");
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 30.0d + "'", double24 == 30.0d);
    }

    @Test
    public void test19898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19898");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        double double6 = faculty3.getHourlyRate();
        faculty3.logout();
        faculty3.setVerified(true);
        faculty3.viewProfile();
        double double11 = faculty3.getHourlyRate();
        java.lang.String str12 = faculty3.getEmail();
        faculty3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 30.0d + "'", double11 == 30.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test19899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19899");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        faculty3.login("", "");
        faculty3.viewProfile();
        faculty3.viewProfile();
        faculty3.login("", "");
        faculty3.logout();
        java.lang.String str13 = faculty3.getID();
        boolean boolean14 = faculty3.isVerified();
        faculty3.setVerified(true);
        double double17 = faculty3.getHourlyRate();
        boolean boolean18 = faculty3.isVerified();
        java.lang.String str19 = faculty3.getID();
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 30.0d + "'", double17 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test19900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19900");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.viewProfile();
        java.lang.String str8 = faculty3.getAccountType();
        faculty3.logout();
        double double10 = faculty3.getHourlyRate();
        double double11 = faculty3.getHourlyRate();
        boolean boolean12 = faculty3.isVerified();
        java.lang.String str13 = faculty3.getPassword();
        java.lang.String str14 = faculty3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "faculty" + "'", str8, "faculty");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 30.0d + "'", double10 == 30.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 30.0d + "'", double11 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test19901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19901");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        faculty3.setVerified(false);
        java.lang.String str10 = faculty3.getID();
        faculty3.viewProfile();
        java.lang.String str12 = faculty3.getID();
        faculty3.setVerified(false);
        faculty3.setVerified(true);
        java.lang.String str17 = faculty3.getPassword();
        double double18 = faculty3.getHourlyRate();
        faculty3.setVerified(true);
        java.lang.String str21 = faculty3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 30.0d + "'", double18 == 30.0d);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test19902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19902");
        model.Faculty faculty3 = new model.Faculty("", "faculty", "hi!");
        boolean boolean4 = faculty3.isVerified();
        java.lang.String str5 = faculty3.getID();
        java.lang.String str6 = faculty3.getEmail();
        java.lang.String str7 = faculty3.getPassword();
        java.lang.Class<?> wildcardClass8 = faculty3.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "faculty" + "'", str7, "faculty");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test19903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19903");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        boolean boolean7 = faculty3.isVerified();
        faculty3.logout();
        java.lang.String str9 = faculty3.getID();
        faculty3.setVerified(true);
        faculty3.viewProfile();
        double double13 = faculty3.getHourlyRate();
        faculty3.login("", "");
        faculty3.viewProfile();
        faculty3.setVerified(true);
        double double20 = faculty3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 30.0d + "'", double13 == 30.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 30.0d + "'", double20 == 30.0d);
    }

    @Test
    public void test19904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19904");
        model.Faculty faculty3 = new model.Faculty("faculty", "", "faculty");
        faculty3.setVerified(false);
        java.lang.String str6 = faculty3.getAccountType();
        java.lang.String str7 = faculty3.getPassword();
        faculty3.viewProfile();
        java.lang.String str9 = faculty3.getID();
        double double10 = faculty3.getHourlyRate();
        java.lang.String str11 = faculty3.getPassword();
        boolean boolean12 = faculty3.isVerified();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "faculty" + "'", str9, "faculty");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 30.0d + "'", double10 == 30.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test19905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19905");
        model.Faculty faculty3 = new model.Faculty("hi!", "hi!", "");
        faculty3.logout();
        java.lang.String str5 = faculty3.getEmail();
        double double6 = faculty3.getHourlyRate();
        double double7 = faculty3.getHourlyRate();
        faculty3.logout();
        java.lang.Class<?> wildcardClass9 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test19906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19906");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getAccountType();
        faculty3.logout();
        java.lang.String str8 = faculty3.getEmail();
        faculty3.viewProfile();
        boolean boolean10 = faculty3.isVerified();
        faculty3.viewProfile();
        double double12 = faculty3.getHourlyRate();
        faculty3.logout();
        java.lang.String str14 = faculty3.getAccountType();
        faculty3.viewProfile();
        java.lang.String str16 = faculty3.getAccountType();
        java.lang.String str17 = faculty3.getID();
        double double18 = faculty3.getHourlyRate();
        java.lang.String str19 = faculty3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 30.0d + "'", double12 == 30.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "faculty" + "'", str14, "faculty");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "faculty" + "'", str16, "faculty");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 30.0d + "'", double18 == 30.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test19907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19907");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        faculty3.logout();
        java.lang.String str5 = faculty3.getID();
        java.lang.String str6 = faculty3.getEmail();
        java.lang.String str7 = faculty3.getPassword();
        java.lang.String str8 = faculty3.getID();
        faculty3.logout();
        faculty3.logout();
        faculty3.viewProfile();
        java.lang.String str12 = faculty3.getID();
        double double13 = faculty3.getHourlyRate();
        double double14 = faculty3.getHourlyRate();
        java.lang.String str15 = faculty3.getPassword();
        faculty3.viewProfile();
        java.lang.String str17 = faculty3.getAccountType();
        faculty3.login("", "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 30.0d + "'", double13 == 30.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 30.0d + "'", double14 == 30.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "faculty" + "'", str17, "faculty");
    }

    @Test
    public void test19908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19908");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        faculty3.setVerified(false);
        faculty3.viewProfile();
        java.lang.String str7 = faculty3.getEmail();
        java.lang.String str8 = faculty3.getAccountType();
        faculty3.logout();
        boolean boolean10 = faculty3.isVerified();
        java.lang.String str11 = faculty3.getAccountType();
        java.lang.String str12 = faculty3.getAccountType();
        faculty3.login("faculty", "");
        java.lang.String str16 = faculty3.getPassword();
        faculty3.viewProfile();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "faculty" + "'", str8, "faculty");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "faculty" + "'", str11, "faculty");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "faculty" + "'", str12, "faculty");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test19909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19909");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        faculty3.setVerified(false);
        java.lang.String str10 = faculty3.getID();
        faculty3.viewProfile();
        double double12 = faculty3.getHourlyRate();
        java.lang.String str13 = faculty3.getPassword();
        boolean boolean14 = faculty3.isVerified();
        double double15 = faculty3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 30.0d + "'", double12 == 30.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 30.0d + "'", double15 == 30.0d);
    }

    @Test
    public void test19910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19910");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        java.lang.String str8 = faculty3.getAccountType();
        faculty3.setVerified(false);
        faculty3.viewProfile();
        java.lang.String str12 = faculty3.getAccountType();
        java.lang.String str13 = faculty3.getID();
        java.lang.String str14 = faculty3.getPassword();
        boolean boolean15 = faculty3.isVerified();
        faculty3.logout();
        java.lang.String str17 = faculty3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "faculty" + "'", str8, "faculty");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "faculty" + "'", str12, "faculty");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test19911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19911");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        faculty3.setVerified(false);
        faculty3.viewProfile();
        java.lang.String str7 = faculty3.getEmail();
        java.lang.String str8 = faculty3.getAccountType();
        java.lang.String str9 = faculty3.getID();
        java.lang.String str10 = faculty3.getID();
        java.lang.String str11 = faculty3.getAccountType();
        boolean boolean12 = faculty3.isVerified();
        faculty3.logout();
        faculty3.viewProfile();
        double double15 = faculty3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "faculty" + "'", str8, "faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "faculty" + "'", str11, "faculty");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 30.0d + "'", double15 == 30.0d);
    }

    @Test
    public void test19912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19912");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        java.lang.String str7 = faculty3.getID();
        faculty3.setVerified(true);
        java.lang.String str10 = faculty3.getEmail();
        faculty3.setVerified(true);
        faculty3.setVerified(true);
        faculty3.logout();
        java.lang.String str16 = faculty3.getID();
        boolean boolean17 = faculty3.isVerified();
        faculty3.setVerified(false);
        faculty3.login("faculty", "hi!");
        double double23 = faculty3.getHourlyRate();
        faculty3.logout();
        java.lang.Class<?> wildcardClass25 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 30.0d + "'", double23 == 30.0d);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test19913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19913");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        faculty3.setVerified(false);
        faculty3.viewProfile();
        double double7 = faculty3.getHourlyRate();
        java.lang.String str8 = faculty3.getID();
        java.lang.String str9 = faculty3.getPassword();
        java.lang.String str10 = faculty3.getPassword();
        java.lang.String str11 = faculty3.getID();
        java.lang.Class<?> wildcardClass12 = faculty3.getClass();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test19914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19914");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        faculty3.setVerified(false);
        faculty3.viewProfile();
        java.lang.String str7 = faculty3.getEmail();
        java.lang.String str8 = faculty3.getAccountType();
        faculty3.logout();
        boolean boolean10 = faculty3.isVerified();
        faculty3.login("", "hi!");
        double double14 = faculty3.getHourlyRate();
        java.lang.String str15 = faculty3.getAccountType();
        faculty3.viewProfile();
        double double17 = faculty3.getHourlyRate();
        java.lang.String str18 = faculty3.getAccountType();
        java.lang.String str19 = faculty3.getID();
        java.lang.Class<?> wildcardClass20 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "faculty" + "'", str8, "faculty");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 30.0d + "'", double14 == 30.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "faculty" + "'", str15, "faculty");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 30.0d + "'", double17 == 30.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "faculty" + "'", str18, "faculty");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test19915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19915");
        model.Faculty faculty3 = new model.Faculty("hi!", "faculty", "");
        faculty3.logout();
        faculty3.logout();
        faculty3.logout();
        double double7 = faculty3.getHourlyRate();
        boolean boolean8 = faculty3.isVerified();
        faculty3.setVerified(false);
        faculty3.setVerified(true);
        boolean boolean13 = faculty3.isVerified();
        faculty3.logout();
        faculty3.logout();
        java.lang.String str16 = faculty3.getAccountType();
        java.lang.String str17 = faculty3.getPassword();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "faculty" + "'", str16, "faculty");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "faculty" + "'", str17, "faculty");
    }

    @Test
    public void test19916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19916");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        faculty3.logout();
        java.lang.String str5 = faculty3.getID();
        java.lang.String str6 = faculty3.getEmail();
        java.lang.String str7 = faculty3.getPassword();
        double double8 = faculty3.getHourlyRate();
        faculty3.setVerified(true);
        faculty3.logout();
        boolean boolean12 = faculty3.isVerified();
        java.lang.String str13 = faculty3.getPassword();
        faculty3.logout();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test19917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19917");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        java.lang.String str7 = faculty3.getID();
        faculty3.setVerified(true);
        java.lang.String str10 = faculty3.getAccountType();
        java.lang.String str11 = faculty3.getPassword();
        faculty3.setVerified(true);
        java.lang.String str14 = faculty3.getEmail();
        boolean boolean15 = faculty3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "faculty" + "'", str10, "faculty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test19918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19918");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        java.lang.String str4 = faculty3.getAccountType();
        java.lang.String str5 = faculty3.getEmail();
        double double6 = faculty3.getHourlyRate();
        double double7 = faculty3.getHourlyRate();
        faculty3.logout();
        double double9 = faculty3.getHourlyRate();
        faculty3.logout();
        boolean boolean11 = faculty3.isVerified();
        java.lang.String str12 = faculty3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "faculty" + "'", str4, "faculty");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 30.0d + "'", double9 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test19919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19919");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.login("", "");
        java.lang.String str10 = faculty3.getAccountType();
        faculty3.viewProfile();
        faculty3.login("", "hi!");
        boolean boolean15 = faculty3.isVerified();
        java.lang.String str16 = faculty3.getAccountType();
        double double17 = faculty3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "faculty" + "'", str10, "faculty");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "faculty" + "'", str16, "faculty");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 30.0d + "'", double17 == 30.0d);
    }

    @Test
    public void test19920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19920");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        faculty3.logout();
        java.lang.String str5 = faculty3.getID();
        java.lang.String str6 = faculty3.getEmail();
        double double7 = faculty3.getHourlyRate();
        java.lang.String str8 = faculty3.getEmail();
        java.lang.String str9 = faculty3.getEmail();
        java.lang.String str10 = faculty3.getPassword();
        faculty3.setVerified(true);
        faculty3.logout();
        faculty3.login("hi!", "");
        faculty3.login("", "");
        faculty3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test19921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19921");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        faculty3.logout();
        java.lang.String str5 = faculty3.getID();
        java.lang.String str6 = faculty3.getEmail();
        double double7 = faculty3.getHourlyRate();
        boolean boolean8 = faculty3.isVerified();
        java.lang.String str9 = faculty3.getID();
        java.lang.String str10 = faculty3.getAccountType();
        faculty3.viewProfile();
        java.lang.String str12 = faculty3.getPassword();
        faculty3.logout();
        faculty3.viewProfile();
        faculty3.login("", "faculty");
        java.lang.String str18 = faculty3.getPassword();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "faculty" + "'", str10, "faculty");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test19922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19922");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        java.lang.String str7 = faculty3.getID();
        java.lang.String str8 = faculty3.getEmail();
        faculty3.login("", "");
        boolean boolean12 = faculty3.isVerified();
        boolean boolean13 = faculty3.isVerified();
        faculty3.logout();
        java.lang.String str15 = faculty3.getPassword();
        java.lang.String str16 = faculty3.getID();
        boolean boolean17 = faculty3.isVerified();
        java.lang.String str18 = faculty3.getEmail();
        faculty3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test19923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19923");
        model.Faculty faculty3 = new model.Faculty("", "faculty", "faculty");
        double double4 = faculty3.getHourlyRate();
        java.lang.String str5 = faculty3.getAccountType();
        faculty3.viewProfile();
        faculty3.login("hi!", "faculty");
        faculty3.logout();
        java.lang.String str11 = faculty3.getAccountType();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 30.0d + "'", double4 == 30.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "faculty" + "'", str11, "faculty");
    }

    @Test
    public void test19924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19924");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        faculty3.setVerified(false);
        faculty3.viewProfile();
        java.lang.String str11 = faculty3.getEmail();
        faculty3.logout();
        faculty3.logout();
        java.lang.String str14 = faculty3.getPassword();
        boolean boolean15 = faculty3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test19925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19925");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        double double6 = faculty3.getHourlyRate();
        faculty3.logout();
        faculty3.setVerified(false);
        faculty3.logout();
        boolean boolean11 = faculty3.isVerified();
        java.lang.String str12 = faculty3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test19926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19926");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        java.lang.String str7 = faculty3.getID();
        java.lang.String str8 = faculty3.getEmail();
        faculty3.login("", "");
        faculty3.logout();
        java.lang.String str13 = faculty3.getPassword();
        java.lang.String str14 = faculty3.getPassword();
        java.lang.String str15 = faculty3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test19927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19927");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        faculty3.setVerified(false);
        java.lang.String str9 = faculty3.getID();
        faculty3.setVerified(false);
        java.lang.String str12 = faculty3.getID();
        double double13 = faculty3.getHourlyRate();
        boolean boolean14 = faculty3.isVerified();
        faculty3.viewProfile();
        faculty3.login("", "faculty");
        faculty3.viewProfile();
        boolean boolean20 = faculty3.isVerified();
        java.lang.String str21 = faculty3.getEmail();
        double double22 = faculty3.getHourlyRate();
        java.lang.String str23 = faculty3.getEmail();
        boolean boolean24 = faculty3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 30.0d + "'", double13 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 30.0d + "'", double22 == 30.0d);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test19928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19928");
        model.Faculty faculty3 = new model.Faculty("hi!", "hi!", "");
        java.lang.String str4 = faculty3.getEmail();
        double double5 = faculty3.getHourlyRate();
        double double6 = faculty3.getHourlyRate();
        java.lang.String str7 = faculty3.getEmail();
        faculty3.setVerified(false);
        faculty3.login("faculty", "");
        java.lang.String str13 = faculty3.getPassword();
        java.lang.String str14 = faculty3.getEmail();
        faculty3.setVerified(true);
        double double17 = faculty3.getHourlyRate();
        java.lang.String str18 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 30.0d + "'", double5 == 30.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 30.0d + "'", double17 == 30.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "faculty" + "'", str18, "faculty");
    }

    @Test
    public void test19929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19929");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        faculty3.login("", "");
        double double7 = faculty3.getHourlyRate();
        boolean boolean8 = faculty3.isVerified();
        java.lang.String str9 = faculty3.getEmail();
        java.lang.String str10 = faculty3.getEmail();
        faculty3.login("hi!", "");
        faculty3.setVerified(false);
        faculty3.setVerified(false);
        faculty3.logout();
        boolean boolean19 = faculty3.isVerified();
        java.lang.String str20 = faculty3.getAccountType();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "faculty" + "'", str20, "faculty");
    }

    @Test
    public void test19930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19930");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        faculty3.logout();
        java.lang.String str5 = faculty3.getID();
        java.lang.String str6 = faculty3.getPassword();
        faculty3.logout();
        java.lang.String str8 = faculty3.getPassword();
        java.lang.String str9 = faculty3.getPassword();
        faculty3.setVerified(true);
        double double12 = faculty3.getHourlyRate();
        faculty3.viewProfile();
        faculty3.setVerified(false);
        java.lang.Class<?> wildcardClass16 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 30.0d + "'", double12 == 30.0d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test19931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19931");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        faculty3.logout();
        java.lang.String str5 = faculty3.getID();
        java.lang.String str6 = faculty3.getEmail();
        java.lang.String str7 = faculty3.getPassword();
        java.lang.String str8 = faculty3.getID();
        faculty3.logout();
        java.lang.String str10 = faculty3.getAccountType();
        faculty3.viewProfile();
        java.lang.String str12 = faculty3.getID();
        java.lang.String str13 = faculty3.getAccountType();
        double double14 = faculty3.getHourlyRate();
        faculty3.viewProfile();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "faculty" + "'", str10, "faculty");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "faculty" + "'", str13, "faculty");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 30.0d + "'", double14 == 30.0d);
    }

    @Test
    public void test19932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19932");
        model.Faculty faculty3 = new model.Faculty("hi!", "hi!", "");
        faculty3.logout();
        java.lang.String str5 = faculty3.getEmail();
        java.lang.String str6 = faculty3.getAccountType();
        faculty3.login("faculty", "faculty");
        double double10 = faculty3.getHourlyRate();
        java.lang.String str11 = faculty3.getID();
        faculty3.login("", "");
        double double15 = faculty3.getHourlyRate();
        java.lang.String str16 = faculty3.getEmail();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 30.0d + "'", double10 == 30.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 30.0d + "'", double15 == 30.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test19933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19933");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        java.lang.String str8 = faculty3.getPassword();
        java.lang.String str9 = faculty3.getID();
        double double10 = faculty3.getHourlyRate();
        java.lang.String str11 = faculty3.getID();
        java.lang.String str12 = faculty3.getPassword();
        double double13 = faculty3.getHourlyRate();
        faculty3.login("", "hi!");
        java.lang.String str17 = faculty3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 30.0d + "'", double10 == 30.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 30.0d + "'", double13 == 30.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test19934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19934");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        faculty3.setVerified(false);
        java.lang.String str10 = faculty3.getID();
        faculty3.viewProfile();
        java.lang.String str12 = faculty3.getID();
        boolean boolean13 = faculty3.isVerified();
        faculty3.setVerified(false);
        faculty3.logout();
        java.lang.String str17 = faculty3.getAccountType();
        java.lang.String str18 = faculty3.getID();
        java.lang.String str19 = faculty3.getAccountType();
        faculty3.viewProfile();
        java.lang.String str21 = faculty3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "faculty" + "'", str17, "faculty");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "faculty" + "'", str19, "faculty");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test19935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19935");
        model.Faculty faculty3 = new model.Faculty("hi!", "faculty", "");
        faculty3.logout();
        faculty3.logout();
        faculty3.login("", "faculty");
        faculty3.logout();
        boolean boolean10 = faculty3.isVerified();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test19936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19936");
        model.Faculty faculty3 = new model.Faculty("hi!", "faculty", "");
        faculty3.logout();
        java.lang.String str5 = faculty3.getEmail();
        java.lang.String str6 = faculty3.getEmail();
        boolean boolean7 = faculty3.isVerified();
        java.lang.String str8 = faculty3.getEmail();
        double double9 = faculty3.getHourlyRate();
        faculty3.setVerified(true);
        faculty3.login("", "hi!");
        faculty3.login("hi!", "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 30.0d + "'", double9 == 30.0d);
    }

    @Test
    public void test19937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19937");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        double double6 = faculty3.getHourlyRate();
        java.lang.String str7 = faculty3.getPassword();
        faculty3.logout();
        java.lang.String str9 = faculty3.getEmail();
        java.lang.String str10 = faculty3.getAccountType();
        faculty3.logout();
        faculty3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "faculty" + "'", str10, "faculty");
    }

    @Test
    public void test19938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19938");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        faculty3.logout();
        java.lang.String str5 = faculty3.getID();
        java.lang.String str6 = faculty3.getEmail();
        double double7 = faculty3.getHourlyRate();
        boolean boolean8 = faculty3.isVerified();
        java.lang.String str9 = faculty3.getID();
        double double10 = faculty3.getHourlyRate();
        java.lang.String str11 = faculty3.getEmail();
        faculty3.logout();
        faculty3.logout();
        boolean boolean14 = faculty3.isVerified();
        java.lang.String str15 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 30.0d + "'", double10 == 30.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "faculty" + "'", str15, "faculty");
    }

    @Test
    public void test19939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19939");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        double double6 = faculty3.getHourlyRate();
        java.lang.String str7 = faculty3.getPassword();
        faculty3.logout();
        faculty3.logout();
        java.lang.String str10 = faculty3.getPassword();
        faculty3.login("", "hi!");
        java.lang.String str14 = faculty3.getEmail();
        faculty3.setVerified(false);
        boolean boolean17 = faculty3.isVerified();
        java.lang.String str18 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "faculty" + "'", str18, "faculty");
    }

    @Test
    public void test19940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19940");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        faculty3.setVerified(false);
        faculty3.viewProfile();
        java.lang.String str7 = faculty3.getEmail();
        java.lang.String str8 = faculty3.getAccountType();
        java.lang.String str9 = faculty3.getID();
        java.lang.String str10 = faculty3.getAccountType();
        faculty3.logout();
        java.lang.String str12 = faculty3.getID();
        faculty3.login("", "faculty");
        boolean boolean16 = faculty3.isVerified();
        java.lang.String str17 = faculty3.getEmail();
        java.lang.Class<?> wildcardClass18 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "faculty" + "'", str8, "faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "faculty" + "'", str10, "faculty");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test19941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19941");
        model.Faculty faculty3 = new model.Faculty("", "faculty", "hi!");
        boolean boolean4 = faculty3.isVerified();
        java.lang.String str5 = faculty3.getID();
        java.lang.String str6 = faculty3.getEmail();
        java.lang.String str7 = faculty3.getAccountType();
        java.lang.String str8 = faculty3.getPassword();
        faculty3.logout();
        faculty3.logout();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "faculty" + "'", str7, "faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "faculty" + "'", str8, "faculty");
    }

    @Test
    public void test19942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19942");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        double double6 = faculty3.getHourlyRate();
        java.lang.String str7 = faculty3.getID();
        boolean boolean8 = faculty3.isVerified();
        faculty3.logout();
        faculty3.setVerified(false);
        boolean boolean12 = faculty3.isVerified();
        faculty3.login("faculty", "");
        double double16 = faculty3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 30.0d + "'", double16 == 30.0d);
    }

    @Test
    public void test19943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19943");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        java.lang.String str7 = faculty3.getID();
        java.lang.String str8 = faculty3.getEmail();
        faculty3.login("", "");
        boolean boolean12 = faculty3.isVerified();
        boolean boolean13 = faculty3.isVerified();
        java.lang.String str14 = faculty3.getPassword();
        double double15 = faculty3.getHourlyRate();
        java.lang.String str16 = faculty3.getAccountType();
        faculty3.viewProfile();
        java.lang.String str18 = faculty3.getID();
        java.lang.String str19 = faculty3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 30.0d + "'", double15 == 30.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "faculty" + "'", str16, "faculty");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test19944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19944");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        java.lang.String str4 = faculty3.getAccountType();
        java.lang.String str5 = faculty3.getID();
        faculty3.setVerified(true);
        faculty3.login("faculty", "faculty");
        double double11 = faculty3.getHourlyRate();
        faculty3.logout();
        java.lang.String str13 = faculty3.getAccountType();
        faculty3.logout();
        java.lang.String str15 = faculty3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "faculty" + "'", str4, "faculty");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 30.0d + "'", double11 == 30.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "faculty" + "'", str13, "faculty");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test19945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19945");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        faculty3.login("", "");
        java.lang.String str7 = faculty3.getAccountType();
        faculty3.logout();
        faculty3.login("faculty", "faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "faculty" + "'", str7, "faculty");
    }

    @Test
    public void test19946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19946");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        faculty3.setVerified(false);
        java.lang.String str9 = faculty3.getID();
        faculty3.setVerified(false);
        java.lang.String str12 = faculty3.getID();
        java.lang.String str13 = faculty3.getID();
        java.lang.String str14 = faculty3.getPassword();
        java.lang.String str15 = faculty3.getEmail();
        faculty3.viewProfile();
        faculty3.login("hi!", "");
        java.lang.String str20 = faculty3.getEmail();
        faculty3.login("", "hi!");
        double double24 = faculty3.getHourlyRate();
        java.lang.String str25 = faculty3.getID();
        java.lang.String str26 = faculty3.getPassword();
        faculty3.logout();
        faculty3.logout();
        faculty3.setVerified(false);
        faculty3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 30.0d + "'", double24 == 30.0d);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test19947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19947");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        java.lang.String str8 = faculty3.getAccountType();
        faculty3.setVerified(false);
        faculty3.viewProfile();
        java.lang.String str12 = faculty3.getAccountType();
        java.lang.String str13 = faculty3.getID();
        java.lang.String str14 = faculty3.getPassword();
        faculty3.login("hi!", "");
        java.lang.String str18 = faculty3.getPassword();
        faculty3.setVerified(true);
        java.lang.String str21 = faculty3.getAccountType();
        java.lang.String str22 = faculty3.getID();
        faculty3.login("", "faculty");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "faculty" + "'", str8, "faculty");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "faculty" + "'", str12, "faculty");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "faculty" + "'", str21, "faculty");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test19948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19948");
        model.Faculty faculty3 = new model.Faculty("faculty", "hi!", "");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        faculty3.setVerified(false);
        faculty3.viewProfile();
        faculty3.logout();
        java.lang.String str10 = faculty3.getEmail();
        faculty3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "faculty" + "'", str10, "faculty");
    }

    @Test
    public void test19949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19949");
        model.Faculty faculty3 = new model.Faculty("hi!", "hi!", "");
        faculty3.viewProfile();
        java.lang.String str5 = faculty3.getAccountType();
        java.lang.String str6 = faculty3.getPassword();
        java.lang.String str7 = faculty3.getPassword();
        java.lang.String str8 = faculty3.getAccountType();
        boolean boolean9 = faculty3.isVerified();
        faculty3.login("hi!", "");
        java.lang.String str13 = faculty3.getPassword();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "faculty" + "'", str8, "faculty");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test19950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19950");
        model.Faculty faculty3 = new model.Faculty("hi!", "faculty", "");
        faculty3.logout();
        faculty3.logout();
        faculty3.logout();
        double double7 = faculty3.getHourlyRate();
        boolean boolean8 = faculty3.isVerified();
        faculty3.setVerified(false);
        faculty3.setVerified(true);
        faculty3.setVerified(false);
        double double15 = faculty3.getHourlyRate();
        faculty3.login("hi!", "");
        java.lang.String str19 = faculty3.getID();
        faculty3.logout();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 30.0d + "'", double15 == 30.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test19951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19951");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        faculty3.login("", "");
        faculty3.viewProfile();
        faculty3.login("", "");
        double double11 = faculty3.getHourlyRate();
        faculty3.setVerified(true);
        faculty3.login("hi!", "faculty");
        faculty3.logout();
        faculty3.setVerified(true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 30.0d + "'", double11 == 30.0d);
    }

    @Test
    public void test19952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19952");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        faculty3.logout();
        java.lang.String str5 = faculty3.getID();
        java.lang.String str6 = faculty3.getPassword();
        java.lang.String str7 = faculty3.getAccountType();
        faculty3.setVerified(false);
        boolean boolean10 = faculty3.isVerified();
        faculty3.logout();
        faculty3.logout();
        faculty3.logout();
        faculty3.login("", "");
        java.lang.String str17 = faculty3.getAccountType();
        faculty3.viewProfile();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "faculty" + "'", str7, "faculty");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "faculty" + "'", str17, "faculty");
    }

    @Test
    public void test19953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19953");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        java.lang.String str7 = faculty3.getID();
        faculty3.setVerified(true);
        java.lang.String str10 = faculty3.getEmail();
        faculty3.setVerified(true);
        java.lang.String str13 = faculty3.getAccountType();
        java.lang.String str14 = faculty3.getID();
        java.lang.String str15 = faculty3.getEmail();
        java.lang.String str16 = faculty3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "faculty" + "'", str13, "faculty");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test19954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19954");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        faculty3.logout();
        java.lang.String str5 = faculty3.getID();
        java.lang.String str6 = faculty3.getEmail();
        double double7 = faculty3.getHourlyRate();
        boolean boolean8 = faculty3.isVerified();
        java.lang.String str9 = faculty3.getID();
        java.lang.String str10 = faculty3.getAccountType();
        faculty3.viewProfile();
        java.lang.String str12 = faculty3.getAccountType();
        boolean boolean13 = faculty3.isVerified();
        faculty3.logout();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "faculty" + "'", str10, "faculty");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "faculty" + "'", str12, "faculty");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test19955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19955");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        java.lang.String str7 = faculty3.getID();
        faculty3.setVerified(true);
        faculty3.viewProfile();
        faculty3.login("", "");
        java.lang.String str14 = faculty3.getEmail();
        java.lang.String str15 = faculty3.getPassword();
        faculty3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test19956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19956");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        faculty3.setVerified(false);
        faculty3.viewProfile();
        java.lang.String str7 = faculty3.getEmail();
        boolean boolean8 = faculty3.isVerified();
        double double9 = faculty3.getHourlyRate();
        java.lang.String str10 = faculty3.getPassword();
        faculty3.login("hi!", "faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 30.0d + "'", double9 == 30.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test19957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19957");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        java.lang.String str7 = faculty3.getID();
        faculty3.setVerified(true);
        java.lang.String str10 = faculty3.getEmail();
        faculty3.setVerified(true);
        faculty3.logout();
        double double14 = faculty3.getHourlyRate();
        boolean boolean15 = faculty3.isVerified();
        java.lang.String str16 = faculty3.getPassword();
        faculty3.viewProfile();
        java.lang.Class<?> wildcardClass18 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 30.0d + "'", double14 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test19958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19958");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        faculty3.setVerified(false);
        boolean boolean9 = faculty3.isVerified();
        double double10 = faculty3.getHourlyRate();
        java.lang.String str11 = faculty3.getID();
        boolean boolean12 = faculty3.isVerified();
        java.lang.String str13 = faculty3.getEmail();
        faculty3.viewProfile();
        faculty3.viewProfile();
        java.lang.Class<?> wildcardClass16 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 30.0d + "'", double10 == 30.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test19959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19959");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        faculty3.logout();
        java.lang.String str5 = faculty3.getID();
        java.lang.String str6 = faculty3.getPassword();
        faculty3.logout();
        java.lang.String str8 = faculty3.getPassword();
        java.lang.String str9 = faculty3.getPassword();
        faculty3.setVerified(true);
        double double12 = faculty3.getHourlyRate();
        faculty3.viewProfile();
        java.lang.String str14 = faculty3.getAccountType();
        faculty3.setVerified(false);
        java.lang.String str17 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 30.0d + "'", double12 == 30.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "faculty" + "'", str14, "faculty");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "faculty" + "'", str17, "faculty");
    }

    @Test
    public void test19960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19960");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        faculty3.logout();
        java.lang.String str5 = faculty3.getID();
        java.lang.String str6 = faculty3.getPassword();
        java.lang.String str7 = faculty3.getAccountType();
        java.lang.String str8 = faculty3.getPassword();
        faculty3.logout();
        java.lang.String str10 = faculty3.getID();
        faculty3.login("hi!", "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "faculty" + "'", str7, "faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test19961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19961");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        faculty3.setVerified(false);
        java.lang.String str9 = faculty3.getID();
        faculty3.setVerified(false);
        faculty3.logout();
        faculty3.setVerified(false);
        java.lang.String str15 = faculty3.getEmail();
        faculty3.viewProfile();
        boolean boolean17 = faculty3.isVerified();
        faculty3.setVerified(false);
        faculty3.setVerified(false);
        double double22 = faculty3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 30.0d + "'", double22 == 30.0d);
    }

    @Test
    public void test19962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19962");
        model.Faculty faculty3 = new model.Faculty("", "faculty", "faculty");
        double double4 = faculty3.getHourlyRate();
        java.lang.String str5 = faculty3.getAccountType();
        double double6 = faculty3.getHourlyRate();
        boolean boolean7 = faculty3.isVerified();
        java.lang.String str8 = faculty3.getPassword();
        java.lang.String str9 = faculty3.getEmail();
        boolean boolean10 = faculty3.isVerified();
        java.lang.String str11 = faculty3.getPassword();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 30.0d + "'", double4 == 30.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "faculty" + "'", str8, "faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "faculty" + "'", str11, "faculty");
    }

    @Test
    public void test19963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19963");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        java.lang.String str8 = faculty3.getPassword();
        faculty3.setVerified(false);
        faculty3.logout();
        faculty3.viewProfile();
        java.lang.String str13 = faculty3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test19964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19964");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getAccountType();
        faculty3.logout();
        java.lang.String str8 = faculty3.getEmail();
        faculty3.viewProfile();
        boolean boolean10 = faculty3.isVerified();
        faculty3.viewProfile();
        java.lang.String str12 = faculty3.getID();
        java.lang.String str13 = faculty3.getAccountType();
        faculty3.login("", "faculty");
        double double17 = faculty3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "faculty" + "'", str13, "faculty");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 30.0d + "'", double17 == 30.0d);
    }

    @Test
    public void test19965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19965");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        java.lang.String str7 = faculty3.getID();
        faculty3.setVerified(true);
        java.lang.String str10 = faculty3.getEmail();
        faculty3.setVerified(true);
        faculty3.login("", "");
        java.lang.String str16 = faculty3.getID();
        java.lang.String str17 = faculty3.getEmail();
        boolean boolean18 = faculty3.isVerified();
        java.lang.String str19 = faculty3.getPassword();
        java.lang.String str20 = faculty3.getAccountType();
        java.lang.String str21 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "faculty" + "'", str20, "faculty");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "faculty" + "'", str21, "faculty");
    }

    @Test
    public void test19966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19966");
        model.Faculty faculty3 = new model.Faculty("faculty", "hi!", "");
        faculty3.login("hi!", "hi!");
        faculty3.logout();
        java.lang.String str8 = faculty3.getEmail();
        faculty3.login("hi!", "");
        double double12 = faculty3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "faculty" + "'", str8, "faculty");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 30.0d + "'", double12 == 30.0d);
    }

    @Test
    public void test19967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19967");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        java.lang.String str4 = faculty3.getPassword();
        double double5 = faculty3.getHourlyRate();
        double double6 = faculty3.getHourlyRate();
        faculty3.viewProfile();
        faculty3.setVerified(false);
        boolean boolean10 = faculty3.isVerified();
        faculty3.setVerified(false);
        java.lang.String str13 = faculty3.getID();
        java.lang.String str14 = faculty3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 30.0d + "'", double5 == 30.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test19968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19968");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getAccountType();
        faculty3.logout();
        boolean boolean8 = faculty3.isVerified();
        faculty3.setVerified(true);
        faculty3.setVerified(false);
        boolean boolean13 = faculty3.isVerified();
        faculty3.login("", "hi!");
        boolean boolean17 = faculty3.isVerified();
        java.lang.String str18 = faculty3.getID();
        faculty3.viewProfile();
        faculty3.login("faculty", "faculty");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test19969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19969");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        faculty3.setVerified(false);
        java.lang.String str10 = faculty3.getID();
        double double11 = faculty3.getHourlyRate();
        java.lang.String str12 = faculty3.getPassword();
        faculty3.login("hi!", "hi!");
        faculty3.setVerified(true);
        double double18 = faculty3.getHourlyRate();
        boolean boolean19 = faculty3.isVerified();
        faculty3.setVerified(true);
        java.lang.String str22 = faculty3.getPassword();
        double double23 = faculty3.getHourlyRate();
        faculty3.logout();
        java.lang.String str25 = faculty3.getAccountType();
        faculty3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 30.0d + "'", double11 == 30.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 30.0d + "'", double18 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 30.0d + "'", double23 == 30.0d);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "faculty" + "'", str25, "faculty");
    }

    @Test
    public void test19970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19970");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        java.lang.String str8 = faculty3.getAccountType();
        java.lang.String str9 = faculty3.getAccountType();
        java.lang.String str10 = faculty3.getID();
        faculty3.setVerified(false);
        faculty3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "faculty" + "'", str8, "faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "faculty" + "'", str9, "faculty");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test19971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19971");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        faculty3.logout();
        java.lang.String str5 = faculty3.getID();
        java.lang.String str6 = faculty3.getEmail();
        double double7 = faculty3.getHourlyRate();
        boolean boolean8 = faculty3.isVerified();
        java.lang.String str9 = faculty3.getID();
        java.lang.String str10 = faculty3.getAccountType();
        faculty3.viewProfile();
        java.lang.String str12 = faculty3.getPassword();
        java.lang.String str13 = faculty3.getEmail();
        java.lang.String str14 = faculty3.getAccountType();
        faculty3.viewProfile();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "faculty" + "'", str10, "faculty");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "faculty" + "'", str14, "faculty");
    }

    @Test
    public void test19972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19972");
        model.Faculty faculty3 = new model.Faculty("hi!", "faculty", "");
        java.lang.String str4 = faculty3.getEmail();
        faculty3.viewProfile();
        faculty3.viewProfile();
        faculty3.setVerified(false);
        double double9 = faculty3.getHourlyRate();
        java.lang.String str10 = faculty3.getPassword();
        faculty3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 30.0d + "'", double9 == 30.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "faculty" + "'", str10, "faculty");
    }

    @Test
    public void test19973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19973");
        model.Faculty faculty3 = new model.Faculty("hi!", "faculty", "");
        faculty3.setVerified(false);
        faculty3.logout();
        faculty3.login("", "");
        java.lang.String str10 = faculty3.getAccountType();
        faculty3.logout();
        double double12 = faculty3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "faculty" + "'", str10, "faculty");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 30.0d + "'", double12 == 30.0d);
    }

    @Test
    public void test19974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19974");
        model.Faculty faculty3 = new model.Faculty("faculty", "hi!", "");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        faculty3.setVerified(false);
        faculty3.viewProfile();
        faculty3.logout();
        java.lang.String str10 = faculty3.getEmail();
        double double11 = faculty3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "faculty" + "'", str10, "faculty");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 30.0d + "'", double11 == 30.0d);
    }

    @Test
    public void test19975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19975");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.login("", "");
        java.lang.String str10 = faculty3.getID();
        java.lang.String str11 = faculty3.getEmail();
        double double12 = faculty3.getHourlyRate();
        java.lang.String str13 = faculty3.getAccountType();
        java.lang.String str14 = faculty3.getPassword();
        faculty3.login("", "faculty");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 30.0d + "'", double12 == 30.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "faculty" + "'", str13, "faculty");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test19976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19976");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getAccountType();
        faculty3.logout();
        double double8 = faculty3.getHourlyRate();
        java.lang.String str9 = faculty3.getEmail();
        java.lang.String str10 = faculty3.getPassword();
        java.lang.String str11 = faculty3.getPassword();
        java.lang.String str12 = faculty3.getPassword();
        faculty3.login("hi!", "hi!");
        boolean boolean16 = faculty3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test19977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19977");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        faculty3.setVerified(false);
        java.lang.String str10 = faculty3.getID();
        faculty3.viewProfile();
        java.lang.String str12 = faculty3.getID();
        java.lang.String str13 = faculty3.getAccountType();
        java.lang.String str14 = faculty3.getEmail();
        faculty3.setVerified(true);
        faculty3.login("faculty", "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "faculty" + "'", str13, "faculty");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test19978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19978");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        faculty3.logout();
        java.lang.String str5 = faculty3.getID();
        java.lang.String str6 = faculty3.getEmail();
        double double7 = faculty3.getHourlyRate();
        boolean boolean8 = faculty3.isVerified();
        java.lang.String str9 = faculty3.getID();
        faculty3.setVerified(true);
        double double12 = faculty3.getHourlyRate();
        faculty3.setVerified(false);
        faculty3.viewProfile();
        faculty3.login("faculty", "hi!");
        java.lang.String str19 = faculty3.getID();
        faculty3.viewProfile();
        java.lang.Class<?> wildcardClass21 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 30.0d + "'", double12 == 30.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test19979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19979");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        faculty3.setVerified(false);
        java.lang.String str9 = faculty3.getID();
        faculty3.setVerified(false);
        java.lang.String str12 = faculty3.getID();
        java.lang.String str13 = faculty3.getID();
        double double14 = faculty3.getHourlyRate();
        faculty3.viewProfile();
        java.lang.String str16 = faculty3.getEmail();
        boolean boolean17 = faculty3.isVerified();
        faculty3.logout();
        java.lang.String str19 = faculty3.getAccountType();
        java.lang.String str20 = faculty3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 30.0d + "'", double14 == 30.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "faculty" + "'", str19, "faculty");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test19980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19980");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        faculty3.setVerified(false);
        faculty3.viewProfile();
        java.lang.String str7 = faculty3.getEmail();
        java.lang.String str8 = faculty3.getAccountType();
        faculty3.logout();
        faculty3.login("", "");
        faculty3.logout();
        java.lang.String str14 = faculty3.getPassword();
        faculty3.login("faculty", "");
        faculty3.setVerified(true);
        faculty3.logout();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "faculty" + "'", str8, "faculty");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test19981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19981");
        model.Faculty faculty3 = new model.Faculty("hi!", "hi!", "");
        faculty3.setVerified(true);
        faculty3.login("faculty", "");
        java.lang.String str9 = faculty3.getAccountType();
        faculty3.logout();
        boolean boolean11 = faculty3.isVerified();
        java.lang.String str12 = faculty3.getPassword();
        faculty3.viewProfile();
        faculty3.login("hi!", "hi!");
        faculty3.login("", "hi!");
        java.lang.String str20 = faculty3.getID();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "faculty" + "'", str9, "faculty");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test19982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19982");
        model.Faculty faculty3 = new model.Faculty("", "faculty", "");
        java.lang.String str4 = faculty3.getPassword();
        boolean boolean5 = faculty3.isVerified();
        faculty3.viewProfile();
        boolean boolean7 = faculty3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "faculty" + "'", str4, "faculty");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test19983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19983");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        double double6 = faculty3.getHourlyRate();
        faculty3.logout();
        faculty3.viewProfile();
        java.lang.String str9 = faculty3.getEmail();
        boolean boolean10 = faculty3.isVerified();
        java.lang.String str11 = faculty3.getPassword();
        faculty3.login("", "hi!");
        double double15 = faculty3.getHourlyRate();
        faculty3.viewProfile();
        faculty3.viewProfile();
        faculty3.setVerified(false);
        java.lang.String str20 = faculty3.getAccountType();
        faculty3.viewProfile();
        java.lang.String str22 = faculty3.getPassword();
        faculty3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 30.0d + "'", double15 == 30.0d);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "faculty" + "'", str20, "faculty");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test19984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19984");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        java.lang.String str7 = faculty3.getID();
        faculty3.login("hi!", "");
        faculty3.login("hi!", "faculty");
        faculty3.viewProfile();
        faculty3.logout();
        java.lang.String str16 = faculty3.getAccountType();
        faculty3.login("", "hi!");
        java.lang.String str20 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "faculty" + "'", str16, "faculty");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "faculty" + "'", str20, "faculty");
    }

    @Test
    public void test19985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19985");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        double double6 = faculty3.getHourlyRate();
        java.lang.String str7 = faculty3.getPassword();
        java.lang.String str8 = faculty3.getPassword();
        faculty3.login("faculty", "hi!");
        faculty3.login("hi!", "");
        faculty3.setVerified(true);
        java.lang.String str17 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "faculty" + "'", str17, "faculty");
    }

    @Test
    public void test19986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19986");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        faculty3.login("", "");
        double double7 = faculty3.getHourlyRate();
        faculty3.login("faculty", "faculty");
        java.lang.String str11 = faculty3.getID();
        java.lang.String str12 = faculty3.getAccountType();
        boolean boolean13 = faculty3.isVerified();
        java.lang.String str14 = faculty3.getEmail();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "faculty" + "'", str12, "faculty");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test19987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19987");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        faculty3.setVerified(false);
        java.lang.String str9 = faculty3.getID();
        faculty3.setVerified(false);
        java.lang.String str12 = faculty3.getID();
        double double13 = faculty3.getHourlyRate();
        boolean boolean14 = faculty3.isVerified();
        faculty3.logout();
        java.lang.String str16 = faculty3.getID();
        faculty3.viewProfile();
        faculty3.setVerified(true);
        java.lang.String str20 = faculty3.getID();
        faculty3.login("", "");
        faculty3.setVerified(true);
        java.lang.String str26 = faculty3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 30.0d + "'", double13 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test19988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19988");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        faculty3.logout();
        faculty3.login("hi!", "hi!");
        java.lang.String str8 = faculty3.getID();
        java.lang.String str9 = faculty3.getPassword();
        java.lang.String str10 = faculty3.getPassword();
        faculty3.logout();
        faculty3.setVerified(false);
        boolean boolean14 = faculty3.isVerified();
        boolean boolean15 = faculty3.isVerified();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test19989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19989");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        boolean boolean7 = faculty3.isVerified();
        faculty3.login("", "hi!");
        java.lang.String str11 = faculty3.getEmail();
        faculty3.viewProfile();
        java.lang.String str13 = faculty3.getAccountType();
        faculty3.login("", "faculty");
        boolean boolean17 = faculty3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "faculty" + "'", str13, "faculty");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test19990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19990");
        model.Faculty faculty3 = new model.Faculty("hi!", "faculty", "");
        java.lang.String str4 = faculty3.getEmail();
        faculty3.logout();
        java.lang.String str6 = faculty3.getID();
        java.lang.String str7 = faculty3.getEmail();
        java.lang.String str8 = faculty3.getID();
        faculty3.setVerified(false);
        faculty3.viewProfile();
        faculty3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test19991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19991");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.login("", "");
        java.lang.String str10 = faculty3.getID();
        java.lang.String str11 = faculty3.getPassword();
        double double12 = faculty3.getHourlyRate();
        java.lang.String str13 = faculty3.getID();
        java.lang.String str14 = faculty3.getID();
        java.lang.String str15 = faculty3.getID();
        java.lang.String str16 = faculty3.getID();
        java.lang.String str17 = faculty3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 30.0d + "'", double12 == 30.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test19992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19992");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        faculty3.logout();
        java.lang.String str5 = faculty3.getID();
        java.lang.String str6 = faculty3.getEmail();
        java.lang.String str7 = faculty3.getEmail();
        java.lang.String str8 = faculty3.getID();
        java.lang.String str9 = faculty3.getPassword();
        java.lang.String str10 = faculty3.getEmail();
        java.lang.String str11 = faculty3.getPassword();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test19993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19993");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        faculty3.setVerified(false);
        java.lang.String str10 = faculty3.getID();
        double double11 = faculty3.getHourlyRate();
        faculty3.viewProfile();
        faculty3.login("hi!", "faculty");
        faculty3.viewProfile();
        java.lang.String str17 = faculty3.getEmail();
        java.lang.String str18 = faculty3.getID();
        double double19 = faculty3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 30.0d + "'", double11 == 30.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 30.0d + "'", double19 == 30.0d);
    }

    @Test
    public void test19994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19994");
        model.Faculty faculty3 = new model.Faculty("", "faculty", "faculty");
        double double4 = faculty3.getHourlyRate();
        java.lang.String str5 = faculty3.getAccountType();
        java.lang.String str6 = faculty3.getID();
        java.lang.String str7 = faculty3.getAccountType();
        double double8 = faculty3.getHourlyRate();
        faculty3.login("", "");
        faculty3.logout();
        java.lang.String str13 = faculty3.getEmail();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 30.0d + "'", double4 == 30.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "faculty" + "'", str7, "faculty");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test19995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19995");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        faculty3.setVerified(false);
        java.lang.String str6 = faculty3.getPassword();
        java.lang.String str7 = faculty3.getAccountType();
        java.lang.String str8 = faculty3.getEmail();
        faculty3.setVerified(true);
        java.lang.String str11 = faculty3.getAccountType();
        faculty3.login("faculty", "");
        boolean boolean15 = faculty3.isVerified();
        faculty3.login("", "");
        java.lang.Class<?> wildcardClass19 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "faculty" + "'", str7, "faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "faculty" + "'", str11, "faculty");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test19996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19996");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        faculty3.logout();
        java.lang.String str5 = faculty3.getID();
        java.lang.String str6 = faculty3.getPassword();
        faculty3.logout();
        java.lang.String str8 = faculty3.getPassword();
        java.lang.String str9 = faculty3.getPassword();
        faculty3.setVerified(true);
        double double12 = faculty3.getHourlyRate();
        boolean boolean13 = faculty3.isVerified();
        faculty3.login("faculty", "faculty");
        java.lang.Class<?> wildcardClass17 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 30.0d + "'", double12 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test19997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19997");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        faculty3.setVerified(false);
        java.lang.String str10 = faculty3.getID();
        faculty3.viewProfile();
        java.lang.String str12 = faculty3.getID();
        java.lang.String str13 = faculty3.getAccountType();
        java.lang.String str14 = faculty3.getEmail();
        faculty3.login("hi!", "");
        java.lang.String str18 = faculty3.getPassword();
        double double19 = faculty3.getHourlyRate();
        java.lang.String str20 = faculty3.getEmail();
        java.lang.String str21 = faculty3.getPassword();
        boolean boolean22 = faculty3.isVerified();
        faculty3.login("", "");
        boolean boolean26 = faculty3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "faculty" + "'", str13, "faculty");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 30.0d + "'", double19 == 30.0d);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test19998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19998");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getAccountType();
        faculty3.logout();
        double double8 = faculty3.getHourlyRate();
        java.lang.String str9 = faculty3.getEmail();
        java.lang.String str10 = faculty3.getPassword();
        faculty3.logout();
        java.lang.String str12 = faculty3.getPassword();
        double double13 = faculty3.getHourlyRate();
        java.lang.String str14 = faculty3.getID();
        java.lang.String str15 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 30.0d + "'", double13 == 30.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "faculty" + "'", str15, "faculty");
    }

    @Test
    public void test19999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test19999");
        model.Faculty faculty3 = new model.Faculty("hi!", "hi!", "hi!");
        faculty3.login("hi!", "faculty");
        faculty3.logout();
        java.lang.String str8 = faculty3.getPassword();
        faculty3.logout();
        faculty3.logout();
        faculty3.logout();
        java.lang.String str12 = faculty3.getEmail();
        double double13 = faculty3.getHourlyRate();
        boolean boolean14 = faculty3.isVerified();
        java.lang.String str15 = faculty3.getID();
        faculty3.login("", "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 30.0d + "'", double13 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test20000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test20000");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        java.lang.String str7 = faculty3.getID();
        double double8 = faculty3.getHourlyRate();
        java.lang.String str9 = faculty3.getID();
        boolean boolean10 = faculty3.isVerified();
        faculty3.setVerified(false);
        double double13 = faculty3.getHourlyRate();
        faculty3.logout();
        boolean boolean15 = faculty3.isVerified();
        java.lang.String str16 = faculty3.getAccountType();
        java.lang.String str17 = faculty3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 30.0d + "'", double13 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "faculty" + "'", str16, "faculty");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }
}

