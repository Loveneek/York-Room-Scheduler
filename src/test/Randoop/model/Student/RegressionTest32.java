import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest32 {

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
    public void test16001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16001");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getAccountType();
        student3.logout();
        java.lang.String str8 = student3.getEmail();
        student3.viewProfile();
        double double10 = student3.getHourlyRate();
        boolean boolean11 = student3.isVerified();
        double double12 = student3.getHourlyRate();
        student3.logout();
        student3.setVerified(true);
        java.lang.String str16 = student3.getEmail();
        java.lang.String str17 = student3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 20.0d + "'", double12 == 20.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test16002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16002");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        student3.setVerified(false);
        java.lang.String str9 = student3.getID();
        student3.setVerified(false);
        student3.logout();
        student3.setVerified(false);
        java.lang.String str15 = student3.getPassword();
        student3.setVerified(true);
        double double18 = student3.getHourlyRate();
        student3.logout();
        boolean boolean20 = student3.isVerified();
        java.lang.String str21 = student3.getEmail();
        student3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 20.0d + "'", double18 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test16003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16003");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        java.lang.String str7 = student3.getID();
        student3.setVerified(true);
        java.lang.String str10 = student3.getEmail();
        student3.setVerified(true);
        student3.logout();
        double double14 = student3.getHourlyRate();
        double double15 = student3.getHourlyRate();
        student3.logout();
        java.lang.String str17 = student3.getID();
        java.lang.String str18 = student3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 20.0d + "'", double14 == 20.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 20.0d + "'", double15 == 20.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test16004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16004");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        student3.setVerified(false);
        java.lang.String str6 = student3.getPassword();
        java.lang.String str7 = student3.getAccountType();
        student3.viewProfile();
        boolean boolean9 = student3.isVerified();
        java.lang.String str10 = student3.getPassword();
        student3.login("student", "student");
        student3.setVerified(false);
        student3.logout();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test16005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16005");
        model.Student student3 = new model.Student("", "", "hi!");
        student3.logout();
        java.lang.String str5 = student3.getID();
        java.lang.String str6 = student3.getPassword();
        double double7 = student3.getHourlyRate();
        student3.setVerified(false);
        java.lang.String str10 = student3.getID();
        student3.logout();
        java.lang.String str12 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "student" + "'", str12, "student");
    }

    @Test
    public void test16006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16006");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        java.lang.String str7 = student3.getID();
        java.lang.String str8 = student3.getID();
        java.lang.String str9 = student3.getID();
        student3.setVerified(true);
        student3.setVerified(false);
        student3.login("", "hi!");
        java.lang.String str17 = student3.getPassword();
        java.lang.String str18 = student3.getEmail();
        java.lang.String str19 = student3.getAccountType();
        java.lang.String str20 = student3.getPassword();
        student3.login("", "");
        java.lang.String str24 = student3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "student" + "'", str19, "student");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test16007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16007");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getAccountType();
        student3.logout();
        double double8 = student3.getHourlyRate();
        java.lang.String str9 = student3.getEmail();
        java.lang.String str10 = student3.getAccountType();
        student3.setVerified(true);
        student3.login("hi!", "");
        java.lang.String str16 = student3.getAccountType();
        java.lang.String str17 = student3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "student" + "'", str10, "student");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "student" + "'", str16, "student");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test16008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16008");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        boolean boolean7 = student3.isVerified();
        student3.logout();
        student3.logout();
        student3.viewProfile();
        student3.logout();
        java.lang.String str12 = student3.getAccountType();
        student3.logout();
        student3.logout();
        java.lang.String str15 = student3.getID();
        double double16 = student3.getHourlyRate();
        java.lang.String str17 = student3.getAccountType();
        student3.viewProfile();
        double double19 = student3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "student" + "'", str12, "student");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 20.0d + "'", double16 == 20.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "student" + "'", str17, "student");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 20.0d + "'", double19 == 20.0d);
    }

    @Test
    public void test16009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16009");
        model.Student student3 = new model.Student("hi!", "student", "");
        student3.logout();
        java.lang.String str5 = student3.getEmail();
        java.lang.String str6 = student3.getEmail();
        boolean boolean7 = student3.isVerified();
        java.lang.String str8 = student3.getEmail();
        boolean boolean9 = student3.isVerified();
        java.lang.String str10 = student3.getEmail();
        student3.logout();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test16010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16010");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        java.lang.String str6 = student3.getPassword();
        student3.setVerified(false);
        student3.setVerified(false);
        java.lang.String str11 = student3.getID();
        java.lang.String str12 = student3.getAccountType();
        student3.setVerified(false);
        java.lang.String str15 = student3.getEmail();
        student3.login("student", "student");
        double double19 = student3.getHourlyRate();
        student3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "student" + "'", str12, "student");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 20.0d + "'", double19 == 20.0d);
    }

    @Test
    public void test16011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16011");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        boolean boolean7 = student3.isVerified();
        student3.logout();
        java.lang.String str9 = student3.getID();
        student3.login("hi!", "");
        student3.viewProfile();
        boolean boolean14 = student3.isVerified();
        student3.logout();
        java.lang.String str16 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "student" + "'", str16, "student");
    }

    @Test
    public void test16012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16012");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        java.lang.String str6 = student3.getPassword();
        student3.setVerified(false);
        student3.setVerified(false);
        java.lang.String str11 = student3.getID();
        java.lang.String str12 = student3.getAccountType();
        student3.setVerified(false);
        java.lang.String str15 = student3.getAccountType();
        student3.logout();
        java.lang.String str17 = student3.getAccountType();
        java.lang.String str18 = student3.getAccountType();
        java.lang.String str19 = student3.getAccountType();
        java.lang.String str20 = student3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "student" + "'", str12, "student");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "student" + "'", str15, "student");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "student" + "'", str17, "student");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "student" + "'", str18, "student");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "student" + "'", str19, "student");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test16013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16013");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        student3.setVerified(false);
        java.lang.String str9 = student3.getID();
        student3.setVerified(false);
        java.lang.String str12 = student3.getID();
        double double13 = student3.getHourlyRate();
        double double14 = student3.getHourlyRate();
        boolean boolean15 = student3.isVerified();
        java.lang.String str16 = student3.getID();
        double double17 = student3.getHourlyRate();
        boolean boolean18 = student3.isVerified();
        double double19 = student3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 20.0d + "'", double13 == 20.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 20.0d + "'", double14 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 20.0d + "'", double17 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 20.0d + "'", double19 == 20.0d);
    }

    @Test
    public void test16014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16014");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        java.lang.String str4 = student3.getAccountType();
        java.lang.String str5 = student3.getID();
        student3.setVerified(true);
        student3.login("student", "student");
        java.lang.String str11 = student3.getID();
        student3.viewProfile();
        java.lang.String str13 = student3.getPassword();
        java.lang.String str14 = student3.getID();
        java.lang.String str15 = student3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "student" + "'", str4, "student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test16015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16015");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        student3.login("", "student");
        student3.login("hi!", "hi!");
        java.lang.String str13 = student3.getAccountType();
        java.lang.String str14 = student3.getEmail();
        student3.viewProfile();
        java.lang.String str16 = student3.getPassword();
        boolean boolean17 = student3.isVerified();
        java.lang.String str18 = student3.getAccountType();
        java.lang.String str19 = student3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "student" + "'", str13, "student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "student" + "'", str18, "student");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test16016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16016");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        double double6 = student3.getHourlyRate();
        java.lang.String str7 = student3.getPassword();
        java.lang.String str8 = student3.getPassword();
        student3.login("student", "hi!");
        student3.login("hi!", "");
        student3.login("student", "");
        java.lang.String str18 = student3.getID();
        java.lang.String str19 = student3.getAccountType();
        double double20 = student3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "student" + "'", str19, "student");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 20.0d + "'", double20 == 20.0d);
    }

    @Test
    public void test16017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16017");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        student3.setVerified(false);
        java.lang.String str9 = student3.getID();
        student3.setVerified(false);
        student3.logout();
        student3.setVerified(false);
        java.lang.String str15 = student3.getPassword();
        student3.setVerified(true);
        student3.setVerified(false);
        student3.setVerified(false);
        student3.login("hi!", "");
        student3.viewProfile();
        java.lang.String str26 = student3.getAccountType();
        student3.logout();
        student3.logout();
        student3.viewProfile();
        student3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "student" + "'", str26, "student");
    }

    @Test
    public void test16018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16018");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getAccountType();
        student3.logout();
        java.lang.String str8 = student3.getEmail();
        student3.viewProfile();
        java.lang.String str10 = student3.getAccountType();
        java.lang.String str11 = student3.getAccountType();
        student3.setVerified(true);
        java.lang.String str14 = student3.getEmail();
        student3.login("student", "hi!");
        java.lang.String str18 = student3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "student" + "'", str10, "student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "student" + "'", str11, "student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test16019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16019");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        java.lang.String str8 = student3.getAccountType();
        student3.setVerified(false);
        student3.viewProfile();
        student3.viewProfile();
        student3.logout();
        double double14 = student3.getHourlyRate();
        java.lang.Class<?> wildcardClass15 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 20.0d + "'", double14 == 20.0d);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test16020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16020");
        model.Student student3 = new model.Student("", "", "hi!");
        student3.logout();
        java.lang.String str5 = student3.getID();
        java.lang.String str6 = student3.getEmail();
        java.lang.String str7 = student3.getEmail();
        student3.logout();
        java.lang.String str9 = student3.getID();
        student3.viewProfile();
        student3.logout();
        java.lang.String str12 = student3.getEmail();
        double double13 = student3.getHourlyRate();
        student3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 20.0d + "'", double13 == 20.0d);
    }

    @Test
    public void test16021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16021");
        model.Student student3 = new model.Student("", "", "hi!");
        student3.logout();
        java.lang.String str5 = student3.getID();
        java.lang.String str6 = student3.getEmail();
        double double7 = student3.getHourlyRate();
        java.lang.String str8 = student3.getEmail();
        java.lang.String str9 = student3.getID();
        java.lang.String str10 = student3.getID();
        java.lang.String str11 = student3.getID();
        java.lang.String str12 = student3.getAccountType();
        student3.setVerified(true);
        java.lang.String str15 = student3.getEmail();
        student3.viewProfile();
        double double17 = student3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "student" + "'", str12, "student");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 20.0d + "'", double17 == 20.0d);
    }

    @Test
    public void test16022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16022");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        student3.setVerified(false);
        java.lang.String str10 = student3.getID();
        student3.viewProfile();
        student3.login("", "");
        java.lang.String str15 = student3.getPassword();
        double double16 = student3.getHourlyRate();
        java.lang.String str17 = student3.getPassword();
        double double18 = student3.getHourlyRate();
        java.lang.String str19 = student3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 20.0d + "'", double16 == 20.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 20.0d + "'", double18 == 20.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test16023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16023");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.viewProfile();
        java.lang.String str8 = student3.getAccountType();
        java.lang.String str9 = student3.getID();
        double double10 = student3.getHourlyRate();
        student3.setVerified(true);
        student3.viewProfile();
        student3.viewProfile();
        java.lang.String str15 = student3.getAccountType();
        student3.viewProfile();
        double double17 = student3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "student" + "'", str15, "student");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 20.0d + "'", double17 == 20.0d);
    }

    @Test
    public void test16024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16024");
        model.Student student3 = new model.Student("hi!", "student", "");
        student3.logout();
        student3.logout();
        student3.login("", "student");
        java.lang.String str9 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "student" + "'", str9, "student");
    }

    @Test
    public void test16025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16025");
        model.Student student3 = new model.Student("", "", "hi!");
        student3.logout();
        java.lang.String str5 = student3.getID();
        java.lang.String str6 = student3.getEmail();
        java.lang.String str7 = student3.getPassword();
        java.lang.String str8 = student3.getID();
        student3.logout();
        student3.logout();
        student3.viewProfile();
        java.lang.String str12 = student3.getID();
        double double13 = student3.getHourlyRate();
        double double14 = student3.getHourlyRate();
        java.lang.String str15 = student3.getPassword();
        student3.viewProfile();
        boolean boolean17 = student3.isVerified();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 20.0d + "'", double13 == 20.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 20.0d + "'", double14 == 20.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test16026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16026");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        java.lang.String str6 = student3.getPassword();
        student3.setVerified(false);
        student3.setVerified(true);
        double double11 = student3.getHourlyRate();
        boolean boolean12 = student3.isVerified();
        student3.viewProfile();
        java.lang.String str14 = student3.getID();
        java.lang.String str15 = student3.getID();
        student3.setVerified(true);
        java.lang.String str18 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "student" + "'", str18, "student");
    }

    @Test
    public void test16027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16027");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getAccountType();
        student3.logout();
        java.lang.String str8 = student3.getEmail();
        student3.viewProfile();
        boolean boolean10 = student3.isVerified();
        student3.viewProfile();
        student3.logout();
        student3.logout();
        student3.login("", "student");
        student3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test16028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16028");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        student3.setVerified(false);
        java.lang.String str10 = student3.getEmail();
        student3.logout();
        student3.login("student", "hi!");
        java.lang.String str15 = student3.getPassword();
        student3.login("student", "");
        student3.login("", "hi!");
        student3.setVerified(true);
        boolean boolean24 = student3.isVerified();
        boolean boolean25 = student3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test16029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16029");
        model.Student student3 = new model.Student("", "hi!", "hi!");
        student3.login("student", "student");
        student3.logout();
        java.lang.String str8 = student3.getEmail();
        student3.login("student", "");
        java.lang.String str12 = student3.getEmail();
        student3.viewProfile();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test16030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16030");
        model.Student student3 = new model.Student("", "student", "student");
        double double4 = student3.getHourlyRate();
        java.lang.String str5 = student3.getAccountType();
        java.lang.String str6 = student3.getID();
        java.lang.String str7 = student3.getAccountType();
        double double8 = student3.getHourlyRate();
        boolean boolean9 = student3.isVerified();
        student3.login("student", "");
        double double13 = student3.getHourlyRate();
        java.lang.String str14 = student3.getPassword();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 20.0d + "'", double13 == 20.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "student" + "'", str14, "student");
    }

    @Test
    public void test16031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16031");
        model.Student student3 = new model.Student("", "", "hi!");
        student3.logout();
        java.lang.String str5 = student3.getID();
        java.lang.String str6 = student3.getPassword();
        double double7 = student3.getHourlyRate();
        student3.login("student", "hi!");
        java.lang.String str11 = student3.getID();
        boolean boolean12 = student3.isVerified();
        student3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test16032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16032");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        double double6 = student3.getHourlyRate();
        java.lang.String str7 = student3.getPassword();
        java.lang.String str8 = student3.getPassword();
        student3.viewProfile();
        double double10 = student3.getHourlyRate();
        student3.setVerified(false);
        java.lang.String str13 = student3.getID();
        java.lang.String str14 = student3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test16033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16033");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getAccountType();
        student3.logout();
        java.lang.String str8 = student3.getEmail();
        student3.viewProfile();
        java.lang.String str10 = student3.getID();
        student3.logout();
        student3.login("student", "");
        java.lang.String str15 = student3.getEmail();
        java.lang.String str16 = student3.getID();
        student3.viewProfile();
        java.lang.String str18 = student3.getAccountType();
        student3.logout();
        double double20 = student3.getHourlyRate();
        java.lang.Class<?> wildcardClass21 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "student" + "'", str18, "student");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 20.0d + "'", double20 == 20.0d);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test16034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16034");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        student3.setVerified(false);
        java.lang.String str9 = student3.getID();
        student3.setVerified(false);
        java.lang.String str12 = student3.getID();
        java.lang.String str13 = student3.getID();
        double double14 = student3.getHourlyRate();
        student3.viewProfile();
        java.lang.String str16 = student3.getEmail();
        boolean boolean17 = student3.isVerified();
        student3.viewProfile();
        boolean boolean19 = student3.isVerified();
        double double20 = student3.getHourlyRate();
        student3.login("", "student");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 20.0d + "'", double14 == 20.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 20.0d + "'", double20 == 20.0d);
    }

    @Test
    public void test16035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16035");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        student3.setVerified(false);
        student3.viewProfile();
        java.lang.String str7 = student3.getEmail();
        java.lang.String str8 = student3.getID();
        student3.viewProfile();
        java.lang.String str10 = student3.getEmail();
        java.lang.String str11 = student3.getEmail();
        java.lang.String str12 = student3.getPassword();
        java.lang.String str13 = student3.getAccountType();
        java.lang.String str14 = student3.getPassword();
        student3.viewProfile();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "student" + "'", str13, "student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test16036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16036");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        boolean boolean7 = student3.isVerified();
        student3.logout();
        java.lang.String str9 = student3.getID();
        java.lang.String str10 = student3.getID();
        double double11 = student3.getHourlyRate();
        student3.logout();
        java.lang.String str13 = student3.getAccountType();
        java.lang.Class<?> wildcardClass14 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "student" + "'", str13, "student");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test16037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16037");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getAccountType();
        student3.logout();
        double double8 = student3.getHourlyRate();
        java.lang.String str9 = student3.getEmail();
        java.lang.String str10 = student3.getAccountType();
        student3.setVerified(true);
        student3.login("hi!", "");
        java.lang.String str16 = student3.getAccountType();
        student3.logout();
        student3.login("hi!", "hi!");
        boolean boolean21 = student3.isVerified();
        java.lang.String str22 = student3.getPassword();
        java.lang.String str23 = student3.getEmail();
        double double24 = student3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "student" + "'", str10, "student");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "student" + "'", str16, "student");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 20.0d + "'", double24 == 20.0d);
    }

    @Test
    public void test16038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16038");
        model.Student student3 = new model.Student("hi!", "student", "");
        java.lang.String str4 = student3.getEmail();
        student3.viewProfile();
        student3.setVerified(true);
        java.lang.String str8 = student3.getID();
        student3.viewProfile();
        java.lang.String str10 = student3.getID();
        boolean boolean11 = student3.isVerified();
        student3.login("", "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test16039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16039");
        model.Student student3 = new model.Student("hi!", "hi!", "");
        student3.logout();
        java.lang.String str5 = student3.getEmail();
        java.lang.String str6 = student3.getAccountType();
        student3.login("student", "student");
        double double10 = student3.getHourlyRate();
        student3.viewProfile();
        double double12 = student3.getHourlyRate();
        student3.logout();
        java.lang.String str14 = student3.getEmail();
        boolean boolean15 = student3.isVerified();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 20.0d + "'", double12 == 20.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test16040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16040");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.login("", "");
        java.lang.String str10 = student3.getAccountType();
        student3.viewProfile();
        java.lang.String str12 = student3.getPassword();
        java.lang.String str13 = student3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "student" + "'", str10, "student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test16041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16041");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        student3.setVerified(false);
        java.lang.String str6 = student3.getPassword();
        java.lang.String str7 = student3.getAccountType();
        java.lang.String str8 = student3.getEmail();
        student3.setVerified(true);
        boolean boolean11 = student3.isVerified();
        java.lang.String str12 = student3.getPassword();
        boolean boolean13 = student3.isVerified();
        java.lang.String str14 = student3.getEmail();
        double double15 = student3.getHourlyRate();
        java.lang.String str16 = student3.getEmail();
        student3.viewProfile();
        student3.logout();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 20.0d + "'", double15 == 20.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test16042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16042");
        model.Student student3 = new model.Student("hi!", "student", "student");
        java.lang.String str4 = student3.getID();
        student3.setVerified(true);
        student3.setVerified(true);
        boolean boolean9 = student3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "student" + "'", str4, "student");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test16043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16043");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        student3.setVerified(false);
        java.lang.String str10 = student3.getID();
        double double11 = student3.getHourlyRate();
        java.lang.String str12 = student3.getPassword();
        student3.login("hi!", "hi!");
        java.lang.String str16 = student3.getID();
        student3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test16044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16044");
        model.Student student3 = new model.Student("", "hi!", "hi!");
        student3.login("student", "student");
        java.lang.String str7 = student3.getID();
        java.lang.String str8 = student3.getPassword();
        student3.setVerified(false);
        java.lang.String str11 = student3.getAccountType();
        java.lang.String str12 = student3.getPassword();
        java.lang.String str13 = student3.getID();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "student" + "'", str11, "student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test16045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16045");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        java.lang.String str8 = student3.getPassword();
        java.lang.String str9 = student3.getPassword();
        student3.logout();
        java.lang.String str11 = student3.getAccountType();
        student3.viewProfile();
        java.lang.String str13 = student3.getAccountType();
        java.lang.String str14 = student3.getID();
        java.lang.Class<?> wildcardClass15 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "student" + "'", str11, "student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "student" + "'", str13, "student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test16046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16046");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        student3.logout();
        java.lang.String str5 = student3.getAccountType();
        student3.viewProfile();
        boolean boolean7 = student3.isVerified();
        java.lang.String str8 = student3.getPassword();
        java.lang.String str9 = student3.getAccountType();
        java.lang.String str10 = student3.getEmail();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "student" + "'", str9, "student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test16047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16047");
        model.Student student3 = new model.Student("hi!", "hi!", "");
        java.lang.String str4 = student3.getEmail();
        student3.logout();
        student3.setVerified(false);
        java.lang.String str8 = student3.getID();
        boolean boolean9 = student3.isVerified();
        student3.login("", "hi!");
        student3.login("", "hi!");
        student3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test16048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16048");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.viewProfile();
        student3.viewProfile();
        student3.logout();
        student3.viewProfile();
        double double11 = student3.getHourlyRate();
        java.lang.String str12 = student3.getID();
        java.lang.String str13 = student3.getID();
        student3.login("", "hi!");
        double double17 = student3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 20.0d + "'", double17 == 20.0d);
    }

    @Test
    public void test16049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16049");
        model.Student student3 = new model.Student("", "student", "");
        student3.setVerified(true);
        student3.login("", "hi!");
        student3.viewProfile();
        java.lang.String str10 = student3.getID();
        student3.viewProfile();
        double double12 = student3.getHourlyRate();
        boolean boolean13 = student3.isVerified();
        boolean boolean14 = student3.isVerified();
        java.lang.String str15 = student3.getEmail();
        java.lang.String str16 = student3.getPassword();
        double double17 = student3.getHourlyRate();
        java.lang.String str18 = student3.getAccountType();
        student3.login("hi!", "student");
        boolean boolean22 = student3.isVerified();
        student3.login("", "hi!");
        boolean boolean26 = student3.isVerified();
        student3.logout();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 20.0d + "'", double12 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "student" + "'", str16, "student");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 20.0d + "'", double17 == 20.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "student" + "'", str18, "student");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test16050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16050");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        java.lang.String str8 = student3.getPassword();
        student3.setVerified(false);
        java.lang.String str11 = student3.getEmail();
        student3.logout();
        java.lang.String str13 = student3.getEmail();
        java.lang.String str14 = student3.getID();
        java.lang.Class<?> wildcardClass15 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test16051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16051");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        student3.logout();
        student3.login("hi!", "hi!");
        double double8 = student3.getHourlyRate();
        java.lang.String str9 = student3.getID();
        student3.logout();
        java.lang.String str11 = student3.getID();
        student3.viewProfile();
        student3.logout();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test16052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16052");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        boolean boolean7 = student3.isVerified();
        student3.login("", "hi!");
        java.lang.String str11 = student3.getEmail();
        student3.viewProfile();
        student3.viewProfile();
        java.lang.String str14 = student3.getID();
        double double15 = student3.getHourlyRate();
        student3.viewProfile();
        student3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 20.0d + "'", double15 == 20.0d);
    }

    @Test
    public void test16053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16053");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        java.lang.String str8 = student3.getEmail();
        java.lang.String str9 = student3.getID();
        student3.logout();
        student3.logout();
        java.lang.Class<?> wildcardClass12 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test16054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16054");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.viewProfile();
        boolean boolean8 = student3.isVerified();
        java.lang.String str9 = student3.getEmail();
        java.lang.String str10 = student3.getPassword();
        java.lang.String str11 = student3.getPassword();
        student3.setVerified(true);
        java.lang.String str14 = student3.getPassword();
        student3.viewProfile();
        java.lang.String str16 = student3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test16055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16055");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        student3.setVerified(false);
        student3.logout();
        java.lang.String str11 = student3.getID();
        java.lang.Class<?> wildcardClass12 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test16056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16056");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        java.lang.String str8 = student3.getPassword();
        java.lang.String str9 = student3.getPassword();
        student3.logout();
        java.lang.String str11 = student3.getAccountType();
        student3.logout();
        student3.login("", "hi!");
        boolean boolean16 = student3.isVerified();
        student3.logout();
        student3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "student" + "'", str11, "student");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test16057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16057");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        java.lang.String str7 = student3.getID();
        double double8 = student3.getHourlyRate();
        java.lang.String str9 = student3.getID();
        boolean boolean10 = student3.isVerified();
        student3.setVerified(false);
        double double13 = student3.getHourlyRate();
        double double14 = student3.getHourlyRate();
        java.lang.String str15 = student3.getID();
        boolean boolean16 = student3.isVerified();
        java.lang.Class<?> wildcardClass17 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 20.0d + "'", double13 == 20.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 20.0d + "'", double14 == 20.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test16058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16058");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        student3.setVerified(false);
        java.lang.String str10 = student3.getAccountType();
        java.lang.String str11 = student3.getEmail();
        student3.logout();
        student3.setVerified(false);
        student3.login("", "");
        student3.login("student", "");
        student3.setVerified(false);
        java.lang.String str23 = student3.getAccountType();
        student3.setVerified(true);
        double double26 = student3.getHourlyRate();
        double double27 = student3.getHourlyRate();
        student3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "student" + "'", str10, "student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "student" + "'", str23, "student");
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 20.0d + "'", double26 == 20.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 20.0d + "'", double27 == 20.0d);
    }

    @Test
    public void test16059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16059");
        model.Student student3 = new model.Student("hi!", "hi!", "");
        student3.logout();
        java.lang.String str5 = student3.getEmail();
        student3.logout();
        java.lang.String str7 = student3.getEmail();
        boolean boolean8 = student3.isVerified();
        student3.setVerified(false);
        java.lang.String str11 = student3.getEmail();
        java.lang.String str12 = student3.getPassword();
        double double13 = student3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 20.0d + "'", double13 == 20.0d);
    }

    @Test
    public void test16060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16060");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        student3.setVerified(false);
        student3.viewProfile();
        java.lang.String str7 = student3.getEmail();
        java.lang.String str8 = student3.getID();
        student3.login("hi!", "student");
        student3.setVerified(true);
        student3.viewProfile();
        double double15 = student3.getHourlyRate();
        java.lang.String str16 = student3.getEmail();
        java.lang.String str17 = student3.getEmail();
        student3.logout();
        java.lang.String str19 = student3.getID();
        student3.setVerified(true);
        java.lang.String str22 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 20.0d + "'", double15 == 20.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "student" + "'", str22, "student");
    }

    @Test
    public void test16061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16061");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        java.lang.String str8 = student3.getPassword();
        student3.setVerified(false);
        student3.logout();
        student3.viewProfile();
        java.lang.String str13 = student3.getAccountType();
        student3.viewProfile();
        boolean boolean15 = student3.isVerified();
        student3.login("", "hi!");
        java.lang.String str19 = student3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "student" + "'", str13, "student");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test16062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16062");
        model.Student student3 = new model.Student("", "", "hi!");
        student3.logout();
        java.lang.String str5 = student3.getID();
        java.lang.String str6 = student3.getEmail();
        student3.viewProfile();
        student3.login("hi!", "student");
        boolean boolean11 = student3.isVerified();
        java.lang.String str12 = student3.getEmail();
        java.lang.Class<?> wildcardClass13 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test16063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16063");
        model.Student student3 = new model.Student("student", "hi!", "hi!");
        java.lang.String str4 = student3.getAccountType();
        java.lang.String str5 = student3.getEmail();
        student3.setVerified(false);
        student3.login("hi!", "");
        student3.setVerified(true);
        student3.login("hi!", "");
        student3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "student" + "'", str4, "student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
    }

    @Test
    public void test16064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16064");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        student3.setVerified(false);
        java.lang.String str6 = student3.getEmail();
        java.lang.String str7 = student3.getAccountType();
        java.lang.String str8 = student3.getAccountType();
        java.lang.String str9 = student3.getPassword();
        student3.logout();
        boolean boolean11 = student3.isVerified();
        student3.login("student", "");
        student3.viewProfile();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test16065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16065");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        double double6 = student3.getHourlyRate();
        student3.logout();
        student3.viewProfile();
        java.lang.String str9 = student3.getEmail();
        java.lang.String str10 = student3.getEmail();
        java.lang.String str11 = student3.getAccountType();
        java.lang.String str12 = student3.getEmail();
        boolean boolean13 = student3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "student" + "'", str11, "student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test16066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16066");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        student3.setVerified(false);
        java.lang.String str10 = student3.getID();
        double double11 = student3.getHourlyRate();
        java.lang.String str12 = student3.getPassword();
        student3.login("hi!", "hi!");
        student3.setVerified(true);
        double double18 = student3.getHourlyRate();
        boolean boolean19 = student3.isVerified();
        student3.setVerified(true);
        java.lang.String str22 = student3.getPassword();
        double double23 = student3.getHourlyRate();
        student3.logout();
        java.lang.String str25 = student3.getAccountType();
        java.lang.String str26 = student3.getAccountType();
        java.lang.String str27 = student3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 20.0d + "'", double18 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 20.0d + "'", double23 == 20.0d);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "student" + "'", str25, "student");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "student" + "'", str26, "student");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test16067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16067");
        model.Student student3 = new model.Student("", "", "hi!");
        student3.logout();
        java.lang.String str5 = student3.getID();
        java.lang.String str6 = student3.getEmail();
        double double7 = student3.getHourlyRate();
        java.lang.String str8 = student3.getPassword();
        student3.login("hi!", "hi!");
        student3.logout();
        student3.viewProfile();
        student3.logout();
        boolean boolean15 = student3.isVerified();
        student3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test16068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16068");
        model.Student student3 = new model.Student("", "student", "");
        student3.login("student", "");
        boolean boolean7 = student3.isVerified();
        java.lang.String str8 = student3.getEmail();
        student3.login("hi!", "");
        java.lang.String str12 = student3.getEmail();
        student3.logout();
        java.lang.String str14 = student3.getPassword();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "student" + "'", str14, "student");
    }

    @Test
    public void test16069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16069");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        student3.logout();
        student3.login("hi!", "hi!");
        double double8 = student3.getHourlyRate();
        java.lang.String str9 = student3.getID();
        java.lang.String str10 = student3.getAccountType();
        student3.viewProfile();
        java.lang.String str12 = student3.getID();
        student3.setVerified(false);
        student3.setVerified(true);
        student3.login("hi!", "hi!");
        student3.logout();
        java.lang.String str21 = student3.getEmail();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "student" + "'", str10, "student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test16070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16070");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        java.lang.String str6 = student3.getPassword();
        java.lang.String str7 = student3.getPassword();
        student3.logout();
        double double9 = student3.getHourlyRate();
        student3.viewProfile();
        java.lang.String str11 = student3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test16071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16071");
        model.Student student3 = new model.Student("student", "hi!", "student");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getEmail();
        student3.logout();
        java.lang.String str7 = student3.getPassword();
        double double8 = student3.getHourlyRate();
        student3.viewProfile();
        java.lang.String str10 = student3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "student" + "'", str4, "student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "student" + "'", str10, "student");
    }

    @Test
    public void test16072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16072");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        java.lang.String str7 = student3.getID();
        student3.setVerified(true);
        java.lang.String str10 = student3.getEmail();
        student3.setVerified(true);
        student3.setVerified(true);
        student3.logout();
        java.lang.String str16 = student3.getAccountType();
        boolean boolean17 = student3.isVerified();
        student3.login("", "student");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "student" + "'", str16, "student");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test16073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16073");
        model.Student student3 = new model.Student("hi!", "hi!", "");
        student3.setVerified(true);
        student3.login("student", "");
        java.lang.String str9 = student3.getAccountType();
        student3.logout();
        boolean boolean11 = student3.isVerified();
        java.lang.String str12 = student3.getPassword();
        student3.logout();
        java.lang.String str14 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "student" + "'", str9, "student");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "student" + "'", str14, "student");
    }

    @Test
    public void test16074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16074");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getEmail();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        student3.login("hi!", "student");
        double double11 = student3.getHourlyRate();
        java.lang.String str12 = student3.getAccountType();
        student3.logout();
        student3.setVerified(true);
        student3.login("hi!", "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "student" + "'", str12, "student");
    }

    @Test
    public void test16075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16075");
        model.Student student3 = new model.Student("", "", "hi!");
        student3.logout();
        java.lang.String str5 = student3.getID();
        java.lang.String str6 = student3.getEmail();
        double double7 = student3.getHourlyRate();
        boolean boolean8 = student3.isVerified();
        boolean boolean9 = student3.isVerified();
        java.lang.String str10 = student3.getPassword();
        student3.setVerified(true);
        double double13 = student3.getHourlyRate();
        java.lang.String str14 = student3.getPassword();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 20.0d + "'", double13 == 20.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test16076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16076");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getAccountType();
        student3.logout();
        java.lang.String str8 = student3.getEmail();
        student3.viewProfile();
        boolean boolean10 = student3.isVerified();
        java.lang.String str11 = student3.getID();
        java.lang.String str12 = student3.getAccountType();
        student3.logout();
        student3.viewProfile();
        student3.login("hi!", "student");
        boolean boolean18 = student3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "student" + "'", str12, "student");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test16077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16077");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getAccountType();
        student3.logout();
        double double8 = student3.getHourlyRate();
        java.lang.String str9 = student3.getEmail();
        java.lang.String str10 = student3.getAccountType();
        student3.setVerified(true);
        student3.login("hi!", "student");
        java.lang.String str16 = student3.getAccountType();
        java.lang.String str17 = student3.getPassword();
        student3.login("", "");
        java.lang.String str21 = student3.getAccountType();
        double double22 = student3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "student" + "'", str10, "student");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "student" + "'", str16, "student");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "student" + "'", str21, "student");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 20.0d + "'", double22 == 20.0d);
    }

    @Test
    public void test16078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16078");
        model.Student student3 = new model.Student("", "", "hi!");
        student3.logout();
        java.lang.String str5 = student3.getID();
        java.lang.String str6 = student3.getEmail();
        double double7 = student3.getHourlyRate();
        boolean boolean8 = student3.isVerified();
        java.lang.String str9 = student3.getID();
        double double10 = student3.getHourlyRate();
        java.lang.String str11 = student3.getEmail();
        java.lang.String str12 = student3.getPassword();
        boolean boolean13 = student3.isVerified();
        boolean boolean14 = student3.isVerified();
        java.lang.String str15 = student3.getPassword();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test16079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16079");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        boolean boolean7 = student3.isVerified();
        student3.logout();
        java.lang.String str9 = student3.getID();
        student3.setVerified(true);
        student3.viewProfile();
        double double13 = student3.getHourlyRate();
        student3.login("", "");
        student3.login("student", "hi!");
        boolean boolean20 = student3.isVerified();
        student3.viewProfile();
        java.lang.String str22 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 20.0d + "'", double13 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "student" + "'", str22, "student");
    }

    @Test
    public void test16080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16080");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        boolean boolean7 = student3.isVerified();
        student3.logout();
        java.lang.String str9 = student3.getID();
        student3.setVerified(true);
        student3.viewProfile();
        double double13 = student3.getHourlyRate();
        student3.login("", "");
        java.lang.String str17 = student3.getEmail();
        java.lang.String str18 = student3.getEmail();
        boolean boolean19 = student3.isVerified();
        double double20 = student3.getHourlyRate();
        student3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 20.0d + "'", double13 == 20.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 20.0d + "'", double20 == 20.0d);
    }

    @Test
    public void test16081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16081");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getAccountType();
        student3.logout();
        java.lang.String str8 = student3.getEmail();
        student3.viewProfile();
        java.lang.String str10 = student3.getID();
        boolean boolean11 = student3.isVerified();
        java.lang.String str12 = student3.getAccountType();
        java.lang.String str13 = student3.getID();
        java.lang.String str14 = student3.getEmail();
        boolean boolean15 = student3.isVerified();
        student3.setVerified(true);
        student3.logout();
        java.lang.String str19 = student3.getAccountType();
        student3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "student" + "'", str12, "student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "student" + "'", str19, "student");
    }

    @Test
    public void test16082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16082");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        boolean boolean7 = student3.isVerified();
        student3.logout();
        java.lang.String str9 = student3.getID();
        student3.setVerified(true);
        student3.viewProfile();
        double double13 = student3.getHourlyRate();
        student3.login("", "");
        student3.viewProfile();
        java.lang.String str18 = student3.getEmail();
        student3.login("hi!", "hi!");
        student3.setVerified(false);
        java.lang.String str24 = student3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 20.0d + "'", double13 == 20.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test16083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16083");
        model.Student student3 = new model.Student("", "", "hi!");
        student3.logout();
        java.lang.String str5 = student3.getID();
        java.lang.String str6 = student3.getEmail();
        java.lang.String str7 = student3.getPassword();
        java.lang.String str8 = student3.getID();
        student3.logout();
        student3.logout();
        student3.viewProfile();
        java.lang.String str12 = student3.getID();
        java.lang.String str13 = student3.getID();
        double double14 = student3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 20.0d + "'", double14 == 20.0d);
    }

    @Test
    public void test16084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16084");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        student3.setVerified(false);
        java.lang.String str10 = student3.getID();
        student3.viewProfile();
        java.lang.String str12 = student3.getID();
        java.lang.String str13 = student3.getAccountType();
        java.lang.String str14 = student3.getID();
        student3.login("", "student");
        java.lang.String str18 = student3.getEmail();
        student3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "student" + "'", str13, "student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test16085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16085");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getEmail();
        student3.viewProfile();
        java.lang.String str7 = student3.getPassword();
        student3.login("hi!", "student");
        double double11 = student3.getHourlyRate();
        java.lang.String str12 = student3.getID();
        double double13 = student3.getHourlyRate();
        java.lang.Class<?> wildcardClass14 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 20.0d + "'", double13 == 20.0d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test16086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16086");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        boolean boolean7 = student3.isVerified();
        student3.logout();
        student3.logout();
        double double10 = student3.getHourlyRate();
        student3.setVerified(true);
        boolean boolean13 = student3.isVerified();
        double double14 = student3.getHourlyRate();
        student3.logout();
        java.lang.String str16 = student3.getEmail();
        java.lang.String str17 = student3.getID();
        java.lang.String str18 = student3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 20.0d + "'", double14 == 20.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test16087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16087");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        java.lang.String str4 = student3.getAccountType();
        java.lang.String str5 = student3.getID();
        student3.login("", "student");
        double double9 = student3.getHourlyRate();
        student3.login("hi!", "");
        java.lang.String str13 = student3.getPassword();
        student3.logout();
        java.lang.String str15 = student3.getAccountType();
        java.lang.String str16 = student3.getPassword();
        java.lang.String str17 = student3.getID();
        java.lang.String str18 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "student" + "'", str4, "student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "student" + "'", str15, "student");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "student" + "'", str18, "student");
    }

    @Test
    public void test16088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16088");
        model.Student student3 = new model.Student("hi!", "hi!", "");
        java.lang.String str4 = student3.getEmail();
        java.lang.String str5 = student3.getID();
        student3.setVerified(false);
        java.lang.String str8 = student3.getPassword();
        java.lang.String str9 = student3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test16089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16089");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        student3.setVerified(false);
        java.lang.String str9 = student3.getID();
        student3.setVerified(false);
        student3.logout();
        student3.setVerified(false);
        java.lang.String str15 = student3.getEmail();
        student3.viewProfile();
        java.lang.String str17 = student3.getEmail();
        java.lang.String str18 = student3.getPassword();
        student3.setVerified(false);
        student3.viewProfile();
        java.lang.String str22 = student3.getEmail();
        student3.login("", "");
        student3.login("hi!", "student");
        boolean boolean29 = student3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test16090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16090");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        student3.setVerified(false);
        java.lang.String str10 = student3.getID();
        student3.viewProfile();
        java.lang.String str12 = student3.getID();
        student3.setVerified(false);
        java.lang.String str15 = student3.getID();
        boolean boolean16 = student3.isVerified();
        double double17 = student3.getHourlyRate();
        java.lang.String str18 = student3.getAccountType();
        java.lang.String str19 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 20.0d + "'", double17 == 20.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "student" + "'", str18, "student");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "student" + "'", str19, "student");
    }

    @Test
    public void test16091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16091");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        double double6 = student3.getHourlyRate();
        student3.logout();
        student3.viewProfile();
        java.lang.String str9 = student3.getEmail();
        boolean boolean10 = student3.isVerified();
        java.lang.String str11 = student3.getPassword();
        double double12 = student3.getHourlyRate();
        student3.logout();
        student3.setVerified(false);
        java.lang.String str16 = student3.getEmail();
        student3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 20.0d + "'", double12 == 20.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test16092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16092");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        java.lang.String str7 = student3.getID();
        student3.setVerified(true);
        java.lang.String str10 = student3.getEmail();
        student3.setVerified(false);
        student3.logout();
        double double14 = student3.getHourlyRate();
        boolean boolean15 = student3.isVerified();
        java.lang.String str16 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 20.0d + "'", double14 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "student" + "'", str16, "student");
    }

    @Test
    public void test16093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16093");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        student3.setVerified(false);
        java.lang.String str9 = student3.getID();
        student3.setVerified(false);
        student3.logout();
        java.lang.String str13 = student3.getAccountType();
        java.lang.String str14 = student3.getAccountType();
        student3.viewProfile();
        java.lang.String str16 = student3.getID();
        java.lang.String str17 = student3.getAccountType();
        student3.setVerified(true);
        java.lang.Class<?> wildcardClass20 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "student" + "'", str13, "student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "student" + "'", str14, "student");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "student" + "'", str17, "student");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test16094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16094");
        model.Student student3 = new model.Student("", "hi!", "hi!");
        student3.login("student", "student");
        java.lang.String str7 = student3.getID();
        java.lang.String str8 = student3.getPassword();
        student3.setVerified(false);
        java.lang.String str11 = student3.getAccountType();
        java.lang.String str12 = student3.getID();
        java.lang.String str13 = student3.getAccountType();
        java.lang.String str14 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "student" + "'", str11, "student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "student" + "'", str13, "student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "student" + "'", str14, "student");
    }

    @Test
    public void test16095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16095");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        java.lang.String str7 = student3.getID();
        student3.setVerified(true);
        java.lang.String str10 = student3.getAccountType();
        java.lang.String str11 = student3.getPassword();
        student3.login("", "");
        double double15 = student3.getHourlyRate();
        boolean boolean16 = student3.isVerified();
        student3.logout();
        java.lang.String str18 = student3.getPassword();
        student3.setVerified(false);
        double double21 = student3.getHourlyRate();
        student3.setVerified(false);
        java.lang.String str24 = student3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "student" + "'", str10, "student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 20.0d + "'", double15 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 20.0d + "'", double21 == 20.0d);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test16096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16096");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getAccountType();
        student3.logout();
        boolean boolean8 = student3.isVerified();
        student3.logout();
        double double10 = student3.getHourlyRate();
        student3.logout();
        student3.logout();
        student3.logout();
        student3.setVerified(false);
        java.lang.String str16 = student3.getAccountType();
        double double17 = student3.getHourlyRate();
        java.lang.String str18 = student3.getAccountType();
        java.lang.String str19 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "student" + "'", str16, "student");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 20.0d + "'", double17 == 20.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "student" + "'", str18, "student");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "student" + "'", str19, "student");
    }

    @Test
    public void test16097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16097");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        student3.logout();
        student3.login("hi!", "hi!");
        double double8 = student3.getHourlyRate();
        java.lang.String str9 = student3.getID();
        java.lang.String str10 = student3.getAccountType();
        student3.viewProfile();
        java.lang.String str12 = student3.getID();
        student3.setVerified(false);
        student3.setVerified(false);
        student3.setVerified(false);
        student3.logout();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "student" + "'", str10, "student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test16098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16098");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.viewProfile();
        java.lang.String str8 = student3.getAccountType();
        java.lang.String str9 = student3.getID();
        double double10 = student3.getHourlyRate();
        student3.setVerified(true);
        java.lang.String str13 = student3.getPassword();
        student3.viewProfile();
        java.lang.String str15 = student3.getPassword();
        student3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test16099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16099");
        model.Student student3 = new model.Student("", "", "hi!");
        student3.logout();
        java.lang.String str5 = student3.getID();
        java.lang.String str6 = student3.getEmail();
        java.lang.String str7 = student3.getEmail();
        java.lang.String str8 = student3.getEmail();
        java.lang.String str9 = student3.getID();
        java.lang.String str10 = student3.getPassword();
        student3.setVerified(false);
        boolean boolean13 = student3.isVerified();
        student3.logout();
        java.lang.String str15 = student3.getAccountType();
        java.lang.String str16 = student3.getID();
        java.lang.String str17 = student3.getEmail();
        student3.login("student", "student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "student" + "'", str15, "student");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test16100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16100");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getAccountType();
        student3.logout();
        java.lang.String str8 = student3.getEmail();
        student3.viewProfile();
        java.lang.String str10 = student3.getID();
        java.lang.String str11 = student3.getPassword();
        boolean boolean12 = student3.isVerified();
        java.lang.String str13 = student3.getEmail();
        java.lang.String str14 = student3.getAccountType();
        student3.viewProfile();
        boolean boolean16 = student3.isVerified();
        double double17 = student3.getHourlyRate();
        double double18 = student3.getHourlyRate();
        java.lang.String str19 = student3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "student" + "'", str14, "student");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 20.0d + "'", double17 == 20.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 20.0d + "'", double18 == 20.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test16101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16101");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        student3.setVerified(false);
        java.lang.String str10 = student3.getEmail();
        double double11 = student3.getHourlyRate();
        java.lang.String str12 = student3.getEmail();
        double double13 = student3.getHourlyRate();
        student3.login("", "student");
        student3.logout();
        student3.logout();
        student3.setVerified(true);
        java.lang.String str21 = student3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 20.0d + "'", double13 == 20.0d);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test16102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16102");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        java.lang.String str6 = student3.getPassword();
        student3.setVerified(false);
        student3.setVerified(false);
        student3.viewProfile();
        student3.login("student", "");
        student3.logout();
        java.lang.String str16 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "student" + "'", str16, "student");
    }

    @Test
    public void test16103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16103");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.viewProfile();
        java.lang.String str8 = student3.getAccountType();
        student3.logout();
        student3.logout();
        student3.viewProfile();
        student3.login("", "student");
        student3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
    }

    @Test
    public void test16104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16104");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        student3.logout();
        student3.login("hi!", "hi!");
        double double8 = student3.getHourlyRate();
        boolean boolean9 = student3.isVerified();
        boolean boolean10 = student3.isVerified();
        boolean boolean11 = student3.isVerified();
        boolean boolean12 = student3.isVerified();
        student3.logout();
        student3.logout();
        java.lang.String str15 = student3.getAccountType();
        student3.viewProfile();
        boolean boolean17 = student3.isVerified();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "student" + "'", str15, "student");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test16105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16105");
        model.Student student3 = new model.Student("hi!", "student", "");
        java.lang.String str4 = student3.getEmail();
        double double5 = student3.getHourlyRate();
        java.lang.String str6 = student3.getEmail();
        java.lang.String str7 = student3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test16106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16106");
        model.Student student3 = new model.Student("hi!", "hi!", "");
        student3.logout();
        java.lang.String str5 = student3.getEmail();
        java.lang.String str6 = student3.getAccountType();
        java.lang.String str7 = student3.getPassword();
        student3.viewProfile();
        student3.logout();
        student3.viewProfile();
        boolean boolean11 = student3.isVerified();
        java.lang.Class<?> wildcardClass12 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test16107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16107");
        model.Student student3 = new model.Student("", "", "hi!");
        student3.login("", "");
        student3.viewProfile();
        student3.viewProfile();
        student3.login("", "");
        double double12 = student3.getHourlyRate();
        java.lang.String str13 = student3.getPassword();
        student3.login("hi!", "student");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 20.0d + "'", double12 == 20.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test16108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16108");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getAccountType();
        student3.logout();
        java.lang.String str8 = student3.getEmail();
        student3.viewProfile();
        java.lang.String str10 = student3.getID();
        boolean boolean11 = student3.isVerified();
        java.lang.String str12 = student3.getAccountType();
        java.lang.String str13 = student3.getEmail();
        java.lang.String str14 = student3.getEmail();
        boolean boolean15 = student3.isVerified();
        boolean boolean16 = student3.isVerified();
        double double17 = student3.getHourlyRate();
        boolean boolean18 = student3.isVerified();
        student3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "student" + "'", str12, "student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 20.0d + "'", double17 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test16109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16109");
        model.Student student3 = new model.Student("hi!", "", "student");
        java.lang.String str4 = student3.getPassword();
        student3.viewProfile();
        java.lang.Class<?> wildcardClass6 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test16110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16110");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        double double6 = student3.getHourlyRate();
        java.lang.String str7 = student3.getID();
        boolean boolean8 = student3.isVerified();
        student3.setVerified(true);
        java.lang.String str11 = student3.getEmail();
        double double12 = student3.getHourlyRate();
        student3.login("student", "student");
        java.lang.String str16 = student3.getID();
        boolean boolean17 = student3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 20.0d + "'", double12 == 20.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test16111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16111");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        student3.setVerified(false);
        double double7 = student3.getHourlyRate();
        student3.setVerified(false);
        student3.login("student", "hi!");
        java.lang.String str13 = student3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test16112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16112");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        student3.setVerified(false);
        java.lang.String str6 = student3.getPassword();
        java.lang.String str7 = student3.getAccountType();
        java.lang.String str8 = student3.getEmail();
        student3.setVerified(true);
        boolean boolean11 = student3.isVerified();
        student3.login("hi!", "");
        java.lang.String str15 = student3.getPassword();
        java.lang.String str16 = student3.getPassword();
        boolean boolean17 = student3.isVerified();
        double double18 = student3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 20.0d + "'", double18 == 20.0d);
    }

    @Test
    public void test16113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16113");
        model.Student student3 = new model.Student("", "student", "student");
        student3.setVerified(true);
        java.lang.String str6 = student3.getPassword();
        boolean boolean7 = student3.isVerified();
        java.lang.String str8 = student3.getEmail();
        student3.logout();
        boolean boolean10 = student3.isVerified();
        java.lang.String str11 = student3.getID();
        java.lang.String str12 = student3.getID();
        java.lang.String str13 = student3.getPassword();
        java.lang.Class<?> wildcardClass14 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "student" + "'", str11, "student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "student" + "'", str12, "student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "student" + "'", str13, "student");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test16114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16114");
        model.Student student3 = new model.Student("", "", "hi!");
        student3.logout();
        java.lang.String str5 = student3.getID();
        java.lang.String str6 = student3.getEmail();
        double double7 = student3.getHourlyRate();
        java.lang.String str8 = student3.getPassword();
        student3.login("hi!", "hi!");
        student3.logout();
        student3.viewProfile();
        student3.logout();
        java.lang.String str15 = student3.getAccountType();
        student3.login("", "hi!");
        double double19 = student3.getHourlyRate();
        boolean boolean20 = student3.isVerified();
        student3.logout();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "student" + "'", str15, "student");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 20.0d + "'", double19 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test16115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16115");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        boolean boolean7 = student3.isVerified();
        student3.logout();
        java.lang.String str9 = student3.getID();
        student3.login("hi!", "");
        java.lang.String str13 = student3.getID();
        java.lang.String str14 = student3.getID();
        java.lang.String str15 = student3.getAccountType();
        double double16 = student3.getHourlyRate();
        java.lang.String str17 = student3.getAccountType();
        java.lang.String str18 = student3.getEmail();
        student3.setVerified(false);
        java.lang.Class<?> wildcardClass21 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "student" + "'", str15, "student");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 20.0d + "'", double16 == 20.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "student" + "'", str17, "student");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test16116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16116");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        double double6 = student3.getHourlyRate();
        java.lang.String str7 = student3.getPassword();
        java.lang.String str8 = student3.getPassword();
        student3.login("student", "hi!");
        student3.login("hi!", "");
        student3.login("hi!", "hi!");
        student3.login("", "hi!");
        student3.setVerified(true);
        java.lang.String str23 = student3.getEmail();
        student3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test16117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16117");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        student3.logout();
        student3.login("hi!", "hi!");
        double double8 = student3.getHourlyRate();
        java.lang.String str9 = student3.getID();
        java.lang.String str10 = student3.getAccountType();
        student3.setVerified(true);
        student3.login("hi!", "hi!");
        java.lang.String str16 = student3.getPassword();
        java.lang.String str17 = student3.getID();
        student3.login("", "student");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "student" + "'", str10, "student");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test16118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16118");
        model.Student student3 = new model.Student("", "", "hi!");
        student3.login("", "");
        double double7 = student3.getHourlyRate();
        student3.login("student", "student");
        java.lang.String str11 = student3.getID();
        java.lang.String str12 = student3.getAccountType();
        boolean boolean13 = student3.isVerified();
        java.lang.String str14 = student3.getID();
        java.lang.String str15 = student3.getID();
        java.lang.String str16 = student3.getPassword();
        boolean boolean17 = student3.isVerified();
        java.lang.String str18 = student3.getPassword();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "student" + "'", str12, "student");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test16119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16119");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getAccountType();
        java.lang.String str7 = student3.getAccountType();
        java.lang.String str8 = student3.getPassword();
        student3.setVerified(false);
        java.lang.String str11 = student3.getAccountType();
        java.lang.String str12 = student3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "student" + "'", str11, "student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test16120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16120");
        model.Student student3 = new model.Student("hi!", "student", "");
        java.lang.String str4 = student3.getEmail();
        student3.viewProfile();
        student3.logout();
        student3.viewProfile();
        double double8 = student3.getHourlyRate();
        java.lang.String str9 = student3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test16121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16121");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        student3.setVerified(false);
        java.lang.String str9 = student3.getID();
        java.lang.String str10 = student3.getEmail();
        java.lang.String str11 = student3.getEmail();
        student3.login("", "student");
        student3.login("student", "hi!");
        java.lang.String str18 = student3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test16122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16122");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        student3.logout();
        student3.login("hi!", "hi!");
        double double8 = student3.getHourlyRate();
        boolean boolean9 = student3.isVerified();
        java.lang.String str10 = student3.getAccountType();
        java.lang.String str11 = student3.getAccountType();
        double double12 = student3.getHourlyRate();
        double double13 = student3.getHourlyRate();
        student3.login("hi!", "");
        boolean boolean17 = student3.isVerified();
        java.lang.String str18 = student3.getID();
        student3.login("hi!", "hi!");
        student3.login("student", "student");
        java.lang.String str25 = student3.getAccountType();
        student3.setVerified(false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "student" + "'", str10, "student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "student" + "'", str11, "student");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 20.0d + "'", double12 == 20.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 20.0d + "'", double13 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "student" + "'", str25, "student");
    }

    @Test
    public void test16123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16123");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        boolean boolean7 = student3.isVerified();
        student3.logout();
        java.lang.String str9 = student3.getID();
        student3.login("hi!", "");
        java.lang.String str13 = student3.getID();
        java.lang.String str14 = student3.getPassword();
        java.lang.String str15 = student3.getID();
        student3.setVerified(false);
        student3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test16124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16124");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        java.lang.String str7 = student3.getID();
        student3.setVerified(true);
        java.lang.String str10 = student3.getEmail();
        student3.setVerified(true);
        java.lang.String str13 = student3.getAccountType();
        student3.viewProfile();
        student3.login("", "");
        double double18 = student3.getHourlyRate();
        student3.login("hi!", "");
        student3.login("", "hi!");
        student3.setVerified(false);
        java.lang.String str27 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "student" + "'", str13, "student");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 20.0d + "'", double18 == 20.0d);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "student" + "'", str27, "student");
    }

    @Test
    public void test16125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16125");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getAccountType();
        student3.logout();
        java.lang.String str8 = student3.getAccountType();
        double double9 = student3.getHourlyRate();
        student3.logout();
        java.lang.String str11 = student3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test16126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16126");
        model.Student student3 = new model.Student("", "student", "");
        student3.setVerified(true);
        student3.login("", "hi!");
        student3.viewProfile();
        student3.login("", "hi!");
        boolean boolean13 = student3.isVerified();
        student3.viewProfile();
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test16127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16127");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        java.lang.String str4 = student3.getAccountType();
        java.lang.String str5 = student3.getID();
        student3.setVerified(true);
        student3.login("student", "student");
        double double11 = student3.getHourlyRate();
        student3.viewProfile();
        java.lang.String str13 = student3.getID();
        student3.viewProfile();
        student3.logout();
        boolean boolean16 = student3.isVerified();
        java.lang.String str17 = student3.getID();
        student3.logout();
        student3.logout();
        double double20 = student3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "student" + "'", str4, "student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 20.0d + "'", double20 == 20.0d);
    }

    @Test
    public void test16128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16128");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        student3.setVerified(false);
        java.lang.String str6 = student3.getEmail();
        java.lang.String str7 = student3.getAccountType();
        java.lang.String str8 = student3.getID();
        student3.logout();
        java.lang.String str10 = student3.getPassword();
        java.lang.String str11 = student3.getID();
        java.lang.String str12 = student3.getEmail();
        java.lang.String str13 = student3.getID();
        java.lang.String str14 = student3.getPassword();
        boolean boolean15 = student3.isVerified();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test16129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16129");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getAccountType();
        student3.logout();
        java.lang.String str8 = student3.getEmail();
        student3.viewProfile();
        boolean boolean10 = student3.isVerified();
        student3.viewProfile();
        student3.logout();
        java.lang.String str13 = student3.getPassword();
        student3.viewProfile();
        java.lang.String str15 = student3.getAccountType();
        java.lang.String str16 = student3.getID();
        boolean boolean17 = student3.isVerified();
        student3.logout();
        double double19 = student3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "student" + "'", str15, "student");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 20.0d + "'", double19 == 20.0d);
    }

    @Test
    public void test16130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16130");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        java.lang.String str7 = student3.getID();
        student3.login("hi!", "");
        java.lang.String str11 = student3.getEmail();
        student3.setVerified(false);
        student3.login("", "student");
        java.lang.String str17 = student3.getAccountType();
        double double18 = student3.getHourlyRate();
        java.lang.String str19 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "student" + "'", str17, "student");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 20.0d + "'", double18 == 20.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "student" + "'", str19, "student");
    }

    @Test
    public void test16131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16131");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        student3.setVerified(false);
        student3.viewProfile();
        java.lang.String str7 = student3.getEmail();
        java.lang.String str8 = student3.getID();
        student3.viewProfile();
        student3.login("hi!", "hi!");
        java.lang.String str13 = student3.getPassword();
        java.lang.String str14 = student3.getPassword();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test16132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16132");
        model.Student student3 = new model.Student("", "", "hi!");
        student3.logout();
        java.lang.String str5 = student3.getID();
        java.lang.String str6 = student3.getEmail();
        student3.viewProfile();
        student3.logout();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test16133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16133");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        java.lang.String str7 = student3.getID();
        java.lang.String str8 = student3.getEmail();
        student3.login("", "");
        boolean boolean12 = student3.isVerified();
        boolean boolean13 = student3.isVerified();
        student3.logout();
        student3.viewProfile();
        student3.viewProfile();
        student3.logout();
        student3.setVerified(false);
        student3.login("", "");
        boolean boolean23 = student3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test16134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16134");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.viewProfile();
        boolean boolean8 = student3.isVerified();
        java.lang.String str9 = student3.getEmail();
        student3.setVerified(true);
        boolean boolean12 = student3.isVerified();
        student3.logout();
        student3.logout();
        student3.setVerified(true);
        java.lang.String str17 = student3.getPassword();
        student3.login("student", "hi!");
        student3.viewProfile();
        java.lang.String str22 = student3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test16135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16135");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        student3.setVerified(false);
        java.lang.String str10 = student3.getID();
        double double11 = student3.getHourlyRate();
        student3.viewProfile();
        student3.login("hi!", "student");
        student3.viewProfile();
        student3.viewProfile();
        java.lang.String str18 = student3.getPassword();
        java.lang.String str19 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "student" + "'", str19, "student");
    }

    @Test
    public void test16136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16136");
        model.Student student3 = new model.Student("hi!", "hi!", "");
        student3.logout();
        student3.setVerified(true);
        double double7 = student3.getHourlyRate();
        student3.setVerified(false);
        boolean boolean10 = student3.isVerified();
        boolean boolean11 = student3.isVerified();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test16137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16137");
        model.Student student3 = new model.Student("", "", "hi!");
        student3.logout();
        java.lang.String str5 = student3.getID();
        java.lang.String str6 = student3.getEmail();
        double double7 = student3.getHourlyRate();
        java.lang.String str8 = student3.getPassword();
        student3.login("hi!", "hi!");
        boolean boolean12 = student3.isVerified();
        student3.logout();
        java.lang.String str14 = student3.getPassword();
        student3.setVerified(true);
        student3.logout();
        student3.viewProfile();
        student3.viewProfile();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test16138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16138");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        student3.setVerified(false);
        java.lang.String str9 = student3.getID();
        java.lang.String str10 = student3.getAccountType();
        double double11 = student3.getHourlyRate();
        java.lang.String str12 = student3.getPassword();
        student3.login("hi!", "student");
        java.lang.String str16 = student3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "student" + "'", str10, "student");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test16139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16139");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        student3.setVerified(false);
        java.lang.String str9 = student3.getID();
        student3.setVerified(false);
        java.lang.String str12 = student3.getID();
        double double13 = student3.getHourlyRate();
        boolean boolean14 = student3.isVerified();
        student3.logout();
        java.lang.String str16 = student3.getID();
        student3.viewProfile();
        java.lang.String str18 = student3.getEmail();
        java.lang.String str19 = student3.getAccountType();
        java.lang.String str20 = student3.getID();
        double double21 = student3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 20.0d + "'", double13 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "student" + "'", str19, "student");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 20.0d + "'", double21 == 20.0d);
    }

    @Test
    public void test16140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16140");
        model.Student student3 = new model.Student("", "hi!", "hi!");
        java.lang.String str4 = student3.getID();
        student3.login("student", "hi!");
        java.lang.String str8 = student3.getID();
        java.lang.String str9 = student3.getPassword();
        boolean boolean10 = student3.isVerified();
        student3.login("student", "");
        java.lang.Class<?> wildcardClass14 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test16141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16141");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getAccountType();
        student3.logout();
        java.lang.String str8 = student3.getEmail();
        student3.viewProfile();
        java.lang.String str10 = student3.getID();
        student3.logout();
        student3.login("student", "");
        java.lang.String str15 = student3.getAccountType();
        java.lang.String str16 = student3.getEmail();
        java.lang.String str17 = student3.getAccountType();
        java.lang.String str18 = student3.getEmail();
        student3.logout();
        student3.logout();
        student3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "student" + "'", str15, "student");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "student" + "'", str17, "student");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test16142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16142");
        model.Student student3 = new model.Student("hi!", "student", "");
        java.lang.String str4 = student3.getEmail();
        student3.logout();
        java.lang.String str6 = student3.getID();
        java.lang.String str7 = student3.getEmail();
        java.lang.String str8 = student3.getID();
        student3.login("hi!", "hi!");
        java.lang.String str12 = student3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test16143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16143");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        student3.setVerified(false);
        java.lang.String str9 = student3.getID();
        java.lang.String str10 = student3.getAccountType();
        java.lang.String str11 = student3.getPassword();
        boolean boolean12 = student3.isVerified();
        double double13 = student3.getHourlyRate();
        java.lang.String str14 = student3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "student" + "'", str10, "student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 20.0d + "'", double13 == 20.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test16144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16144");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        student3.setVerified(false);
        java.lang.String str9 = student3.getID();
        student3.setVerified(false);
        student3.logout();
        java.lang.String str13 = student3.getAccountType();
        java.lang.String str14 = student3.getAccountType();
        java.lang.String str15 = student3.getID();
        java.lang.String str16 = student3.getAccountType();
        student3.viewProfile();
        student3.viewProfile();
        student3.login("student", "");
        java.lang.String str22 = student3.getPassword();
        java.lang.String str23 = student3.getPassword();
        java.lang.String str24 = student3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "student" + "'", str13, "student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "student" + "'", str14, "student");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "student" + "'", str16, "student");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
    }

    @Test
    public void test16145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16145");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        java.lang.String str8 = student3.getEmail();
        java.lang.String str9 = student3.getPassword();
        java.lang.String str10 = student3.getPassword();
        student3.setVerified(false);
        boolean boolean13 = student3.isVerified();
        java.lang.String str14 = student3.getEmail();
        java.lang.String str15 = student3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test16146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16146");
        model.Student student3 = new model.Student("", "", "hi!");
        student3.logout();
        java.lang.String str5 = student3.getID();
        java.lang.String str6 = student3.getEmail();
        java.lang.String str7 = student3.getPassword();
        java.lang.String str8 = student3.getID();
        student3.logout();
        java.lang.String str10 = student3.getPassword();
        java.lang.String str11 = student3.getPassword();
        double double12 = student3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 20.0d + "'", double12 == 20.0d);
    }

    @Test
    public void test16147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16147");
        model.Student student3 = new model.Student("hi!", "student", "");
        java.lang.String str4 = student3.getEmail();
        student3.logout();
        student3.setVerified(true);
        student3.setVerified(false);
        student3.logout();
        student3.viewProfile();
        boolean boolean12 = student3.isVerified();
        java.lang.String str13 = student3.getID();
        student3.setVerified(false);
        java.lang.String str16 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "student" + "'", str16, "student");
    }

    @Test
    public void test16148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16148");
        model.Student student3 = new model.Student("", "", "hi!");
        student3.logout();
        java.lang.String str5 = student3.getID();
        java.lang.String str6 = student3.getEmail();
        java.lang.String str7 = student3.getEmail();
        java.lang.String str8 = student3.getEmail();
        boolean boolean9 = student3.isVerified();
        student3.setVerified(true);
        student3.logout();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test16149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16149");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        student3.logout();
        student3.login("hi!", "hi!");
        student3.viewProfile();
        student3.login("", "student");
        java.lang.String str12 = student3.getPassword();
        student3.setVerified(false);
        student3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test16150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16150");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        java.lang.String str4 = student3.getAccountType();
        java.lang.String str5 = student3.getID();
        student3.setVerified(true);
        boolean boolean8 = student3.isVerified();
        student3.logout();
        student3.setVerified(true);
        student3.login("hi!", "");
        boolean boolean15 = student3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "student" + "'", str4, "student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test16151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16151");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        student3.setVerified(false);
        java.lang.String str10 = student3.getID();
        java.lang.String str11 = student3.getAccountType();
        java.lang.String str12 = student3.getPassword();
        student3.logout();
        student3.setVerified(false);
        double double16 = student3.getHourlyRate();
        student3.setVerified(false);
        java.lang.String str19 = student3.getID();
        student3.setVerified(false);
        java.lang.String str22 = student3.getAccountType();
        student3.setVerified(false);
        java.lang.String str25 = student3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "student" + "'", str11, "student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 20.0d + "'", double16 == 20.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "student" + "'", str22, "student");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test16152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16152");
        model.Student student3 = new model.Student("", "student", "student");
        double double4 = student3.getHourlyRate();
        student3.logout();
        student3.setVerified(false);
        java.lang.String str8 = student3.getEmail();
        student3.setVerified(true);
        boolean boolean11 = student3.isVerified();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test16153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16153");
        model.Student student3 = new model.Student("", "", "hi!");
        student3.logout();
        java.lang.String str5 = student3.getID();
        java.lang.String str6 = student3.getEmail();
        double double7 = student3.getHourlyRate();
        java.lang.String str8 = student3.getEmail();
        java.lang.String str9 = student3.getID();
        boolean boolean10 = student3.isVerified();
        student3.logout();
        student3.login("student", "student");
        java.lang.Class<?> wildcardClass15 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test16154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16154");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        student3.logout();
        student3.login("hi!", "hi!");
        double double8 = student3.getHourlyRate();
        java.lang.String str9 = student3.getID();
        java.lang.String str10 = student3.getAccountType();
        student3.viewProfile();
        boolean boolean12 = student3.isVerified();
        java.lang.String str13 = student3.getEmail();
        student3.login("", "student");
        student3.logout();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "student" + "'", str10, "student");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test16155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16155");
        model.Student student3 = new model.Student("hi!", "student", "");
        java.lang.String str4 = student3.getEmail();
        student3.logout();
        java.lang.String str6 = student3.getID();
        java.lang.String str7 = student3.getID();
        java.lang.String str8 = student3.getAccountType();
        java.lang.String str9 = student3.getAccountType();
        double double10 = student3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "student" + "'", str9, "student");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
    }

    @Test
    public void test16156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16156");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.viewProfile();
        java.lang.String str8 = student3.getAccountType();
        student3.logout();
        student3.logout();
        java.lang.String str11 = student3.getAccountType();
        student3.viewProfile();
        student3.logout();
        student3.login("", "hi!");
        java.lang.String str17 = student3.getPassword();
        java.lang.String str18 = student3.getEmail();
        java.lang.String str19 = student3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "student" + "'", str11, "student");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test16157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16157");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        boolean boolean7 = student3.isVerified();
        student3.logout();
        java.lang.String str9 = student3.getID();
        student3.login("hi!", "");
        java.lang.String str13 = student3.getID();
        java.lang.String str14 = student3.getID();
        java.lang.String str15 = student3.getAccountType();
        java.lang.String str16 = student3.getID();
        java.lang.String str17 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "student" + "'", str15, "student");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "student" + "'", str17, "student");
    }

    @Test
    public void test16158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16158");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        double double6 = student3.getHourlyRate();
        student3.setVerified(true);
        java.lang.String str9 = student3.getID();
        boolean boolean10 = student3.isVerified();
        java.lang.String str11 = student3.getAccountType();
        double double12 = student3.getHourlyRate();
        student3.login("student", "hi!");
        student3.viewProfile();
        student3.logout();
        boolean boolean18 = student3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "student" + "'", str11, "student");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 20.0d + "'", double12 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test16159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16159");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        student3.setVerified(false);
        java.lang.String str6 = student3.getPassword();
        java.lang.String str7 = student3.getAccountType();
        java.lang.String str8 = student3.getEmail();
        java.lang.String str9 = student3.getAccountType();
        java.lang.String str10 = student3.getPassword();
        java.lang.Class<?> wildcardClass11 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "student" + "'", str9, "student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test16160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16160");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        java.lang.String str4 = student3.getAccountType();
        java.lang.String str5 = student3.getID();
        student3.setVerified(true);
        student3.login("student", "student");
        java.lang.String str11 = student3.getAccountType();
        student3.setVerified(false);
        student3.setVerified(false);
        double double16 = student3.getHourlyRate();
        java.lang.String str17 = student3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "student" + "'", str4, "student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "student" + "'", str11, "student");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 20.0d + "'", double16 == 20.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test16161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16161");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        student3.setVerified(false);
        java.lang.String str9 = student3.getID();
        student3.setVerified(false);
        double double12 = student3.getHourlyRate();
        student3.setVerified(false);
        student3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 20.0d + "'", double12 == 20.0d);
    }

    @Test
    public void test16162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16162");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getAccountType();
        student3.logout();
        java.lang.String str8 = student3.getEmail();
        student3.viewProfile();
        java.lang.String str10 = student3.getID();
        java.lang.String str11 = student3.getPassword();
        boolean boolean12 = student3.isVerified();
        java.lang.String str13 = student3.getEmail();
        java.lang.String str14 = student3.getAccountType();
        java.lang.String str15 = student3.getAccountType();
        student3.login("", "hi!");
        java.lang.String str19 = student3.getEmail();
        double double20 = student3.getHourlyRate();
        java.lang.String str21 = student3.getAccountType();
        java.lang.Class<?> wildcardClass22 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "student" + "'", str14, "student");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "student" + "'", str15, "student");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 20.0d + "'", double20 == 20.0d);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "student" + "'", str21, "student");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test16163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16163");
        model.Student student3 = new model.Student("", "", "hi!");
        student3.logout();
        java.lang.String str5 = student3.getID();
        java.lang.String str6 = student3.getEmail();
        double double7 = student3.getHourlyRate();
        boolean boolean8 = student3.isVerified();
        java.lang.String str9 = student3.getPassword();
        java.lang.String str10 = student3.getID();
        student3.login("hi!", "student");
        student3.logout();
        double double15 = student3.getHourlyRate();
        java.lang.String str16 = student3.getID();
        java.lang.String str17 = student3.getPassword();
        student3.setVerified(true);
        java.lang.Class<?> wildcardClass20 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 20.0d + "'", double15 == 20.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test16164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16164");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        student3.logout();
        student3.login("hi!", "hi!");
        student3.viewProfile();
        student3.login("", "student");
        student3.login("", "student");
        student3.viewProfile();
        student3.setVerified(false);
        student3.login("", "student");
    }

    @Test
    public void test16165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16165");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        java.lang.String str8 = student3.getPassword();
        java.lang.String str9 = student3.getPassword();
        student3.logout();
        java.lang.String str11 = student3.getAccountType();
        boolean boolean12 = student3.isVerified();
        java.lang.String str13 = student3.getPassword();
        student3.viewProfile();
        student3.viewProfile();
        student3.logout();
        java.lang.String str17 = student3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "student" + "'", str11, "student");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test16166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16166");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getEmail();
        java.lang.String str6 = student3.getAccountType();
        java.lang.String str7 = student3.getPassword();
        java.lang.String str8 = student3.getID();
        double double9 = student3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
    }

    @Test
    public void test16167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16167");
        model.Student student3 = new model.Student("", "student", "student");
        double double4 = student3.getHourlyRate();
        java.lang.String str5 = student3.getAccountType();
        java.lang.String str6 = student3.getID();
        java.lang.String str7 = student3.getAccountType();
        double double8 = student3.getHourlyRate();
        student3.login("", "");
        student3.setVerified(true);
        student3.logout();
        java.lang.String str15 = student3.getEmail();
        student3.viewProfile();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test16168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16168");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        java.lang.String str7 = student3.getID();
        java.lang.String str8 = student3.getEmail();
        student3.login("", "");
        boolean boolean12 = student3.isVerified();
        boolean boolean13 = student3.isVerified();
        student3.logout();
        java.lang.String str15 = student3.getPassword();
        java.lang.String str16 = student3.getID();
        student3.login("", "student");
        java.lang.String str20 = student3.getPassword();
        double double21 = student3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 20.0d + "'", double21 == 20.0d);
    }

    @Test
    public void test16169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16169");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        java.lang.String str8 = student3.getEmail();
        student3.viewProfile();
        student3.logout();
        double double11 = student3.getHourlyRate();
        double double12 = student3.getHourlyRate();
        java.lang.String str13 = student3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 20.0d + "'", double12 == 20.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test16170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16170");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        student3.setVerified(false);
        java.lang.String str10 = student3.getID();
        student3.viewProfile();
        java.lang.String str12 = student3.getID();
        java.lang.String str13 = student3.getAccountType();
        student3.viewProfile();
        java.lang.String str15 = student3.getPassword();
        java.lang.String str16 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "student" + "'", str13, "student");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "student" + "'", str16, "student");
    }

    @Test
    public void test16171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16171");
        model.Student student3 = new model.Student("hi!", "student", "");
        student3.logout();
        student3.logout();
        student3.logout();
        student3.viewProfile();
        student3.login("hi!", "");
        java.lang.String str11 = student3.getAccountType();
        double double12 = student3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "student" + "'", str11, "student");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 20.0d + "'", double12 == 20.0d);
    }

    @Test
    public void test16172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16172");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getEmail();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        student3.login("hi!", "student");
        java.lang.String str11 = student3.getAccountType();
        java.lang.String str12 = student3.getEmail();
        java.lang.String str13 = student3.getEmail();
        java.lang.String str14 = student3.getEmail();
        java.lang.String str15 = student3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "student" + "'", str11, "student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test16173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16173");
        model.Student student3 = new model.Student("", "", "hi!");
        student3.logout();
        java.lang.String str5 = student3.getID();
        java.lang.String str6 = student3.getEmail();
        java.lang.String str7 = student3.getPassword();
        java.lang.String str8 = student3.getID();
        student3.logout();
        student3.logout();
        double double11 = student3.getHourlyRate();
        java.lang.String str12 = student3.getAccountType();
        student3.logout();
        student3.login("student", "hi!");
        java.lang.String str17 = student3.getID();
        java.lang.String str18 = student3.getPassword();
        java.lang.String str19 = student3.getPassword();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "student" + "'", str12, "student");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test16174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16174");
        model.Student student3 = new model.Student("", "", "hi!");
        student3.logout();
        java.lang.String str5 = student3.getID();
        java.lang.String str6 = student3.getEmail();
        double double7 = student3.getHourlyRate();
        java.lang.String str8 = student3.getPassword();
        student3.login("hi!", "hi!");
        student3.logout();
        student3.viewProfile();
        student3.logout();
        double double15 = student3.getHourlyRate();
        student3.setVerified(true);
        java.lang.String str18 = student3.getEmail();
        java.lang.Class<?> wildcardClass19 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 20.0d + "'", double15 == 20.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test16175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16175");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        student3.setVerified(false);
        student3.viewProfile();
        java.lang.String str7 = student3.getEmail();
        java.lang.String str8 = student3.getAccountType();
        student3.logout();
        boolean boolean10 = student3.isVerified();
        student3.login("", "hi!");
        double double14 = student3.getHourlyRate();
        java.lang.String str15 = student3.getAccountType();
        student3.login("", "student");
        student3.setVerified(false);
        java.lang.String str21 = student3.getEmail();
        java.lang.String str22 = student3.getEmail();
        java.lang.String str23 = student3.getEmail();
        student3.login("hi!", "hi!");
        java.lang.String str27 = student3.getAccountType();
        boolean boolean28 = student3.isVerified();
        student3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 20.0d + "'", double14 == 20.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "student" + "'", str15, "student");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "student" + "'", str27, "student");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test16176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16176");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        java.lang.String str7 = student3.getID();
        student3.login("hi!", "");
        java.lang.String str11 = student3.getPassword();
        boolean boolean12 = student3.isVerified();
        double double13 = student3.getHourlyRate();
        double double14 = student3.getHourlyRate();
        java.lang.String str15 = student3.getPassword();
        java.lang.String str16 = student3.getEmail();
        boolean boolean17 = student3.isVerified();
        java.lang.String str18 = student3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 20.0d + "'", double13 == 20.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 20.0d + "'", double14 == 20.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test16177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16177");
        model.Student student3 = new model.Student("", "", "hi!");
        student3.logout();
        java.lang.String str5 = student3.getID();
        java.lang.String str6 = student3.getPassword();
        student3.logout();
        java.lang.String str8 = student3.getPassword();
        java.lang.String str9 = student3.getPassword();
        student3.setVerified(true);
        student3.login("", "student");
        double double15 = student3.getHourlyRate();
        student3.viewProfile();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 20.0d + "'", double15 == 20.0d);
    }

    @Test
    public void test16178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16178");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        boolean boolean7 = student3.isVerified();
        student3.logout();
        student3.logout();
        student3.viewProfile();
        student3.logout();
        java.lang.String str12 = student3.getAccountType();
        student3.login("hi!", "student");
        student3.viewProfile();
        student3.viewProfile();
        java.lang.String str18 = student3.getAccountType();
        java.lang.String str19 = student3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "student" + "'", str12, "student");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "student" + "'", str18, "student");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test16179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16179");
        model.Student student3 = new model.Student("", "", "hi!");
        student3.logout();
        java.lang.String str5 = student3.getID();
        java.lang.String str6 = student3.getEmail();
        double double7 = student3.getHourlyRate();
        boolean boolean8 = student3.isVerified();
        java.lang.String str9 = student3.getID();
        student3.setVerified(true);
        double double12 = student3.getHourlyRate();
        student3.viewProfile();
        java.lang.String str14 = student3.getEmail();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 20.0d + "'", double12 == 20.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test16180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16180");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        java.lang.String str4 = student3.getAccountType();
        java.lang.String str5 = student3.getID();
        student3.viewProfile();
        student3.setVerified(true);
        double double9 = student3.getHourlyRate();
        java.lang.String str10 = student3.getPassword();
        student3.viewProfile();
        student3.logout();
        boolean boolean13 = student3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "student" + "'", str4, "student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test16181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16181");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        student3.setVerified(false);
        java.lang.String str6 = student3.getEmail();
        student3.setVerified(false);
        student3.login("student", "hi!");
        student3.viewProfile();
        student3.login("", "student");
        boolean boolean16 = student3.isVerified();
        double double17 = student3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 20.0d + "'", double17 == 20.0d);
    }

    @Test
    public void test16182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16182");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        student3.setVerified(false);
        student3.viewProfile();
        java.lang.String str7 = student3.getEmail();
        java.lang.String str8 = student3.getID();
        student3.login("hi!", "student");
        student3.setVerified(true);
        student3.viewProfile();
        double double15 = student3.getHourlyRate();
        java.lang.String str16 = student3.getEmail();
        java.lang.String str17 = student3.getAccountType();
        student3.setVerified(true);
        java.lang.Class<?> wildcardClass20 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 20.0d + "'", double15 == 20.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "student" + "'", str17, "student");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test16183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16183");
        model.Student student3 = new model.Student("", "student", "student");
        student3.setVerified(true);
        java.lang.String str6 = student3.getPassword();
        boolean boolean7 = student3.isVerified();
        java.lang.String str8 = student3.getEmail();
        java.lang.String str9 = student3.getAccountType();
        java.lang.String str10 = student3.getAccountType();
        java.lang.Class<?> wildcardClass11 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "student" + "'", str9, "student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "student" + "'", str10, "student");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test16184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16184");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        student3.setVerified(false);
        boolean boolean9 = student3.isVerified();
        java.lang.String str10 = student3.getAccountType();
        java.lang.String str11 = student3.getPassword();
        java.lang.String str12 = student3.getEmail();
        double double13 = student3.getHourlyRate();
        student3.setVerified(false);
        student3.login("hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "student" + "'", str10, "student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 20.0d + "'", double13 == 20.0d);
    }

    @Test
    public void test16185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16185");
        model.Student student3 = new model.Student("hi!", "student", "student");
        student3.setVerified(true);
        java.lang.String str6 = student3.getPassword();
        student3.logout();
        java.lang.Class<?> wildcardClass8 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test16186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16186");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getAccountType();
        student3.logout();
        double double8 = student3.getHourlyRate();
        java.lang.String str9 = student3.getEmail();
        java.lang.String str10 = student3.getAccountType();
        boolean boolean11 = student3.isVerified();
        boolean boolean12 = student3.isVerified();
        double double13 = student3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "student" + "'", str10, "student");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 20.0d + "'", double13 == 20.0d);
    }

    @Test
    public void test16187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16187");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getEmail();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        student3.login("hi!", "student");
        java.lang.String str11 = student3.getEmail();
        student3.setVerified(false);
        java.lang.String str14 = student3.getID();
        java.lang.String str15 = student3.getAccountType();
        student3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "student" + "'", str15, "student");
    }

    @Test
    public void test16188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16188");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getAccountType();
        student3.logout();
        java.lang.String str8 = student3.getEmail();
        student3.viewProfile();
        java.lang.String str10 = student3.getID();
        java.lang.String str11 = student3.getEmail();
        student3.setVerified(false);
        student3.login("student", "student");
        student3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test16189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16189");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getAccountType();
        student3.logout();
        java.lang.String str8 = student3.getEmail();
        student3.viewProfile();
        java.lang.String str10 = student3.getID();
        java.lang.String str11 = student3.getPassword();
        boolean boolean12 = student3.isVerified();
        java.lang.String str13 = student3.getEmail();
        java.lang.String str14 = student3.getAccountType();
        student3.viewProfile();
        boolean boolean16 = student3.isVerified();
        student3.login("student", "");
        double double20 = student3.getHourlyRate();
        boolean boolean21 = student3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "student" + "'", str14, "student");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 20.0d + "'", double20 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test16190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16190");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        double double6 = student3.getHourlyRate();
        student3.logout();
        student3.viewProfile();
        java.lang.String str9 = student3.getEmail();
        java.lang.String str10 = student3.getEmail();
        student3.setVerified(true);
        student3.logout();
        student3.setVerified(true);
        student3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test16191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16191");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        student3.setVerified(false);
        java.lang.String str10 = student3.getAccountType();
        java.lang.String str11 = student3.getID();
        boolean boolean12 = student3.isVerified();
        student3.login("", "");
        java.lang.String str16 = student3.getPassword();
        boolean boolean17 = student3.isVerified();
        student3.login("student", "");
        java.lang.String str21 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "student" + "'", str10, "student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "student" + "'", str21, "student");
    }

    @Test
    public void test16192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16192");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        student3.setVerified(false);
        java.lang.String str10 = student3.getID();
        student3.viewProfile();
        student3.login("", "");
        java.lang.String str15 = student3.getPassword();
        double double16 = student3.getHourlyRate();
        java.lang.String str17 = student3.getEmail();
        java.lang.String str18 = student3.getEmail();
        java.lang.String str19 = student3.getID();
        boolean boolean20 = student3.isVerified();
        java.lang.String str21 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 20.0d + "'", double16 == 20.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "student" + "'", str21, "student");
    }

    @Test
    public void test16193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16193");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        student3.setVerified(false);
        java.lang.String str9 = student3.getID();
        student3.setVerified(false);
        java.lang.String str12 = student3.getID();
        java.lang.String str13 = student3.getID();
        double double14 = student3.getHourlyRate();
        student3.viewProfile();
        java.lang.String str16 = student3.getEmail();
        java.lang.String str17 = student3.getID();
        student3.login("hi!", "");
        double double21 = student3.getHourlyRate();
        java.lang.Class<?> wildcardClass22 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 20.0d + "'", double14 == 20.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 20.0d + "'", double21 == 20.0d);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test16194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16194");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        student3.setVerified(false);
        java.lang.String str9 = student3.getID();
        student3.setVerified(false);
        java.lang.String str12 = student3.getID();
        java.lang.String str13 = student3.getID();
        java.lang.String str14 = student3.getPassword();
        java.lang.String str15 = student3.getEmail();
        student3.viewProfile();
        java.lang.String str17 = student3.getPassword();
        java.lang.String str18 = student3.getEmail();
        java.lang.String str19 = student3.getEmail();
        boolean boolean20 = student3.isVerified();
        java.lang.String str21 = student3.getAccountType();
        java.lang.String str22 = student3.getPassword();
        double double23 = student3.getHourlyRate();
        student3.login("student", "hi!");
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
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "student" + "'", str21, "student");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 20.0d + "'", double23 == 20.0d);
    }

    @Test
    public void test16195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16195");
        model.Student student3 = new model.Student("hi!", "hi!", "");
        student3.logout();
        java.lang.String str5 = student3.getEmail();
        double double6 = student3.getHourlyRate();
        student3.setVerified(false);
        student3.login("", "");
        student3.login("hi!", "");
        student3.login("hi!", "student");
        double double18 = student3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 20.0d + "'", double18 == 20.0d);
    }

    @Test
    public void test16196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16196");
        model.Student student3 = new model.Student("", "", "hi!");
        student3.logout();
        java.lang.String str5 = student3.getID();
        java.lang.String str6 = student3.getEmail();
        double double7 = student3.getHourlyRate();
        boolean boolean8 = student3.isVerified();
        java.lang.String str9 = student3.getID();
        double double10 = student3.getHourlyRate();
        student3.setVerified(false);
        double double13 = student3.getHourlyRate();
        java.lang.String str14 = student3.getAccountType();
        student3.viewProfile();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 20.0d + "'", double13 == 20.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "student" + "'", str14, "student");
    }

    @Test
    public void test16197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16197");
        model.Student student3 = new model.Student("", "", "hi!");
        student3.logout();
        java.lang.String str5 = student3.getID();
        java.lang.String str6 = student3.getEmail();
        java.lang.String str7 = student3.getPassword();
        java.lang.String str8 = student3.getID();
        student3.logout();
        java.lang.String str10 = student3.getPassword();
        student3.logout();
        student3.setVerified(false);
        student3.setVerified(false);
        student3.setVerified(true);
        java.lang.String str18 = student3.getEmail();
        java.lang.String str19 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "student" + "'", str19, "student");
    }

    @Test
    public void test16198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16198");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getAccountType();
        student3.logout();
        java.lang.String str8 = student3.getEmail();
        student3.viewProfile();
        java.lang.String str10 = student3.getID();
        boolean boolean11 = student3.isVerified();
        java.lang.String str12 = student3.getEmail();
        student3.login("", "student");
        double double16 = student3.getHourlyRate();
        boolean boolean17 = student3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 20.0d + "'", double16 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test16199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16199");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getAccountType();
        student3.logout();
        java.lang.String str8 = student3.getEmail();
        student3.viewProfile();
        java.lang.String str10 = student3.getID();
        boolean boolean11 = student3.isVerified();
        java.lang.String str12 = student3.getAccountType();
        java.lang.String str13 = student3.getEmail();
        java.lang.String str14 = student3.getID();
        double double15 = student3.getHourlyRate();
        student3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "student" + "'", str12, "student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 20.0d + "'", double15 == 20.0d);
    }

    @Test
    public void test16200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16200");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.login("", "");
        student3.login("student", "student");
        java.lang.String str13 = student3.getAccountType();
        student3.login("", "hi!");
        student3.login("", "");
        java.lang.String str20 = student3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "student" + "'", str13, "student");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test16201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16201");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        student3.setVerified(false);
        java.lang.String str10 = student3.getEmail();
        student3.logout();
        student3.login("student", "hi!");
        java.lang.String str15 = student3.getPassword();
        student3.login("student", "");
        double double19 = student3.getHourlyRate();
        java.lang.String str20 = student3.getPassword();
        java.lang.String str21 = student3.getPassword();
        double double22 = student3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 20.0d + "'", double19 == 20.0d);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 20.0d + "'", double22 == 20.0d);
    }

    @Test
    public void test16202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16202");
        model.Student student3 = new model.Student("", "", "hi!");
        student3.logout();
        java.lang.String str5 = student3.getID();
        java.lang.String str6 = student3.getEmail();
        double double7 = student3.getHourlyRate();
        boolean boolean8 = student3.isVerified();
        java.lang.String str9 = student3.getID();
        java.lang.String str10 = student3.getAccountType();
        student3.viewProfile();
        java.lang.String str12 = student3.getPassword();
        student3.logout();
        java.lang.String str14 = student3.getID();
        double double15 = student3.getHourlyRate();
        java.lang.String str16 = student3.getPassword();
        java.lang.String str17 = student3.getID();
        student3.login("hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "student" + "'", str10, "student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 20.0d + "'", double15 == 20.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test16203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16203");
        model.Student student3 = new model.Student("hi!", "hi!", "student");
        student3.login("hi!", "student");
        student3.login("", "student");
        student3.setVerified(false);
        student3.setVerified(true);
    }

    @Test
    public void test16204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16204");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        student3.setVerified(false);
        java.lang.String str9 = student3.getID();
        student3.setVerified(false);
        java.lang.String str12 = student3.getID();
        java.lang.String str13 = student3.getID();
        java.lang.String str14 = student3.getPassword();
        java.lang.String str15 = student3.getEmail();
        student3.viewProfile();
        student3.login("hi!", "");
        java.lang.String str20 = student3.getAccountType();
        student3.login("", "student");
        student3.logout();
        java.lang.String str25 = student3.getID();
        java.lang.String str26 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "student" + "'", str20, "student");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "student" + "'", str26, "student");
    }

    @Test
    public void test16205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16205");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        student3.setVerified(false);
        java.lang.String str10 = student3.getID();
        double double11 = student3.getHourlyRate();
        student3.viewProfile();
        student3.login("hi!", "student");
        student3.logout();
        student3.setVerified(false);
        student3.viewProfile();
        student3.viewProfile();
        java.lang.String str21 = student3.getID();
        boolean boolean22 = student3.isVerified();
        student3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test16206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16206");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        student3.setVerified(false);
        boolean boolean9 = student3.isVerified();
        java.lang.String str10 = student3.getAccountType();
        java.lang.String str11 = student3.getID();
        student3.logout();
        student3.logout();
        student3.logout();
        double double15 = student3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "student" + "'", str10, "student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 20.0d + "'", double15 == 20.0d);
    }

    @Test
    public void test16207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16207");
        model.Student student3 = new model.Student("", "", "hi!");
        student3.logout();
        java.lang.String str5 = student3.getID();
        java.lang.String str6 = student3.getEmail();
        java.lang.String str7 = student3.getPassword();
        java.lang.String str8 = student3.getID();
        student3.logout();
        student3.logout();
        student3.viewProfile();
        java.lang.String str12 = student3.getID();
        double double13 = student3.getHourlyRate();
        java.lang.String str14 = student3.getAccountType();
        student3.viewProfile();
        student3.login("student", "");
        student3.logout();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 20.0d + "'", double13 == 20.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "student" + "'", str14, "student");
    }

    @Test
    public void test16208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16208");
        model.Student student3 = new model.Student("", "", "hi!");
        student3.logout();
        java.lang.String str5 = student3.getID();
        java.lang.String str6 = student3.getEmail();
        double double7 = student3.getHourlyRate();
        java.lang.String str8 = student3.getPassword();
        student3.login("hi!", "hi!");
        java.lang.String str12 = student3.getID();
        java.lang.String str13 = student3.getEmail();
        double double14 = student3.getHourlyRate();
        student3.logout();
        double double16 = student3.getHourlyRate();
        java.lang.String str17 = student3.getEmail();
        student3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 20.0d + "'", double14 == 20.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 20.0d + "'", double16 == 20.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test16209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16209");
        model.Student student3 = new model.Student("", "", "hi!");
        student3.logout();
        java.lang.String str5 = student3.getID();
        java.lang.String str6 = student3.getEmail();
        double double7 = student3.getHourlyRate();
        java.lang.String str8 = student3.getPassword();
        student3.login("hi!", "hi!");
        student3.logout();
        student3.viewProfile();
        java.lang.String str14 = student3.getAccountType();
        student3.logout();
        java.lang.String str16 = student3.getID();
        student3.setVerified(true);
        student3.logout();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "student" + "'", str14, "student");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test16210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16210");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        student3.setVerified(false);
        java.lang.String str9 = student3.getID();
        student3.setVerified(false);
        student3.logout();
        student3.setVerified(false);
        java.lang.String str15 = student3.getEmail();
        student3.viewProfile();
        boolean boolean17 = student3.isVerified();
        student3.setVerified(true);
        double double20 = student3.getHourlyRate();
        java.lang.String str21 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 20.0d + "'", double20 == 20.0d);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "student" + "'", str21, "student");
    }

    @Test
    public void test16211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16211");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        java.lang.String str7 = student3.getID();
        student3.login("hi!", "");
        student3.login("hi!", "student");
        student3.viewProfile();
        student3.logout();
        java.lang.String str16 = student3.getAccountType();
        java.lang.Class<?> wildcardClass17 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "student" + "'", str16, "student");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test16212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16212");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getAccountType();
        student3.logout();
        java.lang.String str8 = student3.getAccountType();
        java.lang.String str9 = student3.getID();
        java.lang.String str10 = student3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test16213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16213");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        student3.setVerified(false);
        java.lang.String str10 = student3.getID();
        double double11 = student3.getHourlyRate();
        java.lang.String str12 = student3.getPassword();
        student3.login("hi!", "hi!");
        student3.setVerified(true);
        double double18 = student3.getHourlyRate();
        boolean boolean19 = student3.isVerified();
        student3.setVerified(true);
        student3.setVerified(true);
        java.lang.String str24 = student3.getPassword();
        student3.setVerified(false);
        student3.viewProfile();
        double double28 = student3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 20.0d + "'", double18 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 20.0d + "'", double28 == 20.0d);
    }

    @Test
    public void test16214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16214");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.login("", "");
        student3.login("student", "student");
        java.lang.String str13 = student3.getPassword();
        java.lang.String str14 = student3.getEmail();
        student3.logout();
        student3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test16215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16215");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        java.lang.String str7 = student3.getID();
        double double8 = student3.getHourlyRate();
        java.lang.String str9 = student3.getID();
        java.lang.String str10 = student3.getAccountType();
        student3.setVerified(true);
        java.lang.String str13 = student3.getPassword();
        java.lang.String str14 = student3.getPassword();
        java.lang.String str15 = student3.getAccountType();
        student3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "student" + "'", str10, "student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "student" + "'", str15, "student");
    }

    @Test
    public void test16216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16216");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        java.lang.String str4 = student3.getAccountType();
        java.lang.String str5 = student3.getEmail();
        student3.viewProfile();
        student3.setVerified(true);
        java.lang.String str9 = student3.getPassword();
        student3.setVerified(false);
        java.lang.String str12 = student3.getAccountType();
        double double13 = student3.getHourlyRate();
        student3.logout();
        boolean boolean15 = student3.isVerified();
        student3.login("hi!", "student");
        student3.setVerified(true);
        java.lang.String str21 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "student" + "'", str4, "student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "student" + "'", str12, "student");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 20.0d + "'", double13 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "student" + "'", str21, "student");
    }

    @Test
    public void test16217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16217");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        student3.logout();
        student3.login("hi!", "hi!");
        double double8 = student3.getHourlyRate();
        java.lang.String str9 = student3.getID();
        java.lang.String str10 = student3.getAccountType();
        student3.setVerified(true);
        student3.logout();
        student3.setVerified(false);
        java.lang.String str16 = student3.getPassword();
        java.lang.String str17 = student3.getID();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "student" + "'", str10, "student");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test16218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16218");
        model.Student student3 = new model.Student("", "", "hi!");
        student3.logout();
        java.lang.String str5 = student3.getID();
        java.lang.String str6 = student3.getEmail();
        double double7 = student3.getHourlyRate();
        java.lang.String str8 = student3.getPassword();
        student3.login("hi!", "hi!");
        student3.logout();
        student3.viewProfile();
        student3.logout();
        java.lang.String str15 = student3.getEmail();
        java.lang.String str16 = student3.getAccountType();
        boolean boolean17 = student3.isVerified();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "student" + "'", str16, "student");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test16219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16219");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        student3.setVerified(false);
        boolean boolean9 = student3.isVerified();
        double double10 = student3.getHourlyRate();
        java.lang.String str11 = student3.getPassword();
        java.lang.String str12 = student3.getID();
        boolean boolean13 = student3.isVerified();
        student3.login("student", "hi!");
        student3.setVerified(false);
        java.lang.String str19 = student3.getID();
        java.lang.String str20 = student3.getID();
        student3.setVerified(false);
        student3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test16220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16220");
        model.Student student3 = new model.Student("", "student", "student");
        student3.viewProfile();
        student3.viewProfile();
        java.lang.String str6 = student3.getEmail();
        java.lang.String str7 = student3.getAccountType();
        java.lang.String str8 = student3.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
    }

    @Test
    public void test16221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16221");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        student3.setVerified(false);
        java.lang.String str10 = student3.getEmail();
        student3.logout();
        student3.viewProfile();
        java.lang.String str13 = student3.getAccountType();
        java.lang.Class<?> wildcardClass14 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "student" + "'", str13, "student");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test16222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16222");
        model.Student student3 = new model.Student("hi!", "hi!", "");
        student3.logout();
        java.lang.String str5 = student3.getEmail();
        student3.logout();
        java.lang.String str7 = student3.getEmail();
        java.lang.String str8 = student3.getAccountType();
        java.lang.String str9 = student3.getID();
        java.lang.String str10 = student3.getAccountType();
        java.lang.String str11 = student3.getPassword();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "student" + "'", str10, "student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test16223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16223");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        student3.setVerified(false);
        student3.viewProfile();
        java.lang.String str7 = student3.getEmail();
        java.lang.String str8 = student3.getAccountType();
        java.lang.String str9 = student3.getID();
        java.lang.String str10 = student3.getAccountType();
        student3.logout();
        java.lang.String str12 = student3.getID();
        student3.login("", "student");
        student3.login("", "");
        student3.login("hi!", "student");
        student3.viewProfile();
        java.lang.String str23 = student3.getAccountType();
        java.lang.String str24 = student3.getPassword();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "student" + "'", str10, "student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "student" + "'", str23, "student");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test16224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16224");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        student3.logout();
        student3.login("", "");
        java.lang.String str8 = student3.getPassword();
        java.lang.String str9 = student3.getPassword();
        java.lang.String str10 = student3.getID();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test16225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16225");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        student3.setVerified(false);
        java.lang.String str9 = student3.getID();
        student3.setVerified(false);
        java.lang.String str12 = student3.getID();
        java.lang.String str13 = student3.getID();
        java.lang.String str14 = student3.getPassword();
        java.lang.String str15 = student3.getEmail();
        java.lang.String str16 = student3.getAccountType();
        student3.login("hi!", "hi!");
        boolean boolean20 = student3.isVerified();
        boolean boolean21 = student3.isVerified();
        double double22 = student3.getHourlyRate();
        student3.setVerified(false);
        java.lang.String str25 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "student" + "'", str16, "student");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 20.0d + "'", double22 == 20.0d);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "student" + "'", str25, "student");
    }

    @Test
    public void test16226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16226");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        double double6 = student3.getHourlyRate();
        student3.logout();
        student3.viewProfile();
        java.lang.String str9 = student3.getEmail();
        java.lang.String str10 = student3.getEmail();
        student3.setVerified(true);
        student3.logout();
        student3.login("", "hi!");
        java.lang.String str17 = student3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test16227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16227");
        model.Student student3 = new model.Student("hi!", "hi!", "");
        student3.logout();
        java.lang.String str5 = student3.getEmail();
        double double6 = student3.getHourlyRate();
        student3.setVerified(false);
        student3.login("", "");
        student3.login("hi!", "");
        java.lang.String str15 = student3.getID();
        student3.logout();
        java.lang.String str17 = student3.getID();
        student3.viewProfile();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test16228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16228");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        java.lang.String str8 = student3.getPassword();
        java.lang.String str9 = student3.getID();
        double double10 = student3.getHourlyRate();
        student3.logout();
        student3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
    }

    @Test
    public void test16229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16229");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        student3.setVerified(false);
        java.lang.String str10 = student3.getID();
        java.lang.String str11 = student3.getAccountType();
        java.lang.String str12 = student3.getPassword();
        student3.logout();
        student3.setVerified(false);
        student3.logout();
        java.lang.String str17 = student3.getEmail();
        student3.logout();
        student3.setVerified(false);
        java.lang.String str21 = student3.getEmail();
        java.lang.String str22 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "student" + "'", str11, "student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "student" + "'", str22, "student");
    }

    @Test
    public void test16230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16230");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getAccountType();
        student3.logout();
        double double8 = student3.getHourlyRate();
        java.lang.String str9 = student3.getEmail();
        java.lang.String str10 = student3.getPassword();
        student3.logout();
        java.lang.String str12 = student3.getPassword();
        double double13 = student3.getHourlyRate();
        java.lang.String str14 = student3.getAccountType();
        student3.logout();
        student3.viewProfile();
        java.lang.String str17 = student3.getID();
        java.lang.String str18 = student3.getAccountType();
        student3.login("", "hi!");
        java.lang.String str22 = student3.getID();
        student3.logout();
        java.lang.String str24 = student3.getID();
        student3.viewProfile();
        boolean boolean26 = student3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 20.0d + "'", double13 == 20.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "student" + "'", str14, "student");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "student" + "'", str18, "student");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test16231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16231");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        student3.setVerified(false);
        java.lang.String str10 = student3.getID();
        double double11 = student3.getHourlyRate();
        java.lang.String str12 = student3.getEmail();
        student3.setVerified(false);
        java.lang.String str15 = student3.getEmail();
        student3.login("", "student");
        java.lang.String str19 = student3.getEmail();
        java.lang.String str20 = student3.getAccountType();
        java.lang.String str21 = student3.getEmail();
        java.lang.String str22 = student3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "student" + "'", str20, "student");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test16232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16232");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        java.lang.String str7 = student3.getID();
        student3.setVerified(true);
        java.lang.String str10 = student3.getEmail();
        student3.setVerified(true);
        student3.setVerified(true);
        java.lang.String str15 = student3.getAccountType();
        student3.viewProfile();
        student3.setVerified(true);
        student3.viewProfile();
        java.lang.String str20 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "student" + "'", str15, "student");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "student" + "'", str20, "student");
    }

    @Test
    public void test16233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16233");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        java.lang.String str4 = student3.getAccountType();
        java.lang.String str5 = student3.getEmail();
        student3.viewProfile();
        student3.logout();
        student3.viewProfile();
        student3.login("", "");
        student3.login("", "hi!");
        student3.login("", "student");
        student3.login("student", "hi!");
        java.lang.String str21 = student3.getPassword();
        boolean boolean22 = student3.isVerified();
        student3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "student" + "'", str4, "student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test16234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16234");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        student3.logout();
        student3.login("hi!", "hi!");
        double double8 = student3.getHourlyRate();
        java.lang.String str9 = student3.getID();
        java.lang.String str10 = student3.getAccountType();
        student3.viewProfile();
        boolean boolean12 = student3.isVerified();
        boolean boolean13 = student3.isVerified();
        java.lang.String str14 = student3.getID();
        boolean boolean15 = student3.isVerified();
        java.lang.String str16 = student3.getAccountType();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "student" + "'", str10, "student");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "student" + "'", str16, "student");
    }

    @Test
    public void test16235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16235");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getAccountType();
        student3.logout();
        java.lang.String str8 = student3.getEmail();
        student3.viewProfile();
        java.lang.String str10 = student3.getAccountType();
        double double11 = student3.getHourlyRate();
        java.lang.String str12 = student3.getPassword();
        java.lang.String str13 = student3.getEmail();
        java.lang.String str14 = student3.getID();
        student3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "student" + "'", str10, "student");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test16236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16236");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        student3.logout();
        student3.login("hi!", "hi!");
        java.lang.String str8 = student3.getID();
        boolean boolean9 = student3.isVerified();
        boolean boolean10 = student3.isVerified();
        student3.setVerified(false);
        student3.viewProfile();
        java.lang.String str14 = student3.getID();
        java.lang.String str15 = student3.getEmail();
        student3.logout();
        student3.login("student", "hi!");
        java.lang.String str20 = student3.getPassword();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test16237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16237");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        student3.logout();
        student3.login("hi!", "hi!");
        student3.viewProfile();
        java.lang.String str9 = student3.getPassword();
        java.lang.String str10 = student3.getID();
        student3.logout();
        student3.login("", "student");
        java.lang.String str15 = student3.getID();
        student3.setVerified(false);
        java.lang.String str18 = student3.getAccountType();
        student3.setVerified(false);
        java.lang.String str21 = student3.getEmail();
        student3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "student" + "'", str18, "student");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test16238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16238");
        model.Student student3 = new model.Student("hi!", "student", "");
        student3.logout();
        java.lang.String str5 = student3.getPassword();
        java.lang.String str6 = student3.getPassword();
        student3.viewProfile();
        student3.logout();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
    }

    @Test
    public void test16239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16239");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        java.lang.String str8 = student3.getPassword();
        java.lang.String str9 = student3.getEmail();
        double double10 = student3.getHourlyRate();
        student3.logout();
        java.lang.String str12 = student3.getEmail();
        student3.logout();
        java.lang.String str14 = student3.getID();
        double double15 = student3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 20.0d + "'", double15 == 20.0d);
    }

    @Test
    public void test16240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16240");
        model.Student student3 = new model.Student("", "", "hi!");
        student3.logout();
        java.lang.String str5 = student3.getID();
        java.lang.String str6 = student3.getEmail();
        java.lang.String str7 = student3.getPassword();
        java.lang.String str8 = student3.getID();
        student3.logout();
        student3.viewProfile();
        student3.login("hi!", "");
        student3.setVerified(true);
        java.lang.String str16 = student3.getEmail();
        java.lang.Class<?> wildcardClass17 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test16241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16241");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getAccountType();
        student3.logout();
        java.lang.String str8 = student3.getEmail();
        student3.viewProfile();
        java.lang.String str10 = student3.getID();
        java.lang.String str11 = student3.getEmail();
        java.lang.String str12 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "student" + "'", str12, "student");
    }

    @Test
    public void test16242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16242");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getEmail();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        student3.login("hi!", "student");
        double double11 = student3.getHourlyRate();
        java.lang.String str12 = student3.getAccountType();
        student3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "student" + "'", str12, "student");
    }

    @Test
    public void test16243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16243");
        model.Student student3 = new model.Student("", "", "hi!");
        student3.login("", "");
        double double7 = student3.getHourlyRate();
        student3.login("student", "student");
        java.lang.String str11 = student3.getID();
        java.lang.String str12 = student3.getAccountType();
        student3.logout();
        student3.setVerified(false);
        boolean boolean16 = student3.isVerified();
        boolean boolean17 = student3.isVerified();
        student3.logout();
        java.lang.String str19 = student3.getPassword();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "student" + "'", str12, "student");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test16244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16244");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        student3.setVerified(false);
        java.lang.String str10 = student3.getEmail();
        student3.logout();
        student3.viewProfile();
        java.lang.String str13 = student3.getID();
        java.lang.String str14 = student3.getEmail();
        java.lang.String str15 = student3.getAccountType();
        student3.viewProfile();
        student3.setVerified(false);
        boolean boolean19 = student3.isVerified();
        java.lang.String str20 = student3.getAccountType();
        java.lang.String str21 = student3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "student" + "'", str15, "student");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "student" + "'", str20, "student");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test16245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16245");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        java.lang.String str4 = student3.getAccountType();
        java.lang.String str5 = student3.getEmail();
        java.lang.String str6 = student3.getAccountType();
        java.lang.String str7 = student3.getEmail();
        java.lang.String str8 = student3.getPassword();
        java.lang.String str9 = student3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "student" + "'", str4, "student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test16246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16246");
        model.Student student3 = new model.Student("", "", "hi!");
        student3.logout();
        java.lang.String str5 = student3.getID();
        java.lang.String str6 = student3.getEmail();
        double double7 = student3.getHourlyRate();
        java.lang.String str8 = student3.getPassword();
        student3.login("hi!", "hi!");
        student3.logout();
        student3.viewProfile();
        student3.logout();
        java.lang.String str15 = student3.getAccountType();
        student3.login("", "hi!");
        student3.login("hi!", "hi!");
        student3.logout();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "student" + "'", str15, "student");
    }

    @Test
    public void test16247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16247");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        student3.setVerified(false);
        java.lang.String str9 = student3.getID();
        student3.setVerified(false);
        java.lang.String str12 = student3.getID();
        double double13 = student3.getHourlyRate();
        java.lang.String str14 = student3.getPassword();
        boolean boolean15 = student3.isVerified();
        java.lang.String str16 = student3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 20.0d + "'", double13 == 20.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test16248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16248");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        java.lang.String str8 = student3.getEmail();
        student3.viewProfile();
        java.lang.String str10 = student3.getAccountType();
        student3.login("student", "hi!");
        double double14 = student3.getHourlyRate();
        java.lang.String str15 = student3.getPassword();
        student3.logout();
        student3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "student" + "'", str10, "student");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 20.0d + "'", double14 == 20.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test16249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16249");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        student3.logout();
        student3.login("hi!", "hi!");
        student3.viewProfile();
        java.lang.String str9 = student3.getPassword();
        java.lang.String str10 = student3.getID();
        student3.logout();
        student3.login("", "student");
        java.lang.String str15 = student3.getID();
        student3.setVerified(false);
        java.lang.String str18 = student3.getPassword();
        student3.viewProfile();
        student3.login("hi!", "");
        student3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test16250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16250");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        java.lang.String str7 = student3.getID();
        student3.setVerified(true);
        java.lang.String str10 = student3.getEmail();
        student3.setVerified(true);
        java.lang.String str13 = student3.getAccountType();
        java.lang.String str14 = student3.getPassword();
        java.lang.Class<?> wildcardClass15 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "student" + "'", str13, "student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test16251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16251");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        boolean boolean7 = student3.isVerified();
        student3.logout();
        student3.logout();
        student3.viewProfile();
        student3.logout();
        java.lang.String str12 = student3.getAccountType();
        student3.login("hi!", "student");
        double double16 = student3.getHourlyRate();
        java.lang.String str17 = student3.getID();
        boolean boolean18 = student3.isVerified();
        java.lang.String str19 = student3.getPassword();
        student3.logout();
        student3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "student" + "'", str12, "student");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 20.0d + "'", double16 == 20.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test16252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16252");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        student3.setVerified(false);
        java.lang.String str10 = student3.getEmail();
        student3.logout();
        student3.login("", "");
        java.lang.String str15 = student3.getEmail();
        java.lang.String str16 = student3.getEmail();
        student3.login("hi!", "");
        student3.setVerified(false);
        java.lang.Class<?> wildcardClass22 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test16253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16253");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        student3.logout();
        student3.login("hi!", "hi!");
        double double8 = student3.getHourlyRate();
        boolean boolean9 = student3.isVerified();
        student3.setVerified(false);
        java.lang.String str12 = student3.getPassword();
        student3.viewProfile();
        java.lang.String str14 = student3.getID();
        java.lang.String str15 = student3.getID();
        java.lang.String str16 = student3.getAccountType();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "student" + "'", str16, "student");
    }

    @Test
    public void test16254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16254");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        student3.setVerified(false);
        java.lang.String str9 = student3.getID();
        student3.setVerified(false);
        student3.logout();
        student3.setVerified(false);
        java.lang.String str15 = student3.getPassword();
        student3.login("student", "hi!");
        student3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test16255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16255");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        student3.setVerified(false);
        java.lang.String str10 = student3.getAccountType();
        java.lang.String str11 = student3.getID();
        boolean boolean12 = student3.isVerified();
        student3.login("hi!", "student");
        student3.login("student", "");
        java.lang.String str19 = student3.getAccountType();
        double double20 = student3.getHourlyRate();
        boolean boolean21 = student3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "student" + "'", str10, "student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "student" + "'", str19, "student");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 20.0d + "'", double20 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test16256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16256");
        model.Student student3 = new model.Student("", "", "hi!");
        student3.login("", "");
        student3.viewProfile();
        student3.viewProfile();
        student3.login("", "");
        student3.logout();
        java.lang.String str13 = student3.getID();
        boolean boolean14 = student3.isVerified();
        java.lang.String str15 = student3.getEmail();
        boolean boolean16 = student3.isVerified();
        java.lang.String str17 = student3.getID();
        student3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test16257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16257");
        model.Student student3 = new model.Student("hi!", "hi!", "");
        student3.logout();
        java.lang.String str5 = student3.getEmail();
        java.lang.String str6 = student3.getAccountType();
        java.lang.String str7 = student3.getPassword();
        student3.viewProfile();
        student3.logout();
        student3.viewProfile();
        student3.logout();
        java.lang.String str12 = student3.getEmail();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test16258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16258");
        model.Student student3 = new model.Student("", "student", "");
        student3.viewProfile();
        student3.login("student", "student");
        student3.viewProfile();
    }

    @Test
    public void test16259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16259");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        student3.setVerified(false);
        java.lang.String str10 = student3.getID();
        java.lang.String str11 = student3.getAccountType();
        java.lang.String str12 = student3.getPassword();
        double double13 = student3.getHourlyRate();
        java.lang.String str14 = student3.getEmail();
        student3.login("student", "");
        boolean boolean18 = student3.isVerified();
        java.lang.String str19 = student3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "student" + "'", str11, "student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 20.0d + "'", double13 == 20.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test16260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16260");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        student3.setVerified(false);
        java.lang.String str10 = student3.getID();
        double double11 = student3.getHourlyRate();
        java.lang.String str12 = student3.getPassword();
        student3.login("hi!", "hi!");
        student3.setVerified(true);
        java.lang.String str18 = student3.getID();
        java.lang.String str19 = student3.getEmail();
        java.lang.String str20 = student3.getEmail();
        student3.setVerified(false);
        java.lang.String str23 = student3.getAccountType();
        student3.login("student", "");
        double double27 = student3.getHourlyRate();
        java.lang.String str28 = student3.getID();
        student3.login("hi!", "student");
        student3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "student" + "'", str23, "student");
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 20.0d + "'", double27 == 20.0d);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
    }

    @Test
    public void test16261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16261");
        model.Student student3 = new model.Student("hi!", "hi!", "");
        student3.logout();
        java.lang.String str5 = student3.getEmail();
        double double6 = student3.getHourlyRate();
        java.lang.String str7 = student3.getAccountType();
        java.lang.String str8 = student3.getAccountType();
        student3.login("", "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
    }

    @Test
    public void test16262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16262");
        model.Student student3 = new model.Student("student", "", "student");
        student3.setVerified(false);
        student3.viewProfile();
        student3.logout();
        student3.setVerified(true);
        double double10 = student3.getHourlyRate();
        student3.setVerified(true);
        java.lang.String str13 = student3.getPassword();
        java.lang.String str14 = student3.getID();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "student" + "'", str14, "student");
    }

    @Test
    public void test16263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16263");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        boolean boolean7 = student3.isVerified();
        student3.logout();
        java.lang.String str9 = student3.getID();
        student3.setVerified(true);
        student3.viewProfile();
        boolean boolean13 = student3.isVerified();
        boolean boolean14 = student3.isVerified();
        double double15 = student3.getHourlyRate();
        student3.setVerified(true);
        student3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 20.0d + "'", double15 == 20.0d);
    }

    @Test
    public void test16264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16264");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        boolean boolean7 = student3.isVerified();
        student3.logout();
        student3.logout();
        student3.viewProfile();
        student3.viewProfile();
        student3.logout();
        java.lang.String str13 = student3.getAccountType();
        student3.setVerified(true);
        boolean boolean16 = student3.isVerified();
        java.lang.String str17 = student3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "student" + "'", str13, "student");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test16265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16265");
        model.Student student3 = new model.Student("hi!", "hi!", "student");
        student3.login("hi!", "student");
        java.lang.String str7 = student3.getEmail();
        student3.login("student", "student");
        java.lang.String str11 = student3.getEmail();
        java.lang.String str12 = student3.getAccountType();
        java.lang.Class<?> wildcardClass13 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "student" + "'", str12, "student");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test16266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16266");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        java.lang.String str8 = student3.getPassword();
        java.lang.String str9 = student3.getPassword();
        student3.logout();
        java.lang.String str11 = student3.getAccountType();
        student3.logout();
        student3.setVerified(false);
        java.lang.String str15 = student3.getPassword();
        double double16 = student3.getHourlyRate();
        java.lang.String str17 = student3.getPassword();
        java.lang.String str18 = student3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "student" + "'", str11, "student");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 20.0d + "'", double16 == 20.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test16267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16267");
        model.Student student3 = new model.Student("", "", "hi!");
        student3.logout();
        java.lang.String str5 = student3.getID();
        java.lang.String str6 = student3.getEmail();
        java.lang.String str7 = student3.getPassword();
        java.lang.String str8 = student3.getID();
        student3.logout();
        java.lang.String str10 = student3.getPassword();
        student3.logout();
        student3.login("student", "hi!");
        java.lang.String str15 = student3.getPassword();
        boolean boolean16 = student3.isVerified();
        java.lang.String str17 = student3.getPassword();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test16268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16268");
        model.Student student3 = new model.Student("hi!", "student", "");
        java.lang.String str4 = student3.getEmail();
        student3.viewProfile();
        student3.logout();
        double double7 = student3.getHourlyRate();
        boolean boolean8 = student3.isVerified();
        double double9 = student3.getHourlyRate();
        java.lang.String str10 = student3.getPassword();
        java.lang.String str11 = student3.getEmail();
        student3.login("", "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "student" + "'", str10, "student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test16269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16269");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        student3.setVerified(false);
        student3.logout();
        double double11 = student3.getHourlyRate();
        student3.viewProfile();
        student3.setVerified(false);
        java.lang.String str15 = student3.getEmail();
        student3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test16270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16270");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getAccountType();
        java.lang.String str7 = student3.getAccountType();
        java.lang.String str8 = student3.getEmail();
        java.lang.String str9 = student3.getID();
        java.lang.String str10 = student3.getID();
        student3.viewProfile();
        student3.login("", "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test16271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16271");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        java.lang.String str8 = student3.getPassword();
        java.lang.String str9 = student3.getEmail();
        student3.logout();
        boolean boolean11 = student3.isVerified();
        java.lang.String str12 = student3.getAccountType();
        student3.setVerified(true);
        student3.logout();
        boolean boolean16 = student3.isVerified();
        student3.login("student", "student");
        double double20 = student3.getHourlyRate();
        boolean boolean21 = student3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "student" + "'", str12, "student");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 20.0d + "'", double20 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test16272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16272");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        student3.setVerified(false);
        java.lang.String str10 = student3.getID();
        student3.viewProfile();
        java.lang.String str12 = student3.getID();
        student3.setVerified(false);
        double double15 = student3.getHourlyRate();
        student3.logout();
        java.lang.String str17 = student3.getAccountType();
        double double18 = student3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 20.0d + "'", double15 == 20.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "student" + "'", str17, "student");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 20.0d + "'", double18 == 20.0d);
    }

    @Test
    public void test16273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16273");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        student3.setVerified(false);
        java.lang.String str10 = student3.getID();
        double double11 = student3.getHourlyRate();
        java.lang.String str12 = student3.getPassword();
        student3.logout();
        double double14 = student3.getHourlyRate();
        student3.login("", "student");
        java.lang.String str18 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 20.0d + "'", double14 == 20.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "student" + "'", str18, "student");
    }

    @Test
    public void test16274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16274");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        java.lang.String str4 = student3.getAccountType();
        java.lang.String str5 = student3.getID();
        student3.setVerified(true);
        student3.login("student", "student");
        java.lang.String str11 = student3.getPassword();
        student3.logout();
        student3.login("student", "");
        student3.login("hi!", "hi!");
        student3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "student" + "'", str4, "student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test16275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16275");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        java.lang.String str8 = student3.getPassword();
        student3.setVerified(false);
        student3.logout();
        student3.viewProfile();
        java.lang.String str13 = student3.getAccountType();
        student3.viewProfile();
        student3.logout();
        student3.login("hi!", "hi!");
        student3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "student" + "'", str13, "student");
    }

    @Test
    public void test16276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16276");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        student3.setVerified(false);
        java.lang.String str9 = student3.getID();
        student3.setVerified(false);
        student3.logout();
        student3.setVerified(false);
        java.lang.String str15 = student3.getPassword();
        student3.setVerified(true);
        double double18 = student3.getHourlyRate();
        java.lang.String str19 = student3.getPassword();
        boolean boolean20 = student3.isVerified();
        student3.setVerified(false);
        java.lang.String str23 = student3.getID();
        java.lang.Class<?> wildcardClass24 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 20.0d + "'", double18 == 20.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test16277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16277");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        double double6 = student3.getHourlyRate();
        student3.setVerified(true);
        java.lang.String str9 = student3.getID();
        boolean boolean10 = student3.isVerified();
        student3.viewProfile();
        java.lang.String str12 = student3.getAccountType();
        java.lang.String str13 = student3.getID();
        java.lang.String str14 = student3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "student" + "'", str12, "student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test16278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16278");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.login("", "");
        java.lang.String str10 = student3.getID();
        student3.logout();
        boolean boolean12 = student3.isVerified();
        double double13 = student3.getHourlyRate();
        boolean boolean14 = student3.isVerified();
        java.lang.String str15 = student3.getPassword();
        double double16 = student3.getHourlyRate();
        student3.logout();
        student3.setVerified(false);
        double double20 = student3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 20.0d + "'", double13 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 20.0d + "'", double16 == 20.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 20.0d + "'", double20 == 20.0d);
    }

    @Test
    public void test16279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16279");
        model.Student student3 = new model.Student("student", "", "student");
        student3.setVerified(false);
        student3.login("hi!", "hi!");
        student3.viewProfile();
        double double10 = student3.getHourlyRate();
        student3.setVerified(false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
    }

    @Test
    public void test16280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16280");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        java.lang.String str8 = student3.getPassword();
        java.lang.String str9 = student3.getPassword();
        student3.logout();
        java.lang.String str11 = student3.getAccountType();
        boolean boolean12 = student3.isVerified();
        java.lang.String str13 = student3.getPassword();
        java.lang.String str14 = student3.getAccountType();
        student3.login("hi!", "student");
        student3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "student" + "'", str11, "student");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "student" + "'", str14, "student");
    }

    @Test
    public void test16281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16281");
        model.Student student3 = new model.Student("hi!", "student", "");
        student3.logout();
        student3.logout();
        student3.logout();
        double double7 = student3.getHourlyRate();
        boolean boolean8 = student3.isVerified();
        boolean boolean9 = student3.isVerified();
        boolean boolean10 = student3.isVerified();
        double double11 = student3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
    }

    @Test
    public void test16282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16282");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.setVerified(false);
        java.lang.String str9 = student3.getPassword();
        student3.viewProfile();
        student3.viewProfile();
        java.lang.Class<?> wildcardClass12 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test16283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16283");
        model.Student student3 = new model.Student("", "", "hi!");
        student3.login("", "");
        student3.viewProfile();
        student3.viewProfile();
        student3.login("", "");
        boolean boolean12 = student3.isVerified();
        student3.viewProfile();
        double double14 = student3.getHourlyRate();
        student3.viewProfile();
        student3.setVerified(false);
        java.lang.String str18 = student3.getPassword();
        student3.logout();
        java.lang.String str20 = student3.getEmail();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 20.0d + "'", double14 == 20.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test16284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16284");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        java.lang.String str6 = student3.getPassword();
        student3.setVerified(false);
        java.lang.String str9 = student3.getEmail();
        student3.logout();
        java.lang.String str11 = student3.getPassword();
        java.lang.Class<?> wildcardClass12 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test16285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16285");
        model.Student student3 = new model.Student("", "", "hi!");
        student3.logout();
        java.lang.String str5 = student3.getID();
        java.lang.String str6 = student3.getEmail();
        double double7 = student3.getHourlyRate();
        java.lang.String str8 = student3.getEmail();
        java.lang.String str9 = student3.getID();
        java.lang.String str10 = student3.getID();
        student3.login("hi!", "student");
        java.lang.String str14 = student3.getPassword();
        boolean boolean15 = student3.isVerified();
        java.lang.String str16 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "student" + "'", str16, "student");
    }

    @Test
    public void test16286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16286");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        java.lang.String str8 = student3.getPassword();
        java.lang.String str9 = student3.getID();
        student3.logout();
        student3.logout();
        student3.login("student", "student");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test16287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16287");
        model.Student student3 = new model.Student("hi!", "hi!", "");
        java.lang.String str4 = student3.getEmail();
        double double5 = student3.getHourlyRate();
        double double6 = student3.getHourlyRate();
        java.lang.String str7 = student3.getEmail();
        student3.setVerified(false);
        double double10 = student3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
    }

    @Test
    public void test16288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16288");
        model.Student student3 = new model.Student("hi!", "student", "");
        java.lang.String str4 = student3.getEmail();
        student3.logout();
        student3.setVerified(true);
        student3.setVerified(false);
        student3.logout();
        student3.viewProfile();
        boolean boolean12 = student3.isVerified();
        student3.viewProfile();
        boolean boolean14 = student3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test16289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16289");
        model.Student student3 = new model.Student("hi!", "student", "student");
        java.lang.String str4 = student3.getID();
        student3.setVerified(true);
        double double7 = student3.getHourlyRate();
        student3.viewProfile();
        java.lang.String str9 = student3.getEmail();
        student3.logout();
        student3.login("", "hi!");
        student3.setVerified(false);
        java.lang.String str16 = student3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "student" + "'", str4, "student");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "student" + "'", str16, "student");
    }

    @Test
    public void test16290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16290");
        model.Student student3 = new model.Student("", "student", "");
        student3.login("student", "");
        boolean boolean7 = student3.isVerified();
        java.lang.String str8 = student3.getEmail();
        java.lang.String str9 = student3.getID();
        student3.setVerified(false);
        java.lang.String str12 = student3.getPassword();
        student3.login("student", "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "student" + "'", str12, "student");
    }

    @Test
    public void test16291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16291");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        student3.setVerified(false);
        java.lang.String str9 = student3.getID();
        student3.setVerified(false);
        double double12 = student3.getHourlyRate();
        student3.logout();
        java.lang.String str14 = student3.getEmail();
        java.lang.String str15 = student3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 20.0d + "'", double12 == 20.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test16292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16292");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        java.lang.String str7 = student3.getID();
        student3.setVerified(true);
        java.lang.String str10 = student3.getEmail();
        student3.setVerified(true);
        java.lang.String str13 = student3.getAccountType();
        java.lang.String str14 = student3.getID();
        student3.login("student", "hi!");
        java.lang.String str18 = student3.getAccountType();
        java.lang.String str19 = student3.getAccountType();
        boolean boolean20 = student3.isVerified();
        java.lang.String str21 = student3.getAccountType();
        java.lang.String str22 = student3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "student" + "'", str13, "student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "student" + "'", str18, "student");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "student" + "'", str19, "student");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "student" + "'", str21, "student");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test16293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16293");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        boolean boolean7 = student3.isVerified();
        java.lang.String str8 = student3.getEmail();
        student3.setVerified(true);
        java.lang.String str11 = student3.getAccountType();
        double double12 = student3.getHourlyRate();
        student3.logout();
        student3.login("student", "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "student" + "'", str11, "student");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 20.0d + "'", double12 == 20.0d);
    }

    @Test
    public void test16294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16294");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        student3.setVerified(false);
        java.lang.String str10 = student3.getID();
        double double11 = student3.getHourlyRate();
        java.lang.String str12 = student3.getPassword();
        student3.login("hi!", "hi!");
        java.lang.String str16 = student3.getEmail();
        double double17 = student3.getHourlyRate();
        student3.login("hi!", "");
        student3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 20.0d + "'", double17 == 20.0d);
    }

    @Test
    public void test16295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16295");
        model.Student student3 = new model.Student("hi!", "hi!", "");
        java.lang.String str4 = student3.getEmail();
        student3.logout();
        student3.setVerified(false);
        java.lang.String str8 = student3.getID();
        boolean boolean9 = student3.isVerified();
        student3.login("", "hi!");
        student3.login("hi!", "student");
        java.lang.Class<?> wildcardClass16 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test16296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16296");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        student3.setVerified(false);
        student3.viewProfile();
        java.lang.String str7 = student3.getEmail();
        student3.login("", "student");
        java.lang.Class<?> wildcardClass11 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test16297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16297");
        model.Student student3 = new model.Student("hi!", "hi!", "");
        student3.logout();
        java.lang.String str5 = student3.getEmail();
        double double6 = student3.getHourlyRate();
        java.lang.String str7 = student3.getAccountType();
        student3.logout();
        java.lang.String str9 = student3.getAccountType();
        double double10 = student3.getHourlyRate();
        java.lang.String str11 = student3.getPassword();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "student" + "'", str9, "student");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test16298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16298");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        java.lang.String str4 = student3.getAccountType();
        java.lang.String str5 = student3.getID();
        student3.setVerified(true);
        student3.login("student", "student");
        java.lang.String str11 = student3.getPassword();
        student3.logout();
        java.lang.String str13 = student3.getAccountType();
        student3.login("student", "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "student" + "'", str4, "student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "student" + "'", str13, "student");
    }

    @Test
    public void test16299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16299");
        model.Student student3 = new model.Student("student", "hi!", "student");
        boolean boolean4 = student3.isVerified();
        java.lang.String str5 = student3.getAccountType();
        java.lang.Class<?> wildcardClass6 = student3.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test16300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16300");
        model.Student student3 = new model.Student("", "", "hi!");
        student3.login("", "");
        double double7 = student3.getHourlyRate();
        student3.login("student", "student");
        java.lang.String str11 = student3.getID();
        student3.logout();
        student3.logout();
        double double14 = student3.getHourlyRate();
        java.lang.String str15 = student3.getID();
        java.lang.String str16 = student3.getPassword();
        java.lang.Class<?> wildcardClass17 = student3.getClass();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 20.0d + "'", double14 == 20.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test16301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16301");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.viewProfile();
        student3.login("student", "");
        student3.setVerified(true);
        student3.login("", "hi!");
        java.lang.Class<?> wildcardClass16 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test16302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16302");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        double double6 = student3.getHourlyRate();
        student3.logout();
        student3.viewProfile();
        java.lang.String str9 = student3.getEmail();
        boolean boolean10 = student3.isVerified();
        java.lang.String str11 = student3.getPassword();
        student3.setVerified(false);
        student3.viewProfile();
        boolean boolean15 = student3.isVerified();
        java.lang.String str16 = student3.getPassword();
        java.lang.Class<?> wildcardClass17 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test16303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16303");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        student3.setVerified(false);
        java.lang.String str6 = student3.getEmail();
        java.lang.String str7 = student3.getAccountType();
        java.lang.String str8 = student3.getPassword();
        student3.logout();
        java.lang.String str10 = student3.getID();
        double double11 = student3.getHourlyRate();
        java.lang.Class<?> wildcardClass12 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test16304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16304");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        student3.setVerified(false);
        student3.viewProfile();
        java.lang.String str7 = student3.getEmail();
        student3.login("hi!", "");
        student3.setVerified(false);
        java.lang.String str13 = student3.getPassword();
        java.lang.String str14 = student3.getEmail();
        java.lang.String str15 = student3.getPassword();
        java.lang.String str16 = student3.getAccountType();
        student3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "student" + "'", str16, "student");
    }

    @Test
    public void test16305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16305");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        student3.setVerified(false);
        java.lang.String str10 = student3.getAccountType();
        java.lang.String str11 = student3.getEmail();
        student3.logout();
        student3.setVerified(false);
        student3.login("", "");
        student3.viewProfile();
        java.lang.String str19 = student3.getEmail();
        student3.viewProfile();
        java.lang.String str21 = student3.getEmail();
        student3.login("", "student");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "student" + "'", str10, "student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test16306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16306");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        student3.setVerified(false);
        java.lang.String str9 = student3.getID();
        student3.setVerified(false);
        java.lang.String str12 = student3.getID();
        java.lang.String str13 = student3.getEmail();
        student3.login("", "student");
        double double17 = student3.getHourlyRate();
        java.lang.String str18 = student3.getID();
        double double19 = student3.getHourlyRate();
        double double20 = student3.getHourlyRate();
        java.lang.String str21 = student3.getID();
        double double22 = student3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 20.0d + "'", double17 == 20.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 20.0d + "'", double19 == 20.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 20.0d + "'", double20 == 20.0d);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 20.0d + "'", double22 == 20.0d);
    }

    @Test
    public void test16307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16307");
        model.Student student3 = new model.Student("hi!", "hi!", "");
        student3.setVerified(true);
        student3.login("student", "");
        java.lang.String str9 = student3.getPassword();
        student3.viewProfile();
        java.lang.String str11 = student3.getPassword();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test16308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16308");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        student3.setVerified(false);
        java.lang.String str9 = student3.getID();
        student3.setVerified(false);
        java.lang.String str12 = student3.getID();
        java.lang.String str13 = student3.getID();
        double double14 = student3.getHourlyRate();
        student3.viewProfile();
        java.lang.String str16 = student3.getEmail();
        boolean boolean17 = student3.isVerified();
        java.lang.String str18 = student3.getPassword();
        boolean boolean19 = student3.isVerified();
        boolean boolean20 = student3.isVerified();
        student3.setVerified(true);
        java.lang.String str23 = student3.getAccountType();
        java.lang.Class<?> wildcardClass24 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 20.0d + "'", double14 == 20.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "student" + "'", str23, "student");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test16309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16309");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        double double6 = student3.getHourlyRate();
        double double7 = student3.getHourlyRate();
        student3.setVerified(true);
        java.lang.String str10 = student3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test16310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16310");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        double double6 = student3.getHourlyRate();
        java.lang.String str7 = student3.getPassword();
        java.lang.String str8 = student3.getPassword();
        student3.login("student", "hi!");
        student3.login("hi!", "");
        student3.setVerified(false);
        student3.logout();
        student3.logout();
        student3.login("hi!", "student");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test16311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16311");
        model.Student student3 = new model.Student("hi!", "student", "");
        java.lang.String str4 = student3.getEmail();
        student3.logout();
        java.lang.String str6 = student3.getID();
        boolean boolean7 = student3.isVerified();
        java.lang.String str8 = student3.getAccountType();
        double double9 = student3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
    }

    @Test
    public void test16312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16312");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        double double6 = student3.getHourlyRate();
        student3.logout();
        student3.viewProfile();
        java.lang.String str9 = student3.getEmail();
        java.lang.String str10 = student3.getEmail();
        java.lang.String str11 = student3.getAccountType();
        java.lang.String str12 = student3.getPassword();
        java.lang.String str13 = student3.getID();
        student3.setVerified(false);
        student3.logout();
        java.lang.String str17 = student3.getPassword();
        boolean boolean18 = student3.isVerified();
        student3.logout();
        student3.setVerified(false);
        java.lang.String str22 = student3.getAccountType();
        student3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "student" + "'", str11, "student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "student" + "'", str22, "student");
    }

    @Test
    public void test16313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16313");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        java.lang.String str7 = student3.getID();
        double double8 = student3.getHourlyRate();
        student3.logout();
        student3.login("hi!", "hi!");
        student3.viewProfile();
        student3.logout();
        java.lang.String str15 = student3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test16314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16314");
        model.Student student3 = new model.Student("", "", "hi!");
        student3.logout();
        java.lang.String str5 = student3.getID();
        java.lang.String str6 = student3.getEmail();
        double double7 = student3.getHourlyRate();
        boolean boolean8 = student3.isVerified();
        java.lang.String str9 = student3.getID();
        student3.viewProfile();
        student3.logout();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test16315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16315");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        student3.setVerified(false);
        java.lang.String str9 = student3.getID();
        student3.setVerified(false);
        student3.logout();
        java.lang.String str13 = student3.getAccountType();
        java.lang.String str14 = student3.getAccountType();
        double double15 = student3.getHourlyRate();
        java.lang.String str16 = student3.getPassword();
        student3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "student" + "'", str13, "student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "student" + "'", str14, "student");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 20.0d + "'", double15 == 20.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test16316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16316");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        java.lang.String str4 = student3.getAccountType();
        java.lang.String str5 = student3.getEmail();
        student3.viewProfile();
        student3.setVerified(true);
        java.lang.String str9 = student3.getPassword();
        student3.setVerified(false);
        student3.setVerified(true);
        student3.viewProfile();
        student3.logout();
        java.lang.String str16 = student3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "student" + "'", str4, "student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test16317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16317");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        student3.setVerified(false);
        java.lang.String str9 = student3.getID();
        student3.setVerified(false);
        student3.logout();
        student3.setVerified(false);
        java.lang.String str15 = student3.getEmail();
        java.lang.String str16 = student3.getID();
        double double17 = student3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 20.0d + "'", double17 == 20.0d);
    }

    @Test
    public void test16318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16318");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        student3.logout();
        student3.login("hi!", "hi!");
        java.lang.String str8 = student3.getID();
        java.lang.String str9 = student3.getEmail();
        double double10 = student3.getHourlyRate();
        java.lang.String str11 = student3.getEmail();
        boolean boolean12 = student3.isVerified();
        student3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test16319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16319");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        student3.setVerified(false);
        java.lang.String str6 = student3.getEmail();
        java.lang.String str7 = student3.getAccountType();
        java.lang.String str8 = student3.getPassword();
        student3.viewProfile();
        student3.login("hi!", "");
        boolean boolean13 = student3.isVerified();
        java.lang.String str14 = student3.getID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test16320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16320");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        java.lang.String str8 = student3.getAccountType();
        student3.setVerified(false);
        student3.viewProfile();
        java.lang.String str12 = student3.getAccountType();
        java.lang.String str13 = student3.getID();
        java.lang.String str14 = student3.getID();
        student3.logout();
        java.lang.String str16 = student3.getID();
        java.lang.String str17 = student3.getID();
        java.lang.String str18 = student3.getAccountType();
        student3.login("student", "hi!");
        java.lang.String str22 = student3.getAccountType();
        java.lang.String str23 = student3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "student" + "'", str12, "student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "student" + "'", str18, "student");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "student" + "'", str22, "student");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test16321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16321");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        boolean boolean7 = student3.isVerified();
        student3.logout();
        student3.logout();
        student3.viewProfile();
        student3.viewProfile();
        student3.logout();
        boolean boolean13 = student3.isVerified();
        java.lang.String str14 = student3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test16322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16322");
        model.Student student3 = new model.Student("", "", "hi!");
        student3.logout();
        java.lang.String str5 = student3.getID();
        java.lang.String str6 = student3.getEmail();
        double double7 = student3.getHourlyRate();
        java.lang.String str8 = student3.getPassword();
        student3.login("hi!", "hi!");
        student3.logout();
        student3.viewProfile();
        student3.logout();
        boolean boolean15 = student3.isVerified();
        student3.logout();
        student3.logout();
        java.lang.String str18 = student3.getID();
        student3.logout();
        student3.logout();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test16323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16323");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        student3.logout();
        student3.login("hi!", "hi!");
        double double8 = student3.getHourlyRate();
        boolean boolean9 = student3.isVerified();
        java.lang.String str10 = student3.getAccountType();
        java.lang.String str11 = student3.getAccountType();
        double double12 = student3.getHourlyRate();
        double double13 = student3.getHourlyRate();
        student3.logout();
        java.lang.String str15 = student3.getAccountType();
        student3.logout();
        student3.setVerified(true);
        student3.login("student", "");
        student3.login("", "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "student" + "'", str10, "student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "student" + "'", str11, "student");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 20.0d + "'", double12 == 20.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 20.0d + "'", double13 == 20.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "student" + "'", str15, "student");
    }

    @Test
    public void test16324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16324");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        student3.setVerified(false);
        student3.viewProfile();
        java.lang.String str7 = student3.getEmail();
        java.lang.String str8 = student3.getAccountType();
        student3.logout();
        boolean boolean10 = student3.isVerified();
        student3.login("", "hi!");
        double double14 = student3.getHourlyRate();
        java.lang.String str15 = student3.getAccountType();
        double double16 = student3.getHourlyRate();
        double double17 = student3.getHourlyRate();
        student3.login("", "hi!");
        student3.logout();
        student3.login("hi!", "student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 20.0d + "'", double14 == 20.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "student" + "'", str15, "student");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 20.0d + "'", double16 == 20.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 20.0d + "'", double17 == 20.0d);
    }

    @Test
    public void test16325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16325");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        student3.logout();
        student3.login("hi!", "hi!");
        double double8 = student3.getHourlyRate();
        java.lang.String str9 = student3.getID();
        java.lang.String str10 = student3.getEmail();
        student3.setVerified(true);
        boolean boolean13 = student3.isVerified();
        java.lang.String str14 = student3.getAccountType();
        java.lang.String str15 = student3.getPassword();
        student3.setVerified(true);
        java.lang.String str18 = student3.getPassword();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "student" + "'", str14, "student");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test16326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16326");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        student3.logout();
        student3.login("hi!", "hi!");
        java.lang.String str8 = student3.getID();
        java.lang.String str9 = student3.getEmail();
        student3.login("hi!", "");
        java.lang.String str13 = student3.getAccountType();
        java.lang.String str14 = student3.getAccountType();
        java.lang.String str15 = student3.getID();
        java.lang.Class<?> wildcardClass16 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "student" + "'", str13, "student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "student" + "'", str14, "student");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test16327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16327");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        double double6 = student3.getHourlyRate();
        student3.logout();
        student3.viewProfile();
        java.lang.String str9 = student3.getEmail();
        boolean boolean10 = student3.isVerified();
        double double11 = student3.getHourlyRate();
        student3.viewProfile();
        double double13 = student3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 20.0d + "'", double13 == 20.0d);
    }

    @Test
    public void test16328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16328");
        model.Student student3 = new model.Student("student", "hi!", "hi!");
        java.lang.String str4 = student3.getAccountType();
        student3.logout();
        java.lang.String str6 = student3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "student" + "'", str4, "student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test16329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16329");
        model.Student student3 = new model.Student("", "hi!", "hi!");
        java.lang.String str4 = student3.getAccountType();
        student3.viewProfile();
        student3.logout();
        java.lang.String str7 = student3.getPassword();
        student3.logout();
        double double9 = student3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "student" + "'", str4, "student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
    }

    @Test
    public void test16330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16330");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getEmail();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        student3.login("hi!", "student");
        double double11 = student3.getHourlyRate();
        java.lang.String str12 = student3.getAccountType();
        student3.logout();
        java.lang.String str14 = student3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "student" + "'", str12, "student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test16331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16331");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        student3.setVerified(false);
        java.lang.String str10 = student3.getAccountType();
        java.lang.String str11 = student3.getEmail();
        student3.logout();
        student3.setVerified(false);
        student3.login("", "");
        java.lang.String str18 = student3.getID();
        java.lang.String str19 = student3.getEmail();
        student3.login("hi!", "student");
        double double23 = student3.getHourlyRate();
        double double24 = student3.getHourlyRate();
        java.lang.String str25 = student3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "student" + "'", str10, "student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 20.0d + "'", double23 == 20.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 20.0d + "'", double24 == 20.0d);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test16332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16332");
        model.Student student3 = new model.Student("", "student", "student");
        student3.setVerified(true);
        java.lang.String str6 = student3.getPassword();
        boolean boolean7 = student3.isVerified();
        java.lang.String str8 = student3.getEmail();
        double double9 = student3.getHourlyRate();
        student3.login("", "student");
        student3.logout();
        java.lang.String str14 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "student" + "'", str14, "student");
    }

    @Test
    public void test16333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16333");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        student3.setVerified(false);
        java.lang.String str9 = student3.getID();
        student3.setVerified(false);
        student3.logout();
        java.lang.String str13 = student3.getAccountType();
        student3.login("student", "student");
        student3.setVerified(false);
        student3.viewProfile();
        boolean boolean20 = student3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "student" + "'", str13, "student");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test16334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16334");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        student3.logout();
        student3.login("hi!", "hi!");
        double double8 = student3.getHourlyRate();
        java.lang.String str9 = student3.getID();
        student3.logout();
        java.lang.String str11 = student3.getID();
        student3.viewProfile();
        java.lang.String str13 = student3.getID();
        java.lang.String str14 = student3.getAccountType();
        boolean boolean15 = student3.isVerified();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "student" + "'", str14, "student");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test16335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16335");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        double double6 = student3.getHourlyRate();
        java.lang.String str7 = student3.getPassword();
        student3.logout();
        student3.logout();
        java.lang.String str10 = student3.getPassword();
        java.lang.String str11 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "student" + "'", str11, "student");
    }

    @Test
    public void test16336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16336");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        student3.setVerified(false);
        java.lang.String str10 = student3.getID();
        student3.viewProfile();
        student3.login("", "");
        java.lang.String str15 = student3.getPassword();
        double double16 = student3.getHourlyRate();
        java.lang.String str17 = student3.getEmail();
        java.lang.String str18 = student3.getEmail();
        java.lang.String str19 = student3.getEmail();
        java.lang.String str20 = student3.getAccountType();
        java.lang.String str21 = student3.getID();
        student3.login("student", "hi!");
        boolean boolean25 = student3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 20.0d + "'", double16 == 20.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "student" + "'", str20, "student");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test16337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16337");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        boolean boolean7 = student3.isVerified();
        student3.logout();
        java.lang.String str9 = student3.getID();
        student3.setVerified(true);
        student3.viewProfile();
        student3.viewProfile();
        student3.logout();
        boolean boolean15 = student3.isVerified();
        student3.viewProfile();
        student3.setVerified(false);
        student3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test16338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16338");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        student3.setVerified(false);
        student3.viewProfile();
        java.lang.String str7 = student3.getEmail();
        double double8 = student3.getHourlyRate();
        java.lang.String str9 = student3.getID();
        java.lang.String str10 = student3.getAccountType();
        double double11 = student3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "student" + "'", str10, "student");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
    }

    @Test
    public void test16339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16339");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        student3.setVerified(false);
        java.lang.String str10 = student3.getID();
        student3.viewProfile();
        double double12 = student3.getHourlyRate();
        java.lang.String str13 = student3.getEmail();
        java.lang.String str14 = student3.getPassword();
        student3.login("hi!", "student");
        student3.login("hi!", "hi!");
        java.lang.String str21 = student3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 20.0d + "'", double12 == 20.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test16340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16340");
        model.Student student3 = new model.Student("", "", "hi!");
        student3.logout();
        java.lang.String str5 = student3.getID();
        java.lang.String str6 = student3.getEmail();
        java.lang.String str7 = student3.getPassword();
        java.lang.String str8 = student3.getID();
        student3.logout();
        java.lang.String str10 = student3.getAccountType();
        java.lang.String str11 = student3.getEmail();
        java.lang.String str12 = student3.getPassword();
        java.lang.String str13 = student3.getID();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "student" + "'", str10, "student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test16341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16341");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        java.lang.String str4 = student3.getAccountType();
        java.lang.String str5 = student3.getID();
        student3.setVerified(true);
        java.lang.String str8 = student3.getAccountType();
        java.lang.String str9 = student3.getPassword();
        java.lang.String str10 = student3.getPassword();
        student3.viewProfile();
        java.lang.String str12 = student3.getID();
        boolean boolean13 = student3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "student" + "'", str4, "student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test16342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16342");
        model.Student student3 = new model.Student("student", "hi!", "student");
        java.lang.String str4 = student3.getID();
        student3.login("", "");
        java.lang.Class<?> wildcardClass8 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "student" + "'", str4, "student");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test16343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16343");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        java.lang.String str6 = student3.getPassword();
        java.lang.String str7 = student3.getPassword();
        java.lang.String str8 = student3.getID();
        java.lang.String str9 = student3.getID();
        student3.viewProfile();
        java.lang.String str11 = student3.getPassword();
        student3.viewProfile();
        java.lang.String str13 = student3.getID();
        java.lang.String str14 = student3.getEmail();
        student3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test16344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16344");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        java.lang.String str7 = student3.getID();
        student3.login("hi!", "");
        java.lang.String str11 = student3.getPassword();
        student3.setVerified(false);
        java.lang.String str14 = student3.getID();
        student3.setVerified(true);
        java.lang.String str17 = student3.getEmail();
        java.lang.String str18 = student3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test16345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16345");
        model.Student student3 = new model.Student("hi!", "hi!", "");
        student3.logout();
        student3.setVerified(true);
        boolean boolean7 = student3.isVerified();
        student3.logout();
        java.lang.String str9 = student3.getAccountType();
        boolean boolean10 = student3.isVerified();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "student" + "'", str9, "student");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test16346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16346");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        student3.setVerified(false);
        java.lang.String str10 = student3.getID();
        double double11 = student3.getHourlyRate();
        student3.viewProfile();
        java.lang.String str13 = student3.getID();
        double double14 = student3.getHourlyRate();
        student3.logout();
        java.lang.String str16 = student3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 20.0d + "'", double14 == 20.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test16347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16347");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        student3.setVerified(false);
        java.lang.String str9 = student3.getID();
        student3.setVerified(false);
        student3.logout();
        student3.setVerified(false);
        java.lang.String str15 = student3.getPassword();
        student3.setVerified(true);
        double double18 = student3.getHourlyRate();
        java.lang.String str19 = student3.getPassword();
        java.lang.String str20 = student3.getID();
        double double21 = student3.getHourlyRate();
        java.lang.String str22 = student3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 20.0d + "'", double18 == 20.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 20.0d + "'", double21 == 20.0d);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test16348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16348");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        student3.setVerified(false);
        java.lang.String str10 = student3.getAccountType();
        java.lang.String str11 = student3.getEmail();
        student3.logout();
        student3.setVerified(false);
        student3.login("", "");
        student3.login("", "student");
        double double21 = student3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "student" + "'", str10, "student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 20.0d + "'", double21 == 20.0d);
    }

    @Test
    public void test16349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16349");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        java.lang.String str6 = student3.getPassword();
        student3.setVerified(false);
        boolean boolean9 = student3.isVerified();
        student3.login("", "hi!");
        java.lang.Class<?> wildcardClass13 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test16350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16350");
        model.Student student3 = new model.Student("", "", "hi!");
        student3.logout();
        java.lang.String str5 = student3.getID();
        java.lang.String str6 = student3.getPassword();
        double double7 = student3.getHourlyRate();
        double double8 = student3.getHourlyRate();
        double double9 = student3.getHourlyRate();
        java.lang.String str10 = student3.getPassword();
        student3.setVerified(false);
        student3.viewProfile();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test16351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16351");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.viewProfile();
        student3.login("student", "");
        boolean boolean11 = student3.isVerified();
        student3.viewProfile();
        student3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test16352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16352");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        boolean boolean7 = student3.isVerified();
        student3.login("", "hi!");
        boolean boolean11 = student3.isVerified();
        boolean boolean12 = student3.isVerified();
        java.lang.String str13 = student3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test16353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16353");
        model.Student student3 = new model.Student("hi!", "hi!", "");
        student3.viewProfile();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.viewProfile();
        double double8 = student3.getHourlyRate();
        student3.setVerified(false);
        student3.login("student", "student");
        java.lang.String str14 = student3.getPassword();
        student3.setVerified(false);
        java.lang.String str17 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "student" + "'", str17, "student");
    }

    @Test
    public void test16354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16354");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        double double6 = student3.getHourlyRate();
        java.lang.String str7 = student3.getID();
        boolean boolean8 = student3.isVerified();
        student3.setVerified(true);
        student3.setVerified(true);
        student3.viewProfile();
        student3.viewProfile();
        student3.setVerified(true);
        java.lang.String str17 = student3.getPassword();
        student3.setVerified(true);
        java.lang.String str20 = student3.getPassword();
        double double21 = student3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 20.0d + "'", double21 == 20.0d);
    }

    @Test
    public void test16355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16355");
        model.Student student3 = new model.Student("", "", "student");
        java.lang.String str4 = student3.getID();
        double double5 = student3.getHourlyRate();
        student3.logout();
        java.lang.String str7 = student3.getPassword();
        student3.viewProfile();
        java.lang.String str9 = student3.getEmail();
        student3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "student" + "'", str4, "student");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test16356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16356");
        model.Student student3 = new model.Student("hi!", "", "student");
        java.lang.String str4 = student3.getPassword();
        double double5 = student3.getHourlyRate();
        student3.logout();
        java.lang.String str7 = student3.getID();
        java.lang.String str8 = student3.getID();
        boolean boolean9 = student3.isVerified();
        student3.login("", "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test16357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16357");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.login("", "");
        double double10 = student3.getHourlyRate();
        java.lang.String str11 = student3.getPassword();
        double double12 = student3.getHourlyRate();
        java.lang.String str13 = student3.getPassword();
        double double14 = student3.getHourlyRate();
        student3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 20.0d + "'", double12 == 20.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 20.0d + "'", double14 == 20.0d);
    }

    @Test
    public void test16358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16358");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        java.lang.String str6 = student3.getPassword();
        student3.setVerified(false);
        student3.setVerified(false);
        java.lang.String str11 = student3.getAccountType();
        student3.logout();
        student3.viewProfile();
        java.lang.String str14 = student3.getAccountType();
        student3.logout();
        java.lang.String str16 = student3.getPassword();
        student3.setVerified(false);
        student3.logout();
        student3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "student" + "'", str11, "student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "student" + "'", str14, "student");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test16359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16359");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        student3.setVerified(false);
        student3.viewProfile();
        java.lang.String str7 = student3.getEmail();
        java.lang.String str8 = student3.getAccountType();
        student3.logout();
        boolean boolean10 = student3.isVerified();
        student3.login("", "hi!");
        double double14 = student3.getHourlyRate();
        java.lang.String str15 = student3.getAccountType();
        student3.viewProfile();
        java.lang.String str17 = student3.getAccountType();
        boolean boolean18 = student3.isVerified();
        java.lang.String str19 = student3.getPassword();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 20.0d + "'", double14 == 20.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "student" + "'", str15, "student");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "student" + "'", str17, "student");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test16360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16360");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        java.lang.String str4 = student3.getAccountType();
        java.lang.String str5 = student3.getID();
        student3.setVerified(true);
        java.lang.String str8 = student3.getID();
        student3.logout();
        boolean boolean10 = student3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "student" + "'", str4, "student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test16361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16361");
        model.Student student3 = new model.Student("", "", "hi!");
        student3.logout();
        java.lang.String str5 = student3.getID();
        java.lang.String str6 = student3.getEmail();
        double double7 = student3.getHourlyRate();
        boolean boolean8 = student3.isVerified();
        boolean boolean9 = student3.isVerified();
        student3.viewProfile();
        double double11 = student3.getHourlyRate();
        student3.logout();
        student3.logout();
        java.lang.String str14 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "student" + "'", str14, "student");
    }

    @Test
    public void test16362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16362");
        model.Student student3 = new model.Student("hi!", "hi!", "");
        java.lang.String str4 = student3.getPassword();
        student3.viewProfile();
        student3.login("", "");
        java.lang.String str9 = student3.getEmail();
        double double10 = student3.getHourlyRate();
        student3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
    }

    @Test
    public void test16363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16363");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        java.lang.String str4 = student3.getAccountType();
        java.lang.String str5 = student3.getID();
        student3.setVerified(true);
        java.lang.String str8 = student3.getAccountType();
        java.lang.String str9 = student3.getPassword();
        java.lang.String str10 = student3.getPassword();
        student3.viewProfile();
        student3.login("student", "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "student" + "'", str4, "student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test16364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16364");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        student3.logout();
        student3.login("hi!", "hi!");
        double double8 = student3.getHourlyRate();
        boolean boolean9 = student3.isVerified();
        boolean boolean10 = student3.isVerified();
        boolean boolean11 = student3.isVerified();
        boolean boolean12 = student3.isVerified();
        student3.logout();
        student3.logout();
        java.lang.String str15 = student3.getEmail();
        student3.logout();
        student3.login("", "");
        boolean boolean20 = student3.isVerified();
        student3.logout();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test16365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16365");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        boolean boolean7 = student3.isVerified();
        java.lang.String str8 = student3.getID();
        java.lang.String str9 = student3.getAccountType();
        student3.logout();
        student3.viewProfile();
        boolean boolean12 = student3.isVerified();
        java.lang.String str13 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "student" + "'", str9, "student");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "student" + "'", str13, "student");
    }

    @Test
    public void test16366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16366");
        model.Student student3 = new model.Student("student", "", "");
        student3.logout();
        java.lang.String str5 = student3.getPassword();
        boolean boolean6 = student3.isVerified();
        java.lang.String str7 = student3.getEmail();
        student3.setVerified(true);
        student3.viewProfile();
        java.lang.String str11 = student3.getAccountType();
        java.lang.String str12 = student3.getPassword();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "student" + "'", str11, "student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test16367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16367");
        model.Student student3 = new model.Student("", "", "hi!");
        student3.login("", "");
        java.lang.String str7 = student3.getPassword();
        student3.setVerified(false);
        boolean boolean10 = student3.isVerified();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test16368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16368");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        student3.setVerified(false);
        java.lang.String str6 = student3.getPassword();
        java.lang.String str7 = student3.getAccountType();
        java.lang.String str8 = student3.getEmail();
        student3.setVerified(true);
        boolean boolean11 = student3.isVerified();
        java.lang.String str12 = student3.getPassword();
        boolean boolean13 = student3.isVerified();
        java.lang.String str14 = student3.getEmail();
        double double15 = student3.getHourlyRate();
        double double16 = student3.getHourlyRate();
        student3.logout();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 20.0d + "'", double15 == 20.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 20.0d + "'", double16 == 20.0d);
    }

    @Test
    public void test16369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16369");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getAccountType();
        student3.logout();
        java.lang.String str8 = student3.getEmail();
        student3.viewProfile();
        boolean boolean10 = student3.isVerified();
        java.lang.String str11 = student3.getID();
        java.lang.String str12 = student3.getEmail();
        double double13 = student3.getHourlyRate();
        double double14 = student3.getHourlyRate();
        java.lang.String str15 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 20.0d + "'", double13 == 20.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 20.0d + "'", double14 == 20.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "student" + "'", str15, "student");
    }

    @Test
    public void test16370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16370");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        student3.setVerified(false);
        java.lang.String str10 = student3.getAccountType();
        java.lang.String str11 = student3.getEmail();
        student3.logout();
        java.lang.String str13 = student3.getID();
        student3.viewProfile();
        java.lang.String str15 = student3.getPassword();
        double double16 = student3.getHourlyRate();
        student3.login("", "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "student" + "'", str10, "student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 20.0d + "'", double16 == 20.0d);
    }

    @Test
    public void test16371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16371");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getEmail();
        boolean boolean6 = student3.isVerified();
        student3.setVerified(false);
        student3.viewProfile();
        java.lang.String str10 = student3.getEmail();
        double double11 = student3.getHourlyRate();
        student3.setVerified(true);
        boolean boolean14 = student3.isVerified();
        double double15 = student3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 20.0d + "'", double15 == 20.0d);
    }

    @Test
    public void test16372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16372");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.viewProfile();
        double double8 = student3.getHourlyRate();
        student3.logout();
        double double10 = student3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
    }

    @Test
    public void test16373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16373");
        model.Student student3 = new model.Student("", "", "hi!");
        student3.logout();
        java.lang.String str5 = student3.getID();
        java.lang.String str6 = student3.getEmail();
        double double7 = student3.getHourlyRate();
        boolean boolean8 = student3.isVerified();
        java.lang.String str9 = student3.getID();
        java.lang.String str10 = student3.getAccountType();
        double double11 = student3.getHourlyRate();
        java.lang.String str12 = student3.getPassword();
        java.lang.String str13 = student3.getEmail();
        student3.setVerified(false);
        java.lang.String str16 = student3.getID();
        java.lang.String str17 = student3.getPassword();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "student" + "'", str10, "student");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test16374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16374");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        student3.setVerified(false);
        java.lang.String str9 = student3.getID();
        student3.setVerified(false);
        java.lang.String str12 = student3.getID();
        java.lang.String str13 = student3.getID();
        double double14 = student3.getHourlyRate();
        student3.viewProfile();
        double double16 = student3.getHourlyRate();
        student3.logout();
        java.lang.Class<?> wildcardClass18 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 20.0d + "'", double14 == 20.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 20.0d + "'", double16 == 20.0d);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test16375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16375");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        student3.setVerified(false);
        java.lang.String str9 = student3.getID();
        student3.setVerified(false);
        student3.logout();
        java.lang.String str13 = student3.getAccountType();
        student3.login("student", "student");
        student3.login("", "hi!");
        student3.viewProfile();
        double double21 = student3.getHourlyRate();
        student3.login("", "hi!");
        java.lang.String str25 = student3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "student" + "'", str13, "student");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 20.0d + "'", double21 == 20.0d);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test16376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16376");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        java.lang.String str8 = student3.getPassword();
        student3.setVerified(false);
        student3.logout();
        student3.viewProfile();
        java.lang.String str13 = student3.getAccountType();
        student3.viewProfile();
        boolean boolean15 = student3.isVerified();
        java.lang.String str16 = student3.getID();
        java.lang.String str17 = student3.getEmail();
        double double18 = student3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "student" + "'", str13, "student");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 20.0d + "'", double18 == 20.0d);
    }

    @Test
    public void test16377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16377");
        model.Student student3 = new model.Student("", "", "hi!");
        student3.logout();
        java.lang.String str5 = student3.getID();
        java.lang.String str6 = student3.getEmail();
        java.lang.String str7 = student3.getPassword();
        java.lang.String str8 = student3.getID();
        student3.logout();
        student3.logout();
        student3.viewProfile();
        java.lang.String str12 = student3.getID();
        double double13 = student3.getHourlyRate();
        java.lang.String str14 = student3.getPassword();
        student3.viewProfile();
        java.lang.String str16 = student3.getID();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 20.0d + "'", double13 == 20.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test16378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16378");
        model.Student student3 = new model.Student("hi!", "hi!", "student");
        student3.login("hi!", "hi!");
        double double7 = student3.getHourlyRate();
        java.lang.String str8 = student3.getPassword();
        java.lang.String str9 = student3.getID();
        java.lang.String str10 = student3.getPassword();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "student" + "'", str9, "student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test16379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16379");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        java.lang.String str6 = student3.getPassword();
        student3.setVerified(false);
        student3.login("student", "student");
        boolean boolean12 = student3.isVerified();
        java.lang.String str13 = student3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test16380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16380");
        model.Student student3 = new model.Student("", "", "hi!");
        student3.logout();
        java.lang.String str5 = student3.getID();
        java.lang.String str6 = student3.getEmail();
        java.lang.String str7 = student3.getPassword();
        java.lang.String str8 = student3.getID();
        student3.logout();
        java.lang.String str10 = student3.getAccountType();
        student3.viewProfile();
        java.lang.String str12 = student3.getID();
        java.lang.String str13 = student3.getID();
        student3.viewProfile();
        java.lang.String str15 = student3.getAccountType();
        student3.viewProfile();
        java.lang.String str17 = student3.getPassword();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "student" + "'", str10, "student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "student" + "'", str15, "student");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test16381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16381");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getAccountType();
        student3.logout();
        boolean boolean8 = student3.isVerified();
        student3.setVerified(true);
        student3.setVerified(false);
        boolean boolean13 = student3.isVerified();
        student3.setVerified(false);
        java.lang.String str16 = student3.getAccountType();
        java.lang.String str17 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "student" + "'", str16, "student");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "student" + "'", str17, "student");
    }

    @Test
    public void test16382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16382");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        student3.setVerified(false);
        student3.viewProfile();
        java.lang.String str11 = student3.getEmail();
        student3.viewProfile();
        boolean boolean13 = student3.isVerified();
        student3.viewProfile();
        java.lang.String str15 = student3.getEmail();
        student3.login("", "");
        java.lang.String str19 = student3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test16383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16383");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        java.lang.String str4 = student3.getAccountType();
        java.lang.String str5 = student3.getEmail();
        student3.viewProfile();
        student3.logout();
        student3.viewProfile();
        student3.login("", "");
        java.lang.String str12 = student3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "student" + "'", str4, "student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test16384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16384");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        double double6 = student3.getHourlyRate();
        java.lang.String str7 = student3.getID();
        student3.setVerified(false);
        java.lang.String str10 = student3.getAccountType();
        java.lang.String str11 = student3.getAccountType();
        java.lang.String str12 = student3.getID();
        student3.setVerified(false);
        double double15 = student3.getHourlyRate();
        double double16 = student3.getHourlyRate();
        student3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "student" + "'", str10, "student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "student" + "'", str11, "student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 20.0d + "'", double15 == 20.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 20.0d + "'", double16 == 20.0d);
    }

    @Test
    public void test16385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16385");
        model.Student student3 = new model.Student("", "", "hi!");
        student3.logout();
        java.lang.String str5 = student3.getID();
        java.lang.String str6 = student3.getEmail();
        java.lang.String str7 = student3.getPassword();
        java.lang.String str8 = student3.getID();
        student3.logout();
        student3.logout();
        student3.viewProfile();
        java.lang.String str12 = student3.getAccountType();
        student3.viewProfile();
        boolean boolean14 = student3.isVerified();
        boolean boolean15 = student3.isVerified();
        student3.login("", "hi!");
        java.lang.String str19 = student3.getID();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "student" + "'", str12, "student");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test16386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16386");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getID();
        student3.setVerified(true);
        java.lang.String str8 = student3.getID();
        student3.logout();
        student3.login("student", "");
        student3.login("hi!", "student");
        student3.viewProfile();
        java.lang.Class<?> wildcardClass17 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test16387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16387");
        model.Student student3 = new model.Student("", "", "hi!");
        student3.logout();
        java.lang.String str5 = student3.getID();
        java.lang.String str6 = student3.getPassword();
        java.lang.String str7 = student3.getAccountType();
        student3.setVerified(false);
        java.lang.String str10 = student3.getID();
        java.lang.String str11 = student3.getID();
        student3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test16388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16388");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        java.lang.String str7 = student3.getID();
        student3.setVerified(true);
        java.lang.String str10 = student3.getEmail();
        student3.setVerified(true);
        student3.logout();
        java.lang.String str14 = student3.getAccountType();
        student3.login("student", "student");
        java.lang.String str18 = student3.getEmail();
        java.lang.Class<?> wildcardClass19 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "student" + "'", str14, "student");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test16389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16389");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getAccountType();
        student3.logout();
        java.lang.String str8 = student3.getEmail();
        student3.viewProfile();
        boolean boolean10 = student3.isVerified();
        student3.viewProfile();
        double double12 = student3.getHourlyRate();
        student3.logout();
        java.lang.String str14 = student3.getAccountType();
        student3.viewProfile();
        java.lang.String str16 = student3.getAccountType();
        java.lang.String str17 = student3.getPassword();
        student3.login("student", "");
        java.lang.String str21 = student3.getAccountType();
        java.lang.String str22 = student3.getEmail();
        java.lang.String str23 = student3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 20.0d + "'", double12 == 20.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "student" + "'", str14, "student");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "student" + "'", str16, "student");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "student" + "'", str21, "student");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test16390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16390");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        student3.login("", "hi!");
        student3.logout();
        java.lang.String str11 = student3.getPassword();
        student3.login("hi!", "hi!");
        boolean boolean15 = student3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test16391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16391");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        java.lang.String str8 = student3.getEmail();
        student3.viewProfile();
        java.lang.String str10 = student3.getEmail();
        java.lang.String str11 = student3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test16392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16392");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        java.lang.String str8 = student3.getAccountType();
        java.lang.String str9 = student3.getAccountType();
        java.lang.String str10 = student3.getID();
        java.lang.String str11 = student3.getID();
        student3.login("", "student");
        java.lang.String str15 = student3.getEmail();
        boolean boolean16 = student3.isVerified();
        student3.viewProfile();
        java.lang.String str18 = student3.getEmail();
        java.lang.String str19 = student3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "student" + "'", str9, "student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test16393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16393");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        java.lang.String str8 = student3.getPassword();
        java.lang.String str9 = student3.getID();
        student3.logout();
        java.lang.String str11 = student3.getEmail();
        java.lang.String str12 = student3.getAccountType();
        student3.login("hi!", "student");
        student3.logout();
        boolean boolean17 = student3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "student" + "'", str12, "student");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test16394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16394");
        model.Student student3 = new model.Student("student", "hi!", "");
        student3.login("hi!", "hi!");
        student3.logout();
        java.lang.String str8 = student3.getEmail();
        student3.setVerified(true);
        student3.setVerified(false);
        student3.setVerified(true);
        student3.login("", "hi!");
        student3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
    }

    @Test
    public void test16395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16395");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        student3.logout();
        java.lang.String str5 = student3.getAccountType();
        student3.viewProfile();
        boolean boolean7 = student3.isVerified();
        double double8 = student3.getHourlyRate();
        java.lang.String str9 = student3.getPassword();
        student3.login("student", "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test16396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16396");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        student3.setVerified(false);
        java.lang.String str10 = student3.getID();
        student3.viewProfile();
        student3.login("", "");
        double double15 = student3.getHourlyRate();
        student3.login("student", "");
        java.lang.String str19 = student3.getEmail();
        java.lang.String str20 = student3.getEmail();
        boolean boolean21 = student3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 20.0d + "'", double15 == 20.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test16397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16397");
        model.Student student3 = new model.Student("hi!", "hi!", "student");
        student3.login("hi!", "hi!");
        double double7 = student3.getHourlyRate();
        java.lang.String str8 = student3.getEmail();
        java.lang.String str9 = student3.getAccountType();
        double double10 = student3.getHourlyRate();
        student3.login("", "student");
        java.lang.String str14 = student3.getPassword();
        java.lang.String str15 = student3.getID();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "student" + "'", str9, "student");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "student" + "'", str15, "student");
    }

    @Test
    public void test16398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16398");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        student3.logout();
        student3.login("hi!", "hi!");
        student3.viewProfile();
        java.lang.String str9 = student3.getPassword();
        java.lang.String str10 = student3.getID();
        student3.logout();
        student3.login("", "student");
        java.lang.String str15 = student3.getID();
        boolean boolean16 = student3.isVerified();
        java.lang.String str17 = student3.getEmail();
        student3.viewProfile();
        java.lang.Class<?> wildcardClass19 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test16399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16399");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        student3.setVerified(false);
        java.lang.String str6 = student3.getPassword();
        java.lang.String str7 = student3.getAccountType();
        student3.viewProfile();
        double double9 = student3.getHourlyRate();
        double double10 = student3.getHourlyRate();
        java.lang.String str11 = student3.getAccountType();
        student3.setVerified(false);
        java.lang.String str14 = student3.getID();
        student3.viewProfile();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "student" + "'", str11, "student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test16400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16400");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        double double6 = student3.getHourlyRate();
        java.lang.String str7 = student3.getPassword();
        java.lang.String str8 = student3.getPassword();
        student3.login("student", "hi!");
        student3.login("hi!", "");
        student3.setVerified(false);
        java.lang.String str17 = student3.getEmail();
        java.lang.String str18 = student3.getAccountType();
        student3.logout();
        student3.viewProfile();
        boolean boolean21 = student3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "student" + "'", str18, "student");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test16401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16401");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        student3.setVerified(false);
        java.lang.String str10 = student3.getID();
        student3.viewProfile();
        java.lang.String str12 = student3.getID();
        student3.setVerified(false);
        student3.setVerified(true);
        boolean boolean17 = student3.isVerified();
        student3.login("", "student");
        student3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test16402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16402");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        double double6 = student3.getHourlyRate();
        student3.logout();
        student3.viewProfile();
        java.lang.String str9 = student3.getEmail();
        boolean boolean10 = student3.isVerified();
        double double11 = student3.getHourlyRate();
        student3.viewProfile();
        boolean boolean13 = student3.isVerified();
        student3.logout();
        double double15 = student3.getHourlyRate();
        student3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 20.0d + "'", double15 == 20.0d);
    }

    @Test
    public void test16403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16403");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        java.lang.String str8 = student3.getPassword();
        java.lang.String str9 = student3.getID();
        double double10 = student3.getHourlyRate();
        student3.logout();
        java.lang.String str12 = student3.getEmail();
        java.lang.String str13 = student3.getID();
        double double14 = student3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 20.0d + "'", double14 == 20.0d);
    }

    @Test
    public void test16404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16404");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        student3.login("", "hi!");
        student3.logout();
        student3.login("", "hi!");
        student3.logout();
        java.lang.String str15 = student3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test16405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16405");
        model.Student student3 = new model.Student("hi!", "student", "");
        student3.logout();
        java.lang.String str5 = student3.getEmail();
        java.lang.String str6 = student3.getEmail();
        double double7 = student3.getHourlyRate();
        student3.setVerified(false);
        student3.viewProfile();
        student3.login("", "");
        student3.viewProfile();
        java.lang.String str15 = student3.getEmail();
        java.lang.String str16 = student3.getPassword();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "student" + "'", str16, "student");
    }

    @Test
    public void test16406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16406");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        java.lang.String str8 = student3.getAccountType();
        java.lang.String str9 = student3.getAccountType();
        java.lang.String str10 = student3.getID();
        student3.setVerified(false);
        boolean boolean13 = student3.isVerified();
        double double14 = student3.getHourlyRate();
        double double15 = student3.getHourlyRate();
        java.lang.Class<?> wildcardClass16 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "student" + "'", str9, "student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 20.0d + "'", double14 == 20.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 20.0d + "'", double15 == 20.0d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test16407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16407");
        model.Student student3 = new model.Student("", "", "hi!");
        student3.logout();
        java.lang.String str5 = student3.getID();
        java.lang.String str6 = student3.getEmail();
        student3.viewProfile();
        student3.setVerified(false);
        student3.logout();
        java.lang.String str11 = student3.getEmail();
        student3.setVerified(false);
        boolean boolean14 = student3.isVerified();
        java.lang.String str15 = student3.getPassword();
        student3.login("", "student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test16408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16408");
        model.Student student3 = new model.Student("", "", "");
        student3.viewProfile();
        double double5 = student3.getHourlyRate();
        java.lang.String str6 = student3.getEmail();
        java.lang.String str7 = student3.getID();
        java.lang.String str8 = student3.getPassword();
        student3.login("hi!", "student");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test16409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16409");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        student3.setVerified(false);
        java.lang.String str10 = student3.getID();
        double double11 = student3.getHourlyRate();
        java.lang.String str12 = student3.getPassword();
        student3.login("hi!", "hi!");
        java.lang.String str16 = student3.getEmail();
        java.lang.String str17 = student3.getEmail();
        student3.login("", "");
        student3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test16410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16410");
        model.Student student3 = new model.Student("", "hi!", "hi!");
        student3.login("student", "student");
        java.lang.String str7 = student3.getID();
        java.lang.String str8 = student3.getPassword();
        student3.setVerified(false);
        java.lang.String str11 = student3.getAccountType();
        student3.login("student", "");
        student3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "student" + "'", str11, "student");
    }

    @Test
    public void test16411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16411");
        model.Student student3 = new model.Student("", "student", "");
        student3.setVerified(true);
        student3.viewProfile();
        java.lang.String str7 = student3.getEmail();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test16412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16412");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        student3.setVerified(false);
        java.lang.String str6 = student3.getEmail();
        java.lang.String str7 = student3.getAccountType();
        java.lang.String str8 = student3.getEmail();
        student3.logout();
        java.lang.String str10 = student3.getID();
        student3.login("student", "hi!");
        student3.login("", "");
        java.lang.String str17 = student3.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test16413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16413");
        model.Student student3 = new model.Student("", "", "hi!");
        student3.login("", "");
        java.lang.String str7 = student3.getPassword();
        double double8 = student3.getHourlyRate();
        student3.viewProfile();
        student3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
    }

    @Test
    public void test16414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16414");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        java.lang.String str8 = student3.getAccountType();
        java.lang.String str9 = student3.getAccountType();
        student3.viewProfile();
        student3.logout();
        java.lang.String str12 = student3.getEmail();
        double double13 = student3.getHourlyRate();
        student3.logout();
        java.lang.Class<?> wildcardClass15 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "student" + "'", str9, "student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 20.0d + "'", double13 == 20.0d);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test16415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16415");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        student3.setVerified(false);
        java.lang.String str10 = student3.getID();
        student3.viewProfile();
        student3.login("", "");
        java.lang.String str15 = student3.getPassword();
        double double16 = student3.getHourlyRate();
        student3.setVerified(true);
        double double19 = student3.getHourlyRate();
        boolean boolean20 = student3.isVerified();
        boolean boolean21 = student3.isVerified();
        java.lang.String str22 = student3.getAccountType();
        double double23 = student3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 20.0d + "'", double16 == 20.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 20.0d + "'", double19 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "student" + "'", str22, "student");
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 20.0d + "'", double23 == 20.0d);
    }

    @Test
    public void test16416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16416");
        model.Student student3 = new model.Student("hi!", "student", "");
        student3.logout();
        student3.logout();
        student3.logout();
        double double7 = student3.getHourlyRate();
        boolean boolean8 = student3.isVerified();
        double double9 = student3.getHourlyRate();
        student3.login("", "student");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
    }

    @Test
    public void test16417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16417");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        boolean boolean7 = student3.isVerified();
        student3.logout();
        java.lang.String str9 = student3.getID();
        java.lang.String str10 = student3.getID();
        double double11 = student3.getHourlyRate();
        student3.logout();
        java.lang.String str13 = student3.getAccountType();
        java.lang.String str14 = student3.getAccountType();
        boolean boolean15 = student3.isVerified();
        double double16 = student3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "student" + "'", str13, "student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "student" + "'", str14, "student");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 20.0d + "'", double16 == 20.0d);
    }

    @Test
    public void test16418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16418");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        student3.logout();
        student3.login("hi!", "hi!");
        double double8 = student3.getHourlyRate();
        java.lang.String str9 = student3.getID();
        java.lang.String str10 = student3.getAccountType();
        student3.setVerified(true);
        student3.login("hi!", "hi!");
        java.lang.String str16 = student3.getPassword();
        java.lang.String str17 = student3.getID();
        java.lang.String str18 = student3.getPassword();
        student3.login("student", "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "student" + "'", str10, "student");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test16419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16419");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        java.lang.String str8 = student3.getPassword();
        student3.logout();
        java.lang.String str10 = student3.getID();
        double double11 = student3.getHourlyRate();
        student3.login("student", "hi!");
        java.lang.String str15 = student3.getEmail();
        java.lang.String str16 = student3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test16420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16420");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getAccountType();
        student3.logout();
        java.lang.String str8 = student3.getEmail();
        student3.viewProfile();
        java.lang.String str10 = student3.getID();
        student3.logout();
        student3.login("student", "");
        java.lang.String str15 = student3.getEmail();
        student3.logout();
        java.lang.String str17 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "student" + "'", str17, "student");
    }

    @Test
    public void test16421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16421");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        student3.setVerified(false);
        boolean boolean9 = student3.isVerified();
        java.lang.String str10 = student3.getPassword();
        java.lang.String str11 = student3.getPassword();
        double double12 = student3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 20.0d + "'", double12 == 20.0d);
    }

    @Test
    public void test16422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16422");
        model.Student student3 = new model.Student("", "", "hi!");
        student3.logout();
        java.lang.String str5 = student3.getID();
        java.lang.String str6 = student3.getEmail();
        double double7 = student3.getHourlyRate();
        boolean boolean8 = student3.isVerified();
        java.lang.String str9 = student3.getID();
        java.lang.String str10 = student3.getAccountType();
        java.lang.String str11 = student3.getAccountType();
        student3.setVerified(true);
        java.lang.Class<?> wildcardClass14 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "student" + "'", str10, "student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "student" + "'", str11, "student");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test16423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16423");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        student3.setVerified(false);
        boolean boolean9 = student3.isVerified();
        double double10 = student3.getHourlyRate();
        java.lang.String str11 = student3.getID();
        boolean boolean12 = student3.isVerified();
        java.lang.String str13 = student3.getAccountType();
        boolean boolean14 = student3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "student" + "'", str13, "student");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test16424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16424");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        java.lang.String str7 = student3.getID();
        student3.setVerified(true);
        java.lang.String str10 = student3.getEmail();
        student3.setVerified(false);
        student3.logout();
        student3.login("", "student");
        double double17 = student3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 20.0d + "'", double17 == 20.0d);
    }

    @Test
    public void test16425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16425");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getAccountType();
        student3.logout();
        boolean boolean8 = student3.isVerified();
        student3.logout();
        double double10 = student3.getHourlyRate();
        double double11 = student3.getHourlyRate();
        java.lang.String str12 = student3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test16426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16426");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        double double6 = student3.getHourlyRate();
        java.lang.String str7 = student3.getID();
        student3.setVerified(false);
        java.lang.String str10 = student3.getAccountType();
        java.lang.String str11 = student3.getAccountType();
        java.lang.String str12 = student3.getEmail();
        java.lang.String str13 = student3.getID();
        java.lang.Class<?> wildcardClass14 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "student" + "'", str10, "student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "student" + "'", str11, "student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test16427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16427");
        model.Student student3 = new model.Student("", "student", "");
        student3.login("student", "");
        boolean boolean7 = student3.isVerified();
        java.lang.String str8 = student3.getEmail();
        student3.login("hi!", "");
        java.lang.String str12 = student3.getEmail();
        student3.logout();
        double double14 = student3.getHourlyRate();
        java.lang.String str15 = student3.getEmail();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 20.0d + "'", double14 == 20.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test16428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16428");
        model.Student student3 = new model.Student("", "", "hi!");
        student3.logout();
        java.lang.String str5 = student3.getID();
        java.lang.String str6 = student3.getEmail();
        double double7 = student3.getHourlyRate();
        java.lang.String str8 = student3.getPassword();
        student3.login("hi!", "hi!");
        student3.logout();
        student3.viewProfile();
        java.lang.String str14 = student3.getAccountType();
        java.lang.String str15 = student3.getEmail();
        java.lang.String str16 = student3.getEmail();
        student3.logout();
        student3.logout();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "student" + "'", str14, "student");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test16429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16429");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        student3.setVerified(false);
        java.lang.String str6 = student3.getID();
        java.lang.String str7 = student3.getPassword();
        boolean boolean8 = student3.isVerified();
        student3.login("student", "student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test16430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16430");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        java.lang.String str7 = student3.getID();
        student3.setVerified(true);
        java.lang.String str10 = student3.getEmail();
        student3.setVerified(true);
        java.lang.String str13 = student3.getAccountType();
        boolean boolean14 = student3.isVerified();
        student3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "student" + "'", str13, "student");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test16431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16431");
        model.Student student3 = new model.Student("student", "hi!", "student");
        boolean boolean4 = student3.isVerified();
        java.lang.String str5 = student3.getAccountType();
        java.lang.String str6 = student3.getPassword();
        java.lang.String str7 = student3.getID();
        java.lang.String str8 = student3.getID();
        double double9 = student3.getHourlyRate();
        java.lang.String str10 = student3.getAccountType();
        boolean boolean11 = student3.isVerified();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "student" + "'", str10, "student");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test16432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16432");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        java.lang.String str4 = student3.getAccountType();
        java.lang.String str5 = student3.getID();
        student3.viewProfile();
        student3.setVerified(true);
        double double9 = student3.getHourlyRate();
        boolean boolean10 = student3.isVerified();
        student3.viewProfile();
        boolean boolean12 = student3.isVerified();
        java.lang.String str13 = student3.getPassword();
        java.lang.String str14 = student3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "student" + "'", str4, "student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test16433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16433");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        student3.logout();
        student3.login("hi!", "hi!");
        double double8 = student3.getHourlyRate();
        java.lang.String str9 = student3.getID();
        student3.logout();
        java.lang.String str11 = student3.getPassword();
        boolean boolean12 = student3.isVerified();
        double double13 = student3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 20.0d + "'", double13 == 20.0d);
    }

    @Test
    public void test16434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16434");
        model.Student student3 = new model.Student("", "", "hi!");
        student3.logout();
        java.lang.String str5 = student3.getID();
        java.lang.String str6 = student3.getEmail();
        java.lang.String str7 = student3.getID();
        boolean boolean8 = student3.isVerified();
        java.lang.String str9 = student3.getEmail();
        student3.viewProfile();
        student3.viewProfile();
        student3.login("student", "");
        student3.viewProfile();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test16435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16435");
        model.Student student3 = new model.Student("", "", "hi!");
        student3.login("", "");
        double double7 = student3.getHourlyRate();
        student3.login("student", "student");
        boolean boolean11 = student3.isVerified();
        java.lang.String str12 = student3.getID();
        student3.logout();
        student3.login("student", "");
        java.lang.String str17 = student3.getPassword();
        student3.setVerified(false);
        java.lang.String str20 = student3.getPassword();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test16436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16436");
        model.Student student3 = new model.Student("", "", "hi!");
        student3.logout();
        java.lang.String str5 = student3.getID();
        java.lang.String str6 = student3.getEmail();
        double double7 = student3.getHourlyRate();
        java.lang.String str8 = student3.getEmail();
        student3.login("", "");
        boolean boolean12 = student3.isVerified();
        student3.viewProfile();
        java.lang.String str14 = student3.getAccountType();
        java.lang.String str15 = student3.getEmail();
        boolean boolean16 = student3.isVerified();
        boolean boolean17 = student3.isVerified();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "student" + "'", str14, "student");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test16437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16437");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.login("", "");
        student3.login("student", "student");
        java.lang.String str13 = student3.getAccountType();
        java.lang.String str14 = student3.getEmail();
        java.lang.String str15 = student3.getPassword();
        java.lang.String str16 = student3.getPassword();
        student3.setVerified(false);
        student3.logout();
        java.lang.String str20 = student3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "student" + "'", str13, "student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test16438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16438");
        model.Student student3 = new model.Student("", "", "hi!");
        student3.logout();
        java.lang.String str5 = student3.getID();
        java.lang.String str6 = student3.getEmail();
        double double7 = student3.getHourlyRate();
        java.lang.String str8 = student3.getPassword();
        student3.logout();
        java.lang.String str10 = student3.getEmail();
        double double11 = student3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
    }

    @Test
    public void test16439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16439");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        student3.setVerified(false);
        student3.viewProfile();
        java.lang.String str7 = student3.getEmail();
        java.lang.String str8 = student3.getAccountType();
        java.lang.String str9 = student3.getID();
        java.lang.String str10 = student3.getAccountType();
        student3.setVerified(false);
        java.lang.String str13 = student3.getPassword();
        boolean boolean14 = student3.isVerified();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "student" + "'", str10, "student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test16440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16440");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        java.lang.String str8 = student3.getEmail();
        java.lang.String str9 = student3.getID();
        student3.logout();
        boolean boolean11 = student3.isVerified();
        student3.login("hi!", "");
        java.lang.String str15 = student3.getID();
        java.lang.String str16 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "student" + "'", str16, "student");
    }

    @Test
    public void test16441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16441");
        model.Student student3 = new model.Student("", "student", "");
        java.lang.String str4 = student3.getPassword();
        java.lang.String str5 = student3.getEmail();
        student3.login("hi!", "hi!");
        student3.logout();
        java.lang.String str10 = student3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "student" + "'", str4, "student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test16442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16442");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        double double6 = student3.getHourlyRate();
        student3.logout();
        student3.viewProfile();
        java.lang.String str9 = student3.getEmail();
        java.lang.String str10 = student3.getEmail();
        student3.logout();
        boolean boolean12 = student3.isVerified();
        boolean boolean13 = student3.isVerified();
        student3.login("", "student");
        student3.viewProfile();
        student3.login("student", "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test16443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16443");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        student3.setVerified(false);
        java.lang.String str9 = student3.getID();
        student3.setVerified(false);
        student3.logout();
        java.lang.String str13 = student3.getAccountType();
        java.lang.String str14 = student3.getPassword();
        java.lang.String str15 = student3.getAccountType();
        boolean boolean16 = student3.isVerified();
        boolean boolean17 = student3.isVerified();
        double double18 = student3.getHourlyRate();
        student3.viewProfile();
        java.lang.String str20 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "student" + "'", str13, "student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "student" + "'", str15, "student");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 20.0d + "'", double18 == 20.0d);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "student" + "'", str20, "student");
    }

    @Test
    public void test16444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16444");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        java.lang.String str6 = student3.getPassword();
        student3.setVerified(false);
        student3.setVerified(true);
        student3.viewProfile();
        java.lang.String str12 = student3.getID();
        java.lang.String str13 = student3.getAccountType();
        java.lang.String str14 = student3.getAccountType();
        java.lang.String str15 = student3.getAccountType();
        java.lang.String str16 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "student" + "'", str13, "student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "student" + "'", str14, "student");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "student" + "'", str15, "student");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "student" + "'", str16, "student");
    }

    @Test
    public void test16445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16445");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        student3.login("", "hi!");
        student3.login("student", "hi!");
        student3.login("", "");
        boolean boolean16 = student3.isVerified();
        student3.logout();
        student3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test16446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16446");
        model.Student student3 = new model.Student("hi!", "student", "");
        java.lang.String str4 = student3.getEmail();
        double double5 = student3.getHourlyRate();
        student3.login("", "student");
        java.lang.String str9 = student3.getPassword();
        java.lang.String str10 = student3.getEmail();
        student3.viewProfile();
        boolean boolean12 = student3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "student" + "'", str9, "student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test16447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16447");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        java.lang.Class<?> wildcardClass7 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test16448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16448");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        double double8 = student3.getHourlyRate();
        boolean boolean9 = student3.isVerified();
        student3.setVerified(false);
        java.lang.String str12 = student3.getAccountType();
        student3.logout();
        double double14 = student3.getHourlyRate();
        double double15 = student3.getHourlyRate();
        student3.viewProfile();
        student3.login("hi!", "student");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "student" + "'", str12, "student");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 20.0d + "'", double14 == 20.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 20.0d + "'", double15 == 20.0d);
    }

    @Test
    public void test16449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16449");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        boolean boolean7 = student3.isVerified();
        java.lang.String str8 = student3.getEmail();
        student3.setVerified(true);
        java.lang.String str11 = student3.getAccountType();
        java.lang.String str12 = student3.getEmail();
        student3.setVerified(true);
        student3.login("student", "hi!");
        student3.setVerified(true);
        student3.logout();
        student3.login("student", "student");
        java.lang.String str24 = student3.getAccountType();
        student3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "student" + "'", str11, "student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "student" + "'", str24, "student");
    }

    @Test
    public void test16450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16450");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        java.lang.String str7 = student3.getID();
        double double8 = student3.getHourlyRate();
        student3.logout();
        student3.logout();
        student3.setVerified(true);
        student3.logout();
        student3.setVerified(false);
        boolean boolean16 = student3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test16451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16451");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getAccountType();
        student3.logout();
        java.lang.String str8 = student3.getID();
        student3.setVerified(true);
        double double11 = student3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
    }

    @Test
    public void test16452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16452");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        student3.setVerified(false);
        boolean boolean7 = student3.isVerified();
        boolean boolean8 = student3.isVerified();
        double double9 = student3.getHourlyRate();
        java.lang.String str10 = student3.getPassword();
        java.lang.Class<?> wildcardClass11 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test16453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16453");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        student3.setVerified(false);
        boolean boolean9 = student3.isVerified();
        java.lang.String str10 = student3.getAccountType();
        java.lang.String str11 = student3.getID();
        student3.logout();
        student3.login("student", "student");
        double double16 = student3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "student" + "'", str10, "student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 20.0d + "'", double16 == 20.0d);
    }

    @Test
    public void test16454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16454");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getAccountType();
        student3.logout();
        java.lang.String str8 = student3.getEmail();
        student3.viewProfile();
        double double10 = student3.getHourlyRate();
        student3.login("", "");
        java.lang.String str14 = student3.getPassword();
        student3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test16455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16455");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        student3.setVerified(false);
        java.lang.String str9 = student3.getID();
        student3.setVerified(false);
        java.lang.String str12 = student3.getID();
        java.lang.String str13 = student3.getEmail();
        student3.login("", "student");
        java.lang.String str17 = student3.getPassword();
        student3.viewProfile();
        java.lang.String str19 = student3.getAccountType();
        boolean boolean20 = student3.isVerified();
        student3.viewProfile();
        java.lang.String str22 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "student" + "'", str19, "student");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "student" + "'", str22, "student");
    }

    @Test
    public void test16456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16456");
        model.Student student3 = new model.Student("", "", "hi!");
        student3.logout();
        java.lang.String str5 = student3.getID();
        java.lang.String str6 = student3.getEmail();
        double double7 = student3.getHourlyRate();
        java.lang.String str8 = student3.getPassword();
        student3.login("hi!", "hi!");
        student3.viewProfile();
        student3.login("", "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test16457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16457");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        student3.setVerified(false);
        java.lang.String str9 = student3.getID();
        student3.setVerified(false);
        student3.logout();
        student3.setVerified(false);
        java.lang.String str15 = student3.getPassword();
        student3.setVerified(true);
        double double18 = student3.getHourlyRate();
        java.lang.String str19 = student3.getPassword();
        java.lang.String str20 = student3.getID();
        double double21 = student3.getHourlyRate();
        student3.logout();
        student3.setVerified(false);
        java.lang.String str25 = student3.getID();
        java.lang.String str26 = student3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 20.0d + "'", double18 == 20.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 20.0d + "'", double21 == 20.0d);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test16458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16458");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        java.lang.String str4 = student3.getAccountType();
        java.lang.String str5 = student3.getID();
        student3.setVerified(true);
        boolean boolean8 = student3.isVerified();
        student3.logout();
        student3.viewProfile();
        java.lang.String str11 = student3.getEmail();
        boolean boolean12 = student3.isVerified();
        java.lang.String str13 = student3.getPassword();
        java.lang.String str14 = student3.getPassword();
        java.lang.String str15 = student3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "student" + "'", str4, "student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test16459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16459");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        student3.setVerified(false);
        student3.viewProfile();
        java.lang.String str7 = student3.getEmail();
        java.lang.String str8 = student3.getAccountType();
        student3.logout();
        boolean boolean10 = student3.isVerified();
        student3.login("hi!", "hi!");
        java.lang.String str14 = student3.getPassword();
        java.lang.Class<?> wildcardClass15 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test16460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16460");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        java.lang.String str7 = student3.getID();
        double double8 = student3.getHourlyRate();
        student3.logout();
        student3.logout();
        student3.setVerified(true);
        student3.viewProfile();
        java.lang.String str14 = student3.getPassword();
        student3.setVerified(false);
        java.lang.Class<?> wildcardClass17 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test16461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16461");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        student3.setVerified(false);
        boolean boolean9 = student3.isVerified();
        double double10 = student3.getHourlyRate();
        java.lang.String str11 = student3.getID();
        boolean boolean12 = student3.isVerified();
        student3.viewProfile();
        java.lang.String str14 = student3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test16462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16462");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        boolean boolean7 = student3.isVerified();
        student3.logout();
        java.lang.String str9 = student3.getID();
        student3.setVerified(true);
        student3.viewProfile();
        double double13 = student3.getHourlyRate();
        java.lang.String str14 = student3.getPassword();
        student3.viewProfile();
        student3.login("", "student");
        double double19 = student3.getHourlyRate();
        double double20 = student3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 20.0d + "'", double13 == 20.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 20.0d + "'", double19 == 20.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 20.0d + "'", double20 == 20.0d);
    }

    @Test
    public void test16463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16463");
        model.Student student3 = new model.Student("hi!", "hi!", "");
        student3.setVerified(true);
        student3.login("hi!", "hi!");
        java.lang.String str9 = student3.getID();
        student3.logout();
        student3.login("student", "");
        double double14 = student3.getHourlyRate();
        java.lang.String str15 = student3.getID();
        student3.logout();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 20.0d + "'", double14 == 20.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test16464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16464");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        double double6 = student3.getHourlyRate();
        java.lang.String str7 = student3.getPassword();
        student3.login("", "student");
        java.lang.String str11 = student3.getAccountType();
        java.lang.String str12 = student3.getAccountType();
        student3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "student" + "'", str11, "student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "student" + "'", str12, "student");
    }

    @Test
    public void test16465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16465");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        java.lang.String str6 = student3.getPassword();
        student3.setVerified(false);
        student3.setVerified(false);
        java.lang.String str11 = student3.getID();
        java.lang.String str12 = student3.getAccountType();
        student3.setVerified(false);
        java.lang.String str15 = student3.getAccountType();
        student3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "student" + "'", str12, "student");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "student" + "'", str15, "student");
    }

    @Test
    public void test16466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16466");
        model.Student student3 = new model.Student("hi!", "hi!", "");
        student3.logout();
        java.lang.String str5 = student3.getEmail();
        boolean boolean6 = student3.isVerified();
        student3.login("", "student");
        boolean boolean10 = student3.isVerified();
        student3.login("hi!", "student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test16467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16467");
        model.Student student3 = new model.Student("", "", "hi!");
        student3.logout();
        java.lang.String str5 = student3.getID();
        java.lang.String str6 = student3.getEmail();
        double double7 = student3.getHourlyRate();
        java.lang.String str8 = student3.getPassword();
        student3.login("hi!", "hi!");
        boolean boolean12 = student3.isVerified();
        student3.logout();
        java.lang.String str14 = student3.getPassword();
        student3.setVerified(true);
        java.lang.String str17 = student3.getID();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test16468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16468");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        java.lang.String str8 = student3.getAccountType();
        student3.setVerified(false);
        student3.viewProfile();
        java.lang.String str12 = student3.getAccountType();
        java.lang.String str13 = student3.getID();
        java.lang.String str14 = student3.getPassword();
        student3.login("hi!", "");
        java.lang.String str18 = student3.getAccountType();
        java.lang.String str19 = student3.getID();
        java.lang.String str20 = student3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "student" + "'", str12, "student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "student" + "'", str18, "student");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test16469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16469");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getAccountType();
        student3.logout();
        java.lang.String str8 = student3.getEmail();
        student3.viewProfile();
        java.lang.String str10 = student3.getID();
        boolean boolean11 = student3.isVerified();
        java.lang.String str12 = student3.getID();
        student3.setVerified(false);
        java.lang.String str15 = student3.getEmail();
        java.lang.String str16 = student3.getID();
        boolean boolean17 = student3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test16470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16470");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        java.lang.String str7 = student3.getID();
        student3.login("hi!", "");
        java.lang.String str11 = student3.getPassword();
        boolean boolean12 = student3.isVerified();
        boolean boolean13 = student3.isVerified();
        student3.setVerified(true);
        java.lang.String str16 = student3.getID();
        double double17 = student3.getHourlyRate();
        java.lang.String str18 = student3.getPassword();
        java.lang.String str19 = student3.getID();
        java.lang.String str20 = student3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 20.0d + "'", double17 == 20.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test16471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16471");
        model.Student student3 = new model.Student("", "", "hi!");
        student3.logout();
        java.lang.String str5 = student3.getID();
        java.lang.String str6 = student3.getEmail();
        student3.viewProfile();
        student3.login("hi!", "student");
        boolean boolean11 = student3.isVerified();
        java.lang.String str12 = student3.getEmail();
        java.lang.String str13 = student3.getPassword();
        student3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test16472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16472");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        double double6 = student3.getHourlyRate();
        student3.logout();
        student3.viewProfile();
        java.lang.String str9 = student3.getEmail();
        boolean boolean10 = student3.isVerified();
        java.lang.String str11 = student3.getPassword();
        student3.login("hi!", "hi!");
        double double15 = student3.getHourlyRate();
        java.lang.String str16 = student3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 20.0d + "'", double15 == 20.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test16473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16473");
        model.Student student3 = new model.Student("", "", "student");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getPassword();
        boolean boolean6 = student3.isVerified();
        java.lang.String str7 = student3.getID();
        student3.setVerified(true);
        boolean boolean10 = student3.isVerified();
        java.lang.String str11 = student3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "student" + "'", str4, "student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test16474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16474");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        student3.setVerified(false);
        java.lang.String str9 = student3.getID();
        student3.setVerified(false);
        java.lang.String str12 = student3.getID();
        java.lang.String str13 = student3.getEmail();
        double double14 = student3.getHourlyRate();
        student3.login("student", "");
        student3.viewProfile();
        java.lang.String str19 = student3.getID();
        java.lang.String str20 = student3.getPassword();
        boolean boolean21 = student3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 20.0d + "'", double14 == 20.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test16475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16475");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        student3.logout();
        student3.login("hi!", "hi!");
        student3.viewProfile();
        java.lang.String str9 = student3.getPassword();
        java.lang.String str10 = student3.getID();
        java.lang.String str11 = student3.getAccountType();
        java.lang.String str12 = student3.getEmail();
        java.lang.String str13 = student3.getID();
        boolean boolean14 = student3.isVerified();
        student3.login("", "");
        student3.viewProfile();
        java.lang.String str19 = student3.getEmail();
        java.lang.Class<?> wildcardClass20 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "student" + "'", str11, "student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test16476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16476");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getAccountType();
        student3.logout();
        java.lang.String str8 = student3.getEmail();
        student3.viewProfile();
        java.lang.String str10 = student3.getID();
        boolean boolean11 = student3.isVerified();
        java.lang.String str12 = student3.getPassword();
        java.lang.String str13 = student3.getPassword();
        java.lang.String str14 = student3.getID();
        java.lang.String str15 = student3.getAccountType();
        java.lang.String str16 = student3.getAccountType();
        java.lang.String str17 = student3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "student" + "'", str15, "student");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "student" + "'", str16, "student");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test16477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16477");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.login("", "");
        student3.login("student", "student");
        java.lang.String str13 = student3.getPassword();
        java.lang.String str14 = student3.getPassword();
        boolean boolean15 = student3.isVerified();
        java.lang.String str16 = student3.getPassword();
        student3.logout();
        java.lang.String str18 = student3.getEmail();
        student3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test16478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16478");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.login("", "");
        java.lang.String str10 = student3.getID();
        student3.viewProfile();
        boolean boolean12 = student3.isVerified();
        java.lang.String str13 = student3.getAccountType();
        student3.logout();
        java.lang.String str15 = student3.getPassword();
        java.lang.String str16 = student3.getEmail();
        student3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "student" + "'", str13, "student");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test16479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16479");
        model.Student student3 = new model.Student("", "", "hi!");
        student3.login("", "");
        student3.viewProfile();
        student3.viewProfile();
        student3.login("", "");
        boolean boolean12 = student3.isVerified();
        java.lang.String str13 = student3.getEmail();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test16480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16480");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        java.lang.String str8 = student3.getPassword();
        boolean boolean9 = student3.isVerified();
        student3.viewProfile();
        student3.viewProfile();
        java.lang.String str12 = student3.getEmail();
        student3.login("student", "student");
        student3.login("hi!", "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test16481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16481");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.viewProfile();
        java.lang.String str8 = student3.getAccountType();
        student3.logout();
        student3.logout();
        java.lang.String str11 = student3.getAccountType();
        java.lang.String str12 = student3.getEmail();
        double double13 = student3.getHourlyRate();
        boolean boolean14 = student3.isVerified();
        student3.viewProfile();
        java.lang.String str16 = student3.getPassword();
        java.lang.String str17 = student3.getID();
        boolean boolean18 = student3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "student" + "'", str11, "student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 20.0d + "'", double13 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test16482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16482");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        student3.setVerified(false);
        java.lang.String str10 = student3.getID();
        student3.viewProfile();
        double double12 = student3.getHourlyRate();
        java.lang.String str13 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 20.0d + "'", double12 == 20.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "student" + "'", str13, "student");
    }

    @Test
    public void test16483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16483");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        student3.setVerified(false);
        java.lang.String str10 = student3.getID();
        double double11 = student3.getHourlyRate();
        java.lang.String str12 = student3.getPassword();
        student3.login("hi!", "hi!");
        student3.setVerified(true);
        java.lang.String str18 = student3.getID();
        java.lang.String str19 = student3.getEmail();
        java.lang.String str20 = student3.getAccountType();
        student3.login("student", "hi!");
        java.lang.String str24 = student3.getAccountType();
        student3.login("", "");
        java.lang.Class<?> wildcardClass28 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "student" + "'", str20, "student");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "student" + "'", str24, "student");
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test16484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16484");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        java.lang.String str7 = student3.getID();
        java.lang.String str8 = student3.getID();
        java.lang.String str9 = student3.getID();
        student3.setVerified(true);
        student3.setVerified(false);
        student3.login("", "hi!");
        java.lang.String str17 = student3.getPassword();
        java.lang.String str18 = student3.getEmail();
        java.lang.String str19 = student3.getAccountType();
        java.lang.String str20 = student3.getPassword();
        student3.login("", "");
        java.lang.String str24 = student3.getID();
        boolean boolean25 = student3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "student" + "'", str19, "student");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test16485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16485");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        student3.setVerified(false);
        java.lang.String str10 = student3.getID();
        java.lang.String str11 = student3.getAccountType();
        java.lang.String str12 = student3.getPassword();
        double double13 = student3.getHourlyRate();
        java.lang.String str14 = student3.getPassword();
        student3.viewProfile();
        java.lang.String str16 = student3.getAccountType();
        java.lang.String str17 = student3.getID();
        boolean boolean18 = student3.isVerified();
        java.lang.String str19 = student3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "student" + "'", str11, "student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 20.0d + "'", double13 == 20.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "student" + "'", str16, "student");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test16486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16486");
        model.Student student3 = new model.Student("hi!", "", "student");
        java.lang.String str4 = student3.getPassword();
        student3.logout();
        boolean boolean6 = student3.isVerified();
        student3.viewProfile();
        student3.logout();
        java.lang.String str9 = student3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "student" + "'", str9, "student");
    }

    @Test
    public void test16487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16487");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        java.lang.String str6 = student3.getPassword();
        java.lang.String str7 = student3.getPassword();
        java.lang.String str8 = student3.getID();
        java.lang.String str9 = student3.getID();
        student3.viewProfile();
        java.lang.String str11 = student3.getPassword();
        boolean boolean12 = student3.isVerified();
        java.lang.String str13 = student3.getAccountType();
        java.lang.String str14 = student3.getEmail();
        student3.viewProfile();
        student3.login("hi!", "");
        java.lang.String str19 = student3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "student" + "'", str13, "student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test16488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16488");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        double double8 = student3.getHourlyRate();
        student3.viewProfile();
        java.lang.String str10 = student3.getAccountType();
        student3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "student" + "'", str10, "student");
    }

    @Test
    public void test16489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16489");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        java.lang.String str8 = student3.getAccountType();
        student3.setVerified(false);
        student3.viewProfile();
        java.lang.String str12 = student3.getAccountType();
        java.lang.String str13 = student3.getID();
        double double14 = student3.getHourlyRate();
        student3.viewProfile();
        double double16 = student3.getHourlyRate();
        boolean boolean17 = student3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "student" + "'", str12, "student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 20.0d + "'", double14 == 20.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 20.0d + "'", double16 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test16490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16490");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        student3.setVerified(false);
        student3.viewProfile();
        double double7 = student3.getHourlyRate();
        java.lang.String str8 = student3.getID();
        java.lang.String str9 = student3.getPassword();
        java.lang.String str10 = student3.getPassword();
        student3.login("", "hi!");
        student3.login("student", "student");
        java.lang.String str17 = student3.getID();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test16491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16491");
        model.Student student3 = new model.Student("hi!", "hi!", "");
        student3.logout();
        java.lang.String str5 = student3.getEmail();
        double double6 = student3.getHourlyRate();
        java.lang.String str7 = student3.getAccountType();
        java.lang.String str8 = student3.getAccountType();
        student3.viewProfile();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
    }

    @Test
    public void test16492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16492");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        student3.setVerified(false);
        java.lang.String str10 = student3.getID();
        student3.viewProfile();
        java.lang.String str12 = student3.getID();
        java.lang.String str13 = student3.getAccountType();
        java.lang.String str14 = student3.getEmail();
        student3.login("hi!", "");
        java.lang.String str18 = student3.getEmail();
        java.lang.Class<?> wildcardClass19 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "student" + "'", str13, "student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test16493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16493");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        java.lang.String str4 = student3.getAccountType();
        java.lang.String str5 = student3.getEmail();
        double double6 = student3.getHourlyRate();
        student3.logout();
        java.lang.String str8 = student3.getEmail();
        student3.login("hi!", "student");
        double double12 = student3.getHourlyRate();
        java.lang.String str13 = student3.getAccountType();
        student3.viewProfile();
        boolean boolean15 = student3.isVerified();
        java.lang.String str16 = student3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "student" + "'", str4, "student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 20.0d + "'", double12 == 20.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "student" + "'", str13, "student");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test16494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16494");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        java.lang.String str6 = student3.getPassword();
        student3.setVerified(false);
        student3.setVerified(true);
        double double11 = student3.getHourlyRate();
        student3.login("hi!", "");
        boolean boolean15 = student3.isVerified();
        java.lang.String str16 = student3.getID();
        java.lang.String str17 = student3.getEmail();
        double double18 = student3.getHourlyRate();
        student3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 20.0d + "'", double18 == 20.0d);
    }

    @Test
    public void test16495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16495");
        model.Student student3 = new model.Student("student", "hi!", "hi!");
        java.lang.String str4 = student3.getAccountType();
        java.lang.String str5 = student3.getEmail();
        student3.logout();
        student3.viewProfile();
        student3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "student" + "'", str4, "student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
    }

    @Test
    public void test16496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16496");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        boolean boolean7 = student3.isVerified();
        student3.logout();
        student3.logout();
        student3.viewProfile();
        student3.logout();
        boolean boolean12 = student3.isVerified();
        java.lang.Class<?> wildcardClass13 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test16497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16497");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        student3.setVerified(false);
        java.lang.String str6 = student3.getEmail();
        java.lang.String str7 = student3.getAccountType();
        student3.viewProfile();
        java.lang.String str9 = student3.getAccountType();
        java.lang.String str10 = student3.getPassword();
        student3.setVerified(true);
        student3.viewProfile();
        java.lang.String str14 = student3.getAccountType();
        java.lang.String str15 = student3.getEmail();
        java.lang.String str16 = student3.getEmail();
        student3.login("hi!", "hi!");
        java.lang.Class<?> wildcardClass20 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "student" + "'", str9, "student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "student" + "'", str14, "student");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test16498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16498");
        model.Student student3 = new model.Student("hi!", "hi!", "");
        student3.logout();
        java.lang.String str5 = student3.getEmail();
        java.lang.String str6 = student3.getEmail();
        java.lang.String str7 = student3.getID();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test16499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16499");
        model.Student student3 = new model.Student("hi!", "hi!", "");
        java.lang.String str4 = student3.getAccountType();
        java.lang.String str5 = student3.getID();
        boolean boolean6 = student3.isVerified();
        student3.setVerified(false);
        double double9 = student3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "student" + "'", str4, "student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
    }

    @Test
    public void test16500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16500");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        student3.setVerified(false);
        java.lang.String str9 = student3.getID();
        student3.setVerified(false);
        java.lang.String str12 = student3.getPassword();
        boolean boolean13 = student3.isVerified();
        boolean boolean14 = student3.isVerified();
        student3.login("", "student");
        student3.setVerified(false);
        java.lang.String str20 = student3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }
}

