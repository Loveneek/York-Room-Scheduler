import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest13 {

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
    public void test06501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06501");
        model.Faculty faculty3 = new model.Faculty("", "", "faculty");
        java.lang.String str4 = faculty3.getAccountType();
        java.lang.String str5 = faculty3.getID();
        double double6 = faculty3.getHourlyRate();
        faculty3.viewProfile();
        boolean boolean8 = faculty3.isVerified();
        double double9 = faculty3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "faculty" + "'", str4, "faculty");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 30.0d + "'", double9 == 30.0d);
    }

    @Test
    public void test06502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06502");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        java.lang.String str4 = faculty3.getAccountType();
        java.lang.String str5 = faculty3.getID();
        faculty3.setVerified(true);
        java.lang.String str8 = faculty3.getAccountType();
        java.lang.String str9 = faculty3.getAccountType();
        java.lang.String str10 = faculty3.getAccountType();
        boolean boolean11 = faculty3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "faculty" + "'", str4, "faculty");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "faculty" + "'", str8, "faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "faculty" + "'", str9, "faculty");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "faculty" + "'", str10, "faculty");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test06503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06503");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        double double6 = faculty3.getHourlyRate();
        java.lang.String str7 = faculty3.getPassword();
        java.lang.String str8 = faculty3.getPassword();
        java.lang.String str9 = faculty3.getAccountType();
        faculty3.viewProfile();
        java.lang.String str11 = faculty3.getEmail();
        java.lang.String str12 = faculty3.getID();
        double double13 = faculty3.getHourlyRate();
        java.lang.String str14 = faculty3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "faculty" + "'", str9, "faculty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 30.0d + "'", double13 == 30.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test06504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06504");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        boolean boolean7 = faculty3.isVerified();
        java.lang.String str8 = faculty3.getEmail();
        faculty3.setVerified(true);
        java.lang.String str11 = faculty3.getAccountType();
        java.lang.String str12 = faculty3.getEmail();
        faculty3.setVerified(true);
        faculty3.login("faculty", "hi!");
        java.lang.String str18 = faculty3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "faculty" + "'", str11, "faculty");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test06505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06505");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.login("", "");
        double double10 = faculty3.getHourlyRate();
        java.lang.String str11 = faculty3.getPassword();
        boolean boolean12 = faculty3.isVerified();
        java.lang.String str13 = faculty3.getID();
        java.lang.String str14 = faculty3.getAccountType();
        faculty3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 30.0d + "'", double10 == 30.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "faculty" + "'", str14, "faculty");
    }

    @Test
    public void test06506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06506");
        model.Faculty faculty3 = new model.Faculty("hi!", "hi!", "");
        java.lang.String str4 = faculty3.getEmail();
        faculty3.login("hi!", "faculty");
        java.lang.String str8 = faculty3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test06507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06507");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.viewProfile();
        boolean boolean8 = faculty3.isVerified();
        java.lang.String str9 = faculty3.getEmail();
        faculty3.setVerified(true);
        boolean boolean12 = faculty3.isVerified();
        faculty3.logout();
        java.lang.String str14 = faculty3.getEmail();
        double double15 = faculty3.getHourlyRate();
        faculty3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 30.0d + "'", double15 == 30.0d);
    }

    @Test
    public void test06508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06508");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        faculty3.login("", "");
        faculty3.viewProfile();
        faculty3.login("", "");
        double double11 = faculty3.getHourlyRate();
        faculty3.viewProfile();
        java.lang.String str13 = faculty3.getID();
        java.lang.String str14 = faculty3.getAccountType();
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 30.0d + "'", double11 == 30.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "faculty" + "'", str14, "faculty");
    }

    @Test
    public void test06509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06509");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        faculty3.logout();
        faculty3.login("hi!", "hi!");
        faculty3.viewProfile();
        faculty3.login("", "faculty");
        faculty3.login("", "faculty");
        java.lang.String str15 = faculty3.getEmail();
        double double16 = faculty3.getHourlyRate();
        java.lang.String str17 = faculty3.getPassword();
        faculty3.login("", "");
        boolean boolean21 = faculty3.isVerified();
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 30.0d + "'", double16 == 30.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test06510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06510");
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
        faculty3.viewProfile();
        faculty3.viewProfile();
        faculty3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test06511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06511");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        faculty3.setVerified(false);
        java.lang.String str9 = faculty3.getID();
        faculty3.setVerified(false);
        boolean boolean12 = faculty3.isVerified();
        boolean boolean13 = faculty3.isVerified();
        boolean boolean14 = faculty3.isVerified();
        double double15 = faculty3.getHourlyRate();
        faculty3.login("faculty", "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 30.0d + "'", double15 == 30.0d);
    }

    @Test
    public void test06512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06512");
        model.Faculty faculty3 = new model.Faculty("hi!", "hi!", "hi!");
        faculty3.login("hi!", "faculty");
        faculty3.logout();
        java.lang.String str8 = faculty3.getPassword();
        faculty3.viewProfile();
        boolean boolean10 = faculty3.isVerified();
        faculty3.login("", "");
        faculty3.logout();
        java.lang.String str15 = faculty3.getID();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test06513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06513");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        java.lang.String str8 = faculty3.getAccountType();
        java.lang.String str9 = faculty3.getAccountType();
        faculty3.viewProfile();
        faculty3.logout();
        faculty3.login("faculty", "");
        java.lang.Class<?> wildcardClass15 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "faculty" + "'", str8, "faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "faculty" + "'", str9, "faculty");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test06514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06514");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.login("", "");
        faculty3.login("faculty", "faculty");
        java.lang.String str13 = faculty3.getAccountType();
        faculty3.login("", "hi!");
        faculty3.viewProfile();
        java.lang.Class<?> wildcardClass18 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "faculty" + "'", str13, "faculty");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test06515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06515");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        faculty3.setVerified(false);
        java.lang.String str6 = faculty3.getPassword();
        java.lang.String str7 = faculty3.getAccountType();
        java.lang.String str8 = faculty3.getEmail();
        faculty3.setVerified(true);
        boolean boolean11 = faculty3.isVerified();
        faculty3.login("hi!", "faculty");
        double double15 = faculty3.getHourlyRate();
        faculty3.viewProfile();
        java.lang.String str17 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "faculty" + "'", str7, "faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 30.0d + "'", double15 == 30.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "faculty" + "'", str17, "faculty");
    }

    @Test
    public void test06516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06516");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getEmail();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        faculty3.login("hi!", "faculty");
        boolean boolean11 = faculty3.isVerified();
        faculty3.login("faculty", "hi!");
        java.lang.String str15 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "faculty" + "'", str15, "faculty");
    }

    @Test
    public void test06517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06517");
        model.Faculty faculty3 = new model.Faculty("hi!", "hi!", "");
        faculty3.setVerified(true);
        double double6 = faculty3.getHourlyRate();
        java.lang.String str7 = faculty3.getAccountType();
        double double8 = faculty3.getHourlyRate();
        java.lang.Class<?> wildcardClass9 = faculty3.getClass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "faculty" + "'", str7, "faculty");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test06518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06518");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.login("", "");
        faculty3.login("faculty", "faculty");
        java.lang.String str13 = faculty3.getPassword();
        java.lang.String str14 = faculty3.getPassword();
        java.lang.String str15 = faculty3.getAccountType();
        double double16 = faculty3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "faculty" + "'", str15, "faculty");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 30.0d + "'", double16 == 30.0d);
    }

    @Test
    public void test06519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06519");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        double double6 = faculty3.getHourlyRate();
        java.lang.String str7 = faculty3.getID();
        boolean boolean8 = faculty3.isVerified();
        faculty3.setVerified(true);
        java.lang.String str11 = faculty3.getEmail();
        double double12 = faculty3.getHourlyRate();
        java.lang.String str13 = faculty3.getEmail();
        java.lang.String str14 = faculty3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 30.0d + "'", double12 == 30.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test06520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06520");
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
        java.lang.String str14 = faculty3.getAccountType();
        java.lang.String str15 = faculty3.getAccountType();
        java.lang.String str16 = faculty3.getEmail();
        boolean boolean17 = faculty3.isVerified();
        faculty3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "faculty" + "'", str14, "faculty");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "faculty" + "'", str15, "faculty");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test06521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06521");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        faculty3.logout();
        java.lang.String str5 = faculty3.getID();
        java.lang.String str6 = faculty3.getEmail();
        double double7 = faculty3.getHourlyRate();
        java.lang.String str8 = faculty3.getPassword();
        faculty3.login("hi!", "hi!");
        boolean boolean12 = faculty3.isVerified();
        faculty3.setVerified(false);
        faculty3.login("hi!", "faculty");
        boolean boolean18 = faculty3.isVerified();
        faculty3.setVerified(false);
        faculty3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test06522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06522");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        java.lang.String str7 = faculty3.getID();
        double double8 = faculty3.getHourlyRate();
        double double9 = faculty3.getHourlyRate();
        boolean boolean10 = faculty3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 30.0d + "'", double9 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test06523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06523");
        model.Faculty faculty3 = new model.Faculty("hi!", "hi!", "");
        faculty3.logout();
        java.lang.String str5 = faculty3.getEmail();
        double double6 = faculty3.getHourlyRate();
        java.lang.String str7 = faculty3.getAccountType();
        faculty3.logout();
        double double9 = faculty3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "faculty" + "'", str7, "faculty");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 30.0d + "'", double9 == 30.0d);
    }

    @Test
    public void test06524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06524");
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
        faculty3.logout();
        faculty3.setVerified(false);
        double double22 = faculty3.getHourlyRate();
        faculty3.viewProfile();
        faculty3.login("", "");
        java.lang.String str27 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 30.0d + "'", double22 == 30.0d);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "faculty" + "'", str27, "faculty");
    }

    @Test
    public void test06525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06525");
        model.Faculty faculty3 = new model.Faculty("faculty", "", "faculty");
        faculty3.setVerified(false);
        faculty3.viewProfile();
        java.lang.String str7 = faculty3.getEmail();
        java.lang.String str8 = faculty3.getID();
        double double9 = faculty3.getHourlyRate();
        faculty3.login("hi!", "faculty");
        java.lang.String str13 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "faculty" + "'", str7, "faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "faculty" + "'", str8, "faculty");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 30.0d + "'", double9 == 30.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "faculty" + "'", str13, "faculty");
    }

    @Test
    public void test06526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06526");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        faculty3.setVerified(false);
        boolean boolean7 = faculty3.isVerified();
        java.lang.String str8 = faculty3.getID();
        java.lang.String str9 = faculty3.getEmail();
        faculty3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test06527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06527");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        double double6 = faculty3.getHourlyRate();
        java.lang.String str7 = faculty3.getPassword();
        java.lang.String str8 = faculty3.getPassword();
        faculty3.login("faculty", "faculty");
        double double12 = faculty3.getHourlyRate();
        java.lang.String str13 = faculty3.getEmail();
        java.lang.String str14 = faculty3.getEmail();
        java.lang.String str15 = faculty3.getAccountType();
        faculty3.setVerified(true);
        double double18 = faculty3.getHourlyRate();
        faculty3.logout();
        faculty3.login("", "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 30.0d + "'", double12 == 30.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "faculty" + "'", str15, "faculty");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 30.0d + "'", double18 == 30.0d);
    }

    @Test
    public void test06528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06528");
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
        java.lang.String str18 = faculty3.getPassword();
        boolean boolean19 = faculty3.isVerified();
        java.lang.String str20 = faculty3.getEmail();
        java.lang.String str21 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 30.0d + "'", double14 == 30.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "faculty" + "'", str21, "faculty");
    }

    @Test
    public void test06529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06529");
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
        faculty3.login("hi!", "hi!");
        java.lang.String str27 = faculty3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "faculty" + "'", str10, "faculty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "faculty" + "'", str23, "faculty");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test06530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06530");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        java.lang.String str6 = faculty3.getPassword();
        java.lang.String str7 = faculty3.getPassword();
        faculty3.login("hi!", "hi!");
        boolean boolean11 = faculty3.isVerified();
        java.lang.String str12 = faculty3.getEmail();
        double double13 = faculty3.getHourlyRate();
        faculty3.viewProfile();
        faculty3.setVerified(false);
        boolean boolean17 = faculty3.isVerified();
        faculty3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 30.0d + "'", double13 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test06531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06531");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        faculty3.setVerified(false);
        java.lang.String str10 = faculty3.getID();
        faculty3.viewProfile();
        faculty3.login("", "");
        java.lang.String str15 = faculty3.getPassword();
        faculty3.login("", "faculty");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test06532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06532");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        java.lang.String str4 = faculty3.getAccountType();
        java.lang.String str5 = faculty3.getEmail();
        double double6 = faculty3.getHourlyRate();
        faculty3.logout();
        java.lang.String str8 = faculty3.getEmail();
        faculty3.login("hi!", "faculty");
        double double12 = faculty3.getHourlyRate();
        java.lang.String str13 = faculty3.getAccountType();
        faculty3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "faculty" + "'", str4, "faculty");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 30.0d + "'", double12 == 30.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "faculty" + "'", str13, "faculty");
    }

    @Test
    public void test06533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06533");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        faculty3.setVerified(false);
        java.lang.String str10 = faculty3.getEmail();
        faculty3.logout();
        java.lang.String str12 = faculty3.getID();
        faculty3.login("", "hi!");
        double double16 = faculty3.getHourlyRate();
        faculty3.viewProfile();
        double double18 = faculty3.getHourlyRate();
        faculty3.logout();
        faculty3.viewProfile();
        faculty3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 30.0d + "'", double16 == 30.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 30.0d + "'", double18 == 30.0d);
    }

    @Test
    public void test06534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06534");
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
        faculty3.login("faculty", "hi!");
        java.lang.String str24 = faculty3.getPassword();
        faculty3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 30.0d + "'", double18 == 30.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test06535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06535");
        model.Faculty faculty3 = new model.Faculty("hi!", "hi!", "");
        faculty3.setVerified(true);
        double double6 = faculty3.getHourlyRate();
        java.lang.String str7 = faculty3.getID();
        faculty3.logout();
        faculty3.viewProfile();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test06536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06536");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        double double6 = faculty3.getHourlyRate();
        faculty3.logout();
        faculty3.viewProfile();
        java.lang.String str9 = faculty3.getEmail();
        java.lang.String str10 = faculty3.getEmail();
        java.lang.String str11 = faculty3.getEmail();
        java.lang.String str12 = faculty3.getEmail();
        faculty3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test06537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06537");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        java.lang.String str7 = faculty3.getID();
        double double8 = faculty3.getHourlyRate();
        java.lang.String str9 = faculty3.getID();
        java.lang.String str10 = faculty3.getAccountType();
        faculty3.setVerified(true);
        java.lang.String str13 = faculty3.getPassword();
        java.lang.String str14 = faculty3.getPassword();
        faculty3.viewProfile();
        double double16 = faculty3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "faculty" + "'", str10, "faculty");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 30.0d + "'", double16 == 30.0d);
    }

    @Test
    public void test06538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06538");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        java.lang.String str7 = faculty3.getID();
        boolean boolean8 = faculty3.isVerified();
        faculty3.setVerified(true);
        java.lang.String str11 = faculty3.getID();
        faculty3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test06539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06539");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.login("", "");
        faculty3.login("faculty", "faculty");
        java.lang.String str13 = faculty3.getPassword();
        double double14 = faculty3.getHourlyRate();
        java.lang.String str15 = faculty3.getEmail();
        java.lang.Class<?> wildcardClass16 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 30.0d + "'", double14 == 30.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test06540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06540");
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
        boolean boolean17 = faculty3.isVerified();
        boolean boolean18 = faculty3.isVerified();
        faculty3.login("", "hi!");
        faculty3.login("", "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "faculty" + "'", str4, "faculty");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test06541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06541");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        java.lang.String str4 = faculty3.getAccountType();
        java.lang.String str5 = faculty3.getEmail();
        java.lang.String str6 = faculty3.getAccountType();
        java.lang.String str7 = faculty3.getAccountType();
        java.lang.String str8 = faculty3.getPassword();
        double double9 = faculty3.getHourlyRate();
        faculty3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "faculty" + "'", str4, "faculty");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "faculty" + "'", str7, "faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 30.0d + "'", double9 == 30.0d);
    }

    @Test
    public void test06542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06542");
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
        java.lang.String str17 = faculty3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "faculty" + "'", str10, "faculty");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test06543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06543");
        model.Faculty faculty3 = new model.Faculty("", "faculty", "faculty");
        faculty3.viewProfile();
        faculty3.viewProfile();
        java.lang.String str6 = faculty3.getAccountType();
        java.lang.String str7 = faculty3.getEmail();
        faculty3.logout();
        java.lang.String str9 = faculty3.getPassword();
        faculty3.logout();
        java.lang.String str11 = faculty3.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "faculty" + "'", str9, "faculty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "faculty" + "'", str11, "faculty");
    }

    @Test
    public void test06544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06544");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getAccountType();
        java.lang.String str7 = faculty3.getAccountType();
        java.lang.String str8 = faculty3.getEmail();
        faculty3.logout();
        java.lang.String str10 = faculty3.getPassword();
        java.lang.Class<?> wildcardClass11 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "faculty" + "'", str7, "faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test06545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06545");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        faculty3.setVerified(false);
        java.lang.String str9 = faculty3.getID();
        faculty3.setVerified(false);
        double double12 = faculty3.getHourlyRate();
        faculty3.logout();
        double double14 = faculty3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 30.0d + "'", double12 == 30.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 30.0d + "'", double14 == 30.0d);
    }

    @Test
    public void test06546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06546");
        model.Faculty faculty3 = new model.Faculty("", "hi!", "hi!");
        faculty3.login("faculty", "faculty");
        faculty3.login("faculty", "hi!");
        boolean boolean10 = faculty3.isVerified();
        faculty3.viewProfile();
        java.lang.String str12 = faculty3.getAccountType();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "faculty" + "'", str12, "faculty");
    }

    @Test
    public void test06547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06547");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        faculty3.logout();
        faculty3.login("hi!", "hi!");
        double double8 = faculty3.getHourlyRate();
        java.lang.String str9 = faculty3.getID();
        java.lang.String str10 = faculty3.getAccountType();
        faculty3.viewProfile();
        java.lang.String str12 = faculty3.getID();
        java.lang.String str13 = faculty3.getEmail();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "faculty" + "'", str10, "faculty");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test06548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06548");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        java.lang.String str7 = faculty3.getID();
        java.lang.String str8 = faculty3.getID();
        java.lang.String str9 = faculty3.getID();
        faculty3.setVerified(true);
        faculty3.setVerified(false);
        faculty3.login("", "hi!");
        java.lang.String str17 = faculty3.getPassword();
        double double18 = faculty3.getHourlyRate();
        double double19 = faculty3.getHourlyRate();
        faculty3.setVerified(true);
        faculty3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 30.0d + "'", double18 == 30.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 30.0d + "'", double19 == 30.0d);
    }

    @Test
    public void test06549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06549");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        faculty3.logout();
        faculty3.login("hi!", "hi!");
        double double8 = faculty3.getHourlyRate();
        boolean boolean9 = faculty3.isVerified();
        boolean boolean10 = faculty3.isVerified();
        boolean boolean11 = faculty3.isVerified();
        boolean boolean12 = faculty3.isVerified();
        faculty3.logout();
        faculty3.logout();
        java.lang.String str15 = faculty3.getEmail();
        boolean boolean16 = faculty3.isVerified();
        faculty3.login("faculty", "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test06550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06550");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        java.lang.String str8 = faculty3.getPassword();
        java.lang.String str9 = faculty3.getID();
        double double10 = faculty3.getHourlyRate();
        faculty3.login("faculty", "");
        faculty3.viewProfile();
        java.lang.String str15 = faculty3.getPassword();
        java.lang.String str16 = faculty3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 30.0d + "'", double10 == 30.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test06551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06551");
        model.Faculty faculty3 = new model.Faculty("hi!", "hi!", "");
        faculty3.logout();
        java.lang.String str5 = faculty3.getEmail();
        faculty3.setVerified(true);
        faculty3.setVerified(true);
        java.lang.Class<?> wildcardClass10 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test06552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06552");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        double double4 = faculty3.getHourlyRate();
        faculty3.logout();
        boolean boolean6 = faculty3.isVerified();
        double double7 = faculty3.getHourlyRate();
        faculty3.login("faculty", "faculty");
        java.lang.String str11 = faculty3.getAccountType();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 30.0d + "'", double4 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "faculty" + "'", str11, "faculty");
    }

    @Test
    public void test06553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06553");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        faculty3.setVerified(false);
        java.lang.String str10 = faculty3.getID();
        faculty3.viewProfile();
        faculty3.login("", "");
        java.lang.String str15 = faculty3.getPassword();
        double double16 = faculty3.getHourlyRate();
        java.lang.String str17 = faculty3.getPassword();
        faculty3.viewProfile();
        java.lang.String str19 = faculty3.getEmail();
        java.lang.String str20 = faculty3.getPassword();
        double double21 = faculty3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 30.0d + "'", double16 == 30.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 30.0d + "'", double21 == 30.0d);
    }

    @Test
    public void test06554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06554");
        model.Faculty faculty3 = new model.Faculty("", "faculty", "faculty");
        double double4 = faculty3.getHourlyRate();
        java.lang.String str5 = faculty3.getAccountType();
        java.lang.String str6 = faculty3.getAccountType();
        faculty3.login("faculty", "");
        faculty3.login("faculty", "");
        java.lang.String str13 = faculty3.getID();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 30.0d + "'", double4 == 30.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "faculty" + "'", str13, "faculty");
    }

    @Test
    public void test06555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06555");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        boolean boolean7 = faculty3.isVerified();
        faculty3.logout();
        java.lang.String str9 = faculty3.getID();
        java.lang.String str10 = faculty3.getAccountType();
        boolean boolean11 = faculty3.isVerified();
        faculty3.setVerified(false);
        java.lang.String str14 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "faculty" + "'", str10, "faculty");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "faculty" + "'", str14, "faculty");
    }

    @Test
    public void test06556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06556");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        faculty3.logout();
        java.lang.String str5 = faculty3.getID();
        java.lang.String str6 = faculty3.getEmail();
        java.lang.String str7 = faculty3.getEmail();
        java.lang.String str8 = faculty3.getEmail();
        java.lang.String str9 = faculty3.getAccountType();
        faculty3.logout();
        faculty3.logout();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "faculty" + "'", str9, "faculty");
    }

    @Test
    public void test06557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06557");
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
        java.lang.String str15 = faculty3.getID();
        java.lang.String str16 = faculty3.getID();
        faculty3.login("faculty", "");
        double double20 = faculty3.getHourlyRate();
        faculty3.logout();
        faculty3.logout();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 30.0d + "'", double20 == 30.0d);
    }

    @Test
    public void test06558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06558");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getAccountType();
        faculty3.logout();
        java.lang.String str8 = faculty3.getEmail();
        faculty3.viewProfile();
        java.lang.String str10 = faculty3.getID();
        faculty3.logout();
        boolean boolean12 = faculty3.isVerified();
        java.lang.String str13 = faculty3.getAccountType();
        java.lang.Class<?> wildcardClass14 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "faculty" + "'", str13, "faculty");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test06559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06559");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        java.lang.String str8 = faculty3.getAccountType();
        java.lang.String str9 = faculty3.getAccountType();
        java.lang.String str10 = faculty3.getID();
        faculty3.setVerified(false);
        double double13 = faculty3.getHourlyRate();
        faculty3.login("hi!", "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "faculty" + "'", str8, "faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "faculty" + "'", str9, "faculty");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 30.0d + "'", double13 == 30.0d);
    }

    @Test
    public void test06560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06560");
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
        java.lang.String str14 = faculty3.getEmail();
        faculty3.login("faculty", "");
        faculty3.login("", "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "faculty" + "'", str11, "faculty");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 30.0d + "'", double13 == 30.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test06561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06561");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        java.lang.String str4 = faculty3.getAccountType();
        java.lang.String str5 = faculty3.getEmail();
        faculty3.viewProfile();
        java.lang.String str7 = faculty3.getPassword();
        java.lang.String str8 = faculty3.getID();
        faculty3.login("faculty", "hi!");
        java.lang.String str12 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "faculty" + "'", str4, "faculty");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "faculty" + "'", str12, "faculty");
    }

    @Test
    public void test06562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06562");
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
        java.lang.String str16 = faculty3.getID();
        java.lang.String str17 = faculty3.getEmail();
        java.lang.String str18 = faculty3.getEmail();
        java.lang.String str19 = faculty3.getID();
        java.lang.String str20 = faculty3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 30.0d + "'", double14 == 30.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test06563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06563");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getEmail();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        double double8 = faculty3.getHourlyRate();
        double double9 = faculty3.getHourlyRate();
        faculty3.viewProfile();
        faculty3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 30.0d + "'", double9 == 30.0d);
    }

    @Test
    public void test06564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06564");
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
        java.lang.String str20 = faculty3.getEmail();
        faculty3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 30.0d + "'", double11 == 30.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 30.0d + "'", double18 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test06565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06565");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        faculty3.logout();
        faculty3.login("hi!", "hi!");
        faculty3.viewProfile();
        java.lang.String str9 = faculty3.getPassword();
        java.lang.String str10 = faculty3.getID();
        faculty3.logout();
        boolean boolean12 = faculty3.isVerified();
        java.lang.String str13 = faculty3.getID();
        double double14 = faculty3.getHourlyRate();
        java.lang.String str15 = faculty3.getEmail();
        faculty3.login("", "hi!");
        java.lang.Class<?> wildcardClass19 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 30.0d + "'", double14 == 30.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test06566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06566");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        faculty3.setVerified(false);
        java.lang.String str10 = faculty3.getAccountType();
        java.lang.String str11 = faculty3.getEmail();
        java.lang.String str12 = faculty3.getPassword();
        double double13 = faculty3.getHourlyRate();
        faculty3.logout();
        faculty3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "faculty" + "'", str10, "faculty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 30.0d + "'", double13 == 30.0d);
    }

    @Test
    public void test06567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06567");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        faculty3.logout();
        java.lang.String str5 = faculty3.getID();
        java.lang.String str6 = faculty3.getEmail();
        double double7 = faculty3.getHourlyRate();
        boolean boolean8 = faculty3.isVerified();
        boolean boolean9 = faculty3.isVerified();
        faculty3.login("", "faculty");
        boolean boolean13 = faculty3.isVerified();
        faculty3.login("", "hi!");
        java.lang.String str17 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "faculty" + "'", str17, "faculty");
    }

    @Test
    public void test06568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06568");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        faculty3.setVerified(false);
        faculty3.viewProfile();
        double double7 = faculty3.getHourlyRate();
        java.lang.String str8 = faculty3.getID();
        faculty3.viewProfile();
        java.lang.Class<?> wildcardClass10 = faculty3.getClass();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test06569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06569");
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
        faculty3.setVerified(true);
        faculty3.logout();
        java.lang.String str19 = faculty3.getPassword();
        double double20 = faculty3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "faculty" + "'", str4, "faculty");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 30.0d + "'", double20 == 30.0d);
    }

    @Test
    public void test06570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06570");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        java.lang.String str8 = faculty3.getPassword();
        java.lang.String str9 = faculty3.getPassword();
        faculty3.logout();
        faculty3.viewProfile();
        faculty3.logout();
        java.lang.String str13 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "faculty" + "'", str13, "faculty");
    }

    @Test
    public void test06571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06571");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        faculty3.setVerified(false);
        java.lang.String str10 = faculty3.getID();
        faculty3.viewProfile();
        faculty3.login("", "");
        java.lang.String str15 = faculty3.getPassword();
        double double16 = faculty3.getHourlyRate();
        java.lang.String str17 = faculty3.getEmail();
        java.lang.String str18 = faculty3.getEmail();
        java.lang.String str19 = faculty3.getEmail();
        java.lang.String str20 = faculty3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 30.0d + "'", double16 == 30.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test06572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06572");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        faculty3.logout();
        java.lang.String str5 = faculty3.getID();
        java.lang.String str6 = faculty3.getEmail();
        java.lang.String str7 = faculty3.getID();
        boolean boolean8 = faculty3.isVerified();
        java.lang.String str9 = faculty3.getEmail();
        double double10 = faculty3.getHourlyRate();
        faculty3.logout();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 30.0d + "'", double10 == 30.0d);
    }

    @Test
    public void test06573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06573");
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
        faculty3.viewProfile();
        boolean boolean17 = faculty3.isVerified();
        faculty3.viewProfile();
        faculty3.viewProfile();
        java.lang.String str20 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "faculty" + "'", str11, "faculty");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "faculty" + "'", str20, "faculty");
    }

    @Test
    public void test06574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06574");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        java.lang.String str7 = faculty3.getID();
        faculty3.setVerified(true);
        faculty3.setVerified(false);
        java.lang.String str12 = faculty3.getEmail();
        java.lang.String str13 = faculty3.getPassword();
        faculty3.logout();
        java.lang.String str15 = faculty3.getPassword();
        java.lang.String str16 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "faculty" + "'", str16, "faculty");
    }

    @Test
    public void test06575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06575");
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
        faculty3.viewProfile();
        java.lang.Class<?> wildcardClass19 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test06576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06576");
        model.Faculty faculty3 = new model.Faculty("", "", "faculty");
        java.lang.String str4 = faculty3.getAccountType();
        java.lang.String str5 = faculty3.getID();
        java.lang.String str6 = faculty3.getAccountType();
        java.lang.String str7 = faculty3.getEmail();
        java.lang.String str8 = faculty3.getPassword();
        java.lang.String str9 = faculty3.getID();
        java.lang.String str10 = faculty3.getID();
        faculty3.login("hi!", "faculty");
        faculty3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "faculty" + "'", str4, "faculty");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "faculty" + "'", str9, "faculty");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "faculty" + "'", str10, "faculty");
    }

    @Test
    public void test06577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06577");
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
        java.lang.String str15 = faculty3.getID();
        java.lang.String str16 = faculty3.getID();
        faculty3.login("faculty", "");
        double double20 = faculty3.getHourlyRate();
        java.lang.Class<?> wildcardClass21 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 30.0d + "'", double20 == 30.0d);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test06578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06578");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        faculty3.logout();
        java.lang.String str5 = faculty3.getID();
        java.lang.String str6 = faculty3.getEmail();
        faculty3.viewProfile();
        faculty3.setVerified(false);
        java.lang.String str10 = faculty3.getID();
        java.lang.String str11 = faculty3.getAccountType();
        faculty3.logout();
        faculty3.logout();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "faculty" + "'", str11, "faculty");
    }

    @Test
    public void test06579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06579");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        faculty3.setVerified(false);
        java.lang.String str10 = faculty3.getAccountType();
        java.lang.String str11 = faculty3.getEmail();
        faculty3.logout();
        boolean boolean13 = faculty3.isVerified();
        boolean boolean14 = faculty3.isVerified();
        faculty3.login("faculty", "faculty");
        boolean boolean18 = faculty3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "faculty" + "'", str10, "faculty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test06580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06580");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        java.lang.String str6 = faculty3.getPassword();
        faculty3.setVerified(false);
        faculty3.setVerified(false);
        java.lang.String str11 = faculty3.getID();
        java.lang.String str12 = faculty3.getAccountType();
        boolean boolean13 = faculty3.isVerified();
        java.lang.String str14 = faculty3.getPassword();
        java.lang.String str15 = faculty3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "faculty" + "'", str12, "faculty");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test06581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06581");
        model.Faculty faculty3 = new model.Faculty("hi!", "hi!", "");
        faculty3.logout();
        java.lang.String str5 = faculty3.getEmail();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        double double8 = faculty3.getHourlyRate();
        boolean boolean9 = faculty3.isVerified();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test06582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06582");
        model.Faculty faculty3 = new model.Faculty("hi!", "hi!", "");
        faculty3.logout();
        java.lang.String str5 = faculty3.getEmail();
        faculty3.logout();
        java.lang.String str7 = faculty3.getEmail();
        boolean boolean8 = faculty3.isVerified();
        java.lang.String str9 = faculty3.getEmail();
        java.lang.String str10 = faculty3.getAccountType();
        faculty3.viewProfile();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "faculty" + "'", str10, "faculty");
    }

    @Test
    public void test06583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06583");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        boolean boolean7 = faculty3.isVerified();
        java.lang.String str8 = faculty3.getID();
        boolean boolean9 = faculty3.isVerified();
        faculty3.viewProfile();
        boolean boolean11 = faculty3.isVerified();
        java.lang.String str12 = faculty3.getID();
        java.lang.String str13 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "faculty" + "'", str13, "faculty");
    }

    @Test
    public void test06584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06584");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        faculty3.logout();
        faculty3.login("hi!", "hi!");
        java.lang.String str8 = faculty3.getID();
        boolean boolean9 = faculty3.isVerified();
        faculty3.setVerified(true);
        java.lang.String str12 = faculty3.getPassword();
        java.lang.String str13 = faculty3.getID();
        java.lang.String str14 = faculty3.getID();
        java.lang.String str15 = faculty3.getAccountType();
        java.lang.Class<?> wildcardClass16 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "faculty" + "'", str15, "faculty");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test06585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06585");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        faculty3.login("", "");
        double double7 = faculty3.getHourlyRate();
        faculty3.login("faculty", "faculty");
        boolean boolean11 = faculty3.isVerified();
        java.lang.String str12 = faculty3.getID();
        faculty3.logout();
        faculty3.login("faculty", "");
        double double17 = faculty3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 30.0d + "'", double17 == 30.0d);
    }

    @Test
    public void test06586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06586");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        java.lang.String str8 = faculty3.getPassword();
        faculty3.setVerified(false);
        java.lang.String str11 = faculty3.getID();
        boolean boolean12 = faculty3.isVerified();
        java.lang.String str13 = faculty3.getAccountType();
        boolean boolean14 = faculty3.isVerified();
        java.lang.Class<?> wildcardClass15 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "faculty" + "'", str13, "faculty");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test06587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06587");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        faculty3.logout();
        faculty3.login("hi!", "hi!");
        double double8 = faculty3.getHourlyRate();
        boolean boolean9 = faculty3.isVerified();
        faculty3.setVerified(false);
        java.lang.String str12 = faculty3.getPassword();
        boolean boolean13 = faculty3.isVerified();
        java.lang.String str14 = faculty3.getEmail();
        faculty3.login("", "");
        java.lang.Class<?> wildcardClass18 = faculty3.getClass();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test06588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06588");
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
        faculty3.viewProfile();
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
    public void test06589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06589");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.login("", "");
        double double10 = faculty3.getHourlyRate();
        java.lang.String str11 = faculty3.getPassword();
        double double12 = faculty3.getHourlyRate();
        faculty3.logout();
        java.lang.String str14 = faculty3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 30.0d + "'", double10 == 30.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 30.0d + "'", double12 == 30.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test06590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06590");
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
        faculty3.viewProfile();
        faculty3.logout();
        boolean boolean17 = faculty3.isVerified();
        java.lang.String str18 = faculty3.getPassword();
        faculty3.viewProfile();
        faculty3.viewProfile();
        java.lang.String str21 = faculty3.getID();
        java.lang.Class<?> wildcardClass22 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test06591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06591");
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
        java.lang.String str19 = faculty3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "faculty" + "'", str10, "faculty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test06592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06592");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        faculty3.setVerified(false);
        java.lang.String str10 = faculty3.getID();
        faculty3.viewProfile();
        faculty3.login("", "");
        java.lang.String str15 = faculty3.getPassword();
        double double16 = faculty3.getHourlyRate();
        boolean boolean17 = faculty3.isVerified();
        faculty3.login("hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 30.0d + "'", double16 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test06593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06593");
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
        boolean boolean15 = faculty3.isVerified();
        java.lang.Class<?> wildcardClass16 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "faculty" + "'", str12, "faculty");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "faculty" + "'", str14, "faculty");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test06594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06594");
        model.Faculty faculty3 = new model.Faculty("hi!", "faculty", "");
        java.lang.String str4 = faculty3.getEmail();
        faculty3.viewProfile();
        faculty3.login("", "faculty");
        java.lang.String str9 = faculty3.getID();
        faculty3.login("faculty", "hi!");
        java.lang.String str13 = faculty3.getEmail();
        double double14 = faculty3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 30.0d + "'", double14 == 30.0d);
    }

    @Test
    public void test06595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06595");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        java.lang.String str7 = faculty3.getID();
        faculty3.login("hi!", "");
        java.lang.String str11 = faculty3.getPassword();
        faculty3.logout();
        faculty3.login("faculty", "hi!");
        java.lang.String str16 = faculty3.getEmail();
        java.lang.String str17 = faculty3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test06596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06596");
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
        java.lang.String str18 = faculty3.getAccountType();
        java.lang.String str19 = faculty3.getPassword();
        java.lang.String str20 = faculty3.getEmail();
        double double21 = faculty3.getHourlyRate();
        java.lang.String str22 = faculty3.getPassword();
        java.lang.String str23 = faculty3.getID();
        faculty3.login("faculty", "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 30.0d + "'", double11 == 30.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "faculty" + "'", str18, "faculty");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 30.0d + "'", double21 == 30.0d);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
    }

    @Test
    public void test06597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06597");
        model.Faculty faculty3 = new model.Faculty("", "faculty", "hi!");
        boolean boolean4 = faculty3.isVerified();
        double double5 = faculty3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 30.0d + "'", double5 == 30.0d);
    }

    @Test
    public void test06598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06598");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        faculty3.login("", "");
        double double7 = faculty3.getHourlyRate();
        faculty3.login("faculty", "faculty");
        java.lang.String str11 = faculty3.getPassword();
        java.lang.String str12 = faculty3.getAccountType();
        java.lang.String str13 = faculty3.getPassword();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "faculty" + "'", str12, "faculty");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test06599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06599");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        double double6 = faculty3.getHourlyRate();
        faculty3.login("hi!", "");
        java.lang.String str10 = faculty3.getID();
        java.lang.String str11 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "faculty" + "'", str11, "faculty");
    }

    @Test
    public void test06600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06600");
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
        boolean boolean17 = faculty3.isVerified();
        java.lang.String str18 = faculty3.getPassword();
        java.lang.String str19 = faculty3.getAccountType();
        boolean boolean20 = faculty3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "faculty" + "'", str13, "faculty");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "faculty" + "'", str19, "faculty");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test06601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06601");
        model.Faculty faculty3 = new model.Faculty("hi!", "hi!", "");
        faculty3.viewProfile();
        java.lang.String str5 = faculty3.getAccountType();
        double double6 = faculty3.getHourlyRate();
        java.lang.String str7 = faculty3.getEmail();
        double double8 = faculty3.getHourlyRate();
        faculty3.logout();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
    }

    @Test
    public void test06602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06602");
        model.Faculty faculty3 = new model.Faculty("hi!", "faculty", "");
        java.lang.String str4 = faculty3.getEmail();
        faculty3.viewProfile();
        java.lang.String str6 = faculty3.getAccountType();
        faculty3.viewProfile();
        java.lang.String str8 = faculty3.getID();
        java.lang.String str9 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "faculty" + "'", str9, "faculty");
    }

    @Test
    public void test06603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06603");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        double double6 = faculty3.getHourlyRate();
        faculty3.setVerified(true);
        java.lang.String str9 = faculty3.getID();
        boolean boolean10 = faculty3.isVerified();
        java.lang.String str11 = faculty3.getAccountType();
        boolean boolean12 = faculty3.isVerified();
        java.lang.String str13 = faculty3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "faculty" + "'", str11, "faculty");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test06604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06604");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        java.lang.String str4 = faculty3.getAccountType();
        faculty3.setVerified(true);
        java.lang.String str7 = faculty3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "faculty" + "'", str4, "faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test06605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06605");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        double double6 = faculty3.getHourlyRate();
        java.lang.String str7 = faculty3.getPassword();
        faculty3.login("", "faculty");
        boolean boolean11 = faculty3.isVerified();
        double double12 = faculty3.getHourlyRate();
        boolean boolean13 = faculty3.isVerified();
        faculty3.viewProfile();
        boolean boolean15 = faculty3.isVerified();
        boolean boolean16 = faculty3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 30.0d + "'", double12 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test06606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06606");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        faculty3.logout();
        faculty3.viewProfile();
        faculty3.setVerified(true);
        faculty3.setVerified(true);
        faculty3.login("faculty", "faculty");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test06607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06607");
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
        faculty3.logout();
        java.lang.String str18 = faculty3.getID();
        faculty3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test06608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06608");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        java.lang.String str4 = faculty3.getAccountType();
        java.lang.String str5 = faculty3.getEmail();
        faculty3.viewProfile();
        double double7 = faculty3.getHourlyRate();
        faculty3.setVerified(true);
        faculty3.viewProfile();
        java.lang.String str11 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "faculty" + "'", str4, "faculty");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "faculty" + "'", str11, "faculty");
    }

    @Test
    public void test06609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06609");
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
        faculty3.login("hi!", "faculty");
        boolean boolean19 = faculty3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "faculty" + "'", str8, "faculty");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "faculty" + "'", str12, "faculty");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test06610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06610");
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
        faculty3.viewProfile();
        java.lang.String str19 = faculty3.getEmail();
        faculty3.setVerified(false);
        double double22 = faculty3.getHourlyRate();
        double double23 = faculty3.getHourlyRate();
        java.lang.String str24 = faculty3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "faculty" + "'", str13, "faculty");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 30.0d + "'", double22 == 30.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 30.0d + "'", double23 == 30.0d);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test06611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06611");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getAccountType();
        faculty3.logout();
        java.lang.String str8 = faculty3.getEmail();
        faculty3.viewProfile();
        boolean boolean10 = faculty3.isVerified();
        java.lang.String str11 = faculty3.getID();
        java.lang.String str12 = faculty3.getEmail();
        faculty3.logout();
        java.lang.String str14 = faculty3.getEmail();
        java.lang.String str15 = faculty3.getAccountType();
        double double16 = faculty3.getHourlyRate();
        faculty3.setVerified(false);
        faculty3.logout();
        faculty3.login("", "hi!");
        faculty3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "faculty" + "'", str15, "faculty");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 30.0d + "'", double16 == 30.0d);
    }

    @Test
    public void test06612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06612");
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
        double double14 = faculty3.getHourlyRate();
        boolean boolean15 = faculty3.isVerified();
        double double16 = faculty3.getHourlyRate();
        faculty3.setVerified(true);
        faculty3.viewProfile();
        faculty3.login("faculty", "faculty");
        faculty3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 30.0d + "'", double13 == 30.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 30.0d + "'", double14 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 30.0d + "'", double16 == 30.0d);
    }

    @Test
    public void test06613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06613");
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
        faculty3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 30.0d + "'", double13 == 30.0d);
    }

    @Test
    public void test06614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06614");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        java.lang.String str4 = faculty3.getAccountType();
        java.lang.String str5 = faculty3.getID();
        faculty3.setVerified(true);
        boolean boolean8 = faculty3.isVerified();
        faculty3.setVerified(false);
        faculty3.viewProfile();
        java.lang.String str12 = faculty3.getEmail();
        faculty3.setVerified(false);
        java.lang.Class<?> wildcardClass15 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "faculty" + "'", str4, "faculty");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test06615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06615");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        java.lang.String str7 = faculty3.getID();
        faculty3.setVerified(true);
        java.lang.String str10 = faculty3.getEmail();
        faculty3.setVerified(true);
        faculty3.login("", "");
        faculty3.viewProfile();
        faculty3.setVerified(false);
        java.lang.String str19 = faculty3.getID();
        boolean boolean20 = faculty3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test06616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06616");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        faculty3.login("", "");
        java.lang.String str7 = faculty3.getPassword();
        java.lang.String str8 = faculty3.getEmail();
        faculty3.logout();
        java.lang.String str10 = faculty3.getEmail();
        java.lang.String str11 = faculty3.getID();
        java.lang.String str12 = faculty3.getID();
        double double13 = faculty3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 30.0d + "'", double13 == 30.0d);
    }

    @Test
    public void test06617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06617");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        faculty3.logout();
        java.lang.String str5 = faculty3.getID();
        java.lang.String str6 = faculty3.getPassword();
        double double7 = faculty3.getHourlyRate();
        faculty3.setVerified(false);
        java.lang.String str10 = faculty3.getPassword();
        faculty3.viewProfile();
        double double12 = faculty3.getHourlyRate();
        java.lang.String str13 = faculty3.getEmail();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 30.0d + "'", double12 == 30.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test06618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06618");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        faculty3.login("", "");
        double double7 = faculty3.getHourlyRate();
        faculty3.login("faculty", "faculty");
        java.lang.Class<?> wildcardClass11 = faculty3.getClass();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test06619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06619");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        boolean boolean7 = faculty3.isVerified();
        faculty3.logout();
        java.lang.String str9 = faculty3.getID();
        java.lang.String str10 = faculty3.getID();
        faculty3.login("hi!", "hi!");
        faculty3.setVerified(true);
        java.lang.String str16 = faculty3.getAccountType();
        java.lang.Class<?> wildcardClass17 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "faculty" + "'", str16, "faculty");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test06620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06620");
        model.Faculty faculty3 = new model.Faculty("faculty", "hi!", "");
        faculty3.login("hi!", "hi!");
        faculty3.logout();
        java.lang.String str8 = faculty3.getAccountType();
        faculty3.login("", "");
        faculty3.viewProfile();
        faculty3.logout();
        boolean boolean14 = faculty3.isVerified();
        java.lang.String str15 = faculty3.getID();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "faculty" + "'", str8, "faculty");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test06621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06621");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        faculty3.setVerified(false);
        java.lang.String str10 = faculty3.getID();
        faculty3.viewProfile();
        faculty3.login("", "");
        java.lang.String str15 = faculty3.getPassword();
        boolean boolean16 = faculty3.isVerified();
        java.lang.String str17 = faculty3.getID();
        boolean boolean18 = faculty3.isVerified();
        java.lang.String str19 = faculty3.getAccountType();
        java.lang.String str20 = faculty3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "faculty" + "'", str19, "faculty");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test06622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06622");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        java.lang.String str8 = faculty3.getAccountType();
        java.lang.String str9 = faculty3.getAccountType();
        faculty3.viewProfile();
        faculty3.logout();
        faculty3.login("faculty", "");
        faculty3.viewProfile();
        java.lang.String str16 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "faculty" + "'", str8, "faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "faculty" + "'", str9, "faculty");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "faculty" + "'", str16, "faculty");
    }

    @Test
    public void test06623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06623");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        faculty3.logout();
        java.lang.String str5 = faculty3.getID();
        java.lang.String str6 = faculty3.getPassword();
        faculty3.logout();
        java.lang.String str8 = faculty3.getPassword();
        java.lang.String str9 = faculty3.getPassword();
        faculty3.setVerified(true);
        faculty3.login("", "faculty");
        faculty3.setVerified(true);
        faculty3.setVerified(false);
        boolean boolean19 = faculty3.isVerified();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test06624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06624");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        faculty3.setVerified(false);
        faculty3.viewProfile();
        java.lang.String str7 = faculty3.getEmail();
        java.lang.String str8 = faculty3.getAccountType();
        java.lang.String str9 = faculty3.getID();
        java.lang.String str10 = faculty3.getAccountType();
        faculty3.setVerified(false);
        faculty3.logout();
        boolean boolean14 = faculty3.isVerified();
        java.lang.String str15 = faculty3.getAccountType();
        faculty3.viewProfile();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "faculty" + "'", str8, "faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "faculty" + "'", str10, "faculty");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "faculty" + "'", str15, "faculty");
    }

    @Test
    public void test06625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06625");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.viewProfile();
        boolean boolean8 = faculty3.isVerified();
        java.lang.String str9 = faculty3.getEmail();
        faculty3.setVerified(true);
        boolean boolean12 = faculty3.isVerified();
        faculty3.setVerified(false);
        java.lang.String str15 = faculty3.getAccountType();
        faculty3.viewProfile();
        java.lang.String str17 = faculty3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "faculty" + "'", str15, "faculty");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test06626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06626");
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
        faculty3.viewProfile();
        boolean boolean15 = faculty3.isVerified();
        faculty3.viewProfile();
        faculty3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "faculty" + "'", str13, "faculty");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test06627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06627");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        double double6 = faculty3.getHourlyRate();
        java.lang.String str7 = faculty3.getPassword();
        faculty3.login("", "faculty");
        java.lang.String str11 = faculty3.getAccountType();
        java.lang.String str12 = faculty3.getAccountType();
        double double13 = faculty3.getHourlyRate();
        boolean boolean14 = faculty3.isVerified();
        double double15 = faculty3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "faculty" + "'", str11, "faculty");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "faculty" + "'", str12, "faculty");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 30.0d + "'", double13 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 30.0d + "'", double15 == 30.0d);
    }

    @Test
    public void test06628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06628");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        double double6 = faculty3.getHourlyRate();
        faculty3.logout();
        faculty3.viewProfile();
        java.lang.String str9 = faculty3.getEmail();
        java.lang.String str10 = faculty3.getEmail();
        faculty3.logout();
        faculty3.login("faculty", "hi!");
        faculty3.setVerified(false);
        double double17 = faculty3.getHourlyRate();
        faculty3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 30.0d + "'", double17 == 30.0d);
    }

    @Test
    public void test06629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06629");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        faculty3.logout();
        java.lang.String str6 = faculty3.getPassword();
        faculty3.viewProfile();
        double double8 = faculty3.getHourlyRate();
        boolean boolean9 = faculty3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test06630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06630");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        faculty3.login("", "");
        faculty3.viewProfile();
        faculty3.viewProfile();
        faculty3.login("", "");
        faculty3.viewProfile();
        faculty3.logout();
        java.lang.String str14 = faculty3.getID();
        java.lang.String str15 = faculty3.getID();
        faculty3.viewProfile();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test06631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06631");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        faculty3.setVerified(false);
        java.lang.String str6 = faculty3.getEmail();
        faculty3.setVerified(false);
        faculty3.login("faculty", "hi!");
        faculty3.logout();
        faculty3.viewProfile();
        faculty3.viewProfile();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test06632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06632");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        faculty3.logout();
        faculty3.login("hi!", "hi!");
        faculty3.viewProfile();
        faculty3.login("", "faculty");
        faculty3.login("", "faculty");
        java.lang.String str15 = faculty3.getID();
        java.lang.String str16 = faculty3.getEmail();
        double double17 = faculty3.getHourlyRate();
        faculty3.login("hi!", "hi!");
        java.lang.String str21 = faculty3.getEmail();
        java.lang.String str22 = faculty3.getPassword();
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 30.0d + "'", double17 == 30.0d);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test06633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06633");
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
        java.lang.String str17 = faculty3.getPassword();
        java.lang.String str18 = faculty3.getEmail();
        java.lang.String str19 = faculty3.getEmail();
        java.lang.String str20 = faculty3.getPassword();
        faculty3.viewProfile();
        java.lang.String str22 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "faculty" + "'", str22, "faculty");
    }

    @Test
    public void test06634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06634");
        model.Faculty faculty3 = new model.Faculty("", "faculty", "");
        java.lang.String str4 = faculty3.getPassword();
        java.lang.String str5 = faculty3.getEmail();
        faculty3.login("hi!", "hi!");
        faculty3.logout();
        double double10 = faculty3.getHourlyRate();
        java.lang.String str11 = faculty3.getPassword();
        java.lang.String str12 = faculty3.getID();
        java.lang.String str13 = faculty3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "faculty" + "'", str4, "faculty");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 30.0d + "'", double10 == 30.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "faculty" + "'", str11, "faculty");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test06635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06635");
        model.Faculty faculty3 = new model.Faculty("", "faculty", "faculty");
        faculty3.setVerified(true);
        java.lang.String str6 = faculty3.getPassword();
        boolean boolean7 = faculty3.isVerified();
        java.lang.String str8 = faculty3.getEmail();
        double double9 = faculty3.getHourlyRate();
        java.lang.String str10 = faculty3.getID();
        faculty3.viewProfile();
        faculty3.login("faculty", "hi!");
        java.lang.Class<?> wildcardClass15 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 30.0d + "'", double9 == 30.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "faculty" + "'", str10, "faculty");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test06636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06636");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getAccountType();
        java.lang.String str7 = faculty3.getAccountType();
        java.lang.String str8 = faculty3.getEmail();
        java.lang.String str9 = faculty3.getID();
        java.lang.String str10 = faculty3.getEmail();
        faculty3.login("faculty", "");
        faculty3.setVerified(false);
        faculty3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "faculty" + "'", str7, "faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test06637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06637");
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
        java.lang.String str22 = faculty3.getAccountType();
        java.lang.String str23 = faculty3.getEmail();
        java.lang.String str24 = faculty3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "faculty" + "'", str17, "faculty");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 30.0d + "'", double18 == 30.0d);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "faculty" + "'", str22, "faculty");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test06638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06638");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        java.lang.String str7 = faculty3.getID();
        faculty3.login("hi!", "");
        java.lang.String str11 = faculty3.getEmail();
        faculty3.setVerified(false);
        faculty3.login("", "faculty");
        java.lang.String str17 = faculty3.getAccountType();
        faculty3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "faculty" + "'", str17, "faculty");
    }

    @Test
    public void test06639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06639");
        model.Faculty faculty3 = new model.Faculty("hi!", "hi!", "faculty");
        faculty3.login("hi!", "faculty");
        faculty3.login("", "faculty");
        java.lang.String str10 = faculty3.getPassword();
        faculty3.viewProfile();
        faculty3.setVerified(false);
        java.lang.String str14 = faculty3.getAccountType();
        boolean boolean15 = faculty3.isVerified();
        java.lang.String str16 = faculty3.getPassword();
        faculty3.viewProfile();
        double double18 = faculty3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "faculty" + "'", str14, "faculty");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 30.0d + "'", double18 == 30.0d);
    }

    @Test
    public void test06640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06640");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        faculty3.setVerified(false);
        java.lang.String str9 = faculty3.getID();
        java.lang.String str10 = faculty3.getAccountType();
        double double11 = faculty3.getHourlyRate();
        java.lang.String str12 = faculty3.getPassword();
        faculty3.setVerified(true);
        double double15 = faculty3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "faculty" + "'", str10, "faculty");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 30.0d + "'", double11 == 30.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 30.0d + "'", double15 == 30.0d);
    }

    @Test
    public void test06641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06641");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        faculty3.setVerified(false);
        faculty3.viewProfile();
        java.lang.String str7 = faculty3.getEmail();
        java.lang.String str8 = faculty3.getAccountType();
        faculty3.logout();
        boolean boolean10 = faculty3.isVerified();
        faculty3.login("hi!", "hi!");
        java.lang.String str14 = faculty3.getAccountType();
        java.lang.String str15 = faculty3.getID();
        double double16 = faculty3.getHourlyRate();
        faculty3.logout();
        java.lang.String str18 = faculty3.getID();
        java.lang.Class<?> wildcardClass19 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "faculty" + "'", str8, "faculty");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "faculty" + "'", str14, "faculty");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 30.0d + "'", double16 == 30.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test06642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06642");
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
        java.lang.String str14 = faculty3.getAccountType();
        java.lang.String str15 = faculty3.getID();
        faculty3.login("", "faculty");
        faculty3.viewProfile();
        faculty3.viewProfile();
        java.lang.String str21 = faculty3.getPassword();
        double double22 = faculty3.getHourlyRate();
        java.lang.String str23 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "faculty" + "'", str13, "faculty");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "faculty" + "'", str14, "faculty");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 30.0d + "'", double22 == 30.0d);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "faculty" + "'", str23, "faculty");
    }

    @Test
    public void test06643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06643");
        model.Faculty faculty3 = new model.Faculty("hi!", "hi!", "");
        faculty3.logout();
        java.lang.String str5 = faculty3.getEmail();
        boolean boolean6 = faculty3.isVerified();
        faculty3.login("", "faculty");
        boolean boolean10 = faculty3.isVerified();
        faculty3.logout();
        java.lang.Class<?> wildcardClass12 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test06644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06644");
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
        faculty3.viewProfile();
        boolean boolean21 = faculty3.isVerified();
        java.lang.String str22 = faculty3.getAccountType();
        faculty3.setVerified(true);
        faculty3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "faculty" + "'", str11, "faculty");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "faculty" + "'", str22, "faculty");
    }

    @Test
    public void test06645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06645");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        java.lang.String str7 = faculty3.getID();
        double double8 = faculty3.getHourlyRate();
        java.lang.String str9 = faculty3.getID();
        faculty3.logout();
        boolean boolean11 = faculty3.isVerified();
        java.lang.Class<?> wildcardClass12 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test06646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06646");
        model.Faculty faculty3 = new model.Faculty("hi!", "hi!", "");
        faculty3.setVerified(true);
        double double6 = faculty3.getHourlyRate();
        java.lang.String str7 = faculty3.getEmail();
        faculty3.viewProfile();
        faculty3.logout();
        java.lang.Class<?> wildcardClass10 = faculty3.getClass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test06647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06647");
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
        double double14 = faculty3.getHourlyRate();
        java.lang.String str15 = faculty3.getPassword();
        java.lang.String str16 = faculty3.getID();
        java.lang.String str17 = faculty3.getID();
        double double18 = faculty3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 30.0d + "'", double14 == 30.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 30.0d + "'", double18 == 30.0d);
    }

    @Test
    public void test06648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06648");
        model.Faculty faculty3 = new model.Faculty("hi!", "faculty", "");
        java.lang.String str4 = faculty3.getEmail();
        faculty3.logout();
        java.lang.String str6 = faculty3.getID();
        java.lang.String str7 = faculty3.getAccountType();
        double double8 = faculty3.getHourlyRate();
        java.lang.String str9 = faculty3.getAccountType();
        java.lang.String str10 = faculty3.getEmail();
        java.lang.String str11 = faculty3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "faculty" + "'", str7, "faculty");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "faculty" + "'", str9, "faculty");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test06649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06649");
        model.Faculty faculty3 = new model.Faculty("hi!", "hi!", "");
        faculty3.viewProfile();
        java.lang.String str5 = faculty3.getAccountType();
        java.lang.String str6 = faculty3.getEmail();
        java.lang.String str7 = faculty3.getAccountType();
        java.lang.String str8 = faculty3.getID();
        boolean boolean9 = faculty3.isVerified();
        java.lang.Class<?> wildcardClass10 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "faculty" + "'", str7, "faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test06650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06650");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        double double6 = faculty3.getHourlyRate();
        java.lang.String str7 = faculty3.getPassword();
        faculty3.logout();
        faculty3.logout();
        java.lang.String str10 = faculty3.getAccountType();
        faculty3.login("", "");
        faculty3.login("faculty", "hi!");
        faculty3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "faculty" + "'", str10, "faculty");
    }

    @Test
    public void test06651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06651");
        model.Faculty faculty3 = new model.Faculty("hi!", "hi!", "");
        faculty3.logout();
        java.lang.String str5 = faculty3.getEmail();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        faculty3.logout();
        java.lang.Class<?> wildcardClass9 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test06652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06652");
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
        faculty3.viewProfile();
        boolean boolean15 = faculty3.isVerified();
        faculty3.login("", "faculty");
        faculty3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "faculty" + "'", str13, "faculty");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test06653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06653");
        model.Faculty faculty3 = new model.Faculty("", "", "faculty");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getPassword();
        faculty3.login("", "");
        java.lang.String str9 = faculty3.getPassword();
        double double10 = faculty3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "faculty" + "'", str4, "faculty");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 30.0d + "'", double10 == 30.0d);
    }

    @Test
    public void test06654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06654");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getAccountType();
        faculty3.logout();
        java.lang.String str8 = faculty3.getAccountType();
        double double9 = faculty3.getHourlyRate();
        faculty3.logout();
        java.lang.String str11 = faculty3.getID();
        java.lang.String str12 = faculty3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "faculty" + "'", str8, "faculty");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 30.0d + "'", double9 == 30.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test06655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06655");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        boolean boolean8 = faculty3.isVerified();
        faculty3.setVerified(false);
        java.lang.String str11 = faculty3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test06656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06656");
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
        java.lang.String str16 = faculty3.getPassword();
        java.lang.String str17 = faculty3.getAccountType();
        java.lang.Class<?> wildcardClass18 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "faculty" + "'", str10, "faculty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "faculty" + "'", str17, "faculty");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test06657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06657");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getAccountType();
        faculty3.logout();
        java.lang.String str8 = faculty3.getEmail();
        faculty3.viewProfile();
        java.lang.String str10 = faculty3.getID();
        faculty3.logout();
        faculty3.login("faculty", "");
        java.lang.String str15 = faculty3.getEmail();
        java.lang.String str16 = faculty3.getID();
        faculty3.viewProfile();
        java.lang.String str18 = faculty3.getAccountType();
        java.lang.String str19 = faculty3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "faculty" + "'", str18, "faculty");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test06658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06658");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        boolean boolean7 = faculty3.isVerified();
        java.lang.String str8 = faculty3.getPassword();
        faculty3.viewProfile();
        faculty3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test06659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06659");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        faculty3.setVerified(false);
        faculty3.logout();
        double double11 = faculty3.getHourlyRate();
        faculty3.viewProfile();
        faculty3.setVerified(false);
        double double15 = faculty3.getHourlyRate();
        java.lang.String str16 = faculty3.getID();
        java.lang.String str17 = faculty3.getEmail();
        java.lang.String str18 = faculty3.getEmail();
        faculty3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 30.0d + "'", double11 == 30.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 30.0d + "'", double15 == 30.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test06660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06660");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        faculty3.setVerified(false);
        boolean boolean9 = faculty3.isVerified();
        faculty3.setVerified(true);
        faculty3.viewProfile();
        double double13 = faculty3.getHourlyRate();
        faculty3.login("faculty", "faculty");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 30.0d + "'", double13 == 30.0d);
    }

    @Test
    public void test06661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06661");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "faculty");
        java.lang.String str4 = faculty3.getPassword();
        double double5 = faculty3.getHourlyRate();
        faculty3.logout();
        java.lang.String str7 = faculty3.getID();
        java.lang.String str8 = faculty3.getID();
        java.lang.String str9 = faculty3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 30.0d + "'", double5 == 30.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "faculty" + "'", str7, "faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "faculty" + "'", str8, "faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test06662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06662");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        java.lang.String str6 = faculty3.getPassword();
        faculty3.setVerified(false);
        faculty3.setVerified(false);
        java.lang.String str11 = faculty3.getAccountType();
        faculty3.logout();
        java.lang.String str13 = faculty3.getEmail();
        java.lang.String str14 = faculty3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "faculty" + "'", str11, "faculty");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test06663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06663");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        faculty3.login("", "");
        faculty3.viewProfile();
        faculty3.viewProfile();
        faculty3.login("", "");
        faculty3.viewProfile();
        faculty3.logout();
        java.lang.String str14 = faculty3.getID();
        java.lang.String str15 = faculty3.getID();
        faculty3.setVerified(false);
        java.lang.String str18 = faculty3.getID();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test06664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06664");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        double double6 = faculty3.getHourlyRate();
        java.lang.String str7 = faculty3.getID();
        boolean boolean8 = faculty3.isVerified();
        faculty3.setVerified(true);
        java.lang.String str11 = faculty3.getEmail();
        double double12 = faculty3.getHourlyRate();
        java.lang.String str13 = faculty3.getPassword();
        faculty3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 30.0d + "'", double12 == 30.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test06665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06665");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        java.lang.String str6 = faculty3.getPassword();
        java.lang.String str7 = faculty3.getPassword();
        faculty3.login("hi!", "hi!");
        boolean boolean11 = faculty3.isVerified();
        java.lang.String str12 = faculty3.getEmail();
        double double13 = faculty3.getHourlyRate();
        java.lang.String str14 = faculty3.getID();
        java.lang.String str15 = faculty3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 30.0d + "'", double13 == 30.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test06666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06666");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        double double8 = faculty3.getHourlyRate();
        boolean boolean9 = faculty3.isVerified();
        faculty3.logout();
        faculty3.viewProfile();
        faculty3.login("", "");
        java.lang.String str15 = faculty3.getPassword();
        faculty3.setVerified(false);
        java.lang.String str18 = faculty3.getPassword();
        faculty3.login("hi!", "faculty");
        java.lang.Class<?> wildcardClass22 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test06667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06667");
        model.Faculty faculty3 = new model.Faculty("hi!", "faculty", "");
        java.lang.String str4 = faculty3.getEmail();
        faculty3.viewProfile();
        faculty3.viewProfile();
        faculty3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test06668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06668");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getEmail();
        boolean boolean6 = faculty3.isVerified();
        java.lang.String str7 = faculty3.getAccountType();
        faculty3.login("faculty", "");
        faculty3.setVerified(true);
        java.lang.String str13 = faculty3.getID();
        java.lang.String str14 = faculty3.getEmail();
        java.lang.Class<?> wildcardClass15 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "faculty" + "'", str7, "faculty");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test06669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06669");
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
        double double18 = faculty3.getHourlyRate();
        java.lang.String str19 = faculty3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 30.0d + "'", double10 == 30.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 30.0d + "'", double18 == 30.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test06670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06670");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        faculty3.logout();
        faculty3.login("hi!", "hi!");
        java.lang.String str8 = faculty3.getID();
        java.lang.String str9 = faculty3.getPassword();
        double double10 = faculty3.getHourlyRate();
        faculty3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 30.0d + "'", double10 == 30.0d);
    }

    @Test
    public void test06671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06671");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        java.lang.String str7 = faculty3.getID();
        faculty3.login("hi!", "");
        java.lang.String str11 = faculty3.getEmail();
        faculty3.setVerified(false);
        faculty3.logout();
        faculty3.logout();
        double double16 = faculty3.getHourlyRate();
        java.lang.String str17 = faculty3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 30.0d + "'", double16 == 30.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test06672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06672");
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
        java.lang.String str28 = faculty3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "faculty" + "'", str10, "faculty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "faculty" + "'", str23, "faculty");
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 30.0d + "'", double26 == 30.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 30.0d + "'", double27 == 30.0d);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test06673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06673");
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
        boolean boolean17 = faculty3.isVerified();
        java.lang.String str18 = faculty3.getPassword();
        java.lang.String str19 = faculty3.getAccountType();
        java.lang.Class<?> wildcardClass20 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "faculty" + "'", str13, "faculty");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "faculty" + "'", str19, "faculty");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test06674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06674");
        model.Faculty faculty3 = new model.Faculty("hi!", "faculty", "");
        java.lang.String str4 = faculty3.getEmail();
        faculty3.login("hi!", "");
        faculty3.setVerified(true);
        faculty3.login("", "");
        boolean boolean13 = faculty3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test06675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06675");
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
        boolean boolean17 = faculty3.isVerified();
        faculty3.logout();
        faculty3.login("", "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "faculty" + "'", str13, "faculty");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test06676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06676");
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
        java.lang.String str16 = faculty3.getPassword();
        double double17 = faculty3.getHourlyRate();
        double double18 = faculty3.getHourlyRate();
        faculty3.logout();
        java.lang.String str20 = faculty3.getID();
        double double21 = faculty3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 30.0d + "'", double17 == 30.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 30.0d + "'", double18 == 30.0d);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 30.0d + "'", double21 == 30.0d);
    }

    @Test
    public void test06677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06677");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        java.lang.String str6 = faculty3.getPassword();
        faculty3.setVerified(false);
        faculty3.setVerified(true);
        java.lang.String str11 = faculty3.getEmail();
        faculty3.login("hi!", "hi!");
        java.lang.String str15 = faculty3.getID();
        java.lang.Class<?> wildcardClass16 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test06678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06678");
        model.Faculty faculty3 = new model.Faculty("", "faculty", "faculty");
        double double4 = faculty3.getHourlyRate();
        java.lang.String str5 = faculty3.getAccountType();
        java.lang.String str6 = faculty3.getAccountType();
        faculty3.login("faculty", "");
        faculty3.login("faculty", "");
        faculty3.logout();
        java.lang.String str14 = faculty3.getPassword();
        boolean boolean15 = faculty3.isVerified();
        java.lang.String str16 = faculty3.getEmail();
        double double17 = faculty3.getHourlyRate();
        faculty3.viewProfile();
        java.lang.String str19 = faculty3.getEmail();
        java.lang.String str20 = faculty3.getEmail();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 30.0d + "'", double4 == 30.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "faculty" + "'", str14, "faculty");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 30.0d + "'", double17 == 30.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test06679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06679");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        faculty3.logout();
        faculty3.login("hi!", "hi!");
        faculty3.viewProfile();
        java.lang.String str9 = faculty3.getPassword();
        java.lang.String str10 = faculty3.getID();
        faculty3.logout();
        boolean boolean12 = faculty3.isVerified();
        boolean boolean13 = faculty3.isVerified();
        faculty3.viewProfile();
        boolean boolean15 = faculty3.isVerified();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test06680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06680");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        java.lang.String str8 = faculty3.getAccountType();
        java.lang.String str9 = faculty3.getAccountType();
        java.lang.String str10 = faculty3.getID();
        faculty3.viewProfile();
        faculty3.login("faculty", "");
        faculty3.viewProfile();
        faculty3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "faculty" + "'", str8, "faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "faculty" + "'", str9, "faculty");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test06681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06681");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        double double8 = faculty3.getHourlyRate();
        boolean boolean9 = faculty3.isVerified();
        faculty3.setVerified(false);
        double double12 = faculty3.getHourlyRate();
        faculty3.setVerified(false);
        double double15 = faculty3.getHourlyRate();
        boolean boolean16 = faculty3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 30.0d + "'", double12 == 30.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 30.0d + "'", double15 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test06682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06682");
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
        double double17 = faculty3.getHourlyRate();
        double double18 = faculty3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "faculty" + "'", str13, "faculty");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 30.0d + "'", double17 == 30.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 30.0d + "'", double18 == 30.0d);
    }

    @Test
    public void test06683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06683");
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
        faculty3.setVerified(true);
        boolean boolean29 = faculty3.isVerified();
        faculty3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "faculty" + "'", str10, "faculty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "faculty" + "'", str23, "faculty");
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 30.0d + "'", double26 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test06684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06684");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        java.lang.String str8 = faculty3.getPassword();
        faculty3.setVerified(false);
        faculty3.logout();
        java.lang.String str12 = faculty3.getID();
        faculty3.login("", "hi!");
        boolean boolean16 = faculty3.isVerified();
        java.lang.String str17 = faculty3.getAccountType();
        boolean boolean18 = faculty3.isVerified();
        java.lang.Class<?> wildcardClass19 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "faculty" + "'", str17, "faculty");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test06685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06685");
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
        faculty3.logout();
        java.lang.String str18 = faculty3.getID();
        java.lang.String str19 = faculty3.getEmail();
        java.lang.String str20 = faculty3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test06686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06686");
        model.Faculty faculty3 = new model.Faculty("", "", "faculty");
        faculty3.login("faculty", "");
        boolean boolean7 = faculty3.isVerified();
        java.lang.String str8 = faculty3.getAccountType();
        java.lang.String str9 = faculty3.getAccountType();
        java.lang.Class<?> wildcardClass10 = faculty3.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "faculty" + "'", str8, "faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "faculty" + "'", str9, "faculty");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test06687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06687");
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
        faculty3.viewProfile();
        java.lang.String str19 = faculty3.getEmail();
        faculty3.login("faculty", "faculty");
        faculty3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "faculty" + "'", str13, "faculty");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test06688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06688");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.login("", "");
        java.lang.String str10 = faculty3.getAccountType();
        faculty3.viewProfile();
        faculty3.login("", "hi!");
        java.lang.String str15 = faculty3.getID();
        faculty3.setVerified(false);
        java.lang.String str18 = faculty3.getEmail();
        faculty3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "faculty" + "'", str10, "faculty");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test06689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06689");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.login("", "");
        double double10 = faculty3.getHourlyRate();
        java.lang.String str11 = faculty3.getPassword();
        boolean boolean12 = faculty3.isVerified();
        java.lang.String str13 = faculty3.getPassword();
        java.lang.String str14 = faculty3.getID();
        faculty3.viewProfile();
        double double16 = faculty3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 30.0d + "'", double10 == 30.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 30.0d + "'", double16 == 30.0d);
    }

    @Test
    public void test06690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06690");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        faculty3.logout();
        faculty3.logout();
        java.lang.String str6 = faculty3.getAccountType();
        java.lang.String str7 = faculty3.getAccountType();
        faculty3.viewProfile();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "faculty" + "'", str7, "faculty");
    }

    @Test
    public void test06691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06691");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        faculty3.logout();
        java.lang.String str5 = faculty3.getID();
        java.lang.String str6 = faculty3.getEmail();
        java.lang.String str7 = faculty3.getPassword();
        java.lang.String str8 = faculty3.getID();
        faculty3.logout();
        faculty3.viewProfile();
        faculty3.login("hi!", "");
        faculty3.login("faculty", "hi!");
        faculty3.login("faculty", "faculty");
        faculty3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test06692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06692");
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
        java.lang.String str16 = faculty3.getAccountType();
        java.lang.String str17 = faculty3.getPassword();
        faculty3.logout();
        java.lang.String str19 = faculty3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "faculty" + "'", str10, "faculty");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "faculty" + "'", str16, "faculty");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test06693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06693");
        model.Faculty faculty3 = new model.Faculty("hi!", "faculty", "");
        java.lang.String str4 = faculty3.getEmail();
        double double5 = faculty3.getHourlyRate();
        faculty3.logout();
        java.lang.String str7 = faculty3.getAccountType();
        faculty3.viewProfile();
        double double9 = faculty3.getHourlyRate();
        java.lang.Class<?> wildcardClass10 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 30.0d + "'", double5 == 30.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "faculty" + "'", str7, "faculty");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 30.0d + "'", double9 == 30.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test06694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06694");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        faculty3.login("", "");
        double double7 = faculty3.getHourlyRate();
        faculty3.login("faculty", "faculty");
        java.lang.String str11 = faculty3.getID();
        java.lang.String str12 = faculty3.getAccountType();
        boolean boolean13 = faculty3.isVerified();
        java.lang.String str14 = faculty3.getID();
        java.lang.String str15 = faculty3.getID();
        faculty3.login("", "hi!");
        double double19 = faculty3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "faculty" + "'", str12, "faculty");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 30.0d + "'", double19 == 30.0d);
    }

    @Test
    public void test06695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06695");
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
        java.lang.String str20 = faculty3.getID();
        double double21 = faculty3.getHourlyRate();
        boolean boolean22 = faculty3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 30.0d + "'", double21 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test06696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06696");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        java.lang.String str6 = faculty3.getPassword();
        java.lang.String str7 = faculty3.getPassword();
        faculty3.logout();
        java.lang.String str9 = faculty3.getEmail();
        java.lang.String str10 = faculty3.getPassword();
        faculty3.login("hi!", "faculty");
        faculty3.login("hi!", "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test06697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06697");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        faculty3.setVerified(false);
        faculty3.viewProfile();
        java.lang.String str11 = faculty3.getEmail();
        faculty3.login("faculty", "hi!");
        double double15 = faculty3.getHourlyRate();
        java.lang.String str16 = faculty3.getAccountType();
        java.lang.String str17 = faculty3.getPassword();
        java.lang.String str18 = faculty3.getAccountType();
        java.lang.Class<?> wildcardClass19 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 30.0d + "'", double15 == 30.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "faculty" + "'", str16, "faculty");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "faculty" + "'", str18, "faculty");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test06698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06698");
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
        faculty3.login("faculty", "faculty");
        faculty3.login("faculty", "hi!");
        boolean boolean19 = faculty3.isVerified();
        java.lang.String str20 = faculty3.getPassword();
        java.lang.String str21 = faculty3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test06699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06699");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        faculty3.logout();
        java.lang.String str5 = faculty3.getID();
        java.lang.String str6 = faculty3.getPassword();
        faculty3.logout();
        java.lang.String str8 = faculty3.getPassword();
        java.lang.String str9 = faculty3.getPassword();
        faculty3.setVerified(true);
        double double12 = faculty3.getHourlyRate();
        java.lang.String str13 = faculty3.getPassword();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 30.0d + "'", double12 == 30.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test06700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06700");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.login("", "");
        double double10 = faculty3.getHourlyRate();
        java.lang.String str11 = faculty3.getPassword();
        boolean boolean12 = faculty3.isVerified();
        java.lang.String str13 = faculty3.getID();
        boolean boolean14 = faculty3.isVerified();
        faculty3.setVerified(true);
        java.lang.Class<?> wildcardClass17 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 30.0d + "'", double10 == 30.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test06701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06701");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        java.lang.String str6 = faculty3.getPassword();
        java.lang.String str7 = faculty3.getPassword();
        faculty3.login("hi!", "hi!");
        boolean boolean11 = faculty3.isVerified();
        java.lang.String str12 = faculty3.getEmail();
        double double13 = faculty3.getHourlyRate();
        faculty3.viewProfile();
        faculty3.logout();
        boolean boolean16 = faculty3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 30.0d + "'", double13 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test06702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06702");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.viewProfile();
        faculty3.viewProfile();
        faculty3.logout();
        faculty3.viewProfile();
        faculty3.logout();
        faculty3.setVerified(false);
        java.lang.String str14 = faculty3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test06703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06703");
        model.Faculty faculty3 = new model.Faculty("hi!", "faculty", "");
        java.lang.String str4 = faculty3.getEmail();
        faculty3.viewProfile();
        faculty3.logout();
        faculty3.viewProfile();
        faculty3.viewProfile();
        double double9 = faculty3.getHourlyRate();
        boolean boolean10 = faculty3.isVerified();
        java.lang.String str11 = faculty3.getID();
        java.lang.String str12 = faculty3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 30.0d + "'", double9 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test06704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06704");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        faculty3.logout();
        java.lang.String str5 = faculty3.getID();
        java.lang.String str6 = faculty3.getPassword();
        double double7 = faculty3.getHourlyRate();
        faculty3.setVerified(false);
        java.lang.String str10 = faculty3.getEmail();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test06705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06705");
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
        java.lang.String str18 = faculty3.getEmail();
        faculty3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "faculty" + "'", str10, "faculty");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "faculty" + "'", str16, "faculty");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test06706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06706");
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
        double double17 = faculty3.getHourlyRate();
        faculty3.login("hi!", "");
        java.lang.Class<?> wildcardClass21 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "faculty" + "'", str11, "faculty");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 30.0d + "'", double17 == 30.0d);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test06707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06707");
        model.Faculty faculty3 = new model.Faculty("", "faculty", "");
        faculty3.viewProfile();
        java.lang.String str5 = faculty3.getEmail();
        boolean boolean6 = faculty3.isVerified();
        faculty3.login("hi!", "faculty");
        faculty3.logout();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test06708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06708");
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
        java.lang.String str14 = faculty3.getID();
        java.lang.Class<?> wildcardClass15 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "faculty" + "'", str11, "faculty");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test06709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06709");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        java.lang.String str6 = faculty3.getPassword();
        java.lang.String str7 = faculty3.getPassword();
        java.lang.String str8 = faculty3.getID();
        java.lang.String str9 = faculty3.getID();
        faculty3.viewProfile();
        java.lang.String str11 = faculty3.getID();
        java.lang.String str12 = faculty3.getEmail();
        java.lang.String str13 = faculty3.getID();
        boolean boolean14 = faculty3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test06710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06710");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        faculty3.setVerified(false);
        java.lang.String str9 = faculty3.getID();
        faculty3.setVerified(false);
        faculty3.logout();
        faculty3.setVerified(false);
        double double15 = faculty3.getHourlyRate();
        faculty3.login("hi!", "hi!");
        java.lang.String str19 = faculty3.getAccountType();
        java.lang.String str20 = faculty3.getAccountType();
        faculty3.logout();
        double double22 = faculty3.getHourlyRate();
        faculty3.setVerified(true);
        faculty3.login("faculty", "");
        java.lang.String str28 = faculty3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 30.0d + "'", double15 == 30.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "faculty" + "'", str19, "faculty");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "faculty" + "'", str20, "faculty");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 30.0d + "'", double22 == 30.0d);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
    }

    @Test
    public void test06711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06711");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        faculty3.logout();
        java.lang.String str5 = faculty3.getID();
        java.lang.String str6 = faculty3.getEmail();
        faculty3.viewProfile();
        faculty3.setVerified(false);
        faculty3.logout();
        java.lang.String str11 = faculty3.getEmail();
        faculty3.viewProfile();
        faculty3.login("hi!", "hi!");
        faculty3.login("faculty", "faculty");
        java.lang.String str19 = faculty3.getPassword();
        java.lang.String str20 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "faculty" + "'", str20, "faculty");
    }

    @Test
    public void test06712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06712");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        java.lang.String str8 = faculty3.getPassword();
        java.lang.String str9 = faculty3.getID();
        double double10 = faculty3.getHourlyRate();
        double double11 = faculty3.getHourlyRate();
        java.lang.String str12 = faculty3.getAccountType();
        faculty3.login("", "");
        double double16 = faculty3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 30.0d + "'", double10 == 30.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 30.0d + "'", double11 == 30.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "faculty" + "'", str12, "faculty");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 30.0d + "'", double16 == 30.0d);
    }

    @Test
    public void test06713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06713");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        double double6 = faculty3.getHourlyRate();
        faculty3.logout();
        faculty3.setVerified(true);
        java.lang.String str10 = faculty3.getEmail();
        java.lang.String str11 = faculty3.getID();
        java.lang.String str12 = faculty3.getAccountType();
        java.lang.String str13 = faculty3.getID();
        faculty3.login("hi!", "hi!");
        java.lang.String str17 = faculty3.getID();
        boolean boolean18 = faculty3.isVerified();
        java.lang.String str19 = faculty3.getEmail();
        double double20 = faculty3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "faculty" + "'", str12, "faculty");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 30.0d + "'", double20 == 30.0d);
    }

    @Test
    public void test06714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06714");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        java.lang.String str8 = faculty3.getPassword();
        java.lang.String str9 = faculty3.getPassword();
        faculty3.logout();
        java.lang.String str11 = faculty3.getAccountType();
        boolean boolean12 = faculty3.isVerified();
        java.lang.String str13 = faculty3.getPassword();
        faculty3.viewProfile();
        java.lang.String str15 = faculty3.getPassword();
        java.lang.String str16 = faculty3.getEmail();
        faculty3.logout();
        faculty3.logout();
        java.lang.String str19 = faculty3.getAccountType();
        java.lang.String str20 = faculty3.getPassword();
        java.lang.String str21 = faculty3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "faculty" + "'", str11, "faculty");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "faculty" + "'", str19, "faculty");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test06715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06715");
        model.Faculty faculty3 = new model.Faculty("", "faculty", "");
        java.lang.String str4 = faculty3.getPassword();
        boolean boolean5 = faculty3.isVerified();
        double double6 = faculty3.getHourlyRate();
        faculty3.viewProfile();
        java.lang.Class<?> wildcardClass8 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "faculty" + "'", str4, "faculty");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test06716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06716");
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
        java.lang.String str14 = faculty3.getAccountType();
        faculty3.viewProfile();
        boolean boolean16 = faculty3.isVerified();
        double double17 = faculty3.getHourlyRate();
        faculty3.viewProfile();
        java.lang.String str19 = faculty3.getEmail();
        faculty3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "faculty" + "'", str14, "faculty");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 30.0d + "'", double17 == 30.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test06717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06717");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.viewProfile();
        java.lang.String str8 = faculty3.getAccountType();
        faculty3.logout();
        faculty3.logout();
        java.lang.String str11 = faculty3.getEmail();
        java.lang.String str12 = faculty3.getEmail();
        double double13 = faculty3.getHourlyRate();
        double double14 = faculty3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "faculty" + "'", str8, "faculty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 30.0d + "'", double13 == 30.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 30.0d + "'", double14 == 30.0d);
    }

    @Test
    public void test06718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06718");
        model.Faculty faculty3 = new model.Faculty("hi!", "hi!", "");
        faculty3.logout();
        java.lang.String str5 = faculty3.getEmail();
        faculty3.logout();
        java.lang.String str7 = faculty3.getEmail();
        boolean boolean8 = faculty3.isVerified();
        java.lang.String str9 = faculty3.getEmail();
        faculty3.logout();
        java.lang.String str11 = faculty3.getPassword();
        java.lang.String str12 = faculty3.getAccountType();
        java.lang.String str13 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "faculty" + "'", str12, "faculty");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "faculty" + "'", str13, "faculty");
    }

    @Test
    public void test06719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06719");
        model.Faculty faculty3 = new model.Faculty("hi!", "hi!", "");
        java.lang.String str4 = faculty3.getEmail();
        faculty3.login("faculty", "faculty");
        java.lang.String str8 = faculty3.getPassword();
        faculty3.viewProfile();
        faculty3.login("", "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test06720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06720");
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
        faculty3.setVerified(false);
        faculty3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "faculty" + "'", str7, "faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "faculty" + "'", str9, "faculty");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 30.0d + "'", double11 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test06721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06721");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        java.lang.String str4 = faculty3.getPassword();
        double double5 = faculty3.getHourlyRate();
        double double6 = faculty3.getHourlyRate();
        faculty3.logout();
        java.lang.String str8 = faculty3.getAccountType();
        double double9 = faculty3.getHourlyRate();
        java.lang.String str10 = faculty3.getPassword();
        faculty3.login("hi!", "faculty");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 30.0d + "'", double5 == 30.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "faculty" + "'", str8, "faculty");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 30.0d + "'", double9 == 30.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test06722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06722");
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
        java.lang.String str15 = faculty3.getEmail();
        boolean boolean16 = faculty3.isVerified();
        faculty3.viewProfile();
        java.lang.String str18 = faculty3.getPassword();
        java.lang.String str19 = faculty3.getAccountType();
        double double20 = faculty3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "faculty" + "'", str8, "faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "faculty" + "'", str9, "faculty");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "faculty" + "'", str19, "faculty");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 30.0d + "'", double20 == 30.0d);
    }

    @Test
    public void test06723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06723");
        model.Faculty faculty3 = new model.Faculty("faculty", "hi!", "");
        java.lang.String str4 = faculty3.getID();
        double double5 = faculty3.getHourlyRate();
        boolean boolean6 = faculty3.isVerified();
        double double7 = faculty3.getHourlyRate();
        java.lang.String str8 = faculty3.getAccountType();
        java.lang.Class<?> wildcardClass9 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 30.0d + "'", double5 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "faculty" + "'", str8, "faculty");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test06724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06724");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        double double6 = faculty3.getHourlyRate();
        java.lang.String str7 = faculty3.getPassword();
        java.lang.String str8 = faculty3.getPassword();
        faculty3.login("faculty", "hi!");
        faculty3.login("", "hi!");
        faculty3.login("", "hi!");
        java.lang.String str18 = faculty3.getAccountType();
        java.lang.Class<?> wildcardClass19 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "faculty" + "'", str18, "faculty");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test06725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06725");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        faculty3.setVerified(false);
        java.lang.String str9 = faculty3.getID();
        faculty3.setVerified(false);
        faculty3.logout();
        faculty3.setVerified(false);
        double double15 = faculty3.getHourlyRate();
        faculty3.login("hi!", "hi!");
        java.lang.String str19 = faculty3.getAccountType();
        java.lang.String str20 = faculty3.getAccountType();
        faculty3.logout();
        double double22 = faculty3.getHourlyRate();
        faculty3.setVerified(true);
        faculty3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 30.0d + "'", double15 == 30.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "faculty" + "'", str19, "faculty");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "faculty" + "'", str20, "faculty");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 30.0d + "'", double22 == 30.0d);
    }

    @Test
    public void test06726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06726");
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
        double double17 = faculty3.getHourlyRate();
        java.lang.Class<?> wildcardClass18 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 30.0d + "'", double17 == 30.0d);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test06727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06727");
        model.Faculty faculty3 = new model.Faculty("", "", "faculty");
        java.lang.String str4 = faculty3.getID();
        double double5 = faculty3.getHourlyRate();
        double double6 = faculty3.getHourlyRate();
        faculty3.login("", "faculty");
        double double10 = faculty3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "faculty" + "'", str4, "faculty");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 30.0d + "'", double5 == 30.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 30.0d + "'", double10 == 30.0d);
    }

    @Test
    public void test06728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06728");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        java.lang.String str8 = faculty3.getPassword();
        faculty3.setVerified(false);
        java.lang.String str11 = faculty3.getID();
        boolean boolean12 = faculty3.isVerified();
        java.lang.String str13 = faculty3.getAccountType();
        faculty3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "faculty" + "'", str13, "faculty");
    }

    @Test
    public void test06729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06729");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        faculty3.setVerified(false);
        faculty3.viewProfile();
        double double7 = faculty3.getHourlyRate();
        java.lang.String str8 = faculty3.getID();
        faculty3.setVerified(true);
        faculty3.logout();
        java.lang.Class<?> wildcardClass12 = faculty3.getClass();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test06730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06730");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        java.lang.String str6 = faculty3.getPassword();
        faculty3.setVerified(false);
        java.lang.String str9 = faculty3.getEmail();
        faculty3.viewProfile();
        java.lang.String str11 = faculty3.getAccountType();
        double double12 = faculty3.getHourlyRate();
        java.lang.String str13 = faculty3.getID();
        faculty3.logout();
        boolean boolean15 = faculty3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "faculty" + "'", str11, "faculty");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 30.0d + "'", double12 == 30.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test06731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06731");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        faculty3.setVerified(false);
        java.lang.String str6 = faculty3.getPassword();
        java.lang.String str7 = faculty3.getAccountType();
        faculty3.viewProfile();
        double double9 = faculty3.getHourlyRate();
        java.lang.String str10 = faculty3.getEmail();
        boolean boolean11 = faculty3.isVerified();
        java.lang.String str12 = faculty3.getPassword();
        faculty3.viewProfile();
        faculty3.logout();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "faculty" + "'", str7, "faculty");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 30.0d + "'", double9 == 30.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test06732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06732");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        faculty3.setVerified(false);
        faculty3.viewProfile();
        java.lang.String str11 = faculty3.getEmail();
        java.lang.String str12 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "faculty" + "'", str12, "faculty");
    }

    @Test
    public void test06733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06733");
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
        java.lang.String str13 = faculty3.getID();
        java.lang.String str14 = faculty3.getAccountType();
        faculty3.logout();
        java.lang.Class<?> wildcardClass16 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 30.0d + "'", double10 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 30.0d + "'", double12 == 30.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "faculty" + "'", str14, "faculty");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test06734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06734");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        faculty3.setVerified(false);
        java.lang.String str10 = faculty3.getID();
        java.lang.String str11 = faculty3.getAccountType();
        double double12 = faculty3.getHourlyRate();
        boolean boolean13 = faculty3.isVerified();
        faculty3.setVerified(true);
        faculty3.setVerified(false);
        faculty3.viewProfile();
        faculty3.login("hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "faculty" + "'", str11, "faculty");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 30.0d + "'", double12 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test06735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06735");
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
        java.lang.Class<?> wildcardClass17 = faculty3.getClass();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "faculty" + "'", str10, "faculty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "faculty" + "'", str11, "faculty");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 30.0d + "'", double12 == 30.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 30.0d + "'", double13 == 30.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "faculty" + "'", str15, "faculty");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test06736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06736");
        model.Faculty faculty3 = new model.Faculty("hi!", "hi!", "");
        faculty3.logout();
        java.lang.String str5 = faculty3.getEmail();
        java.lang.String str6 = faculty3.getAccountType();
        faculty3.login("faculty", "faculty");
        double double10 = faculty3.getHourlyRate();
        faculty3.viewProfile();
        faculty3.setVerified(true);
        faculty3.viewProfile();
        faculty3.logout();
        faculty3.setVerified(true);
        java.lang.String str18 = faculty3.getEmail();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 30.0d + "'", double10 == 30.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test06737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06737");
        model.Faculty faculty3 = new model.Faculty("hi!", "hi!", "hi!");
        faculty3.login("hi!", "faculty");
        faculty3.logout();
        java.lang.String str8 = faculty3.getPassword();
        faculty3.viewProfile();
        boolean boolean10 = faculty3.isVerified();
        boolean boolean11 = faculty3.isVerified();
        double double12 = faculty3.getHourlyRate();
        java.lang.String str13 = faculty3.getEmail();
        java.lang.String str14 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 30.0d + "'", double12 == 30.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "faculty" + "'", str14, "faculty");
    }

    @Test
    public void test06738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06738");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getAccountType();
        java.lang.String str7 = faculty3.getAccountType();
        java.lang.String str8 = faculty3.getEmail();
        faculty3.viewProfile();
        faculty3.logout();
        faculty3.setVerified(false);
        faculty3.setVerified(false);
        faculty3.setVerified(true);
        java.lang.Class<?> wildcardClass17 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "faculty" + "'", str7, "faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test06739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06739");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        faculty3.setVerified(false);
        java.lang.String str10 = faculty3.getEmail();
        faculty3.logout();
        boolean boolean12 = faculty3.isVerified();
        faculty3.login("", "");
        java.lang.String str16 = faculty3.getEmail();
        java.lang.String str17 = faculty3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test06740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06740");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getAccountType();
        java.lang.String str7 = faculty3.getAccountType();
        java.lang.String str8 = faculty3.getEmail();
        faculty3.setVerified(true);
        double double11 = faculty3.getHourlyRate();
        faculty3.login("hi!", "hi!");
        double double15 = faculty3.getHourlyRate();
        java.lang.String str16 = faculty3.getEmail();
        faculty3.logout();
        faculty3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "faculty" + "'", str7, "faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 30.0d + "'", double11 == 30.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 30.0d + "'", double15 == 30.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test06741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06741");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        faculty3.setVerified(false);
        faculty3.viewProfile();
        java.lang.String str7 = faculty3.getEmail();
        java.lang.String str8 = faculty3.getAccountType();
        faculty3.logout();
        boolean boolean10 = faculty3.isVerified();
        faculty3.login("hi!", "hi!");
        boolean boolean14 = faculty3.isVerified();
        faculty3.login("faculty", "");
        double double18 = faculty3.getHourlyRate();
        java.lang.Class<?> wildcardClass19 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "faculty" + "'", str8, "faculty");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 30.0d + "'", double18 == 30.0d);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test06742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06742");
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
        boolean boolean15 = faculty3.isVerified();
        faculty3.setVerified(false);
        double double18 = faculty3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "faculty" + "'", str10, "faculty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 30.0d + "'", double18 == 30.0d);
    }

    @Test
    public void test06743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06743");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        java.lang.String str6 = faculty3.getPassword();
        faculty3.setVerified(false);
        faculty3.setVerified(false);
        faculty3.viewProfile();
        faculty3.login("faculty", "hi!");
        java.lang.Class<?> wildcardClass15 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test06744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06744");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        faculty3.logout();
        java.lang.String str5 = faculty3.getID();
        java.lang.String str6 = faculty3.getEmail();
        double double7 = faculty3.getHourlyRate();
        java.lang.String str8 = faculty3.getEmail();
        java.lang.String str9 = faculty3.getID();
        faculty3.login("", "");
        boolean boolean13 = faculty3.isVerified();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test06745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06745");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        faculty3.logout();
        java.lang.String str5 = faculty3.getID();
        java.lang.String str6 = faculty3.getEmail();
        double double7 = faculty3.getHourlyRate();
        java.lang.String str8 = faculty3.getPassword();
        faculty3.login("hi!", "hi!");
        boolean boolean12 = faculty3.isVerified();
        double double13 = faculty3.getHourlyRate();
        faculty3.login("", "hi!");
        double double17 = faculty3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 30.0d + "'", double13 == 30.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 30.0d + "'", double17 == 30.0d);
    }

    @Test
    public void test06746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06746");
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
        faculty3.viewProfile();
        faculty3.login("", "");
        faculty3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "faculty" + "'", str11, "faculty");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test06747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06747");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        faculty3.setVerified(false);
        java.lang.String str6 = faculty3.getPassword();
        java.lang.String str7 = faculty3.getAccountType();
        java.lang.String str8 = faculty3.getEmail();
        faculty3.setVerified(true);
        java.lang.String str11 = faculty3.getAccountType();
        faculty3.login("faculty", "");
        java.lang.String str15 = faculty3.getPassword();
        java.lang.String str16 = faculty3.getAccountType();
        faculty3.logout();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "faculty" + "'", str7, "faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "faculty" + "'", str11, "faculty");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "faculty" + "'", str16, "faculty");
    }

    @Test
    public void test06748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06748");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        faculty3.login("", "");
        double double7 = faculty3.getHourlyRate();
        faculty3.setVerified(false);
        faculty3.viewProfile();
        faculty3.viewProfile();
        faculty3.viewProfile();
        faculty3.setVerified(false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
    }

    @Test
    public void test06749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06749");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        java.lang.String str6 = faculty3.getPassword();
        faculty3.setVerified(false);
        java.lang.String str9 = faculty3.getEmail();
        java.lang.String str10 = faculty3.getID();
        java.lang.String str11 = faculty3.getID();
        faculty3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test06750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06750");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        java.lang.String str6 = faculty3.getPassword();
        java.lang.String str7 = faculty3.getPassword();
        faculty3.login("hi!", "hi!");
        java.lang.String str11 = faculty3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test06751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06751");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        java.lang.String str6 = faculty3.getPassword();
        java.lang.String str7 = faculty3.getPassword();
        faculty3.login("hi!", "hi!");
        boolean boolean11 = faculty3.isVerified();
        java.lang.String str12 = faculty3.getEmail();
        double double13 = faculty3.getHourlyRate();
        faculty3.logout();
        java.lang.String str15 = faculty3.getID();
        double double16 = faculty3.getHourlyRate();
        java.lang.String str17 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 30.0d + "'", double13 == 30.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 30.0d + "'", double16 == 30.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "faculty" + "'", str17, "faculty");
    }

    @Test
    public void test06752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06752");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        faculty3.setVerified(false);
        java.lang.String str10 = faculty3.getID();
        faculty3.viewProfile();
        faculty3.login("", "");
        java.lang.String str15 = faculty3.getPassword();
        double double16 = faculty3.getHourlyRate();
        double double17 = faculty3.getHourlyRate();
        faculty3.setVerified(false);
        boolean boolean20 = faculty3.isVerified();
        boolean boolean21 = faculty3.isVerified();
        java.lang.String str22 = faculty3.getEmail();
        faculty3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 30.0d + "'", double16 == 30.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 30.0d + "'", double17 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test06753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06753");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.login("", "");
        faculty3.login("faculty", "faculty");
        java.lang.String str13 = faculty3.getPassword();
        java.lang.String str14 = faculty3.getPassword();
        boolean boolean15 = faculty3.isVerified();
        java.lang.String str16 = faculty3.getPassword();
        java.lang.String str17 = faculty3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test06754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06754");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        faculty3.setVerified(false);
        java.lang.String str10 = faculty3.getEmail();
        faculty3.logout();
        faculty3.viewProfile();
        java.lang.String str13 = faculty3.getID();
        java.lang.String str14 = faculty3.getEmail();
        java.lang.Class<?> wildcardClass15 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test06755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06755");
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
        java.lang.String str14 = faculty3.getEmail();
        faculty3.logout();
        faculty3.setVerified(false);
        java.lang.String str18 = faculty3.getAccountType();
        faculty3.login("hi!", "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "faculty" + "'", str12, "faculty");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "faculty" + "'", str18, "faculty");
    }

    @Test
    public void test06756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06756");
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
        java.lang.String str17 = faculty3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "faculty" + "'", str16, "faculty");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test06757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06757");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.viewProfile();
        boolean boolean8 = faculty3.isVerified();
        java.lang.String str9 = faculty3.getEmail();
        faculty3.setVerified(true);
        boolean boolean12 = faculty3.isVerified();
        faculty3.setVerified(false);
        java.lang.String str15 = faculty3.getAccountType();
        faculty3.viewProfile();
        java.lang.String str17 = faculty3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "faculty" + "'", str15, "faculty");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test06758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06758");
        model.Faculty faculty3 = new model.Faculty("faculty", "hi!", "");
        faculty3.login("hi!", "hi!");
        faculty3.logout();
        java.lang.String str8 = faculty3.getPassword();
        java.lang.String str9 = faculty3.getEmail();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "faculty" + "'", str9, "faculty");
    }

    @Test
    public void test06759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06759");
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
        faculty3.viewProfile();
        java.lang.String str16 = faculty3.getID();
        java.lang.String str17 = faculty3.getAccountType();
        double double18 = faculty3.getHourlyRate();
        faculty3.login("hi!", "hi!");
        java.lang.String str22 = faculty3.getAccountType();
        double double23 = faculty3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "faculty" + "'", str13, "faculty");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "faculty" + "'", str14, "faculty");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "faculty" + "'", str17, "faculty");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 30.0d + "'", double18 == 30.0d);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "faculty" + "'", str22, "faculty");
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 30.0d + "'", double23 == 30.0d);
    }

    @Test
    public void test06760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06760");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        java.lang.String str8 = faculty3.getAccountType();
        faculty3.setVerified(false);
        faculty3.viewProfile();
        faculty3.viewProfile();
        faculty3.logout();
        double double14 = faculty3.getHourlyRate();
        double double15 = faculty3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "faculty" + "'", str8, "faculty");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 30.0d + "'", double14 == 30.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 30.0d + "'", double15 == 30.0d);
    }

    @Test
    public void test06761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06761");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        java.lang.String str8 = faculty3.getAccountType();
        java.lang.String str9 = faculty3.getAccountType();
        faculty3.viewProfile();
        faculty3.logout();
        faculty3.login("faculty", "");
        java.lang.String str15 = faculty3.getPassword();
        faculty3.setVerified(false);
        double double18 = faculty3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "faculty" + "'", str8, "faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "faculty" + "'", str9, "faculty");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 30.0d + "'", double18 == 30.0d);
    }

    @Test
    public void test06762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06762");
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
        java.lang.String str14 = faculty3.getEmail();
        java.lang.String str15 = faculty3.getEmail();
        java.lang.String str16 = faculty3.getEmail();
        java.lang.Class<?> wildcardClass17 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "faculty" + "'", str11, "faculty");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test06763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06763");
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
        faculty3.setVerified(false);
        faculty3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test06764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06764");
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
        faculty3.setVerified(true);
        double double17 = faculty3.getHourlyRate();
        java.lang.String str18 = faculty3.getAccountType();
        faculty3.logout();
        java.lang.String str20 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "faculty" + "'", str12, "faculty");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 30.0d + "'", double17 == 30.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "faculty" + "'", str18, "faculty");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "faculty" + "'", str20, "faculty");
    }

    @Test
    public void test06765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06765");
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
        faculty3.setVerified(true);
        faculty3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 30.0d + "'", double10 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test06766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06766");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        faculty3.logout();
        java.lang.String str5 = faculty3.getID();
        java.lang.String str6 = faculty3.getEmail();
        double double7 = faculty3.getHourlyRate();
        boolean boolean8 = faculty3.isVerified();
        java.lang.String str9 = faculty3.getPassword();
        java.lang.String str10 = faculty3.getID();
        faculty3.login("hi!", "faculty");
        faculty3.setVerified(false);
        java.lang.String str16 = faculty3.getAccountType();
        java.lang.String str17 = faculty3.getAccountType();
        java.lang.String str18 = faculty3.getPassword();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "faculty" + "'", str16, "faculty");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "faculty" + "'", str17, "faculty");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test06767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06767");
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
        double double17 = faculty3.getHourlyRate();
        faculty3.setVerified(true);
        faculty3.login("hi!", "");
        double double23 = faculty3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "faculty" + "'", str13, "faculty");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 30.0d + "'", double17 == 30.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 30.0d + "'", double23 == 30.0d);
    }

    @Test
    public void test06768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06768");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getEmail();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        faculty3.login("hi!", "faculty");
        java.lang.String str11 = faculty3.getAccountType();
        java.lang.String str12 = faculty3.getEmail();
        java.lang.String str13 = faculty3.getEmail();
        java.lang.String str14 = faculty3.getEmail();
        faculty3.setVerified(false);
        java.lang.Class<?> wildcardClass17 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "faculty" + "'", str11, "faculty");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test06769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06769");
        model.Faculty faculty3 = new model.Faculty("hi!", "hi!", "");
        faculty3.logout();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getAccountType();
        java.lang.String str7 = faculty3.getAccountType();
        java.lang.String str8 = faculty3.getID();
        faculty3.viewProfile();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "faculty" + "'", str7, "faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test06770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06770");
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
        java.lang.String str22 = faculty3.getAccountType();
        java.lang.String str23 = faculty3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "faculty" + "'", str22, "faculty");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
    }

    @Test
    public void test06771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06771");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        faculty3.setVerified(false);
        java.lang.String str6 = faculty3.getEmail();
        java.lang.String str7 = faculty3.getAccountType();
        java.lang.String str8 = faculty3.getPassword();
        faculty3.viewProfile();
        java.lang.String str10 = faculty3.getAccountType();
        double double11 = faculty3.getHourlyRate();
        java.lang.String str12 = faculty3.getID();
        faculty3.viewProfile();
        faculty3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "faculty" + "'", str7, "faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "faculty" + "'", str10, "faculty");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 30.0d + "'", double11 == 30.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test06772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06772");
        model.Faculty faculty3 = new model.Faculty("faculty", "", "faculty");
        faculty3.setVerified(false);
        faculty3.viewProfile();
        java.lang.String str7 = faculty3.getEmail();
        java.lang.String str8 = faculty3.getID();
        java.lang.String str9 = faculty3.getID();
        faculty3.setVerified(true);
        java.lang.String str12 = faculty3.getID();
        faculty3.viewProfile();
        java.lang.Class<?> wildcardClass14 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "faculty" + "'", str7, "faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "faculty" + "'", str8, "faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "faculty" + "'", str9, "faculty");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "faculty" + "'", str12, "faculty");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test06773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06773");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        faculty3.setVerified(false);
        faculty3.logout();
        double double11 = faculty3.getHourlyRate();
        faculty3.viewProfile();
        java.lang.String str13 = faculty3.getAccountType();
        java.lang.Class<?> wildcardClass14 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 30.0d + "'", double11 == 30.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "faculty" + "'", str13, "faculty");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test06774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06774");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        java.lang.String str6 = faculty3.getPassword();
        double double7 = faculty3.getHourlyRate();
        faculty3.logout();
        faculty3.viewProfile();
        faculty3.viewProfile();
        faculty3.logout();
        boolean boolean12 = faculty3.isVerified();
        double double13 = faculty3.getHourlyRate();
        faculty3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 30.0d + "'", double13 == 30.0d);
    }

    @Test
    public void test06775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06775");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getAccountType();
        faculty3.logout();
        java.lang.String str8 = faculty3.getEmail();
        faculty3.viewProfile();
        double double10 = faculty3.getHourlyRate();
        boolean boolean11 = faculty3.isVerified();
        boolean boolean12 = faculty3.isVerified();
        java.lang.String str13 = faculty3.getID();
        java.lang.String str14 = faculty3.getID();
        java.lang.String str15 = faculty3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 30.0d + "'", double10 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test06776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06776");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        faculty3.setVerified(false);
        faculty3.viewProfile();
        java.lang.String str7 = faculty3.getEmail();
        java.lang.String str8 = faculty3.getAccountType();
        java.lang.String str9 = faculty3.getID();
        java.lang.String str10 = faculty3.getID();
        faculty3.login("faculty", "");
        faculty3.login("", "faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "faculty" + "'", str8, "faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test06777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06777");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        double double8 = faculty3.getHourlyRate();
        boolean boolean9 = faculty3.isVerified();
        faculty3.setVerified(false);
        double double12 = faculty3.getHourlyRate();
        java.lang.String str13 = faculty3.getEmail();
        faculty3.login("hi!", "hi!");
        java.lang.String str17 = faculty3.getPassword();
        double double18 = faculty3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 30.0d + "'", double12 == 30.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 30.0d + "'", double18 == 30.0d);
    }

    @Test
    public void test06778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06778");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.viewProfile();
        java.lang.String str8 = faculty3.getAccountType();
        faculty3.logout();
        faculty3.logout();
        java.lang.String str11 = faculty3.getEmail();
        java.lang.String str12 = faculty3.getPassword();
        faculty3.viewProfile();
        java.lang.String str14 = faculty3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "faculty" + "'", str8, "faculty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test06779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06779");
        model.Faculty faculty3 = new model.Faculty("", "", "");
        faculty3.viewProfile();
        java.lang.String str5 = faculty3.getEmail();
        faculty3.logout();
        faculty3.viewProfile();
        java.lang.String str8 = faculty3.getID();
        java.lang.String str9 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "faculty" + "'", str9, "faculty");
    }

    @Test
    public void test06780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06780");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.login("", "");
        faculty3.login("faculty", "faculty");
        java.lang.String str13 = faculty3.getPassword();
        double double14 = faculty3.getHourlyRate();
        faculty3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 30.0d + "'", double14 == 30.0d);
    }

    @Test
    public void test06781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06781");
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
        faculty3.setVerified(false);
        faculty3.setVerified(false);
        faculty3.logout();
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
    }

    @Test
    public void test06782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06782");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        faculty3.logout();
        java.lang.String str5 = faculty3.getID();
        java.lang.String str6 = faculty3.getEmail();
        faculty3.viewProfile();
        faculty3.setVerified(false);
        java.lang.String str10 = faculty3.getID();
        java.lang.String str11 = faculty3.getAccountType();
        faculty3.setVerified(true);
        java.lang.String str14 = faculty3.getPassword();
        boolean boolean15 = faculty3.isVerified();
        java.lang.String str16 = faculty3.getEmail();
        java.lang.String str17 = faculty3.getID();
        faculty3.viewProfile();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "faculty" + "'", str11, "faculty");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test06783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06783");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        java.lang.String str7 = faculty3.getID();
        double double8 = faculty3.getHourlyRate();
        java.lang.String str9 = faculty3.getID();
        faculty3.logout();
        boolean boolean11 = faculty3.isVerified();
        faculty3.logout();
        faculty3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test06784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06784");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getAccountType();
        faculty3.logout();
        java.lang.String str8 = faculty3.getEmail();
        faculty3.viewProfile();
        boolean boolean10 = faculty3.isVerified();
        java.lang.String str11 = faculty3.getID();
        boolean boolean12 = faculty3.isVerified();
        double double13 = faculty3.getHourlyRate();
        java.lang.String str14 = faculty3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 30.0d + "'", double13 == 30.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test06785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06785");
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
        boolean boolean13 = faculty3.isVerified();
        java.lang.String str14 = faculty3.getEmail();
        faculty3.setVerified(false);
        faculty3.viewProfile();
        java.lang.String str18 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "faculty" + "'", str11, "faculty");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "faculty" + "'", str18, "faculty");
    }

    @Test
    public void test06786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06786");
        model.Faculty faculty3 = new model.Faculty("hi!", "hi!", "");
        faculty3.viewProfile();
        java.lang.String str5 = faculty3.getAccountType();
        java.lang.String str6 = faculty3.getEmail();
        faculty3.logout();
        java.lang.String str8 = faculty3.getAccountType();
        double double9 = faculty3.getHourlyRate();
        faculty3.viewProfile();
        java.lang.Class<?> wildcardClass11 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "faculty" + "'", str8, "faculty");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 30.0d + "'", double9 == 30.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test06787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06787");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.viewProfile();
        java.lang.String str8 = faculty3.getAccountType();
        java.lang.String str9 = faculty3.getID();
        double double10 = faculty3.getHourlyRate();
        boolean boolean11 = faculty3.isVerified();
        java.lang.String str12 = faculty3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "faculty" + "'", str8, "faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 30.0d + "'", double10 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test06788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06788");
        model.Faculty faculty3 = new model.Faculty("faculty", "", "");
        faculty3.logout();
        java.lang.String str5 = faculty3.getPassword();
        boolean boolean6 = faculty3.isVerified();
        java.lang.String str7 = faculty3.getEmail();
        boolean boolean8 = faculty3.isVerified();
        faculty3.logout();
        java.lang.String str10 = faculty3.getEmail();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "faculty" + "'", str7, "faculty");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "faculty" + "'", str10, "faculty");
    }

    @Test
    public void test06789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06789");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        java.lang.String str4 = faculty3.getAccountType();
        java.lang.String str5 = faculty3.getID();
        faculty3.setVerified(true);
        java.lang.String str8 = faculty3.getAccountType();
        java.lang.String str9 = faculty3.getAccountType();
        java.lang.String str10 = faculty3.getPassword();
        faculty3.logout();
        double double12 = faculty3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "faculty" + "'", str4, "faculty");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "faculty" + "'", str8, "faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "faculty" + "'", str9, "faculty");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 30.0d + "'", double12 == 30.0d);
    }

    @Test
    public void test06790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06790");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        faculty3.setVerified(false);
        java.lang.String str10 = faculty3.getEmail();
        faculty3.logout();
        boolean boolean12 = faculty3.isVerified();
        java.lang.String str13 = faculty3.getAccountType();
        java.lang.String str14 = faculty3.getID();
        java.lang.String str15 = faculty3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "faculty" + "'", str13, "faculty");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test06791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06791");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        faculty3.setVerified(false);
        java.lang.String str6 = faculty3.getEmail();
        java.lang.String str7 = faculty3.getAccountType();
        java.lang.String str8 = faculty3.getID();
        java.lang.String str9 = faculty3.getPassword();
        faculty3.logout();
        java.lang.String str11 = faculty3.getPassword();
        double double12 = faculty3.getHourlyRate();
        java.lang.String str13 = faculty3.getPassword();
        faculty3.login("", "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "faculty" + "'", str7, "faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 30.0d + "'", double12 == 30.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test06792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06792");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        java.lang.String str8 = faculty3.getAccountType();
        faculty3.setVerified(false);
        faculty3.viewProfile();
        java.lang.String str12 = faculty3.getAccountType();
        faculty3.login("hi!", "faculty");
        java.lang.String str16 = faculty3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "faculty" + "'", str8, "faculty");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "faculty" + "'", str12, "faculty");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test06793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06793");
        model.Faculty faculty3 = new model.Faculty("", "faculty", "faculty");
        double double4 = faculty3.getHourlyRate();
        java.lang.String str5 = faculty3.getAccountType();
        double double6 = faculty3.getHourlyRate();
        java.lang.String str7 = faculty3.getPassword();
        boolean boolean8 = faculty3.isVerified();
        faculty3.viewProfile();
        java.lang.String str10 = faculty3.getAccountType();
        java.lang.String str11 = faculty3.getPassword();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 30.0d + "'", double4 == 30.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "faculty" + "'", str7, "faculty");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "faculty" + "'", str10, "faculty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "faculty" + "'", str11, "faculty");
    }

    @Test
    public void test06794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06794");
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
        java.lang.String str19 = faculty3.getAccountType();
        faculty3.setVerified(true);
        faculty3.viewProfile();
        faculty3.login("hi!", "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "faculty" + "'", str11, "faculty");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "faculty" + "'", str18, "faculty");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "faculty" + "'", str19, "faculty");
    }

    @Test
    public void test06795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06795");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        java.lang.String str7 = faculty3.getID();
        java.lang.String str8 = faculty3.getID();
        java.lang.String str9 = faculty3.getID();
        faculty3.setVerified(true);
        faculty3.setVerified(false);
        faculty3.login("", "hi!");
        java.lang.String str17 = faculty3.getPassword();
        faculty3.login("faculty", "hi!");
        java.lang.String str21 = faculty3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test06796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06796");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        java.lang.String str4 = faculty3.getAccountType();
        java.lang.String str5 = faculty3.getID();
        faculty3.setVerified(true);
        faculty3.login("faculty", "faculty");
        java.lang.String str11 = faculty3.getPassword();
        java.lang.String str12 = faculty3.getEmail();
        faculty3.logout();
        java.lang.String str14 = faculty3.getID();
        java.lang.String str15 = faculty3.getAccountType();
        faculty3.viewProfile();
        faculty3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "faculty" + "'", str4, "faculty");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "faculty" + "'", str15, "faculty");
    }

    @Test
    public void test06797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06797");
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
        java.lang.String str21 = faculty3.getPassword();
        faculty3.logout();
        java.lang.String str23 = faculty3.getEmail();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "faculty" + "'", str10, "faculty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "faculty" + "'", str11, "faculty");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 30.0d + "'", double12 == 30.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "faculty" + "'", str14, "faculty");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "faculty" + "'", str18, "faculty");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
    }

    @Test
    public void test06798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06798");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        faculty3.logout();
        java.lang.String str5 = faculty3.getID();
        java.lang.String str6 = faculty3.getEmail();
        java.lang.String str7 = faculty3.getPassword();
        java.lang.String str8 = faculty3.getID();
        faculty3.logout();
        faculty3.viewProfile();
        java.lang.String str11 = faculty3.getID();
        faculty3.viewProfile();
        boolean boolean13 = faculty3.isVerified();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test06799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06799");
        model.Faculty faculty3 = new model.Faculty("hi!", "hi!", "");
        java.lang.String str4 = faculty3.getAccountType();
        java.lang.String str5 = faculty3.getID();
        boolean boolean6 = faculty3.isVerified();
        faculty3.setVerified(false);
        faculty3.setVerified(false);
        faculty3.viewProfile();
        faculty3.viewProfile();
        java.lang.String str13 = faculty3.getID();
        java.lang.Class<?> wildcardClass14 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "faculty" + "'", str4, "faculty");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test06800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06800");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        java.lang.String str7 = faculty3.getID();
        double double8 = faculty3.getHourlyRate();
        java.lang.String str9 = faculty3.getID();
        java.lang.String str10 = faculty3.getAccountType();
        faculty3.setVerified(true);
        java.lang.String str13 = faculty3.getPassword();
        java.lang.String str14 = faculty3.getPassword();
        faculty3.viewProfile();
        java.lang.String str16 = faculty3.getPassword();
        java.lang.String str17 = faculty3.getID();
        faculty3.setVerified(true);
        faculty3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "faculty" + "'", str10, "faculty");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test06801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06801");
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
        java.lang.String str18 = faculty3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "faculty" + "'", str13, "faculty");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 30.0d + "'", double17 == 30.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test06802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06802");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        java.lang.String str6 = faculty3.getPassword();
        faculty3.setVerified(false);
        java.lang.String str9 = faculty3.getAccountType();
        double double10 = faculty3.getHourlyRate();
        double double11 = faculty3.getHourlyRate();
        faculty3.logout();
        java.lang.String str13 = faculty3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "faculty" + "'", str9, "faculty");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 30.0d + "'", double10 == 30.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 30.0d + "'", double11 == 30.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test06803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06803");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        faculty3.logout();
        java.lang.String str5 = faculty3.getID();
        java.lang.String str6 = faculty3.getPassword();
        double double7 = faculty3.getHourlyRate();
        faculty3.login("faculty", "hi!");
        java.lang.String str11 = faculty3.getID();
        java.lang.String str12 = faculty3.getID();
        java.lang.String str13 = faculty3.getAccountType();
        faculty3.viewProfile();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "faculty" + "'", str13, "faculty");
    }

    @Test
    public void test06804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06804");
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
        java.lang.String str18 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "faculty" + "'", str4, "faculty");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "faculty" + "'", str11, "faculty");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 30.0d + "'", double14 == 30.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "faculty" + "'", str18, "faculty");
    }

    @Test
    public void test06805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06805");
        model.Faculty faculty3 = new model.Faculty("", "faculty", "");
        faculty3.setVerified(true);
        faculty3.setVerified(true);
        faculty3.viewProfile();
        faculty3.logout();
        faculty3.viewProfile();
    }

    @Test
    public void test06806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06806");
        model.Faculty faculty3 = new model.Faculty("hi!", "hi!", "");
        faculty3.setVerified(false);
        faculty3.viewProfile();
        faculty3.setVerified(false);
        boolean boolean9 = faculty3.isVerified();
        double double10 = faculty3.getHourlyRate();
        faculty3.viewProfile();
        double double12 = faculty3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 30.0d + "'", double10 == 30.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 30.0d + "'", double12 == 30.0d);
    }

    @Test
    public void test06807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06807");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        faculty3.setVerified(true);
        faculty3.logout();
        faculty3.viewProfile();
        faculty3.login("hi!", "");
        faculty3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test06808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06808");
        model.Faculty faculty3 = new model.Faculty("hi!", "hi!", "hi!");
        double double4 = faculty3.getHourlyRate();
        java.lang.String str5 = faculty3.getPassword();
        java.lang.String str6 = faculty3.getPassword();
        java.lang.String str7 = faculty3.getPassword();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 30.0d + "'", double4 == 30.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test06809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06809");
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
        faculty3.login("faculty", "faculty");
        faculty3.login("faculty", "");
        boolean boolean19 = faculty3.isVerified();
        faculty3.logout();
        faculty3.setVerified(false);
        java.lang.Class<?> wildcardClass23 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test06810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06810");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        faculty3.logout();
        faculty3.login("hi!", "hi!");
        double double8 = faculty3.getHourlyRate();
        java.lang.String str9 = faculty3.getID();
        java.lang.String str10 = faculty3.getAccountType();
        faculty3.viewProfile();
        java.lang.String str12 = faculty3.getID();
        faculty3.setVerified(true);
        java.lang.String str15 = faculty3.getEmail();
        java.lang.String str16 = faculty3.getID();
        java.lang.String str17 = faculty3.getEmail();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "faculty" + "'", str10, "faculty");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test06811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06811");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        java.lang.String str7 = faculty3.getID();
        faculty3.setVerified(true);
        java.lang.String str10 = faculty3.getEmail();
        faculty3.setVerified(true);
        faculty3.logout();
        java.lang.String str14 = faculty3.getID();
        faculty3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test06812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06812");
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
        faculty3.viewProfile();
        faculty3.viewProfile();
        java.lang.String str18 = faculty3.getPassword();
        faculty3.setVerified(false);
        java.lang.Class<?> wildcardClass21 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "faculty" + "'", str11, "faculty");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test06813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06813");
        model.Faculty faculty3 = new model.Faculty("hi!", "hi!", "");
        faculty3.logout();
        java.lang.String str5 = faculty3.getEmail();
        java.lang.String str6 = faculty3.getAccountType();
        faculty3.logout();
        faculty3.viewProfile();
        faculty3.setVerified(false);
        java.lang.String str11 = faculty3.getPassword();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test06814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06814");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        faculty3.logout();
        faculty3.login("hi!", "hi!");
        double double8 = faculty3.getHourlyRate();
        java.lang.String str9 = faculty3.getID();
        faculty3.login("", "faculty");
        java.lang.String str13 = faculty3.getID();
        double double14 = faculty3.getHourlyRate();
        java.lang.String str15 = faculty3.getID();
        java.lang.Class<?> wildcardClass16 = faculty3.getClass();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 30.0d + "'", double14 == 30.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test06815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06815");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        java.lang.String str8 = faculty3.getPassword();
        java.lang.String str9 = faculty3.getPassword();
        java.lang.String str10 = faculty3.getPassword();
        double double11 = faculty3.getHourlyRate();
        faculty3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 30.0d + "'", double11 == 30.0d);
    }

    @Test
    public void test06816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06816");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        faculty3.setVerified(false);
        java.lang.String str6 = faculty3.getEmail();
        faculty3.setVerified(false);
        faculty3.login("faculty", "hi!");
        faculty3.logout();
        faculty3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test06817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06817");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        java.lang.String str4 = faculty3.getAccountType();
        java.lang.String str5 = faculty3.getEmail();
        faculty3.viewProfile();
        double double7 = faculty3.getHourlyRate();
        java.lang.String str8 = faculty3.getPassword();
        java.lang.String str9 = faculty3.getAccountType();
        java.lang.String str10 = faculty3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "faculty" + "'", str4, "faculty");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "faculty" + "'", str9, "faculty");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test06818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06818");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        faculty3.logout();
        faculty3.viewProfile();
        faculty3.viewProfile();
        java.lang.String str7 = faculty3.getID();
        java.lang.String str8 = faculty3.getID();
        faculty3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test06819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06819");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getAccountType();
        faculty3.logout();
        java.lang.String str8 = faculty3.getEmail();
        faculty3.viewProfile();
        java.lang.String str10 = faculty3.getID();
        faculty3.logout();
        faculty3.login("faculty", "");
        boolean boolean15 = faculty3.isVerified();
        faculty3.login("hi!", "");
        java.lang.String str19 = faculty3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test06820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06820");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        faculty3.logout();
        java.lang.String str5 = faculty3.getID();
        java.lang.String str6 = faculty3.getEmail();
        faculty3.viewProfile();
        faculty3.setVerified(false);
        faculty3.logout();
        java.lang.String str11 = faculty3.getEmail();
        faculty3.login("hi!", "hi!");
        faculty3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test06821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06821");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        faculty3.setVerified(false);
        java.lang.String str10 = faculty3.getAccountType();
        java.lang.String str11 = faculty3.getEmail();
        faculty3.logout();
        java.lang.String str13 = faculty3.getID();
        faculty3.viewProfile();
        java.lang.String str15 = faculty3.getPassword();
        double double16 = faculty3.getHourlyRate();
        java.lang.String str17 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "faculty" + "'", str10, "faculty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 30.0d + "'", double16 == 30.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "faculty" + "'", str17, "faculty");
    }

    @Test
    public void test06822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06822");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        faculty3.logout();
        faculty3.login("hi!", "hi!");
        double double8 = faculty3.getHourlyRate();
        boolean boolean9 = faculty3.isVerified();
        java.lang.String str10 = faculty3.getAccountType();
        java.lang.String str11 = faculty3.getAccountType();
        java.lang.String str12 = faculty3.getID();
        java.lang.String str13 = faculty3.getID();
        faculty3.login("", "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "faculty" + "'", str10, "faculty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "faculty" + "'", str11, "faculty");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test06823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06823");
        model.Faculty faculty3 = new model.Faculty("", "faculty", "faculty");
        faculty3.setVerified(true);
        java.lang.String str6 = faculty3.getPassword();
        boolean boolean7 = faculty3.isVerified();
        java.lang.String str8 = faculty3.getEmail();
        faculty3.logout();
        boolean boolean10 = faculty3.isVerified();
        java.lang.String str11 = faculty3.getID();
        java.lang.String str12 = faculty3.getID();
        faculty3.viewProfile();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "faculty" + "'", str11, "faculty");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "faculty" + "'", str12, "faculty");
    }

    @Test
    public void test06824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06824");
        model.Faculty faculty3 = new model.Faculty("hi!", "hi!", "");
        faculty3.logout();
        faculty3.logout();
        faculty3.viewProfile();
        faculty3.login("hi!", "faculty");
    }

    @Test
    public void test06825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06825");
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
        java.lang.String str17 = faculty3.getAccountType();
        double double18 = faculty3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 30.0d + "'", double15 == 30.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "faculty" + "'", str17, "faculty");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 30.0d + "'", double18 == 30.0d);
    }

    @Test
    public void test06826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06826");
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
        faculty3.setVerified(true);
        java.lang.String str18 = faculty3.getPassword();
        boolean boolean19 = faculty3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 30.0d + "'", double15 == 30.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test06827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06827");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        faculty3.setVerified(false);
        java.lang.String str6 = faculty3.getPassword();
        java.lang.String str7 = faculty3.getAccountType();
        java.lang.String str8 = faculty3.getEmail();
        java.lang.String str9 = faculty3.getID();
        java.lang.String str10 = faculty3.getPassword();
        java.lang.String str11 = faculty3.getEmail();
        double double12 = faculty3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "faculty" + "'", str7, "faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 30.0d + "'", double12 == 30.0d);
    }

    @Test
    public void test06828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06828");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        faculty3.logout();
        java.lang.String str5 = faculty3.getID();
        java.lang.String str6 = faculty3.getEmail();
        double double7 = faculty3.getHourlyRate();
        java.lang.String str8 = faculty3.getPassword();
        faculty3.login("hi!", "hi!");
        java.lang.String str12 = faculty3.getAccountType();
        boolean boolean13 = faculty3.isVerified();
        faculty3.login("faculty", "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "faculty" + "'", str12, "faculty");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test06829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06829");
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
        faculty3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 30.0d + "'", double13 == 30.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 30.0d + "'", double14 == 30.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test06830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06830");
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
        java.lang.Class<?> wildcardClass19 = faculty3.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test06831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06831");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        boolean boolean7 = faculty3.isVerified();
        faculty3.logout();
        java.lang.String str9 = faculty3.getID();
        faculty3.login("hi!", "");
        java.lang.String str13 = faculty3.getPassword();
        faculty3.login("", "");
        boolean boolean17 = faculty3.isVerified();
        java.lang.String str18 = faculty3.getID();
        java.lang.String str19 = faculty3.getID();
        faculty3.login("faculty", "");
        java.lang.String str23 = faculty3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test06832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06832");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        faculty3.setVerified(false);
        faculty3.viewProfile();
        java.lang.String str7 = faculty3.getEmail();
        java.lang.String str8 = faculty3.getAccountType();
        java.lang.String str9 = faculty3.getID();
        faculty3.setVerified(false);
        double double12 = faculty3.getHourlyRate();
        java.lang.String str13 = faculty3.getAccountType();
        double double14 = faculty3.getHourlyRate();
        boolean boolean15 = faculty3.isVerified();
        faculty3.login("hi!", "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "faculty" + "'", str8, "faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 30.0d + "'", double12 == 30.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "faculty" + "'", str13, "faculty");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 30.0d + "'", double14 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test06833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06833");
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
        java.lang.String str16 = faculty3.getAccountType();
        java.lang.Class<?> wildcardClass17 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "faculty" + "'", str14, "faculty");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "faculty" + "'", str16, "faculty");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test06834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06834");
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
        faculty3.setVerified(true);
        java.lang.String str19 = faculty3.getAccountType();
        double double20 = faculty3.getHourlyRate();
        faculty3.login("", "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "faculty" + "'", str19, "faculty");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 30.0d + "'", double20 == 30.0d);
    }

    @Test
    public void test06835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06835");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        faculty3.setVerified(false);
        java.lang.String str6 = faculty3.getPassword();
        java.lang.String str7 = faculty3.getAccountType();
        java.lang.String str8 = faculty3.getEmail();
        java.lang.String str9 = faculty3.getAccountType();
        java.lang.String str10 = faculty3.getID();
        faculty3.logout();
        java.lang.String str12 = faculty3.getEmail();
        double double13 = faculty3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "faculty" + "'", str7, "faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "faculty" + "'", str9, "faculty");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 30.0d + "'", double13 == 30.0d);
    }

    @Test
    public void test06836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06836");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        faculty3.setVerified(false);
        java.lang.String str10 = faculty3.getEmail();
        faculty3.logout();
        boolean boolean12 = faculty3.isVerified();
        faculty3.viewProfile();
        boolean boolean14 = faculty3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test06837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06837");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        faculty3.logout();
        faculty3.login("hi!", "hi!");
        double double8 = faculty3.getHourlyRate();
        java.lang.String str9 = faculty3.getID();
        java.lang.String str10 = faculty3.getEmail();
        java.lang.String str11 = faculty3.getPassword();
        java.lang.String str12 = faculty3.getID();
        double double13 = faculty3.getHourlyRate();
        boolean boolean14 = faculty3.isVerified();
        java.lang.String str15 = faculty3.getPassword();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 30.0d + "'", double13 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test06838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06838");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        java.lang.String str8 = faculty3.getPassword();
        java.lang.String str9 = faculty3.getID();
        double double10 = faculty3.getHourlyRate();
        faculty3.login("faculty", "");
        faculty3.viewProfile();
        java.lang.String str15 = faculty3.getID();
        java.lang.String str16 = faculty3.getID();
        faculty3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 30.0d + "'", double10 == 30.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test06839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06839");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        java.lang.String str8 = faculty3.getPassword();
        faculty3.setVerified(false);
        faculty3.logout();
        java.lang.String str12 = faculty3.getID();
        faculty3.login("faculty", "faculty");
        faculty3.setVerified(false);
        faculty3.viewProfile();
        faculty3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test06840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06840");
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
        faculty3.viewProfile();
        faculty3.login("", "");
        faculty3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 30.0d + "'", double14 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test06841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06841");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        faculty3.setVerified(false);
        java.lang.String str10 = faculty3.getEmail();
        faculty3.logout();
        java.lang.String str12 = faculty3.getID();
        java.lang.String str13 = faculty3.getID();
        faculty3.setVerified(false);
        java.lang.Class<?> wildcardClass16 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test06842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06842");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        double double6 = faculty3.getHourlyRate();
        java.lang.String str7 = faculty3.getEmail();
        faculty3.viewProfile();
        boolean boolean9 = faculty3.isVerified();
        boolean boolean10 = faculty3.isVerified();
        java.lang.String str11 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "faculty" + "'", str11, "faculty");
    }

    @Test
    public void test06843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06843");
        model.Faculty faculty3 = new model.Faculty("hi!", "faculty", "");
        faculty3.logout();
        java.lang.String str5 = faculty3.getPassword();
        java.lang.String str6 = faculty3.getEmail();
        faculty3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test06844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06844");
        model.Faculty faculty3 = new model.Faculty("", "", "");
        faculty3.viewProfile();
        java.lang.String str5 = faculty3.getEmail();
        java.lang.String str6 = faculty3.getEmail();
        faculty3.login("hi!", "hi!");
        boolean boolean10 = faculty3.isVerified();
        faculty3.setVerified(false);
        faculty3.viewProfile();
        java.lang.Class<?> wildcardClass14 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test06845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06845");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        faculty3.setVerified(false);
        java.lang.String str10 = faculty3.getAccountType();
        java.lang.String str11 = faculty3.getEmail();
        faculty3.logout();
        boolean boolean13 = faculty3.isVerified();
        boolean boolean14 = faculty3.isVerified();
        java.lang.String str15 = faculty3.getID();
        faculty3.viewProfile();
        faculty3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "faculty" + "'", str10, "faculty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test06846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06846");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        java.lang.String str6 = faculty3.getPassword();
        faculty3.setVerified(false);
        faculty3.setVerified(false);
        java.lang.String str11 = faculty3.getPassword();
        java.lang.String str12 = faculty3.getEmail();
        java.lang.String str13 = faculty3.getPassword();
        java.lang.String str14 = faculty3.getID();
        java.lang.String str15 = faculty3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test06847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06847");
        model.Faculty faculty3 = new model.Faculty("faculty", "", "faculty");
        faculty3.setVerified(false);
        java.lang.String str6 = faculty3.getAccountType();
        faculty3.login("hi!", "faculty");
        java.lang.String str10 = faculty3.getAccountType();
        java.lang.String str11 = faculty3.getID();
        faculty3.viewProfile();
        java.lang.String str13 = faculty3.getID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "faculty" + "'", str10, "faculty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "faculty" + "'", str11, "faculty");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "faculty" + "'", str13, "faculty");
    }

    @Test
    public void test06848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06848");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getAccountType();
        faculty3.viewProfile();
        faculty3.login("hi!", "faculty");
        boolean boolean11 = faculty3.isVerified();
        boolean boolean12 = faculty3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test06849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06849");
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
        faculty3.setVerified(false);
        java.lang.String str23 = faculty3.getAccountType();
        double double24 = faculty3.getHourlyRate();
        java.lang.String str25 = faculty3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 30.0d + "'", double11 == 30.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "faculty" + "'", str23, "faculty");
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 30.0d + "'", double24 == 30.0d);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test06850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06850");
        model.Faculty faculty3 = new model.Faculty("", "", "faculty");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getPassword();
        boolean boolean6 = faculty3.isVerified();
        java.lang.String str7 = faculty3.getID();
        boolean boolean8 = faculty3.isVerified();
        double double9 = faculty3.getHourlyRate();
        faculty3.setVerified(false);
        faculty3.setVerified(true);
        boolean boolean14 = faculty3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "faculty" + "'", str4, "faculty");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "faculty" + "'", str7, "faculty");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 30.0d + "'", double9 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test06851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06851");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        java.lang.String str6 = faculty3.getPassword();
        faculty3.setVerified(false);
        faculty3.setVerified(false);
        java.lang.String str11 = faculty3.getID();
        java.lang.String str12 = faculty3.getAccountType();
        boolean boolean13 = faculty3.isVerified();
        java.lang.String str14 = faculty3.getAccountType();
        java.lang.String str15 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "faculty" + "'", str12, "faculty");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "faculty" + "'", str14, "faculty");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "faculty" + "'", str15, "faculty");
    }

    @Test
    public void test06852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06852");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        java.lang.String str8 = faculty3.getPassword();
        java.lang.String str9 = faculty3.getID();
        double double10 = faculty3.getHourlyRate();
        faculty3.login("faculty", "");
        java.lang.String str14 = faculty3.getAccountType();
        double double15 = faculty3.getHourlyRate();
        java.lang.String str16 = faculty3.getAccountType();
        faculty3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 30.0d + "'", double10 == 30.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "faculty" + "'", str14, "faculty");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 30.0d + "'", double15 == 30.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "faculty" + "'", str16, "faculty");
    }

    @Test
    public void test06853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06853");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        java.lang.String str4 = faculty3.getAccountType();
        java.lang.String str5 = faculty3.getEmail();
        double double6 = faculty3.getHourlyRate();
        boolean boolean7 = faculty3.isVerified();
        java.lang.String str8 = faculty3.getAccountType();
        faculty3.login("", "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "faculty" + "'", str4, "faculty");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "faculty" + "'", str8, "faculty");
    }

    @Test
    public void test06854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06854");
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
        java.lang.String str17 = faculty3.getID();
        faculty3.login("hi!", "");
        boolean boolean21 = faculty3.isVerified();
        java.lang.String str22 = faculty3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 30.0d + "'", double14 == 30.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test06855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06855");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        java.lang.String str8 = faculty3.getPassword();
        java.lang.String str9 = faculty3.getPassword();
        java.lang.String str10 = faculty3.getPassword();
        double double11 = faculty3.getHourlyRate();
        boolean boolean12 = faculty3.isVerified();
        java.lang.String str13 = faculty3.getEmail();
        java.lang.String str14 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 30.0d + "'", double11 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "faculty" + "'", str14, "faculty");
    }

    @Test
    public void test06856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06856");
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
        java.lang.String str27 = faculty3.getEmail();
        java.lang.String str28 = faculty3.getAccountType();
        boolean boolean29 = faculty3.isVerified();
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
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "faculty" + "'", str28, "faculty");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test06857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06857");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        java.lang.String str4 = faculty3.getAccountType();
        java.lang.String str5 = faculty3.getEmail();
        faculty3.viewProfile();
        java.lang.String str7 = faculty3.getPassword();
        java.lang.String str8 = faculty3.getPassword();
        faculty3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "faculty" + "'", str4, "faculty");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test06858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06858");
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
        faculty3.logout();
        boolean boolean18 = faculty3.isVerified();
        faculty3.logout();
        faculty3.login("", "faculty");
        faculty3.setVerified(false);
        faculty3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "faculty" + "'", str10, "faculty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 30.0d + "'", double15 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test06859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06859");
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
        java.lang.String str15 = faculty3.getEmail();
        boolean boolean16 = faculty3.isVerified();
        java.lang.String str17 = faculty3.getPassword();
        boolean boolean18 = faculty3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 30.0d + "'", double14 == 30.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test06860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06860");
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
        java.lang.String str15 = faculty3.getEmail();
        java.lang.String str16 = faculty3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "faculty" + "'", str11, "faculty");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test06861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06861");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getID();
        faculty3.setVerified(false);
        faculty3.viewProfile();
        java.lang.String str9 = faculty3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test06862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06862");
        model.Faculty faculty3 = new model.Faculty("", "faculty", "faculty");
        double double4 = faculty3.getHourlyRate();
        java.lang.String str5 = faculty3.getAccountType();
        double double6 = faculty3.getHourlyRate();
        java.lang.String str7 = faculty3.getPassword();
        faculty3.viewProfile();
        faculty3.login("", "faculty");
        double double12 = faculty3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 30.0d + "'", double4 == 30.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "faculty" + "'", str7, "faculty");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 30.0d + "'", double12 == 30.0d);
    }

    @Test
    public void test06863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06863");
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
        faculty3.login("faculty", "");
        double double24 = faculty3.getHourlyRate();
        faculty3.setVerified(true);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "faculty" + "'", str10, "faculty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "faculty" + "'", str11, "faculty");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 30.0d + "'", double12 == 30.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 30.0d + "'", double13 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 30.0d + "'", double24 == 30.0d);
    }

    @Test
    public void test06864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06864");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        java.lang.String str7 = faculty3.getID();
        faculty3.setVerified(true);
        java.lang.String str10 = faculty3.getEmail();
        faculty3.setVerified(true);
        faculty3.setVerified(true);
        java.lang.String str15 = faculty3.getAccountType();
        java.lang.String str16 = faculty3.getPassword();
        java.lang.String str17 = faculty3.getAccountType();
        double double18 = faculty3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "faculty" + "'", str15, "faculty");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "faculty" + "'", str17, "faculty");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 30.0d + "'", double18 == 30.0d);
    }

    @Test
    public void test06865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06865");
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
        java.lang.String str15 = faculty3.getEmail();
        faculty3.viewProfile();
        faculty3.logout();
        java.lang.String str18 = faculty3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 30.0d + "'", double12 == 30.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "faculty" + "'", str14, "faculty");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test06866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06866");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getAccountType();
        java.lang.String str7 = faculty3.getAccountType();
        java.lang.String str8 = faculty3.getEmail();
        faculty3.logout();
        faculty3.login("faculty", "hi!");
        java.lang.String str13 = faculty3.getID();
        faculty3.logout();
        java.lang.String str15 = faculty3.getEmail();
        faculty3.logout();
        java.lang.String str17 = faculty3.getAccountType();
        java.lang.String str18 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "faculty" + "'", str7, "faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "faculty" + "'", str17, "faculty");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "faculty" + "'", str18, "faculty");
    }

    @Test
    public void test06867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06867");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        java.lang.String str4 = faculty3.getAccountType();
        java.lang.String str5 = faculty3.getID();
        faculty3.setVerified(true);
        faculty3.login("faculty", "faculty");
        java.lang.String str11 = faculty3.getID();
        faculty3.viewProfile();
        boolean boolean13 = faculty3.isVerified();
        faculty3.login("hi!", "faculty");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "faculty" + "'", str4, "faculty");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test06868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06868");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        faculty3.logout();
        java.lang.String str5 = faculty3.getID();
        java.lang.String str6 = faculty3.getPassword();
        double double7 = faculty3.getHourlyRate();
        java.lang.Class<?> wildcardClass8 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test06869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06869");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        faculty3.logout();
        faculty3.viewProfile();
        faculty3.viewProfile();
        faculty3.logout();
        java.lang.String str8 = faculty3.getAccountType();
        faculty3.login("", "hi!");
        java.lang.String str12 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "faculty" + "'", str8, "faculty");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "faculty" + "'", str12, "faculty");
    }

    @Test
    public void test06870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06870");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.login("", "");
        faculty3.login("faculty", "faculty");
        java.lang.String str13 = faculty3.getPassword();
        boolean boolean14 = faculty3.isVerified();
        java.lang.String str15 = faculty3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test06871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06871");
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
        faculty3.login("", "hi!");
        faculty3.login("hi!", "hi!");
        java.lang.String str22 = faculty3.getAccountType();
        faculty3.viewProfile();
        boolean boolean24 = faculty3.isVerified();
        faculty3.setVerified(false);
        java.lang.String str27 = faculty3.getID();
        java.lang.String str28 = faculty3.getPassword();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "faculty" + "'", str15, "faculty");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "faculty" + "'", str22, "faculty");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test06872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06872");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        faculty3.setVerified(false);
        faculty3.viewProfile();
        java.lang.String str7 = faculty3.getEmail();
        java.lang.String str8 = faculty3.getAccountType();
        java.lang.String str9 = faculty3.getID();
        java.lang.String str10 = faculty3.getPassword();
        java.lang.String str11 = faculty3.getEmail();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "faculty" + "'", str8, "faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test06873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06873");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        faculty3.setVerified(false);
        java.lang.String str6 = faculty3.getEmail();
        java.lang.String str7 = faculty3.getAccountType();
        java.lang.String str8 = faculty3.getAccountType();
        java.lang.String str9 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "faculty" + "'", str7, "faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "faculty" + "'", str8, "faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "faculty" + "'", str9, "faculty");
    }

    @Test
    public void test06874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06874");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        faculty3.setVerified(false);
        java.lang.String str10 = faculty3.getEmail();
        faculty3.logout();
        faculty3.viewProfile();
        java.lang.String str13 = faculty3.getID();
        java.lang.String str14 = faculty3.getEmail();
        boolean boolean15 = faculty3.isVerified();
        faculty3.login("faculty", "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test06875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06875");
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
        boolean boolean16 = faculty3.isVerified();
        faculty3.viewProfile();
        java.lang.Class<?> wildcardClass18 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test06876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06876");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        faculty3.setVerified(true);
        faculty3.login("hi!", "");
        double double13 = faculty3.getHourlyRate();
        boolean boolean14 = faculty3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 30.0d + "'", double13 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test06877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06877");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        faculty3.logout();
        faculty3.login("hi!", "hi!");
        double double8 = faculty3.getHourlyRate();
        java.lang.String str9 = faculty3.getID();
        java.lang.String str10 = faculty3.getAccountType();
        faculty3.login("", "hi!");
        faculty3.logout();
        java.lang.String str15 = faculty3.getID();
        faculty3.logout();
        faculty3.setVerified(false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "faculty" + "'", str10, "faculty");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test06878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06878");
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
        java.lang.String str16 = faculty3.getPassword();
        java.lang.String str17 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 30.0d + "'", double11 == 30.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "faculty" + "'", str17, "faculty");
    }

    @Test
    public void test06879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06879");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        boolean boolean7 = faculty3.isVerified();
        faculty3.logout();
        java.lang.String str9 = faculty3.getID();
        faculty3.setVerified(true);
        faculty3.setVerified(true);
        java.lang.String str14 = faculty3.getPassword();
        boolean boolean15 = faculty3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test06880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06880");
        model.Faculty faculty3 = new model.Faculty("faculty", "hi!", "");
        faculty3.login("hi!", "hi!");
        faculty3.logout();
        faculty3.setVerified(false);
        faculty3.viewProfile();
        faculty3.setVerified(true);
        faculty3.viewProfile();
    }

    @Test
    public void test06881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06881");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        faculty3.logout();
        faculty3.login("hi!", "hi!");
        java.lang.String str8 = faculty3.getEmail();
        java.lang.String str9 = faculty3.getEmail();
        java.lang.String str10 = faculty3.getEmail();
        faculty3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test06882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06882");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        java.lang.String str8 = faculty3.getPassword();
        java.lang.String str9 = faculty3.getPassword();
        faculty3.logout();
        java.lang.String str11 = faculty3.getAccountType();
        boolean boolean12 = faculty3.isVerified();
        java.lang.String str13 = faculty3.getPassword();
        faculty3.viewProfile();
        java.lang.String str15 = faculty3.getPassword();
        java.lang.String str16 = faculty3.getEmail();
        faculty3.logout();
        faculty3.logout();
        java.lang.String str19 = faculty3.getID();
        boolean boolean20 = faculty3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "faculty" + "'", str11, "faculty");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test06883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06883");
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
        faculty3.viewProfile();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test06884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06884");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        faculty3.setVerified(false);
        faculty3.viewProfile();
        java.lang.String str11 = faculty3.getEmail();
        faculty3.login("faculty", "hi!");
        java.lang.String str15 = faculty3.getPassword();
        java.lang.String str16 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "faculty" + "'", str16, "faculty");
    }

    @Test
    public void test06885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06885");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        java.lang.String str7 = faculty3.getID();
        faculty3.setVerified(true);
        faculty3.setVerified(false);
        java.lang.String str12 = faculty3.getEmail();
        java.lang.String str13 = faculty3.getPassword();
        faculty3.setVerified(false);
        boolean boolean16 = faculty3.isVerified();
        double double17 = faculty3.getHourlyRate();
        boolean boolean18 = faculty3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 30.0d + "'", double17 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test06886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06886");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        faculty3.setVerified(false);
        faculty3.viewProfile();
        java.lang.String str7 = faculty3.getEmail();
        java.lang.String str8 = faculty3.getAccountType();
        faculty3.logout();
        faculty3.login("", "");
        faculty3.logout();
        java.lang.String str14 = faculty3.getPassword();
        java.lang.String str15 = faculty3.getAccountType();
        faculty3.logout();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "faculty" + "'", str8, "faculty");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "faculty" + "'", str15, "faculty");
    }

    @Test
    public void test06887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06887");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        faculty3.setVerified(false);
        faculty3.login("", "");
        faculty3.login("hi!", "faculty");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test06888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06888");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        java.lang.String str6 = faculty3.getPassword();
        faculty3.setVerified(false);
        faculty3.setVerified(true);
        double double11 = faculty3.getHourlyRate();
        boolean boolean12 = faculty3.isVerified();
        faculty3.viewProfile();
        faculty3.login("", "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 30.0d + "'", double11 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test06889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06889");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        faculty3.setVerified(false);
        java.lang.String str9 = faculty3.getID();
        faculty3.setVerified(false);
        java.lang.String str12 = faculty3.getID();
        java.lang.String str13 = faculty3.getAccountType();
        double double14 = faculty3.getHourlyRate();
        faculty3.login("hi!", "faculty");
        java.lang.String str18 = faculty3.getAccountType();
        java.lang.String str19 = faculty3.getAccountType();
        java.lang.String str20 = faculty3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "faculty" + "'", str13, "faculty");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 30.0d + "'", double14 == 30.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "faculty" + "'", str18, "faculty");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "faculty" + "'", str19, "faculty");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test06890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06890");
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
        java.lang.String str16 = faculty3.getEmail();
        java.lang.Class<?> wildcardClass17 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "faculty" + "'", str15, "faculty");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test06891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06891");
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
        double double13 = faculty3.getHourlyRate();
        java.lang.String str14 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "faculty" + "'", str8, "faculty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "faculty" + "'", str11, "faculty");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "faculty" + "'", str12, "faculty");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 30.0d + "'", double13 == 30.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "faculty" + "'", str14, "faculty");
    }

    @Test
    public void test06892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06892");
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
        boolean boolean13 = faculty3.isVerified();
        java.lang.String str14 = faculty3.getEmail();
        faculty3.viewProfile();
        boolean boolean16 = faculty3.isVerified();
        java.lang.Class<?> wildcardClass17 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "faculty" + "'", str11, "faculty");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test06893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06893");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        faculty3.login("", "");
        java.lang.String str7 = faculty3.getPassword();
        java.lang.String str8 = faculty3.getEmail();
        faculty3.logout();
        java.lang.String str10 = faculty3.getEmail();
        java.lang.String str11 = faculty3.getID();
        java.lang.String str12 = faculty3.getPassword();
        boolean boolean13 = faculty3.isVerified();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test06894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06894");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        faculty3.setVerified(false);
        java.lang.String str6 = faculty3.getPassword();
        java.lang.String str7 = faculty3.getAccountType();
        faculty3.viewProfile();
        faculty3.logout();
        boolean boolean10 = faculty3.isVerified();
        faculty3.login("faculty", "faculty");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "faculty" + "'", str7, "faculty");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test06895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06895");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        java.lang.String str6 = faculty3.getPassword();
        faculty3.setVerified(false);
        faculty3.setVerified(false);
        java.lang.String str11 = faculty3.getPassword();
        java.lang.String str12 = faculty3.getEmail();
        java.lang.String str13 = faculty3.getPassword();
        double double14 = faculty3.getHourlyRate();
        faculty3.viewProfile();
        java.lang.Class<?> wildcardClass16 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 30.0d + "'", double14 == 30.0d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test06896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06896");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getAccountType();
        java.lang.String str7 = faculty3.getAccountType();
        java.lang.String str8 = faculty3.getEmail();
        java.lang.String str9 = faculty3.getID();
        java.lang.String str10 = faculty3.getID();
        faculty3.viewProfile();
        faculty3.viewProfile();
        faculty3.login("", "faculty");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "faculty" + "'", str7, "faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test06897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06897");
        model.Faculty faculty3 = new model.Faculty("hi!", "hi!", "faculty");
        faculty3.logout();
        faculty3.setVerified(true);
        faculty3.login("faculty", "hi!");
    }

    @Test
    public void test06898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06898");
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
        faculty3.viewProfile();
        faculty3.logout();
        boolean boolean17 = faculty3.isVerified();
        java.lang.String str18 = faculty3.getPassword();
        faculty3.viewProfile();
        faculty3.viewProfile();
        java.lang.String str21 = faculty3.getID();
        boolean boolean22 = faculty3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test06899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06899");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        faculty3.setVerified(false);
        java.lang.String str9 = faculty3.getID();
        faculty3.setVerified(false);
        faculty3.logout();
        java.lang.String str13 = faculty3.getAccountType();
        java.lang.String str14 = faculty3.getEmail();
        faculty3.login("", "faculty");
        faculty3.logout();
        faculty3.logout();
        boolean boolean20 = faculty3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "faculty" + "'", str13, "faculty");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test06900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06900");
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
        faculty3.setVerified(false);
        java.lang.String str17 = faculty3.getEmail();
        faculty3.login("", "hi!");
        boolean boolean21 = faculty3.isVerified();
        faculty3.viewProfile();
        double double23 = faculty3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 30.0d + "'", double23 == 30.0d);
    }

    @Test
    public void test06901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06901");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        java.lang.String str8 = faculty3.getPassword();
        faculty3.setVerified(false);
        java.lang.String str11 = faculty3.getEmail();
        faculty3.logout();
        java.lang.String str13 = faculty3.getEmail();
        java.lang.String str14 = faculty3.getID();
        faculty3.login("hi!", "faculty");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test06902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06902");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        faculty3.setVerified(false);
        faculty3.viewProfile();
        java.lang.String str7 = faculty3.getEmail();
        java.lang.String str8 = faculty3.getAccountType();
        faculty3.logout();
        faculty3.login("", "");
        faculty3.setVerified(true);
        java.lang.String str15 = faculty3.getEmail();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "faculty" + "'", str8, "faculty");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test06903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06903");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        faculty3.logout();
        faculty3.login("hi!", "hi!");
        java.lang.String str8 = faculty3.getID();
        boolean boolean9 = faculty3.isVerified();
        double double10 = faculty3.getHourlyRate();
        faculty3.login("", "faculty");
        faculty3.logout();
        faculty3.login("faculty", "faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 30.0d + "'", double10 == 30.0d);
    }

    @Test
    public void test06904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06904");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        faculty3.login("", "");
        double double7 = faculty3.getHourlyRate();
        faculty3.login("faculty", "faculty");
        java.lang.String str11 = faculty3.getID();
        faculty3.logout();
        java.lang.String str13 = faculty3.getID();
        faculty3.setVerified(false);
        java.lang.String str16 = faculty3.getEmail();
        faculty3.login("hi!", "hi!");
        java.lang.String str20 = faculty3.getAccountType();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "faculty" + "'", str20, "faculty");
    }

    @Test
    public void test06905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06905");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getAccountType();
        faculty3.logout();
        java.lang.String str8 = faculty3.getEmail();
        faculty3.viewProfile();
        java.lang.String str10 = faculty3.getID();
        faculty3.logout();
        boolean boolean12 = faculty3.isVerified();
        java.lang.String str13 = faculty3.getAccountType();
        faculty3.setVerified(false);
        boolean boolean16 = faculty3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "faculty" + "'", str13, "faculty");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test06906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06906");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        boolean boolean7 = faculty3.isVerified();
        faculty3.logout();
        java.lang.String str9 = faculty3.getID();
        faculty3.setVerified(true);
        faculty3.viewProfile();
        faculty3.viewProfile();
        java.lang.String str14 = faculty3.getAccountType();
        faculty3.logout();
        java.lang.String str16 = faculty3.getPassword();
        faculty3.viewProfile();
        java.lang.String str18 = faculty3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "faculty" + "'", str14, "faculty");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test06907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06907");
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
        java.lang.String str15 = faculty3.getEmail();
        java.lang.String str16 = faculty3.getEmail();
        java.lang.String str17 = faculty3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "faculty" + "'", str8, "faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "faculty" + "'", str9, "faculty");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test06908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06908");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        double double6 = faculty3.getHourlyRate();
        java.lang.String str7 = faculty3.getID();
        boolean boolean8 = faculty3.isVerified();
        faculty3.setVerified(true);
        java.lang.Class<?> wildcardClass11 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test06909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06909");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getEmail();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        faculty3.login("hi!", "faculty");
        java.lang.String str11 = faculty3.getEmail();
        faculty3.setVerified(false);
        java.lang.String str14 = faculty3.getID();
        faculty3.login("faculty", "");
        double double18 = faculty3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 30.0d + "'", double18 == 30.0d);
    }

    @Test
    public void test06910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06910");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        java.lang.String str8 = faculty3.getPassword();
        java.lang.String str9 = faculty3.getID();
        faculty3.logout();
        faculty3.setVerified(true);
        boolean boolean13 = faculty3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test06911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06911");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        java.lang.String str7 = faculty3.getID();
        faculty3.login("hi!", "");
        java.lang.String str11 = faculty3.getPassword();
        boolean boolean12 = faculty3.isVerified();
        faculty3.login("", "faculty");
        faculty3.setVerified(true);
        java.lang.String str18 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "faculty" + "'", str18, "faculty");
    }

    @Test
    public void test06912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06912");
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
        boolean boolean18 = faculty3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 30.0d + "'", double17 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test06913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06913");
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
        faculty3.viewProfile();
        faculty3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 30.0d + "'", double17 == 30.0d);
    }

    @Test
    public void test06914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06914");
        model.Faculty faculty3 = new model.Faculty("", "faculty", "");
        faculty3.setVerified(true);
        double double6 = faculty3.getHourlyRate();
        java.lang.String str7 = faculty3.getPassword();
        faculty3.logout();
        faculty3.login("", "hi!");
        java.lang.String str12 = faculty3.getAccountType();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "faculty" + "'", str7, "faculty");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "faculty" + "'", str12, "faculty");
    }

    @Test
    public void test06915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06915");
        model.Faculty faculty3 = new model.Faculty("hi!", "hi!", "");
        faculty3.logout();
        java.lang.String str5 = faculty3.getEmail();
        faculty3.logout();
        java.lang.String str7 = faculty3.getEmail();
        boolean boolean8 = faculty3.isVerified();
        java.lang.String str9 = faculty3.getEmail();
        faculty3.setVerified(false);
        faculty3.logout();
        java.lang.String str13 = faculty3.getAccountType();
        boolean boolean14 = faculty3.isVerified();
        faculty3.logout();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "faculty" + "'", str13, "faculty");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test06916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06916");
        model.Faculty faculty3 = new model.Faculty("", "faculty", "");
        java.lang.String str4 = faculty3.getPassword();
        java.lang.String str5 = faculty3.getEmail();
        faculty3.logout();
        faculty3.login("faculty", "");
        java.lang.String str10 = faculty3.getEmail();
        faculty3.logout();
        java.lang.String str12 = faculty3.getPassword();
        boolean boolean13 = faculty3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "faculty" + "'", str4, "faculty");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "faculty" + "'", str12, "faculty");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test06917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06917");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        double double6 = faculty3.getHourlyRate();
        java.lang.String str7 = faculty3.getPassword();
        java.lang.String str8 = faculty3.getPassword();
        faculty3.login("faculty", "faculty");
        double double12 = faculty3.getHourlyRate();
        java.lang.String str13 = faculty3.getEmail();
        java.lang.String str14 = faculty3.getEmail();
        java.lang.String str15 = faculty3.getAccountType();
        faculty3.setVerified(true);
        double double18 = faculty3.getHourlyRate();
        faculty3.viewProfile();
        java.lang.String str20 = faculty3.getPassword();
        boolean boolean21 = faculty3.isVerified();
        double double22 = faculty3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 30.0d + "'", double12 == 30.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "faculty" + "'", str15, "faculty");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 30.0d + "'", double18 == 30.0d);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 30.0d + "'", double22 == 30.0d);
    }

    @Test
    public void test06918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06918");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getID();
        faculty3.setVerified(false);
        faculty3.viewProfile();
        faculty3.logout();
        java.lang.Class<?> wildcardClass10 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test06919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06919");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        double double6 = faculty3.getHourlyRate();
        faculty3.logout();
        faculty3.viewProfile();
        java.lang.String str9 = faculty3.getEmail();
        java.lang.String str10 = faculty3.getEmail();
        double double11 = faculty3.getHourlyRate();
        faculty3.login("hi!", "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 30.0d + "'", double11 == 30.0d);
    }

    @Test
    public void test06920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06920");
        model.Faculty faculty3 = new model.Faculty("hi!", "hi!", "hi!");
        faculty3.login("hi!", "faculty");
        faculty3.logout();
        java.lang.String str8 = faculty3.getPassword();
        faculty3.logout();
        faculty3.logout();
        faculty3.logout();
        boolean boolean12 = faculty3.isVerified();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test06921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06921");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        faculty3.login("", "");
        double double7 = faculty3.getHourlyRate();
        faculty3.login("faculty", "faculty");
        java.lang.String str11 = faculty3.getID();
        faculty3.logout();
        faculty3.logout();
        java.lang.String str14 = faculty3.getID();
        java.lang.String str15 = faculty3.getAccountType();
        java.lang.String str16 = faculty3.getEmail();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "faculty" + "'", str15, "faculty");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test06922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06922");
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
        faculty3.login("faculty", "faculty");
        faculty3.login("faculty", "hi!");
        boolean boolean19 = faculty3.isVerified();
        faculty3.login("faculty", "faculty");
        double double23 = faculty3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 30.0d + "'", double23 == 30.0d);
    }

    @Test
    public void test06923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06923");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        faculty3.setVerified(false);
        faculty3.viewProfile();
        java.lang.String str7 = faculty3.getEmail();
        java.lang.String str8 = faculty3.getAccountType();
        java.lang.String str9 = faculty3.getID();
        java.lang.String str10 = faculty3.getID();
        java.lang.String str11 = faculty3.getAccountType();
        faculty3.setVerified(false);
        faculty3.login("", "faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "faculty" + "'", str8, "faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "faculty" + "'", str11, "faculty");
    }

    @Test
    public void test06924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06924");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        double double6 = faculty3.getHourlyRate();
        faculty3.logout();
        faculty3.setVerified(false);
        faculty3.logout();
        java.lang.String str11 = faculty3.getPassword();
        java.lang.String str12 = faculty3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test06925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06925");
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
        java.lang.Class<?> wildcardClass19 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 30.0d + "'", double12 == 30.0d);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test06926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06926");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        faculty3.setVerified(false);
        java.lang.String str9 = faculty3.getID();
        faculty3.setVerified(false);
        boolean boolean12 = faculty3.isVerified();
        boolean boolean13 = faculty3.isVerified();
        faculty3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test06927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06927");
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
        java.lang.String str17 = faculty3.getPassword();
        faculty3.logout();
        faculty3.logout();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "faculty" + "'", str8, "faculty");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "faculty" + "'", str11, "faculty");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "faculty" + "'", str12, "faculty");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test06928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06928");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        faculty3.setVerified(false);
        java.lang.String str10 = faculty3.getEmail();
        faculty3.viewProfile();
        faculty3.viewProfile();
        java.lang.String str13 = faculty3.getID();
        java.lang.String str14 = faculty3.getID();
        boolean boolean15 = faculty3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test06929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06929");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        faculty3.setVerified(false);
        java.lang.String str9 = faculty3.getID();
        faculty3.setVerified(false);
        double double12 = faculty3.getHourlyRate();
        java.lang.String str13 = faculty3.getID();
        faculty3.setVerified(true);
        java.lang.String str16 = faculty3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 30.0d + "'", double12 == 30.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test06930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06930");
        model.Faculty faculty3 = new model.Faculty("faculty", "hi!", "");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getPassword();
        faculty3.viewProfile();
        faculty3.setVerified(false);
        java.lang.String str9 = faculty3.getID();
        faculty3.setVerified(true);
        double double12 = faculty3.getHourlyRate();
        java.lang.String str13 = faculty3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 30.0d + "'", double12 == 30.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "faculty" + "'", str13, "faculty");
    }

    @Test
    public void test06931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06931");
        model.Faculty faculty3 = new model.Faculty("hi!", "hi!", "");
        faculty3.viewProfile();
        java.lang.String str5 = faculty3.getAccountType();
        java.lang.String str6 = faculty3.getEmail();
        java.lang.String str7 = faculty3.getAccountType();
        java.lang.String str8 = faculty3.getPassword();
        faculty3.logout();
        faculty3.login("faculty", "faculty");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "faculty" + "'", str7, "faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test06932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06932");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        faculty3.setVerified(false);
        java.lang.String str10 = faculty3.getID();
        faculty3.viewProfile();
        faculty3.login("", "");
        java.lang.String str15 = faculty3.getPassword();
        double double16 = faculty3.getHourlyRate();
        java.lang.String str17 = faculty3.getID();
        java.lang.String str18 = faculty3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 30.0d + "'", double16 == 30.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test06933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06933");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        java.lang.String str4 = faculty3.getAccountType();
        java.lang.String str5 = faculty3.getID();
        faculty3.setVerified(true);
        boolean boolean8 = faculty3.isVerified();
        faculty3.logout();
        faculty3.viewProfile();
        java.lang.String str11 = faculty3.getEmail();
        boolean boolean12 = faculty3.isVerified();
        java.lang.String str13 = faculty3.getID();
        boolean boolean14 = faculty3.isVerified();
        faculty3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "faculty" + "'", str4, "faculty");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test06934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06934");
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
        boolean boolean13 = faculty3.isVerified();
        double double14 = faculty3.getHourlyRate();
        boolean boolean15 = faculty3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "faculty" + "'", str11, "faculty");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 30.0d + "'", double14 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test06935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06935");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getAccountType();
        faculty3.logout();
        java.lang.String str8 = faculty3.getEmail();
        faculty3.viewProfile();
        java.lang.String str10 = faculty3.getID();
        java.lang.String str11 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "faculty" + "'", str11, "faculty");
    }

    @Test
    public void test06936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06936");
        model.Faculty faculty3 = new model.Faculty("", "faculty", "");
        faculty3.setVerified(true);
        faculty3.login("", "hi!");
        faculty3.viewProfile();
        java.lang.String str10 = faculty3.getID();
        faculty3.viewProfile();
        double double12 = faculty3.getHourlyRate();
        boolean boolean13 = faculty3.isVerified();
        double double14 = faculty3.getHourlyRate();
        java.lang.String str15 = faculty3.getPassword();
        double double16 = faculty3.getHourlyRate();
        java.lang.String str17 = faculty3.getID();
        java.lang.String str18 = faculty3.getPassword();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 30.0d + "'", double12 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 30.0d + "'", double14 == 30.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "faculty" + "'", str15, "faculty");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 30.0d + "'", double16 == 30.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "faculty" + "'", str18, "faculty");
    }

    @Test
    public void test06937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06937");
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
        faculty3.viewProfile();
        faculty3.logout();
        java.lang.String str17 = faculty3.getEmail();
        java.lang.String str18 = faculty3.getPassword();
        java.lang.Class<?> wildcardClass19 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test06938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06938");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        java.lang.String str7 = faculty3.getID();
        faculty3.login("hi!", "");
        double double11 = faculty3.getHourlyRate();
        faculty3.viewProfile();
        faculty3.viewProfile();
        java.lang.String str14 = faculty3.getID();
        faculty3.login("faculty", "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 30.0d + "'", double11 == 30.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test06939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06939");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        java.lang.String str4 = faculty3.getAccountType();
        java.lang.String str5 = faculty3.getID();
        faculty3.setVerified(true);
        boolean boolean8 = faculty3.isVerified();
        faculty3.viewProfile();
        java.lang.String str10 = faculty3.getAccountType();
        boolean boolean11 = faculty3.isVerified();
        java.lang.String str12 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "faculty" + "'", str4, "faculty");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "faculty" + "'", str10, "faculty");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "faculty" + "'", str12, "faculty");
    }

    @Test
    public void test06940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06940");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        double double6 = faculty3.getHourlyRate();
        java.lang.String str7 = faculty3.getID();
        boolean boolean8 = faculty3.isVerified();
        faculty3.setVerified(true);
        faculty3.setVerified(true);
        java.lang.String str13 = faculty3.getEmail();
        faculty3.setVerified(true);
        faculty3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test06941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06941");
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
        faculty3.logout();
        boolean boolean19 = faculty3.isVerified();
        faculty3.setVerified(true);
        java.lang.String str22 = faculty3.getPassword();
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
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test06942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06942");
        model.Faculty faculty3 = new model.Faculty("hi!", "hi!", "");
        faculty3.viewProfile();
        java.lang.String str5 = faculty3.getAccountType();
        double double6 = faculty3.getHourlyRate();
        boolean boolean7 = faculty3.isVerified();
        java.lang.String str8 = faculty3.getID();
        faculty3.login("faculty", "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test06943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06943");
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
        java.lang.String str15 = faculty3.getEmail();
        double double16 = faculty3.getHourlyRate();
        faculty3.login("faculty", "hi!");
        java.lang.String str20 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 30.0d + "'", double16 == 30.0d);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "faculty" + "'", str20, "faculty");
    }

    @Test
    public void test06944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06944");
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
        double double16 = faculty3.getHourlyRate();
        faculty3.setVerified(true);
        java.lang.String str19 = faculty3.getID();
        faculty3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 30.0d + "'", double11 == 30.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 30.0d + "'", double16 == 30.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test06945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06945");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        java.lang.String str8 = faculty3.getEmail();
        faculty3.viewProfile();
        faculty3.logout();
        java.lang.String str11 = faculty3.getAccountType();
        faculty3.logout();
        java.lang.String str13 = faculty3.getPassword();
        faculty3.setVerified(false);
        double double16 = faculty3.getHourlyRate();
        faculty3.login("", "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "faculty" + "'", str11, "faculty");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 30.0d + "'", double16 == 30.0d);
    }

    @Test
    public void test06946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06946");
        model.Faculty faculty3 = new model.Faculty("", "", "");
        faculty3.viewProfile();
        double double5 = faculty3.getHourlyRate();
        boolean boolean6 = faculty3.isVerified();
        double double7 = faculty3.getHourlyRate();
        faculty3.viewProfile();
        java.lang.String str9 = faculty3.getPassword();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 30.0d + "'", double5 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test06947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06947");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        faculty3.setVerified(false);
        faculty3.viewProfile();
        java.lang.String str7 = faculty3.getEmail();
        java.lang.String str8 = faculty3.getAccountType();
        java.lang.String str9 = faculty3.getID();
        faculty3.setVerified(false);
        java.lang.String str12 = faculty3.getAccountType();
        faculty3.login("hi!", "faculty");
        faculty3.login("hi!", "faculty");
        faculty3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "faculty" + "'", str8, "faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "faculty" + "'", str12, "faculty");
    }

    @Test
    public void test06948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06948");
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
        java.lang.Class<?> wildcardClass13 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "faculty" + "'", str10, "faculty");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test06949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06949");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        faculty3.logout();
        java.lang.String str5 = faculty3.getID();
        java.lang.String str6 = faculty3.getPassword();
        double double7 = faculty3.getHourlyRate();
        faculty3.login("faculty", "hi!");
        faculty3.setVerified(false);
        java.lang.String str13 = faculty3.getEmail();
        java.lang.String str14 = faculty3.getEmail();
        java.lang.String str15 = faculty3.getEmail();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test06950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06950");
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
        faculty3.logout();
        faculty3.logout();
        faculty3.login("faculty", "");
        java.lang.String str18 = faculty3.getAccountType();
        java.lang.String str19 = faculty3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "faculty" + "'", str11, "faculty");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "faculty" + "'", str18, "faculty");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test06951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06951");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        java.lang.String str4 = faculty3.getAccountType();
        java.lang.String str5 = faculty3.getID();
        java.lang.String str6 = faculty3.getAccountType();
        java.lang.String str7 = faculty3.getPassword();
        boolean boolean8 = faculty3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "faculty" + "'", str4, "faculty");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test06952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06952");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        java.lang.String str4 = faculty3.getAccountType();
        java.lang.String str5 = faculty3.getID();
        boolean boolean6 = faculty3.isVerified();
        faculty3.viewProfile();
        faculty3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "faculty" + "'", str4, "faculty");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test06953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06953");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        faculty3.setVerified(false);
        faculty3.viewProfile();
        java.lang.String str7 = faculty3.getEmail();
        double double8 = faculty3.getHourlyRate();
        faculty3.viewProfile();
        java.lang.String str10 = faculty3.getAccountType();
        faculty3.login("hi!", "faculty");
        double double14 = faculty3.getHourlyRate();
        double double15 = faculty3.getHourlyRate();
        faculty3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "faculty" + "'", str10, "faculty");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 30.0d + "'", double14 == 30.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 30.0d + "'", double15 == 30.0d);
    }

    @Test
    public void test06954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06954");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        java.lang.String str7 = faculty3.getID();
        faculty3.setVerified(true);
        faculty3.setVerified(false);
        java.lang.String str12 = faculty3.getEmail();
        double double13 = faculty3.getHourlyRate();
        faculty3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 30.0d + "'", double13 == 30.0d);
    }

    @Test
    public void test06955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06955");
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
        faculty3.viewProfile();
        faculty3.viewProfile();
        java.lang.Class<?> wildcardClass17 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test06956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06956");
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
        java.lang.String str16 = faculty3.getPassword();
        faculty3.logout();
        faculty3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test06957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06957");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        faculty3.setVerified(false);
        java.lang.String str6 = faculty3.getPassword();
        java.lang.String str7 = faculty3.getAccountType();
        java.lang.String str8 = faculty3.getEmail();
        faculty3.setVerified(true);
        boolean boolean11 = faculty3.isVerified();
        java.lang.String str12 = faculty3.getPassword();
        boolean boolean13 = faculty3.isVerified();
        java.lang.String str14 = faculty3.getEmail();
        double double15 = faculty3.getHourlyRate();
        java.lang.String str16 = faculty3.getEmail();
        faculty3.viewProfile();
        faculty3.viewProfile();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "faculty" + "'", str7, "faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 30.0d + "'", double15 == 30.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test06958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06958");
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
        java.lang.String str18 = faculty3.getID();
        java.lang.String str19 = faculty3.getEmail();
        faculty3.logout();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "faculty" + "'", str8, "faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "faculty" + "'", str10, "faculty");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 30.0d + "'", double15 == 30.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 30.0d + "'", double16 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test06959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06959");
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
        java.lang.String str17 = faculty3.getEmail();
        faculty3.login("faculty", "faculty");
        boolean boolean21 = faculty3.isVerified();
        boolean boolean22 = faculty3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "faculty" + "'", str11, "faculty");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test06960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06960");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        java.lang.String str7 = faculty3.getID();
        faculty3.setVerified(true);
        java.lang.String str10 = faculty3.getAccountType();
        java.lang.String str11 = faculty3.getPassword();
        faculty3.viewProfile();
        boolean boolean13 = faculty3.isVerified();
        boolean boolean14 = faculty3.isVerified();
        java.lang.String str15 = faculty3.getAccountType();
        faculty3.login("hi!", "hi!");
        faculty3.logout();
        faculty3.login("faculty", "");
        java.lang.String str23 = faculty3.getID();
        java.lang.Class<?> wildcardClass24 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "faculty" + "'", str10, "faculty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "faculty" + "'", str15, "faculty");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test06961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06961");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        java.lang.String str4 = faculty3.getAccountType();
        java.lang.String str5 = faculty3.getID();
        faculty3.viewProfile();
        double double7 = faculty3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "faculty" + "'", str4, "faculty");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
    }

    @Test
    public void test06962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06962");
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
        java.lang.String str14 = faculty3.getAccountType();
        java.lang.String str15 = faculty3.getID();
        java.lang.String str16 = faculty3.getPassword();
        java.lang.String str17 = faculty3.getPassword();
        java.lang.String str18 = faculty3.getAccountType();
        java.lang.String str19 = faculty3.getID();
        faculty3.viewProfile();
        java.lang.String str21 = faculty3.getEmail();
        java.lang.String str22 = faculty3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "faculty" + "'", str13, "faculty");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "faculty" + "'", str14, "faculty");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "faculty" + "'", str18, "faculty");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test06963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06963");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        java.lang.String str8 = faculty3.getPassword();
        java.lang.String str9 = faculty3.getID();
        double double10 = faculty3.getHourlyRate();
        faculty3.login("faculty", "");
        java.lang.String str14 = faculty3.getAccountType();
        boolean boolean15 = faculty3.isVerified();
        double double16 = faculty3.getHourlyRate();
        faculty3.setVerified(true);
        boolean boolean19 = faculty3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 30.0d + "'", double10 == 30.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "faculty" + "'", str14, "faculty");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 30.0d + "'", double16 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test06964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06964");
        model.Faculty faculty3 = new model.Faculty("", "faculty", "");
        faculty3.setVerified(true);
        faculty3.login("", "hi!");
        faculty3.viewProfile();
        java.lang.String str10 = faculty3.getID();
        faculty3.viewProfile();
        double double12 = faculty3.getHourlyRate();
        boolean boolean13 = faculty3.isVerified();
        double double14 = faculty3.getHourlyRate();
        java.lang.String str15 = faculty3.getPassword();
        boolean boolean16 = faculty3.isVerified();
        faculty3.setVerified(false);
        java.lang.String str19 = faculty3.getID();
        faculty3.login("", "faculty");
        double double23 = faculty3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 30.0d + "'", double12 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 30.0d + "'", double14 == 30.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "faculty" + "'", str15, "faculty");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 30.0d + "'", double23 == 30.0d);
    }

    @Test
    public void test06965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06965");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        faculty3.logout();
        java.lang.String str5 = faculty3.getID();
        java.lang.String str6 = faculty3.getEmail();
        double double7 = faculty3.getHourlyRate();
        java.lang.String str8 = faculty3.getPassword();
        faculty3.login("hi!", "hi!");
        faculty3.logout();
        faculty3.login("faculty", "hi!");
        java.lang.String str16 = faculty3.getAccountType();
        java.lang.String str17 = faculty3.getPassword();
        faculty3.setVerified(false);
        faculty3.login("hi!", "faculty");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "faculty" + "'", str16, "faculty");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test06966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06966");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        faculty3.login("", "faculty");
        faculty3.setVerified(true);
        java.lang.Class<?> wildcardClass12 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test06967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06967");
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
        faculty3.login("", "faculty");
        java.lang.String str20 = faculty3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "faculty" + "'", str4, "faculty");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test06968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06968");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        faculty3.setVerified(false);
        java.lang.String str10 = faculty3.getID();
        double double11 = faculty3.getHourlyRate();
        java.lang.String str12 = faculty3.getEmail();
        java.lang.String str13 = faculty3.getID();
        java.lang.String str14 = faculty3.getAccountType();
        faculty3.logout();
        faculty3.viewProfile();
        java.lang.Class<?> wildcardClass17 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 30.0d + "'", double11 == 30.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "faculty" + "'", str14, "faculty");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test06969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06969");
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
        java.lang.String str15 = faculty3.getEmail();
        faculty3.setVerified(false);
        java.lang.String str18 = faculty3.getEmail();
        faculty3.viewProfile();
        java.lang.String str20 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "faculty" + "'", str8, "faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "faculty" + "'", str9, "faculty");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "faculty" + "'", str20, "faculty");
    }

    @Test
    public void test06970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06970");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        faculty3.setVerified(false);
        faculty3.viewProfile();
        java.lang.String str7 = faculty3.getEmail();
        faculty3.login("hi!", "hi!");
        java.lang.String str11 = faculty3.getEmail();
        faculty3.login("faculty", "hi!");
        java.lang.String str15 = faculty3.getPassword();
        faculty3.viewProfile();
        java.lang.String str17 = faculty3.getID();
        java.lang.Class<?> wildcardClass18 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test06971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06971");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        faculty3.login("", "");
        faculty3.viewProfile();
        faculty3.viewProfile();
        faculty3.logout();
        java.lang.Class<?> wildcardClass10 = faculty3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test06972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06972");
        model.Faculty faculty3 = new model.Faculty("hi!", "hi!", "");
        java.lang.String str4 = faculty3.getEmail();
        faculty3.login("", "faculty");
        java.lang.String str8 = faculty3.getPassword();
        java.lang.String str9 = faculty3.getEmail();
        faculty3.setVerified(true);
        boolean boolean12 = faculty3.isVerified();
        java.lang.String str13 = faculty3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test06973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06973");
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
        boolean boolean14 = faculty3.isVerified();
        faculty3.viewProfile();
        faculty3.logout();
        java.lang.String str17 = faculty3.getID();
        faculty3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "faculty" + "'", str11, "faculty");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 30.0d + "'", double13 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test06974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06974");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        faculty3.logout();
        java.lang.String str5 = faculty3.getID();
        java.lang.String str6 = faculty3.getEmail();
        faculty3.viewProfile();
        faculty3.setVerified(false);
        faculty3.logout();
        faculty3.setVerified(false);
        faculty3.setVerified(false);
        java.lang.String str15 = faculty3.getEmail();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test06975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06975");
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
        faculty3.viewProfile();
        java.lang.String str19 = faculty3.getPassword();
        java.lang.String str20 = faculty3.getAccountType();
        faculty3.viewProfile();
        boolean boolean22 = faculty3.isVerified();
        faculty3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "faculty" + "'", str10, "faculty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "faculty" + "'", str20, "faculty");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test06976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06976");
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
        java.lang.String str14 = faculty3.getAccountType();
        faculty3.viewProfile();
        faculty3.logout();
        java.lang.String str17 = faculty3.getEmail();
        java.lang.String str18 = faculty3.getID();
        boolean boolean19 = faculty3.isVerified();
        java.lang.Class<?> wildcardClass20 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "faculty" + "'", str14, "faculty");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test06977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06977");
        model.Faculty faculty3 = new model.Faculty("hi!", "faculty", "");
        faculty3.setVerified(false);
        faculty3.logout();
        faculty3.login("hi!", "faculty");
    }

    @Test
    public void test06978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06978");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        double double6 = faculty3.getHourlyRate();
        java.lang.String str7 = faculty3.getPassword();
        java.lang.String str8 = faculty3.getPassword();
        java.lang.String str9 = faculty3.getAccountType();
        faculty3.login("faculty", "");
        boolean boolean13 = faculty3.isVerified();
        boolean boolean14 = faculty3.isVerified();
        double double15 = faculty3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "faculty" + "'", str9, "faculty");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 30.0d + "'", double15 == 30.0d);
    }

    @Test
    public void test06979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06979");
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
        boolean boolean23 = faculty3.isVerified();
        java.lang.Class<?> wildcardClass24 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test06980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06980");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        java.lang.String str7 = faculty3.getID();
        java.lang.String str8 = faculty3.getID();
        java.lang.String str9 = faculty3.getID();
        faculty3.setVerified(true);
        faculty3.setVerified(false);
        faculty3.login("", "hi!");
        java.lang.String str17 = faculty3.getPassword();
        faculty3.login("faculty", "hi!");
        double double21 = faculty3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 30.0d + "'", double21 == 30.0d);
    }

    @Test
    public void test06981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06981");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        boolean boolean7 = faculty3.isVerified();
        faculty3.logout();
        java.lang.String str9 = faculty3.getID();
        faculty3.login("hi!", "");
        java.lang.String str13 = faculty3.getPassword();
        java.lang.String str14 = faculty3.getID();
        java.lang.String str15 = faculty3.getPassword();
        java.lang.Class<?> wildcardClass16 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test06982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06982");
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
        boolean boolean18 = faculty3.isVerified();
        java.lang.String str19 = faculty3.getPassword();
        java.lang.Class<?> wildcardClass20 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 30.0d + "'", double13 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test06983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06983");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        java.lang.String str4 = faculty3.getPassword();
        double double5 = faculty3.getHourlyRate();
        double double6 = faculty3.getHourlyRate();
        faculty3.logout();
        java.lang.String str8 = faculty3.getAccountType();
        double double9 = faculty3.getHourlyRate();
        faculty3.login("faculty", "faculty");
        faculty3.login("faculty", "faculty");
        java.lang.String str16 = faculty3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 30.0d + "'", double5 == 30.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "faculty" + "'", str8, "faculty");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 30.0d + "'", double9 == 30.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test06984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06984");
        model.Faculty faculty3 = new model.Faculty("hi!", "faculty", "");
        java.lang.String str4 = faculty3.getEmail();
        faculty3.viewProfile();
        faculty3.logout();
        faculty3.viewProfile();
        java.lang.String str8 = faculty3.getPassword();
        java.lang.String str9 = faculty3.getEmail();
        java.lang.String str10 = faculty3.getPassword();
        java.lang.String str11 = faculty3.getAccountType();
        double double12 = faculty3.getHourlyRate();
        faculty3.viewProfile();
        faculty3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "faculty" + "'", str8, "faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "faculty" + "'", str10, "faculty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "faculty" + "'", str11, "faculty");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 30.0d + "'", double12 == 30.0d);
    }

    @Test
    public void test06985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06985");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        faculty3.setVerified(false);
        java.lang.String str6 = faculty3.getPassword();
        java.lang.String str7 = faculty3.getAccountType();
        faculty3.viewProfile();
        faculty3.logout();
        faculty3.login("", "faculty");
        java.lang.Class<?> wildcardClass13 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "faculty" + "'", str7, "faculty");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test06986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06986");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        faculty3.login("", "");
        faculty3.viewProfile();
        faculty3.viewProfile();
        java.lang.String str9 = faculty3.getAccountType();
        faculty3.login("faculty", "");
        faculty3.login("hi!", "");
        faculty3.logout();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "faculty" + "'", str9, "faculty");
    }

    @Test
    public void test06987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06987");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        java.lang.String str4 = faculty3.getAccountType();
        java.lang.String str5 = faculty3.getEmail();
        faculty3.viewProfile();
        faculty3.setVerified(true);
        java.lang.String str9 = faculty3.getPassword();
        faculty3.setVerified(false);
        java.lang.String str12 = faculty3.getAccountType();
        java.lang.String str13 = faculty3.getID();
        faculty3.setVerified(false);
        java.lang.String str16 = faculty3.getPassword();
        java.lang.String str17 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "faculty" + "'", str4, "faculty");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "faculty" + "'", str12, "faculty");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "faculty" + "'", str17, "faculty");
    }

    @Test
    public void test06988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06988");
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
        java.lang.String str19 = faculty3.getEmail();
        faculty3.logout();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "faculty" + "'", str8, "faculty");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 30.0d + "'", double14 == 30.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "faculty" + "'", str15, "faculty");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 30.0d + "'", double17 == 30.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "faculty" + "'", str18, "faculty");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test06989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06989");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        java.lang.String str4 = faculty3.getAccountType();
        faculty3.setVerified(true);
        double double7 = faculty3.getHourlyRate();
        boolean boolean8 = faculty3.isVerified();
        boolean boolean9 = faculty3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "faculty" + "'", str4, "faculty");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test06990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06990");
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
        faculty3.logout();
        faculty3.setVerified(false);
        double double16 = faculty3.getHourlyRate();
        faculty3.login("hi!", "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 30.0d + "'", double10 == 30.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 30.0d + "'", double16 == 30.0d);
    }

    @Test
    public void test06991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06991");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        faculty3.logout();
        java.lang.String str5 = faculty3.getID();
        java.lang.String str6 = faculty3.getPassword();
        double double7 = faculty3.getHourlyRate();
        faculty3.login("faculty", "hi!");
        java.lang.String str11 = faculty3.getID();
        java.lang.String str12 = faculty3.getPassword();
        double double13 = faculty3.getHourlyRate();
        faculty3.logout();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 30.0d + "'", double13 == 30.0d);
    }

    @Test
    public void test06992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06992");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        faculty3.setVerified(false);
        java.lang.String str6 = faculty3.getEmail();
        java.lang.String str7 = faculty3.getAccountType();
        faculty3.viewProfile();
        faculty3.viewProfile();
        faculty3.setVerified(true);
        faculty3.login("", "");
        java.lang.String str15 = faculty3.getID();
        java.lang.String str16 = faculty3.getAccountType();
        faculty3.login("hi!", "");
        double double20 = faculty3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "faculty" + "'", str7, "faculty");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "faculty" + "'", str16, "faculty");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 30.0d + "'", double20 == 30.0d);
    }

    @Test
    public void test06993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06993");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        faculty3.setVerified(false);
        java.lang.String str10 = faculty3.getID();
        double double11 = faculty3.getHourlyRate();
        java.lang.String str12 = faculty3.getEmail();
        java.lang.String str13 = faculty3.getID();
        faculty3.logout();
        java.lang.String str15 = faculty3.getAccountType();
        faculty3.login("hi!", "");
        java.lang.String str19 = faculty3.getEmail();
        java.lang.String str20 = faculty3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 30.0d + "'", double11 == 30.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "faculty" + "'", str15, "faculty");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test06994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06994");
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
        java.lang.String str22 = faculty3.getID();
        faculty3.viewProfile();
        java.lang.String str24 = faculty3.getID();
        faculty3.login("", "faculty");
        faculty3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 30.0d + "'", double11 == 30.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 30.0d + "'", double21 == 30.0d);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
    }

    @Test
    public void test06995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06995");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        java.lang.String str4 = faculty3.getAccountType();
        java.lang.String str5 = faculty3.getEmail();
        faculty3.viewProfile();
        faculty3.login("", "faculty");
        faculty3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "faculty" + "'", str4, "faculty");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test06996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06996");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        faculty3.logout();
        java.lang.String str5 = faculty3.getID();
        java.lang.String str6 = faculty3.getEmail();
        java.lang.String str7 = faculty3.getPassword();
        java.lang.String str8 = faculty3.getID();
        faculty3.logout();
        faculty3.logout();
        java.lang.String str11 = faculty3.getAccountType();
        java.lang.String str12 = faculty3.getEmail();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "faculty" + "'", str11, "faculty");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test06997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06997");
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
        java.lang.String str17 = faculty3.getAccountType();
        boolean boolean18 = faculty3.isVerified();
        boolean boolean19 = faculty3.isVerified();
        faculty3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 30.0d + "'", double14 == 30.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "faculty" + "'", str17, "faculty");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test06998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06998");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        java.lang.String str7 = faculty3.getID();
        java.lang.String str8 = faculty3.getID();
        java.lang.String str9 = faculty3.getID();
        faculty3.viewProfile();
        java.lang.String str11 = faculty3.getAccountType();
        faculty3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "faculty" + "'", str11, "faculty");
    }

    @Test
    public void test06999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06999");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        faculty3.logout();
        faculty3.login("hi!", "hi!");
        faculty3.viewProfile();
        faculty3.login("", "faculty");
        faculty3.login("", "faculty");
        faculty3.viewProfile();
        faculty3.login("", "faculty");
    }

    @Test
    public void test07000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test07000");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        java.lang.String str7 = faculty3.getID();
        boolean boolean8 = faculty3.isVerified();
        faculty3.login("hi!", "");
        java.lang.Class<?> wildcardClass12 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }
}

