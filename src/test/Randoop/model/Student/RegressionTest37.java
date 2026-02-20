import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest37 {

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
    public void test18501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18501");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        student3.setVerified(false);
        java.lang.String str6 = student3.getPassword();
        java.lang.String str7 = student3.getAccountType();
        student3.viewProfile();
        double double9 = student3.getHourlyRate();
        boolean boolean10 = student3.isVerified();
        student3.login("hi!", "");
        student3.viewProfile();
        student3.login("hi!", "student");
        java.lang.String str18 = student3.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test18502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18502");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        java.lang.String str8 = student3.getEmail();
        boolean boolean9 = student3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test18503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18503");
        model.Student student3 = new model.Student("hi!", "hi!", "student");
        student3.logout();
        java.lang.String str5 = student3.getEmail();
        student3.logout();
        java.lang.String str7 = student3.getAccountType();
        student3.viewProfile();
        student3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
    }

    @Test
    public void test18504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18504");
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
        double double20 = student3.getHourlyRate();
        student3.setVerified(true);
        student3.viewProfile();
        double double24 = student3.getHourlyRate();
        student3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 20.0d + "'", double18 == 20.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 20.0d + "'", double20 == 20.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 20.0d + "'", double24 == 20.0d);
    }

    @Test
    public void test18505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18505");
        model.Student student3 = new model.Student("hi!", "hi!", "");
        student3.setVerified(false);
        student3.viewProfile();
        student3.logout();
    }

    @Test
    public void test18506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18506");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.viewProfile();
        student3.viewProfile();
        student3.logout();
        student3.viewProfile();
        student3.viewProfile();
        student3.viewProfile();
        java.lang.String str13 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "student" + "'", str13, "student");
    }

    @Test
    public void test18507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18507");
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
        student3.setVerified(true);
        student3.login("hi!", "student");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test18508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18508");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        student3.setVerified(false);
        java.lang.String str6 = student3.getPassword();
        java.lang.String str7 = student3.getAccountType();
        student3.viewProfile();
        student3.logout();
        student3.setVerified(true);
        student3.setVerified(false);
        java.lang.String str14 = student3.getEmail();
        student3.viewProfile();
        java.lang.String str16 = student3.getAccountType();
        java.lang.String str17 = student3.getEmail();
        java.lang.String str18 = student3.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "student" + "'", str16, "student");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test18509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18509");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        java.lang.String str6 = student3.getPassword();
        student3.setVerified(false);
        java.lang.String str9 = student3.getAccountType();
        boolean boolean10 = student3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "student" + "'", str9, "student");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test18510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18510");
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
        double double17 = student3.getHourlyRate();
        java.lang.String str18 = student3.getPassword();
        student3.login("hi!", "");
        java.lang.Class<?> wildcardClass22 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "student" + "'", str12, "student");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 20.0d + "'", double17 == 20.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test18511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18511");
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
        student3.login("", "student");
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
    }

    @Test
    public void test18512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18512");
        model.Student student3 = new model.Student("", "", "hi!");
        student3.logout();
        student3.viewProfile();
        student3.viewProfile();
        double double7 = student3.getHourlyRate();
        java.lang.String str8 = student3.getPassword();
        java.lang.String str9 = student3.getEmail();
        java.lang.String str10 = student3.getEmail();
        java.lang.String str11 = student3.getPassword();
        student3.logout();
        student3.viewProfile();
        java.lang.Class<?> wildcardClass14 = student3.getClass();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test18513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18513");
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
        java.lang.String str15 = student3.getEmail();
        java.lang.String str16 = student3.getPassword();
        student3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test18514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18514");
        model.Student student3 = new model.Student("", "", "hi!");
        student3.logout();
        java.lang.String str5 = student3.getID();
        java.lang.String str6 = student3.getEmail();
        java.lang.String str7 = student3.getID();
        boolean boolean8 = student3.isVerified();
        java.lang.String str9 = student3.getEmail();
        student3.viewProfile();
        student3.setVerified(true);
        student3.logout();
        java.lang.String str14 = student3.getPassword();
        java.lang.String str15 = student3.getPassword();
        student3.viewProfile();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test18515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18515");
        model.Student student3 = new model.Student("hi!", "student", "student");
        java.lang.String str4 = student3.getID();
        student3.login("", "student");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "student" + "'", str4, "student");
    }

    @Test
    public void test18516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18516");
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
        student3.logout();
        java.lang.String str15 = student3.getPassword();
        student3.viewProfile();
        boolean boolean17 = student3.isVerified();
        student3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "student" + "'", str11, "student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test18517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18517");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        student3.setVerified(false);
        java.lang.String str6 = student3.getPassword();
        java.lang.String str7 = student3.getID();
        student3.login("", "hi!");
        student3.setVerified(false);
        boolean boolean13 = student3.isVerified();
        boolean boolean14 = student3.isVerified();
        java.lang.String str15 = student3.getID();
        double double16 = student3.getHourlyRate();
        java.lang.String str17 = student3.getEmail();
        double double18 = student3.getHourlyRate();
        java.lang.String str19 = student3.getID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 20.0d + "'", double16 == 20.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 20.0d + "'", double18 == 20.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test18518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18518");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        student3.setVerified(false);
        java.lang.String str6 = student3.getEmail();
        student3.logout();
        double double8 = student3.getHourlyRate();
        student3.setVerified(true);
        double double11 = student3.getHourlyRate();
        student3.login("student", "student");
        student3.logout();
        student3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
    }

    @Test
    public void test18519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18519");
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
        java.lang.String str21 = student3.getID();
        student3.setVerified(true);
        student3.viewProfile();
        boolean boolean25 = student3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 20.0d + "'", double16 == 20.0d);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test18520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18520");
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
        double double16 = student3.getHourlyRate();
        java.lang.String str17 = student3.getPassword();
        java.lang.String str18 = student3.getEmail();
        student3.logout();
        student3.logout();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 20.0d + "'", double16 == 20.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test18521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18521");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        student3.setVerified(false);
        student3.viewProfile();
        java.lang.String str7 = student3.getEmail();
        java.lang.String str8 = student3.getAccountType();
        java.lang.String str9 = student3.getID();
        java.lang.String str10 = student3.getPassword();
        double double11 = student3.getHourlyRate();
        java.lang.String str12 = student3.getID();
        student3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test18522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18522");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        java.lang.String str6 = student3.getPassword();
        double double7 = student3.getHourlyRate();
        student3.logout();
        boolean boolean9 = student3.isVerified();
        student3.login("hi!", "hi!");
        java.lang.String str13 = student3.getEmail();
        double double14 = student3.getHourlyRate();
        boolean boolean15 = student3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 20.0d + "'", double14 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test18523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18523");
        model.Student student3 = new model.Student("student", "", "student");
        student3.setVerified(false);
        student3.login("hi!", "hi!");
        boolean boolean9 = student3.isVerified();
        student3.setVerified(true);
        student3.viewProfile();
        student3.setVerified(true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test18524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18524");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getEmail();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        student3.login("hi!", "student");
        double double11 = student3.getHourlyRate();
        java.lang.String str12 = student3.getAccountType();
        java.lang.String str13 = student3.getPassword();
        student3.login("student", "");
        double double17 = student3.getHourlyRate();
        double double18 = student3.getHourlyRate();
        java.lang.String str19 = student3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "student" + "'", str12, "student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 20.0d + "'", double17 == 20.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 20.0d + "'", double18 == 20.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test18525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18525");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        double double8 = student3.getHourlyRate();
        boolean boolean9 = student3.isVerified();
        student3.setVerified(false);
        double double12 = student3.getHourlyRate();
        java.lang.String str13 = student3.getEmail();
        double double14 = student3.getHourlyRate();
        student3.login("hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 20.0d + "'", double12 == 20.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 20.0d + "'", double14 == 20.0d);
    }

    @Test
    public void test18526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18526");
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
        java.lang.String str14 = student3.getAccountType();
        java.lang.String str15 = student3.getID();
        java.lang.String str16 = student3.getPassword();
        java.lang.String str17 = student3.getPassword();
        student3.setVerified(false);
        student3.login("hi!", "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "student" + "'", str13, "student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "student" + "'", str14, "student");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test18527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18527");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getAccountType();
        student3.logout();
        boolean boolean8 = student3.isVerified();
        student3.setVerified(true);
        student3.setVerified(false);
        student3.login("student", "student");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test18528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18528");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        student3.setVerified(false);
        student3.viewProfile();
        java.lang.String str7 = student3.getEmail();
        java.lang.String str8 = student3.getAccountType();
        student3.logout();
        boolean boolean10 = student3.isVerified();
        student3.login("", "hi!");
        student3.viewProfile();
        java.lang.String str15 = student3.getPassword();
        student3.logout();
        java.lang.String str17 = student3.getID();
        student3.login("hi!", "");
        student3.viewProfile();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test18529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18529");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        student3.login("", "student");
        student3.login("hi!", "hi!");
        java.lang.String str13 = student3.getAccountType();
        java.lang.String str14 = student3.getEmail();
        java.lang.String str15 = student3.getPassword();
        java.lang.String str16 = student3.getAccountType();
        student3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "student" + "'", str13, "student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "student" + "'", str16, "student");
    }

    @Test
    public void test18530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18530");
        model.Student student3 = new model.Student("", "", "hi!");
        student3.logout();
        java.lang.String str5 = student3.getID();
        java.lang.String str6 = student3.getEmail();
        double double7 = student3.getHourlyRate();
        java.lang.String str8 = student3.getPassword();
        student3.login("hi!", "hi!");
        boolean boolean12 = student3.isVerified();
        java.lang.String str13 = student3.getAccountType();
        student3.logout();
        java.lang.String str15 = student3.getPassword();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "student" + "'", str13, "student");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test18531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18531");
        model.Student student3 = new model.Student("hi!", "student", "student");
        java.lang.String str4 = student3.getID();
        student3.setVerified(true);
        student3.viewProfile();
        student3.login("", "");
        java.lang.String str11 = student3.getID();
        student3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "student" + "'", str4, "student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "student" + "'", str11, "student");
    }

    @Test
    public void test18532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18532");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        double double6 = student3.getHourlyRate();
        java.lang.String str7 = student3.getPassword();
        java.lang.String str8 = student3.getPassword();
        java.lang.String str9 = student3.getAccountType();
        student3.viewProfile();
        java.lang.String str11 = student3.getEmail();
        java.lang.String str12 = student3.getAccountType();
        student3.setVerified(true);
        boolean boolean15 = student3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "student" + "'", str9, "student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "student" + "'", str12, "student");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test18533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18533");
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
        student3.logout();
        double double21 = student3.getHourlyRate();
        student3.login("", "");
        boolean boolean25 = student3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 20.0d + "'", double18 == 20.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 20.0d + "'", double21 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test18534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18534");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.login("", "");
        java.lang.String str10 = student3.getID();
        student3.viewProfile();
        double double12 = student3.getHourlyRate();
        student3.logout();
        student3.login("hi!", "hi!");
        java.lang.String str17 = student3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 20.0d + "'", double12 == 20.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test18535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18535");
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
        java.lang.String str14 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "student" + "'", str10, "student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "student" + "'", str11, "student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "student" + "'", str14, "student");
    }

    @Test
    public void test18536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18536");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        student3.setVerified(false);
        boolean boolean9 = student3.isVerified();
        double double10 = student3.getHourlyRate();
        java.lang.String str11 = student3.getPassword();
        student3.logout();
        java.lang.String str13 = student3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test18537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18537");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        java.lang.String str8 = student3.getPassword();
        java.lang.String str9 = student3.getAccountType();
        java.lang.String str10 = student3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "student" + "'", str9, "student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test18538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18538");
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
        java.lang.String str23 = student3.getPassword();
        java.lang.String str24 = student3.getAccountType();
        java.lang.String str25 = student3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 20.0d + "'", double18 == 20.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 20.0d + "'", double21 == 20.0d);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "student" + "'", str24, "student");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test18539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18539");
        model.Student student3 = new model.Student("hi!", "student", "");
        java.lang.String str4 = student3.getEmail();
        double double5 = student3.getHourlyRate();
        student3.logout();
        java.lang.String str7 = student3.getAccountType();
        student3.viewProfile();
        double double9 = student3.getHourlyRate();
        student3.logout();
        student3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
    }

    @Test
    public void test18540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18540");
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
        double double23 = student3.getHourlyRate();
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
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 20.0d + "'", double23 == 20.0d);
    }

    @Test
    public void test18541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18541");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.viewProfile();
        java.lang.String str8 = student3.getAccountType();
        student3.logout();
        student3.logout();
        java.lang.String str11 = student3.getPassword();
        java.lang.String str12 = student3.getID();
        student3.viewProfile();
        student3.viewProfile();
        student3.setVerified(false);
        student3.setVerified(true);
        java.lang.Class<?> wildcardClass19 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test18542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18542");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        java.lang.String str7 = student3.getID();
        java.lang.String str8 = student3.getEmail();
        student3.login("", "");
        java.lang.String str12 = student3.getAccountType();
        student3.logout();
        java.lang.String str14 = student3.getAccountType();
        double double15 = student3.getHourlyRate();
        student3.logout();
        java.lang.String str17 = student3.getPassword();
        java.lang.Class<?> wildcardClass18 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "student" + "'", str12, "student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "student" + "'", str14, "student");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 20.0d + "'", double15 == 20.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test18543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18543");
        model.Student student3 = new model.Student("", "", "student");
        student3.login("student", "");
        boolean boolean7 = student3.isVerified();
        student3.logout();
        student3.logout();
        java.lang.String str10 = student3.getAccountType();
        java.lang.String str11 = student3.getPassword();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "student" + "'", str10, "student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test18544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18544");
        model.Student student3 = new model.Student("", "", "hi!");
        student3.logout();
        java.lang.String str5 = student3.getID();
        java.lang.String str6 = student3.getEmail();
        java.lang.String str7 = student3.getPassword();
        java.lang.String str8 = student3.getID();
        student3.logout();
        student3.logout();
        double double11 = student3.getHourlyRate();
        double double12 = student3.getHourlyRate();
        double double13 = student3.getHourlyRate();
        student3.login("student", "student");
        java.lang.String str17 = student3.getID();
        java.lang.String str18 = student3.getID();
        java.lang.String str19 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 20.0d + "'", double12 == 20.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 20.0d + "'", double13 == 20.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "student" + "'", str19, "student");
    }

    @Test
    public void test18545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18545");
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
        double double13 = student3.getHourlyRate();
        student3.login("", "hi!");
        boolean boolean17 = student3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 20.0d + "'", double13 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test18546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18546");
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
        java.lang.String str15 = student3.getPassword();
        java.lang.String str16 = student3.getEmail();
        student3.logout();
        student3.logout();
        java.lang.String str19 = student3.getAccountType();
        java.lang.String str20 = student3.getPassword();
        student3.login("hi!", "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "student" + "'", str11, "student");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "student" + "'", str19, "student");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test18547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18547");
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
        student3.viewProfile();
        java.lang.String str18 = student3.getEmail();
        double double19 = student3.getHourlyRate();
        java.lang.String str20 = student3.getID();
        student3.logout();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 20.0d + "'", double19 == 20.0d);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test18548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18548");
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
        student3.viewProfile();
        java.lang.String str15 = student3.getAccountType();
        student3.viewProfile();
        boolean boolean17 = student3.isVerified();
        student3.logout();
        java.lang.String str19 = student3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "student" + "'", str11, "student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "student" + "'", str15, "student");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test18549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18549");
        model.Student student3 = new model.Student("hi!", "hi!", "");
        student3.setVerified(true);
        boolean boolean6 = student3.isVerified();
        java.lang.String str7 = student3.getPassword();
        java.lang.String str8 = student3.getEmail();
        java.lang.Class<?> wildcardClass9 = student3.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test18550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18550");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        java.lang.String str4 = student3.getPassword();
        double double5 = student3.getHourlyRate();
        java.lang.String str6 = student3.getPassword();
        double double7 = student3.getHourlyRate();
        boolean boolean8 = student3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test18551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18551");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getAccountType();
        student3.logout();
        student3.setVerified(true);
        java.lang.String str10 = student3.getAccountType();
        student3.viewProfile();
        student3.login("hi!", "");
        double double15 = student3.getHourlyRate();
        java.lang.String str16 = student3.getAccountType();
        double double17 = student3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "student" + "'", str10, "student");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 20.0d + "'", double15 == 20.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "student" + "'", str16, "student");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 20.0d + "'", double17 == 20.0d);
    }

    @Test
    public void test18552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18552");
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
        boolean boolean15 = student3.isVerified();
        student3.viewProfile();
        student3.login("", "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "student" + "'", str10, "student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test18553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18553");
        model.Student student3 = new model.Student("", "hi!", "student");
        java.lang.String str4 = student3.getPassword();
        student3.login("student", "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test18554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18554");
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
        boolean boolean16 = student3.isVerified();
        boolean boolean17 = student3.isVerified();
        student3.viewProfile();
        java.lang.String str19 = student3.getEmail();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "student" + "'", str10, "student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "student" + "'", str11, "student");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 20.0d + "'", double12 == 20.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 20.0d + "'", double13 == 20.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "student" + "'", str15, "student");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test18555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18555");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        student3.setVerified(false);
        java.lang.String str10 = student3.getID();
        student3.viewProfile();
        java.lang.String str12 = student3.getID();
        student3.logout();
        student3.login("", "");
        student3.login("hi!", "student");
        double double20 = student3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 20.0d + "'", double20 == 20.0d);
    }

    @Test
    public void test18556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18556");
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
        java.lang.String str21 = student3.getEmail();
        double double22 = student3.getHourlyRate();
        java.lang.String str23 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "student" + "'", str4, "student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "student" + "'", str12, "student");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 20.0d + "'", double13 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 20.0d + "'", double22 == 20.0d);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "student" + "'", str23, "student");
    }

    @Test
    public void test18557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18557");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        student3.setVerified(false);
        java.lang.String str6 = student3.getPassword();
        java.lang.String str7 = student3.getAccountType();
        student3.viewProfile();
        student3.logout();
        student3.setVerified(true);
        student3.setVerified(true);
        double double14 = student3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 20.0d + "'", double14 == 20.0d);
    }

    @Test
    public void test18558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18558");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        student3.setVerified(false);
        java.lang.String str10 = student3.getID();
        double double11 = student3.getHourlyRate();
        java.lang.String str12 = student3.getID();
        java.lang.String str13 = student3.getID();
        student3.setVerified(false);
        student3.login("", "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test18559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18559");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        student3.login("student", "");
        java.lang.String str10 = student3.getAccountType();
        java.lang.String str11 = student3.getAccountType();
        student3.viewProfile();
        student3.setVerified(false);
        student3.login("student", "");
        boolean boolean18 = student3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "student" + "'", str10, "student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "student" + "'", str11, "student");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test18560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18560");
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
        student3.setVerified(true);
        java.lang.String str16 = student3.getEmail();
        student3.logout();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "student" + "'", str10, "student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test18561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18561");
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
        student3.logout();
        boolean boolean19 = student3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test18562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18562");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        java.lang.String str8 = student3.getAccountType();
        java.lang.String str9 = student3.getAccountType();
        java.lang.String str10 = student3.getPassword();
        double double11 = student3.getHourlyRate();
        java.lang.String str12 = student3.getEmail();
        java.lang.String str13 = student3.getEmail();
        double double14 = student3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "student" + "'", str9, "student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 20.0d + "'", double14 == 20.0d);
    }

    @Test
    public void test18563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18563");
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
        java.lang.String str19 = student3.getEmail();
        student3.setVerified(false);
        java.lang.String str22 = student3.getEmail();
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test18564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18564");
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
        double double15 = student3.getHourlyRate();
        java.lang.String str16 = student3.getEmail();
        student3.login("student", "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 20.0d + "'", double15 == 20.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test18565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18565");
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
        java.lang.String str21 = student3.getEmail();
        student3.setVerified(false);
        double double24 = student3.getHourlyRate();
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
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 20.0d + "'", double24 == 20.0d);
    }

    @Test
    public void test18566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18566");
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
        java.lang.String str16 = student3.getPassword();
        student3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test18567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18567");
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
        double double15 = student3.getHourlyRate();
        student3.logout();
        java.lang.String str17 = student3.getEmail();
        student3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 20.0d + "'", double15 == 20.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test18568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18568");
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
        boolean boolean16 = student3.isVerified();
        student3.login("student", "");
        boolean boolean20 = student3.isVerified();
        java.lang.String str21 = student3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "student" + "'", str10, "student");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test18569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18569");
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
        double double15 = student3.getHourlyRate();
        java.lang.String str16 = student3.getAccountType();
        student3.viewProfile();
        student3.viewProfile();
        student3.setVerified(true);
        student3.logout();
        student3.login("", "");
        student3.login("student", "student");
        double double28 = student3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 20.0d + "'", double15 == 20.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "student" + "'", str16, "student");
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 20.0d + "'", double28 == 20.0d);
    }

    @Test
    public void test18570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18570");
        model.Student student3 = new model.Student("student", "", "student");
        student3.setVerified(false);
        student3.login("hi!", "hi!");
        boolean boolean9 = student3.isVerified();
        student3.setVerified(true);
        student3.viewProfile();
        student3.viewProfile();
        student3.setVerified(false);
        student3.login("", "");
        student3.login("hi!", "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test18571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18571");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        student3.logout();
        student3.login("hi!", "hi!");
        double double8 = student3.getHourlyRate();
        java.lang.String str9 = student3.getID();
        student3.login("", "student");
        java.lang.String str13 = student3.getID();
        java.lang.String str14 = student3.getEmail();
        java.lang.String str15 = student3.getID();
        student3.viewProfile();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test18572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18572");
        model.Student student3 = new model.Student("student", "hi!", "");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getEmail();
        student3.viewProfile();
        student3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
    }

    @Test
    public void test18573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18573");
        model.Student student3 = new model.Student("", "", "hi!");
        student3.logout();
        java.lang.String str5 = student3.getID();
        java.lang.String str6 = student3.getEmail();
        java.lang.String str7 = student3.getEmail();
        java.lang.String str8 = student3.getID();
        student3.viewProfile();
        student3.viewProfile();
        student3.login("student", "");
        student3.setVerified(true);
        java.lang.Class<?> wildcardClass16 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test18574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18574");
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
        double double15 = student3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 20.0d + "'", double14 == 20.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 20.0d + "'", double15 == 20.0d);
    }

    @Test
    public void test18575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18575");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        java.lang.String str4 = student3.getAccountType();
        java.lang.String str5 = student3.getID();
        student3.viewProfile();
        java.lang.String str7 = student3.getAccountType();
        boolean boolean8 = student3.isVerified();
        boolean boolean9 = student3.isVerified();
        double double10 = student3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "student" + "'", str4, "student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
    }

    @Test
    public void test18576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18576");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.viewProfile();
        java.lang.String str8 = student3.getAccountType();
        java.lang.String str9 = student3.getID();
        double double10 = student3.getHourlyRate();
        student3.logout();
        student3.login("", "");
        java.lang.String str15 = student3.getID();
        student3.setVerified(false);
        student3.viewProfile();
        java.lang.Class<?> wildcardClass19 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test18577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18577");
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
        double double19 = student3.getHourlyRate();
        student3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 20.0d + "'", double19 == 20.0d);
    }

    @Test
    public void test18578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18578");
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
        boolean boolean17 = student3.isVerified();
        student3.logout();
        student3.login("", "hi!");
        java.lang.String str22 = student3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test18579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18579");
        model.Student student3 = new model.Student("", "", "hi!");
        student3.logout();
        java.lang.String str5 = student3.getID();
        java.lang.String str6 = student3.getEmail();
        double double7 = student3.getHourlyRate();
        boolean boolean8 = student3.isVerified();
        boolean boolean9 = student3.isVerified();
        java.lang.String str10 = student3.getPassword();
        student3.login("hi!", "hi!");
        student3.logout();
        student3.setVerified(false);
        java.lang.String str17 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "student" + "'", str17, "student");
    }

    @Test
    public void test18580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18580");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        student3.setVerified(false);
        java.lang.String str6 = student3.getEmail();
        java.lang.String str7 = student3.getAccountType();
        student3.viewProfile();
        java.lang.String str9 = student3.getAccountType();
        java.lang.String str10 = student3.getPassword();
        double double11 = student3.getHourlyRate();
        java.lang.String str12 = student3.getAccountType();
        student3.login("hi!", "student");
        java.lang.String str16 = student3.getID();
        java.lang.String str17 = student3.getID();
        java.lang.String str18 = student3.getPassword();
        student3.setVerified(false);
        student3.login("", "");
        boolean boolean24 = student3.isVerified();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "student" + "'", str9, "student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "student" + "'", str12, "student");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test18581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18581");
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
        java.lang.String str15 = student3.getEmail();
        java.lang.String str16 = student3.getPassword();
        java.lang.String str17 = student3.getAccountType();
        student3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "student" + "'", str17, "student");
    }

    @Test
    public void test18582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18582");
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
        double double15 = student3.getHourlyRate();
        java.lang.String str16 = student3.getID();
        double double17 = student3.getHourlyRate();
        boolean boolean18 = student3.isVerified();
        java.lang.String str19 = student3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 20.0d + "'", double15 == 20.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 20.0d + "'", double17 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test18583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18583");
        model.Student student3 = new model.Student("", "", "hi!");
        student3.login("", "");
        student3.viewProfile();
        student3.viewProfile();
        student3.login("", "");
        student3.logout();
        java.lang.String str13 = student3.getID();
        boolean boolean14 = student3.isVerified();
        student3.login("student", "student");
        java.lang.String str18 = student3.getEmail();
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test18584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18584");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        student3.login("", "hi!");
        student3.logout();
        java.lang.String str11 = student3.getEmail();
        java.lang.Class<?> wildcardClass12 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test18585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18585");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        java.lang.String str8 = student3.getPassword();
        student3.setVerified(false);
        java.lang.String str11 = student3.getID();
        double double12 = student3.getHourlyRate();
        java.lang.String str13 = student3.getPassword();
        java.lang.String str14 = student3.getID();
        java.lang.String str15 = student3.getPassword();
        boolean boolean16 = student3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 20.0d + "'", double12 == 20.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test18586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18586");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        java.lang.String str4 = student3.getAccountType();
        java.lang.String str5 = student3.getEmail();
        student3.viewProfile();
        java.lang.String str7 = student3.getPassword();
        java.lang.String str8 = student3.getPassword();
        java.lang.String str9 = student3.getAccountType();
        java.lang.String str10 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "student" + "'", str4, "student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "student" + "'", str9, "student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "student" + "'", str10, "student");
    }

    @Test
    public void test18587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18587");
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
        java.lang.String str14 = student3.getAccountType();
        student3.logout();
        boolean boolean16 = student3.isVerified();
        java.lang.String str17 = student3.getID();
        student3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "student" + "'", str14, "student");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test18588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18588");
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
        student3.viewProfile();
        student3.setVerified(true);
        student3.logout();
        java.lang.String str19 = student3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test18589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18589");
        model.Student student3 = new model.Student("hi!", "", "student");
        student3.setVerified(false);
        java.lang.String str6 = student3.getID();
        java.lang.String str7 = student3.getAccountType();
        java.lang.String str8 = student3.getEmail();
        java.lang.String str9 = student3.getPassword();
        student3.viewProfile();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test18590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18590");
        model.Student student3 = new model.Student("", "", "hi!");
        student3.logout();
        java.lang.String str5 = student3.getID();
        java.lang.String str6 = student3.getPassword();
        double double7 = student3.getHourlyRate();
        double double8 = student3.getHourlyRate();
        double double9 = student3.getHourlyRate();
        java.lang.String str10 = student3.getPassword();
        java.lang.String str11 = student3.getAccountType();
        java.lang.String str12 = student3.getAccountType();
        java.lang.String str13 = student3.getID();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "student" + "'", str11, "student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "student" + "'", str12, "student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test18591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18591");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getAccountType();
        student3.logout();
        double double8 = student3.getHourlyRate();
        java.lang.String str9 = student3.getEmail();
        java.lang.String str10 = student3.getAccountType();
        student3.setVerified(true);
        student3.logout();
        java.lang.String str14 = student3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "student" + "'", str10, "student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test18592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18592");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        student3.logout();
        student3.login("hi!", "hi!");
        double double8 = student3.getHourlyRate();
        boolean boolean9 = student3.isVerified();
        boolean boolean10 = student3.isVerified();
        boolean boolean11 = student3.isVerified();
        java.lang.String str12 = student3.getAccountType();
        student3.login("hi!", "student");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "student" + "'", str12, "student");
    }

    @Test
    public void test18593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18593");
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
        student3.logout();
        student3.login("", "hi!");
        java.lang.String str28 = student3.getID();
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
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
    }

    @Test
    public void test18594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18594");
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
        student3.login("student", "hi!");
        student3.logout();
        java.lang.String str25 = student3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 20.0d + "'", double18 == 20.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test18595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18595");
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
        java.lang.String str16 = student3.getID();
        java.lang.String str17 = student3.getID();
        java.lang.String str18 = student3.getID();
        student3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test18596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18596");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        double double6 = student3.getHourlyRate();
        student3.logout();
        student3.setVerified(false);
        student3.logout();
        java.lang.String str11 = student3.getAccountType();
        java.lang.String str12 = student3.getAccountType();
        java.lang.String str13 = student3.getPassword();
        double double14 = student3.getHourlyRate();
        java.lang.String str15 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "student" + "'", str11, "student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "student" + "'", str12, "student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 20.0d + "'", double14 == 20.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "student" + "'", str15, "student");
    }

    @Test
    public void test18597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18597");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        java.lang.String str6 = student3.getPassword();
        student3.setVerified(false);
        student3.setVerified(false);
        java.lang.String str11 = student3.getPassword();
        java.lang.String str12 = student3.getEmail();
        java.lang.String str13 = student3.getPassword();
        double double14 = student3.getHourlyRate();
        student3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 20.0d + "'", double14 == 20.0d);
    }

    @Test
    public void test18598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18598");
        model.Student student3 = new model.Student("hi!", "hi!", "");
        java.lang.String str4 = student3.getEmail();
        double double5 = student3.getHourlyRate();
        java.lang.String str6 = student3.getEmail();
        java.lang.String str7 = student3.getAccountType();
        java.lang.String str8 = student3.getPassword();
        student3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test18599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18599");
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
        java.lang.String str16 = student3.getEmail();
        student3.login("student", "");
        java.lang.String str20 = student3.getID();
        student3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 20.0d + "'", double14 == 20.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "student" + "'", str15, "student");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test18600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18600");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        student3.setVerified(false);
        student3.viewProfile();
        java.lang.String str11 = student3.getEmail();
        student3.login("student", "hi!");
        double double15 = student3.getHourlyRate();
        java.lang.String str16 = student3.getID();
        student3.login("hi!", "");
        java.lang.Class<?> wildcardClass20 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 20.0d + "'", double15 == 20.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test18601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18601");
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
        student3.login("student", "student");
        student3.login("student", "");
        java.lang.String str19 = student3.getID();
        java.lang.String str20 = student3.getEmail();
        student3.viewProfile();
        student3.setVerified(true);
        java.lang.Class<?> wildcardClass24 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test18602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18602");
        model.Student student3 = new model.Student("hi!", "hi!", "");
        student3.logout();
        java.lang.String str5 = student3.getEmail();
        double double6 = student3.getHourlyRate();
        student3.setVerified(false);
        student3.login("", "");
        java.lang.String str12 = student3.getAccountType();
        student3.logout();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "student" + "'", str12, "student");
    }

    @Test
    public void test18603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18603");
        model.Student student3 = new model.Student("hi!", "hi!", "");
        student3.logout();
        java.lang.String str5 = student3.getEmail();
        double double6 = student3.getHourlyRate();
        student3.setVerified(false);
        student3.login("", "");
        student3.login("hi!", "");
        java.lang.String str15 = student3.getID();
        java.lang.String str16 = student3.getID();
        java.lang.Class<?> wildcardClass17 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test18604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18604");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        java.lang.String str8 = student3.getAccountType();
        java.lang.String str9 = student3.getAccountType();
        java.lang.String str10 = student3.getID();
        student3.setVerified(true);
        java.lang.String str13 = student3.getAccountType();
        java.lang.String str14 = student3.getAccountType();
        student3.login("hi!", "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "student" + "'", str9, "student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "student" + "'", str13, "student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "student" + "'", str14, "student");
    }

    @Test
    public void test18605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18605");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        student3.setVerified(false);
        java.lang.String str10 = student3.getAccountType();
        java.lang.String str11 = student3.getEmail();
        boolean boolean12 = student3.isVerified();
        java.lang.String str13 = student3.getPassword();
        java.lang.String str14 = student3.getPassword();
        student3.viewProfile();
        java.lang.String str16 = student3.getID();
        student3.login("", "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "student" + "'", str10, "student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test18606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18606");
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
        student3.logout();
        double double15 = student3.getHourlyRate();
        student3.setVerified(true);
        java.lang.String str18 = student3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "student" + "'", str10, "student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 20.0d + "'", double15 == 20.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test18607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18607");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        student3.logout();
        student3.login("hi!", "hi!");
        double double8 = student3.getHourlyRate();
        java.lang.String str9 = student3.getID();
        student3.logout();
        java.lang.String str11 = student3.getID();
        java.lang.String str12 = student3.getEmail();
        student3.viewProfile();
        student3.viewProfile();
        student3.setVerified(false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test18608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18608");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        double double6 = student3.getHourlyRate();
        java.lang.String str7 = student3.getPassword();
        java.lang.String str8 = student3.getPassword();
        java.lang.String str9 = student3.getPassword();
        double double10 = student3.getHourlyRate();
        java.lang.String str11 = student3.getID();
        java.lang.String str12 = student3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test18609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18609");
        model.Student student3 = new model.Student("hi!", "hi!", "");
        student3.viewProfile();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.viewProfile();
        double double8 = student3.getHourlyRate();
        student3.setVerified(false);
        java.lang.String str11 = student3.getEmail();
        java.lang.Class<?> wildcardClass12 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test18610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18610");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        student3.setVerified(false);
        java.lang.String str6 = student3.getEmail();
        java.lang.String str7 = student3.getAccountType();
        student3.viewProfile();
        student3.viewProfile();
        student3.setVerified(true);
        student3.login("", "");
        java.lang.String str15 = student3.getID();
        student3.login("hi!", "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test18611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18611");
        model.Student student3 = new model.Student("", "", "hi!");
        student3.logout();
        java.lang.String str5 = student3.getID();
        student3.setVerified(true);
        student3.viewProfile();
        boolean boolean9 = student3.isVerified();
        student3.viewProfile();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test18612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18612");
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
        student3.login("hi!", "hi!");
        student3.login("student", "student");
        java.lang.Class<?> wildcardClass24 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test18613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18613");
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
        java.lang.String str15 = student3.getID();
        student3.setVerified(false);
        student3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test18614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18614");
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
        java.lang.String str15 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "student" + "'", str15, "student");
    }

    @Test
    public void test18615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18615");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        student3.setVerified(false);
        student3.viewProfile();
        java.lang.String str7 = student3.getEmail();
        java.lang.String str8 = student3.getAccountType();
        student3.logout();
        student3.login("", "");
        java.lang.String str13 = student3.getID();
        student3.setVerified(false);
        java.lang.String str16 = student3.getEmail();
        java.lang.String str17 = student3.getEmail();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test18616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18616");
        model.Student student3 = new model.Student("hi!", "hi!", "");
        student3.logout();
        java.lang.String str5 = student3.getEmail();
        boolean boolean6 = student3.isVerified();
        student3.login("", "student");
        boolean boolean10 = student3.isVerified();
        student3.login("", "hi!");
        boolean boolean14 = student3.isVerified();
        student3.login("student", "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test18617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18617");
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
        java.lang.String str17 = student3.getEmail();
        boolean boolean18 = student3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "student" + "'", str4, "student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test18618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18618");
        model.Student student3 = new model.Student("", "", "hi!");
        student3.logout();
        student3.setVerified(false);
        java.lang.String str7 = student3.getAccountType();
        java.lang.String str8 = student3.getEmail();
        student3.login("hi!", "student");
        boolean boolean12 = student3.isVerified();
        java.lang.String str13 = student3.getAccountType();
        student3.logout();
        java.lang.String str15 = student3.getAccountType();
        java.lang.String str16 = student3.getEmail();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "student" + "'", str13, "student");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "student" + "'", str15, "student");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test18619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18619");
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
        java.lang.String str15 = student3.getPassword();
        student3.viewProfile();
        student3.viewProfile();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test18620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18620");
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
        boolean boolean15 = student3.isVerified();
        java.lang.String str16 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "student" + "'", str13, "student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "student" + "'", str14, "student");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "student" + "'", str16, "student");
    }

    @Test
    public void test18621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18621");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        java.lang.String str4 = student3.getAccountType();
        java.lang.String str5 = student3.getEmail();
        student3.viewProfile();
        student3.logout();
        student3.viewProfile();
        student3.login("", "");
        student3.login("", "hi!");
        student3.login("", "student");
        java.lang.String str18 = student3.getPassword();
        java.lang.String str19 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "student" + "'", str4, "student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "student" + "'", str19, "student");
    }

    @Test
    public void test18622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18622");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        student3.setVerified(false);
        java.lang.String str10 = student3.getID();
        double double11 = student3.getHourlyRate();
        student3.viewProfile();
        student3.login("student", "student");
        java.lang.String str16 = student3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test18623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18623");
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
        java.lang.String str16 = student3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test18624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18624");
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
        boolean boolean17 = student3.isVerified();
        student3.logout();
        java.lang.String str19 = student3.getID();
        java.lang.Class<?> wildcardClass20 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 20.0d + "'", double13 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test18625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18625");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        student3.logout();
        student3.login("hi!", "hi!");
        double double8 = student3.getHourlyRate();
        java.lang.String str9 = student3.getID();
        java.lang.String str10 = student3.getAccountType();
        student3.setVerified(true);
        student3.logout();
        student3.setVerified(false);
        student3.viewProfile();
        student3.setVerified(false);
        java.lang.String str19 = student3.getEmail();
        java.lang.Class<?> wildcardClass20 = student3.getClass();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "student" + "'", str10, "student");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test18626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18626");
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
        java.lang.String str20 = student3.getPassword();
        java.lang.String str21 = student3.getAccountType();
        student3.logout();
        boolean boolean23 = student3.isVerified();
        java.lang.String str24 = student3.getPassword();
        double double25 = student3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "student" + "'", str21, "student");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 20.0d + "'", double25 == 20.0d);
    }

    @Test
    public void test18627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18627");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        student3.setVerified(false);
        java.lang.String str9 = student3.getID();
        student3.setVerified(false);
        boolean boolean12 = student3.isVerified();
        java.lang.String str13 = student3.getEmail();
        java.lang.String str14 = student3.getID();
        student3.login("", "");
        java.lang.String str18 = student3.getEmail();
        student3.viewProfile();
        student3.login("student", "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test18628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18628");
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
        java.lang.String str15 = student3.getPassword();
        java.lang.String str16 = student3.getEmail();
        student3.setVerified(false);
        student3.login("hi!", "");
        student3.login("student", "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "student" + "'", str11, "student");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test18629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18629");
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
        double double15 = student3.getHourlyRate();
        java.lang.String str16 = student3.getAccountType();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "student" + "'", str10, "student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "student" + "'", str11, "student");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 20.0d + "'", double12 == 20.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 20.0d + "'", double13 == 20.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 20.0d + "'", double15 == 20.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "student" + "'", str16, "student");
    }

    @Test
    public void test18630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18630");
        model.Student student3 = new model.Student("", "", "hi!");
        student3.logout();
        java.lang.String str5 = student3.getID();
        java.lang.String str6 = student3.getEmail();
        student3.viewProfile();
        student3.setVerified(false);
        student3.logout();
        java.lang.String str11 = student3.getEmail();
        student3.login("hi!", "hi!");
        java.lang.String str15 = student3.getAccountType();
        java.lang.String str16 = student3.getEmail();
        student3.viewProfile();
        java.lang.String str18 = student3.getEmail();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "student" + "'", str15, "student");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test18631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18631");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        java.lang.String str6 = student3.getPassword();
        student3.setVerified(false);
        student3.setVerified(false);
        student3.viewProfile();
        student3.login("student", "");
        java.lang.String str15 = student3.getAccountType();
        java.lang.String str16 = student3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "student" + "'", str15, "student");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test18632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18632");
        model.Student student3 = new model.Student("", "", "hi!");
        student3.login("", "");
        double double7 = student3.getHourlyRate();
        student3.setVerified(false);
        student3.logout();
        student3.viewProfile();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
    }

    @Test
    public void test18633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18633");
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
        java.lang.String str19 = student3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test18634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18634");
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
        java.lang.String str18 = student3.getID();
        student3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "student" + "'", str11, "student");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 20.0d + "'", double12 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test18635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18635");
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
        java.lang.String str14 = student3.getAccountType();
        java.lang.String str15 = student3.getID();
        java.lang.String str16 = student3.getPassword();
        java.lang.String str17 = student3.getPassword();
        java.lang.String str18 = student3.getAccountType();
        java.lang.String str19 = student3.getEmail();
        student3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "student" + "'", str13, "student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "student" + "'", str14, "student");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "student" + "'", str18, "student");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test18636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18636");
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
        java.lang.String str16 = student3.getPassword();
        boolean boolean17 = student3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 20.0d + "'", double14 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test18637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18637");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        student3.setVerified(false);
        student3.viewProfile();
        java.lang.String str7 = student3.getEmail();
        java.lang.String str8 = student3.getAccountType();
        student3.logout();
        student3.login("", "");
        student3.viewProfile();
        java.lang.String str14 = student3.getAccountType();
        java.lang.String str15 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "student" + "'", str14, "student");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "student" + "'", str15, "student");
    }

    @Test
    public void test18638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18638");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        student3.logout();
        student3.login("hi!", "hi!");
        student3.viewProfile();
        student3.login("", "student");
        student3.login("", "student");
        java.lang.String str15 = student3.getEmail();
        java.lang.String str16 = student3.getEmail();
        java.lang.String str17 = student3.getID();
        java.lang.String str18 = student3.getPassword();
        boolean boolean19 = student3.isVerified();
        java.lang.String str20 = student3.getID();
        java.lang.String str21 = student3.getEmail();
        student3.setVerified(true);
        java.lang.String str24 = student3.getEmail();
        java.lang.String str25 = student3.getEmail();
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
    }

    @Test
    public void test18639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18639");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        double double6 = student3.getHourlyRate();
        student3.logout();
        student3.setVerified(true);
        java.lang.String str10 = student3.getEmail();
        java.lang.String str11 = student3.getEmail();
        java.lang.String str12 = student3.getEmail();
        student3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test18640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18640");
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
        java.lang.String str17 = student3.getEmail();
        java.lang.String str18 = student3.getID();
        student3.login("hi!", "student");
        student3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "student" + "'", str10, "student");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "student" + "'", str16, "student");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test18641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18641");
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
        java.lang.String str16 = student3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "student" + "'", str13, "student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "student" + "'", str14, "student");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "student" + "'", str15, "student");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test18642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18642");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        java.lang.String str6 = student3.getPassword();
        java.lang.String str7 = student3.getPassword();
        student3.login("hi!", "hi!");
        java.lang.String str11 = student3.getPassword();
        student3.setVerified(false);
        java.lang.String str14 = student3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test18643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18643");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        double double6 = student3.getHourlyRate();
        java.lang.String str7 = student3.getEmail();
        student3.viewProfile();
        boolean boolean9 = student3.isVerified();
        java.lang.String str10 = student3.getEmail();
        boolean boolean11 = student3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test18644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18644");
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
        java.lang.String str13 = student3.getPassword();
        double double14 = student3.getHourlyRate();
        java.lang.String str15 = student3.getID();
        student3.login("hi!", "hi!");
        student3.logout();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "student" + "'", str12, "student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 20.0d + "'", double14 == 20.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test18645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18645");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        student3.logout();
        student3.login("hi!", "hi!");
        double double8 = student3.getHourlyRate();
        java.lang.String str9 = student3.getID();
        java.lang.String str10 = student3.getEmail();
        student3.setVerified(true);
        java.lang.String str13 = student3.getEmail();
        student3.logout();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test18646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18646");
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
        java.lang.String str21 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "student" + "'", str21, "student");
    }

    @Test
    public void test18647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18647");
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
        java.lang.String str15 = student3.getPassword();
        java.lang.String str16 = student3.getEmail();
        student3.viewProfile();
        java.lang.String str18 = student3.getAccountType();
        double double19 = student3.getHourlyRate();
        student3.login("", "student");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "student" + "'", str11, "student");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "student" + "'", str18, "student");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 20.0d + "'", double19 == 20.0d);
    }

    @Test
    public void test18648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18648");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        student3.setVerified(false);
        student3.viewProfile();
        java.lang.String str11 = student3.getEmail();
        student3.login("student", "hi!");
        java.lang.String str15 = student3.getPassword();
        student3.logout();
        java.lang.String str17 = student3.getEmail();
        java.lang.String str18 = student3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test18649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18649");
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
        student3.login("hi!", "student");
        student3.viewProfile();
        java.lang.String str22 = student3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 20.0d + "'", double13 == 20.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test18650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18650");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        java.lang.String str4 = student3.getAccountType();
        java.lang.String str5 = student3.getID();
        student3.setVerified(true);
        java.lang.String str8 = student3.getAccountType();
        java.lang.String str9 = student3.getAccountType();
        java.lang.String str10 = student3.getPassword();
        student3.logout();
        java.lang.String str12 = student3.getPassword();
        student3.login("student", "hi!");
        double double16 = student3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "student" + "'", str4, "student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "student" + "'", str9, "student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 20.0d + "'", double16 == 20.0d);
    }

    @Test
    public void test18651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18651");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        student3.logout();
        student3.login("hi!", "hi!");
        student3.viewProfile();
        java.lang.String str9 = student3.getPassword();
        java.lang.String str10 = student3.getID();
        student3.logout();
        student3.login("hi!", "");
        java.lang.String str15 = student3.getPassword();
        java.lang.String str16 = student3.getPassword();
        java.lang.String str17 = student3.getPassword();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test18652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18652");
        model.Student student3 = new model.Student("hi!", "hi!", "hi!");
        double double4 = student3.getHourlyRate();
        java.lang.Class<?> wildcardClass5 = student3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test18653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18653");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        student3.setVerified(false);
        java.lang.String str6 = student3.getEmail();
        java.lang.String str7 = student3.getAccountType();
        java.lang.String str8 = student3.getEmail();
        student3.viewProfile();
        java.lang.String str10 = student3.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test18654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18654");
        model.Student student3 = new model.Student("", "", "hi!");
        student3.logout();
        java.lang.String str5 = student3.getID();
        java.lang.String str6 = student3.getEmail();
        java.lang.String str7 = student3.getEmail();
        java.lang.String str8 = student3.getEmail();
        java.lang.String str9 = student3.getID();
        java.lang.String str10 = student3.getPassword();
        java.lang.String str11 = student3.getPassword();
        java.lang.String str12 = student3.getID();
        student3.setVerified(false);
        java.lang.String str15 = student3.getEmail();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test18655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18655");
        model.Student student3 = new model.Student("hi!", "hi!", "");
        student3.viewProfile();
        java.lang.String str5 = student3.getAccountType();
        java.lang.String str6 = student3.getEmail();
        java.lang.String str7 = student3.getEmail();
        student3.login("", "");
        boolean boolean11 = student3.isVerified();
        java.lang.Class<?> wildcardClass12 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test18656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18656");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        student3.setVerified(false);
        java.lang.String str6 = student3.getPassword();
        java.lang.String str7 = student3.getAccountType();
        java.lang.String str8 = student3.getEmail();
        student3.setVerified(true);
        boolean boolean11 = student3.isVerified();
        student3.login("hi!", "student");
        double double15 = student3.getHourlyRate();
        student3.logout();
        java.lang.String str17 = student3.getAccountType();
        boolean boolean18 = student3.isVerified();
        java.lang.String str19 = student3.getPassword();
        java.lang.String str20 = student3.getAccountType();
        java.lang.String str21 = student3.getPassword();
        java.lang.Class<?> wildcardClass22 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 20.0d + "'", double15 == 20.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "student" + "'", str17, "student");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "student" + "'", str20, "student");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test18657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18657");
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
        student3.logout();
        double double17 = student3.getHourlyRate();
        student3.login("", "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "student" + "'", str13, "student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "student" + "'", str14, "student");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 20.0d + "'", double17 == 20.0d);
    }

    @Test
    public void test18658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18658");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        student3.setVerified(false);
        java.lang.String str10 = student3.getID();
        double double11 = student3.getHourlyRate();
        student3.viewProfile();
        java.lang.Class<?> wildcardClass13 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test18659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18659");
        model.Student student3 = new model.Student("", "", "hi!");
        student3.logout();
        java.lang.String str5 = student3.getID();
        java.lang.String str6 = student3.getEmail();
        double double7 = student3.getHourlyRate();
        boolean boolean8 = student3.isVerified();
        boolean boolean9 = student3.isVerified();
        student3.login("", "student");
        student3.setVerified(true);
        student3.login("student", "hi!");
        student3.logout();
        java.lang.String str19 = student3.getPassword();
        student3.setVerified(false);
        java.lang.String str22 = student3.getPassword();
        java.lang.String str23 = student3.getID();
        student3.logout();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
    }

    @Test
    public void test18660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18660");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        double double6 = student3.getHourlyRate();
        java.lang.String str7 = student3.getPassword();
        student3.login("", "student");
        java.lang.String str11 = student3.getAccountType();
        java.lang.String str12 = student3.getAccountType();
        student3.logout();
        java.lang.String str14 = student3.getAccountType();
        student3.login("hi!", "");
        student3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "student" + "'", str11, "student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "student" + "'", str12, "student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "student" + "'", str14, "student");
    }

    @Test
    public void test18661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18661");
        model.Student student3 = new model.Student("", "student", "");
        student3.login("", "student");
        boolean boolean7 = student3.isVerified();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test18662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18662");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        java.lang.String str7 = student3.getID();
        student3.setVerified(true);
        java.lang.String str10 = student3.getEmail();
        student3.setVerified(true);
        student3.login("", "");
        java.lang.String str16 = student3.getID();
        student3.logout();
        java.lang.String str18 = student3.getPassword();
        student3.login("", "student");
        student3.setVerified(false);
        double double24 = student3.getHourlyRate();
        boolean boolean25 = student3.isVerified();
        java.lang.String str26 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 20.0d + "'", double24 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "student" + "'", str26, "student");
    }

    @Test
    public void test18663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18663");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        java.lang.String str6 = student3.getPassword();
        java.lang.String str7 = student3.getPassword();
        java.lang.String str8 = student3.getAccountType();
        java.lang.String str9 = student3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test18664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18664");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        student3.setVerified(false);
        java.lang.String str10 = student3.getEmail();
        student3.logout();
        boolean boolean12 = student3.isVerified();
        student3.login("", "");
        student3.setVerified(false);
        boolean boolean18 = student3.isVerified();
        student3.login("hi!", "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test18665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18665");
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
        student3.logout();
        boolean boolean16 = student3.isVerified();
        java.lang.String str17 = student3.getID();
        java.lang.String str18 = student3.getEmail();
        boolean boolean19 = student3.isVerified();
        java.lang.String str20 = student3.getID();
        java.lang.String str21 = student3.getID();
        student3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test18666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18666");
        model.Student student3 = new model.Student("", "", "hi!");
        student3.viewProfile();
        student3.setVerified(false);
        student3.login("", "");
    }

    @Test
    public void test18667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18667");
        model.Student student3 = new model.Student("hi!", "hi!", "");
        student3.logout();
        java.lang.String str5 = student3.getEmail();
        boolean boolean6 = student3.isVerified();
        student3.login("", "student");
        boolean boolean10 = student3.isVerified();
        java.lang.String str11 = student3.getEmail();
        double double12 = student3.getHourlyRate();
        student3.setVerified(true);
        boolean boolean15 = student3.isVerified();
        java.lang.String str16 = student3.getEmail();
        student3.login("", "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 20.0d + "'", double12 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test18668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18668");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        java.lang.String str7 = student3.getID();
        student3.setVerified(true);
        student3.setVerified(false);
        double double12 = student3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 20.0d + "'", double12 == 20.0d);
    }

    @Test
    public void test18669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18669");
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
        java.lang.String str14 = student3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 20.0d + "'", double12 == 20.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 20.0d + "'", double13 == 20.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test18670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18670");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getAccountType();
        student3.logout();
        student3.setVerified(true);
        student3.setVerified(true);
        student3.logout();
        boolean boolean13 = student3.isVerified();
        student3.logout();
        student3.viewProfile();
        student3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test18671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18671");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        java.lang.String str6 = student3.getPassword();
        java.lang.String str7 = student3.getPassword();
        java.lang.String str8 = student3.getID();
        java.lang.String str9 = student3.getID();
        double double10 = student3.getHourlyRate();
        java.lang.String str11 = student3.getID();
        student3.login("", "student");
        double double15 = student3.getHourlyRate();
        java.lang.String str16 = student3.getID();
        double double17 = student3.getHourlyRate();
        java.lang.String str18 = student3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 20.0d + "'", double15 == 20.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 20.0d + "'", double17 == 20.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test18672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18672");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        double double6 = student3.getHourlyRate();
        student3.logout();
        student3.viewProfile();
        java.lang.String str9 = student3.getEmail();
        java.lang.String str10 = student3.getEmail();
        student3.logout();
        student3.login("student", "hi!");
        double double15 = student3.getHourlyRate();
        java.lang.String str16 = student3.getPassword();
        boolean boolean17 = student3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 20.0d + "'", double15 == 20.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test18673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18673");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        java.lang.String str4 = student3.getAccountType();
        java.lang.String str5 = student3.getEmail();
        student3.viewProfile();
        student3.setVerified(true);
        java.lang.String str9 = student3.getPassword();
        student3.setVerified(false);
        java.lang.String str12 = student3.getAccountType();
        java.lang.String str13 = student3.getEmail();
        double double14 = student3.getHourlyRate();
        student3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "student" + "'", str4, "student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "student" + "'", str12, "student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 20.0d + "'", double14 == 20.0d);
    }

    @Test
    public void test18674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18674");
        model.Student student3 = new model.Student("hi!", "student", "student");
        java.lang.String str4 = student3.getID();
        student3.setVerified(true);
        boolean boolean7 = student3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "student" + "'", str4, "student");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test18675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18675");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        java.lang.String str8 = student3.getEmail();
        student3.viewProfile();
        student3.logout();
        java.lang.String str11 = student3.getID();
        java.lang.String str12 = student3.getAccountType();
        student3.setVerified(false);
        double double15 = student3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "student" + "'", str12, "student");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 20.0d + "'", double15 == 20.0d);
    }

    @Test
    public void test18676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18676");
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
        java.lang.String str18 = student3.getAccountType();
        java.lang.String str19 = student3.getID();
        double double20 = student3.getHourlyRate();
        boolean boolean21 = student3.isVerified();
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 20.0d + "'", double17 == 20.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "student" + "'", str18, "student");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 20.0d + "'", double20 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test18677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18677");
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
        boolean boolean22 = student3.isVerified();
        boolean boolean23 = student3.isVerified();
        java.lang.String str24 = student3.getPassword();
        student3.logout();
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test18678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18678");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        double double6 = student3.getHourlyRate();
        student3.logout();
        student3.viewProfile();
        java.lang.String str9 = student3.getEmail();
        java.lang.String str10 = student3.getEmail();
        double double11 = student3.getHourlyRate();
        student3.logout();
        student3.viewProfile();
        student3.setVerified(false);
        java.lang.String str16 = student3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test18679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18679");
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
        java.lang.String str18 = student3.getEmail();
        student3.viewProfile();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "student" + "'", str14, "student");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test18680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18680");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        java.lang.String str8 = student3.getPassword();
        java.lang.String str9 = student3.getID();
        double double10 = student3.getHourlyRate();
        java.lang.String str11 = student3.getID();
        java.lang.String str12 = student3.getAccountType();
        double double13 = student3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "student" + "'", str12, "student");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 20.0d + "'", double13 == 20.0d);
    }

    @Test
    public void test18681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18681");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        student3.setVerified(false);
        student3.viewProfile();
        java.lang.String str7 = student3.getEmail();
        student3.login("hi!", "hi!");
        java.lang.String str11 = student3.getEmail();
        java.lang.String str12 = student3.getID();
        java.lang.String str13 = student3.getID();
        double double14 = student3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 20.0d + "'", double14 == 20.0d);
    }

    @Test
    public void test18682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18682");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        java.lang.String str4 = student3.getAccountType();
        java.lang.String str5 = student3.getID();
        student3.viewProfile();
        student3.setVerified(true);
        double double9 = student3.getHourlyRate();
        java.lang.String str10 = student3.getPassword();
        student3.viewProfile();
        java.lang.String str12 = student3.getAccountType();
        student3.login("", "student");
        student3.viewProfile();
        java.lang.String str17 = student3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "student" + "'", str4, "student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "student" + "'", str12, "student");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test18683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18683");
        model.Student student3 = new model.Student("", "", "hi!");
        student3.logout();
        java.lang.String str5 = student3.getID();
        java.lang.String str6 = student3.getEmail();
        java.lang.String str7 = student3.getEmail();
        java.lang.String str8 = student3.getEmail();
        boolean boolean9 = student3.isVerified();
        student3.setVerified(true);
        java.lang.String str12 = student3.getEmail();
        boolean boolean13 = student3.isVerified();
        java.lang.String str14 = student3.getPassword();
        java.lang.Class<?> wildcardClass15 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test18684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18684");
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
        student3.setVerified(true);
        student3.login("", "hi!");
        boolean boolean19 = student3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test18685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18685");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        java.lang.String str6 = student3.getPassword();
        java.lang.String str7 = student3.getPassword();
        student3.logout();
        java.lang.String str9 = student3.getEmail();
        java.lang.String str10 = student3.getPassword();
        double double11 = student3.getHourlyRate();
        java.lang.Class<?> wildcardClass12 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test18686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18686");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        student3.setVerified(false);
        java.lang.String str9 = student3.getID();
        student3.setVerified(false);
        student3.logout();
        java.lang.String str13 = student3.getAccountType();
        java.lang.String str14 = student3.getEmail();
        student3.login("", "student");
        double double18 = student3.getHourlyRate();
        student3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "student" + "'", str13, "student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 20.0d + "'", double18 == 20.0d);
    }

    @Test
    public void test18687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18687");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        student3.setVerified(true);
        student3.login("hi!", "");
        student3.viewProfile();
        student3.viewProfile();
        student3.login("hi!", "");
        student3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test18688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18688");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        java.lang.String str7 = student3.getID();
        student3.setVerified(true);
        java.lang.String str10 = student3.getEmail();
        student3.setVerified(true);
        student3.login("student", "hi!");
        student3.setVerified(false);
        student3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test18689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18689");
        model.Student student3 = new model.Student("hi!", "hi!", "student");
        student3.login("hi!", "student");
        java.lang.String str7 = student3.getEmail();
        student3.login("student", "student");
        boolean boolean11 = student3.isVerified();
        student3.setVerified(false);
        java.lang.String str14 = student3.getEmail();
        boolean boolean15 = student3.isVerified();
        java.lang.String str16 = student3.getPassword();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test18690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18690");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        java.lang.String str4 = student3.getAccountType();
        java.lang.String str5 = student3.getEmail();
        student3.viewProfile();
        student3.setVerified(true);
        java.lang.String str9 = student3.getPassword();
        student3.setVerified(false);
        java.lang.String str12 = student3.getAccountType();
        java.lang.String str13 = student3.getEmail();
        boolean boolean14 = student3.isVerified();
        student3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "student" + "'", str4, "student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "student" + "'", str12, "student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test18691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18691");
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
        java.lang.String str16 = student3.getPassword();
        java.lang.String str17 = student3.getPassword();
        java.lang.Class<?> wildcardClass18 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "student" + "'", str9, "student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test18692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18692");
        model.Student student3 = new model.Student("", "student", "student");
        double double4 = student3.getHourlyRate();
        java.lang.String str5 = student3.getAccountType();
        java.lang.String str6 = student3.getAccountType();
        student3.login("student", "");
        student3.login("student", "");
        student3.logout();
        java.lang.String str14 = student3.getPassword();
        boolean boolean15 = student3.isVerified();
        java.lang.String str16 = student3.getEmail();
        student3.login("", "student");
        double double20 = student3.getHourlyRate();
        student3.login("hi!", "");
        boolean boolean24 = student3.isVerified();
        student3.login("hi!", "");
        student3.logout();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "student" + "'", str14, "student");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 20.0d + "'", double20 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test18693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18693");
        model.Student student3 = new model.Student("hi!", "hi!", "hi!");
        student3.login("hi!", "student");
        student3.logout();
        java.lang.String str8 = student3.getPassword();
        student3.logout();
        java.lang.String str10 = student3.getPassword();
        double double11 = student3.getHourlyRate();
        java.lang.String str12 = student3.getEmail();
        student3.viewProfile();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test18694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18694");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        java.lang.String str4 = student3.getAccountType();
        java.lang.String str5 = student3.getEmail();
        student3.viewProfile();
        double double7 = student3.getHourlyRate();
        student3.viewProfile();
        boolean boolean9 = student3.isVerified();
        student3.logout();
        student3.login("", "hi!");
        boolean boolean14 = student3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "student" + "'", str4, "student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test18695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18695");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getID();
        java.lang.String str6 = student3.getPassword();
        java.lang.String str7 = student3.getEmail();
        java.lang.String str8 = student3.getEmail();
        student3.viewProfile();
        double double10 = student3.getHourlyRate();
        java.lang.String str11 = student3.getAccountType();
        boolean boolean12 = student3.isVerified();
        student3.viewProfile();
        java.lang.String str14 = student3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "student" + "'", str11, "student");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test18696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18696");
        model.Student student3 = new model.Student("", "", "hi!");
        student3.login("", "");
        student3.viewProfile();
        student3.viewProfile();
        student3.login("", "");
        student3.viewProfile();
        java.lang.String str13 = student3.getAccountType();
        java.lang.String str14 = student3.getEmail();
        student3.login("", "hi!");
        java.lang.String str18 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "student" + "'", str13, "student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "student" + "'", str18, "student");
    }

    @Test
    public void test18697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18697");
        model.Student student3 = new model.Student("hi!", "student", "");
        student3.logout();
        student3.logout();
        java.lang.String str6 = student3.getEmail();
        java.lang.String str7 = student3.getPassword();
        java.lang.String str8 = student3.getAccountType();
        student3.setVerified(true);
        boolean boolean11 = student3.isVerified();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test18698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18698");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getAccountType();
        student3.logout();
        boolean boolean8 = student3.isVerified();
        student3.setVerified(true);
        student3.setVerified(false);
        java.lang.String str13 = student3.getEmail();
        student3.logout();
        student3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test18699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18699");
        model.Student student3 = new model.Student("", "", "hi!");
        student3.logout();
        java.lang.String str5 = student3.getID();
        java.lang.String str6 = student3.getPassword();
        java.lang.String str7 = student3.getAccountType();
        student3.setVerified(false);
        java.lang.String str10 = student3.getAccountType();
        student3.setVerified(false);
        student3.login("student", "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "student" + "'", str10, "student");
    }

    @Test
    public void test18700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18700");
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
        student3.logout();
        java.lang.String str16 = student3.getAccountType();
        java.lang.String str17 = student3.getAccountType();
        java.lang.String str18 = student3.getAccountType();
        student3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 20.0d + "'", double14 == 20.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "student" + "'", str16, "student");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "student" + "'", str17, "student");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "student" + "'", str18, "student");
    }

    @Test
    public void test18701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18701");
        model.Student student3 = new model.Student("", "student", "student");
        double double4 = student3.getHourlyRate();
        java.lang.String str5 = student3.getAccountType();
        java.lang.String str6 = student3.getAccountType();
        student3.login("student", "");
        student3.login("student", "");
        student3.logout();
        java.lang.String str14 = student3.getEmail();
        student3.login("student", "");
        student3.setVerified(true);
        java.lang.String str20 = student3.getAccountType();
        java.lang.String str21 = student3.getAccountType();
        java.lang.Class<?> wildcardClass22 = student3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "student" + "'", str20, "student");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "student" + "'", str21, "student");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test18702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18702");
        model.Student student3 = new model.Student("", "student", "student");
        double double4 = student3.getHourlyRate();
        double double5 = student3.getHourlyRate();
        java.lang.String str6 = student3.getID();
        double double7 = student3.getHourlyRate();
        java.lang.String str8 = student3.getID();
        student3.logout();
        java.lang.String str10 = student3.getEmail();
        boolean boolean11 = student3.isVerified();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test18703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18703");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.login("", "");
        java.lang.String str10 = student3.getID();
        java.lang.String str11 = student3.getEmail();
        student3.login("student", "");
        boolean boolean15 = student3.isVerified();
        boolean boolean16 = student3.isVerified();
        double double17 = student3.getHourlyRate();
        student3.logout();
        java.lang.String str19 = student3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 20.0d + "'", double17 == 20.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test18704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18704");
        model.Student student3 = new model.Student("", "student", "student");
        student3.setVerified(true);
        java.lang.String str6 = student3.getPassword();
        boolean boolean7 = student3.isVerified();
        java.lang.String str8 = student3.getEmail();
        student3.login("", "student");
        student3.viewProfile();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test18705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18705");
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
        java.lang.String str16 = student3.getPassword();
        student3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "student" + "'", str9, "student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test18706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18706");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        double double6 = student3.getHourlyRate();
        java.lang.String str7 = student3.getPassword();
        student3.login("", "student");
        boolean boolean11 = student3.isVerified();
        student3.setVerified(true);
        java.lang.String str14 = student3.getID();
        java.lang.String str15 = student3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test18707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18707");
        model.Student student3 = new model.Student("", "", "hi!");
        student3.logout();
        java.lang.String str5 = student3.getID();
        java.lang.String str6 = student3.getEmail();
        double double7 = student3.getHourlyRate();
        java.lang.String str8 = student3.getPassword();
        student3.login("hi!", "hi!");
        student3.logout();
        student3.viewProfile();
        java.lang.String str14 = student3.getID();
        java.lang.String str15 = student3.getPassword();
        student3.setVerified(false);
        java.lang.String str18 = student3.getEmail();
        double double19 = student3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 20.0d + "'", double19 == 20.0d);
    }

    @Test
    public void test18708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18708");
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
        java.lang.String str14 = student3.getEmail();
        double double15 = student3.getHourlyRate();
        student3.login("student", "");
        student3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 20.0d + "'", double15 == 20.0d);
    }

    @Test
    public void test18709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18709");
        model.Student student3 = new model.Student("", "", "hi!");
        student3.logout();
        java.lang.String str5 = student3.getID();
        java.lang.String str6 = student3.getEmail();
        double double7 = student3.getHourlyRate();
        java.lang.String str8 = student3.getPassword();
        student3.login("hi!", "hi!");
        boolean boolean12 = student3.isVerified();
        java.lang.String str13 = student3.getEmail();
        student3.viewProfile();
        boolean boolean15 = student3.isVerified();
        java.lang.String str16 = student3.getAccountType();
        student3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "student" + "'", str16, "student");
    }

    @Test
    public void test18710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18710");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        student3.setVerified(false);
        boolean boolean9 = student3.isVerified();
        double double10 = student3.getHourlyRate();
        java.lang.String str11 = student3.getPassword();
        java.lang.String str12 = student3.getID();
        student3.logout();
        java.lang.String str14 = student3.getID();
        student3.setVerified(true);
        java.lang.String str17 = student3.getAccountType();
        student3.login("", "student");
        student3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "student" + "'", str17, "student");
    }

    @Test
    public void test18711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18711");
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
        student3.logout();
        java.lang.String str24 = student3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "student" + "'", str13, "student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "student" + "'", str14, "student");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "student" + "'", str16, "student");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
    }

    @Test
    public void test18712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18712");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        student3.logout();
        student3.login("hi!", "hi!");
        double double8 = student3.getHourlyRate();
        boolean boolean9 = student3.isVerified();
        java.lang.String str10 = student3.getAccountType();
        java.lang.String str11 = student3.getAccountType();
        double double12 = student3.getHourlyRate();
        student3.logout();
        student3.login("student", "student");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "student" + "'", str10, "student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "student" + "'", str11, "student");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 20.0d + "'", double12 == 20.0d);
    }

    @Test
    public void test18713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18713");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        java.lang.String str4 = student3.getAccountType();
        java.lang.String str5 = student3.getEmail();
        java.lang.String str6 = student3.getAccountType();
        java.lang.String str7 = student3.getAccountType();
        boolean boolean8 = student3.isVerified();
        student3.setVerified(false);
        java.lang.String str11 = student3.getAccountType();
        student3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "student" + "'", str4, "student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "student" + "'", str11, "student");
    }

    @Test
    public void test18714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18714");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        java.lang.String str8 = student3.getAccountType();
        java.lang.String str9 = student3.getAccountType();
        student3.setVerified(true);
        student3.logout();
        java.lang.String str13 = student3.getAccountType();
        student3.viewProfile();
        student3.logout();
        java.lang.String str16 = student3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "student" + "'", str9, "student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "student" + "'", str13, "student");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test18715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18715");
        model.Student student3 = new model.Student("student", "", "student");
        student3.setVerified(false);
        student3.viewProfile();
        java.lang.String str7 = student3.getEmail();
        java.lang.String str8 = student3.getID();
        java.lang.String str9 = student3.getID();
        student3.setVerified(true);
        java.lang.String str12 = student3.getID();
        java.lang.String str13 = student3.getPassword();
        boolean boolean14 = student3.isVerified();
        student3.viewProfile();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "student" + "'", str9, "student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "student" + "'", str12, "student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test18716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18716");
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
        student3.setVerified(false);
        student3.viewProfile();
        java.lang.String str18 = student3.getPassword();
        student3.logout();
        java.lang.String str20 = student3.getEmail();
        student3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "student" + "'", str11, "student");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test18717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18717");
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
        student3.setVerified(false);
        student3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test18718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18718");
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
        java.lang.String str20 = student3.getID();
        student3.setVerified(false);
        java.lang.String str23 = student3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 20.0d + "'", double16 == 20.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 20.0d + "'", double17 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
    }

    @Test
    public void test18719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18719");
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
        java.lang.String str17 = student3.getID();
        java.lang.String str18 = student3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "student" + "'", str16, "student");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test18720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18720");
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
        java.lang.String str15 = student3.getPassword();
        java.lang.String str16 = student3.getPassword();
        boolean boolean17 = student3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test18721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18721");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.viewProfile();
        java.lang.String str8 = student3.getAccountType();
        java.lang.String str9 = student3.getID();
        student3.login("", "hi!");
        double double13 = student3.getHourlyRate();
        double double14 = student3.getHourlyRate();
        java.lang.String str15 = student3.getEmail();
        student3.login("student", "student");
        double double19 = student3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 20.0d + "'", double13 == 20.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 20.0d + "'", double14 == 20.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 20.0d + "'", double19 == 20.0d);
    }

    @Test
    public void test18722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18722");
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
        boolean boolean21 = student3.isVerified();
        boolean boolean22 = student3.isVerified();
        java.lang.Class<?> wildcardClass23 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 20.0d + "'", double19 == 20.0d);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test18723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18723");
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
        java.lang.String str14 = student3.getEmail();
        student3.logout();
        student3.login("", "student");
        boolean boolean19 = student3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test18724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18724");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        student3.logout();
        student3.login("hi!", "hi!");
        double double8 = student3.getHourlyRate();
        boolean boolean9 = student3.isVerified();
        student3.setVerified(false);
        java.lang.String str12 = student3.getPassword();
        boolean boolean13 = student3.isVerified();
        student3.viewProfile();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test18725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18725");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getAccountType();
        student3.logout();
        double double8 = student3.getHourlyRate();
        java.lang.String str9 = student3.getEmail();
        java.lang.String str10 = student3.getAccountType();
        student3.setVerified(true);
        java.lang.String str13 = student3.getPassword();
        java.lang.String str14 = student3.getPassword();
        student3.setVerified(false);
        java.lang.String str17 = student3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "student" + "'", str10, "student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test18726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18726");
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
        student3.logout();
        boolean boolean14 = student3.isVerified();
        student3.viewProfile();
        java.lang.Class<?> wildcardClass16 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test18727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18727");
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
        boolean boolean18 = student3.isVerified();
        student3.setVerified(false);
        java.lang.String str21 = student3.getEmail();
        boolean boolean22 = student3.isVerified();
        student3.login("hi!", "");
        java.lang.String str26 = student3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "student" + "'", str13, "student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test18728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18728");
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
        student3.setVerified(false);
        student3.login("", "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "student" + "'", str15, "student");
    }

    @Test
    public void test18729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18729");
        model.Student student3 = new model.Student("", "", "hi!");
        student3.logout();
        java.lang.String str5 = student3.getID();
        java.lang.String str6 = student3.getEmail();
        student3.setVerified(false);
        java.lang.String str9 = student3.getEmail();
        student3.logout();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test18730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18730");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        student3.logout();
        student3.login("hi!", "hi!");
        double double8 = student3.getHourlyRate();
        java.lang.String str9 = student3.getID();
        java.lang.String str10 = student3.getEmail();
        student3.setVerified(true);
        boolean boolean13 = student3.isVerified();
        java.lang.String str14 = student3.getAccountType();
        boolean boolean15 = student3.isVerified();
        student3.viewProfile();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "student" + "'", str14, "student");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test18731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18731");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        student3.logout();
        student3.login("hi!", "hi!");
        double double8 = student3.getHourlyRate();
        boolean boolean9 = student3.isVerified();
        java.lang.String str10 = student3.getAccountType();
        java.lang.String str11 = student3.getAccountType();
        double double12 = student3.getHourlyRate();
        student3.viewProfile();
        java.lang.String str14 = student3.getEmail();
        student3.viewProfile();
        java.lang.String str16 = student3.getEmail();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "student" + "'", str10, "student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "student" + "'", str11, "student");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 20.0d + "'", double12 == 20.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test18732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18732");
        model.Student student3 = new model.Student("hi!", "hi!", "");
        student3.viewProfile();
        java.lang.String str5 = student3.getAccountType();
        java.lang.String str6 = student3.getPassword();
        student3.setVerified(false);
        java.lang.String str9 = student3.getPassword();
        boolean boolean10 = student3.isVerified();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test18733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18733");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        student3.setVerified(false);
        java.lang.String str6 = student3.getEmail();
        java.lang.String str7 = student3.getAccountType();
        java.lang.String str8 = student3.getID();
        student3.viewProfile();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test18734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18734");
        model.Student student3 = new model.Student("hi!", "student", "");
        student3.logout();
        student3.logout();
        student3.login("", "");
        double double9 = student3.getHourlyRate();
        student3.setVerified(false);
        java.lang.String str12 = student3.getEmail();
        java.lang.String str13 = student3.getPassword();
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "student" + "'", str13, "student");
    }

    @Test
    public void test18735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18735");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        java.lang.String str8 = student3.getPassword();
        java.lang.String str9 = student3.getID();
        student3.logout();
        java.lang.String str11 = student3.getID();
        java.lang.String str12 = student3.getAccountType();
        java.lang.Class<?> wildcardClass13 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "student" + "'", str12, "student");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test18736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18736");
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
        student3.logout();
        java.lang.String str17 = student3.getAccountType();
        student3.viewProfile();
        java.lang.String str19 = student3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "student" + "'", str17, "student");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test18737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18737");
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
        student3.viewProfile();
        student3.viewProfile();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "student" + "'", str12, "student");
    }

    @Test
    public void test18738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18738");
        model.Student student3 = new model.Student("", "", "student");
        student3.login("student", "");
        boolean boolean7 = student3.isVerified();
        student3.logout();
        java.lang.String str9 = student3.getID();
        boolean boolean10 = student3.isVerified();
        double double11 = student3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "student" + "'", str9, "student");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
    }

    @Test
    public void test18739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18739");
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
        student3.viewProfile();
        boolean boolean16 = student3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "student" + "'", str10, "student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test18740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18740");
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
        student3.logout();
        student3.logout();
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
    }

    @Test
    public void test18741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18741");
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
        java.lang.String str17 = student3.getID();
        java.lang.String str18 = student3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "student" + "'", str10, "student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 20.0d + "'", double15 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test18742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18742");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        student3.logout();
        student3.viewProfile();
        java.lang.String str7 = student3.getEmail();
        student3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test18743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18743");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.login("", "");
        java.lang.String str10 = student3.getID();
        java.lang.String str11 = student3.getAccountType();
        student3.viewProfile();
        java.lang.String str13 = student3.getID();
        student3.login("", "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "student" + "'", str11, "student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test18744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18744");
        model.Student student3 = new model.Student("student", "", "");
        student3.logout();
        java.lang.String str5 = student3.getPassword();
        student3.viewProfile();
        java.lang.Class<?> wildcardClass7 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test18745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18745");
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
        java.lang.String str13 = student3.getID();
        student3.login("hi!", "hi!");
        boolean boolean17 = student3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test18746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18746");
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
        double double15 = student3.getHourlyRate();
        java.lang.String str16 = student3.getEmail();
        java.lang.String str17 = student3.getEmail();
        java.lang.String str18 = student3.getPassword();
        student3.logout();
        student3.logout();
        java.lang.Class<?> wildcardClass21 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 20.0d + "'", double15 == 20.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test18747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18747");
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
        student3.viewProfile();
        double double17 = student3.getHourlyRate();
        java.lang.String str18 = student3.getEmail();
        java.lang.String str19 = student3.getAccountType();
        java.lang.String str20 = student3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "student" + "'", str10, "student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 20.0d + "'", double17 == 20.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "student" + "'", str19, "student");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test18748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18748");
        model.Student student3 = new model.Student("", "", "hi!");
        student3.logout();
        java.lang.String str5 = student3.getID();
        java.lang.String str6 = student3.getEmail();
        java.lang.String str7 = student3.getEmail();
        java.lang.String str8 = student3.getEmail();
        java.lang.String str9 = student3.getID();
        java.lang.String str10 = student3.getPassword();
        student3.viewProfile();
        java.lang.String str12 = student3.getID();
        double double13 = student3.getHourlyRate();
        java.lang.String str14 = student3.getEmail();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 20.0d + "'", double13 == 20.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test18749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18749");
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
        student3.login("hi!", "");
        boolean boolean24 = student3.isVerified();
        java.lang.String str25 = student3.getPassword();
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
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test18750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18750");
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
        student3.setVerified(true);
        boolean boolean26 = student3.isVerified();
        student3.login("student", "hi!");
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
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "student" + "'", str23, "student");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test18751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18751");
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
        student3.viewProfile();
        java.lang.String str19 = student3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test18752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18752");
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
        java.lang.String str18 = student3.getPassword();
        boolean boolean19 = student3.isVerified();
        student3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "student" + "'", str10, "student");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test18753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18753");
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
        java.lang.String str20 = student3.getID();
        student3.login("hi!", "");
        student3.login("student", "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 20.0d + "'", double13 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test18754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18754");
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
        java.lang.String str18 = student3.getPassword();
        double double19 = student3.getHourlyRate();
        java.lang.String str20 = student3.getEmail();
        java.lang.String str21 = student3.getPassword();
        boolean boolean22 = student3.isVerified();
        student3.login("", "");
        student3.login("hi!", "");
        java.lang.String str29 = student3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "student" + "'", str13, "student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 20.0d + "'", double19 == 20.0d);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
    }

    @Test
    public void test18755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18755");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        java.lang.String str4 = student3.getAccountType();
        java.lang.String str5 = student3.getID();
        student3.setVerified(true);
        boolean boolean8 = student3.isVerified();
        student3.setVerified(false);
        java.lang.String str11 = student3.getAccountType();
        student3.logout();
        java.lang.String str13 = student3.getID();
        double double14 = student3.getHourlyRate();
        java.lang.String str15 = student3.getPassword();
        student3.logout();
        java.lang.String str17 = student3.getPassword();
        boolean boolean18 = student3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "student" + "'", str4, "student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "student" + "'", str11, "student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 20.0d + "'", double14 == 20.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test18756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18756");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getID();
        java.lang.String str6 = student3.getPassword();
        java.lang.String str7 = student3.getEmail();
        student3.login("", "hi!");
        student3.viewProfile();
        student3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test18757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18757");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        double double6 = student3.getHourlyRate();
        student3.logout();
        student3.viewProfile();
        java.lang.String str9 = student3.getEmail();
        java.lang.String str10 = student3.getEmail();
        student3.logout();
        student3.logout();
        double double13 = student3.getHourlyRate();
        java.lang.String str14 = student3.getID();
        student3.viewProfile();
        java.lang.String str16 = student3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 20.0d + "'", double13 == 20.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test18758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18758");
        model.Student student3 = new model.Student("", "", "hi!");
        student3.login("", "");
        student3.viewProfile();
        student3.viewProfile();
        student3.login("", "");
        student3.login("student", "student");
        student3.setVerified(true);
        java.lang.String str17 = student3.getEmail();
        student3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test18759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18759");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        student3.logout();
        student3.login("hi!", "hi!");
        double double8 = student3.getHourlyRate();
        boolean boolean9 = student3.isVerified();
        student3.setVerified(false);
        java.lang.String str12 = student3.getPassword();
        boolean boolean13 = student3.isVerified();
        java.lang.String str14 = student3.getEmail();
        student3.setVerified(false);
        double double17 = student3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 20.0d + "'", double17 == 20.0d);
    }

    @Test
    public void test18760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18760");
        model.Student student3 = new model.Student("hi!", "student", "");
        java.lang.String str4 = student3.getEmail();
        student3.logout();
        java.lang.String str6 = student3.getID();
        java.lang.String str7 = student3.getEmail();
        java.lang.String str8 = student3.getID();
        student3.login("hi!", "hi!");
        boolean boolean12 = student3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test18761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18761");
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
        boolean boolean15 = student3.isVerified();
        student3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test18762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18762");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        student3.setVerified(false);
        student3.viewProfile();
        java.lang.String str7 = student3.getEmail();
        double double8 = student3.getHourlyRate();
        java.lang.String str9 = student3.getID();
        student3.logout();
        student3.setVerified(true);
        student3.viewProfile();
        double double14 = student3.getHourlyRate();
        java.lang.String str15 = student3.getPassword();
        java.lang.String str16 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 20.0d + "'", double14 == 20.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "student" + "'", str16, "student");
    }

    @Test
    public void test18763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18763");
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
        java.lang.String str14 = student3.getAccountType();
        student3.setVerified(false);
        student3.viewProfile();
        student3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "student" + "'", str12, "student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "student" + "'", str14, "student");
    }

    @Test
    public void test18764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18764");
        model.Student student3 = new model.Student("hi!", "hi!", "hi!");
        student3.login("hi!", "student");
        student3.logout();
        java.lang.String str8 = student3.getPassword();
        student3.viewProfile();
        java.lang.String str10 = student3.getAccountType();
        java.lang.String str11 = student3.getAccountType();
        student3.login("", "student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "student" + "'", str10, "student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "student" + "'", str11, "student");
    }

    @Test
    public void test18765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18765");
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
        double double18 = student3.getHourlyRate();
        java.lang.String str19 = student3.getEmail();
        java.lang.Class<?> wildcardClass20 = student3.getClass();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "student" + "'", str10, "student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "student" + "'", str11, "student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 20.0d + "'", double18 == 20.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test18766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18766");
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
        java.lang.String str14 = student3.getPassword();
        java.lang.Class<?> wildcardClass15 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test18767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18767");
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
        java.lang.String str15 = student3.getID();
        java.lang.String str16 = student3.getPassword();
        java.lang.String str17 = student3.getID();
        boolean boolean18 = student3.isVerified();
        student3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test18768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18768");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        student3.logout();
        student3.login("hi!", "hi!");
        double double8 = student3.getHourlyRate();
        java.lang.String str9 = student3.getID();
        java.lang.String str10 = student3.getEmail();
        java.lang.String str11 = student3.getPassword();
        java.lang.String str12 = student3.getAccountType();
        java.lang.String str13 = student3.getPassword();
        java.lang.String str14 = student3.getEmail();
        student3.setVerified(true);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "student" + "'", str12, "student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test18769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18769");
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
        java.lang.String str17 = student3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "student" + "'", str10, "student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test18770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18770");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        java.lang.String str4 = student3.getAccountType();
        java.lang.String str5 = student3.getID();
        student3.setVerified(true);
        student3.login("student", "student");
        java.lang.String str11 = student3.getPassword();
        java.lang.String str12 = student3.getID();
        java.lang.String str13 = student3.getID();
        double double14 = student3.getHourlyRate();
        student3.login("", "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "student" + "'", str4, "student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 20.0d + "'", double14 == 20.0d);
    }

    @Test
    public void test18771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18771");
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
        student3.viewProfile();
        java.lang.String str18 = student3.getEmail();
        java.lang.String str19 = student3.getAccountType();
        double double20 = student3.getHourlyRate();
        boolean boolean21 = student3.isVerified();
        java.lang.String str22 = student3.getPassword();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "student" + "'", str19, "student");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 20.0d + "'", double20 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test18772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18772");
        model.Student student3 = new model.Student("", "hi!", "student");
        boolean boolean4 = student3.isVerified();
        student3.viewProfile();
        double double6 = student3.getHourlyRate();
        java.lang.String str7 = student3.getAccountType();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
    }

    @Test
    public void test18773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18773");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        java.lang.String str4 = student3.getAccountType();
        java.lang.String str5 = student3.getEmail();
        student3.viewProfile();
        double double7 = student3.getHourlyRate();
        student3.viewProfile();
        boolean boolean9 = student3.isVerified();
        student3.viewProfile();
        double double11 = student3.getHourlyRate();
        student3.viewProfile();
        student3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "student" + "'", str4, "student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
    }

    @Test
    public void test18774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18774");
        model.Student student3 = new model.Student("hi!", "student", "");
        student3.logout();
        java.lang.String str5 = student3.getEmail();
        java.lang.String str6 = student3.getEmail();
        double double7 = student3.getHourlyRate();
        student3.logout();
        student3.login("", "hi!");
        student3.setVerified(false);
        student3.setVerified(false);
        java.lang.String str16 = student3.getEmail();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test18775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18775");
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
        student3.viewProfile();
        java.lang.String str17 = student3.getID();
        double double18 = student3.getHourlyRate();
        java.lang.Class<?> wildcardClass19 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "student" + "'", str10, "student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 20.0d + "'", double18 == 20.0d);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test18776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18776");
        model.Student student3 = new model.Student("", "", "hi!");
        student3.logout();
        java.lang.String str5 = student3.getID();
        java.lang.String str6 = student3.getEmail();
        double double7 = student3.getHourlyRate();
        java.lang.String str8 = student3.getPassword();
        student3.login("hi!", "hi!");
        student3.logout();
        double double13 = student3.getHourlyRate();
        student3.login("hi!", "student");
        student3.viewProfile();
        student3.viewProfile();
        java.lang.String str19 = student3.getEmail();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 20.0d + "'", double13 == 20.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test18777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18777");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getAccountType();
        java.lang.String str7 = student3.getAccountType();
        java.lang.String str8 = student3.getEmail();
        student3.logout();
        student3.login("student", "hi!");
        java.lang.String str13 = student3.getID();
        java.lang.String str14 = student3.getEmail();
        java.lang.String str15 = student3.getPassword();
        java.lang.String str16 = student3.getAccountType();
        student3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "student" + "'", str16, "student");
    }

    @Test
    public void test18778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18778");
        model.Student student3 = new model.Student("", "", "hi!");
        student3.logout();
        java.lang.String str5 = student3.getID();
        java.lang.String str6 = student3.getEmail();
        java.lang.String str7 = student3.getPassword();
        java.lang.String str8 = student3.getID();
        student3.logout();
        java.lang.String str10 = student3.getAccountType();
        student3.viewProfile();
        double double12 = student3.getHourlyRate();
        student3.logout();
        student3.login("hi!", "student");
        student3.logout();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "student" + "'", str10, "student");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 20.0d + "'", double12 == 20.0d);
    }

    @Test
    public void test18779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18779");
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
        java.lang.String str22 = student3.getAccountType();
        boolean boolean23 = student3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "student" + "'", str22, "student");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test18780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18780");
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
        double double15 = student3.getHourlyRate();
        java.lang.String str16 = student3.getPassword();
        student3.logout();
        java.lang.String str18 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 20.0d + "'", double15 == 20.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "student" + "'", str18, "student");
    }

    @Test
    public void test18781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18781");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        student3.setVerified(false);
        java.lang.String str6 = student3.getPassword();
        java.lang.String str7 = student3.getAccountType();
        java.lang.String str8 = student3.getEmail();
        student3.setVerified(true);
        boolean boolean11 = student3.isVerified();
        student3.login("hi!", "student");
        double double15 = student3.getHourlyRate();
        student3.logout();
        boolean boolean17 = student3.isVerified();
        student3.setVerified(true);
        student3.viewProfile();
        java.lang.String str21 = student3.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 20.0d + "'", double15 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test18782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18782");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        student3.setVerified(false);
        java.lang.String str6 = student3.getPassword();
        java.lang.String str7 = student3.getAccountType();
        student3.viewProfile();
        student3.logout();
        boolean boolean10 = student3.isVerified();
        student3.setVerified(true);
        java.lang.String str13 = student3.getAccountType();
        student3.logout();
        java.lang.String str15 = student3.getID();
        java.lang.String str16 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "student" + "'", str13, "student");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "student" + "'", str16, "student");
    }

    @Test
    public void test18783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18783");
        model.Student student3 = new model.Student("", "", "hi!");
        student3.logout();
        java.lang.String str5 = student3.getID();
        java.lang.String str6 = student3.getEmail();
        java.lang.String str7 = student3.getID();
        boolean boolean8 = student3.isVerified();
        java.lang.String str9 = student3.getEmail();
        double double10 = student3.getHourlyRate();
        student3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
    }

    @Test
    public void test18784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18784");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        java.lang.String str8 = student3.getAccountType();
        java.lang.String str9 = student3.getAccountType();
        java.lang.String str10 = student3.getPassword();
        double double11 = student3.getHourlyRate();
        double double12 = student3.getHourlyRate();
        student3.viewProfile();
        java.lang.String str14 = student3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "student" + "'", str9, "student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 20.0d + "'", double12 == 20.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test18785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18785");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        java.lang.String str6 = student3.getPassword();
        student3.setVerified(false);
        student3.setVerified(false);
        java.lang.String str11 = student3.getPassword();
        java.lang.String str12 = student3.getEmail();
        java.lang.String str13 = student3.getPassword();
        double double14 = student3.getHourlyRate();
        java.lang.String str15 = student3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 20.0d + "'", double14 == 20.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test18786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18786");
        model.Student student3 = new model.Student("hi!", "student", "student");
        double double4 = student3.getHourlyRate();
        double double5 = student3.getHourlyRate();
        student3.viewProfile();
        java.lang.String str7 = student3.getAccountType();
        java.lang.String str8 = student3.getID();
        student3.setVerified(true);
        student3.setVerified(true);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
    }

    @Test
    public void test18787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18787");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        double double4 = student3.getHourlyRate();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getEmail();
        student3.setVerified(false);
        java.lang.String str9 = student3.getEmail();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test18788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18788");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        java.lang.String str4 = student3.getAccountType();
        java.lang.String str5 = student3.getID();
        student3.setVerified(true);
        boolean boolean8 = student3.isVerified();
        student3.setVerified(false);
        java.lang.String str11 = student3.getAccountType();
        student3.setVerified(false);
        java.lang.String str14 = student3.getID();
        java.lang.String str15 = student3.getID();
        java.lang.String str16 = student3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "student" + "'", str4, "student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "student" + "'", str11, "student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test18789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18789");
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
        double double23 = student3.getHourlyRate();
        java.lang.String str24 = student3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "student" + "'", str11, "student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 20.0d + "'", double16 == 20.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 20.0d + "'", double19 == 20.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 20.0d + "'", double23 == 20.0d);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test18790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18790");
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
        java.lang.String str17 = student3.getEmail();
        student3.setVerified(false);
        student3.viewProfile();
        double double21 = student3.getHourlyRate();
        java.lang.String str22 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "student" + "'", str11, "student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 20.0d + "'", double21 == 20.0d);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "student" + "'", str22, "student");
    }

    @Test
    public void test18791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18791");
        model.Student student3 = new model.Student("hi!", "", "student");
        java.lang.String str4 = student3.getPassword();
        student3.logout();
        java.lang.String str6 = student3.getEmail();
        double double7 = student3.getHourlyRate();
        student3.setVerified(false);
        java.lang.String str10 = student3.getID();
        student3.viewProfile();
        student3.viewProfile();
        java.lang.String str13 = student3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "student" + "'", str10, "student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "student" + "'", str13, "student");
    }

    @Test
    public void test18792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18792");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        student3.login("", "hi!");
        student3.logout();
        java.lang.String str11 = student3.getEmail();
        java.lang.String str12 = student3.getEmail();
        boolean boolean13 = student3.isVerified();
        student3.login("hi!", "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test18793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18793");
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
        java.lang.String str17 = student3.getEmail();
        java.lang.String str18 = student3.getEmail();
        double double19 = student3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 20.0d + "'", double14 == 20.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 20.0d + "'", double19 == 20.0d);
    }

    @Test
    public void test18794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18794");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        double double6 = student3.getHourlyRate();
        java.lang.String str7 = student3.getPassword();
        java.lang.String str8 = student3.getPassword();
        java.lang.String str9 = student3.getAccountType();
        student3.viewProfile();
        java.lang.String str11 = student3.getID();
        java.lang.String str12 = student3.getID();
        student3.setVerified(false);
        java.lang.String str15 = student3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "student" + "'", str9, "student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test18795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18795");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        student3.setVerified(false);
        student3.viewProfile();
        java.lang.String str7 = student3.getEmail();
        java.lang.String str8 = student3.getAccountType();
        student3.logout();
        boolean boolean10 = student3.isVerified();
        student3.login("hi!", "hi!");
        java.lang.String str14 = student3.getPassword();
        java.lang.String str15 = student3.getPassword();
        student3.logout();
        student3.logout();
        student3.login("student", "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test18796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18796");
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
        student3.setVerified(false);
        boolean boolean21 = student3.isVerified();
        student3.logout();
        double double23 = student3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "student" + "'", str12, "student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "student" + "'", str18, "student");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 20.0d + "'", double23 == 20.0d);
    }

    @Test
    public void test18797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18797");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        student3.logout();
        student3.login("hi!", "hi!");
        double double8 = student3.getHourlyRate();
        java.lang.String str9 = student3.getID();
        java.lang.String str10 = student3.getAccountType();
        student3.setVerified(true);
        student3.viewProfile();
        boolean boolean14 = student3.isVerified();
        java.lang.String str15 = student3.getPassword();
        java.lang.String str16 = student3.getAccountType();
        student3.setVerified(false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "student" + "'", str10, "student");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "student" + "'", str16, "student");
    }

    @Test
    public void test18798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18798");
        model.Student student3 = new model.Student("", "student", "");
        student3.setVerified(true);
        student3.login("", "hi!");
        student3.viewProfile();
        java.lang.String str10 = student3.getID();
        student3.viewProfile();
        double double12 = student3.getHourlyRate();
        boolean boolean13 = student3.isVerified();
        java.lang.String str14 = student3.getID();
        double double15 = student3.getHourlyRate();
        student3.setVerified(false);
        java.lang.String str18 = student3.getEmail();
        java.lang.String str19 = student3.getPassword();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 20.0d + "'", double12 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 20.0d + "'", double15 == 20.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "student" + "'", str19, "student");
    }

    @Test
    public void test18799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18799");
        model.Student student3 = new model.Student("hi!", "hi!", "hi!");
        student3.login("hi!", "student");
        student3.logout();
        java.lang.String str8 = student3.getPassword();
        student3.viewProfile();
        java.lang.String str10 = student3.getAccountType();
        java.lang.String str11 = student3.getEmail();
        student3.setVerified(true);
        java.lang.String str14 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "student" + "'", str10, "student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "student" + "'", str14, "student");
    }

    @Test
    public void test18800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18800");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        double double6 = student3.getHourlyRate();
        java.lang.String str7 = student3.getPassword();
        student3.login("", "student");
        java.lang.String str11 = student3.getPassword();
        student3.setVerified(false);
        student3.login("student", "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test18801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18801");
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
        java.lang.String str20 = student3.getID();
        student3.setVerified(false);
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test18802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18802");
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
        double double18 = student3.getHourlyRate();
        java.lang.String str19 = student3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 20.0d + "'", double12 == 20.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "student" + "'", str15, "student");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 20.0d + "'", double18 == 20.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test18803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18803");
        model.Student student3 = new model.Student("", "", "hi!");
        student3.logout();
        java.lang.String str5 = student3.getID();
        java.lang.String str6 = student3.getEmail();
        double double7 = student3.getHourlyRate();
        java.lang.String str8 = student3.getEmail();
        java.lang.String str9 = student3.getID();
        java.lang.String str10 = student3.getID();
        student3.login("hi!", "student");
        student3.setVerified(false);
        student3.viewProfile();
        boolean boolean17 = student3.isVerified();
        student3.logout();
        java.lang.String str19 = student3.getAccountType();
        student3.setVerified(false);
        student3.logout();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "student" + "'", str19, "student");
    }

    @Test
    public void test18804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18804");
        model.Student student3 = new model.Student("hi!", "student", "");
        java.lang.String str4 = student3.getPassword();
        student3.logout();
        student3.setVerified(true);
        java.lang.String str8 = student3.getEmail();
        boolean boolean9 = student3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "student" + "'", str4, "student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test18805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18805");
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
        student3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 20.0d + "'", double16 == 20.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 20.0d + "'", double17 == 20.0d);
    }

    @Test
    public void test18806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18806");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        student3.setVerified(false);
        java.lang.String str9 = student3.getID();
        student3.setVerified(false);
        boolean boolean12 = student3.isVerified();
        java.lang.String str13 = student3.getEmail();
        student3.setVerified(true);
        java.lang.String str16 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "student" + "'", str16, "student");
    }

    @Test
    public void test18807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18807");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getAccountType();
        student3.logout();
        double double8 = student3.getHourlyRate();
        java.lang.String str9 = student3.getEmail();
        java.lang.String str10 = student3.getAccountType();
        student3.setVerified(true);
        java.lang.String str13 = student3.getAccountType();
        student3.viewProfile();
        java.lang.String str15 = student3.getPassword();
        java.lang.String str16 = student3.getID();
        student3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "student" + "'", str10, "student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "student" + "'", str13, "student");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test18808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18808");
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
        java.lang.String str14 = student3.getEmail();
        java.lang.String str15 = student3.getEmail();
        student3.logout();
        student3.logout();
        student3.logout();
        student3.logout();
        student3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "student" + "'", str11, "student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test18809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18809");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        student3.setVerified(false);
        java.lang.String str6 = student3.getEmail();
        java.lang.String str7 = student3.getAccountType();
        student3.viewProfile();
        java.lang.String str9 = student3.getAccountType();
        java.lang.String str10 = student3.getPassword();
        student3.setVerified(true);
        boolean boolean13 = student3.isVerified();
        student3.logout();
        java.lang.String str15 = student3.getID();
        student3.logout();
        student3.viewProfile();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "student" + "'", str9, "student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test18810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18810");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        student3.setVerified(false);
        student3.viewProfile();
        java.lang.String str7 = student3.getEmail();
        student3.viewProfile();
        java.lang.String str9 = student3.getEmail();
        java.lang.String str10 = student3.getEmail();
        student3.logout();
        java.lang.String str12 = student3.getAccountType();
        java.lang.String str13 = student3.getPassword();
        student3.viewProfile();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "student" + "'", str12, "student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test18811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18811");
        model.Student student3 = new model.Student("", "", "hi!");
        student3.logout();
        java.lang.String str5 = student3.getID();
        java.lang.String str6 = student3.getEmail();
        java.lang.String str7 = student3.getEmail();
        java.lang.String str8 = student3.getEmail();
        java.lang.String str9 = student3.getID();
        java.lang.String str10 = student3.getPassword();
        student3.viewProfile();
        java.lang.String str12 = student3.getEmail();
        student3.viewProfile();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test18812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18812");
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
        boolean boolean16 = student3.isVerified();
        double double17 = student3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "student" + "'", str13, "student");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 20.0d + "'", double17 == 20.0d);
    }

    @Test
    public void test18813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18813");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getAccountType();
        java.lang.String str7 = student3.getAccountType();
        java.lang.String str8 = student3.getEmail();
        student3.logout();
        java.lang.String str10 = student3.getEmail();
        java.lang.String str11 = student3.getAccountType();
        student3.login("student", "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "student" + "'", str11, "student");
    }

    @Test
    public void test18814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18814");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        java.lang.String str6 = student3.getPassword();
        student3.setVerified(false);
        java.lang.String str9 = student3.getAccountType();
        double double10 = student3.getHourlyRate();
        double double11 = student3.getHourlyRate();
        java.lang.String str12 = student3.getAccountType();
        student3.login("", "");
        student3.viewProfile();
        student3.viewProfile();
        boolean boolean18 = student3.isVerified();
        student3.login("", "student");
        java.lang.String str22 = student3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "student" + "'", str9, "student");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "student" + "'", str12, "student");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test18815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18815");
        model.Student student3 = new model.Student("hi!", "hi!", "");
        student3.logout();
        java.lang.String str5 = student3.getEmail();
        boolean boolean6 = student3.isVerified();
        java.lang.String str7 = student3.getID();
        java.lang.String str8 = student3.getPassword();
        boolean boolean9 = student3.isVerified();
        java.lang.String str10 = student3.getEmail();
        java.lang.String str11 = student3.getID();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test18816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18816");
        model.Student student3 = new model.Student("", "", "hi!");
        student3.logout();
        java.lang.String str5 = student3.getID();
        java.lang.String str6 = student3.getEmail();
        student3.viewProfile();
        student3.login("hi!", "student");
        java.lang.String str11 = student3.getAccountType();
        student3.setVerified(false);
        java.lang.String str14 = student3.getEmail();
        double double15 = student3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "student" + "'", str11, "student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 20.0d + "'", double15 == 20.0d);
    }

    @Test
    public void test18817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18817");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        java.lang.String str6 = student3.getPassword();
        java.lang.String str7 = student3.getPassword();
        student3.login("hi!", "hi!");
        student3.viewProfile();
        student3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test18818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18818");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        student3.setVerified(false);
        student3.viewProfile();
        java.lang.String str7 = student3.getEmail();
        java.lang.String str8 = student3.getAccountType();
        student3.logout();
        boolean boolean10 = student3.isVerified();
        student3.login("", "hi!");
        student3.viewProfile();
        java.lang.String str15 = student3.getPassword();
        student3.logout();
        java.lang.String str17 = student3.getID();
        student3.login("hi!", "");
        student3.logout();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test18819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18819");
        model.Student student3 = new model.Student("hi!", "hi!", "");
        student3.logout();
        java.lang.String str5 = student3.getEmail();
        java.lang.String str6 = student3.getAccountType();
        java.lang.String str7 = student3.getEmail();
        student3.viewProfile();
        student3.setVerified(false);
        student3.login("", "student");
        java.lang.String str14 = student3.getID();
        java.lang.String str15 = student3.getPassword();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test18820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18820");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getAccountType();
        student3.logout();
        java.lang.String str8 = student3.getID();
        student3.login("", "");
        java.lang.String str12 = student3.getID();
        student3.setVerified(false);
        boolean boolean15 = student3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test18821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18821");
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
        student3.setVerified(true);
        student3.setVerified(false);
        student3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test18822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18822");
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
        boolean boolean22 = student3.isVerified();
        java.lang.String str23 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "student" + "'", str15, "student");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "student" + "'", str23, "student");
    }

    @Test
    public void test18823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18823");
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
        java.lang.String str15 = student3.getID();
        student3.login("student", "");
        student3.viewProfile();
        student3.logout();
        student3.setVerified(true);
        student3.login("", "student");
        java.lang.String str26 = student3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "student" + "'", str13, "student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test18824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18824");
        model.Student student3 = new model.Student("", "", "hi!");
        student3.logout();
        java.lang.String str5 = student3.getID();
        java.lang.String str6 = student3.getEmail();
        double double7 = student3.getHourlyRate();
        boolean boolean8 = student3.isVerified();
        java.lang.String str9 = student3.getID();
        java.lang.String str10 = student3.getAccountType();
        double double11 = student3.getHourlyRate();
        student3.setVerified(true);
        double double14 = student3.getHourlyRate();
        boolean boolean15 = student3.isVerified();
        boolean boolean16 = student3.isVerified();
        java.lang.String str17 = student3.getEmail();
        java.lang.String str18 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "student" + "'", str10, "student");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 20.0d + "'", double14 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "student" + "'", str18, "student");
    }

    @Test
    public void test18825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18825");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.viewProfile();
        boolean boolean8 = student3.isVerified();
        java.lang.String str9 = student3.getEmail();
        java.lang.String str10 = student3.getPassword();
        java.lang.String str11 = student3.getPassword();
        student3.logout();
        student3.viewProfile();
        java.lang.String str14 = student3.getEmail();
        student3.setVerified(true);
        java.lang.String str17 = student3.getEmail();
        java.lang.String str18 = student3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test18826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18826");
        model.Student student3 = new model.Student("hi!", "student", "");
        java.lang.String str4 = student3.getEmail();
        student3.logout();
        java.lang.String str6 = student3.getID();
        boolean boolean7 = student3.isVerified();
        java.lang.String str8 = student3.getAccountType();
        student3.login("hi!", "");
        student3.viewProfile();
        java.lang.String str13 = student3.getPassword();
        student3.viewProfile();
        student3.setVerified(true);
        java.lang.Class<?> wildcardClass17 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "student" + "'", str13, "student");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test18827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18827");
        model.Student student3 = new model.Student("", "student", "student");
        double double4 = student3.getHourlyRate();
        java.lang.String str5 = student3.getAccountType();
        java.lang.String str6 = student3.getID();
        java.lang.String str7 = student3.getAccountType();
        java.lang.String str8 = student3.getEmail();
        double double9 = student3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
    }

    @Test
    public void test18828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18828");
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
        boolean boolean13 = student3.isVerified();
        student3.viewProfile();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "student" + "'", str10, "student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test18829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18829");
        model.Student student3 = new model.Student("", "", "hi!");
        student3.logout();
        java.lang.String str5 = student3.getID();
        java.lang.String str6 = student3.getEmail();
        double double7 = student3.getHourlyRate();
        boolean boolean8 = student3.isVerified();
        java.lang.String str9 = student3.getID();
        double double10 = student3.getHourlyRate();
        student3.logout();
        student3.setVerified(true);
        java.lang.String str14 = student3.getPassword();
        student3.login("student", "student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test18830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18830");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        java.lang.String str4 = student3.getAccountType();
        java.lang.String str5 = student3.getID();
        student3.setVerified(true);
        student3.login("student", "student");
        java.lang.String str11 = student3.getID();
        student3.viewProfile();
        student3.viewProfile();
        java.lang.String str14 = student3.getAccountType();
        student3.login("student", "student");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "student" + "'", str4, "student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "student" + "'", str14, "student");
    }

    @Test
    public void test18831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18831");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        java.lang.String str6 = student3.getPassword();
        student3.setVerified(false);
        java.lang.String str9 = student3.getEmail();
        student3.logout();
        student3.logout();
        java.lang.String str12 = student3.getEmail();
        double double13 = student3.getHourlyRate();
        student3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 20.0d + "'", double13 == 20.0d);
    }

    @Test
    public void test18832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18832");
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
        student3.viewProfile();
        double double16 = student3.getHourlyRate();
        student3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 20.0d + "'", double16 == 20.0d);
    }

    @Test
    public void test18833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18833");
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
        java.lang.String str14 = student3.getEmail();
        student3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "student" + "'", str9, "student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 20.0d + "'", double13 == 20.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test18834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18834");
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
        boolean boolean14 = student3.isVerified();
        java.lang.String str15 = student3.getPassword();
        student3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test18835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18835");
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
        java.lang.String str17 = student3.getEmail();
        student3.login("", "");
        java.lang.String str21 = student3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "student" + "'", str12, "student");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test18836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18836");
        model.Student student3 = new model.Student("", "", "hi!");
        student3.logout();
        java.lang.String str5 = student3.getID();
        java.lang.String str6 = student3.getEmail();
        double double7 = student3.getHourlyRate();
        java.lang.String str8 = student3.getPassword();
        student3.login("hi!", "hi!");
        java.lang.String str12 = student3.getAccountType();
        student3.logout();
        java.lang.String str14 = student3.getEmail();
        student3.setVerified(true);
        java.lang.String str17 = student3.getID();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "student" + "'", str12, "student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test18837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18837");
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
        java.lang.String str14 = student3.getEmail();
        student3.viewProfile();
        java.lang.Class<?> wildcardClass16 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test18838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18838");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.viewProfile();
        boolean boolean8 = student3.isVerified();
        student3.login("hi!", "student");
        student3.logout();
        java.lang.String str13 = student3.getID();
        java.lang.String str14 = student3.getAccountType();
        java.lang.String str15 = student3.getID();
        java.lang.Class<?> wildcardClass16 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "student" + "'", str14, "student");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test18839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18839");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        student3.logout();
        student3.login("hi!", "hi!");
        student3.viewProfile();
        java.lang.String str9 = student3.getPassword();
        java.lang.String str10 = student3.getID();
        student3.logout();
        student3.login("hi!", "");
        java.lang.String str15 = student3.getPassword();
        java.lang.String str16 = student3.getAccountType();
        student3.logout();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "student" + "'", str16, "student");
    }

    @Test
    public void test18840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18840");
        model.Student student3 = new model.Student("hi!", "hi!", "");
        student3.setVerified(true);
        student3.login("student", "");
        java.lang.String str9 = student3.getAccountType();
        student3.logout();
        boolean boolean11 = student3.isVerified();
        java.lang.String str12 = student3.getPassword();
        student3.viewProfile();
        student3.login("hi!", "hi!");
        student3.login("", "hi!");
        java.lang.String str20 = student3.getPassword();
        student3.logout();
        double double22 = student3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "student" + "'", str9, "student");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 20.0d + "'", double22 == 20.0d);
    }

    @Test
    public void test18841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18841");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        student3.setVerified(false);
        java.lang.String str6 = student3.getPassword();
        java.lang.String str7 = student3.getAccountType();
        java.lang.String str8 = student3.getEmail();
        java.lang.String str9 = student3.getEmail();
        student3.viewProfile();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test18842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18842");
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
        java.lang.String str19 = student3.getEmail();
        double double20 = student3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 20.0d + "'", double20 == 20.0d);
    }

    @Test
    public void test18843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18843");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        java.lang.String str4 = student3.getAccountType();
        java.lang.String str5 = student3.getEmail();
        student3.viewProfile();
        student3.setVerified(true);
        java.lang.String str9 = student3.getPassword();
        student3.setVerified(false);
        student3.setVerified(true);
        student3.viewProfile();
        double double15 = student3.getHourlyRate();
        java.lang.String str16 = student3.getID();
        student3.login("hi!", "");
        java.lang.Class<?> wildcardClass20 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "student" + "'", str4, "student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 20.0d + "'", double15 == 20.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test18844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18844");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        double double6 = student3.getHourlyRate();
        java.lang.String str7 = student3.getPassword();
        java.lang.String str8 = student3.getPassword();
        java.lang.String str9 = student3.getPassword();
        java.lang.String str10 = student3.getID();
        boolean boolean11 = student3.isVerified();
        student3.login("student", "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test18845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18845");
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
        java.lang.String str13 = student3.getEmail();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "student" + "'", str10, "student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test18846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18846");
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
        java.lang.String str17 = student3.getID();
        student3.login("", "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test18847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18847");
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
        java.lang.String str16 = student3.getID();
        java.lang.String str17 = student3.getID();
        java.lang.String str18 = student3.getAccountType();
        student3.logout();
        student3.logout();
        java.lang.String str21 = student3.getEmail();
        java.lang.String str22 = student3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "student" + "'", str18, "student");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test18848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18848");
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
        double double15 = student3.getHourlyRate();
        java.lang.String str16 = student3.getPassword();
        double double17 = student3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 20.0d + "'", double15 == 20.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 20.0d + "'", double17 == 20.0d);
    }

    @Test
    public void test18849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18849");
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
        student3.viewProfile();
        boolean boolean19 = student3.isVerified();
        student3.login("student", "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "student" + "'", str12, "student");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 20.0d + "'", double16 == 20.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test18850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18850");
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
        java.lang.String str15 = student3.getAccountType();
        student3.login("hi!", "student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "student" + "'", str15, "student");
    }

    @Test
    public void test18851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18851");
        model.Student student3 = new model.Student("", "", "student");
        java.lang.String str4 = student3.getAccountType();
        java.lang.String str5 = student3.getID();
        double double6 = student3.getHourlyRate();
        boolean boolean7 = student3.isVerified();
        java.lang.String str8 = student3.getEmail();
        boolean boolean9 = student3.isVerified();
        java.lang.String str10 = student3.getPassword();
        student3.login("hi!", "hi!");
        boolean boolean14 = student3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "student" + "'", str4, "student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test18852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18852");
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
        student3.logout();
        boolean boolean22 = student3.isVerified();
        java.lang.String str23 = student3.getID();
        java.lang.String str24 = student3.getEmail();
        boolean boolean25 = student3.isVerified();
        java.lang.String str26 = student3.getEmail();
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test18853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18853");
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
        double double16 = student3.getHourlyRate();
        java.lang.String str17 = student3.getEmail();
        java.lang.String str18 = student3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 20.0d + "'", double16 == 20.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test18854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18854");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        student3.setVerified(false);
        java.lang.String str6 = student3.getEmail();
        java.lang.String str7 = student3.getAccountType();
        java.lang.String str8 = student3.getEmail();
        student3.viewProfile();
        java.lang.String str10 = student3.getID();
        student3.viewProfile();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test18855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18855");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        student3.setVerified(false);
        student3.viewProfile();
        java.lang.String str7 = student3.getEmail();
        java.lang.String str8 = student3.getAccountType();
        java.lang.String str9 = student3.getID();
        java.lang.String str10 = student3.getAccountType();
        student3.setVerified(false);
        student3.login("", "hi!");
        java.lang.String str16 = student3.getID();
        java.lang.String str17 = student3.getAccountType();
        java.lang.Class<?> wildcardClass18 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "student" + "'", str10, "student");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "student" + "'", str17, "student");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test18856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18856");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.login("", "");
        student3.login("student", "student");
        java.lang.String str13 = student3.getPassword();
        java.lang.String str14 = student3.getID();
        student3.login("", "");
        java.lang.String str18 = student3.getAccountType();
        boolean boolean19 = student3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "student" + "'", str18, "student");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test18857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18857");
        model.Student student3 = new model.Student("", "", "hi!");
        student3.logout();
        java.lang.String str5 = student3.getID();
        java.lang.String str6 = student3.getEmail();
        double double7 = student3.getHourlyRate();
        boolean boolean8 = student3.isVerified();
        java.lang.String str9 = student3.getID();
        java.lang.String str10 = student3.getAccountType();
        double double11 = student3.getHourlyRate();
        student3.setVerified(true);
        double double14 = student3.getHourlyRate();
        boolean boolean15 = student3.isVerified();
        boolean boolean16 = student3.isVerified();
        student3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "student" + "'", str10, "student");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 20.0d + "'", double14 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test18858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18858");
        model.Student student3 = new model.Student("", "", "hi!");
        student3.logout();
        java.lang.String str5 = student3.getID();
        student3.setVerified(true);
        java.lang.String str8 = student3.getEmail();
        java.lang.String str9 = student3.getEmail();
        java.lang.String str10 = student3.getAccountType();
        student3.login("student", "student");
        java.lang.String str14 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "student" + "'", str10, "student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "student" + "'", str14, "student");
    }

    @Test
    public void test18859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18859");
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
        java.lang.String str17 = student3.getPassword();
        student3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test18860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18860");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        java.lang.String str4 = student3.getAccountType();
        java.lang.String str5 = student3.getEmail();
        student3.viewProfile();
        student3.logout();
        student3.viewProfile();
        student3.login("", "");
        student3.login("", "hi!");
        boolean boolean15 = student3.isVerified();
        java.lang.String str16 = student3.getID();
        java.lang.String str17 = student3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "student" + "'", str4, "student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test18861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18861");
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
        double double15 = student3.getHourlyRate();
        student3.viewProfile();
        double double17 = student3.getHourlyRate();
        double double18 = student3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "student" + "'", str13, "student");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 20.0d + "'", double15 == 20.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 20.0d + "'", double17 == 20.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 20.0d + "'", double18 == 20.0d);
    }

    @Test
    public void test18862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18862");
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
        student3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "student" + "'", str10, "student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test18863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18863");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        java.lang.String str4 = student3.getAccountType();
        java.lang.String str5 = student3.getID();
        student3.setVerified(true);
        java.lang.String str8 = student3.getAccountType();
        java.lang.String str9 = student3.getAccountType();
        java.lang.String str10 = student3.getAccountType();
        student3.logout();
        student3.login("hi!", "hi!");
        student3.logout();
        student3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "student" + "'", str4, "student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "student" + "'", str9, "student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "student" + "'", str10, "student");
    }

    @Test
    public void test18864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18864");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        student3.logout();
        student3.login("hi!", "hi!");
        double double8 = student3.getHourlyRate();
        java.lang.String str9 = student3.getID();
        java.lang.String str10 = student3.getEmail();
        java.lang.String str11 = student3.getPassword();
        java.lang.String str12 = student3.getID();
        double double13 = student3.getHourlyRate();
        double double14 = student3.getHourlyRate();
        boolean boolean15 = student3.isVerified();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 20.0d + "'", double13 == 20.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 20.0d + "'", double14 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test18865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18865");
        model.Student student3 = new model.Student("student", "", "student");
        student3.setVerified(false);
        student3.viewProfile();
        java.lang.String str7 = student3.getEmail();
        java.lang.String str8 = student3.getID();
        java.lang.String str9 = student3.getID();
        student3.setVerified(true);
        double double12 = student3.getHourlyRate();
        student3.login("", "hi!");
        student3.login("student", "");
        java.lang.String str19 = student3.getPassword();
        java.lang.String str20 = student3.getPassword();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "student" + "'", str9, "student");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 20.0d + "'", double12 == 20.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test18866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18866");
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
        double double18 = student3.getHourlyRate();
        student3.login("hi!", "hi!");
        double double22 = student3.getHourlyRate();
        student3.login("student", "hi!");
        java.lang.String str26 = student3.getID();
        student3.viewProfile();
        boolean boolean28 = student3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "student" + "'", str13, "student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "student" + "'", str14, "student");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "student" + "'", str17, "student");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 20.0d + "'", double18 == 20.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 20.0d + "'", double22 == 20.0d);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test18867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18867");
        model.Student student3 = new model.Student("", "", "");
        student3.viewProfile();
        java.lang.String str5 = student3.getEmail();
        java.lang.String str6 = student3.getEmail();
        student3.logout();
        student3.setVerified(true);
        student3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test18868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18868");
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
        java.lang.String str14 = student3.getAccountType();
        java.lang.String str15 = student3.getID();
        student3.login("", "student");
        student3.viewProfile();
        student3.viewProfile();
        student3.setVerified(true);
        student3.setVerified(false);
        student3.viewProfile();
        java.lang.String str26 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "student" + "'", str13, "student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "student" + "'", str14, "student");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "student" + "'", str26, "student");
    }

    @Test
    public void test18869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18869");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        java.lang.String str7 = student3.getID();
        double double8 = student3.getHourlyRate();
        double double9 = student3.getHourlyRate();
        student3.logout();
        java.lang.String str11 = student3.getID();
        java.lang.String str12 = student3.getPassword();
        student3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test18870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18870");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        student3.setVerified(false);
        java.lang.String str9 = student3.getID();
        student3.setVerified(false);
        student3.logout();
        student3.setVerified(false);
        double double15 = student3.getHourlyRate();
        student3.login("hi!", "hi!");
        java.lang.String str19 = student3.getEmail();
        student3.logout();
        java.lang.Class<?> wildcardClass21 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 20.0d + "'", double15 == 20.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test18871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18871");
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
        double double15 = student3.getHourlyRate();
        java.lang.String str16 = student3.getPassword();
        double double17 = student3.getHourlyRate();
        student3.viewProfile();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 20.0d + "'", double15 == 20.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 20.0d + "'", double17 == 20.0d);
    }

    @Test
    public void test18872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18872");
        model.Student student3 = new model.Student("hi!", "hi!", "");
        student3.setVerified(true);
        double double6 = student3.getHourlyRate();
        java.lang.String str7 = student3.getEmail();
        student3.viewProfile();
        student3.logout();
        student3.viewProfile();
        java.lang.String str11 = student3.getAccountType();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "student" + "'", str11, "student");
    }

    @Test
    public void test18873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18873");
        model.Student student3 = new model.Student("", "", "hi!");
        student3.login("", "");
        student3.viewProfile();
        student3.viewProfile();
        student3.login("", "");
        student3.logout();
        java.lang.String str13 = student3.getID();
        boolean boolean14 = student3.isVerified();
        student3.login("student", "student");
        double double18 = student3.getHourlyRate();
        student3.login("hi!", "hi!");
        student3.login("student", "");
        java.lang.String str25 = student3.getID();
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 20.0d + "'", double18 == 20.0d);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
    }

    @Test
    public void test18874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18874");
        model.Student student3 = new model.Student("student", "", "student");
        student3.setVerified(false);
        boolean boolean6 = student3.isVerified();
        java.lang.String str7 = student3.getAccountType();
        boolean boolean8 = student3.isVerified();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test18875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18875");
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
        java.lang.String str19 = student3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 20.0d + "'", double13 == 20.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test18876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18876");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        student3.setVerified(false);
        student3.viewProfile();
        java.lang.String str7 = student3.getEmail();
        java.lang.String str8 = student3.getAccountType();
        java.lang.String str9 = student3.getID();
        java.lang.String str10 = student3.getPassword();
        java.lang.String str11 = student3.getID();
        java.lang.String str12 = student3.getAccountType();
        student3.logout();
        java.lang.Class<?> wildcardClass14 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "student" + "'", str12, "student");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test18877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18877");
        model.Student student3 = new model.Student("", "", "hi!");
        student3.login("", "");
        java.lang.String str7 = student3.getPassword();
        java.lang.String str8 = student3.getEmail();
        java.lang.String str9 = student3.getAccountType();
        student3.login("student", "student");
        student3.viewProfile();
        student3.viewProfile();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "student" + "'", str9, "student");
    }

    @Test
    public void test18878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18878");
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
        student3.viewProfile();
        java.lang.String str15 = student3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test18879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18879");
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
        student3.login("hi!", "hi!");
        student3.login("hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test18880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18880");
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
        student3.logout();
        student3.viewProfile();
        java.lang.String str22 = student3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test18881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18881");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        java.lang.String str4 = student3.getAccountType();
        java.lang.String str5 = student3.getID();
        student3.setVerified(true);
        student3.login("student", "student");
        java.lang.String str11 = student3.getPassword();
        java.lang.String str12 = student3.getID();
        java.lang.String str13 = student3.getID();
        student3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "student" + "'", str4, "student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test18882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18882");
        model.Student student3 = new model.Student("hi!", "student", "");
        java.lang.String str4 = student3.getEmail();
        student3.logout();
        java.lang.String str6 = student3.getEmail();
        student3.viewProfile();
        boolean boolean8 = student3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test18883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18883");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        java.lang.String str8 = student3.getAccountType();
        student3.setVerified(false);
        boolean boolean11 = student3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test18884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18884");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        java.lang.String str4 = student3.getAccountType();
        java.lang.String str5 = student3.getEmail();
        double double6 = student3.getHourlyRate();
        student3.logout();
        java.lang.String str8 = student3.getEmail();
        java.lang.String str9 = student3.getEmail();
        student3.setVerified(false);
        java.lang.Class<?> wildcardClass12 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "student" + "'", str4, "student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test18885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18885");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        student3.setVerified(false);
        student3.viewProfile();
        java.lang.String str7 = student3.getEmail();
        java.lang.String str8 = student3.getAccountType();
        java.lang.String str9 = student3.getID();
        java.lang.String str10 = student3.getAccountType();
        student3.setVerified(false);
        student3.login("", "hi!");
        java.lang.String str16 = student3.getID();
        java.lang.String str17 = student3.getPassword();
        student3.viewProfile();
        java.lang.String str19 = student3.getPassword();
        student3.viewProfile();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "student" + "'", str10, "student");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test18886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18886");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        student3.setVerified(false);
        java.lang.String str10 = student3.getEmail();
        student3.logout();
        java.lang.String str12 = student3.getID();
        student3.login("", "hi!");
        double double16 = student3.getHourlyRate();
        student3.viewProfile();
        java.lang.String str18 = student3.getID();
        double double19 = student3.getHourlyRate();
        student3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 20.0d + "'", double16 == 20.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 20.0d + "'", double19 == 20.0d);
    }

    @Test
    public void test18887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18887");
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
        student3.viewProfile();
        java.lang.String str17 = student3.getID();
        double double18 = student3.getHourlyRate();
        student3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "student" + "'", str10, "student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 20.0d + "'", double18 == 20.0d);
    }

    @Test
    public void test18888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18888");
        model.Student student3 = new model.Student("student", "hi!", "");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getPassword();
        java.lang.String str6 = student3.getAccountType();
        student3.setVerified(false);
        java.lang.String str9 = student3.getEmail();
        student3.login("", "");
        boolean boolean13 = student3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "student" + "'", str9, "student");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test18889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18889");
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
        java.lang.String str15 = student3.getID();
        student3.login("student", "");
        student3.viewProfile();
        student3.logout();
        java.lang.String str21 = student3.getEmail();
        student3.login("", "");
        java.lang.String str25 = student3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "student" + "'", str13, "student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
    }

    @Test
    public void test18890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18890");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        student3.setVerified(false);
        java.lang.String str10 = student3.getID();
        double double11 = student3.getHourlyRate();
        java.lang.String str12 = student3.getID();
        java.lang.String str13 = student3.getID();
        java.lang.String str14 = student3.getEmail();
        student3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test18891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18891");
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
        java.lang.String str15 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 20.0d + "'", double12 == 20.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "student" + "'", str15, "student");
    }

    @Test
    public void test18892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18892");
        model.Student student3 = new model.Student("hi!", "student", "");
        java.lang.String str4 = student3.getEmail();
        student3.viewProfile();
        java.lang.String str6 = student3.getAccountType();
        boolean boolean7 = student3.isVerified();
        student3.logout();
        java.lang.String str9 = student3.getAccountType();
        student3.setVerified(false);
        java.lang.String str12 = student3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "student" + "'", str9, "student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "student" + "'", str12, "student");
    }

    @Test
    public void test18893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18893");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        student3.logout();
        student3.login("hi!", "hi!");
        student3.viewProfile();
        student3.login("", "student");
        student3.login("", "student");
        java.lang.String str15 = student3.getEmail();
        java.lang.String str16 = student3.getEmail();
        double double17 = student3.getHourlyRate();
        java.lang.Class<?> wildcardClass18 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 20.0d + "'", double17 == 20.0d);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test18894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18894");
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
        java.lang.String str14 = student3.getPassword();
        student3.viewProfile();
        student3.logout();
        double double17 = student3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 20.0d + "'", double17 == 20.0d);
    }

    @Test
    public void test18895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18895");
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
        java.lang.String str14 = student3.getID();
        student3.login("", "student");
        java.lang.String str18 = student3.getEmail();
        boolean boolean19 = student3.isVerified();
        student3.login("", "hi!");
        java.lang.String str23 = student3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "student" + "'", str9, "student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test18896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18896");
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
        student3.login("", "");
        student3.setVerified(true);
        student3.login("hi!", "hi!");
        java.lang.String str23 = student3.getID();
        java.lang.String str24 = student3.getPassword();
        java.lang.String str25 = student3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 20.0d + "'", double12 == 20.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 20.0d + "'", double13 == 20.0d);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test18897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18897");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        student3.setVerified(false);
        java.lang.String str6 = student3.getPassword();
        java.lang.String str7 = student3.getAccountType();
        java.lang.String str8 = student3.getEmail();
        student3.viewProfile();
        student3.logout();
        student3.logout();
        boolean boolean12 = student3.isVerified();
        double double13 = student3.getHourlyRate();
        student3.viewProfile();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 20.0d + "'", double13 == 20.0d);
    }

    @Test
    public void test18898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18898");
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
        java.lang.String str14 = student3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test18899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18899");
        model.Student student3 = new model.Student("", "", "student");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getEmail();
        java.lang.String str6 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "student" + "'", str4, "student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
    }

    @Test
    public void test18900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18900");
        model.Student student3 = new model.Student("hi!", "hi!", "student");
        student3.login("hi!", "student");
        java.lang.String str7 = student3.getAccountType();
        boolean boolean8 = student3.isVerified();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test18901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18901");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        java.lang.String str8 = student3.getPassword();
        java.lang.String str9 = student3.getPassword();
        student3.setVerified(true);
        student3.logout();
        student3.viewProfile();
        java.lang.String str14 = student3.getAccountType();
        double double15 = student3.getHourlyRate();
        student3.setVerified(false);
        student3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "student" + "'", str14, "student");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 20.0d + "'", double15 == 20.0d);
    }

    @Test
    public void test18902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18902");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        java.lang.String str7 = student3.getID();
        student3.setVerified(true);
        java.lang.String str10 = student3.getPassword();
        java.lang.String str11 = student3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test18903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18903");
        model.Student student3 = new model.Student("", "student", "student");
        student3.setVerified(true);
        java.lang.String str6 = student3.getPassword();
        boolean boolean7 = student3.isVerified();
        java.lang.String str8 = student3.getEmail();
        double double9 = student3.getHourlyRate();
        java.lang.String str10 = student3.getID();
        student3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "student" + "'", str10, "student");
    }

    @Test
    public void test18904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18904");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        student3.logout();
        student3.login("hi!", "hi!");
        double double8 = student3.getHourlyRate();
        java.lang.String str9 = student3.getID();
        java.lang.String str10 = student3.getAccountType();
        student3.setVerified(true);
        boolean boolean13 = student3.isVerified();
        java.lang.String str14 = student3.getEmail();
        java.lang.String str15 = student3.getAccountType();
        java.lang.String str16 = student3.getAccountType();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "student" + "'", str10, "student");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "student" + "'", str15, "student");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "student" + "'", str16, "student");
    }

    @Test
    public void test18905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18905");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        student3.setVerified(false);
        student3.viewProfile();
        java.lang.String str7 = student3.getEmail();
        java.lang.String str8 = student3.getAccountType();
        java.lang.String str9 = student3.getID();
        java.lang.String str10 = student3.getAccountType();
        student3.logout();
        student3.logout();
        java.lang.String str13 = student3.getPassword();
        boolean boolean14 = student3.isVerified();
        boolean boolean15 = student3.isVerified();
        student3.logout();
        student3.logout();
        student3.setVerified(false);
        student3.login("", "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "student" + "'", str10, "student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test18906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18906");
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
        student3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test18907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18907");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        boolean boolean7 = student3.isVerified();
        java.lang.String str8 = student3.getEmail();
        student3.setVerified(true);
        java.lang.String str11 = student3.getAccountType();
        double double12 = student3.getHourlyRate();
        double double13 = student3.getHourlyRate();
        java.lang.String str14 = student3.getID();
        student3.login("", "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "student" + "'", str11, "student");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 20.0d + "'", double12 == 20.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 20.0d + "'", double13 == 20.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test18908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18908");
        model.Student student3 = new model.Student("hi!", "hi!", "hi!");
        student3.login("hi!", "student");
        student3.logout();
        java.lang.String str8 = student3.getPassword();
        student3.viewProfile();
        student3.setVerified(false);
        java.lang.String str12 = student3.getEmail();
        student3.logout();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test18909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18909");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        java.lang.String str8 = student3.getEmail();
        java.lang.String str9 = student3.getPassword();
        boolean boolean10 = student3.isVerified();
        java.lang.String str11 = student3.getID();
        java.lang.String str12 = student3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test18910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18910");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        java.lang.String str7 = student3.getID();
        java.lang.String str8 = student3.getID();
        java.lang.String str9 = student3.getID();
        student3.viewProfile();
        double double11 = student3.getHourlyRate();
        student3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
    }

    @Test
    public void test18911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18911");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        java.lang.String str7 = student3.getID();
        student3.setVerified(true);
        java.lang.String str10 = student3.getEmail();
        student3.setVerified(false);
        java.lang.String str13 = student3.getAccountType();
        student3.logout();
        java.lang.String str15 = student3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "student" + "'", str13, "student");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test18912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18912");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        student3.logout();
        student3.login("hi!", "hi!");
        student3.viewProfile();
        student3.login("", "student");
        student3.login("", "student");
        java.lang.String str15 = student3.getID();
        java.lang.String str16 = student3.getPassword();
        java.lang.String str17 = student3.getID();
        student3.viewProfile();
        java.lang.String str19 = student3.getAccountType();
        double double20 = student3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "student" + "'", str19, "student");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 20.0d + "'", double20 == 20.0d);
    }

    @Test
    public void test18913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18913");
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
        java.lang.String str29 = student3.getID();
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
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
    }

    @Test
    public void test18914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18914");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        student3.setVerified(false);
        java.lang.String str10 = student3.getID();
        student3.viewProfile();
        java.lang.String str12 = student3.getID();
        student3.logout();
        boolean boolean14 = student3.isVerified();
        java.lang.String str15 = student3.getAccountType();
        boolean boolean16 = student3.isVerified();
        java.lang.String str17 = student3.getEmail();
        student3.viewProfile();
        student3.login("student", "student");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "student" + "'", str15, "student");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test18915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18915");
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
        java.lang.Class<?> wildcardClass23 = student3.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test18916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18916");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        java.lang.String str7 = student3.getID();
        double double8 = student3.getHourlyRate();
        boolean boolean9 = student3.isVerified();
        student3.login("", "student");
        java.lang.String str13 = student3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test18917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18917");
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
        student3.viewProfile();
        student3.setVerified(true);
        java.lang.String str18 = student3.getID();
        java.lang.String str19 = student3.getEmail();
        java.lang.String str20 = student3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "student" + "'", str10, "student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test18918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18918");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getID();
        java.lang.String str6 = student3.getID();
        student3.login("", "");
        java.lang.String str10 = student3.getID();
        student3.setVerified(true);
        student3.setVerified(true);
        student3.viewProfile();
        boolean boolean16 = student3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test18919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18919");
        model.Student student3 = new model.Student("hi!", "hi!", "");
        student3.logout();
        java.lang.String str5 = student3.getEmail();
        double double6 = student3.getHourlyRate();
        boolean boolean7 = student3.isVerified();
        java.lang.String str8 = student3.getID();
        double double9 = student3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
    }

    @Test
    public void test18920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18920");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getID();
        student3.setVerified(true);
        java.lang.String str8 = student3.getID();
        student3.logout();
        student3.login("student", "");
        student3.login("hi!", "student");
        student3.viewProfile();
        java.lang.String str17 = student3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test18921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18921");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        java.lang.String str6 = student3.getPassword();
        student3.setVerified(false);
        java.lang.String str9 = student3.getEmail();
        student3.logout();
        student3.viewProfile();
        java.lang.String str12 = student3.getAccountType();
        boolean boolean13 = student3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "student" + "'", str12, "student");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test18922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18922");
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
        student3.logout();
        student3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "student" + "'", str12, "student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "student" + "'", str18, "student");
    }

    @Test
    public void test18923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18923");
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
        student3.viewProfile();
        boolean boolean17 = student3.isVerified();
        java.lang.String str18 = student3.getEmail();
        boolean boolean19 = student3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 20.0d + "'", double14 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test18924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18924");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        double double8 = student3.getHourlyRate();
        boolean boolean9 = student3.isVerified();
        student3.logout();
        boolean boolean11 = student3.isVerified();
        student3.setVerified(true);
        student3.login("student", "");
        java.lang.String str17 = student3.getPassword();
        boolean boolean18 = student3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test18925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18925");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        double double6 = student3.getHourlyRate();
        student3.logout();
        student3.setVerified(true);
        java.lang.String str10 = student3.getEmail();
        java.lang.String str11 = student3.getID();
        student3.logout();
        double double13 = student3.getHourlyRate();
        java.lang.String str14 = student3.getAccountType();
        java.lang.String str15 = student3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 20.0d + "'", double13 == 20.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "student" + "'", str14, "student");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test18926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18926");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        student3.setVerified(false);
        java.lang.String str6 = student3.getEmail();
        java.lang.String str7 = student3.getAccountType();
        java.lang.String str8 = student3.getAccountType();
        boolean boolean9 = student3.isVerified();
        student3.logout();
        java.lang.String str11 = student3.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test18927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18927");
        model.Student student3 = new model.Student("student", "hi!", "hi!");
        java.lang.String str4 = student3.getEmail();
        student3.login("hi!", "hi!");
        student3.viewProfile();
        java.lang.String str9 = student3.getEmail();
        java.lang.String str10 = student3.getAccountType();
        boolean boolean11 = student3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "student" + "'", str4, "student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "student" + "'", str9, "student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "student" + "'", str10, "student");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test18928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18928");
        model.Student student3 = new model.Student("hi!", "student", "");
        java.lang.String str4 = student3.getEmail();
        double double5 = student3.getHourlyRate();
        student3.login("", "student");
        student3.setVerified(true);
        boolean boolean11 = student3.isVerified();
        java.lang.String str12 = student3.getPassword();
        java.lang.String str13 = student3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "student" + "'", str12, "student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test18929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18929");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getAccountType();
        student3.logout();
        student3.setVerified(true);
        student3.setVerified(true);
        student3.logout();
        boolean boolean13 = student3.isVerified();
        student3.logout();
        student3.viewProfile();
        student3.viewProfile();
        student3.login("hi!", "student");
        java.lang.String str20 = student3.getEmail();
        java.lang.String str21 = student3.getID();
        student3.viewProfile();
        java.lang.Class<?> wildcardClass23 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test18930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18930");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        boolean boolean7 = student3.isVerified();
        student3.login("", "hi!");
        boolean boolean11 = student3.isVerified();
        boolean boolean12 = student3.isVerified();
        boolean boolean13 = student3.isVerified();
        student3.login("student", "student");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test18931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18931");
        model.Student student3 = new model.Student("", "student", "student");
        double double4 = student3.getHourlyRate();
        java.lang.String str5 = student3.getAccountType();
        java.lang.String str6 = student3.getAccountType();
        student3.viewProfile();
        java.lang.String str8 = student3.getPassword();
        student3.setVerified(true);
        boolean boolean11 = student3.isVerified();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test18932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18932");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        student3.logout();
        student3.login("hi!", "hi!");
        double double8 = student3.getHourlyRate();
        boolean boolean9 = student3.isVerified();
        student3.login("hi!", "");
        student3.login("student", "student");
        double double16 = student3.getHourlyRate();
        java.lang.String str17 = student3.getPassword();
        boolean boolean18 = student3.isVerified();
        boolean boolean19 = student3.isVerified();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 20.0d + "'", double16 == 20.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test18933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18933");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        java.lang.String str4 = student3.getAccountType();
        java.lang.String str5 = student3.getEmail();
        double double6 = student3.getHourlyRate();
        double double7 = student3.getHourlyRate();
        student3.logout();
        double double9 = student3.getHourlyRate();
        student3.logout();
        student3.login("student", "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "student" + "'", str4, "student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
    }

    @Test
    public void test18934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18934");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        student3.logout();
        student3.login("hi!", "hi!");
        student3.viewProfile();
        java.lang.String str9 = student3.getPassword();
        java.lang.String str10 = student3.getID();
        student3.logout();
        boolean boolean12 = student3.isVerified();
        java.lang.String str13 = student3.getID();
        student3.setVerified(true);
        java.lang.String str16 = student3.getEmail();
        student3.viewProfile();
        double double18 = student3.getHourlyRate();
        java.lang.String str19 = student3.getAccountType();
        java.lang.String str20 = student3.getPassword();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 20.0d + "'", double18 == 20.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "student" + "'", str19, "student");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test18935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18935");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.login("", "");
        java.lang.String str10 = student3.getID();
        student3.viewProfile();
        java.lang.String str12 = student3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test18936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18936");
        model.Student student3 = new model.Student("student", "", "student");
        student3.setVerified(false);
        java.lang.String str6 = student3.getAccountType();
        student3.login("hi!", "student");
        java.lang.String str10 = student3.getAccountType();
        java.lang.String str11 = student3.getID();
        student3.login("", "hi!");
        double double15 = student3.getHourlyRate();
        student3.login("student", "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "student" + "'", str10, "student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "student" + "'", str11, "student");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 20.0d + "'", double15 == 20.0d);
    }

    @Test
    public void test18937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18937");
        model.Student student3 = new model.Student("hi!", "student", "");
        java.lang.String str4 = student3.getEmail();
        student3.viewProfile();
        student3.logout();
        boolean boolean7 = student3.isVerified();
        student3.viewProfile();
        java.lang.String str9 = student3.getPassword();
        java.lang.String str10 = student3.getPassword();
        double double11 = student3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "student" + "'", str9, "student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "student" + "'", str10, "student");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
    }

    @Test
    public void test18938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18938");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        student3.logout();
        student3.login("hi!", "hi!");
        double double8 = student3.getHourlyRate();
        student3.viewProfile();
        java.lang.String str10 = student3.getPassword();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test18939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18939");
        model.Student student3 = new model.Student("", "", "hi!");
        student3.logout();
        java.lang.String str5 = student3.getID();
        java.lang.String str6 = student3.getEmail();
        double double7 = student3.getHourlyRate();
        java.lang.String str8 = student3.getPassword();
        student3.login("hi!", "hi!");
        boolean boolean12 = student3.isVerified();
        student3.setVerified(false);
        student3.login("", "hi!");
        student3.logout();
        java.lang.String str19 = student3.getAccountType();
        student3.setVerified(false);
        double double22 = student3.getHourlyRate();
        boolean boolean23 = student3.isVerified();
        java.lang.String str24 = student3.getEmail();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "student" + "'", str19, "student");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 20.0d + "'", double22 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test18940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18940");
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
        student3.setVerified(false);
        double double18 = student3.getHourlyRate();
        boolean boolean19 = student3.isVerified();
        student3.viewProfile();
        java.lang.Class<?> wildcardClass21 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "student" + "'", str13, "student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "student" + "'", str14, "student");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 20.0d + "'", double18 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test18941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18941");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        java.lang.String str4 = student3.getPassword();
        double double5 = student3.getHourlyRate();
        double double6 = student3.getHourlyRate();
        student3.logout();
        student3.logout();
        double double9 = student3.getHourlyRate();
        boolean boolean10 = student3.isVerified();
        java.lang.String str11 = student3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test18942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18942");
        model.Student student3 = new model.Student("", "", "hi!");
        student3.logout();
        java.lang.String str5 = student3.getID();
        java.lang.String str6 = student3.getPassword();
        java.lang.String str7 = student3.getAccountType();
        double double8 = student3.getHourlyRate();
        java.lang.String str9 = student3.getID();
        student3.setVerified(false);
        student3.login("hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test18943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18943");
        model.Student student3 = new model.Student("", "student", "");
        student3.setVerified(true);
        student3.setVerified(true);
        student3.login("", "student");
        boolean boolean11 = student3.isVerified();
        java.lang.String str12 = student3.getPassword();
        java.lang.String str13 = student3.getID();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "student" + "'", str12, "student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test18944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18944");
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
        student3.setVerified(true);
        student3.viewProfile();
        java.lang.String str19 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 20.0d + "'", double12 == 20.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "student" + "'", str19, "student");
    }

    @Test
    public void test18945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18945");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        student3.setVerified(false);
        java.lang.String str10 = student3.getID();
        double double11 = student3.getHourlyRate();
        java.lang.String str12 = student3.getEmail();
        java.lang.String str13 = student3.getID();
        java.lang.String str14 = student3.getAccountType();
        double double15 = student3.getHourlyRate();
        boolean boolean16 = student3.isVerified();
        java.lang.Class<?> wildcardClass17 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "student" + "'", str14, "student");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 20.0d + "'", double15 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test18946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18946");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.viewProfile();
        boolean boolean8 = student3.isVerified();
        java.lang.String str9 = student3.getEmail();
        student3.setVerified(true);
        boolean boolean12 = student3.isVerified();
        student3.setVerified(false);
        student3.logout();
        student3.viewProfile();
        java.lang.String str17 = student3.getAccountType();
        student3.logout();
        student3.login("hi!", "student");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "student" + "'", str17, "student");
    }

    @Test
    public void test18947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18947");
        model.Student student3 = new model.Student("hi!", "student", "");
        student3.logout();
        java.lang.String str5 = student3.getEmail();
        java.lang.String str6 = student3.getEmail();
        boolean boolean7 = student3.isVerified();
        java.lang.String str8 = student3.getEmail();
        double double9 = student3.getHourlyRate();
        student3.setVerified(true);
        student3.login("", "student");
        student3.login("hi!", "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
    }

    @Test
    public void test18948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18948");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        java.lang.String str6 = student3.getPassword();
        java.lang.String str7 = student3.getPassword();
        java.lang.String str8 = student3.getEmail();
        double double9 = student3.getHourlyRate();
        boolean boolean10 = student3.isVerified();
        java.lang.String str11 = student3.getEmail();
        student3.login("", "student");
        student3.setVerified(false);
        java.lang.String str17 = student3.getPassword();
        student3.login("student", "student");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test18949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18949");
        model.Student student3 = new model.Student("", "", "hi!");
        student3.logout();
        java.lang.String str5 = student3.getID();
        java.lang.String str6 = student3.getEmail();
        student3.setVerified(false);
        java.lang.String str9 = student3.getEmail();
        student3.login("", "student");
        student3.logout();
        java.lang.String str14 = student3.getEmail();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test18950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18950");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getID();
        java.lang.String str6 = student3.getPassword();
        java.lang.String str7 = student3.getEmail();
        student3.login("", "hi!");
        student3.viewProfile();
        java.lang.String str12 = student3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test18951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18951");
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
        java.lang.String str13 = student3.getPassword();
        student3.setVerified(true);
        java.lang.String str16 = student3.getPassword();
        student3.logout();
        java.lang.Class<?> wildcardClass18 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test18952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18952");
        model.Student student3 = new model.Student("hi!", "student", "");
        java.lang.String str4 = student3.getEmail();
        student3.viewProfile();
        student3.logout();
        boolean boolean7 = student3.isVerified();
        double double8 = student3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
    }

    @Test
    public void test18953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18953");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        student3.setVerified(false);
        java.lang.String str6 = student3.getEmail();
        java.lang.String str7 = student3.getAccountType();
        student3.viewProfile();
        student3.setVerified(false);
        java.lang.String str11 = student3.getPassword();
        java.lang.String str12 = student3.getEmail();
        java.lang.String str13 = student3.getID();
        student3.logout();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test18954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18954");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        java.lang.String str4 = student3.getAccountType();
        java.lang.String str5 = student3.getID();
        student3.login("", "student");
        boolean boolean9 = student3.isVerified();
        student3.logout();
        java.lang.String str11 = student3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "student" + "'", str4, "student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test18955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18955");
        model.Student student3 = new model.Student("", "", "hi!");
        student3.logout();
        java.lang.String str5 = student3.getID();
        java.lang.String str6 = student3.getEmail();
        student3.login("hi!", "hi!");
        java.lang.String str10 = student3.getPassword();
        student3.viewProfile();
        student3.login("student", "");
        double double15 = student3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 20.0d + "'", double15 == 20.0d);
    }

    @Test
    public void test18956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18956");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        boolean boolean7 = student3.isVerified();
        java.lang.String str8 = student3.getEmail();
        double double9 = student3.getHourlyRate();
        java.lang.String str10 = student3.getID();
        java.lang.String str11 = student3.getID();
        java.lang.String str12 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "student" + "'", str12, "student");
    }

    @Test
    public void test18957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18957");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        java.lang.String str4 = student3.getAccountType();
        java.lang.String str5 = student3.getEmail();
        double double6 = student3.getHourlyRate();
        double double7 = student3.getHourlyRate();
        java.lang.String str8 = student3.getPassword();
        boolean boolean9 = student3.isVerified();
        java.lang.String str10 = student3.getPassword();
        student3.logout();
        double double12 = student3.getHourlyRate();
        student3.login("hi!", "hi!");
        double double16 = student3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "student" + "'", str4, "student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 20.0d + "'", double12 == 20.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 20.0d + "'", double16 == 20.0d);
    }

    @Test
    public void test18958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18958");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        java.lang.String str4 = student3.getAccountType();
        java.lang.String str5 = student3.getID();
        student3.setVerified(true);
        student3.login("student", "student");
        java.lang.String str11 = student3.getID();
        student3.login("", "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "student" + "'", str4, "student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test18959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18959");
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
        student3.login("hi!", "");
        student3.setVerified(false);
        java.lang.String str23 = student3.getEmail();
        student3.login("hi!", "");
        student3.login("student", "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 20.0d + "'", double16 == 20.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test18960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18960");
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
        java.lang.String str22 = student3.getEmail();
        student3.login("student", "student");
        double double26 = student3.getHourlyRate();
        java.lang.String str27 = student3.getEmail();
        student3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 20.0d + "'", double26 == 20.0d);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test18961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18961");
        model.Student student3 = new model.Student("hi!", "student", "");
        java.lang.String str4 = student3.getEmail();
        student3.viewProfile();
        student3.login("", "student");
        java.lang.String str9 = student3.getID();
        student3.login("", "hi!");
        student3.setVerified(false);
        double double15 = student3.getHourlyRate();
        java.lang.String str16 = student3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 20.0d + "'", double15 == 20.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test18962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18962");
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
        java.lang.String str15 = student3.getID();
        student3.logout();
        java.lang.String str17 = student3.getEmail();
        boolean boolean18 = student3.isVerified();
        student3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "student" + "'", str14, "student");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test18963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18963");
        model.Student student3 = new model.Student("", "student", "");
        student3.setVerified(true);
        student3.setVerified(true);
        java.lang.String str8 = student3.getAccountType();
        student3.logout();
        double double10 = student3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
    }

    @Test
    public void test18964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18964");
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
        student3.logout();
        student3.login("", "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "student" + "'", str10, "student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 20.0d + "'", double13 == 20.0d);
    }

    @Test
    public void test18965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18965");
        model.Student student3 = new model.Student("", "", "hi!");
        student3.login("", "");
        student3.viewProfile();
        student3.login("", "student");
        student3.logout();
        student3.setVerified(false);
        student3.setVerified(false);
    }

    @Test
    public void test18966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18966");
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
        java.lang.String str13 = student3.getPassword();
        student3.login("", "");
        java.lang.String str17 = student3.getPassword();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "student" + "'", str12, "student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test18967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18967");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        boolean boolean7 = student3.isVerified();
        java.lang.String str8 = student3.getEmail();
        student3.logout();
        double double10 = student3.getHourlyRate();
        java.lang.String str11 = student3.getPassword();
        student3.login("", "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test18968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18968");
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
        student3.viewProfile();
        java.lang.String str15 = student3.getAccountType();
        student3.viewProfile();
        double double17 = student3.getHourlyRate();
        boolean boolean18 = student3.isVerified();
        java.lang.String str19 = student3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "student" + "'", str11, "student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "student" + "'", str15, "student");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 20.0d + "'", double17 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test18969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18969");
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
        double double14 = student3.getHourlyRate();
        student3.viewProfile();
        java.lang.String str16 = student3.getAccountType();
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
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 20.0d + "'", double14 == 20.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "student" + "'", str16, "student");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test18970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18970");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        student3.setVerified(false);
        java.lang.String str9 = student3.getID();
        student3.setVerified(false);
        student3.logout();
        java.lang.String str13 = student3.getAccountType();
        java.lang.String str14 = student3.getEmail();
        student3.login("", "student");
        double double18 = student3.getHourlyRate();
        java.lang.String str19 = student3.getPassword();
        java.lang.String str20 = student3.getID();
        java.lang.String str21 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "student" + "'", str13, "student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 20.0d + "'", double18 == 20.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "student" + "'", str21, "student");
    }

    @Test
    public void test18971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18971");
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
        boolean boolean14 = student3.isVerified();
        java.lang.String str15 = student3.getPassword();
        java.lang.Class<?> wildcardClass16 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "student" + "'", str12, "student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test18972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18972");
        model.Student student3 = new model.Student("", "", "hi!");
        student3.logout();
        java.lang.String str5 = student3.getID();
        java.lang.String str6 = student3.getEmail();
        student3.viewProfile();
        student3.login("hi!", "student");
        student3.viewProfile();
        java.lang.String str12 = student3.getEmail();
        double double13 = student3.getHourlyRate();
        double double14 = student3.getHourlyRate();
        java.lang.String str15 = student3.getEmail();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 20.0d + "'", double13 == 20.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 20.0d + "'", double14 == 20.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test18973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18973");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getEmail();
        boolean boolean6 = student3.isVerified();
        student3.setVerified(false);
        student3.viewProfile();
        java.lang.String str10 = student3.getPassword();
        java.lang.String str11 = student3.getAccountType();
        java.lang.String str12 = student3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "student" + "'", str11, "student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test18974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18974");
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
        student3.login("student", "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 20.0d + "'", double14 == 20.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test18975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18975");
        model.Student student3 = new model.Student("", "", "hi!");
        student3.logout();
        java.lang.String str5 = student3.getID();
        java.lang.String str6 = student3.getEmail();
        java.lang.String str7 = student3.getPassword();
        java.lang.String str8 = student3.getID();
        student3.logout();
        java.lang.String str10 = student3.getPassword();
        student3.logout();
        java.lang.String str12 = student3.getEmail();
        java.lang.String str13 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "student" + "'", str13, "student");
    }

    @Test
    public void test18976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18976");
        model.Student student3 = new model.Student("", "", "hi!");
        student3.logout();
        java.lang.String str5 = student3.getID();
        java.lang.String str6 = student3.getEmail();
        java.lang.String str7 = student3.getPassword();
        java.lang.String str8 = student3.getID();
        student3.logout();
        student3.viewProfile();
        java.lang.String str11 = student3.getID();
        java.lang.String str12 = student3.getPassword();
        double double13 = student3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 20.0d + "'", double13 == 20.0d);
    }

    @Test
    public void test18977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18977");
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
        student3.viewProfile();
        double double18 = student3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "student" + "'", str10, "student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "student" + "'", str11, "student");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 20.0d + "'", double12 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 20.0d + "'", double18 == 20.0d);
    }

    @Test
    public void test18978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18978");
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
        boolean boolean19 = student3.isVerified();
        boolean boolean20 = student3.isVerified();
        student3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "student" + "'", str11, "student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 20.0d + "'", double16 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test18979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18979");
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
        boolean boolean17 = student3.isVerified();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test18980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18980");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        student3.setVerified(false);
        student3.viewProfile();
        java.lang.String str7 = student3.getEmail();
        java.lang.String str8 = student3.getAccountType();
        java.lang.String str9 = student3.getID();
        java.lang.String str10 = student3.getAccountType();
        student3.logout();
        student3.logout();
        boolean boolean13 = student3.isVerified();
        double double14 = student3.getHourlyRate();
        student3.logout();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "student" + "'", str10, "student");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 20.0d + "'", double14 == 20.0d);
    }

    @Test
    public void test18981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18981");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        double double6 = student3.getHourlyRate();
        java.lang.String str7 = student3.getPassword();
        java.lang.String str8 = student3.getPassword();
        student3.login("student", "student");
        java.lang.String str12 = student3.getID();
        java.lang.String str13 = student3.getEmail();
        java.lang.String str14 = student3.getPassword();
        java.lang.String str15 = student3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test18982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18982");
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
        java.lang.String str17 = student3.getEmail();
        java.lang.String str18 = student3.getAccountType();
        boolean boolean19 = student3.isVerified();
        java.lang.String str20 = student3.getID();
        student3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 20.0d + "'", double15 == 20.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "student" + "'", str18, "student");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test18983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18983");
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
        java.lang.String str14 = student3.getEmail();
        java.lang.String str15 = student3.getEmail();
        boolean boolean16 = student3.isVerified();
        student3.viewProfile();
        java.lang.String str18 = student3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "student" + "'", str13, "student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test18984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18984");
        model.Student student3 = new model.Student("hi!", "hi!", "");
        student3.logout();
        java.lang.String str5 = student3.getEmail();
        boolean boolean6 = student3.isVerified();
        student3.login("", "student");
        boolean boolean10 = student3.isVerified();
        student3.logout();
        boolean boolean12 = student3.isVerified();
        java.lang.String str13 = student3.getAccountType();
        java.lang.String str14 = student3.getPassword();
        student3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "student" + "'", str13, "student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test18985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18985");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        student3.setVerified(false);
        student3.viewProfile();
        java.lang.String str7 = student3.getEmail();
        student3.viewProfile();
        java.lang.String str9 = student3.getEmail();
        student3.viewProfile();
        java.lang.String str11 = student3.getPassword();
        java.lang.String str12 = student3.getPassword();
        boolean boolean13 = student3.isVerified();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test18986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18986");
        model.Student student3 = new model.Student("", "", "hi!");
        student3.logout();
        java.lang.String str5 = student3.getID();
        java.lang.String str6 = student3.getPassword();
        double double7 = student3.getHourlyRate();
        student3.login("student", "hi!");
        java.lang.String str11 = student3.getID();
        double double12 = student3.getHourlyRate();
        student3.login("", "student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 20.0d + "'", double12 == 20.0d);
    }

    @Test
    public void test18987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18987");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        java.lang.String str4 = student3.getAccountType();
        java.lang.String str5 = student3.getID();
        student3.setVerified(true);
        boolean boolean8 = student3.isVerified();
        student3.setVerified(false);
        java.lang.String str11 = student3.getAccountType();
        student3.logout();
        java.lang.String str13 = student3.getID();
        java.lang.String str14 = student3.getEmail();
        student3.login("", "student");
        java.lang.String str18 = student3.getID();
        student3.setVerified(false);
        student3.login("", "");
        boolean boolean24 = student3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "student" + "'", str4, "student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "student" + "'", str11, "student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test18988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18988");
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
        student3.viewProfile();
        student3.logout();
        student3.viewProfile();
        java.lang.String str16 = student3.getAccountType();
        student3.login("", "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "student" + "'", str11, "student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "student" + "'", str16, "student");
    }

    @Test
    public void test18989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18989");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        student3.setVerified(false);
        java.lang.String str6 = student3.getPassword();
        java.lang.String str7 = student3.getAccountType();
        student3.viewProfile();
        student3.logout();
        student3.setVerified(true);
        java.lang.String str12 = student3.getID();
        java.lang.String str13 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "student" + "'", str13, "student");
    }

    @Test
    public void test18990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18990");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        java.lang.String str4 = student3.getAccountType();
        java.lang.String str5 = student3.getID();
        boolean boolean6 = student3.isVerified();
        student3.setVerified(false);
        java.lang.String str9 = student3.getPassword();
        student3.login("student", "student");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "student" + "'", str4, "student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test18991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18991");
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
        java.lang.String str17 = student3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test18992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18992");
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
        java.lang.String str14 = student3.getID();
        student3.login("", "student");
        java.lang.String str18 = student3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "student" + "'", str9, "student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test18993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18993");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.viewProfile();
        boolean boolean8 = student3.isVerified();
        student3.login("hi!", "student");
        student3.viewProfile();
        student3.setVerified(false);
        student3.login("hi!", "");
        java.lang.String str18 = student3.getEmail();
        student3.viewProfile();
        student3.login("", "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test18994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18994");
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
        student3.login("student", "student");
        student3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "student" + "'", str11, "student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test18995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18995");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        java.lang.String str7 = student3.getID();
        student3.setVerified(true);
        java.lang.String str10 = student3.getAccountType();
        java.lang.String str11 = student3.getPassword();
        student3.setVerified(true);
        student3.logout();
        java.lang.String str15 = student3.getPassword();
        student3.setVerified(true);
        student3.logout();
        java.lang.String str19 = student3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "student" + "'", str10, "student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test18996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18996");
        model.Student student3 = new model.Student("hi!", "", "student");
        java.lang.String str4 = student3.getPassword();
        student3.logout();
        java.lang.String str6 = student3.getEmail();
        double double7 = student3.getHourlyRate();
        student3.setVerified(false);
        double double10 = student3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
    }

    @Test
    public void test18997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18997");
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
        boolean boolean15 = student3.isVerified();
        student3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 20.0d + "'", double12 == 20.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test18998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18998");
        model.Student student3 = new model.Student("", "student", "student");
        student3.setVerified(true);
        student3.logout();
        java.lang.String str7 = student3.getEmail();
        double double8 = student3.getHourlyRate();
        double double9 = student3.getHourlyRate();
        java.lang.String str10 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "student" + "'", str10, "student");
    }

    @Test
    public void test18999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18999");
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
        boolean boolean17 = student3.isVerified();
        student3.logout();
        student3.login("hi!", "student");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "student" + "'", str10, "student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 20.0d + "'", double15 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test19000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test19000");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        double double6 = student3.getHourlyRate();
        java.lang.String str7 = student3.getPassword();
        java.lang.String str8 = student3.getPassword();
        student3.login("student", "hi!");
        student3.login("hi!", "");
        student3.login("hi!", "hi!");
        student3.setVerified(false);
        student3.viewProfile();
        student3.setVerified(true);
        java.lang.String str23 = student3.getEmail();
        student3.login("hi!", "student");
        java.lang.String str27 = student3.getPassword();
        student3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }
}

