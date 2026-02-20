import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest23 {

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
    public void test11501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11501");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        faculty3.setVerified(false);
        faculty3.logout();
        double double11 = faculty3.getHourlyRate();
        faculty3.viewProfile();
        boolean boolean13 = faculty3.isVerified();
        faculty3.login("hi!", "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 30.0d + "'", double11 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test11502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11502");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        double double6 = faculty3.getHourlyRate();
        faculty3.setVerified(true);
        java.lang.String str9 = faculty3.getID();
        boolean boolean10 = faculty3.isVerified();
        faculty3.setVerified(false);
        faculty3.logout();
        java.lang.String str14 = faculty3.getPassword();
        java.lang.String str15 = faculty3.getPassword();
        faculty3.logout();
        double double17 = faculty3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 30.0d + "'", double17 == 30.0d);
    }

    @Test
    public void test11503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11503");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        double double6 = faculty3.getHourlyRate();
        java.lang.String str7 = faculty3.getPassword();
        java.lang.String str8 = faculty3.getPassword();
        faculty3.viewProfile();
        double double10 = faculty3.getHourlyRate();
        faculty3.setVerified(false);
        faculty3.logout();
        faculty3.setVerified(false);
        java.lang.String str16 = faculty3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 30.0d + "'", double10 == 30.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test11504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11504");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.viewProfile();
        faculty3.login("faculty", "");
        faculty3.login("", "");
        faculty3.viewProfile();
        faculty3.logout();
        faculty3.viewProfile();
        java.lang.String str17 = faculty3.getEmail();
        double double18 = faculty3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 30.0d + "'", double18 == 30.0d);
    }

    @Test
    public void test11505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11505");
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
        java.lang.String str16 = faculty3.getAccountType();
        faculty3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "faculty" + "'", str16, "faculty");
    }

    @Test
    public void test11506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11506");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        faculty3.logout();
        faculty3.logout();
        java.lang.String str6 = faculty3.getID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test11507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11507");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        java.lang.String str8 = faculty3.getPassword();
        java.lang.String str9 = faculty3.getPassword();
        faculty3.setVerified(true);
        java.lang.String str12 = faculty3.getEmail();
        java.lang.String str13 = faculty3.getPassword();
        faculty3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test11508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11508");
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
        java.lang.String str15 = faculty3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 30.0d + "'", double11 == 30.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test11509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11509");
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
        double double25 = faculty3.getHourlyRate();
        faculty3.logout();
        java.lang.String str27 = faculty3.getEmail();
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
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 30.0d + "'", double25 == 30.0d);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test11510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11510");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        java.lang.String str4 = faculty3.getAccountType();
        java.lang.String str5 = faculty3.getID();
        faculty3.setVerified(true);
        faculty3.login("faculty", "faculty");
        java.lang.String str11 = faculty3.getPassword();
        java.lang.String str12 = faculty3.getEmail();
        boolean boolean13 = faculty3.isVerified();
        java.lang.String str14 = faculty3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "faculty" + "'", str4, "faculty");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test11511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11511");
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
        java.lang.String str23 = faculty3.getEmail();
        double double24 = faculty3.getHourlyRate();
        boolean boolean25 = faculty3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "faculty" + "'", str10, "faculty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 30.0d + "'", double24 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test11512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11512");
        model.Faculty faculty3 = new model.Faculty("", "", "faculty");
        faculty3.login("faculty", "faculty");
        double double7 = faculty3.getHourlyRate();
        double double8 = faculty3.getHourlyRate();
        faculty3.login("faculty", "hi!");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
    }

    @Test
    public void test11513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11513");
        model.Faculty faculty3 = new model.Faculty("", "faculty", "faculty");
        double double4 = faculty3.getHourlyRate();
        java.lang.String str5 = faculty3.getAccountType();
        java.lang.String str6 = faculty3.getID();
        java.lang.String str7 = faculty3.getAccountType();
        double double8 = faculty3.getHourlyRate();
        faculty3.login("", "");
        faculty3.setVerified(true);
        faculty3.logout();
        faculty3.logout();
        faculty3.logout();
        boolean boolean17 = faculty3.isVerified();
        faculty3.logout();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 30.0d + "'", double4 == 30.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "faculty" + "'", str7, "faculty");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test11514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11514");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        java.lang.String str7 = faculty3.getID();
        double double8 = faculty3.getHourlyRate();
        boolean boolean9 = faculty3.isVerified();
        faculty3.login("", "");
        java.lang.String str13 = faculty3.getPassword();
        double double14 = faculty3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 30.0d + "'", double14 == 30.0d);
    }

    @Test
    public void test11515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11515");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        faculty3.logout();
        faculty3.login("hi!", "hi!");
        double double8 = faculty3.getHourlyRate();
        java.lang.String str9 = faculty3.getID();
        java.lang.String str10 = faculty3.getAccountType();
        faculty3.setVerified(true);
        faculty3.logout();
        faculty3.viewProfile();
        java.lang.String str15 = faculty3.getAccountType();
        boolean boolean16 = faculty3.isVerified();
        faculty3.viewProfile();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "faculty" + "'", str10, "faculty");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "faculty" + "'", str15, "faculty");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test11516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11516");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        double double6 = faculty3.getHourlyRate();
        java.lang.String str7 = faculty3.getPassword();
        faculty3.login("", "faculty");
        faculty3.setVerified(false);
        java.lang.String str13 = faculty3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test11517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11517");
        model.Faculty faculty3 = new model.Faculty("", "faculty", "");
        faculty3.setVerified(true);
        faculty3.login("", "hi!");
        faculty3.setVerified(true);
        faculty3.setVerified(false);
        java.lang.String str13 = faculty3.getID();
        faculty3.setVerified(true);
        faculty3.login("hi!", "faculty");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test11518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11518");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        faculty3.setVerified(false);
        faculty3.viewProfile();
        java.lang.String str11 = faculty3.getEmail();
        faculty3.logout();
        faculty3.viewProfile();
        boolean boolean14 = faculty3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test11519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11519");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        java.lang.String str6 = faculty3.getPassword();
        java.lang.String str7 = faculty3.getPassword();
        java.lang.String str8 = faculty3.getID();
        java.lang.String str9 = faculty3.getID();
        double double10 = faculty3.getHourlyRate();
        java.lang.String str11 = faculty3.getPassword();
        faculty3.setVerified(false);
        java.lang.String str14 = faculty3.getPassword();
        java.lang.String str15 = faculty3.getAccountType();
        java.lang.String str16 = faculty3.getAccountType();
        double double17 = faculty3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 30.0d + "'", double10 == 30.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "faculty" + "'", str15, "faculty");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "faculty" + "'", str16, "faculty");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 30.0d + "'", double17 == 30.0d);
    }

    @Test
    public void test11520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11520");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        java.lang.String str7 = faculty3.getID();
        faculty3.login("hi!", "");
        java.lang.String str11 = faculty3.getPassword();
        boolean boolean12 = faculty3.isVerified();
        faculty3.setVerified(true);
        double double15 = faculty3.getHourlyRate();
        boolean boolean16 = faculty3.isVerified();
        double double17 = faculty3.getHourlyRate();
        faculty3.setVerified(false);
        double double20 = faculty3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 30.0d + "'", double15 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 30.0d + "'", double17 == 30.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 30.0d + "'", double20 == 30.0d);
    }

    @Test
    public void test11521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11521");
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
        java.lang.String str18 = faculty3.getID();
        faculty3.login("hi!", "faculty");
        java.lang.String str22 = faculty3.getEmail();
        double double23 = faculty3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "faculty" + "'", str10, "faculty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 30.0d + "'", double23 == 30.0d);
    }

    @Test
    public void test11522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11522");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        faculty3.logout();
        java.lang.String str5 = faculty3.getID();
        java.lang.String str6 = faculty3.getPassword();
        double double7 = faculty3.getHourlyRate();
        faculty3.setVerified(false);
        java.lang.String str10 = faculty3.getID();
        double double11 = faculty3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 30.0d + "'", double11 == 30.0d);
    }

    @Test
    public void test11523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11523");
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
        java.lang.String str13 = faculty3.getID();
        faculty3.setVerified(true);
        boolean boolean16 = faculty3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test11524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11524");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        java.lang.String str6 = faculty3.getPassword();
        java.lang.String str7 = faculty3.getPassword();
        faculty3.login("hi!", "hi!");
        boolean boolean11 = faculty3.isVerified();
        faculty3.setVerified(true);
        boolean boolean14 = faculty3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test11525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11525");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getAccountType();
        faculty3.logout();
        java.lang.String str8 = faculty3.getEmail();
        faculty3.viewProfile();
        java.lang.String str10 = faculty3.getAccountType();
        faculty3.logout();
        double double12 = faculty3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "faculty" + "'", str10, "faculty");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 30.0d + "'", double12 == 30.0d);
    }

    @Test
    public void test11526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11526");
        model.Faculty faculty3 = new model.Faculty("", "", "");
        faculty3.viewProfile();
        java.lang.String str5 = faculty3.getEmail();
        java.lang.String str6 = faculty3.getEmail();
        faculty3.setVerified(false);
        faculty3.setVerified(true);
        java.lang.Class<?> wildcardClass11 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test11527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11527");
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
        java.lang.String str17 = faculty3.getPassword();
        faculty3.setVerified(false);
        faculty3.login("", "hi!");
        java.lang.String str23 = faculty3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "faculty" + "'", str16, "faculty");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
    }

    @Test
    public void test11528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11528");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        faculty3.setVerified(false);
        java.lang.String str10 = faculty3.getEmail();
        double double11 = faculty3.getHourlyRate();
        java.lang.String str12 = faculty3.getEmail();
        double double13 = faculty3.getHourlyRate();
        faculty3.login("", "faculty");
        faculty3.logout();
        faculty3.logout();
        faculty3.setVerified(true);
        java.lang.Class<?> wildcardClass21 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 30.0d + "'", double11 == 30.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 30.0d + "'", double13 == 30.0d);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test11529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11529");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        faculty3.login("", "");
        faculty3.viewProfile();
        faculty3.viewProfile();
        faculty3.login("", "");
        faculty3.viewProfile();
        java.lang.String str13 = faculty3.getID();
        java.lang.String str14 = faculty3.getID();
        java.lang.String str15 = faculty3.getAccountType();
        faculty3.logout();
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "faculty" + "'", str15, "faculty");
    }

    @Test
    public void test11530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11530");
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
        faculty3.setVerified(true);
        java.lang.String str17 = faculty3.getEmail();
        faculty3.login("faculty", "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 30.0d + "'", double11 == 30.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test11531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11531");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        faculty3.setVerified(false);
        faculty3.viewProfile();
        java.lang.String str7 = faculty3.getEmail();
        faculty3.login("hi!", "hi!");
        java.lang.String str11 = faculty3.getEmail();
        boolean boolean12 = faculty3.isVerified();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test11532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11532");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        java.lang.String str8 = faculty3.getAccountType();
        java.lang.String str9 = faculty3.getAccountType();
        faculty3.viewProfile();
        faculty3.logout();
        java.lang.String str12 = faculty3.getEmail();
        double double13 = faculty3.getHourlyRate();
        java.lang.String str14 = faculty3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "faculty" + "'", str8, "faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "faculty" + "'", str9, "faculty");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 30.0d + "'", double13 == 30.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test11533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11533");
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
        boolean boolean14 = faculty3.isVerified();
        faculty3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 30.0d + "'", double13 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test11534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11534");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        faculty3.logout();
        faculty3.login("hi!", "hi!");
        faculty3.viewProfile();
        java.lang.String str9 = faculty3.getPassword();
        java.lang.String str10 = faculty3.getID();
        faculty3.logout();
        boolean boolean12 = faculty3.isVerified();
        java.lang.String str13 = faculty3.getID();
        faculty3.logout();
        faculty3.logout();
        java.lang.String str16 = faculty3.getPassword();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test11535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11535");
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
        faculty3.viewProfile();
        faculty3.viewProfile();
        java.lang.String str17 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "faculty" + "'", str8, "faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "faculty" + "'", str9, "faculty");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "faculty" + "'", str17, "faculty");
    }

    @Test
    public void test11536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11536");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        java.lang.String str7 = faculty3.getID();
        faculty3.setVerified(true);
        java.lang.String str10 = faculty3.getEmail();
        faculty3.setVerified(true);
        faculty3.logout();
        java.lang.String str14 = faculty3.getEmail();
        java.lang.String str15 = faculty3.getAccountType();
        java.lang.String str16 = faculty3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "faculty" + "'", str15, "faculty");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test11537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11537");
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
        double double16 = faculty3.getHourlyRate();
        faculty3.setVerified(false);
        faculty3.logout();
        faculty3.login("", "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 30.0d + "'", double11 == 30.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "faculty" + "'", str15, "faculty");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 30.0d + "'", double16 == 30.0d);
    }

    @Test
    public void test11538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11538");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        java.lang.String str4 = faculty3.getAccountType();
        java.lang.String str5 = faculty3.getID();
        faculty3.setVerified(true);
        java.lang.String str8 = faculty3.getAccountType();
        faculty3.viewProfile();
        double double10 = faculty3.getHourlyRate();
        faculty3.setVerified(false);
        java.lang.String str13 = faculty3.getEmail();
        java.lang.String str14 = faculty3.getPassword();
        java.lang.Class<?> wildcardClass15 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "faculty" + "'", str4, "faculty");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "faculty" + "'", str8, "faculty");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 30.0d + "'", double10 == 30.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test11539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11539");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        faculty3.setVerified(false);
        faculty3.viewProfile();
        java.lang.String str7 = faculty3.getEmail();
        double double8 = faculty3.getHourlyRate();
        java.lang.String str9 = faculty3.getID();
        faculty3.logout();
        double double11 = faculty3.getHourlyRate();
        faculty3.viewProfile();
        java.lang.String str13 = faculty3.getPassword();
        boolean boolean14 = faculty3.isVerified();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 30.0d + "'", double11 == 30.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test11540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11540");
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
        java.lang.String str28 = faculty3.getID();
        double double29 = faculty3.getHourlyRate();
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
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 30.0d + "'", double29 == 30.0d);
    }

    @Test
    public void test11541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11541");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        faculty3.logout();
        java.lang.String str5 = faculty3.getID();
        java.lang.String str6 = faculty3.getEmail();
        java.lang.String str7 = faculty3.getPassword();
        java.lang.String str8 = faculty3.getID();
        faculty3.logout();
        faculty3.logout();
        boolean boolean11 = faculty3.isVerified();
        java.lang.String str12 = faculty3.getEmail();
        boolean boolean13 = faculty3.isVerified();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test11542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11542");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        java.lang.String str7 = faculty3.getID();
        double double8 = faculty3.getHourlyRate();
        faculty3.logout();
        faculty3.logout();
        faculty3.setVerified(true);
        java.lang.String str13 = faculty3.getAccountType();
        faculty3.login("faculty", "");
        boolean boolean17 = faculty3.isVerified();
        double double18 = faculty3.getHourlyRate();
        java.lang.String str19 = faculty3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "faculty" + "'", str13, "faculty");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 30.0d + "'", double18 == 30.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test11543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11543");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        faculty3.logout();
        faculty3.login("hi!", "hi!");
        faculty3.viewProfile();
        java.lang.String str9 = faculty3.getPassword();
        java.lang.String str10 = faculty3.getID();
        faculty3.logout();
        faculty3.login("", "faculty");
        faculty3.login("faculty", "faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test11544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11544");
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
        faculty3.viewProfile();
        java.lang.String str22 = faculty3.getAccountType();
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
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "faculty" + "'", str22, "faculty");
    }

    @Test
    public void test11545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11545");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        boolean boolean7 = faculty3.isVerified();
        java.lang.String str8 = faculty3.getID();
        faculty3.setVerified(false);
        java.lang.String str11 = faculty3.getID();
        faculty3.setVerified(true);
        java.lang.String str14 = faculty3.getID();
        double double15 = faculty3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 30.0d + "'", double15 == 30.0d);
    }

    @Test
    public void test11546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11546");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        java.lang.String str8 = faculty3.getEmail();
        faculty3.viewProfile();
        java.lang.String str10 = faculty3.getID();
        faculty3.login("", "hi!");
        faculty3.setVerified(true);
        faculty3.login("", "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test11547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11547");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        double double6 = faculty3.getHourlyRate();
        java.lang.String str7 = faculty3.getPassword();
        java.lang.String str8 = faculty3.getPassword();
        faculty3.viewProfile();
        boolean boolean10 = faculty3.isVerified();
        java.lang.String str11 = faculty3.getEmail();
        boolean boolean12 = faculty3.isVerified();
        java.lang.Class<?> wildcardClass13 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test11548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11548");
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
        faculty3.login("faculty", "");
        faculty3.viewProfile();
        faculty3.logout();
        faculty3.setVerified(true);
        java.lang.String str23 = faculty3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "faculty" + "'", str13, "faculty");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test11549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11549");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        faculty3.logout();
        java.lang.String str5 = faculty3.getID();
        java.lang.String str6 = faculty3.getEmail();
        double double7 = faculty3.getHourlyRate();
        boolean boolean8 = faculty3.isVerified();
        java.lang.String str9 = faculty3.getID();
        faculty3.setVerified(true);
        faculty3.viewProfile();
        faculty3.logout();
        java.lang.String str14 = faculty3.getID();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test11550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11550");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.viewProfile();
        java.lang.String str8 = faculty3.getAccountType();
        java.lang.String str9 = faculty3.getID();
        boolean boolean10 = faculty3.isVerified();
        java.lang.String str11 = faculty3.getAccountType();
        java.lang.String str12 = faculty3.getID();
        java.lang.Class<?> wildcardClass13 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "faculty" + "'", str8, "faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "faculty" + "'", str11, "faculty");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test11551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11551");
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
        java.lang.String str18 = faculty3.getPassword();
        faculty3.viewProfile();
        java.lang.String str20 = faculty3.getID();
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test11552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11552");
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
        faculty3.setVerified(false);
        java.lang.Class<?> wildcardClass19 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test11553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11553");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        java.lang.String str4 = faculty3.getAccountType();
        java.lang.String str5 = faculty3.getID();
        faculty3.viewProfile();
        faculty3.setVerified(true);
        double double9 = faculty3.getHourlyRate();
        java.lang.String str10 = faculty3.getPassword();
        java.lang.String str11 = faculty3.getEmail();
        faculty3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "faculty" + "'", str4, "faculty");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 30.0d + "'", double9 == 30.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test11554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11554");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        faculty3.setVerified(false);
        java.lang.String str6 = faculty3.getPassword();
        java.lang.String str7 = faculty3.getAccountType();
        java.lang.String str8 = faculty3.getEmail();
        faculty3.setVerified(true);
        boolean boolean11 = faculty3.isVerified();
        faculty3.login("hi!", "");
        java.lang.String str15 = faculty3.getPassword();
        java.lang.String str16 = faculty3.getAccountType();
        faculty3.login("hi!", "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "faculty" + "'", str7, "faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "faculty" + "'", str16, "faculty");
    }

    @Test
    public void test11555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11555");
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
        java.lang.String str21 = faculty3.getEmail();
        faculty3.login("hi!", "faculty");
        java.lang.String str25 = faculty3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "faculty" + "'", str17, "faculty");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 30.0d + "'", double18 == 30.0d);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test11556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11556");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        faculty3.setVerified(false);
        faculty3.viewProfile();
        java.lang.String str7 = faculty3.getEmail();
        faculty3.login("hi!", "hi!");
        java.lang.String str11 = faculty3.getEmail();
        java.lang.String str12 = faculty3.getID();
        java.lang.String str13 = faculty3.getID();
        boolean boolean14 = faculty3.isVerified();
        java.lang.String str15 = faculty3.getAccountType();
        java.lang.Class<?> wildcardClass16 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "faculty" + "'", str15, "faculty");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test11557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11557");
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
        java.lang.String str27 = faculty3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 30.0d + "'", double22 == 30.0d);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test11558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11558");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        faculty3.setVerified(false);
        java.lang.String str6 = faculty3.getEmail();
        java.lang.String str7 = faculty3.getAccountType();
        java.lang.String str8 = faculty3.getEmail();
        faculty3.logout();
        boolean boolean10 = faculty3.isVerified();
        java.lang.String str11 = faculty3.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "faculty" + "'", str7, "faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test11559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11559");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        faculty3.logout();
        java.lang.String str5 = faculty3.getID();
        java.lang.String str6 = faculty3.getEmail();
        double double7 = faculty3.getHourlyRate();
        boolean boolean8 = faculty3.isVerified();
        boolean boolean9 = faculty3.isVerified();
        faculty3.login("", "faculty");
        faculty3.setVerified(true);
        faculty3.login("faculty", "hi!");
        faculty3.logout();
        java.lang.String str19 = faculty3.getPassword();
        faculty3.login("hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test11560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11560");
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
        faculty3.login("hi!", "hi!");
        java.lang.String str18 = faculty3.getID();
        java.lang.String str19 = faculty3.getEmail();
        faculty3.setVerified(false);
        faculty3.setVerified(true);
        boolean boolean24 = faculty3.isVerified();
        java.lang.String str25 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "faculty" + "'", str25, "faculty");
    }

    @Test
    public void test11561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11561");
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
        boolean boolean17 = faculty3.isVerified();
        java.lang.String str18 = faculty3.getID();
        faculty3.viewProfile();
        faculty3.setVerified(false);
        faculty3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "faculty" + "'", str8, "faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "faculty" + "'", str9, "faculty");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test11562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11562");
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
        java.lang.String str17 = faculty3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 30.0d + "'", double15 == 30.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "faculty" + "'", str16, "faculty");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test11563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11563");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        faculty3.setVerified(false);
        java.lang.String str10 = faculty3.getEmail();
        faculty3.logout();
        faculty3.login("faculty", "hi!");
        faculty3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test11564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11564");
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
        java.lang.String str18 = faculty3.getPassword();
        java.lang.String str19 = faculty3.getPassword();
        java.lang.Class<?> wildcardClass20 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "faculty" + "'", str13, "faculty");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test11565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11565");
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
        java.lang.String str14 = faculty3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 30.0d + "'", double10 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test11566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11566");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        java.lang.String str7 = faculty3.getID();
        double double8 = faculty3.getHourlyRate();
        faculty3.logout();
        faculty3.logout();
        faculty3.setVerified(true);
        java.lang.String str13 = faculty3.getAccountType();
        faculty3.login("faculty", "");
        boolean boolean17 = faculty3.isVerified();
        java.lang.String str18 = faculty3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "faculty" + "'", str13, "faculty");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test11567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11567");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        faculty3.logout();
        java.lang.String str5 = faculty3.getID();
        java.lang.String str6 = faculty3.getEmail();
        faculty3.viewProfile();
        faculty3.setVerified(false);
        java.lang.String str10 = faculty3.getID();
        java.lang.String str11 = faculty3.getAccountType();
        faculty3.logout();
        boolean boolean13 = faculty3.isVerified();
        java.lang.String str14 = faculty3.getID();
        faculty3.viewProfile();
        java.lang.String str16 = faculty3.getEmail();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "faculty" + "'", str11, "faculty");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test11568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11568");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        java.lang.String str7 = faculty3.getID();
        faculty3.setVerified(true);
        java.lang.String str10 = faculty3.getAccountType();
        java.lang.String str11 = faculty3.getPassword();
        faculty3.viewProfile();
        java.lang.String str13 = faculty3.getID();
        double double14 = faculty3.getHourlyRate();
        faculty3.viewProfile();
        java.lang.String str16 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "faculty" + "'", str10, "faculty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 30.0d + "'", double14 == 30.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "faculty" + "'", str16, "faculty");
    }

    @Test
    public void test11569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11569");
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
        java.lang.String str21 = faculty3.getPassword();
        boolean boolean22 = faculty3.isVerified();
        faculty3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test11570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11570");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        faculty3.setVerified(false);
        boolean boolean7 = faculty3.isVerified();
        faculty3.logout();
        java.lang.String str9 = faculty3.getID();
        java.lang.String str10 = faculty3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test11571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11571");
        model.Faculty faculty3 = new model.Faculty("", "faculty", "faculty");
        double double4 = faculty3.getHourlyRate();
        java.lang.String str5 = faculty3.getAccountType();
        java.lang.String str6 = faculty3.getAccountType();
        faculty3.login("faculty", "");
        faculty3.login("faculty", "");
        faculty3.logout();
        java.lang.String str14 = faculty3.getPassword();
        boolean boolean15 = faculty3.isVerified();
        java.lang.String str16 = faculty3.getID();
        faculty3.setVerified(true);
        java.lang.Class<?> wildcardClass19 = faculty3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 30.0d + "'", double4 == 30.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "faculty" + "'", str14, "faculty");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "faculty" + "'", str16, "faculty");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test11572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11572");
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
        faculty3.login("", "");
        faculty3.setVerified(true);
        faculty3.login("hi!", "hi!");
        faculty3.viewProfile();
        java.lang.String str24 = faculty3.getPassword();
        faculty3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 30.0d + "'", double12 == 30.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 30.0d + "'", double13 == 30.0d);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test11573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11573");
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
        faculty3.viewProfile();
        faculty3.viewProfile();
        boolean boolean22 = faculty3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 30.0d + "'", double13 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test11574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11574");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        faculty3.logout();
        faculty3.login("hi!", "hi!");
        java.lang.String str8 = faculty3.getID();
        boolean boolean9 = faculty3.isVerified();
        faculty3.setVerified(true);
        java.lang.String str12 = faculty3.getPassword();
        boolean boolean13 = faculty3.isVerified();
        java.lang.String str14 = faculty3.getEmail();
        java.lang.String str15 = faculty3.getEmail();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test11575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11575");
        model.Faculty faculty3 = new model.Faculty("hi!", "hi!", "");
        faculty3.logout();
        java.lang.String str5 = faculty3.getEmail();
        java.lang.String str6 = faculty3.getAccountType();
        java.lang.String str7 = faculty3.getAccountType();
        faculty3.logout();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "faculty" + "'", str7, "faculty");
    }

    @Test
    public void test11576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11576");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        boolean boolean7 = faculty3.isVerified();
        faculty3.logout();
        java.lang.String str9 = faculty3.getID();
        faculty3.login("hi!", "");
        faculty3.logout();
        faculty3.logout();
        faculty3.logout();
        faculty3.viewProfile();
        faculty3.login("faculty", "faculty");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test11577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11577");
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
        java.lang.String str14 = faculty3.getPassword();
        faculty3.setVerified(true);
        boolean boolean17 = faculty3.isVerified();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 30.0d + "'", double13 == 30.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test11578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11578");
        model.Faculty faculty3 = new model.Faculty("faculty", "", "");
        faculty3.logout();
        java.lang.String str5 = faculty3.getPassword();
        boolean boolean6 = faculty3.isVerified();
        java.lang.String str7 = faculty3.getEmail();
        java.lang.String str8 = faculty3.getEmail();
        double double9 = faculty3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "faculty" + "'", str7, "faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "faculty" + "'", str8, "faculty");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 30.0d + "'", double9 == 30.0d);
    }

    @Test
    public void test11579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11579");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        java.lang.String str4 = faculty3.getAccountType();
        java.lang.String str5 = faculty3.getID();
        faculty3.setVerified(true);
        java.lang.String str8 = faculty3.getAccountType();
        java.lang.String str9 = faculty3.getAccountType();
        java.lang.String str10 = faculty3.getPassword();
        double double11 = faculty3.getHourlyRate();
        java.lang.String str12 = faculty3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "faculty" + "'", str4, "faculty");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "faculty" + "'", str8, "faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "faculty" + "'", str9, "faculty");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 30.0d + "'", double11 == 30.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test11580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11580");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        faculty3.setVerified(false);
        java.lang.String str6 = faculty3.getEmail();
        java.lang.String str7 = faculty3.getAccountType();
        java.lang.String str8 = faculty3.getPassword();
        faculty3.viewProfile();
        faculty3.login("hi!", "");
        faculty3.setVerified(true);
        java.lang.String str15 = faculty3.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "faculty" + "'", str7, "faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test11581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11581");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        java.lang.String str4 = faculty3.getAccountType();
        java.lang.String str5 = faculty3.getEmail();
        double double6 = faculty3.getHourlyRate();
        faculty3.viewProfile();
        java.lang.String str8 = faculty3.getID();
        boolean boolean9 = faculty3.isVerified();
        java.lang.String str10 = faculty3.getAccountType();
        boolean boolean11 = faculty3.isVerified();
        faculty3.login("faculty", "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "faculty" + "'", str4, "faculty");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "faculty" + "'", str10, "faculty");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test11582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11582");
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
        java.lang.String str13 = faculty3.getEmail();
        java.lang.String str14 = faculty3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test11583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11583");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        faculty3.setVerified(false);
        java.lang.String str6 = faculty3.getEmail();
        faculty3.setVerified(false);
        faculty3.login("faculty", "hi!");
        java.lang.String str12 = faculty3.getAccountType();
        double double13 = faculty3.getHourlyRate();
        java.lang.String str14 = faculty3.getPassword();
        java.lang.String str15 = faculty3.getPassword();
        faculty3.viewProfile();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "faculty" + "'", str12, "faculty");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 30.0d + "'", double13 == 30.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test11584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11584");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.viewProfile();
        boolean boolean8 = faculty3.isVerified();
        java.lang.String str9 = faculty3.getEmail();
        java.lang.String str10 = faculty3.getPassword();
        java.lang.String str11 = faculty3.getPassword();
        faculty3.setVerified(false);
        boolean boolean14 = faculty3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test11585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11585");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getAccountType();
        faculty3.login("hi!", "hi!");
        faculty3.logout();
        java.lang.String str11 = faculty3.getPassword();
        faculty3.logout();
        java.lang.String str13 = faculty3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test11586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11586");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getAccountType();
        faculty3.logout();
        boolean boolean8 = faculty3.isVerified();
        faculty3.setVerified(true);
        faculty3.setVerified(false);
        boolean boolean13 = faculty3.isVerified();
        faculty3.login("", "");
        java.lang.String str17 = faculty3.getPassword();
        faculty3.setVerified(false);
        java.lang.Class<?> wildcardClass20 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test11587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11587");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getEmail();
        faculty3.viewProfile();
        boolean boolean7 = faculty3.isVerified();
        java.lang.String str8 = faculty3.getPassword();
        faculty3.logout();
        java.lang.String str10 = faculty3.getID();
        java.lang.String str11 = faculty3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test11588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11588");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        java.lang.String str8 = faculty3.getPassword();
        java.lang.String str9 = faculty3.getPassword();
        faculty3.setVerified(true);
        faculty3.logout();
        faculty3.logout();
        faculty3.viewProfile();
        faculty3.setVerified(true);
        java.lang.String str17 = faculty3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test11589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11589");
        model.Faculty faculty3 = new model.Faculty("hi!", "faculty", "");
        faculty3.setVerified(false);
        faculty3.logout();
        double double7 = faculty3.getHourlyRate();
        boolean boolean8 = faculty3.isVerified();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test11590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11590");
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
        java.lang.String str20 = faculty3.getAccountType();
        java.lang.String str21 = faculty3.getAccountType();
        faculty3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 30.0d + "'", double16 == 30.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "faculty" + "'", str20, "faculty");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "faculty" + "'", str21, "faculty");
    }

    @Test
    public void test11591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11591");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getEmail();
        boolean boolean6 = faculty3.isVerified();
        java.lang.String str7 = faculty3.getID();
        java.lang.String str8 = faculty3.getPassword();
        java.lang.String str9 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "faculty" + "'", str9, "faculty");
    }

    @Test
    public void test11592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11592");
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
        faculty3.viewProfile();
        java.lang.String str20 = faculty3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "faculty" + "'", str13, "faculty");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test11593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11593");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        faculty3.logout();
        java.lang.String str5 = faculty3.getID();
        java.lang.String str6 = faculty3.getEmail();
        java.lang.String str7 = faculty3.getPassword();
        java.lang.String str8 = faculty3.getID();
        faculty3.logout();
        java.lang.String str10 = faculty3.getAccountType();
        faculty3.viewProfile();
        double double12 = faculty3.getHourlyRate();
        faculty3.logout();
        faculty3.logout();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "faculty" + "'", str10, "faculty");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 30.0d + "'", double12 == 30.0d);
    }

    @Test
    public void test11594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11594");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        double double6 = faculty3.getHourlyRate();
        java.lang.String str7 = faculty3.getPassword();
        faculty3.login("", "faculty");
        java.lang.String str11 = faculty3.getPassword();
        faculty3.logout();
        double double13 = faculty3.getHourlyRate();
        faculty3.login("hi!", "");
        java.lang.String str17 = faculty3.getEmail();
        faculty3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 30.0d + "'", double13 == 30.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test11595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11595");
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
        java.lang.String str17 = faculty3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test11596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11596");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        faculty3.setVerified(false);
        faculty3.viewProfile();
        java.lang.String str7 = faculty3.getEmail();
        java.lang.String str8 = faculty3.getAccountType();
        java.lang.String str9 = faculty3.getID();
        faculty3.logout();
        java.lang.String str11 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "faculty" + "'", str8, "faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "faculty" + "'", str11, "faculty");
    }

    @Test
    public void test11597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11597");
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
        java.lang.String str19 = faculty3.getID();
        faculty3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "faculty" + "'", str12, "faculty");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 30.0d + "'", double13 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test11598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11598");
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
        faculty3.login("hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test11599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11599");
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
        java.lang.String str14 = faculty3.getPassword();
        java.lang.String str15 = faculty3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test11600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11600");
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
        faculty3.viewProfile();
        faculty3.login("", "");
        faculty3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test11601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11601");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        faculty3.logout();
        faculty3.setVerified(false);
        java.lang.String str7 = faculty3.getAccountType();
        java.lang.String str8 = faculty3.getPassword();
        faculty3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "faculty" + "'", str7, "faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test11602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11602");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        faculty3.setVerified(false);
        faculty3.viewProfile();
        java.lang.String str7 = faculty3.getEmail();
        java.lang.String str8 = faculty3.getAccountType();
        java.lang.String str9 = faculty3.getID();
        java.lang.String str10 = faculty3.getPassword();
        double double11 = faculty3.getHourlyRate();
        faculty3.logout();
        faculty3.login("hi!", "");
        faculty3.viewProfile();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "faculty" + "'", str8, "faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 30.0d + "'", double11 == 30.0d);
    }

    @Test
    public void test11603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11603");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        faculty3.setVerified(false);
        java.lang.String str6 = faculty3.getPassword();
        java.lang.String str7 = faculty3.getAccountType();
        faculty3.viewProfile();
        faculty3.setVerified(false);
        faculty3.logout();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "faculty" + "'", str7, "faculty");
    }

    @Test
    public void test11604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11604");
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
        java.lang.String str16 = faculty3.getEmail();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test11605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11605");
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
        java.lang.String str18 = faculty3.getEmail();
        java.lang.String str19 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "faculty" + "'", str10, "faculty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "faculty" + "'", str19, "faculty");
    }

    @Test
    public void test11606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11606");
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
        faculty3.viewProfile();
        java.lang.String str18 = faculty3.getAccountType();
        java.lang.Class<?> wildcardClass19 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 30.0d + "'", double16 == 30.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "faculty" + "'", str18, "faculty");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test11607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11607");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        faculty3.logout();
        java.lang.String str5 = faculty3.getID();
        java.lang.String str6 = faculty3.getEmail();
        double double7 = faculty3.getHourlyRate();
        java.lang.String str8 = faculty3.getPassword();
        faculty3.login("hi!", "hi!");
        boolean boolean12 = faculty3.isVerified();
        java.lang.String str13 = faculty3.getEmail();
        java.lang.String str14 = faculty3.getID();
        faculty3.setVerified(false);
        java.lang.String str17 = faculty3.getPassword();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test11608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11608");
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
        java.lang.String str19 = faculty3.getPassword();
        faculty3.setVerified(false);
        double double22 = faculty3.getHourlyRate();
        faculty3.setVerified(false);
        boolean boolean25 = faculty3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "faculty" + "'", str11, "faculty");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 30.0d + "'", double16 == 30.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 30.0d + "'", double22 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test11609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11609");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        boolean boolean7 = faculty3.isVerified();
        faculty3.login("", "hi!");
        java.lang.String str11 = faculty3.getEmail();
        faculty3.login("", "hi!");
        faculty3.login("", "faculty");
        double double18 = faculty3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 30.0d + "'", double18 == 30.0d);
    }

    @Test
    public void test11610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11610");
        model.Faculty faculty3 = new model.Faculty("", "faculty", "faculty");
        double double4 = faculty3.getHourlyRate();
        java.lang.String str5 = faculty3.getAccountType();
        double double6 = faculty3.getHourlyRate();
        java.lang.String str7 = faculty3.getPassword();
        faculty3.viewProfile();
        faculty3.setVerified(false);
        java.lang.String str11 = faculty3.getID();
        faculty3.setVerified(false);
        java.lang.String str14 = faculty3.getID();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 30.0d + "'", double4 == 30.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "faculty" + "'", str7, "faculty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "faculty" + "'", str11, "faculty");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "faculty" + "'", str14, "faculty");
    }

    @Test
    public void test11611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11611");
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
        java.lang.String str23 = faculty3.getPassword();
        java.lang.String str24 = faculty3.getAccountType();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "faculty" + "'", str10, "faculty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "faculty" + "'", str24, "faculty");
    }

    @Test
    public void test11612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11612");
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
        java.lang.String str15 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "faculty" + "'", str12, "faculty");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 30.0d + "'", double13 == 30.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "faculty" + "'", str15, "faculty");
    }

    @Test
    public void test11613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11613");
        model.Faculty faculty3 = new model.Faculty("faculty", "faculty", "hi!");
        java.lang.String str4 = faculty3.getEmail();
        java.lang.String str5 = faculty3.getPassword();
        faculty3.login("faculty", "");
        java.lang.String str9 = faculty3.getPassword();
        boolean boolean10 = faculty3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "faculty" + "'", str4, "faculty");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "faculty" + "'", str9, "faculty");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test11614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11614");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        boolean boolean7 = faculty3.isVerified();
        faculty3.logout();
        java.lang.String str9 = faculty3.getID();
        faculty3.login("hi!", "");
        boolean boolean13 = faculty3.isVerified();
        java.lang.String str14 = faculty3.getPassword();
        faculty3.logout();
        boolean boolean16 = faculty3.isVerified();
        java.lang.String str17 = faculty3.getAccountType();
        faculty3.login("", "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "faculty" + "'", str17, "faculty");
    }

    @Test
    public void test11615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11615");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        java.lang.String str6 = faculty3.getPassword();
        faculty3.setVerified(false);
        java.lang.String str9 = faculty3.getEmail();
        faculty3.viewProfile();
        java.lang.String str11 = faculty3.getAccountType();
        faculty3.login("", "hi!");
        double double15 = faculty3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "faculty" + "'", str11, "faculty");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 30.0d + "'", double15 == 30.0d);
    }

    @Test
    public void test11616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11616");
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
        java.lang.String str20 = faculty3.getID();
        double double21 = faculty3.getHourlyRate();
        boolean boolean22 = faculty3.isVerified();
        java.lang.String str23 = faculty3.getPassword();
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 30.0d + "'", double21 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test11617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11617");
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
        faculty3.viewProfile();
        faculty3.logout();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "faculty" + "'", str12, "faculty");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 30.0d + "'", double13 == 30.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 30.0d + "'", double14 == 30.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 30.0d + "'", double20 == 30.0d);
    }

    @Test
    public void test11618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11618");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        faculty3.setVerified(false);
        java.lang.String str10 = faculty3.getEmail();
        faculty3.viewProfile();
        java.lang.String str12 = faculty3.getEmail();
        faculty3.viewProfile();
        faculty3.viewProfile();
        faculty3.logout();
        java.lang.String str16 = faculty3.getAccountType();
        faculty3.logout();
        faculty3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "faculty" + "'", str16, "faculty");
    }

    @Test
    public void test11619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11619");
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
        faculty3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test11620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11620");
        model.Faculty faculty3 = new model.Faculty("hi!", "faculty", "");
        java.lang.String str4 = faculty3.getEmail();
        faculty3.logout();
        java.lang.String str6 = faculty3.getEmail();
        faculty3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test11621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11621");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        faculty3.logout();
        faculty3.login("hi!", "hi!");
        double double8 = faculty3.getHourlyRate();
        boolean boolean9 = faculty3.isVerified();
        java.lang.String str10 = faculty3.getAccountType();
        java.lang.String str11 = faculty3.getAccountType();
        double double12 = faculty3.getHourlyRate();
        double double13 = faculty3.getHourlyRate();
        faculty3.setVerified(true);
        java.lang.String str16 = faculty3.getPassword();
        double double17 = faculty3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "faculty" + "'", str10, "faculty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "faculty" + "'", str11, "faculty");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 30.0d + "'", double12 == 30.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 30.0d + "'", double13 == 30.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 30.0d + "'", double17 == 30.0d);
    }

    @Test
    public void test11622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11622");
        model.Faculty faculty3 = new model.Faculty("hi!", "hi!", "");
        faculty3.setVerified(true);
        double double6 = faculty3.getHourlyRate();
        java.lang.String str7 = faculty3.getAccountType();
        faculty3.setVerified(true);
        faculty3.setVerified(false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "faculty" + "'", str7, "faculty");
    }

    @Test
    public void test11623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11623");
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
        faculty3.setVerified(true);
        faculty3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test11624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11624");
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
        java.lang.String str16 = faculty3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "faculty" + "'", str11, "faculty");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test11625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11625");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        java.lang.String str6 = faculty3.getPassword();
        faculty3.setVerified(false);
        java.lang.String str9 = faculty3.getAccountType();
        faculty3.setVerified(false);
        java.lang.String str12 = faculty3.getPassword();
        java.lang.String str13 = faculty3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "faculty" + "'", str9, "faculty");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test11626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11626");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        faculty3.logout();
        faculty3.setVerified(false);
        java.lang.String str7 = faculty3.getAccountType();
        java.lang.String str8 = faculty3.getEmail();
        faculty3.login("hi!", "faculty");
        boolean boolean12 = faculty3.isVerified();
        java.lang.String str13 = faculty3.getAccountType();
        faculty3.logout();
        java.lang.String str15 = faculty3.getAccountType();
        java.lang.String str16 = faculty3.getID();
        java.lang.String str17 = faculty3.getID();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "faculty" + "'", str7, "faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "faculty" + "'", str13, "faculty");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "faculty" + "'", str15, "faculty");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test11627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11627");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        faculty3.setVerified(false);
        java.lang.String str9 = faculty3.getID();
        faculty3.setVerified(false);
        java.lang.String str12 = faculty3.getID();
        faculty3.setVerified(false);
        faculty3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test11628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11628");
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
        java.lang.String str16 = faculty3.getEmail();
        double double17 = faculty3.getHourlyRate();
        faculty3.viewProfile();
        faculty3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "faculty" + "'", str15, "faculty");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 30.0d + "'", double17 == 30.0d);
    }

    @Test
    public void test11629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11629");
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
        faculty3.login("hi!", "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "faculty" + "'", str8, "faculty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "faculty" + "'", str11, "faculty");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "faculty" + "'", str12, "faculty");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 30.0d + "'", double13 == 30.0d);
    }

    @Test
    public void test11630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11630");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        java.lang.String str8 = faculty3.getEmail();
        faculty3.viewProfile();
        faculty3.logout();
        double double11 = faculty3.getHourlyRate();
        faculty3.logout();
        java.lang.Class<?> wildcardClass13 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 30.0d + "'", double11 == 30.0d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test11631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11631");
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "faculty" + "'", str19, "faculty");
    }

    @Test
    public void test11632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11632");
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
        faculty3.logout();
        faculty3.login("hi!", "");
        java.lang.String str19 = faculty3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test11633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11633");
        model.Faculty faculty3 = new model.Faculty("", "hi!", "hi!");
        java.lang.String str4 = faculty3.getAccountType();
        faculty3.viewProfile();
        faculty3.logout();
        java.lang.String str7 = faculty3.getPassword();
        java.lang.String str8 = faculty3.getID();
        double double9 = faculty3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "faculty" + "'", str4, "faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 30.0d + "'", double9 == 30.0d);
    }

    @Test
    public void test11634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11634");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        boolean boolean7 = faculty3.isVerified();
        java.lang.String str8 = faculty3.getEmail();
        faculty3.logout();
        java.lang.String str10 = faculty3.getEmail();
        java.lang.String str11 = faculty3.getAccountType();
        java.lang.String str12 = faculty3.getID();
        java.lang.String str13 = faculty3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "faculty" + "'", str11, "faculty");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test11635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11635");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getAccountType();
        faculty3.logout();
        java.lang.String str8 = faculty3.getEmail();
        faculty3.viewProfile();
        java.lang.String str10 = faculty3.getAccountType();
        double double11 = faculty3.getHourlyRate();
        boolean boolean12 = faculty3.isVerified();
        boolean boolean13 = faculty3.isVerified();
        faculty3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "faculty" + "'", str10, "faculty");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 30.0d + "'", double11 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test11636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11636");
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
        java.lang.String str14 = faculty3.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "faculty" + "'", str7, "faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "faculty" + "'", str9, "faculty");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 30.0d + "'", double11 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test11637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11637");
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
        java.lang.String str15 = faculty3.getEmail();
        double double16 = faculty3.getHourlyRate();
        java.lang.String str17 = faculty3.getAccountType();
        java.lang.String str18 = faculty3.getID();
        faculty3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 30.0d + "'", double16 == 30.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "faculty" + "'", str17, "faculty");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test11638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11638");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        faculty3.logout();
        java.lang.String str5 = faculty3.getID();
        java.lang.String str6 = faculty3.getEmail();
        java.lang.String str7 = faculty3.getPassword();
        java.lang.String str8 = faculty3.getID();
        faculty3.logout();
        java.lang.String str10 = faculty3.getAccountType();
        faculty3.setVerified(false);
        java.lang.String str13 = faculty3.getAccountType();
        faculty3.login("faculty", "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "faculty" + "'", str10, "faculty");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "faculty" + "'", str13, "faculty");
    }

    @Test
    public void test11639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11639");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        faculty3.setVerified(false);
        faculty3.viewProfile();
        java.lang.String str7 = faculty3.getEmail();
        java.lang.String str8 = faculty3.getAccountType();
        java.lang.String str9 = faculty3.getID();
        java.lang.String str10 = faculty3.getAccountType();
        faculty3.setVerified(false);
        faculty3.login("", "hi!");
        double double16 = faculty3.getHourlyRate();
        faculty3.setVerified(true);
        faculty3.login("", "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "faculty" + "'", str8, "faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "faculty" + "'", str10, "faculty");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 30.0d + "'", double16 == 30.0d);
    }

    @Test
    public void test11640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11640");
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
        faculty3.logout();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test11641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11641");
        model.Faculty faculty3 = new model.Faculty("", "faculty", "faculty");
        double double4 = faculty3.getHourlyRate();
        java.lang.String str5 = faculty3.getAccountType();
        double double6 = faculty3.getHourlyRate();
        java.lang.String str7 = faculty3.getPassword();
        boolean boolean8 = faculty3.isVerified();
        faculty3.viewProfile();
        java.lang.String str10 = faculty3.getAccountType();
        double double11 = faculty3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 30.0d + "'", double4 == 30.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "faculty" + "'", str7, "faculty");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "faculty" + "'", str10, "faculty");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 30.0d + "'", double11 == 30.0d);
    }

    @Test
    public void test11642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11642");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        faculty3.login("", "");
        faculty3.viewProfile();
        faculty3.login("", "");
        double double11 = faculty3.getHourlyRate();
        faculty3.viewProfile();
        java.lang.String str13 = faculty3.getID();
        faculty3.login("hi!", "");
        java.lang.Class<?> wildcardClass17 = faculty3.getClass();
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 30.0d + "'", double11 == 30.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test11643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11643");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        double double6 = faculty3.getHourlyRate();
        faculty3.setVerified(true);
        java.lang.String str9 = faculty3.getID();
        boolean boolean10 = faculty3.isVerified();
        faculty3.setVerified(false);
        faculty3.logout();
        java.lang.String str14 = faculty3.getPassword();
        java.lang.String str15 = faculty3.getPassword();
        java.lang.String str16 = faculty3.getEmail();
        faculty3.login("", "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test11644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11644");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        java.lang.String str4 = faculty3.getAccountType();
        java.lang.String str5 = faculty3.getEmail();
        java.lang.String str6 = faculty3.getAccountType();
        java.lang.String str7 = faculty3.getEmail();
        java.lang.String str8 = faculty3.getPassword();
        boolean boolean9 = faculty3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "faculty" + "'", str4, "faculty");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test11645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11645");
        model.Faculty faculty3 = new model.Faculty("hi!", "faculty", "");
        java.lang.String str4 = faculty3.getEmail();
        faculty3.viewProfile();
        faculty3.logout();
        boolean boolean7 = faculty3.isVerified();
        boolean boolean8 = faculty3.isVerified();
        double double9 = faculty3.getHourlyRate();
        double double10 = faculty3.getHourlyRate();
        java.lang.String str11 = faculty3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 30.0d + "'", double9 == 30.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 30.0d + "'", double10 == 30.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test11646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11646");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        faculty3.logout();
        faculty3.login("hi!", "hi!");
        java.lang.String str8 = faculty3.getEmail();
        java.lang.String str9 = faculty3.getEmail();
        java.lang.String str10 = faculty3.getEmail();
        boolean boolean11 = faculty3.isVerified();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test11647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11647");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getAccountType();
        java.lang.String str7 = faculty3.getAccountType();
        java.lang.String str8 = faculty3.getEmail();
        faculty3.logout();
        java.lang.String str10 = faculty3.getAccountType();
        faculty3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "faculty" + "'", str7, "faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "faculty" + "'", str10, "faculty");
    }

    @Test
    public void test11648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11648");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        boolean boolean7 = faculty3.isVerified();
        faculty3.logout();
        java.lang.String str9 = faculty3.getID();
        faculty3.login("hi!", "");
        java.lang.String str13 = faculty3.getID();
        faculty3.viewProfile();
        faculty3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test11649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11649");
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
        double double17 = faculty3.getHourlyRate();
        java.lang.String str18 = faculty3.getID();
        double double19 = faculty3.getHourlyRate();
        faculty3.logout();
        double double21 = faculty3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 30.0d + "'", double17 == 30.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 30.0d + "'", double19 == 30.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 30.0d + "'", double21 == 30.0d);
    }

    @Test
    public void test11650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11650");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        double double6 = faculty3.getHourlyRate();
        faculty3.logout();
        faculty3.viewProfile();
        java.lang.String str9 = faculty3.getEmail();
        java.lang.String str10 = faculty3.getEmail();
        faculty3.logout();
        faculty3.viewProfile();
        java.lang.String str13 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "faculty" + "'", str13, "faculty");
    }

    @Test
    public void test11651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11651");
        model.Faculty faculty3 = new model.Faculty("hi!", "faculty", "");
        java.lang.String str4 = faculty3.getEmail();
        faculty3.viewProfile();
        faculty3.viewProfile();
        faculty3.setVerified(false);
        java.lang.String str9 = faculty3.getEmail();
        java.lang.String str10 = faculty3.getAccountType();
        faculty3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "faculty" + "'", str10, "faculty");
    }

    @Test
    public void test11652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11652");
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
        faculty3.login("hi!", "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 30.0d + "'", double13 == 30.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 30.0d + "'", double14 == 30.0d);
    }

    @Test
    public void test11653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11653");
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
        java.lang.Class<?> wildcardClass21 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "faculty" + "'", str8, "faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "faculty" + "'", str9, "faculty");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test11654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11654");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        faculty3.setVerified(false);
        java.lang.String str10 = faculty3.getAccountType();
        java.lang.String str11 = faculty3.getID();
        java.lang.Class<?> wildcardClass12 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "faculty" + "'", str10, "faculty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test11655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11655");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getAccountType();
        faculty3.logout();
        boolean boolean8 = faculty3.isVerified();
        faculty3.logout();
        double double10 = faculty3.getHourlyRate();
        java.lang.String str11 = faculty3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 30.0d + "'", double10 == 30.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test11656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11656");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        java.lang.String str8 = faculty3.getPassword();
        faculty3.logout();
        faculty3.setVerified(false);
        double double12 = faculty3.getHourlyRate();
        faculty3.login("hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 30.0d + "'", double12 == 30.0d);
    }

    @Test
    public void test11657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11657");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        java.lang.String str7 = faculty3.getID();
        double double8 = faculty3.getHourlyRate();
        java.lang.String str9 = faculty3.getID();
        java.lang.String str10 = faculty3.getEmail();
        java.lang.String str11 = faculty3.getAccountType();
        faculty3.logout();
        java.lang.Class<?> wildcardClass13 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "faculty" + "'", str11, "faculty");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test11658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11658");
        model.Faculty faculty3 = new model.Faculty("hi!", "hi!", "");
        faculty3.logout();
        java.lang.String str5 = faculty3.getEmail();
        double double6 = faculty3.getHourlyRate();
        faculty3.setVerified(false);
        faculty3.login("", "");
        java.lang.String str12 = faculty3.getEmail();
        java.lang.String str13 = faculty3.getID();
        faculty3.login("faculty", "faculty");
        faculty3.logout();
        boolean boolean18 = faculty3.isVerified();
        java.lang.String str19 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "faculty" + "'", str19, "faculty");
    }

    @Test
    public void test11659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11659");
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
        faculty3.logout();
        boolean boolean16 = faculty3.isVerified();
        java.lang.String str17 = faculty3.getEmail();
        java.lang.Class<?> wildcardClass18 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test11660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11660");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        boolean boolean7 = faculty3.isVerified();
        java.lang.String str8 = faculty3.getEmail();
        faculty3.logout();
        java.lang.String str10 = faculty3.getEmail();
        java.lang.String str11 = faculty3.getAccountType();
        faculty3.setVerified(false);
        faculty3.viewProfile();
        double double15 = faculty3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "faculty" + "'", str11, "faculty");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 30.0d + "'", double15 == 30.0d);
    }

    @Test
    public void test11661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11661");
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
        java.lang.String str14 = faculty3.getID();
        faculty3.logout();
        faculty3.logout();
        java.lang.String str17 = faculty3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test11662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11662");
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
        double double16 = faculty3.getHourlyRate();
        java.lang.String str17 = faculty3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "faculty" + "'", str10, "faculty");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 30.0d + "'", double15 == 30.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 30.0d + "'", double16 == 30.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test11663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11663");
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
        faculty3.setVerified(true);
        faculty3.logout();
        java.lang.String str19 = faculty3.getPassword();
        faculty3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "faculty" + "'", str8, "faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "faculty" + "'", str10, "faculty");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "faculty" + "'", str15, "faculty");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test11664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11664");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        double double6 = faculty3.getHourlyRate();
        java.lang.String str7 = faculty3.getPassword();
        faculty3.login("", "faculty");
        java.lang.String str11 = faculty3.getAccountType();
        java.lang.String str12 = faculty3.getEmail();
        faculty3.login("faculty", "hi!");
        faculty3.logout();
        java.lang.String str17 = faculty3.getAccountType();
        faculty3.setVerified(false);
        faculty3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "faculty" + "'", str11, "faculty");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "faculty" + "'", str17, "faculty");
    }

    @Test
    public void test11665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11665");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        faculty3.setVerified(false);
        faculty3.viewProfile();
        java.lang.String str11 = faculty3.getEmail();
        java.lang.String str12 = faculty3.getPassword();
        java.lang.String str13 = faculty3.getPassword();
        java.lang.String str14 = faculty3.getPassword();
        java.lang.Class<?> wildcardClass15 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test11666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11666");
        model.Faculty faculty3 = new model.Faculty("", "", "faculty");
        java.lang.String str4 = faculty3.getAccountType();
        java.lang.String str5 = faculty3.getID();
        java.lang.String str6 = faculty3.getAccountType();
        java.lang.String str7 = faculty3.getEmail();
        java.lang.String str8 = faculty3.getPassword();
        java.lang.String str9 = faculty3.getID();
        boolean boolean10 = faculty3.isVerified();
        faculty3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "faculty" + "'", str4, "faculty");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "faculty" + "'", str9, "faculty");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test11667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11667");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        faculty3.logout();
        faculty3.login("hi!", "hi!");
        faculty3.viewProfile();
        java.lang.String str9 = faculty3.getPassword();
        java.lang.String str10 = faculty3.getID();
        java.lang.String str11 = faculty3.getAccountType();
        java.lang.String str12 = faculty3.getEmail();
        java.lang.String str13 = faculty3.getID();
        boolean boolean14 = faculty3.isVerified();
        double double15 = faculty3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "faculty" + "'", str11, "faculty");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 30.0d + "'", double15 == 30.0d);
    }

    @Test
    public void test11668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11668");
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
        boolean boolean18 = faculty3.isVerified();
        faculty3.login("faculty", "hi!");
        double double22 = faculty3.getHourlyRate();
        boolean boolean23 = faculty3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "faculty" + "'", str13, "faculty");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 30.0d + "'", double17 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 30.0d + "'", double22 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test11669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11669");
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
        faculty3.login("hi!", "faculty");
        faculty3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test11670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11670");
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
        faculty3.viewProfile();
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
    public void test11671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11671");
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
        faculty3.login("hi!", "");
        java.lang.Class<?> wildcardClass18 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test11672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11672");
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
        faculty3.login("faculty", "");
        faculty3.logout();
        faculty3.logout();
        faculty3.logout();
        faculty3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test11673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11673");
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
        faculty3.login("hi!", "faculty");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test11674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11674");
        model.Faculty faculty3 = new model.Faculty("hi!", "hi!", "");
        faculty3.logout();
        java.lang.String str5 = faculty3.getEmail();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        boolean boolean8 = faculty3.isVerified();
        java.lang.String str9 = faculty3.getID();
        faculty3.logout();
        faculty3.viewProfile();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test11675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11675");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        faculty3.logout();
        java.lang.String str5 = faculty3.getID();
        java.lang.String str6 = faculty3.getEmail();
        double double7 = faculty3.getHourlyRate();
        boolean boolean8 = faculty3.isVerified();
        java.lang.String str9 = faculty3.getID();
        double double10 = faculty3.getHourlyRate();
        faculty3.setVerified(false);
        double double13 = faculty3.getHourlyRate();
        faculty3.setVerified(true);
        boolean boolean16 = faculty3.isVerified();
        faculty3.login("hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 30.0d + "'", double10 == 30.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 30.0d + "'", double13 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test11676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11676");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        java.lang.String str7 = faculty3.getID();
        double double8 = faculty3.getHourlyRate();
        boolean boolean9 = faculty3.isVerified();
        faculty3.login("", "");
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
    public void test11677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11677");
        model.Faculty faculty3 = new model.Faculty("", "", "");
        faculty3.viewProfile();
        java.lang.String str5 = faculty3.getEmail();
        java.lang.String str6 = faculty3.getEmail();
        faculty3.logout();
        faculty3.setVerified(true);
        java.lang.String str10 = faculty3.getPassword();
        boolean boolean11 = faculty3.isVerified();
        java.lang.String str12 = faculty3.getEmail();
        java.lang.String str13 = faculty3.getEmail();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test11678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11678");
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
        faculty3.login("hi!", "");
        java.lang.String str16 = faculty3.getPassword();
        java.lang.Class<?> wildcardClass17 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "faculty" + "'", str7, "faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 30.0d + "'", double11 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test11679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11679");
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
        java.lang.String str15 = faculty3.getEmail();
        java.lang.String str16 = faculty3.getAccountType();
        faculty3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "faculty" + "'", str16, "faculty");
    }

    @Test
    public void test11680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11680");
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
        double double14 = faculty3.getHourlyRate();
        faculty3.logout();
        faculty3.login("faculty", "hi!");
        java.lang.String str19 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 30.0d + "'", double12 == 30.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 30.0d + "'", double14 == 30.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "faculty" + "'", str19, "faculty");
    }

    @Test
    public void test11681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11681");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        double double6 = faculty3.getHourlyRate();
        faculty3.logout();
        faculty3.setVerified(true);
        double double10 = faculty3.getHourlyRate();
        boolean boolean11 = faculty3.isVerified();
        java.lang.String str12 = faculty3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 30.0d + "'", double10 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test11682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11682");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        faculty3.logout();
        java.lang.String str5 = faculty3.getID();
        java.lang.String str6 = faculty3.getEmail();
        double double7 = faculty3.getHourlyRate();
        java.lang.String str8 = faculty3.getEmail();
        java.lang.String str9 = faculty3.getID();
        boolean boolean10 = faculty3.isVerified();
        java.lang.String str11 = faculty3.getAccountType();
        faculty3.login("faculty", "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "faculty" + "'", str11, "faculty");
    }

    @Test
    public void test11683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11683");
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
        faculty3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 30.0d + "'", double18 == 30.0d);
    }

    @Test
    public void test11684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11684");
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
        faculty3.logout();
        faculty3.login("hi!", "faculty");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "faculty" + "'", str8, "faculty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "faculty" + "'", str11, "faculty");
    }

    @Test
    public void test11685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11685");
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
        java.lang.String str19 = faculty3.getID();
        faculty3.logout();
        java.lang.String str21 = faculty3.getPassword();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "faculty" + "'", str15, "faculty");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test11686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11686");
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
        faculty3.logout();
        faculty3.login("", "");
        faculty3.setVerified(false);
        faculty3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "faculty" + "'", str13, "faculty");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "faculty" + "'", str14, "faculty");
    }

    @Test
    public void test11687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11687");
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
        faculty3.logout();
        java.lang.String str15 = faculty3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "faculty" + "'", str4, "faculty");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test11688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11688");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getEmail();
        faculty3.viewProfile();
        java.lang.String str7 = faculty3.getPassword();
        faculty3.login("hi!", "faculty");
        faculty3.setVerified(false);
        java.lang.String str13 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "faculty" + "'", str13, "faculty");
    }

    @Test
    public void test11689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11689");
        model.Faculty faculty3 = new model.Faculty("hi!", "faculty", "");
        java.lang.String str4 = faculty3.getEmail();
        faculty3.login("hi!", "");
        faculty3.setVerified(true);
        double double10 = faculty3.getHourlyRate();
        java.lang.String str11 = faculty3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 30.0d + "'", double10 == 30.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test11690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11690");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        faculty3.logout();
        java.lang.String str5 = faculty3.getID();
        java.lang.String str6 = faculty3.getPassword();
        faculty3.viewProfile();
        boolean boolean8 = faculty3.isVerified();
        java.lang.String str9 = faculty3.getID();
        java.lang.String str10 = faculty3.getPassword();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test11691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11691");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.viewProfile();
        faculty3.viewProfile();
        faculty3.viewProfile();
        faculty3.login("faculty", "hi!");
        java.lang.String str13 = faculty3.getID();
        faculty3.login("", "faculty");
        java.lang.String str17 = faculty3.getAccountType();
        java.lang.String str18 = faculty3.getPassword();
        java.lang.String str19 = faculty3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "faculty" + "'", str17, "faculty");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test11692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11692");
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
        faculty3.logout();
        boolean boolean18 = faculty3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 30.0d + "'", double16 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test11693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11693");
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
        faculty3.logout();
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
    public void test11694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11694");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        faculty3.logout();
        java.lang.String str5 = faculty3.getID();
        java.lang.String str6 = faculty3.getEmail();
        java.lang.String str7 = faculty3.getPassword();
        java.lang.String str8 = faculty3.getID();
        faculty3.logout();
        faculty3.logout();
        java.lang.String str11 = faculty3.getPassword();
        faculty3.login("hi!", "");
        double double15 = faculty3.getHourlyRate();
        faculty3.viewProfile();
        faculty3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 30.0d + "'", double15 == 30.0d);
    }

    @Test
    public void test11695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11695");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        faculty3.logout();
        faculty3.login("hi!", "hi!");
        double double8 = faculty3.getHourlyRate();
        boolean boolean9 = faculty3.isVerified();
        java.lang.String str10 = faculty3.getAccountType();
        java.lang.String str11 = faculty3.getPassword();
        java.lang.String str12 = faculty3.getPassword();
        faculty3.setVerified(true);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "faculty" + "'", str10, "faculty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test11696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11696");
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
        faculty3.viewProfile();
        boolean boolean15 = faculty3.isVerified();
        java.lang.String str16 = faculty3.getAccountType();
        java.lang.String str17 = faculty3.getID();
        java.lang.String str18 = faculty3.getID();
        faculty3.viewProfile();
        double double20 = faculty3.getHourlyRate();
        double double21 = faculty3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "faculty" + "'", str8, "faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "faculty" + "'", str9, "faculty");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 30.0d + "'", double13 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "faculty" + "'", str16, "faculty");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 30.0d + "'", double20 == 30.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 30.0d + "'", double21 == 30.0d);
    }

    @Test
    public void test11697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11697");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        java.lang.String str7 = faculty3.getID();
        java.lang.String str8 = faculty3.getID();
        java.lang.String str9 = faculty3.getID();
        double double10 = faculty3.getHourlyRate();
        java.lang.String str11 = faculty3.getID();
        faculty3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 30.0d + "'", double10 == 30.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test11698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11698");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        double double6 = faculty3.getHourlyRate();
        java.lang.String str7 = faculty3.getPassword();
        faculty3.login("", "faculty");
        java.lang.String str11 = faculty3.getPassword();
        faculty3.logout();
        java.lang.String str13 = faculty3.getAccountType();
        java.lang.String str14 = faculty3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "faculty" + "'", str13, "faculty");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test11699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11699");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        faculty3.logout();
        java.lang.String str5 = faculty3.getID();
        java.lang.String str6 = faculty3.getEmail();
        faculty3.viewProfile();
        faculty3.login("hi!", "faculty");
        boolean boolean11 = faculty3.isVerified();
        faculty3.setVerified(true);
        java.lang.String str14 = faculty3.getID();
        java.lang.String str15 = faculty3.getID();
        java.lang.String str16 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "faculty" + "'", str16, "faculty");
    }

    @Test
    public void test11700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11700");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        java.lang.String str4 = faculty3.getAccountType();
        java.lang.String str5 = faculty3.getID();
        faculty3.setVerified(true);
        faculty3.login("faculty", "faculty");
        java.lang.String str11 = faculty3.getPassword();
        java.lang.String str12 = faculty3.getEmail();
        boolean boolean13 = faculty3.isVerified();
        java.lang.Class<?> wildcardClass14 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "faculty" + "'", str4, "faculty");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test11701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11701");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        faculty3.logout();
        faculty3.viewProfile();
        faculty3.viewProfile();
        double double7 = faculty3.getHourlyRate();
        java.lang.String str8 = faculty3.getPassword();
        java.lang.String str9 = faculty3.getEmail();
        double double10 = faculty3.getHourlyRate();
        java.lang.String str11 = faculty3.getAccountType();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 30.0d + "'", double10 == 30.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "faculty" + "'", str11, "faculty");
    }

    @Test
    public void test11702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11702");
        model.Faculty faculty3 = new model.Faculty("faculty", "hi!", "");
        faculty3.login("hi!", "hi!");
        faculty3.logout();
        faculty3.setVerified(false);
        java.lang.String str10 = faculty3.getEmail();
        java.lang.String str11 = faculty3.getEmail();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "faculty" + "'", str10, "faculty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "faculty" + "'", str11, "faculty");
    }

    @Test
    public void test11703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11703");
        model.Faculty faculty3 = new model.Faculty("", "faculty", "");
        java.lang.String str4 = faculty3.getPassword();
        java.lang.String str5 = faculty3.getEmail();
        faculty3.logout();
        faculty3.viewProfile();
        java.lang.Class<?> wildcardClass8 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "faculty" + "'", str4, "faculty");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test11704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11704");
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
        java.lang.String str16 = faculty3.getID();
        faculty3.login("faculty", "faculty");
        faculty3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test11705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11705");
        model.Faculty faculty3 = new model.Faculty("", "", "faculty");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getPassword();
        faculty3.login("", "");
        faculty3.login("hi!", "hi!");
        java.lang.String str12 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "faculty" + "'", str4, "faculty");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "faculty" + "'", str12, "faculty");
    }

    @Test
    public void test11706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11706");
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
        faculty3.logout();
        java.lang.String str16 = faculty3.getID();
        java.lang.String str17 = faculty3.getID();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "faculty" + "'", str14, "faculty");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test11707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11707");
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
        faculty3.viewProfile();
        java.lang.String str18 = faculty3.getAccountType();
        java.lang.String str19 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 30.0d + "'", double11 == 30.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "faculty" + "'", str18, "faculty");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "faculty" + "'", str19, "faculty");
    }

    @Test
    public void test11708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11708");
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
        faculty3.setVerified(false);
        faculty3.login("hi!", "faculty");
        java.lang.String str20 = faculty3.getEmail();
        faculty3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "faculty" + "'", str11, "faculty");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 30.0d + "'", double13 == 30.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test11709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11709");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        java.lang.String str6 = faculty3.getPassword();
        faculty3.setVerified(false);
        faculty3.setVerified(true);
        double double11 = faculty3.getHourlyRate();
        java.lang.String str12 = faculty3.getEmail();
        java.lang.String str13 = faculty3.getID();
        faculty3.setVerified(false);
        java.lang.Class<?> wildcardClass16 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 30.0d + "'", double11 == 30.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test11710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11710");
        model.Faculty faculty3 = new model.Faculty("hi!", "hi!", "faculty");
        faculty3.logout();
        java.lang.String str5 = faculty3.getEmail();
        faculty3.login("faculty", "");
        faculty3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test11711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11711");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        java.lang.String str4 = faculty3.getAccountType();
        java.lang.String str5 = faculty3.getID();
        faculty3.setVerified(true);
        java.lang.String str8 = faculty3.getAccountType();
        java.lang.String str9 = faculty3.getPassword();
        java.lang.String str10 = faculty3.getPassword();
        java.lang.String str11 = faculty3.getAccountType();
        java.lang.String str12 = faculty3.getEmail();
        java.lang.Class<?> wildcardClass13 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "faculty" + "'", str4, "faculty");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "faculty" + "'", str8, "faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "faculty" + "'", str11, "faculty");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test11712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11712");
        model.Faculty faculty3 = new model.Faculty("hi!", "faculty", "");
        java.lang.String str4 = faculty3.getPassword();
        faculty3.logout();
        faculty3.setVerified(true);
        faculty3.login("hi!", "faculty");
        faculty3.login("hi!", "faculty");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "faculty" + "'", str4, "faculty");
    }

    @Test
    public void test11713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11713");
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
        faculty3.login("hi!", "");
        double double19 = faculty3.getHourlyRate();
        boolean boolean20 = faculty3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 30.0d + "'", double19 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test11714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11714");
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
        java.lang.String str14 = faculty3.getPassword();
        faculty3.viewProfile();
        faculty3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "faculty" + "'", str8, "faculty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "faculty" + "'", str11, "faculty");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test11715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11715");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getEmail();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        faculty3.login("hi!", "faculty");
        double double11 = faculty3.getHourlyRate();
        faculty3.logout();
        java.lang.String str13 = faculty3.getEmail();
        java.lang.String str14 = faculty3.getEmail();
        java.lang.String str15 = faculty3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 30.0d + "'", double11 == 30.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test11716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11716");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        faculty3.logout();
        faculty3.login("hi!", "hi!");
        double double8 = faculty3.getHourlyRate();
        boolean boolean9 = faculty3.isVerified();
        java.lang.String str10 = faculty3.getAccountType();
        faculty3.setVerified(false);
        faculty3.login("hi!", "hi!");
        faculty3.setVerified(false);
        faculty3.logout();
        java.lang.Class<?> wildcardClass19 = faculty3.getClass();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "faculty" + "'", str10, "faculty");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test11717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11717");
        model.Faculty faculty3 = new model.Faculty("hi!", "hi!", "");
        faculty3.setVerified(true);
        double double6 = faculty3.getHourlyRate();
        java.lang.String str7 = faculty3.getEmail();
        java.lang.String str8 = faculty3.getEmail();
        java.lang.String str9 = faculty3.getEmail();
        faculty3.login("", "");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test11718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11718");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        java.lang.String str4 = faculty3.getAccountType();
        java.lang.String str5 = faculty3.getEmail();
        double double6 = faculty3.getHourlyRate();
        double double7 = faculty3.getHourlyRate();
        faculty3.login("hi!", "");
        boolean boolean11 = faculty3.isVerified();
        double double12 = faculty3.getHourlyRate();
        java.lang.String str13 = faculty3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "faculty" + "'", str4, "faculty");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 30.0d + "'", double12 == 30.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test11719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11719");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        java.lang.String str4 = faculty3.getAccountType();
        java.lang.String str5 = faculty3.getID();
        faculty3.setVerified(true);
        faculty3.login("faculty", "faculty");
        double double11 = faculty3.getHourlyRate();
        faculty3.viewProfile();
        java.lang.String str13 = faculty3.getID();
        faculty3.viewProfile();
        double double15 = faculty3.getHourlyRate();
        boolean boolean16 = faculty3.isVerified();
        faculty3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "faculty" + "'", str4, "faculty");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 30.0d + "'", double11 == 30.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 30.0d + "'", double15 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test11720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11720");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        java.lang.String str8 = faculty3.getPassword();
        java.lang.String str9 = faculty3.getID();
        faculty3.logout();
        java.lang.String str11 = faculty3.getEmail();
        java.lang.String str12 = faculty3.getAccountType();
        faculty3.login("hi!", "faculty");
        java.lang.String str16 = faculty3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "faculty" + "'", str12, "faculty");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test11721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11721");
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
        java.lang.String str16 = faculty3.getPassword();
        double double17 = faculty3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 30.0d + "'", double17 == 30.0d);
    }

    @Test
    public void test11722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11722");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        faculty3.setVerified(false);
        java.lang.String str10 = faculty3.getID();
        faculty3.viewProfile();
        java.lang.String str12 = faculty3.getID();
        faculty3.logout();
        boolean boolean14 = faculty3.isVerified();
        java.lang.String str15 = faculty3.getAccountType();
        boolean boolean16 = faculty3.isVerified();
        double double17 = faculty3.getHourlyRate();
        java.lang.String str18 = faculty3.getPassword();
        faculty3.setVerified(false);
        faculty3.login("", "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "faculty" + "'", str15, "faculty");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 30.0d + "'", double17 == 30.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test11723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11723");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        boolean boolean7 = faculty3.isVerified();
        java.lang.String str8 = faculty3.getEmail();
        faculty3.setVerified(true);
        double double11 = faculty3.getHourlyRate();
        java.lang.String str12 = faculty3.getID();
        faculty3.setVerified(false);
        java.lang.String str15 = faculty3.getPassword();
        java.lang.String str16 = faculty3.getID();
        java.lang.String str17 = faculty3.getPassword();
        java.lang.String str18 = faculty3.getPassword();
        faculty3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 30.0d + "'", double11 == 30.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test11724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11724");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        faculty3.setVerified(false);
        faculty3.viewProfile();
        java.lang.String str7 = faculty3.getEmail();
        java.lang.String str8 = faculty3.getAccountType();
        faculty3.logout();
        java.lang.String str10 = faculty3.getEmail();
        java.lang.String str11 = faculty3.getID();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "faculty" + "'", str8, "faculty");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test11725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11725");
        model.Faculty faculty3 = new model.Faculty("", "", "");
        faculty3.viewProfile();
        java.lang.String str5 = faculty3.getEmail();
        java.lang.String str6 = faculty3.getEmail();
        faculty3.login("hi!", "hi!");
        boolean boolean10 = faculty3.isVerified();
        faculty3.setVerified(false);
        double double13 = faculty3.getHourlyRate();
        java.lang.String str14 = faculty3.getAccountType();
        java.lang.String str15 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 30.0d + "'", double13 == 30.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "faculty" + "'", str14, "faculty");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "faculty" + "'", str15, "faculty");
    }

    @Test
    public void test11726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11726");
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
        faculty3.viewProfile();
        faculty3.setVerified(true);
        faculty3.logout();
        java.lang.String str20 = faculty3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test11727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11727");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        java.lang.String str7 = faculty3.getID();
        faculty3.setVerified(true);
        java.lang.String str10 = faculty3.getAccountType();
        java.lang.String str11 = faculty3.getPassword();
        java.lang.String str12 = faculty3.getAccountType();
        java.lang.String str13 = faculty3.getID();
        faculty3.viewProfile();
        faculty3.viewProfile();
        faculty3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "faculty" + "'", str10, "faculty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "faculty" + "'", str12, "faculty");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test11728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11728");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        faculty3.login("", "");
        java.lang.String str7 = faculty3.getPassword();
        java.lang.String str8 = faculty3.getEmail();
        java.lang.String str9 = faculty3.getPassword();
        java.lang.String str10 = faculty3.getPassword();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test11729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11729");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        faculty3.logout();
        java.lang.String str5 = faculty3.getID();
        java.lang.String str6 = faculty3.getEmail();
        double double7 = faculty3.getHourlyRate();
        boolean boolean8 = faculty3.isVerified();
        boolean boolean9 = faculty3.isVerified();
        faculty3.login("", "faculty");
        faculty3.setVerified(true);
        faculty3.login("faculty", "hi!");
        faculty3.logout();
        java.lang.String str19 = faculty3.getPassword();
        faculty3.setVerified(true);
        double double22 = faculty3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 30.0d + "'", double22 == 30.0d);
    }

    @Test
    public void test11730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11730");
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
        faculty3.viewProfile();
        java.lang.String str22 = faculty3.getEmail();
        java.lang.String str23 = faculty3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test11731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11731");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        java.lang.String str7 = faculty3.getID();
        double double8 = faculty3.getHourlyRate();
        java.lang.String str9 = faculty3.getID();
        boolean boolean10 = faculty3.isVerified();
        faculty3.setVerified(false);
        faculty3.login("faculty", "hi!");
        boolean boolean16 = faculty3.isVerified();
        faculty3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test11732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11732");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        faculty3.setVerified(false);
        faculty3.viewProfile();
        java.lang.String str11 = faculty3.getEmail();
        java.lang.String str12 = faculty3.getPassword();
        java.lang.String str13 = faculty3.getPassword();
        java.lang.String str14 = faculty3.getID();
        boolean boolean15 = faculty3.isVerified();
        faculty3.login("", "hi!");
        faculty3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test11733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11733");
        model.Faculty faculty3 = new model.Faculty("faculty", "", "faculty");
        faculty3.setVerified(false);
        double double6 = faculty3.getHourlyRate();
        faculty3.setVerified(true);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
    }

    @Test
    public void test11734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11734");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        java.lang.String str4 = faculty3.getAccountType();
        java.lang.String str5 = faculty3.getEmail();
        double double6 = faculty3.getHourlyRate();
        faculty3.logout();
        faculty3.viewProfile();
        boolean boolean9 = faculty3.isVerified();
        faculty3.login("", "hi!");
        double double13 = faculty3.getHourlyRate();
        boolean boolean14 = faculty3.isVerified();
        java.lang.Class<?> wildcardClass15 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "faculty" + "'", str4, "faculty");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 30.0d + "'", double13 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test11735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11735");
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
        faculty3.login("hi!", "");
        boolean boolean22 = faculty3.isVerified();
        java.lang.String str23 = faculty3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
    }

    @Test
    public void test11736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11736");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        java.lang.String str6 = faculty3.getPassword();
        faculty3.setVerified(false);
        java.lang.String str9 = faculty3.getEmail();
        java.lang.String str10 = faculty3.getID();
        faculty3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test11737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11737");
        model.Faculty faculty3 = new model.Faculty("hi!", "hi!", "");
        faculty3.setVerified(false);
        java.lang.String str6 = faculty3.getID();
        faculty3.setVerified(false);
        double double9 = faculty3.getHourlyRate();
        java.lang.String str10 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 30.0d + "'", double9 == 30.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "faculty" + "'", str10, "faculty");
    }

    @Test
    public void test11738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11738");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        faculty3.logout();
        java.lang.String str5 = faculty3.getID();
        java.lang.String str6 = faculty3.getPassword();
        double double7 = faculty3.getHourlyRate();
        faculty3.setVerified(false);
        java.lang.String str10 = faculty3.getID();
        java.lang.String str11 = faculty3.getID();
        java.lang.String str12 = faculty3.getAccountType();
        java.lang.String str13 = faculty3.getEmail();
        java.lang.String str14 = faculty3.getEmail();
        java.lang.Class<?> wildcardClass15 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "faculty" + "'", str12, "faculty");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test11739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11739");
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
        double double19 = faculty3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 30.0d + "'", double4 == 30.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "faculty" + "'", str14, "faculty");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 30.0d + "'", double17 == 30.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 30.0d + "'", double19 == 30.0d);
    }

    @Test
    public void test11740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11740");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        java.lang.String str4 = faculty3.getAccountType();
        java.lang.String str5 = faculty3.getID();
        faculty3.setVerified(true);
        faculty3.login("faculty", "faculty");
        java.lang.String str11 = faculty3.getPassword();
        java.lang.String str12 = faculty3.getEmail();
        faculty3.logout();
        faculty3.setVerified(true);
        java.lang.String str16 = faculty3.getPassword();
        faculty3.login("faculty", "faculty");
        java.lang.String str20 = faculty3.getID();
        java.lang.String str21 = faculty3.getEmail();
        java.lang.Class<?> wildcardClass22 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "faculty" + "'", str4, "faculty");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test11741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11741");
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
        faculty3.setVerified(false);
        faculty3.viewProfile();
        double double19 = faculty3.getHourlyRate();
        java.lang.String str20 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "faculty" + "'", str13, "faculty");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "faculty" + "'", str14, "faculty");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 30.0d + "'", double19 == 30.0d);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "faculty" + "'", str20, "faculty");
    }

    @Test
    public void test11742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11742");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        java.lang.String str4 = faculty3.getAccountType();
        java.lang.String str5 = faculty3.getID();
        faculty3.setVerified(true);
        boolean boolean8 = faculty3.isVerified();
        faculty3.logout();
        faculty3.viewProfile();
        java.lang.String str11 = faculty3.getEmail();
        boolean boolean12 = faculty3.isVerified();
        java.lang.String str13 = faculty3.getAccountType();
        faculty3.viewProfile();
        boolean boolean15 = faculty3.isVerified();
        java.lang.String str16 = faculty3.getAccountType();
        faculty3.login("hi!", "");
        faculty3.setVerified(false);
        java.lang.Class<?> wildcardClass22 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "faculty" + "'", str4, "faculty");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "faculty" + "'", str13, "faculty");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "faculty" + "'", str16, "faculty");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test11743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11743");
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
        java.lang.String str13 = faculty3.getEmail();
        double double14 = faculty3.getHourlyRate();
        java.lang.String str15 = faculty3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 30.0d + "'", double14 == 30.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test11744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11744");
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
        double double16 = faculty3.getHourlyRate();
        faculty3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "faculty" + "'", str12, "faculty");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 30.0d + "'", double15 == 30.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 30.0d + "'", double16 == 30.0d);
    }

    @Test
    public void test11745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11745");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        faculty3.logout();
        java.lang.String str5 = faculty3.getID();
        java.lang.String str6 = faculty3.getEmail();
        double double7 = faculty3.getHourlyRate();
        boolean boolean8 = faculty3.isVerified();
        java.lang.String str9 = faculty3.getID();
        double double10 = faculty3.getHourlyRate();
        faculty3.setVerified(false);
        double double13 = faculty3.getHourlyRate();
        faculty3.setVerified(true);
        java.lang.String str16 = faculty3.getPassword();
        double double17 = faculty3.getHourlyRate();
        faculty3.viewProfile();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 30.0d + "'", double10 == 30.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 30.0d + "'", double13 == 30.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 30.0d + "'", double17 == 30.0d);
    }

    @Test
    public void test11746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11746");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        faculty3.logout();
        java.lang.String str5 = faculty3.getID();
        java.lang.String str6 = faculty3.getEmail();
        java.lang.String str7 = faculty3.getID();
        boolean boolean8 = faculty3.isVerified();
        java.lang.String str9 = faculty3.getEmail();
        java.lang.String str10 = faculty3.getAccountType();
        java.lang.String str11 = faculty3.getEmail();
        faculty3.login("", "faculty");
        java.lang.String str15 = faculty3.getAccountType();
        faculty3.logout();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "faculty" + "'", str10, "faculty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "faculty" + "'", str15, "faculty");
    }

    @Test
    public void test11747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11747");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        faculty3.logout();
        java.lang.String str5 = faculty3.getID();
        java.lang.String str6 = faculty3.getEmail();
        double double7 = faculty3.getHourlyRate();
        boolean boolean8 = faculty3.isVerified();
        boolean boolean9 = faculty3.isVerified();
        faculty3.login("", "faculty");
        faculty3.setVerified(true);
        faculty3.login("faculty", "hi!");
        faculty3.login("hi!", "faculty");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test11748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11748");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        java.lang.String str8 = faculty3.getPassword();
        java.lang.String str9 = faculty3.getID();
        double double10 = faculty3.getHourlyRate();
        double double11 = faculty3.getHourlyRate();
        faculty3.setVerified(true);
        java.lang.String str14 = faculty3.getAccountType();
        java.lang.String str15 = faculty3.getID();
        java.lang.String str16 = faculty3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 30.0d + "'", double10 == 30.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 30.0d + "'", double11 == 30.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "faculty" + "'", str14, "faculty");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test11749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11749");
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
        java.lang.String str13 = faculty3.getAccountType();
        java.lang.Class<?> wildcardClass14 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "faculty" + "'", str8, "faculty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "faculty" + "'", str13, "faculty");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test11750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11750");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        faculty3.logout();
        faculty3.login("hi!", "hi!");
        faculty3.viewProfile();
        java.lang.String str9 = faculty3.getPassword();
        java.lang.String str10 = faculty3.getID();
        faculty3.logout();
        boolean boolean12 = faculty3.isVerified();
        boolean boolean13 = faculty3.isVerified();
        java.lang.String str14 = faculty3.getID();
        faculty3.logout();
        java.lang.String str16 = faculty3.getAccountType();
        java.lang.String str17 = faculty3.getAccountType();
        java.lang.String str18 = faculty3.getPassword();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "faculty" + "'", str16, "faculty");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "faculty" + "'", str17, "faculty");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test11751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11751");
        model.Faculty faculty3 = new model.Faculty("", "faculty", "");
        faculty3.setVerified(true);
        faculty3.login("", "hi!");
        boolean boolean9 = faculty3.isVerified();
        java.lang.String str10 = faculty3.getPassword();
        java.lang.String str11 = faculty3.getPassword();
        java.lang.String str12 = faculty3.getAccountType();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "faculty" + "'", str10, "faculty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "faculty" + "'", str11, "faculty");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "faculty" + "'", str12, "faculty");
    }

    @Test
    public void test11752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11752");
        model.Faculty faculty3 = new model.Faculty("hi!", "faculty", "");
        faculty3.logout();
        java.lang.String str5 = faculty3.getEmail();
        faculty3.login("", "");
        java.lang.String str9 = faculty3.getPassword();
        java.lang.String str10 = faculty3.getEmail();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "faculty" + "'", str9, "faculty");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test11753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11753");
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
        java.lang.String str13 = faculty3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "faculty" + "'", str9, "faculty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test11754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11754");
        model.Faculty faculty3 = new model.Faculty("", "", "faculty");
        java.lang.String str4 = faculty3.getAccountType();
        boolean boolean5 = faculty3.isVerified();
        faculty3.setVerified(false);
        java.lang.String str8 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "faculty" + "'", str4, "faculty");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "faculty" + "'", str8, "faculty");
    }

    @Test
    public void test11755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11755");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        double double6 = faculty3.getHourlyRate();
        java.lang.String str7 = faculty3.getID();
        faculty3.setVerified(false);
        java.lang.String str10 = faculty3.getID();
        faculty3.setVerified(true);
        faculty3.login("hi!", "hi!");
        faculty3.setVerified(false);
        java.lang.String str18 = faculty3.getAccountType();
        faculty3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "faculty" + "'", str18, "faculty");
    }

    @Test
    public void test11756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11756");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        java.lang.String str4 = faculty3.getAccountType();
        java.lang.String str5 = faculty3.getEmail();
        faculty3.viewProfile();
        faculty3.setVerified(true);
        java.lang.String str9 = faculty3.getPassword();
        faculty3.setVerified(false);
        faculty3.setVerified(true);
        java.lang.String str14 = faculty3.getID();
        java.lang.String str15 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "faculty" + "'", str4, "faculty");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "faculty" + "'", str15, "faculty");
    }

    @Test
    public void test11757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11757");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        java.lang.String str6 = faculty3.getPassword();
        java.lang.String str7 = faculty3.getPassword();
        java.lang.String str8 = faculty3.getID();
        java.lang.String str9 = faculty3.getID();
        faculty3.viewProfile();
        java.lang.String str11 = faculty3.getID();
        faculty3.viewProfile();
        faculty3.setVerified(false);
        java.lang.String str15 = faculty3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test11758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11758");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        faculty3.login("", "");
        faculty3.viewProfile();
        faculty3.viewProfile();
        faculty3.login("", "");
        java.lang.String str12 = faculty3.getEmail();
        java.lang.String str13 = faculty3.getEmail();
        faculty3.setVerified(true);
        faculty3.setVerified(true);
        java.lang.String str18 = faculty3.getAccountType();
        java.lang.String str19 = faculty3.getPassword();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "faculty" + "'", str18, "faculty");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test11759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11759");
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
        faculty3.logout();
        java.lang.String str21 = faculty3.getEmail();
        java.lang.String str22 = faculty3.getEmail();
        faculty3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test11760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11760");
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
        faculty3.setVerified(true);
        double double17 = faculty3.getHourlyRate();
        double double18 = faculty3.getHourlyRate();
        boolean boolean19 = faculty3.isVerified();
        java.lang.String str20 = faculty3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "faculty" + "'", str7, "faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 30.0d + "'", double17 == 30.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 30.0d + "'", double18 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test11761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11761");
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
        faculty3.login("hi!", "hi!");
        faculty3.login("", "faculty");
        faculty3.logout();
        boolean boolean24 = faculty3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "faculty" + "'", str14, "faculty");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test11762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11762");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        java.lang.String str7 = faculty3.getID();
        faculty3.login("hi!", "");
        java.lang.String str11 = faculty3.getPassword();
        java.lang.String str12 = faculty3.getPassword();
        faculty3.logout();
        java.lang.String str14 = faculty3.getPassword();
        faculty3.setVerified(false);
        faculty3.setVerified(false);
        faculty3.logout();
        boolean boolean20 = faculty3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test11763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11763");
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
        double double14 = faculty3.getHourlyRate();
        faculty3.setVerified(false);
        faculty3.setVerified(false);
        double double19 = faculty3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "faculty" + "'", str10, "faculty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 30.0d + "'", double14 == 30.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 30.0d + "'", double19 == 30.0d);
    }

    @Test
    public void test11764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11764");
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
        boolean boolean22 = faculty3.isVerified();
        java.lang.String str23 = faculty3.getPassword();
        faculty3.login("", "faculty");
        java.lang.Class<?> wildcardClass27 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 30.0d + "'", double18 == 30.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 30.0d + "'", double21 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test11765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11765");
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
        faculty3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test11766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11766");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        boolean boolean7 = faculty3.isVerified();
        faculty3.logout();
        faculty3.logout();
        faculty3.viewProfile();
        faculty3.viewProfile();
        faculty3.logout();
        java.lang.String str13 = faculty3.getAccountType();
        faculty3.login("", "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "faculty" + "'", str13, "faculty");
    }

    @Test
    public void test11767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11767");
        model.Faculty faculty3 = new model.Faculty("", "", "faculty");
        java.lang.String str4 = faculty3.getAccountType();
        java.lang.String str5 = faculty3.getID();
        java.lang.String str6 = faculty3.getAccountType();
        java.lang.String str7 = faculty3.getEmail();
        java.lang.String str8 = faculty3.getPassword();
        java.lang.String str9 = faculty3.getID();
        java.lang.String str10 = faculty3.getID();
        faculty3.login("faculty", "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "faculty" + "'", str4, "faculty");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "faculty" + "'", str9, "faculty");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "faculty" + "'", str10, "faculty");
    }

    @Test
    public void test11768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11768");
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
        double double17 = faculty3.getHourlyRate();
        java.lang.String str18 = faculty3.getPassword();
        java.lang.Class<?> wildcardClass19 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 30.0d + "'", double17 == 30.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test11769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11769");
        model.Faculty faculty3 = new model.Faculty("", "", "faculty");
        java.lang.String str4 = faculty3.getID();
        double double5 = faculty3.getHourlyRate();
        java.lang.String str6 = faculty3.getEmail();
        java.lang.String str7 = faculty3.getPassword();
        java.lang.String str8 = faculty3.getEmail();
        faculty3.setVerified(true);
        java.lang.String str11 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "faculty" + "'", str4, "faculty");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 30.0d + "'", double5 == 30.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "faculty" + "'", str11, "faculty");
    }

    @Test
    public void test11770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11770");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        java.lang.String str8 = faculty3.getAccountType();
        java.lang.String str9 = faculty3.getAccountType();
        faculty3.setVerified(true);
        faculty3.setVerified(true);
        java.lang.String str14 = faculty3.getEmail();
        java.lang.String str15 = faculty3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "faculty" + "'", str8, "faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "faculty" + "'", str9, "faculty");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test11771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11771");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        java.lang.String str8 = faculty3.getPassword();
        java.lang.String str9 = faculty3.getPassword();
        faculty3.setVerified(true);
        faculty3.login("hi!", "hi!");
        boolean boolean15 = faculty3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test11772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11772");
        model.Faculty faculty3 = new model.Faculty("", "faculty", "faculty");
        faculty3.setVerified(true);
        faculty3.logout();
        java.lang.String str7 = faculty3.getPassword();
        double double8 = faculty3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "faculty" + "'", str7, "faculty");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
    }

    @Test
    public void test11773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11773");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        faculty3.setVerified(false);
        java.lang.String str6 = faculty3.getPassword();
        java.lang.String str7 = faculty3.getAccountType();
        java.lang.String str8 = faculty3.getEmail();
        faculty3.setVerified(true);
        boolean boolean11 = faculty3.isVerified();
        faculty3.login("hi!", "faculty");
        boolean boolean15 = faculty3.isVerified();
        faculty3.viewProfile();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "faculty" + "'", str7, "faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test11774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11774");
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
        boolean boolean18 = faculty3.isVerified();
        faculty3.login("hi!", "");
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
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test11775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11775");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        java.lang.String str4 = faculty3.getAccountType();
        java.lang.String str5 = faculty3.getEmail();
        faculty3.viewProfile();
        faculty3.setVerified(true);
        java.lang.String str9 = faculty3.getPassword();
        faculty3.login("hi!", "");
        faculty3.setVerified(true);
        double double15 = faculty3.getHourlyRate();
        java.lang.String str16 = faculty3.getPassword();
        faculty3.setVerified(false);
        faculty3.login("hi!", "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "faculty" + "'", str4, "faculty");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 30.0d + "'", double15 == 30.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test11776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11776");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        java.lang.String str4 = faculty3.getAccountType();
        java.lang.String str5 = faculty3.getEmail();
        faculty3.viewProfile();
        faculty3.logout();
        faculty3.login("faculty", "faculty");
        java.lang.String str11 = faculty3.getAccountType();
        java.lang.String str12 = faculty3.getAccountType();
        java.lang.String str13 = faculty3.getAccountType();
        faculty3.logout();
        boolean boolean15 = faculty3.isVerified();
        faculty3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "faculty" + "'", str4, "faculty");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "faculty" + "'", str11, "faculty");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "faculty" + "'", str12, "faculty");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "faculty" + "'", str13, "faculty");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test11777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11777");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        java.lang.String str7 = faculty3.getID();
        faculty3.setVerified(true);
        java.lang.String str10 = faculty3.getAccountType();
        java.lang.String str11 = faculty3.getPassword();
        faculty3.viewProfile();
        java.lang.String str13 = faculty3.getID();
        faculty3.logout();
        java.lang.String str15 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "faculty" + "'", str10, "faculty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "faculty" + "'", str15, "faculty");
    }

    @Test
    public void test11778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11778");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        faculty3.logout();
        faculty3.login("hi!", "hi!");
        java.lang.String str8 = faculty3.getID();
        boolean boolean9 = faculty3.isVerified();
        faculty3.setVerified(true);
        java.lang.String str12 = faculty3.getPassword();
        java.lang.String str13 = faculty3.getPassword();
        java.lang.String str14 = faculty3.getEmail();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test11779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11779");
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
        java.lang.String str23 = faculty3.getEmail();
        faculty3.setVerified(false);
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
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test11780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11780");
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
        java.lang.String str23 = faculty3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 30.0d + "'", double18 == 30.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
    }

    @Test
    public void test11781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11781");
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
        java.lang.String str22 = faculty3.getAccountType();
        faculty3.logout();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "faculty" + "'", str21, "faculty");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "faculty" + "'", str22, "faculty");
    }

    @Test
    public void test11782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11782");
        model.Faculty faculty3 = new model.Faculty("faculty", "hi!", "");
        faculty3.login("hi!", "hi!");
        faculty3.logout();
        faculty3.setVerified(false);
        faculty3.viewProfile();
        boolean boolean11 = faculty3.isVerified();
        faculty3.login("", "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test11783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11783");
        model.Faculty faculty3 = new model.Faculty("hi!", "faculty", "");
        java.lang.String str4 = faculty3.getEmail();
        faculty3.logout();
        java.lang.String str6 = faculty3.getEmail();
        faculty3.viewProfile();
        java.lang.Class<?> wildcardClass8 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test11784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11784");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        faculty3.setVerified(false);
        java.lang.String str6 = faculty3.getEmail();
        java.lang.String str7 = faculty3.getAccountType();
        java.lang.String str8 = faculty3.getAccountType();
        boolean boolean9 = faculty3.isVerified();
        java.lang.String str10 = faculty3.getID();
        double double11 = faculty3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "faculty" + "'", str7, "faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "faculty" + "'", str8, "faculty");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 30.0d + "'", double11 == 30.0d);
    }

    @Test
    public void test11785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11785");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        java.lang.String str6 = faculty3.getPassword();
        faculty3.setVerified(false);
        faculty3.setVerified(true);
        double double11 = faculty3.getHourlyRate();
        faculty3.login("", "faculty");
        java.lang.String str15 = faculty3.getEmail();
        boolean boolean16 = faculty3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 30.0d + "'", double11 == 30.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test11786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11786");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        faculty3.logout();
        faculty3.login("hi!", "hi!");
        double double8 = faculty3.getHourlyRate();
        boolean boolean9 = faculty3.isVerified();
        boolean boolean10 = faculty3.isVerified();
        boolean boolean11 = faculty3.isVerified();
        boolean boolean12 = faculty3.isVerified();
        java.lang.String str13 = faculty3.getPassword();
        faculty3.logout();
        faculty3.login("", "faculty");
        java.lang.String str18 = faculty3.getPassword();
        faculty3.setVerified(false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test11787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11787");
        model.Faculty faculty3 = new model.Faculty("hi!", "faculty", "");
        java.lang.String str4 = faculty3.getEmail();
        faculty3.logout();
        java.lang.String str6 = faculty3.getID();
        boolean boolean7 = faculty3.isVerified();
        java.lang.String str8 = faculty3.getAccountType();
        faculty3.login("hi!", "");
        faculty3.viewProfile();
        faculty3.logout();
        faculty3.setVerified(true);
        boolean boolean16 = faculty3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "faculty" + "'", str8, "faculty");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test11788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11788");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        faculty3.setVerified(false);
        java.lang.String str6 = faculty3.getEmail();
        java.lang.String str7 = faculty3.getAccountType();
        java.lang.String str8 = faculty3.getPassword();
        java.lang.String str9 = faculty3.getAccountType();
        faculty3.setVerified(true);
        java.lang.String str12 = faculty3.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "faculty" + "'", str7, "faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "faculty" + "'", str9, "faculty");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test11789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11789");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        java.lang.String str6 = faculty3.getPassword();
        faculty3.setVerified(false);
        faculty3.setVerified(true);
        faculty3.viewProfile();
        java.lang.String str12 = faculty3.getID();
        double double13 = faculty3.getHourlyRate();
        faculty3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 30.0d + "'", double13 == 30.0d);
    }

    @Test
    public void test11790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11790");
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
        faculty3.logout();
        boolean boolean17 = faculty3.isVerified();
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
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test11791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11791");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        double double6 = faculty3.getHourlyRate();
        java.lang.String str7 = faculty3.getID();
        boolean boolean8 = faculty3.isVerified();
        faculty3.setVerified(true);
        faculty3.setVerified(true);
        faculty3.viewProfile();
        faculty3.viewProfile();
        java.lang.String str15 = faculty3.getAccountType();
        java.lang.String str16 = faculty3.getEmail();
        boolean boolean17 = faculty3.isVerified();
        java.lang.String str18 = faculty3.getEmail();
        java.lang.String str19 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "faculty" + "'", str15, "faculty");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "faculty" + "'", str19, "faculty");
    }

    @Test
    public void test11792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11792");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        faculty3.login("", "");
        double double7 = faculty3.getHourlyRate();
        boolean boolean8 = faculty3.isVerified();
        java.lang.String str9 = faculty3.getEmail();
        java.lang.String str10 = faculty3.getEmail();
        faculty3.login("hi!", "");
        faculty3.setVerified(false);
        java.lang.String str16 = faculty3.getID();
        java.lang.String str17 = faculty3.getID();
        boolean boolean18 = faculty3.isVerified();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test11793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11793");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        double double6 = faculty3.getHourlyRate();
        faculty3.logout();
        faculty3.setVerified(false);
        faculty3.logout();
        java.lang.String str11 = faculty3.getAccountType();
        java.lang.String str12 = faculty3.getAccountType();
        java.lang.String str13 = faculty3.getPassword();
        double double14 = faculty3.getHourlyRate();
        java.lang.String str15 = faculty3.getEmail();
        java.lang.String str16 = faculty3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "faculty" + "'", str11, "faculty");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "faculty" + "'", str12, "faculty");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 30.0d + "'", double14 == 30.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test11794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11794");
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
        double double14 = faculty3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 30.0d + "'", double10 == 30.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 30.0d + "'", double14 == 30.0d);
    }

    @Test
    public void test11795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11795");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        double double6 = faculty3.getHourlyRate();
        java.lang.String str7 = faculty3.getPassword();
        java.lang.String str8 = faculty3.getPassword();
        java.lang.String str9 = faculty3.getAccountType();
        faculty3.login("hi!", "faculty");
        faculty3.viewProfile();
        double double14 = faculty3.getHourlyRate();
        double double15 = faculty3.getHourlyRate();
        java.lang.String str16 = faculty3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "faculty" + "'", str9, "faculty");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 30.0d + "'", double14 == 30.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 30.0d + "'", double15 == 30.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test11796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11796");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        faculty3.logout();
        faculty3.login("hi!", "hi!");
        double double8 = faculty3.getHourlyRate();
        boolean boolean9 = faculty3.isVerified();
        java.lang.String str10 = faculty3.getAccountType();
        java.lang.String str11 = faculty3.getPassword();
        java.lang.String str12 = faculty3.getID();
        java.lang.String str13 = faculty3.getPassword();
        java.lang.String str14 = faculty3.getID();
        java.lang.String str15 = faculty3.getEmail();
        boolean boolean16 = faculty3.isVerified();
        java.lang.String str17 = faculty3.getPassword();
        boolean boolean18 = faculty3.isVerified();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "faculty" + "'", str10, "faculty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test11797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11797");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        faculty3.logout();
        java.lang.String str5 = faculty3.getID();
        java.lang.String str6 = faculty3.getEmail();
        faculty3.viewProfile();
        faculty3.login("hi!", "faculty");
        java.lang.String str11 = faculty3.getID();
        faculty3.viewProfile();
        faculty3.logout();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test11798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11798");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        faculty3.setVerified(false);
        java.lang.String str10 = faculty3.getID();
        faculty3.viewProfile();
        double double12 = faculty3.getHourlyRate();
        faculty3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 30.0d + "'", double12 == 30.0d);
    }

    @Test
    public void test11799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11799");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        double double6 = faculty3.getHourlyRate();
        java.lang.String str7 = faculty3.getPassword();
        java.lang.String str8 = faculty3.getPassword();
        faculty3.login("faculty", "hi!");
        double double12 = faculty3.getHourlyRate();
        faculty3.setVerified(true);
        java.lang.String str15 = faculty3.getID();
        java.lang.String str16 = faculty3.getID();
        java.lang.String str17 = faculty3.getAccountType();
        java.lang.String str18 = faculty3.getPassword();
        java.lang.Class<?> wildcardClass19 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 30.0d + "'", double12 == 30.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "faculty" + "'", str17, "faculty");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test11800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11800");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        faculty3.logout();
        java.lang.String str5 = faculty3.getID();
        java.lang.String str6 = faculty3.getEmail();
        java.lang.String str7 = faculty3.getID();
        boolean boolean8 = faculty3.isVerified();
        java.lang.String str9 = faculty3.getEmail();
        faculty3.viewProfile();
        java.lang.String str11 = faculty3.getID();
        faculty3.logout();
        faculty3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test11801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11801");
        model.Faculty faculty3 = new model.Faculty("", "faculty", "faculty");
        double double4 = faculty3.getHourlyRate();
        java.lang.String str5 = faculty3.getAccountType();
        double double6 = faculty3.getHourlyRate();
        boolean boolean7 = faculty3.isVerified();
        double double8 = faculty3.getHourlyRate();
        faculty3.setVerified(false);
        java.lang.String str11 = faculty3.getEmail();
        java.lang.String str12 = faculty3.getAccountType();
        java.lang.Class<?> wildcardClass13 = faculty3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 30.0d + "'", double4 == 30.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "faculty" + "'", str12, "faculty");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test11802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11802");
        model.Faculty faculty3 = new model.Faculty("hi!", "faculty", "");
        java.lang.String str4 = faculty3.getEmail();
        faculty3.viewProfile();
        faculty3.logout();
        faculty3.viewProfile();
        java.lang.String str8 = faculty3.getPassword();
        java.lang.String str9 = faculty3.getEmail();
        java.lang.String str10 = faculty3.getID();
        java.lang.String str11 = faculty3.getID();
        faculty3.login("faculty", "faculty");
        java.lang.String str15 = faculty3.getID();
        java.lang.String str16 = faculty3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "faculty" + "'", str8, "faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test11803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11803");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        faculty3.setVerified(false);
        java.lang.String str6 = faculty3.getPassword();
        java.lang.String str7 = faculty3.getAccountType();
        faculty3.viewProfile();
        faculty3.logout();
        faculty3.logout();
        boolean boolean11 = faculty3.isVerified();
        java.lang.String str12 = faculty3.getPassword();
        double double13 = faculty3.getHourlyRate();
        double double14 = faculty3.getHourlyRate();
        faculty3.viewProfile();
        faculty3.logout();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "faculty" + "'", str7, "faculty");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 30.0d + "'", double13 == 30.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 30.0d + "'", double14 == 30.0d);
    }

    @Test
    public void test11804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11804");
        model.Faculty faculty3 = new model.Faculty("", "", "");
        faculty3.viewProfile();
        java.lang.String str5 = faculty3.getEmail();
        java.lang.String str6 = faculty3.getEmail();
        faculty3.logout();
        faculty3.setVerified(true);
        faculty3.login("faculty", "");
        boolean boolean13 = faculty3.isVerified();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test11805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11805");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.viewProfile();
        java.lang.String str8 = faculty3.getAccountType();
        java.lang.String str9 = faculty3.getID();
        faculty3.login("", "hi!");
        double double13 = faculty3.getHourlyRate();
        double double14 = faculty3.getHourlyRate();
        faculty3.setVerified(true);
        faculty3.viewProfile();
        double double18 = faculty3.getHourlyRate();
        faculty3.logout();
        java.lang.String str20 = faculty3.getAccountType();
        java.lang.Class<?> wildcardClass21 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "faculty" + "'", str8, "faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 30.0d + "'", double13 == 30.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 30.0d + "'", double14 == 30.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 30.0d + "'", double18 == 30.0d);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "faculty" + "'", str20, "faculty");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test11806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11806");
        model.Faculty faculty3 = new model.Faculty("faculty", "hi!", "faculty");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getEmail();
        java.lang.String str6 = faculty3.getPassword();
        double double7 = faculty3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "faculty" + "'", str4, "faculty");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
    }

    @Test
    public void test11807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11807");
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
        faculty3.login("faculty", "faculty");
        java.lang.String str20 = faculty3.getEmail();
        faculty3.login("", "faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "faculty" + "'", str8, "faculty");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 30.0d + "'", double14 == 30.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "faculty" + "'", str15, "faculty");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test11808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11808");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        java.lang.String str7 = faculty3.getID();
        java.lang.String str8 = faculty3.getEmail();
        faculty3.login("", "");
        faculty3.logout();
        faculty3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test11809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11809");
        model.Faculty faculty3 = new model.Faculty("hi!", "faculty", "");
        java.lang.String str4 = faculty3.getEmail();
        faculty3.viewProfile();
        faculty3.logout();
        faculty3.viewProfile();
        java.lang.String str8 = faculty3.getPassword();
        java.lang.String str9 = faculty3.getEmail();
        java.lang.String str10 = faculty3.getID();
        java.lang.String str11 = faculty3.getID();
        faculty3.login("faculty", "faculty");
        java.lang.String str15 = faculty3.getAccountType();
        faculty3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "faculty" + "'", str8, "faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "faculty" + "'", str15, "faculty");
    }

    @Test
    public void test11810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11810");
        model.Faculty faculty3 = new model.Faculty("hi!", "hi!", "");
        faculty3.logout();
        java.lang.String str5 = faculty3.getEmail();
        java.lang.String str6 = faculty3.getAccountType();
        faculty3.login("faculty", "faculty");
        double double10 = faculty3.getHourlyRate();
        java.lang.String str11 = faculty3.getID();
        faculty3.login("", "");
        faculty3.viewProfile();
        faculty3.logout();
        java.lang.String str17 = faculty3.getID();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 30.0d + "'", double10 == 30.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test11811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11811");
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
        double double18 = faculty3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 30.0d + "'", double18 == 30.0d);
    }

    @Test
    public void test11812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11812");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        double double8 = faculty3.getHourlyRate();
        boolean boolean9 = faculty3.isVerified();
        java.lang.String str10 = faculty3.getEmail();
        faculty3.logout();
        faculty3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test11813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11813");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        faculty3.logout();
        faculty3.login("hi!", "hi!");
        double double8 = faculty3.getHourlyRate();
        java.lang.String str9 = faculty3.getID();
        faculty3.login("", "faculty");
        java.lang.String str13 = faculty3.getID();
        java.lang.String str14 = faculty3.getEmail();
        double double15 = faculty3.getHourlyRate();
        double double16 = faculty3.getHourlyRate();
        faculty3.setVerified(true);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 30.0d + "'", double15 == 30.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 30.0d + "'", double16 == 30.0d);
    }

    @Test
    public void test11814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11814");
        model.Faculty faculty3 = new model.Faculty("", "", "faculty");
        java.lang.String str4 = faculty3.getID();
        double double5 = faculty3.getHourlyRate();
        double double6 = faculty3.getHourlyRate();
        faculty3.setVerified(false);
        faculty3.setVerified(false);
        faculty3.setVerified(true);
        double double13 = faculty3.getHourlyRate();
        java.lang.String str14 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "faculty" + "'", str4, "faculty");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 30.0d + "'", double5 == 30.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 30.0d + "'", double13 == 30.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "faculty" + "'", str14, "faculty");
    }

    @Test
    public void test11815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11815");
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
        java.lang.String str13 = faculty3.getPassword();
        faculty3.logout();
        faculty3.login("", "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test11816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11816");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        faculty3.logout();
        java.lang.String str5 = faculty3.getID();
        java.lang.String str6 = faculty3.getEmail();
        java.lang.String str7 = faculty3.getID();
        boolean boolean8 = faculty3.isVerified();
        java.lang.String str9 = faculty3.getEmail();
        faculty3.viewProfile();
        java.lang.String str11 = faculty3.getID();
        faculty3.login("hi!", "hi!");
        boolean boolean15 = faculty3.isVerified();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test11817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11817");
        model.Faculty faculty3 = new model.Faculty("faculty", "hi!", "");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getPassword();
        java.lang.String str6 = faculty3.getAccountType();
        double double7 = faculty3.getHourlyRate();
        faculty3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
    }

    @Test
    public void test11818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11818");
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
        java.lang.String str21 = faculty3.getID();
        faculty3.logout();
        faculty3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test11819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11819");
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
        faculty3.login("faculty", "hi!");
        java.lang.String str18 = faculty3.getID();
        faculty3.login("faculty", "");
        java.lang.String str22 = faculty3.getEmail();
        java.lang.String str23 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 30.0d + "'", double14 == 30.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "faculty" + "'", str23, "faculty");
    }

    @Test
    public void test11820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11820");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.viewProfile();
        java.lang.String str8 = faculty3.getAccountType();
        faculty3.logout();
        double double10 = faculty3.getHourlyRate();
        java.lang.String str11 = faculty3.getEmail();
        faculty3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "faculty" + "'", str8, "faculty");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 30.0d + "'", double10 == 30.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test11821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11821");
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
        boolean boolean13 = faculty3.isVerified();
        faculty3.login("faculty", "hi!");
        faculty3.logout();
        faculty3.viewProfile();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "faculty" + "'", str10, "faculty");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 30.0d + "'", double11 == 30.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test11822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11822");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        faculty3.logout();
        faculty3.login("hi!", "hi!");
        faculty3.viewProfile();
        java.lang.String str9 = faculty3.getID();
        faculty3.login("", "");
        faculty3.viewProfile();
        java.lang.String str14 = faculty3.getPassword();
        double double15 = faculty3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 30.0d + "'", double15 == 30.0d);
    }

    @Test
    public void test11823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11823");
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
        double double17 = faculty3.getHourlyRate();
        faculty3.logout();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 30.0d + "'", double17 == 30.0d);
    }

    @Test
    public void test11824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11824");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        faculty3.setVerified(false);
        boolean boolean9 = faculty3.isVerified();
        java.lang.String str10 = faculty3.getPassword();
        faculty3.logout();
        java.lang.String str12 = faculty3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test11825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11825");
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
        faculty3.logout();
        boolean boolean20 = faculty3.isVerified();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "faculty" + "'", str8, "faculty");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "faculty" + "'", str14, "faculty");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 30.0d + "'", double16 == 30.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test11826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11826");
        model.Faculty faculty3 = new model.Faculty("hi!", "hi!", "");
        faculty3.logout();
        faculty3.setVerified(true);
        boolean boolean7 = faculty3.isVerified();
        java.lang.String str8 = faculty3.getID();
        java.lang.String str9 = faculty3.getPassword();
        java.lang.String str10 = faculty3.getAccountType();
        java.lang.String str11 = faculty3.getEmail();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "faculty" + "'", str10, "faculty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test11827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11827");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        double double6 = faculty3.getHourlyRate();
        java.lang.String str7 = faculty3.getPassword();
        faculty3.login("", "faculty");
        java.lang.String str11 = faculty3.getPassword();
        faculty3.logout();
        double double13 = faculty3.getHourlyRate();
        faculty3.login("hi!", "");
        java.lang.String str17 = faculty3.getAccountType();
        boolean boolean18 = faculty3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 30.0d + "'", double13 == 30.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "faculty" + "'", str17, "faculty");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test11828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11828");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getAccountType();
        faculty3.logout();
        java.lang.String str8 = faculty3.getEmail();
        faculty3.viewProfile();
        double double10 = faculty3.getHourlyRate();
        java.lang.String str11 = faculty3.getID();
        java.lang.String str12 = faculty3.getEmail();
        faculty3.logout();
        double double14 = faculty3.getHourlyRate();
        java.lang.String str15 = faculty3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 30.0d + "'", double10 == 30.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 30.0d + "'", double14 == 30.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test11829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11829");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        java.lang.String str8 = faculty3.getPassword();
        java.lang.String str9 = faculty3.getPassword();
        faculty3.logout();
        boolean boolean11 = faculty3.isVerified();
        java.lang.String str12 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "faculty" + "'", str12, "faculty");
    }

    @Test
    public void test11830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11830");
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
        faculty3.setVerified(false);
        java.lang.String str24 = faculty3.getEmail();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "faculty" + "'", str8, "faculty");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 30.0d + "'", double14 == 30.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "faculty" + "'", str15, "faculty");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
    }

    @Test
    public void test11831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11831");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        java.lang.String str4 = faculty3.getAccountType();
        faculty3.setVerified(true);
        faculty3.logout();
        java.lang.String str8 = faculty3.getAccountType();
        java.lang.String str9 = faculty3.getID();
        java.lang.String str10 = faculty3.getEmail();
        java.lang.String str11 = faculty3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "faculty" + "'", str4, "faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "faculty" + "'", str8, "faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test11832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11832");
        model.Faculty faculty3 = new model.Faculty("", "faculty", "");
        faculty3.setVerified(true);
        faculty3.login("", "hi!");
        faculty3.viewProfile();
        java.lang.String str10 = faculty3.getID();
        faculty3.viewProfile();
        double double12 = faculty3.getHourlyRate();
        boolean boolean13 = faculty3.isVerified();
        boolean boolean14 = faculty3.isVerified();
        faculty3.setVerified(true);
        boolean boolean17 = faculty3.isVerified();
        faculty3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 30.0d + "'", double12 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test11833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11833");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        faculty3.logout();
        java.lang.String str5 = faculty3.getID();
        java.lang.String str6 = faculty3.getEmail();
        double double7 = faculty3.getHourlyRate();
        boolean boolean8 = faculty3.isVerified();
        java.lang.String str9 = faculty3.getID();
        java.lang.String str10 = faculty3.getAccountType();
        java.lang.String str11 = faculty3.getAccountType();
        faculty3.setVerified(true);
        double double14 = faculty3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "faculty" + "'", str10, "faculty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "faculty" + "'", str11, "faculty");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 30.0d + "'", double14 == 30.0d);
    }

    @Test
    public void test11834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11834");
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
        java.lang.Class<?> wildcardClass19 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "faculty" + "'", str7, "faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "faculty" + "'", str9, "faculty");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test11835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11835");
        model.Faculty faculty3 = new model.Faculty("", "", "");
        faculty3.viewProfile();
        double double5 = faculty3.getHourlyRate();
        java.lang.String str6 = faculty3.getEmail();
        boolean boolean7 = faculty3.isVerified();
        boolean boolean8 = faculty3.isVerified();
        faculty3.setVerified(true);
        double double11 = faculty3.getHourlyRate();
        boolean boolean12 = faculty3.isVerified();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 30.0d + "'", double5 == 30.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 30.0d + "'", double11 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test11836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11836");
        model.Faculty faculty3 = new model.Faculty("faculty", "", "faculty");
        faculty3.setVerified(false);
        faculty3.viewProfile();
        java.lang.String str7 = faculty3.getEmail();
        java.lang.String str8 = faculty3.getID();
        java.lang.String str9 = faculty3.getID();
        faculty3.setVerified(true);
        java.lang.String str12 = faculty3.getID();
        java.lang.String str13 = faculty3.getPassword();
        java.lang.Class<?> wildcardClass14 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "faculty" + "'", str7, "faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "faculty" + "'", str8, "faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "faculty" + "'", str9, "faculty");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "faculty" + "'", str12, "faculty");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test11837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11837");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        faculty3.logout();
        faculty3.login("hi!", "hi!");
        double double8 = faculty3.getHourlyRate();
        java.lang.String str9 = faculty3.getID();
        java.lang.String str10 = faculty3.getEmail();
        java.lang.String str11 = faculty3.getPassword();
        double double12 = faculty3.getHourlyRate();
        double double13 = faculty3.getHourlyRate();
        java.lang.Class<?> wildcardClass14 = faculty3.getClass();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 30.0d + "'", double12 == 30.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 30.0d + "'", double13 == 30.0d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test11838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11838");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        double double6 = faculty3.getHourlyRate();
        java.lang.String str7 = faculty3.getPassword();
        faculty3.logout();
        double double9 = faculty3.getHourlyRate();
        java.lang.String str10 = faculty3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 30.0d + "'", double9 == 30.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test11839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11839");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        double double6 = faculty3.getHourlyRate();
        java.lang.String str7 = faculty3.getPassword();
        faculty3.login("", "faculty");
        java.lang.String str11 = faculty3.getAccountType();
        java.lang.String str12 = faculty3.getAccountType();
        java.lang.String str13 = faculty3.getAccountType();
        faculty3.logout();
        faculty3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "faculty" + "'", str11, "faculty");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "faculty" + "'", str12, "faculty");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "faculty" + "'", str13, "faculty");
    }

    @Test
    public void test11840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11840");
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
        faculty3.viewProfile();
        java.lang.String str19 = faculty3.getAccountType();
        faculty3.viewProfile();
        java.lang.Class<?> wildcardClass21 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "faculty" + "'", str8, "faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "faculty" + "'", str9, "faculty");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "faculty" + "'", str19, "faculty");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test11841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11841");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        java.lang.String str8 = faculty3.getAccountType();
        faculty3.setVerified(false);
        double double11 = faculty3.getHourlyRate();
        java.lang.String str12 = faculty3.getPassword();
        double double13 = faculty3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "faculty" + "'", str8, "faculty");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 30.0d + "'", double11 == 30.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 30.0d + "'", double13 == 30.0d);
    }

    @Test
    public void test11842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11842");
        model.Faculty faculty3 = new model.Faculty("hi!", "hi!", "");
        faculty3.logout();
        java.lang.String str5 = faculty3.getEmail();
        boolean boolean6 = faculty3.isVerified();
        faculty3.login("", "faculty");
        boolean boolean10 = faculty3.isVerified();
        java.lang.String str11 = faculty3.getEmail();
        double double12 = faculty3.getHourlyRate();
        faculty3.setVerified(true);
        faculty3.login("faculty", "faculty");
        faculty3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 30.0d + "'", double12 == 30.0d);
    }

    @Test
    public void test11843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11843");
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
        java.lang.String str15 = faculty3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "faculty" + "'", str11, "faculty");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 30.0d + "'", double12 == 30.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test11844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11844");
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
        java.lang.String str16 = faculty3.getPassword();
        faculty3.viewProfile();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 30.0d + "'", double12 == 30.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test11845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11845");
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
        faculty3.viewProfile();
        double double17 = faculty3.getHourlyRate();
        java.lang.String str18 = faculty3.getID();
        java.lang.String str19 = faculty3.getID();
        faculty3.viewProfile();
        boolean boolean21 = faculty3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "faculty" + "'", str11, "faculty");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "faculty" + "'", str15, "faculty");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 30.0d + "'", double17 == 30.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test11846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11846");
        model.Faculty faculty3 = new model.Faculty("faculty", "hi!", "");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getPassword();
        java.lang.String str6 = faculty3.getAccountType();
        faculty3.setVerified(false);
        java.lang.String str9 = faculty3.getEmail();
        java.lang.String str10 = faculty3.getEmail();
        faculty3.setVerified(false);
        java.lang.String str13 = faculty3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "faculty" + "'", str9, "faculty");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "faculty" + "'", str10, "faculty");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test11847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11847");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        faculty3.logout();
        java.lang.String str5 = faculty3.getID();
        java.lang.String str6 = faculty3.getEmail();
        double double7 = faculty3.getHourlyRate();
        java.lang.String str8 = faculty3.getEmail();
        faculty3.login("", "");
        boolean boolean12 = faculty3.isVerified();
        faculty3.login("hi!", "faculty");
        faculty3.login("", "faculty");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test11848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11848");
        model.Faculty faculty3 = new model.Faculty("hi!", "faculty", "");
        faculty3.logout();
        faculty3.logout();
        faculty3.logout();
        java.lang.String str7 = faculty3.getID();
        java.lang.String str8 = faculty3.getEmail();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test11849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11849");
        model.Faculty faculty3 = new model.Faculty("", "faculty", "faculty");
        double double4 = faculty3.getHourlyRate();
        java.lang.String str5 = faculty3.getAccountType();
        java.lang.String str6 = faculty3.getID();
        java.lang.String str7 = faculty3.getAccountType();
        faculty3.setVerified(true);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 30.0d + "'", double4 == 30.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "faculty" + "'", str7, "faculty");
    }

    @Test
    public void test11850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11850");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        java.lang.String str4 = faculty3.getAccountType();
        java.lang.String str5 = faculty3.getEmail();
        faculty3.viewProfile();
        faculty3.logout();
        faculty3.login("faculty", "faculty");
        faculty3.logout();
        boolean boolean12 = faculty3.isVerified();
        double double13 = faculty3.getHourlyRate();
        java.lang.Class<?> wildcardClass14 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "faculty" + "'", str4, "faculty");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 30.0d + "'", double13 == 30.0d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test11851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11851");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.viewProfile();
        faculty3.login("faculty", "");
        faculty3.setVerified(true);
        boolean boolean13 = faculty3.isVerified();
        faculty3.setVerified(true);
        double double16 = faculty3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 30.0d + "'", double16 == 30.0d);
    }

    @Test
    public void test11852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11852");
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
        java.lang.String str13 = faculty3.getAccountType();
        java.lang.String str14 = faculty3.getID();
        faculty3.setVerified(true);
        java.lang.String str17 = faculty3.getPassword();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "faculty" + "'", str10, "faculty");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "faculty" + "'", str13, "faculty");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test11853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11853");
        model.Faculty faculty3 = new model.Faculty("", "faculty", "faculty");
        double double4 = faculty3.getHourlyRate();
        java.lang.String str5 = faculty3.getAccountType();
        java.lang.String str6 = faculty3.getAccountType();
        java.lang.String str7 = faculty3.getAccountType();
        double double8 = faculty3.getHourlyRate();
        faculty3.viewProfile();
        java.lang.String str10 = faculty3.getEmail();
        java.lang.String str11 = faculty3.getAccountType();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 30.0d + "'", double4 == 30.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "faculty" + "'", str7, "faculty");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "faculty" + "'", str11, "faculty");
    }

    @Test
    public void test11854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11854");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        double double6 = faculty3.getHourlyRate();
        java.lang.String str7 = faculty3.getPassword();
        faculty3.logout();
        faculty3.logout();
        java.lang.String str10 = faculty3.getPassword();
        faculty3.login("", "hi!");
        java.lang.String str14 = faculty3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test11855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11855");
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
        faculty3.login("hi!", "faculty");
        faculty3.login("", "hi!");
        java.lang.String str21 = faculty3.getID();
        faculty3.viewProfile();
        faculty3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "faculty" + "'", str10, "faculty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test11856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11856");
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
        boolean boolean19 = faculty3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test11857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11857");
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
        double double15 = faculty3.getHourlyRate();
        java.lang.String str16 = faculty3.getID();
        faculty3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 30.0d + "'", double14 == 30.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 30.0d + "'", double15 == 30.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test11858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11858");
        model.Faculty faculty3 = new model.Faculty("", "", "faculty");
        faculty3.login("faculty", "");
        boolean boolean7 = faculty3.isVerified();
        faculty3.logout();
        faculty3.logout();
        java.lang.String str10 = faculty3.getID();
        java.lang.String str11 = faculty3.getID();
        double double12 = faculty3.getHourlyRate();
        faculty3.viewProfile();
        faculty3.login("faculty", "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "faculty" + "'", str10, "faculty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "faculty" + "'", str11, "faculty");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 30.0d + "'", double12 == 30.0d);
    }

    @Test
    public void test11859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11859");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        faculty3.logout();
        faculty3.login("hi!", "hi!");
        faculty3.viewProfile();
        faculty3.login("", "faculty");
        faculty3.login("", "faculty");
        java.lang.String str15 = faculty3.getEmail();
        double double16 = faculty3.getHourlyRate();
        java.lang.String str17 = faculty3.getPassword();
        faculty3.logout();
        faculty3.login("hi!", "");
        faculty3.logout();
        java.lang.Class<?> wildcardClass23 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 30.0d + "'", double16 == 30.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test11860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11860");
        model.Faculty faculty3 = new model.Faculty("hi!", "faculty", "");
        faculty3.logout();
        java.lang.String str5 = faculty3.getEmail();
        java.lang.String str6 = faculty3.getEmail();
        double double7 = faculty3.getHourlyRate();
        faculty3.viewProfile();
        faculty3.setVerified(true);
        java.lang.Class<?> wildcardClass11 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test11861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11861");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        faculty3.setVerified(false);
        faculty3.viewProfile();
        java.lang.String str11 = faculty3.getPassword();
        double double12 = faculty3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 30.0d + "'", double12 == 30.0d);
    }

    @Test
    public void test11862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11862");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "faculty");
        java.lang.String str4 = faculty3.getPassword();
        faculty3.logout();
        java.lang.String str6 = faculty3.getPassword();
        faculty3.logout();
        java.lang.String str8 = faculty3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test11863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11863");
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
        java.lang.String str20 = faculty3.getAccountType();
        java.lang.String str21 = faculty3.getID();
        faculty3.login("faculty", "hi!");
        java.lang.Class<?> wildcardClass25 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 30.0d + "'", double16 == 30.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "faculty" + "'", str20, "faculty");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test11864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11864");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        faculty3.setVerified(false);
        java.lang.String str6 = faculty3.getEmail();
        java.lang.String str7 = faculty3.getAccountType();
        faculty3.viewProfile();
        java.lang.String str9 = faculty3.getAccountType();
        java.lang.String str10 = faculty3.getPassword();
        java.lang.String str11 = faculty3.getAccountType();
        faculty3.login("", "hi!");
        java.lang.String str15 = faculty3.getID();
        java.lang.String str16 = faculty3.getPassword();
        java.lang.String str17 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "faculty" + "'", str7, "faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "faculty" + "'", str9, "faculty");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "faculty" + "'", str11, "faculty");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "faculty" + "'", str17, "faculty");
    }

    @Test
    public void test11865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11865");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        boolean boolean7 = faculty3.isVerified();
        double double8 = faculty3.getHourlyRate();
        java.lang.String str9 = faculty3.getID();
        faculty3.login("faculty", "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test11866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11866");
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
        faculty3.logout();
        faculty3.login("", "faculty");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 30.0d + "'", double13 == 30.0d);
    }

    @Test
    public void test11867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11867");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        faculty3.setVerified(false);
        faculty3.viewProfile();
        java.lang.String str7 = faculty3.getEmail();
        java.lang.String str8 = faculty3.getID();
        faculty3.viewProfile();
        java.lang.String str10 = faculty3.getEmail();
        java.lang.String str11 = faculty3.getEmail();
        java.lang.String str12 = faculty3.getPassword();
        java.lang.String str13 = faculty3.getAccountType();
        java.lang.Class<?> wildcardClass14 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "faculty" + "'", str13, "faculty");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test11868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11868");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        java.lang.String str4 = faculty3.getAccountType();
        java.lang.String str5 = faculty3.getEmail();
        double double6 = faculty3.getHourlyRate();
        faculty3.viewProfile();
        java.lang.String str8 = faculty3.getEmail();
        faculty3.viewProfile();
        faculty3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "faculty" + "'", str4, "faculty");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test11869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11869");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        faculty3.login("", "");
        faculty3.viewProfile();
        faculty3.viewProfile();
        double double9 = faculty3.getHourlyRate();
        java.lang.String str10 = faculty3.getID();
        java.lang.String str11 = faculty3.getAccountType();
        faculty3.setVerified(true);
        double double14 = faculty3.getHourlyRate();
        boolean boolean15 = faculty3.isVerified();
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 30.0d + "'", double9 == 30.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "faculty" + "'", str11, "faculty");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 30.0d + "'", double14 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test11870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11870");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        java.lang.String str4 = faculty3.getAccountType();
        java.lang.String str5 = faculty3.getID();
        faculty3.login("", "faculty");
        double double9 = faculty3.getHourlyRate();
        faculty3.login("hi!", "");
        double double13 = faculty3.getHourlyRate();
        java.lang.String str14 = faculty3.getID();
        java.lang.String str15 = faculty3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "faculty" + "'", str4, "faculty");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 30.0d + "'", double9 == 30.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 30.0d + "'", double13 == 30.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test11871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11871");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        java.lang.String str8 = faculty3.getEmail();
        faculty3.viewProfile();
        faculty3.logout();
        boolean boolean11 = faculty3.isVerified();
        java.lang.String str12 = faculty3.getAccountType();
        java.lang.Class<?> wildcardClass13 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "faculty" + "'", str12, "faculty");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test11872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11872");
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
        java.lang.String str20 = faculty3.getEmail();
        java.lang.String str21 = faculty3.getEmail();
        java.lang.String str22 = faculty3.getEmail();
        double double23 = faculty3.getHourlyRate();
        java.lang.String str24 = faculty3.getAccountType();
        java.lang.Class<?> wildcardClass25 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "faculty" + "'", str13, "faculty");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "faculty" + "'", str14, "faculty");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "faculty" + "'", str16, "faculty");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 30.0d + "'", double23 == 30.0d);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "faculty" + "'", str24, "faculty");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test11873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11873");
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
        java.lang.String str18 = faculty3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test11874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11874");
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
        java.lang.String str18 = faculty3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "faculty" + "'", str11, "faculty");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test11875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11875");
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
        java.lang.String str16 = faculty3.getPassword();
        java.lang.String str17 = faculty3.getAccountType();
        java.lang.Class<?> wildcardClass18 = faculty3.getClass();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "faculty" + "'", str10, "faculty");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "faculty" + "'", str17, "faculty");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test11876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11876");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        faculty3.logout();
        faculty3.login("hi!", "hi!");
        double double8 = faculty3.getHourlyRate();
        java.lang.String str9 = faculty3.getID();
        faculty3.logout();
        java.lang.String str11 = faculty3.getID();
        faculty3.logout();
        faculty3.viewProfile();
        java.lang.String str14 = faculty3.getID();
        faculty3.login("", "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test11877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11877");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        double double6 = faculty3.getHourlyRate();
        java.lang.String str7 = faculty3.getPassword();
        java.lang.String str8 = faculty3.getPassword();
        java.lang.String str9 = faculty3.getPassword();
        java.lang.String str10 = faculty3.getID();
        faculty3.login("", "faculty");
        double double14 = faculty3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 30.0d + "'", double14 == 30.0d);
    }

    @Test
    public void test11878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11878");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        faculty3.setVerified(false);
        java.lang.String str6 = faculty3.getPassword();
        java.lang.String str7 = faculty3.getAccountType();
        faculty3.viewProfile();
        double double9 = faculty3.getHourlyRate();
        double double10 = faculty3.getHourlyRate();
        faculty3.login("", "hi!");
        java.lang.String str14 = faculty3.getEmail();
        faculty3.setVerified(true);
        java.lang.String str17 = faculty3.getID();
        java.lang.String str18 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "faculty" + "'", str7, "faculty");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 30.0d + "'", double9 == 30.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 30.0d + "'", double10 == 30.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "faculty" + "'", str18, "faculty");
    }

    @Test
    public void test11879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11879");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        faculty3.login("", "hi!");
        java.lang.String str10 = faculty3.getPassword();
        faculty3.viewProfile();
        java.lang.String str12 = faculty3.getPassword();
        java.lang.String str13 = faculty3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test11880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11880");
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
        faculty3.login("", "");
        boolean boolean20 = faculty3.isVerified();
        boolean boolean21 = faculty3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "faculty" + "'", str13, "faculty");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test11881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11881");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        java.lang.String str4 = faculty3.getAccountType();
        java.lang.String str5 = faculty3.getEmail();
        double double6 = faculty3.getHourlyRate();
        boolean boolean7 = faculty3.isVerified();
        faculty3.logout();
        java.lang.String str9 = faculty3.getEmail();
        java.lang.String str10 = faculty3.getEmail();
        java.lang.String str11 = faculty3.getID();
        java.lang.String str12 = faculty3.getEmail();
        java.lang.Class<?> wildcardClass13 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "faculty" + "'", str4, "faculty");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test11882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11882");
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
        java.lang.String str16 = faculty3.getPassword();
        faculty3.logout();
        faculty3.logout();
        faculty3.login("", "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "faculty" + "'", str10, "faculty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test11883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11883");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        double double6 = faculty3.getHourlyRate();
        java.lang.String str7 = faculty3.getPassword();
        java.lang.String str8 = faculty3.getPassword();
        faculty3.login("faculty", "hi!");
        faculty3.login("hi!", "");
        faculty3.setVerified(true);
        java.lang.Class<?> wildcardClass17 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test11884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11884");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        faculty3.setVerified(false);
        java.lang.String str6 = faculty3.getEmail();
        faculty3.setVerified(false);
        faculty3.login("faculty", "hi!");
        java.lang.String str12 = faculty3.getPassword();
        faculty3.setVerified(false);
        java.lang.String str15 = faculty3.getAccountType();
        java.lang.String str16 = faculty3.getID();
        faculty3.viewProfile();
        faculty3.setVerified(false);
        java.lang.String str20 = faculty3.getID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "faculty" + "'", str15, "faculty");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test11885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11885");
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
        java.lang.String str15 = faculty3.getID();
        java.lang.String str16 = faculty3.getPassword();
        faculty3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "faculty" + "'", str11, "faculty");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test11886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11886");
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
        faculty3.viewProfile();
        java.lang.String str19 = faculty3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test11887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11887");
        model.Faculty faculty3 = new model.Faculty("hi!", "faculty", "");
        java.lang.String str4 = faculty3.getEmail();
        faculty3.viewProfile();
        faculty3.viewProfile();
        faculty3.setVerified(false);
        java.lang.String str9 = faculty3.getEmail();
        java.lang.String str10 = faculty3.getAccountType();
        java.lang.String str11 = faculty3.getID();
        java.lang.String str12 = faculty3.getEmail();
        java.lang.String str13 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "faculty" + "'", str10, "faculty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "faculty" + "'", str13, "faculty");
    }

    @Test
    public void test11888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11888");
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
        faculty3.login("", "faculty");
        faculty3.setVerified(true);
        faculty3.viewProfile();
        boolean boolean22 = faculty3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "faculty" + "'", str11, "faculty");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test11889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11889");
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
        faculty3.logout();
        faculty3.login("faculty", "faculty");
        java.lang.String str18 = faculty3.getEmail();
        java.lang.String str19 = faculty3.getEmail();
        java.lang.String str20 = faculty3.getID();
        boolean boolean21 = faculty3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test11890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11890");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        double double6 = faculty3.getHourlyRate();
        java.lang.String str7 = faculty3.getID();
        boolean boolean8 = faculty3.isVerified();
        faculty3.logout();
        boolean boolean10 = faculty3.isVerified();
        faculty3.viewProfile();
        faculty3.login("hi!", "");
        java.lang.String str15 = faculty3.getID();
        faculty3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test11891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11891");
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
        faculty3.viewProfile();
        boolean boolean14 = faculty3.isVerified();
        faculty3.login("", "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "faculty" + "'", str11, "faculty");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test11892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11892");
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
        java.lang.String str15 = faculty3.getAccountType();
        faculty3.logout();
        java.lang.String str17 = faculty3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "faculty" + "'", str15, "faculty");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test11893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11893");
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
        boolean boolean16 = faculty3.isVerified();
        java.lang.String str17 = faculty3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "faculty" + "'", str15, "faculty");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test11894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11894");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getAccountType();
        faculty3.logout();
        double double8 = faculty3.getHourlyRate();
        boolean boolean9 = faculty3.isVerified();
        double double10 = faculty3.getHourlyRate();
        java.lang.Class<?> wildcardClass11 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 30.0d + "'", double10 == 30.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test11895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11895");
        model.Faculty faculty3 = new model.Faculty("", "", "");
        faculty3.viewProfile();
        double double5 = faculty3.getHourlyRate();
        java.lang.String str6 = faculty3.getID();
        double double7 = faculty3.getHourlyRate();
        java.lang.String str8 = faculty3.getPassword();
        faculty3.login("hi!", "");
        java.lang.String str12 = faculty3.getEmail();
        faculty3.setVerified(true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 30.0d + "'", double5 == 30.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test11896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11896");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        java.lang.String str7 = faculty3.getID();
        double double8 = faculty3.getHourlyRate();
        java.lang.String str9 = faculty3.getID();
        java.lang.String str10 = faculty3.getEmail();
        faculty3.logout();
        java.lang.String str12 = faculty3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test11897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11897");
        model.Faculty faculty3 = new model.Faculty("hi!", "hi!", "");
        faculty3.viewProfile();
        java.lang.String str5 = faculty3.getAccountType();
        java.lang.String str6 = faculty3.getEmail();
        java.lang.String str7 = faculty3.getAccountType();
        java.lang.String str8 = faculty3.getPassword();
        faculty3.setVerified(false);
        faculty3.login("faculty", "hi!");
        java.lang.String str14 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "faculty" + "'", str7, "faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "faculty" + "'", str14, "faculty");
    }

    @Test
    public void test11898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11898");
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
        faculty3.login("hi!", "");
        faculty3.setVerified(true);
        double double23 = faculty3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "faculty" + "'", str11, "faculty");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 30.0d + "'", double23 == 30.0d);
    }

    @Test
    public void test11899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11899");
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
        java.lang.String str16 = faculty3.getID();
        java.lang.String str17 = faculty3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test11900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11900");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        faculty3.login("", "");
        double double7 = faculty3.getHourlyRate();
        boolean boolean8 = faculty3.isVerified();
        java.lang.String str9 = faculty3.getEmail();
        faculty3.setVerified(true);
        faculty3.viewProfile();
        faculty3.login("hi!", "hi!");
        faculty3.viewProfile();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test11901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11901");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        java.lang.String str8 = faculty3.getPassword();
        java.lang.String str9 = faculty3.getID();
        double double10 = faculty3.getHourlyRate();
        faculty3.logout();
        java.lang.String str12 = faculty3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 30.0d + "'", double10 == 30.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test11902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11902");
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
        faculty3.setVerified(true);
        double double17 = faculty3.getHourlyRate();
        double double18 = faculty3.getHourlyRate();
        boolean boolean19 = faculty3.isVerified();
        faculty3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "faculty" + "'", str7, "faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 30.0d + "'", double17 == 30.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 30.0d + "'", double18 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test11903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11903");
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
        faculty3.setVerified(true);
        java.lang.String str25 = faculty3.getPassword();
        double double26 = faculty3.getHourlyRate();
        java.lang.String str27 = faculty3.getPassword();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "faculty" + "'", str10, "faculty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "faculty" + "'", str11, "faculty");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 30.0d + "'", double12 == 30.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "faculty" + "'", str14, "faculty");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "faculty" + "'", str18, "faculty");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 30.0d + "'", double26 == 30.0d);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test11904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11904");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getAccountType();
        faculty3.logout();
        boolean boolean8 = faculty3.isVerified();
        faculty3.logout();
        double double10 = faculty3.getHourlyRate();
        faculty3.viewProfile();
        faculty3.viewProfile();
        java.lang.String str13 = faculty3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 30.0d + "'", double10 == 30.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test11905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11905");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        boolean boolean7 = faculty3.isVerified();
        java.lang.String str8 = faculty3.getEmail();
        faculty3.setVerified(true);
        double double11 = faculty3.getHourlyRate();
        java.lang.String str12 = faculty3.getID();
        java.lang.String str13 = faculty3.getAccountType();
        double double14 = faculty3.getHourlyRate();
        faculty3.setVerified(false);
        java.lang.String str17 = faculty3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 30.0d + "'", double11 == 30.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "faculty" + "'", str13, "faculty");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 30.0d + "'", double14 == 30.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test11906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11906");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        double double6 = faculty3.getHourlyRate();
        java.lang.String str7 = faculty3.getID();
        boolean boolean8 = faculty3.isVerified();
        faculty3.logout();
        boolean boolean10 = faculty3.isVerified();
        faculty3.logout();
        java.lang.String str12 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "faculty" + "'", str12, "faculty");
    }

    @Test
    public void test11907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11907");
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
        boolean boolean17 = faculty3.isVerified();
        java.lang.String str18 = faculty3.getAccountType();
        double double19 = faculty3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "faculty" + "'", str12, "faculty");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "faculty" + "'", str18, "faculty");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 30.0d + "'", double19 == 30.0d);
    }

    @Test
    public void test11908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11908");
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
    public void test11909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11909");
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
        java.lang.String str13 = faculty3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 30.0d + "'", double10 == 30.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test11910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11910");
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
        java.lang.String str14 = faculty3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "faculty" + "'", str8, "faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "faculty" + "'", str9, "faculty");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "faculty" + "'", str12, "faculty");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test11911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11911");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        faculty3.setVerified(false);
        java.lang.String str9 = faculty3.getID();
        faculty3.setVerified(false);
        java.lang.String str12 = faculty3.getID();
        double double13 = faculty3.getHourlyRate();
        java.lang.String str14 = faculty3.getPassword();
        faculty3.login("faculty", "");
        java.lang.String str18 = faculty3.getEmail();
        java.lang.String str19 = faculty3.getAccountType();
        faculty3.logout();
        java.lang.String str21 = faculty3.getPassword();
        java.lang.String str22 = faculty3.getEmail();
        faculty3.logout();
        boolean boolean24 = faculty3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 30.0d + "'", double13 == 30.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "faculty" + "'", str19, "faculty");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test11912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11912");
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
        java.lang.String str20 = faculty3.getID();
        faculty3.setVerified(false);
        java.lang.Class<?> wildcardClass23 = faculty3.getClass();
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test11913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11913");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        faculty3.logout();
        faculty3.login("hi!", "hi!");
        double double8 = faculty3.getHourlyRate();
        boolean boolean9 = faculty3.isVerified();
        java.lang.String str10 = faculty3.getAccountType();
        java.lang.String str11 = faculty3.getAccountType();
        faculty3.viewProfile();
        double double13 = faculty3.getHourlyRate();
        java.lang.String str14 = faculty3.getID();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "faculty" + "'", str10, "faculty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "faculty" + "'", str11, "faculty");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 30.0d + "'", double13 == 30.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test11914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11914");
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
        java.lang.String str17 = faculty3.getPassword();
        java.lang.String str18 = faculty3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test11915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11915");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        faculty3.logout();
        java.lang.String str5 = faculty3.getID();
        java.lang.String str6 = faculty3.getEmail();
        faculty3.viewProfile();
        faculty3.login("hi!", "faculty");
        java.lang.String str11 = faculty3.getID();
        faculty3.login("", "");
        faculty3.setVerified(false);
        java.lang.String str17 = faculty3.getEmail();
        java.lang.String str18 = faculty3.getPassword();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test11916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11916");
        model.Faculty faculty3 = new model.Faculty("", "hi!", "faculty");
        java.lang.String str4 = faculty3.getPassword();
        java.lang.String str5 = faculty3.getEmail();
        boolean boolean6 = faculty3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test11917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11917");
        model.Faculty faculty3 = new model.Faculty("", "faculty", "faculty");
        faculty3.setVerified(true);
        java.lang.String str6 = faculty3.getPassword();
        boolean boolean7 = faculty3.isVerified();
        java.lang.String str8 = faculty3.getPassword();
        boolean boolean9 = faculty3.isVerified();
        java.lang.String str10 = faculty3.getID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "faculty" + "'", str8, "faculty");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "faculty" + "'", str10, "faculty");
    }

    @Test
    public void test11918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11918");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        boolean boolean7 = faculty3.isVerified();
        java.lang.String str8 = faculty3.getID();
        faculty3.setVerified(false);
        boolean boolean11 = faculty3.isVerified();
        java.lang.String str12 = faculty3.getEmail();
        java.lang.String str13 = faculty3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test11919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11919");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        faculty3.logout();
        java.lang.String str5 = faculty3.getID();
        java.lang.String str6 = faculty3.getEmail();
        double double7 = faculty3.getHourlyRate();
        java.lang.String str8 = faculty3.getPassword();
        faculty3.login("hi!", "hi!");
        boolean boolean12 = faculty3.isVerified();
        faculty3.logout();
        java.lang.String str14 = faculty3.getPassword();
        double double15 = faculty3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 30.0d + "'", double15 == 30.0d);
    }

    @Test
    public void test11920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11920");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        faculty3.logout();
        java.lang.String str5 = faculty3.getID();
        java.lang.String str6 = faculty3.getEmail();
        double double7 = faculty3.getHourlyRate();
        boolean boolean8 = faculty3.isVerified();
        double double9 = faculty3.getHourlyRate();
        faculty3.login("", "faculty");
        double double13 = faculty3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 30.0d + "'", double9 == 30.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 30.0d + "'", double13 == 30.0d);
    }

    @Test
    public void test11921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11921");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        java.lang.String str4 = faculty3.getAccountType();
        java.lang.String str5 = faculty3.getID();
        faculty3.login("", "faculty");
        double double9 = faculty3.getHourlyRate();
        faculty3.login("hi!", "");
        java.lang.String str13 = faculty3.getPassword();
        java.lang.String str14 = faculty3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "faculty" + "'", str4, "faculty");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 30.0d + "'", double9 == 30.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test11922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11922");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        java.lang.String str7 = faculty3.getID();
        faculty3.setVerified(true);
        faculty3.logout();
        boolean boolean11 = faculty3.isVerified();
        faculty3.login("hi!", "hi!");
        java.lang.String str15 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "faculty" + "'", str15, "faculty");
    }

    @Test
    public void test11923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11923");
        model.Faculty faculty3 = new model.Faculty("", "faculty", "");
        java.lang.String str4 = faculty3.getPassword();
        java.lang.String str5 = faculty3.getEmail();
        faculty3.logout();
        java.lang.String str7 = faculty3.getID();
        double double8 = faculty3.getHourlyRate();
        java.lang.String str9 = faculty3.getAccountType();
        java.lang.String str10 = faculty3.getEmail();
        faculty3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "faculty" + "'", str4, "faculty");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "faculty" + "'", str9, "faculty");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test11924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11924");
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
        double double17 = faculty3.getHourlyRate();
        boolean boolean18 = faculty3.isVerified();
        faculty3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "faculty" + "'", str13, "faculty");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "faculty" + "'", str14, "faculty");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 30.0d + "'", double17 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test11925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11925");
        model.Faculty faculty3 = new model.Faculty("", "faculty", "faculty");
        double double4 = faculty3.getHourlyRate();
        java.lang.String str5 = faculty3.getAccountType();
        double double6 = faculty3.getHourlyRate();
        boolean boolean7 = faculty3.isVerified();
        java.lang.String str8 = faculty3.getPassword();
        java.lang.String str9 = faculty3.getAccountType();
        faculty3.viewProfile();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 30.0d + "'", double4 == 30.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "faculty" + "'", str8, "faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "faculty" + "'", str9, "faculty");
    }

    @Test
    public void test11926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11926");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getEmail();
        boolean boolean6 = faculty3.isVerified();
        java.lang.String str7 = faculty3.getAccountType();
        faculty3.login("faculty", "");
        faculty3.setVerified(true);
        java.lang.String str13 = faculty3.getPassword();
        double double14 = faculty3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "faculty" + "'", str7, "faculty");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 30.0d + "'", double14 == 30.0d);
    }

    @Test
    public void test11927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11927");
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
        java.lang.String str16 = faculty3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 30.0d + "'", double12 == 30.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test11928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11928");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        java.lang.String str6 = faculty3.getPassword();
        faculty3.setVerified(false);
        faculty3.setVerified(true);
        faculty3.viewProfile();
        double double12 = faculty3.getHourlyRate();
        double double13 = faculty3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 30.0d + "'", double12 == 30.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 30.0d + "'", double13 == 30.0d);
    }

    @Test
    public void test11929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11929");
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
        boolean boolean20 = faculty3.isVerified();
        boolean boolean21 = faculty3.isVerified();
        double double22 = faculty3.getHourlyRate();
        boolean boolean23 = faculty3.isVerified();
        faculty3.setVerified(true);
        faculty3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "faculty" + "'", str16, "faculty");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 30.0d + "'", double22 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test11930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11930");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        faculty3.setVerified(false);
        faculty3.viewProfile();
        java.lang.String str7 = faculty3.getEmail();
        java.lang.String str8 = faculty3.getAccountType();
        java.lang.String str9 = faculty3.getID();
        java.lang.String str10 = faculty3.getPassword();
        double double11 = faculty3.getHourlyRate();
        faculty3.logout();
        double double13 = faculty3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "faculty" + "'", str8, "faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 30.0d + "'", double11 == 30.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 30.0d + "'", double13 == 30.0d);
    }

    @Test
    public void test11931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11931");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        java.lang.String str4 = faculty3.getAccountType();
        java.lang.String str5 = faculty3.getID();
        faculty3.setVerified(true);
        faculty3.login("faculty", "faculty");
        faculty3.setVerified(true);
        java.lang.String str13 = faculty3.getAccountType();
        double double14 = faculty3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "faculty" + "'", str4, "faculty");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "faculty" + "'", str13, "faculty");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 30.0d + "'", double14 == 30.0d);
    }

    @Test
    public void test11932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11932");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.viewProfile();
        boolean boolean8 = faculty3.isVerified();
        faculty3.login("hi!", "faculty");
        faculty3.viewProfile();
        faculty3.setVerified(false);
        faculty3.login("hi!", "");
        faculty3.login("hi!", "faculty");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test11933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11933");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        faculty3.setVerified(false);
        faculty3.viewProfile();
        java.lang.String str7 = faculty3.getEmail();
        java.lang.String str8 = faculty3.getAccountType();
        faculty3.logout();
        faculty3.login("", "");
        faculty3.logout();
        faculty3.logout();
        java.lang.String str15 = faculty3.getAccountType();
        double double16 = faculty3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "faculty" + "'", str8, "faculty");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "faculty" + "'", str15, "faculty");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 30.0d + "'", double16 == 30.0d);
    }

    @Test
    public void test11934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11934");
        model.Faculty faculty3 = new model.Faculty("", "", "faculty");
        java.lang.String str4 = faculty3.getAccountType();
        java.lang.String str5 = faculty3.getID();
        java.lang.String str6 = faculty3.getAccountType();
        java.lang.String str7 = faculty3.getEmail();
        java.lang.String str8 = faculty3.getPassword();
        faculty3.logout();
        double double10 = faculty3.getHourlyRate();
        boolean boolean11 = faculty3.isVerified();
        boolean boolean12 = faculty3.isVerified();
        boolean boolean13 = faculty3.isVerified();
        java.lang.Class<?> wildcardClass14 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "faculty" + "'", str4, "faculty");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 30.0d + "'", double10 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test11935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11935");
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
        java.lang.String str20 = faculty3.getAccountType();
        faculty3.login("", "faculty");
        faculty3.logout();
        faculty3.login("hi!", "faculty");
        java.lang.Class<?> wildcardClass28 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "faculty" + "'", str20, "faculty");
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test11936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11936");
        model.Faculty faculty3 = new model.Faculty("", "", "");
        faculty3.viewProfile();
        java.lang.String str5 = faculty3.getEmail();
        java.lang.String str6 = faculty3.getEmail();
        faculty3.login("hi!", "hi!");
        boolean boolean10 = faculty3.isVerified();
        faculty3.setVerified(false);
        faculty3.login("hi!", "faculty");
        java.lang.String str16 = faculty3.getPassword();
        double double17 = faculty3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 30.0d + "'", double17 == 30.0d);
    }

    @Test
    public void test11937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11937");
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
        java.lang.String str14 = faculty3.getPassword();
        java.lang.String str15 = faculty3.getID();
        faculty3.logout();
        faculty3.setVerified(true);
        faculty3.logout();
        faculty3.login("faculty", "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "faculty" + "'", str10, "faculty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test11938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11938");
        model.Faculty faculty3 = new model.Faculty("hi!", "hi!", "");
        faculty3.setVerified(false);
        faculty3.viewProfile();
        faculty3.setVerified(false);
        faculty3.viewProfile();
        java.lang.String str10 = faculty3.getID();
        java.lang.String str11 = faculty3.getPassword();
        faculty3.viewProfile();
        java.lang.Class<?> wildcardClass13 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test11939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11939");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        java.lang.String str8 = faculty3.getEmail();
        faculty3.viewProfile();
        faculty3.setVerified(false);
        double double12 = faculty3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 30.0d + "'", double12 == 30.0d);
    }

    @Test
    public void test11940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11940");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.setVerified(false);
        double double9 = faculty3.getHourlyRate();
        faculty3.setVerified(true);
        java.lang.String str12 = faculty3.getAccountType();
        faculty3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 30.0d + "'", double9 == 30.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "faculty" + "'", str12, "faculty");
    }

    @Test
    public void test11941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11941");
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
        boolean boolean15 = faculty3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test11942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11942");
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
        java.lang.String str13 = faculty3.getPassword();
        faculty3.viewProfile();
        java.lang.String str15 = faculty3.getAccountType();
        java.lang.String str16 = faculty3.getID();
        java.lang.String str17 = faculty3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "faculty" + "'", str15, "faculty");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test11943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11943");
        model.Faculty faculty3 = new model.Faculty("hi!", "faculty", "");
        java.lang.String str4 = faculty3.getEmail();
        faculty3.logout();
        java.lang.String str6 = faculty3.getAccountType();
        java.lang.String str7 = faculty3.getPassword();
        faculty3.viewProfile();
        boolean boolean9 = faculty3.isVerified();
        java.lang.Class<?> wildcardClass10 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "faculty" + "'", str7, "faculty");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test11944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11944");
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
        java.lang.String str13 = faculty3.getEmail();
        faculty3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test11945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11945");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        java.lang.String str4 = faculty3.getAccountType();
        java.lang.String str5 = faculty3.getID();
        faculty3.setVerified(true);
        java.lang.String str8 = faculty3.getAccountType();
        java.lang.String str9 = faculty3.getPassword();
        faculty3.setVerified(true);
        boolean boolean12 = faculty3.isVerified();
        java.lang.String str13 = faculty3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "faculty" + "'", str4, "faculty");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "faculty" + "'", str8, "faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test11946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11946");
        model.Faculty faculty3 = new model.Faculty("", "faculty", "faculty");
        double double4 = faculty3.getHourlyRate();
        java.lang.String str5 = faculty3.getEmail();
        java.lang.String str6 = faculty3.getAccountType();
        faculty3.setVerified(false);
        java.lang.String str9 = faculty3.getAccountType();
        faculty3.login("hi!", "hi!");
        java.lang.String str13 = faculty3.getEmail();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 30.0d + "'", double4 == 30.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "faculty" + "'", str9, "faculty");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test11947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11947");
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
        faculty3.setVerified(false);
        java.lang.Class<?> wildcardClass20 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 30.0d + "'", double12 == 30.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "faculty" + "'", str14, "faculty");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "faculty" + "'", str16, "faculty");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test11948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11948");
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
        boolean boolean14 = faculty3.isVerified();
        faculty3.login("", "faculty");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "faculty" + "'", str8, "faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "faculty" + "'", str9, "faculty");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test11949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11949");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        double double4 = faculty3.getHourlyRate();
        boolean boolean5 = faculty3.isVerified();
        double double6 = faculty3.getHourlyRate();
        faculty3.logout();
        java.lang.String str8 = faculty3.getID();
        faculty3.logout();
        java.lang.String str10 = faculty3.getID();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 30.0d + "'", double4 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test11950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11950");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        double double6 = faculty3.getHourlyRate();
        java.lang.String str7 = faculty3.getPassword();
        faculty3.login("", "faculty");
        boolean boolean11 = faculty3.isVerified();
        double double12 = faculty3.getHourlyRate();
        java.lang.String str13 = faculty3.getAccountType();
        java.lang.String str14 = faculty3.getPassword();
        faculty3.login("hi!", "hi!");
        java.lang.String str18 = faculty3.getAccountType();
        java.lang.String str19 = faculty3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 30.0d + "'", double12 == 30.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "faculty" + "'", str13, "faculty");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "faculty" + "'", str18, "faculty");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test11951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11951");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        faculty3.logout();
        java.lang.String str5 = faculty3.getID();
        java.lang.String str6 = faculty3.getEmail();
        java.lang.String str7 = faculty3.getPassword();
        java.lang.String str8 = faculty3.getID();
        faculty3.logout();
        faculty3.logout();
        double double11 = faculty3.getHourlyRate();
        boolean boolean12 = faculty3.isVerified();
        double double13 = faculty3.getHourlyRate();
        faculty3.viewProfile();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 30.0d + "'", double11 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 30.0d + "'", double13 == 30.0d);
    }

    @Test
    public void test11952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11952");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        faculty3.setVerified(false);
        faculty3.viewProfile();
        java.lang.String str7 = faculty3.getEmail();
        java.lang.String str8 = faculty3.getID();
        faculty3.login("hi!", "faculty");
        faculty3.setVerified(true);
        faculty3.viewProfile();
        faculty3.logout();
        java.lang.String str16 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "faculty" + "'", str16, "faculty");
    }

    @Test
    public void test11953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11953");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        java.lang.String str7 = faculty3.getID();
        double double8 = faculty3.getHourlyRate();
        faculty3.logout();
        faculty3.login("hi!", "hi!");
        faculty3.viewProfile();
        faculty3.setVerified(true);
        java.lang.String str16 = faculty3.getPassword();
        faculty3.logout();
        java.lang.String str18 = faculty3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test11954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11954");
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
        java.lang.String str19 = faculty3.getID();
        java.lang.String str20 = faculty3.getEmail();
        faculty3.setVerified(true);
        faculty3.viewProfile();
        java.lang.String str24 = faculty3.getID();
        faculty3.logout();
        faculty3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "faculty" + "'", str15, "faculty");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
    }

    @Test
    public void test11955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11955");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        java.lang.String str7 = faculty3.getID();
        double double8 = faculty3.getHourlyRate();
        faculty3.logout();
        faculty3.logout();
        faculty3.setVerified(true);
        java.lang.String str13 = faculty3.getID();
        java.lang.String str14 = faculty3.getEmail();
        faculty3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test11956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11956");
        model.Faculty faculty3 = new model.Faculty("hi!", "hi!", "");
        java.lang.String str4 = faculty3.getAccountType();
        java.lang.String str5 = faculty3.getID();
        boolean boolean6 = faculty3.isVerified();
        faculty3.setVerified(false);
        faculty3.setVerified(false);
        faculty3.setVerified(false);
        faculty3.login("hi!", "faculty");
        boolean boolean16 = faculty3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "faculty" + "'", str4, "faculty");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test11957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11957");
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
        faculty3.setVerified(true);
        faculty3.viewProfile();
        java.lang.String str20 = faculty3.getEmail();
        java.lang.Class<?> wildcardClass21 = faculty3.getClass();
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test11958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11958");
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
        java.lang.String str16 = faculty3.getID();
        faculty3.viewProfile();
        faculty3.setVerified(true);
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test11959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11959");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.viewProfile();
        faculty3.viewProfile();
        faculty3.viewProfile();
        faculty3.login("faculty", "hi!");
        java.lang.String str13 = faculty3.getID();
        faculty3.login("", "faculty");
        faculty3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test11960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11960");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.viewProfile();
        double double8 = faculty3.getHourlyRate();
        faculty3.login("faculty", "faculty");
        boolean boolean12 = faculty3.isVerified();
        faculty3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test11961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11961");
        model.Faculty faculty3 = new model.Faculty("hi!", "hi!", "");
        faculty3.setVerified(true);
        double double6 = faculty3.getHourlyRate();
        java.lang.String str7 = faculty3.getID();
        boolean boolean8 = faculty3.isVerified();
        java.lang.String str9 = faculty3.getPassword();
        java.lang.String str10 = faculty3.getAccountType();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "faculty" + "'", str10, "faculty");
    }

    @Test
    public void test11962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11962");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        faculty3.logout();
        java.lang.String str5 = faculty3.getID();
        java.lang.String str6 = faculty3.getPassword();
        faculty3.logout();
        java.lang.String str8 = faculty3.getPassword();
        java.lang.String str9 = faculty3.getPassword();
        faculty3.setVerified(true);
        boolean boolean12 = faculty3.isVerified();
        double double13 = faculty3.getHourlyRate();
        faculty3.setVerified(false);
        faculty3.login("hi!", "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 30.0d + "'", double13 == 30.0d);
    }

    @Test
    public void test11963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11963");
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
        faculty3.logout();
        java.lang.String str19 = faculty3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "faculty" + "'", str13, "faculty");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "faculty" + "'", str14, "faculty");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test11964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11964");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        faculty3.login("", "faculty");
        java.lang.String str10 = faculty3.getEmail();
        boolean boolean11 = faculty3.isVerified();
        java.lang.String str12 = faculty3.getAccountType();
        double double13 = faculty3.getHourlyRate();
        java.lang.String str14 = faculty3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "faculty" + "'", str12, "faculty");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 30.0d + "'", double13 == 30.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "faculty" + "'", str14, "faculty");
    }

    @Test
    public void test11965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11965");
        model.Faculty faculty3 = new model.Faculty("hi!", "faculty", "faculty");
        java.lang.String str4 = faculty3.getID();
        faculty3.viewProfile();
        boolean boolean6 = faculty3.isVerified();
        double double7 = faculty3.getHourlyRate();
        double double8 = faculty3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "faculty" + "'", str4, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
    }

    @Test
    public void test11966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11966");
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
        faculty3.login("", "hi!");
        java.lang.String str16 = faculty3.getPassword();
        boolean boolean17 = faculty3.isVerified();
        faculty3.login("hi!", "faculty");
        faculty3.login("hi!", "");
        faculty3.login("hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "faculty" + "'", str11, "faculty");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test11967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11967");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        faculty3.setVerified(false);
        java.lang.String str6 = faculty3.getPassword();
        java.lang.String str7 = faculty3.getID();
        faculty3.login("", "hi!");
        faculty3.setVerified(false);
        boolean boolean13 = faculty3.isVerified();
        faculty3.logout();
        java.lang.String str15 = faculty3.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test11968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11968");
        model.Faculty faculty3 = new model.Faculty("hi!", "hi!", "");
        faculty3.logout();
        java.lang.String str5 = faculty3.getEmail();
        boolean boolean6 = faculty3.isVerified();
        java.lang.String str7 = faculty3.getEmail();
        java.lang.String str8 = faculty3.getID();
        faculty3.setVerified(true);
        java.lang.String str11 = faculty3.getEmail();
        double double12 = faculty3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 30.0d + "'", double12 == 30.0d);
    }

    @Test
    public void test11969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11969");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        java.lang.String str6 = faculty3.getPassword();
        faculty3.setVerified(false);
        java.lang.String str9 = faculty3.getEmail();
        faculty3.viewProfile();
        faculty3.login("hi!", "faculty");
        java.lang.String str14 = faculty3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test11970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11970");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        faculty3.setVerified(false);
        faculty3.viewProfile();
        java.lang.String str7 = faculty3.getEmail();
        java.lang.String str8 = faculty3.getAccountType();
        java.lang.String str9 = faculty3.getID();
        faculty3.setVerified(false);
        java.lang.String str12 = faculty3.getAccountType();
        double double13 = faculty3.getHourlyRate();
        faculty3.login("faculty", "hi!");
        double double17 = faculty3.getHourlyRate();
        faculty3.setVerified(true);
        faculty3.viewProfile();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "faculty" + "'", str8, "faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "faculty" + "'", str12, "faculty");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 30.0d + "'", double13 == 30.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 30.0d + "'", double17 == 30.0d);
    }

    @Test
    public void test11971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11971");
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
        java.lang.String str15 = faculty3.getID();
        faculty3.login("", "hi!");
        boolean boolean19 = faculty3.isVerified();
        java.lang.String str20 = faculty3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "faculty" + "'", str10, "faculty");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test11972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11972");
        model.Faculty faculty3 = new model.Faculty("hi!", "hi!", "");
        faculty3.viewProfile();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.viewProfile();
        java.lang.String str8 = faculty3.getPassword();
        faculty3.viewProfile();
        faculty3.setVerified(false);
        java.lang.String str12 = faculty3.getPassword();
        faculty3.viewProfile();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test11973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11973");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        boolean boolean7 = faculty3.isVerified();
        faculty3.logout();
        java.lang.String str9 = faculty3.getID();
        faculty3.login("hi!", "");
        faculty3.viewProfile();
        boolean boolean14 = faculty3.isVerified();
        double double15 = faculty3.getHourlyRate();
        faculty3.setVerified(true);
        faculty3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 30.0d + "'", double15 == 30.0d);
    }

    @Test
    public void test11974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11974");
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
        java.lang.Class<?> wildcardClass19 = faculty3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 30.0d + "'", double4 == 30.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "faculty" + "'", str14, "faculty");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 30.0d + "'", double17 == 30.0d);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test11975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11975");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        java.lang.String str8 = faculty3.getPassword();
        faculty3.logout();
        double double10 = faculty3.getHourlyRate();
        faculty3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 30.0d + "'", double10 == 30.0d);
    }

    @Test
    public void test11976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11976");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        faculty3.logout();
        faculty3.login("hi!", "hi!");
        java.lang.String str8 = faculty3.getID();
        boolean boolean9 = faculty3.isVerified();
        faculty3.setVerified(true);
        boolean boolean12 = faculty3.isVerified();
        double double13 = faculty3.getHourlyRate();
        faculty3.login("", "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 30.0d + "'", double13 == 30.0d);
    }

    @Test
    public void test11977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11977");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        faculty3.setVerified(true);
        java.lang.String str10 = faculty3.getEmail();
        faculty3.login("hi!", "");
        double double14 = faculty3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 30.0d + "'", double14 == 30.0d);
    }

    @Test
    public void test11978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11978");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        faculty3.login("", "");
        java.lang.String str7 = faculty3.getPassword();
        java.lang.String str8 = faculty3.getEmail();
        java.lang.String str9 = faculty3.getAccountType();
        java.lang.String str10 = faculty3.getPassword();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "faculty" + "'", str9, "faculty");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test11979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11979");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        faculty3.setVerified(false);
        java.lang.String str6 = faculty3.getEmail();
        java.lang.String str7 = faculty3.getAccountType();
        java.lang.String str8 = faculty3.getPassword();
        java.lang.String str9 = faculty3.getAccountType();
        boolean boolean10 = faculty3.isVerified();
        java.lang.String str11 = faculty3.getAccountType();
        java.lang.String str12 = faculty3.getEmail();
        faculty3.login("", "hi!");
        double double16 = faculty3.getHourlyRate();
        java.lang.String str17 = faculty3.getEmail();
        double double18 = faculty3.getHourlyRate();
        double double19 = faculty3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "faculty" + "'", str7, "faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "faculty" + "'", str9, "faculty");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "faculty" + "'", str11, "faculty");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 30.0d + "'", double16 == 30.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 30.0d + "'", double18 == 30.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 30.0d + "'", double19 == 30.0d);
    }

    @Test
    public void test11980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11980");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.logout();
        java.lang.String str8 = faculty3.getAccountType();
        java.lang.String str9 = faculty3.getAccountType();
        java.lang.String str10 = faculty3.getID();
        java.lang.String str11 = faculty3.getAccountType();
        boolean boolean12 = faculty3.isVerified();
        faculty3.login("hi!", "faculty");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "faculty" + "'", str8, "faculty");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "faculty" + "'", str9, "faculty");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "faculty" + "'", str11, "faculty");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test11981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11981");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        java.lang.String str7 = faculty3.getID();
        java.lang.String str8 = faculty3.getID();
        java.lang.String str9 = faculty3.getID();
        faculty3.setVerified(true);
        faculty3.setVerified(false);
        faculty3.viewProfile();
        boolean boolean15 = faculty3.isVerified();
        faculty3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test11982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11982");
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
        faculty3.login("hi!", "hi!");
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
    }

    @Test
    public void test11983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11983");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        faculty3.setVerified(false);
        java.lang.String str6 = faculty3.getEmail();
        faculty3.setVerified(false);
        faculty3.login("faculty", "hi!");
        java.lang.String str12 = faculty3.getPassword();
        double double13 = faculty3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 30.0d + "'", double13 == 30.0d);
    }

    @Test
    public void test11984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11984");
        model.Faculty faculty3 = new model.Faculty("hi!", "faculty", "");
        java.lang.String str4 = faculty3.getPassword();
        faculty3.logout();
        faculty3.setVerified(true);
        java.lang.String str8 = faculty3.getEmail();
        faculty3.login("faculty", "");
        faculty3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "faculty" + "'", str4, "faculty");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test11985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11985");
        model.Faculty faculty3 = new model.Faculty("", "faculty", "faculty");
        double double4 = faculty3.getHourlyRate();
        java.lang.String str5 = faculty3.getAccountType();
        faculty3.setVerified(false);
        faculty3.setVerified(false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 30.0d + "'", double4 == 30.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
    }

    @Test
    public void test11986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11986");
        model.Faculty faculty3 = new model.Faculty("", "faculty", "faculty");
        double double4 = faculty3.getHourlyRate();
        java.lang.String str5 = faculty3.getAccountType();
        double double6 = faculty3.getHourlyRate();
        java.lang.String str7 = faculty3.getPassword();
        double double8 = faculty3.getHourlyRate();
        java.lang.String str9 = faculty3.getPassword();
        double double10 = faculty3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 30.0d + "'", double4 == 30.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "faculty" + "'", str7, "faculty");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "faculty" + "'", str9, "faculty");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 30.0d + "'", double10 == 30.0d);
    }

    @Test
    public void test11987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11987");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.viewProfile();
        faculty3.login("faculty", "");
        java.lang.String str11 = faculty3.getAccountType();
        java.lang.String str12 = faculty3.getEmail();
        java.lang.String str13 = faculty3.getAccountType();
        java.lang.String str14 = faculty3.getAccountType();
        faculty3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "faculty" + "'", str11, "faculty");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "faculty" + "'", str13, "faculty");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "faculty" + "'", str14, "faculty");
    }

    @Test
    public void test11988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11988");
        model.Faculty faculty3 = new model.Faculty("faculty", "", "faculty");
        faculty3.setVerified(false);
        faculty3.login("hi!", "hi!");
        java.lang.String str9 = faculty3.getEmail();
        faculty3.logout();
        faculty3.login("", "faculty");
        java.lang.String str14 = faculty3.getEmail();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "faculty" + "'", str9, "faculty");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "faculty" + "'", str14, "faculty");
    }

    @Test
    public void test11989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11989");
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
        java.lang.String str20 = faculty3.getID();
        boolean boolean21 = faculty3.isVerified();
        java.lang.String str22 = faculty3.getID();
        java.lang.String str23 = faculty3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test11990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11990");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        boolean boolean6 = faculty3.isVerified();
        faculty3.viewProfile();
        double double8 = faculty3.getHourlyRate();
        faculty3.login("faculty", "faculty");
        boolean boolean12 = faculty3.isVerified();
        faculty3.login("", "faculty");
        java.lang.String str16 = faculty3.getAccountType();
        java.lang.String str17 = faculty3.getEmail();
        java.lang.String str18 = faculty3.getAccountType();
        java.lang.String str19 = faculty3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "faculty" + "'", str16, "faculty");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "faculty" + "'", str18, "faculty");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test11991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11991");
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
        boolean boolean21 = faculty3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "faculty" + "'", str15, "faculty");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test11992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11992");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        java.lang.String str5 = faculty3.getAccountType();
        double double6 = faculty3.getHourlyRate();
        faculty3.logout();
        faculty3.setVerified(false);
        double double10 = faculty3.getHourlyRate();
        faculty3.login("", "");
        faculty3.viewProfile();
        java.lang.String str15 = faculty3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 30.0d + "'", double10 == 30.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test11993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11993");
        model.Faculty faculty3 = new model.Faculty("", "", "hi!");
        java.lang.String str4 = faculty3.getID();
        boolean boolean5 = faculty3.isVerified();
        java.lang.String str6 = faculty3.getID();
        java.lang.String str7 = faculty3.getID();
        double double8 = faculty3.getHourlyRate();
        faculty3.logout();
        faculty3.logout();
        java.lang.String str11 = faculty3.getID();
        faculty3.viewProfile();
        java.lang.String str13 = faculty3.getID();
        faculty3.setVerified(false);
        double double16 = faculty3.getHourlyRate();
        java.lang.String str17 = faculty3.getID();
        double double18 = faculty3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 30.0d + "'", double16 == 30.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 30.0d + "'", double18 == 30.0d);
    }

    @Test
    public void test11994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11994");
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
        faculty3.viewProfile();
        faculty3.viewProfile();
        java.lang.String str15 = faculty3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "faculty" + "'", str6, "faculty");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "faculty" + "'", str11, "faculty");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test11995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11995");
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
        faculty3.viewProfile();
        faculty3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 30.0d + "'", double7 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "faculty" + "'", str16, "faculty");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "faculty" + "'", str17, "faculty");
    }

    @Test
    public void test11996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11996");
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
        java.lang.String str15 = faculty3.getAccountType();
        double double16 = faculty3.getHourlyRate();
        faculty3.viewProfile();
        java.lang.Class<?> wildcardClass18 = faculty3.getClass();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 30.0d + "'", double8 == 30.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 30.0d + "'", double13 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "faculty" + "'", str15, "faculty");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 30.0d + "'", double16 == 30.0d);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test11997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11997");
        model.Faculty faculty3 = new model.Faculty("hi!", "", "hi!");
        java.lang.String str4 = faculty3.getAccountType();
        java.lang.String str5 = faculty3.getID();
        faculty3.setVerified(true);
        faculty3.login("faculty", "faculty");
        faculty3.setVerified(true);
        double double13 = faculty3.getHourlyRate();
        java.lang.String str14 = faculty3.getEmail();
        faculty3.login("faculty", "faculty");
        faculty3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "faculty" + "'", str4, "faculty");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 30.0d + "'", double13 == 30.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test11998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11998");
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
        java.lang.Class<?> wildcardClass14 = faculty3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "faculty" + "'", str8, "faculty");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "faculty" + "'", str11, "faculty");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "faculty" + "'", str12, "faculty");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 30.0d + "'", double13 == 30.0d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test11999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11999");
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
        boolean boolean16 = faculty3.isVerified();
        faculty3.setVerified(false);
        faculty3.viewProfile();
        java.lang.String str20 = faculty3.getEmail();
        double double21 = faculty3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 30.0d + "'", double21 == 30.0d);
    }

    @Test
    public void test12000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test12000");
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
        java.lang.String str13 = faculty3.getEmail();
        faculty3.login("", "faculty");
        faculty3.setVerified(false);
        java.lang.String str19 = faculty3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "faculty" + "'", str5, "faculty");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }
}

