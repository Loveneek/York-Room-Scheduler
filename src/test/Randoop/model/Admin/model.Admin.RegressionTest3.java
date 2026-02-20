import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest3 {

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
    public void test01501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01501");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        java.lang.String str4 = admin2.getAccountType();
        java.lang.String str5 = admin2.getPassword();
        admin2.setVerified(true);
        admin2.login("", "");
        admin2.login("admin", "admin");
        double double14 = admin2.getHourlyRate();
        double double15 = admin2.getHourlyRate();
        java.lang.Class<?> wildcardClass16 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test01502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01502");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        java.lang.String str4 = admin2.getAccountType();
        java.lang.String str5 = admin2.getPassword();
        admin2.setVerified(true);
        admin2.login("", "");
        admin2.login("admin", "admin");
        room.Room room14 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test01503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01503");
        model.Admin admin2 = new model.Admin("", "");
        java.lang.String str3 = admin2.getAccountType();
        admin2.setVerified(true);
        double double6 = admin2.getHourlyRate();
        admin2.setVerified(false);
        admin2.logout();
        admin2.setVerified(true);
        boolean boolean12 = admin2.isVerified();
        java.lang.String str13 = admin2.getAccountType();
        java.lang.Class<?> wildcardClass14 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "admin" + "'", str13, "admin");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test01504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01504");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getAccountType();
        boolean boolean4 = admin2.isVerified();
        boolean boolean5 = admin2.isVerified();
        java.lang.String str6 = admin2.getID();
        admin2.viewProfile();
        boolean boolean8 = admin2.isVerified();
        double double9 = admin2.getHourlyRate();
        room.Room room10 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "admin" + "'", str6, "admin");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test01505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01505");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        java.lang.String str5 = admin2.getID();
        admin2.setVerified(false);
        admin2.logout();
        java.lang.String str9 = admin2.getEmail();
        room.Room room10 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test01506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01506");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        java.lang.String str6 = admin2.getPassword();
        admin2.login("", "admin");
        admin2.logout();
        java.lang.Class<?> wildcardClass11 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test01507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01507");
        model.Admin admin2 = new model.Admin("admin", "admin");
        boolean boolean3 = admin2.isVerified();
        admin2.login("hi!", "");
        java.lang.String str7 = admin2.getEmail();
        admin2.login("", "hi!");
        java.lang.Class<?> wildcardClass11 = admin2.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test01508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01508");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        admin2.logout();
        java.lang.String str4 = admin2.getAccountType();
        boolean boolean5 = admin2.isVerified();
        java.lang.String str6 = admin2.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "admin" + "'", str6, "admin");
    }

    @Test
    public void test01509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01509");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        java.lang.String str5 = admin2.getID();
        admin2.setVerified(false);
        java.lang.String str8 = admin2.getPassword();
        admin2.logout();
        admin2.login("admin", "");
        java.lang.Class<?> wildcardClass13 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test01510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01510");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        java.lang.String str6 = admin2.getEmail();
        double double7 = admin2.getHourlyRate();
        java.lang.String str8 = admin2.getPassword();
        admin2.login("", "hi!");
        java.lang.Class<?> wildcardClass12 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test01511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01511");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.login("admin", "admin");
        boolean boolean6 = admin2.isVerified();
        admin2.logout();
        java.lang.String str8 = admin2.getID();
        admin2.logout();
        double double10 = admin2.getHourlyRate();
        boolean boolean11 = admin2.isVerified();
        admin2.login("", "admin");
        boolean boolean15 = admin2.isVerified();
        room.Room room16 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test01512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01512");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getID();
        admin2.viewProfile();
        admin2.logout();
        admin2.setVerified(false);
        admin2.login("hi!", "admin");
        java.lang.String str15 = admin2.getID();
        room.Room room16 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "admin" + "'", str15, "admin");
    }

    @Test
    public void test01513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01513");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        admin2.viewProfile();
        admin2.logout();
        double double8 = admin2.getHourlyRate();
        boolean boolean9 = admin2.isVerified();
        room.Room room10 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test01514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01514");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        java.lang.String str5 = admin2.getID();
        java.lang.String str6 = admin2.getID();
        java.lang.String str7 = admin2.getAccountType();
        admin2.setVerified(true);
        java.lang.String str10 = admin2.getAccountType();
        admin2.setVerified(true);
        room.Room room13 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "admin" + "'", str6, "admin");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
    }

    @Test
    public void test01515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01515");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getAccountType();
        boolean boolean4 = admin2.isVerified();
        java.lang.String str5 = admin2.getPassword();
        admin2.logout();
        java.lang.String str7 = admin2.getPassword();
        java.lang.String str8 = admin2.getID();
        room.Room room9 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
    }

    @Test
    public void test01516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01516");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        boolean boolean6 = admin2.isVerified();
        java.lang.String str7 = admin2.getAccountType();
        admin2.login("", "hi!");
        java.lang.String str11 = admin2.getEmail();
        admin2.login("admin", "");
        room.Room room15 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test01517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01517");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.viewProfile();
        java.lang.String str4 = admin2.getPassword();
        admin2.login("", "");
        boolean boolean8 = admin2.isVerified();
        admin2.setVerified(false);
        java.lang.String str11 = admin2.getAccountType();
        double double12 = admin2.getHourlyRate();
        admin2.viewProfile();
        admin2.setVerified(false);
        room.Room room16 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "admin" + "'", str11, "admin");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test01518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01518");
        model.Admin admin2 = new model.Admin("hi!", "");
        java.lang.String str3 = admin2.getEmail();
        java.lang.String str4 = admin2.getAccountType();
        java.lang.Class<?> wildcardClass5 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test01519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01519");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        double double7 = admin2.getHourlyRate();
        room.Room room8 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test01520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01520");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        admin2.logout();
        admin2.setVerified(false);
        java.lang.String str6 = admin2.getEmail();
        double double7 = admin2.getHourlyRate();
        java.lang.String str8 = admin2.getEmail();
        room.Room room9 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test01521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01521");
        model.Admin admin2 = new model.Admin("", "");
        java.lang.String str3 = admin2.getAccountType();
        java.lang.String str4 = admin2.getEmail();
        java.lang.String str5 = admin2.getID();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getEmail();
        admin2.login("admin", "admin");
        java.lang.String str11 = admin2.getEmail();
        double double12 = admin2.getHourlyRate();
        admin2.viewProfile();
        room.Room room14 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test01522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01522");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.viewProfile();
        admin2.viewProfile();
        admin2.login("hi!", "admin");
        java.lang.String str8 = admin2.getID();
        java.lang.String str9 = admin2.getAccountType();
        java.lang.Class<?> wildcardClass10 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test01523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01523");
        model.Admin admin2 = new model.Admin("", "");
        java.lang.String str3 = admin2.getAccountType();
        admin2.setVerified(true);
        admin2.login("", "admin");
        java.lang.String str9 = admin2.getID();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
    }

    @Test
    public void test01524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01524");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        boolean boolean6 = admin2.isVerified();
        admin2.login("hi!", "");
        java.lang.String str10 = admin2.getPassword();
        admin2.viewProfile();
        admin2.login("admin", "admin");
        java.lang.Class<?> wildcardClass15 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test01525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01525");
        model.Admin admin2 = new model.Admin("", "");
        java.lang.String str3 = admin2.getAccountType();
        admin2.setVerified(true);
        double double6 = admin2.getHourlyRate();
        admin2.viewProfile();
        boolean boolean8 = admin2.isVerified();
        java.lang.String str9 = admin2.getID();
        java.lang.String str10 = admin2.getID();
        double double11 = admin2.getHourlyRate();
        boolean boolean12 = admin2.isVerified();
        admin2.logout();
        boolean boolean14 = admin2.isVerified();
        java.lang.String str15 = admin2.getAccountType();
        room.Room room16 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "admin" + "'", str15, "admin");
    }

    @Test
    public void test01526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01526");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        admin2.logout();
        java.lang.String str4 = admin2.getAccountType();
        admin2.viewProfile();
        admin2.logout();
        room.Room room7 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
    }

    @Test
    public void test01527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01527");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getID();
        boolean boolean8 = admin2.isVerified();
        java.lang.String str9 = admin2.getPassword();
        admin2.logout();
        admin2.setVerified(false);
        admin2.login("admin", "admin");
        java.lang.String str16 = admin2.getID();
        admin2.setVerified(true);
        java.lang.String str19 = admin2.getPassword();
        admin2.login("admin", "");
        room.Room room23 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "admin" + "'", str16, "admin");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test01528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01528");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getAccountType();
        admin2.setVerified(false);
        admin2.login("hi!", "hi!");
        java.lang.String str9 = admin2.getEmail();
        java.lang.Class<?> wildcardClass10 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test01529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01529");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        java.lang.String str4 = admin2.getEmail();
        admin2.logout();
        admin2.logout();
        java.lang.String str7 = admin2.getPassword();
        admin2.login("admin", "admin");
        admin2.viewProfile();
        admin2.viewProfile();
        java.lang.String str13 = admin2.getID();
        java.lang.Class<?> wildcardClass14 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "admin" + "'", str13, "admin");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test01530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01530");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        admin2.setVerified(true);
        java.lang.String str9 = admin2.getEmail();
        java.lang.String str10 = admin2.getEmail();
        boolean boolean11 = admin2.isVerified();
        java.lang.String str12 = admin2.getEmail();
        admin2.logout();
        room.Room room14 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test01531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01531");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getAccountType();
        boolean boolean4 = admin2.isVerified();
        java.lang.String str5 = admin2.getPassword();
        admin2.logout();
        admin2.viewProfile();
        admin2.setVerified(false);
        java.lang.String str10 = admin2.getEmail();
        java.lang.String str11 = admin2.getAccountType();
        admin2.logout();
        room.Room room13 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "admin" + "'", str11, "admin");
    }

    @Test
    public void test01532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01532");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.login("admin", "admin");
        boolean boolean6 = admin2.isVerified();
        java.lang.String str7 = admin2.getAccountType();
        java.lang.String str8 = admin2.getPassword();
        room.Room room9 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
    }

    @Test
    public void test01533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01533");
        model.Admin admin2 = new model.Admin("", "");
        java.lang.String str3 = admin2.getAccountType();
        java.lang.String str4 = admin2.getEmail();
        admin2.login("hi!", "");
        java.lang.String str8 = admin2.getAccountType();
        room.Room room9 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
    }

    @Test
    public void test01534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01534");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getPassword();
        admin2.logout();
        double double9 = admin2.getHourlyRate();
        boolean boolean10 = admin2.isVerified();
        java.lang.String str11 = admin2.getAccountType();
        admin2.setVerified(false);
        room.Room room14 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "admin" + "'", str11, "admin");
    }

    @Test
    public void test01535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01535");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getID();
        admin2.viewProfile();
        admin2.logout();
        java.lang.String str10 = admin2.getEmail();
        boolean boolean11 = admin2.isVerified();
        java.lang.String str12 = admin2.getAccountType();
        admin2.login("hi!", "hi!");
        room.Room room16 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "admin" + "'", str12, "admin");
    }

    @Test
    public void test01536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01536");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        java.lang.String str5 = admin2.getID();
        admin2.setVerified(false);
        double double8 = admin2.getHourlyRate();
        java.lang.String str9 = admin2.getAccountType();
        java.lang.String str10 = admin2.getID();
        admin2.viewProfile();
        java.lang.String str12 = admin2.getAccountType();
        room.Room room13 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "admin" + "'", str12, "admin");
    }

    @Test
    public void test01537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01537");
        model.Admin admin2 = new model.Admin("admin", "hi!");
        java.lang.String str3 = admin2.getPassword();
        admin2.login("admin", "");
        java.lang.String str7 = admin2.getID();
        room.Room room8 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
    }

    @Test
    public void test01538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01538");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        admin2.login("", "");
        java.lang.String str9 = admin2.getEmail();
        admin2.login("", "");
        admin2.setVerified(false);
        admin2.login("hi!", "hi!");
        room.Room room18 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test01539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01539");
        model.Admin admin2 = new model.Admin("admin", "");
        admin2.setVerified(true);
        java.lang.String str5 = admin2.getEmail();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getPassword();
        admin2.login("", "");
        room.Room room11 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test01540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01540");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getAccountType();
        admin2.setVerified(false);
        double double6 = admin2.getHourlyRate();
        room.Room room7 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test01541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01541");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getPassword();
        admin2.setVerified(true);
        java.lang.String str10 = admin2.getEmail();
        java.lang.String str11 = admin2.getEmail();
        double double12 = admin2.getHourlyRate();
        room.Room room13 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test01542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01542");
        model.Admin admin2 = new model.Admin("hi!", "admin");
        java.lang.String str3 = admin2.getID();
        admin2.setVerified(false);
        admin2.viewProfile();
        admin2.viewProfile();
        java.lang.String str8 = admin2.getAccountType();
        room.Room room9 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
    }

    @Test
    public void test01543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01543");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        admin2.viewProfile();
        admin2.viewProfile();
        admin2.setVerified(false);
        room.Room room11 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test01544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01544");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getID();
        boolean boolean8 = admin2.isVerified();
        admin2.viewProfile();
        admin2.setVerified(true);
        java.lang.String str12 = admin2.getEmail();
        double double13 = admin2.getHourlyRate();
        java.lang.String str14 = admin2.getAccountType();
        java.lang.String str15 = admin2.getEmail();
        admin2.login("admin", "hi!");
        room.Room room19 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "admin" + "'", str14, "admin");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test01545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01545");
        model.Admin admin2 = new model.Admin("", "admin");
        java.lang.String str3 = admin2.getEmail();
        admin2.viewProfile();
        java.lang.String str5 = admin2.getAccountType();
        admin2.viewProfile();
        java.lang.Class<?> wildcardClass7 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test01546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01546");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        boolean boolean6 = admin2.isVerified();
        admin2.login("hi!", "admin");
        java.lang.String str10 = admin2.getAccountType();
        java.lang.String str11 = admin2.getEmail();
        java.lang.String str12 = admin2.getPassword();
        room.Room room13 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test01547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01547");
        model.Admin admin2 = new model.Admin("", "");
        java.lang.String str3 = admin2.getAccountType();
        java.lang.String str4 = admin2.getEmail();
        admin2.login("hi!", "");
        java.lang.String str8 = admin2.getAccountType();
        java.lang.String str9 = admin2.getID();
        admin2.logout();
        java.lang.String str11 = admin2.getPassword();
        room.Room room12 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test01548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01548");
        model.Admin admin2 = new model.Admin("", "");
        java.lang.String str3 = admin2.getAccountType();
        admin2.setVerified(true);
        double double6 = admin2.getHourlyRate();
        admin2.viewProfile();
        boolean boolean8 = admin2.isVerified();
        java.lang.String str9 = admin2.getEmail();
        java.lang.String str10 = admin2.getPassword();
        admin2.login("hi!", "hi!");
        room.Room room14 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test01549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01549");
        model.Admin admin2 = new model.Admin("", "");
        java.lang.String str3 = admin2.getAccountType();
        admin2.setVerified(true);
        admin2.viewProfile();
        java.lang.String str7 = admin2.getEmail();
        admin2.login("hi!", "admin");
        java.lang.Class<?> wildcardClass11 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test01550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01550");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getID();
        admin2.viewProfile();
        java.lang.String str9 = admin2.getID();
        admin2.logout();
        java.lang.String str11 = admin2.getID();
        java.lang.Class<?> wildcardClass12 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "admin" + "'", str11, "admin");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test01551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01551");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        admin2.login("", "");
        boolean boolean9 = admin2.isVerified();
        admin2.login("hi!", "admin");
        room.Room room13 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test01552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01552");
        model.Admin admin2 = new model.Admin("", "");
        java.lang.String str3 = admin2.getAccountType();
        admin2.setVerified(true);
        double double6 = admin2.getHourlyRate();
        admin2.viewProfile();
        boolean boolean8 = admin2.isVerified();
        java.lang.String str9 = admin2.getID();
        admin2.login("admin", "");
        admin2.viewProfile();
        java.lang.String str14 = admin2.getEmail();
        java.lang.String str15 = admin2.getPassword();
        admin2.login("admin", "");
        boolean boolean19 = admin2.isVerified();
        java.lang.Class<?> wildcardClass20 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test01553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01553");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.viewProfile();
        java.lang.String str4 = admin2.getPassword();
        admin2.login("", "");
        boolean boolean8 = admin2.isVerified();
        admin2.login("admin", "hi!");
        admin2.logout();
        admin2.login("hi!", "hi!");
        java.lang.String str16 = admin2.getPassword();
        room.Room room17 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "admin" + "'", str16, "admin");
    }

    @Test
    public void test01554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01554");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getID();
        admin2.setVerified(false);
        admin2.setVerified(false);
        java.lang.String str12 = admin2.getPassword();
        boolean boolean13 = admin2.isVerified();
        java.lang.String str14 = admin2.getID();
        java.lang.String str15 = admin2.getPassword();
        admin2.login("", "hi!");
        room.Room room19 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "admin" + "'", str14, "admin");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test01555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01555");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        admin2.login("", "");
        java.lang.String str9 = admin2.getPassword();
        java.lang.String str10 = admin2.getID();
        java.lang.String str11 = admin2.getAccountType();
        room.Room room12 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "admin" + "'", str11, "admin");
    }

    @Test
    public void test01556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01556");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        admin2.setVerified(true);
        java.lang.String str9 = admin2.getEmail();
        admin2.viewProfile();
        java.lang.String str11 = admin2.getEmail();
        java.lang.String str12 = admin2.getID();
        admin2.setVerified(true);
        room.Room room15 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "admin" + "'", str12, "admin");
    }

    @Test
    public void test01557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01557");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        java.lang.String str4 = admin2.getEmail();
        boolean boolean5 = admin2.isVerified();
        java.lang.String str6 = admin2.getAccountType();
        admin2.setVerified(false);
        room.Room room9 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "admin" + "'", str6, "admin");
    }

    @Test
    public void test01558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01558");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.viewProfile();
        java.lang.String str4 = admin2.getID();
        admin2.logout();
        room.Room room6 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
    }

    @Test
    public void test01559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01559");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.viewProfile();
        java.lang.String str4 = admin2.getPassword();
        admin2.login("", "");
        boolean boolean8 = admin2.isVerified();
        admin2.setVerified(false);
        double double11 = admin2.getHourlyRate();
        java.lang.String str12 = admin2.getPassword();
        java.lang.String str13 = admin2.getAccountType();
        room.Room room14 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "admin" + "'", str12, "admin");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "admin" + "'", str13, "admin");
    }

    @Test
    public void test01560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01560");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        java.lang.String str5 = admin2.getID();
        java.lang.String str6 = admin2.getID();
        java.lang.String str7 = admin2.getAccountType();
        admin2.logout();
        java.lang.String str9 = admin2.getEmail();
        java.lang.String str10 = admin2.getPassword();
        room.Room room11 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "admin" + "'", str6, "admin");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test01561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01561");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getID();
        admin2.viewProfile();
        admin2.logout();
        admin2.setVerified(false);
        admin2.viewProfile();
        admin2.viewProfile();
        room.Room room14 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
    }

    @Test
    public void test01562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01562");
        model.Admin admin2 = new model.Admin("admin", "");
        admin2.setVerified(true);
        java.lang.String str5 = admin2.getID();
        boolean boolean6 = admin2.isVerified();
        admin2.setVerified(true);
        java.lang.String str9 = admin2.getID();
        room.Room room10 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
    }

    @Test
    public void test01563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01563");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        java.lang.String str5 = admin2.getID();
        boolean boolean6 = admin2.isVerified();
        double double7 = admin2.getHourlyRate();
        room.Room room8 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test01564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01564");
        model.Admin admin2 = new model.Admin("admin", "");
        admin2.setVerified(true);
        admin2.logout();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getID();
        java.lang.String str8 = admin2.getID();
        room.Room room9 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
    }

    @Test
    public void test01565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01565");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getAccountType();
        boolean boolean4 = admin2.isVerified();
        java.lang.String str5 = admin2.getPassword();
        java.lang.String str6 = admin2.getID();
        admin2.login("admin", "admin");
        java.lang.String str10 = admin2.getPassword();
        room.Room room11 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "admin" + "'", str6, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test01566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01566");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getID();
        admin2.viewProfile();
        admin2.logout();
        admin2.setVerified(false);
        java.lang.String str12 = admin2.getID();
        boolean boolean13 = admin2.isVerified();
        double double14 = admin2.getHourlyRate();
        room.Room room15 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "admin" + "'", str12, "admin");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test01567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01567");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        admin2.setVerified(true);
        java.lang.String str9 = admin2.getEmail();
        admin2.login("hi!", "");
        admin2.login("admin", "");
        java.lang.String str16 = admin2.getPassword();
        admin2.viewProfile();
        room.Room room18 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test01568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01568");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        admin2.login("", "");
        java.lang.String str9 = admin2.getID();
        java.lang.String str10 = admin2.getEmail();
        admin2.logout();
        double double12 = admin2.getHourlyRate();
        java.lang.Class<?> wildcardClass13 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test01569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01569");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getPassword();
        admin2.login("admin", "admin");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test01570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01570");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        admin2.login("", "");
        java.lang.String str9 = admin2.getEmail();
        admin2.login("", "");
        admin2.setVerified(false);
        java.lang.String str15 = admin2.getEmail();
        room.Room room16 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test01571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01571");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getAccountType();
        boolean boolean4 = admin2.isVerified();
        boolean boolean5 = admin2.isVerified();
        admin2.logout();
        admin2.login("admin", "hi!");
        java.lang.String str10 = admin2.getPassword();
        java.lang.String str11 = admin2.getAccountType();
        admin2.login("hi!", "hi!");
        room.Room room15 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "admin" + "'", str11, "admin");
    }

    @Test
    public void test01572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01572");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getPassword();
        admin2.logout();
        double double9 = admin2.getHourlyRate();
        boolean boolean10 = admin2.isVerified();
        admin2.logout();
        java.lang.Class<?> wildcardClass12 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test01573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01573");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getAccountType();
        admin2.setVerified(false);
        admin2.login("hi!", "hi!");
        java.lang.String str9 = admin2.getEmail();
        admin2.setVerified(false);
        room.Room room12 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test01574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01574");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        admin2.logout();
        admin2.setVerified(false);
        java.lang.String str6 = admin2.getEmail();
        admin2.viewProfile();
        admin2.setVerified(true);
        admin2.login("admin", "");
        room.Room room13 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test01575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01575");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        java.lang.String str5 = admin2.getID();
        java.lang.String str6 = admin2.getID();
        admin2.logout();
        admin2.setVerified(true);
        admin2.login("hi!", "");
        java.lang.String str13 = admin2.getEmail();
        admin2.setVerified(true);
        room.Room room16 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "admin" + "'", str6, "admin");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test01576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01576");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        admin2.login("hi!", "");
        double double9 = admin2.getHourlyRate();
        admin2.login("", "hi!");
        boolean boolean13 = admin2.isVerified();
        admin2.logout();
        admin2.setVerified(false);
        java.lang.String str17 = admin2.getPassword();
        room.Room room18 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test01577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01577");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.viewProfile();
        java.lang.String str4 = admin2.getID();
        java.lang.String str5 = admin2.getAccountType();
        java.lang.String str6 = admin2.getEmail();
        double double7 = admin2.getHourlyRate();
        admin2.logout();
        java.lang.Class<?> wildcardClass9 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "admin" + "'", str6, "admin");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test01578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01578");
        model.Admin admin2 = new model.Admin("admin", "");
        admin2.setVerified(true);
        java.lang.String str5 = admin2.getAccountType();
        java.lang.String str6 = admin2.getAccountType();
        java.lang.String str7 = admin2.getEmail();
        java.lang.String str8 = admin2.getPassword();
        room.Room room9 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "admin" + "'", str6, "admin");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test01579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01579");
        model.Admin admin2 = new model.Admin("", "");
        java.lang.String str3 = admin2.getAccountType();
        java.lang.String str4 = admin2.getEmail();
        java.lang.String str5 = admin2.getID();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getEmail();
        admin2.login("admin", "admin");
        admin2.login("admin", "admin");
        admin2.logout();
        java.lang.String str15 = admin2.getAccountType();
        room.Room room16 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "admin" + "'", str15, "admin");
    }

    @Test
    public void test01580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01580");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        admin2.login("hi!", "");
        double double9 = admin2.getHourlyRate();
        admin2.login("", "");
        admin2.logout();
        room.Room room14 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test01581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01581");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        admin2.logout();
        admin2.setVerified(false);
        java.lang.String str6 = admin2.getEmail();
        admin2.viewProfile();
        admin2.viewProfile();
        double double9 = admin2.getHourlyRate();
        admin2.setVerified(true);
        admin2.viewProfile();
        boolean boolean13 = admin2.isVerified();
        java.lang.String str14 = admin2.getID();
        room.Room room15 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "admin" + "'", str14, "admin");
    }

    @Test
    public void test01582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01582");
        model.Admin admin2 = new model.Admin("admin", "");
        admin2.setVerified(true);
        boolean boolean5 = admin2.isVerified();
        admin2.logout();
        java.lang.String str7 = admin2.getEmail();
        room.Room room8 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
    }

    @Test
    public void test01583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01583");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.viewProfile();
        java.lang.String str4 = admin2.getID();
        admin2.logout();
        java.lang.String str6 = admin2.getAccountType();
        admin2.viewProfile();
        admin2.setVerified(true);
        boolean boolean10 = admin2.isVerified();
        java.lang.String str11 = admin2.getEmail();
        boolean boolean12 = admin2.isVerified();
        admin2.logout();
        room.Room room14 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "admin" + "'", str6, "admin");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "admin" + "'", str11, "admin");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test01584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01584");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        admin2.setVerified(true);
        java.lang.String str9 = admin2.getPassword();
        admin2.login("hi!", "admin");
        double double13 = admin2.getHourlyRate();
        java.lang.String str14 = admin2.getID();
        room.Room room15 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "admin" + "'", str14, "admin");
    }

    @Test
    public void test01585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01585");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.viewProfile();
        java.lang.String str4 = admin2.getID();
        java.lang.String str5 = admin2.getPassword();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getEmail();
        java.lang.String str8 = admin2.getEmail();
        room.Room room9 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
    }

    @Test
    public void test01586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01586");
        model.Admin admin2 = new model.Admin("", "admin");
        java.lang.String str3 = admin2.getEmail();
        admin2.login("admin", "admin");
        admin2.logout();
        boolean boolean8 = admin2.isVerified();
        room.Room room9 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test01587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01587");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getID();
        boolean boolean8 = admin2.isVerified();
        admin2.login("", "");
        admin2.viewProfile();
        java.lang.String str13 = admin2.getPassword();
        admin2.logout();
        java.lang.String str15 = admin2.getAccountType();
        room.Room room16 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "admin" + "'", str15, "admin");
    }

    @Test
    public void test01588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01588");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        boolean boolean6 = admin2.isVerified();
        admin2.login("hi!", "");
        java.lang.String str10 = admin2.getEmail();
        java.lang.String str11 = admin2.getAccountType();
        admin2.viewProfile();
        room.Room room13 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "admin" + "'", str11, "admin");
    }

    @Test
    public void test01589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01589");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        java.lang.String str6 = admin2.getEmail();
        java.lang.String str7 = admin2.getPassword();
        admin2.logout();
        java.lang.String str9 = admin2.getAccountType();
        admin2.login("", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
    }

    @Test
    public void test01590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01590");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getID();
        admin2.viewProfile();
        double double9 = admin2.getHourlyRate();
        java.lang.String str10 = admin2.getPassword();
        admin2.logout();
        admin2.logout();
        admin2.logout();
        room.Room room14 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test01591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01591");
        model.Admin admin2 = new model.Admin("admin", "admin");
        boolean boolean3 = admin2.isVerified();
        admin2.login("hi!", "");
        admin2.viewProfile();
        java.lang.String str8 = admin2.getPassword();
        java.lang.String str9 = admin2.getPassword();
        admin2.login("hi!", "admin");
        java.lang.String str13 = admin2.getPassword();
        room.Room room14 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "admin" + "'", str13, "admin");
    }

    @Test
    public void test01592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01592");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.viewProfile();
        java.lang.String str4 = admin2.getPassword();
        admin2.login("", "");
        admin2.viewProfile();
        admin2.login("", "admin");
        java.lang.String str12 = admin2.getEmail();
        admin2.login("hi!", "hi!");
        java.lang.String str16 = admin2.getID();
        room.Room room17 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "admin" + "'", str12, "admin");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "admin" + "'", str16, "admin");
    }

    @Test
    public void test01593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01593");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getAccountType();
        boolean boolean4 = admin2.isVerified();
        java.lang.String str5 = admin2.getPassword();
        admin2.logout();
        admin2.logout();
        double double8 = admin2.getHourlyRate();
        java.lang.String str9 = admin2.getPassword();
        double double10 = admin2.getHourlyRate();
        java.lang.Class<?> wildcardClass11 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test01594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01594");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.viewProfile();
        java.lang.String str4 = admin2.getPassword();
        double double5 = admin2.getHourlyRate();
        java.lang.String str6 = admin2.getAccountType();
        boolean boolean7 = admin2.isVerified();
        admin2.viewProfile();
        double double9 = admin2.getHourlyRate();
        admin2.viewProfile();
        java.lang.String str11 = admin2.getPassword();
        java.lang.Class<?> wildcardClass12 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "admin" + "'", str6, "admin");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "admin" + "'", str11, "admin");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test01595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01595");
        model.Admin admin2 = new model.Admin("", "");
        java.lang.String str3 = admin2.getAccountType();
        admin2.setVerified(true);
        double double6 = admin2.getHourlyRate();
        admin2.setVerified(false);
        java.lang.String str9 = admin2.getEmail();
        java.lang.String str10 = admin2.getPassword();
        admin2.login("admin", "");
        admin2.setVerified(false);
        java.lang.Class<?> wildcardClass16 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test01596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01596");
        model.Admin admin2 = new model.Admin("", "admin");
        java.lang.String str3 = admin2.getEmail();
        admin2.viewProfile();
        java.lang.String str5 = admin2.getAccountType();
        admin2.viewProfile();
        room.Room room7 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
    }

    @Test
    public void test01597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01597");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        java.lang.String str4 = admin2.getAccountType();
        java.lang.String str5 = admin2.getPassword();
        admin2.logout();
        admin2.logout();
        admin2.login("admin", "");
        java.lang.Class<?> wildcardClass11 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test01598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01598");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getAccountType();
        admin2.setVerified(false);
        admin2.login("hi!", "hi!");
        admin2.logout();
        java.lang.Class<?> wildcardClass10 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test01599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01599");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        admin2.logout();
        admin2.login("", "admin");
        admin2.viewProfile();
        room.Room room8 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01600");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getID();
        admin2.viewProfile();
        double double9 = admin2.getHourlyRate();
        admin2.setVerified(true);
        room.Room room12 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test01601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01601");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        java.lang.String str5 = admin2.getID();
        admin2.setVerified(false);
        double double8 = admin2.getHourlyRate();
        admin2.viewProfile();
        room.Room room10 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test01602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01602");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getPassword();
        admin2.setVerified(true);
        boolean boolean10 = admin2.isVerified();
        java.lang.String str11 = admin2.getEmail();
        admin2.setVerified(false);
        java.lang.String str14 = admin2.getPassword();
        java.lang.String str15 = admin2.getPassword();
        boolean boolean16 = admin2.isVerified();
        java.lang.String str17 = admin2.getPassword();
        java.lang.String str18 = admin2.getEmail();
        admin2.logout();
        double double20 = admin2.getHourlyRate();
        java.lang.String str21 = admin2.getAccountType();
        admin2.viewProfile();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "admin" + "'", str21, "admin");
    }

    @Test
    public void test01603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01603");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        boolean boolean6 = admin2.isVerified();
        admin2.login("hi!", "");
        java.lang.String str10 = admin2.getEmail();
        double double11 = admin2.getHourlyRate();
        admin2.viewProfile();
        room.Room room13 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test01604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01604");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.login("admin", "admin");
        boolean boolean6 = admin2.isVerified();
        admin2.logout();
        admin2.logout();
        admin2.login("hi!", "admin");
        boolean boolean12 = admin2.isVerified();
        java.lang.String str13 = admin2.getPassword();
        double double14 = admin2.getHourlyRate();
        room.Room room15 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "admin" + "'", str13, "admin");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test01605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01605");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        boolean boolean6 = admin2.isVerified();
        java.lang.String str7 = admin2.getPassword();
        java.lang.String str8 = admin2.getEmail();
        java.lang.String str9 = admin2.getAccountType();
        admin2.logout();
        room.Room room11 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
    }

    @Test
    public void test01606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01606");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        java.lang.String str4 = admin2.getEmail();
        admin2.logout();
        admin2.logout();
        java.lang.String str7 = admin2.getPassword();
        admin2.viewProfile();
        java.lang.String str9 = admin2.getID();
        java.lang.String str10 = admin2.getAccountType();
        double double11 = admin2.getHourlyRate();
        admin2.login("hi!", "hi!");
        room.Room room15 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test01607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01607");
        model.Admin admin2 = new model.Admin("admin", "admin");
        boolean boolean3 = admin2.isVerified();
        java.lang.String str4 = admin2.getPassword();
        java.lang.Class<?> wildcardClass5 = admin2.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test01608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01608");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getID();
        boolean boolean8 = admin2.isVerified();
        admin2.login("", "");
        admin2.viewProfile();
        java.lang.String str13 = admin2.getPassword();
        boolean boolean14 = admin2.isVerified();
        admin2.login("hi!", "admin");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test01609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01609");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getAccountType();
        boolean boolean4 = admin2.isVerified();
        java.lang.String str5 = admin2.getPassword();
        admin2.logout();
        admin2.logout();
        admin2.logout();
        boolean boolean9 = admin2.isVerified();
        room.Room room10 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test01610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01610");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        admin2.login("hi!", "");
        admin2.logout();
        java.lang.String str10 = admin2.getID();
        java.lang.String str11 = admin2.getID();
        room.Room room12 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "admin" + "'", str11, "admin");
    }

    @Test
    public void test01611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01611");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.viewProfile();
        java.lang.String str4 = admin2.getPassword();
        java.lang.String str5 = admin2.getPassword();
        admin2.setVerified(false);
        java.lang.String str8 = admin2.getID();
        admin2.setVerified(false);
        room.Room room11 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
    }

    @Test
    public void test01612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01612");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getID();
        admin2.viewProfile();
        admin2.logout();
        admin2.setVerified(false);
        java.lang.String str12 = admin2.getEmail();
        java.lang.String str13 = admin2.getID();
        java.lang.Class<?> wildcardClass14 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "admin" + "'", str13, "admin");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test01613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01613");
        model.Admin admin2 = new model.Admin("admin", "");
        admin2.setVerified(true);
        boolean boolean5 = admin2.isVerified();
        admin2.logout();
        room.Room room7 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test01614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01614");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        boolean boolean6 = admin2.isVerified();
        admin2.login("hi!", "admin");
        java.lang.String str10 = admin2.getID();
        admin2.login("hi!", "");
        java.lang.String str14 = admin2.getEmail();
        admin2.setVerified(false);
        java.lang.String str17 = admin2.getPassword();
        room.Room room18 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test01615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01615");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        admin2.viewProfile();
        admin2.login("hi!", "admin");
        boolean boolean10 = admin2.isVerified();
        admin2.logout();
        admin2.logout();
        room.Room room13 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test01616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01616");
        model.Admin admin2 = new model.Admin("admin", "");
        admin2.logout();
        double double4 = admin2.getHourlyRate();
        java.lang.String str5 = admin2.getAccountType();
        admin2.viewProfile();
        room.Room room7 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
    }

    @Test
    public void test01617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01617");
        model.Admin admin2 = new model.Admin("admin", "");
        admin2.logout();
        double double4 = admin2.getHourlyRate();
        admin2.setVerified(false);
        java.lang.String str7 = admin2.getEmail();
        java.lang.Class<?> wildcardClass8 = admin2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test01618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01618");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        admin2.logout();
        admin2.setVerified(false);
        java.lang.String str6 = admin2.getEmail();
        admin2.setVerified(false);
        java.lang.String str9 = admin2.getPassword();
        room.Room room10 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test01619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01619");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getAccountType();
        java.lang.String str4 = admin2.getPassword();
        admin2.setVerified(true);
        java.lang.String str7 = admin2.getEmail();
        double double8 = admin2.getHourlyRate();
        admin2.logout();
        java.lang.String str10 = admin2.getPassword();
        room.Room room11 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test01620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01620");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getAccountType();
        admin2.setVerified(false);
        admin2.login("hi!", "hi!");
        room.Room room9 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
    }

    @Test
    public void test01621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01621");
        model.Admin admin2 = new model.Admin("", "");
        java.lang.String str3 = admin2.getAccountType();
        admin2.setVerified(true);
        double double6 = admin2.getHourlyRate();
        admin2.setVerified(false);
        java.lang.String str9 = admin2.getEmail();
        java.lang.String str10 = admin2.getPassword();
        java.lang.String str11 = admin2.getPassword();
        admin2.logout();
        admin2.login("hi!", "admin");
        boolean boolean16 = admin2.isVerified();
        java.lang.Class<?> wildcardClass17 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test01622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01622");
        model.Admin admin2 = new model.Admin("", "");
        java.lang.String str3 = admin2.getAccountType();
        java.lang.String str4 = admin2.getEmail();
        java.lang.String str5 = admin2.getID();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getAccountType();
        admin2.setVerified(false);
        boolean boolean10 = admin2.isVerified();
        admin2.login("", "hi!");
        java.lang.String str14 = admin2.getAccountType();
        room.Room room15 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "admin" + "'", str14, "admin");
    }

    @Test
    public void test01623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01623");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        java.lang.String str5 = admin2.getID();
        admin2.setVerified(false);
        double double8 = admin2.getHourlyRate();
        java.lang.String str9 = admin2.getAccountType();
        java.lang.String str10 = admin2.getID();
        admin2.viewProfile();
        java.lang.String str12 = admin2.getAccountType();
        room.Room room13 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "admin" + "'", str12, "admin");
    }

    @Test
    public void test01624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01624");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        admin2.login("admin", "hi!");
        boolean boolean9 = admin2.isVerified();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test01625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01625");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        admin2.setVerified(true);
        double double8 = admin2.getHourlyRate();
        admin2.logout();
        admin2.login("hi!", "");
        admin2.setVerified(false);
        java.lang.String str15 = admin2.getAccountType();
        java.lang.String str16 = admin2.getEmail();
        admin2.login("", "hi!");
        admin2.viewProfile();
        room.Room room21 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "admin" + "'", str15, "admin");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test01626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01626");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getAccountType();
        boolean boolean4 = admin2.isVerified();
        admin2.login("admin", "admin");
        room.Room room8 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test01627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01627");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        admin2.logout();
        admin2.setVerified(false);
        java.lang.String str6 = admin2.getEmail();
        admin2.viewProfile();
        admin2.viewProfile();
        double double9 = admin2.getHourlyRate();
        admin2.setVerified(false);
        boolean boolean12 = admin2.isVerified();
        admin2.setVerified(false);
        java.lang.String str15 = admin2.getID();
        room.Room room16 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "admin" + "'", str15, "admin");
    }

    @Test
    public void test01628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01628");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.viewProfile();
        java.lang.String str4 = admin2.getPassword();
        admin2.login("", "");
        java.lang.String str8 = admin2.getEmail();
        java.lang.String str9 = admin2.getAccountType();
        admin2.viewProfile();
        java.lang.String str11 = admin2.getPassword();
        admin2.login("admin", "hi!");
        room.Room room15 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "admin" + "'", str11, "admin");
    }

    @Test
    public void test01629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01629");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getPassword();
        admin2.logout();
        boolean boolean9 = admin2.isVerified();
        room.Room room10 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test01630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01630");
        model.Admin admin2 = new model.Admin("", "admin");
        java.lang.String str3 = admin2.getEmail();
        java.lang.String str4 = admin2.getPassword();
        java.lang.String str5 = admin2.getPassword();
        room.Room room6 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
    }

    @Test
    public void test01631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01631");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        java.lang.String str5 = admin2.getID();
        java.lang.String str6 = admin2.getID();
        admin2.logout();
        admin2.setVerified(true);
        admin2.login("hi!", "");
        java.lang.String str13 = admin2.getEmail();
        room.Room room14 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "admin" + "'", str6, "admin");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test01632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01632");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.viewProfile();
        java.lang.String str4 = admin2.getPassword();
        boolean boolean5 = admin2.isVerified();
        java.lang.String str6 = admin2.getPassword();
        admin2.login("hi!", "hi!");
        java.lang.String str10 = admin2.getPassword();
        admin2.logout();
        room.Room room12 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "admin" + "'", str6, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
    }

    @Test
    public void test01633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01633");
        model.Admin admin2 = new model.Admin("", "");
        java.lang.String str3 = admin2.getAccountType();
        java.lang.String str4 = admin2.getEmail();
        java.lang.String str5 = admin2.getID();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getEmail();
        boolean boolean8 = admin2.isVerified();
        java.lang.Class<?> wildcardClass9 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test01634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01634");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getID();
        admin2.viewProfile();
        admin2.logout();
        java.lang.String str10 = admin2.getEmail();
        boolean boolean11 = admin2.isVerified();
        java.lang.String str12 = admin2.getAccountType();
        admin2.viewProfile();
        admin2.login("", "");
        double double17 = admin2.getHourlyRate();
        room.Room room18 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "admin" + "'", str12, "admin");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test01635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01635");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        admin2.logout();
        admin2.setVerified(false);
        java.lang.String str6 = admin2.getEmail();
        admin2.viewProfile();
        admin2.viewProfile();
        double double9 = admin2.getHourlyRate();
        double double10 = admin2.getHourlyRate();
        double double11 = admin2.getHourlyRate();
        java.lang.String str12 = admin2.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test01636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01636");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.viewProfile();
        java.lang.String str4 = admin2.getPassword();
        admin2.login("", "");
        boolean boolean8 = admin2.isVerified();
        admin2.setVerified(false);
        java.lang.String str11 = admin2.getAccountType();
        double double12 = admin2.getHourlyRate();
        java.lang.String str13 = admin2.getEmail();
        admin2.setVerified(true);
        java.lang.String str16 = admin2.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "admin" + "'", str11, "admin");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "admin" + "'", str13, "admin");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "admin" + "'", str16, "admin");
    }

    @Test
    public void test01637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01637");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.viewProfile();
        java.lang.String str4 = admin2.getID();
        java.lang.String str5 = admin2.getPassword();
        admin2.viewProfile();
        admin2.logout();
        room.Room room8 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
    }

    @Test
    public void test01638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01638");
        model.Admin admin2 = new model.Admin("", "admin");
        java.lang.String str3 = admin2.getEmail();
        java.lang.String str4 = admin2.getPassword();
        java.lang.String str5 = admin2.getPassword();
        admin2.setVerified(false);
        admin2.viewProfile();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
    }

    @Test
    public void test01639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01639");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        boolean boolean6 = admin2.isVerified();
        admin2.login("hi!", "");
        java.lang.String str10 = admin2.getEmail();
        double double11 = admin2.getHourlyRate();
        java.lang.Class<?> wildcardClass12 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test01640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01640");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        java.lang.String str4 = admin2.getAccountType();
        java.lang.String str5 = admin2.getID();
        java.lang.String str6 = admin2.getEmail();
        java.lang.String str7 = admin2.getPassword();
        java.lang.String str8 = admin2.getID();
        java.lang.String str9 = admin2.getEmail();
        admin2.login("admin", "admin");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test01641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01641");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        boolean boolean6 = admin2.isVerified();
        java.lang.String str7 = admin2.getAccountType();
        admin2.login("", "hi!");
        java.lang.String str11 = admin2.getEmail();
        java.lang.String str12 = admin2.getPassword();
        room.Room room13 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test01642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01642");
        model.Admin admin2 = new model.Admin("admin", "");
        admin2.logout();
        admin2.viewProfile();
        boolean boolean5 = admin2.isVerified();
        admin2.setVerified(true);
        room.Room room8 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test01643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01643");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getPassword();
        java.lang.String str8 = admin2.getEmail();
        boolean boolean9 = admin2.isVerified();
        double double10 = admin2.getHourlyRate();
        double double11 = admin2.getHourlyRate();
        java.lang.String str12 = admin2.getAccountType();
        java.lang.Class<?> wildcardClass13 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "admin" + "'", str12, "admin");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test01644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01644");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.viewProfile();
        java.lang.String str4 = admin2.getPassword();
        admin2.login("", "");
        java.lang.String str8 = admin2.getEmail();
        java.lang.String str9 = admin2.getAccountType();
        java.lang.String str10 = admin2.getPassword();
        admin2.logout();
        admin2.viewProfile();
        room.Room room13 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
    }

    @Test
    public void test01645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01645");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getAccountType();
        boolean boolean4 = admin2.isVerified();
        java.lang.String str5 = admin2.getPassword();
        admin2.logout();
        admin2.viewProfile();
        java.lang.String str8 = admin2.getEmail();
        double double9 = admin2.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test01646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01646");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getID();
        admin2.viewProfile();
        admin2.logout();
        admin2.setVerified(false);
        java.lang.String str12 = admin2.getEmail();
        java.lang.String str13 = admin2.getEmail();
        java.lang.String str14 = admin2.getPassword();
        room.Room room15 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test01647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01647");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        java.lang.String str6 = admin2.getEmail();
        double double7 = admin2.getHourlyRate();
        java.lang.Class<?> wildcardClass8 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test01648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01648");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getID();
        admin2.viewProfile();
        java.lang.String str9 = admin2.getID();
        admin2.logout();
        room.Room room11 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
    }

    @Test
    public void test01649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01649");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getPassword();
        java.lang.String str4 = admin2.getID();
        admin2.login("", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
    }

    @Test
    public void test01650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01650");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.viewProfile();
        java.lang.String str4 = admin2.getID();
        admin2.logout();
        java.lang.String str6 = admin2.getAccountType();
        admin2.viewProfile();
        admin2.setVerified(true);
        double double10 = admin2.getHourlyRate();
        java.lang.String str11 = admin2.getID();
        double double12 = admin2.getHourlyRate();
        java.lang.String str13 = admin2.getID();
        room.Room room14 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "admin" + "'", str6, "admin");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "admin" + "'", str11, "admin");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "admin" + "'", str13, "admin");
    }

    @Test
    public void test01651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01651");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getPassword();
        admin2.setVerified(true);
        boolean boolean10 = admin2.isVerified();
        java.lang.String str11 = admin2.getEmail();
        admin2.setVerified(false);
        java.lang.String str14 = admin2.getPassword();
        java.lang.String str15 = admin2.getPassword();
        boolean boolean16 = admin2.isVerified();
        admin2.logout();
        java.lang.String str18 = admin2.getID();
        java.lang.String str19 = admin2.getEmail();
        room.Room room20 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "admin" + "'", str18, "admin");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test01652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01652");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getPassword();
        admin2.logout();
        admin2.setVerified(true);
        admin2.setVerified(true);
        room.Room room13 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test01653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01653");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        admin2.logout();
        java.lang.String str4 = admin2.getAccountType();
        admin2.viewProfile();
        java.lang.String str6 = admin2.getID();
        room.Room room7 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "admin" + "'", str6, "admin");
    }

    @Test
    public void test01654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01654");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        admin2.viewProfile();
        admin2.logout();
        double double8 = admin2.getHourlyRate();
        boolean boolean9 = admin2.isVerified();
        java.lang.String str10 = admin2.getEmail();
        room.Room room11 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test01655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01655");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        java.lang.String str5 = admin2.getID();
        boolean boolean6 = admin2.isVerified();
        admin2.setVerified(false);
        java.lang.String str9 = admin2.getPassword();
        admin2.setVerified(false);
        room.Room room12 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test01656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01656");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        admin2.setVerified(true);
        admin2.logout();
        admin2.setVerified(false);
        room.Room room11 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test01657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01657");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        boolean boolean6 = admin2.isVerified();
        java.lang.String str7 = admin2.getAccountType();
        java.lang.String str8 = admin2.getAccountType();
        admin2.setVerified(false);
        java.lang.String str11 = admin2.getID();
        double double12 = admin2.getHourlyRate();
        java.lang.String str13 = admin2.getEmail();
        java.lang.String str14 = admin2.getEmail();
        room.Room room15 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "admin" + "'", str11, "admin");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test01658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01658");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        java.lang.String str5 = admin2.getEmail();
        admin2.logout();
        admin2.logout();
        room.Room room8 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test01659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01659");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getID();
        admin2.viewProfile();
        admin2.logout();
        java.lang.String str10 = admin2.getEmail();
        boolean boolean11 = admin2.isVerified();
        java.lang.String str12 = admin2.getAccountType();
        admin2.login("", "");
        java.lang.String str16 = admin2.getPassword();
        room.Room room17 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "admin" + "'", str12, "admin");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test01660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01660");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        admin2.setVerified(false);
        admin2.login("hi!", "");
        boolean boolean11 = admin2.isVerified();
        admin2.login("hi!", "");
        java.lang.Class<?> wildcardClass15 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test01661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01661");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        admin2.setVerified(true);
        admin2.setVerified(false);
        java.lang.String str10 = admin2.getEmail();
        admin2.setVerified(false);
        room.Room room13 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test01662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01662");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.viewProfile();
        java.lang.String str4 = admin2.getPassword();
        boolean boolean5 = admin2.isVerified();
        java.lang.String str6 = admin2.getPassword();
        admin2.login("", "");
        java.lang.String str10 = admin2.getPassword();
        java.lang.String str11 = admin2.getAccountType();
        boolean boolean12 = admin2.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "admin" + "'", str6, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "admin" + "'", str11, "admin");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test01663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01663");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        admin2.login("", "");
        java.lang.String str9 = admin2.getEmail();
        java.lang.String str10 = admin2.getAccountType();
        admin2.setVerified(false);
        java.lang.String str13 = admin2.getAccountType();
        room.Room room14 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "admin" + "'", str13, "admin");
    }

    @Test
    public void test01664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01664");
        model.Admin admin2 = new model.Admin("", "");
        java.lang.String str3 = admin2.getAccountType();
        java.lang.String str4 = admin2.getEmail();
        admin2.login("hi!", "");
        java.lang.String str8 = admin2.getAccountType();
        java.lang.String str9 = admin2.getEmail();
        room.Room room10 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test01665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01665");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getAccountType();
        boolean boolean4 = admin2.isVerified();
        boolean boolean5 = admin2.isVerified();
        admin2.logout();
        admin2.login("admin", "hi!");
        java.lang.String str10 = admin2.getID();
        java.lang.String str11 = admin2.getAccountType();
        java.lang.Class<?> wildcardClass12 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "admin" + "'", str11, "admin");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test01666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01666");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.login("admin", "admin");
        boolean boolean6 = admin2.isVerified();
        admin2.logout();
        java.lang.String str8 = admin2.getID();
        admin2.setVerified(true);
        admin2.setVerified(true);
        java.lang.String str13 = admin2.getID();
        room.Room room14 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "admin" + "'", str13, "admin");
    }

    @Test
    public void test01667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01667");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getPassword();
        boolean boolean4 = admin2.isVerified();
        java.lang.String str5 = admin2.getID();
        java.lang.String str6 = admin2.getEmail();
        java.lang.String str7 = admin2.getAccountType();
        admin2.setVerified(false);
        admin2.viewProfile();
        admin2.viewProfile();
        java.lang.Class<?> wildcardClass12 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test01668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01668");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getAccountType();
        boolean boolean4 = admin2.isVerified();
        boolean boolean5 = admin2.isVerified();
        java.lang.String str6 = admin2.getID();
        admin2.viewProfile();
        boolean boolean8 = admin2.isVerified();
        room.Room room9 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "admin" + "'", str6, "admin");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test01669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01669");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        java.lang.String str4 = admin2.getEmail();
        admin2.logout();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getAccountType();
        admin2.setVerified(true);
        room.Room room10 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
    }

    @Test
    public void test01670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01670");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        boolean boolean6 = admin2.isVerified();
        java.lang.String str7 = admin2.getAccountType();
        admin2.login("", "hi!");
        admin2.login("hi!", "hi!");
        admin2.setVerified(true);
        java.lang.String str16 = admin2.getEmail();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test01671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01671");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getAccountType();
        boolean boolean4 = admin2.isVerified();
        boolean boolean5 = admin2.isVerified();
        admin2.viewProfile();
        admin2.login("admin", "hi!");
        java.lang.String str10 = admin2.getPassword();
        admin2.login("", "hi!");
        double double14 = admin2.getHourlyRate();
        admin2.viewProfile();
        admin2.login("", "admin");
        java.lang.String str19 = admin2.getID();
        room.Room room20 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "admin" + "'", str19, "admin");
    }

    @Test
    public void test01672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01672");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        admin2.setVerified(false);
        boolean boolean8 = admin2.isVerified();
        room.Room room9 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test01673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01673");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.login("admin", "admin");
        boolean boolean6 = admin2.isVerified();
        admin2.logout();
        java.lang.String str8 = admin2.getID();
        admin2.setVerified(true);
        admin2.setVerified(true);
        double double13 = admin2.getHourlyRate();
        admin2.login("hi!", "");
        java.lang.Class<?> wildcardClass17 = admin2.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test01674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01674");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        boolean boolean6 = admin2.isVerified();
        admin2.login("hi!", "");
        java.lang.String str10 = admin2.getPassword();
        admin2.viewProfile();
        java.lang.String str12 = admin2.getPassword();
        java.lang.String str13 = admin2.getPassword();
        java.lang.Class<?> wildcardClass14 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test01675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01675");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        java.lang.String str4 = admin2.getAccountType();
        java.lang.String str5 = admin2.getPassword();
        admin2.logout();
        admin2.logout();
        room.Room room8 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test01676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01676");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        boolean boolean6 = admin2.isVerified();
        admin2.login("hi!", "admin");
        admin2.setVerified(false);
        boolean boolean12 = admin2.isVerified();
        admin2.viewProfile();
        admin2.setVerified(false);
        java.lang.String str16 = admin2.getEmail();
        admin2.login("admin", "");
        boolean boolean20 = admin2.isVerified();
        boolean boolean21 = admin2.isVerified();
        room.Room room22 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test01677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01677");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getID();
        boolean boolean8 = admin2.isVerified();
        admin2.viewProfile();
        admin2.setVerified(true);
        java.lang.String str12 = admin2.getEmail();
        double double13 = admin2.getHourlyRate();
        java.lang.String str14 = admin2.getAccountType();
        java.lang.Class<?> wildcardClass15 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "admin" + "'", str14, "admin");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test01678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01678");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getAccountType();
        boolean boolean4 = admin2.isVerified();
        boolean boolean5 = admin2.isVerified();
        java.lang.String str6 = admin2.getID();
        admin2.viewProfile();
        java.lang.Class<?> wildcardClass8 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "admin" + "'", str6, "admin");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test01679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01679");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getPassword();
        java.lang.String str8 = admin2.getEmail();
        boolean boolean9 = admin2.isVerified();
        java.lang.String str10 = admin2.getPassword();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test01680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01680");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getAccountType();
        boolean boolean4 = admin2.isVerified();
        java.lang.String str5 = admin2.getPassword();
        admin2.logout();
        admin2.login("", "");
        admin2.setVerified(true);
        room.Room room12 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test01681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01681");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        boolean boolean6 = admin2.isVerified();
        admin2.login("hi!", "admin");
        java.lang.String str10 = admin2.getAccountType();
        java.lang.String str11 = admin2.getEmail();
        admin2.logout();
        boolean boolean13 = admin2.isVerified();
        admin2.setVerified(false);
        java.lang.Class<?> wildcardClass16 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test01682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01682");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getID();
        boolean boolean8 = admin2.isVerified();
        admin2.viewProfile();
        admin2.setVerified(true);
        java.lang.String str12 = admin2.getEmail();
        double double13 = admin2.getHourlyRate();
        java.lang.Class<?> wildcardClass14 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test01683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01683");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        java.lang.String str4 = admin2.getEmail();
        admin2.logout();
        admin2.logout();
        java.lang.String str7 = admin2.getPassword();
        admin2.login("admin", "admin");
        admin2.viewProfile();
        admin2.setVerified(true);
        java.lang.String str14 = admin2.getAccountType();
        room.Room room15 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "admin" + "'", str14, "admin");
    }

    @Test
    public void test01684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01684");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getID();
        boolean boolean8 = admin2.isVerified();
        admin2.viewProfile();
        admin2.login("hi!", "");
        java.lang.String str13 = admin2.getID();
        java.lang.Class<?> wildcardClass14 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "admin" + "'", str13, "admin");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test01685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01685");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.viewProfile();
        java.lang.String str4 = admin2.getPassword();
        admin2.login("", "");
        boolean boolean8 = admin2.isVerified();
        admin2.setVerified(false);
        admin2.logout();
        java.lang.String str12 = admin2.getAccountType();
        java.lang.Class<?> wildcardClass13 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "admin" + "'", str12, "admin");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test01686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01686");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.viewProfile();
        java.lang.String str4 = admin2.getPassword();
        admin2.login("", "");
        boolean boolean8 = admin2.isVerified();
        admin2.setVerified(false);
        java.lang.String str11 = admin2.getAccountType();
        double double12 = admin2.getHourlyRate();
        admin2.viewProfile();
        admin2.viewProfile();
        room.Room room15 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "admin" + "'", str11, "admin");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test01687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01687");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        admin2.viewProfile();
        admin2.login("hi!", "admin");
        java.lang.String str10 = admin2.getAccountType();
        boolean boolean11 = admin2.isVerified();
        java.lang.String str12 = admin2.getPassword();
        admin2.login("", "hi!");
        room.Room room16 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test01688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01688");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getID();
        admin2.viewProfile();
        double double9 = admin2.getHourlyRate();
        java.lang.String str10 = admin2.getEmail();
        java.lang.String str11 = admin2.getPassword();
        java.lang.Class<?> wildcardClass12 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test01689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01689");
        model.Admin admin2 = new model.Admin("admin", "");
        admin2.setVerified(true);
        admin2.logout();
        java.lang.Class<?> wildcardClass6 = admin2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test01690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01690");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        java.lang.String str4 = admin2.getAccountType();
        java.lang.String str5 = admin2.getID();
        java.lang.String str6 = admin2.getEmail();
        java.lang.String str7 = admin2.getPassword();
        java.lang.String str8 = admin2.getID();
        java.lang.String str9 = admin2.getEmail();
        java.lang.String str10 = admin2.getPassword();
        room.Room room11 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test01691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01691");
        model.Admin admin2 = new model.Admin("admin", "");
        admin2.setVerified(true);
        java.lang.String str5 = admin2.getAccountType();
        java.lang.String str6 = admin2.getAccountType();
        admin2.logout();
        boolean boolean8 = admin2.isVerified();
        room.Room room9 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "admin" + "'", str6, "admin");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test01692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01692");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.login("admin", "admin");
        boolean boolean6 = admin2.isVerified();
        admin2.logout();
        java.lang.String str8 = admin2.getID();
        admin2.logout();
        double double10 = admin2.getHourlyRate();
        java.lang.String str11 = admin2.getAccountType();
        java.lang.Class<?> wildcardClass12 = admin2.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "admin" + "'", str11, "admin");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test01693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01693");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        admin2.logout();
        admin2.setVerified(false);
        java.lang.String str6 = admin2.getEmail();
        admin2.viewProfile();
        admin2.viewProfile();
        double double9 = admin2.getHourlyRate();
        admin2.setVerified(true);
        admin2.viewProfile();
        double double13 = admin2.getHourlyRate();
        room.Room room14 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test01694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01694");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getPassword();
        double double8 = admin2.getHourlyRate();
        admin2.logout();
        java.lang.String str10 = admin2.getPassword();
        java.lang.String str11 = admin2.getEmail();
        java.lang.String str12 = admin2.getEmail();
        room.Room room13 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test01695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01695");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        boolean boolean6 = admin2.isVerified();
        java.lang.String str7 = admin2.getPassword();
        double double8 = admin2.getHourlyRate();
        double double9 = admin2.getHourlyRate();
        java.lang.String str10 = admin2.getAccountType();
        room.Room room11 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
    }

    @Test
    public void test01696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01696");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        java.lang.String str4 = admin2.getEmail();
        admin2.logout();
        admin2.logout();
        java.lang.String str7 = admin2.getPassword();
        admin2.login("admin", "admin");
        room.Room room11 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test01697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01697");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.viewProfile();
        java.lang.String str4 = admin2.getID();
        admin2.logout();
        java.lang.String str6 = admin2.getAccountType();
        admin2.viewProfile();
        admin2.setVerified(true);
        java.lang.String str10 = admin2.getAccountType();
        java.lang.String str11 = admin2.getPassword();
        java.lang.String str12 = admin2.getPassword();
        room.Room room13 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "admin" + "'", str6, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "admin" + "'", str11, "admin");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "admin" + "'", str12, "admin");
    }

    @Test
    public void test01698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01698");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getID();
        boolean boolean8 = admin2.isVerified();
        admin2.login("", "");
        admin2.login("", "hi!");
        admin2.setVerified(true);
        room.Room room17 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test01699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01699");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        boolean boolean6 = admin2.isVerified();
        admin2.login("hi!", "admin");
        java.lang.String str10 = admin2.getEmail();
        boolean boolean11 = admin2.isVerified();
        admin2.viewProfile();
        room.Room room13 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test01700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01700");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        admin2.login("hi!", "");
        double double9 = admin2.getHourlyRate();
        java.lang.Class<?> wildcardClass10 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test01701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01701");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.viewProfile();
        java.lang.String str4 = admin2.getPassword();
        admin2.login("", "");
        admin2.viewProfile();
        room.Room room9 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
    }

    @Test
    public void test01702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01702");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.viewProfile();
        java.lang.String str4 = admin2.getPassword();
        admin2.login("", "");
        java.lang.String str8 = admin2.getEmail();
        java.lang.String str9 = admin2.getAccountType();
        java.lang.String str10 = admin2.getPassword();
        java.lang.String str11 = admin2.getID();
        admin2.logout();
        admin2.setVerified(false);
        boolean boolean15 = admin2.isVerified();
        room.Room room16 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "admin" + "'", str11, "admin");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test01703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01703");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        admin2.setVerified(true);
        admin2.logout();
        admin2.setVerified(false);
        boolean boolean11 = admin2.isVerified();
        room.Room room12 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test01704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01704");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getPassword();
        java.lang.String str4 = admin2.getAccountType();
        room.Room room5 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
    }

    @Test
    public void test01705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01705");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        admin2.logout();
        java.lang.String str4 = admin2.getAccountType();
        admin2.viewProfile();
        boolean boolean6 = admin2.isVerified();
        double double7 = admin2.getHourlyRate();
        java.lang.String str8 = admin2.getEmail();
        admin2.setVerified(false);
        room.Room room11 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test01706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01706");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getID();
        admin2.viewProfile();
        admin2.logout();
        admin2.setVerified(false);
        java.lang.String str12 = admin2.getEmail();
        java.lang.String str13 = admin2.getAccountType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "admin" + "'", str13, "admin");
    }

    @Test
    public void test01707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01707");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        admin2.setVerified(true);
        java.lang.String str9 = admin2.getEmail();
        admin2.login("hi!", "");
        admin2.login("admin", "");
        room.Room room16 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test01708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01708");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getPassword();
        admin2.setVerified(true);
        java.lang.String str10 = admin2.getID();
        java.lang.String str11 = admin2.getPassword();
        admin2.logout();
        room.Room room13 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test01709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01709");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        java.lang.String str5 = admin2.getID();
        admin2.setVerified(false);
        admin2.setVerified(false);
        java.lang.String str10 = admin2.getAccountType();
        room.Room room11 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
    }

    @Test
    public void test01710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01710");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.viewProfile();
        java.lang.String str4 = admin2.getPassword();
        admin2.login("", "");
        boolean boolean8 = admin2.isVerified();
        admin2.login("admin", "hi!");
        admin2.logout();
        admin2.login("hi!", "hi!");
        java.lang.String str16 = admin2.getAccountType();
        java.lang.String str17 = admin2.getAccountType();
        room.Room room18 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "admin" + "'", str16, "admin");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "admin" + "'", str17, "admin");
    }

    @Test
    public void test01711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01711");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.login("admin", "admin");
        boolean boolean6 = admin2.isVerified();
        admin2.logout();
        admin2.setVerified(false);
        java.lang.String str10 = admin2.getPassword();
        admin2.viewProfile();
        java.lang.Class<?> wildcardClass12 = admin2.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test01712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01712");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        admin2.setVerified(true);
        java.lang.String str9 = admin2.getID();
        admin2.logout();
        room.Room room11 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
    }

    @Test
    public void test01713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01713");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        java.lang.String str4 = admin2.getPassword();
        java.lang.String str5 = admin2.getAccountType();
        admin2.viewProfile();
        double double7 = admin2.getHourlyRate();
        java.lang.String str8 = admin2.getID();
        java.lang.String str9 = admin2.getAccountType();
        java.lang.String str10 = admin2.getPassword();
        admin2.logout();
        java.lang.String str12 = admin2.getPassword();
        java.lang.String str13 = admin2.getPassword();
        room.Room room14 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test01714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01714");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getID();
        admin2.viewProfile();
        admin2.logout();
        java.lang.String str10 = admin2.getEmail();
        boolean boolean11 = admin2.isVerified();
        java.lang.String str12 = admin2.getAccountType();
        boolean boolean13 = admin2.isVerified();
        boolean boolean14 = admin2.isVerified();
        admin2.setVerified(true);
        boolean boolean17 = admin2.isVerified();
        room.Room room18 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "admin" + "'", str12, "admin");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test01715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01715");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        admin2.logout();
        admin2.setVerified(false);
        java.lang.String str6 = admin2.getEmail();
        admin2.viewProfile();
        admin2.viewProfile();
        double double9 = admin2.getHourlyRate();
        double double10 = admin2.getHourlyRate();
        java.lang.Class<?> wildcardClass11 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test01716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01716");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.viewProfile();
        java.lang.String str4 = admin2.getPassword();
        admin2.login("", "");
        admin2.viewProfile();
        admin2.login("", "admin");
        java.lang.String str12 = admin2.getEmail();
        admin2.login("hi!", "hi!");
        java.lang.String str16 = admin2.getID();
        room.Room room17 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "admin" + "'", str12, "admin");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "admin" + "'", str16, "admin");
    }

    @Test
    public void test01717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01717");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getAccountType();
        boolean boolean4 = admin2.isVerified();
        boolean boolean5 = admin2.isVerified();
        admin2.viewProfile();
        admin2.login("admin", "hi!");
        java.lang.String str10 = admin2.getPassword();
        admin2.login("", "hi!");
        admin2.logout();
        admin2.login("admin", "");
        room.Room room18 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test01718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01718");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getID();
        admin2.viewProfile();
        admin2.logout();
        admin2.setVerified(false);
        java.lang.String str12 = admin2.getEmail();
        admin2.login("", "");
        java.lang.String str16 = admin2.getAccountType();
        room.Room room17 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "admin" + "'", str16, "admin");
    }

    @Test
    public void test01719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01719");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getPassword();
        admin2.setVerified(true);
        java.lang.String str10 = admin2.getEmail();
        java.lang.String str11 = admin2.getID();
        boolean boolean12 = admin2.isVerified();
        admin2.login("hi!", "hi!");
        admin2.setVerified(false);
        admin2.login("", "hi!");
        java.lang.Class<?> wildcardClass21 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "admin" + "'", str11, "admin");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test01720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01720");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getID();
        admin2.login("", "admin");
        admin2.viewProfile();
        room.Room room12 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
    }

    @Test
    public void test01721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01721");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        java.lang.String str4 = admin2.getEmail();
        boolean boolean5 = admin2.isVerified();
        java.lang.String str6 = admin2.getAccountType();
        admin2.logout();
        admin2.logout();
        room.Room room9 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "admin" + "'", str6, "admin");
    }

    @Test
    public void test01722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01722");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getAccountType();
        boolean boolean4 = admin2.isVerified();
        boolean boolean5 = admin2.isVerified();
        admin2.logout();
        double double7 = admin2.getHourlyRate();
        room.Room room8 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test01723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01723");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getAccountType();
        boolean boolean4 = admin2.isVerified();
        admin2.setVerified(false);
        java.lang.String str7 = admin2.getPassword();
        double double8 = admin2.getHourlyRate();
        admin2.setVerified(false);
        java.lang.Class<?> wildcardClass11 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test01724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01724");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getID();
        admin2.viewProfile();
        double double9 = admin2.getHourlyRate();
        admin2.setVerified(true);
        admin2.logout();
        java.lang.String str13 = admin2.getEmail();
        java.lang.String str14 = admin2.getPassword();
        room.Room room15 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test01725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01725");
        model.Admin admin2 = new model.Admin("", "");
        java.lang.String str3 = admin2.getAccountType();
        admin2.setVerified(true);
        double double6 = admin2.getHourlyRate();
        admin2.setVerified(false);
        admin2.logout();
        admin2.login("hi!", "");
        admin2.setVerified(true);
        admin2.login("", "");
        admin2.logout();
        admin2.viewProfile();
        java.lang.String str20 = admin2.getEmail();
        room.Room room21 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test01726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01726");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        admin2.login("", "");
        java.lang.String str9 = admin2.getEmail();
        java.lang.String str10 = admin2.getAccountType();
        java.lang.String str11 = admin2.getEmail();
        boolean boolean12 = admin2.isVerified();
        admin2.setVerified(false);
        boolean boolean15 = admin2.isVerified();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test01727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01727");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        admin2.login("", "");
        java.lang.String str9 = admin2.getAccountType();
        room.Room room10 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
    }

    @Test
    public void test01728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01728");
        model.Admin admin2 = new model.Admin("", "");
        java.lang.String str3 = admin2.getAccountType();
        java.lang.String str4 = admin2.getEmail();
        admin2.login("hi!", "");
        java.lang.String str8 = admin2.getAccountType();
        boolean boolean9 = admin2.isVerified();
        admin2.login("hi!", "hi!");
        room.Room room13 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test01729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01729");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        admin2.login("", "");
        java.lang.String str9 = admin2.getID();
        java.lang.String str10 = admin2.getEmail();
        java.lang.String str11 = admin2.getAccountType();
        admin2.logout();
        java.lang.String str13 = admin2.getPassword();
        admin2.setVerified(false);
        admin2.viewProfile();
        room.Room room17 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "admin" + "'", str11, "admin");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test01730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01730");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        admin2.setVerified(true);
        java.lang.String str9 = admin2.getEmail();
        java.lang.String str10 = admin2.getEmail();
        boolean boolean11 = admin2.isVerified();
        java.lang.String str12 = admin2.getPassword();
        java.lang.String str13 = admin2.getEmail();
        room.Room room14 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test01731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01731");
        model.Admin admin2 = new model.Admin("", "");
        java.lang.String str3 = admin2.getAccountType();
        admin2.setVerified(true);
        java.lang.String str6 = admin2.getAccountType();
        admin2.logout();
        double double8 = admin2.getHourlyRate();
        java.lang.String str9 = admin2.getEmail();
        admin2.login("", "hi!");
        boolean boolean13 = admin2.isVerified();
        admin2.login("", "hi!");
        room.Room room17 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "admin" + "'", str6, "admin");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test01732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01732");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        java.lang.String str4 = admin2.getEmail();
        admin2.logout();
        admin2.logout();
        java.lang.String str7 = admin2.getPassword();
        admin2.viewProfile();
        java.lang.String str9 = admin2.getID();
        java.lang.String str10 = admin2.getAccountType();
        double double11 = admin2.getHourlyRate();
        admin2.logout();
        room.Room room13 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test01733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01733");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        java.lang.String str5 = admin2.getID();
        admin2.setVerified(false);
        java.lang.String str8 = admin2.getPassword();
        admin2.logout();
        admin2.setVerified(true);
        admin2.setVerified(true);
        admin2.setVerified(true);
        java.lang.Class<?> wildcardClass16 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test01734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01734");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getPassword();
        admin2.setVerified(true);
        boolean boolean10 = admin2.isVerified();
        java.lang.String str11 = admin2.getPassword();
        double double12 = admin2.getHourlyRate();
        room.Room room13 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test01735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01735");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        admin2.logout();
        admin2.setVerified(false);
        java.lang.String str6 = admin2.getEmail();
        double double7 = admin2.getHourlyRate();
        room.Room room8 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test01736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01736");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getID();
        boolean boolean8 = admin2.isVerified();
        admin2.login("", "");
        admin2.viewProfile();
        boolean boolean13 = admin2.isVerified();
        boolean boolean14 = admin2.isVerified();
        admin2.logout();
        room.Room room16 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test01737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01737");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        java.lang.String str5 = admin2.getEmail();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getID();
        admin2.logout();
        room.Room room9 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
    }

    @Test
    public void test01738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01738");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        admin2.viewProfile();
        admin2.setVerified(false);
        java.lang.String str9 = admin2.getEmail();
        admin2.logout();
        admin2.logout();
        admin2.viewProfile();
        java.lang.Class<?> wildcardClass13 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test01739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01739");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getPassword();
        admin2.setVerified(true);
        admin2.setVerified(false);
        admin2.setVerified(false);
        java.lang.Class<?> wildcardClass14 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test01740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01740");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        boolean boolean6 = admin2.isVerified();
        java.lang.String str7 = admin2.getAccountType();
        java.lang.String str8 = admin2.getAccountType();
        admin2.setVerified(false);
        double double11 = admin2.getHourlyRate();
        room.Room room12 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test01741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01741");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        java.lang.String str4 = admin2.getPassword();
        java.lang.String str5 = admin2.getAccountType();
        admin2.viewProfile();
        double double7 = admin2.getHourlyRate();
        java.lang.String str8 = admin2.getID();
        java.lang.String str9 = admin2.getAccountType();
        java.lang.String str10 = admin2.getPassword();
        admin2.logout();
        java.lang.String str12 = admin2.getPassword();
        room.Room room13 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test01742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01742");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.viewProfile();
        java.lang.String str4 = admin2.getPassword();
        admin2.login("", "");
        admin2.login("hi!", "hi!");
        admin2.logout();
        java.lang.String str12 = admin2.getID();
        room.Room room13 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "admin" + "'", str12, "admin");
    }

    @Test
    public void test01743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01743");
        model.Admin admin2 = new model.Admin("", "");
        java.lang.String str3 = admin2.getAccountType();
        admin2.setVerified(true);
        double double6 = admin2.getHourlyRate();
        admin2.login("", "admin");
        double double10 = admin2.getHourlyRate();
        boolean boolean11 = admin2.isVerified();
        room.Room room12 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test01744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01744");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getID();
        boolean boolean8 = admin2.isVerified();
        admin2.viewProfile();
        admin2.setVerified(true);
        java.lang.String str12 = admin2.getEmail();
        double double13 = admin2.getHourlyRate();
        java.lang.String str14 = admin2.getAccountType();
        double double15 = admin2.getHourlyRate();
        java.lang.Class<?> wildcardClass16 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "admin" + "'", str14, "admin");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test01745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01745");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        boolean boolean6 = admin2.isVerified();
        admin2.login("hi!", "admin");
        java.lang.String str10 = admin2.getEmail();
        boolean boolean11 = admin2.isVerified();
        admin2.viewProfile();
        boolean boolean13 = admin2.isVerified();
        java.lang.String str14 = admin2.getAccountType();
        room.Room room15 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "admin" + "'", str14, "admin");
    }

    @Test
    public void test01746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01746");
        model.Admin admin2 = new model.Admin("", "");
        java.lang.String str3 = admin2.getAccountType();
        admin2.setVerified(true);
        double double6 = admin2.getHourlyRate();
        admin2.viewProfile();
        boolean boolean8 = admin2.isVerified();
        java.lang.String str9 = admin2.getEmail();
        java.lang.String str10 = admin2.getPassword();
        admin2.login("hi!", "hi!");
        admin2.login("hi!", "hi!");
        java.lang.Class<?> wildcardClass17 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test01747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01747");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getAccountType();
        boolean boolean4 = admin2.isVerified();
        java.lang.String str5 = admin2.getPassword();
        admin2.logout();
        admin2.logout();
        double double8 = admin2.getHourlyRate();
        java.lang.String str9 = admin2.getPassword();
        java.lang.Class<?> wildcardClass10 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test01748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01748");
        model.Admin admin2 = new model.Admin("", "");
        java.lang.String str3 = admin2.getAccountType();
        java.lang.String str4 = admin2.getEmail();
        java.lang.String str5 = admin2.getID();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getAccountType();
        double double8 = admin2.getHourlyRate();
        java.lang.String str9 = admin2.getID();
        room.Room room10 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
    }

    @Test
    public void test01749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01749");
        model.Admin admin2 = new model.Admin("", "");
        java.lang.String str3 = admin2.getAccountType();
        java.lang.String str4 = admin2.getEmail();
        java.lang.String str5 = admin2.getID();
        double double6 = admin2.getHourlyRate();
        admin2.setVerified(true);
        room.Room room9 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test01750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01750");
        model.Admin admin2 = new model.Admin("admin", "");
        admin2.setVerified(true);
        boolean boolean5 = admin2.isVerified();
        java.lang.String str6 = admin2.getAccountType();
        admin2.viewProfile();
        admin2.setVerified(false);
        java.lang.Class<?> wildcardClass10 = admin2.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "admin" + "'", str6, "admin");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test01751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01751");
        model.Admin admin2 = new model.Admin("", "admin");
        java.lang.String str3 = admin2.getEmail();
        java.lang.String str4 = admin2.getPassword();
        room.Room room5 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
    }

    @Test
    public void test01752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01752");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getID();
        admin2.viewProfile();
        admin2.logout();
        java.lang.String str10 = admin2.getEmail();
        boolean boolean11 = admin2.isVerified();
        java.lang.String str12 = admin2.getAccountType();
        boolean boolean13 = admin2.isVerified();
        boolean boolean14 = admin2.isVerified();
        java.lang.String str15 = admin2.getAccountType();
        java.lang.Class<?> wildcardClass16 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "admin" + "'", str12, "admin");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "admin" + "'", str15, "admin");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test01753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01753");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        admin2.login("", "");
        java.lang.String str9 = admin2.getID();
        double double10 = admin2.getHourlyRate();
        java.lang.String str11 = admin2.getEmail();
        java.lang.String str12 = admin2.getPassword();
        java.lang.Class<?> wildcardClass13 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test01754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01754");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        admin2.viewProfile();
        admin2.login("hi!", "admin");
        double double10 = admin2.getHourlyRate();
        admin2.setVerified(false);
        java.lang.String str13 = admin2.getAccountType();
        java.lang.String str14 = admin2.getPassword();
        double double15 = admin2.getHourlyRate();
        java.lang.Class<?> wildcardClass16 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "admin" + "'", str13, "admin");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test01755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01755");
        model.Admin admin2 = new model.Admin("", "");
        java.lang.String str3 = admin2.getAccountType();
        admin2.setVerified(true);
        double double6 = admin2.getHourlyRate();
        admin2.setVerified(false);
        admin2.logout();
        admin2.setVerified(true);
        boolean boolean12 = admin2.isVerified();
        admin2.setVerified(true);
        admin2.viewProfile();
        room.Room room16 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test01756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01756");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        java.lang.String str4 = admin2.getPassword();
        java.lang.String str5 = admin2.getPassword();
        java.lang.String str6 = admin2.getAccountType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "admin" + "'", str6, "admin");
    }

    @Test
    public void test01757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01757");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        boolean boolean6 = admin2.isVerified();
        admin2.login("hi!", "admin");
        java.lang.String str10 = admin2.getEmail();
        boolean boolean11 = admin2.isVerified();
        admin2.viewProfile();
        java.lang.String str13 = admin2.getAccountType();
        java.lang.String str14 = admin2.getPassword();
        java.lang.Class<?> wildcardClass15 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "admin" + "'", str13, "admin");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test01758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01758");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getAccountType();
        boolean boolean4 = admin2.isVerified();
        java.lang.String str5 = admin2.getPassword();
        admin2.logout();
        admin2.logout();
        boolean boolean8 = admin2.isVerified();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test01759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01759");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getPassword();
        admin2.setVerified(true);
        java.lang.String str10 = admin2.getEmail();
        java.lang.String str11 = admin2.getID();
        java.lang.String str12 = admin2.getID();
        admin2.viewProfile();
        java.lang.String str14 = admin2.getID();
        admin2.viewProfile();
        java.lang.String str16 = admin2.getEmail();
        room.Room room17 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "admin" + "'", str11, "admin");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "admin" + "'", str12, "admin");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "admin" + "'", str14, "admin");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test01760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01760");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getAccountType();
        boolean boolean4 = admin2.isVerified();
        admin2.setVerified(false);
        admin2.viewProfile();
        admin2.login("admin", "hi!");
        java.lang.String str11 = admin2.getPassword();
        room.Room room12 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test01761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01761");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.viewProfile();
        java.lang.String str4 = admin2.getPassword();
        double double5 = admin2.getHourlyRate();
        java.lang.String str6 = admin2.getAccountType();
        admin2.viewProfile();
        admin2.login("hi!", "hi!");
        room.Room room11 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "admin" + "'", str6, "admin");
    }

    @Test
    public void test01762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01762");
        model.Admin admin2 = new model.Admin("admin", "");
        admin2.setVerified(true);
        java.lang.String str5 = admin2.getAccountType();
        admin2.setVerified(false);
        java.lang.String str8 = admin2.getID();
        java.lang.String str9 = admin2.getEmail();
        boolean boolean10 = admin2.isVerified();
        room.Room room11 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test01763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01763");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        admin2.setVerified(false);
        boolean boolean8 = admin2.isVerified();
        room.Room room9 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test01764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01764");
        model.Admin admin2 = new model.Admin("hi!", "admin");
        java.lang.String str3 = admin2.getID();
        admin2.setVerified(false);
        admin2.viewProfile();
        admin2.viewProfile();
        admin2.login("", "hi!");
        double double11 = admin2.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test01765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01765");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.viewProfile();
        java.lang.String str4 = admin2.getPassword();
        admin2.login("", "");
        java.lang.String str8 = admin2.getEmail();
        java.lang.String str9 = admin2.getAccountType();
        admin2.viewProfile();
        room.Room room11 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
    }

    @Test
    public void test01766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01766");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.login("admin", "admin");
        boolean boolean6 = admin2.isVerified();
        admin2.logout();
        java.lang.String str8 = admin2.getID();
        admin2.logout();
        java.lang.String str10 = admin2.getID();
        admin2.login("hi!", "");
        admin2.logout();
        room.Room room15 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
    }

    @Test
    public void test01767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01767");
        model.Admin admin2 = new model.Admin("admin", "admin");
        boolean boolean3 = admin2.isVerified();
        admin2.login("hi!", "");
        double double7 = admin2.getHourlyRate();
        java.lang.String str8 = admin2.getID();
        double double9 = admin2.getHourlyRate();
        admin2.viewProfile();
        boolean boolean11 = admin2.isVerified();
        double double12 = admin2.getHourlyRate();
        room.Room room13 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test01768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01768");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getPassword();
        admin2.setVerified(true);
        boolean boolean10 = admin2.isVerified();
        java.lang.String str11 = admin2.getEmail();
        admin2.setVerified(false);
        java.lang.String str14 = admin2.getPassword();
        java.lang.String str15 = admin2.getPassword();
        boolean boolean16 = admin2.isVerified();
        java.lang.String str17 = admin2.getPassword();
        admin2.logout();
        java.lang.Class<?> wildcardClass19 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test01769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01769");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        boolean boolean6 = admin2.isVerified();
        admin2.login("hi!", "admin");
        admin2.setVerified(false);
        double double12 = admin2.getHourlyRate();
        room.Room room13 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test01770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01770");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getAccountType();
        boolean boolean4 = admin2.isVerified();
        admin2.setVerified(false);
        java.lang.String str7 = admin2.getPassword();
        double double8 = admin2.getHourlyRate();
        admin2.setVerified(false);
        admin2.logout();
        room.Room room12 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test01771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01771");
        model.Admin admin2 = new model.Admin("", "");
        java.lang.String str3 = admin2.getAccountType();
        java.lang.String str4 = admin2.getEmail();
        java.lang.String str5 = admin2.getID();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getAccountType();
        admin2.login("admin", "");
        java.lang.String str11 = admin2.getAccountType();
        boolean boolean12 = admin2.isVerified();
        java.lang.String str13 = admin2.getID();
        java.lang.String str14 = admin2.getID();
        java.lang.Class<?> wildcardClass15 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "admin" + "'", str11, "admin");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "admin" + "'", str13, "admin");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "admin" + "'", str14, "admin");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test01772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01772");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.viewProfile();
        java.lang.String str4 = admin2.getID();
        admin2.logout();
        java.lang.String str6 = admin2.getAccountType();
        admin2.viewProfile();
        admin2.setVerified(true);
        java.lang.String str10 = admin2.getAccountType();
        room.Room room11 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "admin" + "'", str6, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
    }

    @Test
    public void test01773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01773");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getID();
        admin2.viewProfile();
        double double9 = admin2.getHourlyRate();
        admin2.setVerified(true);
        admin2.logout();
        boolean boolean13 = admin2.isVerified();
        java.lang.String str14 = admin2.getPassword();
        admin2.logout();
        room.Room room16 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test01774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01774");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        admin2.logout();
        admin2.setVerified(false);
        java.lang.String str6 = admin2.getEmail();
        admin2.viewProfile();
        admin2.viewProfile();
        double double9 = admin2.getHourlyRate();
        admin2.setVerified(true);
        room.Room room12 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test01775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01775");
        model.Admin admin2 = new model.Admin("", "");
        java.lang.String str3 = admin2.getAccountType();
        java.lang.String str4 = admin2.getEmail();
        admin2.login("hi!", "");
        java.lang.String str8 = admin2.getAccountType();
        java.lang.String str9 = admin2.getID();
        admin2.logout();
        java.lang.String str11 = admin2.getEmail();
        java.lang.String str12 = admin2.getEmail();
        java.lang.String str13 = admin2.getEmail();
        java.lang.String str14 = admin2.getPassword();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test01776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01776");
        model.Admin admin2 = new model.Admin("", "");
        java.lang.String str3 = admin2.getAccountType();
        admin2.setVerified(true);
        java.lang.String str6 = admin2.getAccountType();
        admin2.logout();
        double double8 = admin2.getHourlyRate();
        double double9 = admin2.getHourlyRate();
        boolean boolean10 = admin2.isVerified();
        java.lang.String str11 = admin2.getAccountType();
        java.lang.String str12 = admin2.getAccountType();
        java.lang.String str13 = admin2.getAccountType();
        boolean boolean14 = admin2.isVerified();
        admin2.viewProfile();
        java.lang.Class<?> wildcardClass16 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "admin" + "'", str6, "admin");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "admin" + "'", str11, "admin");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "admin" + "'", str12, "admin");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "admin" + "'", str13, "admin");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test01777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01777");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        admin2.setVerified(true);
        java.lang.String str9 = admin2.getEmail();
        java.lang.String str10 = admin2.getEmail();
        boolean boolean11 = admin2.isVerified();
        java.lang.String str12 = admin2.getEmail();
        double double13 = admin2.getHourlyRate();
        admin2.login("admin", "hi!");
        java.lang.String str17 = admin2.getID();
        room.Room room18 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "admin" + "'", str17, "admin");
    }

    @Test
    public void test01778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01778");
        model.Admin admin2 = new model.Admin("hi!", "admin");
        java.lang.String str3 = admin2.getID();
        admin2.setVerified(false);
        admin2.viewProfile();
        admin2.viewProfile();
        admin2.setVerified(true);
        java.lang.String str10 = admin2.getAccountType();
        room.Room room11 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
    }

    @Test
    public void test01779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01779");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getAccountType();
        boolean boolean4 = admin2.isVerified();
        boolean boolean5 = admin2.isVerified();
        admin2.viewProfile();
        admin2.login("admin", "hi!");
        java.lang.String str10 = admin2.getPassword();
        admin2.logout();
        room.Room room12 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test01780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01780");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        boolean boolean6 = admin2.isVerified();
        admin2.login("hi!", "");
        java.lang.String str10 = admin2.getEmail();
        java.lang.String str11 = admin2.getAccountType();
        admin2.viewProfile();
        admin2.login("admin", "hi!");
        room.Room room16 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "admin" + "'", str11, "admin");
    }

    @Test
    public void test01781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01781");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        admin2.logout();
        admin2.setVerified(false);
        java.lang.String str6 = admin2.getEmail();
        java.lang.String str7 = admin2.getID();
        admin2.setVerified(true);
        java.lang.String str10 = admin2.getID();
        admin2.viewProfile();
        admin2.viewProfile();
        room.Room room13 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
    }

    @Test
    public void test01782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01782");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        boolean boolean6 = admin2.isVerified();
        admin2.login("hi!", "admin");
        boolean boolean10 = admin2.isVerified();
        admin2.setVerified(false);
        room.Room room13 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test01783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01783");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        admin2.viewProfile();
        admin2.login("hi!", "admin");
        double double10 = admin2.getHourlyRate();
        admin2.setVerified(false);
        java.lang.String str13 = admin2.getAccountType();
        admin2.setVerified(false);
        room.Room room16 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "admin" + "'", str13, "admin");
    }

    @Test
    public void test01784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01784");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        java.lang.String str5 = admin2.getID();
        java.lang.String str6 = admin2.getID();
        java.lang.String str7 = admin2.getAccountType();
        admin2.logout();
        java.lang.String str9 = admin2.getEmail();
        room.Room room10 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "admin" + "'", str6, "admin");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test01785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01785");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.viewProfile();
        java.lang.String str4 = admin2.getID();
        java.lang.String str5 = admin2.getPassword();
        double double6 = admin2.getHourlyRate();
        admin2.login("admin", "");
        admin2.login("hi!", "admin");
        admin2.login("admin", "admin");
        room.Room room16 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test01786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01786");
        model.Admin admin2 = new model.Admin("", "");
        java.lang.String str3 = admin2.getAccountType();
        boolean boolean4 = admin2.isVerified();
        admin2.setVerified(false);
        boolean boolean7 = admin2.isVerified();
        room.Room room8 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test01787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01787");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        java.lang.String str6 = admin2.getEmail();
        java.lang.String str7 = admin2.getPassword();
        admin2.logout();
        boolean boolean9 = admin2.isVerified();
        admin2.viewProfile();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test01788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01788");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.viewProfile();
        java.lang.String str4 = admin2.getID();
        admin2.logout();
        java.lang.String str6 = admin2.getAccountType();
        admin2.viewProfile();
        admin2.setVerified(true);
        boolean boolean10 = admin2.isVerified();
        java.lang.Class<?> wildcardClass11 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "admin" + "'", str6, "admin");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test01789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01789");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.viewProfile();
        java.lang.String str4 = admin2.getID();
        java.lang.String str5 = admin2.getPassword();
        admin2.setVerified(false);
        java.lang.String str8 = admin2.getID();
        java.lang.String str9 = admin2.getPassword();
        room.Room room10 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
    }

    @Test
    public void test01790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01790");
        model.Admin admin2 = new model.Admin("admin", "admin");
        boolean boolean3 = admin2.isVerified();
        admin2.login("hi!", "");
        java.lang.String str7 = admin2.getEmail();
        admin2.viewProfile();
        java.lang.String str9 = admin2.getAccountType();
        admin2.logout();
        admin2.viewProfile();
        admin2.viewProfile();
        boolean boolean13 = admin2.isVerified();
        admin2.login("admin", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test01791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01791");
        model.Admin admin2 = new model.Admin("", "");
        java.lang.String str3 = admin2.getAccountType();
        admin2.setVerified(true);
        double double6 = admin2.getHourlyRate();
        admin2.setVerified(false);
        admin2.logout();
        admin2.login("hi!", "");
        admin2.setVerified(true);
        admin2.login("", "");
        admin2.logout();
        admin2.viewProfile();
        boolean boolean20 = admin2.isVerified();
        java.lang.Class<?> wildcardClass21 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test01792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01792");
        model.Admin admin2 = new model.Admin("", "hi!");
        double double3 = admin2.getHourlyRate();
        boolean boolean4 = admin2.isVerified();
        java.lang.Class<?> wildcardClass5 = admin2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test01793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01793");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.login("admin", "admin");
        boolean boolean6 = admin2.isVerified();
        admin2.logout();
        java.lang.String str8 = admin2.getID();
        admin2.viewProfile();
        admin2.login("hi!", "");
        admin2.setVerified(true);
        admin2.viewProfile();
        java.lang.Class<?> wildcardClass16 = admin2.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test01794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01794");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getAccountType();
        admin2.setVerified(false);
        admin2.login("hi!", "hi!");
        admin2.logout();
        java.lang.String str10 = admin2.getID();
        admin2.viewProfile();
        room.Room room12 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
    }

    @Test
    public void test01795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01795");
        model.Admin admin2 = new model.Admin("", "");
        java.lang.String str3 = admin2.getAccountType();
        java.lang.String str4 = admin2.getEmail();
        admin2.login("hi!", "");
        java.lang.String str8 = admin2.getAccountType();
        java.lang.String str9 = admin2.getID();
        admin2.logout();
        admin2.logout();
        room.Room room12 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
    }

    @Test
    public void test01796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01796");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        java.lang.String str4 = admin2.getEmail();
        admin2.logout();
        admin2.logout();
        java.lang.String str7 = admin2.getPassword();
        admin2.login("admin", "admin");
        admin2.viewProfile();
        admin2.setVerified(true);
        room.Room room14 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test01797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01797");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        admin2.setVerified(true);
        java.lang.String str9 = admin2.getPassword();
        double double10 = admin2.getHourlyRate();
        java.lang.String str11 = admin2.getID();
        double double12 = admin2.getHourlyRate();
        java.lang.String str13 = admin2.getPassword();
        java.lang.String str14 = admin2.getID();
        room.Room room15 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "admin" + "'", str11, "admin");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "admin" + "'", str14, "admin");
    }

    @Test
    public void test01798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01798");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        java.lang.String str4 = admin2.getAccountType();
        java.lang.String str5 = admin2.getPassword();
        admin2.setVerified(true);
        room.Room room8 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test01799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01799");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        admin2.setVerified(false);
        java.lang.Class<?> wildcardClass8 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test01800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01800");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.viewProfile();
        java.lang.String str4 = admin2.getPassword();
        admin2.login("", "");
        java.lang.String str8 = admin2.getEmail();
        java.lang.String str9 = admin2.getAccountType();
        admin2.login("", "");
        java.lang.String str13 = admin2.getAccountType();
        double double14 = admin2.getHourlyRate();
        boolean boolean15 = admin2.isVerified();
        java.lang.String str16 = admin2.getEmail();
        room.Room room17 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "admin" + "'", str13, "admin");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "admin" + "'", str16, "admin");
    }

    @Test
    public void test01801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01801");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getPassword();
        admin2.setVerified(true);
        boolean boolean10 = admin2.isVerified();
        double double11 = admin2.getHourlyRate();
        java.lang.String str12 = admin2.getEmail();
        java.lang.Class<?> wildcardClass13 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test01802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01802");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.viewProfile();
        java.lang.String str4 = admin2.getPassword();
        boolean boolean5 = admin2.isVerified();
        java.lang.String str6 = admin2.getPassword();
        admin2.login("", "");
        admin2.login("hi!", "hi!");
        admin2.login("admin", "hi!");
        room.Room room16 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "admin" + "'", str6, "admin");
    }

    @Test
    public void test01803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01803");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getAccountType();
        boolean boolean4 = admin2.isVerified();
        boolean boolean5 = admin2.isVerified();
        admin2.viewProfile();
        admin2.login("admin", "hi!");
        java.lang.String str10 = admin2.getPassword();
        admin2.login("", "hi!");
        double double14 = admin2.getHourlyRate();
        java.lang.Class<?> wildcardClass15 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test01804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01804");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getID();
        admin2.viewProfile();
        admin2.logout();
        admin2.setVerified(false);
        java.lang.String str12 = admin2.getEmail();
        java.lang.String str13 = admin2.getEmail();
        java.lang.String str14 = admin2.getPassword();
        admin2.logout();
        room.Room room16 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test01805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01805");
        model.Admin admin2 = new model.Admin("admin", "");
        admin2.setVerified(true);
        admin2.logout();
        admin2.login("admin", "hi!");
        java.lang.String str9 = admin2.getPassword();
        java.lang.String str10 = admin2.getID();
        double double11 = admin2.getHourlyRate();
        java.lang.String str12 = admin2.getEmail();
        java.lang.Class<?> wildcardClass13 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "admin" + "'", str12, "admin");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test01806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01806");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getAccountType();
        boolean boolean4 = admin2.isVerified();
        admin2.setVerified(false);
        admin2.viewProfile();
        admin2.login("admin", "");
        java.lang.Class<?> wildcardClass11 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test01807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01807");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.viewProfile();
        java.lang.String str4 = admin2.getPassword();
        admin2.login("", "");
        boolean boolean8 = admin2.isVerified();
        admin2.setVerified(false);
        double double11 = admin2.getHourlyRate();
        admin2.login("", "admin");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test01808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01808");
        model.Admin admin2 = new model.Admin("", "");
        java.lang.String str3 = admin2.getAccountType();
        admin2.setVerified(true);
        double double6 = admin2.getHourlyRate();
        admin2.viewProfile();
        boolean boolean8 = admin2.isVerified();
        java.lang.String str9 = admin2.getID();
        java.lang.String str10 = admin2.getID();
        double double11 = admin2.getHourlyRate();
        boolean boolean12 = admin2.isVerified();
        admin2.logout();
        boolean boolean14 = admin2.isVerified();
        java.lang.String str15 = admin2.getPassword();
        admin2.logout();
        room.Room room17 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test01809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01809");
        model.Admin admin2 = new model.Admin("", "");
        java.lang.String str3 = admin2.getAccountType();
        admin2.setVerified(true);
        double double6 = admin2.getHourlyRate();
        admin2.viewProfile();
        boolean boolean8 = admin2.isVerified();
        java.lang.String str9 = admin2.getID();
        admin2.login("admin", "");
        admin2.viewProfile();
        java.lang.String str14 = admin2.getAccountType();
        admin2.login("", "hi!");
        room.Room room18 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "admin" + "'", str14, "admin");
    }

    @Test
    public void test01810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01810");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        admin2.login("", "");
        java.lang.String str9 = admin2.getID();
        java.lang.String str10 = admin2.getEmail();
        java.lang.String str11 = admin2.getAccountType();
        java.lang.String str12 = admin2.getEmail();
        java.lang.String str13 = admin2.getID();
        admin2.setVerified(true);
        room.Room room16 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "admin" + "'", str11, "admin");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "admin" + "'", str13, "admin");
    }

    @Test
    public void test01811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01811");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getPassword();
        boolean boolean4 = admin2.isVerified();
        java.lang.String str5 = admin2.getID();
        java.lang.String str6 = admin2.getEmail();
        java.lang.String str7 = admin2.getAccountType();
        admin2.setVerified(false);
        admin2.viewProfile();
        admin2.logout();
        java.lang.String str12 = admin2.getPassword();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test01812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01812");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getAccountType();
        boolean boolean4 = admin2.isVerified();
        boolean boolean5 = admin2.isVerified();
        java.lang.String str6 = admin2.getID();
        boolean boolean7 = admin2.isVerified();
        room.Room room8 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "admin" + "'", str6, "admin");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test01813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01813");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.viewProfile();
        java.lang.String str4 = admin2.getID();
        java.lang.String str5 = admin2.getAccountType();
        java.lang.String str6 = admin2.getEmail();
        java.lang.String str7 = admin2.getPassword();
        admin2.login("", "admin");
        room.Room room11 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "admin" + "'", str6, "admin");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
    }

    @Test
    public void test01814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01814");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        admin2.logout();
        room.Room room6 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
    }

    @Test
    public void test01815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01815");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        admin2.login("", "");
        java.lang.String str9 = admin2.getPassword();
        java.lang.String str10 = admin2.getID();
        admin2.login("hi!", "");
        java.lang.String str14 = admin2.getAccountType();
        admin2.setVerified(false);
        room.Room room17 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "admin" + "'", str14, "admin");
    }

    @Test
    public void test01816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01816");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        admin2.login("", "");
        java.lang.String str9 = admin2.getID();
        java.lang.String str10 = admin2.getEmail();
        java.lang.String str11 = admin2.getAccountType();
        java.lang.String str12 = admin2.getID();
        boolean boolean13 = admin2.isVerified();
        java.lang.String str14 = admin2.getEmail();
        java.lang.String str15 = admin2.getPassword();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "admin" + "'", str11, "admin");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "admin" + "'", str12, "admin");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test01817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01817");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        boolean boolean6 = admin2.isVerified();
        admin2.login("hi!", "admin");
        admin2.setVerified(false);
        boolean boolean12 = admin2.isVerified();
        admin2.viewProfile();
        admin2.setVerified(false);
        room.Room room16 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test01818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01818");
        model.Admin admin2 = new model.Admin("admin", "");
        admin2.logout();
        double double4 = admin2.getHourlyRate();
        admin2.setVerified(false);
        java.lang.String str7 = admin2.getID();
        boolean boolean8 = admin2.isVerified();
        java.lang.String str9 = admin2.getAccountType();
        room.Room room10 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
    }

    @Test
    public void test01819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01819");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getPassword();
        admin2.setVerified(true);
        boolean boolean10 = admin2.isVerified();
        java.lang.String str11 = admin2.getEmail();
        java.lang.String str12 = admin2.getEmail();
        admin2.login("hi!", "hi!");
        java.lang.String str16 = admin2.getEmail();
        room.Room room17 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test01820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01820");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getPassword();
        double double8 = admin2.getHourlyRate();
        admin2.logout();
        double double10 = admin2.getHourlyRate();
        boolean boolean11 = admin2.isVerified();
        java.lang.String str12 = admin2.getAccountType();
        room.Room room13 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "admin" + "'", str12, "admin");
    }

    @Test
    public void test01821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01821");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getAccountType();
        boolean boolean4 = admin2.isVerified();
        java.lang.String str5 = admin2.getEmail();
        double double6 = admin2.getHourlyRate();
        room.Room room7 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test01822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01822");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getID();
        admin2.viewProfile();
        double double9 = admin2.getHourlyRate();
        java.lang.String str10 = admin2.getEmail();
        java.lang.String str11 = admin2.getEmail();
        admin2.viewProfile();
        room.Room room13 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test01823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01823");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        admin2.login("", "");
        boolean boolean9 = admin2.isVerified();
        boolean boolean10 = admin2.isVerified();
        room.Room room11 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test01824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01824");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        java.lang.String str5 = admin2.getID();
        java.lang.String str6 = admin2.getID();
        java.lang.String str7 = admin2.getAccountType();
        admin2.setVerified(true);
        java.lang.String str10 = admin2.getAccountType();
        java.lang.String str11 = admin2.getEmail();
        double double12 = admin2.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "admin" + "'", str6, "admin");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test01825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01825");
        model.Admin admin2 = new model.Admin("", "");
        java.lang.String str3 = admin2.getAccountType();
        java.lang.String str4 = admin2.getEmail();
        double double5 = admin2.getHourlyRate();
        admin2.logout();
        java.lang.String str7 = admin2.getEmail();
        admin2.login("", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test01826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01826");
        model.Admin admin2 = new model.Admin("", "");
        java.lang.String str3 = admin2.getAccountType();
        admin2.setVerified(true);
        double double6 = admin2.getHourlyRate();
        admin2.setVerified(false);
        admin2.logout();
        admin2.setVerified(true);
        boolean boolean12 = admin2.isVerified();
        java.lang.String str13 = admin2.getAccountType();
        java.lang.String str14 = admin2.getAccountType();
        admin2.login("", "hi!");
        room.Room room18 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "admin" + "'", str13, "admin");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "admin" + "'", str14, "admin");
    }

    @Test
    public void test01827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01827");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.viewProfile();
        java.lang.String str4 = admin2.getPassword();
        admin2.login("", "");
        boolean boolean8 = admin2.isVerified();
        admin2.setVerified(true);
        admin2.setVerified(false);
        java.lang.String str13 = admin2.getAccountType();
        double double14 = admin2.getHourlyRate();
        admin2.login("admin", "hi!");
        java.lang.String str18 = admin2.getAccountType();
        admin2.setVerified(true);
        room.Room room21 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "admin" + "'", str13, "admin");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "admin" + "'", str18, "admin");
    }

    @Test
    public void test01828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01828");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        admin2.setVerified(true);
        java.lang.String str9 = admin2.getID();
        java.lang.String str10 = admin2.getEmail();
        admin2.logout();
        java.lang.String str12 = admin2.getID();
        room.Room room13 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "admin" + "'", str12, "admin");
    }

    @Test
    public void test01829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01829");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.login("admin", "admin");
        boolean boolean6 = admin2.isVerified();
        admin2.logout();
        java.lang.String str8 = admin2.getID();
        admin2.login("hi!", "hi!");
        java.lang.String str12 = admin2.getAccountType();
        room.Room room13 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "admin" + "'", str12, "admin");
    }

    @Test
    public void test01830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01830");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getAccountType();
        boolean boolean4 = admin2.isVerified();
        boolean boolean5 = admin2.isVerified();
        admin2.viewProfile();
        admin2.login("admin", "hi!");
        java.lang.String str10 = admin2.getPassword();
        admin2.login("", "hi!");
        room.Room room14 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test01831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01831");
        model.Admin admin2 = new model.Admin("", "");
        java.lang.String str3 = admin2.getAccountType();
        admin2.setVerified(true);
        double double6 = admin2.getHourlyRate();
        admin2.viewProfile();
        boolean boolean8 = admin2.isVerified();
        java.lang.String str9 = admin2.getID();
        java.lang.String str10 = admin2.getID();
        double double11 = admin2.getHourlyRate();
        admin2.logout();
        java.lang.Class<?> wildcardClass13 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test01832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01832");
        model.Admin admin2 = new model.Admin("", "");
        java.lang.String str3 = admin2.getAccountType();
        admin2.setVerified(true);
        double double6 = admin2.getHourlyRate();
        admin2.viewProfile();
        boolean boolean8 = admin2.isVerified();
        java.lang.String str9 = admin2.getID();
        java.lang.String str10 = admin2.getID();
        double double11 = admin2.getHourlyRate();
        boolean boolean12 = admin2.isVerified();
        boolean boolean13 = admin2.isVerified();
        java.lang.Class<?> wildcardClass14 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test01833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01833");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getPassword();
        admin2.setVerified(true);
        boolean boolean10 = admin2.isVerified();
        java.lang.String str11 = admin2.getPassword();
        double double12 = admin2.getHourlyRate();
        room.Room room13 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test01834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01834");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getAccountType();
        boolean boolean4 = admin2.isVerified();
        boolean boolean5 = admin2.isVerified();
        admin2.logout();
        admin2.login("admin", "hi!");
        java.lang.String str10 = admin2.getPassword();
        java.lang.String str11 = admin2.getAccountType();
        java.lang.String str12 = admin2.getID();
        admin2.login("", "hi!");
        admin2.login("hi!", "admin");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "admin" + "'", str11, "admin");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "admin" + "'", str12, "admin");
    }

    @Test
    public void test01835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01835");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.viewProfile();
        java.lang.String str4 = admin2.getPassword();
        admin2.login("", "");
        java.lang.String str8 = admin2.getEmail();
        java.lang.String str9 = admin2.getAccountType();
        admin2.login("", "");
        java.lang.String str13 = admin2.getPassword();
        admin2.login("hi!", "hi!");
        java.lang.String str17 = admin2.getID();
        admin2.setVerified(true);
        admin2.setVerified(false);
        java.lang.Class<?> wildcardClass22 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "admin" + "'", str13, "admin");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "admin" + "'", str17, "admin");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test01836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01836");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        admin2.logout();
        admin2.setVerified(false);
        java.lang.String str6 = admin2.getEmail();
        admin2.viewProfile();
        admin2.viewProfile();
        double double9 = admin2.getHourlyRate();
        admin2.setVerified(false);
        boolean boolean12 = admin2.isVerified();
        admin2.setVerified(false);
        room.Room room15 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test01837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01837");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getID();
        admin2.viewProfile();
        admin2.logout();
        java.lang.String str10 = admin2.getEmail();
        boolean boolean11 = admin2.isVerified();
        java.lang.String str12 = admin2.getAccountType();
        admin2.viewProfile();
        admin2.login("", "");
        double double17 = admin2.getHourlyRate();
        java.lang.String str18 = admin2.getID();
        room.Room room19 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "admin" + "'", str12, "admin");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "admin" + "'", str18, "admin");
    }

    @Test
    public void test01838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01838");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getID();
        admin2.viewProfile();
        double double9 = admin2.getHourlyRate();
        admin2.viewProfile();
        room.Room room11 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test01839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01839");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getPassword();
        boolean boolean4 = admin2.isVerified();
        java.lang.String str5 = admin2.getID();
        java.lang.String str6 = admin2.getEmail();
        java.lang.String str7 = admin2.getAccountType();
        room.Room room8 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
    }

    @Test
    public void test01840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01840");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        java.lang.String str6 = admin2.getPassword();
        boolean boolean7 = admin2.isVerified();
        admin2.logout();
        room.Room room9 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test01841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01841");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.login("admin", "admin");
        boolean boolean6 = admin2.isVerified();
        admin2.logout();
        java.lang.String str8 = admin2.getID();
        admin2.setVerified(true);
        java.lang.String str11 = admin2.getAccountType();
        admin2.viewProfile();
        boolean boolean13 = admin2.isVerified();
        java.lang.String str14 = admin2.getEmail();
        room.Room room15 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "admin" + "'", str11, "admin");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "admin" + "'", str14, "admin");
    }

    @Test
    public void test01842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01842");
        model.Admin admin2 = new model.Admin("", "");
        java.lang.String str3 = admin2.getAccountType();
        admin2.setVerified(true);
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getPassword();
        admin2.logout();
        admin2.viewProfile();
        java.lang.String str10 = admin2.getAccountType();
        room.Room room11 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
    }

    @Test
    public void test01843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01843");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getID();
        admin2.setVerified(false);
        admin2.setVerified(false);
        admin2.logout();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
    }

    @Test
    public void test01844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01844");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        admin2.setVerified(true);
        admin2.logout();
        admin2.setVerified(false);
        admin2.viewProfile();
        admin2.logout();
        double double13 = admin2.getHourlyRate();
        admin2.viewProfile();
        room.Room room15 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test01845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01845");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getPassword();
        admin2.setVerified(true);
        java.lang.String str10 = admin2.getID();
        java.lang.String str11 = admin2.getPassword();
        java.lang.Class<?> wildcardClass12 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test01846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01846");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.viewProfile();
        java.lang.String str4 = admin2.getID();
        java.lang.String str5 = admin2.getPassword();
        admin2.logout();
        boolean boolean7 = admin2.isVerified();
        java.lang.Class<?> wildcardClass8 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test01847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01847");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        java.lang.String str4 = admin2.getPassword();
        java.lang.String str5 = admin2.getAccountType();
        admin2.viewProfile();
        double double7 = admin2.getHourlyRate();
        java.lang.String str8 = admin2.getID();
        java.lang.String str9 = admin2.getAccountType();
        admin2.viewProfile();
        admin2.viewProfile();
        admin2.login("", "hi!");
        java.lang.String str15 = admin2.getID();
        java.lang.Class<?> wildcardClass16 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "admin" + "'", str15, "admin");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test01848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01848");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getID();
        admin2.viewProfile();
        admin2.logout();
        java.lang.String str10 = admin2.getEmail();
        boolean boolean11 = admin2.isVerified();
        java.lang.String str12 = admin2.getAccountType();
        admin2.login("", "");
        admin2.logout();
        boolean boolean17 = admin2.isVerified();
        java.lang.String str18 = admin2.getAccountType();
        room.Room room19 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "admin" + "'", str12, "admin");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "admin" + "'", str18, "admin");
    }

    @Test
    public void test01849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01849");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getAccountType();
        boolean boolean4 = admin2.isVerified();
        java.lang.String str5 = admin2.getPassword();
        admin2.logout();
        java.lang.String str7 = admin2.getPassword();
        admin2.login("hi!", "admin");
        room.Room room11 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test01850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01850");
        model.Admin admin2 = new model.Admin("", "");
        java.lang.String str3 = admin2.getAccountType();
        admin2.setVerified(true);
        admin2.viewProfile();
        java.lang.String str7 = admin2.getEmail();
        admin2.login("hi!", "admin");
        java.lang.String str11 = admin2.getPassword();
        java.lang.Class<?> wildcardClass12 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test01851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01851");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        admin2.login("", "");
        java.lang.String str9 = admin2.getEmail();
        java.lang.String str10 = admin2.getAccountType();
        admin2.login("", "admin");
        java.lang.Class<?> wildcardClass14 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test01852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01852");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getID();
        boolean boolean8 = admin2.isVerified();
        java.lang.String str9 = admin2.getPassword();
        java.lang.String str10 = admin2.getPassword();
        java.lang.String str11 = admin2.getID();
        admin2.viewProfile();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "admin" + "'", str11, "admin");
    }

    @Test
    public void test01853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01853");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.viewProfile();
        java.lang.String str4 = admin2.getPassword();
        double double5 = admin2.getHourlyRate();
        java.lang.String str6 = admin2.getAccountType();
        admin2.viewProfile();
        room.Room room8 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "admin" + "'", str6, "admin");
    }

    @Test
    public void test01854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01854");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getID();
        admin2.viewProfile();
        admin2.logout();
        java.lang.String str10 = admin2.getEmail();
        boolean boolean11 = admin2.isVerified();
        room.Room room12 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test01855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01855");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        admin2.logout();
        admin2.setVerified(false);
        java.lang.String str6 = admin2.getEmail();
        java.lang.String str7 = admin2.getID();
        admin2.setVerified(true);
        java.lang.String str10 = admin2.getPassword();
        room.Room room11 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test01856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01856");
        model.Admin admin2 = new model.Admin("", "");
        java.lang.String str3 = admin2.getAccountType();
        admin2.setVerified(true);
        double double6 = admin2.getHourlyRate();
        admin2.setVerified(false);
        admin2.logout();
        admin2.login("hi!", "");
        admin2.setVerified(true);
        admin2.logout();
        double double16 = admin2.getHourlyRate();
        java.lang.String str17 = admin2.getID();
        room.Room room18 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "admin" + "'", str17, "admin");
    }

    @Test
    public void test01857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01857");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        java.lang.String str5 = admin2.getID();
        java.lang.String str6 = admin2.getID();
        admin2.logout();
        admin2.setVerified(true);
        room.Room room10 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "admin" + "'", str6, "admin");
    }

    @Test
    public void test01858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01858");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        admin2.logout();
        admin2.setVerified(false);
        java.lang.String str6 = admin2.getEmail();
        admin2.setVerified(false);
        boolean boolean9 = admin2.isVerified();
        room.Room room10 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test01859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01859");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        java.lang.String str4 = admin2.getAccountType();
        java.lang.String str5 = admin2.getPassword();
        java.lang.String str6 = admin2.getPassword();
        java.lang.String str7 = admin2.getEmail();
        admin2.viewProfile();
        room.Room room9 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test01860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01860");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getID();
        admin2.viewProfile();
        admin2.logout();
        java.lang.String str10 = admin2.getEmail();
        boolean boolean11 = admin2.isVerified();
        java.lang.String str12 = admin2.getAccountType();
        admin2.login("", "");
        admin2.logout();
        java.lang.String str17 = admin2.getEmail();
        room.Room room18 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "admin" + "'", str12, "admin");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test01861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01861");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        admin2.login("admin", "hi!");
        admin2.viewProfile();
        admin2.setVerified(true);
        double double12 = admin2.getHourlyRate();
        admin2.setVerified(true);
        double double15 = admin2.getHourlyRate();
        java.lang.String str16 = admin2.getEmail();
        boolean boolean17 = admin2.isVerified();
        double double18 = admin2.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test01862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01862");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        boolean boolean6 = admin2.isVerified();
        java.lang.String str7 = admin2.getPassword();
        double double8 = admin2.getHourlyRate();
        double double9 = admin2.getHourlyRate();
        java.lang.String str10 = admin2.getAccountType();
        room.Room room11 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
    }

    @Test
    public void test01863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01863");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        java.lang.String str5 = admin2.getEmail();
        java.lang.String str6 = admin2.getEmail();
        admin2.setVerified(false);
        boolean boolean9 = admin2.isVerified();
        double double10 = admin2.getHourlyRate();
        java.lang.Class<?> wildcardClass11 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test01864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01864");
        model.Admin admin2 = new model.Admin("", "");
        java.lang.String str3 = admin2.getAccountType();
        java.lang.String str4 = admin2.getEmail();
        admin2.login("hi!", "");
        java.lang.String str8 = admin2.getAccountType();
        java.lang.String str9 = admin2.getID();
        room.Room room10 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
    }

    @Test
    public void test01865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01865");
        model.Admin admin2 = new model.Admin("", "");
        java.lang.String str3 = admin2.getAccountType();
        java.lang.String str4 = admin2.getEmail();
        java.lang.String str5 = admin2.getID();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getEmail();
        admin2.login("admin", "admin");
        double double11 = admin2.getHourlyRate();
        java.lang.Class<?> wildcardClass12 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test01866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01866");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        java.lang.String str6 = admin2.getEmail();
        java.lang.String str7 = admin2.getPassword();
        java.lang.String str8 = admin2.getAccountType();
        admin2.login("admin", "admin");
        java.lang.String str12 = admin2.getID();
        room.Room room13 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "admin" + "'", str12, "admin");
    }

    @Test
    public void test01867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01867");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        boolean boolean6 = admin2.isVerified();
        admin2.login("hi!", "");
        admin2.login("admin", "hi!");
        java.lang.String str13 = admin2.getID();
        java.lang.String str14 = admin2.getEmail();
        java.lang.Class<?> wildcardClass15 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "admin" + "'", str13, "admin");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test01868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01868");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.viewProfile();
        java.lang.String str4 = admin2.getPassword();
        double double5 = admin2.getHourlyRate();
        java.lang.String str6 = admin2.getAccountType();
        admin2.login("hi!", "admin");
        double double10 = admin2.getHourlyRate();
        room.Room room11 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "admin" + "'", str6, "admin");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test01869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01869");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getAccountType();
        boolean boolean4 = admin2.isVerified();
        java.lang.String str5 = admin2.getPassword();
        java.lang.String str6 = admin2.getID();
        java.lang.String str7 = admin2.getID();
        boolean boolean8 = admin2.isVerified();
        admin2.setVerified(false);
        java.lang.String str11 = admin2.getEmail();
        admin2.setVerified(true);
        room.Room room14 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "admin" + "'", str6, "admin");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test01870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01870");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getAccountType();
        boolean boolean4 = admin2.isVerified();
        admin2.setVerified(false);
        admin2.viewProfile();
        admin2.login("admin", "hi!");
        java.lang.String str11 = admin2.getPassword();
        room.Room room12 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test01871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01871");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        admin2.login("", "");
        java.lang.String str9 = admin2.getID();
        java.lang.String str10 = admin2.getEmail();
        java.lang.String str11 = admin2.getAccountType();
        double double12 = admin2.getHourlyRate();
        admin2.viewProfile();
        admin2.login("admin", "admin");
        java.lang.Class<?> wildcardClass17 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "admin" + "'", str11, "admin");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test01872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01872");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.login("admin", "admin");
        boolean boolean6 = admin2.isVerified();
        admin2.logout();
        java.lang.String str8 = admin2.getID();
        admin2.logout();
        java.lang.String str10 = admin2.getID();
        boolean boolean11 = admin2.isVerified();
        admin2.login("admin", "");
        admin2.login("admin", "admin");
        room.Room room18 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test01873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01873");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        admin2.logout();
        java.lang.String str4 = admin2.getAccountType();
        admin2.logout();
        admin2.login("hi!", "admin");
        java.lang.String str9 = admin2.getAccountType();
        admin2.setVerified(false);
        java.lang.String str12 = admin2.getAccountType();
        room.Room room13 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "admin" + "'", str12, "admin");
    }

    @Test
    public void test01874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01874");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        admin2.setVerified(true);
        java.lang.String str9 = admin2.getEmail();
        java.lang.String str10 = admin2.getEmail();
        boolean boolean11 = admin2.isVerified();
        java.lang.String str12 = admin2.getEmail();
        double double13 = admin2.getHourlyRate();
        double double14 = admin2.getHourlyRate();
        java.lang.String str15 = admin2.getPassword();
        admin2.viewProfile();
        room.Room room17 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test01875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01875");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        admin2.login("", "");
        java.lang.String str9 = admin2.getID();
        java.lang.String str10 = admin2.getEmail();
        java.lang.String str11 = admin2.getAccountType();
        java.lang.String str12 = admin2.getID();
        boolean boolean13 = admin2.isVerified();
        java.lang.String str14 = admin2.getEmail();
        room.Room room15 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "admin" + "'", str11, "admin");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "admin" + "'", str12, "admin");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test01876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01876");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        admin2.logout();
        java.lang.String str4 = admin2.getAccountType();
        admin2.logout();
        admin2.login("hi!", "hi!");
        admin2.logout();
        room.Room room10 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
    }

    @Test
    public void test01877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01877");
        model.Admin admin2 = new model.Admin("", "");
        java.lang.String str3 = admin2.getAccountType();
        admin2.setVerified(true);
        double double6 = admin2.getHourlyRate();
        admin2.viewProfile();
        boolean boolean8 = admin2.isVerified();
        java.lang.String str9 = admin2.getID();
        admin2.viewProfile();
        java.lang.String str11 = admin2.getPassword();
        admin2.logout();
        admin2.viewProfile();
        java.lang.String str14 = admin2.getPassword();
        double double15 = admin2.getHourlyRate();
        room.Room room16 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test01878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01878");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.viewProfile();
        admin2.viewProfile();
        admin2.login("hi!", "admin");
        java.lang.String str8 = admin2.getID();
        admin2.login("", "admin");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
    }

    @Test
    public void test01879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01879");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        admin2.viewProfile();
        admin2.setVerified(false);
        java.lang.String str9 = admin2.getEmail();
        admin2.setVerified(false);
        double double12 = admin2.getHourlyRate();
        admin2.setVerified(false);
        room.Room room15 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test01880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01880");
        model.Admin admin2 = new model.Admin("admin", "");
        admin2.login("hi!", "admin");
        boolean boolean6 = admin2.isVerified();
        admin2.setVerified(true);
        room.Room room9 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test01881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01881");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getAccountType();
        java.lang.String str4 = admin2.getPassword();
        admin2.setVerified(true);
        java.lang.String str7 = admin2.getID();
        java.lang.String str8 = admin2.getEmail();
        java.lang.String str9 = admin2.getPassword();
        admin2.setVerified(true);
        room.Room room12 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test01882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01882");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        java.lang.String str4 = admin2.getEmail();
        admin2.logout();
        admin2.logout();
        java.lang.String str7 = admin2.getPassword();
        admin2.login("admin", "admin");
        admin2.viewProfile();
        java.lang.String str12 = admin2.getPassword();
        java.lang.Class<?> wildcardClass13 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test01883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01883");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        boolean boolean6 = admin2.isVerified();
        admin2.login("hi!", "");
        java.lang.String str10 = admin2.getEmail();
        admin2.login("hi!", "hi!");
        admin2.logout();
        room.Room room15 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test01884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01884");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        java.lang.String str5 = admin2.getID();
        admin2.setVerified(false);
        java.lang.String str8 = admin2.getPassword();
        admin2.logout();
        admin2.setVerified(true);
        admin2.setVerified(true);
        admin2.setVerified(true);
        double double16 = admin2.getHourlyRate();
        java.lang.String str17 = admin2.getID();
        room.Room room18 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "admin" + "'", str17, "admin");
    }

    @Test
    public void test01885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01885");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        boolean boolean6 = admin2.isVerified();
        admin2.login("hi!", "admin");
        admin2.setVerified(true);
        admin2.viewProfile();
        java.lang.String str13 = admin2.getAccountType();
        double double14 = admin2.getHourlyRate();
        double double15 = admin2.getHourlyRate();
        admin2.logout();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "admin" + "'", str13, "admin");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test01886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01886");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getID();
        admin2.setVerified(false);
        admin2.setVerified(false);
        java.lang.String str12 = admin2.getPassword();
        boolean boolean13 = admin2.isVerified();
        java.lang.String str14 = admin2.getID();
        admin2.viewProfile();
        room.Room room16 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "admin" + "'", str14, "admin");
    }

    @Test
    public void test01887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01887");
        model.Admin admin2 = new model.Admin("", "");
        java.lang.String str3 = admin2.getAccountType();
        java.lang.String str4 = admin2.getEmail();
        admin2.login("hi!", "");
        java.lang.String str8 = admin2.getAccountType();
        java.lang.String str9 = admin2.getID();
        admin2.logout();
        java.lang.String str11 = admin2.getPassword();
        room.Room room12 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test01888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01888");
        model.Admin admin2 = new model.Admin("admin", "hi!");
        java.lang.String str3 = admin2.getPassword();
        admin2.viewProfile();
        java.lang.String str5 = admin2.getEmail();
        room.Room room6 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
    }

    @Test
    public void test01889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01889");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getAccountType();
        boolean boolean4 = admin2.isVerified();
        java.lang.String str5 = admin2.getPassword();
        java.lang.String str6 = admin2.getEmail();
        java.lang.String str7 = admin2.getAccountType();
        java.lang.Class<?> wildcardClass8 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test01890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01890");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getPassword();
        admin2.viewProfile();
        double double9 = admin2.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test01891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01891");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        java.lang.String str5 = admin2.getID();
        admin2.setVerified(false);
        double double8 = admin2.getHourlyRate();
        java.lang.String str9 = admin2.getAccountType();
        java.lang.String str10 = admin2.getID();
        java.lang.String str11 = admin2.getPassword();
        room.Room room12 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test01892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01892");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        admin2.setVerified(false);
        boolean boolean8 = admin2.isVerified();
        java.lang.String str9 = admin2.getEmail();
        room.Room room10 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test01893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01893");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getID();
        boolean boolean8 = admin2.isVerified();
        java.lang.String str9 = admin2.getPassword();
        admin2.logout();
        admin2.setVerified(false);
        admin2.login("admin", "admin");
        java.lang.String str16 = admin2.getID();
        admin2.setVerified(true);
        java.lang.Class<?> wildcardClass19 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "admin" + "'", str16, "admin");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test01894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01894");
        model.Admin admin2 = new model.Admin("", "");
        java.lang.String str3 = admin2.getAccountType();
        java.lang.String str4 = admin2.getPassword();
        room.Room room5 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test01895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01895");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        admin2.viewProfile();
        admin2.login("hi!", "admin");
        boolean boolean10 = admin2.isVerified();
        java.lang.String str11 = admin2.getEmail();
        room.Room room12 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test01896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01896");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getAccountType();
        boolean boolean4 = admin2.isVerified();
        admin2.setVerified(false);
        java.lang.String str7 = admin2.getPassword();
        double double8 = admin2.getHourlyRate();
        admin2.setVerified(false);
        admin2.logout();
        java.lang.String str12 = admin2.getID();
        room.Room room13 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "admin" + "'", str12, "admin");
    }

    @Test
    public void test01897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01897");
        model.Admin admin2 = new model.Admin("", "");
        java.lang.String str3 = admin2.getAccountType();
        java.lang.String str4 = admin2.getEmail();
        java.lang.String str5 = admin2.getID();
        admin2.login("", "hi!");
        double double9 = admin2.getHourlyRate();
        boolean boolean10 = admin2.isVerified();
        room.Room room11 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test01898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01898");
        model.Admin admin2 = new model.Admin("", "");
        java.lang.String str3 = admin2.getAccountType();
        admin2.setVerified(true);
        double double6 = admin2.getHourlyRate();
        admin2.setVerified(false);
        admin2.logout();
        admin2.login("hi!", "");
        admin2.setVerified(true);
        admin2.login("", "");
        admin2.logout();
        admin2.login("admin", "admin");
        room.Room room22 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test01899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01899");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getPassword();
        admin2.setVerified(true);
        boolean boolean10 = admin2.isVerified();
        java.lang.String str11 = admin2.getEmail();
        admin2.setVerified(false);
        admin2.login("", "admin");
        java.lang.String str17 = admin2.getEmail();
        java.lang.String str18 = admin2.getEmail();
        java.lang.String str19 = admin2.getEmail();
        java.lang.Class<?> wildcardClass20 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test01900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01900");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getAccountType();
        boolean boolean4 = admin2.isVerified();
        admin2.setVerified(true);
        boolean boolean7 = admin2.isVerified();
        admin2.logout();
        room.Room room9 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test01901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01901");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        admin2.viewProfile();
        java.lang.String str8 = admin2.getID();
        java.lang.Class<?> wildcardClass9 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test01902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01902");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getAccountType();
        boolean boolean4 = admin2.isVerified();
        boolean boolean5 = admin2.isVerified();
        admin2.logout();
        admin2.login("admin", "hi!");
        java.lang.String str10 = admin2.getID();
        admin2.login("admin", "");
        room.Room room14 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
    }

    @Test
    public void test01903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01903");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        admin2.logout();
        admin2.setVerified(false);
        java.lang.String str6 = admin2.getEmail();
        java.lang.Class<?> wildcardClass7 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test01904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01904");
        model.Admin admin2 = new model.Admin("", "admin");
        java.lang.String str3 = admin2.getEmail();
        java.lang.String str4 = admin2.getPassword();
        java.lang.String str5 = admin2.getID();
        admin2.viewProfile();
        double double7 = admin2.getHourlyRate();
        room.Room room8 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test01905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01905");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.viewProfile();
        java.lang.String str4 = admin2.getID();
        java.lang.String str5 = admin2.getAccountType();
        admin2.viewProfile();
        java.lang.String str7 = admin2.getPassword();
        room.Room room8 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
    }

    @Test
    public void test01906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01906");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        boolean boolean6 = admin2.isVerified();
        admin2.login("hi!", "admin");
        java.lang.String str10 = admin2.getAccountType();
        java.lang.String str11 = admin2.getEmail();
        admin2.logout();
        admin2.login("", "");
        admin2.viewProfile();
        admin2.viewProfile();
        admin2.login("hi!", "hi!");
        java.lang.Class<?> wildcardClass21 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test01907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01907");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.login("admin", "admin");
        boolean boolean6 = admin2.isVerified();
        java.lang.String str7 = admin2.getPassword();
        room.Room room8 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
    }

    @Test
    public void test01908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01908");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        boolean boolean6 = admin2.isVerified();
        admin2.login("hi!", "admin");
        admin2.login("admin", "admin");
        admin2.logout();
        room.Room room14 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test01909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01909");
        model.Admin admin2 = new model.Admin("admin", "");
        admin2.logout();
        double double4 = admin2.getHourlyRate();
        admin2.setVerified(false);
        double double7 = admin2.getHourlyRate();
        java.lang.String str8 = admin2.getID();
        java.lang.String str9 = admin2.getEmail();
        java.lang.String str10 = admin2.getEmail();
        java.lang.Class<?> wildcardClass11 = admin2.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test01910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01910");
        model.Admin admin2 = new model.Admin("admin", "admin");
        boolean boolean3 = admin2.isVerified();
        admin2.login("hi!", "");
        double double7 = admin2.getHourlyRate();
        java.lang.String str8 = admin2.getEmail();
        java.lang.String str9 = admin2.getAccountType();
        admin2.login("hi!", "admin");
        room.Room room13 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
    }

    @Test
    public void test01911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01911");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getAccountType();
        boolean boolean4 = admin2.isVerified();
        boolean boolean5 = admin2.isVerified();
        admin2.logout();
        admin2.login("admin", "hi!");
        java.lang.String str10 = admin2.getPassword();
        java.lang.String str11 = admin2.getAccountType();
        room.Room room12 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "admin" + "'", str11, "admin");
    }

    @Test
    public void test01912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01912");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getID();
        admin2.login("", "admin");
        admin2.setVerified(false);
        java.lang.Class<?> wildcardClass13 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test01913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01913");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        java.lang.String str4 = admin2.getPassword();
        java.lang.String str5 = admin2.getAccountType();
        admin2.viewProfile();
        double double7 = admin2.getHourlyRate();
        java.lang.String str8 = admin2.getID();
        java.lang.String str9 = admin2.getAccountType();
        java.lang.String str10 = admin2.getPassword();
        admin2.logout();
        java.lang.String str12 = admin2.getAccountType();
        java.lang.String str13 = admin2.getAccountType();
        java.lang.Class<?> wildcardClass14 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "admin" + "'", str12, "admin");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "admin" + "'", str13, "admin");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test01914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01914");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getAccountType();
        boolean boolean4 = admin2.isVerified();
        admin2.setVerified(true);
        boolean boolean7 = admin2.isVerified();
        boolean boolean8 = admin2.isVerified();
        room.Room room9 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test01915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01915");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getID();
        admin2.logout();
        room.Room room7 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
    }

    @Test
    public void test01916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01916");
        model.Admin admin2 = new model.Admin("admin", "");
        admin2.logout();
        double double4 = admin2.getHourlyRate();
        java.lang.String str5 = admin2.getAccountType();
        admin2.login("hi!", "hi!");
        java.lang.String str9 = admin2.getPassword();
        room.Room room10 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test01917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01917");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        admin2.viewProfile();
        admin2.setVerified(false);
        admin2.login("hi!", "admin");
        admin2.setVerified(false);
        java.lang.Class<?> wildcardClass14 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test01918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01918");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        admin2.viewProfile();
        admin2.login("hi!", "admin");
        double double10 = admin2.getHourlyRate();
        admin2.viewProfile();
        java.lang.String str12 = admin2.getEmail();
        admin2.logout();
        room.Room room14 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test01919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01919");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        admin2.setVerified(true);
        java.lang.String str9 = admin2.getPassword();
        admin2.logout();
        room.Room room11 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test01920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01920");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getID();
        admin2.login("", "admin");
        admin2.viewProfile();
        boolean boolean12 = admin2.isVerified();
        admin2.setVerified(true);
        admin2.logout();
        admin2.setVerified(false);
        java.lang.String str18 = admin2.getEmail();
        room.Room room19 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test01921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01921");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getPassword();
        java.lang.String str8 = admin2.getEmail();
        java.lang.String str9 = admin2.getID();
        room.Room room10 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
    }

    @Test
    public void test01922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01922");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getID();
        admin2.viewProfile();
        admin2.logout();
        admin2.setVerified(false);
        java.lang.String str12 = admin2.getEmail();
        java.lang.String str13 = admin2.getID();
        admin2.login("", "admin");
        admin2.logout();
        admin2.login("admin", "admin");
        java.lang.Class<?> wildcardClass21 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "admin" + "'", str13, "admin");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test01923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01923");
        model.Admin admin2 = new model.Admin("", "");
        java.lang.String str3 = admin2.getAccountType();
        admin2.setVerified(true);
        double double6 = admin2.getHourlyRate();
        admin2.setVerified(false);
        admin2.logout();
        admin2.setVerified(true);
        boolean boolean12 = admin2.isVerified();
        java.lang.String str13 = admin2.getAccountType();
        room.Room room14 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "admin" + "'", str13, "admin");
    }

    @Test
    public void test01924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01924");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getID();
        admin2.viewProfile();
        admin2.logout();
        admin2.setVerified(false);
        java.lang.String str12 = admin2.getID();
        double double13 = admin2.getHourlyRate();
        java.lang.String str14 = admin2.getID();
        room.Room room15 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "admin" + "'", str12, "admin");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "admin" + "'", str14, "admin");
    }

    @Test
    public void test01925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01925");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getID();
        boolean boolean8 = admin2.isVerified();
        java.lang.String str9 = admin2.getPassword();
        admin2.logout();
        java.lang.String str11 = admin2.getPassword();
        room.Room room12 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test01926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01926");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getPassword();
        admin2.setVerified(true);
        java.lang.String str10 = admin2.getEmail();
        java.lang.String str11 = admin2.getID();
        java.lang.String str12 = admin2.getID();
        admin2.viewProfile();
        java.lang.Class<?> wildcardClass14 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "admin" + "'", str11, "admin");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "admin" + "'", str12, "admin");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test01927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01927");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        admin2.viewProfile();
        admin2.login("admin", "admin");
        java.lang.String str10 = admin2.getEmail();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test01928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01928");
        model.Admin admin2 = new model.Admin("admin", "");
        admin2.setVerified(true);
        java.lang.String str5 = admin2.getAccountType();
        admin2.setVerified(false);
        room.Room room8 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
    }

    @Test
    public void test01929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01929");
        model.Admin admin2 = new model.Admin("", "");
        java.lang.String str3 = admin2.getAccountType();
        admin2.setVerified(true);
        double double6 = admin2.getHourlyRate();
        admin2.setVerified(false);
        admin2.logout();
        admin2.login("hi!", "");
        admin2.setVerified(true);
        admin2.login("", "");
        admin2.logout();
        java.lang.String str19 = admin2.getAccountType();
        room.Room room20 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "admin" + "'", str19, "admin");
    }

    @Test
    public void test01930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01930");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.login("admin", "admin");
        boolean boolean6 = admin2.isVerified();
        admin2.logout();
        java.lang.String str8 = admin2.getID();
        admin2.logout();
        double double10 = admin2.getHourlyRate();
        boolean boolean11 = admin2.isVerified();
        room.Room room12 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test01931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01931");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        boolean boolean6 = admin2.isVerified();
        admin2.login("hi!", "admin");
        admin2.setVerified(true);
        admin2.viewProfile();
        java.lang.String str13 = admin2.getAccountType();
        double double14 = admin2.getHourlyRate();
        double double15 = admin2.getHourlyRate();
        admin2.viewProfile();
        room.Room room17 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "admin" + "'", str13, "admin");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test01932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01932");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        admin2.viewProfile();
        admin2.setVerified(false);
        java.lang.String str9 = admin2.getEmail();
        java.lang.String str10 = admin2.getPassword();
        java.lang.String str11 = admin2.getEmail();
        java.lang.String str12 = admin2.getEmail();
        admin2.viewProfile();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test01933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01933");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.viewProfile();
        java.lang.String str4 = admin2.getID();
        admin2.logout();
        java.lang.String str6 = admin2.getAccountType();
        admin2.viewProfile();
        admin2.setVerified(true);
        double double10 = admin2.getHourlyRate();
        java.lang.String str11 = admin2.getID();
        admin2.viewProfile();
        room.Room room13 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "admin" + "'", str6, "admin");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "admin" + "'", str11, "admin");
    }

    @Test
    public void test01934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01934");
        model.Admin admin2 = new model.Admin("", "");
        java.lang.String str3 = admin2.getAccountType();
        java.lang.String str4 = admin2.getEmail();
        admin2.login("hi!", "");
        java.lang.String str8 = admin2.getAccountType();
        java.lang.String str9 = admin2.getID();
        boolean boolean10 = admin2.isVerified();
        java.lang.String str11 = admin2.getEmail();
        admin2.login("admin", "hi!");
        room.Room room15 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test01935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01935");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        java.lang.String str5 = admin2.getID();
        java.lang.String str6 = admin2.getID();
        admin2.logout();
        java.lang.String str8 = admin2.getID();
        boolean boolean9 = admin2.isVerified();
        admin2.setVerified(true);
        admin2.setVerified(true);
        room.Room room14 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "admin" + "'", str6, "admin");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test01936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01936");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getID();
        boolean boolean8 = admin2.isVerified();
        java.lang.String str9 = admin2.getPassword();
        admin2.logout();
        admin2.login("hi!", "");
        room.Room room14 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test01937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01937");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        java.lang.String str5 = admin2.getEmail();
        java.lang.String str6 = admin2.getEmail();
        admin2.setVerified(false);
        boolean boolean9 = admin2.isVerified();
        double double10 = admin2.getHourlyRate();
        room.Room room11 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test01938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01938");
        model.Admin admin2 = new model.Admin("admin", "admin");
        boolean boolean3 = admin2.isVerified();
        admin2.login("hi!", "");
        admin2.setVerified(true);
        admin2.viewProfile();
        admin2.logout();
        room.Room room11 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test01939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01939");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.viewProfile();
        java.lang.String str4 = admin2.getID();
        java.lang.String str5 = admin2.getPassword();
        admin2.viewProfile();
        room.Room room7 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
    }

    @Test
    public void test01940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01940");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getPassword();
        admin2.setVerified(true);
        boolean boolean10 = admin2.isVerified();
        java.lang.String str11 = admin2.getEmail();
        admin2.setVerified(false);
        java.lang.String str14 = admin2.getPassword();
        java.lang.String str15 = admin2.getPassword();
        boolean boolean16 = admin2.isVerified();
        admin2.logout();
        java.lang.String str18 = admin2.getID();
        java.lang.String str19 = admin2.getEmail();
        java.lang.String str20 = admin2.getPassword();
        java.lang.Class<?> wildcardClass21 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "admin" + "'", str18, "admin");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test01941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01941");
        model.Admin admin2 = new model.Admin("", "");
        java.lang.String str3 = admin2.getAccountType();
        admin2.setVerified(true);
        double double6 = admin2.getHourlyRate();
        admin2.setVerified(false);
        admin2.logout();
        admin2.setVerified(true);
        boolean boolean12 = admin2.isVerified();
        java.lang.String str13 = admin2.getAccountType();
        java.lang.String str14 = admin2.getPassword();
        room.Room room15 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "admin" + "'", str13, "admin");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test01942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01942");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        admin2.setVerified(true);
        admin2.logout();
        admin2.setVerified(false);
        admin2.viewProfile();
        admin2.logout();
        double double13 = admin2.getHourlyRate();
        room.Room room14 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test01943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01943");
        model.Admin admin2 = new model.Admin("", "");
        java.lang.String str3 = admin2.getAccountType();
        java.lang.String str4 = admin2.getEmail();
        double double5 = admin2.getHourlyRate();
        admin2.logout();
        java.lang.String str7 = admin2.getPassword();
        room.Room room8 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test01944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01944");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getPassword();
        boolean boolean4 = admin2.isVerified();
        java.lang.String str5 = admin2.getID();
        java.lang.String str6 = admin2.getEmail();
        java.lang.String str7 = admin2.getAccountType();
        admin2.setVerified(false);
        admin2.viewProfile();
        admin2.viewProfile();
        room.Room room12 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
    }

    @Test
    public void test01945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01945");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        admin2.login("", "");
        java.lang.String str9 = admin2.getID();
        java.lang.String str10 = admin2.getEmail();
        java.lang.String str11 = admin2.getAccountType();
        admin2.logout();
        java.lang.String str13 = admin2.getEmail();
        java.lang.String str14 = admin2.getEmail();
        room.Room room15 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "admin" + "'", str11, "admin");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test01946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01946");
        model.Admin admin2 = new model.Admin("hi!", "admin");
        java.lang.String str3 = admin2.getID();
        admin2.setVerified(false);
        admin2.viewProfile();
        java.lang.Class<?> wildcardClass7 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test01947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01947");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.login("admin", "admin");
        boolean boolean6 = admin2.isVerified();
        admin2.logout();
        java.lang.String str8 = admin2.getID();
        admin2.logout();
        admin2.logout();
        room.Room room11 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
    }

    @Test
    public void test01948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01948");
        model.Admin admin2 = new model.Admin("", "");
        java.lang.String str3 = admin2.getAccountType();
        java.lang.String str4 = admin2.getEmail();
        java.lang.String str5 = admin2.getID();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getAccountType();
        admin2.setVerified(false);
        boolean boolean10 = admin2.isVerified();
        java.lang.String str11 = admin2.getPassword();
        java.lang.String str12 = admin2.getEmail();
        java.lang.String str13 = admin2.getAccountType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "admin" + "'", str13, "admin");
    }

    @Test
    public void test01949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01949");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        admin2.login("", "");
        java.lang.String str9 = admin2.getPassword();
        java.lang.String str10 = admin2.getID();
        java.lang.String str11 = admin2.getAccountType();
        admin2.viewProfile();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "admin" + "'", str11, "admin");
    }

    @Test
    public void test01950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01950");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        java.lang.String str4 = admin2.getEmail();
        admin2.logout();
        admin2.logout();
        java.lang.String str7 = admin2.getPassword();
        admin2.login("hi!", "");
        room.Room room11 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test01951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01951");
        model.Admin admin2 = new model.Admin("", "");
        java.lang.String str3 = admin2.getAccountType();
        admin2.setVerified(true);
        double double6 = admin2.getHourlyRate();
        admin2.setVerified(false);
        java.lang.String str9 = admin2.getEmail();
        java.lang.String str10 = admin2.getPassword();
        java.lang.String str11 = admin2.getPassword();
        admin2.logout();
        admin2.setVerified(false);
        room.Room room15 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test01952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01952");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.login("admin", "admin");
        boolean boolean6 = admin2.isVerified();
        admin2.logout();
        java.lang.String str8 = admin2.getID();
        admin2.setVerified(true);
        admin2.setVerified(true);
        boolean boolean13 = admin2.isVerified();
        admin2.viewProfile();
        admin2.logout();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test01953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01953");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.viewProfile();
        java.lang.String str4 = admin2.getPassword();
        admin2.login("", "");
        boolean boolean8 = admin2.isVerified();
        admin2.setVerified(true);
        admin2.setVerified(false);
        admin2.setVerified(false);
        admin2.viewProfile();
        java.lang.String str16 = admin2.getEmail();
        admin2.logout();
        java.lang.Class<?> wildcardClass18 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "admin" + "'", str16, "admin");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test01954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01954");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        java.lang.String str5 = admin2.getID();
        admin2.login("admin", "hi!");
        java.lang.String str9 = admin2.getPassword();
        admin2.viewProfile();
        java.lang.Class<?> wildcardClass11 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test01955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01955");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        admin2.viewProfile();
        admin2.login("admin", "admin");
        java.lang.Class<?> wildcardClass10 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test01956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01956");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        java.lang.String str4 = admin2.getAccountType();
        java.lang.String str5 = admin2.getPassword();
        admin2.logout();
        admin2.logout();
        admin2.login("admin", "");
        java.lang.String str11 = admin2.getID();
        room.Room room12 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "admin" + "'", str11, "admin");
    }

    @Test
    public void test01957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01957");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        admin2.viewProfile();
        admin2.setVerified(false);
        java.lang.String str9 = admin2.getEmail();
        admin2.setVerified(false);
        java.lang.String str12 = admin2.getID();
        admin2.login("", "");
        boolean boolean16 = admin2.isVerified();
        java.lang.Class<?> wildcardClass17 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "admin" + "'", str12, "admin");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test01958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01958");
        model.Admin admin2 = new model.Admin("", "");
        java.lang.String str3 = admin2.getAccountType();
        java.lang.String str4 = admin2.getEmail();
        java.lang.String str5 = admin2.getID();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getAccountType();
        admin2.setVerified(false);
        admin2.viewProfile();
        room.Room room11 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
    }

    @Test
    public void test01959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01959");
        model.Admin admin2 = new model.Admin("hi!", "admin");
        java.lang.String str3 = admin2.getID();
        admin2.setVerified(true);
        admin2.setVerified(false);
        room.Room room8 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
    }

    @Test
    public void test01960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01960");
        model.Admin admin2 = new model.Admin("", "");
        java.lang.String str3 = admin2.getAccountType();
        java.lang.String str4 = admin2.getEmail();
        java.lang.String str5 = admin2.getID();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getAccountType();
        admin2.setVerified(false);
        boolean boolean10 = admin2.isVerified();
        double double11 = admin2.getHourlyRate();
        java.lang.String str12 = admin2.getEmail();
        java.lang.Class<?> wildcardClass13 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test01961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01961");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getAccountType();
        java.lang.String str4 = admin2.getPassword();
        admin2.setVerified(true);
        java.lang.String str7 = admin2.getID();
        java.lang.String str8 = admin2.getEmail();
        java.lang.String str9 = admin2.getPassword();
        java.lang.String str10 = admin2.getEmail();
        boolean boolean11 = admin2.isVerified();
        room.Room room12 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test01962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01962");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        boolean boolean6 = admin2.isVerified();
        admin2.login("hi!", "");
        java.lang.String str10 = admin2.getEmail();
        java.lang.String str11 = admin2.getAccountType();
        java.lang.String str12 = admin2.getAccountType();
        double double13 = admin2.getHourlyRate();
        java.lang.String str14 = admin2.getPassword();
        room.Room room15 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "admin" + "'", str11, "admin");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "admin" + "'", str12, "admin");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test01963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01963");
        model.Admin admin2 = new model.Admin("", "");
        java.lang.String str3 = admin2.getAccountType();
        admin2.setVerified(true);
        double double6 = admin2.getHourlyRate();
        admin2.viewProfile();
        boolean boolean8 = admin2.isVerified();
        java.lang.String str9 = admin2.getID();
        admin2.login("admin", "");
        admin2.viewProfile();
        java.lang.String str14 = admin2.getEmail();
        java.lang.String str15 = admin2.getPassword();
        admin2.setVerified(true);
        java.lang.Class<?> wildcardClass18 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test01964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01964");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.viewProfile();
        java.lang.String str4 = admin2.getPassword();
        admin2.login("", "");
        boolean boolean8 = admin2.isVerified();
        admin2.setVerified(true);
        admin2.setVerified(false);
        java.lang.String str13 = admin2.getAccountType();
        admin2.setVerified(false);
        boolean boolean16 = admin2.isVerified();
        java.lang.String str17 = admin2.getPassword();
        java.lang.String str18 = admin2.getPassword();
        boolean boolean19 = admin2.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "admin" + "'", str13, "admin");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "admin" + "'", str17, "admin");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "admin" + "'", str18, "admin");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test01965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01965");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        java.lang.String str5 = admin2.getID();
        admin2.setVerified(false);
        double double8 = admin2.getHourlyRate();
        java.lang.String str9 = admin2.getAccountType();
        room.Room room10 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
    }

    @Test
    public void test01966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01966");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.login("admin", "admin");
        boolean boolean6 = admin2.isVerified();
        admin2.logout();
        java.lang.String str8 = admin2.getID();
        admin2.logout();
        java.lang.String str10 = admin2.getID();
        admin2.login("hi!", "");
        admin2.login("admin", "hi!");
        admin2.logout();
        admin2.logout();
        java.lang.Class<?> wildcardClass19 = admin2.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test01967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01967");
        model.Admin admin2 = new model.Admin("admin", "");
        admin2.logout();
        admin2.viewProfile();
        boolean boolean5 = admin2.isVerified();
        admin2.viewProfile();
        room.Room room7 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test01968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01968");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.viewProfile();
        java.lang.String str4 = admin2.getPassword();
        admin2.viewProfile();
        java.lang.String str6 = admin2.getPassword();
        room.Room room7 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "admin" + "'", str6, "admin");
    }

    @Test
    public void test01969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01969");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.viewProfile();
        java.lang.String str4 = admin2.getPassword();
        double double5 = admin2.getHourlyRate();
        java.lang.String str6 = admin2.getAccountType();
        admin2.login("hi!", "admin");
        java.lang.String str10 = admin2.getPassword();
        java.lang.String str11 = admin2.getEmail();
        room.Room room12 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "admin" + "'", str6, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "admin" + "'", str11, "admin");
    }

    @Test
    public void test01970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01970");
        model.Admin admin2 = new model.Admin("admin", "hi!");
        java.lang.String str3 = admin2.getPassword();
        java.lang.String str4 = admin2.getEmail();
        java.lang.String str5 = admin2.getAccountType();
        room.Room room6 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
    }

    @Test
    public void test01971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01971");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        boolean boolean6 = admin2.isVerified();
        java.lang.String str7 = admin2.getPassword();
        java.lang.String str8 = admin2.getPassword();
        admin2.setVerified(true);
        admin2.login("hi!", "");
        java.lang.String str14 = admin2.getID();
        room.Room room15 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "admin" + "'", str14, "admin");
    }

    @Test
    public void test01972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01972");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getAccountType();
        boolean boolean4 = admin2.isVerified();
        admin2.setVerified(false);
        java.lang.String str7 = admin2.getPassword();
        admin2.login("hi!", "admin");
        java.lang.Class<?> wildcardClass11 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test01973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01973");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        admin2.login("", "");
        java.lang.String str9 = admin2.getEmail();
        java.lang.String str10 = admin2.getAccountType();
        java.lang.String str11 = admin2.getEmail();
        boolean boolean12 = admin2.isVerified();
        admin2.setVerified(false);
        java.lang.Class<?> wildcardClass15 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test01974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01974");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getPassword();
        boolean boolean4 = admin2.isVerified();
        java.lang.String str5 = admin2.getID();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getAccountType();
        room.Room room8 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
    }

    @Test
    public void test01975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01975");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        admin2.viewProfile();
        admin2.login("hi!", "admin");
        boolean boolean10 = admin2.isVerified();
        admin2.logout();
        admin2.login("", "");
        room.Room room15 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test01976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01976");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getAccountType();
        admin2.setVerified(false);
        admin2.login("hi!", "hi!");
        java.lang.String str9 = admin2.getEmail();
        java.lang.String str10 = admin2.getAccountType();
        room.Room room11 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
    }

    @Test
    public void test01977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01977");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.viewProfile();
        java.lang.String str4 = admin2.getPassword();
        admin2.login("", "");
        boolean boolean8 = admin2.isVerified();
        admin2.setVerified(false);
        java.lang.String str11 = admin2.getAccountType();
        double double12 = admin2.getHourlyRate();
        java.lang.Class<?> wildcardClass13 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "admin" + "'", str11, "admin");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test01978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01978");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        admin2.viewProfile();
        admin2.login("hi!", "admin");
        java.lang.String str10 = admin2.getAccountType();
        boolean boolean11 = admin2.isVerified();
        java.lang.String str12 = admin2.getPassword();
        java.lang.String str13 = admin2.getAccountType();
        java.lang.Class<?> wildcardClass14 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "admin" + "'", str13, "admin");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test01979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01979");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getID();
        boolean boolean8 = admin2.isVerified();
        admin2.login("", "");
        admin2.viewProfile();
        boolean boolean13 = admin2.isVerified();
        boolean boolean14 = admin2.isVerified();
        java.lang.String str15 = admin2.getAccountType();
        double double16 = admin2.getHourlyRate();
        java.lang.String str17 = admin2.getID();
        admin2.logout();
        admin2.logout();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "admin" + "'", str15, "admin");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "admin" + "'", str17, "admin");
    }

    @Test
    public void test01980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01980");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.login("admin", "admin");
        boolean boolean6 = admin2.isVerified();
        admin2.logout();
        admin2.logout();
        admin2.login("hi!", "admin");
        room.Room room12 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test01981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01981");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        admin2.setVerified(true);
        java.lang.String str9 = admin2.getEmail();
        java.lang.String str10 = admin2.getEmail();
        boolean boolean11 = admin2.isVerified();
        java.lang.String str12 = admin2.getEmail();
        admin2.logout();
        room.Room room14 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test01982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01982");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.viewProfile();
        java.lang.String str4 = admin2.getPassword();
        admin2.login("", "");
        java.lang.String str8 = admin2.getEmail();
        java.lang.String str9 = admin2.getAccountType();
        admin2.login("", "");
        java.lang.String str13 = admin2.getPassword();
        admin2.login("hi!", "hi!");
        java.lang.String str17 = admin2.getID();
        admin2.setVerified(true);
        admin2.logout();
        admin2.login("", "hi!");
        java.lang.Class<?> wildcardClass24 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "admin" + "'", str13, "admin");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "admin" + "'", str17, "admin");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test01983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01983");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getID();
        admin2.viewProfile();
        room.Room room9 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
    }

    @Test
    public void test01984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01984");
        model.Admin admin2 = new model.Admin("", "");
        java.lang.String str3 = admin2.getAccountType();
        java.lang.String str4 = admin2.getEmail();
        java.lang.String str5 = admin2.getID();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getAccountType();
        double double8 = admin2.getHourlyRate();
        java.lang.String str9 = admin2.getAccountType();
        admin2.setVerified(false);
        room.Room room12 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
    }

    @Test
    public void test01985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01985");
        model.Admin admin2 = new model.Admin("hi!", "");
        java.lang.String str3 = admin2.getEmail();
        admin2.setVerified(true);
        room.Room room6 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test01986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01986");
        model.Admin admin2 = new model.Admin("", "");
        java.lang.String str3 = admin2.getAccountType();
        java.lang.String str4 = admin2.getEmail();
        double double5 = admin2.getHourlyRate();
        admin2.logout();
        admin2.viewProfile();
        admin2.logout();
        java.lang.Class<?> wildcardClass9 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test01987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01987");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getID();
        admin2.login("", "admin");
        admin2.viewProfile();
        boolean boolean12 = admin2.isVerified();
        admin2.setVerified(true);
        room.Room room15 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test01988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01988");
        model.Admin admin2 = new model.Admin("admin", "hi!");
        java.lang.String str3 = admin2.getPassword();
        admin2.login("admin", "");
        java.lang.String str7 = admin2.getEmail();
        java.lang.Class<?> wildcardClass8 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test01989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01989");
        model.Admin admin2 = new model.Admin("admin", "");
        admin2.setVerified(true);
        boolean boolean5 = admin2.isVerified();
        java.lang.String str6 = admin2.getAccountType();
        admin2.logout();
        java.lang.String str8 = admin2.getAccountType();
        java.lang.Class<?> wildcardClass9 = admin2.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "admin" + "'", str6, "admin");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test01990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01990");
        model.Admin admin2 = new model.Admin("", "");
        java.lang.String str3 = admin2.getAccountType();
        admin2.setVerified(true);
        double double6 = admin2.getHourlyRate();
        admin2.viewProfile();
        boolean boolean8 = admin2.isVerified();
        java.lang.String str9 = admin2.getID();
        admin2.login("admin", "");
        java.lang.Class<?> wildcardClass13 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test01991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01991");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.viewProfile();
        java.lang.String str4 = admin2.getPassword();
        admin2.login("", "");
        java.lang.String str8 = admin2.getEmail();
        java.lang.String str9 = admin2.getAccountType();
        java.lang.String str10 = admin2.getPassword();
        java.lang.String str11 = admin2.getID();
        admin2.login("admin", "");
        java.lang.Class<?> wildcardClass15 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "admin" + "'", str11, "admin");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test01992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01992");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        admin2.setVerified(true);
        double double8 = admin2.getHourlyRate();
        double double9 = admin2.getHourlyRate();
        java.lang.String str10 = admin2.getPassword();
        admin2.login("admin", "");
        room.Room room14 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test01993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01993");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.login("admin", "admin");
        admin2.setVerified(false);
        java.lang.String str8 = admin2.getPassword();
        room.Room room9 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
    }

    @Test
    public void test01994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01994");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getAccountType();
        boolean boolean4 = admin2.isVerified();
        boolean boolean5 = admin2.isVerified();
        admin2.viewProfile();
        java.lang.String str7 = admin2.getID();
        java.lang.String str8 = admin2.getAccountType();
        java.lang.String str9 = admin2.getEmail();
        room.Room room10 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test01995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01995");
        model.Admin admin2 = new model.Admin("", "");
        java.lang.String str3 = admin2.getAccountType();
        admin2.setVerified(true);
        double double6 = admin2.getHourlyRate();
        admin2.setVerified(false);
        admin2.logout();
        admin2.setVerified(true);
        boolean boolean12 = admin2.isVerified();
        room.Room room13 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test01996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01996");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        java.lang.String str5 = admin2.getID();
        java.lang.String str6 = admin2.getID();
        admin2.logout();
        java.lang.String str8 = admin2.getID();
        boolean boolean9 = admin2.isVerified();
        admin2.setVerified(true);
        admin2.setVerified(true);
        java.lang.String str14 = admin2.getEmail();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "admin" + "'", str6, "admin");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test01997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01997");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        boolean boolean4 = admin2.isVerified();
        double double5 = admin2.getHourlyRate();
        double double6 = admin2.getHourlyRate();
        java.lang.String str7 = admin2.getPassword();
        admin2.setVerified(true);
        java.lang.String str10 = admin2.getEmail();
        java.lang.String str11 = admin2.getID();
        boolean boolean12 = admin2.isVerified();
        admin2.login("admin", "admin");
        java.lang.String str16 = admin2.getPassword();
        admin2.logout();
        java.lang.Class<?> wildcardClass18 = admin2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "admin" + "'", str11, "admin");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test01998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01998");
        model.Admin admin2 = new model.Admin("admin", "admin");
        admin2.viewProfile();
        java.lang.String str4 = admin2.getPassword();
        admin2.login("", "");
        java.lang.String str8 = admin2.getID();
        room.Room room9 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.enableRoom(room9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "admin" + "'", str8, "admin");
    }

    @Test
    public void test01999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01999");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        java.lang.String str4 = admin2.getEmail();
        boolean boolean5 = admin2.isVerified();
        java.lang.String str6 = admin2.getAccountType();
        admin2.setVerified(false);
        boolean boolean9 = admin2.isVerified();
        java.lang.String str10 = admin2.getPassword();
        room.Room room11 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.disableRoom(room11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.setEnabled(boolean)\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "admin" + "'", str6, "admin");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test02000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test02000");
        model.Admin admin2 = new model.Admin("hi!", "hi!");
        java.lang.String str3 = admin2.getID();
        admin2.logout();
        java.lang.String str5 = admin2.getAccountType();
        admin2.viewProfile();
        admin2.logout();
        double double8 = admin2.getHourlyRate();
        double double9 = admin2.getHourlyRate();
        java.lang.String str10 = admin2.getPassword();
        room.Room room11 = null;
        // The following exception was thrown during execution in test generation
        try {
            admin2.addRoom(room11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }
}

