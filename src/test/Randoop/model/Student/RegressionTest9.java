import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest9 {

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
    public void test04501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04501");
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
        java.lang.String str16 = student3.getID();
        java.lang.String str17 = student3.getEmail();
        student3.logout();
        boolean boolean19 = student3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "student" + "'", str11, "student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 20.0d + "'", double13 == 20.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test04502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04502");
        model.Student student3 = new model.Student("", "", "hi!");
        student3.logout();
        java.lang.String str5 = student3.getID();
        java.lang.String str6 = student3.getEmail();
        double double7 = student3.getHourlyRate();
        java.lang.String str8 = student3.getPassword();
        student3.login("hi!", "hi!");
        student3.logout();
        student3.login("student", "hi!");
        java.lang.String str16 = student3.getPassword();
        double double17 = student3.getHourlyRate();
        java.lang.String str18 = student3.getID();
        java.lang.String str19 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 20.0d + "'", double17 == 20.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "student" + "'", str19, "student");
    }

    @Test
    public void test04503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04503");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        double double6 = student3.getHourlyRate();
        java.lang.String str7 = student3.getPassword();
        java.lang.String str8 = student3.getPassword();
        student3.viewProfile();
        double double10 = student3.getHourlyRate();
        java.lang.String str11 = student3.getPassword();
        student3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test04504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04504");
        model.Student student3 = new model.Student("", "student", "student");
        double double4 = student3.getHourlyRate();
        java.lang.String str5 = student3.getAccountType();
        double double6 = student3.getHourlyRate();
        boolean boolean7 = student3.isVerified();
        java.lang.String str8 = student3.getEmail();
        student3.viewProfile();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test04505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04505");
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
        double double19 = student3.getHourlyRate();
        student3.login("hi!", "");
        java.lang.String str23 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "student" + "'", str11, "student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 20.0d + "'", double16 == 20.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 20.0d + "'", double19 == 20.0d);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "student" + "'", str23, "student");
    }

    @Test
    public void test04506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04506");
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
        java.lang.String str16 = student3.getID();
        boolean boolean17 = student3.isVerified();
        boolean boolean18 = student3.isVerified();
        java.lang.String str19 = student3.getAccountType();
        java.lang.Class<?> wildcardClass20 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "student" + "'", str19, "student");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test04507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04507");
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
        student3.viewProfile();
        student3.logout();
        student3.setVerified(true);
        student3.login("", "student");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "student" + "'", str13, "student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "student" + "'", str14, "student");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test04508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04508");
        model.Student student3 = new model.Student("student", "hi!", "hi!");
        java.lang.String str4 = student3.getEmail();
        student3.setVerified(true);
        double double7 = student3.getHourlyRate();
        boolean boolean8 = student3.isVerified();
        student3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "student" + "'", str4, "student");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test04509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04509");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        student3.setVerified(false);
        student3.viewProfile();
        java.lang.String str7 = student3.getEmail();
        java.lang.String str8 = student3.getAccountType();
        java.lang.String str9 = student3.getID();
        java.lang.String str10 = student3.getPassword();
        double double11 = student3.getHourlyRate();
        student3.logout();
        student3.setVerified(false);
        java.lang.Class<?> wildcardClass15 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test04510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04510");
        model.Student student3 = new model.Student("student", "", "student");
        student3.setVerified(false);
        student3.login("hi!", "hi!");
        boolean boolean9 = student3.isVerified();
        student3.setVerified(true);
        student3.viewProfile();
        student3.viewProfile();
        java.lang.String str14 = student3.getPassword();
        java.lang.Class<?> wildcardClass15 = student3.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test04511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04511");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        boolean boolean7 = student3.isVerified();
        java.lang.String str8 = student3.getEmail();
        student3.setVerified(true);
        java.lang.String str11 = student3.getAccountType();
        double double12 = student3.getHourlyRate();
        student3.viewProfile();
        student3.viewProfile();
        boolean boolean15 = student3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "student" + "'", str11, "student");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 20.0d + "'", double12 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test04512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04512");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        student3.logout();
        student3.login("hi!", "hi!");
        double double8 = student3.getHourlyRate();
        java.lang.String str9 = student3.getID();
        java.lang.String str10 = student3.getEmail();
        java.lang.String str11 = student3.getPassword();
        java.lang.String str12 = student3.getID();
        double double13 = student3.getHourlyRate();
        student3.login("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 20.0d + "'", double13 == 20.0d);
    }

    @Test
    public void test04513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04513");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        java.lang.String str8 = student3.getPassword();
        boolean boolean9 = student3.isVerified();
        student3.viewProfile();
        java.lang.String str11 = student3.getEmail();
        java.lang.String str12 = student3.getPassword();
        java.lang.String str13 = student3.getPassword();
        java.lang.String str14 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "student" + "'", str14, "student");
    }

    @Test
    public void test04514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04514");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        java.lang.String str7 = student3.getID();
        student3.setVerified(true);
        java.lang.String str10 = student3.getAccountType();
        java.lang.String str11 = student3.getPassword();
        student3.viewProfile();
        boolean boolean13 = student3.isVerified();
        boolean boolean14 = student3.isVerified();
        java.lang.String str15 = student3.getAccountType();
        student3.login("hi!", "hi!");
        student3.logout();
        student3.login("student", "");
        java.lang.String str23 = student3.getID();
        java.lang.String str24 = student3.getAccountType();
        java.lang.String str25 = student3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "student" + "'", str10, "student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "student" + "'", str15, "student");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "student" + "'", str24, "student");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
    }

    @Test
    public void test04515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04515");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.login("", "");
        java.lang.String str10 = student3.getID();
        student3.viewProfile();
        student3.setVerified(false);
        student3.viewProfile();
        student3.viewProfile();
        java.lang.Class<?> wildcardClass16 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test04516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04516");
        model.Student student3 = new model.Student("", "", "hi!");
        student3.logout();
        java.lang.String str5 = student3.getID();
        java.lang.String str6 = student3.getEmail();
        java.lang.String str7 = student3.getPassword();
        java.lang.String str8 = student3.getID();
        student3.logout();
        double double10 = student3.getHourlyRate();
        boolean boolean11 = student3.isVerified();
        java.lang.String str12 = student3.getPassword();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test04517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04517");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        student3.setVerified(false);
        student3.viewProfile();
        java.lang.String str7 = student3.getEmail();
        student3.login("hi!", "hi!");
        java.lang.String str11 = student3.getEmail();
        student3.login("student", "hi!");
        java.lang.String str15 = student3.getPassword();
        student3.viewProfile();
        java.lang.String str17 = student3.getID();
        double double18 = student3.getHourlyRate();
        student3.logout();
        java.lang.String str20 = student3.getPassword();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 20.0d + "'", double18 == 20.0d);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test04518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04518");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        java.lang.String str7 = student3.getID();
        student3.setVerified(true);
        student3.setVerified(false);
        java.lang.String str12 = student3.getEmail();
        java.lang.String str13 = student3.getPassword();
        java.lang.String str14 = student3.getEmail();
        boolean boolean15 = student3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test04519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04519");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        student3.logout();
        student3.login("hi!", "hi!");
        double double8 = student3.getHourlyRate();
        java.lang.String str9 = student3.getID();
        java.lang.String str10 = student3.getAccountType();
        student3.viewProfile();
        student3.login("student", "student");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "student" + "'", str10, "student");
    }

    @Test
    public void test04520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04520");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.viewProfile();
        student3.viewProfile();
        student3.viewProfile();
        student3.login("student", "hi!");
        student3.logout();
        java.lang.String str14 = student3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test04521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04521");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.viewProfile();
        java.lang.String str8 = student3.getAccountType();
        student3.setVerified(false);
        double double11 = student3.getHourlyRate();
        student3.login("", "hi!");
        student3.logout();
        student3.viewProfile();
        student3.logout();
        student3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
    }

    @Test
    public void test04522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04522");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        java.lang.String str8 = student3.getPassword();
        java.lang.String str9 = student3.getID();
        double double10 = student3.getHourlyRate();
        java.lang.String str11 = student3.getID();
        student3.logout();
        student3.logout();
        student3.setVerified(false);
        double double16 = student3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 20.0d + "'", double16 == 20.0d);
    }

    @Test
    public void test04523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04523");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        boolean boolean7 = student3.isVerified();
        student3.logout();
        java.lang.String str9 = student3.getID();
        java.lang.String str10 = student3.getID();
        double double11 = student3.getHourlyRate();
        student3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
    }

    @Test
    public void test04524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04524");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        double double6 = student3.getHourlyRate();
        student3.logout();
        student3.viewProfile();
        java.lang.String str9 = student3.getEmail();
        java.lang.String str10 = student3.getEmail();
        java.lang.String str11 = student3.getAccountType();
        student3.logout();
        student3.logout();
        java.lang.String str14 = student3.getID();
        java.lang.String str15 = student3.getPassword();
        boolean boolean16 = student3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "student" + "'", str11, "student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test04525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04525");
        model.Student student3 = new model.Student("", "", "hi!");
        student3.logout();
        java.lang.String str5 = student3.getID();
        java.lang.String str6 = student3.getEmail();
        double double7 = student3.getHourlyRate();
        java.lang.String str8 = student3.getEmail();
        java.lang.String str9 = student3.getEmail();
        java.lang.String str10 = student3.getPassword();
        student3.setVerified(true);
        student3.logout();
        double double14 = student3.getHourlyRate();
        student3.login("hi!", "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 20.0d + "'", double14 == 20.0d);
    }

    @Test
    public void test04526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04526");
        model.Student student3 = new model.Student("hi!", "hi!", "");
        student3.logout();
        java.lang.String str5 = student3.getEmail();
        java.lang.String str6 = student3.getAccountType();
        student3.login("student", "student");
        double double10 = student3.getHourlyRate();
        java.lang.String str11 = student3.getID();
        student3.login("", "");
        student3.viewProfile();
        java.lang.Class<?> wildcardClass16 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test04527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04527");
        model.Student student3 = new model.Student("", "student", "student");
        java.lang.String str4 = student3.getAccountType();
        student3.viewProfile();
        boolean boolean6 = student3.isVerified();
        java.lang.String str7 = student3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "student" + "'", str4, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
    }

    @Test
    public void test04528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04528");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        student3.setVerified(false);
        java.lang.String str6 = student3.getPassword();
        java.lang.String str7 = student3.getAccountType();
        java.lang.String str8 = student3.getEmail();
        java.lang.String str9 = student3.getID();
        java.lang.String str10 = student3.getPassword();
        java.lang.String str11 = student3.getAccountType();
        boolean boolean12 = student3.isVerified();
        student3.viewProfile();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "student" + "'", str11, "student");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test04529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04529");
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
        java.lang.String str15 = student3.getEmail();
        java.lang.String str16 = student3.getPassword();
        student3.login("", "student");
        double double20 = student3.getHourlyRate();
        student3.setVerified(false);
        student3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "student" + "'", str13, "student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 20.0d + "'", double20 == 20.0d);
    }

    @Test
    public void test04530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04530");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        student3.setVerified(false);
        java.lang.String str10 = student3.getEmail();
        student3.viewProfile();
        java.lang.String str12 = student3.getID();
        boolean boolean13 = student3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test04531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04531");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        double double8 = student3.getHourlyRate();
        boolean boolean9 = student3.isVerified();
        student3.logout();
        student3.viewProfile();
        student3.login("", "");
        java.lang.String str15 = student3.getPassword();
        student3.setVerified(false);
        java.lang.String str18 = student3.getAccountType();
        student3.login("", "student");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "student" + "'", str18, "student");
    }

    @Test
    public void test04532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04532");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        java.lang.String str7 = student3.getID();
        student3.setVerified(true);
        java.lang.String str10 = student3.getAccountType();
        java.lang.String str11 = student3.getPassword();
        java.lang.String str12 = student3.getID();
        boolean boolean13 = student3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "student" + "'", str10, "student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test04533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04533");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        java.lang.String str4 = student3.getAccountType();
        java.lang.String str5 = student3.getID();
        student3.viewProfile();
        student3.setVerified(true);
        double double9 = student3.getHourlyRate();
        java.lang.String str10 = student3.getPassword();
        double double11 = student3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "student" + "'", str4, "student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
    }

    @Test
    public void test04534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04534");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        student3.setVerified(false);
        java.lang.String str10 = student3.getAccountType();
        java.lang.String str11 = student3.getEmail();
        student3.logout();
        boolean boolean13 = student3.isVerified();
        boolean boolean14 = student3.isVerified();
        java.lang.String str15 = student3.getAccountType();
        java.lang.String str16 = student3.getEmail();
        student3.login("hi!", "hi!");
        student3.viewProfile();
        student3.setVerified(false);
        java.lang.Class<?> wildcardClass23 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "student" + "'", str10, "student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "student" + "'", str15, "student");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test04535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04535");
        model.Student student3 = new model.Student("hi!", "", "student");
        student3.setVerified(false);
        java.lang.String str6 = student3.getID();
        java.lang.String str7 = student3.getAccountType();
        student3.logout();
        boolean boolean9 = student3.isVerified();
        student3.login("hi!", "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test04536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04536");
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
        java.lang.String str13 = student3.getAccountType();
        java.lang.String str14 = student3.getID();
        boolean boolean15 = student3.isVerified();
        student3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "student" + "'", str13, "student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test04537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04537");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        java.lang.String str6 = student3.getPassword();
        student3.setVerified(false);
        student3.setVerified(false);
        java.lang.String str11 = student3.getAccountType();
        student3.logout();
        student3.login("", "hi!");
        student3.setVerified(true);
        java.lang.String str18 = student3.getPassword();
        double double19 = student3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "student" + "'", str11, "student");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 20.0d + "'", double19 == 20.0d);
    }

    @Test
    public void test04538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04538");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        boolean boolean7 = student3.isVerified();
        student3.logout();
        java.lang.String str9 = student3.getID();
        student3.login("hi!", "");
        boolean boolean13 = student3.isVerified();
        java.lang.String str14 = student3.getPassword();
        student3.login("student", "hi!");
        java.lang.String str18 = student3.getEmail();
        double double19 = student3.getHourlyRate();
        student3.logout();
        java.lang.String str21 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 20.0d + "'", double19 == 20.0d);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "student" + "'", str21, "student");
    }

    @Test
    public void test04539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04539");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        java.lang.String str8 = student3.getAccountType();
        java.lang.String str9 = student3.getAccountType();
        java.lang.String str10 = student3.getID();
        student3.setVerified(false);
        double double13 = student3.getHourlyRate();
        student3.viewProfile();
        boolean boolean15 = student3.isVerified();
        java.lang.String str16 = student3.getAccountType();
        java.lang.String str17 = student3.getID();
        java.lang.String str18 = student3.getPassword();
        student3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "student" + "'", str9, "student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 20.0d + "'", double13 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "student" + "'", str16, "student");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test04540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04540");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        java.lang.String str7 = student3.getID();
        student3.setVerified(true);
        java.lang.String str10 = student3.getEmail();
        student3.setVerified(true);
        boolean boolean13 = student3.isVerified();
        java.lang.Class<?> wildcardClass14 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test04541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04541");
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
        student3.setVerified(true);
        java.lang.String str19 = student3.getAccountType();
        java.lang.String str20 = student3.getEmail();
        student3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "student" + "'", str19, "student");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test04542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04542");
        model.Student student3 = new model.Student("", "student", "student");
        double double4 = student3.getHourlyRate();
        java.lang.String str5 = student3.getAccountType();
        java.lang.String str6 = student3.getAccountType();
        java.lang.String str7 = student3.getAccountType();
        double double8 = student3.getHourlyRate();
        java.lang.String str9 = student3.getID();
        student3.login("", "");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "student" + "'", str9, "student");
    }

    @Test
    public void test04543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04543");
        model.Student student3 = new model.Student("hi!", "student", "");
        java.lang.String str4 = student3.getPassword();
        boolean boolean5 = student3.isVerified();
        student3.login("", "student");
        java.lang.String str9 = student3.getAccountType();
        student3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "student" + "'", str4, "student");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "student" + "'", str9, "student");
    }

    @Test
    public void test04544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04544");
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
        double double15 = student3.getHourlyRate();
        java.lang.String str16 = student3.getAccountType();
        student3.login("", "");
        boolean boolean20 = student3.isVerified();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "student" + "'", str14, "student");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 20.0d + "'", double15 == 20.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "student" + "'", str16, "student");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test04545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04545");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getAccountType();
        student3.logout();
        java.lang.String str8 = student3.getEmail();
        student3.viewProfile();
        java.lang.String str10 = student3.getID();
        student3.login("", "student");
        student3.logout();
        student3.setVerified(false);
        java.lang.String str17 = student3.getEmail();
        student3.viewProfile();
        java.lang.String str19 = student3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test04546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04546");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        java.lang.String str7 = student3.getID();
        student3.setVerified(true);
        java.lang.String str10 = student3.getEmail();
        student3.setVerified(false);
        java.lang.String str13 = student3.getAccountType();
        java.lang.String str14 = student3.getAccountType();
        java.lang.String str15 = student3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "student" + "'", str13, "student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "student" + "'", str14, "student");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test04547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04547");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        double double6 = student3.getHourlyRate();
        java.lang.String str7 = student3.getEmail();
        java.lang.String str8 = student3.getEmail();
        student3.login("", "hi!");
        java.lang.String str12 = student3.getAccountType();
        student3.login("student", "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "student" + "'", str12, "student");
    }

    @Test
    public void test04548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04548");
        model.Student student3 = new model.Student("hi!", "student", "");
        java.lang.String str4 = student3.getEmail();
        student3.viewProfile();
        java.lang.String str6 = student3.getID();
        student3.logout();
        double double8 = student3.getHourlyRate();
        student3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
    }

    @Test
    public void test04549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04549");
        model.Student student3 = new model.Student("hi!", "hi!", "");
        student3.logout();
        java.lang.String str5 = student3.getEmail();
        boolean boolean6 = student3.isVerified();
        java.lang.String str7 = student3.getEmail();
        student3.login("", "student");
        java.lang.String str11 = student3.getAccountType();
        java.lang.String str12 = student3.getEmail();
        boolean boolean13 = student3.isVerified();
        double double14 = student3.getHourlyRate();
        boolean boolean15 = student3.isVerified();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "student" + "'", str11, "student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 20.0d + "'", double14 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test04550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04550");
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
        java.lang.String str18 = student3.getID();
        student3.setVerified(true);
        java.lang.String str21 = student3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test04551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04551");
        model.Student student3 = new model.Student("", "", "hi!");
        student3.logout();
        java.lang.String str5 = student3.getID();
        java.lang.String str6 = student3.getEmail();
        double double7 = student3.getHourlyRate();
        java.lang.String str8 = student3.getEmail();
        boolean boolean9 = student3.isVerified();
        java.lang.Class<?> wildcardClass10 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test04552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04552");
        model.Student student3 = new model.Student("hi!", "hi!", "");
        java.lang.String str4 = student3.getAccountType();
        student3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "student" + "'", str4, "student");
    }

    @Test
    public void test04553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04553");
        model.Student student3 = new model.Student("", "", "student");
        student3.login("student", "student");
        double double7 = student3.getHourlyRate();
        student3.login("", "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
    }

    @Test
    public void test04554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04554");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        double double6 = student3.getHourlyRate();
        student3.logout();
        student3.viewProfile();
        java.lang.String str9 = student3.getEmail();
        boolean boolean10 = student3.isVerified();
        java.lang.String str11 = student3.getPassword();
        student3.login("", "hi!");
        double double15 = student3.getHourlyRate();
        student3.viewProfile();
        student3.setVerified(false);
        student3.login("hi!", "student");
        java.lang.String str22 = student3.getAccountType();
        student3.logout();
        java.lang.String str24 = student3.getPassword();
        student3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 20.0d + "'", double15 == 20.0d);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "student" + "'", str22, "student");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test04555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04555");
        model.Student student3 = new model.Student("hi!", "student", "");
        java.lang.String str4 = student3.getEmail();
        student3.logout();
        java.lang.String str6 = student3.getID();
        boolean boolean7 = student3.isVerified();
        java.lang.String str8 = student3.getID();
        java.lang.String str9 = student3.getID();
        double double10 = student3.getHourlyRate();
        boolean boolean11 = student3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test04556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04556");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        java.lang.String str8 = student3.getPassword();
        java.lang.String str9 = student3.getID();
        double double10 = student3.getHourlyRate();
        double double11 = student3.getHourlyRate();
        student3.login("", "");
        boolean boolean15 = student3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test04557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04557");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        java.lang.String str4 = student3.getAccountType();
        java.lang.String str5 = student3.getEmail();
        double double6 = student3.getHourlyRate();
        boolean boolean7 = student3.isVerified();
        student3.logout();
        java.lang.String str9 = student3.getEmail();
        student3.setVerified(false);
        student3.login("", "hi!");
        boolean boolean15 = student3.isVerified();
        student3.logout();
        java.lang.String str17 = student3.getID();
        java.lang.Class<?> wildcardClass18 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "student" + "'", str4, "student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test04558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04558");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        student3.setVerified(false);
        java.lang.String str10 = student3.getID();
        student3.viewProfile();
        java.lang.String str12 = student3.getID();
        boolean boolean13 = student3.isVerified();
        java.lang.String str14 = student3.getPassword();
        double double15 = student3.getHourlyRate();
        java.lang.String str16 = student3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 20.0d + "'", double15 == 20.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test04559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04559");
        model.Student student3 = new model.Student("hi!", "student", "");
        java.lang.String str4 = student3.getEmail();
        student3.logout();
        java.lang.String str6 = student3.getID();
        boolean boolean7 = student3.isVerified();
        java.lang.String str8 = student3.getAccountType();
        student3.login("hi!", "");
        java.lang.String str12 = student3.getAccountType();
        java.lang.String str13 = student3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "student" + "'", str12, "student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test04560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04560");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        java.lang.String str8 = student3.getAccountType();
        java.lang.String str9 = student3.getAccountType();
        java.lang.String str10 = student3.getPassword();
        java.lang.String str11 = student3.getAccountType();
        student3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "student" + "'", str9, "student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "student" + "'", str11, "student");
    }

    @Test
    public void test04561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04561");
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
        student3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 20.0d + "'", double14 == 20.0d);
    }

    @Test
    public void test04562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04562");
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
        student3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 20.0d + "'", double15 == 20.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test04563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04563");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        boolean boolean7 = student3.isVerified();
        student3.logout();
        student3.logout();
        student3.viewProfile();
        student3.viewProfile();
        double double12 = student3.getHourlyRate();
        student3.login("", "student");
        double double16 = student3.getHourlyRate();
        java.lang.String str17 = student3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 20.0d + "'", double12 == 20.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 20.0d + "'", double16 == 20.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test04564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04564");
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
        java.lang.String str14 = student3.getPassword();
        java.lang.String str15 = student3.getEmail();
        java.lang.Class<?> wildcardClass16 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test04565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04565");
        model.Student student3 = new model.Student("", "", "student");
        java.lang.String str4 = student3.getID();
        student3.login("", "student");
        student3.login("hi!", "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "student" + "'", str4, "student");
    }

    @Test
    public void test04566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04566");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        boolean boolean7 = student3.isVerified();
        student3.logout();
        java.lang.String str9 = student3.getID();
        student3.login("hi!", "");
        java.lang.String str13 = student3.getID();
        student3.viewProfile();
        double double15 = student3.getHourlyRate();
        java.lang.Class<?> wildcardClass16 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 20.0d + "'", double15 == 20.0d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test04567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04567");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        student3.setVerified(false);
        student3.viewProfile();
        java.lang.String str7 = student3.getEmail();
        java.lang.String str8 = student3.getAccountType();
        java.lang.String str9 = student3.getID();
        student3.setVerified(false);
        double double12 = student3.getHourlyRate();
        java.lang.String str13 = student3.getID();
        double double14 = student3.getHourlyRate();
        java.lang.Class<?> wildcardClass15 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 20.0d + "'", double12 == 20.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 20.0d + "'", double14 == 20.0d);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test04568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04568");
        model.Student student3 = new model.Student("", "", "hi!");
        student3.login("", "");
        student3.viewProfile();
        student3.viewProfile();
        student3.login("", "");
        student3.logout();
        java.lang.String str13 = student3.getID();
        student3.setVerified(true);
        java.lang.String str16 = student3.getPassword();
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test04569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04569");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        double double6 = student3.getHourlyRate();
        java.lang.String str7 = student3.getPassword();
        student3.logout();
        student3.logout();
        java.lang.String str10 = student3.getPassword();
        student3.login("", "hi!");
        java.lang.String str14 = student3.getEmail();
        student3.setVerified(false);
        student3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test04570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04570");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        java.lang.String str8 = student3.getPassword();
        java.lang.String str9 = student3.getPassword();
        student3.logout();
        java.lang.String str11 = student3.getAccountType();
        java.lang.String str12 = student3.getEmail();
        student3.logout();
        java.lang.String str14 = student3.getID();
        student3.logout();
        student3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "student" + "'", str11, "student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test04571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04571");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        student3.setVerified(false);
        java.lang.String str10 = student3.getAccountType();
        java.lang.String str11 = student3.getEmail();
        boolean boolean12 = student3.isVerified();
        java.lang.String str13 = student3.getEmail();
        double double14 = student3.getHourlyRate();
        student3.setVerified(false);
        java.lang.String str17 = student3.getAccountType();
        java.lang.Class<?> wildcardClass18 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "student" + "'", str10, "student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 20.0d + "'", double14 == 20.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "student" + "'", str17, "student");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test04572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04572");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        java.lang.String str8 = student3.getPassword();
        student3.logout();
        java.lang.String str10 = student3.getID();
        double double11 = student3.getHourlyRate();
        java.lang.String str12 = student3.getEmail();
        student3.viewProfile();
        student3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test04573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04573");
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
        double double16 = student3.getHourlyRate();
        student3.setVerified(true);
        student3.setVerified(false);
        boolean boolean21 = student3.isVerified();
        boolean boolean22 = student3.isVerified();
        student3.login("student", "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 20.0d + "'", double16 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test04574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04574");
        model.Student student3 = new model.Student("hi!", "hi!", "hi!");
        student3.login("hi!", "student");
        student3.logout();
        java.lang.String str8 = student3.getPassword();
        student3.viewProfile();
        boolean boolean10 = student3.isVerified();
        java.lang.String str11 = student3.getID();
        boolean boolean12 = student3.isVerified();
        boolean boolean13 = student3.isVerified();
        double double14 = student3.getHourlyRate();
        java.lang.Class<?> wildcardClass15 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 20.0d + "'", double14 == 20.0d);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test04575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04575");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        java.lang.String str4 = student3.getAccountType();
        java.lang.String str5 = student3.getID();
        student3.setVerified(true);
        boolean boolean8 = student3.isVerified();
        student3.logout();
        student3.viewProfile();
        java.lang.String str11 = student3.getEmail();
        boolean boolean12 = student3.isVerified();
        java.lang.String str13 = student3.getAccountType();
        student3.viewProfile();
        boolean boolean15 = student3.isVerified();
        java.lang.String str16 = student3.getAccountType();
        student3.login("hi!", "");
        java.lang.Class<?> wildcardClass20 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "student" + "'", str4, "student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "student" + "'", str13, "student");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "student" + "'", str16, "student");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test04576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04576");
        model.Student student3 = new model.Student("", "", "student");
        java.lang.String str4 = student3.getAccountType();
        java.lang.String str5 = student3.getID();
        java.lang.String str6 = student3.getAccountType();
        java.lang.String str7 = student3.getEmail();
        java.lang.String str8 = student3.getPassword();
        student3.logout();
        double double10 = student3.getHourlyRate();
        boolean boolean11 = student3.isVerified();
        student3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "student" + "'", str4, "student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test04577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04577");
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
        student3.logout();
        java.lang.String str15 = student3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test04578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04578");
        model.Student student3 = new model.Student("hi!", "student", "");
        student3.setVerified(false);
        student3.logout();
        student3.login("", "");
        double double10 = student3.getHourlyRate();
        java.lang.String str11 = student3.getPassword();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "student" + "'", str11, "student");
    }

    @Test
    public void test04579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04579");
        model.Student student3 = new model.Student("hi!", "student", "");
        java.lang.String str4 = student3.getEmail();
        double double5 = student3.getHourlyRate();
        student3.logout();
        java.lang.String str7 = student3.getPassword();
        student3.login("student", "student");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
    }

    @Test
    public void test04580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04580");
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
        boolean boolean16 = student3.isVerified();
        java.lang.String str17 = student3.getID();
        student3.login("hi!", "");
        student3.setVerified(true);
        java.lang.String str23 = student3.getEmail();
        java.lang.String str24 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "student" + "'", str11, "student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "student" + "'", str24, "student");
    }

    @Test
    public void test04581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04581");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        student3.login("", "student");
        java.lang.String str10 = student3.getEmail();
        student3.login("", "hi!");
        student3.setVerified(true);
        java.lang.String str16 = student3.getEmail();
        java.lang.String str17 = student3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test04582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04582");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        java.lang.String str7 = student3.getID();
        student3.setVerified(true);
        student3.setVerified(false);
        java.lang.String str12 = student3.getEmail();
        boolean boolean13 = student3.isVerified();
        student3.login("hi!", "student");
        java.lang.String str17 = student3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test04583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04583");
        model.Student student3 = new model.Student("", "hi!", "hi!");
        student3.login("student", "student");
        java.lang.String str7 = student3.getID();
        student3.viewProfile();
        double double9 = student3.getHourlyRate();
        student3.login("", "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
    }

    @Test
    public void test04584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04584");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getID();
        java.lang.String str6 = student3.getID();
        student3.login("", "");
        java.lang.String str10 = student3.getID();
        java.lang.String str11 = student3.getEmail();
        java.lang.String str12 = student3.getPassword();
        student3.viewProfile();
        student3.login("hi!", "hi!");
        double double17 = student3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 20.0d + "'", double17 == 20.0d);
    }

    @Test
    public void test04585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04585");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        java.lang.String str8 = student3.getPassword();
        java.lang.String str9 = student3.getPassword();
        java.lang.String str10 = student3.getPassword();
        double double11 = student3.getHourlyRate();
        student3.login("hi!", "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
    }

    @Test
    public void test04586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04586");
        model.Student student3 = new model.Student("hi!", "student", "");
        student3.logout();
        student3.logout();
        student3.logout();
        boolean boolean7 = student3.isVerified();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test04587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04587");
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
        java.lang.String str16 = student3.getID();
        java.lang.String str17 = student3.getAccountType();
        java.lang.Class<?> wildcardClass18 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 20.0d + "'", double14 == 20.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "student" + "'", str17, "student");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test04588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04588");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        java.lang.String str8 = student3.getPassword();
        java.lang.String str9 = student3.getPassword();
        student3.logout();
        java.lang.String str11 = student3.getAccountType();
        java.lang.String str12 = student3.getEmail();
        double double13 = student3.getHourlyRate();
        student3.setVerified(false);
        java.lang.String str16 = student3.getID();
        java.lang.Class<?> wildcardClass17 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "student" + "'", str11, "student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 20.0d + "'", double13 == 20.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test04589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04589");
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
        java.lang.String str15 = student3.getEmail();
        java.lang.String str16 = student3.getPassword();
        student3.login("", "student");
        double double20 = student3.getHourlyRate();
        student3.setVerified(false);
        boolean boolean23 = student3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "student" + "'", str13, "student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 20.0d + "'", double20 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test04590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04590");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        java.lang.String str4 = student3.getAccountType();
        java.lang.String str5 = student3.getEmail();
        double double6 = student3.getHourlyRate();
        double double7 = student3.getHourlyRate();
        java.lang.String str8 = student3.getPassword();
        boolean boolean9 = student3.isVerified();
        java.lang.String str10 = student3.getPassword();
        java.lang.String str11 = student3.getAccountType();
        java.lang.String str12 = student3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "student" + "'", str4, "student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "student" + "'", str11, "student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test04591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04591");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        boolean boolean7 = student3.isVerified();
        student3.logout();
        java.lang.String str9 = student3.getID();
        student3.login("hi!", "");
        java.lang.String str13 = student3.getPassword();
        student3.login("", "");
        boolean boolean17 = student3.isVerified();
        java.lang.String str18 = student3.getID();
        java.lang.String str19 = student3.getID();
        student3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test04592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04592");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        student3.setVerified(false);
        java.lang.String str10 = student3.getAccountType();
        java.lang.String str11 = student3.getEmail();
        student3.logout();
        boolean boolean13 = student3.isVerified();
        boolean boolean14 = student3.isVerified();
        java.lang.String str15 = student3.getID();
        java.lang.String str16 = student3.getPassword();
        student3.login("", "hi!");
        java.lang.String str20 = student3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "student" + "'", str10, "student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test04593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04593");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        java.lang.String str7 = student3.getID();
        boolean boolean8 = student3.isVerified();
        student3.setVerified(true);
        student3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test04594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04594");
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
        java.lang.String str14 = student3.getAccountType();
        boolean boolean15 = student3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "student" + "'", str14, "student");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test04595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04595");
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
        boolean boolean18 = student3.isVerified();
        student3.logout();
        java.lang.String str20 = student3.getAccountType();
        student3.login("hi!", "");
        boolean boolean24 = student3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "student" + "'", str10, "student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 20.0d + "'", double15 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "student" + "'", str20, "student");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test04596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04596");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        double double6 = student3.getHourlyRate();
        java.lang.String str7 = student3.getEmail();
        student3.viewProfile();
        java.lang.String str9 = student3.getPassword();
        student3.login("", "hi!");
        double double13 = student3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 20.0d + "'", double13 == 20.0d);
    }

    @Test
    public void test04597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04597");
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
        double double18 = student3.getHourlyRate();
        student3.logout();
        java.lang.String str20 = student3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "student" + "'", str10, "student");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "student" + "'", str16, "student");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 20.0d + "'", double18 == 20.0d);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test04598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04598");
        model.Student student3 = new model.Student("", "", "hi!");
        student3.logout();
        java.lang.String str5 = student3.getID();
        java.lang.String str6 = student3.getEmail();
        student3.viewProfile();
        student3.setVerified(false);
        student3.logout();
        java.lang.String str11 = student3.getEmail();
        student3.viewProfile();
        student3.login("hi!", "hi!");
        java.lang.String str16 = student3.getAccountType();
        student3.logout();
        double double18 = student3.getHourlyRate();
        student3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "student" + "'", str16, "student");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 20.0d + "'", double18 == 20.0d);
    }

    @Test
    public void test04599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04599");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.login("", "");
        java.lang.String str10 = student3.getID();
        java.lang.String str11 = student3.getEmail();
        boolean boolean12 = student3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test04600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04600");
        model.Student student3 = new model.Student("hi!", "hi!", "");
        java.lang.String str4 = student3.getEmail();
        student3.login("student", "student");
        java.lang.String str8 = student3.getPassword();
        student3.viewProfile();
        double double10 = student3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
    }

    @Test
    public void test04601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04601");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        java.lang.String str4 = student3.getAccountType();
        java.lang.String str5 = student3.getID();
        student3.setVerified(true);
        student3.login("student", "student");
        java.lang.String str11 = student3.getPassword();
        student3.logout();
        student3.login("student", "");
        student3.login("hi!", "hi!");
        java.lang.String str19 = student3.getID();
        java.lang.Class<?> wildcardClass20 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "student" + "'", str4, "student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test04602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04602");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        java.lang.String str4 = student3.getPassword();
        double double5 = student3.getHourlyRate();
        double double6 = student3.getHourlyRate();
        student3.viewProfile();
        student3.setVerified(false);
        java.lang.String str10 = student3.getAccountType();
        boolean boolean11 = student3.isVerified();
        student3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "student" + "'", str10, "student");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test04603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04603");
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
        boolean boolean17 = student3.isVerified();
        java.lang.String str18 = student3.getID();
        boolean boolean19 = student3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 20.0d + "'", double16 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test04604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04604");
        model.Student student3 = new model.Student("hi!", "student", "");
        java.lang.String str4 = student3.getEmail();
        student3.viewProfile();
        student3.viewProfile();
        java.lang.String str7 = student3.getEmail();
        student3.login("hi!", "");
        student3.viewProfile();
        student3.logout();
        java.lang.String str13 = student3.getID();
        boolean boolean14 = student3.isVerified();
        student3.login("student", "");
        student3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test04605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04605");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        java.lang.String str7 = student3.getID();
        java.lang.String str8 = student3.getEmail();
        student3.login("", "");
        boolean boolean12 = student3.isVerified();
        boolean boolean13 = student3.isVerified();
        java.lang.String str14 = student3.getPassword();
        student3.logout();
        java.lang.Class<?> wildcardClass16 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test04606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04606");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        student3.setVerified(false);
        java.lang.String str9 = student3.getID();
        student3.setVerified(false);
        java.lang.String str12 = student3.getID();
        java.lang.String str13 = student3.getEmail();
        java.lang.String str14 = student3.getID();
        java.lang.String str15 = student3.getAccountType();
        java.lang.String str16 = student3.getAccountType();
        boolean boolean17 = student3.isVerified();
        double double18 = student3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "student" + "'", str15, "student");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "student" + "'", str16, "student");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 20.0d + "'", double18 == 20.0d);
    }

    @Test
    public void test04607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04607");
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
        student3.login("student", "student");
        student3.setVerified(true);
        double double19 = student3.getHourlyRate();
        java.lang.Class<?> wildcardClass20 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 20.0d + "'", double19 == 20.0d);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test04608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04608");
        model.Student student3 = new model.Student("", "", "student");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        student3.viewProfile();
        java.lang.String str7 = student3.getID();
        java.lang.String str8 = student3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "student" + "'", str4, "student");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test04609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04609");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        double double6 = student3.getHourlyRate();
        java.lang.String str7 = student3.getPassword();
        student3.logout();
        java.lang.String str9 = student3.getEmail();
        java.lang.String str10 = student3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test04610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04610");
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
        student3.login("student", "hi!");
        boolean boolean17 = student3.isVerified();
        student3.logout();
        java.lang.String str19 = student3.getAccountType();
        student3.setVerified(false);
        boolean boolean22 = student3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "student" + "'", str13, "student");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "student" + "'", str19, "student");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test04611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04611");
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
        boolean boolean13 = student3.isVerified();
        java.lang.String str14 = student3.getAccountType();
        student3.login("student", "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "student" + "'", str14, "student");
    }

    @Test
    public void test04612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04612");
        model.Student student3 = new model.Student("", "student", "student");
        double double4 = student3.getHourlyRate();
        java.lang.String str5 = student3.getAccountType();
        double double6 = student3.getHourlyRate();
        java.lang.String str7 = student3.getPassword();
        student3.viewProfile();
        student3.login("", "student");
        student3.logout();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
    }

    @Test
    public void test04613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04613");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        java.lang.String str6 = student3.getPassword();
        student3.setVerified(false);
        student3.setVerified(false);
        java.lang.String str11 = student3.getPassword();
        student3.viewProfile();
        student3.logout();
        student3.logout();
        java.lang.String str15 = student3.getEmail();
        student3.login("student", "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test04614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04614");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        student3.setVerified(false);
        java.lang.String str10 = student3.getAccountType();
        java.lang.String str11 = student3.getEmail();
        student3.logout();
        boolean boolean13 = student3.isVerified();
        java.lang.String str14 = student3.getAccountType();
        student3.login("", "student");
        student3.logout();
        java.lang.String str19 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "student" + "'", str10, "student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "student" + "'", str14, "student");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "student" + "'", str19, "student");
    }

    @Test
    public void test04615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04615");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        student3.setVerified(false);
        java.lang.String str6 = student3.getPassword();
        java.lang.String str7 = student3.getID();
        student3.login("", "hi!");
        student3.setVerified(false);
        boolean boolean13 = student3.isVerified();
        java.lang.String str14 = student3.getAccountType();
        student3.viewProfile();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "student" + "'", str14, "student");
    }

    @Test
    public void test04616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04616");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        student3.setVerified(false);
        java.lang.String str10 = student3.getAccountType();
        java.lang.String str11 = student3.getEmail();
        boolean boolean12 = student3.isVerified();
        java.lang.String str13 = student3.getEmail();
        java.lang.String str14 = student3.getEmail();
        boolean boolean15 = student3.isVerified();
        java.lang.String str16 = student3.getAccountType();
        student3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "student" + "'", str10, "student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "student" + "'", str16, "student");
    }

    @Test
    public void test04617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04617");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        java.lang.String str8 = student3.getPassword();
        student3.logout();
        boolean boolean10 = student3.isVerified();
        java.lang.String str11 = student3.getEmail();
        java.lang.String str12 = student3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test04618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04618");
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
        student3.viewProfile();
        java.lang.String str19 = student3.getPassword();
        student3.login("hi!", "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 20.0d + "'", double14 == 20.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test04619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04619");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        java.lang.String str7 = student3.getID();
        student3.setVerified(true);
        java.lang.String str10 = student3.getEmail();
        student3.setVerified(true);
        student3.setVerified(true);
        java.lang.String str15 = student3.getPassword();
        student3.login("hi!", "student");
        java.lang.String str19 = student3.getEmail();
        student3.logout();
        java.lang.String str21 = student3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test04620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04620");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getAccountType();
        student3.logout();
        java.lang.String str8 = student3.getEmail();
        student3.viewProfile();
        java.lang.String str10 = student3.getID();
        student3.login("", "student");
        student3.logout();
        boolean boolean15 = student3.isVerified();
        student3.setVerified(true);
        java.lang.String str18 = student3.getPassword();
        student3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test04621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04621");
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
        student3.login("hi!", "");
        java.lang.String str20 = student3.getAccountType();
        java.lang.String str21 = student3.getPassword();
        student3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 20.0d + "'", double16 == 20.0d);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "student" + "'", str20, "student");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test04622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04622");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        student3.setVerified(false);
        student3.viewProfile();
        java.lang.String str7 = student3.getEmail();
        java.lang.String str8 = student3.getAccountType();
        java.lang.String str9 = student3.getID();
        java.lang.String str10 = student3.getPassword();
        double double11 = student3.getHourlyRate();
        java.lang.String str12 = student3.getID();
        java.lang.String str13 = student3.getEmail();
        student3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test04623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04623");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        java.lang.String str6 = student3.getPassword();
        java.lang.String str7 = student3.getPassword();
        student3.login("hi!", "hi!");
        boolean boolean11 = student3.isVerified();
        student3.login("hi!", "hi!");
        java.lang.String str15 = student3.getAccountType();
        java.lang.String str16 = student3.getPassword();
        java.lang.String str17 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "student" + "'", str15, "student");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "student" + "'", str17, "student");
    }

    @Test
    public void test04624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04624");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        java.lang.String str8 = student3.getPassword();
        student3.setVerified(false);
        java.lang.String str11 = student3.getID();
        double double12 = student3.getHourlyRate();
        student3.viewProfile();
        student3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 20.0d + "'", double12 == 20.0d);
    }

    @Test
    public void test04625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04625");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        java.lang.String str8 = student3.getPassword();
        student3.logout();
        java.lang.String str10 = student3.getID();
        double double11 = student3.getHourlyRate();
        student3.setVerified(false);
        double double14 = student3.getHourlyRate();
        student3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 20.0d + "'", double14 == 20.0d);
    }

    @Test
    public void test04626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04626");
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
        boolean boolean17 = student3.isVerified();
        student3.setVerified(false);
        student3.setVerified(false);
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
    }

    @Test
    public void test04627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04627");
        model.Student student3 = new model.Student("", "", "hi!");
        student3.logout();
        java.lang.String str5 = student3.getID();
        java.lang.String str6 = student3.getEmail();
        double double7 = student3.getHourlyRate();
        java.lang.String str8 = student3.getEmail();
        student3.login("", "");
        student3.login("", "");
        student3.logout();
        java.lang.String str16 = student3.getEmail();
        student3.login("hi!", "student");
        student3.login("student", "");
        student3.login("student", "student");
        student3.setVerified(false);
        java.lang.Class<?> wildcardClass28 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test04628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04628");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        java.lang.String str8 = student3.getEmail();
        java.lang.String str9 = student3.getID();
        student3.login("hi!", "student");
        java.lang.String str13 = student3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test04629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04629");
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
        student3.login("hi!", "");
        student3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "student" + "'", str10, "student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 20.0d + "'", double15 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test04630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04630");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        student3.setVerified(false);
        student3.viewProfile();
        java.lang.String str7 = student3.getEmail();
        double double8 = student3.getHourlyRate();
        student3.viewProfile();
        java.lang.String str10 = student3.getAccountType();
        student3.login("hi!", "student");
        double double14 = student3.getHourlyRate();
        double double15 = student3.getHourlyRate();
        student3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "student" + "'", str10, "student");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 20.0d + "'", double14 == 20.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 20.0d + "'", double15 == 20.0d);
    }

    @Test
    public void test04631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04631");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        student3.setVerified(false);
        java.lang.String str9 = student3.getID();
        student3.setVerified(false);
        student3.logout();
        student3.setVerified(false);
        student3.logout();
        java.lang.String str16 = student3.getAccountType();
        boolean boolean17 = student3.isVerified();
        java.lang.String str18 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "student" + "'", str16, "student");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "student" + "'", str18, "student");
    }

    @Test
    public void test04632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04632");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        student3.logout();
        student3.login("hi!", "hi!");
        double double8 = student3.getHourlyRate();
        boolean boolean9 = student3.isVerified();
        java.lang.String str10 = student3.getAccountType();
        java.lang.String str11 = student3.getAccountType();
        java.lang.String str12 = student3.getID();
        student3.viewProfile();
        student3.setVerified(true);
        boolean boolean16 = student3.isVerified();
        student3.setVerified(false);
        java.lang.String str19 = student3.getEmail();
        java.lang.String str20 = student3.getPassword();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "student" + "'", str10, "student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "student" + "'", str11, "student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test04633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04633");
        model.Student student3 = new model.Student("hi!", "hi!", "");
        student3.logout();
        java.lang.String str5 = student3.getEmail();
        student3.logout();
        boolean boolean7 = student3.isVerified();
        java.lang.String str8 = student3.getPassword();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test04634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04634");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        java.lang.String str8 = student3.getEmail();
        java.lang.String str9 = student3.getPassword();
        boolean boolean10 = student3.isVerified();
        java.lang.String str11 = student3.getID();
        student3.login("hi!", "hi!");
        student3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test04635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04635");
        model.Student student3 = new model.Student("hi!", "hi!", "");
        java.lang.String str4 = student3.getEmail();
        student3.login("", "student");
        java.lang.String str8 = student3.getPassword();
        java.lang.String str9 = student3.getEmail();
        double double10 = student3.getHourlyRate();
        double double11 = student3.getHourlyRate();
        java.lang.String str12 = student3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test04636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04636");
        model.Student student3 = new model.Student("", "hi!", "hi!");
        student3.login("student", "student");
        java.lang.String str7 = student3.getID();
        student3.logout();
        java.lang.String str9 = student3.getAccountType();
        java.lang.String str10 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "student" + "'", str9, "student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "student" + "'", str10, "student");
    }

    @Test
    public void test04637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04637");
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
        student3.login("hi!", "hi!");
        java.lang.Class<?> wildcardClass20 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test04638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04638");
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
        java.lang.String str16 = student3.getEmail();
        java.lang.String str17 = student3.getID();
        student3.login("", "student");
        student3.logout();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test04639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04639");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        student3.setVerified(false);
        java.lang.String str6 = student3.getPassword();
        java.lang.String str7 = student3.getAccountType();
        java.lang.String str8 = student3.getEmail();
        student3.setVerified(true);
        double double11 = student3.getHourlyRate();
        java.lang.String str12 = student3.getEmail();
        student3.setVerified(false);
        java.lang.String str15 = student3.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test04640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04640");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        double double6 = student3.getHourlyRate();
        student3.logout();
        student3.setVerified(true);
        java.lang.String str10 = student3.getEmail();
        java.lang.String str11 = student3.getID();
        boolean boolean12 = student3.isVerified();
        double double13 = student3.getHourlyRate();
        java.lang.String str14 = student3.getID();
        student3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 20.0d + "'", double13 == 20.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test04641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04641");
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
        java.lang.String str18 = student3.getID();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 20.0d + "'", double15 == 20.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test04642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04642");
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
        boolean boolean16 = student3.isVerified();
        java.lang.String str17 = student3.getAccountType();
        java.lang.String str18 = student3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "student" + "'", str11, "student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "student" + "'", str14, "student");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "student" + "'", str17, "student");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test04643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04643");
        model.Student student3 = new model.Student("hi!", "student", "");
        java.lang.String str4 = student3.getEmail();
        student3.viewProfile();
        student3.setVerified(true);
        double double8 = student3.getHourlyRate();
        java.lang.String str9 = student3.getAccountType();
        java.lang.String str10 = student3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "student" + "'", str9, "student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test04644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04644");
        model.Student student3 = new model.Student("hi!", "student", "");
        java.lang.String str4 = student3.getEmail();
        student3.logout();
        java.lang.String str6 = student3.getID();
        java.lang.String str7 = student3.getPassword();
        student3.login("student", "student");
        double double11 = student3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
    }

    @Test
    public void test04645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04645");
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
        boolean boolean14 = student3.isVerified();
        student3.viewProfile();
        boolean boolean16 = student3.isVerified();
        java.lang.String str17 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "student" + "'", str17, "student");
    }

    @Test
    public void test04646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04646");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        student3.setVerified(false);
        java.lang.String str6 = student3.getEmail();
        java.lang.String str7 = student3.getAccountType();
        java.lang.String str8 = student3.getEmail();
        student3.viewProfile();
        java.lang.String str10 = student3.getID();
        java.lang.Class<?> wildcardClass11 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test04647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04647");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        java.lang.String str4 = student3.getAccountType();
        java.lang.String str5 = student3.getEmail();
        student3.viewProfile();
        double double7 = student3.getHourlyRate();
        student3.viewProfile();
        java.lang.String str9 = student3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "student" + "'", str4, "student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test04648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04648");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        student3.setVerified(false);
        student3.viewProfile();
        java.lang.String str7 = student3.getEmail();
        java.lang.String str8 = student3.getAccountType();
        java.lang.String str9 = student3.getID();
        java.lang.String str10 = student3.getAccountType();
        java.lang.String str11 = student3.getPassword();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "student" + "'", str10, "student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test04649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04649");
        model.Student student3 = new model.Student("hi!", "", "student");
        java.lang.String str4 = student3.getPassword();
        student3.logout();
        double double6 = student3.getHourlyRate();
        java.lang.Class<?> wildcardClass7 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test04650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04650");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        student3.setVerified(false);
        student3.viewProfile();
        java.lang.String str7 = student3.getEmail();
        java.lang.String str8 = student3.getID();
        student3.viewProfile();
        java.lang.String str10 = student3.getEmail();
        java.lang.String str11 = student3.getEmail();
        java.lang.String str12 = student3.getPassword();
        java.lang.String str13 = student3.getPassword();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test04651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04651");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getAccountType();
        java.lang.String str7 = student3.getAccountType();
        java.lang.String str8 = student3.getEmail();
        java.lang.String str9 = student3.getID();
        java.lang.String str10 = student3.getID();
        java.lang.String str11 = student3.getID();
        java.lang.String str12 = student3.getPassword();
        java.lang.String str13 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "student" + "'", str13, "student");
    }

    @Test
    public void test04652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04652");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        student3.setVerified(false);
        student3.viewProfile();
        java.lang.String str7 = student3.getEmail();
        java.lang.String str8 = student3.getAccountType();
        java.lang.String str9 = student3.getID();
        student3.setVerified(false);
        double double12 = student3.getHourlyRate();
        java.lang.String str13 = student3.getAccountType();
        student3.login("hi!", "");
        java.lang.String str17 = student3.getPassword();
        java.lang.String str18 = student3.getPassword();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 20.0d + "'", double12 == 20.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "student" + "'", str13, "student");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test04653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04653");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        double double6 = student3.getHourlyRate();
        java.lang.String str7 = student3.getPassword();
        student3.login("", "student");
        java.lang.String str11 = student3.getAccountType();
        java.lang.String str12 = student3.getAccountType();
        student3.logout();
        student3.logout();
        boolean boolean15 = student3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "student" + "'", str11, "student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "student" + "'", str12, "student");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test04654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04654");
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
        java.lang.String str17 = student3.getID();
        student3.viewProfile();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 20.0d + "'", double14 == 20.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "student" + "'", str15, "student");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test04655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04655");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        student3.setVerified(false);
        java.lang.String str10 = student3.getID();
        student3.viewProfile();
        double double12 = student3.getHourlyRate();
        double double13 = student3.getHourlyRate();
        java.lang.String str14 = student3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 20.0d + "'", double12 == 20.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 20.0d + "'", double13 == 20.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test04656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04656");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        student3.setVerified(false);
        java.lang.String str6 = student3.getPassword();
        java.lang.String str7 = student3.getAccountType();
        student3.viewProfile();
        double double9 = student3.getHourlyRate();
        java.lang.String str10 = student3.getEmail();
        student3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test04657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04657");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        java.lang.String str8 = student3.getAccountType();
        student3.setVerified(false);
        student3.viewProfile();
        java.lang.String str12 = student3.getAccountType();
        java.lang.String str13 = student3.getEmail();
        java.lang.String str14 = student3.getAccountType();
        student3.logout();
        student3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "student" + "'", str12, "student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "student" + "'", str14, "student");
    }

    @Test
    public void test04658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04658");
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
        student3.setVerified(true);
        java.lang.String str20 = student3.getPassword();
        student3.setVerified(true);
        student3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 20.0d + "'", double13 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test04659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04659");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        student3.setVerified(false);
        java.lang.String str6 = student3.getPassword();
        java.lang.String str7 = student3.getAccountType();
        student3.viewProfile();
        student3.login("", "hi!");
        boolean boolean12 = student3.isVerified();
        student3.logout();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test04660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04660");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        java.lang.String str8 = student3.getAccountType();
        student3.setVerified(false);
        student3.viewProfile();
        java.lang.String str12 = student3.getAccountType();
        java.lang.String str13 = student3.getEmail();
        java.lang.String str14 = student3.getEmail();
        student3.setVerified(true);
        double double17 = student3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "student" + "'", str12, "student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 20.0d + "'", double17 == 20.0d);
    }

    @Test
    public void test04661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04661");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        java.lang.String str4 = student3.getAccountType();
        java.lang.String str5 = student3.getEmail();
        java.lang.String str6 = student3.getAccountType();
        java.lang.String str7 = student3.getAccountType();
        java.lang.String str8 = student3.getPassword();
        student3.setVerified(true);
        student3.login("student", "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "student" + "'", str4, "student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test04662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04662");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        double double6 = student3.getHourlyRate();
        student3.logout();
        student3.viewProfile();
        java.lang.String str9 = student3.getEmail();
        java.lang.String str10 = student3.getEmail();
        java.lang.String str11 = student3.getAccountType();
        student3.logout();
        java.lang.String str13 = student3.getEmail();
        student3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "student" + "'", str11, "student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test04663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04663");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        java.lang.String str6 = student3.getPassword();
        student3.setVerified(false);
        student3.setVerified(false);
        java.lang.String str11 = student3.getAccountType();
        boolean boolean12 = student3.isVerified();
        java.lang.String str13 = student3.getPassword();
        java.lang.String str14 = student3.getEmail();
        boolean boolean15 = student3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "student" + "'", str11, "student");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test04664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04664");
        model.Student student3 = new model.Student("", "student", "");
        student3.setVerified(true);
        student3.logout();
        student3.setVerified(true);
        student3.logout();
        student3.login("", "student");
        student3.setVerified(true);
    }

    @Test
    public void test04665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04665");
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
        java.lang.String str16 = student3.getEmail();
        java.lang.Class<?> wildcardClass17 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test04666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04666");
        model.Student student3 = new model.Student("", "", "hi!");
        student3.logout();
        java.lang.String str5 = student3.getID();
        java.lang.String str6 = student3.getEmail();
        java.lang.String str7 = student3.getEmail();
        student3.logout();
        double double9 = student3.getHourlyRate();
        boolean boolean10 = student3.isVerified();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test04667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04667");
        model.Student student3 = new model.Student("hi!", "hi!", "");
        student3.logout();
        java.lang.String str5 = student3.getEmail();
        student3.setVerified(true);
        student3.setVerified(true);
        student3.setVerified(false);
        java.lang.String str12 = student3.getID();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test04668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04668");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.login("", "");
        boolean boolean10 = student3.isVerified();
        student3.setVerified(true);
        student3.login("", "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test04669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04669");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        student3.setVerified(false);
        student3.logout();
        java.lang.String str11 = student3.getEmail();
        boolean boolean12 = student3.isVerified();
        java.lang.String str13 = student3.getPassword();
        java.lang.Class<?> wildcardClass14 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test04670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04670");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        double double6 = student3.getHourlyRate();
        student3.logout();
        student3.viewProfile();
        java.lang.String str9 = student3.getEmail();
        boolean boolean10 = student3.isVerified();
        java.lang.String str11 = student3.getPassword();
        student3.login("", "hi!");
        double double15 = student3.getHourlyRate();
        student3.viewProfile();
        student3.setVerified(false);
        student3.setVerified(false);
        double double21 = student3.getHourlyRate();
        student3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 20.0d + "'", double15 == 20.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 20.0d + "'", double21 == 20.0d);
    }

    @Test
    public void test04671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04671");
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
        student3.viewProfile();
        student3.setVerified(false);
        student3.login("hi!", "hi!");
        student3.login("student", "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 20.0d + "'", double15 == 20.0d);
    }

    @Test
    public void test04672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04672");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        student3.logout();
        student3.login("hi!", "hi!");
        double double8 = student3.getHourlyRate();
        boolean boolean9 = student3.isVerified();
        java.lang.String str10 = student3.getAccountType();
        java.lang.String str11 = student3.getPassword();
        java.lang.String str12 = student3.getID();
        java.lang.String str13 = student3.getID();
        boolean boolean14 = student3.isVerified();
        double double15 = student3.getHourlyRate();
        java.lang.String str16 = student3.getAccountType();
        student3.setVerified(true);
        student3.setVerified(false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "student" + "'", str10, "student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 20.0d + "'", double15 == 20.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "student" + "'", str16, "student");
    }

    @Test
    public void test04673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04673");
        model.Student student3 = new model.Student("student", "hi!", "");
        student3.login("hi!", "hi!");
        student3.logout();
        student3.viewProfile();
        java.lang.String str9 = student3.getPassword();
        student3.viewProfile();
        java.lang.String str11 = student3.getPassword();
        student3.viewProfile();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test04674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04674");
        model.Student student3 = new model.Student("", "", "hi!");
        student3.login("", "");
        double double7 = student3.getHourlyRate();
        student3.login("student", "student");
        java.lang.String str11 = student3.getID();
        student3.logout();
        student3.logout();
        student3.setVerified(false);
        java.lang.String str16 = student3.getPassword();
        student3.logout();
        student3.setVerified(false);
        java.lang.String str20 = student3.getPassword();
        java.lang.Class<?> wildcardClass21 = student3.getClass();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test04675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04675");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        student3.login("", "student");
        student3.login("hi!", "hi!");
        java.lang.String str13 = student3.getAccountType();
        java.lang.String str14 = student3.getEmail();
        java.lang.String str15 = student3.getPassword();
        java.lang.String str16 = student3.getEmail();
        student3.login("student", "student");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "student" + "'", str13, "student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test04676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04676");
        model.Student student3 = new model.Student("", "", "student");
        java.lang.String str4 = student3.getAccountType();
        java.lang.String str5 = student3.getID();
        double double6 = student3.getHourlyRate();
        boolean boolean7 = student3.isVerified();
        java.lang.String str8 = student3.getEmail();
        boolean boolean9 = student3.isVerified();
        double double10 = student3.getHourlyRate();
        java.lang.String str11 = student3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "student" + "'", str4, "student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test04677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04677");
        model.Student student3 = new model.Student("student", "student", "hi!");
        java.lang.String str4 = student3.getEmail();
        java.lang.String str5 = student3.getPassword();
        student3.login("student", "");
        student3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "student" + "'", str4, "student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
    }

    @Test
    public void test04678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04678");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        java.lang.String str6 = student3.getPassword();
        student3.setVerified(false);
        student3.setVerified(true);
        student3.viewProfile();
        java.lang.String str12 = student3.getEmail();
        student3.login("student", "student");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test04679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04679");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.login("", "");
        java.lang.String str10 = student3.getAccountType();
        student3.viewProfile();
        java.lang.String str12 = student3.getPassword();
        student3.login("hi!", "student");
        java.lang.String str16 = student3.getID();
        student3.logout();
        boolean boolean18 = student3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "student" + "'", str10, "student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test04680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04680");
        model.Student student3 = new model.Student("", "", "hi!");
        student3.logout();
        java.lang.String str5 = student3.getID();
        java.lang.String str6 = student3.getEmail();
        java.lang.String str7 = student3.getPassword();
        java.lang.String str8 = student3.getID();
        student3.setVerified(false);
        student3.login("hi!", "");
        java.lang.String str14 = student3.getEmail();
        double double15 = student3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 20.0d + "'", double15 == 20.0d);
    }

    @Test
    public void test04681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04681");
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
        boolean boolean15 = student3.isVerified();
        double double16 = student3.getHourlyRate();
        student3.setVerified(true);
        java.lang.String str19 = student3.getAccountType();
        java.lang.String str20 = student3.getID();
        double double21 = student3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 20.0d + "'", double13 == 20.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 20.0d + "'", double14 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 20.0d + "'", double16 == 20.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "student" + "'", str19, "student");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 20.0d + "'", double21 == 20.0d);
    }

    @Test
    public void test04682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04682");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        student3.setVerified(false);
        java.lang.String str10 = student3.getAccountType();
        java.lang.String str11 = student3.getEmail();
        boolean boolean12 = student3.isVerified();
        student3.login("", "student");
        student3.login("", "student");
        double double19 = student3.getHourlyRate();
        java.lang.String str20 = student3.getID();
        student3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "student" + "'", str10, "student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 20.0d + "'", double19 == 20.0d);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test04683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04683");
        model.Student student3 = new model.Student("", "student", "");
        student3.login("student", "");
        java.lang.String str7 = student3.getPassword();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
    }

    @Test
    public void test04684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04684");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        java.lang.String str4 = student3.getAccountType();
        java.lang.String str5 = student3.getID();
        student3.setVerified(true);
        student3.login("student", "student");
        java.lang.String str11 = student3.getPassword();
        java.lang.String str12 = student3.getEmail();
        student3.logout();
        java.lang.String str14 = student3.getPassword();
        java.lang.String str15 = student3.getEmail();
        java.lang.String str16 = student3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "student" + "'", str4, "student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test04685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04685");
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
        java.lang.String str13 = student3.getAccountType();
        boolean boolean14 = student3.isVerified();
        boolean boolean15 = student3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "student" + "'", str13, "student");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test04686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04686");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getAccountType();
        student3.logout();
        java.lang.String str8 = student3.getAccountType();
        double double9 = student3.getHourlyRate();
        student3.setVerified(true);
        boolean boolean12 = student3.isVerified();
        student3.setVerified(false);
        student3.login("student", "student");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test04687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04687");
        model.Student student3 = new model.Student("hi!", "", "student");
        java.lang.String str4 = student3.getPassword();
        double double5 = student3.getHourlyRate();
        java.lang.String str6 = student3.getPassword();
        java.lang.String str7 = student3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test04688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04688");
        model.Student student3 = new model.Student("", "student", "student");
        student3.setVerified(true);
        java.lang.String str6 = student3.getPassword();
        boolean boolean7 = student3.isVerified();
        java.lang.String str8 = student3.getEmail();
        double double9 = student3.getHourlyRate();
        java.lang.String str10 = student3.getEmail();
        java.lang.String str11 = student3.getPassword();
        java.lang.String str12 = student3.getID();
        java.lang.String str13 = student3.getEmail();
        student3.login("hi!", "student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "student" + "'", str11, "student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "student" + "'", str12, "student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test04689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04689");
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
        student3.viewProfile();
        student3.login("student", "student");
        java.lang.String str19 = student3.getID();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 20.0d + "'", double13 == 20.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 20.0d + "'", double14 == 20.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test04690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04690");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getAccountType();
        student3.login("hi!", "hi!");
        student3.logout();
        java.lang.String str11 = student3.getPassword();
        student3.logout();
        student3.login("", "student");
        java.lang.Class<?> wildcardClass16 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test04691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04691");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        student3.setVerified(false);
        student3.viewProfile();
        student3.login("hi!", "");
        student3.login("student", "hi!");
        java.lang.String str17 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "student" + "'", str17, "student");
    }

    @Test
    public void test04692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04692");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        student3.setVerified(false);
        java.lang.String str9 = student3.getID();
        student3.setVerified(false);
        boolean boolean12 = student3.isVerified();
        student3.setVerified(true);
        double double15 = student3.getHourlyRate();
        student3.setVerified(false);
        student3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 20.0d + "'", double15 == 20.0d);
    }

    @Test
    public void test04693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04693");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        java.lang.String str4 = student3.getAccountType();
        java.lang.String str5 = student3.getID();
        student3.viewProfile();
        student3.setVerified(true);
        double double9 = student3.getHourlyRate();
        java.lang.String str10 = student3.getPassword();
        student3.viewProfile();
        student3.login("", "student");
        student3.setVerified(true);
        java.lang.String str17 = student3.getID();
        java.lang.String str18 = student3.getEmail();
        java.lang.String str19 = student3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "student" + "'", str4, "student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test04694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04694");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        double double6 = student3.getHourlyRate();
        java.lang.String str7 = student3.getPassword();
        java.lang.String str8 = student3.getPassword();
        student3.login("student", "student");
        double double12 = student3.getHourlyRate();
        java.lang.String str13 = student3.getEmail();
        java.lang.String str14 = student3.getEmail();
        java.lang.String str15 = student3.getAccountType();
        student3.setVerified(true);
        student3.login("hi!", "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 20.0d + "'", double12 == 20.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "student" + "'", str15, "student");
    }

    @Test
    public void test04695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04695");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        double double4 = student3.getHourlyRate();
        student3.viewProfile();
        java.lang.Class<?> wildcardClass6 = student3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test04696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04696");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        student3.setVerified(false);
        student3.viewProfile();
        java.lang.String str7 = student3.getEmail();
        student3.viewProfile();
        java.lang.String str9 = student3.getEmail();
        java.lang.String str10 = student3.getEmail();
        student3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test04697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04697");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.login("", "");
        double double10 = student3.getHourlyRate();
        java.lang.String str11 = student3.getPassword();
        boolean boolean12 = student3.isVerified();
        java.lang.String str13 = student3.getPassword();
        java.lang.String str14 = student3.getID();
        java.lang.String str15 = student3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test04698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04698");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        student3.logout();
        student3.login("hi!", "hi!");
        double double8 = student3.getHourlyRate();
        boolean boolean9 = student3.isVerified();
        java.lang.String str10 = student3.getAccountType();
        java.lang.String str11 = student3.getAccountType();
        double double12 = student3.getHourlyRate();
        student3.login("", "");
        boolean boolean16 = student3.isVerified();
        student3.setVerified(false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "student" + "'", str10, "student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "student" + "'", str11, "student");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 20.0d + "'", double12 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test04699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04699");
        model.Student student3 = new model.Student("", "student", "");
        student3.setVerified(true);
        student3.setVerified(true);
        student3.login("", "student");
        java.lang.String str11 = student3.getPassword();
        java.lang.String str12 = student3.getEmail();
        boolean boolean13 = student3.isVerified();
        double double14 = student3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "student" + "'", str11, "student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 20.0d + "'", double14 == 20.0d);
    }

    @Test
    public void test04700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04700");
        model.Student student3 = new model.Student("", "", "");
        student3.viewProfile();
        double double5 = student3.getHourlyRate();
        java.lang.String str6 = student3.getEmail();
        boolean boolean7 = student3.isVerified();
        double double8 = student3.getHourlyRate();
        boolean boolean9 = student3.isVerified();
        student3.login("student", "");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test04701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04701");
        model.Student student3 = new model.Student("hi!", "", "");
        student3.viewProfile();
        student3.login("hi!", "");
    }

    @Test
    public void test04702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04702");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        java.lang.String str8 = student3.getPassword();
        student3.setVerified(false);
        java.lang.String str11 = student3.getEmail();
        java.lang.String str12 = student3.getPassword();
        java.lang.String str13 = student3.getEmail();
        java.lang.String str14 = student3.getPassword();
        student3.login("", "student");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test04703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04703");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        java.lang.String str4 = student3.getPassword();
        double double5 = student3.getHourlyRate();
        double double6 = student3.getHourlyRate();
        student3.viewProfile();
        student3.setVerified(false);
        java.lang.String str10 = student3.getAccountType();
        java.lang.String str11 = student3.getEmail();
        java.lang.Class<?> wildcardClass12 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "student" + "'", str10, "student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test04704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04704");
        model.Student student3 = new model.Student("", "", "hi!");
        student3.logout();
        java.lang.String str5 = student3.getID();
        java.lang.String str6 = student3.getEmail();
        double double7 = student3.getHourlyRate();
        boolean boolean8 = student3.isVerified();
        java.lang.String str9 = student3.getID();
        double double10 = student3.getHourlyRate();
        java.lang.String str11 = student3.getEmail();
        java.lang.String str12 = student3.getAccountType();
        java.lang.Class<?> wildcardClass13 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "student" + "'", str12, "student");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test04705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04705");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        student3.setVerified(false);
        java.lang.String str10 = student3.getAccountType();
        java.lang.String str11 = student3.getEmail();
        student3.logout();
        boolean boolean13 = student3.isVerified();
        boolean boolean14 = student3.isVerified();
        java.lang.String str15 = student3.getAccountType();
        java.lang.String str16 = student3.getEmail();
        student3.logout();
        double double18 = student3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "student" + "'", str10, "student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "student" + "'", str15, "student");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 20.0d + "'", double18 == 20.0d);
    }

    @Test
    public void test04706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04706");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        java.lang.String str4 = student3.getPassword();
        double double5 = student3.getHourlyRate();
        double double6 = student3.getHourlyRate();
        student3.logout();
        java.lang.String str8 = student3.getAccountType();
        java.lang.String str9 = student3.getPassword();
        java.lang.String str10 = student3.getEmail();
        double double11 = student3.getHourlyRate();
        java.lang.String str12 = student3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test04707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04707");
        model.Student student3 = new model.Student("", "student", "");
        student3.viewProfile();
        boolean boolean5 = student3.isVerified();
        student3.setVerified(false);
        student3.login("hi!", "");
        student3.setVerified(true);
        java.lang.Class<?> wildcardClass13 = student3.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test04708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04708");
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
        java.lang.String str17 = student3.getAccountType();
        double double18 = student3.getHourlyRate();
        java.lang.String str19 = student3.getEmail();
        java.lang.String str20 = student3.getEmail();
        student3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "student" + "'", str17, "student");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 20.0d + "'", double18 == 20.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test04709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04709");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        student3.login("", "student");
        java.lang.String str10 = student3.getEmail();
        student3.login("", "hi!");
        java.lang.String str14 = student3.getPassword();
        boolean boolean15 = student3.isVerified();
        java.lang.String str16 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "student" + "'", str16, "student");
    }

    @Test
    public void test04710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04710");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        double double6 = student3.getHourlyRate();
        java.lang.String str7 = student3.getEmail();
        java.lang.String str8 = student3.getEmail();
        java.lang.String str9 = student3.getEmail();
        java.lang.String str10 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "student" + "'", str10, "student");
    }

    @Test
    public void test04711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04711");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        student3.login("", "hi!");
        student3.logout();
        java.lang.String str11 = student3.getEmail();
        student3.setVerified(true);
        student3.logout();
        student3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test04712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04712");
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
        boolean boolean14 = student3.isVerified();
        java.lang.String str15 = student3.getPassword();
        java.lang.String str16 = student3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test04713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04713");
        model.Student student3 = new model.Student("", "", "hi!");
        student3.logout();
        java.lang.String str5 = student3.getID();
        java.lang.String str6 = student3.getEmail();
        student3.login("hi!", "hi!");
        student3.login("student", "student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test04714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04714");
        model.Student student3 = new model.Student("", "", "hi!");
        student3.logout();
        java.lang.String str5 = student3.getID();
        java.lang.String str6 = student3.getEmail();
        double double7 = student3.getHourlyRate();
        java.lang.String str8 = student3.getEmail();
        java.lang.String str9 = student3.getEmail();
        java.lang.String str10 = student3.getPassword();
        student3.setVerified(true);
        student3.logout();
        student3.login("hi!", "");
        java.lang.String str17 = student3.getPassword();
        student3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test04715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04715");
        model.Student student3 = new model.Student("", "", "hi!");
        student3.logout();
        java.lang.String str5 = student3.getID();
        java.lang.String str6 = student3.getEmail();
        java.lang.String str7 = student3.getPassword();
        java.lang.String str8 = student3.getAccountType();
        java.lang.String str9 = student3.getPassword();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test04716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04716");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        double double6 = student3.getHourlyRate();
        java.lang.String str7 = student3.getID();
        boolean boolean8 = student3.isVerified();
        student3.setVerified(true);
        student3.setVerified(true);
        java.lang.String str13 = student3.getEmail();
        java.lang.Class<?> wildcardClass14 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test04717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04717");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getAccountType();
        student3.logout();
        boolean boolean8 = student3.isVerified();
        student3.logout();
        double double10 = student3.getHourlyRate();
        boolean boolean11 = student3.isVerified();
        java.lang.String str12 = student3.getEmail();
        java.lang.String str13 = student3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test04718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04718");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        java.lang.String str7 = student3.getID();
        java.lang.String str8 = student3.getID();
        java.lang.String str9 = student3.getID();
        student3.setVerified(true);
        double double12 = student3.getHourlyRate();
        double double13 = student3.getHourlyRate();
        double double14 = student3.getHourlyRate();
        student3.login("", "");
        student3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 20.0d + "'", double12 == 20.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 20.0d + "'", double13 == 20.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 20.0d + "'", double14 == 20.0d);
    }

    @Test
    public void test04719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04719");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        java.lang.String str8 = student3.getEmail();
        student3.viewProfile();
        java.lang.String str10 = student3.getAccountType();
        student3.login("student", "hi!");
        student3.login("", "");
        student3.setVerified(true);
        boolean boolean19 = student3.isVerified();
        java.lang.String str20 = student3.getAccountType();
        java.lang.String str21 = student3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "student" + "'", str10, "student");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "student" + "'", str20, "student");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test04720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04720");
        model.Student student3 = new model.Student("student", "hi!", "");
        java.lang.String str4 = student3.getID();
        double double5 = student3.getHourlyRate();
        java.lang.String str6 = student3.getID();
        student3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test04721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04721");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getID();
        java.lang.String str6 = student3.getID();
        student3.login("", "");
        java.lang.String str10 = student3.getID();
        java.lang.String str11 = student3.getEmail();
        java.lang.String str12 = student3.getPassword();
        java.lang.Class<?> wildcardClass13 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test04722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04722");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        student3.setVerified(false);
        java.lang.String str6 = student3.getPassword();
        java.lang.String str7 = student3.getAccountType();
        student3.viewProfile();
        student3.logout();
        boolean boolean10 = student3.isVerified();
        boolean boolean11 = student3.isVerified();
        boolean boolean12 = student3.isVerified();
        boolean boolean13 = student3.isVerified();
        java.lang.String str14 = student3.getAccountType();
        student3.login("hi!", "");
        student3.logout();
        java.lang.String str19 = student3.getEmail();
        student3.logout();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "student" + "'", str14, "student");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test04723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04723");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getAccountType();
        student3.logout();
        java.lang.String str8 = student3.getEmail();
        student3.viewProfile();
        double double10 = student3.getHourlyRate();
        boolean boolean11 = student3.isVerified();
        student3.logout();
        student3.login("hi!", "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test04724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04724");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        student3.setVerified(false);
        student3.logout();
        boolean boolean11 = student3.isVerified();
        java.lang.Class<?> wildcardClass12 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test04725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04725");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getAccountType();
        student3.logout();
        java.lang.String str8 = student3.getEmail();
        student3.viewProfile();
        double double10 = student3.getHourlyRate();
        java.lang.String str11 = student3.getID();
        java.lang.String str12 = student3.getEmail();
        student3.logout();
        double double14 = student3.getHourlyRate();
        boolean boolean15 = student3.isVerified();
        student3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 20.0d + "'", double14 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test04726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04726");
        model.Student student3 = new model.Student("", "", "student");
        java.lang.String str4 = student3.getAccountType();
        double double5 = student3.getHourlyRate();
        java.lang.Class<?> wildcardClass6 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "student" + "'", str4, "student");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test04727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04727");
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
        double double18 = student3.getHourlyRate();
        java.lang.String str19 = student3.getAccountType();
        student3.viewProfile();
        student3.setVerified(true);
        java.lang.String str23 = student3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "student" + "'", str12, "student");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 20.0d + "'", double18 == 20.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "student" + "'", str19, "student");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
    }

    @Test
    public void test04728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04728");
        model.Student student3 = new model.Student("", "", "hi!");
        student3.login("", "");
        student3.viewProfile();
        student3.viewProfile();
        student3.login("", "");
        student3.logout();
        java.lang.String str13 = student3.getID();
        boolean boolean14 = student3.isVerified();
        student3.login("hi!", "student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test04729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04729");
        model.Student student3 = new model.Student("", "", "hi!");
        student3.logout();
        java.lang.String str5 = student3.getEmail();
        java.lang.String str6 = student3.getEmail();
        student3.logout();
        student3.viewProfile();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test04730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04730");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        student3.setVerified(false);
        java.lang.String str10 = student3.getAccountType();
        java.lang.String str11 = student3.getEmail();
        student3.logout();
        boolean boolean13 = student3.isVerified();
        boolean boolean14 = student3.isVerified();
        java.lang.String str15 = student3.getPassword();
        boolean boolean16 = student3.isVerified();
        java.lang.String str17 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "student" + "'", str10, "student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "student" + "'", str17, "student");
    }

    @Test
    public void test04731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04731");
        model.Student student3 = new model.Student("", "", "hi!");
        student3.logout();
        java.lang.String str5 = student3.getID();
        java.lang.String str6 = student3.getEmail();
        java.lang.String str7 = student3.getEmail();
        java.lang.String str8 = student3.getEmail();
        java.lang.String str9 = student3.getID();
        java.lang.String str10 = student3.getPassword();
        student3.viewProfile();
        boolean boolean12 = student3.isVerified();
        boolean boolean13 = student3.isVerified();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test04732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04732");
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
        java.lang.String str15 = student3.getPassword();
        student3.logout();
        double double17 = student3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 20.0d + "'", double14 == 20.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 20.0d + "'", double17 == 20.0d);
    }

    @Test
    public void test04733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04733");
        model.Student student3 = new model.Student("hi!", "hi!", "student");
        student3.login("hi!", "student");
        student3.login("", "student");
        java.lang.String str10 = student3.getPassword();
        student3.viewProfile();
        student3.setVerified(false);
        double double14 = student3.getHourlyRate();
        java.lang.String str15 = student3.getID();
        java.lang.String str16 = student3.getEmail();
        java.lang.Class<?> wildcardClass17 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 20.0d + "'", double14 == 20.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "student" + "'", str15, "student");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test04734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04734");
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
        double double15 = student3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "student" + "'", str13, "student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 20.0d + "'", double15 == 20.0d);
    }

    @Test
    public void test04735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04735");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.viewProfile();
        boolean boolean8 = student3.isVerified();
        java.lang.String str9 = student3.getEmail();
        double double10 = student3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
    }

    @Test
    public void test04736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04736");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        double double6 = student3.getHourlyRate();
        java.lang.String str7 = student3.getPassword();
        java.lang.String str8 = student3.getPassword();
        student3.login("student", "hi!");
        student3.login("hi!", "");
        student3.login("hi!", "hi!");
        student3.setVerified(true);
        java.lang.Class<?> wildcardClass20 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test04737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04737");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        student3.setVerified(false);
        java.lang.String str10 = student3.getID();
        student3.viewProfile();
        java.lang.String str12 = student3.getID();
        boolean boolean13 = student3.isVerified();
        java.lang.String str14 = student3.getPassword();
        java.lang.String str15 = student3.getPassword();
        boolean boolean16 = student3.isVerified();
        student3.setVerified(false);
        student3.logout();
        student3.viewProfile();
        java.lang.Class<?> wildcardClass21 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test04738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04738");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.login("", "");
        java.lang.String str10 = student3.getAccountType();
        student3.viewProfile();
        student3.login("", "hi!");
        java.lang.String str15 = student3.getID();
        student3.setVerified(true);
        student3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "student" + "'", str10, "student");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test04739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04739");
        model.Student student3 = new model.Student("hi!", "", "student");
        java.lang.String str4 = student3.getPassword();
        double double5 = student3.getHourlyRate();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test04740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04740");
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
        student3.setVerified(true);
        double double16 = student3.getHourlyRate();
        java.lang.String str17 = student3.getPassword();
        java.lang.String str18 = student3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 20.0d + "'", double16 == 20.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test04741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04741");
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
        student3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "student" + "'", str13, "student");
    }

    @Test
    public void test04742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04742");
        model.Student student3 = new model.Student("", "", "hi!");
        student3.logout();
        java.lang.String str5 = student3.getID();
        java.lang.String str6 = student3.getEmail();
        java.lang.String str7 = student3.getPassword();
        java.lang.String str8 = student3.getID();
        student3.setVerified(false);
        student3.setVerified(true);
        java.lang.String str13 = student3.getEmail();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test04743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04743");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        java.lang.String str7 = student3.getID();
        double double8 = student3.getHourlyRate();
        double double9 = student3.getHourlyRate();
        student3.logout();
        java.lang.String str11 = student3.getID();
        student3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test04744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04744");
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
        double double15 = student3.getHourlyRate();
        java.lang.String str16 = student3.getID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "student" + "'", str11, "student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 20.0d + "'", double15 == 20.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test04745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04745");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        java.lang.String str7 = student3.getID();
        student3.setVerified(true);
        java.lang.String str10 = student3.getEmail();
        student3.setVerified(true);
        student3.login("", "");
        student3.viewProfile();
        student3.setVerified(false);
        java.lang.Class<?> wildcardClass19 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test04746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04746");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        double double6 = student3.getHourlyRate();
        java.lang.String str7 = student3.getPassword();
        java.lang.String str8 = student3.getID();
        double double9 = student3.getHourlyRate();
        java.lang.Class<?> wildcardClass10 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test04747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04747");
        model.Student student3 = new model.Student("", "", "hi!");
        student3.logout();
        java.lang.String str5 = student3.getID();
        java.lang.String str6 = student3.getEmail();
        double double7 = student3.getHourlyRate();
        java.lang.String str8 = student3.getPassword();
        student3.login("hi!", "hi!");
        student3.logout();
        student3.login("student", "hi!");
        java.lang.String str16 = student3.getPassword();
        double double17 = student3.getHourlyRate();
        student3.setVerified(true);
        boolean boolean20 = student3.isVerified();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 20.0d + "'", double17 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test04748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04748");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        student3.setVerified(false);
        java.lang.String str9 = student3.getID();
        student3.setVerified(false);
        java.lang.String str12 = student3.getID();
        java.lang.String str13 = student3.getID();
        java.lang.String str14 = student3.getEmail();
        double double15 = student3.getHourlyRate();
        java.lang.String str16 = student3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 20.0d + "'", double15 == 20.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test04749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04749");
        model.Student student3 = new model.Student("student", "hi!", "hi!");
        student3.setVerified(true);
    }

    @Test
    public void test04750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04750");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        student3.logout();
        student3.login("hi!", "hi!");
        double double8 = student3.getHourlyRate();
        java.lang.String str9 = student3.getID();
        java.lang.String str10 = student3.getAccountType();
        student3.setVerified(true);
        student3.viewProfile();
        boolean boolean14 = student3.isVerified();
        boolean boolean15 = student3.isVerified();
        student3.login("hi!", "student");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "student" + "'", str10, "student");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test04751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04751");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        student3.setVerified(false);
        java.lang.String str9 = student3.getID();
        student3.setVerified(false);
        double double12 = student3.getHourlyRate();
        student3.viewProfile();
        java.lang.String str14 = student3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 20.0d + "'", double12 == 20.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test04752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04752");
        model.Student student3 = new model.Student("", "", "hi!");
        student3.logout();
        java.lang.String str5 = student3.getID();
        java.lang.String str6 = student3.getEmail();
        double double7 = student3.getHourlyRate();
        java.lang.String str8 = student3.getEmail();
        student3.login("", "");
        student3.login("", "");
        student3.logout();
        java.lang.String str16 = student3.getEmail();
        student3.login("hi!", "student");
        student3.login("student", "");
        student3.viewProfile();
        student3.login("", "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test04753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04753");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.login("", "");
        java.lang.String str10 = student3.getAccountType();
        student3.viewProfile();
        student3.login("", "hi!");
        boolean boolean15 = student3.isVerified();
        java.lang.String str16 = student3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "student" + "'", str10, "student");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test04754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04754");
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
        java.lang.String str20 = student3.getEmail();
        student3.login("", "hi!");
        double double24 = student3.getHourlyRate();
        java.lang.String str25 = student3.getID();
        student3.setVerified(true);
        student3.logout();
        student3.viewProfile();
        java.lang.String str30 = student3.getID();
        boolean boolean31 = student3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 20.0d + "'", double24 == 20.0d);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test04755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04755");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        student3.setVerified(false);
        java.lang.String str10 = student3.getAccountType();
        java.lang.String str11 = student3.getEmail();
        boolean boolean12 = student3.isVerified();
        student3.login("", "student");
        double double16 = student3.getHourlyRate();
        java.lang.String str17 = student3.getID();
        student3.logout();
        java.lang.String str19 = student3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "student" + "'", str10, "student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 20.0d + "'", double16 == 20.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test04756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04756");
        model.Student student3 = new model.Student("hi!", "student", "");
        java.lang.String str4 = student3.getPassword();
        student3.setVerified(false);
        boolean boolean7 = student3.isVerified();
        java.lang.Class<?> wildcardClass8 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "student" + "'", str4, "student");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test04757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04757");
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
        java.lang.String str13 = student3.getEmail();
        java.lang.String str14 = student3.getPassword();
        java.lang.String str15 = student3.getEmail();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "student" + "'", str10, "student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test04758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04758");
        model.Student student3 = new model.Student("hi!", "student", "");
        student3.logout();
        java.lang.String str5 = student3.getEmail();
        java.lang.String str6 = student3.getEmail();
        student3.logout();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test04759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04759");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getID();
        java.lang.String str6 = student3.getID();
        student3.login("", "");
        student3.setVerified(false);
        java.lang.String str12 = student3.getEmail();
        boolean boolean13 = student3.isVerified();
        double double14 = student3.getHourlyRate();
        java.lang.String str15 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 20.0d + "'", double14 == 20.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "student" + "'", str15, "student");
    }

    @Test
    public void test04760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04760");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        student3.logout();
        student3.login("hi!", "hi!");
        double double8 = student3.getHourlyRate();
        boolean boolean9 = student3.isVerified();
        java.lang.String str10 = student3.getAccountType();
        java.lang.String str11 = student3.getAccountType();
        java.lang.String str12 = student3.getID();
        java.lang.String str13 = student3.getID();
        student3.login("hi!", "");
        boolean boolean17 = student3.isVerified();
        boolean boolean18 = student3.isVerified();
        double double19 = student3.getHourlyRate();
        boolean boolean20 = student3.isVerified();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "student" + "'", str10, "student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "student" + "'", str11, "student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 20.0d + "'", double19 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test04761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04761");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        boolean boolean7 = student3.isVerified();
        student3.logout();
        java.lang.String str9 = student3.getID();
        java.lang.String str10 = student3.getAccountType();
        student3.login("student", "student");
        boolean boolean14 = student3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "student" + "'", str10, "student");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test04762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04762");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.login("", "");
        java.lang.String str10 = student3.getAccountType();
        student3.viewProfile();
        student3.login("", "hi!");
        java.lang.String str15 = student3.getID();
        student3.setVerified(false);
        java.lang.String str18 = student3.getEmail();
        java.lang.String str19 = student3.getPassword();
        java.lang.Class<?> wildcardClass20 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "student" + "'", str10, "student");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test04763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04763");
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
        student3.logout();
        java.lang.String str16 = student3.getEmail();
        java.lang.String str17 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "student" + "'", str13, "student");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "student" + "'", str17, "student");
    }

    @Test
    public void test04764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04764");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        student3.logout();
        student3.login("hi!", "hi!");
        java.lang.String str8 = student3.getEmail();
        java.lang.String str9 = student3.getEmail();
        java.lang.String str10 = student3.getEmail();
        student3.logout();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test04765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04765");
        model.Student student3 = new model.Student("", "", "hi!");
        student3.login("", "");
        student3.viewProfile();
        student3.login("", "student");
        java.lang.String str11 = student3.getID();
        boolean boolean12 = student3.isVerified();
        java.lang.String str13 = student3.getPassword();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test04766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04766");
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
        student3.viewProfile();
        java.lang.String str18 = student3.getID();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "student" + "'", str15, "student");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test04767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04767");
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
        student3.viewProfile();
        java.lang.String str16 = student3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "student" + "'", str12, "student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test04768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04768");
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
        student3.viewProfile();
        boolean boolean16 = student3.isVerified();
        student3.viewProfile();
        boolean boolean18 = student3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 20.0d + "'", double13 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test04769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04769");
        model.Student student3 = new model.Student("hi!", "hi!", "hi!");
        double double4 = student3.getHourlyRate();
        java.lang.String str5 = student3.getPassword();
        java.lang.String str6 = student3.getPassword();
        student3.viewProfile();
        student3.viewProfile();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test04770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04770");
        model.Student student3 = new model.Student("", "", "hi!");
        student3.logout();
        java.lang.String str5 = student3.getID();
        java.lang.String str6 = student3.getEmail();
        java.lang.String str7 = student3.getID();
        boolean boolean8 = student3.isVerified();
        java.lang.String str9 = student3.getEmail();
        java.lang.String str10 = student3.getAccountType();
        java.lang.String str11 = student3.getEmail();
        student3.login("", "student");
        student3.viewProfile();
        student3.logout();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "student" + "'", str10, "student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test04771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04771");
        model.Student student3 = new model.Student("", "", "hi!");
        student3.logout();
        java.lang.String str5 = student3.getID();
        java.lang.String str6 = student3.getPassword();
        student3.logout();
        student3.viewProfile();
        java.lang.String str9 = student3.getAccountType();
        student3.login("hi!", "hi!");
        java.lang.String str13 = student3.getID();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "student" + "'", str9, "student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test04772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04772");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getID();
        java.lang.String str6 = student3.getID();
        student3.login("", "");
        student3.setVerified(false);
        java.lang.String str12 = student3.getEmail();
        boolean boolean13 = student3.isVerified();
        java.lang.String str14 = student3.getAccountType();
        student3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "student" + "'", str14, "student");
    }

    @Test
    public void test04773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04773");
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
        student3.setVerified(false);
        student3.login("hi!", "student");
        java.lang.String str20 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "student" + "'", str11, "student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 20.0d + "'", double13 == 20.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "student" + "'", str20, "student");
    }

    @Test
    public void test04774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04774");
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
        student3.login("student", "");
        student3.logout();
        java.lang.String str17 = student3.getID();
        java.lang.String str18 = student3.getEmail();
        java.lang.String str19 = student3.getAccountType();
        boolean boolean20 = student3.isVerified();
        student3.viewProfile();
        java.lang.Class<?> wildcardClass22 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 20.0d + "'", double12 == 20.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "student" + "'", str19, "student");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test04775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04775");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        boolean boolean7 = student3.isVerified();
        student3.login("", "hi!");
        java.lang.String str11 = student3.getEmail();
        student3.login("", "hi!");
        student3.viewProfile();
        student3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test04776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04776");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        java.lang.String str8 = student3.getAccountType();
        java.lang.String str9 = student3.getAccountType();
        java.lang.String str10 = student3.getID();
        student3.setVerified(true);
        student3.viewProfile();
        java.lang.String str14 = student3.getEmail();
        student3.login("student", "hi!");
        double double18 = student3.getHourlyRate();
        student3.setVerified(true);
        java.lang.String str21 = student3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "student" + "'", str9, "student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 20.0d + "'", double18 == 20.0d);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test04777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04777");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        boolean boolean7 = student3.isVerified();
        student3.logout();
        java.lang.String str9 = student3.getID();
        java.lang.String str10 = student3.getAccountType();
        student3.logout();
        student3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "student" + "'", str10, "student");
    }

    @Test
    public void test04778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04778");
        model.Student student3 = new model.Student("hi!", "", "student");
        java.lang.String str4 = student3.getPassword();
        double double5 = student3.getHourlyRate();
        double double6 = student3.getHourlyRate();
        student3.login("student", "");
        java.lang.String str10 = student3.getID();
        student3.viewProfile();
        java.lang.String str12 = student3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "student" + "'", str10, "student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "student" + "'", str12, "student");
    }

    @Test
    public void test04779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04779");
        model.Student student3 = new model.Student("hi!", "hi!", "");
        student3.setVerified(true);
        student3.login("student", "");
        student3.viewProfile();
        java.lang.String str10 = student3.getID();
        java.lang.Class<?> wildcardClass11 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test04780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04780");
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
        student3.setVerified(false);
        student3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test04781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04781");
        model.Student student3 = new model.Student("hi!", "hi!", "");
        java.lang.String str4 = student3.getAccountType();
        java.lang.String str5 = student3.getID();
        student3.setVerified(true);
        java.lang.String str8 = student3.getID();
        student3.setVerified(false);
        boolean boolean11 = student3.isVerified();
        java.lang.Class<?> wildcardClass12 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "student" + "'", str4, "student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test04782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04782");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.viewProfile();
        java.lang.String str8 = student3.getAccountType();
        java.lang.String str9 = student3.getPassword();
        student3.logout();
        student3.viewProfile();
        student3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test04783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04783");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        student3.logout();
        student3.login("hi!", "hi!");
        student3.viewProfile();
        student3.login("", "student");
        student3.setVerified(true);
        java.lang.String str14 = student3.getAccountType();
        student3.setVerified(false);
        java.lang.String str17 = student3.getEmail();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "student" + "'", str14, "student");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test04784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04784");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        java.lang.String str4 = student3.getAccountType();
        java.lang.String str5 = student3.getEmail();
        student3.viewProfile();
        student3.setVerified(true);
        java.lang.String str9 = student3.getPassword();
        student3.setVerified(false);
        java.lang.String str12 = student3.getAccountType();
        java.lang.String str13 = student3.getPassword();
        double double14 = student3.getHourlyRate();
        java.lang.String str15 = student3.getEmail();
        java.lang.String str16 = student3.getEmail();
        java.lang.Class<?> wildcardClass17 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "student" + "'", str4, "student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "student" + "'", str12, "student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 20.0d + "'", double14 == 20.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test04785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04785");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        java.lang.String str6 = student3.getPassword();
        student3.setVerified(false);
        student3.setVerified(false);
        java.lang.String str11 = student3.getAccountType();
        student3.logout();
        student3.login("", "hi!");
        student3.setVerified(true);
        java.lang.String str18 = student3.getPassword();
        boolean boolean19 = student3.isVerified();
        java.lang.String str20 = student3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "student" + "'", str11, "student");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test04786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04786");
        model.Student student3 = new model.Student("hi!", "hi!", "hi!");
        student3.login("hi!", "student");
        student3.logout();
        java.lang.String str8 = student3.getPassword();
        student3.logout();
        student3.logout();
        student3.logout();
        student3.logout();
        java.lang.String str13 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "student" + "'", str13, "student");
    }

    @Test
    public void test04787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04787");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.login("", "");
        java.lang.String str10 = student3.getID();
        student3.logout();
        boolean boolean12 = student3.isVerified();
        boolean boolean13 = student3.isVerified();
        boolean boolean14 = student3.isVerified();
        java.lang.String str15 = student3.getAccountType();
        boolean boolean16 = student3.isVerified();
        java.lang.Class<?> wildcardClass17 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "student" + "'", str15, "student");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test04788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04788");
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
        java.lang.String str16 = student3.getID();
        student3.setVerified(false);
        double double19 = student3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 20.0d + "'", double15 == 20.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 20.0d + "'", double19 == 20.0d);
    }

    @Test
    public void test04789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04789");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getAccountType();
        student3.login("hi!", "hi!");
        student3.login("", "student");
        student3.logout();
        double double14 = student3.getHourlyRate();
        double double15 = student3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 20.0d + "'", double14 == 20.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 20.0d + "'", double15 == 20.0d);
    }

    @Test
    public void test04790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04790");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        double double6 = student3.getHourlyRate();
        student3.logout();
        student3.viewProfile();
        java.lang.String str9 = student3.getEmail();
        boolean boolean10 = student3.isVerified();
        java.lang.String str11 = student3.getPassword();
        student3.logout();
        student3.login("student", "");
        student3.login("", "student");
        student3.setVerified(false);
        java.lang.String str21 = student3.getEmail();
        student3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test04791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04791");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        java.lang.String str7 = student3.getID();
        student3.setVerified(true);
        java.lang.String str10 = student3.getAccountType();
        java.lang.String str11 = student3.getPassword();
        java.lang.String str12 = student3.getAccountType();
        double double13 = student3.getHourlyRate();
        student3.viewProfile();
        java.lang.String str15 = student3.getEmail();
        java.lang.String str16 = student3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "student" + "'", str10, "student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "student" + "'", str12, "student");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 20.0d + "'", double13 == 20.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test04792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04792");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        java.lang.String str7 = student3.getID();
        student3.setVerified(true);
        java.lang.String str10 = student3.getEmail();
        student3.setVerified(true);
        student3.login("", "");
        java.lang.String str16 = student3.getAccountType();
        java.lang.String str17 = student3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "student" + "'", str16, "student");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test04793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04793");
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
        java.lang.String str16 = student3.getPassword();
        student3.login("hi!", "");
        student3.login("", "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "student" + "'", str11, "student");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test04794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04794");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        double double6 = student3.getHourlyRate();
        java.lang.String str7 = student3.getPassword();
        student3.login("", "student");
        boolean boolean11 = student3.isVerified();
        double double12 = student3.getHourlyRate();
        double double13 = student3.getHourlyRate();
        student3.viewProfile();
        java.lang.String str15 = student3.getID();
        java.lang.String str16 = student3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 20.0d + "'", double12 == 20.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 20.0d + "'", double13 == 20.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test04795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04795");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        java.lang.String str8 = student3.getPassword();
        student3.setVerified(false);
        student3.logout();
        student3.viewProfile();
        student3.logout();
        student3.logout();
        java.lang.String str15 = student3.getAccountType();
        java.lang.String str16 = student3.getEmail();
        java.lang.String str17 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "student" + "'", str15, "student");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "student" + "'", str17, "student");
    }

    @Test
    public void test04796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04796");
        model.Student student3 = new model.Student("", "student", "");
        student3.login("student", "");
        boolean boolean7 = student3.isVerified();
        java.lang.String str8 = student3.getEmail();
        student3.login("hi!", "");
        java.lang.String str12 = student3.getEmail();
        student3.viewProfile();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test04797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04797");
        model.Student student3 = new model.Student("", "student", "hi!");
        boolean boolean4 = student3.isVerified();
        student3.login("", "");
        student3.login("", "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test04798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04798");
        model.Student student3 = new model.Student("", "", "hi!");
        student3.logout();
        java.lang.String str5 = student3.getID();
        java.lang.String str6 = student3.getEmail();
        student3.viewProfile();
        student3.setVerified(false);
        java.lang.String str10 = student3.getID();
        java.lang.String str11 = student3.getAccountType();
        student3.setVerified(true);
        java.lang.String str14 = student3.getPassword();
        boolean boolean15 = student3.isVerified();
        java.lang.String str16 = student3.getEmail();
        student3.logout();
        student3.viewProfile();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "student" + "'", str11, "student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test04799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04799");
        model.Student student3 = new model.Student("hi!", "hi!", "");
        student3.setVerified(true);
        double double6 = student3.getHourlyRate();
        java.lang.String str7 = student3.getEmail();
        student3.viewProfile();
        student3.logout();
        java.lang.String str10 = student3.getAccountType();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "student" + "'", str10, "student");
    }

    @Test
    public void test04800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04800");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        double double6 = student3.getHourlyRate();
        java.lang.String str7 = student3.getPassword();
        java.lang.String str8 = student3.getPassword();
        java.lang.String str9 = student3.getAccountType();
        student3.viewProfile();
        java.lang.String str11 = student3.getEmail();
        java.lang.String str12 = student3.getID();
        double double13 = student3.getHourlyRate();
        boolean boolean14 = student3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "student" + "'", str9, "student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 20.0d + "'", double13 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test04801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04801");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        student3.setVerified(false);
        student3.viewProfile();
        java.lang.String str7 = student3.getEmail();
        java.lang.String str8 = student3.getAccountType();
        student3.logout();
        boolean boolean10 = student3.isVerified();
        student3.login("", "hi!");
        student3.setVerified(false);
        java.lang.String str16 = student3.getEmail();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test04802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04802");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.login("", "");
        student3.login("student", "student");
        java.lang.String str13 = student3.getPassword();
        student3.viewProfile();
        java.lang.String str15 = student3.getID();
        java.lang.String str16 = student3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test04803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04803");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        student3.setVerified(false);
        java.lang.String str10 = student3.getID();
        student3.viewProfile();
        student3.login("", "");
        student3.setVerified(true);
        java.lang.String str17 = student3.getPassword();
        student3.logout();
        student3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test04804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04804");
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
        double double17 = student3.getHourlyRate();
        boolean boolean18 = student3.isVerified();
        java.lang.String str19 = student3.getEmail();
        student3.setVerified(false);
        student3.viewProfile();
        student3.login("", "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 20.0d + "'", double16 == 20.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 20.0d + "'", double17 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test04805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04805");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        student3.setVerified(false);
        student3.viewProfile();
        java.lang.String str11 = student3.getEmail();
        java.lang.String str12 = student3.getPassword();
        java.lang.String str13 = student3.getPassword();
        java.lang.String str14 = student3.getID();
        student3.viewProfile();
        student3.login("hi!", "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test04806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04806");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getAccountType();
        student3.logout();
        boolean boolean8 = student3.isVerified();
        student3.setVerified(true);
        student3.setVerified(false);
        boolean boolean13 = student3.isVerified();
        student3.login("", "hi!");
        java.lang.String str17 = student3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test04807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04807");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        student3.setVerified(false);
        java.lang.String str9 = student3.getID();
        student3.setVerified(false);
        java.lang.String str12 = student3.getID();
        java.lang.String str13 = student3.getEmail();
        java.lang.String str14 = student3.getID();
        student3.viewProfile();
        student3.logout();
        java.lang.String str17 = student3.getAccountType();
        java.lang.String str18 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "student" + "'", str17, "student");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "student" + "'", str18, "student");
    }

    @Test
    public void test04808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04808");
        model.Student student3 = new model.Student("", "", "hi!");
        student3.login("", "");
        double double7 = student3.getHourlyRate();
        student3.login("student", "student");
        java.lang.String str11 = student3.getID();
        java.lang.String str12 = student3.getAccountType();
        java.lang.String str13 = student3.getAccountType();
        student3.login("student", "hi!");
        java.lang.String str17 = student3.getEmail();
        java.lang.Class<?> wildcardClass18 = student3.getClass();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "student" + "'", str12, "student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "student" + "'", str13, "student");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test04809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04809");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        java.lang.String str6 = student3.getPassword();
        java.lang.String str7 = student3.getPassword();
        student3.login("hi!", "hi!");
        boolean boolean11 = student3.isVerified();
        java.lang.String str12 = student3.getEmail();
        double double13 = student3.getHourlyRate();
        java.lang.Class<?> wildcardClass14 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 20.0d + "'", double13 == 20.0d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test04810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04810");
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
        student3.logout();
        student3.login("", "hi!");
        student3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "student" + "'", str12, "student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test04811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04811");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        java.lang.String str8 = student3.getPassword();
        student3.setVerified(false);
        student3.logout();
        java.lang.String str12 = student3.getID();
        student3.login("", "hi!");
        java.lang.String str16 = student3.getID();
        student3.viewProfile();
        student3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test04812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04812");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        student3.setVerified(false);
        java.lang.String str6 = student3.getEmail();
        java.lang.String str7 = student3.getAccountType();
        java.lang.String str8 = student3.getPassword();
        student3.viewProfile();
        student3.viewProfile();
        student3.login("hi!", "hi!");
        student3.setVerified(false);
        java.lang.String str16 = student3.getEmail();
        java.lang.String str17 = student3.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test04813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04813");
        model.Student student3 = new model.Student("", "", "hi!");
        student3.logout();
        java.lang.String str5 = student3.getID();
        java.lang.String str6 = student3.getEmail();
        java.lang.String str7 = student3.getPassword();
        java.lang.String str8 = student3.getID();
        student3.logout();
        student3.logout();
        student3.viewProfile();
        student3.login("", "student");
        student3.viewProfile();
        boolean boolean16 = student3.isVerified();
        boolean boolean17 = student3.isVerified();
        java.lang.String str18 = student3.getEmail();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test04814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04814");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        student3.setVerified(false);
        java.lang.String str10 = student3.getID();
        student3.viewProfile();
        double double12 = student3.getHourlyRate();
        java.lang.String str13 = student3.getID();
        double double14 = student3.getHourlyRate();
        student3.logout();
        student3.login("student", "hi!");
        java.lang.Class<?> wildcardClass19 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 20.0d + "'", double12 == 20.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 20.0d + "'", double14 == 20.0d);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test04815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04815");
        model.Student student3 = new model.Student("", "hi!", "hi!");
        student3.login("student", "student");
        student3.logout();
        student3.viewProfile();
        java.lang.String str9 = student3.getEmail();
        student3.logout();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test04816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04816");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        java.lang.String str6 = student3.getPassword();
        student3.setVerified(false);
        java.lang.String str9 = student3.getEmail();
        double double10 = student3.getHourlyRate();
        student3.setVerified(true);
        boolean boolean13 = student3.isVerified();
        double double14 = student3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 20.0d + "'", double14 == 20.0d);
    }

    @Test
    public void test04817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04817");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        java.lang.String str7 = student3.getID();
        double double8 = student3.getHourlyRate();
        double double9 = student3.getHourlyRate();
        student3.login("student", "hi!");
        java.lang.String str13 = student3.getEmail();
        boolean boolean14 = student3.isVerified();
        boolean boolean15 = student3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test04818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04818");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        student3.setVerified(false);
        java.lang.String str6 = student3.getEmail();
        student3.setVerified(false);
        student3.login("student", "hi!");
        student3.viewProfile();
        student3.login("", "student");
        boolean boolean16 = student3.isVerified();
        java.lang.Class<?> wildcardClass17 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test04819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04819");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        java.lang.String str4 = student3.getAccountType();
        java.lang.String str5 = student3.getID();
        student3.setVerified(true);
        student3.logout();
        java.lang.String str9 = student3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "student" + "'", str4, "student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test04820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04820");
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
        student3.viewProfile();
        java.lang.String str19 = student3.getEmail();
        student3.setVerified(false);
        student3.logout();
        boolean boolean23 = student3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "student" + "'", str13, "student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test04821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04821");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        double double6 = student3.getHourlyRate();
        student3.logout();
        student3.setVerified(true);
        java.lang.String str10 = student3.getEmail();
        java.lang.String str11 = student3.getID();
        java.lang.String str12 = student3.getAccountType();
        double double13 = student3.getHourlyRate();
        java.lang.String str14 = student3.getAccountType();
        java.lang.String str15 = student3.getID();
        student3.logout();
        java.lang.String str17 = student3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "student" + "'", str12, "student");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 20.0d + "'", double13 == 20.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "student" + "'", str14, "student");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test04822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04822");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getAccountType();
        student3.logout();
        java.lang.String str8 = student3.getEmail();
        student3.viewProfile();
        java.lang.String str10 = student3.getID();
        student3.login("", "student");
        student3.logout();
        java.lang.String str15 = student3.getID();
        student3.logout();
        student3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test04823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04823");
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
        student3.viewProfile();
        double double14 = student3.getHourlyRate();
        student3.viewProfile();
        double double16 = student3.getHourlyRate();
        java.lang.Class<?> wildcardClass17 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 20.0d + "'", double14 == 20.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 20.0d + "'", double16 == 20.0d);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test04824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04824");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        java.lang.String str7 = student3.getID();
        java.lang.String str8 = student3.getID();
        java.lang.String str9 = student3.getAccountType();
        java.lang.String str10 = student3.getEmail();
        java.lang.Class<?> wildcardClass11 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "student" + "'", str9, "student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test04825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04825");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getAccountType();
        java.lang.String str7 = student3.getAccountType();
        java.lang.String str8 = student3.getEmail();
        student3.setVerified(true);
        double double11 = student3.getHourlyRate();
        student3.login("hi!", "hi!");
        double double15 = student3.getHourlyRate();
        java.lang.String str16 = student3.getEmail();
        student3.logout();
        student3.login("", "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 20.0d + "'", double15 == 20.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test04826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04826");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        double double6 = student3.getHourlyRate();
        java.lang.String str7 = student3.getPassword();
        java.lang.String str8 = student3.getPassword();
        student3.viewProfile();
        boolean boolean10 = student3.isVerified();
        java.lang.String str11 = student3.getPassword();
        student3.viewProfile();
        student3.login("", "");
        student3.viewProfile();
        java.lang.Class<?> wildcardClass17 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test04827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04827");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        java.lang.String str6 = student3.getPassword();
        student3.setVerified(false);
        student3.setVerified(false);
        java.lang.String str11 = student3.getPassword();
        student3.viewProfile();
        boolean boolean13 = student3.isVerified();
        student3.login("hi!", "hi!");
        student3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test04828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04828");
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
        student3.logout();
        java.lang.String str18 = student3.getID();
        java.lang.String str19 = student3.getEmail();
        java.lang.String str20 = student3.getEmail();
        java.lang.String str21 = student3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "student" + "'", str11, "student");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test04829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04829");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        student3.setVerified(false);
        java.lang.String str10 = student3.getID();
        java.lang.String str11 = student3.getAccountType();
        double double12 = student3.getHourlyRate();
        boolean boolean13 = student3.isVerified();
        student3.setVerified(true);
        student3.setVerified(false);
        java.lang.String str18 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "student" + "'", str11, "student");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 20.0d + "'", double12 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "student" + "'", str18, "student");
    }

    @Test
    public void test04830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04830");
        model.Student student3 = new model.Student("", "", "hi!");
        student3.logout();
        java.lang.String str5 = student3.getID();
        java.lang.String str6 = student3.getPassword();
        java.lang.String str7 = student3.getAccountType();
        student3.setVerified(false);
        student3.login("hi!", "hi!");
        java.lang.String str13 = student3.getPassword();
        student3.viewProfile();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test04831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04831");
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
        student3.viewProfile();
        java.lang.Class<?> wildcardClass15 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 20.0d + "'", double12 == 20.0d);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test04832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04832");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        java.lang.String str8 = student3.getPassword();
        boolean boolean9 = student3.isVerified();
        student3.viewProfile();
        student3.viewProfile();
        student3.viewProfile();
        student3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test04833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04833");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        student3.logout();
        student3.login("hi!", "hi!");
        double double8 = student3.getHourlyRate();
        java.lang.String str9 = student3.getID();
        java.lang.String str10 = student3.getAccountType();
        student3.setVerified(true);
        student3.logout();
        java.lang.String str14 = student3.getID();
        student3.logout();
        java.lang.Class<?> wildcardClass16 = student3.getClass();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "student" + "'", str10, "student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test04834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04834");
        model.Student student3 = new model.Student("", "student", "student");
        double double4 = student3.getHourlyRate();
        java.lang.String str5 = student3.getAccountType();
        double double6 = student3.getHourlyRate();
        java.lang.String str7 = student3.getPassword();
        double double8 = student3.getHourlyRate();
        boolean boolean9 = student3.isVerified();
        java.lang.String str10 = student3.getPassword();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "student" + "'", str10, "student");
    }

    @Test
    public void test04835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04835");
        model.Student student3 = new model.Student("", "", "hi!");
        student3.login("", "");
        student3.viewProfile();
        student3.viewProfile();
        student3.login("", "");
        student3.viewProfile();
        java.lang.String str13 = student3.getAccountType();
        student3.logout();
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "student" + "'", str13, "student");
    }

    @Test
    public void test04836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04836");
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
        java.lang.String str20 = student3.getPassword();
        java.lang.String str21 = student3.getID();
        boolean boolean22 = student3.isVerified();
        double double23 = student3.getHourlyRate();
        java.lang.Class<?> wildcardClass24 = student3.getClass();
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
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 20.0d + "'", double23 == 20.0d);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test04837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04837");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        java.lang.String str8 = student3.getPassword();
        student3.logout();
        java.lang.String str10 = student3.getID();
        student3.login("student", "");
        student3.setVerified(false);
        java.lang.String str16 = student3.getID();
        java.lang.String str17 = student3.getAccountType();
        java.lang.Class<?> wildcardClass18 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "student" + "'", str17, "student");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test04838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04838");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getID();
        java.lang.String str6 = student3.getID();
        student3.login("", "");
        java.lang.String str10 = student3.getID();
        java.lang.String str11 = student3.getEmail();
        java.lang.String str12 = student3.getPassword();
        student3.viewProfile();
        boolean boolean14 = student3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test04839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04839");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.viewProfile();
        java.lang.String str8 = student3.getAccountType();
        student3.logout();
        student3.logout();
        java.lang.String str11 = student3.getAccountType();
        java.lang.String str12 = student3.getAccountType();
        student3.viewProfile();
        java.lang.String str14 = student3.getEmail();
        student3.login("", "hi!");
        student3.logout();
        java.lang.String str19 = student3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "student" + "'", str11, "student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "student" + "'", str12, "student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test04840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04840");
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
        student3.login("hi!", "");
        student3.login("student", "");
        double double20 = student3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "student" + "'", str11, "student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 20.0d + "'", double20 == 20.0d);
    }

    @Test
    public void test04841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04841");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        student3.setVerified(false);
        student3.viewProfile();
        java.lang.String str7 = student3.getEmail();
        java.lang.String str8 = student3.getID();
        student3.viewProfile();
        java.lang.String str10 = student3.getEmail();
        java.lang.String str11 = student3.getPassword();
        java.lang.String str12 = student3.getID();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test04842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04842");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getAccountType();
        student3.logout();
        double double8 = student3.getHourlyRate();
        java.lang.String str9 = student3.getEmail();
        java.lang.String str10 = student3.getPassword();
        java.lang.String str11 = student3.getAccountType();
        student3.viewProfile();
        double double13 = student3.getHourlyRate();
        java.lang.String str14 = student3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "student" + "'", str11, "student");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 20.0d + "'", double13 == 20.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test04843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04843");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        java.lang.String str8 = student3.getPassword();
        student3.setVerified(false);
        student3.logout();
        student3.viewProfile();
        student3.viewProfile();
        java.lang.Class<?> wildcardClass14 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test04844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04844");
        model.Student student3 = new model.Student("", "student", "student");
        student3.setVerified(true);
        student3.login("", "student");
        java.lang.String str9 = student3.getEmail();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test04845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04845");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.viewProfile();
        student3.login("student", "");
        student3.login("", "");
        java.lang.String str14 = student3.getAccountType();
        student3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "student" + "'", str14, "student");
    }

    @Test
    public void test04846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04846");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        java.lang.String str6 = student3.getPassword();
        student3.setVerified(false);
        java.lang.String str9 = student3.getAccountType();
        java.lang.String str10 = student3.getEmail();
        double double11 = student3.getHourlyRate();
        student3.login("hi!", "student");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "student" + "'", str9, "student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
    }

    @Test
    public void test04847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04847");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getAccountType();
        java.lang.String str7 = student3.getAccountType();
        java.lang.String str8 = student3.getEmail();
        student3.viewProfile();
        student3.logout();
        java.lang.Class<?> wildcardClass11 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test04848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04848");
        model.Student student3 = new model.Student("hi!", "hi!", "");
        java.lang.String str4 = student3.getAccountType();
        student3.login("", "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "student" + "'", str4, "student");
    }

    @Test
    public void test04849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04849");
        model.Student student3 = new model.Student("", "hi!", "student");
        java.lang.String str4 = student3.getAccountType();
        student3.setVerified(true);
        java.lang.String str7 = student3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "student" + "'", str4, "student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
    }

    @Test
    public void test04850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04850");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        java.lang.String str8 = student3.getAccountType();
        student3.setVerified(false);
        double double11 = student3.getHourlyRate();
        double double12 = student3.getHourlyRate();
        double double13 = student3.getHourlyRate();
        java.lang.String str14 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 20.0d + "'", double12 == 20.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 20.0d + "'", double13 == 20.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "student" + "'", str14, "student");
    }

    @Test
    public void test04851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04851");
        model.Student student3 = new model.Student("hi!", "hi!", "");
        java.lang.String str4 = student3.getEmail();
        java.lang.String str5 = student3.getAccountType();
        student3.logout();
        java.lang.String str7 = student3.getPassword();
        student3.logout();
        student3.viewProfile();
        java.lang.String str10 = student3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test04852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04852");
        model.Student student3 = new model.Student("hi!", "hi!", "");
        student3.logout();
        java.lang.String str5 = student3.getEmail();
        boolean boolean6 = student3.isVerified();
        java.lang.String str7 = student3.getEmail();
        student3.login("", "student");
        student3.login("hi!", "hi!");
        java.lang.Class<?> wildcardClass14 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test04853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04853");
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
        java.lang.String str17 = student3.getAccountType();
        double double18 = student3.getHourlyRate();
        java.lang.String str19 = student3.getEmail();
        student3.setVerified(true);
        java.lang.String str22 = student3.getAccountType();
        student3.login("", "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "student" + "'", str17, "student");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 20.0d + "'", double18 == 20.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "student" + "'", str22, "student");
    }

    @Test
    public void test04854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04854");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        java.lang.String str6 = student3.getPassword();
        student3.setVerified(false);
        student3.setVerified(true);
        double double11 = student3.getHourlyRate();
        boolean boolean12 = student3.isVerified();
        student3.logout();
        boolean boolean14 = student3.isVerified();
        boolean boolean15 = student3.isVerified();
        java.lang.String str16 = student3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test04855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04855");
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
        double double15 = student3.getHourlyRate();
        java.lang.String str16 = student3.getAccountType();
        student3.login("", "");
        student3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "student" + "'", str14, "student");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 20.0d + "'", double15 == 20.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "student" + "'", str16, "student");
    }

    @Test
    public void test04856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04856");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        student3.logout();
        student3.login("hi!", "hi!");
        double double8 = student3.getHourlyRate();
        boolean boolean9 = student3.isVerified();
        java.lang.String str10 = student3.getAccountType();
        java.lang.String str11 = student3.getAccountType();
        double double12 = student3.getHourlyRate();
        double double13 = student3.getHourlyRate();
        student3.login("", "student");
        boolean boolean17 = student3.isVerified();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "student" + "'", str10, "student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "student" + "'", str11, "student");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 20.0d + "'", double12 == 20.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 20.0d + "'", double13 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test04857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04857");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        java.lang.String str6 = student3.getPassword();
        java.lang.String str7 = student3.getPassword();
        java.lang.String str8 = student3.getID();
        double double9 = student3.getHourlyRate();
        java.lang.String str10 = student3.getPassword();
        student3.logout();
        java.lang.String str12 = student3.getID();
        java.lang.Class<?> wildcardClass13 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test04858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04858");
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
        student3.viewProfile();
        student3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 20.0d + "'", double17 == 20.0d);
    }

    @Test
    public void test04859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04859");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.viewProfile();
        double double8 = student3.getHourlyRate();
        student3.login("student", "student");
        student3.logout();
        java.lang.String str13 = student3.getAccountType();
        student3.viewProfile();
        java.lang.String str15 = student3.getID();
        student3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "student" + "'", str13, "student");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test04860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04860");
        model.Student student3 = new model.Student("hi!", "student", "");
        java.lang.String str4 = student3.getEmail();
        student3.viewProfile();
        student3.logout();
        student3.viewProfile();
        student3.viewProfile();
        java.lang.String str9 = student3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test04861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04861");
        model.Student student3 = new model.Student("", "hi!", "hi!");
        student3.login("student", "student");
        java.lang.String str7 = student3.getID();
        student3.viewProfile();
        double double9 = student3.getHourlyRate();
        student3.viewProfile();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
    }

    @Test
    public void test04862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04862");
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
        java.lang.Class<?> wildcardClass26 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "student" + "'", str10, "student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "student" + "'", str23, "student");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test04863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04863");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        java.lang.String str4 = student3.getAccountType();
        java.lang.String str5 = student3.getID();
        student3.setVerified(true);
        student3.login("student", "student");
        java.lang.String str11 = student3.getPassword();
        student3.logout();
        student3.login("student", "");
        student3.login("hi!", "hi!");
        student3.setVerified(true);
        double double21 = student3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "student" + "'", str4, "student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 20.0d + "'", double21 == 20.0d);
    }

    @Test
    public void test04864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04864");
        model.Student student3 = new model.Student("", "", "hi!");
        student3.logout();
        java.lang.String str5 = student3.getID();
        java.lang.String str6 = student3.getEmail();
        double double7 = student3.getHourlyRate();
        java.lang.String str8 = student3.getPassword();
        student3.login("hi!", "hi!");
        student3.logout();
        student3.login("student", "hi!");
        student3.logout();
        boolean boolean17 = student3.isVerified();
        boolean boolean18 = student3.isVerified();
        student3.viewProfile();
        student3.login("", "student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test04865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04865");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        student3.logout();
        student3.login("hi!", "hi!");
        student3.viewProfile();
        student3.login("", "student");
        student3.login("", "student");
        java.lang.String str15 = student3.getEmail();
        double double16 = student3.getHourlyRate();
        java.lang.String str17 = student3.getPassword();
        student3.logout();
        student3.login("hi!", "");
        double double22 = student3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 20.0d + "'", double16 == 20.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 20.0d + "'", double22 == 20.0d);
    }

    @Test
    public void test04866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04866");
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
        java.lang.String str17 = student3.getID();
        java.lang.String str18 = student3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test04867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04867");
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
        java.lang.String str18 = student3.getEmail();
        java.lang.String str19 = student3.getPassword();
        java.lang.Class<?> wildcardClass20 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "student" + "'", str10, "student");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "student" + "'", str16, "student");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test04868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04868");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getAccountType();
        java.lang.String str7 = student3.getAccountType();
        java.lang.String str8 = student3.getEmail();
        student3.logout();
        student3.login("student", "hi!");
        student3.setVerified(false);
        student3.viewProfile();
        java.lang.Class<?> wildcardClass16 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test04869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04869");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        student3.setVerified(false);
        java.lang.String str10 = student3.getEmail();
        student3.logout();
        boolean boolean12 = student3.isVerified();
        java.lang.String str13 = student3.getAccountType();
        java.lang.String str14 = student3.getAccountType();
        java.lang.String str15 = student3.getAccountType();
        java.lang.String str16 = student3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "student" + "'", str13, "student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "student" + "'", str14, "student");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "student" + "'", str15, "student");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test04870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04870");
        model.Student student3 = new model.Student("", "", "hi!");
        student3.logout();
        student3.viewProfile();
        student3.viewProfile();
        student3.logout();
        java.lang.String str8 = student3.getPassword();
        student3.setVerified(false);
        java.lang.String str11 = student3.getPassword();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test04871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04871");
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
        student3.setVerified(false);
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
    }

    @Test
    public void test04872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04872");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        java.lang.String str6 = student3.getPassword();
        java.lang.String str7 = student3.getPassword();
        java.lang.String str8 = student3.getID();
        double double9 = student3.getHourlyRate();
        java.lang.String str10 = student3.getPassword();
        student3.logout();
        java.lang.String str12 = student3.getID();
        student3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test04873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04873");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        java.lang.String str8 = student3.getPassword();
        student3.setVerified(false);
        student3.logout();
        java.lang.String str12 = student3.getID();
        student3.login("", "hi!");
        java.lang.String str16 = student3.getID();
        student3.viewProfile();
        java.lang.Class<?> wildcardClass18 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test04874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04874");
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
        student3.setVerified(false);
        boolean boolean17 = student3.isVerified();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 20.0d + "'", double13 == 20.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test04875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04875");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getAccountType();
        java.lang.String str7 = student3.getAccountType();
        java.lang.String str8 = student3.getEmail();
        student3.logout();
        student3.login("student", "hi!");
        java.lang.String str13 = student3.getID();
        student3.logout();
        java.lang.Class<?> wildcardClass15 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test04876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04876");
        model.Student student3 = new model.Student("", "", "hi!");
        student3.logout();
        java.lang.String str5 = student3.getID();
        java.lang.String str6 = student3.getEmail();
        java.lang.String str7 = student3.getEmail();
        java.lang.String str8 = student3.getEmail();
        java.lang.String str9 = student3.getID();
        java.lang.String str10 = student3.getPassword();
        student3.setVerified(false);
        double double13 = student3.getHourlyRate();
        student3.viewProfile();
        boolean boolean15 = student3.isVerified();
        student3.logout();
        java.lang.String str17 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 20.0d + "'", double13 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "student" + "'", str17, "student");
    }

    @Test
    public void test04877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04877");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        java.lang.String str4 = student3.getAccountType();
        java.lang.String str5 = student3.getID();
        java.lang.String str6 = student3.getAccountType();
        student3.logout();
        java.lang.String str8 = student3.getID();
        student3.setVerified(true);
        java.lang.String str11 = student3.getEmail();
        student3.logout();
        java.lang.String str13 = student3.getEmail();
        java.lang.Class<?> wildcardClass14 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "student" + "'", str4, "student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test04878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04878");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        double double6 = student3.getHourlyRate();
        java.lang.String str7 = student3.getPassword();
        java.lang.String str8 = student3.getPassword();
        student3.login("student", "hi!");
        student3.login("", "hi!");
        student3.login("student", "student");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test04879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04879");
        model.Student student3 = new model.Student("", "", "hi!");
        student3.logout();
        java.lang.String str5 = student3.getID();
        java.lang.String str6 = student3.getEmail();
        java.lang.String str7 = student3.getPassword();
        java.lang.String str8 = student3.getID();
        student3.logout();
        student3.logout();
        student3.logout();
        student3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test04880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04880");
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
        double double13 = student3.getHourlyRate();
        student3.logout();
        boolean boolean15 = student3.isVerified();
        student3.login("hi!", "student");
        java.lang.String str19 = student3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "student" + "'", str12, "student");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 20.0d + "'", double13 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test04881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04881");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.viewProfile();
        boolean boolean8 = student3.isVerified();
        student3.login("hi!", "student");
        student3.logout();
        java.lang.String str13 = student3.getID();
        student3.viewProfile();
        java.lang.String str15 = student3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test04882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04882");
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
        student3.login("student", "");
        java.lang.String str18 = student3.getEmail();
        java.lang.String str19 = student3.getAccountType();
        boolean boolean20 = student3.isVerified();
        student3.logout();
        java.lang.Class<?> wildcardClass22 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 20.0d + "'", double13 == 20.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "student" + "'", str19, "student");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test04883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04883");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        double double6 = student3.getHourlyRate();
        java.lang.String str7 = student3.getID();
        boolean boolean8 = student3.isVerified();
        student3.logout();
        student3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test04884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04884");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        java.lang.String str8 = student3.getPassword();
        java.lang.String str9 = student3.getID();
        double double10 = student3.getHourlyRate();
        java.lang.String str11 = student3.getID();
        java.lang.String str12 = student3.getPassword();
        java.lang.String str13 = student3.getEmail();
        student3.viewProfile();
        double double15 = student3.getHourlyRate();
        java.lang.String str16 = student3.getPassword();
        student3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 20.0d + "'", double15 == 20.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test04885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04885");
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
        double double16 = student3.getHourlyRate();
        student3.setVerified(true);
        java.lang.String str19 = student3.getID();
        java.lang.String str20 = student3.getEmail();
        boolean boolean21 = student3.isVerified();
        student3.logout();
        double double23 = student3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 20.0d + "'", double16 == 20.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 20.0d + "'", double23 == 20.0d);
    }

    @Test
    public void test04886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04886");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        double double6 = student3.getHourlyRate();
        java.lang.String str7 = student3.getPassword();
        java.lang.String str8 = student3.getPassword();
        java.lang.String str9 = student3.getAccountType();
        student3.viewProfile();
        java.lang.String str11 = student3.getID();
        student3.logout();
        double double13 = student3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "student" + "'", str9, "student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 20.0d + "'", double13 == 20.0d);
    }

    @Test
    public void test04887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04887");
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
        boolean boolean15 = student3.isVerified();
        java.lang.String str16 = student3.getEmail();
        double double17 = student3.getHourlyRate();
        java.lang.String str18 = student3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "student" + "'", str12, "student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 20.0d + "'", double17 == 20.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test04888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04888");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        student3.setVerified(false);
        student3.viewProfile();
        java.lang.String str7 = student3.getEmail();
        java.lang.String str8 = student3.getAccountType();
        java.lang.String str9 = student3.getID();
        student3.setVerified(false);
        double double12 = student3.getHourlyRate();
        java.lang.String str13 = student3.getAccountType();
        student3.login("", "");
        boolean boolean17 = student3.isVerified();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 20.0d + "'", double12 == 20.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "student" + "'", str13, "student");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test04889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04889");
        model.Student student3 = new model.Student("", "student", "");
        student3.login("student", "");
        boolean boolean7 = student3.isVerified();
        java.lang.String str8 = student3.getAccountType();
        java.lang.String str9 = student3.getAccountType();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "student" + "'", str9, "student");
    }

    @Test
    public void test04890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04890");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        student3.setVerified(false);
        java.lang.String str6 = student3.getPassword();
        java.lang.String str7 = student3.getAccountType();
        java.lang.String str8 = student3.getEmail();
        student3.setVerified(true);
        java.lang.String str11 = student3.getAccountType();
        student3.login("student", "");
        double double15 = student3.getHourlyRate();
        double double16 = student3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "student" + "'", str11, "student");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 20.0d + "'", double15 == 20.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 20.0d + "'", double16 == 20.0d);
    }

    @Test
    public void test04891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04891");
        model.Student student3 = new model.Student("hi!", "hi!", "");
        student3.logout();
        java.lang.String str5 = student3.getEmail();
        student3.logout();
        boolean boolean7 = student3.isVerified();
        student3.logout();
        student3.setVerified(true);
        student3.login("", "hi!");
        java.lang.String str14 = student3.getID();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test04892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04892");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        double double6 = student3.getHourlyRate();
        java.lang.String str7 = student3.getPassword();
        student3.login("", "student");
        boolean boolean11 = student3.isVerified();
        double double12 = student3.getHourlyRate();
        double double13 = student3.getHourlyRate();
        student3.viewProfile();
        student3.login("", "hi!");
        java.lang.Class<?> wildcardClass18 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 20.0d + "'", double12 == 20.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 20.0d + "'", double13 == 20.0d);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test04893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04893");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        java.lang.String str7 = student3.getID();
        java.lang.String str8 = student3.getEmail();
        student3.login("", "");
        boolean boolean12 = student3.isVerified();
        boolean boolean13 = student3.isVerified();
        java.lang.String str14 = student3.getPassword();
        java.lang.String str15 = student3.getAccountType();
        student3.viewProfile();
        student3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "student" + "'", str15, "student");
    }

    @Test
    public void test04894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04894");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        double double6 = student3.getHourlyRate();
        student3.logout();
        student3.viewProfile();
        java.lang.String str9 = student3.getEmail();
        java.lang.String str10 = student3.getEmail();
        java.lang.String str11 = student3.getAccountType();
        student3.logout();
        student3.logout();
        java.lang.String str14 = student3.getID();
        student3.viewProfile();
        student3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "student" + "'", str11, "student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test04895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04895");
        model.Student student3 = new model.Student("hi!", "hi!", "student");
        student3.login("hi!", "student");
        java.lang.String str7 = student3.getEmail();
        student3.login("student", "student");
        student3.viewProfile();
        java.lang.String str12 = student3.getID();
        java.lang.String str13 = student3.getID();
        java.lang.Class<?> wildcardClass14 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "student" + "'", str12, "student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "student" + "'", str13, "student");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test04896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04896");
        model.Student student3 = new model.Student("", "", "hi!");
        student3.logout();
        java.lang.String str5 = student3.getID();
        java.lang.String str6 = student3.getEmail();
        double double7 = student3.getHourlyRate();
        boolean boolean8 = student3.isVerified();
        java.lang.String str9 = student3.getPassword();
        java.lang.String str10 = student3.getEmail();
        java.lang.String str11 = student3.getAccountType();
        student3.logout();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "student" + "'", str11, "student");
    }

    @Test
    public void test04897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04897");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.viewProfile();
        student3.viewProfile();
        student3.logout();
        student3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test04898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04898");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.viewProfile();
        student3.viewProfile();
        student3.logout();
        java.lang.String str10 = student3.getID();
        student3.login("student", "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test04899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04899");
        model.Student student3 = new model.Student("hi!", "hi!", "");
        student3.viewProfile();
        java.lang.String str5 = student3.getAccountType();
        java.lang.String str6 = student3.getEmail();
        student3.login("", "hi!");
        student3.logout();
        java.lang.String str11 = student3.getEmail();
        java.lang.Class<?> wildcardClass12 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test04900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04900");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        student3.setVerified(false);
        boolean boolean7 = student3.isVerified();
        java.lang.String str8 = student3.getID();
        student3.login("hi!", "");
        java.lang.Class<?> wildcardClass12 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test04901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04901");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        java.lang.String str7 = student3.getID();
        double double8 = student3.getHourlyRate();
        java.lang.String str9 = student3.getID();
        java.lang.String str10 = student3.getAccountType();
        student3.setVerified(true);
        boolean boolean13 = student3.isVerified();
        double double14 = student3.getHourlyRate();
        boolean boolean15 = student3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "student" + "'", str10, "student");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 20.0d + "'", double14 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test04902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04902");
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
        student3.logout();
        student3.setVerified(true);
        boolean boolean22 = student3.isVerified();
        java.lang.String str23 = student3.getEmail();
        java.lang.Class<?> wildcardClass24 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test04903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04903");
        model.Student student3 = new model.Student("hi!", "hi!", "hi!");
        student3.login("hi!", "student");
        student3.logout();
        java.lang.String str8 = student3.getPassword();
        student3.viewProfile();
        student3.setVerified(false);
        student3.setVerified(true);
        java.lang.String str14 = student3.getID();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test04904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04904");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        student3.setVerified(false);
        java.lang.String str6 = student3.getEmail();
        student3.setVerified(false);
        student3.login("student", "hi!");
        java.lang.String str12 = student3.getAccountType();
        student3.login("student", "student");
        double double16 = student3.getHourlyRate();
        java.lang.String str17 = student3.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "student" + "'", str12, "student");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 20.0d + "'", double16 == 20.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test04905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04905");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        student3.setVerified(false);
        java.lang.String str10 = student3.getAccountType();
        java.lang.String str11 = student3.getEmail();
        student3.logout();
        student3.viewProfile();
        student3.login("", "student");
        student3.viewProfile();
        student3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "student" + "'", str10, "student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test04906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04906");
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
        double double18 = student3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "student" + "'", str11, "student");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 20.0d + "'", double18 == 20.0d);
    }

    @Test
    public void test04907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04907");
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
        java.lang.String str19 = student3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test04908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04908");
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
        double double13 = student3.getHourlyRate();
        java.lang.String str14 = student3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 20.0d + "'", double13 == 20.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test04909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04909");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        java.lang.String str4 = student3.getAccountType();
        java.lang.String str5 = student3.getEmail();
        student3.viewProfile();
        student3.setVerified(true);
        java.lang.String str9 = student3.getPassword();
        student3.setVerified(false);
        student3.logout();
        student3.login("", "student");
        student3.logout();
        java.lang.Class<?> wildcardClass17 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "student" + "'", str4, "student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test04910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04910");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        java.lang.String str4 = student3.getAccountType();
        java.lang.String str5 = student3.getID();
        student3.setVerified(true);
        student3.login("student", "student");
        double double11 = student3.getHourlyRate();
        student3.logout();
        student3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "student" + "'", str4, "student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
    }

    @Test
    public void test04911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04911");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.viewProfile();
        boolean boolean8 = student3.isVerified();
        student3.login("hi!", "student");
        student3.viewProfile();
        student3.logout();
        java.lang.String str14 = student3.getPassword();
        java.lang.String str15 = student3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test04912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04912");
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
        boolean boolean13 = student3.isVerified();
        java.lang.String str14 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "student" + "'", str14, "student");
    }

    @Test
    public void test04913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04913");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        double double6 = student3.getHourlyRate();
        student3.logout();
        student3.viewProfile();
        java.lang.String str9 = student3.getEmail();
        java.lang.String str10 = student3.getEmail();
        java.lang.String str11 = student3.getAccountType();
        student3.logout();
        boolean boolean13 = student3.isVerified();
        double double14 = student3.getHourlyRate();
        java.lang.String str15 = student3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "student" + "'", str11, "student");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 20.0d + "'", double14 == 20.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test04914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04914");
        model.Student student3 = new model.Student("hi!", "student", "");
        java.lang.String str4 = student3.getEmail();
        student3.viewProfile();
        student3.setVerified(true);
        java.lang.String str8 = student3.getID();
        student3.viewProfile();
        java.lang.String str10 = student3.getEmail();
        student3.setVerified(false);
        java.lang.String str13 = student3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test04915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04915");
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
        java.lang.String str22 = student3.getPassword();
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
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test04916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04916");
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
        student3.logout();
        boolean boolean17 = student3.isVerified();
        student3.login("", "");
        boolean boolean21 = student3.isVerified();
        double double22 = student3.getHourlyRate();
        java.lang.String str23 = student3.getID();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 20.0d + "'", double22 == 20.0d);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
    }

    @Test
    public void test04917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04917");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        student3.viewProfile();
        boolean boolean9 = student3.isVerified();
        student3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test04918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04918");
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
        student3.logout();
        java.lang.String str24 = student3.getEmail();
        student3.setVerified(true);
        boolean boolean27 = student3.isVerified();
        student3.logout();
        student3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test04919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04919");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.login("", "");
        java.lang.String str10 = student3.getID();
        java.lang.String str11 = student3.getPassword();
        student3.setVerified(true);
        double double14 = student3.getHourlyRate();
        student3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 20.0d + "'", double14 == 20.0d);
    }

    @Test
    public void test04920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04920");
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
        boolean boolean14 = student3.isVerified();
        java.lang.String str15 = student3.getEmail();
        java.lang.String str16 = student3.getPassword();
        java.lang.String str17 = student3.getID();
        java.lang.String str18 = student3.getAccountType();
        student3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "student" + "'", str11, "student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 20.0d + "'", double13 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "student" + "'", str18, "student");
    }

    @Test
    public void test04921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04921");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        java.lang.String str6 = student3.getPassword();
        java.lang.String str7 = student3.getPassword();
        java.lang.String str8 = student3.getID();
        java.lang.String str9 = student3.getID();
        double double10 = student3.getHourlyRate();
        java.lang.String str11 = student3.getPassword();
        student3.setVerified(false);
        java.lang.String str14 = student3.getPassword();
        java.lang.String str15 = student3.getAccountType();
        student3.logout();
        student3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "student" + "'", str15, "student");
    }

    @Test
    public void test04922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04922");
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
        java.lang.String str16 = student3.getEmail();
        java.lang.String str17 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "student" + "'", str17, "student");
    }

    @Test
    public void test04923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04923");
        model.Student student3 = new model.Student("", "", "hi!");
        student3.logout();
        java.lang.String str5 = student3.getID();
        java.lang.String str6 = student3.getEmail();
        double double7 = student3.getHourlyRate();
        java.lang.String str8 = student3.getPassword();
        double double9 = student3.getHourlyRate();
        student3.viewProfile();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
    }

    @Test
    public void test04924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04924");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        java.lang.String str7 = student3.getID();
        student3.setVerified(true);
        java.lang.String str10 = student3.getEmail();
        student3.setVerified(true);
        java.lang.String str13 = student3.getID();
        boolean boolean14 = student3.isVerified();
        boolean boolean15 = student3.isVerified();
        student3.viewProfile();
        student3.setVerified(false);
        student3.login("", "student");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test04925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04925");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        student3.setVerified(false);
        boolean boolean7 = student3.isVerified();
        student3.logout();
        java.lang.String str9 = student3.getPassword();
        student3.login("", "");
        java.lang.String str13 = student3.getEmail();
        java.lang.String str14 = student3.getAccountType();
        java.lang.String str15 = student3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "student" + "'", str14, "student");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test04926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04926");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        student3.setVerified(false);
        java.lang.String str9 = student3.getID();
        student3.setVerified(false);
        java.lang.String str12 = student3.getID();
        java.lang.String str13 = student3.getID();
        java.lang.String str14 = student3.getID();
        student3.logout();
        student3.viewProfile();
        student3.setVerified(true);
        double double19 = student3.getHourlyRate();
        student3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 20.0d + "'", double19 == 20.0d);
    }

    @Test
    public void test04927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04927");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        java.lang.String str7 = student3.getID();
        double double8 = student3.getHourlyRate();
        student3.logout();
        student3.logout();
        student3.setVerified(true);
        java.lang.String str13 = student3.getAccountType();
        student3.login("student", "");
        student3.login("student", "");
        boolean boolean20 = student3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "student" + "'", str13, "student");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test04928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04928");
        model.Student student3 = new model.Student("hi!", "student", "");
        java.lang.String str4 = student3.getPassword();
        student3.logout();
        double double6 = student3.getHourlyRate();
        student3.setVerified(false);
        java.lang.Class<?> wildcardClass9 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "student" + "'", str4, "student");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test04929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04929");
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
        boolean boolean13 = student3.isVerified();
        student3.login("", "hi!");
        java.lang.Class<?> wildcardClass17 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "student" + "'", str11, "student");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test04930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04930");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        student3.setVerified(false);
        student3.viewProfile();
        java.lang.String str7 = student3.getEmail();
        java.lang.String str8 = student3.getAccountType();
        java.lang.String str9 = student3.getID();
        java.lang.String str10 = student3.getAccountType();
        student3.logout();
        java.lang.String str12 = student3.getID();
        java.lang.String str13 = student3.getAccountType();
        student3.viewProfile();
        student3.logout();
        double double16 = student3.getHourlyRate();
        java.lang.String str17 = student3.getID();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "student" + "'", str10, "student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "student" + "'", str13, "student");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 20.0d + "'", double16 == 20.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test04931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04931");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        student3.setVerified(false);
        java.lang.String str6 = student3.getEmail();
        java.lang.String str7 = student3.getAccountType();
        java.lang.String str8 = student3.getID();
        student3.logout();
        boolean boolean10 = student3.isVerified();
        double double11 = student3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
    }

    @Test
    public void test04932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04932");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        java.lang.String str7 = student3.getID();
        student3.setVerified(true);
        java.lang.String str10 = student3.getAccountType();
        java.lang.String str11 = student3.getPassword();
        student3.viewProfile();
        boolean boolean13 = student3.isVerified();
        boolean boolean14 = student3.isVerified();
        java.lang.String str15 = student3.getAccountType();
        student3.login("hi!", "hi!");
        student3.logout();
        student3.login("student", "");
        student3.setVerified(true);
        student3.login("hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "student" + "'", str10, "student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "student" + "'", str15, "student");
    }

    @Test
    public void test04933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04933");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        java.lang.String str4 = student3.getAccountType();
        java.lang.String str5 = student3.getID();
        student3.setVerified(true);
        boolean boolean8 = student3.isVerified();
        student3.logout();
        student3.viewProfile();
        java.lang.String str11 = student3.getEmail();
        boolean boolean12 = student3.isVerified();
        boolean boolean13 = student3.isVerified();
        student3.login("", "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "student" + "'", str4, "student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test04934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04934");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        student3.setVerified(false);
        student3.viewProfile();
        java.lang.String str7 = student3.getEmail();
        student3.login("hi!", "hi!");
        java.lang.String str11 = student3.getEmail();
        student3.login("student", "hi!");
        java.lang.String str15 = student3.getPassword();
        student3.viewProfile();
        student3.login("hi!", "student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test04935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04935");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getAccountType();
        student3.logout();
        java.lang.String str8 = student3.getEmail();
        student3.viewProfile();
        java.lang.String str10 = student3.getID();
        student3.login("", "student");
        student3.logout();
        student3.setVerified(false);
        java.lang.String str17 = student3.getEmail();
        student3.login("", "hi!");
        boolean boolean21 = student3.isVerified();
        student3.viewProfile();
        student3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test04936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04936");
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
        student3.setVerified(true);
        java.lang.String str16 = student3.getID();
        student3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test04937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04937");
        model.Student student3 = new model.Student("", "", "hi!");
        student3.login("", "");
        student3.viewProfile();
        double double8 = student3.getHourlyRate();
        student3.setVerified(false);
        student3.login("", "student");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
    }

    @Test
    public void test04938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04938");
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
        student3.login("hi!", "");
        student3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "student" + "'", str13, "student");
    }

    @Test
    public void test04939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04939");
        model.Student student3 = new model.Student("", "", "hi!");
        student3.logout();
        java.lang.String str5 = student3.getID();
        java.lang.String str6 = student3.getEmail();
        double double7 = student3.getHourlyRate();
        java.lang.String str8 = student3.getPassword();
        student3.login("hi!", "hi!");
        boolean boolean12 = student3.isVerified();
        java.lang.String str13 = student3.getEmail();
        java.lang.String str14 = student3.getID();
        student3.setVerified(false);
        student3.viewProfile();
        java.lang.String str18 = student3.getPassword();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test04940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04940");
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
        student3.viewProfile();
        java.lang.String str19 = student3.getEmail();
        student3.setVerified(false);
        double double22 = student3.getHourlyRate();
        student3.setVerified(true);
        boolean boolean25 = student3.isVerified();
        student3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "student" + "'", str13, "student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 20.0d + "'", double22 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test04941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04941");
        model.Student student3 = new model.Student("", "", "hi!");
        student3.logout();
        java.lang.String str5 = student3.getID();
        java.lang.String str6 = student3.getEmail();
        java.lang.String str7 = student3.getID();
        boolean boolean8 = student3.isVerified();
        java.lang.String str9 = student3.getEmail();
        student3.viewProfile();
        java.lang.String str11 = student3.getID();
        student3.logout();
        boolean boolean13 = student3.isVerified();
        java.lang.Class<?> wildcardClass14 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test04942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04942");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        java.lang.String str4 = student3.getAccountType();
        java.lang.String str5 = student3.getID();
        student3.setVerified(true);
        boolean boolean8 = student3.isVerified();
        student3.setVerified(false);
        student3.login("", "");
        student3.login("student", "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "student" + "'", str4, "student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test04943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04943");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        java.lang.String str8 = student3.getPassword();
        student3.logout();
        java.lang.String str10 = student3.getID();
        student3.login("student", "");
        student3.setVerified(false);
        student3.viewProfile();
        student3.viewProfile();
        double double18 = student3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 20.0d + "'", double18 == 20.0d);
    }

    @Test
    public void test04944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04944");
        model.Student student3 = new model.Student("hi!", "student", "");
        java.lang.String str4 = student3.getEmail();
        student3.logout();
        java.lang.String str6 = student3.getID();
        java.lang.String str7 = student3.getAccountType();
        double double8 = student3.getHourlyRate();
        java.lang.String str9 = student3.getAccountType();
        java.lang.String str10 = student3.getEmail();
        boolean boolean11 = student3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "student" + "'", str9, "student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test04945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04945");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        double double8 = student3.getHourlyRate();
        boolean boolean9 = student3.isVerified();
        student3.logout();
        student3.viewProfile();
        student3.login("", "");
        java.lang.String str15 = student3.getEmail();
        double double16 = student3.getHourlyRate();
        java.lang.String str17 = student3.getPassword();
        java.lang.Class<?> wildcardClass18 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 20.0d + "'", double16 == 20.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test04946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04946");
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
        student3.setVerified(true);
        java.lang.String str19 = student3.getPassword();
        java.lang.String str20 = student3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test04947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04947");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        java.lang.String str8 = student3.getAccountType();
        java.lang.String str9 = student3.getAccountType();
        java.lang.String str10 = student3.getID();
        student3.viewProfile();
        double double12 = student3.getHourlyRate();
        java.lang.String str13 = student3.getID();
        student3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "student" + "'", str9, "student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 20.0d + "'", double12 == 20.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test04948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04948");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        boolean boolean7 = student3.isVerified();
        java.lang.String str8 = student3.getEmail();
        student3.logout();
        double double10 = student3.getHourlyRate();
        double double11 = student3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
    }

    @Test
    public void test04949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04949");
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
        java.lang.Class<?> wildcardClass18 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "student" + "'", str12, "student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test04950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04950");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        java.lang.String str7 = student3.getID();
        double double8 = student3.getHourlyRate();
        student3.logout();
        student3.logout();
        student3.setVerified(true);
        java.lang.String str13 = student3.getID();
        java.lang.String str14 = student3.getEmail();
        student3.setVerified(true);
        double double17 = student3.getHourlyRate();
        student3.viewProfile();
        boolean boolean19 = student3.isVerified();
        java.lang.Class<?> wildcardClass20 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 20.0d + "'", double17 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test04951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04951");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        double double6 = student3.getHourlyRate();
        java.lang.String str7 = student3.getPassword();
        java.lang.String str8 = student3.getPassword();
        java.lang.String str9 = student3.getAccountType();
        student3.login("hi!", "student");
        java.lang.String str13 = student3.getID();
        java.lang.String str14 = student3.getPassword();
        java.lang.String str15 = student3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "student" + "'", str9, "student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test04952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04952");
        model.Student student3 = new model.Student("", "", "hi!");
        student3.login("", "");
        double double7 = student3.getHourlyRate();
        student3.login("student", "student");
        java.lang.String str11 = student3.getPassword();
        student3.logout();
        student3.setVerified(true);
        java.lang.String str15 = student3.getEmail();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test04953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04953");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        java.lang.String str6 = student3.getPassword();
        java.lang.String str7 = student3.getPassword();
        java.lang.String str8 = student3.getID();
        student3.setVerified(true);
        student3.viewProfile();
        java.lang.Class<?> wildcardClass12 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test04954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04954");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        student3.setVerified(false);
        student3.viewProfile();
        java.lang.String str7 = student3.getEmail();
        java.lang.String str8 = student3.getAccountType();
        java.lang.String str9 = student3.getID();
        student3.setVerified(false);
        boolean boolean12 = student3.isVerified();
        student3.logout();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test04955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04955");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        java.lang.String str6 = student3.getPassword();
        student3.setVerified(false);
        student3.setVerified(true);
        java.lang.String str11 = student3.getEmail();
        student3.login("hi!", "hi!");
        java.lang.String str15 = student3.getEmail();
        boolean boolean16 = student3.isVerified();
        boolean boolean17 = student3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test04956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04956");
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
        boolean boolean15 = student3.isVerified();
        boolean boolean16 = student3.isVerified();
        student3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 20.0d + "'", double13 == 20.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 20.0d + "'", double14 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test04957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04957");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.viewProfile();
        java.lang.String str8 = student3.getAccountType();
        student3.setVerified(false);
        java.lang.String str11 = student3.getID();
        java.lang.String str12 = student3.getEmail();
        java.lang.String str13 = student3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test04958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04958");
        model.Student student3 = new model.Student("", "", "student");
        java.lang.String str4 = student3.getAccountType();
        java.lang.String str5 = student3.getID();
        double double6 = student3.getHourlyRate();
        boolean boolean7 = student3.isVerified();
        java.lang.String str8 = student3.getEmail();
        boolean boolean9 = student3.isVerified();
        java.lang.String str10 = student3.getPassword();
        java.lang.String str11 = student3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "student" + "'", str4, "student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test04959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04959");
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
        java.lang.String str15 = student3.getAccountType();
        student3.viewProfile();
        java.lang.String str17 = student3.getID();
        student3.login("hi!", "student");
        java.lang.String str21 = student3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "student" + "'", str15, "student");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test04960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04960");
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
        double double17 = student3.getHourlyRate();
        java.lang.Class<?> wildcardClass18 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 20.0d + "'", double14 == 20.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 20.0d + "'", double16 == 20.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 20.0d + "'", double17 == 20.0d);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test04961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04961");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getEmail();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        student3.login("hi!", "student");
        double double11 = student3.getHourlyRate();
        java.lang.String str12 = student3.getAccountType();
        double double13 = student3.getHourlyRate();
        student3.logout();
        double double15 = student3.getHourlyRate();
        java.lang.Class<?> wildcardClass16 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "student" + "'", str12, "student");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 20.0d + "'", double13 == 20.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 20.0d + "'", double15 == 20.0d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test04962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04962");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        java.lang.String str4 = student3.getAccountType();
        java.lang.String str5 = student3.getEmail();
        double double6 = student3.getHourlyRate();
        double double7 = student3.getHourlyRate();
        java.lang.String str8 = student3.getPassword();
        boolean boolean9 = student3.isVerified();
        boolean boolean10 = student3.isVerified();
        student3.logout();
        java.lang.String str12 = student3.getEmail();
        student3.login("student", "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "student" + "'", str4, "student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test04963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04963");
        model.Student student3 = new model.Student("", "student", "hi!");
        java.lang.String str4 = student3.getPassword();
        java.lang.String str5 = student3.getPassword();
        java.lang.String str6 = student3.getAccountType();
        student3.logout();
        java.lang.Class<?> wildcardClass8 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "student" + "'", str4, "student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test04964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04964");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        double double6 = student3.getHourlyRate();
        student3.logout();
        student3.viewProfile();
        java.lang.String str9 = student3.getEmail();
        java.lang.String str10 = student3.getEmail();
        java.lang.String str11 = student3.getAccountType();
        student3.logout();
        boolean boolean13 = student3.isVerified();
        java.lang.String str14 = student3.getEmail();
        student3.logout();
        double double16 = student3.getHourlyRate();
        double double17 = student3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "student" + "'", str11, "student");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 20.0d + "'", double16 == 20.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 20.0d + "'", double17 == 20.0d);
    }

    @Test
    public void test04965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04965");
        model.Student student3 = new model.Student("", "", "hi!");
        student3.logout();
        java.lang.String str5 = student3.getID();
        java.lang.String str6 = student3.getEmail();
        java.lang.String str7 = student3.getID();
        boolean boolean8 = student3.isVerified();
        java.lang.String str9 = student3.getEmail();
        student3.viewProfile();
        java.lang.String str11 = student3.getID();
        java.lang.String str12 = student3.getEmail();
        student3.logout();
        java.lang.String str14 = student3.getEmail();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test04966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04966");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        java.lang.String str7 = student3.getID();
        java.lang.String str8 = student3.getEmail();
        student3.login("", "");
        java.lang.String str12 = student3.getAccountType();
        student3.viewProfile();
        boolean boolean14 = student3.isVerified();
        student3.viewProfile();
        boolean boolean16 = student3.isVerified();
        student3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "student" + "'", str12, "student");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test04967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04967");
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
        boolean boolean17 = student3.isVerified();
        java.lang.String str18 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "student" + "'", str18, "student");
    }

    @Test
    public void test04968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04968");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getAccountType();
        student3.logout();
        boolean boolean8 = student3.isVerified();
        student3.setVerified(true);
        java.lang.String str11 = student3.getAccountType();
        java.lang.String str12 = student3.getEmail();
        java.lang.Class<?> wildcardClass13 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "student" + "'", str11, "student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test04969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04969");
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
        java.lang.String str14 = student3.getEmail();
        java.lang.String str15 = student3.getPassword();
        boolean boolean16 = student3.isVerified();
        student3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test04970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04970");
        model.Student student3 = new model.Student("", "", "hi!");
        student3.logout();
        java.lang.String str5 = student3.getID();
        java.lang.String str6 = student3.getEmail();
        double double7 = student3.getHourlyRate();
        boolean boolean8 = student3.isVerified();
        java.lang.String str9 = student3.getID();
        double double10 = student3.getHourlyRate();
        java.lang.String str11 = student3.getPassword();
        student3.viewProfile();
        java.lang.String str13 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "student" + "'", str13, "student");
    }

    @Test
    public void test04971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04971");
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
        student3.login("hi!", "");
        student3.login("hi!", "");
        java.lang.String str20 = student3.getID();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 20.0d + "'", double13 == 20.0d);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test04972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04972");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        student3.setVerified(false);
        java.lang.String str10 = student3.getID();
        double double11 = student3.getHourlyRate();
        student3.viewProfile();
        java.lang.String str13 = student3.getPassword();
        student3.logout();
        student3.setVerified(true);
        double double17 = student3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 20.0d + "'", double17 == 20.0d);
    }

    @Test
    public void test04973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04973");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        student3.setVerified(false);
        java.lang.String str6 = student3.getPassword();
        java.lang.String str7 = student3.getAccountType();
        java.lang.String str8 = student3.getEmail();
        java.lang.String str9 = student3.getID();
        student3.login("student", "hi!");
        double double13 = student3.getHourlyRate();
        java.lang.String str14 = student3.getPassword();
        student3.setVerified(false);
        boolean boolean17 = student3.isVerified();
        double double18 = student3.getHourlyRate();
        java.lang.String str19 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 20.0d + "'", double13 == 20.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 20.0d + "'", double18 == 20.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "student" + "'", str19, "student");
    }

    @Test
    public void test04974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04974");
        model.Student student3 = new model.Student("", "", "hi!");
        student3.login("", "");
        student3.viewProfile();
        student3.viewProfile();
        java.lang.String str9 = student3.getEmail();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test04975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04975");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        student3.setVerified(false);
        java.lang.String str6 = student3.getEmail();
        student3.setVerified(false);
        student3.login("student", "hi!");
        java.lang.String str12 = student3.getAccountType();
        double double13 = student3.getHourlyRate();
        java.lang.String str14 = student3.getPassword();
        java.lang.String str15 = student3.getPassword();
        double double16 = student3.getHourlyRate();
        student3.setVerified(true);
        student3.login("student", "student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "student" + "'", str12, "student");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 20.0d + "'", double13 == 20.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 20.0d + "'", double16 == 20.0d);
    }

    @Test
    public void test04976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04976");
        model.Student student3 = new model.Student("", "", "hi!");
        student3.logout();
        java.lang.String str5 = student3.getID();
        java.lang.String str6 = student3.getEmail();
        double double7 = student3.getHourlyRate();
        java.lang.String str8 = student3.getEmail();
        student3.login("", "");
        student3.login("", "");
        student3.logout();
        java.lang.String str16 = student3.getEmail();
        student3.login("hi!", "student");
        student3.login("student", "");
        student3.login("student", "student");
        student3.logout();
        java.lang.Class<?> wildcardClass27 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test04977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04977");
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
        student3.login("hi!", "hi!");
        student3.setVerified(true);
        java.lang.String str22 = student3.getID();
        double double23 = student3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "student" + "'", str13, "student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "student" + "'", str14, "student");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "student" + "'", str16, "student");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 20.0d + "'", double23 == 20.0d);
    }

    @Test
    public void test04978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04978");
        model.Student student3 = new model.Student("student", "", "student");
        student3.setVerified(false);
        java.lang.String str6 = student3.getAccountType();
        java.lang.String str7 = student3.getEmail();
        student3.login("", "");
        java.lang.String str11 = student3.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test04979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04979");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        java.lang.String str7 = student3.getID();
        student3.login("hi!", "");
        java.lang.String str11 = student3.getPassword();
        boolean boolean12 = student3.isVerified();
        student3.setVerified(true);
        double double15 = student3.getHourlyRate();
        boolean boolean16 = student3.isVerified();
        java.lang.String str17 = student3.getAccountType();
        double double18 = student3.getHourlyRate();
        student3.viewProfile();
        student3.login("", "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 20.0d + "'", double15 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "student" + "'", str17, "student");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 20.0d + "'", double18 == 20.0d);
    }

    @Test
    public void test04980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04980");
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
        student3.logout();
        boolean boolean18 = student3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "student" + "'", str11, "student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "student" + "'", str14, "student");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test04981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04981");
        model.Student student3 = new model.Student("hi!", "hi!", "");
        java.lang.String str4 = student3.getEmail();
        student3.logout();
        java.lang.String str6 = student3.getAccountType();
        java.lang.String str7 = student3.getAccountType();
        java.lang.Class<?> wildcardClass8 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test04982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04982");
        model.Student student3 = new model.Student("hi!", "student", "");
        student3.logout();
        java.lang.String str5 = student3.getEmail();
        java.lang.String str6 = student3.getEmail();
        double double7 = student3.getHourlyRate();
        student3.logout();
        student3.login("", "hi!");
        java.lang.String str12 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "student" + "'", str12, "student");
    }

    @Test
    public void test04983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04983");
        model.Student student3 = new model.Student("student", "hi!", "student");
        boolean boolean4 = student3.isVerified();
        java.lang.String str5 = student3.getEmail();
        student3.login("", "student");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
    }

    @Test
    public void test04984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04984");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        java.lang.String str8 = student3.getAccountType();
        java.lang.String str9 = student3.getAccountType();
        student3.setVerified(true);
        student3.logout();
        java.lang.Class<?> wildcardClass13 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "student" + "'", str9, "student");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test04985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04985");
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
        boolean boolean16 = student3.isVerified();
        student3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "student" + "'", str13, "student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "student" + "'", str14, "student");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test04986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04986");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        student3.setVerified(false);
        boolean boolean9 = student3.isVerified();
        double double10 = student3.getHourlyRate();
        java.lang.String str11 = student3.getID();
        boolean boolean12 = student3.isVerified();
        java.lang.String str13 = student3.getEmail();
        java.lang.String str14 = student3.getEmail();
        double double15 = student3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 20.0d + "'", double15 == 20.0d);
    }

    @Test
    public void test04987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04987");
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
        student3.viewProfile();
        double double22 = student3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 20.0d + "'", double19 == 20.0d);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 20.0d + "'", double22 == 20.0d);
    }

    @Test
    public void test04988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04988");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        java.lang.String str4 = student3.getAccountType();
        java.lang.String str5 = student3.getID();
        student3.viewProfile();
        student3.setVerified(true);
        java.lang.String str9 = student3.getEmail();
        boolean boolean10 = student3.isVerified();
        double double11 = student3.getHourlyRate();
        java.lang.Class<?> wildcardClass12 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "student" + "'", str4, "student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test04989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04989");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        java.lang.String str4 = student3.getAccountType();
        java.lang.String str5 = student3.getID();
        student3.setVerified(true);
        boolean boolean8 = student3.isVerified();
        student3.logout();
        student3.viewProfile();
        java.lang.String str11 = student3.getEmail();
        boolean boolean12 = student3.isVerified();
        java.lang.String str13 = student3.getID();
        double double14 = student3.getHourlyRate();
        java.lang.Class<?> wildcardClass15 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "student" + "'", str4, "student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 20.0d + "'", double14 == 20.0d);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test04990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04990");
        model.Student student3 = new model.Student("", "", "hi!");
        student3.logout();
        java.lang.String str5 = student3.getID();
        java.lang.String str6 = student3.getPassword();
        student3.viewProfile();
        boolean boolean8 = student3.isVerified();
        double double9 = student3.getHourlyRate();
        java.lang.Class<?> wildcardClass10 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test04991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04991");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.viewProfile();
        boolean boolean8 = student3.isVerified();
        boolean boolean9 = student3.isVerified();
        java.lang.String str10 = student3.getAccountType();
        student3.setVerified(true);
        double double13 = student3.getHourlyRate();
        java.lang.String str14 = student3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "student" + "'", str10, "student");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 20.0d + "'", double13 == 20.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test04992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04992");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        java.lang.String str8 = student3.getAccountType();
        java.lang.String str9 = student3.getAccountType();
        java.lang.String str10 = student3.getID();
        student3.setVerified(false);
        double double13 = student3.getHourlyRate();
        student3.logout();
        student3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "student" + "'", str9, "student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 20.0d + "'", double13 == 20.0d);
    }

    @Test
    public void test04993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04993");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        java.lang.String str7 = student3.getID();
        student3.login("hi!", "");
        student3.login("hi!", "");
        java.lang.String str14 = student3.getPassword();
        student3.setVerified(true);
        java.lang.String str17 = student3.getID();
        double double18 = student3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 20.0d + "'", double18 == 20.0d);
    }

    @Test
    public void test04994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04994");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        student3.login("", "student");
        student3.login("hi!", "hi!");
        boolean boolean13 = student3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test04995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04995");
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
        student3.setVerified(true);
        student3.login("student", "student");
        student3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 20.0d + "'", double18 == 20.0d);
    }

    @Test
    public void test04996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04996");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        double double6 = student3.getHourlyRate();
        java.lang.String str7 = student3.getPassword();
        java.lang.String str8 = student3.getPassword();
        java.lang.String str9 = student3.getAccountType();
        student3.viewProfile();
        java.lang.String str11 = student3.getEmail();
        java.lang.String str12 = student3.getID();
        java.lang.String str13 = student3.getPassword();
        java.lang.String str14 = student3.getEmail();
        boolean boolean15 = student3.isVerified();
        student3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "student" + "'", str9, "student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test04997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04997");
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
        java.lang.String str19 = student3.getPassword();
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test04998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04998");
        model.Student student3 = new model.Student("", "", "hi!");
        student3.logout();
        java.lang.String str5 = student3.getID();
        java.lang.String str6 = student3.getEmail();
        java.lang.String str7 = student3.getPassword();
        java.lang.String str8 = student3.getID();
        student3.logout();
        student3.logout();
        student3.viewProfile();
        java.lang.String str12 = student3.getEmail();
        student3.logout();
        java.lang.String str14 = student3.getAccountType();
        student3.viewProfile();
        java.lang.String str16 = student3.getID();
        double double17 = student3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "student" + "'", str14, "student");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 20.0d + "'", double17 == 20.0d);
    }

    @Test
    public void test04999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04999");
        model.Student student3 = new model.Student("", "", "hi!");
        student3.logout();
        java.lang.String str5 = student3.getID();
        java.lang.String str6 = student3.getEmail();
        double double7 = student3.getHourlyRate();
        java.lang.String str8 = student3.getPassword();
        student3.login("hi!", "hi!");
        boolean boolean12 = student3.isVerified();
        java.lang.String str13 = student3.getEmail();
        java.lang.String str14 = student3.getID();
        student3.setVerified(false);
        java.lang.String str17 = student3.getEmail();
        student3.logout();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test05000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test05000");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        java.lang.String str8 = student3.getEmail();
        java.lang.String str9 = student3.getID();
        java.lang.String str10 = student3.getAccountType();
        boolean boolean11 = student3.isVerified();
        double double12 = student3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "student" + "'", str10, "student");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 20.0d + "'", double12 == 20.0d);
    }
}

