import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest21 {

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
    public void test10501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10501");
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
        student3.login("", "hi!");
        student3.setVerified(true);
        java.lang.String str22 = student3.getID();
        java.lang.String str23 = student3.getPassword();
        boolean boolean24 = student3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test10502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10502");
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
        student3.logout();
        java.lang.String str17 = student3.getPassword();
        java.lang.String str18 = student3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 20.0d + "'", double14 == 20.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test10503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10503");
        model.Student student3 = new model.Student("student", "student", "hi!");
        java.lang.String str4 = student3.getEmail();
        java.lang.String str5 = student3.getPassword();
        student3.login("student", "");
        student3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "student" + "'", str4, "student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
    }

    @Test
    public void test10504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10504");
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
        student3.login("hi!", "");
        java.lang.String str19 = student3.getPassword();
        java.lang.Class<?> wildcardClass20 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test10505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10505");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        student3.setVerified(false);
        java.lang.String str9 = student3.getID();
        java.lang.String str10 = student3.getEmail();
        student3.logout();
        java.lang.String str12 = student3.getEmail();
        student3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test10506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10506");
        model.Student student3 = new model.Student("hi!", "hi!", "");
        double double4 = student3.getHourlyRate();
        student3.logout();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
    }

    @Test
    public void test10507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10507");
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
        student3.login("student", "");
        java.lang.String str22 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "student" + "'", str22, "student");
    }

    @Test
    public void test10508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10508");
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
        student3.login("", "student");
        student3.setVerified(true);
        java.lang.String str20 = student3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test10509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10509");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        java.lang.String str4 = student3.getAccountType();
        java.lang.String str5 = student3.getEmail();
        double double6 = student3.getHourlyRate();
        student3.viewProfile();
        java.lang.String str8 = student3.getPassword();
        java.lang.String str9 = student3.getEmail();
        java.lang.Class<?> wildcardClass10 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "student" + "'", str4, "student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test10510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10510");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getAccountType();
        java.lang.String str7 = student3.getID();
        java.lang.String str8 = student3.getID();
        boolean boolean9 = student3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test10511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10511");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        boolean boolean7 = student3.isVerified();
        java.lang.String str8 = student3.getEmail();
        student3.logout();
        double double10 = student3.getHourlyRate();
        student3.logout();
        student3.logout();
        student3.logout();
        java.lang.Class<?> wildcardClass14 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test10512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10512");
        model.Student student3 = new model.Student("hi!", "student", "");
        student3.logout();
        student3.logout();
        student3.logout();
        double double7 = student3.getHourlyRate();
        boolean boolean8 = student3.isVerified();
        boolean boolean9 = student3.isVerified();
        java.lang.Class<?> wildcardClass10 = student3.getClass();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test10513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10513");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        student3.setVerified(false);
        boolean boolean9 = student3.isVerified();
        java.lang.String str10 = student3.getEmail();
        student3.setVerified(false);
        student3.viewProfile();
        student3.login("", "student");
        java.lang.String str17 = student3.getEmail();
        java.lang.String str18 = student3.getEmail();
        java.lang.String str19 = student3.getAccountType();
        java.lang.String str20 = student3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "student" + "'", str19, "student");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test10514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10514");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        student3.setVerified(false);
        student3.viewProfile();
        double double7 = student3.getHourlyRate();
        java.lang.String str8 = student3.getID();
        java.lang.String str9 = student3.getPassword();
        java.lang.String str10 = student3.getPassword();
        student3.login("", "hi!");
        student3.setVerified(true);
        java.lang.String str16 = student3.getPassword();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test10515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10515");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        java.lang.String str4 = student3.getAccountType();
        java.lang.String str5 = student3.getID();
        student3.setVerified(true);
        student3.login("student", "student");
        double double11 = student3.getHourlyRate();
        student3.logout();
        java.lang.String str13 = student3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "student" + "'", str4, "student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test10516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10516");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getID();
        java.lang.String str6 = student3.getID();
        student3.login("", "");
        student3.setVerified(true);
        java.lang.String str12 = student3.getPassword();
        student3.login("student", "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test10517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10517");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        student3.setVerified(false);
        student3.login("student", "student");
        java.lang.String str12 = student3.getEmail();
        double double13 = student3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 20.0d + "'", double13 == 20.0d);
    }

    @Test
    public void test10518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10518");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        student3.setVerified(false);
        student3.viewProfile();
        java.lang.String str7 = student3.getEmail();
        java.lang.String str8 = student3.getAccountType();
        java.lang.String str9 = student3.getID();
        student3.setVerified(false);
        double double12 = student3.getHourlyRate();
        java.lang.String str13 = student3.getAccountType();
        double double14 = student3.getHourlyRate();
        student3.login("", "student");
        java.lang.String str18 = student3.getID();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 20.0d + "'", double12 == 20.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "student" + "'", str13, "student");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 20.0d + "'", double14 == 20.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test10519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10519");
        model.Student student3 = new model.Student("", "hi!", "hi!");
        java.lang.String str4 = student3.getAccountType();
        student3.login("student", "hi!");
        student3.viewProfile();
        student3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "student" + "'", str4, "student");
    }

    @Test
    public void test10520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10520");
        model.Student student3 = new model.Student("student", "hi!", "");
        student3.login("hi!", "hi!");
        student3.logout();
        student3.setVerified(false);
        java.lang.String str10 = student3.getAccountType();
        java.lang.String str11 = student3.getPassword();
        boolean boolean12 = student3.isVerified();
        student3.setVerified(true);
        student3.logout();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "student" + "'", str10, "student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test10521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10521");
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
        student3.login("hi!", "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 20.0d + "'", double16 == 20.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test10522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10522");
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
        double double17 = student3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 20.0d + "'", double17 == 20.0d);
    }

    @Test
    public void test10523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10523");
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
        double double16 = student3.getHourlyRate();
        double double17 = student3.getHourlyRate();
        student3.setVerified(false);
        student3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "student" + "'", str12, "student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "student" + "'", str14, "student");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 20.0d + "'", double15 == 20.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 20.0d + "'", double16 == 20.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 20.0d + "'", double17 == 20.0d);
    }

    @Test
    public void test10524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10524");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        java.lang.String str4 = student3.getAccountType();
        java.lang.String str5 = student3.getEmail();
        student3.viewProfile();
        student3.logout();
        student3.login("student", "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "student" + "'", str4, "student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test10525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10525");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        double double6 = student3.getHourlyRate();
        student3.logout();
        student3.viewProfile();
        java.lang.String str9 = student3.getEmail();
        boolean boolean10 = student3.isVerified();
        student3.viewProfile();
        student3.login("", "hi!");
        double double15 = student3.getHourlyRate();
        java.lang.String str16 = student3.getEmail();
        java.lang.String str17 = student3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 20.0d + "'", double15 == 20.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test10526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10526");
        model.Student student3 = new model.Student("", "", "hi!");
        student3.logout();
        java.lang.String str5 = student3.getID();
        boolean boolean6 = student3.isVerified();
        java.lang.String str7 = student3.getID();
        java.lang.String str8 = student3.getID();
        double double9 = student3.getHourlyRate();
        student3.viewProfile();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
    }

    @Test
    public void test10527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10527");
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
        double double18 = student3.getHourlyRate();
        java.lang.String str19 = student3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "student" + "'", str11, "student");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 20.0d + "'", double18 == 20.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test10528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10528");
        model.Student student3 = new model.Student("", "", "");
        student3.viewProfile();
        java.lang.String str5 = student3.getEmail();
        java.lang.String str6 = student3.getEmail();
        student3.logout();
        student3.setVerified(true);
        java.lang.String str10 = student3.getEmail();
        java.lang.String str11 = student3.getEmail();
        java.lang.String str12 = student3.getPassword();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test10529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10529");
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
        student3.login("hi!", "");
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
    public void test10530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10530");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        java.lang.String str8 = student3.getPassword();
        java.lang.String str9 = student3.getPassword();
        double double10 = student3.getHourlyRate();
        student3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
    }

    @Test
    public void test10531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10531");
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
        student3.login("student", "");
        boolean boolean17 = student3.isVerified();
        double double18 = student3.getHourlyRate();
        student3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "student" + "'", str11, "student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 20.0d + "'", double18 == 20.0d);
    }

    @Test
    public void test10532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10532");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        java.lang.String str4 = student3.getAccountType();
        java.lang.String str5 = student3.getID();
        student3.setVerified(true);
        student3.login("student", "student");
        java.lang.String str11 = student3.getPassword();
        student3.logout();
        double double13 = student3.getHourlyRate();
        student3.login("hi!", "");
        student3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "student" + "'", str4, "student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 20.0d + "'", double13 == 20.0d);
    }

    @Test
    public void test10533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10533");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        student3.setVerified(false);
        student3.viewProfile();
        java.lang.String str7 = student3.getEmail();
        java.lang.String str8 = student3.getAccountType();
        java.lang.String str9 = student3.getID();
        java.lang.String str10 = student3.getID();
        student3.login("hi!", "student");
        boolean boolean14 = student3.isVerified();
        student3.viewProfile();
        java.lang.String str16 = student3.getID();
        java.lang.String str17 = student3.getPassword();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test10534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10534");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        java.lang.String str7 = student3.getID();
        student3.setVerified(true);
        java.lang.String str10 = student3.getEmail();
        student3.setVerified(true);
        student3.setVerified(true);
        java.lang.String str15 = student3.getID();
        java.lang.String str16 = student3.getPassword();
        student3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test10535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10535");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        java.lang.String str6 = student3.getPassword();
        double double7 = student3.getHourlyRate();
        student3.logout();
        boolean boolean9 = student3.isVerified();
        java.lang.String str10 = student3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test10536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10536");
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
        java.lang.String str19 = student3.getID();
        java.lang.String str20 = student3.getID();
        student3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "student" + "'", str13, "student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test10537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10537");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        java.lang.String str6 = student3.getPassword();
        student3.setVerified(false);
        java.lang.String str9 = student3.getEmail();
        student3.viewProfile();
        java.lang.String str11 = student3.getAccountType();
        double double12 = student3.getHourlyRate();
        student3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "student" + "'", str11, "student");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 20.0d + "'", double12 == 20.0d);
    }

    @Test
    public void test10538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10538");
        model.Student student3 = new model.Student("hi!", "student", "");
        java.lang.String str4 = student3.getEmail();
        student3.logout();
        java.lang.String str6 = student3.getID();
        java.lang.String str7 = student3.getAccountType();
        boolean boolean8 = student3.isVerified();
        student3.viewProfile();
        student3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test10539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10539");
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
        java.lang.String str14 = student3.getEmail();
        student3.logout();
        java.lang.String str16 = student3.getAccountType();
        student3.login("student", "student");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 20.0d + "'", double13 == 20.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "student" + "'", str16, "student");
    }

    @Test
    public void test10540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10540");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        java.lang.String str8 = student3.getPassword();
        java.lang.String str9 = student3.getID();
        student3.logout();
        java.lang.String str11 = student3.getID();
        double double12 = student3.getHourlyRate();
        java.lang.String str13 = student3.getAccountType();
        java.lang.Class<?> wildcardClass14 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 20.0d + "'", double12 == 20.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "student" + "'", str13, "student");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test10541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10541");
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
        java.lang.String str16 = student3.getPassword();
        student3.login("hi!", "");
        boolean boolean20 = student3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "student" + "'", str14, "student");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test10542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10542");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        java.lang.String str6 = student3.getPassword();
        student3.setVerified(false);
        student3.setVerified(false);
        java.lang.String str11 = student3.getAccountType();
        student3.logout();
        student3.login("", "hi!");
        boolean boolean16 = student3.isVerified();
        double double17 = student3.getHourlyRate();
        student3.logout();
        java.lang.String str19 = student3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "student" + "'", str11, "student");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 20.0d + "'", double17 == 20.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test10543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10543");
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
        java.lang.String str17 = student3.getAccountType();
        java.lang.String str18 = student3.getEmail();
        boolean boolean19 = student3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 20.0d + "'", double14 == 20.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "student" + "'", str17, "student");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test10544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10544");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        student3.logout();
        student3.login("hi!", "hi!");
        double double8 = student3.getHourlyRate();
        java.lang.String str9 = student3.getID();
        student3.login("", "student");
        student3.viewProfile();
        java.lang.String str14 = student3.getEmail();
        boolean boolean15 = student3.isVerified();
        java.lang.String str16 = student3.getAccountType();
        java.lang.String str17 = student3.getID();
        java.lang.Class<?> wildcardClass18 = student3.getClass();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "student" + "'", str16, "student");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test10545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10545");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        student3.setVerified(false);
        student3.logout();
        java.lang.String str11 = student3.getEmail();
        student3.setVerified(true);
        double double14 = student3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 20.0d + "'", double14 == 20.0d);
    }

    @Test
    public void test10546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10546");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        double double6 = student3.getHourlyRate();
        java.lang.String str7 = student3.getPassword();
        student3.login("", "student");
        java.lang.String str11 = student3.getAccountType();
        java.lang.String str12 = student3.getAccountType();
        boolean boolean13 = student3.isVerified();
        student3.viewProfile();
        student3.setVerified(true);
        student3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "student" + "'", str11, "student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "student" + "'", str12, "student");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test10547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10547");
        model.Student student3 = new model.Student("", "", "hi!");
        student3.logout();
        java.lang.String str5 = student3.getID();
        java.lang.String str6 = student3.getEmail();
        student3.viewProfile();
        student3.login("hi!", "student");
        java.lang.String str11 = student3.getAccountType();
        student3.setVerified(true);
        boolean boolean14 = student3.isVerified();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "student" + "'", str11, "student");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test10548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10548");
        model.Student student3 = new model.Student("", "", "student");
        student3.login("student", "student");
        student3.setVerified(false);
        student3.setVerified(false);
        student3.viewProfile();
    }

    @Test
    public void test10549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10549");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        java.lang.String str8 = student3.getAccountType();
        java.lang.String str9 = student3.getAccountType();
        java.lang.String str10 = student3.getID();
        java.lang.String str11 = student3.getAccountType();
        boolean boolean12 = student3.isVerified();
        boolean boolean13 = student3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "student" + "'", str9, "student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "student" + "'", str11, "student");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test10550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10550");
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
        student3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "student" + "'", str4, "student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 20.0d + "'", double15 == 20.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test10551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10551");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getAccountType();
        student3.logout();
        student3.setVerified(true);
        student3.setVerified(true);
        java.lang.String str12 = student3.getPassword();
        java.lang.String str13 = student3.getEmail();
        java.lang.String str14 = student3.getID();
        java.lang.Class<?> wildcardClass15 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test10552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10552");
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
        double double18 = student3.getHourlyRate();
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
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 20.0d + "'", double18 == 20.0d);
    }

    @Test
    public void test10553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10553");
        model.Student student3 = new model.Student("", "", "");
        student3.viewProfile();
        java.lang.String str5 = student3.getEmail();
        java.lang.String str6 = student3.getEmail();
        student3.login("hi!", "hi!");
        boolean boolean10 = student3.isVerified();
        double double11 = student3.getHourlyRate();
        java.lang.String str12 = student3.getAccountType();
        java.lang.String str13 = student3.getEmail();
        java.lang.String str14 = student3.getPassword();
        java.lang.String str15 = student3.getPassword();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "student" + "'", str12, "student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test10554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10554");
        model.Student student3 = new model.Student("", "", "hi!");
        student3.logout();
        java.lang.String str5 = student3.getID();
        java.lang.String str6 = student3.getPassword();
        student3.logout();
        java.lang.String str8 = student3.getPassword();
        java.lang.String str9 = student3.getPassword();
        student3.setVerified(true);
        double double12 = student3.getHourlyRate();
        student3.viewProfile();
        student3.setVerified(false);
        boolean boolean16 = student3.isVerified();
        java.lang.String str17 = student3.getID();
        java.lang.String str18 = student3.getEmail();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 20.0d + "'", double12 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test10555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10555");
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
        student3.logout();
        student3.setVerified(true);
        boolean boolean16 = student3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test10556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10556");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        double double6 = student3.getHourlyRate();
        student3.logout();
        student3.setVerified(true);
        java.lang.String str10 = student3.getEmail();
        java.lang.String str11 = student3.getID();
        java.lang.String str12 = student3.getAccountType();
        java.lang.String str13 = student3.getID();
        student3.login("hi!", "hi!");
        java.lang.String str17 = student3.getID();
        boolean boolean18 = student3.isVerified();
        java.lang.String str19 = student3.getEmail();
        java.lang.String str20 = student3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "student" + "'", str12, "student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test10557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10557");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        java.lang.String str4 = student3.getAccountType();
        java.lang.String str5 = student3.getEmail();
        student3.viewProfile();
        double double7 = student3.getHourlyRate();
        student3.viewProfile();
        java.lang.String str9 = student3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "student" + "'", str4, "student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test10558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10558");
        model.Student student3 = new model.Student("student", "student", "hi!");
        java.lang.String str4 = student3.getEmail();
        boolean boolean5 = student3.isVerified();
        java.lang.Class<?> wildcardClass6 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "student" + "'", str4, "student");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test10559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10559");
        model.Student student3 = new model.Student("student", "", "student");
        student3.setVerified(false);
        java.lang.String str6 = student3.getAccountType();
        java.lang.String str7 = student3.getEmail();
        student3.login("", "");
        java.lang.String str11 = student3.getID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "student" + "'", str11, "student");
    }

    @Test
    public void test10560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10560");
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
        student3.login("student", "");
        student3.login("", "student");
        boolean boolean21 = student3.isVerified();
        student3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "student" + "'", str12, "student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "student" + "'", str14, "student");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test10561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10561");
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
        java.lang.String str17 = student3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "student" + "'", str16, "student");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test10562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10562");
        model.Student student3 = new model.Student("hi!", "student", "");
        java.lang.String str4 = student3.getEmail();
        student3.viewProfile();
        student3.logout();
        student3.viewProfile();
        java.lang.String str8 = student3.getPassword();
        java.lang.String str9 = student3.getEmail();
        java.lang.String str10 = student3.getPassword();
        java.lang.String str11 = student3.getAccountType();
        boolean boolean12 = student3.isVerified();
        java.lang.String str13 = student3.getPassword();
        student3.setVerified(false);
        java.lang.String str16 = student3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "student" + "'", str10, "student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "student" + "'", str11, "student");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "student" + "'", str13, "student");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test10563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10563");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        java.lang.String str7 = student3.getID();
        student3.setVerified(true);
        student3.viewProfile();
        student3.login("", "");
        student3.logout();
        java.lang.String str15 = student3.getPassword();
        student3.login("", "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test10564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10564");
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
        java.lang.String str15 = student3.getEmail();
        java.lang.String str16 = student3.getAccountType();
        java.lang.String str17 = student3.getEmail();
        student3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 20.0d + "'", double12 == 20.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 20.0d + "'", double13 == 20.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "student" + "'", str16, "student");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test10565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10565");
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
        java.lang.String str18 = student3.getPassword();
        student3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test10566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10566");
        model.Student student3 = new model.Student("student", "hi!", "hi!");
        java.lang.String str4 = student3.getEmail();
        student3.login("hi!", "hi!");
        java.lang.String str8 = student3.getPassword();
        student3.viewProfile();
        student3.viewProfile();
        boolean boolean11 = student3.isVerified();
        java.lang.String str12 = student3.getAccountType();
        java.lang.Class<?> wildcardClass13 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "student" + "'", str4, "student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "student" + "'", str12, "student");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test10567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10567");
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
        double double14 = student3.getHourlyRate();
        java.lang.String str15 = student3.getAccountType();
        student3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "student" + "'", str11, "student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "student" + "'", str12, "student");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 20.0d + "'", double14 == 20.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "student" + "'", str15, "student");
    }

    @Test
    public void test10568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10568");
        model.Student student3 = new model.Student("student", "hi!", "student");
        boolean boolean4 = student3.isVerified();
        java.lang.String str5 = student3.getAccountType();
        student3.logout();
        java.lang.String str7 = student3.getID();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
    }

    @Test
    public void test10569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10569");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        student3.setVerified(false);
        java.lang.String str9 = student3.getID();
        student3.setVerified(false);
        java.lang.String str12 = student3.getID();
        java.lang.String str13 = student3.getAccountType();
        boolean boolean14 = student3.isVerified();
        double double15 = student3.getHourlyRate();
        double double16 = student3.getHourlyRate();
        java.lang.Class<?> wildcardClass17 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "student" + "'", str13, "student");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 20.0d + "'", double15 == 20.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 20.0d + "'", double16 == 20.0d);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test10570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10570");
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
        boolean boolean16 = student3.isVerified();
        java.lang.String str17 = student3.getAccountType();
        student3.logout();
        java.lang.String str19 = student3.getID();
        java.lang.String str20 = student3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "student" + "'", str17, "student");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test10571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10571");
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
        student3.viewProfile();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 20.0d + "'", double17 == 20.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test10572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10572");
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
        java.lang.String str16 = student3.getPassword();
        boolean boolean17 = student3.isVerified();
        student3.login("hi!", "student");
        java.lang.String str21 = student3.getID();
        java.lang.String str22 = student3.getEmail();
        java.lang.String str23 = student3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "student" + "'", str11, "student");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test10573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10573");
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
        student3.setVerified(true);
        double double21 = student3.getHourlyRate();
        java.lang.String str22 = student3.getID();
        student3.viewProfile();
        java.lang.String str24 = student3.getID();
        student3.login("", "student");
        student3.setVerified(true);
        student3.setVerified(false);
        java.lang.Class<?> wildcardClass32 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 20.0d + "'", double21 == 20.0d);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test10574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10574");
        model.Student student3 = new model.Student("", "student", "");
        student3.login("student", "");
        double double7 = student3.getHourlyRate();
        student3.setVerified(false);
        student3.login("hi!", "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
    }

    @Test
    public void test10575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10575");
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
        java.lang.String str14 = student3.getAccountType();
        student3.login("hi!", "hi!");
        student3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "student" + "'", str11, "student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "student" + "'", str14, "student");
    }

    @Test
    public void test10576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10576");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        boolean boolean7 = student3.isVerified();
        student3.logout();
        student3.logout();
        double double10 = student3.getHourlyRate();
        java.lang.String str11 = student3.getPassword();
        student3.setVerified(false);
        java.lang.String str14 = student3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test10577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10577");
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
        boolean boolean21 = student3.isVerified();
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
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test10578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10578");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        java.lang.String str6 = student3.getPassword();
        java.lang.String str7 = student3.getPassword();
        java.lang.String str8 = student3.getEmail();
        java.lang.String str9 = student3.getID();
        boolean boolean10 = student3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test10579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10579");
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
        java.lang.String str17 = student3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "student" + "'", str13, "student");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test10580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10580");
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
        student3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "student" + "'", str4, "student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "student" + "'", str11, "student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test10581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10581");
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
        java.lang.String str19 = student3.getAccountType();
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "student" + "'", str19, "student");
    }

    @Test
    public void test10582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10582");
        model.Student student3 = new model.Student("", "", "");
        student3.viewProfile();
        java.lang.String str5 = student3.getEmail();
        java.lang.String str6 = student3.getEmail();
        student3.logout();
        student3.setVerified(true);
        java.lang.String str10 = student3.getEmail();
        java.lang.String str11 = student3.getEmail();
        java.lang.String str12 = student3.getID();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test10583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10583");
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
        java.lang.String str27 = student3.getPassword();
        java.lang.Class<?> wildcardClass28 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "student" + "'", str10, "student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "student" + "'", str23, "student");
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 20.0d + "'", double26 == 20.0d);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test10584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10584");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        student3.logout();
        student3.login("hi!", "hi!");
        student3.viewProfile();
        java.lang.String str9 = student3.getID();
        student3.login("", "");
        student3.viewProfile();
        java.lang.String str14 = student3.getEmail();
        double double15 = student3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 20.0d + "'", double15 == 20.0d);
    }

    @Test
    public void test10585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10585");
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
        boolean boolean27 = student3.isVerified();
        student3.login("student", "student");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 20.0d + "'", double18 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test10586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10586");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        double double6 = student3.getHourlyRate();
        student3.setVerified(true);
        java.lang.String str9 = student3.getID();
        boolean boolean10 = student3.isVerified();
        student3.setVerified(false);
        student3.logout();
        student3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test10587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10587");
        model.Student student3 = new model.Student("", "", "hi!");
        student3.logout();
        java.lang.String str5 = student3.getID();
        java.lang.String str6 = student3.getEmail();
        java.lang.String str7 = student3.getPassword();
        java.lang.String str8 = student3.getID();
        student3.logout();
        java.lang.String str10 = student3.getAccountType();
        student3.setVerified(false);
        student3.logout();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "student" + "'", str10, "student");
    }

    @Test
    public void test10588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10588");
        model.Student student3 = new model.Student("", "student", "student");
        student3.setVerified(true);
        java.lang.String str6 = student3.getPassword();
        boolean boolean7 = student3.isVerified();
        double double8 = student3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
    }

    @Test
    public void test10589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10589");
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
        student3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "student" + "'", str13, "student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "student" + "'", str14, "student");
    }

    @Test
    public void test10590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10590");
        model.Student student3 = new model.Student("hi!", "student", "");
        java.lang.String str4 = student3.getEmail();
        student3.logout();
        java.lang.String str6 = student3.getID();
        java.lang.String str7 = student3.getEmail();
        java.lang.String str8 = student3.getID();
        student3.login("hi!", "hi!");
        student3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test10591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10591");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        double double6 = student3.getHourlyRate();
        java.lang.String str7 = student3.getID();
        boolean boolean8 = student3.isVerified();
        student3.setVerified(true);
        student3.setVerified(true);
        student3.viewProfile();
        java.lang.String str14 = student3.getID();
        student3.logout();
        student3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test10592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10592");
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
        boolean boolean17 = student3.isVerified();
        student3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test10593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10593");
        model.Student student3 = new model.Student("hi!", "student", "");
        java.lang.String str4 = student3.getEmail();
        student3.viewProfile();
        student3.viewProfile();
        java.lang.String str7 = student3.getEmail();
        student3.login("hi!", "");
        student3.viewProfile();
        java.lang.String str12 = student3.getEmail();
        java.lang.String str13 = student3.getEmail();
        student3.login("", "");
        java.lang.String str17 = student3.getID();
        student3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test10594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10594");
        model.Student student3 = new model.Student("", "", "hi!");
        student3.logout();
        java.lang.String str5 = student3.getID();
        java.lang.String str6 = student3.getEmail();
        double double7 = student3.getHourlyRate();
        boolean boolean8 = student3.isVerified();
        java.lang.String str9 = student3.getID();
        java.lang.String str10 = student3.getAccountType();
        student3.logout();
        student3.viewProfile();
        student3.logout();
        student3.setVerified(false);
        java.lang.String str16 = student3.getID();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "student" + "'", str10, "student");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test10595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10595");
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
        java.lang.String str17 = student3.getID();
        student3.setVerified(false);
        double double20 = student3.getHourlyRate();
        java.lang.String str21 = student3.getEmail();
        java.lang.Class<?> wildcardClass22 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "student" + "'", str10, "student");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "student" + "'", str16, "student");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 20.0d + "'", double20 == 20.0d);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test10596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10596");
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
        student3.viewProfile();
        student3.setVerified(false);
        student3.viewProfile();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test10597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10597");
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
        student3.login("", "");
        java.lang.String str16 = student3.getPassword();
        java.lang.String str17 = student3.getPassword();
        student3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test10598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10598");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        java.lang.String str8 = student3.getAccountType();
        student3.logout();
        java.lang.String str10 = student3.getPassword();
        java.lang.String str11 = student3.getID();
        java.lang.String str12 = student3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test10599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10599");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        java.lang.String str8 = student3.getPassword();
        student3.logout();
        student3.login("", "");
        student3.viewProfile();
        student3.setVerified(true);
        java.lang.String str16 = student3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test10600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10600");
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
        student3.setVerified(false);
        boolean boolean18 = student3.isVerified();
        double double19 = student3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "student" + "'", str15, "student");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 20.0d + "'", double19 == 20.0d);
    }

    @Test
    public void test10601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10601");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        boolean boolean7 = student3.isVerified();
        student3.login("", "hi!");
        java.lang.String str11 = student3.getEmail();
        student3.login("", "hi!");
        java.lang.String str15 = student3.getAccountType();
        java.lang.Class<?> wildcardClass16 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "student" + "'", str15, "student");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test10602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10602");
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
        double double15 = student3.getHourlyRate();
        java.lang.String str16 = student3.getAccountType();
        java.lang.String str17 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "student" + "'", str13, "student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 20.0d + "'", double15 == 20.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "student" + "'", str16, "student");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "student" + "'", str17, "student");
    }

    @Test
    public void test10603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10603");
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
        student3.login("hi!", "");
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
    public void test10604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10604");
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
        student3.logout();
        student3.login("hi!", "student");
        student3.viewProfile();
        student3.login("", "hi!");
        java.lang.String str22 = student3.getPassword();
        java.lang.String str23 = student3.getPassword();
        java.lang.String str24 = student3.getID();
        student3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
    }

    @Test
    public void test10605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10605");
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
        double double18 = student3.getHourlyRate();
        double double19 = student3.getHourlyRate();
        boolean boolean20 = student3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 20.0d + "'", double18 == 20.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 20.0d + "'", double19 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test10606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10606");
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
        student3.viewProfile();
        java.lang.String str17 = student3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "student" + "'", str15, "student");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test10607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10607");
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
        boolean boolean22 = student3.isVerified();
        student3.setVerified(false);
        java.lang.String str25 = student3.getPassword();
        double double26 = student3.getHourlyRate();
        student3.setVerified(false);
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 20.0d + "'", double26 == 20.0d);
    }

    @Test
    public void test10608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10608");
        model.Student student3 = new model.Student("", "", "hi!");
        student3.logout();
        student3.logout();
        java.lang.String str6 = student3.getAccountType();
        java.lang.String str7 = student3.getPassword();
        student3.setVerified(true);
        java.lang.String str10 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "student" + "'", str10, "student");
    }

    @Test
    public void test10609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10609");
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
        student3.login("student", "hi!");
        student3.viewProfile();
        java.lang.String str20 = student3.getEmail();
        student3.login("hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test10610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10610");
        model.Student student3 = new model.Student("hi!", "student", "");
        java.lang.String str4 = student3.getEmail();
        student3.logout();
        java.lang.String str6 = student3.getID();
        java.lang.String str7 = student3.getEmail();
        java.lang.String str8 = student3.getPassword();
        java.lang.String str9 = student3.getAccountType();
        java.lang.Class<?> wildcardClass10 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "student" + "'", str9, "student");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test10611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10611");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        student3.logout();
        student3.login("hi!", "hi!");
        double double8 = student3.getHourlyRate();
        boolean boolean9 = student3.isVerified();
        java.lang.String str10 = student3.getAccountType();
        java.lang.String str11 = student3.getPassword();
        java.lang.String str12 = student3.getID();
        java.lang.String str13 = student3.getPassword();
        java.lang.String str14 = student3.getID();
        java.lang.String str15 = student3.getEmail();
        boolean boolean16 = student3.isVerified();
        java.lang.String str17 = student3.getPassword();
        java.lang.String str18 = student3.getEmail();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "student" + "'", str10, "student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test10612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10612");
        model.Student student3 = new model.Student("", "", "hi!");
        student3.logout();
        student3.setVerified(false);
        java.lang.String str7 = student3.getAccountType();
        java.lang.String str8 = student3.getEmail();
        student3.login("hi!", "student");
        boolean boolean12 = student3.isVerified();
        student3.login("hi!", "");
        student3.logout();
        java.lang.String str17 = student3.getID();
        java.lang.String str18 = student3.getID();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test10613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10613");
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
        java.lang.String str21 = student3.getPassword();
        java.lang.String str22 = student3.getID();
        double double23 = student3.getHourlyRate();
        java.lang.String str24 = student3.getAccountType();
        student3.logout();
        boolean boolean26 = student3.isVerified();
        java.lang.String str27 = student3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "student" + "'", str20, "student");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 20.0d + "'", double23 == 20.0d);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "student" + "'", str24, "student");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test10614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10614");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        student3.setVerified(false);
        java.lang.String str6 = student3.getPassword();
        java.lang.String str7 = student3.getAccountType();
        student3.viewProfile();
        student3.login("", "hi!");
        java.lang.String str12 = student3.getPassword();
        java.lang.String str13 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "student" + "'", str13, "student");
    }

    @Test
    public void test10615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10615");
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
        double double17 = student3.getHourlyRate();
        boolean boolean18 = student3.isVerified();
        java.lang.String str19 = student3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "student" + "'", str15, "student");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 20.0d + "'", double17 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test10616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10616");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        double double6 = student3.getHourlyRate();
        java.lang.String str7 = student3.getID();
        boolean boolean8 = student3.isVerified();
        student3.setVerified(true);
        student3.setVerified(true);
        java.lang.String str13 = student3.getEmail();
        student3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test10617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10617");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        java.lang.String str4 = student3.getAccountType();
        java.lang.String str5 = student3.getEmail();
        student3.viewProfile();
        java.lang.String str7 = student3.getPassword();
        java.lang.String str8 = student3.getID();
        student3.login("student", "hi!");
        student3.setVerified(false);
        java.lang.String str14 = student3.getAccountType();
        student3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "student" + "'", str4, "student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "student" + "'", str14, "student");
    }

    @Test
    public void test10618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10618");
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
        java.lang.Class<?> wildcardClass18 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "student" + "'", str11, "student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test10619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10619");
        model.Student student3 = new model.Student("", "hi!", "hi!");
        java.lang.String str4 = student3.getAccountType();
        student3.login("student", "hi!");
        student3.setVerified(true);
        boolean boolean10 = student3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "student" + "'", str4, "student");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test10620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10620");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        java.lang.String str4 = student3.getAccountType();
        java.lang.String str5 = student3.getEmail();
        student3.viewProfile();
        student3.setVerified(true);
        double double9 = student3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "student" + "'", str4, "student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
    }

    @Test
    public void test10621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10621");
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
        student3.setVerified(false);
        boolean boolean21 = student3.isVerified();
        student3.login("", "student");
        student3.logout();
        student3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test10622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10622");
        model.Student student3 = new model.Student("", "", "hi!");
        student3.logout();
        java.lang.String str5 = student3.getID();
        java.lang.String str6 = student3.getEmail();
        double double7 = student3.getHourlyRate();
        boolean boolean8 = student3.isVerified();
        java.lang.String str9 = student3.getID();
        student3.setVerified(true);
        student3.viewProfile();
        student3.logout();
        student3.login("student", "student");
        boolean boolean17 = student3.isVerified();
        java.lang.String str18 = student3.getEmail();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test10623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10623");
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
        java.lang.String str26 = student3.getPassword();
        student3.logout();
        double double28 = student3.getHourlyRate();
        student3.viewProfile();
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
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 20.0d + "'", double28 == 20.0d);
    }

    @Test
    public void test10624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10624");
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
        java.lang.String str27 = student3.getEmail();
        java.lang.String str28 = student3.getAccountType();
        student3.viewProfile();
        java.lang.String str30 = student3.getID();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 20.0d + "'", double14 == 20.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "student" + "'", str15, "student");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "student" + "'", str28, "student");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
    }

    @Test
    public void test10625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10625");
        model.Student student3 = new model.Student("", "", "student");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getPassword();
        boolean boolean6 = student3.isVerified();
        java.lang.String str7 = student3.getEmail();
        student3.setVerified(false);
        java.lang.String str10 = student3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "student" + "'", str4, "student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test10626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10626");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getEmail();
        boolean boolean6 = student3.isVerified();
        student3.setVerified(false);
        student3.viewProfile();
        student3.logout();
        student3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test10627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10627");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getAccountType();
        java.lang.String str7 = student3.getAccountType();
        java.lang.String str8 = student3.getPassword();
        double double9 = student3.getHourlyRate();
        student3.setVerified(true);
        student3.login("student", "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
    }

    @Test
    public void test10628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10628");
        model.Student student3 = new model.Student("", "", "hi!");
        student3.logout();
        java.lang.String str5 = student3.getID();
        java.lang.String str6 = student3.getEmail();
        double double7 = student3.getHourlyRate();
        java.lang.String str8 = student3.getEmail();
        java.lang.String str9 = student3.getID();
        java.lang.String str10 = student3.getID();
        student3.logout();
        boolean boolean12 = student3.isVerified();
        java.lang.String str13 = student3.getID();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test10629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10629");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        java.lang.String str4 = student3.getAccountType();
        java.lang.String str5 = student3.getID();
        student3.setVerified(true);
        student3.login("student", "student");
        double double11 = student3.getHourlyRate();
        double double12 = student3.getHourlyRate();
        java.lang.String str13 = student3.getAccountType();
        double double14 = student3.getHourlyRate();
        java.lang.String str15 = student3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "student" + "'", str4, "student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 20.0d + "'", double12 == 20.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "student" + "'", str13, "student");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 20.0d + "'", double14 == 20.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test10630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10630");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.login("", "");
        student3.login("student", "student");
        java.lang.String str13 = student3.getAccountType();
        student3.login("", "hi!");
        student3.viewProfile();
        student3.logout();
        java.lang.Class<?> wildcardClass19 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "student" + "'", str13, "student");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test10631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10631");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getAccountType();
        student3.logout();
        boolean boolean8 = student3.isVerified();
        student3.setVerified(true);
        student3.setVerified(false);
        boolean boolean13 = student3.isVerified();
        boolean boolean14 = student3.isVerified();
        student3.login("hi!", "");
        student3.viewProfile();
        java.lang.Class<?> wildcardClass19 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test10632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10632");
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
        student3.setVerified(true);
        student3.logout();
        boolean boolean16 = student3.isVerified();
        java.lang.String str17 = student3.getEmail();
        java.lang.String str18 = student3.getID();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test10633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10633");
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
        java.lang.String str13 = student3.getID();
        boolean boolean14 = student3.isVerified();
        student3.login("", "hi!");
        java.lang.Class<?> wildcardClass18 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test10634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10634");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        student3.logout();
        student3.login("hi!", "hi!");
        student3.viewProfile();
        java.lang.String str9 = student3.getPassword();
        student3.viewProfile();
        java.lang.String str11 = student3.getPassword();
        student3.login("", "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test10635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10635");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        student3.setVerified(false);
        java.lang.String str6 = student3.getPassword();
        java.lang.String str7 = student3.getID();
        student3.login("", "hi!");
        java.lang.String str11 = student3.getID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test10636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10636");
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
        java.lang.String str16 = student3.getPassword();
        student3.login("student", "");
        student3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "student" + "'", str10, "student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "student" + "'", str11, "student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 20.0d + "'", double15 == 20.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test10637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10637");
        model.Student student3 = new model.Student("", "", "hi!");
        student3.logout();
        java.lang.String str5 = student3.getID();
        java.lang.String str6 = student3.getEmail();
        double double7 = student3.getHourlyRate();
        java.lang.String str8 = student3.getPassword();
        student3.login("hi!", "hi!");
        java.lang.String str12 = student3.getID();
        java.lang.String str13 = student3.getEmail();
        student3.login("student", "student");
        student3.logout();
        student3.login("hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test10638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10638");
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
        java.lang.String str19 = student3.getID();
        student3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "student" + "'", str10, "student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test10639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10639");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        java.lang.String str4 = student3.getPassword();
        double double5 = student3.getHourlyRate();
        double double6 = student3.getHourlyRate();
        java.lang.String str7 = student3.getID();
        java.lang.String str8 = student3.getPassword();
        java.lang.String str9 = student3.getPassword();
        student3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test10640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10640");
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
        java.lang.String str16 = student3.getEmail();
        student3.logout();
        java.lang.Class<?> wildcardClass18 = student3.getClass();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "student" + "'", str10, "student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "student" + "'", str11, "student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test10641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10641");
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
        java.lang.String str15 = student3.getEmail();
        student3.login("", "hi!");
        java.lang.String str19 = student3.getEmail();
        java.lang.String str20 = student3.getEmail();
        java.lang.String str21 = student3.getPassword();
        double double22 = student3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 20.0d + "'", double22 == 20.0d);
    }

    @Test
    public void test10642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10642");
        model.Student student3 = new model.Student("", "", "hi!");
        student3.logout();
        java.lang.String str5 = student3.getID();
        java.lang.String str6 = student3.getEmail();
        student3.viewProfile();
        student3.login("hi!", "student");
        java.lang.String str11 = student3.getEmail();
        java.lang.String str12 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "student" + "'", str12, "student");
    }

    @Test
    public void test10643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10643");
        model.Student student3 = new model.Student("", "", "");
        double double4 = student3.getHourlyRate();
        double double5 = student3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
    }

    @Test
    public void test10644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10644");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        student3.logout();
        student3.login("hi!", "hi!");
        double double8 = student3.getHourlyRate();
        boolean boolean9 = student3.isVerified();
        java.lang.String str10 = student3.getAccountType();
        java.lang.String str11 = student3.getAccountType();
        double double12 = student3.getHourlyRate();
        double double13 = student3.getHourlyRate();
        student3.setVerified(true);
        double double16 = student3.getHourlyRate();
        boolean boolean17 = student3.isVerified();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "student" + "'", str10, "student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "student" + "'", str11, "student");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 20.0d + "'", double12 == 20.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 20.0d + "'", double13 == 20.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 20.0d + "'", double16 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test10645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10645");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        student3.logout();
        student3.login("hi!", "hi!");
        double double8 = student3.getHourlyRate();
        student3.login("", "hi!");
        double double12 = student3.getHourlyRate();
        double double13 = student3.getHourlyRate();
        student3.login("hi!", "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 20.0d + "'", double12 == 20.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 20.0d + "'", double13 == 20.0d);
    }

    @Test
    public void test10646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10646");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        student3.setVerified(false);
        student3.viewProfile();
        java.lang.String str7 = student3.getEmail();
        double double8 = student3.getHourlyRate();
        java.lang.String str9 = student3.getID();
        student3.logout();
        student3.setVerified(true);
        java.lang.String str13 = student3.getAccountType();
        java.lang.String str14 = student3.getID();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "student" + "'", str13, "student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test10647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10647");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        student3.login("", "student");
        student3.login("hi!", "hi!");
        java.lang.String str13 = student3.getAccountType();
        java.lang.String str14 = student3.getEmail();
        student3.setVerified(false);
        student3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "student" + "'", str13, "student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test10648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10648");
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
        double double16 = student3.getHourlyRate();
        java.lang.String str17 = student3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 20.0d + "'", double13 == 20.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 20.0d + "'", double16 == 20.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test10649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10649");
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
        java.lang.String str14 = student3.getEmail();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test10650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10650");
        model.Student student3 = new model.Student("hi!", "hi!", "");
        student3.logout();
        java.lang.String str5 = student3.getEmail();
        java.lang.String str6 = student3.getAccountType();
        student3.login("student", "student");
        boolean boolean10 = student3.isVerified();
        student3.setVerified(false);
        double double13 = student3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 20.0d + "'", double13 == 20.0d);
    }

    @Test
    public void test10651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10651");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getID();
        java.lang.String str6 = student3.getPassword();
        student3.logout();
        boolean boolean8 = student3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test10652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10652");
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
        java.lang.String str17 = student3.getID();
        java.lang.String str18 = student3.getEmail();
        java.lang.String str19 = student3.getID();
        double double20 = student3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 20.0d + "'", double13 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 20.0d + "'", double20 == 20.0d);
    }

    @Test
    public void test10653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10653");
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
        java.lang.String str19 = student3.getEmail();
        double double20 = student3.getHourlyRate();
        java.lang.String str21 = student3.getID();
        student3.login("student", "student");
        java.lang.String str25 = student3.getAccountType();
        student3.viewProfile();
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 20.0d + "'", double20 == 20.0d);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "student" + "'", str25, "student");
    }

    @Test
    public void test10654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10654");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getAccountType();
        student3.logout();
        java.lang.String str8 = student3.getEmail();
        student3.viewProfile();
        java.lang.String str10 = student3.getAccountType();
        java.lang.String str11 = student3.getEmail();
        java.lang.String str12 = student3.getAccountType();
        java.lang.String str13 = student3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "student" + "'", str10, "student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "student" + "'", str12, "student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test10655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10655");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        java.lang.String str7 = student3.getID();
        student3.setVerified(true);
        java.lang.String str10 = student3.getEmail();
        java.lang.String str11 = student3.getPassword();
        boolean boolean12 = student3.isVerified();
        java.lang.String str13 = student3.getID();
        double double14 = student3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 20.0d + "'", double14 == 20.0d);
    }

    @Test
    public void test10656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10656");
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
        student3.login("hi!", "student");
        java.lang.Class<?> wildcardClass19 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test10657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10657");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        java.lang.String str4 = student3.getAccountType();
        java.lang.String str5 = student3.getID();
        student3.setVerified(true);
        java.lang.String str8 = student3.getAccountType();
        student3.viewProfile();
        java.lang.String str10 = student3.getPassword();
        java.lang.String str11 = student3.getPassword();
        student3.logout();
        student3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "student" + "'", str4, "student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test10658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10658");
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
        java.lang.String str14 = student3.getEmail();
        student3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "student" + "'", str11, "student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test10659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10659");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        double double8 = student3.getHourlyRate();
        boolean boolean9 = student3.isVerified();
        student3.logout();
        student3.viewProfile();
        java.lang.String str12 = student3.getPassword();
        java.lang.String str13 = student3.getEmail();
        student3.setVerified(true);
        student3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test10660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10660");
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
        boolean boolean14 = student3.isVerified();
        student3.setVerified(true);
        double double17 = student3.getHourlyRate();
        java.lang.String str18 = student3.getAccountType();
        student3.setVerified(false);
        student3.login("student", "hi!");
        java.lang.Class<?> wildcardClass24 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 20.0d + "'", double12 == 20.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 20.0d + "'", double17 == 20.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "student" + "'", str18, "student");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test10661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10661");
        model.Student student3 = new model.Student("hi!", "hi!", "");
        student3.viewProfile();
        student3.viewProfile();
        student3.login("student", "hi!");
    }

    @Test
    public void test10662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10662");
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
        java.lang.String str16 = student3.getPassword();
        double double17 = student3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 20.0d + "'", double17 == 20.0d);
    }

    @Test
    public void test10663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10663");
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
        boolean boolean24 = student3.isVerified();
        java.lang.String str25 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 20.0d + "'", double18 == 20.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "student" + "'", str25, "student");
    }

    @Test
    public void test10664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10664");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        student3.setVerified(false);
        java.lang.String str10 = student3.getEmail();
        student3.viewProfile();
        java.lang.String str12 = student3.getEmail();
        student3.viewProfile();
        student3.viewProfile();
        java.lang.String str15 = student3.getEmail();
        java.lang.String str16 = student3.getEmail();
        java.lang.String str17 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "student" + "'", str17, "student");
    }

    @Test
    public void test10665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10665");
        model.Student student3 = new model.Student("", "", "hi!");
        student3.logout();
        java.lang.String str5 = student3.getID();
        java.lang.String str6 = student3.getEmail();
        student3.viewProfile();
        student3.setVerified(false);
        java.lang.String str10 = student3.getID();
        java.lang.String str11 = student3.getAccountType();
        java.lang.String str12 = student3.getAccountType();
        student3.logout();
        java.lang.String str14 = student3.getID();
        java.lang.String str15 = student3.getEmail();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "student" + "'", str11, "student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "student" + "'", str12, "student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test10666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10666");
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
        java.lang.String str14 = student3.getAccountType();
        java.lang.String str15 = student3.getID();
        student3.logout();
        java.lang.String str17 = student3.getEmail();
        java.lang.String str18 = student3.getAccountType();
        double double19 = student3.getHourlyRate();
        student3.setVerified(false);
        java.lang.String str22 = student3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "student" + "'", str11, "student");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "student" + "'", str14, "student");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "student" + "'", str18, "student");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 20.0d + "'", double19 == 20.0d);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test10667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10667");
        model.Student student3 = new model.Student("hi!", "hi!", "hi!");
        student3.login("hi!", "student");
        student3.logout();
        java.lang.String str8 = student3.getPassword();
        student3.viewProfile();
        java.lang.String str10 = student3.getAccountType();
        java.lang.String str11 = student3.getEmail();
        java.lang.String str12 = student3.getEmail();
        double double13 = student3.getHourlyRate();
        java.lang.Class<?> wildcardClass14 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "student" + "'", str10, "student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 20.0d + "'", double13 == 20.0d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test10668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10668");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        java.lang.String str7 = student3.getID();
        student3.setVerified(true);
        java.lang.String str10 = student3.getAccountType();
        student3.login("hi!", "student");
        double double14 = student3.getHourlyRate();
        student3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "student" + "'", str10, "student");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 20.0d + "'", double14 == 20.0d);
    }

    @Test
    public void test10669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10669");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        student3.logout();
        student3.login("hi!", "hi!");
        student3.viewProfile();
        java.lang.String str9 = student3.getPassword();
        java.lang.String str10 = student3.getID();
        java.lang.String str11 = student3.getAccountType();
        java.lang.String str12 = student3.getEmail();
        student3.setVerified(true);
        double double15 = student3.getHourlyRate();
        java.lang.String str16 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "student" + "'", str11, "student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 20.0d + "'", double15 == 20.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "student" + "'", str16, "student");
    }

    @Test
    public void test10670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10670");
        model.Student student3 = new model.Student("", "", "hi!");
        student3.login("", "");
        java.lang.String str7 = student3.getPassword();
        java.lang.String str8 = student3.getEmail();
        student3.logout();
        java.lang.String str10 = student3.getEmail();
        java.lang.String str11 = student3.getID();
        java.lang.String str12 = student3.getPassword();
        java.lang.String str13 = student3.getPassword();
        student3.logout();
        java.lang.String str15 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "student" + "'", str15, "student");
    }

    @Test
    public void test10671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10671");
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
        java.lang.String str19 = student3.getID();
        java.lang.String str20 = student3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test10672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10672");
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
        java.lang.String str20 = student3.getEmail();
        student3.login("", "student");
        java.lang.String str24 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 20.0d + "'", double16 == 20.0d);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "student" + "'", str24, "student");
    }

    @Test
    public void test10673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10673");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        student3.setVerified(false);
        student3.viewProfile();
        java.lang.String str7 = student3.getEmail();
        java.lang.String str8 = student3.getAccountType();
        student3.logout();
        student3.login("", "");
        student3.logout();
        java.lang.String str14 = student3.getPassword();
        java.lang.String str15 = student3.getID();
        java.lang.String str16 = student3.getPassword();
        java.lang.String str17 = student3.getPassword();
        double double18 = student3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 20.0d + "'", double18 == 20.0d);
    }

    @Test
    public void test10674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10674");
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
        boolean boolean28 = student3.isVerified();
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
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test10675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10675");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getID();
        java.lang.String str6 = student3.getID();
        student3.login("", "");
        student3.setVerified(true);
        java.lang.String str12 = student3.getPassword();
        java.lang.Class<?> wildcardClass13 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test10676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10676");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        student3.login("", "student");
        java.lang.String str10 = student3.getEmail();
        boolean boolean11 = student3.isVerified();
        java.lang.String str12 = student3.getAccountType();
        double double13 = student3.getHourlyRate();
        java.lang.String str14 = student3.getID();
        java.lang.String str15 = student3.getPassword();
        student3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "student" + "'", str12, "student");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 20.0d + "'", double13 == 20.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test10677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10677");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getAccountType();
        student3.logout();
        java.lang.String str8 = student3.getAccountType();
        double double9 = student3.getHourlyRate();
        java.lang.String str10 = student3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test10678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10678");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        student3.logout();
        student3.login("hi!", "hi!");
        double double8 = student3.getHourlyRate();
        java.lang.String str9 = student3.getID();
        student3.logout();
        java.lang.String str11 = student3.getID();
        student3.viewProfile();
        student3.setVerified(false);
        java.lang.Class<?> wildcardClass15 = student3.getClass();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test10679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10679");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getAccountType();
        student3.logout();
        boolean boolean8 = student3.isVerified();
        student3.setVerified(true);
        boolean boolean11 = student3.isVerified();
        student3.login("", "student");
        java.lang.String str15 = student3.getEmail();
        student3.setVerified(false);
        student3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test10680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10680");
        model.Student student3 = new model.Student("", "student", "");
        student3.setVerified(true);
        student3.login("", "hi!");
        boolean boolean9 = student3.isVerified();
        double double10 = student3.getHourlyRate();
        student3.setVerified(false);
        boolean boolean13 = student3.isVerified();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test10681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10681");
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
        double double18 = student3.getHourlyRate();
        java.lang.String str19 = student3.getID();
        student3.logout();
        student3.setVerified(true);
        java.lang.String str23 = student3.getPassword();
        student3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "student" + "'", str11, "student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 20.0d + "'", double18 == 20.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test10682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10682");
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
        double double16 = student3.getHourlyRate();
        student3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "student" + "'", str12, "student");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 20.0d + "'", double16 == 20.0d);
    }

    @Test
    public void test10683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10683");
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
        student3.viewProfile();
        java.lang.String str25 = student3.getAccountType();
        java.lang.String str26 = student3.getAccountType();
        student3.login("", "");
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
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "student" + "'", str25, "student");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "student" + "'", str26, "student");
    }

    @Test
    public void test10684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10684");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getEmail();
        boolean boolean6 = student3.isVerified();
        student3.setVerified(false);
        student3.viewProfile();
        java.lang.String str10 = student3.getEmail();
        java.lang.String str11 = student3.getPassword();
        student3.login("hi!", "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test10685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10685");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getEmail();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        student3.login("hi!", "student");
        student3.setVerified(false);
        student3.viewProfile();
        student3.setVerified(true);
        java.lang.String str16 = student3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test10686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10686");
        model.Student student3 = new model.Student("hi!", "hi!", "student");
        student3.login("hi!", "student");
        java.lang.String str7 = student3.getEmail();
        student3.login("student", "student");
        java.lang.String str11 = student3.getEmail();
        java.lang.String str12 = student3.getID();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "student" + "'", str12, "student");
    }

    @Test
    public void test10687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10687");
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
        java.lang.String str15 = student3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "student" + "'", str11, "student");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test10688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10688");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        student3.logout();
        student3.login("hi!", "hi!");
        double double8 = student3.getHourlyRate();
        java.lang.String str9 = student3.getID();
        java.lang.String str10 = student3.getEmail();
        student3.setVerified(true);
        student3.setVerified(true);
        java.lang.Class<?> wildcardClass15 = student3.getClass();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test10689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10689");
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
        java.lang.String str18 = student3.getPassword();
        student3.login("hi!", "hi!");
        java.lang.Class<?> wildcardClass22 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "student" + "'", str11, "student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test10690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10690");
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
        java.lang.String str17 = student3.getPassword();
        double double18 = student3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 20.0d + "'", double18 == 20.0d);
    }

    @Test
    public void test10691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10691");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getID();
        java.lang.String str6 = student3.getPassword();
        java.lang.String str7 = student3.getEmail();
        java.lang.String str8 = student3.getEmail();
        student3.viewProfile();
        double double10 = student3.getHourlyRate();
        java.lang.String str11 = student3.getEmail();
        java.lang.String str12 = student3.getID();
        java.lang.String str13 = student3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test10692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10692");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        java.lang.String str7 = student3.getID();
        student3.login("hi!", "");
        java.lang.String str11 = student3.getPassword();
        boolean boolean12 = student3.isVerified();
        java.lang.String str13 = student3.getEmail();
        boolean boolean14 = student3.isVerified();
        java.lang.Class<?> wildcardClass15 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test10693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10693");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        student3.setVerified(false);
        student3.viewProfile();
        java.lang.String str7 = student3.getEmail();
        java.lang.String str8 = student3.getAccountType();
        student3.logout();
        boolean boolean10 = student3.isVerified();
        java.lang.String str11 = student3.getEmail();
        java.lang.String str12 = student3.getID();
        student3.login("", "");
        student3.login("", "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test10694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10694");
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
        java.lang.String str21 = student3.getID();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "student" + "'", str10, "student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test10695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10695");
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
        java.lang.String str21 = student3.getAccountType();
        boolean boolean22 = student3.isVerified();
        student3.logout();
        student3.setVerified(true);
        double double26 = student3.getHourlyRate();
        java.lang.String str27 = student3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "student" + "'", str20, "student");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "student" + "'", str21, "student");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 20.0d + "'", double26 == 20.0d);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test10696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10696");
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
        java.lang.String str17 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "student" + "'", str17, "student");
    }

    @Test
    public void test10697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10697");
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
        java.lang.String str14 = student3.getAccountType();
        java.lang.String str15 = student3.getEmail();
        double double16 = student3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "student" + "'", str11, "student");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "student" + "'", str14, "student");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 20.0d + "'", double16 == 20.0d);
    }

    @Test
    public void test10698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10698");
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
        student3.setVerified(true);
        student3.viewProfile();
        double double20 = student3.getHourlyRate();
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
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 20.0d + "'", double20 == 20.0d);
    }

    @Test
    public void test10699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10699");
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
        boolean boolean14 = student3.isVerified();
        boolean boolean15 = student3.isVerified();
        double double16 = student3.getHourlyRate();
        java.lang.String str17 = student3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 20.0d + "'", double16 == 20.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test10700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10700");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        java.lang.String str7 = student3.getID();
        java.lang.String str8 = student3.getEmail();
        student3.login("", "");
        student3.logout();
        boolean boolean13 = student3.isVerified();
        student3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test10701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10701");
        model.Student student3 = new model.Student("", "", "hi!");
        student3.logout();
        java.lang.String str5 = student3.getID();
        java.lang.String str6 = student3.getEmail();
        double double7 = student3.getHourlyRate();
        double double8 = student3.getHourlyRate();
        student3.setVerified(false);
        java.lang.String str11 = student3.getID();
        java.lang.String str12 = student3.getID();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test10702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10702");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.login("", "");
        student3.login("student", "student");
        java.lang.String str13 = student3.getPassword();
        boolean boolean14 = student3.isVerified();
        java.lang.String str15 = student3.getAccountType();
        student3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "student" + "'", str15, "student");
    }

    @Test
    public void test10703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10703");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        java.lang.String str7 = student3.getID();
        student3.setVerified(true);
        java.lang.String str10 = student3.getEmail();
        java.lang.String str11 = student3.getEmail();
        boolean boolean12 = student3.isVerified();
        double double13 = student3.getHourlyRate();
        student3.viewProfile();
        java.lang.String str15 = student3.getAccountType();
        student3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 20.0d + "'", double13 == 20.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "student" + "'", str15, "student");
    }

    @Test
    public void test10704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10704");
        model.Student student3 = new model.Student("hi!", "hi!", "");
        java.lang.String str4 = student3.getEmail();
        double double5 = student3.getHourlyRate();
        student3.setVerified(true);
        java.lang.String str8 = student3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test10705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10705");
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
        student3.login("", "");
        java.lang.Class<?> wildcardClass19 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test10706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10706");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        double double6 = student3.getHourlyRate();
        java.lang.String str7 = student3.getPassword();
        student3.login("", "student");
        boolean boolean11 = student3.isVerified();
        double double12 = student3.getHourlyRate();
        double double13 = student3.getHourlyRate();
        java.lang.String str14 = student3.getEmail();
        student3.logout();
        java.lang.Class<?> wildcardClass16 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 20.0d + "'", double12 == 20.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 20.0d + "'", double13 == 20.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test10707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10707");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        double double6 = student3.getHourlyRate();
        java.lang.String str7 = student3.getPassword();
        java.lang.String str8 = student3.getPassword();
        java.lang.String str9 = student3.getAccountType();
        student3.viewProfile();
        java.lang.String str11 = student3.getEmail();
        student3.logout();
        java.lang.String str13 = student3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "student" + "'", str9, "student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test10708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10708");
        model.Student student3 = new model.Student("hi!", "hi!", "");
        student3.setVerified(true);
        student3.login("hi!", "hi!");
        java.lang.String str9 = student3.getID();
        double double10 = student3.getHourlyRate();
        java.lang.String str11 = student3.getEmail();
        boolean boolean12 = student3.isVerified();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test10709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10709");
        model.Student student3 = new model.Student("", "", "hi!");
        student3.logout();
        student3.setVerified(false);
        java.lang.String str7 = student3.getAccountType();
        java.lang.String str8 = student3.getPassword();
        java.lang.String str9 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "student" + "'", str9, "student");
    }

    @Test
    public void test10710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10710");
        model.Student student3 = new model.Student("", "", "hi!");
        student3.login("", "");
        java.lang.String str7 = student3.getPassword();
        java.lang.String str8 = student3.getEmail();
        student3.logout();
        java.lang.String str10 = student3.getEmail();
        java.lang.String str11 = student3.getID();
        java.lang.String str12 = student3.getPassword();
        student3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test10711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10711");
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
        student3.setVerified(false);
        student3.viewProfile();
        java.lang.String str19 = student3.getAccountType();
        double double20 = student3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "student" + "'", str9, "student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "student" + "'", str19, "student");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 20.0d + "'", double20 == 20.0d);
    }

    @Test
    public void test10712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10712");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        java.lang.String str8 = student3.getPassword();
        boolean boolean9 = student3.isVerified();
        student3.viewProfile();
        java.lang.String str11 = student3.getEmail();
        java.lang.String str12 = student3.getID();
        student3.logout();
        student3.login("hi!", "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test10713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10713");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        student3.logout();
        student3.login("hi!", "hi!");
        double double8 = student3.getHourlyRate();
        java.lang.String str9 = student3.getID();
        java.lang.String str10 = student3.getEmail();
        student3.setVerified(true);
        student3.setVerified(true);
        boolean boolean15 = student3.isVerified();
        student3.viewProfile();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test10714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10714");
        model.Student student3 = new model.Student("", "", "student");
        java.lang.String str4 = student3.getID();
        double double5 = student3.getHourlyRate();
        double double6 = student3.getHourlyRate();
        student3.setVerified(false);
        student3.setVerified(false);
        student3.setVerified(true);
        double double13 = student3.getHourlyRate();
        java.lang.String str14 = student3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "student" + "'", str4, "student");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 20.0d + "'", double13 == 20.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "student" + "'", str14, "student");
    }

    @Test
    public void test10715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10715");
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
        java.lang.String str17 = student3.getID();
        java.lang.String str18 = student3.getAccountType();
        student3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "student" + "'", str13, "student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "student" + "'", str14, "student");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "student" + "'", str18, "student");
    }

    @Test
    public void test10716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10716");
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
        java.lang.String str14 = student3.getAccountType();
        student3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "student" + "'", str10, "student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "student" + "'", str14, "student");
    }

    @Test
    public void test10717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10717");
        model.Student student3 = new model.Student("hi!", "hi!", "");
        student3.setVerified(true);
        double double6 = student3.getHourlyRate();
        java.lang.String str7 = student3.getID();
        student3.logout();
        java.lang.String str9 = student3.getAccountType();
        java.lang.String str10 = student3.getID();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "student" + "'", str9, "student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test10718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10718");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        student3.setVerified(false);
        student3.viewProfile();
        java.lang.String str7 = student3.getEmail();
        boolean boolean8 = student3.isVerified();
        java.lang.String str9 = student3.getID();
        java.lang.String str10 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "student" + "'", str10, "student");
    }

    @Test
    public void test10719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10719");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        double double4 = student3.getHourlyRate();
        student3.logout();
        student3.login("", "");
        java.lang.Class<?> wildcardClass9 = student3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test10720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10720");
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
        student3.viewProfile();
        java.lang.String str19 = student3.getPassword();
        student3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "student" + "'", str11, "student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "student" + "'", str15, "student");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 20.0d + "'", double17 == 20.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test10721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10721");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        student3.login("", "hi!");
        student3.login("student", "hi!");
        student3.login("", "");
        student3.viewProfile();
        boolean boolean17 = student3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test10722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10722");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        student3.setVerified(false);
        boolean boolean9 = student3.isVerified();
        java.lang.String str10 = student3.getAccountType();
        java.lang.String str11 = student3.getPassword();
        java.lang.String str12 = student3.getEmail();
        java.lang.String str13 = student3.getAccountType();
        java.lang.String str14 = student3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "student" + "'", str10, "student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "student" + "'", str13, "student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test10723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10723");
        model.Student student3 = new model.Student("", "", "hi!");
        student3.login("", "");
        double double7 = student3.getHourlyRate();
        student3.login("student", "student");
        java.lang.String str11 = student3.getID();
        java.lang.String str12 = student3.getAccountType();
        boolean boolean13 = student3.isVerified();
        java.lang.String str14 = student3.getID();
        student3.viewProfile();
        java.lang.String str16 = student3.getPassword();
        student3.login("", "student");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "student" + "'", str12, "student");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test10724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10724");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        student3.setVerified(false);
        java.lang.String str6 = student3.getEmail();
        student3.setVerified(false);
        student3.login("student", "hi!");
        student3.logout();
        java.lang.String str13 = student3.getEmail();
        student3.login("", "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test10725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10725");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        double double6 = student3.getHourlyRate();
        java.lang.String str7 = student3.getPassword();
        java.lang.String str8 = student3.getPassword();
        java.lang.String str9 = student3.getAccountType();
        student3.login("hi!", "student");
        student3.viewProfile();
        boolean boolean14 = student3.isVerified();
        boolean boolean15 = student3.isVerified();
        student3.login("", "student");
        student3.setVerified(true);
        java.lang.String str21 = student3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "student" + "'", str9, "student");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test10726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10726");
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
        double double14 = student3.getHourlyRate();
        boolean boolean15 = student3.isVerified();
        java.lang.String str16 = student3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 20.0d + "'", double14 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test10727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10727");
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
    public void test10728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10728");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        java.lang.String str7 = student3.getPassword();
        java.lang.String str8 = student3.getID();
        java.lang.String str9 = student3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test10729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10729");
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
        java.lang.String str15 = student3.getEmail();
        student3.login("student", "");
        student3.viewProfile();
        boolean boolean20 = student3.isVerified();
        double double21 = student3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "student" + "'", str11, "student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 20.0d + "'", double21 == 20.0d);
    }

    @Test
    public void test10730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10730");
        model.Student student3 = new model.Student("student", "student", "hi!");
        java.lang.String str4 = student3.getEmail();
        java.lang.String str5 = student3.getPassword();
        java.lang.String str6 = student3.getID();
        student3.logout();
        student3.viewProfile();
        java.lang.String str9 = student3.getAccountType();
        double double10 = student3.getHourlyRate();
        java.lang.String str11 = student3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "student" + "'", str4, "student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "student" + "'", str9, "student");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "student" + "'", str11, "student");
    }

    @Test
    public void test10731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10731");
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
        double double15 = student3.getHourlyRate();
        java.lang.String str16 = student3.getPassword();
        student3.setVerified(false);
        java.lang.String str19 = student3.getID();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "student" + "'", str10, "student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "student" + "'", str11, "student");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 20.0d + "'", double12 == 20.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 20.0d + "'", double15 == 20.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test10732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10732");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        boolean boolean7 = student3.isVerified();
        student3.logout();
        student3.logout();
        boolean boolean10 = student3.isVerified();
        java.lang.String str11 = student3.getPassword();
        student3.setVerified(false);
        student3.viewProfile();
        java.lang.String str15 = student3.getID();
        java.lang.String str16 = student3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test10733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10733");
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
        java.lang.String str16 = student3.getID();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "student" + "'", str10, "student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test10734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10734");
        model.Student student3 = new model.Student("", "", "hi!");
        student3.logout();
        student3.viewProfile();
        student3.viewProfile();
        student3.logout();
        java.lang.String str8 = student3.getAccountType();
        student3.login("", "hi!");
        double double12 = student3.getHourlyRate();
        student3.login("", "student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 20.0d + "'", double12 == 20.0d);
    }

    @Test
    public void test10735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10735");
        model.Student student3 = new model.Student("hi!", "hi!", "hi!");
        double double4 = student3.getHourlyRate();
        java.lang.String str5 = student3.getPassword();
        java.lang.String str6 = student3.getPassword();
        student3.viewProfile();
        double double8 = student3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
    }

    @Test
    public void test10736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10736");
        model.Student student3 = new model.Student("hi!", "student", "");
        java.lang.String str4 = student3.getEmail();
        student3.viewProfile();
        student3.logout();
        student3.viewProfile();
        student3.viewProfile();
        student3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test10737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10737");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getEmail();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        student3.login("hi!", "student");
        double double11 = student3.getHourlyRate();
        java.lang.String str12 = student3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test10738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10738");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        student3.login("", "student");
        java.lang.String str10 = student3.getEmail();
        java.lang.String str11 = student3.getEmail();
        java.lang.String str12 = student3.getPassword();
        java.lang.String str13 = student3.getID();
        java.lang.String str14 = student3.getAccountType();
        java.lang.String str15 = student3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "student" + "'", str14, "student");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test10739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10739");
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
        java.lang.String str15 = student3.getEmail();
        double double16 = student3.getHourlyRate();
        java.lang.String str17 = student3.getEmail();
        java.lang.String str18 = student3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "student" + "'", str11, "student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 20.0d + "'", double16 == 20.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test10740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10740");
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
        boolean boolean20 = student3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "student" + "'", str13, "student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "student" + "'", str14, "student");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test10741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10741");
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
        java.lang.String str22 = student3.getAccountType();
        student3.viewProfile();
        boolean boolean24 = student3.isVerified();
        java.lang.String str25 = student3.getPassword();
        double double26 = student3.getHourlyRate();
        student3.logout();
        student3.login("hi!", "");
        java.lang.String str31 = student3.getID();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "student" + "'", str15, "student");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "student" + "'", str22, "student");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 20.0d + "'", double26 == 20.0d);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
    }

    @Test
    public void test10742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10742");
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
        java.lang.String str14 = student3.getEmail();
        student3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 20.0d + "'", double12 == 20.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test10743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10743");
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
        student3.logout();
        java.lang.String str14 = student3.getEmail();
        java.lang.String str15 = student3.getID();
        boolean boolean16 = student3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test10744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10744");
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
        student3.viewProfile();
        java.lang.String str16 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "student" + "'", str12, "student");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 20.0d + "'", double13 == 20.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "student" + "'", str16, "student");
    }

    @Test
    public void test10745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10745");
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
        java.lang.String str15 = student3.getEmail();
        java.lang.String str16 = student3.getPassword();
        java.lang.String str17 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "student" + "'", str17, "student");
    }

    @Test
    public void test10746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10746");
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
        double double15 = student3.getHourlyRate();
        java.lang.String str16 = student3.getPassword();
        student3.viewProfile();
        student3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "student" + "'", str10, "student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 20.0d + "'", double15 == 20.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test10747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10747");
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
        student3.setVerified(false);
        double double17 = student3.getHourlyRate();
        student3.setVerified(false);
        java.lang.String str20 = student3.getEmail();
        java.lang.String str21 = student3.getPassword();
        student3.logout();
        student3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "student" + "'", str9, "student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 20.0d + "'", double17 == 20.0d);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test10748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10748");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        boolean boolean7 = student3.isVerified();
        student3.logout();
        java.lang.String str9 = student3.getID();
        student3.login("hi!", "");
        java.lang.String str13 = student3.getPassword();
        student3.setVerified(true);
        java.lang.String str16 = student3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test10749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10749");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        student3.setVerified(false);
        student3.viewProfile();
        double double7 = student3.getHourlyRate();
        java.lang.String str8 = student3.getID();
        java.lang.String str9 = student3.getPassword();
        java.lang.String str10 = student3.getPassword();
        student3.login("", "hi!");
        student3.setVerified(true);
        student3.viewProfile();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test10750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10750");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        java.lang.String str4 = student3.getAccountType();
        java.lang.String str5 = student3.getEmail();
        double double6 = student3.getHourlyRate();
        double double7 = student3.getHourlyRate();
        java.lang.String str8 = student3.getID();
        student3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "student" + "'", str4, "student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test10751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10751");
        model.Student student3 = new model.Student("student", "", "student");
        student3.setVerified(false);
        student3.login("hi!", "hi!");
        boolean boolean9 = student3.isVerified();
        student3.login("", "");
        student3.setVerified(false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test10752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10752");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.login("", "");
        java.lang.String str10 = student3.getID();
        java.lang.String str11 = student3.getEmail();
        java.lang.String str12 = student3.getID();
        java.lang.String str13 = student3.getID();
        java.lang.Class<?> wildcardClass14 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test10753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10753");
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
        student3.logout();
        java.lang.String str20 = student3.getPassword();
        java.lang.String str21 = student3.getID();
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test10754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10754");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        student3.setVerified(false);
        student3.viewProfile();
        java.lang.String str7 = student3.getEmail();
        student3.login("hi!", "hi!");
        java.lang.String str11 = student3.getEmail();
        student3.login("student", "student");
        java.lang.String str15 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "student" + "'", str15, "student");
    }

    @Test
    public void test10755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10755");
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
        double double20 = student3.getHourlyRate();
        java.lang.String str21 = student3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "student" + "'", str13, "student");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 20.0d + "'", double20 == 20.0d);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test10756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10756");
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
        java.lang.String str13 = student3.getPassword();
        student3.viewProfile();
        java.lang.String str15 = student3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "student" + "'", str9, "student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 20.0d + "'", double12 == 20.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test10757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10757");
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
        student3.viewProfile();
        student3.setVerified(false);
        java.lang.String str20 = student3.getPassword();
        java.lang.String str21 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 20.0d + "'", double15 == 20.0d);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "student" + "'", str21, "student");
    }

    @Test
    public void test10758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10758");
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
        java.lang.String str17 = student3.getEmail();
        boolean boolean18 = student3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test10759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10759");
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
        student3.setVerified(true);
        double double25 = student3.getHourlyRate();
        java.lang.Class<?> wildcardClass26 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "student" + "'", str11, "student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 20.0d + "'", double25 == 20.0d);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test10760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10760");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        java.lang.String str7 = student3.getID();
        student3.setVerified(true);
        java.lang.String str10 = student3.getEmail();
        student3.setVerified(false);
        boolean boolean13 = student3.isVerified();
        java.lang.String str14 = student3.getEmail();
        student3.viewProfile();
        student3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test10761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10761");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getAccountType();
        java.lang.String str7 = student3.getAccountType();
        java.lang.String str8 = student3.getEmail();
        student3.logout();
        boolean boolean10 = student3.isVerified();
        java.lang.String str11 = student3.getPassword();
        java.lang.String str12 = student3.getEmail();
        java.lang.String str13 = student3.getAccountType();
        java.lang.String str14 = student3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "student" + "'", str13, "student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test10762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10762");
        model.Student student3 = new model.Student("student", "", "student");
        student3.setVerified(false);
        student3.viewProfile();
        java.lang.String str7 = student3.getEmail();
        java.lang.String str8 = student3.getID();
        double double9 = student3.getHourlyRate();
        student3.login("hi!", "student");
        java.lang.String str13 = student3.getPassword();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test10763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10763");
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
        boolean boolean14 = student3.isVerified();
        student3.setVerified(true);
        boolean boolean17 = student3.isVerified();
        java.lang.String str18 = student3.getID();
        java.lang.String str19 = student3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 20.0d + "'", double12 == 20.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test10764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10764");
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
        student3.setVerified(true);
        double double21 = student3.getHourlyRate();
        student3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 20.0d + "'", double21 == 20.0d);
    }

    @Test
    public void test10765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10765");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        java.lang.String str6 = student3.getPassword();
        student3.setVerified(false);
        java.lang.String str9 = student3.getAccountType();
        java.lang.String str10 = student3.getEmail();
        student3.setVerified(true);
        java.lang.String str13 = student3.getEmail();
        java.lang.String str14 = student3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "student" + "'", str9, "student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test10766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10766");
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
        student3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test10767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10767");
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
        boolean boolean23 = student3.isVerified();
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
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test10768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10768");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        double double6 = student3.getHourlyRate();
        student3.setVerified(true);
        java.lang.String str9 = student3.getID();
        boolean boolean10 = student3.isVerified();
        student3.setVerified(false);
        student3.logout();
        java.lang.String str14 = student3.getPassword();
        double double15 = student3.getHourlyRate();
        java.lang.String str16 = student3.getID();
        double double17 = student3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 20.0d + "'", double15 == 20.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 20.0d + "'", double17 == 20.0d);
    }

    @Test
    public void test10769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10769");
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
        student3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test10770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10770");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        student3.setVerified(false);
        student3.viewProfile();
        java.lang.String str7 = student3.getEmail();
        student3.login("hi!", "");
        student3.setVerified(false);
        boolean boolean13 = student3.isVerified();
        student3.logout();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test10771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10771");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.viewProfile();
        java.lang.String str8 = student3.getAccountType();
        java.lang.String str9 = student3.getID();
        java.lang.String str10 = student3.getID();
        student3.login("hi!", "");
        java.lang.String str14 = student3.getPassword();
        boolean boolean15 = student3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test10772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10772");
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
        java.lang.String str13 = student3.getPassword();
        student3.login("", "");
        double double17 = student3.getHourlyRate();
        student3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 20.0d + "'", double17 == 20.0d);
    }

    @Test
    public void test10773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10773");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        student3.setVerified(false);
        boolean boolean9 = student3.isVerified();
        java.lang.String str10 = student3.getPassword();
        student3.logout();
        java.lang.String str12 = student3.getEmail();
        double double13 = student3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 20.0d + "'", double13 == 20.0d);
    }

    @Test
    public void test10774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10774");
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
        student3.setVerified(true);
        java.lang.String str17 = student3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "student" + "'", str11, "student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "student" + "'", str12, "student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test10775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10775");
        model.Student student3 = new model.Student("hi!", "student", "");
        student3.logout();
        student3.logout();
        student3.logout();
        double double7 = student3.getHourlyRate();
        boolean boolean8 = student3.isVerified();
        student3.setVerified(false);
        student3.setVerified(true);
        student3.setVerified(false);
        java.lang.String str15 = student3.getID();
        java.lang.String str16 = student3.getEmail();
        java.lang.String str17 = student3.getEmail();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test10776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10776");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        double double6 = student3.getHourlyRate();
        java.lang.String str7 = student3.getPassword();
        java.lang.String str8 = student3.getPassword();
        java.lang.String str9 = student3.getAccountType();
        student3.viewProfile();
        student3.setVerified(true);
        double double13 = student3.getHourlyRate();
        double double14 = student3.getHourlyRate();
        java.lang.String str15 = student3.getEmail();
        java.lang.Class<?> wildcardClass16 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "student" + "'", str9, "student");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 20.0d + "'", double13 == 20.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 20.0d + "'", double14 == 20.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test10777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10777");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.viewProfile();
        java.lang.String str8 = student3.getAccountType();
        student3.logout();
        student3.logout();
        java.lang.String str11 = student3.getEmail();
        student3.logout();
        student3.login("student", "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test10778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10778");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        student3.logout();
        student3.login("hi!", "hi!");
        double double8 = student3.getHourlyRate();
        java.lang.String str9 = student3.getID();
        student3.logout();
        student3.login("student", "");
        student3.viewProfile();
        java.lang.String str15 = student3.getAccountType();
        student3.viewProfile();
        student3.viewProfile();
        student3.logout();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "student" + "'", str15, "student");
    }

    @Test
    public void test10779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10779");
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
        student3.login("hi!", "");
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
    public void test10780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10780");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getAccountType();
        student3.logout();
        java.lang.String str8 = student3.getEmail();
        student3.viewProfile();
        boolean boolean10 = student3.isVerified();
        student3.viewProfile();
        java.lang.String str12 = student3.getEmail();
        student3.viewProfile();
        student3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test10781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10781");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        student3.setVerified(false);
        student3.logout();
        java.lang.String str11 = student3.getEmail();
        student3.viewProfile();
        student3.logout();
        student3.login("student", "hi!");
        student3.viewProfile();
        java.lang.Class<?> wildcardClass18 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test10782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10782");
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
        student3.login("hi!", "student");
        student3.login("", "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test10783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10783");
        model.Student student3 = new model.Student("", "hi!", "hi!");
        student3.login("student", "student");
        student3.logout();
        java.lang.String str8 = student3.getEmail();
        student3.login("student", "");
        java.lang.Class<?> wildcardClass12 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test10784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10784");
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
        java.lang.String str23 = student3.getEmail();
        java.lang.String str24 = student3.getID();
        java.lang.String str25 = student3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "student" + "'", str10, "student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
    }

    @Test
    public void test10785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10785");
        model.Student student3 = new model.Student("", "", "hi!");
        student3.logout();
        java.lang.String str5 = student3.getID();
        java.lang.String str6 = student3.getEmail();
        double double7 = student3.getHourlyRate();
        java.lang.String str8 = student3.getEmail();
        java.lang.String str9 = student3.getEmail();
        java.lang.String str10 = student3.getAccountType();
        java.lang.String str11 = student3.getPassword();
        java.lang.String str12 = student3.getID();
        double double13 = student3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "student" + "'", str10, "student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 20.0d + "'", double13 == 20.0d);
    }

    @Test
    public void test10786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10786");
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
        boolean boolean14 = student3.isVerified();
        java.lang.String str15 = student3.getAccountType();
        java.lang.String str16 = student3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "student" + "'", str9, "student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "student" + "'", str15, "student");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test10787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10787");
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
        boolean boolean20 = student3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "student" + "'", str4, "student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "student" + "'", str13, "student");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "student" + "'", str16, "student");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test10788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10788");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        java.lang.String str4 = student3.getAccountType();
        java.lang.String str5 = student3.getID();
        student3.setVerified(true);
        boolean boolean8 = student3.isVerified();
        student3.setVerified(false);
        java.lang.String str11 = student3.getAccountType();
        double double12 = student3.getHourlyRate();
        java.lang.String str13 = student3.getEmail();
        java.lang.String str14 = student3.getPassword();
        student3.login("student", "hi!");
        double double18 = student3.getHourlyRate();
        java.lang.String str19 = student3.getAccountType();
        student3.login("", "student");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "student" + "'", str4, "student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "student" + "'", str11, "student");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 20.0d + "'", double12 == 20.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 20.0d + "'", double18 == 20.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "student" + "'", str19, "student");
    }

    @Test
    public void test10789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10789");
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
        java.lang.String str22 = student3.getAccountType();
        student3.viewProfile();
        boolean boolean24 = student3.isVerified();
        java.lang.String str25 = student3.getPassword();
        boolean boolean26 = student3.isVerified();
        java.lang.String str27 = student3.getAccountType();
        student3.login("student", "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "student" + "'", str15, "student");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "student" + "'", str22, "student");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "student" + "'", str27, "student");
    }

    @Test
    public void test10790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10790");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getAccountType();
        student3.logout();
        double double8 = student3.getHourlyRate();
        java.lang.String str9 = student3.getEmail();
        java.lang.String str10 = student3.getAccountType();
        boolean boolean11 = student3.isVerified();
        double double12 = student3.getHourlyRate();
        student3.login("", "hi!");
        java.lang.String str16 = student3.getAccountType();
        java.lang.Class<?> wildcardClass17 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "student" + "'", str10, "student");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 20.0d + "'", double12 == 20.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "student" + "'", str16, "student");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test10791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10791");
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
        student3.viewProfile();
        student3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 20.0d + "'", double12 == 20.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 20.0d + "'", double13 == 20.0d);
    }

    @Test
    public void test10792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10792");
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
        java.lang.String str16 = student3.getPassword();
        student3.login("student", "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test10793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10793");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getEmail();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        double double8 = student3.getHourlyRate();
        java.lang.String str9 = student3.getEmail();
        student3.setVerified(true);
        java.lang.String str12 = student3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test10794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10794");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getEmail();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        student3.login("hi!", "student");
        double double11 = student3.getHourlyRate();
        double double12 = student3.getHourlyRate();
        java.lang.String str13 = student3.getEmail();
        student3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 20.0d + "'", double12 == 20.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test10795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10795");
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
        java.lang.String str15 = student3.getPassword();
        java.lang.String str16 = student3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "student" + "'", str4, "student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "student" + "'", str11, "student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test10796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10796");
        model.Student student3 = new model.Student("", "student", "student");
        double double4 = student3.getHourlyRate();
        java.lang.String str5 = student3.getAccountType();
        double double6 = student3.getHourlyRate();
        boolean boolean7 = student3.isVerified();
        java.lang.String str8 = student3.getPassword();
        java.lang.String str9 = student3.getEmail();
        boolean boolean10 = student3.isVerified();
        double double11 = student3.getHourlyRate();
        student3.setVerified(false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
    }

    @Test
    public void test10797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10797");
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
        student3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test10798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10798");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        java.lang.String str4 = student3.getAccountType();
        java.lang.String str5 = student3.getID();
        student3.viewProfile();
        student3.setVerified(true);
        double double9 = student3.getHourlyRate();
        java.lang.String str10 = student3.getPassword();
        student3.viewProfile();
        student3.setVerified(false);
        java.lang.Class<?> wildcardClass14 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "student" + "'", str4, "student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test10799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10799");
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
        boolean boolean16 = student3.isVerified();
        student3.viewProfile();
        student3.viewProfile();
        student3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test10800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10800");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        double double6 = student3.getHourlyRate();
        java.lang.String str7 = student3.getPassword();
        student3.login("", "student");
        java.lang.String str11 = student3.getPassword();
        student3.logout();
        java.lang.String str13 = student3.getAccountType();
        student3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "student" + "'", str13, "student");
    }

    @Test
    public void test10801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10801");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        java.lang.String str6 = student3.getPassword();
        student3.setVerified(false);
        java.lang.String str9 = student3.getEmail();
        student3.logout();
        java.lang.String str11 = student3.getID();
        java.lang.String str12 = student3.getID();
        java.lang.String str13 = student3.getAccountType();
        java.lang.String str14 = student3.getEmail();
        java.lang.Class<?> wildcardClass15 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "student" + "'", str13, "student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test10802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10802");
        model.Student student3 = new model.Student("hi!", "student", "");
        java.lang.String str4 = student3.getEmail();
        student3.viewProfile();
        java.lang.String str6 = student3.getID();
        java.lang.String str7 = student3.getAccountType();
        java.lang.String str8 = student3.getPassword();
        java.lang.String str9 = student3.getEmail();
        java.lang.Class<?> wildcardClass10 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test10803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10803");
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
        boolean boolean17 = student3.isVerified();
        java.lang.String str18 = student3.getAccountType();
        student3.setVerified(false);
        boolean boolean21 = student3.isVerified();
        double double22 = student3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "student" + "'", str13, "student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "student" + "'", str14, "student");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "student" + "'", str16, "student");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "student" + "'", str18, "student");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 20.0d + "'", double22 == 20.0d);
    }

    @Test
    public void test10804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10804");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        boolean boolean7 = student3.isVerified();
        student3.logout();
        java.lang.String str9 = student3.getID();
        student3.setVerified(true);
        student3.viewProfile();
        student3.logout();
        boolean boolean14 = student3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test10805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10805");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.login("", "");
        student3.login("student", "student");
        java.lang.String str13 = student3.getAccountType();
        java.lang.String str14 = student3.getID();
        student3.setVerified(true);
        student3.logout();
        student3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "student" + "'", str13, "student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test10806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10806");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        student3.setVerified(false);
        student3.viewProfile();
        student3.login("hi!", "");
        java.lang.String str14 = student3.getID();
        student3.viewProfile();
        java.lang.String str16 = student3.getID();
        student3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test10807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10807");
        model.Student student3 = new model.Student("hi!", "student", "");
        java.lang.String str4 = student3.getEmail();
        student3.viewProfile();
        student3.logout();
        boolean boolean7 = student3.isVerified();
        boolean boolean8 = student3.isVerified();
        double double9 = student3.getHourlyRate();
        double double10 = student3.getHourlyRate();
        java.lang.Class<?> wildcardClass11 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test10808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10808");
        model.Student student3 = new model.Student("", "student", "student");
        student3.viewProfile();
        student3.viewProfile();
        java.lang.String str6 = student3.getAccountType();
        java.lang.String str7 = student3.getEmail();
        student3.setVerified(false);
        java.lang.String str10 = student3.getPassword();
        boolean boolean11 = student3.isVerified();
        boolean boolean12 = student3.isVerified();
        double double13 = student3.getHourlyRate();
        java.lang.String str14 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "student" + "'", str10, "student");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 20.0d + "'", double13 == 20.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "student" + "'", str14, "student");
    }

    @Test
    public void test10809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10809");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        student3.logout();
        student3.login("hi!", "hi!");
        double double8 = student3.getHourlyRate();
        java.lang.String str9 = student3.getID();
        student3.logout();
        java.lang.String str11 = student3.getID();
        student3.setVerified(false);
        student3.logout();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test10810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10810");
        model.Student student3 = new model.Student("", "", "hi!");
        student3.login("", "");
        double double7 = student3.getHourlyRate();
        student3.login("student", "student");
        java.lang.String str11 = student3.getID();
        student3.logout();
        double double13 = student3.getHourlyRate();
        student3.setVerified(false);
        java.lang.String str16 = student3.getPassword();
        student3.logout();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 20.0d + "'", double13 == 20.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test10811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10811");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        student3.logout();
        student3.login("hi!", "hi!");
        student3.viewProfile();
        java.lang.String str9 = student3.getPassword();
        java.lang.String str10 = student3.getID();
        student3.logout();
        student3.login("", "student");
        java.lang.String str15 = student3.getID();
        java.lang.String str16 = student3.getID();
        student3.logout();
        java.lang.String str18 = student3.getID();
        student3.setVerified(false);
        java.lang.String str21 = student3.getID();
        boolean boolean22 = student3.isVerified();
        java.lang.String str23 = student3.getEmail();
        student3.viewProfile();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
    }

    @Test
    public void test10812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10812");
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
        java.lang.String str17 = student3.getPassword();
        student3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test10813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10813");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        student3.logout();
        student3.login("hi!", "hi!");
        double double8 = student3.getHourlyRate();
        java.lang.String str9 = student3.getID();
        java.lang.String str10 = student3.getEmail();
        java.lang.String str11 = student3.getPassword();
        java.lang.String str12 = student3.getID();
        double double13 = student3.getHourlyRate();
        boolean boolean14 = student3.isVerified();
        java.lang.String str15 = student3.getAccountType();
        student3.logout();
        java.lang.Class<?> wildcardClass17 = student3.getClass();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 20.0d + "'", double13 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "student" + "'", str15, "student");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test10814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10814");
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
        java.lang.String str18 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "student" + "'", str9, "student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "student" + "'", str12, "student");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "student" + "'", str18, "student");
    }

    @Test
    public void test10815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10815");
        model.Student student3 = new model.Student("", "student", "student");
        student3.setVerified(true);
        java.lang.String str6 = student3.getPassword();
        boolean boolean7 = student3.isVerified();
        java.lang.String str8 = student3.getPassword();
        boolean boolean9 = student3.isVerified();
        student3.login("student", "hi!");
        java.lang.Class<?> wildcardClass13 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test10816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10816");
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
        java.lang.String str16 = student3.getEmail();
        student3.viewProfile();
        java.lang.Class<?> wildcardClass18 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test10817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10817");
        model.Student student3 = new model.Student("", "", "hi!");
        student3.logout();
        java.lang.String str5 = student3.getID();
        java.lang.String str6 = student3.getEmail();
        double double7 = student3.getHourlyRate();
        boolean boolean8 = student3.isVerified();
        double double9 = student3.getHourlyRate();
        double double10 = student3.getHourlyRate();
        student3.login("hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
    }

    @Test
    public void test10818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10818");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        double double6 = student3.getHourlyRate();
        java.lang.String str7 = student3.getID();
        java.lang.String str8 = student3.getPassword();
        student3.login("student", "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test10819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10819");
        model.Student student3 = new model.Student("", "", "student");
        student3.login("student", "");
        boolean boolean7 = student3.isVerified();
        student3.logout();
        java.lang.String str9 = student3.getID();
        boolean boolean10 = student3.isVerified();
        java.lang.Class<?> wildcardClass11 = student3.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "student" + "'", str9, "student");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test10820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10820");
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
        java.lang.String str15 = student3.getID();
        student3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test10821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10821");
        model.Student student3 = new model.Student("hi!", "hi!", "student");
        student3.login("hi!", "hi!");
        double double7 = student3.getHourlyRate();
        java.lang.String str8 = student3.getPassword();
        student3.setVerified(true);
        student3.viewProfile();
        student3.setVerified(false);
        double double14 = student3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 20.0d + "'", double14 == 20.0d);
    }

    @Test
    public void test10822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10822");
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
        java.lang.String str18 = student3.getID();
        java.lang.String str19 = student3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "student" + "'", str10, "student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 20.0d + "'", double15 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test10823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10823");
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
        student3.setVerified(false);
        java.lang.String str22 = student3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "student" + "'", str4, "student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "student" + "'", str13, "student");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "student" + "'", str16, "student");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test10824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10824");
        model.Student student3 = new model.Student("", "student", "student");
        student3.viewProfile();
        student3.viewProfile();
        java.lang.String str6 = student3.getAccountType();
        boolean boolean7 = student3.isVerified();
        student3.logout();
        double double9 = student3.getHourlyRate();
        student3.logout();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
    }

    @Test
    public void test10825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10825");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        java.lang.String str8 = student3.getPassword();
        java.lang.String str9 = student3.getPassword();
        double double10 = student3.getHourlyRate();
        java.lang.String str11 = student3.getAccountType();
        student3.viewProfile();
        student3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "student" + "'", str11, "student");
    }

    @Test
    public void test10826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10826");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        double double6 = student3.getHourlyRate();
        student3.setVerified(true);
        student3.login("hi!", "");
        java.lang.String str12 = student3.getPassword();
        student3.login("hi!", "");
        boolean boolean16 = student3.isVerified();
        java.lang.String str17 = student3.getPassword();
        student3.login("hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test10827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10827");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        java.lang.String str4 = student3.getAccountType();
        java.lang.String str5 = student3.getEmail();
        student3.viewProfile();
        java.lang.String str7 = student3.getPassword();
        double double8 = student3.getHourlyRate();
        student3.viewProfile();
        java.lang.String str10 = student3.getAccountType();
        boolean boolean11 = student3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "student" + "'", str4, "student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "student" + "'", str10, "student");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test10828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10828");
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
        student3.logout();
        student3.login("student", "student");
        java.lang.String str19 = student3.getPassword();
        student3.setVerified(false);
        java.lang.String str22 = student3.getAccountType();
        double double23 = student3.getHourlyRate();
        student3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "student" + "'", str12, "student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "student" + "'", str22, "student");
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 20.0d + "'", double23 == 20.0d);
    }

    @Test
    public void test10829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10829");
        model.Student student3 = new model.Student("", "", "student");
        student3.login("student", "student");
        student3.setVerified(true);
        java.lang.Class<?> wildcardClass9 = student3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test10830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10830");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        student3.setVerified(false);
        java.lang.String str6 = student3.getPassword();
        java.lang.String str7 = student3.getAccountType();
        java.lang.String str8 = student3.getEmail();
        student3.viewProfile();
        boolean boolean10 = student3.isVerified();
        student3.logout();
        student3.logout();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test10831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10831");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        student3.logout();
        student3.login("hi!", "hi!");
        double double8 = student3.getHourlyRate();
        boolean boolean9 = student3.isVerified();
        java.lang.String str10 = student3.getAccountType();
        java.lang.String str11 = student3.getAccountType();
        java.lang.String str12 = student3.getID();
        java.lang.String str13 = student3.getID();
        java.lang.String str14 = student3.getID();
        student3.setVerified(true);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "student" + "'", str10, "student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "student" + "'", str11, "student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test10832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10832");
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
        java.lang.String str17 = student3.getPassword();
        java.lang.String str18 = student3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 20.0d + "'", double13 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test10833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10833");
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
        java.lang.String str16 = student3.getEmail();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "student" + "'", str10, "student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 20.0d + "'", double15 == 20.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test10834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10834");
        model.Student student3 = new model.Student("", "", "hi!");
        student3.logout();
        java.lang.String str5 = student3.getID();
        java.lang.String str6 = student3.getEmail();
        student3.viewProfile();
        student3.setVerified(false);
        java.lang.String str10 = student3.getID();
        java.lang.String str11 = student3.getAccountType();
        java.lang.String str12 = student3.getAccountType();
        student3.logout();
        java.lang.String str14 = student3.getAccountType();
        java.lang.String str15 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "student" + "'", str11, "student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "student" + "'", str12, "student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "student" + "'", str14, "student");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "student" + "'", str15, "student");
    }

    @Test
    public void test10835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10835");
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
        student3.login("", "student");
        student3.viewProfile();
        java.lang.Class<?> wildcardClass19 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test10836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10836");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        java.lang.String str8 = student3.getEmail();
        student3.viewProfile();
        student3.logout();
        student3.login("hi!", "hi!");
        double double14 = student3.getHourlyRate();
        student3.login("hi!", "");
        student3.setVerified(false);
        java.lang.String str20 = student3.getPassword();
        java.lang.String str21 = student3.getID();
        double double22 = student3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 20.0d + "'", double14 == 20.0d);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 20.0d + "'", double22 == 20.0d);
    }

    @Test
    public void test10837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10837");
        model.Student student3 = new model.Student("", "hi!", "");
        student3.login("hi!", "hi!");
        student3.logout();
        java.lang.String str8 = student3.getEmail();
        java.lang.String str9 = student3.getPassword();
        boolean boolean10 = student3.isVerified();
        java.lang.String str11 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "student" + "'", str11, "student");
    }

    @Test
    public void test10838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10838");
        model.Student student3 = new model.Student("", "", "hi!");
        student3.logout();
        java.lang.String str5 = student3.getID();
        java.lang.String str6 = student3.getEmail();
        double double7 = student3.getHourlyRate();
        double double8 = student3.getHourlyRate();
        student3.viewProfile();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
    }

    @Test
    public void test10839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10839");
        model.Student student3 = new model.Student("", "", "student");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getPassword();
        boolean boolean6 = student3.isVerified();
        java.lang.String str7 = student3.getID();
        boolean boolean8 = student3.isVerified();
        double double9 = student3.getHourlyRate();
        student3.setVerified(false);
        java.lang.String str12 = student3.getID();
        java.lang.String str13 = student3.getID();
        boolean boolean14 = student3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "student" + "'", str4, "student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "student" + "'", str12, "student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "student" + "'", str13, "student");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test10840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10840");
        model.Student student3 = new model.Student("", "student", "student");
        double double4 = student3.getHourlyRate();
        student3.logout();
        boolean boolean6 = student3.isVerified();
        student3.login("student", "");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test10841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10841");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.viewProfile();
        java.lang.String str8 = student3.getAccountType();
        student3.logout();
        student3.logout();
        java.lang.String str11 = student3.getEmail();
        java.lang.String str12 = student3.getPassword();
        student3.viewProfile();
        java.lang.String str14 = student3.getAccountType();
        student3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "student" + "'", str14, "student");
    }

    @Test
    public void test10842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10842");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.login("", "");
        java.lang.String str10 = student3.getID();
        student3.viewProfile();
        boolean boolean12 = student3.isVerified();
        java.lang.String str13 = student3.getAccountType();
        student3.login("", "student");
        java.lang.String str17 = student3.getAccountType();
        student3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "student" + "'", str13, "student");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "student" + "'", str17, "student");
    }

    @Test
    public void test10843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10843");
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
        java.lang.String str20 = student3.getID();
        java.lang.String str21 = student3.getID();
        java.lang.String str22 = student3.getPassword();
        student3.viewProfile();
        student3.viewProfile();
        java.lang.String str25 = student3.getAccountType();
        java.lang.Class<?> wildcardClass26 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "student" + "'", str16, "student");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "student" + "'", str25, "student");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test10844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10844");
        model.Student student3 = new model.Student("hi!", "hi!", "");
        student3.logout();
        java.lang.String str5 = student3.getEmail();
        student3.logout();
        boolean boolean7 = student3.isVerified();
        double double8 = student3.getHourlyRate();
        student3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
    }

    @Test
    public void test10845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10845");
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
        student3.login("student", "");
        student3.logout();
        student3.logout();
        java.lang.String str24 = student3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test10846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10846");
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
        java.lang.String str15 = student3.getAccountType();
        student3.viewProfile();
        java.lang.String str17 = student3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "student" + "'", str15, "student");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test10847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10847");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        student3.setVerified(false);
        java.lang.String str6 = student3.getEmail();
        student3.setVerified(false);
        student3.login("student", "hi!");
        java.lang.String str12 = student3.getPassword();
        student3.setVerified(false);
        java.lang.String str15 = student3.getPassword();
        java.lang.String str16 = student3.getEmail();
        java.lang.String str17 = student3.getEmail();
        java.lang.String str18 = student3.getEmail();
        java.lang.String str19 = student3.getPassword();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test10848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10848");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        java.lang.String str7 = student3.getID();
        student3.setVerified(true);
        java.lang.String str10 = student3.getAccountType();
        java.lang.String str11 = student3.getPassword();
        boolean boolean12 = student3.isVerified();
        double double13 = student3.getHourlyRate();
        student3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "student" + "'", str10, "student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 20.0d + "'", double13 == 20.0d);
    }

    @Test
    public void test10849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10849");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        boolean boolean7 = student3.isVerified();
        student3.login("", "hi!");
        java.lang.String str11 = student3.getEmail();
        student3.login("", "hi!");
        student3.logout();
        double double16 = student3.getHourlyRate();
        boolean boolean17 = student3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 20.0d + "'", double16 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test10850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10850");
        model.Student student3 = new model.Student("hi!", "hi!", "");
        student3.viewProfile();
        java.lang.String str5 = student3.getAccountType();
        double double6 = student3.getHourlyRate();
        java.lang.String str7 = student3.getEmail();
        double double8 = student3.getHourlyRate();
        student3.login("", "");
        boolean boolean12 = student3.isVerified();
        student3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test10851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10851");
        model.Student student3 = new model.Student("", "", "hi!");
        student3.logout();
        java.lang.String str5 = student3.getID();
        java.lang.String str6 = student3.getEmail();
        double double7 = student3.getHourlyRate();
        java.lang.String str8 = student3.getPassword();
        student3.login("hi!", "hi!");
        student3.setVerified(false);
        java.lang.String str14 = student3.getAccountType();
        student3.login("hi!", "hi!");
        double double18 = student3.getHourlyRate();
        student3.setVerified(true);
        java.lang.String str21 = student3.getEmail();
        student3.logout();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "student" + "'", str14, "student");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 20.0d + "'", double18 == 20.0d);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test10852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10852");
        model.Student student3 = new model.Student("student", "", "student");
        student3.setVerified(false);
        student3.viewProfile();
        student3.logout();
        student3.setVerified(true);
        java.lang.String str10 = student3.getEmail();
        student3.login("student", "");
        java.lang.String str14 = student3.getEmail();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "student" + "'", str10, "student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "student" + "'", str14, "student");
    }

    @Test
    public void test10853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10853");
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
        student3.login("student", "student");
        java.lang.String str19 = student3.getPassword();
        java.lang.String str20 = student3.getEmail();
        student3.logout();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test10854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10854");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        boolean boolean7 = student3.isVerified();
        student3.login("", "hi!");
        java.lang.String str11 = student3.getEmail();
        student3.login("", "hi!");
        student3.logout();
        student3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test10855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10855");
        model.Student student3 = new model.Student("hi!", "hi!", "");
        student3.setVerified(true);
        student3.logout();
        java.lang.String str7 = student3.getAccountType();
        java.lang.String str8 = student3.getID();
        double double9 = student3.getHourlyRate();
        java.lang.String str10 = student3.getPassword();
        java.lang.Class<?> wildcardClass11 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test10856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10856");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        boolean boolean7 = student3.isVerified();
        java.lang.String str8 = student3.getEmail();
        student3.setVerified(true);
        double double11 = student3.getHourlyRate();
        java.lang.String str12 = student3.getID();
        java.lang.String str13 = student3.getAccountType();
        student3.logout();
        boolean boolean15 = student3.isVerified();
        java.lang.String str16 = student3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "student" + "'", str13, "student");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test10857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10857");
        model.Student student3 = new model.Student("student", "student", "hi!");
        student3.setVerified(false);
        java.lang.String str6 = student3.getID();
        student3.setVerified(true);
        double double9 = student3.getHourlyRate();
        java.lang.String str10 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "student" + "'", str10, "student");
    }

    @Test
    public void test10858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10858");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        student3.setVerified(false);
        student3.viewProfile();
        java.lang.String str7 = student3.getEmail();
        java.lang.String str8 = student3.getAccountType();
        student3.logout();
        boolean boolean10 = student3.isVerified();
        student3.login("", "hi!");
        student3.viewProfile();
        double double15 = student3.getHourlyRate();
        student3.viewProfile();
        java.lang.String str17 = student3.getAccountType();
        student3.login("", "");
        student3.logout();
        java.lang.String str22 = student3.getID();
        java.lang.Class<?> wildcardClass23 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 20.0d + "'", double15 == 20.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "student" + "'", str17, "student");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test10859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10859");
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
        java.lang.String str15 = student3.getEmail();
        java.lang.String str16 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "student" + "'", str16, "student");
    }

    @Test
    public void test10860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10860");
        model.Student student3 = new model.Student("", "student", "student");
        double double4 = student3.getHourlyRate();
        java.lang.String str5 = student3.getAccountType();
        student3.viewProfile();
        student3.login("hi!", "student");
        java.lang.String str10 = student3.getEmail();
        boolean boolean11 = student3.isVerified();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test10861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10861");
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
        java.lang.String str20 = student3.getEmail();
        java.lang.String str21 = student3.getEmail();
        student3.login("hi!", "");
        java.lang.String str25 = student3.getEmail();
        double double26 = student3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "student" + "'", str13, "student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "student" + "'", str14, "student");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "student" + "'", str16, "student");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 20.0d + "'", double26 == 20.0d);
    }

    @Test
    public void test10862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10862");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        double double6 = student3.getHourlyRate();
        java.lang.String str7 = student3.getPassword();
        student3.login("", "student");
        java.lang.String str11 = student3.getPassword();
        student3.logout();
        double double13 = student3.getHourlyRate();
        student3.logout();
        java.lang.String str15 = student3.getEmail();
        java.lang.String str16 = student3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 20.0d + "'", double13 == 20.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test10863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10863");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        student3.setVerified(false);
        java.lang.String str10 = student3.getEmail();
        student3.logout();
        student3.login("student", "hi!");
        double double15 = student3.getHourlyRate();
        double double16 = student3.getHourlyRate();
        student3.setVerified(false);
        java.lang.String str19 = student3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 20.0d + "'", double15 == 20.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 20.0d + "'", double16 == 20.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test10864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10864");
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
        boolean boolean19 = student3.isVerified();
        student3.login("", "");
        java.lang.String str23 = student3.getID();
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
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
    }

    @Test
    public void test10865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10865");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.viewProfile();
        boolean boolean8 = student3.isVerified();
        boolean boolean9 = student3.isVerified();
        double double10 = student3.getHourlyRate();
        boolean boolean11 = student3.isVerified();
        java.lang.Class<?> wildcardClass12 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test10866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10866");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        student3.setVerified(false);
        java.lang.String str6 = student3.getPassword();
        student3.viewProfile();
        java.lang.String str8 = student3.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test10867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10867");
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
        student3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "student" + "'", str12, "student");
    }

    @Test
    public void test10868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10868");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        boolean boolean7 = student3.isVerified();
        student3.logout();
        java.lang.String str9 = student3.getID();
        student3.login("hi!", "");
        student3.logout();
        student3.viewProfile();
        java.lang.String str15 = student3.getID();
        double double16 = student3.getHourlyRate();
        java.lang.String str17 = student3.getPassword();
        double double18 = student3.getHourlyRate();
        java.lang.Class<?> wildcardClass19 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 20.0d + "'", double16 == 20.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 20.0d + "'", double18 == 20.0d);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test10869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10869");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        double double6 = student3.getHourlyRate();
        java.lang.String str7 = student3.getPassword();
        java.lang.String str8 = student3.getPassword();
        java.lang.String str9 = student3.getAccountType();
        student3.viewProfile();
        student3.setVerified(true);
        student3.logout();
        student3.login("student", "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "student" + "'", str9, "student");
    }

    @Test
    public void test10870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10870");
        model.Student student3 = new model.Student("", "student", "");
        student3.setVerified(true);
        student3.login("", "hi!");
        boolean boolean9 = student3.isVerified();
        student3.logout();
        java.lang.String str11 = student3.getID();
        boolean boolean12 = student3.isVerified();
        student3.setVerified(false);
        java.lang.String str15 = student3.getAccountType();
        student3.logout();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "student" + "'", str15, "student");
    }

    @Test
    public void test10871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10871");
        model.Student student3 = new model.Student("hi!", "hi!", "");
        student3.setVerified(true);
        student3.login("hi!", "hi!");
        java.lang.String str9 = student3.getID();
        double double10 = student3.getHourlyRate();
        student3.logout();
        java.lang.String str12 = student3.getEmail();
        java.lang.String str13 = student3.getPassword();
        java.lang.String str14 = student3.getID();
        student3.logout();
        boolean boolean16 = student3.isVerified();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test10872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10872");
        model.Student student3 = new model.Student("", "student", "hi!");
        java.lang.String str4 = student3.getPassword();
        java.lang.String str5 = student3.getPassword();
        student3.logout();
        java.lang.String str7 = student3.getEmail();
        java.lang.String str8 = student3.getAccountType();
        java.lang.String str9 = student3.getEmail();
        student3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "student" + "'", str4, "student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test10873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10873");
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
        student3.logout();
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
    public void test10874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10874");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        student3.setVerified(false);
        student3.viewProfile();
        java.lang.String str7 = student3.getEmail();
        java.lang.String str8 = student3.getAccountType();
        java.lang.String str9 = student3.getID();
        java.lang.String str10 = student3.getID();
        student3.viewProfile();
        student3.viewProfile();
        java.lang.String str13 = student3.getPassword();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test10875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10875");
        model.Student student3 = new model.Student("hi!", "student", "");
        java.lang.String str4 = student3.getEmail();
        student3.viewProfile();
        student3.login("", "student");
        java.lang.String str9 = student3.getID();
        student3.login("student", "hi!");
        java.lang.String str13 = student3.getEmail();
        java.lang.Class<?> wildcardClass14 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test10876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10876");
        model.Student student3 = new model.Student("hi!", "hi!", "");
        student3.logout();
        java.lang.String str5 = student3.getEmail();
        student3.logout();
        java.lang.String str7 = student3.getEmail();
        boolean boolean8 = student3.isVerified();
        java.lang.String str9 = student3.getEmail();
        student3.setVerified(false);
        java.lang.String str12 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "student" + "'", str12, "student");
    }

    @Test
    public void test10877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10877");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        java.lang.String str4 = student3.getAccountType();
        java.lang.String str5 = student3.getEmail();
        double double6 = student3.getHourlyRate();
        student3.logout();
        java.lang.String str8 = student3.getEmail();
        java.lang.String str9 = student3.getAccountType();
        java.lang.String str10 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "student" + "'", str4, "student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "student" + "'", str9, "student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "student" + "'", str10, "student");
    }

    @Test
    public void test10878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10878");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        student3.setVerified(false);
        boolean boolean9 = student3.isVerified();
        java.lang.String str10 = student3.getAccountType();
        java.lang.String str11 = student3.getPassword();
        java.lang.String str12 = student3.getEmail();
        java.lang.String str13 = student3.getPassword();
        java.lang.String str14 = student3.getPassword();
        double double15 = student3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "student" + "'", str10, "student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 20.0d + "'", double15 == 20.0d);
    }

    @Test
    public void test10879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10879");
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
        java.lang.String str18 = student3.getPassword();
        student3.login("", "hi!");
        java.lang.Class<?> wildcardClass22 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 20.0d + "'", double15 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "student" + "'", str17, "student");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test10880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10880");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getAccountType();
        student3.logout();
        java.lang.String str8 = student3.getID();
        student3.login("", "");
        java.lang.String str12 = student3.getID();
        student3.logout();
        student3.viewProfile();
        double double15 = student3.getHourlyRate();
        java.lang.String str16 = student3.getPassword();
        java.lang.String str17 = student3.getID();
        student3.login("student", "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 20.0d + "'", double15 == 20.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test10881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10881");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        student3.logout();
        student3.login("hi!", "hi!");
        double double8 = student3.getHourlyRate();
        java.lang.String str9 = student3.getID();
        java.lang.String str10 = student3.getEmail();
        java.lang.String str11 = student3.getPassword();
        double double12 = student3.getHourlyRate();
        java.lang.String str13 = student3.getID();
        java.lang.Class<?> wildcardClass14 = student3.getClass();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 20.0d + "'", double12 == 20.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test10882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10882");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        java.lang.String str7 = student3.getID();
        student3.setVerified(true);
        java.lang.String str10 = student3.getAccountType();
        java.lang.String str11 = student3.getPassword();
        student3.login("", "");
        java.lang.String str15 = student3.getAccountType();
        student3.viewProfile();
        java.lang.String str17 = student3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "student" + "'", str10, "student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "student" + "'", str15, "student");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test10883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10883");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        student3.setVerified(false);
        java.lang.String str9 = student3.getID();
        student3.setVerified(false);
        double double12 = student3.getHourlyRate();
        student3.setVerified(false);
        java.lang.String str15 = student3.getPassword();
        double double16 = student3.getHourlyRate();
        java.lang.String str17 = student3.getEmail();
        java.lang.String str18 = student3.getPassword();
        student3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 20.0d + "'", double12 == 20.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 20.0d + "'", double16 == 20.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test10884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10884");
        model.Student student3 = new model.Student("student", "hi!", "");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        student3.setVerified(false);
        student3.setVerified(true);
        java.lang.String str10 = student3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test10885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10885");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        student3.logout();
        student3.login("hi!", "hi!");
        student3.viewProfile();
        student3.login("", "student");
        student3.login("", "student");
        java.lang.String str15 = student3.getEmail();
        student3.viewProfile();
        java.lang.String str17 = student3.getID();
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test10886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10886");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        student3.logout();
        student3.login("hi!", "hi!");
        double double8 = student3.getHourlyRate();
        java.lang.String str9 = student3.getID();
        java.lang.String str10 = student3.getAccountType();
        student3.setVerified(true);
        student3.logout();
        student3.viewProfile();
        java.lang.String str15 = student3.getAccountType();
        boolean boolean16 = student3.isVerified();
        boolean boolean17 = student3.isVerified();
        double double18 = student3.getHourlyRate();
        student3.setVerified(true);
        double double21 = student3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "student" + "'", str10, "student");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "student" + "'", str15, "student");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 20.0d + "'", double18 == 20.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 20.0d + "'", double21 == 20.0d);
    }

    @Test
    public void test10887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10887");
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
        java.lang.String str24 = student3.getPassword();
        java.lang.String str25 = student3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
    }

    @Test
    public void test10888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10888");
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
        student3.logout();
        java.lang.String str18 = student3.getAccountType();
        java.lang.String str19 = student3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "student" + "'", str18, "student");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test10889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10889");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        student3.setVerified(false);
        student3.viewProfile();
        java.lang.String str7 = student3.getEmail();
        double double8 = student3.getHourlyRate();
        student3.viewProfile();
        java.lang.String str10 = student3.getAccountType();
        student3.login("hi!", "student");
        java.lang.String str14 = student3.getID();
        double double15 = student3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "student" + "'", str10, "student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 20.0d + "'", double15 == 20.0d);
    }

    @Test
    public void test10890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10890");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        student3.setVerified(false);
        java.lang.String str10 = student3.getEmail();
        student3.logout();
        student3.viewProfile();
        student3.login("student", "hi!");
        java.lang.String str16 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "student" + "'", str16, "student");
    }

    @Test
    public void test10891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10891");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.login("", "");
        java.lang.String str10 = student3.getID();
        student3.logout();
        boolean boolean12 = student3.isVerified();
        boolean boolean13 = student3.isVerified();
        double double14 = student3.getHourlyRate();
        double double15 = student3.getHourlyRate();
        student3.logout();
        student3.setVerified(false);
        student3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 20.0d + "'", double14 == 20.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 20.0d + "'", double15 == 20.0d);
    }

    @Test
    public void test10892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10892");
        model.Student student3 = new model.Student("", "", "hi!");
        student3.logout();
        java.lang.String str5 = student3.getID();
        java.lang.String str6 = student3.getPassword();
        student3.logout();
        java.lang.String str8 = student3.getPassword();
        java.lang.String str9 = student3.getPassword();
        student3.setVerified(true);
        double double12 = student3.getHourlyRate();
        student3.viewProfile();
        java.lang.String str14 = student3.getAccountType();
        student3.setVerified(false);
        student3.setVerified(true);
        student3.viewProfile();
        java.lang.String str20 = student3.getAccountType();
        java.lang.String str21 = student3.getID();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 20.0d + "'", double12 == 20.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "student" + "'", str14, "student");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "student" + "'", str20, "student");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test10893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10893");
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
        java.lang.String str17 = student3.getAccountType();
        boolean boolean18 = student3.isVerified();
        java.lang.String str19 = student3.getID();
        java.lang.String str20 = student3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "student" + "'", str17, "student");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test10894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10894");
        model.Student student3 = new model.Student("student", "hi!", "");
        student3.login("hi!", "hi!");
        student3.logout();
        student3.setVerified(false);
        java.lang.String str10 = student3.getPassword();
        java.lang.String str11 = student3.getEmail();
        java.lang.String str12 = student3.getAccountType();
        java.lang.String str13 = student3.getID();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "student" + "'", str11, "student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "student" + "'", str12, "student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test10895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10895");
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
        student3.viewProfile();
        java.lang.String str18 = student3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 20.0d + "'", double14 == 20.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 20.0d + "'", double16 == 20.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test10896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10896");
        model.Student student3 = new model.Student("hi!", "", "");
        student3.logout();
        java.lang.String str5 = student3.getID();
        student3.viewProfile();
        java.lang.String str7 = student3.getID();
        student3.login("student", "student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test10897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10897");
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
        double double17 = student3.getHourlyRate();
        boolean boolean18 = student3.isVerified();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 20.0d + "'", double16 == 20.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 20.0d + "'", double17 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test10898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10898");
        model.Student student3 = new model.Student("hi!", "student", "");
        java.lang.String str4 = student3.getEmail();
        student3.logout();
        student3.setVerified(true);
        student3.setVerified(false);
        student3.logout();
        student3.viewProfile();
        boolean boolean12 = student3.isVerified();
        java.lang.String str13 = student3.getPassword();
        double double14 = student3.getHourlyRate();
        student3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "student" + "'", str13, "student");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 20.0d + "'", double14 == 20.0d);
    }

    @Test
    public void test10899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10899");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        double double6 = student3.getHourlyRate();
        java.lang.String str7 = student3.getPassword();
        java.lang.String str8 = student3.getID();
        double double9 = student3.getHourlyRate();
        java.lang.String str10 = student3.getEmail();
        java.lang.String str11 = student3.getAccountType();
        student3.logout();
        boolean boolean13 = student3.isVerified();
        java.lang.String str14 = student3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "student" + "'", str11, "student");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test10900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10900");
        model.Student student3 = new model.Student("", "", "hi!");
        student3.logout();
        java.lang.String str5 = student3.getID();
        java.lang.String str6 = student3.getEmail();
        double double7 = student3.getHourlyRate();
        boolean boolean8 = student3.isVerified();
        java.lang.String str9 = student3.getID();
        student3.setVerified(true);
        double double12 = student3.getHourlyRate();
        student3.setVerified(false);
        student3.viewProfile();
        student3.login("student", "hi!");
        java.lang.String str19 = student3.getID();
        java.lang.String str20 = student3.getPassword();
        student3.logout();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 20.0d + "'", double12 == 20.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test10901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10901");
        model.Student student3 = new model.Student("student", "", "student");
        student3.setVerified(false);
        student3.viewProfile();
        java.lang.String str7 = student3.getEmail();
        java.lang.String str8 = student3.getPassword();
        java.lang.String str9 = student3.getID();
        java.lang.String str10 = student3.getEmail();
        student3.logout();
        java.lang.String str12 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "student" + "'", str9, "student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "student" + "'", str10, "student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "student" + "'", str12, "student");
    }

    @Test
    public void test10902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10902");
        model.Student student3 = new model.Student("hi!", "hi!", "student");
        student3.login("hi!", "student");
        student3.login("", "student");
        student3.setVerified(false);
        double double12 = student3.getHourlyRate();
        java.lang.String str13 = student3.getPassword();
        student3.logout();
        java.lang.String str15 = student3.getID();
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 20.0d + "'", double12 == 20.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "student" + "'", str15, "student");
    }

    @Test
    public void test10903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10903");
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
        student3.setVerified(true);
        student3.setVerified(true);
        java.lang.String str18 = student3.getID();
        java.lang.String str19 = student3.getPassword();
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
    }

    @Test
    public void test10904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10904");
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
        java.lang.String str17 = student3.getID();
        java.lang.String str18 = student3.getAccountType();
        java.lang.String str19 = student3.getAccountType();
        java.lang.String str20 = student3.getID();
        java.lang.String str21 = student3.getEmail();
        student3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "student" + "'", str18, "student");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "student" + "'", str19, "student");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test10905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10905");
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
        student3.login("hi!", "");
        student3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
    }

    @Test
    public void test10906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10906");
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
        student3.setVerified(true);
        java.lang.String str16 = student3.getPassword();
        java.lang.String str17 = student3.getID();
        java.lang.Class<?> wildcardClass18 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 20.0d + "'", double13 == 20.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test10907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10907");
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
        java.lang.String str21 = student3.getID();
        student3.login("hi!", "hi!");
        java.lang.String str25 = student3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test10908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10908");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        java.lang.String str4 = student3.getAccountType();
        java.lang.String str5 = student3.getID();
        student3.setVerified(true);
        java.lang.String str8 = student3.getAccountType();
        java.lang.Class<?> wildcardClass9 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "student" + "'", str4, "student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test10909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10909");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        student3.setVerified(false);
        double double7 = student3.getHourlyRate();
        boolean boolean8 = student3.isVerified();
        java.lang.String str9 = student3.getAccountType();
        java.lang.String str10 = student3.getID();
        double double11 = student3.getHourlyRate();
        student3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "student" + "'", str9, "student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
    }

    @Test
    public void test10910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10910");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        student3.login("", "hi!");
        student3.login("student", "hi!");
        student3.setVerified(true);
        java.lang.String str15 = student3.getAccountType();
        java.lang.Class<?> wildcardClass16 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "student" + "'", str15, "student");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test10911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10911");
        model.Student student3 = new model.Student("hi!", "hi!", "");
        student3.setVerified(true);
        boolean boolean6 = student3.isVerified();
        java.lang.String str7 = student3.getPassword();
        student3.logout();
        student3.login("student", "");
        java.lang.String str12 = student3.getEmail();
        java.lang.String str13 = student3.getEmail();
        java.lang.String str14 = student3.getAccountType();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "student" + "'", str14, "student");
    }

    @Test
    public void test10912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10912");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.login("", "");
        student3.login("student", "student");
        java.lang.String str13 = student3.getAccountType();
        java.lang.String str14 = student3.getEmail();
        java.lang.String str15 = student3.getEmail();
        student3.logout();
        java.lang.Class<?> wildcardClass17 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "student" + "'", str13, "student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test10913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10913");
        model.Student student3 = new model.Student("", "student", "student");
        student3.viewProfile();
        student3.viewProfile();
        java.lang.String str6 = student3.getAccountType();
        java.lang.String str7 = student3.getEmail();
        student3.logout();
        java.lang.String str9 = student3.getID();
        student3.logout();
        student3.logout();
        student3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "student" + "'", str9, "student");
    }

    @Test
    public void test10914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10914");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.viewProfile();
        boolean boolean8 = student3.isVerified();
        double double9 = student3.getHourlyRate();
        java.lang.String str10 = student3.getAccountType();
        java.lang.String str11 = student3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "student" + "'", str10, "student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test10915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10915");
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
        student3.setVerified(true);
        java.lang.String str19 = student3.getPassword();
        java.lang.String str20 = student3.getPassword();
        double double21 = student3.getHourlyRate();
        java.lang.String str22 = student3.getEmail();
        student3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 20.0d + "'", double21 == 20.0d);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test10916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10916");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        student3.setVerified(false);
        java.lang.String str6 = student3.getEmail();
        student3.setVerified(false);
        student3.login("student", "hi!");
        java.lang.String str12 = student3.getPassword();
        student3.viewProfile();
        java.lang.String str14 = student3.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test10917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10917");
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
        java.lang.String str16 = student3.getPassword();
        boolean boolean17 = student3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "student" + "'", str10, "student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test10918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10918");
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
        boolean boolean20 = student3.isVerified();
        student3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "student" + "'", str13, "student");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "student" + "'", str19, "student");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test10919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10919");
        model.Student student3 = new model.Student("hi!", "hi!", "");
        java.lang.String str4 = student3.getEmail();
        student3.login("hi!", "student");
        boolean boolean8 = student3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test10920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10920");
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
        java.lang.String str22 = student3.getAccountType();
        student3.viewProfile();
        student3.viewProfile();
        boolean boolean25 = student3.isVerified();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "student" + "'", str15, "student");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "student" + "'", str22, "student");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test10921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10921");
        model.Student student3 = new model.Student("", "", "");
        student3.viewProfile();
        double double5 = student3.getHourlyRate();
        java.lang.String str6 = student3.getEmail();
        boolean boolean7 = student3.isVerified();
        java.lang.String str8 = student3.getAccountType();
        java.lang.String str9 = student3.getID();
        java.lang.String str10 = student3.getID();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test10922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10922");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        double double6 = student3.getHourlyRate();
        student3.logout();
        student3.viewProfile();
        java.lang.String str9 = student3.getEmail();
        boolean boolean10 = student3.isVerified();
        student3.viewProfile();
        boolean boolean12 = student3.isVerified();
        student3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test10923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10923");
        model.Student student3 = new model.Student("student", "hi!", "");
        student3.login("hi!", "hi!");
        student3.logout();
        student3.viewProfile();
        student3.setVerified(false);
        student3.logout();
        java.lang.String str12 = student3.getID();
        student3.logout();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test10924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10924");
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
        double double16 = student3.getHourlyRate();
        student3.setVerified(false);
        java.lang.String str19 = student3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 20.0d + "'", double12 == 20.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "student" + "'", str15, "student");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 20.0d + "'", double16 == 20.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test10925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10925");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.viewProfile();
        java.lang.String str8 = student3.getAccountType();
        student3.logout();
        double double10 = student3.getHourlyRate();
        java.lang.String str11 = student3.getEmail();
        boolean boolean12 = student3.isVerified();
        java.lang.String str13 = student3.getID();
        student3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test10926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10926");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getAccountType();
        java.lang.String str7 = student3.getAccountType();
        java.lang.String str8 = student3.getPassword();
        double double9 = student3.getHourlyRate();
        student3.setVerified(true);
        student3.setVerified(true);
        java.lang.String str14 = student3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test10927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10927");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        java.lang.String str7 = student3.getID();
        student3.setVerified(true);
        java.lang.String str10 = student3.getEmail();
        student3.setVerified(true);
        student3.logout();
        java.lang.String str14 = student3.getEmail();
        student3.login("", "student");
        java.lang.String str18 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "student" + "'", str18, "student");
    }

    @Test
    public void test10928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10928");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        java.lang.String str4 = student3.getPassword();
        double double5 = student3.getHourlyRate();
        double double6 = student3.getHourlyRate();
        student3.setVerified(true);
        boolean boolean9 = student3.isVerified();
        double double10 = student3.getHourlyRate();
        student3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
    }

    @Test
    public void test10929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10929");
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
        student3.logout();
        java.lang.String str15 = student3.getPassword();
        student3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test10930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10930");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        java.lang.String str8 = student3.getAccountType();
        student3.setVerified(false);
        student3.viewProfile();
        student3.setVerified(true);
        student3.viewProfile();
        java.lang.String str15 = student3.getPassword();
        student3.logout();
        java.lang.String str17 = student3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test10931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10931");
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
        java.lang.String str20 = student3.getAccountType();
        boolean boolean21 = student3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 20.0d + "'", double19 == 20.0d);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "student" + "'", str20, "student");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test10932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10932");
        model.Student student3 = new model.Student("student", "hi!", "");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getPassword();
        java.lang.String str6 = student3.getAccountType();
        student3.setVerified(false);
        java.lang.String str9 = student3.getEmail();
        java.lang.String str10 = student3.getEmail();
        java.lang.String str11 = student3.getEmail();
        student3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "student" + "'", str9, "student");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "student" + "'", str10, "student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "student" + "'", str11, "student");
    }

    @Test
    public void test10933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10933");
        model.Student student3 = new model.Student("", "hi!", "");
        student3.viewProfile();
        double double5 = student3.getHourlyRate();
        student3.setVerified(true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
    }

    @Test
    public void test10934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10934");
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
        student3.logout();
        student3.login("hi!", "student");
        student3.login("hi!", "hi!");
        java.lang.Class<?> wildcardClass22 = student3.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test10935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10935");
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
        student3.login("student", "");
        student3.setVerified(false);
        student3.login("hi!", "");
        java.lang.String str26 = student3.getID();
        java.lang.String str27 = student3.getPassword();
        java.lang.Class<?> wildcardClass28 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 20.0d + "'", double15 == 20.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "student" + "'", str17, "student");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test10936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10936");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        double double6 = student3.getHourlyRate();
        student3.setVerified(false);
        boolean boolean9 = student3.isVerified();
        boolean boolean10 = student3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test10937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10937");
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
        double double14 = student3.getHourlyRate();
        java.lang.String str15 = student3.getEmail();
        java.lang.String str16 = student3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 20.0d + "'", double14 == 20.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test10938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10938");
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
        java.lang.String str21 = student3.getAccountType();
        java.lang.String str22 = student3.getEmail();
        java.lang.String str23 = student3.getAccountType();
        java.lang.String str24 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "student" + "'", str21, "student");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "student" + "'", str23, "student");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "student" + "'", str24, "student");
    }

    @Test
    public void test10939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10939");
        model.Student student3 = new model.Student("", "", "hi!");
        student3.logout();
        java.lang.String str5 = student3.getID();
        java.lang.String str6 = student3.getEmail();
        double double7 = student3.getHourlyRate();
        boolean boolean8 = student3.isVerified();
        boolean boolean9 = student3.isVerified();
        student3.login("", "student");
        java.lang.String str13 = student3.getAccountType();
        java.lang.String str14 = student3.getPassword();
        java.lang.String str15 = student3.getID();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "student" + "'", str13, "student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test10940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10940");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        student3.setVerified(false);
        student3.viewProfile();
        java.lang.String str7 = student3.getEmail();
        java.lang.String str8 = student3.getAccountType();
        student3.logout();
        student3.login("", "");
        student3.logout();
        java.lang.String str14 = student3.getPassword();
        java.lang.String str15 = student3.getAccountType();
        student3.viewProfile();
        java.lang.String str17 = student3.getEmail();
        student3.login("student", "");
        java.lang.String str21 = student3.getID();
        java.lang.Class<?> wildcardClass22 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "student" + "'", str15, "student");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test10941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10941");
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
        java.lang.String str13 = student3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test10942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10942");
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
        java.lang.Class<?> wildcardClass17 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 20.0d + "'", double15 == 20.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test10943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10943");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        boolean boolean7 = student3.isVerified();
        java.lang.String str8 = student3.getEmail();
        student3.setVerified(true);
        java.lang.String str11 = student3.getAccountType();
        boolean boolean12 = student3.isVerified();
        student3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "student" + "'", str11, "student");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test10944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10944");
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
        student3.setVerified(true);
        double double21 = student3.getHourlyRate();
        java.lang.String str22 = student3.getAccountType();
        java.lang.Class<?> wildcardClass23 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 20.0d + "'", double14 == 20.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 20.0d + "'", double21 == 20.0d);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "student" + "'", str22, "student");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test10945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10945");
        model.Student student3 = new model.Student("hi!", "hi!", "");
        student3.viewProfile();
        java.lang.String str5 = student3.getAccountType();
        java.lang.String str6 = student3.getEmail();
        java.lang.String str7 = student3.getAccountType();
        java.lang.String str8 = student3.getID();
        boolean boolean9 = student3.isVerified();
        java.lang.String str10 = student3.getID();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test10946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10946");
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
        student3.logout();
        student3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test10947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10947");
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
        boolean boolean14 = student3.isVerified();
        student3.login("", "student");
        double double18 = student3.getHourlyRate();
        java.lang.String str19 = student3.getAccountType();
        student3.setVerified(false);
        double double22 = student3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 20.0d + "'", double18 == 20.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "student" + "'", str19, "student");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 20.0d + "'", double22 == 20.0d);
    }

    @Test
    public void test10948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10948");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getAccountType();
        student3.logout();
        java.lang.String str8 = student3.getEmail();
        student3.viewProfile();
        java.lang.String str10 = student3.getID();
        java.lang.String str11 = student3.getPassword();
        student3.login("hi!", "hi!");
        boolean boolean15 = student3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test10949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10949");
        model.Student student3 = new model.Student("", "student", "student");
        student3.setVerified(true);
        java.lang.String str6 = student3.getPassword();
        boolean boolean7 = student3.isVerified();
        java.lang.String str8 = student3.getEmail();
        student3.logout();
        boolean boolean10 = student3.isVerified();
        java.lang.String str11 = student3.getID();
        java.lang.String str12 = student3.getID();
        student3.login("", "hi!");
        student3.setVerified(false);
        java.lang.Class<?> wildcardClass18 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "student" + "'", str11, "student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "student" + "'", str12, "student");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test10950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10950");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        java.lang.String str7 = student3.getID();
        double double8 = student3.getHourlyRate();
        boolean boolean9 = student3.isVerified();
        student3.login("", "student");
        java.lang.String str13 = student3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test10951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10951");
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
        java.lang.String str20 = student3.getAccountType();
        java.lang.String str21 = student3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 20.0d + "'", double18 == 20.0d);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "student" + "'", str20, "student");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test10952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10952");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        student3.setVerified(false);
        student3.login("student", "student");
        java.lang.String str12 = student3.getEmail();
        boolean boolean13 = student3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test10953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10953");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        java.lang.String str7 = student3.getID();
        student3.setVerified(true);
        java.lang.String str10 = student3.getEmail();
        student3.setVerified(true);
        student3.setVerified(true);
        java.lang.String str15 = student3.getID();
        student3.logout();
        student3.setVerified(true);
        student3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test10954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10954");
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
        java.lang.String str15 = student3.getAccountType();
        student3.viewProfile();
        boolean boolean17 = student3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "student" + "'", str15, "student");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test10955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10955");
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
        student3.viewProfile();
        java.lang.String str19 = student3.getEmail();
        student3.viewProfile();
        java.lang.String str21 = student3.getID();
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test10956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10956");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        student3.setVerified(false);
        student3.viewProfile();
        java.lang.String str7 = student3.getEmail();
        java.lang.String str8 = student3.getAccountType();
        java.lang.String str9 = student3.getID();
        student3.setVerified(false);
        double double12 = student3.getHourlyRate();
        java.lang.String str13 = student3.getID();
        java.lang.String str14 = student3.getPassword();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 20.0d + "'", double12 == 20.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test10957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10957");
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
        java.lang.String str16 = student3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "student" + "'", str16, "student");
    }

    @Test
    public void test10958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10958");
        model.Student student3 = new model.Student("hi!", "student", "");
        java.lang.String str4 = student3.getEmail();
        double double5 = student3.getHourlyRate();
        java.lang.String str6 = student3.getEmail();
        student3.login("hi!", "student");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test10959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10959");
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
        java.lang.String str18 = student3.getPassword();
        java.lang.String str19 = student3.getEmail();
        double double20 = student3.getHourlyRate();
        student3.viewProfile();
        student3.viewProfile();
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
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 20.0d + "'", double20 == 20.0d);
    }

    @Test
    public void test10960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10960");
        model.Student student3 = new model.Student("", "", "student");
        student3.login("student", "");
        boolean boolean7 = student3.isVerified();
        student3.logout();
        student3.logout();
        student3.viewProfile();
        java.lang.String str11 = student3.getAccountType();
        java.lang.String str12 = student3.getPassword();
        java.lang.String str13 = student3.getEmail();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "student" + "'", str11, "student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test10961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10961");
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
        java.lang.String str15 = student3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test10962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10962");
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
        student3.logout();
        java.lang.String str16 = student3.getAccountType();
        java.lang.String str17 = student3.getID();
        student3.logout();
        java.lang.Class<?> wildcardClass19 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "student" + "'", str9, "student");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "student" + "'", str16, "student");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test10963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10963");
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
        java.lang.String str13 = student3.getPassword();
        java.lang.String str14 = student3.getAccountType();
        student3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "student" + "'", str14, "student");
    }

    @Test
    public void test10964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10964");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getID();
        java.lang.String str6 = student3.getID();
        student3.login("", "");
        java.lang.String str10 = student3.getID();
        java.lang.String str11 = student3.getEmail();
        java.lang.String str12 = student3.getPassword();
        java.lang.String str13 = student3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test10965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10965");
        model.Student student3 = new model.Student("hi!", "hi!", "");
        student3.logout();
        java.lang.String str5 = student3.getEmail();
        student3.logout();
        student3.login("", "student");
        java.lang.String str10 = student3.getAccountType();
        student3.logout();
        java.lang.String str12 = student3.getAccountType();
        java.lang.String str13 = student3.getID();
        student3.viewProfile();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "student" + "'", str10, "student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "student" + "'", str12, "student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test10966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10966");
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
        java.lang.String str15 = student3.getID();
        student3.setVerified(false);
        double double18 = student3.getHourlyRate();
        double double19 = student3.getHourlyRate();
        java.lang.String str20 = student3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 20.0d + "'", double14 == 20.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 20.0d + "'", double18 == 20.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 20.0d + "'", double19 == 20.0d);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test10967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10967");
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
        student3.viewProfile();
        double double14 = student3.getHourlyRate();
        java.lang.String str15 = student3.getEmail();
        student3.setVerified(false);
        java.lang.String str18 = student3.getID();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "student" + "'", str12, "student");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 20.0d + "'", double14 == 20.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test10968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10968");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        student3.setVerified(false);
        java.lang.String str6 = student3.getEmail();
        boolean boolean7 = student3.isVerified();
        double double8 = student3.getHourlyRate();
        java.lang.String str9 = student3.getPassword();
        double double10 = student3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
    }

    @Test
    public void test10969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10969");
        model.Student student3 = new model.Student("hi!", "hi!", "");
        student3.logout();
        java.lang.String str5 = student3.getEmail();
        double double6 = student3.getHourlyRate();
        student3.setVerified(false);
        student3.login("", "");
        student3.login("hi!", "");
        java.lang.String str15 = student3.getID();
        student3.viewProfile();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test10970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10970");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        java.lang.String str6 = student3.getPassword();
        student3.setVerified(false);
        java.lang.String str9 = student3.getAccountType();
        student3.setVerified(false);
        java.lang.String str12 = student3.getEmail();
        boolean boolean13 = student3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "student" + "'", str9, "student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test10971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10971");
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
        java.lang.Class<?> wildcardClass19 = student3.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test10972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10972");
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
        student3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 20.0d + "'", double13 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test10973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10973");
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
        java.lang.String str18 = student3.getPassword();
        student3.setVerified(true);
        student3.login("hi!", "");
        java.lang.String str24 = student3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "student" + "'", str12, "student");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test10974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10974");
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
        boolean boolean14 = student3.isVerified();
        student3.login("hi!", "hi!");
        student3.setVerified(true);
        student3.logout();
        java.lang.String str21 = student3.getEmail();
        student3.login("", "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test10975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10975");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        java.lang.String str7 = student3.getID();
        student3.setVerified(true);
        java.lang.String str10 = student3.getEmail();
        student3.setVerified(true);
        student3.logout();
        java.lang.String str14 = student3.getID();
        student3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test10976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10976");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        java.lang.String str8 = student3.getAccountType();
        student3.setVerified(false);
        student3.viewProfile();
        student3.setVerified(true);
        student3.viewProfile();
        student3.login("student", "student");
        java.lang.String str18 = student3.getAccountType();
        java.lang.String str19 = student3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "student" + "'", str18, "student");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test10977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10977");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        student3.logout();
        student3.viewProfile();
        student3.setVerified(true);
        java.lang.String str9 = student3.getID();
        java.lang.String str10 = student3.getEmail();
        student3.login("hi!", "hi!");
        student3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test10978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10978");
        model.Student student3 = new model.Student("", "", "hi!");
        student3.logout();
        java.lang.String str5 = student3.getID();
        java.lang.String str6 = student3.getPassword();
        student3.logout();
        student3.viewProfile();
        student3.setVerified(true);
        student3.viewProfile();
        student3.viewProfile();
        student3.viewProfile();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test10979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10979");
        model.Student student3 = new model.Student("hi!", "hi!", "");
        student3.logout();
        java.lang.String str5 = student3.getEmail();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        student3.logout();
        boolean boolean9 = student3.isVerified();
        student3.setVerified(true);
        java.lang.Class<?> wildcardClass12 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test10980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10980");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        boolean boolean7 = student3.isVerified();
        student3.logout();
        java.lang.String str9 = student3.getID();
        student3.login("hi!", "");
        student3.logout();
        student3.logout();
        student3.logout();
        java.lang.String str16 = student3.getPassword();
        student3.viewProfile();
        student3.viewProfile();
        boolean boolean19 = student3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test10981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10981");
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
        java.lang.String str14 = student3.getAccountType();
        java.lang.String str15 = student3.getAccountType();
        java.lang.String str16 = student3.getID();
        student3.login("student", "student");
        student3.setVerified(false);
        student3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "student" + "'", str11, "student");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "student" + "'", str14, "student");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "student" + "'", str15, "student");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test10982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10982");
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
        java.lang.String str14 = student3.getID();
        double double15 = student3.getHourlyRate();
        boolean boolean16 = student3.isVerified();
        java.lang.String str17 = student3.getAccountType();
        java.lang.String str18 = student3.getPassword();
        student3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "student" + "'", str12, "student");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 20.0d + "'", double15 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "student" + "'", str17, "student");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test10983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10983");
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
        java.lang.String str15 = student3.getEmail();
        student3.logout();
        double double17 = student3.getHourlyRate();
        double double18 = student3.getHourlyRate();
        student3.viewProfile();
        student3.logout();
        java.lang.String str21 = student3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 20.0d + "'", double17 == 20.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 20.0d + "'", double18 == 20.0d);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test10984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10984");
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
        boolean boolean15 = student3.isVerified();
        java.lang.String str16 = student3.getAccountType();
        boolean boolean17 = student3.isVerified();
        java.lang.Class<?> wildcardClass18 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "student" + "'", str16, "student");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test10985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10985");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        student3.setVerified(false);
        java.lang.String str10 = student3.getEmail();
        student3.logout();
        student3.login("", "");
        student3.setVerified(true);
        java.lang.String str17 = student3.getPassword();
        student3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test10986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10986");
        model.Student student3 = new model.Student("", "student", "student");
        double double4 = student3.getHourlyRate();
        java.lang.String str5 = student3.getAccountType();
        double double6 = student3.getHourlyRate();
        java.lang.String str7 = student3.getID();
        java.lang.String str8 = student3.getEmail();
        double double9 = student3.getHourlyRate();
        student3.login("", "hi!");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
    }

    @Test
    public void test10987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10987");
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
        java.lang.Class<?> wildcardClass20 = student3.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test10988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10988");
        model.Student student3 = new model.Student("hi!", "student", "");
        java.lang.String str4 = student3.getEmail();
        double double5 = student3.getHourlyRate();
        student3.logout();
        boolean boolean7 = student3.isVerified();
        student3.login("", "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test10989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10989");
        model.Student student3 = new model.Student("hi!", "student", "student");
        double double4 = student3.getHourlyRate();
        double double5 = student3.getHourlyRate();
        student3.viewProfile();
        java.lang.String str7 = student3.getAccountType();
        java.lang.String str8 = student3.getAccountType();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 20.0d + "'", double4 == 20.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "student" + "'", str7, "student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
    }

    @Test
    public void test10990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10990");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getAccountType();
        boolean boolean6 = student3.isVerified();
        student3.logout();
        java.lang.String str8 = student3.getEmail();
        student3.viewProfile();
        student3.logout();
        double double11 = student3.getHourlyRate();
        java.lang.String str12 = student3.getPassword();
        student3.logout();
        student3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test10991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10991");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        java.lang.String str4 = student3.getAccountType();
        java.lang.String str5 = student3.getEmail();
        student3.viewProfile();
        student3.logout();
        student3.viewProfile();
        student3.login("", "");
        student3.login("", "hi!");
        student3.logout();
        boolean boolean16 = student3.isVerified();
        java.lang.String str17 = student3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "student" + "'", str4, "student");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test10992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10992");
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
        student3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "student" + "'", str5, "student");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test10993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10993");
        model.Student student3 = new model.Student("hi!", "", "hi!");
        student3.logout();
        student3.login("hi!", "hi!");
        java.lang.String str8 = student3.getEmail();
        java.lang.String str9 = student3.getEmail();
        java.lang.String str10 = student3.getEmail();
        student3.login("hi!", "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test10994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10994");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        boolean boolean5 = student3.isVerified();
        java.lang.String str6 = student3.getID();
        java.lang.String str7 = student3.getID();
        double double8 = student3.getHourlyRate();
        double double9 = student3.getHourlyRate();
        student3.login("student", "hi!");
        double double13 = student3.getHourlyRate();
        student3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 20.0d + "'", double8 == 20.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 20.0d + "'", double13 == 20.0d);
    }

    @Test
    public void test10995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10995");
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
        java.lang.String str19 = student3.getAccountType();
        student3.viewProfile();
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "student" + "'", str19, "student");
    }

    @Test
    public void test10996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10996");
        model.Student student3 = new model.Student("hi!", "hi!", "hi!");
        student3.login("hi!", "student");
        student3.logout();
        java.lang.String str8 = student3.getPassword();
        student3.viewProfile();
        student3.setVerified(false);
        java.lang.String str12 = student3.getAccountType();
        student3.login("student", "hi!");
        student3.setVerified(false);
        student3.setVerified(true);
        java.lang.Class<?> wildcardClass20 = student3.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "student" + "'", str12, "student");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test10997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10997");
        model.Student student3 = new model.Student("", "", "hi!");
        java.lang.String str4 = student3.getID();
        java.lang.String str5 = student3.getID();
        student3.setVerified(true);
        student3.setVerified(false);
        java.lang.String str10 = student3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test10998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10998");
        model.Student student3 = new model.Student("hi!", "student", "");
        java.lang.String str4 = student3.getEmail();
        student3.viewProfile();
        student3.viewProfile();
        java.lang.String str7 = student3.getEmail();
        java.lang.String str8 = student3.getAccountType();
        student3.login("", "");
        student3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "student" + "'", str8, "student");
    }

    @Test
    public void test10999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10999");
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
        boolean boolean18 = student3.isVerified();
        java.lang.String str19 = student3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test11000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test11000");
        model.Student student3 = new model.Student("student", "", "student");
        student3.setVerified(false);
        java.lang.String str6 = student3.getAccountType();
        java.lang.String str7 = student3.getPassword();
        student3.viewProfile();
        java.lang.String str9 = student3.getID();
        boolean boolean10 = student3.isVerified();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "student" + "'", str6, "student");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "student" + "'", str9, "student");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }
}

