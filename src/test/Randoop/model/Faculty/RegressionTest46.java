import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest46 {

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
    public void test23001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23001");
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
        java.lang.String str15 = faculty3.getPassword();
        java.lang.String str16 = faculty3.getPassword();
        java.lang.String str17 = faculty3.getPassword();
        boolean boolean18 = faculty3.isVerified();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "faculty" + "'", str10, "faculty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "faculty" + "'", str11, "faculty");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 30.0d + "'", double12 == 30.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 30.0d + "'", double13 == 30.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test23002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23002");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.viewProfile();
        java.lang.String str8 = faculty3.getAccountType();
        faculty3.logout();
        faculty3.logout();
        java.lang.String str11 = faculty3.getAccountType();
        faculty3.viewProfile();
        faculty3.logout();
        java.lang.String str14 = faculty3.getEmail();
        java.lang.String str15 = faculty3.getEmail();
        faculty3.logout();
        faculty3.logout();
        faculty3.logout();
        faculty3.logout();
        faculty3.viewProfile();
        java.lang.String str21 = faculty3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "faculty" + "'", str8, "faculty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "faculty" + "'", str11, "faculty");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test23003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23003");
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
        boolean boolean15 = faculty3.isVerified();
        faculty3.login("", "hi!");
        faculty3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test23004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23004");
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
        java.lang.String str17 = faculty3.getID();
        java.lang.Class<?> wildcardClass18 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "faculty" + "'", str14, "faculty");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test23005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23005");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        faculty3.setVerified(false);
        java.lang.String str6 = faculty3.getEmail();
        java.lang.String str7 = faculty3.getAccountType();
        faculty3.viewProfile();
        java.lang.String str9 = faculty3.getAccountType();
        java.lang.String str10 = faculty3.getPassword();
        double double11 = faculty3.getHourlyRate();
        java.lang.String str12 = faculty3.getAccountType();
        faculty3.login("hi!", "faculty");
        java.lang.String str16 = faculty3.getID();
        faculty3.login("", "faculty");
        double double20 = faculty3.getHourlyRate();
        java.lang.String str21 = faculty3.getAccountType();
        boolean boolean22 = faculty3.isVerified();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "faculty" + "'", str7, "faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "faculty" + "'", str9, "faculty");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 30.0d + "'", double11 == 30.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "faculty" + "'", str12, "faculty");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 30.0d + "'", double20 == 30.0d);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "faculty" + "'", str21, "faculty");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test23006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23006");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        faculty3.setVerified(false);
        java.lang.String str6 = faculty3.getPassword();
        java.lang.String str7 = faculty3.getAccountType();
        java.lang.String str8 = faculty3.getEmail();
        faculty3.setVerified(true);
        java.lang.String str11 = faculty3.getPassword();
        java.lang.String str12 = faculty3.getEmail();
        boolean boolean13 = faculty3.isVerified();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "faculty" + "'", str7, "faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test23007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23007");
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
        boolean boolean18 = faculty3.isVerified();
        boolean boolean19 = faculty3.isVerified();
        java.lang.String str20 = faculty3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test23008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23008");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        java.lang.String str8 = faculty3.getPassword();
        faculty3.logout();
        java.lang.String str10 = faculty3.getID();
        double double11 = faculty3.getHourlyRate();
        faculty3.setVerified(false);
        double double14 = faculty3.getHourlyRate();
        faculty3.viewProfile();
        java.lang.String str16 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 30.0d + "'", double11 == 30.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 30.0d + "'", double14 == 30.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "faculty" + "'", str16, "faculty");
    }

    @Test
    public void test23009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23009");
        model.Faculty faculty3 = new model.Faculty("", "hi!", "hi!");
        double double4 = faculty3.getHourlyRate();
        faculty3.login("", "hi!");
        double double8 = faculty3.getHourlyRate();
        java.lang.String str9 = faculty3.getEmail();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 30.0d + "'", double4 == 30.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test23010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23010");
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
        faculty3.setVerified(false);
        faculty3.logout();
        java.lang.String str25 = faculty3.getPassword();
        faculty3.viewProfile();
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
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test23011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23011");
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
        double double13 = faculty3.getHourlyRate();
        faculty3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 30.0d + "'", double13 == 30.0d);
    }

    @Test
    public void test23012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23012");
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
        faculty3.setVerified(false);
        java.lang.String str23 = faculty3.getID();
        java.lang.String str24 = faculty3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test23013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23013");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        faculty3.setVerified(false);
        faculty3.viewProfile();
        double double7 = faculty3.getHourlyRate();
        java.lang.String str8 = faculty3.getID();
        java.lang.String str9 = faculty3.getPassword();
        faculty3.logout();
        java.lang.String str11 = faculty3.getPassword();
        java.lang.String str12 = faculty3.getPassword();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test23014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23014");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        java.lang.String str4 = faculty3.getAccountType();
        java.lang.String str5 = faculty3.getID();
        faculty3.login("", "faculty");
        java.lang.String str9 = faculty3.getAccountType();
        java.lang.String str10 = faculty3.getAccountType();
        faculty3.login("faculty", "faculty");
        java.lang.String str14 = faculty3.getEmail();
        faculty3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "faculty" + "'", str4, "faculty");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "faculty" + "'", str9, "faculty");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "faculty" + "'", str10, "faculty");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test23015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23015");
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
        faculty3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "faculty" + "'", str8, "faculty");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test23016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23016");
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
        java.lang.String str19 = faculty3.getEmail();
        double double20 = faculty3.getHourlyRate();
        java.lang.String str21 = faculty3.getID();
        faculty3.logout();
        boolean boolean23 = faculty3.isVerified();
        java.lang.String str24 = faculty3.getID();
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 30.0d + "'", double20 == 30.0d);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
    }

    @Test
    public void test23017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23017");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        java.lang.String str6 = faculty3.getPassword();
        java.lang.String str7 = faculty3.getPassword();
        java.lang.String str8 = faculty3.getID();
        double double9 = faculty3.getHourlyRate();
        java.lang.String str10 = faculty3.getPassword();
        double double11 = faculty3.getHourlyRate();
        java.lang.String str12 = faculty3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 30.0d + "'", double9 == 30.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 30.0d + "'", double11 == 30.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test23018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23018");
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
        faculty3.logout();
        java.lang.String str17 = faculty3.getID();
        faculty3.viewProfile();
        boolean boolean19 = faculty3.isVerified();
        java.lang.String str20 = faculty3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "faculty" + "'", str13, "faculty");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "faculty" + "'", str14, "faculty");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test23019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23019");
        model.Faculty faculty3 = new model.Faculty("", "", "faculty");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getPassword();
        boolean boolean6 = faculty3.isVerified();
        java.lang.String str7 = faculty3.getEmail();
        faculty3.setVerified(false);
        java.lang.String str10 = faculty3.getAccountType();
        java.lang.Class<?> wildcardClass11 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "faculty" + "'", str4, "faculty");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "faculty" + "'", str10, "faculty");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test23020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23020");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        java.lang.String str7 = faculty3.getID();
        faculty3.setVerified(true);
        faculty3.setVerified(false);
        java.lang.String str12 = faculty3.getEmail();
        java.lang.String str13 = faculty3.getPassword();
        java.lang.String str14 = faculty3.getEmail();
        java.lang.String str15 = faculty3.getPassword();
        faculty3.login("", "hi!");
        faculty3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test23021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23021");
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
        java.lang.String str23 = faculty3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "faculty" + "'", str8, "faculty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "faculty" + "'", str11, "faculty");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 30.0d + "'", double14 == 30.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 30.0d + "'", double18 == 30.0d);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
    }

    @Test
    public void test23022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23022");
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
        faculty3.setVerified(false);
        faculty3.setVerified(true);
        java.lang.String str21 = faculty3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 30.0d + "'", double15 == 30.0d);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test23023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23023");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        faculty3.setVerified(false);
        java.lang.String str6 = faculty3.getEmail();
        faculty3.setVerified(false);
        faculty3.login("faculty", "hi!");
        java.lang.String str12 = faculty3.getAccountType();
        double double13 = faculty3.getHourlyRate();
        double double14 = faculty3.getHourlyRate();
        faculty3.login("", "");
        faculty3.setVerified(true);
        double double20 = faculty3.getHourlyRate();
        java.lang.String str21 = faculty3.getAccountType();
        java.lang.String str22 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "faculty" + "'", str12, "faculty");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 30.0d + "'", double13 == 30.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 30.0d + "'", double14 == 30.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 30.0d + "'", double20 == 30.0d);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "faculty" + "'", str21, "faculty");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "faculty" + "'", str22, "faculty");
    }

    @Test
    public void test23024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23024");
        model.Faculty faculty3 = new model.Faculty("", "hi!", "hi!");
        faculty3.login("faculty", "faculty");
        java.lang.String str7 = faculty3.getID();
        java.lang.String str8 = faculty3.getPassword();
        faculty3.setVerified(false);
        java.lang.String str11 = faculty3.getAccountType();
        java.lang.String str12 = faculty3.getPassword();
        java.lang.String str13 = faculty3.getEmail();
        faculty3.login("", "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "faculty" + "'", str11, "faculty");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test23025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23025");
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
        boolean boolean14 = faculty3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test23026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23026");
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
        double double16 = faculty3.getHourlyRate();
        double double17 = faculty3.getHourlyRate();
        faculty3.login("", "hi!");
        faculty3.logout();
        double double22 = faculty3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "faculty" + "'", str8, "faculty");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 30.0d + "'", double14 == 30.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "faculty" + "'", str15, "faculty");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 30.0d + "'", double16 == 30.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 30.0d + "'", double17 == 30.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 30.0d + "'", double22 == 30.0d);
    }

    @Test
    public void test23027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23027");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        faculty3.setVerified(false);
        java.lang.String str10 = faculty3.getID();
        double double11 = faculty3.getHourlyRate();
        java.lang.String str12 = faculty3.getPassword();
        faculty3.logout();
        double double14 = faculty3.getHourlyRate();
        faculty3.login("hi!", "faculty");
        faculty3.login("hi!", "");
        faculty3.viewProfile();
        faculty3.setVerified(false);
        faculty3.logout();
        java.lang.String str25 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 30.0d + "'", double11 == 30.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 30.0d + "'", double14 == 30.0d);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "faculty" + "'", str25, "faculty");
    }

    @Test
    public void test23028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23028");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        faculty3.setVerified(false);
        java.lang.String str6 = faculty3.getPassword();
        java.lang.String str7 = faculty3.getAccountType();
        java.lang.String str8 = faculty3.getEmail();
        faculty3.setVerified(true);
        boolean boolean11 = faculty3.isVerified();
        faculty3.login("hi!", "faculty");
        boolean boolean15 = faculty3.isVerified();
        boolean boolean16 = faculty3.isVerified();
        java.lang.String str17 = faculty3.getID();
        java.lang.String str18 = faculty3.getID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "faculty" + "'", str7, "faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test23029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23029");
        model.Faculty faculty3 = new model.Faculty("hi!", "faculty", "");
        java.lang.String str4 = faculty3.getEmail();
        faculty3.login("hi!", "");
        faculty3.setVerified(true);
        java.lang.String str10 = faculty3.getEmail();
        faculty3.setVerified(true);
        java.lang.String str13 = faculty3.getAccountType();
        faculty3.setVerified(true);
        faculty3.logout();
        faculty3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "faculty" + "'", str13, "faculty");
    }

    @Test
    public void test23030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23030");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        faculty3.logout();
        faculty3.login("hi!", "hi!");
        faculty3.viewProfile();
        faculty3.login("", "faculty");
        faculty3.login("", "faculty");
        faculty3.viewProfile();
        java.lang.String str16 = faculty3.getID();
        faculty3.setVerified(true);
        faculty3.viewProfile();
        java.lang.String str20 = faculty3.getPassword();
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test23031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23031");
        model.Faculty faculty3 = new model.Faculty("", "", "faculty");
        java.lang.String str4 = faculty3.getAccountType();
        java.lang.String str5 = faculty3.getID();
        java.lang.String str6 = faculty3.getAccountType();
        java.lang.String str7 = faculty3.getEmail();
        java.lang.String str8 = faculty3.getPassword();
        java.lang.String str9 = faculty3.getID();
        java.lang.String str10 = faculty3.getID();
        faculty3.login("hi!", "faculty");
        java.lang.String str14 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "faculty" + "'", str4, "faculty");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "faculty" + "'", str9, "faculty");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "faculty" + "'", str10, "faculty");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "faculty" + "'", str14, "faculty");
    }

    @Test
    public void test23032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23032");
        model.Faculty faculty3 = new model.Faculty("hi!", "hi!", "");
        java.lang.String str4 = faculty3.getAccountType();
        java.lang.String str5 = faculty3.getID();
        boolean boolean6 = faculty3.isVerified();
        faculty3.setVerified(false);
        faculty3.setVerified(false);
        faculty3.viewProfile();
        faculty3.viewProfile();
        java.lang.String str13 = faculty3.getID();
        java.lang.String str14 = faculty3.getID();
        faculty3.setVerified(true);
        faculty3.login("faculty", "faculty");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "faculty" + "'", str4, "faculty");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test23033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23033");
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
        faculty3.login("", "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 30.0d + "'", double10 == 30.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test23034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23034");
        model.Faculty faculty3 = new model.Faculty("hi!", "hi!", "");
        faculty3.logout();
        java.lang.String str5 = faculty3.getEmail();
        java.lang.String str6 = faculty3.getAccountType();
        faculty3.logout();
        java.lang.String str8 = faculty3.getEmail();
        double double9 = faculty3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 30.0d + "'", double9 == 30.0d);
    }

    @Test
    public void test23035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23035");
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
        java.lang.String str16 = faculty3.getAccountType();
        faculty3.login("faculty", "hi!");
        faculty3.login("", "faculty");
        faculty3.viewProfile();
        faculty3.login("hi!", "hi!");
        java.lang.String str27 = faculty3.getPassword();
        boolean boolean28 = faculty3.isVerified();
        faculty3.logout();
        faculty3.viewProfile();
        faculty3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "faculty" + "'", str16, "faculty");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test23036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23036");
        model.Faculty faculty3 = new model.Faculty("hi!", "faculty", "faculty");
        double double4 = faculty3.getHourlyRate();
        double double5 = faculty3.getHourlyRate();
        java.lang.String str6 = faculty3.getEmail();
        boolean boolean7 = faculty3.isVerified();
        java.lang.String str8 = faculty3.getPassword();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 30.0d + "'", double4 == 30.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 30.0d + "'", double5 == 30.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "faculty" + "'", str8, "faculty");
    }

    @Test
    public void test23037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23037");
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
        faculty3.login("faculty", "");
        faculty3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "faculty" + "'", str10, "faculty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test23038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23038");
        model.Faculty faculty3 = new model.Faculty("hi!", "hi!", "faculty");
        faculty3.logout();
        java.lang.String str5 = faculty3.getEmail();
        faculty3.logout();
        faculty3.login("hi!", "hi!");
        boolean boolean10 = faculty3.isVerified();
        java.lang.String str11 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "faculty" + "'", str11, "faculty");
    }

    @Test
    public void test23039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23039");
        model.Faculty faculty3 = new model.Faculty("hi!", "faculty", "");
        faculty3.logout();
        java.lang.String str5 = faculty3.getPassword();
        java.lang.String str6 = faculty3.getEmail();
        faculty3.login("faculty", "faculty");
        faculty3.viewProfile();
        java.lang.String str11 = faculty3.getID();
        java.lang.String str12 = faculty3.getID();
        java.lang.String str13 = faculty3.getID();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test23040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23040");
        model.Faculty faculty3 = new model.Faculty("", "", "faculty");
        faculty3.login("faculty", "faculty");
        double double7 = faculty3.getHourlyRate();
        faculty3.setVerified(true);
        faculty3.logout();
        faculty3.setVerified(false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
    }

    @Test
    public void test23041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23041");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        double double6 = faculty3.getHourlyRate();
        java.lang.String str7 = faculty3.getPassword();
        java.lang.String str8 = faculty3.getPassword();
        faculty3.viewProfile();
        boolean boolean10 = faculty3.isVerified();
        java.lang.String str11 = faculty3.getPassword();
        faculty3.viewProfile();
        faculty3.setVerified(false);
        java.lang.String str15 = faculty3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test23042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23042");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        faculty3.viewProfile();
        double double5 = faculty3.getHourlyRate();
        double double6 = faculty3.getHourlyRate();
        java.lang.String str7 = faculty3.getAccountType();
        double double8 = faculty3.getHourlyRate();
        double double9 = faculty3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 30.0d + "'", double5 == 30.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "faculty" + "'", str7, "faculty");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 30.0d + "'", double9 == 30.0d);
    }

    @Test
    public void test23043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23043");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        java.lang.String str6 = faculty3.getPassword();
        faculty3.setVerified(false);
        faculty3.setVerified(false);
        java.lang.String str11 = faculty3.getAccountType();
        faculty3.logout();
        faculty3.login("", "hi!");
        boolean boolean16 = faculty3.isVerified();
        faculty3.login("faculty", "hi!");
        boolean boolean20 = faculty3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "faculty" + "'", str11, "faculty");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test23044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23044");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        faculty3.setVerified(false);
        java.lang.String str9 = faculty3.getID();
        faculty3.setVerified(false);
        boolean boolean12 = faculty3.isVerified();
        java.lang.String str13 = faculty3.getEmail();
        faculty3.logout();
        java.lang.String str15 = faculty3.getAccountType();
        boolean boolean16 = faculty3.isVerified();
        java.lang.String str17 = faculty3.getAccountType();
        faculty3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "faculty" + "'", str15, "faculty");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "faculty" + "'", str17, "faculty");
    }

    @Test
    public void test23045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23045");
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
        faculty3.login("hi!", "hi!");
        faculty3.logout();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "faculty" + "'", str8, "faculty");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test23046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23046");
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
        boolean boolean17 = faculty3.isVerified();
        java.lang.String str18 = faculty3.getAccountType();
        faculty3.setVerified(false);
        boolean boolean21 = faculty3.isVerified();
        java.lang.String str22 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "faculty" + "'", str13, "faculty");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "faculty" + "'", str14, "faculty");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "faculty" + "'", str16, "faculty");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "faculty" + "'", str18, "faculty");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "faculty" + "'", str22, "faculty");
    }

    @Test
    public void test23047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23047");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        java.lang.String str7 = faculty3.getID();
        java.lang.String str8 = faculty3.getEmail();
        faculty3.login("", "");
        java.lang.String str12 = faculty3.getAccountType();
        faculty3.logout();
        java.lang.String str14 = faculty3.getID();
        double double15 = faculty3.getHourlyRate();
        java.lang.String str16 = faculty3.getAccountType();
        java.lang.String str17 = faculty3.getPassword();
        java.lang.String str18 = faculty3.getPassword();
        faculty3.login("", "hi!");
        faculty3.login("faculty", "faculty");
        faculty3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "faculty" + "'", str12, "faculty");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 30.0d + "'", double15 == 30.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "faculty" + "'", str16, "faculty");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test23048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23048");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        faculty3.logout();
        java.lang.String str5 = faculty3.getID();
        faculty3.setVerified(true);
        faculty3.viewProfile();
        faculty3.logout();
        faculty3.viewProfile();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test23049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23049");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        faculty3.login("", "faculty");
        java.lang.String str10 = faculty3.getEmail();
        boolean boolean11 = faculty3.isVerified();
        java.lang.String str12 = faculty3.getAccountType();
        double double13 = faculty3.getHourlyRate();
        faculty3.viewProfile();
        java.lang.String str15 = faculty3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "faculty" + "'", str12, "faculty");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 30.0d + "'", double13 == 30.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test23050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23050");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        faculty3.setVerified(false);
        java.lang.String str6 = faculty3.getPassword();
        java.lang.String str7 = faculty3.getID();
        faculty3.login("", "hi!");
        faculty3.setVerified(false);
        boolean boolean13 = faculty3.isVerified();
        boolean boolean14 = faculty3.isVerified();
        java.lang.String str15 = faculty3.getID();
        double double16 = faculty3.getHourlyRate();
        java.lang.String str17 = faculty3.getID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 30.0d + "'", double16 == 30.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test23051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23051");
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
        java.lang.String str19 = faculty3.getPassword();
        java.lang.String str20 = faculty3.getEmail();
        faculty3.login("faculty", "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "faculty" + "'", str10, "faculty");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "faculty" + "'", str16, "faculty");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test23052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23052");
        model.Faculty faculty3 = new model.Faculty("", "faculty", "");
        java.lang.String str4 = faculty3.getPassword();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getAccountType();
        java.lang.String str7 = faculty3.getAccountType();
        faculty3.logout();
        faculty3.login("hi!", "faculty");
        java.lang.Class<?> wildcardClass12 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "faculty" + "'", str4, "faculty");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "faculty" + "'", str7, "faculty");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test23053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23053");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        java.lang.String str8 = faculty3.getEmail();
        java.lang.String str9 = faculty3.getPassword();
        boolean boolean10 = faculty3.isVerified();
        faculty3.login("hi!", "faculty");
        java.lang.String str14 = faculty3.getAccountType();
        faculty3.login("", "");
        java.lang.String str18 = faculty3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "faculty" + "'", str14, "faculty");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test23054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23054");
        model.Faculty faculty3 = new model.Faculty("faculty", "", "hi!");
        java.lang.String str4 = faculty3.getAccountType();
        faculty3.setVerified(false);
        faculty3.setVerified(true);
        java.lang.String str9 = faculty3.getEmail();
        double double10 = faculty3.getHourlyRate();
        double double11 = faculty3.getHourlyRate();
        java.lang.String str12 = faculty3.getID();
        faculty3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "faculty" + "'", str4, "faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "faculty" + "'", str9, "faculty");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 30.0d + "'", double10 == 30.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 30.0d + "'", double11 == 30.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test23055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23055");
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
        faculty3.logout();
        java.lang.String str18 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "faculty" + "'", str16, "faculty");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "faculty" + "'", str18, "faculty");
    }

    @Test
    public void test23056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23056");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        java.lang.String str8 = faculty3.getPassword();
        faculty3.setVerified(false);
        java.lang.String str11 = faculty3.getEmail();
        boolean boolean12 = faculty3.isVerified();
        faculty3.logout();
        faculty3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test23057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23057");
        model.Faculty faculty3 = new model.Faculty("hi!", "hi!", "");
        java.lang.String str4 = faculty3.getAccountType();
        java.lang.String str5 = faculty3.getID();
        faculty3.setVerified(true);
        java.lang.String str8 = faculty3.getID();
        faculty3.setVerified(false);
        java.lang.String str11 = faculty3.getAccountType();
        faculty3.viewProfile();
        faculty3.logout();
        java.lang.Class<?> wildcardClass14 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "faculty" + "'", str4, "faculty");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "faculty" + "'", str11, "faculty");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test23058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23058");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        java.lang.String str7 = faculty3.getID();
        faculty3.setVerified(true);
        java.lang.String str10 = faculty3.getEmail();
        faculty3.setVerified(false);
        faculty3.logout();
        double double14 = faculty3.getHourlyRate();
        boolean boolean15 = faculty3.isVerified();
        faculty3.setVerified(false);
        faculty3.viewProfile();
        double double19 = faculty3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 30.0d + "'", double14 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 30.0d + "'", double19 == 30.0d);
    }

    @Test
    public void test23059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23059");
        model.Faculty faculty3 = new model.Faculty("hi!", "hi!", "");
        faculty3.setVerified(true);
        faculty3.viewProfile();
        java.lang.String str7 = faculty3.getID();
        java.lang.String str8 = faculty3.getEmail();
        double double9 = faculty3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 30.0d + "'", double9 == 30.0d);
    }

    @Test
    public void test23060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23060");
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
        faculty3.setVerified(true);
        faculty3.setVerified(false);
        faculty3.setVerified(true);
        faculty3.logout();
        java.lang.String str25 = faculty3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "faculty" + "'", str8, "faculty");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "faculty" + "'", str12, "faculty");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test23061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23061");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        faculty3.logout();
        java.lang.String str5 = faculty3.getID();
        java.lang.String str6 = faculty3.getEmail();
        double double7 = faculty3.getHourlyRate();
        boolean boolean8 = faculty3.isVerified();
        java.lang.String str9 = faculty3.getEmail();
        faculty3.logout();
        faculty3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test23062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23062");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        faculty3.login("", "faculty");
        java.lang.String str10 = faculty3.getEmail();
        faculty3.login("", "hi!");
        java.lang.String str14 = faculty3.getPassword();
        java.lang.String str15 = faculty3.getID();
        faculty3.viewProfile();
        java.lang.String str17 = faculty3.getPassword();
        double double18 = faculty3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 30.0d + "'", double18 == 30.0d);
    }

    @Test
    public void test23063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23063");
        model.Faculty faculty3 = new model.Faculty("hi!", "hi!", "");
        faculty3.logout();
        java.lang.String str5 = faculty3.getEmail();
        double double6 = faculty3.getHourlyRate();
        faculty3.setVerified(false);
        java.lang.String str9 = faculty3.getPassword();
        java.lang.Class<?> wildcardClass10 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test23064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23064");
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
        java.lang.String str17 = faculty3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "faculty" + "'", str4, "faculty");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 30.0d + "'", double9 == 30.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 30.0d + "'", double15 == 30.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test23065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23065");
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
        faculty3.login("faculty", "");
        double double20 = faculty3.getHourlyRate();
        faculty3.setVerified(false);
        faculty3.setVerified(false);
        faculty3.login("faculty", "faculty");
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
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 30.0d + "'", double20 == 30.0d);
    }

    @Test
    public void test23066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23066");
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
        faculty3.login("", "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "faculty" + "'", str10, "faculty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "faculty" + "'", str11, "faculty");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 30.0d + "'", double12 == 30.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "faculty" + "'", str14, "faculty");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "faculty" + "'", str18, "faculty");
    }

    @Test
    public void test23067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23067");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        double double6 = faculty3.getHourlyRate();
        java.lang.String str7 = faculty3.getPassword();
        faculty3.login("", "faculty");
        boolean boolean11 = faculty3.isVerified();
        double double12 = faculty3.getHourlyRate();
        double double13 = faculty3.getHourlyRate();
        faculty3.viewProfile();
        java.lang.String str15 = faculty3.getID();
        java.lang.String str16 = faculty3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 30.0d + "'", double12 == 30.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 30.0d + "'", double13 == 30.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test23068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23068");
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
        java.lang.String str14 = faculty3.getAccountType();
        java.lang.String str15 = faculty3.getAccountType();
        java.lang.String str16 = faculty3.getEmail();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "faculty" + "'", str8, "faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "faculty" + "'", str10, "faculty");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "faculty" + "'", str14, "faculty");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "faculty" + "'", str15, "faculty");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test23069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23069");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        faculty3.logout();
        faculty3.login("hi!", "hi!");
        faculty3.viewProfile();
        faculty3.login("", "faculty");
        java.lang.String str12 = faculty3.getPassword();
        faculty3.setVerified(false);
        java.lang.String str15 = faculty3.getID();
        java.lang.String str16 = faculty3.getID();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test23070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23070");
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
        java.lang.String str16 = faculty3.getID();
        java.lang.String str17 = faculty3.getPassword();
        java.lang.String str18 = faculty3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "faculty" + "'", str10, "faculty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test23071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23071");
        model.Faculty faculty3 = new model.Faculty("hi!", "hi!", "");
        java.lang.String str4 = faculty3.getEmail();
        double double5 = faculty3.getHourlyRate();
        java.lang.String str6 = faculty3.getEmail();
        java.lang.String str7 = faculty3.getAccountType();
        java.lang.String str8 = faculty3.getEmail();
        java.lang.String str9 = faculty3.getAccountType();
        java.lang.String str10 = faculty3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 30.0d + "'", double5 == 30.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "faculty" + "'", str7, "faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "faculty" + "'", str9, "faculty");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test23072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23072");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        java.lang.String str7 = faculty3.getID();
        double double8 = faculty3.getHourlyRate();
        java.lang.String str9 = faculty3.getID();
        java.lang.String str10 = faculty3.getAccountType();
        faculty3.setVerified(true);
        boolean boolean13 = faculty3.isVerified();
        double double14 = faculty3.getHourlyRate();
        java.lang.String str15 = faculty3.getEmail();
        java.lang.String str16 = faculty3.getEmail();
        java.lang.String str17 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "faculty" + "'", str10, "faculty");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 30.0d + "'", double14 == 30.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "faculty" + "'", str17, "faculty");
    }

    @Test
    public void test23073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23073");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        faculty3.logout();
        faculty3.setVerified(false);
        java.lang.String str7 = faculty3.getAccountType();
        java.lang.String str8 = faculty3.getEmail();
        faculty3.login("hi!", "faculty");
        java.lang.String str12 = faculty3.getID();
        faculty3.viewProfile();
        faculty3.setVerified(true);
        java.lang.String str16 = faculty3.getPassword();
        double double17 = faculty3.getHourlyRate();
        double double18 = faculty3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "faculty" + "'", str7, "faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 30.0d + "'", double17 == 30.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 30.0d + "'", double18 == 30.0d);
    }

    @Test
    public void test23074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23074");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        double double6 = faculty3.getHourlyRate();
        java.lang.String str7 = faculty3.getID();
        faculty3.setVerified(false);
        java.lang.String str10 = faculty3.getAccountType();
        java.lang.String str11 = faculty3.getAccountType();
        java.lang.String str12 = faculty3.getEmail();
        java.lang.String str13 = faculty3.getID();
        java.lang.String str14 = faculty3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "faculty" + "'", str10, "faculty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "faculty" + "'", str11, "faculty");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test23075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23075");
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
        java.lang.String str18 = faculty3.getEmail();
        double double19 = faculty3.getHourlyRate();
        java.lang.String str20 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 30.0d + "'", double11 == 30.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 30.0d + "'", double19 == 30.0d);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "faculty" + "'", str20, "faculty");
    }

    @Test
    public void test23076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23076");
        model.Faculty faculty3 = new model.Faculty("faculty", "hi!", "");
        java.lang.String str4 = faculty3.getID();
        double double5 = faculty3.getHourlyRate();
        double double6 = faculty3.getHourlyRate();
        java.lang.String str7 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 30.0d + "'", double5 == 30.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "faculty" + "'", str7, "faculty");
    }

    @Test
    public void test23077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23077");
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
        java.lang.String str19 = faculty3.getAccountType();
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "faculty" + "'", str19, "faculty");
    }

    @Test
    public void test23078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23078");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        faculty3.setVerified(false);
        faculty3.viewProfile();
        java.lang.String str7 = faculty3.getEmail();
        java.lang.String str8 = faculty3.getAccountType();
        faculty3.logout();
        faculty3.login("", "");
        faculty3.logout();
        java.lang.String str14 = faculty3.getPassword();
        faculty3.logout();
        java.lang.String str16 = faculty3.getPassword();
        faculty3.logout();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "faculty" + "'", str8, "faculty");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test23079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23079");
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
        java.lang.String str14 = faculty3.getID();
        faculty3.login("", "faculty");
        faculty3.login("", "faculty");
        faculty3.viewProfile();
        faculty3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 30.0d + "'", double13 == 30.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test23080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23080");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        double double6 = faculty3.getHourlyRate();
        java.lang.String str7 = faculty3.getID();
        faculty3.setVerified(false);
        java.lang.String str10 = faculty3.getAccountType();
        java.lang.String str11 = faculty3.getAccountType();
        java.lang.String str12 = faculty3.getID();
        faculty3.setVerified(false);
        double double15 = faculty3.getHourlyRate();
        java.lang.String str16 = faculty3.getPassword();
        java.lang.String str17 = faculty3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "faculty" + "'", str10, "faculty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "faculty" + "'", str11, "faculty");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 30.0d + "'", double15 == 30.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test23081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23081");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        faculty3.logout();
        java.lang.String str5 = faculty3.getID();
        java.lang.String str6 = faculty3.getEmail();
        double double7 = faculty3.getHourlyRate();
        java.lang.String str8 = faculty3.getEmail();
        faculty3.login("", "");
        faculty3.login("", "");
        faculty3.logout();
        faculty3.logout();
        java.lang.String str17 = faculty3.getPassword();
        faculty3.setVerified(true);
        faculty3.viewProfile();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test23082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23082");
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
        java.lang.String str16 = faculty3.getAccountType();
        faculty3.login("hi!", "hi!");
        java.lang.String str20 = faculty3.getID();
        java.lang.String str21 = faculty3.getID();
        java.lang.String str22 = faculty3.getPassword();
        java.lang.String str23 = faculty3.getID();
        faculty3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "faculty" + "'", str16, "faculty");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
    }

    @Test
    public void test23083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23083");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        faculty3.logout();
        java.lang.String str5 = faculty3.getID();
        java.lang.String str6 = faculty3.getEmail();
        double double7 = faculty3.getHourlyRate();
        boolean boolean8 = faculty3.isVerified();
        java.lang.String str9 = faculty3.getID();
        double double10 = faculty3.getHourlyRate();
        java.lang.String str11 = faculty3.getEmail();
        java.lang.String str12 = faculty3.getPassword();
        java.lang.String str13 = faculty3.getAccountType();
        java.lang.String str14 = faculty3.getID();
        double double15 = faculty3.getHourlyRate();
        java.lang.String str16 = faculty3.getID();
        double double17 = faculty3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 30.0d + "'", double10 == 30.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "faculty" + "'", str13, "faculty");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 30.0d + "'", double15 == 30.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 30.0d + "'", double17 == 30.0d);
    }

    @Test
    public void test23084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23084");
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
        java.lang.String str19 = faculty3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test23085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23085");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        java.lang.String str7 = faculty3.getID();
        double double8 = faculty3.getHourlyRate();
        faculty3.logout();
        faculty3.logout();
        faculty3.setVerified(true);
        java.lang.String str13 = faculty3.getPassword();
        faculty3.setVerified(true);
        faculty3.login("hi!", "faculty");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test23086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23086");
        model.Faculty faculty3 = new model.Faculty("", "faculty", "faculty");
        faculty3.viewProfile();
        faculty3.viewProfile();
        java.lang.String str6 = faculty3.getAccountType();
        java.lang.String str7 = faculty3.getEmail();
        faculty3.setVerified(false);
        double double10 = faculty3.getHourlyRate();
        boolean boolean11 = faculty3.isVerified();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 30.0d + "'", double10 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test23087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23087");
        model.Faculty faculty3 = new model.Faculty("hi!", "hi!", "");
        faculty3.logout();
        java.lang.String str5 = faculty3.getEmail();
        boolean boolean6 = faculty3.isVerified();
        java.lang.String str7 = faculty3.getEmail();
        faculty3.login("", "faculty");
        java.lang.String str11 = faculty3.getAccountType();
        java.lang.String str12 = faculty3.getEmail();
        boolean boolean13 = faculty3.isVerified();
        faculty3.login("", "hi!");
        java.lang.String str17 = faculty3.getEmail();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "faculty" + "'", str11, "faculty");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test23088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23088");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        faculty3.setVerified(false);
        faculty3.viewProfile();
        java.lang.String str7 = faculty3.getEmail();
        faculty3.viewProfile();
        java.lang.String str9 = faculty3.getAccountType();
        java.lang.String str10 = faculty3.getPassword();
        faculty3.setVerified(false);
        faculty3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "faculty" + "'", str9, "faculty");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test23089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23089");
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
        double double26 = faculty3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 30.0d + "'", double26 == 30.0d);
    }

    @Test
    public void test23090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23090");
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
        faculty3.setVerified(true);
        faculty3.setVerified(false);
        boolean boolean21 = faculty3.isVerified();
        boolean boolean22 = faculty3.isVerified();
        faculty3.login("", "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 30.0d + "'", double16 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test23091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23091");
        model.Faculty faculty3 = new model.Faculty("", "faculty", "faculty");
        double double4 = faculty3.getHourlyRate();
        java.lang.String str5 = faculty3.getAccountType();
        java.lang.String str6 = faculty3.getAccountType();
        java.lang.String str7 = faculty3.getAccountType();
        double double8 = faculty3.getHourlyRate();
        java.lang.String str9 = faculty3.getAccountType();
        java.lang.String str10 = faculty3.getEmail();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 30.0d + "'", double4 == 30.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "faculty" + "'", str7, "faculty");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "faculty" + "'", str9, "faculty");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test23092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23092");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getAccountType();
        faculty3.logout();
        double double8 = faculty3.getHourlyRate();
        java.lang.String str9 = faculty3.getEmail();
        java.lang.String str10 = faculty3.getAccountType();
        boolean boolean11 = faculty3.isVerified();
        java.lang.String str12 = faculty3.getPassword();
        faculty3.setVerified(false);
        java.lang.String str15 = faculty3.getPassword();
        faculty3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "faculty" + "'", str10, "faculty");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test23093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23093");
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
        boolean boolean15 = faculty3.isVerified();
        boolean boolean16 = faculty3.isVerified();
        faculty3.logout();
        faculty3.logout();
        faculty3.login("hi!", "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test23094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23094");
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
        double double21 = faculty3.getHourlyRate();
        faculty3.logout();
        faculty3.setVerified(false);
        java.lang.String str25 = faculty3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 30.0d + "'", double18 == 30.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 30.0d + "'", double21 == 30.0d);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test23095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23095");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        faculty3.logout();
        faculty3.viewProfile();
        faculty3.viewProfile();
        faculty3.logout();
        boolean boolean8 = faculty3.isVerified();
        boolean boolean9 = faculty3.isVerified();
        java.lang.String str10 = faculty3.getAccountType();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "faculty" + "'", str10, "faculty");
    }

    @Test
    public void test23096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23096");
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
        java.lang.String str16 = faculty3.getPassword();
        faculty3.viewProfile();
        faculty3.login("", "");
        java.lang.String str21 = faculty3.getEmail();
        faculty3.setVerified(true);
        faculty3.login("faculty", "");
        faculty3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "faculty" + "'", str10, "faculty");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 30.0d + "'", double15 == 30.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test23097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23097");
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
        java.lang.String str14 = faculty3.getAccountType();
        faculty3.login("hi!", "faculty");
        faculty3.setVerified(false);
        java.lang.Class<?> wildcardClass20 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "faculty" + "'", str11, "faculty");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "faculty" + "'", str14, "faculty");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test23098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23098");
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
        boolean boolean13 = faculty3.isVerified();
        java.lang.String str14 = faculty3.getEmail();
        faculty3.setVerified(false);
        double double17 = faculty3.getHourlyRate();
        boolean boolean18 = faculty3.isVerified();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 30.0d + "'", double17 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test23099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23099");
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
        double double17 = faculty3.getHourlyRate();
        java.lang.String str18 = faculty3.getPassword();
        java.lang.String str19 = faculty3.getAccountType();
        faculty3.logout();
        java.lang.String str21 = faculty3.getEmail();
        faculty3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "faculty" + "'", str13, "faculty");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 30.0d + "'", double17 == 30.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "faculty" + "'", str19, "faculty");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test23100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23100");
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
        faculty3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 30.0d + "'", double11 == 30.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "faculty" + "'", str13, "faculty");
    }

    @Test
    public void test23101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23101");
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
        faculty3.logout();
        faculty3.setVerified(true);
        java.lang.String str19 = faculty3.getAccountType();
        faculty3.login("faculty", "faculty");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "faculty" + "'", str10, "faculty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "faculty" + "'", str11, "faculty");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 30.0d + "'", double12 == 30.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 30.0d + "'", double13 == 30.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "faculty" + "'", str15, "faculty");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "faculty" + "'", str19, "faculty");
    }

    @Test
    public void test23102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23102");
        model.Faculty faculty3 = new model.Faculty("hi!", "faculty", "faculty");
        java.lang.String str4 = faculty3.getID();
        faculty3.setVerified(true);
        faculty3.setVerified(true);
        java.lang.String str9 = faculty3.getID();
        faculty3.logout();
        faculty3.logout();
        faculty3.logout();
        faculty3.logout();
        faculty3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "faculty" + "'", str4, "faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "faculty" + "'", str9, "faculty");
    }

    @Test
    public void test23103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23103");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        java.lang.String str4 = faculty3.getAccountType();
        java.lang.String str5 = faculty3.getID();
        faculty3.login("", "faculty");
        double double9 = faculty3.getHourlyRate();
        faculty3.login("hi!", "");
        faculty3.logout();
        java.lang.String str14 = faculty3.getAccountType();
        java.lang.Class<?> wildcardClass15 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "faculty" + "'", str4, "faculty");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 30.0d + "'", double9 == 30.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "faculty" + "'", str14, "faculty");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test23104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23104");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        double double6 = faculty3.getHourlyRate();
        java.lang.String str7 = faculty3.getPassword();
        java.lang.String str8 = faculty3.getPassword();
        java.lang.String str9 = faculty3.getAccountType();
        faculty3.login("hi!", "faculty");
        java.lang.String str13 = faculty3.getID();
        java.lang.String str14 = faculty3.getPassword();
        faculty3.setVerified(true);
        faculty3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "faculty" + "'", str9, "faculty");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test23105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23105");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        double double6 = faculty3.getHourlyRate();
        java.lang.String str7 = faculty3.getID();
        boolean boolean8 = faculty3.isVerified();
        faculty3.setVerified(true);
        java.lang.String str11 = faculty3.getEmail();
        java.lang.String str12 = faculty3.getPassword();
        java.lang.String str13 = faculty3.getID();
        java.lang.String str14 = faculty3.getPassword();
        double double15 = faculty3.getHourlyRate();
        java.lang.String str16 = faculty3.getID();
        boolean boolean17 = faculty3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 30.0d + "'", double15 == 30.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test23106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23106");
        model.Faculty faculty3 = new model.Faculty("faculty", "", "");
        faculty3.logout();
        double double5 = faculty3.getHourlyRate();
        java.lang.String str6 = faculty3.getAccountType();
        faculty3.viewProfile();
        boolean boolean8 = faculty3.isVerified();
        boolean boolean9 = faculty3.isVerified();
        java.lang.String str10 = faculty3.getEmail();
        java.lang.String str11 = faculty3.getAccountType();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 30.0d + "'", double5 == 30.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "faculty" + "'", str10, "faculty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "faculty" + "'", str11, "faculty");
    }

    @Test
    public void test23107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23107");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        java.lang.String str4 = faculty3.getAccountType();
        java.lang.String str5 = faculty3.getID();
        faculty3.setVerified(true);
        faculty3.login("faculty", "faculty");
        java.lang.String str11 = faculty3.getID();
        faculty3.viewProfile();
        java.lang.String str13 = faculty3.getPassword();
        java.lang.String str14 = faculty3.getID();
        java.lang.String str15 = faculty3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "faculty" + "'", str4, "faculty");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test23108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23108");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        faculty3.logout();
        java.lang.String str5 = faculty3.getID();
        java.lang.String str6 = faculty3.getEmail();
        java.lang.String str7 = faculty3.getEmail();
        java.lang.String str8 = faculty3.getID();
        faculty3.viewProfile();
        faculty3.viewProfile();
        boolean boolean11 = faculty3.isVerified();
        faculty3.logout();
        boolean boolean13 = faculty3.isVerified();
        faculty3.viewProfile();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test23109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23109");
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
        java.lang.String str21 = faculty3.getPassword();
        java.lang.String str22 = faculty3.getID();
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
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test23110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23110");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getAccountType();
        faculty3.logout();
        faculty3.setVerified(true);
        faculty3.setVerified(true);
        faculty3.logout();
        faculty3.setVerified(false);
        faculty3.login("faculty", "");
        faculty3.logout();
        faculty3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
    }

    @Test
    public void test23111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23111");
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
        java.lang.String str17 = faculty3.getEmail();
        boolean boolean18 = faculty3.isVerified();
        faculty3.login("hi!", "");
        faculty3.setVerified(false);
        java.lang.String str24 = faculty3.getEmail();
        java.lang.String str25 = faculty3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "faculty" + "'", str10, "faculty");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "faculty" + "'", str16, "faculty");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test23112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23112");
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
        java.lang.String str18 = faculty3.getID();
        java.lang.String str19 = faculty3.getAccountType();
        faculty3.login("", "faculty");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "faculty" + "'", str15, "faculty");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "faculty" + "'", str17, "faculty");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "faculty" + "'", str19, "faculty");
    }

    @Test
    public void test23113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23113");
        model.Faculty faculty3 = new model.Faculty("hi!", "hi!", "");
        faculty3.logout();
        java.lang.String str5 = faculty3.getEmail();
        java.lang.String str6 = faculty3.getAccountType();
        faculty3.viewProfile();
        boolean boolean8 = faculty3.isVerified();
        double double9 = faculty3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 30.0d + "'", double9 == 30.0d);
    }

    @Test
    public void test23114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23114");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        faculty3.logout();
        java.lang.String str5 = faculty3.getID();
        java.lang.String str6 = faculty3.getEmail();
        double double7 = faculty3.getHourlyRate();
        java.lang.String str8 = faculty3.getPassword();
        faculty3.login("hi!", "hi!");
        faculty3.logout();
        faculty3.viewProfile();
        java.lang.String str14 = faculty3.getAccountType();
        java.lang.String str15 = faculty3.getEmail();
        java.lang.String str16 = faculty3.getEmail();
        double double17 = faculty3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "faculty" + "'", str14, "faculty");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 30.0d + "'", double17 == 30.0d);
    }

    @Test
    public void test23115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23115");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        double double6 = faculty3.getHourlyRate();
        faculty3.logout();
        faculty3.setVerified(true);
        java.lang.String str10 = faculty3.getID();
        double double11 = faculty3.getHourlyRate();
        faculty3.viewProfile();
        double double13 = faculty3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 30.0d + "'", double11 == 30.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 30.0d + "'", double13 == 30.0d);
    }

    @Test
    public void test23116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23116");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        java.lang.String str4 = faculty3.getAccountType();
        java.lang.String str5 = faculty3.getID();
        faculty3.setVerified(true);
        faculty3.login("faculty", "faculty");
        java.lang.String str11 = faculty3.getPassword();
        faculty3.login("hi!", "hi!");
        java.lang.String str15 = faculty3.getEmail();
        java.lang.String str16 = faculty3.getPassword();
        boolean boolean17 = faculty3.isVerified();
        java.lang.Class<?> wildcardClass18 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "faculty" + "'", str4, "faculty");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test23117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23117");
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
        faculty3.logout();
        java.lang.String str16 = faculty3.getID();
        faculty3.logout();
        java.lang.String str18 = faculty3.getEmail();
        java.lang.String str19 = faculty3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "faculty" + "'", str11, "faculty");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test23118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23118");
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
        java.lang.String str18 = faculty3.getAccountType();
        faculty3.login("hi!", "faculty");
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "faculty" + "'", str18, "faculty");
    }

    @Test
    public void test23119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23119");
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
        faculty3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "faculty" + "'", str10, "faculty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test23120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23120");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        faculty3.setVerified(false);
        java.lang.String str9 = faculty3.getID();
        faculty3.setVerified(false);
        double double12 = faculty3.getHourlyRate();
        faculty3.setVerified(false);
        java.lang.String str15 = faculty3.getPassword();
        double double16 = faculty3.getHourlyRate();
        java.lang.String str17 = faculty3.getEmail();
        java.lang.String str18 = faculty3.getPassword();
        double double19 = faculty3.getHourlyRate();
        faculty3.login("hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 30.0d + "'", double12 == 30.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 30.0d + "'", double16 == 30.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 30.0d + "'", double19 == 30.0d);
    }

    @Test
    public void test23121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23121");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        faculty3.logout();
        java.lang.String str5 = faculty3.getID();
        java.lang.String str6 = faculty3.getEmail();
        java.lang.String str7 = faculty3.getEmail();
        faculty3.logout();
        java.lang.String str9 = faculty3.getID();
        faculty3.viewProfile();
        faculty3.logout();
        java.lang.String str12 = faculty3.getEmail();
        double double13 = faculty3.getHourlyRate();
        java.lang.String str14 = faculty3.getID();
        double double15 = faculty3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 30.0d + "'", double13 == 30.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 30.0d + "'", double15 == 30.0d);
    }

    @Test
    public void test23122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23122");
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
        faculty3.viewProfile();
        faculty3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 30.0d + "'", double12 == 30.0d);
    }

    @Test
    public void test23123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23123");
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
        java.lang.String str16 = faculty3.getID();
        java.lang.String str17 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "faculty" + "'", str10, "faculty");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "faculty" + "'", str17, "faculty");
    }

    @Test
    public void test23124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23124");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        java.lang.String str6 = faculty3.getPassword();
        java.lang.String str7 = faculty3.getPassword();
        java.lang.String str8 = faculty3.getID();
        java.lang.String str9 = faculty3.getID();
        faculty3.viewProfile();
        java.lang.String str11 = faculty3.getPassword();
        boolean boolean12 = faculty3.isVerified();
        boolean boolean13 = faculty3.isVerified();
        boolean boolean14 = faculty3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test23125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23125");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        faculty3.logout();
        faculty3.viewProfile();
        faculty3.viewProfile();
        double double7 = faculty3.getHourlyRate();
        java.lang.String str8 = faculty3.getPassword();
        java.lang.String str9 = faculty3.getPassword();
        faculty3.setVerified(true);
        faculty3.login("", "hi!");
        java.lang.String str15 = faculty3.getAccountType();
        java.lang.String str16 = faculty3.getAccountType();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "faculty" + "'", str15, "faculty");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "faculty" + "'", str16, "faculty");
    }

    @Test
    public void test23126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23126");
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
        double double24 = faculty3.getHourlyRate();
        double double25 = faculty3.getHourlyRate();
        java.lang.String str26 = faculty3.getAccountType();
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
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 30.0d + "'", double24 == 30.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 30.0d + "'", double25 == 30.0d);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "faculty" + "'", str26, "faculty");
    }

    @Test
    public void test23127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23127");
        model.Faculty faculty3 = new model.Faculty("", "", "faculty");
        java.lang.String str4 = faculty3.getAccountType();
        java.lang.String str5 = faculty3.getID();
        java.lang.String str6 = faculty3.getAccountType();
        java.lang.String str7 = faculty3.getEmail();
        java.lang.String str8 = faculty3.getPassword();
        java.lang.String str9 = faculty3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "faculty" + "'", str4, "faculty");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test23128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23128");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        boolean boolean7 = faculty3.isVerified();
        faculty3.login("", "hi!");
        java.lang.String str11 = faculty3.getEmail();
        faculty3.viewProfile();
        java.lang.String str13 = faculty3.getAccountType();
        faculty3.setVerified(true);
        java.lang.String str16 = faculty3.getEmail();
        faculty3.viewProfile();
        double double18 = faculty3.getHourlyRate();
        java.lang.Class<?> wildcardClass19 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "faculty" + "'", str13, "faculty");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 30.0d + "'", double18 == 30.0d);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test23129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23129");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        java.lang.String str4 = faculty3.getAccountType();
        java.lang.String str5 = faculty3.getID();
        faculty3.viewProfile();
        faculty3.setVerified(true);
        java.lang.String str9 = faculty3.getEmail();
        double double10 = faculty3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "faculty" + "'", str4, "faculty");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 30.0d + "'", double10 == 30.0d);
    }

    @Test
    public void test23130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23130");
        model.Faculty faculty3 = new model.Faculty("hi!", "hi!", "hi!");
        faculty3.login("hi!", "faculty");
        faculty3.logout();
        java.lang.String str8 = faculty3.getPassword();
        faculty3.viewProfile();
        faculty3.setVerified(false);
        java.lang.String str12 = faculty3.getPassword();
        java.lang.String str13 = faculty3.getPassword();
        faculty3.viewProfile();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test23131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23131");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        faculty3.setVerified(false);
        java.lang.String str6 = faculty3.getPassword();
        java.lang.String str7 = faculty3.getAccountType();
        java.lang.String str8 = faculty3.getEmail();
        java.lang.String str9 = faculty3.getID();
        faculty3.login("faculty", "hi!");
        double double13 = faculty3.getHourlyRate();
        java.lang.String str14 = faculty3.getPassword();
        java.lang.String str15 = faculty3.getID();
        faculty3.login("hi!", "faculty");
        faculty3.login("hi!", "");
        java.lang.Class<?> wildcardClass22 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "faculty" + "'", str7, "faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 30.0d + "'", double13 == 30.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test23132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23132");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        faculty3.logout();
        faculty3.login("hi!", "hi!");
        double double8 = faculty3.getHourlyRate();
        boolean boolean9 = faculty3.isVerified();
        faculty3.setVerified(false);
        java.lang.String str12 = faculty3.getPassword();
        faculty3.viewProfile();
        java.lang.String str14 = faculty3.getID();
        java.lang.String str15 = faculty3.getID();
        java.lang.String str16 = faculty3.getID();
        java.lang.String str17 = faculty3.getID();
        java.lang.String str18 = faculty3.getID();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test23133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23133");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        faculty3.setVerified(false);
        java.lang.String str6 = faculty3.getEmail();
        java.lang.String str7 = faculty3.getAccountType();
        java.lang.String str8 = faculty3.getID();
        double double9 = faculty3.getHourlyRate();
        faculty3.setVerified(true);
        java.lang.String str12 = faculty3.getID();
        faculty3.logout();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "faculty" + "'", str7, "faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 30.0d + "'", double9 == 30.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test23134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23134");
        model.Faculty faculty3 = new model.Faculty("faculty", "", "");
        faculty3.logout();
        java.lang.String str5 = faculty3.getPassword();
        boolean boolean6 = faculty3.isVerified();
        java.lang.String str7 = faculty3.getAccountType();
        faculty3.logout();
        double double9 = faculty3.getHourlyRate();
        java.lang.String str10 = faculty3.getEmail();
        java.lang.String str11 = faculty3.getAccountType();
        java.lang.String str12 = faculty3.getID();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "faculty" + "'", str7, "faculty");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 30.0d + "'", double9 == 30.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "faculty" + "'", str10, "faculty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "faculty" + "'", str11, "faculty");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test23135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23135");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        java.lang.String str6 = faculty3.getPassword();
        faculty3.setVerified(false);
        faculty3.setVerified(false);
        java.lang.String str11 = faculty3.getID();
        java.lang.String str12 = faculty3.getID();
        java.lang.String str13 = faculty3.getID();
        boolean boolean14 = faculty3.isVerified();
        double double15 = faculty3.getHourlyRate();
        faculty3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 30.0d + "'", double15 == 30.0d);
    }

    @Test
    public void test23136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23136");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        faculty3.logout();
        java.lang.String str5 = faculty3.getID();
        java.lang.String str6 = faculty3.getEmail();
        faculty3.viewProfile();
        faculty3.login("hi!", "faculty");
        java.lang.String str11 = faculty3.getID();
        faculty3.login("", "");
        faculty3.setVerified(false);
        faculty3.logout();
        java.lang.String str18 = faculty3.getID();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test23137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23137");
        model.Faculty faculty3 = new model.Faculty("hi!", "faculty", "");
        java.lang.String str4 = faculty3.getEmail();
        faculty3.viewProfile();
        faculty3.login("", "faculty");
        java.lang.String str9 = faculty3.getID();
        faculty3.login("", "hi!");
        faculty3.setVerified(false);
        java.lang.String str15 = faculty3.getEmail();
        double double16 = faculty3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 30.0d + "'", double16 == 30.0d);
    }

    @Test
    public void test23138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23138");
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
        double double18 = faculty3.getHourlyRate();
        faculty3.setVerified(true);
        faculty3.setVerified(false);
        java.lang.String str23 = faculty3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "faculty" + "'", str14, "faculty");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 30.0d + "'", double18 == 30.0d);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test23139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23139");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        faculty3.login("", "");
        double double7 = faculty3.getHourlyRate();
        faculty3.login("faculty", "faculty");
        java.lang.String str11 = faculty3.getID();
        faculty3.logout();
        java.lang.Class<?> wildcardClass13 = faculty3.getClass();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test23140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23140");
        model.Faculty faculty3 = new model.Faculty("hi!", "faculty", "");
        faculty3.logout();
        java.lang.String str5 = faculty3.getPassword();
        java.lang.String str6 = faculty3.getEmail();
        faculty3.login("hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test23141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23141");
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
        java.lang.String str19 = faculty3.getPassword();
        boolean boolean20 = faculty3.isVerified();
        java.lang.String str21 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "faculty" + "'", str21, "faculty");
    }

    @Test
    public void test23142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23142");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        faculty3.setVerified(false);
        java.lang.String str10 = faculty3.getAccountType();
        java.lang.String str11 = faculty3.getEmail();
        faculty3.viewProfile();
        java.lang.String str13 = faculty3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "faculty" + "'", str10, "faculty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test23143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23143");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        faculty3.logout();
        faculty3.login("hi!", "hi!");
        double double8 = faculty3.getHourlyRate();
        java.lang.String str9 = faculty3.getID();
        java.lang.String str10 = faculty3.getEmail();
        java.lang.String str11 = faculty3.getPassword();
        java.lang.String str12 = faculty3.getID();
        java.lang.String str13 = faculty3.getID();
        java.lang.String str14 = faculty3.getPassword();
        faculty3.setVerified(true);
        java.lang.String str17 = faculty3.getID();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test23144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23144");
        model.Faculty faculty3 = new model.Faculty("hi!", "hi!", "");
        faculty3.logout();
        java.lang.String str5 = faculty3.getEmail();
        java.lang.String str6 = faculty3.getAccountType();
        java.lang.String str7 = faculty3.getPassword();
        faculty3.viewProfile();
        faculty3.logout();
        faculty3.logout();
        faculty3.setVerified(true);
        java.lang.String str13 = faculty3.getPassword();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test23145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23145");
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
        java.lang.String str27 = faculty3.getPassword();
        double double28 = faculty3.getHourlyRate();
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
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 30.0d + "'", double28 == 30.0d);
    }

    @Test
    public void test23146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23146");
        model.Faculty faculty3 = new model.Faculty("faculty", "", "faculty");
        faculty3.setVerified(false);
        faculty3.viewProfile();
        java.lang.String str7 = faculty3.getEmail();
        java.lang.String str8 = faculty3.getID();
        double double9 = faculty3.getHourlyRate();
        faculty3.login("hi!", "faculty");
        java.lang.Class<?> wildcardClass13 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "faculty" + "'", str7, "faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "faculty" + "'", str8, "faculty");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 30.0d + "'", double9 == 30.0d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test23147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23147");
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
        java.lang.String str15 = faculty3.getPassword();
        java.lang.String str16 = faculty3.getAccountType();
        java.lang.String str17 = faculty3.getID();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "faculty" + "'", str16, "faculty");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test23148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23148");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        faculty3.setVerified(false);
        java.lang.String str6 = faculty3.getPassword();
        java.lang.String str7 = faculty3.getAccountType();
        faculty3.viewProfile();
        faculty3.logout();
        faculty3.logout();
        java.lang.String str11 = faculty3.getAccountType();
        java.lang.String str12 = faculty3.getID();
        java.lang.String str13 = faculty3.getPassword();
        java.lang.String str14 = faculty3.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "faculty" + "'", str7, "faculty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "faculty" + "'", str11, "faculty");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test23149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23149");
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
        faculty3.logout();
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
    public void test23150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23150");
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
        faculty3.logout();
        double double16 = faculty3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 30.0d + "'", double14 == 30.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 30.0d + "'", double16 == 30.0d);
    }

    @Test
    public void test23151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23151");
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
        boolean boolean18 = faculty3.isVerified();
        java.lang.String str19 = faculty3.getAccountType();
        faculty3.login("hi!", "");
        java.lang.String str23 = faculty3.getID();
        double double24 = faculty3.getHourlyRate();
        double double25 = faculty3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "faculty" + "'", str19, "faculty");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 30.0d + "'", double24 == 30.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 30.0d + "'", double25 == 30.0d);
    }

    @Test
    public void test23152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23152");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.login("", "");
        java.lang.String str10 = faculty3.getID();
        java.lang.String str11 = faculty3.getEmail();
        faculty3.login("faculty", "");
        boolean boolean15 = faculty3.isVerified();
        boolean boolean16 = faculty3.isVerified();
        double double17 = faculty3.getHourlyRate();
        java.lang.Class<?> wildcardClass18 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 30.0d + "'", double17 == 30.0d);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test23153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23153");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        faculty3.logout();
        java.lang.String str5 = faculty3.getID();
        java.lang.String str6 = faculty3.getEmail();
        java.lang.String str7 = faculty3.getEmail();
        java.lang.String str8 = faculty3.getEmail();
        java.lang.String str9 = faculty3.getID();
        java.lang.String str10 = faculty3.getPassword();
        faculty3.viewProfile();
        java.lang.String str12 = faculty3.getAccountType();
        faculty3.login("hi!", "faculty");
        faculty3.logout();
        java.lang.String str17 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "faculty" + "'", str12, "faculty");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "faculty" + "'", str17, "faculty");
    }

    @Test
    public void test23154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23154");
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
        faculty3.setVerified(true);
        double double25 = faculty3.getHourlyRate();
        java.lang.String str26 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "faculty" + "'", str13, "faculty");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 30.0d + "'", double22 == 30.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 30.0d + "'", double25 == 30.0d);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "faculty" + "'", str26, "faculty");
    }

    @Test
    public void test23155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23155");
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
        faculty3.viewProfile();
        faculty3.setVerified(false);
        boolean boolean19 = faculty3.isVerified();
        faculty3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "faculty" + "'", str15, "faculty");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test23156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23156");
        model.Faculty faculty3 = new model.Faculty("hi!", "hi!", "");
        java.lang.String str4 = faculty3.getPassword();
        faculty3.viewProfile();
        faculty3.login("", "");
        faculty3.logout();
        java.lang.String str10 = faculty3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test23157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23157");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        faculty3.setVerified(false);
        faculty3.viewProfile();
        java.lang.String str11 = faculty3.getEmail();
        java.lang.String str12 = faculty3.getPassword();
        java.lang.String str13 = faculty3.getAccountType();
        boolean boolean14 = faculty3.isVerified();
        java.lang.String str15 = faculty3.getEmail();
        java.lang.String str16 = faculty3.getPassword();
        boolean boolean17 = faculty3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "faculty" + "'", str13, "faculty");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test23158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23158");
        model.Faculty faculty3 = new model.Faculty("faculty", "", "");
        faculty3.logout();
        faculty3.setVerified(true);
        faculty3.logout();
        double double8 = faculty3.getHourlyRate();
        java.lang.String str9 = faculty3.getID();
        boolean boolean10 = faculty3.isVerified();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test23159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23159");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        faculty3.logout();
        faculty3.login("hi!", "hi!");
        double double8 = faculty3.getHourlyRate();
        boolean boolean9 = faculty3.isVerified();
        java.lang.String str10 = faculty3.getAccountType();
        java.lang.String str11 = faculty3.getAccountType();
        double double12 = faculty3.getHourlyRate();
        double double13 = faculty3.getHourlyRate();
        java.lang.String str14 = faculty3.getID();
        faculty3.login("hi!", "hi!");
        java.lang.String str18 = faculty3.getEmail();
        faculty3.logout();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "faculty" + "'", str10, "faculty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "faculty" + "'", str11, "faculty");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 30.0d + "'", double12 == 30.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 30.0d + "'", double13 == 30.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test23160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23160");
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
        faculty3.login("", "hi!");
        faculty3.viewProfile();
        faculty3.viewProfile();
        java.lang.String str21 = faculty3.getAccountType();
        faculty3.login("faculty", "faculty");
        faculty3.setVerified(true);
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
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "faculty" + "'", str21, "faculty");
    }

    @Test
    public void test23161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23161");
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
        java.lang.String str18 = faculty3.getAccountType();
        java.lang.String str19 = faculty3.getEmail();
        faculty3.login("", "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "faculty" + "'", str8, "faculty");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "faculty" + "'", str12, "faculty");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "faculty" + "'", str18, "faculty");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test23162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23162");
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
        faculty3.login("faculty", "");
        faculty3.login("hi!", "hi!");
        java.lang.String str23 = faculty3.getPassword();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test23163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23163");
        model.Faculty faculty3 = new model.Faculty("", "", "faculty");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getPassword();
        boolean boolean6 = faculty3.isVerified();
        java.lang.String str7 = faculty3.getID();
        boolean boolean8 = faculty3.isVerified();
        double double9 = faculty3.getHourlyRate();
        faculty3.setVerified(false);
        faculty3.setVerified(true);
        java.lang.String str14 = faculty3.getAccountType();
        faculty3.viewProfile();
        java.lang.Class<?> wildcardClass16 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "faculty" + "'", str4, "faculty");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "faculty" + "'", str7, "faculty");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 30.0d + "'", double9 == 30.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "faculty" + "'", str14, "faculty");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test23164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23164");
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
        faculty3.setVerified(true);
        faculty3.viewProfile();
        java.lang.String str23 = faculty3.getEmail();
        double double24 = faculty3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "faculty" + "'", str13, "faculty");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "faculty" + "'", str14, "faculty");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "faculty" + "'", str16, "faculty");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 30.0d + "'", double24 == 30.0d);
    }

    @Test
    public void test23165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23165");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        java.lang.String str8 = faculty3.getPassword();
        faculty3.logout();
        java.lang.String str10 = faculty3.getID();
        double double11 = faculty3.getHourlyRate();
        faculty3.login("faculty", "hi!");
        java.lang.String str15 = faculty3.getAccountType();
        java.lang.String str16 = faculty3.getAccountType();
        boolean boolean17 = faculty3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 30.0d + "'", double11 == 30.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "faculty" + "'", str15, "faculty");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "faculty" + "'", str16, "faculty");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test23166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23166");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        faculty3.logout();
        java.lang.String str5 = faculty3.getID();
        java.lang.String str6 = faculty3.getEmail();
        double double7 = faculty3.getHourlyRate();
        boolean boolean8 = faculty3.isVerified();
        java.lang.String str9 = faculty3.getID();
        java.lang.String str10 = faculty3.getAccountType();
        faculty3.login("hi!", "hi!");
        faculty3.setVerified(false);
        double double16 = faculty3.getHourlyRate();
        faculty3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "faculty" + "'", str10, "faculty");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 30.0d + "'", double16 == 30.0d);
    }

    @Test
    public void test23167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23167");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        faculty3.logout();
        faculty3.login("hi!", "hi!");
        faculty3.viewProfile();
        java.lang.String str9 = faculty3.getPassword();
        java.lang.String str10 = faculty3.getID();
        faculty3.logout();
        faculty3.login("", "faculty");
        java.lang.String str15 = faculty3.getID();
        faculty3.setVerified(false);
        faculty3.setVerified(false);
        java.lang.String str20 = faculty3.getPassword();
        java.lang.String str21 = faculty3.getAccountType();
        java.lang.String str22 = faculty3.getEmail();
        faculty3.viewProfile();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "faculty" + "'", str21, "faculty");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test23168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23168");
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
        faculty3.logout();
        java.lang.String str17 = faculty3.getAccountType();
        double double18 = faculty3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "faculty" + "'", str17, "faculty");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 30.0d + "'", double18 == 30.0d);
    }

    @Test
    public void test23169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23169");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        faculty3.logout();
        java.lang.String str5 = faculty3.getID();
        java.lang.String str6 = faculty3.getPassword();
        faculty3.logout();
        faculty3.login("faculty", "hi!");
        java.lang.String str11 = faculty3.getID();
        faculty3.login("", "faculty");
        faculty3.viewProfile();
        java.lang.String str16 = faculty3.getPassword();
        faculty3.setVerified(false);
        java.lang.String str19 = faculty3.getID();
        java.lang.String str20 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "faculty" + "'", str20, "faculty");
    }

    @Test
    public void test23170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23170");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        faculty3.logout();
        java.lang.String str5 = faculty3.getID();
        java.lang.String str6 = faculty3.getPassword();
        java.lang.String str7 = faculty3.getAccountType();
        faculty3.setVerified(false);
        faculty3.login("faculty", "hi!");
        faculty3.logout();
        double double14 = faculty3.getHourlyRate();
        faculty3.viewProfile();
        boolean boolean16 = faculty3.isVerified();
        java.lang.String str17 = faculty3.getPassword();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "faculty" + "'", str7, "faculty");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 30.0d + "'", double14 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test23171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23171");
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
        java.lang.String str15 = faculty3.getAccountType();
        faculty3.login("faculty", "");
        java.lang.String str19 = faculty3.getAccountType();
        faculty3.setVerified(false);
        boolean boolean22 = faculty3.isVerified();
        java.lang.String str23 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "faculty" + "'", str10, "faculty");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "faculty" + "'", str15, "faculty");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "faculty" + "'", str19, "faculty");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "faculty" + "'", str23, "faculty");
    }

    @Test
    public void test23172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23172");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        double double6 = faculty3.getHourlyRate();
        java.lang.String str7 = faculty3.getID();
        faculty3.setVerified(false);
        java.lang.String str10 = faculty3.getID();
        faculty3.login("faculty", "");
        faculty3.logout();
        faculty3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test23173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23173");
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
        boolean boolean13 = faculty3.isVerified();
        double double14 = faculty3.getHourlyRate();
        faculty3.setVerified(false);
        java.lang.String str17 = faculty3.getPassword();
        faculty3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "faculty" + "'", str11, "faculty");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 30.0d + "'", double14 == 30.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test23174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23174");
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
        java.lang.String str25 = faculty3.getPassword();
        double double26 = faculty3.getHourlyRate();
        java.lang.String str27 = faculty3.getPassword();
        boolean boolean28 = faculty3.isVerified();
        java.lang.String str29 = faculty3.getPassword();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "faculty" + "'", str15, "faculty");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "faculty" + "'", str22, "faculty");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 30.0d + "'", double26 == 30.0d);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
    }

    @Test
    public void test23175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23175");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        faculty3.login("", "faculty");
        faculty3.login("hi!", "hi!");
        java.lang.String str13 = faculty3.getAccountType();
        java.lang.String str14 = faculty3.getPassword();
        java.lang.String str15 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "faculty" + "'", str13, "faculty");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "faculty" + "'", str15, "faculty");
    }

    @Test
    public void test23176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23176");
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
        double double13 = faculty3.getHourlyRate();
        faculty3.logout();
        boolean boolean15 = faculty3.isVerified();
        faculty3.login("hi!", "faculty");
        faculty3.logout();
        java.lang.String str20 = faculty3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "faculty" + "'", str12, "faculty");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 30.0d + "'", double13 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test23177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23177");
        model.Faculty faculty3 = new model.Faculty("", "faculty", "");
        faculty3.setVerified(true);
        faculty3.login("", "hi!");
        faculty3.viewProfile();
        java.lang.String str10 = faculty3.getID();
        faculty3.viewProfile();
        double double12 = faculty3.getHourlyRate();
        double double13 = faculty3.getHourlyRate();
        java.lang.String str14 = faculty3.getEmail();
        boolean boolean15 = faculty3.isVerified();
        faculty3.setVerified(false);
        faculty3.setVerified(true);
        java.lang.String str20 = faculty3.getID();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 30.0d + "'", double12 == 30.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 30.0d + "'", double13 == 30.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test23178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23178");
        model.Faculty faculty3 = new model.Faculty("", "faculty", "");
        faculty3.login("faculty", "");
        boolean boolean7 = faculty3.isVerified();
        faculty3.login("hi!", "");
        java.lang.String str11 = faculty3.getPassword();
        java.lang.String str12 = faculty3.getID();
        faculty3.logout();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "faculty" + "'", str11, "faculty");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test23179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23179");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        java.lang.String str7 = faculty3.getID();
        faculty3.login("hi!", "");
        faculty3.login("hi!", "faculty");
        faculty3.viewProfile();
        java.lang.String str15 = faculty3.getPassword();
        java.lang.String str16 = faculty3.getPassword();
        java.lang.String str17 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "faculty" + "'", str17, "faculty");
    }

    @Test
    public void test23180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23180");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        faculty3.login("", "faculty");
        java.lang.String str10 = faculty3.getEmail();
        faculty3.setVerified(true);
        java.lang.String str13 = faculty3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test23181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23181");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        faculty3.setVerified(false);
        java.lang.String str6 = faculty3.getEmail();
        java.lang.String str7 = faculty3.getAccountType();
        faculty3.viewProfile();
        java.lang.String str9 = faculty3.getAccountType();
        java.lang.String str10 = faculty3.getPassword();
        faculty3.setVerified(true);
        boolean boolean13 = faculty3.isVerified();
        faculty3.login("hi!", "");
        java.lang.String str17 = faculty3.getPassword();
        boolean boolean18 = faculty3.isVerified();
        java.lang.String str19 = faculty3.getID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "faculty" + "'", str7, "faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "faculty" + "'", str9, "faculty");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test23182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23182");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        faculty3.login("", "");
        faculty3.viewProfile();
        faculty3.viewProfile();
        faculty3.login("", "");
        faculty3.viewProfile();
        java.lang.String str13 = faculty3.getID();
        java.lang.String str14 = faculty3.getID();
        java.lang.String str15 = faculty3.getID();
        java.lang.Class<?> wildcardClass16 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test23183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23183");
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
        double double22 = faculty3.getHourlyRate();
        java.lang.String str23 = faculty3.getID();
        double double24 = faculty3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 30.0d + "'", double22 == 30.0d);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 30.0d + "'", double24 == 30.0d);
    }

    @Test
    public void test23184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23184");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        faculty3.setVerified(false);
        java.lang.String str6 = faculty3.getPassword();
        java.lang.String str7 = faculty3.getAccountType();
        faculty3.viewProfile();
        faculty3.logout();
        faculty3.logout();
        java.lang.String str11 = faculty3.getAccountType();
        java.lang.String str12 = faculty3.getID();
        boolean boolean13 = faculty3.isVerified();
        java.lang.String str14 = faculty3.getPassword();
        faculty3.logout();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "faculty" + "'", str7, "faculty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "faculty" + "'", str11, "faculty");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test23185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23185");
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
        java.lang.String str18 = faculty3.getID();
        faculty3.login("hi!", "faculty");
        faculty3.logout();
        java.lang.String str23 = faculty3.getEmail();
        java.lang.String str24 = faculty3.getAccountType();
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "faculty" + "'", str24, "faculty");
    }

    @Test
    public void test23186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23186");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        faculty3.setVerified(false);
        java.lang.String str6 = faculty3.getEmail();
        faculty3.setVerified(false);
        faculty3.login("faculty", "hi!");
        java.lang.String str12 = faculty3.getAccountType();
        double double13 = faculty3.getHourlyRate();
        double double14 = faculty3.getHourlyRate();
        java.lang.String str15 = faculty3.getID();
        java.lang.String str16 = faculty3.getPassword();
        faculty3.viewProfile();
        faculty3.login("faculty", "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "faculty" + "'", str12, "faculty");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 30.0d + "'", double13 == 30.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 30.0d + "'", double14 == 30.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test23187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23187");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.viewProfile();
        java.lang.String str8 = faculty3.getAccountType();
        java.lang.String str9 = faculty3.getID();
        double double10 = faculty3.getHourlyRate();
        double double11 = faculty3.getHourlyRate();
        faculty3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "faculty" + "'", str8, "faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 30.0d + "'", double10 == 30.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 30.0d + "'", double11 == 30.0d);
    }

    @Test
    public void test23188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23188");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        java.lang.String str6 = faculty3.getPassword();
        faculty3.setVerified(false);
        faculty3.setVerified(false);
        java.lang.String str11 = faculty3.getAccountType();
        faculty3.logout();
        faculty3.login("", "hi!");
        double double16 = faculty3.getHourlyRate();
        faculty3.setVerified(true);
        faculty3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "faculty" + "'", str11, "faculty");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 30.0d + "'", double16 == 30.0d);
    }

    @Test
    public void test23189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23189");
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
        java.lang.String str16 = faculty3.getEmail();
        java.lang.String str17 = faculty3.getAccountType();
        faculty3.login("hi!", "faculty");
        faculty3.setVerified(false);
        java.lang.String str23 = faculty3.getID();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "faculty" + "'", str8, "faculty");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 30.0d + "'", double14 == 30.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "faculty" + "'", str15, "faculty");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "faculty" + "'", str17, "faculty");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
    }

    @Test
    public void test23190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23190");
        model.Faculty faculty3 = new model.Faculty("faculty", "hi!", "");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getPassword();
        faculty3.viewProfile();
        faculty3.login("faculty", "faculty");
        boolean boolean10 = faculty3.isVerified();
        java.lang.String str11 = faculty3.getID();
        java.lang.String str12 = faculty3.getEmail();
        java.lang.String str13 = faculty3.getID();
        java.lang.String str14 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "faculty" + "'", str12, "faculty");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "faculty" + "'", str14, "faculty");
    }

    @Test
    public void test23191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23191");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        java.lang.String str6 = faculty3.getPassword();
        double double7 = faculty3.getHourlyRate();
        faculty3.logout();
        java.lang.String str9 = faculty3.getAccountType();
        java.lang.String str10 = faculty3.getEmail();
        double double11 = faculty3.getHourlyRate();
        java.lang.String str12 = faculty3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "faculty" + "'", str9, "faculty");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 30.0d + "'", double11 == 30.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test23192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23192");
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
        faculty3.logout();
        faculty3.logout();
        java.lang.String str19 = faculty3.getAccountType();
        java.lang.String str20 = faculty3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "faculty" + "'", str13, "faculty");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "faculty" + "'", str19, "faculty");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test23193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23193");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getEmail();
        boolean boolean6 = faculty3.isVerified();
        boolean boolean7 = faculty3.isVerified();
        faculty3.viewProfile();
        faculty3.setVerified(true);
        boolean boolean11 = faculty3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test23194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23194");
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
        java.lang.String str19 = faculty3.getEmail();
        faculty3.viewProfile();
        java.lang.String str21 = faculty3.getAccountType();
        faculty3.login("faculty", "faculty");
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "faculty" + "'", str21, "faculty");
    }

    @Test
    public void test23195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23195");
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
        boolean boolean19 = faculty3.isVerified();
        java.lang.String str20 = faculty3.getAccountType();
        boolean boolean21 = faculty3.isVerified();
        java.lang.String str22 = faculty3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "faculty" + "'", str10, "faculty");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "faculty" + "'", str16, "faculty");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "faculty" + "'", str20, "faculty");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test23196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23196");
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
        faculty3.login("faculty", "");
        faculty3.viewProfile();
        java.lang.String str22 = faculty3.getPassword();
        boolean boolean23 = faculty3.isVerified();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "faculty" + "'", str16, "faculty");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test23197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23197");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        faculty3.logout();
        faculty3.login("hi!", "hi!");
        faculty3.viewProfile();
        java.lang.String str9 = faculty3.getPassword();
        java.lang.String str10 = faculty3.getID();
        faculty3.logout();
        faculty3.login("", "faculty");
        java.lang.String str15 = faculty3.getID();
        faculty3.setVerified(false);
        java.lang.String str18 = faculty3.getAccountType();
        double double19 = faculty3.getHourlyRate();
        java.lang.String str20 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "faculty" + "'", str18, "faculty");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 30.0d + "'", double19 == 30.0d);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "faculty" + "'", str20, "faculty");
    }

    @Test
    public void test23198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23198");
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
        faculty3.login("hi!", "");
        java.lang.String str20 = faculty3.getAccountType();
        faculty3.login("", "hi!");
        java.lang.String str24 = faculty3.getID();
        java.lang.String str25 = faculty3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 30.0d + "'", double16 == 30.0d);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "faculty" + "'", str20, "faculty");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
    }

    @Test
    public void test23199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23199");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.login("", "");
        faculty3.login("faculty", "faculty");
        java.lang.String str13 = faculty3.getPassword();
        faculty3.login("", "hi!");
        faculty3.viewProfile();
        java.lang.String str18 = faculty3.getAccountType();
        faculty3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "faculty" + "'", str18, "faculty");
    }

    @Test
    public void test23200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23200");
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
        faculty3.logout();
        faculty3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "faculty" + "'", str8, "faculty");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 30.0d + "'", double14 == 30.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "faculty" + "'", str15, "faculty");
    }

    @Test
    public void test23201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23201");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        faculty3.logout();
        java.lang.String str5 = faculty3.getID();
        java.lang.String str6 = faculty3.getEmail();
        java.lang.String str7 = faculty3.getEmail();
        java.lang.String str8 = faculty3.getEmail();
        java.lang.String str9 = faculty3.getID();
        java.lang.String str10 = faculty3.getPassword();
        faculty3.setVerified(false);
        java.lang.String str13 = faculty3.getID();
        java.lang.String str14 = faculty3.getAccountType();
        java.lang.String str15 = faculty3.getAccountType();
        java.lang.String str16 = faculty3.getPassword();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "faculty" + "'", str14, "faculty");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "faculty" + "'", str15, "faculty");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test23202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23202");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "");
        faculty3.logout();
        faculty3.viewProfile();
        faculty3.logout();
        faculty3.viewProfile();
    }

    @Test
    public void test23203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23203");
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
        double double21 = faculty3.getHourlyRate();
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
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 30.0d + "'", double21 == 30.0d);
    }

    @Test
    public void test23204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23204");
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
        faculty3.setVerified(false);
        java.lang.String str17 = faculty3.getAccountType();
        faculty3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "faculty" + "'", str11, "faculty");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "faculty" + "'", str17, "faculty");
    }

    @Test
    public void test23205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23205");
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
        boolean boolean19 = faculty3.isVerified();
        java.lang.String str20 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 30.0d + "'", double16 == 30.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "faculty" + "'", str20, "faculty");
    }

    @Test
    public void test23206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23206");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        faculty3.setVerified(false);
        java.lang.String str6 = faculty3.getPassword();
        java.lang.String str7 = faculty3.getAccountType();
        faculty3.viewProfile();
        faculty3.logout();
        boolean boolean10 = faculty3.isVerified();
        java.lang.String str11 = faculty3.getAccountType();
        faculty3.viewProfile();
        double double13 = faculty3.getHourlyRate();
        faculty3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "faculty" + "'", str7, "faculty");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "faculty" + "'", str11, "faculty");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 30.0d + "'", double13 == 30.0d);
    }

    @Test
    public void test23207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23207");
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
        faculty3.logout();
        java.lang.String str16 = faculty3.getEmail();
        faculty3.logout();
        java.lang.String str18 = faculty3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "faculty" + "'", str12, "faculty");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test23208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23208");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        java.lang.String str4 = faculty3.getAccountType();
        java.lang.String str5 = faculty3.getID();
        faculty3.setVerified(true);
        boolean boolean8 = faculty3.isVerified();
        java.lang.String str9 = faculty3.getID();
        java.lang.String str10 = faculty3.getEmail();
        faculty3.logout();
        java.lang.String str12 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "faculty" + "'", str4, "faculty");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "faculty" + "'", str12, "faculty");
    }

    @Test
    public void test23209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23209");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        faculty3.logout();
        java.lang.String str5 = faculty3.getID();
        java.lang.String str6 = faculty3.getEmail();
        faculty3.viewProfile();
        faculty3.login("hi!", "faculty");
        boolean boolean11 = faculty3.isVerified();
        faculty3.setVerified(false);
        faculty3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test23210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23210");
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
        double double16 = faculty3.getHourlyRate();
        faculty3.logout();
        java.lang.String str18 = faculty3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "faculty" + "'", str12, "faculty");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 30.0d + "'", double16 == 30.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test23211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23211");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        faculty3.setVerified(false);
        faculty3.viewProfile();
        java.lang.String str7 = faculty3.getEmail();
        java.lang.String str8 = faculty3.getAccountType();
        faculty3.logout();
        faculty3.login("", "");
        faculty3.viewProfile();
        faculty3.logout();
        java.lang.String str15 = faculty3.getAccountType();
        faculty3.logout();
        faculty3.setVerified(true);
        java.lang.String str19 = faculty3.getEmail();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "faculty" + "'", str8, "faculty");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "faculty" + "'", str15, "faculty");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test23212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23212");
        model.Faculty faculty3 = new model.Faculty("", "faculty", "");
        faculty3.setVerified(true);
        faculty3.logout();
        faculty3.setVerified(true);
        faculty3.logout();
        faculty3.login("", "faculty");
        java.lang.String str13 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "faculty" + "'", str13, "faculty");
    }

    @Test
    public void test23213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23213");
        model.Faculty faculty3 = new model.Faculty("", "", "faculty");
        faculty3.login("faculty", "faculty");
        java.lang.Class<?> wildcardClass7 = faculty3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test23214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23214");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.viewProfile();
        java.lang.String str8 = faculty3.getAccountType();
        java.lang.String str9 = faculty3.getAccountType();
        java.lang.String str10 = faculty3.getEmail();
        faculty3.logout();
        faculty3.login("hi!", "hi!");
        java.lang.String str15 = faculty3.getEmail();
        java.lang.String str16 = faculty3.getPassword();
        faculty3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "faculty" + "'", str8, "faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "faculty" + "'", str9, "faculty");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test23215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23215");
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
        faculty3.login("hi!", "");
        boolean boolean20 = faculty3.isVerified();
        faculty3.login("", "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 30.0d + "'", double16 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test23216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23216");
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
        java.lang.String str20 = faculty3.getAccountType();
        java.lang.String str21 = faculty3.getAccountType();
        boolean boolean22 = faculty3.isVerified();
        java.lang.String str23 = faculty3.getAccountType();
        boolean boolean24 = faculty3.isVerified();
        faculty3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 30.0d + "'", double11 == 30.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "faculty" + "'", str20, "faculty");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "faculty" + "'", str21, "faculty");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "faculty" + "'", str23, "faculty");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test23217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23217");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        java.lang.String str7 = faculty3.getID();
        faculty3.setVerified(true);
        java.lang.String str10 = faculty3.getEmail();
        faculty3.logout();
        faculty3.setVerified(false);
        java.lang.String str14 = faculty3.getID();
        java.lang.String str15 = faculty3.getEmail();
        java.lang.String str16 = faculty3.getEmail();
        boolean boolean17 = faculty3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test23218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23218");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        faculty3.login("", "");
        double double7 = faculty3.getHourlyRate();
        faculty3.login("faculty", "faculty");
        java.lang.String str11 = faculty3.getID();
        java.lang.String str12 = faculty3.getAccountType();
        faculty3.logout();
        java.lang.String str14 = faculty3.getAccountType();
        faculty3.logout();
        java.lang.String str16 = faculty3.getAccountType();
        java.lang.Class<?> wildcardClass17 = faculty3.getClass();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "faculty" + "'", str12, "faculty");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "faculty" + "'", str14, "faculty");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "faculty" + "'", str16, "faculty");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test23219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23219");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        java.lang.String str6 = faculty3.getPassword();
        double double7 = faculty3.getHourlyRate();
        faculty3.logout();
        boolean boolean9 = faculty3.isVerified();
        faculty3.login("hi!", "hi!");
        faculty3.setVerified(false);
        faculty3.viewProfile();
        java.lang.String str16 = faculty3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test23220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23220");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.viewProfile();
        boolean boolean8 = faculty3.isVerified();
        double double9 = faculty3.getHourlyRate();
        java.lang.String str10 = faculty3.getEmail();
        double double11 = faculty3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 30.0d + "'", double9 == 30.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 30.0d + "'", double11 == 30.0d);
    }

    @Test
    public void test23221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23221");
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
        faculty3.setVerified(false);
        faculty3.login("hi!", "faculty");
        faculty3.login("faculty", "");
        faculty3.login("hi!", "faculty");
        java.lang.String str28 = faculty3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 30.0d + "'", double15 == 30.0d);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test23222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23222");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        java.lang.String str6 = faculty3.getPassword();
        java.lang.String str7 = faculty3.getPassword();
        faculty3.login("hi!", "hi!");
        boolean boolean11 = faculty3.isVerified();
        java.lang.String str12 = faculty3.getEmail();
        java.lang.String str13 = faculty3.getAccountType();
        faculty3.setVerified(false);
        double double16 = faculty3.getHourlyRate();
        boolean boolean17 = faculty3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "faculty" + "'", str13, "faculty");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 30.0d + "'", double16 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test23223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23223");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "faculty");
        faculty3.setVerified(false);
        java.lang.String str6 = faculty3.getID();
        java.lang.String str7 = faculty3.getAccountType();
        faculty3.viewProfile();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "faculty" + "'", str7, "faculty");
    }

    @Test
    public void test23224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23224");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        java.lang.String str8 = faculty3.getAccountType();
        faculty3.setVerified(false);
        faculty3.viewProfile();
        faculty3.viewProfile();
        faculty3.login("hi!", "");
        double double16 = faculty3.getHourlyRate();
        faculty3.login("hi!", "hi!");
        java.lang.String str20 = faculty3.getID();
        java.lang.String str21 = faculty3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "faculty" + "'", str8, "faculty");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 30.0d + "'", double16 == 30.0d);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test23225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23225");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        faculty3.logout();
        java.lang.String str5 = faculty3.getID();
        java.lang.String str6 = faculty3.getEmail();
        faculty3.viewProfile();
        faculty3.setVerified(false);
        java.lang.String str10 = faculty3.getAccountType();
        java.lang.String str11 = faculty3.getEmail();
        faculty3.setVerified(true);
        java.lang.String str14 = faculty3.getAccountType();
        faculty3.viewProfile();
        double double16 = faculty3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "faculty" + "'", str10, "faculty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "faculty" + "'", str14, "faculty");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 30.0d + "'", double16 == 30.0d);
    }

    @Test
    public void test23226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23226");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        java.lang.String str6 = faculty3.getPassword();
        java.lang.String str7 = faculty3.getPassword();
        java.lang.String str8 = faculty3.getID();
        java.lang.String str9 = faculty3.getID();
        faculty3.viewProfile();
        java.lang.String str11 = faculty3.getPassword();
        faculty3.viewProfile();
        faculty3.login("", "");
        java.lang.String str16 = faculty3.getPassword();
        java.lang.String str17 = faculty3.getPassword();
        java.lang.String str18 = faculty3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test23227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23227");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        java.lang.String str4 = faculty3.getAccountType();
        java.lang.String str5 = faculty3.getID();
        faculty3.setVerified(true);
        faculty3.login("faculty", "faculty");
        java.lang.String str11 = faculty3.getPassword();
        java.lang.String str12 = faculty3.getEmail();
        boolean boolean13 = faculty3.isVerified();
        java.lang.String str14 = faculty3.getPassword();
        faculty3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "faculty" + "'", str4, "faculty");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test23228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23228");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        faculty3.logout();
        java.lang.String str5 = faculty3.getID();
        java.lang.String str6 = faculty3.getPassword();
        double double7 = faculty3.getHourlyRate();
        faculty3.login("faculty", "hi!");
        java.lang.String str11 = faculty3.getID();
        java.lang.String str12 = faculty3.getID();
        faculty3.logout();
        faculty3.login("faculty", "hi!");
        boolean boolean17 = faculty3.isVerified();
        faculty3.logout();
        double double19 = faculty3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 30.0d + "'", double19 == 30.0d);
    }

    @Test
    public void test23229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23229");
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
        java.lang.String str14 = faculty3.getAccountType();
        java.lang.String str15 = faculty3.getEmail();
        faculty3.viewProfile();
        java.lang.String str17 = faculty3.getPassword();
        java.lang.Class<?> wildcardClass18 = faculty3.getClass();
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
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "faculty" + "'", str14, "faculty");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test23230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23230");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        java.lang.String str8 = faculty3.getAccountType();
        java.lang.String str9 = faculty3.getAccountType();
        faculty3.setVerified(true);
        faculty3.setVerified(true);
        java.lang.String str14 = faculty3.getPassword();
        java.lang.String str15 = faculty3.getID();
        faculty3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "faculty" + "'", str8, "faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "faculty" + "'", str9, "faculty");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test23231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23231");
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
        java.lang.String str15 = faculty3.getAccountType();
        java.lang.String str16 = faculty3.getAccountType();
        boolean boolean17 = faculty3.isVerified();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "faculty" + "'", str7, "faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "faculty" + "'", str15, "faculty");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "faculty" + "'", str16, "faculty");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test23232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23232");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        faculty3.logout();
        java.lang.String str5 = faculty3.getID();
        java.lang.String str6 = faculty3.getEmail();
        double double7 = faculty3.getHourlyRate();
        boolean boolean8 = faculty3.isVerified();
        java.lang.String str9 = faculty3.getID();
        java.lang.String str10 = faculty3.getAccountType();
        double double11 = faculty3.getHourlyRate();
        java.lang.String str12 = faculty3.getPassword();
        java.lang.String str13 = faculty3.getEmail();
        faculty3.setVerified(false);
        double double16 = faculty3.getHourlyRate();
        faculty3.viewProfile();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "faculty" + "'", str10, "faculty");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 30.0d + "'", double11 == 30.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 30.0d + "'", double16 == 30.0d);
    }

    @Test
    public void test23233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23233");
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
        faculty3.login("faculty", "faculty");
        faculty3.setVerified(true);
        boolean boolean23 = faculty3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "faculty" + "'", str8, "faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "faculty" + "'", str9, "faculty");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test23234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23234");
        model.Faculty faculty3 = new model.Faculty("hi!", "hi!", "hi!");
        faculty3.login("hi!", "faculty");
        faculty3.logout();
        java.lang.String str8 = faculty3.getPassword();
        faculty3.viewProfile();
        boolean boolean10 = faculty3.isVerified();
        java.lang.String str11 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "faculty" + "'", str11, "faculty");
    }

    @Test
    public void test23235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23235");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        java.lang.String str6 = faculty3.getPassword();
        faculty3.setVerified(false);
        faculty3.setVerified(false);
        java.lang.String str11 = faculty3.getAccountType();
        faculty3.logout();
        java.lang.String str13 = faculty3.getEmail();
        double double14 = faculty3.getHourlyRate();
        java.lang.String str15 = faculty3.getEmail();
        java.lang.String str16 = faculty3.getAccountType();
        java.lang.String str17 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "faculty" + "'", str11, "faculty");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 30.0d + "'", double14 == 30.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "faculty" + "'", str16, "faculty");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "faculty" + "'", str17, "faculty");
    }

    @Test
    public void test23236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23236");
        model.Faculty faculty3 = new model.Faculty("faculty", "", "faculty");
        faculty3.setVerified(false);
        faculty3.viewProfile();
        java.lang.String str7 = faculty3.getEmail();
        java.lang.String str8 = faculty3.getPassword();
        java.lang.String str9 = faculty3.getID();
        java.lang.String str10 = faculty3.getEmail();
        faculty3.viewProfile();
        faculty3.viewProfile();
        faculty3.viewProfile();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "faculty" + "'", str7, "faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "faculty" + "'", str9, "faculty");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "faculty" + "'", str10, "faculty");
    }

    @Test
    public void test23237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23237");
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
        java.lang.String str16 = faculty3.getPassword();
        faculty3.login("faculty", "");
        java.lang.String str20 = faculty3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "faculty" + "'", str11, "faculty");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 30.0d + "'", double13 == 30.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test23238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23238");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getAccountType();
        faculty3.login("hi!", "");
        java.lang.String str10 = faculty3.getID();
        faculty3.logout();
        java.lang.String str12 = faculty3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test23239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23239");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        java.lang.String str4 = faculty3.getAccountType();
        java.lang.String str5 = faculty3.getEmail();
        double double6 = faculty3.getHourlyRate();
        faculty3.viewProfile();
        faculty3.setVerified(true);
        java.lang.String str10 = faculty3.getID();
        java.lang.String str11 = faculty3.getEmail();
        faculty3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "faculty" + "'", str4, "faculty");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test23240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23240");
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
        faculty3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 30.0d + "'", double10 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test23241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23241");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        double double6 = faculty3.getHourlyRate();
        java.lang.String str7 = faculty3.getPassword();
        java.lang.String str8 = faculty3.getPassword();
        faculty3.login("faculty", "hi!");
        double double12 = faculty3.getHourlyRate();
        java.lang.String str13 = faculty3.getAccountType();
        boolean boolean14 = faculty3.isVerified();
        java.lang.String str15 = faculty3.getID();
        faculty3.setVerified(true);
        faculty3.login("hi!", "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 30.0d + "'", double12 == 30.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "faculty" + "'", str13, "faculty");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test23242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23242");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        double double6 = faculty3.getHourlyRate();
        faculty3.logout();
        faculty3.setVerified(true);
        java.lang.String str10 = faculty3.getEmail();
        java.lang.String str11 = faculty3.getID();
        boolean boolean12 = faculty3.isVerified();
        java.lang.String str13 = faculty3.getPassword();
        java.lang.String str14 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "faculty" + "'", str14, "faculty");
    }

    @Test
    public void test23243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23243");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        java.lang.String str8 = faculty3.getPassword();
        java.lang.String str9 = faculty3.getEmail();
        double double10 = faculty3.getHourlyRate();
        faculty3.logout();
        java.lang.String str12 = faculty3.getID();
        faculty3.viewProfile();
        faculty3.setVerified(true);
        faculty3.logout();
        java.lang.String str17 = faculty3.getPassword();
        faculty3.viewProfile();
        faculty3.login("", "faculty");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 30.0d + "'", double10 == 30.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test23244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23244");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        boolean boolean7 = faculty3.isVerified();
        java.lang.String str8 = faculty3.getEmail();
        faculty3.logout();
        java.lang.String str10 = faculty3.getPassword();
        java.lang.String str11 = faculty3.getAccountType();
        faculty3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "faculty" + "'", str11, "faculty");
    }

    @Test
    public void test23245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23245");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getAccountType();
        java.lang.String str7 = faculty3.getAccountType();
        java.lang.String str8 = faculty3.getEmail();
        java.lang.String str9 = faculty3.getID();
        java.lang.String str10 = faculty3.getEmail();
        double double11 = faculty3.getHourlyRate();
        boolean boolean12 = faculty3.isVerified();
        faculty3.login("hi!", "hi!");
        java.lang.String str16 = faculty3.getID();
        faculty3.login("hi!", "faculty");
        java.lang.String str20 = faculty3.getAccountType();
        faculty3.login("", "hi!");
        faculty3.login("faculty", "faculty");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "faculty" + "'", str7, "faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 30.0d + "'", double11 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "faculty" + "'", str20, "faculty");
    }

    @Test
    public void test23246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23246");
        model.Faculty faculty3 = new model.Faculty("", "", "faculty");
        java.lang.String str4 = faculty3.getID();
        double double5 = faculty3.getHourlyRate();
        faculty3.logout();
        java.lang.String str7 = faculty3.getPassword();
        faculty3.viewProfile();
        faculty3.viewProfile();
        faculty3.logout();
        faculty3.viewProfile();
        java.lang.String str12 = faculty3.getID();
        java.lang.Class<?> wildcardClass13 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "faculty" + "'", str4, "faculty");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 30.0d + "'", double5 == 30.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "faculty" + "'", str12, "faculty");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test23247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23247");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        double double6 = faculty3.getHourlyRate();
        java.lang.String str7 = faculty3.getPassword();
        faculty3.logout();
        java.lang.String str9 = faculty3.getEmail();
        java.lang.String str10 = faculty3.getID();
        java.lang.String str11 = faculty3.getPassword();
        java.lang.String str12 = faculty3.getEmail();
        java.lang.String str13 = faculty3.getPassword();
        faculty3.login("faculty", "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test23248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23248");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        boolean boolean7 = faculty3.isVerified();
        faculty3.login("", "hi!");
        boolean boolean11 = faculty3.isVerified();
        double double12 = faculty3.getHourlyRate();
        faculty3.logout();
        faculty3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 30.0d + "'", double12 == 30.0d);
    }

    @Test
    public void test23249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23249");
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
        boolean boolean18 = faculty3.isVerified();
        java.lang.String str19 = faculty3.getAccountType();
        java.lang.String str20 = faculty3.getEmail();
        boolean boolean21 = faculty3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 30.0d + "'", double16 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "faculty" + "'", str19, "faculty");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test23250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23250");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        java.lang.String str7 = faculty3.getID();
        java.lang.String str8 = faculty3.getEmail();
        java.lang.String str9 = faculty3.getAccountType();
        faculty3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "faculty" + "'", str9, "faculty");
    }

    @Test
    public void test23251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23251");
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
        faculty3.logout();
        double double17 = faculty3.getHourlyRate();
        faculty3.login("faculty", "hi!");
        boolean boolean21 = faculty3.isVerified();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 30.0d + "'", double10 == 30.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 30.0d + "'", double17 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test23252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23252");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        boolean boolean7 = faculty3.isVerified();
        faculty3.logout();
        java.lang.String str9 = faculty3.getID();
        faculty3.setVerified(true);
        faculty3.setVerified(true);
        faculty3.login("faculty", "faculty");
        java.lang.String str17 = faculty3.getEmail();
        java.lang.String str18 = faculty3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test23253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23253");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        faculty3.setVerified(false);
        java.lang.String str6 = faculty3.getEmail();
        faculty3.setVerified(false);
        faculty3.login("faculty", "hi!");
        java.lang.String str12 = faculty3.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test23254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23254");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        faculty3.logout();
        java.lang.String str5 = faculty3.getID();
        java.lang.String str6 = faculty3.getPassword();
        faculty3.logout();
        faculty3.login("faculty", "hi!");
        java.lang.String str11 = faculty3.getID();
        faculty3.login("", "faculty");
        boolean boolean15 = faculty3.isVerified();
        faculty3.logout();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test23255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23255");
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
        faculty3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test23256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23256");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        java.lang.String str7 = faculty3.getID();
        faculty3.setVerified(true);
        java.lang.String str10 = faculty3.getEmail();
        faculty3.setVerified(false);
        boolean boolean13 = faculty3.isVerified();
        java.lang.String str14 = faculty3.getEmail();
        faculty3.setVerified(true);
        java.lang.String str17 = faculty3.getEmail();
        double double18 = faculty3.getHourlyRate();
        java.lang.Class<?> wildcardClass19 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 30.0d + "'", double18 == 30.0d);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test23257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23257");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        java.lang.String str4 = faculty3.getAccountType();
        java.lang.String str5 = faculty3.getID();
        faculty3.setVerified(true);
        java.lang.String str8 = faculty3.getAccountType();
        faculty3.viewProfile();
        java.lang.String str10 = faculty3.getPassword();
        java.lang.String str11 = faculty3.getPassword();
        faculty3.viewProfile();
        faculty3.login("faculty", "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "faculty" + "'", str4, "faculty");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "faculty" + "'", str8, "faculty");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test23258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23258");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        faculty3.setVerified(false);
        java.lang.String str10 = faculty3.getEmail();
        faculty3.logout();
        faculty3.login("", "");
        java.lang.String str15 = faculty3.getEmail();
        boolean boolean16 = faculty3.isVerified();
        faculty3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test23259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23259");
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
        java.lang.String str16 = faculty3.getAccountType();
        faculty3.logout();
        faculty3.logout();
        faculty3.logout();
        double double20 = faculty3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "faculty" + "'", str15, "faculty");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "faculty" + "'", str16, "faculty");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 30.0d + "'", double20 == 30.0d);
    }

    @Test
    public void test23260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23260");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        faculty3.setVerified(false);
        faculty3.viewProfile();
        java.lang.String str7 = faculty3.getEmail();
        faculty3.login("hi!", "hi!");
        double double11 = faculty3.getHourlyRate();
        java.lang.Class<?> wildcardClass12 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 30.0d + "'", double11 == 30.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test23261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23261");
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
        boolean boolean17 = faculty3.isVerified();
        double double18 = faculty3.getHourlyRate();
        java.lang.String str19 = faculty3.getAccountType();
        faculty3.login("hi!", "");
        java.lang.String str23 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "faculty" + "'", str8, "faculty");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 30.0d + "'", double14 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 30.0d + "'", double18 == 30.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "faculty" + "'", str19, "faculty");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "faculty" + "'", str23, "faculty");
    }

    @Test
    public void test23262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23262");
        model.Faculty faculty3 = new model.Faculty("", "faculty", "");
        faculty3.login("faculty", "");
        faculty3.logout();
        java.lang.String str8 = faculty3.getEmail();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test23263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23263");
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
        faculty3.viewProfile();
        java.lang.String str18 = faculty3.getAccountType();
        java.lang.String str19 = faculty3.getAccountType();
        faculty3.setVerified(false);
        java.lang.String str22 = faculty3.getAccountType();
        faculty3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "faculty" + "'", str18, "faculty");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "faculty" + "'", str19, "faculty");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "faculty" + "'", str22, "faculty");
    }

    @Test
    public void test23264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23264");
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
        boolean boolean21 = faculty3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 30.0d + "'", double10 == 30.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "faculty" + "'", str13, "faculty");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test23265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23265");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        java.lang.String str8 = faculty3.getPassword();
        faculty3.setVerified(false);
        faculty3.logout();
        faculty3.viewProfile();
        faculty3.setVerified(true);
        faculty3.setVerified(false);
        java.lang.String str17 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "faculty" + "'", str17, "faculty");
    }

    @Test
    public void test23266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23266");
        model.Faculty faculty3 = new model.Faculty("", "faculty", "hi!");
        java.lang.String str4 = faculty3.getPassword();
        java.lang.String str5 = faculty3.getPassword();
        java.lang.String str6 = faculty3.getID();
        faculty3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "faculty" + "'", str4, "faculty");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test23267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23267");
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
        java.lang.String str16 = faculty3.getPassword();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "faculty" + "'", str11, "faculty");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test23268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23268");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        faculty3.logout();
        java.lang.String str5 = faculty3.getID();
        java.lang.String str6 = faculty3.getEmail();
        double double7 = faculty3.getHourlyRate();
        java.lang.String str8 = faculty3.getPassword();
        faculty3.login("hi!", "hi!");
        faculty3.logout();
        faculty3.login("faculty", "hi!");
        java.lang.String str16 = faculty3.getPassword();
        faculty3.login("faculty", "faculty");
        faculty3.viewProfile();
        java.lang.String str21 = faculty3.getPassword();
        faculty3.logout();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test23269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23269");
        model.Faculty faculty3 = new model.Faculty("faculty", "hi!", "");
        faculty3.login("hi!", "hi!");
        faculty3.logout();
        java.lang.String str8 = faculty3.getEmail();
        faculty3.setVerified(false);
        java.lang.String str11 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "faculty" + "'", str8, "faculty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "faculty" + "'", str11, "faculty");
    }

    @Test
    public void test23270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23270");
        model.Faculty faculty3 = new model.Faculty("faculty", "hi!", "");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        faculty3.setVerified(false);
        faculty3.setVerified(true);
        faculty3.login("", "hi!");
        faculty3.viewProfile();
        faculty3.login("", "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test23271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23271");
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
        java.lang.String str17 = faculty3.getEmail();
        faculty3.setVerified(false);
        faculty3.logout();
        faculty3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "faculty" + "'", str12, "faculty");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test23272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23272");
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
        java.lang.String str16 = faculty3.getEmail();
        faculty3.logout();
        faculty3.viewProfile();
        java.lang.String str19 = faculty3.getID();
        faculty3.login("faculty", "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "faculty" + "'", str13, "faculty");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "faculty" + "'", str14, "faculty");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test23273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23273");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.login("", "");
        java.lang.String str10 = faculty3.getID();
        java.lang.String str11 = faculty3.getPassword();
        faculty3.login("faculty", "hi!");
        double double15 = faculty3.getHourlyRate();
        faculty3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 30.0d + "'", double15 == 30.0d);
    }

    @Test
    public void test23274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23274");
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
        boolean boolean15 = faculty3.isVerified();
        java.lang.String str16 = faculty3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test23275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23275");
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
        java.lang.String str13 = faculty3.getPassword();
        faculty3.setVerified(true);
        java.lang.String str16 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "faculty" + "'", str9, "faculty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "faculty" + "'", str16, "faculty");
    }

    @Test
    public void test23276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23276");
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
        faculty3.login("hi!", "");
        faculty3.login("hi!", "");
        faculty3.setVerified(true);
        faculty3.viewProfile();
        java.lang.String str23 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 30.0d + "'", double13 == 30.0d);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "faculty" + "'", str23, "faculty");
    }

    @Test
    public void test23277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23277");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getAccountType();
        faculty3.logout();
        java.lang.String str8 = faculty3.getEmail();
        faculty3.viewProfile();
        double double10 = faculty3.getHourlyRate();
        boolean boolean11 = faculty3.isVerified();
        java.lang.String str12 = faculty3.getPassword();
        java.lang.Class<?> wildcardClass13 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 30.0d + "'", double10 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test23278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23278");
        model.Faculty faculty3 = new model.Faculty("faculty", "hi!", "faculty");
        boolean boolean4 = faculty3.isVerified();
        java.lang.String str5 = faculty3.getAccountType();
        double double6 = faculty3.getHourlyRate();
        double double7 = faculty3.getHourlyRate();
        faculty3.viewProfile();
        faculty3.setVerified(true);
        faculty3.login("faculty", "faculty");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
    }

    @Test
    public void test23279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23279");
        model.Faculty faculty3 = new model.Faculty("hi!", "faculty", "");
        java.lang.String str4 = faculty3.getEmail();
        double double5 = faculty3.getHourlyRate();
        faculty3.login("", "faculty");
        java.lang.String str9 = faculty3.getID();
        faculty3.viewProfile();
        java.lang.Class<?> wildcardClass11 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 30.0d + "'", double5 == 30.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test23280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23280");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        faculty3.logout();
        faculty3.login("hi!", "hi!");
        double double8 = faculty3.getHourlyRate();
        boolean boolean9 = faculty3.isVerified();
        java.lang.String str10 = faculty3.getAccountType();
        java.lang.String str11 = faculty3.getPassword();
        java.lang.String str12 = faculty3.getID();
        java.lang.String str13 = faculty3.getID();
        boolean boolean14 = faculty3.isVerified();
        faculty3.login("hi!", "faculty");
        faculty3.login("faculty", "faculty");
        faculty3.logout();
        boolean boolean22 = faculty3.isVerified();
        faculty3.logout();
        double double24 = faculty3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "faculty" + "'", str10, "faculty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 30.0d + "'", double24 == 30.0d);
    }

    @Test
    public void test23281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23281");
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
        faculty3.logout();
        boolean boolean24 = faculty3.isVerified();
        java.lang.String str25 = faculty3.getAccountType();
        java.lang.String str26 = faculty3.getAccountType();
        faculty3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 30.0d + "'", double11 == 30.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "faculty" + "'", str25, "faculty");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "faculty" + "'", str26, "faculty");
    }

    @Test
    public void test23282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23282");
        model.Faculty faculty3 = new model.Faculty("hi!", "faculty", "");
        java.lang.String str4 = faculty3.getEmail();
        faculty3.viewProfile();
        java.lang.String str6 = faculty3.getAccountType();
        faculty3.viewProfile();
        java.lang.String str8 = faculty3.getID();
        faculty3.logout();
        java.lang.String str10 = faculty3.getID();
        faculty3.logout();
        java.lang.String str12 = faculty3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "faculty" + "'", str12, "faculty");
    }

    @Test
    public void test23283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23283");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        boolean boolean7 = faculty3.isVerified();
        java.lang.String str8 = faculty3.getID();
        java.lang.String str9 = faculty3.getAccountType();
        java.lang.String str10 = faculty3.getID();
        java.lang.String str11 = faculty3.getEmail();
        java.lang.String str12 = faculty3.getEmail();
        boolean boolean13 = faculty3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "faculty" + "'", str9, "faculty");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test23284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23284");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        faculty3.logout();
        java.lang.String str5 = faculty3.getID();
        java.lang.String str6 = faculty3.getPassword();
        faculty3.logout();
        faculty3.viewProfile();
        faculty3.setVerified(true);
        java.lang.String str11 = faculty3.getEmail();
        java.lang.String str12 = faculty3.getEmail();
        faculty3.logout();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test23285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23285");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getAccountType();
        faculty3.login("hi!", "hi!");
        faculty3.logout();
        java.lang.String str11 = faculty3.getPassword();
        java.lang.String str12 = faculty3.getAccountType();
        double double13 = faculty3.getHourlyRate();
        faculty3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "faculty" + "'", str12, "faculty");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 30.0d + "'", double13 == 30.0d);
    }

    @Test
    public void test23286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23286");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getAccountType();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        boolean boolean7 = faculty3.isVerified();
        java.lang.String str8 = faculty3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "faculty" + "'", str4, "faculty");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test23287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23287");
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
        double double14 = faculty3.getHourlyRate();
        faculty3.viewProfile();
        double double16 = faculty3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 30.0d + "'", double14 == 30.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 30.0d + "'", double16 == 30.0d);
    }

    @Test
    public void test23288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23288");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        java.lang.String str4 = faculty3.getAccountType();
        java.lang.String str5 = faculty3.getEmail();
        faculty3.viewProfile();
        faculty3.logout();
        faculty3.login("faculty", "faculty");
        double double11 = faculty3.getHourlyRate();
        java.lang.String str12 = faculty3.getPassword();
        faculty3.login("faculty", "faculty");
        java.lang.String str16 = faculty3.getPassword();
        java.lang.String str17 = faculty3.getEmail();
        faculty3.setVerified(true);
        java.lang.String str20 = faculty3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "faculty" + "'", str4, "faculty");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 30.0d + "'", double11 == 30.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test23289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23289");
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
        java.lang.String str20 = faculty3.getEmail();
        java.lang.String str21 = faculty3.getPassword();
        java.lang.String str22 = faculty3.getID();
        faculty3.viewProfile();
        boolean boolean24 = faculty3.isVerified();
        java.lang.Class<?> wildcardClass25 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "faculty" + "'", str19, "faculty");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test23290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23290");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.viewProfile();
        boolean boolean8 = faculty3.isVerified();
        java.lang.String str9 = faculty3.getEmail();
        java.lang.String str10 = faculty3.getPassword();
        faculty3.login("hi!", "faculty");
        faculty3.setVerified(false);
        faculty3.login("hi!", "faculty");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test23291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23291");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        java.lang.String str4 = faculty3.getAccountType();
        java.lang.String str5 = faculty3.getEmail();
        java.lang.String str6 = faculty3.getAccountType();
        java.lang.String str7 = faculty3.getAccountType();
        boolean boolean8 = faculty3.isVerified();
        faculty3.setVerified(false);
        boolean boolean11 = faculty3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "faculty" + "'", str4, "faculty");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "faculty" + "'", str7, "faculty");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test23292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23292");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        boolean boolean7 = faculty3.isVerified();
        faculty3.logout();
        java.lang.String str9 = faculty3.getID();
        faculty3.setVerified(true);
        faculty3.setVerified(true);
        java.lang.String str14 = faculty3.getAccountType();
        java.lang.String str15 = faculty3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "faculty" + "'", str14, "faculty");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test23293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23293");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.login("", "");
        faculty3.login("faculty", "faculty");
        java.lang.String str13 = faculty3.getAccountType();
        java.lang.String str14 = faculty3.getEmail();
        java.lang.String str15 = faculty3.getPassword();
        java.lang.String str16 = faculty3.getPassword();
        faculty3.setVerified(false);
        java.lang.String str19 = faculty3.getID();
        java.lang.String str20 = faculty3.getAccountType();
        java.lang.String str21 = faculty3.getEmail();
        java.lang.String str22 = faculty3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "faculty" + "'", str13, "faculty");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "faculty" + "'", str20, "faculty");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test23294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23294");
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
        faculty3.setVerified(true);
        java.lang.String str19 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "faculty" + "'", str12, "faculty");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "faculty" + "'", str19, "faculty");
    }

    @Test
    public void test23295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23295");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        java.lang.String str7 = faculty3.getID();
        faculty3.setVerified(true);
        java.lang.String str10 = faculty3.getPassword();
        faculty3.login("faculty", "faculty");
        java.lang.String str14 = faculty3.getID();
        faculty3.setVerified(false);
        java.lang.String str17 = faculty3.getAccountType();
        java.lang.String str18 = faculty3.getPassword();
        java.lang.String str19 = faculty3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "faculty" + "'", str17, "faculty");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test23296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23296");
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
        java.lang.String str18 = faculty3.getAccountType();
        java.lang.String str19 = faculty3.getID();
        java.lang.String str20 = faculty3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "faculty" + "'", str18, "faculty");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test23297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23297");
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
        faculty3.login("hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test23298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23298");
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
        double double15 = faculty3.getHourlyRate();
        faculty3.setVerified(false);
        boolean boolean18 = faculty3.isVerified();
        java.lang.String str19 = faculty3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "faculty" + "'", str14, "faculty");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 30.0d + "'", double15 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test23299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23299");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        java.lang.String str8 = faculty3.getEmail();
        faculty3.setVerified(true);
        faculty3.login("faculty", "faculty");
        faculty3.setVerified(true);
        faculty3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test23300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23300");
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
        java.lang.String str14 = faculty3.getID();
        faculty3.setVerified(true);
        java.lang.String str17 = faculty3.getAccountType();
        faculty3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 30.0d + "'", double10 == 30.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "faculty" + "'", str17, "faculty");
    }

    @Test
    public void test23301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23301");
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
        faculty3.logout();
        boolean boolean16 = faculty3.isVerified();
        java.lang.String str17 = faculty3.getEmail();
        boolean boolean18 = faculty3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test23302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23302");
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
        double double19 = faculty3.getHourlyRate();
        faculty3.login("faculty", "hi!");
        faculty3.login("", "faculty");
        java.lang.String str26 = faculty3.getEmail();
        faculty3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "faculty" + "'", str10, "faculty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 30.0d + "'", double15 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 30.0d + "'", double19 == 30.0d);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test23303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23303");
        model.Faculty faculty3 = new model.Faculty("hi!", "hi!", "hi!");
        faculty3.login("hi!", "faculty");
        faculty3.logout();
        java.lang.String str8 = faculty3.getPassword();
        faculty3.logout();
        faculty3.logout();
        faculty3.logout();
        java.lang.String str12 = faculty3.getEmail();
        faculty3.setVerified(false);
        double double15 = faculty3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 30.0d + "'", double15 == 30.0d);
    }

    @Test
    public void test23304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23304");
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
        faculty3.logout();
        faculty3.setVerified(false);
        java.lang.String str26 = faculty3.getEmail();
        boolean boolean27 = faculty3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 30.0d + "'", double11 == 30.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test23305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23305");
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
        faculty3.logout();
        java.lang.String str21 = faculty3.getEmail();
        faculty3.logout();
        java.lang.String str23 = faculty3.getAccountType();
        faculty3.login("hi!", "faculty");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 30.0d + "'", double18 == 30.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "faculty" + "'", str23, "faculty");
    }

    @Test
    public void test23306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23306");
        model.Faculty faculty3 = new model.Faculty("", "faculty", "");
        faculty3.setVerified(true);
        faculty3.login("", "hi!");
        faculty3.viewProfile();
        faculty3.viewProfile();
        boolean boolean11 = faculty3.isVerified();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test23307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23307");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        java.lang.String str7 = faculty3.getID();
        faculty3.login("hi!", "");
        java.lang.String str11 = faculty3.getPassword();
        boolean boolean12 = faculty3.isVerified();
        boolean boolean13 = faculty3.isVerified();
        faculty3.setVerified(true);
        faculty3.setVerified(true);
        java.lang.String str18 = faculty3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test23308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23308");
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
        faculty3.viewProfile();
        faculty3.login("faculty", "hi!");
        faculty3.viewProfile();
        java.lang.String str21 = faculty3.getID();
        faculty3.login("", "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "faculty" + "'", str15, "faculty");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test23309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23309");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        java.lang.String str4 = faculty3.getAccountType();
        java.lang.String str5 = faculty3.getID();
        faculty3.setVerified(true);
        faculty3.login("faculty", "faculty");
        java.lang.String str11 = faculty3.getPassword();
        java.lang.String str12 = faculty3.getEmail();
        faculty3.logout();
        java.lang.String str14 = faculty3.getPassword();
        java.lang.String str15 = faculty3.getEmail();
        faculty3.login("faculty", "faculty");
        java.lang.String str19 = faculty3.getID();
        java.lang.String str20 = faculty3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "faculty" + "'", str4, "faculty");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test23310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23310");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        double double6 = faculty3.getHourlyRate();
        java.lang.String str7 = faculty3.getEmail();
        java.lang.String str8 = faculty3.getEmail();
        java.lang.String str9 = faculty3.getPassword();
        java.lang.String str10 = faculty3.getEmail();
        boolean boolean11 = faculty3.isVerified();
        java.lang.String str12 = faculty3.getEmail();
        java.lang.String str13 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "faculty" + "'", str13, "faculty");
    }

    @Test
    public void test23311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23311");
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
        faculty3.logout();
        faculty3.logout();
        java.lang.String str19 = faculty3.getEmail();
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test23312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23312");
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
        faculty3.login("faculty", "");
        java.lang.Class<?> wildcardClass21 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "faculty" + "'", str13, "faculty");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test23313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23313");
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
        boolean boolean18 = faculty3.isVerified();
        boolean boolean19 = faculty3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 30.0d + "'", double14 == 30.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test23314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23314");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        java.lang.String str6 = faculty3.getPassword();
        faculty3.setVerified(false);
        faculty3.setVerified(false);
        java.lang.String str11 = faculty3.getAccountType();
        faculty3.logout();
        faculty3.viewProfile();
        java.lang.String str14 = faculty3.getAccountType();
        faculty3.logout();
        boolean boolean16 = faculty3.isVerified();
        java.lang.String str17 = faculty3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "faculty" + "'", str11, "faculty");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "faculty" + "'", str14, "faculty");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test23315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23315");
        model.Faculty faculty3 = new model.Faculty("hi!", "hi!", "hi!");
        faculty3.login("hi!", "faculty");
        faculty3.logout();
        faculty3.viewProfile();
        java.lang.String str9 = faculty3.getAccountType();
        faculty3.setVerified(true);
        boolean boolean12 = faculty3.isVerified();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "faculty" + "'", str9, "faculty");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test23316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23316");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        faculty3.login("", "");
        double double7 = faculty3.getHourlyRate();
        faculty3.login("faculty", "faculty");
        java.lang.String str11 = faculty3.getID();
        faculty3.logout();
        faculty3.logout();
        java.lang.String str14 = faculty3.getID();
        java.lang.String str15 = faculty3.getAccountType();
        boolean boolean16 = faculty3.isVerified();
        java.lang.String str17 = faculty3.getPassword();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "faculty" + "'", str15, "faculty");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test23317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23317");
        model.Faculty faculty3 = new model.Faculty("", "faculty", "faculty");
        double double4 = faculty3.getHourlyRate();
        java.lang.String str5 = faculty3.getAccountType();
        java.lang.String str6 = faculty3.getID();
        java.lang.String str7 = faculty3.getID();
        faculty3.viewProfile();
        boolean boolean9 = faculty3.isVerified();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 30.0d + "'", double4 == 30.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "faculty" + "'", str7, "faculty");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test23318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23318");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        faculty3.logout();
        java.lang.String str5 = faculty3.getID();
        java.lang.String str6 = faculty3.getEmail();
        java.lang.String str7 = faculty3.getID();
        boolean boolean8 = faculty3.isVerified();
        java.lang.String str9 = faculty3.getEmail();
        faculty3.viewProfile();
        faculty3.setVerified(true);
        faculty3.logout();
        faculty3.viewProfile();
        java.lang.String str15 = faculty3.getEmail();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test23319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23319");
        model.Faculty faculty3 = new model.Faculty("hi!", "hi!", "faculty");
        faculty3.login("hi!", "hi!");
        faculty3.logout();
        faculty3.setVerified(false);
        faculty3.viewProfile();
        faculty3.setVerified(true);
        faculty3.logout();
    }

    @Test
    public void test23320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23320");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getAccountType();
        faculty3.logout();
        java.lang.String str8 = faculty3.getAccountType();
        double double9 = faculty3.getHourlyRate();
        faculty3.logout();
        faculty3.setVerified(false);
        java.lang.String str13 = faculty3.getAccountType();
        java.lang.String str14 = faculty3.getEmail();
        faculty3.viewProfile();
        faculty3.viewProfile();
        faculty3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "faculty" + "'", str8, "faculty");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 30.0d + "'", double9 == 30.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "faculty" + "'", str13, "faculty");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test23321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23321");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        faculty3.logout();
        faculty3.login("hi!", "hi!");
        faculty3.viewProfile();
        faculty3.login("", "faculty");
        faculty3.login("", "faculty");
        faculty3.viewProfile();
        java.lang.String str16 = faculty3.getID();
        faculty3.setVerified(true);
        java.lang.String str19 = faculty3.getID();
        faculty3.logout();
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test23322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23322");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        faculty3.setVerified(false);
        java.lang.String str9 = faculty3.getID();
        faculty3.setVerified(false);
        java.lang.String str12 = faculty3.getID();
        java.lang.String str13 = faculty3.getAccountType();
        java.lang.String str14 = faculty3.getEmail();
        java.lang.String str15 = faculty3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "faculty" + "'", str13, "faculty");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test23323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23323");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        faculty3.setVerified(false);
        boolean boolean9 = faculty3.isVerified();
        java.lang.String str10 = faculty3.getAccountType();
        faculty3.logout();
        faculty3.login("hi!", "faculty");
        java.lang.String str15 = faculty3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "faculty" + "'", str10, "faculty");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test23324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23324");
        model.Faculty faculty3 = new model.Faculty("hi!", "faculty", "");
        java.lang.String str4 = faculty3.getEmail();
        faculty3.logout();
        java.lang.String str6 = faculty3.getID();
        boolean boolean7 = faculty3.isVerified();
        boolean boolean8 = faculty3.isVerified();
        java.lang.String str9 = faculty3.getPassword();
        double double10 = faculty3.getHourlyRate();
        faculty3.login("faculty", "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "faculty" + "'", str9, "faculty");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 30.0d + "'", double10 == 30.0d);
    }

    @Test
    public void test23325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23325");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        faculty3.logout();
        faculty3.viewProfile();
        java.lang.String str6 = faculty3.getID();
        faculty3.logout();
        java.lang.String str8 = faculty3.getAccountType();
        double double9 = faculty3.getHourlyRate();
        java.lang.String str10 = faculty3.getEmail();
        boolean boolean11 = faculty3.isVerified();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "faculty" + "'", str8, "faculty");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 30.0d + "'", double9 == 30.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test23326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23326");
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
        boolean boolean18 = faculty3.isVerified();
        faculty3.login("hi!", "");
        java.lang.Class<?> wildcardClass22 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test23327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23327");
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
        java.lang.String str24 = faculty3.getPassword();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "faculty" + "'", str15, "faculty");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "faculty" + "'", str22, "faculty");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test23328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23328");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        faculty3.setVerified(false);
        java.lang.String str6 = faculty3.getEmail();
        java.lang.String str7 = faculty3.getAccountType();
        java.lang.String str8 = faculty3.getPassword();
        java.lang.String str9 = faculty3.getAccountType();
        java.lang.String str10 = faculty3.getEmail();
        faculty3.login("", "faculty");
        faculty3.setVerified(false);
        java.lang.String str16 = faculty3.getID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "faculty" + "'", str7, "faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "faculty" + "'", str9, "faculty");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test23329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23329");
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
        faculty3.setVerified(false);
        java.lang.String str22 = faculty3.getAccountType();
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
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "faculty" + "'", str22, "faculty");
    }

    @Test
    public void test23330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23330");
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
        java.lang.String str18 = faculty3.getPassword();
        boolean boolean19 = faculty3.isVerified();
        boolean boolean20 = faculty3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "faculty" + "'", str4, "faculty");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test23331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23331");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        java.lang.String str6 = faculty3.getPassword();
        faculty3.setVerified(false);
        faculty3.setVerified(false);
        faculty3.viewProfile();
        faculty3.login("faculty", "");
        faculty3.logout();
        java.lang.String str16 = faculty3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test23332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23332");
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
        double double16 = faculty3.getHourlyRate();
        java.lang.String str17 = faculty3.getAccountType();
        faculty3.login("", "faculty");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 30.0d + "'", double16 == 30.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "faculty" + "'", str17, "faculty");
    }

    @Test
    public void test23333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23333");
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
        java.lang.String str18 = faculty3.getPassword();
        faculty3.logout();
        boolean boolean20 = faculty3.isVerified();
        java.lang.String str21 = faculty3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "faculty" + "'", str10, "faculty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 30.0d + "'", double15 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test23334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23334");
        model.Faculty faculty3 = new model.Faculty("", "faculty", "faculty");
        double double4 = faculty3.getHourlyRate();
        java.lang.String str5 = faculty3.getAccountType();
        java.lang.String str6 = faculty3.getID();
        java.lang.String str7 = faculty3.getAccountType();
        double double8 = faculty3.getHourlyRate();
        faculty3.login("", "");
        faculty3.setVerified(false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 30.0d + "'", double4 == 30.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "faculty" + "'", str7, "faculty");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
    }

    @Test
    public void test23335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23335");
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
        faculty3.logout();
        java.lang.String str16 = faculty3.getID();
        faculty3.setVerified(true);
        faculty3.setVerified(true);
        java.lang.String str21 = faculty3.getEmail();
        double double22 = faculty3.getHourlyRate();
        java.lang.String str23 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "faculty" + "'", str11, "faculty");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 30.0d + "'", double22 == 30.0d);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "faculty" + "'", str23, "faculty");
    }

    @Test
    public void test23336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23336");
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
        faculty3.setVerified(true);
        java.lang.String str18 = faculty3.getPassword();
        faculty3.logout();
        faculty3.login("hi!", "");
        java.lang.String str23 = faculty3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "faculty" + "'", str10, "faculty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test23337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23337");
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
        faculty3.login("faculty", "hi!");
        faculty3.login("hi!", "hi!");
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
    public void test23338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23338");
        model.Faculty faculty3 = new model.Faculty("", "faculty", "");
        faculty3.setVerified(true);
        faculty3.login("", "hi!");
        faculty3.viewProfile();
        java.lang.String str10 = faculty3.getID();
        faculty3.viewProfile();
        double double12 = faculty3.getHourlyRate();
        double double13 = faculty3.getHourlyRate();
        java.lang.String str14 = faculty3.getEmail();
        boolean boolean15 = faculty3.isVerified();
        double double16 = faculty3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 30.0d + "'", double12 == 30.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 30.0d + "'", double13 == 30.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 30.0d + "'", double16 == 30.0d);
    }

    @Test
    public void test23339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23339");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        faculty3.logout();
        java.lang.String str5 = faculty3.getID();
        java.lang.String str6 = faculty3.getEmail();
        java.lang.String str7 = faculty3.getEmail();
        java.lang.String str8 = faculty3.getEmail();
        java.lang.String str9 = faculty3.getID();
        java.lang.String str10 = faculty3.getPassword();
        faculty3.viewProfile();
        java.lang.String str12 = faculty3.getAccountType();
        faculty3.login("hi!", "faculty");
        java.lang.String str16 = faculty3.getEmail();
        faculty3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "faculty" + "'", str12, "faculty");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test23340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23340");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.login("", "");
        java.lang.String str10 = faculty3.getID();
        java.lang.String str11 = faculty3.getPassword();
        java.lang.String str12 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "faculty" + "'", str12, "faculty");
    }

    @Test
    public void test23341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23341");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getAccountType();
        java.lang.String str7 = faculty3.getAccountType();
        java.lang.String str8 = faculty3.getEmail();
        java.lang.String str9 = faculty3.getID();
        faculty3.login("", "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "faculty" + "'", str7, "faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test23342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23342");
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
        faculty3.logout();
        faculty3.login("", "hi!");
        faculty3.login("hi!", "faculty");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "faculty" + "'", str10, "faculty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "faculty" + "'", str11, "faculty");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 30.0d + "'", double12 == 30.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "faculty" + "'", str14, "faculty");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "faculty" + "'", str18, "faculty");
    }

    @Test
    public void test23343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23343");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        double double6 = faculty3.getHourlyRate();
        faculty3.logout();
        faculty3.setVerified(true);
        faculty3.viewProfile();
        double double11 = faculty3.getHourlyRate();
        java.lang.String str12 = faculty3.getEmail();
        faculty3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 30.0d + "'", double11 == 30.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test23344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23344");
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
        boolean boolean13 = faculty3.isVerified();
        boolean boolean14 = faculty3.isVerified();
        faculty3.setVerified(false);
        java.lang.String str17 = faculty3.getEmail();
        java.lang.String str18 = faculty3.getID();
        faculty3.login("", "faculty");
        java.lang.String str22 = faculty3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 30.0d + "'", double10 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 30.0d + "'", double12 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test23345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23345");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getAccountType();
        faculty3.logout();
        java.lang.String str8 = faculty3.getEmail();
        faculty3.viewProfile();
        java.lang.String str10 = faculty3.getID();
        boolean boolean11 = faculty3.isVerified();
        faculty3.setVerified(false);
        faculty3.setVerified(true);
        faculty3.logout();
        java.lang.String str17 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "faculty" + "'", str17, "faculty");
    }

    @Test
    public void test23346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23346");
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
        faculty3.setVerified(false);
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
    public void test23347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23347");
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
        faculty3.setVerified(true);
        java.lang.String str19 = faculty3.getPassword();
        double double20 = faculty3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "faculty" + "'", str10, "faculty");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "faculty" + "'", str16, "faculty");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 30.0d + "'", double20 == 30.0d);
    }

    @Test
    public void test23348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23348");
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
        java.lang.String str13 = faculty3.getID();
        java.lang.Class<?> wildcardClass14 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test23349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23349");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        faculty3.logout();
        java.lang.String str5 = faculty3.getID();
        faculty3.setVerified(true);
        faculty3.setVerified(true);
        java.lang.String str10 = faculty3.getAccountType();
        java.lang.String str11 = faculty3.getAccountType();
        faculty3.logout();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "faculty" + "'", str10, "faculty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "faculty" + "'", str11, "faculty");
    }

    @Test
    public void test23350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23350");
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
        java.lang.String str15 = faculty3.getPassword();
        java.lang.Class<?> wildcardClass16 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test23351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23351");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        java.lang.String str4 = faculty3.getAccountType();
        java.lang.String str5 = faculty3.getEmail();
        faculty3.viewProfile();
        faculty3.setVerified(true);
        java.lang.String str9 = faculty3.getPassword();
        faculty3.setVerified(false);
        java.lang.String str12 = faculty3.getAccountType();
        java.lang.String str13 = faculty3.getPassword();
        faculty3.viewProfile();
        java.lang.String str15 = faculty3.getID();
        java.lang.String str16 = faculty3.getID();
        boolean boolean17 = faculty3.isVerified();
        faculty3.login("", "faculty");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "faculty" + "'", str4, "faculty");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "faculty" + "'", str12, "faculty");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test23352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23352");
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
        java.lang.String str15 = faculty3.getAccountType();
        java.lang.String str16 = faculty3.getID();
        java.lang.String str17 = faculty3.getID();
        faculty3.login("", "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "faculty" + "'", str13, "faculty");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "faculty" + "'", str14, "faculty");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "faculty" + "'", str15, "faculty");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test23353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23353");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        faculty3.logout();
        faculty3.login("hi!", "hi!");
        java.lang.String str8 = faculty3.getID();
        boolean boolean9 = faculty3.isVerified();
        faculty3.setVerified(true);
        java.lang.String str12 = faculty3.getPassword();
        java.lang.String str13 = faculty3.getPassword();
        faculty3.login("", "");
        java.lang.String str17 = faculty3.getPassword();
        boolean boolean18 = faculty3.isVerified();
        faculty3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test23354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23354");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        faculty3.setVerified(false);
        java.lang.String str6 = faculty3.getEmail();
        java.lang.String str7 = faculty3.getAccountType();
        java.lang.String str8 = faculty3.getEmail();
        faculty3.logout();
        java.lang.String str10 = faculty3.getEmail();
        java.lang.String str11 = faculty3.getAccountType();
        boolean boolean12 = faculty3.isVerified();
        java.lang.Class<?> wildcardClass13 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "faculty" + "'", str7, "faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "faculty" + "'", str11, "faculty");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test23355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23355");
        model.Faculty faculty3 = new model.Faculty("faculty", "hi!", "hi!");
        java.lang.String str4 = faculty3.getEmail();
        faculty3.login("hi!", "hi!");
        java.lang.String str8 = faculty3.getPassword();
        faculty3.viewProfile();
        faculty3.viewProfile();
        boolean boolean11 = faculty3.isVerified();
        faculty3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "faculty" + "'", str4, "faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test23356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23356");
        model.Faculty faculty3 = new model.Faculty("faculty", "", "faculty");
        faculty3.setVerified(false);
        faculty3.viewProfile();
        java.lang.String str7 = faculty3.getEmail();
        java.lang.String str8 = faculty3.getID();
        double double9 = faculty3.getHourlyRate();
        java.lang.String str10 = faculty3.getEmail();
        java.lang.String str11 = faculty3.getPassword();
        faculty3.viewProfile();
        faculty3.viewProfile();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "faculty" + "'", str7, "faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "faculty" + "'", str8, "faculty");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 30.0d + "'", double9 == 30.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "faculty" + "'", str10, "faculty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test23357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23357");
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
        faculty3.logout();
        faculty3.setVerified(true);
        faculty3.login("", "faculty");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "faculty" + "'", str10, "faculty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "faculty" + "'", str11, "faculty");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 30.0d + "'", double12 == 30.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 30.0d + "'", double13 == 30.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "faculty" + "'", str15, "faculty");
    }

    @Test
    public void test23358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23358");
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
        faculty3.viewProfile();
        java.lang.String str19 = faculty3.getAccountType();
        faculty3.setVerified(true);
        faculty3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "faculty" + "'", str19, "faculty");
    }

    @Test
    public void test23359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23359");
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
        faculty3.login("faculty", "");
        faculty3.viewProfile();
        java.lang.Class<?> wildcardClass20 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "faculty" + "'", str11, "faculty");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test23360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23360");
        model.Faculty faculty3 = new model.Faculty("faculty", "faculty", "hi!");
        faculty3.setVerified(false);
        java.lang.String str6 = faculty3.getID();
        faculty3.setVerified(true);
        double double9 = faculty3.getHourlyRate();
        java.lang.String str10 = faculty3.getPassword();
        java.lang.String str11 = faculty3.getAccountType();
        boolean boolean12 = faculty3.isVerified();
        faculty3.logout();
        java.lang.String str14 = faculty3.getAccountType();
        faculty3.login("", "");
        faculty3.viewProfile();
        java.lang.String str19 = faculty3.getID();
        java.lang.String str20 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 30.0d + "'", double9 == 30.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "faculty" + "'", str10, "faculty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "faculty" + "'", str11, "faculty");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "faculty" + "'", str14, "faculty");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "faculty" + "'", str20, "faculty");
    }

    @Test
    public void test23361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23361");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        faculty3.setVerified(false);
        java.lang.String str10 = faculty3.getID();
        faculty3.viewProfile();
        faculty3.login("", "");
        faculty3.setVerified(true);
        java.lang.String str17 = faculty3.getPassword();
        faculty3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test23362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23362");
        model.Faculty faculty3 = new model.Faculty("", "faculty", "hi!");
        java.lang.String str4 = faculty3.getPassword();
        java.lang.String str5 = faculty3.getPassword();
        faculty3.logout();
        double double7 = faculty3.getHourlyRate();
        java.lang.String str8 = faculty3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "faculty" + "'", str4, "faculty");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test23363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23363");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        faculty3.logout();
        java.lang.String str5 = faculty3.getID();
        java.lang.String str6 = faculty3.getEmail();
        double double7 = faculty3.getHourlyRate();
        java.lang.String str8 = faculty3.getPassword();
        faculty3.login("faculty", "");
        faculty3.setVerified(false);
        java.lang.String str14 = faculty3.getPassword();
        boolean boolean15 = faculty3.isVerified();
        java.lang.String str16 = faculty3.getEmail();
        java.lang.String str17 = faculty3.getID();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test23364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23364");
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
        faculty3.viewProfile();
        java.lang.String str17 = faculty3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "faculty" + "'", str4, "faculty");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test23365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23365");
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
        faculty3.login("", "");
        faculty3.login("", "faculty");
        java.lang.String str25 = faculty3.getID();
        faculty3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "faculty" + "'", str10, "faculty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
    }

    @Test
    public void test23366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23366");
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
        faculty3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test23367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23367");
        model.Faculty faculty3 = new model.Faculty("hi!", "hi!", "");
        faculty3.logout();
        java.lang.String str5 = faculty3.getEmail();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        java.lang.String str8 = faculty3.getAccountType();
        double double9 = faculty3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "faculty" + "'", str8, "faculty");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 30.0d + "'", double9 == 30.0d);
    }

    @Test
    public void test23368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23368");
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
        java.lang.String str20 = faculty3.getAccountType();
        java.lang.String str21 = faculty3.getID();
        java.lang.String str22 = faculty3.getEmail();
        java.lang.String str23 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 30.0d + "'", double11 == 30.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "faculty" + "'", str20, "faculty");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "faculty" + "'", str23, "faculty");
    }

    @Test
    public void test23369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23369");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        faculty3.setVerified(false);
        faculty3.viewProfile();
        faculty3.login("faculty", "hi!");
        faculty3.logout();
        double double11 = faculty3.getHourlyRate();
        java.lang.String str12 = faculty3.getPassword();
        java.lang.String str13 = faculty3.getEmail();
        java.lang.Class<?> wildcardClass14 = faculty3.getClass();
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 30.0d + "'", double11 == 30.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test23370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23370");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        faculty3.setVerified(false);
        faculty3.viewProfile();
        double double7 = faculty3.getHourlyRate();
        java.lang.String str8 = faculty3.getID();
        boolean boolean9 = faculty3.isVerified();
        java.lang.String str10 = faculty3.getPassword();
        faculty3.viewProfile();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test23371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23371");
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
        java.lang.String str13 = faculty3.getPassword();
        boolean boolean14 = faculty3.isVerified();
        java.lang.String str15 = faculty3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 30.0d + "'", double12 == 30.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test23372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23372");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        java.lang.String str7 = faculty3.getID();
        faculty3.login("hi!", "");
        faculty3.login("hi!", "faculty");
        faculty3.viewProfile();
        java.lang.String str15 = faculty3.getEmail();
        java.lang.Class<?> wildcardClass16 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test23373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23373");
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
        java.lang.String str17 = faculty3.getEmail();
        faculty3.logout();
        boolean boolean19 = faculty3.isVerified();
        java.lang.String str20 = faculty3.getEmail();
        faculty3.setVerified(false);
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
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test23374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23374");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        java.lang.String str8 = faculty3.getEmail();
        java.lang.String str9 = faculty3.getPassword();
        boolean boolean10 = faculty3.isVerified();
        java.lang.String str11 = faculty3.getID();
        faculty3.login("hi!", "hi!");
        java.lang.String str15 = faculty3.getAccountType();
        java.lang.String str16 = faculty3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "faculty" + "'", str15, "faculty");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test23375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23375");
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
        double double15 = faculty3.getHourlyRate();
        faculty3.setVerified(false);
        java.lang.String str18 = faculty3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "faculty" + "'", str8, "faculty");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "faculty" + "'", str12, "faculty");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 30.0d + "'", double15 == 30.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test23376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23376");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        faculty3.setVerified(false);
        java.lang.String str6 = faculty3.getEmail();
        java.lang.String str7 = faculty3.getAccountType();
        faculty3.viewProfile();
        java.lang.String str9 = faculty3.getAccountType();
        java.lang.String str10 = faculty3.getPassword();
        boolean boolean11 = faculty3.isVerified();
        java.lang.String str12 = faculty3.getPassword();
        faculty3.login("", "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "faculty" + "'", str7, "faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "faculty" + "'", str9, "faculty");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test23377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23377");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        faculty3.setVerified(false);
        java.lang.String str10 = faculty3.getEmail();
        faculty3.logout();
        java.lang.String str12 = faculty3.getID();
        faculty3.setVerified(true);
        java.lang.String str15 = faculty3.getID();
        faculty3.viewProfile();
        java.lang.String str17 = faculty3.getID();
        boolean boolean18 = faculty3.isVerified();
        double double19 = faculty3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 30.0d + "'", double19 == 30.0d);
    }

    @Test
    public void test23378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23378");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        faculty3.logout();
        java.lang.String str5 = faculty3.getID();
        java.lang.String str6 = faculty3.getEmail();
        faculty3.viewProfile();
        faculty3.login("hi!", "faculty");
        faculty3.viewProfile();
        faculty3.login("", "");
        java.lang.Class<?> wildcardClass15 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test23379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23379");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        faculty3.login("", "");
        java.lang.String str7 = faculty3.getAccountType();
        faculty3.logout();
        faculty3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "faculty" + "'", str7, "faculty");
    }

    @Test
    public void test23380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23380");
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
        double double16 = faculty3.getHourlyRate();
        java.lang.String str17 = faculty3.getPassword();
        java.lang.String str18 = faculty3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 30.0d + "'", double14 == 30.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 30.0d + "'", double16 == 30.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test23381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23381");
        model.Faculty faculty3 = new model.Faculty("", "faculty", "");
        faculty3.viewProfile();
        java.lang.String str5 = faculty3.getAccountType();
        faculty3.viewProfile();
        java.lang.Class<?> wildcardClass7 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test23382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23382");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        faculty3.logout();
        faculty3.login("hi!", "hi!");
        double double8 = faculty3.getHourlyRate();
        java.lang.String str9 = faculty3.getID();
        java.lang.String str10 = faculty3.getEmail();
        faculty3.setVerified(true);
        boolean boolean13 = faculty3.isVerified();
        java.lang.String str14 = faculty3.getAccountType();
        java.lang.String str15 = faculty3.getPassword();
        faculty3.setVerified(true);
        java.lang.String str18 = faculty3.getAccountType();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "faculty" + "'", str14, "faculty");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "faculty" + "'", str18, "faculty");
    }

    @Test
    public void test23383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23383");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getAccountType();
        faculty3.logout();
        java.lang.String str8 = faculty3.getAccountType();
        double double9 = faculty3.getHourlyRate();
        faculty3.logout();
        java.lang.String str11 = faculty3.getID();
        boolean boolean12 = faculty3.isVerified();
        java.lang.String str13 = faculty3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "faculty" + "'", str8, "faculty");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 30.0d + "'", double9 == 30.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test23384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23384");
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
        java.lang.String str16 = faculty3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "faculty" + "'", str13, "faculty");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test23385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23385");
        model.Faculty faculty3 = new model.Faculty("hi!", "hi!", "");
        faculty3.logout();
        java.lang.String str5 = faculty3.getEmail();
        boolean boolean6 = faculty3.isVerified();
        faculty3.login("", "faculty");
        boolean boolean10 = faculty3.isVerified();
        java.lang.String str11 = faculty3.getEmail();
        java.lang.String str12 = faculty3.getEmail();
        faculty3.setVerified(false);
        double double15 = faculty3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 30.0d + "'", double15 == 30.0d);
    }

    @Test
    public void test23386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23386");
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
        faculty3.viewProfile();
        java.lang.String str18 = faculty3.getAccountType();
        faculty3.viewProfile();
        faculty3.setVerified(false);
        faculty3.logout();
        java.lang.String str23 = faculty3.getID();
        java.lang.String str24 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "faculty" + "'", str18, "faculty");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "faculty" + "'", str24, "faculty");
    }

    @Test
    public void test23387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23387");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getEmail();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        faculty3.login("hi!", "faculty");
        boolean boolean11 = faculty3.isVerified();
        faculty3.viewProfile();
        faculty3.logout();
        faculty3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test23388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23388");
        model.Faculty faculty3 = new model.Faculty("hi!", "hi!", "");
        java.lang.String str4 = faculty3.getEmail();
        faculty3.login("faculty", "faculty");
        java.lang.String str8 = faculty3.getPassword();
        faculty3.setVerified(true);
        java.lang.String str11 = faculty3.getID();
        faculty3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test23389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23389");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        java.lang.String str6 = faculty3.getPassword();
        faculty3.setVerified(false);
        faculty3.setVerified(false);
        java.lang.String str11 = faculty3.getAccountType();
        faculty3.logout();
        faculty3.setVerified(true);
        java.lang.String str15 = faculty3.getPassword();
        double double16 = faculty3.getHourlyRate();
        faculty3.login("hi!", "faculty");
        faculty3.viewProfile();
        faculty3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "faculty" + "'", str11, "faculty");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 30.0d + "'", double16 == 30.0d);
    }

    @Test
    public void test23390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23390");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.viewProfile();
        boolean boolean8 = faculty3.isVerified();
        java.lang.String str9 = faculty3.getEmail();
        faculty3.setVerified(true);
        boolean boolean12 = faculty3.isVerified();
        faculty3.login("", "");
        double double16 = faculty3.getHourlyRate();
        java.lang.String str17 = faculty3.getEmail();
        java.lang.String str18 = faculty3.getEmail();
        java.lang.String str19 = faculty3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 30.0d + "'", double16 == 30.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test23391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23391");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "");
        faculty3.logout();
        java.lang.String str5 = faculty3.getID();
        faculty3.viewProfile();
        java.lang.String str7 = faculty3.getID();
        faculty3.logout();
        java.lang.String str9 = faculty3.getID();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test23392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23392");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        faculty3.logout();
        faculty3.login("hi!", "hi!");
        double double8 = faculty3.getHourlyRate();
        boolean boolean9 = faculty3.isVerified();
        java.lang.String str10 = faculty3.getAccountType();
        java.lang.String str11 = faculty3.getPassword();
        java.lang.String str12 = faculty3.getID();
        java.lang.String str13 = faculty3.getEmail();
        java.lang.String str14 = faculty3.getEmail();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "faculty" + "'", str10, "faculty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test23393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23393");
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
        faculty3.logout();
        faculty3.setVerified(false);
        java.lang.String str17 = faculty3.getID();
        faculty3.logout();
        faculty3.logout();
        faculty3.setVerified(false);
        double double22 = faculty3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "faculty" + "'", str10, "faculty");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 30.0d + "'", double22 == 30.0d);
    }

    @Test
    public void test23394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23394");
        model.Faculty faculty3 = new model.Faculty("hi!", "faculty", "");
        java.lang.String str4 = faculty3.getEmail();
        faculty3.logout();
        faculty3.setVerified(true);
        faculty3.setVerified(false);
        faculty3.logout();
        faculty3.viewProfile();
        boolean boolean12 = faculty3.isVerified();
        java.lang.String str13 = faculty3.getID();
        boolean boolean14 = faculty3.isVerified();
        faculty3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test23395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23395");
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
        faculty3.logout();
        java.lang.String str15 = faculty3.getID();
        double double16 = faculty3.getHourlyRate();
        boolean boolean17 = faculty3.isVerified();
        faculty3.logout();
        java.lang.String str19 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "faculty" + "'", str12, "faculty");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 30.0d + "'", double16 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "faculty" + "'", str19, "faculty");
    }

    @Test
    public void test23396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23396");
        model.Faculty faculty3 = new model.Faculty("hi!", "faculty", "");
        faculty3.logout();
        faculty3.logout();
        faculty3.logout();
        double double7 = faculty3.getHourlyRate();
        boolean boolean8 = faculty3.isVerified();
        double double9 = faculty3.getHourlyRate();
        boolean boolean10 = faculty3.isVerified();
        java.lang.String str11 = faculty3.getPassword();
        java.lang.String str12 = faculty3.getPassword();
        java.lang.String str13 = faculty3.getEmail();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 30.0d + "'", double9 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "faculty" + "'", str11, "faculty");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "faculty" + "'", str12, "faculty");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test23397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23397");
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
        faculty3.logout();
        faculty3.viewProfile();
        java.lang.String str23 = faculty3.getEmail();
        java.lang.String str24 = faculty3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 30.0d + "'", double11 == 30.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
    }

    @Test
    public void test23398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23398");
        model.Faculty faculty3 = new model.Faculty("faculty", "hi!", "");
        faculty3.login("hi!", "hi!");
        faculty3.logout();
        java.lang.String str8 = faculty3.getEmail();
        faculty3.setVerified(true);
        faculty3.setVerified(false);
        faculty3.setVerified(true);
        java.lang.String str15 = faculty3.getID();
        faculty3.logout();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "faculty" + "'", str8, "faculty");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test23399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23399");
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
        faculty3.login("", "hi!");
        java.lang.String str20 = faculty3.getEmail();
        faculty3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 30.0d + "'", double13 == 30.0d);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test23400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23400");
        model.Faculty faculty3 = new model.Faculty("hi!", "faculty", "");
        faculty3.logout();
        faculty3.logout();
        faculty3.logout();
        double double7 = faculty3.getHourlyRate();
        boolean boolean8 = faculty3.isVerified();
        faculty3.setVerified(false);
        faculty3.setVerified(true);
        faculty3.setVerified(false);
        java.lang.String str15 = faculty3.getAccountType();
        faculty3.login("", "hi!");
        boolean boolean19 = faculty3.isVerified();
        java.lang.String str20 = faculty3.getAccountType();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "faculty" + "'", str15, "faculty");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "faculty" + "'", str20, "faculty");
    }

    @Test
    public void test23401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23401");
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
        faculty3.viewProfile();
        faculty3.viewProfile();
        java.lang.String str16 = faculty3.getID();
        faculty3.viewProfile();
        faculty3.login("faculty", "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "faculty" + "'", str12, "faculty");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test23402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23402");
        model.Faculty faculty3 = new model.Faculty("", "faculty", "faculty");
        double double4 = faculty3.getHourlyRate();
        java.lang.String str5 = faculty3.getAccountType();
        java.lang.String str6 = faculty3.getID();
        faculty3.viewProfile();
        java.lang.String str8 = faculty3.getPassword();
        java.lang.String str9 = faculty3.getEmail();
        faculty3.logout();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 30.0d + "'", double4 == 30.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "faculty" + "'", str8, "faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test23403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23403");
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
        faculty3.logout();
        java.lang.String str24 = faculty3.getEmail();
        faculty3.setVerified(true);
        java.lang.String str27 = faculty3.getPassword();
        java.lang.String str28 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 30.0d + "'", double11 == 30.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "faculty" + "'", str28, "faculty");
    }

    @Test
    public void test23404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23404");
        model.Faculty faculty3 = new model.Faculty("hi!", "hi!", "");
        faculty3.logout();
        java.lang.String str5 = faculty3.getEmail();
        double double6 = faculty3.getHourlyRate();
        boolean boolean7 = faculty3.isVerified();
        faculty3.setVerified(false);
        java.lang.String str10 = faculty3.getID();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test23405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23405");
        model.Faculty faculty3 = new model.Faculty("hi!", "hi!", "");
        java.lang.String str4 = faculty3.getEmail();
        faculty3.logout();
        faculty3.setVerified(false);
        java.lang.String str8 = faculty3.getID();
        boolean boolean9 = faculty3.isVerified();
        faculty3.login("", "hi!");
        faculty3.setVerified(false);
        double double15 = faculty3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 30.0d + "'", double15 == 30.0d);
    }

    @Test
    public void test23406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23406");
        model.Faculty faculty3 = new model.Faculty("hi!", "hi!", "");
        java.lang.String str4 = faculty3.getAccountType();
        java.lang.String str5 = faculty3.getID();
        boolean boolean6 = faculty3.isVerified();
        faculty3.setVerified(false);
        faculty3.setVerified(false);
        faculty3.setVerified(true);
        faculty3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "faculty" + "'", str4, "faculty");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test23407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23407");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        faculty3.login("", "");
        double double7 = faculty3.getHourlyRate();
        faculty3.login("faculty", "faculty");
        java.lang.String str11 = faculty3.getID();
        java.lang.String str12 = faculty3.getAccountType();
        boolean boolean13 = faculty3.isVerified();
        faculty3.setVerified(false);
        faculty3.login("hi!", "");
        java.lang.String str19 = faculty3.getAccountType();
        faculty3.login("", "faculty");
        faculty3.logout();
        faculty3.logout();
        java.lang.String str25 = faculty3.getAccountType();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "faculty" + "'", str12, "faculty");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "faculty" + "'", str19, "faculty");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "faculty" + "'", str25, "faculty");
    }

    @Test
    public void test23408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23408");
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
        boolean boolean18 = faculty3.isVerified();
        faculty3.setVerified(false);
        java.lang.String str21 = faculty3.getEmail();
        java.lang.String str22 = faculty3.getEmail();
        java.lang.String str23 = faculty3.getID();
        java.lang.String str24 = faculty3.getID();
        faculty3.setVerified(true);
        java.lang.Class<?> wildcardClass27 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "faculty" + "'", str13, "faculty");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test23409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23409");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        double double6 = faculty3.getHourlyRate();
        java.lang.String str7 = faculty3.getPassword();
        java.lang.String str8 = faculty3.getPassword();
        faculty3.login("faculty", "hi!");
        double double12 = faculty3.getHourlyRate();
        java.lang.String str13 = faculty3.getAccountType();
        boolean boolean14 = faculty3.isVerified();
        java.lang.String str15 = faculty3.getID();
        faculty3.logout();
        faculty3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 30.0d + "'", double12 == 30.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "faculty" + "'", str13, "faculty");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test23410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23410");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        double double6 = faculty3.getHourlyRate();
        faculty3.logout();
        faculty3.viewProfile();
        java.lang.String str9 = faculty3.getEmail();
        java.lang.String str10 = faculty3.getEmail();
        faculty3.logout();
        faculty3.logout();
        faculty3.logout();
        faculty3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test23411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23411");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        boolean boolean7 = faculty3.isVerified();
        faculty3.logout();
        faculty3.logout();
        java.lang.String str10 = faculty3.getAccountType();
        boolean boolean11 = faculty3.isVerified();
        double double12 = faculty3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "faculty" + "'", str10, "faculty");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 30.0d + "'", double12 == 30.0d);
    }

    @Test
    public void test23412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23412");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        java.lang.String str4 = faculty3.getAccountType();
        java.lang.String str5 = faculty3.getEmail();
        double double6 = faculty3.getHourlyRate();
        boolean boolean7 = faculty3.isVerified();
        java.lang.String str8 = faculty3.getEmail();
        java.lang.String str9 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "faculty" + "'", str4, "faculty");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "faculty" + "'", str9, "faculty");
    }

    @Test
    public void test23413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23413");
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
        faculty3.viewProfile();
        faculty3.logout();
        boolean boolean17 = faculty3.isVerified();
        java.lang.String str18 = faculty3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "faculty" + "'", str11, "faculty");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test23414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23414");
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
        java.lang.String str13 = faculty3.getPassword();
        java.lang.String str14 = faculty3.getID();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "faculty" + "'", str12, "faculty");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test23415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23415");
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
        boolean boolean15 = faculty3.isVerified();
        java.lang.Class<?> wildcardClass16 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test23416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23416");
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
        faculty3.logout();
        double double23 = faculty3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 30.0d + "'", double18 == 30.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 30.0d + "'", double23 == 30.0d);
    }

    @Test
    public void test23417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23417");
        model.Faculty faculty3 = new model.Faculty("hi!", "hi!", "faculty");
        double double4 = faculty3.getHourlyRate();
        faculty3.setVerified(false);
        faculty3.logout();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 30.0d + "'", double4 == 30.0d);
    }

    @Test
    public void test23418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23418");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        double double6 = faculty3.getHourlyRate();
        java.lang.String str7 = faculty3.getPassword();
        faculty3.login("", "faculty");
        java.lang.String str11 = faculty3.getPassword();
        faculty3.logout();
        java.lang.String str13 = faculty3.getPassword();
        faculty3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test23419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23419");
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
        faculty3.logout();
        faculty3.setVerified(false);
        faculty3.setVerified(false);
        java.lang.String str19 = faculty3.getEmail();
        double double20 = faculty3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "faculty" + "'", str10, "faculty");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 30.0d + "'", double20 == 30.0d);
    }

    @Test
    public void test23420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23420");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        java.lang.String str8 = faculty3.getPassword();
        faculty3.setVerified(false);
        java.lang.String str11 = faculty3.getID();
        faculty3.login("faculty", "faculty");
        java.lang.String str15 = faculty3.getEmail();
        faculty3.logout();
        java.lang.String str17 = faculty3.getEmail();
        java.lang.String str18 = faculty3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test23421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23421");
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
        java.lang.String str19 = faculty3.getID();
        boolean boolean20 = faculty3.isVerified();
        faculty3.logout();
        boolean boolean22 = faculty3.isVerified();
        java.lang.String str23 = faculty3.getID();
        double double24 = faculty3.getHourlyRate();
        faculty3.viewProfile();
        boolean boolean26 = faculty3.isVerified();
        faculty3.viewProfile();
        faculty3.login("faculty", "faculty");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 30.0d + "'", double16 == 30.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 30.0d + "'", double24 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test23422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23422");
        model.Faculty faculty3 = new model.Faculty("hi!", "hi!", "faculty");
        faculty3.login("hi!", "hi!");
        double double7 = faculty3.getHourlyRate();
        java.lang.String str8 = faculty3.getPassword();
        faculty3.setVerified(true);
        faculty3.viewProfile();
        java.lang.String str12 = faculty3.getEmail();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test23423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23423");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        double double6 = faculty3.getHourlyRate();
        faculty3.logout();
        faculty3.viewProfile();
        java.lang.String str9 = faculty3.getEmail();
        java.lang.String str10 = faculty3.getEmail();
        faculty3.setVerified(true);
        faculty3.login("", "");
        java.lang.String str16 = faculty3.getAccountType();
        java.lang.String str17 = faculty3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "faculty" + "'", str16, "faculty");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test23424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23424");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        faculty3.logout();
        java.lang.String str5 = faculty3.getID();
        java.lang.String str6 = faculty3.getEmail();
        faculty3.viewProfile();
        faculty3.setVerified(false);
        faculty3.logout();
        java.lang.String str11 = faculty3.getEmail();
        faculty3.viewProfile();
        double double13 = faculty3.getHourlyRate();
        java.lang.String str14 = faculty3.getPassword();
        double double15 = faculty3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 30.0d + "'", double13 == 30.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 30.0d + "'", double15 == 30.0d);
    }

    @Test
    public void test23425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23425");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        java.lang.String str6 = faculty3.getPassword();
        java.lang.String str7 = faculty3.getPassword();
        java.lang.String str8 = faculty3.getID();
        java.lang.String str9 = faculty3.getID();
        faculty3.viewProfile();
        java.lang.String str11 = faculty3.getPassword();
        faculty3.setVerified(false);
        faculty3.login("faculty", "");
        java.lang.String str17 = faculty3.getAccountType();
        faculty3.setVerified(false);
        java.lang.String str20 = faculty3.getEmail();
        java.lang.String str21 = faculty3.getAccountType();
        faculty3.logout();
        boolean boolean23 = faculty3.isVerified();
        faculty3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "faculty" + "'", str17, "faculty");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "faculty" + "'", str21, "faculty");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test23426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23426");
        model.Faculty faculty3 = new model.Faculty("hi!", "hi!", "faculty");
        faculty3.login("hi!", "hi!");
        faculty3.logout();
        faculty3.setVerified(false);
        boolean boolean10 = faculty3.isVerified();
        faculty3.viewProfile();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test23427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23427");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getAccountType();
        faculty3.logout();
        java.lang.String str8 = faculty3.getEmail();
        faculty3.viewProfile();
        boolean boolean10 = faculty3.isVerified();
        faculty3.viewProfile();
        faculty3.logout();
        faculty3.logout();
        faculty3.login("", "faculty");
        faculty3.setVerified(true);
        boolean boolean19 = faculty3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test23428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23428");
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
        faculty3.setVerified(true);
        java.lang.String str19 = faculty3.getPassword();
        faculty3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "faculty" + "'", str10, "faculty");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "faculty" + "'", str16, "faculty");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test23429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23429");
        model.Faculty faculty3 = new model.Faculty("hi!", "faculty", "");
        faculty3.logout();
        java.lang.String str5 = faculty3.getEmail();
        java.lang.String str6 = faculty3.getEmail();
        double double7 = faculty3.getHourlyRate();
        faculty3.setVerified(false);
        faculty3.viewProfile();
        faculty3.login("", "hi!");
        double double14 = faculty3.getHourlyRate();
        faculty3.login("hi!", "hi!");
        faculty3.setVerified(true);
        faculty3.viewProfile();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 30.0d + "'", double14 == 30.0d);
    }

    @Test
    public void test23430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23430");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        java.lang.String str7 = faculty3.getID();
        faculty3.login("hi!", "");
        java.lang.String str11 = faculty3.getPassword();
        boolean boolean12 = faculty3.isVerified();
        boolean boolean13 = faculty3.isVerified();
        java.lang.String str14 = faculty3.getEmail();
        java.lang.String str15 = faculty3.getEmail();
        boolean boolean16 = faculty3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test23431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23431");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        double double6 = faculty3.getHourlyRate();
        faculty3.logout();
        faculty3.viewProfile();
        java.lang.String str9 = faculty3.getEmail();
        java.lang.String str10 = faculty3.getEmail();
        faculty3.logout();
        java.lang.String str12 = faculty3.getAccountType();
        boolean boolean13 = faculty3.isVerified();
        faculty3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "faculty" + "'", str12, "faculty");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test23432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23432");
        model.Faculty faculty3 = new model.Faculty("hi!", "hi!", "");
        faculty3.viewProfile();
        java.lang.String str5 = faculty3.getAccountType();
        java.lang.String str6 = faculty3.getEmail();
        faculty3.login("", "hi!");
        faculty3.logout();
        faculty3.viewProfile();
        faculty3.viewProfile();
        double double13 = faculty3.getHourlyRate();
        java.lang.String str14 = faculty3.getPassword();
        faculty3.logout();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 30.0d + "'", double13 == 30.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test23433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23433");
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
        faculty3.login("", "hi!");
        java.lang.String str19 = faculty3.getEmail();
        double double20 = faculty3.getHourlyRate();
        java.lang.String str21 = faculty3.getEmail();
        java.lang.String str22 = faculty3.getAccountType();
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 30.0d + "'", double20 == 30.0d);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "faculty" + "'", str22, "faculty");
    }

    @Test
    public void test23434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23434");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        faculty3.login("", "");
        faculty3.viewProfile();
        faculty3.viewProfile();
        java.lang.String str9 = faculty3.getAccountType();
        java.lang.String str10 = faculty3.getEmail();
        java.lang.String str11 = faculty3.getAccountType();
        boolean boolean12 = faculty3.isVerified();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "faculty" + "'", str9, "faculty");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "faculty" + "'", str11, "faculty");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test23435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23435");
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
        java.lang.String str17 = faculty3.getEmail();
        faculty3.setVerified(false);
        faculty3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "faculty" + "'", str12, "faculty");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test23436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23436");
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
        java.lang.String str15 = faculty3.getID();
        faculty3.setVerified(true);
        faculty3.logout();
        boolean boolean19 = faculty3.isVerified();
        faculty3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "faculty" + "'", str4, "faculty");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "faculty" + "'", str11, "faculty");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 30.0d + "'", double14 == 30.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test23437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23437");
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
        faculty3.viewProfile();
        faculty3.login("hi!", "faculty");
        double double18 = faculty3.getHourlyRate();
        java.lang.String str19 = faculty3.getAccountType();
        faculty3.viewProfile();
        java.lang.String str21 = faculty3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "faculty" + "'", str12, "faculty");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 30.0d + "'", double18 == 30.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "faculty" + "'", str19, "faculty");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test23438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23438");
        model.Faculty faculty3 = new model.Faculty("hi!", "hi!", "");
        faculty3.setVerified(true);
        java.lang.String str6 = faculty3.getID();
        faculty3.setVerified(true);
        java.lang.String str9 = faculty3.getPassword();
        faculty3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test23439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23439");
        model.Faculty faculty3 = new model.Faculty("", "", "");
        faculty3.viewProfile();
        faculty3.viewProfile();
        java.lang.String str6 = faculty3.getAccountType();
        java.lang.String str7 = faculty3.getPassword();
        faculty3.setVerified(true);
        java.lang.String str10 = faculty3.getEmail();
        faculty3.login("faculty", "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test23440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23440");
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
        faculty3.login("", "hi!");
        java.lang.Class<?> wildcardClass18 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "faculty" + "'", str12, "faculty");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test23441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23441");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        java.lang.String str7 = faculty3.getID();
        java.lang.String str8 = faculty3.getEmail();
        faculty3.login("", "");
        faculty3.logout();
        java.lang.String str13 = faculty3.getPassword();
        faculty3.logout();
        faculty3.viewProfile();
        java.lang.String str16 = faculty3.getEmail();
        faculty3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test23442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23442");
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
        double double16 = faculty3.getHourlyRate();
        faculty3.setVerified(false);
        java.lang.String str19 = faculty3.getID();
        faculty3.setVerified(false);
        java.lang.String str22 = faculty3.getAccountType();
        faculty3.logout();
        java.lang.String str24 = faculty3.getAccountType();
        java.lang.String str25 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "faculty" + "'", str11, "faculty");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 30.0d + "'", double16 == 30.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "faculty" + "'", str22, "faculty");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "faculty" + "'", str24, "faculty");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "faculty" + "'", str25, "faculty");
    }

    @Test
    public void test23443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23443");
        model.Faculty faculty3 = new model.Faculty("faculty", "", "faculty");
        faculty3.setVerified(false);
        faculty3.login("hi!", "hi!");
        faculty3.viewProfile();
        java.lang.String str10 = faculty3.getEmail();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "faculty" + "'", str10, "faculty");
    }

    @Test
    public void test23444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23444");
        model.Faculty faculty3 = new model.Faculty("hi!", "hi!", "");
        faculty3.logout();
        java.lang.String str5 = faculty3.getEmail();
        boolean boolean6 = faculty3.isVerified();
        java.lang.String str7 = faculty3.getEmail();
        faculty3.login("", "faculty");
        java.lang.String str11 = faculty3.getAccountType();
        java.lang.String str12 = faculty3.getEmail();
        boolean boolean13 = faculty3.isVerified();
        faculty3.login("", "hi!");
        boolean boolean17 = faculty3.isVerified();
        java.lang.String str18 = faculty3.getPassword();
        boolean boolean19 = faculty3.isVerified();
        java.lang.String str20 = faculty3.getID();
        java.lang.String str21 = faculty3.getID();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "faculty" + "'", str11, "faculty");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test23445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23445");
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
        java.lang.String str18 = faculty3.getAccountType();
        faculty3.login("faculty", "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 30.0d + "'", double13 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "faculty" + "'", str18, "faculty");
    }

    @Test
    public void test23446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23446");
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
        java.lang.String str20 = faculty3.getID();
        boolean boolean21 = faculty3.isVerified();
        java.lang.String str22 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "faculty" + "'", str22, "faculty");
    }

    @Test
    public void test23447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23447");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        faculty3.setVerified(false);
        java.lang.String str9 = faculty3.getID();
        faculty3.setVerified(false);
        double double12 = faculty3.getHourlyRate();
        boolean boolean13 = faculty3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 30.0d + "'", double12 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test23448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23448");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        faculty3.logout();
        java.lang.String str5 = faculty3.getID();
        java.lang.String str6 = faculty3.getEmail();
        faculty3.viewProfile();
        faculty3.setVerified(false);
        faculty3.logout();
        java.lang.String str11 = faculty3.getEmail();
        faculty3.login("hi!", "hi!");
        java.lang.String str15 = faculty3.getAccountType();
        java.lang.String str16 = faculty3.getAccountType();
        java.lang.String str17 = faculty3.getPassword();
        java.lang.String str18 = faculty3.getEmail();
        faculty3.viewProfile();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "faculty" + "'", str15, "faculty");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "faculty" + "'", str16, "faculty");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test23449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23449");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        java.lang.String str4 = faculty3.getAccountType();
        java.lang.String str5 = faculty3.getEmail();
        faculty3.viewProfile();
        double double7 = faculty3.getHourlyRate();
        faculty3.viewProfile();
        boolean boolean9 = faculty3.isVerified();
        faculty3.viewProfile();
        double double11 = faculty3.getHourlyRate();
        faculty3.viewProfile();
        java.lang.String str13 = faculty3.getAccountType();
        faculty3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "faculty" + "'", str4, "faculty");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 30.0d + "'", double11 == 30.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "faculty" + "'", str13, "faculty");
    }

    @Test
    public void test23450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23450");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        java.lang.String str6 = faculty3.getPassword();
        java.lang.String str7 = faculty3.getPassword();
        java.lang.String str8 = faculty3.getID();
        double double9 = faculty3.getHourlyRate();
        double double10 = faculty3.getHourlyRate();
        double double11 = faculty3.getHourlyRate();
        java.lang.String str12 = faculty3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 30.0d + "'", double9 == 30.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 30.0d + "'", double10 == 30.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 30.0d + "'", double11 == 30.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test23451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23451");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        faculty3.logout();
        faculty3.login("hi!", "hi!");
        double double8 = faculty3.getHourlyRate();
        java.lang.String str9 = faculty3.getID();
        java.lang.String str10 = faculty3.getEmail();
        faculty3.setVerified(true);
        boolean boolean13 = faculty3.isVerified();
        java.lang.String str14 = faculty3.getID();
        java.lang.String str15 = faculty3.getEmail();
        java.lang.String str16 = faculty3.getID();
        double double17 = faculty3.getHourlyRate();
        faculty3.login("", "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 30.0d + "'", double17 == 30.0d);
    }

    @Test
    public void test23452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23452");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        faculty3.setVerified(false);
        java.lang.String str6 = faculty3.getEmail();
        java.lang.String str7 = faculty3.getAccountType();
        java.lang.String str8 = faculty3.getAccountType();
        boolean boolean9 = faculty3.isVerified();
        java.lang.String str10 = faculty3.getAccountType();
        java.lang.String str11 = faculty3.getEmail();
        faculty3.setVerified(true);
        java.lang.String str14 = faculty3.getID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "faculty" + "'", str7, "faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "faculty" + "'", str8, "faculty");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "faculty" + "'", str10, "faculty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test23453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23453");
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
        java.lang.String str14 = faculty3.getAccountType();
        faculty3.login("", "faculty");
        java.lang.String str18 = faculty3.getEmail();
        java.lang.String str19 = faculty3.getEmail();
        double double20 = faculty3.getHourlyRate();
        faculty3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "faculty" + "'", str10, "faculty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "faculty" + "'", str14, "faculty");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 30.0d + "'", double20 == 30.0d);
    }

    @Test
    public void test23454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23454");
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
        faculty3.setVerified(true);
        faculty3.login("", "hi!");
        faculty3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test23455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23455");
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
        boolean boolean23 = faculty3.isVerified();
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
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test23456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23456");
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
        java.lang.String str16 = faculty3.getPassword();
        java.lang.Class<?> wildcardClass17 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "faculty" + "'", str10, "faculty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "faculty" + "'", str15, "faculty");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test23457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23457");
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
        faculty3.logout();
        faculty3.logout();
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
    public void test23458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23458");
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
        java.lang.String str20 = faculty3.getAccountType();
        faculty3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 30.0d + "'", double11 == 30.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "faculty" + "'", str20, "faculty");
    }

    @Test
    public void test23459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23459");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        java.lang.String str8 = faculty3.getPassword();
        java.lang.String str9 = faculty3.getID();
        double double10 = faculty3.getHourlyRate();
        faculty3.login("faculty", "");
        double double14 = faculty3.getHourlyRate();
        java.lang.String str15 = faculty3.getAccountType();
        double double16 = faculty3.getHourlyRate();
        boolean boolean17 = faculty3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 30.0d + "'", double10 == 30.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 30.0d + "'", double14 == 30.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "faculty" + "'", str15, "faculty");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 30.0d + "'", double16 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test23460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23460");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        faculty3.login("", "faculty");
        java.lang.String str10 = faculty3.getEmail();
        boolean boolean11 = faculty3.isVerified();
        java.lang.String str12 = faculty3.getPassword();
        java.lang.String str13 = faculty3.getID();
        java.lang.String str14 = faculty3.getPassword();
        faculty3.setVerified(true);
        faculty3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test23461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23461");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        java.lang.String str8 = faculty3.getPassword();
        faculty3.logout();
        java.lang.String str10 = faculty3.getID();
        double double11 = faculty3.getHourlyRate();
        faculty3.login("faculty", "hi!");
        java.lang.String str15 = faculty3.getEmail();
        faculty3.viewProfile();
        boolean boolean17 = faculty3.isVerified();
        faculty3.logout();
        java.lang.String str19 = faculty3.getPassword();
        java.lang.Class<?> wildcardClass20 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 30.0d + "'", double11 == 30.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test23462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23462");
        model.Faculty faculty3 = new model.Faculty("hi!", "hi!", "");
        java.lang.String str4 = faculty3.getEmail();
        faculty3.login("faculty", "faculty");
        java.lang.String str8 = faculty3.getPassword();
        faculty3.setVerified(true);
        double double11 = faculty3.getHourlyRate();
        faculty3.viewProfile();
        faculty3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 30.0d + "'", double11 == 30.0d);
    }

    @Test
    public void test23463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23463");
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
        java.lang.String str24 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "faculty" + "'", str13, "faculty");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "faculty" + "'", str24, "faculty");
    }

    @Test
    public void test23464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23464");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        faculty3.login("", "");
        faculty3.viewProfile();
        faculty3.viewProfile();
        double double9 = faculty3.getHourlyRate();
        java.lang.String str10 = faculty3.getID();
        java.lang.String str11 = faculty3.getAccountType();
        faculty3.setVerified(true);
        double double14 = faculty3.getHourlyRate();
        faculty3.login("", "");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 30.0d + "'", double9 == 30.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "faculty" + "'", str11, "faculty");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 30.0d + "'", double14 == 30.0d);
    }

    @Test
    public void test23465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23465");
        model.Faculty faculty3 = new model.Faculty("hi!", "faculty", "");
        java.lang.String str4 = faculty3.getEmail();
        faculty3.logout();
        java.lang.String str6 = faculty3.getID();
        faculty3.setVerified(false);
        faculty3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test23466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23466");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        faculty3.logout();
        faculty3.login("", "");
        java.lang.String str8 = faculty3.getID();
        java.lang.String str9 = faculty3.getID();
        java.lang.String str10 = faculty3.getEmail();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test23467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23467");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        faculty3.setVerified(false);
        faculty3.viewProfile();
        java.lang.String str7 = faculty3.getEmail();
        java.lang.String str8 = faculty3.getAccountType();
        boolean boolean9 = faculty3.isVerified();
        java.lang.String str10 = faculty3.getID();
        double double11 = faculty3.getHourlyRate();
        java.lang.String str12 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "faculty" + "'", str8, "faculty");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 30.0d + "'", double11 == 30.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "faculty" + "'", str12, "faculty");
    }

    @Test
    public void test23468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23468");
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
        java.lang.String str16 = faculty3.getEmail();
        java.lang.String str17 = faculty3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test23469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23469");
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
        faculty3.viewProfile();
        faculty3.logout();
        boolean boolean17 = faculty3.isVerified();
        java.lang.String str18 = faculty3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 30.0d + "'", double14 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test23470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23470");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        faculty3.viewProfile();
        faculty3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test23471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23471");
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
        boolean boolean18 = faculty3.isVerified();
        java.lang.Class<?> wildcardClass19 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "faculty" + "'", str13, "faculty");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 30.0d + "'", double14 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test23472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23472");
        model.Faculty faculty3 = new model.Faculty("hi!", "hi!", "");
        faculty3.setVerified(true);
        double double6 = faculty3.getHourlyRate();
        java.lang.String str7 = faculty3.getID();
        boolean boolean8 = faculty3.isVerified();
        faculty3.login("hi!", "");
        faculty3.viewProfile();
        double double13 = faculty3.getHourlyRate();
        boolean boolean14 = faculty3.isVerified();
        faculty3.viewProfile();
        faculty3.setVerified(true);
        java.lang.String str18 = faculty3.getEmail();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 30.0d + "'", double13 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test23473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23473");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        faculty3.logout();
        faculty3.login("hi!", "hi!");
        double double8 = faculty3.getHourlyRate();
        java.lang.String str9 = faculty3.getID();
        java.lang.String str10 = faculty3.getAccountType();
        faculty3.viewProfile();
        boolean boolean12 = faculty3.isVerified();
        java.lang.String str13 = faculty3.getEmail();
        faculty3.login("", "faculty");
        double double17 = faculty3.getHourlyRate();
        boolean boolean18 = faculty3.isVerified();
        faculty3.setVerified(true);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "faculty" + "'", str10, "faculty");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 30.0d + "'", double17 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test23474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23474");
        model.Faculty faculty3 = new model.Faculty("hi!", "faculty", "");
        java.lang.String str4 = faculty3.getEmail();
        faculty3.logout();
        boolean boolean6 = faculty3.isVerified();
        double double7 = faculty3.getHourlyRate();
        java.lang.String str8 = faculty3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test23475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23475");
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
        double double16 = faculty3.getHourlyRate();
        faculty3.setVerified(false);
        faculty3.logout();
        boolean boolean20 = faculty3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "faculty" + "'", str10, "faculty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 30.0d + "'", double16 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test23476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23476");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        java.lang.String str8 = faculty3.getPassword();
        faculty3.setVerified(false);
        faculty3.logout();
        java.lang.String str12 = faculty3.getID();
        java.lang.String str13 = faculty3.getID();
        java.lang.String str14 = faculty3.getID();
        boolean boolean15 = faculty3.isVerified();
        java.lang.String str16 = faculty3.getAccountType();
        java.lang.String str17 = faculty3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "faculty" + "'", str16, "faculty");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test23477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23477");
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
        double double15 = faculty3.getHourlyRate();
        faculty3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "faculty" + "'", str13, "faculty");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 30.0d + "'", double15 == 30.0d);
    }

    @Test
    public void test23478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23478");
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
        boolean boolean23 = faculty3.isVerified();
        faculty3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "faculty" + "'", str10, "faculty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "faculty" + "'", str20, "faculty");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test23479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23479");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        faculty3.logout();
        faculty3.login("hi!", "hi!");
        double double8 = faculty3.getHourlyRate();
        boolean boolean9 = faculty3.isVerified();
        boolean boolean10 = faculty3.isVerified();
        boolean boolean11 = faculty3.isVerified();
        boolean boolean12 = faculty3.isVerified();
        faculty3.logout();
        faculty3.setVerified(false);
        faculty3.setVerified(true);
        double double18 = faculty3.getHourlyRate();
        java.lang.String str19 = faculty3.getID();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 30.0d + "'", double18 == 30.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test23480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23480");
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
        faculty3.setVerified(true);
        double double19 = faculty3.getHourlyRate();
        boolean boolean20 = faculty3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 30.0d + "'", double19 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test23481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23481");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        boolean boolean7 = faculty3.isVerified();
        faculty3.logout();
        java.lang.String str9 = faculty3.getID();
        faculty3.login("hi!", "");
        boolean boolean13 = faculty3.isVerified();
        faculty3.logout();
        java.lang.String str15 = faculty3.getID();
        faculty3.viewProfile();
        java.lang.String str17 = faculty3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test23482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23482");
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
        java.lang.String str15 = faculty3.getID();
        java.lang.String str16 = faculty3.getID();
        faculty3.setVerified(false);
        faculty3.logout();
        faculty3.login("", "faculty");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "faculty" + "'", str13, "faculty");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test23483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23483");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        java.lang.String str7 = faculty3.getID();
        faculty3.setVerified(true);
        java.lang.String str10 = faculty3.getEmail();
        java.lang.String str11 = faculty3.getEmail();
        boolean boolean12 = faculty3.isVerified();
        faculty3.setVerified(true);
        faculty3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test23484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23484");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        faculty3.logout();
        java.lang.String str5 = faculty3.getID();
        java.lang.String str6 = faculty3.getEmail();
        java.lang.String str7 = faculty3.getPassword();
        java.lang.String str8 = faculty3.getID();
        faculty3.logout();
        faculty3.logout();
        double double11 = faculty3.getHourlyRate();
        java.lang.String str12 = faculty3.getAccountType();
        java.lang.String str13 = faculty3.getPassword();
        double double14 = faculty3.getHourlyRate();
        java.lang.String str15 = faculty3.getID();
        faculty3.login("hi!", "hi!");
        faculty3.login("", "");
        java.lang.String str22 = faculty3.getPassword();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 30.0d + "'", double11 == 30.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "faculty" + "'", str12, "faculty");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 30.0d + "'", double14 == 30.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test23485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23485");
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
        faculty3.setVerified(false);
        faculty3.logout();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "faculty" + "'", str8, "faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 30.0d + "'", double11 == 30.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 30.0d + "'", double13 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "faculty" + "'", str15, "faculty");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "faculty" + "'", str16, "faculty");
    }

    @Test
    public void test23486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23486");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        java.lang.String str8 = faculty3.getPassword();
        java.lang.String str9 = faculty3.getEmail();
        double double10 = faculty3.getHourlyRate();
        faculty3.logout();
        java.lang.String str12 = faculty3.getEmail();
        faculty3.viewProfile();
        java.lang.String str14 = faculty3.getEmail();
        faculty3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 30.0d + "'", double10 == 30.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test23487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23487");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        faculty3.logout();
        faculty3.login("hi!", "hi!");
        double double8 = faculty3.getHourlyRate();
        java.lang.String str9 = faculty3.getID();
        faculty3.logout();
        faculty3.login("faculty", "");
        java.lang.String str14 = faculty3.getID();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test23488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23488");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        faculty3.logout();
        java.lang.String str5 = faculty3.getID();
        java.lang.String str6 = faculty3.getEmail();
        java.lang.String str7 = faculty3.getPassword();
        java.lang.String str8 = faculty3.getID();
        faculty3.logout();
        double double10 = faculty3.getHourlyRate();
        faculty3.setVerified(false);
        faculty3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 30.0d + "'", double10 == 30.0d);
    }

    @Test
    public void test23489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23489");
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
        java.lang.String str21 = faculty3.getPassword();
        faculty3.logout();
        double double23 = faculty3.getHourlyRate();
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
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 30.0d + "'", double23 == 30.0d);
    }

    @Test
    public void test23490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23490");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.viewProfile();
        faculty3.viewProfile();
        faculty3.logout();
        faculty3.viewProfile();
        double double11 = faculty3.getHourlyRate();
        faculty3.viewProfile();
        double double13 = faculty3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 30.0d + "'", double11 == 30.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 30.0d + "'", double13 == 30.0d);
    }

    @Test
    public void test23491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23491");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        java.lang.String str8 = faculty3.getEmail();
        faculty3.viewProfile();
        faculty3.logout();
        faculty3.login("hi!", "hi!");
        java.lang.String str14 = faculty3.getPassword();
        faculty3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test23492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23492");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        java.lang.String str4 = faculty3.getAccountType();
        java.lang.String str5 = faculty3.getEmail();
        faculty3.viewProfile();
        faculty3.logout();
        faculty3.login("faculty", "faculty");
        java.lang.String str11 = faculty3.getAccountType();
        faculty3.viewProfile();
        double double13 = faculty3.getHourlyRate();
        faculty3.setVerified(false);
        faculty3.viewProfile();
        java.lang.String str17 = faculty3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "faculty" + "'", str4, "faculty");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "faculty" + "'", str11, "faculty");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 30.0d + "'", double13 == 30.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test23493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23493");
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
        java.lang.String str16 = faculty3.getEmail();
        double double17 = faculty3.getHourlyRate();
        faculty3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "faculty" + "'", str8, "faculty");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "faculty" + "'", str12, "faculty");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 30.0d + "'", double17 == 30.0d);
    }

    @Test
    public void test23494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23494");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        faculty3.login("", "");
        double double7 = faculty3.getHourlyRate();
        boolean boolean8 = faculty3.isVerified();
        java.lang.String str9 = faculty3.getEmail();
        boolean boolean10 = faculty3.isVerified();
        java.lang.String str11 = faculty3.getID();
        boolean boolean12 = faculty3.isVerified();
        java.lang.String str13 = faculty3.getAccountType();
        faculty3.setVerified(true);
        faculty3.viewProfile();
        faculty3.setVerified(true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "faculty" + "'", str13, "faculty");
    }

    @Test
    public void test23495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23495");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        faculty3.setVerified(false);
        java.lang.String str9 = faculty3.getID();
        faculty3.setVerified(false);
        java.lang.String str12 = faculty3.getID();
        java.lang.String str13 = faculty3.getID();
        java.lang.String str14 = faculty3.getEmail();
        java.lang.String str15 = faculty3.getAccountType();
        java.lang.String str16 = faculty3.getAccountType();
        java.lang.String str17 = faculty3.getID();
        java.lang.String str18 = faculty3.getID();
        java.lang.String str19 = faculty3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "faculty" + "'", str15, "faculty");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "faculty" + "'", str16, "faculty");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test23496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23496");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getAccountType();
        faculty3.logout();
        java.lang.String str8 = faculty3.getEmail();
        faculty3.viewProfile();
        java.lang.String str10 = faculty3.getAccountType();
        java.lang.String str11 = faculty3.getAccountType();
        java.lang.String str12 = faculty3.getEmail();
        java.lang.String str13 = faculty3.getID();
        java.lang.String str14 = faculty3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "faculty" + "'", str10, "faculty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "faculty" + "'", str11, "faculty");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test23497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23497");
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
        java.lang.String str18 = faculty3.getPassword();
        java.lang.String str19 = faculty3.getAccountType();
        faculty3.setVerified(true);
        faculty3.login("faculty", "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "faculty" + "'", str19, "faculty");
    }

    @Test
    public void test23498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23498");
        model.Faculty faculty3 = new model.Faculty("faculty", "", "");
        faculty3.logout();
        java.lang.String str5 = faculty3.getPassword();
        double double6 = faculty3.getHourlyRate();
        double double7 = faculty3.getHourlyRate();
        faculty3.logout();
        faculty3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
    }

    @Test
    public void test23499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23499");
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
        java.lang.String str20 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "faculty" + "'", str10, "faculty");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "faculty" + "'", str20, "faculty");
    }

    @Test
    public void test23500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23500");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.viewProfile();
        java.lang.String str8 = faculty3.getAccountType();
        java.lang.String str9 = faculty3.getAccountType();
        java.lang.String str10 = faculty3.getEmail();
        faculty3.logout();
        java.lang.String str12 = faculty3.getAccountType();
        java.lang.String str13 = faculty3.getPassword();
        faculty3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "faculty" + "'", str8, "faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "faculty" + "'", str9, "faculty");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "faculty" + "'", str12, "faculty");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }
}

