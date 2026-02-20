import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

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
    public void test00501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00501");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 10L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(1.0d, user8);
        java.lang.Class<?> wildcardClass10 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00502");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (-1.0f), user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (short) 0, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 1.0f, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((-1.0d), user20);
        java.lang.Class<?> wildcardClass22 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test00503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00503");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 100L, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay(100.0d, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (short) -1, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (byte) 0, user17);
        java.lang.Class<?> wildcardClass19 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00504");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((-1.0d), user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(0.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (short) 100, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 1.0f, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay(0.0d, user17);
        java.lang.Class<?> wildcardClass19 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00505");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) (byte) 10, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (byte) 1, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (-1L), user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (byte) 1, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay(0.0d, user17);
        java.lang.Class<?> wildcardClass19 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00506");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) (short) 10, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (short) 10, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (-1), user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (byte) 1, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) '#', user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) (-1L), user20);
        java.lang.Class<?> wildcardClass22 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test00507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00507");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) (short) 10, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (byte) 1, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay(10.0d, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((-1.0d), user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay(100.0d, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay(0.0d, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) 0L, user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) (byte) 100, user26);
        java.lang.Class<?> wildcardClass28 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test00508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00508");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((-1.0d), user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(0.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay(0.0d, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay(10.0d, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 0.0f, user17);
        java.lang.Class<?> wildcardClass19 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00509");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 1, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay(100.0d, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (byte) -1, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 10.0f, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay(0.0d, user20);
        java.lang.Class<?> wildcardClass22 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test00510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00510");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 10L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (byte) 100, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 0.0f, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (byte) 10, user14);
        java.lang.Class<?> wildcardClass16 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00511");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay(0.0d, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 10.0f, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (byte) 0, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (-1L), user14);
        java.lang.Class<?> wildcardClass16 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00512");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay(0.0d, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 10.0f, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) '#', user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 100, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 'a', user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay(0.0d, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) (-1.0f), user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) (short) -1, user26);
        java.lang.Class<?> wildcardClass28 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test00513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00513");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 1, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay(100.0d, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay(100.0d, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 1.0f, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay(0.0d, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) (byte) 10, user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) (-1), user26);
        java.lang.Class<?> wildcardClass28 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test00514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00514");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((-1.0d), user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(0.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (short) 100, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (byte) -1, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 10.0f, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay(0.0d, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) 10.0f, user23);
        java.lang.Class<?> wildcardClass25 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test00515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00515");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((-1.0d), user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(0.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (short) 100, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 10.0f, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (byte) 100, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay(0.0d, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) (byte) 10, user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay(1.0d, user26);
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay((double) (byte) 100, user29);
        java.lang.Class<?> wildcardClass31 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test00516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00516");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 100, user5);
        java.lang.Class<?> wildcardClass7 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00517");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 100L, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 'a', user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay(10.0d, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (short) 0, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) (byte) 0, user20);
        java.lang.Class<?> wildcardClass22 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test00518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00518");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 10L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(1.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay(1.0d, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((-1.0d), user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (byte) 0, user17);
        java.lang.Class<?> wildcardClass19 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00519");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 10L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 100, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay(1.0d, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay(0.0d, user14);
        java.lang.Class<?> wildcardClass16 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00520");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (-1.0f), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay(10.0d, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 0L, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) '4', user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 10.0f, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 100L, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) 100L, user20);
        java.lang.Class<?> wildcardClass22 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test00521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00521");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((-1.0d), user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(0.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (short) 100, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 10.0f, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (byte) 100, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay(0.0d, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) (byte) 10, user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay(1.0d, user26);
        java.lang.Class<?> wildcardClass28 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test00522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00522");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay(0.0d, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 0L, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 1L, user17);
        java.lang.Class<?> wildcardClass19 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00523");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((-1.0d), user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(0.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay(0.0d, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 1, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay(100.0d, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((-1.0d), user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) 10.0f, user23);
        java.lang.Class<?> wildcardClass25 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test00524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00524");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 1L, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (byte) 100, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 1.0f, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay(1.0d, user20);
        java.lang.Class<?> wildcardClass22 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test00525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00525");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay(0.0d, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 1L, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (short) 1, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) 100L, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay(100.0d, user23);
        java.lang.Class<?> wildcardClass25 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test00526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00526");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) '#', user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) '4', user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 10.0f, user11);
        java.lang.Class<?> wildcardClass13 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00527");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 1, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) '4', user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 0, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (-1), user17);
        java.lang.Class<?> wildcardClass19 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00528");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 10L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (byte) 100, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 10.0f, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (byte) 10, user14);
        java.lang.Class<?> wildcardClass16 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00529");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 10L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (byte) -1, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (byte) 1, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 0, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((-1.0d), user17);
        java.lang.Class<?> wildcardClass19 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00530");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 100L, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay(100.0d, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 1L, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) ' ', user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) 0, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) (byte) 1, user23);
        java.lang.Class<?> wildcardClass25 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test00531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00531");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 1, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) '4', user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 1L, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 1.0f, user17);
        java.lang.Class<?> wildcardClass19 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00532");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (byte) -1, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 0.0f, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 1.0f, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 10.0f, user17);
        java.lang.Class<?> wildcardClass19 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00533");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 1, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay(100.0d, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (byte) -1, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay(10.0d, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay(0.0d, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((-1.0d), user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) (-1.0f), user26);
        java.lang.Class<?> wildcardClass28 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test00534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00534");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 0.0f, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (short) -1, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 1L, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (byte) 1, user14);
        java.lang.Class<?> wildcardClass16 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00535");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) (short) 10, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (short) 10, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (-1), user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (byte) 1, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (byte) 100, user17);
        java.lang.Class<?> wildcardClass19 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00536");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) '#', user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay(10.0d, user11);
        java.lang.Class<?> wildcardClass13 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00537");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 10L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (byte) 100, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 0.0f, user11);
        java.lang.Class<?> wildcardClass13 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00538");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay(0.0d, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (short) 100, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 10.0f, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 0L, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (byte) -1, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) (short) -1, user20);
        java.lang.Class<?> wildcardClass22 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test00539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00539");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (-1.0f), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay(10.0d, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 0L, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) '4', user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 10.0f, user14);
        java.lang.Class<?> wildcardClass16 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00540");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 100L, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 'a', user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 'a', user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 10, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay(1.0d, user20);
        java.lang.Class<?> wildcardClass22 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test00541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00541");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) '#', user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (short) 100, user11);
        java.lang.Class<?> wildcardClass13 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00542");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 100L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (byte) 0, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (short) 100, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 10L, user14);
        java.lang.Class<?> wildcardClass16 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00543");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (-1.0f), user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (short) 0, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 1.0f, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) 100.0f, user20);
        java.lang.Class<?> wildcardClass22 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test00544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00544");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay(0.0d, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 10.0f, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 10.0f, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 100.0f, user14);
        java.lang.Class<?> wildcardClass16 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00545");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (-1.0f), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay(10.0d, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 0L, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) '4', user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay(0.0d, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay(0.0d, user17);
        java.lang.Class<?> wildcardClass19 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00546");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay(0.0d, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 10.0f, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay(1.0d, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (short) 0, user14);
        java.lang.Class<?> wildcardClass16 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00547");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 1, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 100L, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (short) 1, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay(0.0d, user17);
        java.lang.Class<?> wildcardClass19 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00548");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 1, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) '4', user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 1L, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 100L, user17);
        java.lang.Class<?> wildcardClass19 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00549");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay(0.0d, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 1L, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (short) 1, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) (short) -1, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) 100, user23);
        java.lang.Class<?> wildcardClass25 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test00550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00550");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((-1.0d), user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 100, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 'a', user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay(0.0d, user14);
        java.lang.Class<?> wildcardClass16 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00551");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 100L, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 'a', user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (short) -1, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (short) 100, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) (short) 0, user20);
        java.lang.Class<?> wildcardClass22 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test00552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00552");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 10L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(0.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 1, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (-1), user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (-1), user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay(1.0d, user20);
        java.lang.Class<?> wildcardClass22 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test00553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00553");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) (byte) 10, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 10L, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 100, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay(0.0d, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) '4', user17);
        java.lang.Class<?> wildcardClass19 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00554");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 1, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) '4', user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 0, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (short) 0, user17);
        java.lang.Class<?> wildcardClass19 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00555");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (-1), user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 0, user11);
        java.lang.Class<?> wildcardClass13 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00556");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (-1.0f), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) (byte) 0, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (byte) 10, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 100, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) '#', user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 1.0f, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay(1.0d, user20);
        java.lang.Class<?> wildcardClass22 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test00557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00557");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay(0.0d, user2);
        java.lang.Class<?> wildcardClass4 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00558");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) (byte) 10, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 1L, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 0.0f, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 100, user14);
        java.lang.Class<?> wildcardClass16 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00559");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 1, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay(100.0d, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (byte) -1, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (short) 100, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) (short) 100, user20);
        java.lang.Class<?> wildcardClass22 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test00560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00560");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 10L, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 1.0f, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (byte) 1, user17);
        java.lang.Class<?> wildcardClass19 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00561");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay(0.0d, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 100, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 1, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 0L, user14);
        java.lang.Class<?> wildcardClass16 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00562");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) (short) 10, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (byte) 1, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 0L, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 0, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (byte) -1, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) '#', user20);
        java.lang.Class<?> wildcardClass22 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test00563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00563");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 10L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (byte) -1, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (byte) 1, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 0, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (short) 10, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) (-1.0f), user20);
        java.lang.Class<?> wildcardClass22 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test00564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00564");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) (-1L), user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 10, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (byte) 1, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (byte) -1, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (short) 0, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) (-1), user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) (-1.0f), user23);
        java.lang.Class<?> wildcardClass25 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test00565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00565");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) (byte) 10, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (byte) 1, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (-1L), user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((-1.0d), user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) ' ', user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) (byte) 10, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) 0, user23);
        java.lang.Class<?> wildcardClass25 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test00566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00566");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 10L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(0.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 0.0f, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (-1), user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 100L, user17);
        java.lang.Class<?> wildcardClass19 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00567");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) (byte) 10, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 1L, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) '4', user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (short) 100, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay(1.0d, user17);
        java.lang.Class<?> wildcardClass19 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00568");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) (byte) 10, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (byte) 100, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (short) -1, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 100L, user14);
        java.lang.Class<?> wildcardClass16 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00569");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (-1.0f), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay(10.0d, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 0L, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) '4', user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay(10.0d, user14);
        java.lang.Class<?> wildcardClass16 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00570");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) (short) 10, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (short) 10, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (-1), user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (byte) 1, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 'a', user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) (-1L), user20);
        java.lang.Class<?> wildcardClass22 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test00571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00571");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay(0.0d, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (short) 100, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 0.0f, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((-1.0d), user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (short) 100, user17);
        java.lang.Class<?> wildcardClass19 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00572");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 1, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay(100.0d, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (byte) -1, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (short) 100, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) 10.0f, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) 1, user23);
        java.lang.Class<?> wildcardClass25 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test00573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00573");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((-1.0d), user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (-1.0f), user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 1L, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 10, user14);
        java.lang.Class<?> wildcardClass16 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00574");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 10L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(0.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 1, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 0.0f, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (short) -1, user17);
        java.lang.Class<?> wildcardClass19 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00575");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 10L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 100L, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 100L, user11);
        java.lang.Class<?> wildcardClass13 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00576");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) (short) 10, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(0.0d, user8);
        java.lang.Class<?> wildcardClass10 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00577");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 10L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (short) 0, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay(0.0d, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (byte) 100, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (short) 0, user17);
        java.lang.Class<?> wildcardClass19 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00578");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((-1.0d), user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (-1.0f), user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 1L, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 10, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 0L, user17);
        java.lang.Class<?> wildcardClass19 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00579");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay(0.0d, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(1.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (-1.0f), user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay(10.0d, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay(0.0d, user17);
        java.lang.Class<?> wildcardClass19 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00580");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 10L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 100, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay(1.0d, user11);
        java.lang.Class<?> wildcardClass13 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00581");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((-1.0d), user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(0.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay(0.0d, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 1, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay(100.0d, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((-1.0d), user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) 10.0f, user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) 0L, user26);
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay((double) (short) 10, user29);
        model.User user32 = null;
        boolean boolean33 = creditCardPayment0.pay((double) (-1), user32);
        java.lang.Class<?> wildcardClass34 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test00582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00582");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 100L, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 'a', user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (short) -1, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (short) 100, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) 100.0f, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) (byte) 10, user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) 0.0f, user26);
        java.lang.Class<?> wildcardClass28 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test00583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00583");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 0.0f, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (short) -1, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) '4', user11);
        java.lang.Class<?> wildcardClass13 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00584");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay(0.0d, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (short) 100, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 10.0f, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay(100.0d, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (short) 10, user17);
        java.lang.Class<?> wildcardClass19 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00585");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) '#', user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (short) 100, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 'a', user14);
        java.lang.Class<?> wildcardClass16 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00586");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((-1.0d), user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 0L, user11);
        java.lang.Class<?> wildcardClass13 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00587");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (short) -1, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 1, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (byte) 1, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) 'a', user20);
        java.lang.Class<?> wildcardClass22 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test00588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00588");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (short) -1, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 1, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (byte) 0, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) (short) 0, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) 0L, user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay(0.0d, user26);
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay((double) (short) 10, user29);
        java.lang.Class<?> wildcardClass31 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test00589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00589");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay(0.0d, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 10.0f, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 10.0f, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) ' ', user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 0.0f, user17);
        java.lang.Class<?> wildcardClass19 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00590");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (byte) -1, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 0.0f, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 1.0f, user14);
        java.lang.Class<?> wildcardClass16 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00591");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) (byte) 10, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (byte) 1, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (-1.0f), user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 1.0f, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (-1L), user17);
        java.lang.Class<?> wildcardClass19 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00592");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) ' ', user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) ' ', user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (byte) 1, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay(0.0d, user14);
        java.lang.Class<?> wildcardClass16 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00593");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 10L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (byte) 100, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 0.0f, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (byte) 10, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) '4', user17);
        java.lang.Class<?> wildcardClass19 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00594");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) (short) 10, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (short) 10, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (byte) 10, user11);
        java.lang.Class<?> wildcardClass13 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00595");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 1, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) '4', user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 1.0f, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) '#', user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay(0.0d, user20);
        java.lang.Class<?> wildcardClass22 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test00596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00596");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((-1.0d), user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(0.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (short) 100, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (byte) -1, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((-1.0d), user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) 0.0f, user20);
        java.lang.Class<?> wildcardClass22 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test00597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00597");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 10.0f, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay(0.0d, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay(0.0d, user17);
        java.lang.Class<?> wildcardClass19 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00598");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 1, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (byte) 100, user11);
        java.lang.Class<?> wildcardClass13 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00599");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 10L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (byte) -1, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay(100.0d, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) ' ', user14);
        java.lang.Class<?> wildcardClass16 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00600");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) (byte) 10, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (byte) 1, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (-1L), user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (-1), user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 1L, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) 10.0f, user20);
        java.lang.Class<?> wildcardClass22 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test00601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00601");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay(0.0d, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (-1.0f), user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (byte) 100, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) 100, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) (-1.0f), user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) 100.0f, user26);
        java.lang.Class<?> wildcardClass28 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test00602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00602");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (-1.0f), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) (byte) 0, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (short) 0, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 100.0f, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (-1), user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (short) 100, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) 10L, user20);
        java.lang.Class<?> wildcardClass22 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test00603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00603");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay(0.0d, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 10.0f, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (-1L), user11);
        java.lang.Class<?> wildcardClass13 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00604");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (-1.0f), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay(10.0d, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 0L, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 1.0f, user11);
        java.lang.Class<?> wildcardClass13 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00605");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay(0.0d, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 10.0f, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay(1.0d, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 100L, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 1L, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) (byte) 1, user20);
        java.lang.Class<?> wildcardClass22 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test00606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00606");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) '#', user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) '4', user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 10, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((-1.0d), user14);
        java.lang.Class<?> wildcardClass16 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00607");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay(0.0d, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(1.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (-1.0f), user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (short) 10, user14);
        java.lang.Class<?> wildcardClass16 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00608");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (-1.0f), user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (short) 0, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 1.0f, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((-1.0d), user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) (short) -1, user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) 1, user26);
        java.lang.Class<?> wildcardClass28 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test00609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00609");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) '#', user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (short) 100, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (short) 10, user14);
        java.lang.Class<?> wildcardClass16 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00610");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) (byte) 10, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (byte) 1, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (-1L), user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) '4', user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 1, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) (-1L), user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay(10.0d, user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) (short) 100, user26);
        java.lang.Class<?> wildcardClass28 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test00611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00611");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay(0.0d, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 10.0f, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (-1L), user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (byte) 10, user14);
        java.lang.Class<?> wildcardClass16 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00612");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) (byte) 10, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (byte) 1, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (-1L), user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 10.0f, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (-1), user17);
        java.lang.Class<?> wildcardClass19 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00613");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 100L, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 'a', user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (short) -1, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (short) 100, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) 100L, user20);
        java.lang.Class<?> wildcardClass22 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test00614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00614");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) (byte) 10, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (byte) 1, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (-1L), user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((-1.0d), user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) ' ', user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) (byte) 10, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) (-1.0f), user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) 'a', user26);
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay((double) 1, user29);
        java.lang.Class<?> wildcardClass31 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test00615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00615");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay(0.0d, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 0L, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay(1.0d, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) (-1L), user20);
        java.lang.Class<?> wildcardClass22 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test00616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00616");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 10L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (byte) -1, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (byte) 1, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 0, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (short) 10, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) 1L, user20);
        java.lang.Class<?> wildcardClass22 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test00617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00617");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 1L, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (short) 0, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((-1.0d), user17);
        java.lang.Class<?> wildcardClass19 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00618");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (-1.0f), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) (byte) 0, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(10.0d, user8);
        java.lang.Class<?> wildcardClass10 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00619");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay(0.0d, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 10.0f, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay(1.0d, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 10L, user14);
        java.lang.Class<?> wildcardClass16 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00620");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay(0.0d, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) '#', user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (-1L), user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) 1L, user20);
        java.lang.Class<?> wildcardClass22 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test00621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00621");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 10L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (short) 0, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay(10.0d, user11);
        java.lang.Class<?> wildcardClass13 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00622");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay(0.0d, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 10L, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 1.0f, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 1.0f, user14);
        java.lang.Class<?> wildcardClass16 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00623");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay(0.0d, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (short) 100, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 10.0f, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 100L, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (byte) 100, user17);
        java.lang.Class<?> wildcardClass19 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00624");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 10L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(0.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 1, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay(0.0d, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 100.0f, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) 0L, user20);
        java.lang.Class<?> wildcardClass22 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test00625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00625");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) (byte) 10, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (byte) 100, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (-1L), user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 1.0f, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay(10.0d, user17);
        java.lang.Class<?> wildcardClass19 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00626");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (-1.0f), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay(10.0d, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 0L, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) '4', user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 10.0f, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (short) 100, user17);
        java.lang.Class<?> wildcardClass19 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00627");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (-1.0f), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay(0.0d, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 100, user8);
        java.lang.Class<?> wildcardClass10 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00628");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((-1.0d), user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(0.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 'a', user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay(1.0d, user14);
        java.lang.Class<?> wildcardClass16 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00629");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 0.0f, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(100.0d, user8);
        java.lang.Class<?> wildcardClass10 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00630");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) ' ', user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) ' ', user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (byte) 1, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (short) 0, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 100.0f, user17);
        java.lang.Class<?> wildcardClass19 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00631");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (-1.0f), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay(10.0d, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 0L, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) '4', user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 10.0f, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 100L, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) (byte) -1, user20);
        java.lang.Class<?> wildcardClass22 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test00632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00632");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 10L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 100, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) '#', user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (short) 1, user14);
        java.lang.Class<?> wildcardClass16 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00633");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (-1.0f), user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (short) 0, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 1.0f, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((-1.0d), user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) (short) -1, user23);
        java.lang.Class<?> wildcardClass25 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test00634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00634");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (-1.0f), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay(10.0d, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 0L, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) '4', user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay(0.0d, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (-1), user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) (short) -1, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) 100L, user23);
        java.lang.Class<?> wildcardClass25 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test00635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00635");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (-1.0f), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay(10.0d, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 0L, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) '4', user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 10.0f, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 100L, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) 1, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) (short) 100, user23);
        java.lang.Class<?> wildcardClass25 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test00636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00636");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((-1.0d), user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(0.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (short) 100, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (byte) -1, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (byte) 10, user17);
        java.lang.Class<?> wildcardClass19 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00637");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 10L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (byte) -1, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (byte) 1, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 0, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (byte) 10, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay(100.0d, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) 1L, user23);
        java.lang.Class<?> wildcardClass25 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test00638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00638");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 1.0f, user8);
        java.lang.Class<?> wildcardClass10 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00639");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 1, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (byte) 100, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (-1), user14);
        java.lang.Class<?> wildcardClass16 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00640");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 1, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 100L, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (short) 1, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay(1.0d, user17);
        java.lang.Class<?> wildcardClass19 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00641");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay(0.0d, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (-1.0f), user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (byte) 100, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) 10L, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) '#', user23);
        java.lang.Class<?> wildcardClass25 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test00642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00642");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 100L, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay(100.0d, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 1L, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (short) 10, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) ' ', user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay(1.0d, user23);
        java.lang.Class<?> wildcardClass25 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test00643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00643");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((-1.0d), user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(0.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (short) 100, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (byte) -1, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 10.0f, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay(0.0d, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay(0.0d, user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) 10L, user26);
        java.lang.Class<?> wildcardClass28 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test00644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00644");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay(0.0d, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (short) 100, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 10.0f, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 100L, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (byte) 100, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) ' ', user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) 10.0f, user23);
        java.lang.Class<?> wildcardClass25 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test00645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00645");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) (-1.0f), user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 100L, user8);
        java.lang.Class<?> wildcardClass10 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00646");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 1, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay(100.0d, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (byte) -1, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (short) 100, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) 10.0f, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) '4', user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) 0, user26);
        java.lang.Class<?> wildcardClass28 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test00647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00647");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay(0.0d, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) '#', user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (-1), user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) (short) 10, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) 100.0f, user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay(100.0d, user26);
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay(100.0d, user29);
        java.lang.Class<?> wildcardClass31 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test00648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00648");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 10.0f, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 0, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay(1.0d, user17);
        java.lang.Class<?> wildcardClass19 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00649");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 10L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (byte) -1, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (byte) 0, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay(10.0d, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (byte) 100, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) 'a', user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) (short) 1, user23);
        java.lang.Class<?> wildcardClass25 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test00650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00650");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((-1.0d), user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (byte) 10, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (byte) 100, user14);
        java.lang.Class<?> wildcardClass16 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00651");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (short) -1, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 1, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (byte) 0, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) (short) 0, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) 0L, user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) 100, user26);
        java.lang.Class<?> wildcardClass28 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test00652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00652");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 1, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay(100.0d, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay(100.0d, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 1.0f, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay(0.0d, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) (byte) 10, user23);
        java.lang.Class<?> wildcardClass25 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test00653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00653");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 10L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(0.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 0.0f, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (-1.0f), user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (byte) 0, user17);
        java.lang.Class<?> wildcardClass19 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00654");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 0.0f, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (short) -1, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) '4', user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 100, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (short) 0, user17);
        java.lang.Class<?> wildcardClass19 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00655");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 0, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (-1.0f), user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) '4', user14);
        java.lang.Class<?> wildcardClass16 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00656");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 10L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (byte) -1, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (byte) 0, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 1, user14);
        java.lang.Class<?> wildcardClass16 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00657");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 0.0f, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 10.0f, user8);
        java.lang.Class<?> wildcardClass10 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00658");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (-1.0f), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay(10.0d, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 0L, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) '4', user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (byte) 100, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) '4', user17);
        java.lang.Class<?> wildcardClass19 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00659");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (-1.0f), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) (byte) 0, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (short) 0, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 0.0f, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (byte) 0, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 100.0f, user17);
        java.lang.Class<?> wildcardClass19 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00660");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((-1.0d), user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(0.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 'a', user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay(1.0d, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 10L, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) (-1), user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) 10, user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) '#', user26);
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay((double) 'a', user29);
        model.User user32 = null;
        boolean boolean33 = creditCardPayment0.pay((double) (-1.0f), user32);
        java.lang.Class<?> wildcardClass34 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test00661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00661");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) (byte) 10, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 10L, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 0L, user11);
        java.lang.Class<?> wildcardClass13 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00662");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay(0.0d, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (-1.0f), user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (byte) 1, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) 10, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) 10, user23);
        java.lang.Class<?> wildcardClass25 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test00663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00663");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) (short) 10, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (byte) 1, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay(10.0d, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((-1.0d), user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay(100.0d, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay(0.0d, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) 0L, user23);
        java.lang.Class<?> wildcardClass25 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test00664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00664");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) (short) 10, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (short) 10, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (-1), user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (byte) 1, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) '#', user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) ' ', user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) (byte) 1, user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay(1.0d, user26);
        java.lang.Class<?> wildcardClass28 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test00665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00665");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (-1.0f), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay(10.0d, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 0L, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) '4', user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 10.0f, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 100L, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) 100L, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) 100.0f, user23);
        java.lang.Class<?> wildcardClass25 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test00666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00666");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) (-1L), user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 10, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (byte) 1, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (byte) -1, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (short) 0, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) (-1), user20);
        java.lang.Class<?> wildcardClass22 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test00667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00667");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) (short) 10, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (byte) 1, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 0L, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 0, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 10, user17);
        java.lang.Class<?> wildcardClass19 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00668");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay(0.0d, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (short) 100, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 10.0f, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay(100.0d, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (short) 100, user17);
        java.lang.Class<?> wildcardClass19 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00669");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay(0.0d, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 1L, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay(0.0d, user17);
        java.lang.Class<?> wildcardClass19 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00670");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 10L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (byte) -1, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (byte) 0, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay(10.0d, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (byte) 100, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) '4', user20);
        java.lang.Class<?> wildcardClass22 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test00671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00671");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 1, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay(100.0d, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (byte) -1, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (short) 100, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay(10.0d, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) (-1L), user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) '#', user26);
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay(100.0d, user29);
        java.lang.Class<?> wildcardClass31 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test00672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00672");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((-1.0d), user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(0.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (short) 100, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 10.0f, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (byte) 100, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay(0.0d, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) (byte) 10, user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay(1.0d, user26);
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay((double) 10L, user29);
        java.lang.Class<?> wildcardClass31 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test00673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00673");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((-1.0d), user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(0.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (short) 100, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 10.0f, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (byte) -1, user17);
        java.lang.Class<?> wildcardClass19 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00674");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (-1.0f), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) (byte) 0, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (byte) 10, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 100, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) '#', user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (short) 100, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) (-1.0f), user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) 1, user23);
        java.lang.Class<?> wildcardClass25 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test00675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00675");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) (byte) 10, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (byte) 1, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (-1L), user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) '4', user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 1, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) (-1.0f), user20);
        java.lang.Class<?> wildcardClass22 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test00676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00676");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 1, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (byte) 100, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (short) 0, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay(10.0d, user17);
        java.lang.Class<?> wildcardClass19 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00677");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay(0.0d, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (short) 100, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 10.0f, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay(100.0d, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (-1.0f), user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay(1.0d, user20);
        java.lang.Class<?> wildcardClass22 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test00678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00678");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) (byte) 10, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (byte) 1, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (-1L), user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (-1L), user14);
        java.lang.Class<?> wildcardClass16 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00679");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 100L, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay(100.0d, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay(1.0d, user14);
        java.lang.Class<?> wildcardClass16 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00680");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) (short) 10, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(0.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay(0.0d, user11);
        java.lang.Class<?> wildcardClass13 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00681");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (-1.0f), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay(0.0d, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 0.0f, user8);
        java.lang.Class<?> wildcardClass10 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00682");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 1, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) '4', user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 1L, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 1.0f, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay(1.0d, user20);
        java.lang.Class<?> wildcardClass22 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test00683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00683");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 0.0f, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (short) -1, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 1L, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (byte) 1, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (byte) 10, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) 1L, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) 100, user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) 1L, user26);
        java.lang.Class<?> wildcardClass28 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test00684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00684");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 0, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (byte) 10, user11);
        java.lang.Class<?> wildcardClass13 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00685");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 10L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (short) 0, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay(0.0d, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (byte) 100, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 10.0f, user17);
        java.lang.Class<?> wildcardClass19 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00686");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 1, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) '4', user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay(1.0d, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (byte) 10, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) 10L, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) (short) 100, user23);
        java.lang.Class<?> wildcardClass25 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test00687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00687");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 1, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay(100.0d, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (byte) -1, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (short) 100, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay(10.0d, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) (-1L), user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) '#', user26);
        java.lang.Class<?> wildcardClass28 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test00688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00688");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) ' ', user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) ' ', user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (byte) 1, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 0, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay(10.0d, user17);
        java.lang.Class<?> wildcardClass19 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00689");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay(0.0d, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) '#', user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (-1), user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) (short) 10, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) (-1), user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) (-1L), user26);
        java.lang.Class<?> wildcardClass28 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test00690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00690");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 100L, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay(100.0d, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (short) -1, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (byte) 0, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((-1.0d), user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) (short) 100, user23);
        java.lang.Class<?> wildcardClass25 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test00691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00691");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay(0.0d, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 1L, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (short) 1, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) (short) -1, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) 100, user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) (byte) 1, user26);
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay(0.0d, user29);
        model.User user32 = null;
        boolean boolean33 = creditCardPayment0.pay((double) 10.0f, user32);
        model.User user35 = null;
        boolean boolean36 = creditCardPayment0.pay((double) ' ', user35);
        java.lang.Class<?> wildcardClass37 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test00692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00692");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay(0.0d, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 1L, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (short) 1, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) (short) -1, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) 100, user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) (byte) 1, user26);
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay(0.0d, user29);
        model.User user32 = null;
        boolean boolean33 = creditCardPayment0.pay((double) 10.0f, user32);
        model.User user35 = null;
        boolean boolean36 = creditCardPayment0.pay((double) 10.0f, user35);
        java.lang.Class<?> wildcardClass37 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test00693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00693");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay(0.0d, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (short) 100, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 10.0f, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay(100.0d, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 100.0f, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) 1.0f, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) (short) 100, user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) 100L, user26);
        java.lang.Class<?> wildcardClass28 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test00694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00694");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((-1.0d), user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(0.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 'a', user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay(1.0d, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 10L, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) 100, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) ' ', user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) 1, user26);
        java.lang.Class<?> wildcardClass28 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test00695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00695");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (-1.0f), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay(10.0d, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 0L, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) '4', user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 10.0f, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (byte) 1, user17);
        java.lang.Class<?> wildcardClass19 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00696");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) '#', user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) '4', user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 10, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 0L, user14);
        java.lang.Class<?> wildcardClass16 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00697");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 100L, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay(100.0d, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (short) -1, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (short) 10, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) (short) 0, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) (byte) -1, user23);
        java.lang.Class<?> wildcardClass25 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test00698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00698");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 100L, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 'a', user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 'a', user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 10, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) (-1L), user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay(1.0d, user23);
        java.lang.Class<?> wildcardClass25 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test00699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00699");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay(0.0d, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 100, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 1, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 0L, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (short) -1, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) (byte) 10, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) 100.0f, user23);
        java.lang.Class<?> wildcardClass25 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test00700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00700");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 1, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay(100.0d, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay(100.0d, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 10, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) (short) 1, user20);
        java.lang.Class<?> wildcardClass22 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test00701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00701");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 10L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(0.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 1, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay(0.0d, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 100.0f, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) (short) 10, user20);
        java.lang.Class<?> wildcardClass22 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test00702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00702");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay(0.0d, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 0L, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 1L, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) 0L, user20);
        java.lang.Class<?> wildcardClass22 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test00703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00703");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 100.0f, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(10.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 0L, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 0L, user14);
        java.lang.Class<?> wildcardClass16 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00704");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (-1.0f), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) (byte) 0, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (short) 0, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 100.0f, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (-1), user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 'a', user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) (short) 100, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) (byte) 0, user23);
        java.lang.Class<?> wildcardClass25 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test00705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00705");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay(0.0d, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 0L, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay(1.0d, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) (-1L), user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) 10L, user23);
        java.lang.Class<?> wildcardClass25 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test00706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00706");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 10L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (byte) -1, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (byte) 1, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 0, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (byte) 10, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) 0L, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) (short) 1, user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) ' ', user26);
        java.lang.Class<?> wildcardClass28 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test00707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00707");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 100L, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 'a', user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay(10.0d, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (short) 0, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) (byte) 0, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) 10L, user23);
        java.lang.Class<?> wildcardClass25 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test00708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00708");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay(0.0d, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 0L, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 100, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) 0.0f, user20);
        java.lang.Class<?> wildcardClass22 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test00709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00709");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) '#', user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) '4', user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 0, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (-1L), user14);
        java.lang.Class<?> wildcardClass16 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00710");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) (byte) 10, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 10L, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 1.0f, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (byte) -1, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 0, user17);
        java.lang.Class<?> wildcardClass19 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00711");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) (short) 10, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) '#', user8);
        java.lang.Class<?> wildcardClass10 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00712");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 10L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (byte) -1, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (byte) 1, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (-1L), user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((-1.0d), user17);
        java.lang.Class<?> wildcardClass19 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00713");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 100.0f, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((-1.0d), user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 10L, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay(100.0d, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 10.0f, user17);
        java.lang.Class<?> wildcardClass19 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00714");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 0.0f, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (short) -1, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 1L, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (byte) 1, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (byte) 10, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) 1L, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) (short) 0, user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) (short) 10, user26);
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay((double) 1.0f, user29);
        java.lang.Class<?> wildcardClass31 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test00715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00715");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) (-1L), user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 10, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (byte) 1, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (byte) -1, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (short) 0, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) 1, user20);
        java.lang.Class<?> wildcardClass22 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test00716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00716");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((-1.0d), user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(0.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay(0.0d, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay(0.0d, user14);
        java.lang.Class<?> wildcardClass16 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00717");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 100L, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay(100.0d, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 1L, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (short) 10, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) ' ', user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) 100L, user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay(10.0d, user26);
        java.lang.Class<?> wildcardClass28 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test00718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00718");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 10L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (byte) -1, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (byte) 0, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay(10.0d, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay(1.0d, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) (byte) 10, user20);
        java.lang.Class<?> wildcardClass22 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test00719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00719");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) (-1L), user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 10, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (-1L), user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 0.0f, user14);
        java.lang.Class<?> wildcardClass16 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00720");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (-1.0f), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay(10.0d, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((-1.0d), user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) '4', user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (-1), user14);
        java.lang.Class<?> wildcardClass16 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00721");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (-1.0f), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay(10.0d, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 0L, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) '4', user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (short) -1, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 1.0f, user17);
        java.lang.Class<?> wildcardClass19 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00722");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (-1.0f), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay(10.0d, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (byte) 100, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 1L, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) '#', user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 1.0f, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) (short) 1, user20);
        java.lang.Class<?> wildcardClass22 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test00723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00723");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 100L, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay(100.0d, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay(1.0d, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (short) -1, user17);
        java.lang.Class<?> wildcardClass19 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00724");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay(0.0d, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (-1.0f), user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (byte) 1, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay(0.0d, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) (short) 0, user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) (short) 1, user26);
        java.lang.Class<?> wildcardClass28 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test00725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00725");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) (-1L), user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 10, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (byte) 1, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (byte) -1, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (-1.0f), user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) 1L, user20);
        java.lang.Class<?> wildcardClass22 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test00726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00726");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (-1.0f), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) (byte) 0, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (short) 0, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 0.0f, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (byte) 0, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 10.0f, user17);
        java.lang.Class<?> wildcardClass19 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00727");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay(0.0d, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 10.0f, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (-1L), user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 0.0f, user14);
        java.lang.Class<?> wildcardClass16 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00728");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) '#', user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 100.0f, user11);
        java.lang.Class<?> wildcardClass13 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00729");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 0.0f, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (short) -1, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 1L, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (byte) 1, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (byte) 10, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) 1L, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) 100, user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay(100.0d, user26);
        java.lang.Class<?> wildcardClass28 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test00730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00730");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 10L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 100, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) '#', user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (byte) 100, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay(10.0d, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((-1.0d), user20);
        java.lang.Class<?> wildcardClass22 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test00731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00731");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 1L, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (byte) 100, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (byte) 0, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) 0L, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) (-1.0f), user23);
        java.lang.Class<?> wildcardClass25 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test00732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00732");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((-1.0d), user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(0.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (short) 100, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 10.0f, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) '4', user17);
        java.lang.Class<?> wildcardClass19 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00733");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 10L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (byte) -1, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay(100.0d, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) '#', user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (byte) 10, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) (byte) 0, user20);
        java.lang.Class<?> wildcardClass22 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test00734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00734");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (short) -1, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 1, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (byte) 0, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) (short) 0, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) (byte) 1, user23);
        java.lang.Class<?> wildcardClass25 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test00735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00735");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 10L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (byte) -1, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (byte) 1, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 0, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (byte) 10, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay(100.0d, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay(0.0d, user23);
        java.lang.Class<?> wildcardClass25 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test00736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00736");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay(0.0d, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (short) 100, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 10.0f, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay(100.0d, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 100.0f, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) (byte) 1, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) (short) 0, user23);
        java.lang.Class<?> wildcardClass25 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test00737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00737");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) (short) 10, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (short) 10, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (-1), user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 10, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 0.0f, user17);
        java.lang.Class<?> wildcardClass19 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00738");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((-1.0d), user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) '4', user8);
        java.lang.Class<?> wildcardClass10 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00739");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay(0.0d, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) '#', user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (-1), user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) (short) 10, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) 100.0f, user23);
        java.lang.Class<?> wildcardClass25 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test00740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00740");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (-1.0f), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) (byte) 0, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (byte) 10, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 100, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) '#', user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 1.0f, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay(1.0d, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) (-1), user23);
        java.lang.Class<?> wildcardClass25 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test00741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00741");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 100L, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay(100.0d, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (short) -1, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (short) 10, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) (short) 0, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) (short) 100, user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) (byte) 10, user26);
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay((double) 0.0f, user29);
        model.User user32 = null;
        boolean boolean33 = creditCardPayment0.pay((double) 1, user32);
        java.lang.Class<?> wildcardClass34 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test00742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00742");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 10L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(0.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 1, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 0.0f, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) '#', user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) 10, user20);
        java.lang.Class<?> wildcardClass22 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test00743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00743");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (short) 10, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) ' ', user11);
        java.lang.Class<?> wildcardClass13 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00744");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay(0.0d, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 0L, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay(1.0d, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay(1.0d, user20);
        java.lang.Class<?> wildcardClass22 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test00745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00745");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 1, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay(100.0d, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay(100.0d, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 1.0f, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) 100, user20);
        java.lang.Class<?> wildcardClass22 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test00746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00746");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 100L, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay(100.0d, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (short) -1, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (short) 10, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) (short) 0, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) (short) 100, user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) (byte) 10, user26);
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay((double) (byte) 0, user29);
        model.User user32 = null;
        boolean boolean33 = creditCardPayment0.pay((double) (-1.0f), user32);
        java.lang.Class<?> wildcardClass34 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test00747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00747");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (-1.0f), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) (byte) 0, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(10.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (short) -1, user11);
        java.lang.Class<?> wildcardClass13 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00748");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 100L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (byte) 0, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (short) 100, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 0, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 10, user17);
        java.lang.Class<?> wildcardClass19 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00749");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((-1.0d), user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 100, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 'a', user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay(0.0d, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (-1.0f), user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) 10, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) (byte) 1, user23);
        java.lang.Class<?> wildcardClass25 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test00750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00750");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 1L, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (byte) 100, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 10L, user17);
        java.lang.Class<?> wildcardClass19 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00751");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (-1.0f), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay(0.0d, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 0.0f, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (short) 0, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay(100.0d, user14);
        java.lang.Class<?> wildcardClass16 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00752");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((-1.0d), user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 100, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 'a', user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay(0.0d, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (-1.0f), user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) 0L, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) 0.0f, user23);
        java.lang.Class<?> wildcardClass25 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test00753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00753");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) (short) 10, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (short) 10, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (byte) 10, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 100.0f, user14);
        java.lang.Class<?> wildcardClass16 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00754");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay(0.0d, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 0L, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 100, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((-1.0d), user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay(100.0d, user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) (byte) -1, user26);
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay((double) '#', user29);
        java.lang.Class<?> wildcardClass31 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test00755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00755");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 100L, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 'a', user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 100, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay(10.0d, user17);
        java.lang.Class<?> wildcardClass19 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00756");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 0.0f, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (short) -1, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 1L, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (byte) 1, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (byte) 10, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) (-1.0f), user20);
        java.lang.Class<?> wildcardClass22 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test00757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00757");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 10L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 100, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay(10.0d, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (byte) -1, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (short) 1, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay(0.0d, user20);
        java.lang.Class<?> wildcardClass22 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test00758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00758");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 1, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 100L, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (short) 100, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 100.0f, user17);
        java.lang.Class<?> wildcardClass19 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00759");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (-1.0f), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay(10.0d, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 0L, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) '4', user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay(0.0d, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 10L, user17);
        java.lang.Class<?> wildcardClass19 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00760");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (-1.0f), user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (short) 0, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay(0.0d, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) 'a', user20);
        java.lang.Class<?> wildcardClass22 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test00761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00761");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 1, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay(100.0d, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (byte) -1, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay(10.0d, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay(0.0d, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((-1.0d), user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay(0.0d, user26);
        java.lang.Class<?> wildcardClass28 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test00762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00762");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 10L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (byte) -1, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (byte) 1, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 0, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (byte) 100, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) (short) 1, user20);
        java.lang.Class<?> wildcardClass22 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test00763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00763");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 10L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (byte) -1, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (byte) 1, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 0, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (byte) 100, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) ' ', user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) '#', user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) (byte) 0, user26);
        java.lang.Class<?> wildcardClass28 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test00764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00764");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (short) -1, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 1, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (byte) 0, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) (short) 0, user20);
        java.lang.Class<?> wildcardClass22 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test00765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00765");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((-1.0d), user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(0.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (short) 100, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (byte) -1, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 10.0f, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay(0.0d, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay(0.0d, user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) 10L, user26);
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay((double) '#', user29);
        java.lang.Class<?> wildcardClass31 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test00766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00766");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay(0.0d, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 1L, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (short) 1, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) (short) -1, user20);
        java.lang.Class<?> wildcardClass22 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test00767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00767");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 10L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (byte) 100, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 10.0f, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (short) 0, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 10.0f, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) 1, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) (short) -1, user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) 100L, user26);
        java.lang.Class<?> wildcardClass28 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test00768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00768");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay(0.0d, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (short) 100, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 10.0f, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay(100.0d, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 100.0f, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) 1.0f, user20);
        java.lang.Class<?> wildcardClass22 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test00769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00769");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) '#', user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 1L, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (short) 100, user11);
        java.lang.Class<?> wildcardClass13 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00770");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) '#', user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 'a', user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 10L, user14);
        java.lang.Class<?> wildcardClass16 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00771");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 10.0f, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) ' ', user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (byte) 0, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) 100, user20);
        java.lang.Class<?> wildcardClass22 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test00772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00772");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (-1.0f), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay(0.0d, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 10, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 0.0f, user11);
        java.lang.Class<?> wildcardClass13 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00773");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 0.0f, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (short) -1, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (-1L), user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 100, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay(100.0d, user17);
        java.lang.Class<?> wildcardClass19 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00774");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (-1.0f), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay(10.0d, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 0L, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) '4', user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay(0.0d, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (-1), user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) 1, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) (-1.0f), user23);
        java.lang.Class<?> wildcardClass25 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test00775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00775");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) (byte) 10, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 1L, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 0.0f, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 100, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay(0.0d, user17);
        java.lang.Class<?> wildcardClass19 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00776");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 10L, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 1.0f, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (byte) 1, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay(0.0d, user20);
        java.lang.Class<?> wildcardClass22 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test00777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00777");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 100L, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 'a', user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 'a', user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 10, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) 'a', user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) (byte) 10, user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) '#', user26);
        java.lang.Class<?> wildcardClass28 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test00778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00778");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) (short) 10, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (byte) 1, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay(0.0d, user11);
        java.lang.Class<?> wildcardClass13 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00779");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) (short) 10, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (byte) 1, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay(0.0d, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (short) 100, user14);
        java.lang.Class<?> wildcardClass16 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00780");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 10L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (byte) 100, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((-1.0d), user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (short) 10, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 10L, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) (short) 0, user20);
        java.lang.Class<?> wildcardClass22 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test00781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00781");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 1, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay(100.0d, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (byte) -1, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (short) 100, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) (short) 100, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay(0.0d, user23);
        java.lang.Class<?> wildcardClass25 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test00782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00782");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 10L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 100, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay(0.0d, user11);
        java.lang.Class<?> wildcardClass13 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00783");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (byte) -1, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 0.0f, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((-1.0d), user14);
        java.lang.Class<?> wildcardClass16 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00784");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay(0.0d, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) '#', user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 10L, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) (-1.0f), user20);
        java.lang.Class<?> wildcardClass22 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test00785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00785");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((-1.0d), user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(0.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (short) 100, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (byte) -1, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 10.0f, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay(0.0d, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) 0L, user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) 100, user26);
        java.lang.Class<?> wildcardClass28 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test00786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00786");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (-1.0f), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay(10.0d, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 'a', user8);
        java.lang.Class<?> wildcardClass10 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00787");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((-1.0d), user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 100, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 'a', user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay(0.0d, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (-1.0f), user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) 0L, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) (short) 10, user23);
        java.lang.Class<?> wildcardClass25 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test00788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00788");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay(0.0d, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (short) 100, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 10.0f, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay(100.0d, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (short) 100, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) '#', user20);
        java.lang.Class<?> wildcardClass22 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test00789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00789");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 10L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (byte) -1, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (byte) 0, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay(10.0d, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (byte) 100, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) 'a', user20);
        java.lang.Class<?> wildcardClass22 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test00790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00790");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) (short) 10, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (short) 10, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (-1), user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (byte) 1, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) '#', user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) ' ', user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) (byte) 1, user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) (byte) 10, user26);
        java.lang.Class<?> wildcardClass28 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test00791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00791");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) (byte) 10, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 10L, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 10L, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (short) 10, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 10, user17);
        java.lang.Class<?> wildcardClass19 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00792");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) (byte) 10, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (byte) 1, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (-1L), user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) '4', user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (short) 1, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) 100, user20);
        java.lang.Class<?> wildcardClass22 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test00793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00793");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 1L, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (byte) 100, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 0.0f, user17);
        java.lang.Class<?> wildcardClass19 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00794");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 10L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 100, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay(10.0d, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay(0.0d, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (short) 100, user17);
        java.lang.Class<?> wildcardClass19 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00795");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((-1.0d), user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(0.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 'a', user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay(1.0d, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 10L, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) 100, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) ' ', user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) 1, user26);
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay((double) 1, user29);
        java.lang.Class<?> wildcardClass31 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test00796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00796");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (-1.0f), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay(10.0d, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 0L, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) '4', user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay(10.0d, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((-1.0d), user17);
        java.lang.Class<?> wildcardClass19 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00797");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay(0.0d, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((-1.0d), user8);
        java.lang.Class<?> wildcardClass10 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00798");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) (byte) 10, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 10L, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 100, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay(0.0d, user14);
        java.lang.Class<?> wildcardClass16 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00799");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) (byte) 10, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (byte) 1, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (-1L), user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 0, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 10, user17);
        java.lang.Class<?> wildcardClass19 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00800");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) (short) 10, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (byte) 1, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay(10.0d, user11);
        java.lang.Class<?> wildcardClass13 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00801");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((-1.0d), user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(0.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay(0.0d, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 1, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay(100.0d, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((-1.0d), user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) 10.0f, user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay(0.0d, user26);
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay((double) ' ', user29);
        model.User user32 = null;
        boolean boolean33 = creditCardPayment0.pay((double) 0.0f, user32);
        java.lang.Class<?> wildcardClass34 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test00802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00802");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 10.0f, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay(0.0d, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay(1.0d, user17);
        java.lang.Class<?> wildcardClass19 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00803");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) (byte) 10, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(1.0d, user8);
        java.lang.Class<?> wildcardClass10 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00804");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay(0.0d, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (short) 100, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 10.0f, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay(100.0d, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (-1.0f), user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay(1.0d, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) 'a', user23);
        java.lang.Class<?> wildcardClass25 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test00805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00805");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay(0.0d, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 1L, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 10, user17);
        java.lang.Class<?> wildcardClass19 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00806");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) (short) 10, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (short) 10, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (-1), user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (byte) 1, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) '#', user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay(0.0d, user20);
        java.lang.Class<?> wildcardClass22 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test00807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00807");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) (short) 10, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (byte) 1, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 10L, user11);
        java.lang.Class<?> wildcardClass13 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00808");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay(0.0d, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 10.0f, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay(1.0d, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 100L, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (byte) -1, user17);
        java.lang.Class<?> wildcardClass19 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00809");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (-1.0f), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay(10.0d, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 0L, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) '4', user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 10.0f, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 0L, user17);
        java.lang.Class<?> wildcardClass19 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00810");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 100L, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay(100.0d, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 1L, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 10, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) (byte) 0, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) 10, user23);
        java.lang.Class<?> wildcardClass25 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test00811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00811");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 100L, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 'a', user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (short) -1, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (short) 100, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) 100.0f, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) (byte) 10, user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) 0.0f, user26);
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay((double) (-1), user29);
        java.lang.Class<?> wildcardClass31 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test00812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00812");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 100L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (-1L), user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 0.0f, user11);
        java.lang.Class<?> wildcardClass13 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00813");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay(0.0d, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 10.0f, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay(1.0d, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (byte) -1, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (byte) 100, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) 100.0f, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay(10.0d, user23);
        java.lang.Class<?> wildcardClass25 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test00814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00814");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((-1.0d), user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(0.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (short) 100, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (byte) -1, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 10.0f, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) 100, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) '#', user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) 1, user26);
        java.lang.Class<?> wildcardClass28 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test00815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00815");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) (byte) 10, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (byte) 100, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (byte) 100, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay(1.0d, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 100, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) (short) 10, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) (byte) 1, user23);
        java.lang.Class<?> wildcardClass25 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test00816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00816");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) (byte) 10, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 10L, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 1.0f, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (byte) -1, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay(0.0d, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay(1.0d, user20);
        java.lang.Class<?> wildcardClass22 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test00817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00817");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (-1.0f), user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (short) 0, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay(0.0d, user17);
        java.lang.Class<?> wildcardClass19 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00818");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 10L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (short) 0, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 10.0f, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 10L, user14);
        java.lang.Class<?> wildcardClass16 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00819");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 1, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (byte) 100, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (-1), user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay(0.0d, user17);
        java.lang.Class<?> wildcardClass19 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00820");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 1, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay(100.0d, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay(100.0d, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 1.0f, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay(0.0d, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) (byte) 10, user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) 0, user26);
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay((double) 10L, user29);
        model.User user32 = null;
        boolean boolean33 = creditCardPayment0.pay((double) 0L, user32);
        java.lang.Class<?> wildcardClass34 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test00821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00821");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((-1.0d), user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(0.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 'a', user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay(1.0d, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 10L, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) (-1), user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) 10, user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) '#', user26);
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay((double) 'a', user29);
        model.User user32 = null;
        boolean boolean33 = creditCardPayment0.pay((double) (-1.0f), user32);
        model.User user35 = null;
        boolean boolean36 = creditCardPayment0.pay((double) (-1L), user35);
        java.lang.Class<?> wildcardClass37 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test00822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00822");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay(0.0d, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 0L, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 100, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((-1.0d), user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay(100.0d, user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) (byte) -1, user26);
        java.lang.Class<?> wildcardClass28 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test00823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00823");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 100L, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 'a', user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (short) -1, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (short) 100, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) 100.0f, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay(0.0d, user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) 1, user26);
        java.lang.Class<?> wildcardClass28 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test00824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00824");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) (-1.0f), user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 100L, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (short) -1, user11);
        java.lang.Class<?> wildcardClass13 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00825");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) '#', user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) '4', user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 0, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (byte) 10, user14);
        java.lang.Class<?> wildcardClass16 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00826");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) (byte) 10, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 10L, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (short) 1, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) ' ', user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (byte) 0, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay(0.0d, user20);
        java.lang.Class<?> wildcardClass22 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test00827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00827");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) (byte) 10, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (byte) 1, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 0.0f, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) ' ', user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 100L, user17);
        java.lang.Class<?> wildcardClass19 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00828");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 0.0f, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (short) -1, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 1L, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (byte) 1, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (byte) 10, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) (-1.0f), user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) 100L, user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) (-1), user26);
        java.lang.Class<?> wildcardClass28 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test00829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00829");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 0.0f, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (short) -1, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (-1L), user11);
        java.lang.Class<?> wildcardClass13 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00830");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (-1.0f), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) (byte) 0, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (short) 0, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 100.0f, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (-1), user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 'a', user17);
        java.lang.Class<?> wildcardClass19 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00831");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((-1.0d), user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(0.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (short) 100, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 10.0f, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay(0.0d, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) 1.0f, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) 10, user23);
        java.lang.Class<?> wildcardClass25 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test00832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00832");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (-1.0f), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay(10.0d, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 0L, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) '4', user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 10.0f, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (byte) 1, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) 100, user20);
        java.lang.Class<?> wildcardClass22 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test00833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00833");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 10L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (byte) -1, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (byte) 1, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 0, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (byte) 100, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) ' ', user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) '4', user23);
        java.lang.Class<?> wildcardClass25 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test00834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00834");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 100L, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 'a', user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 'a', user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 10, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) 'a', user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) 10, user23);
        java.lang.Class<?> wildcardClass25 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test00835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00835");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((-1.0d), user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(0.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 'a', user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay(1.0d, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 10L, user17);
        java.lang.Class<?> wildcardClass19 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00836");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 10L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (byte) 100, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 10.0f, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (short) 0, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 10.0f, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) ' ', user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) '4', user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay(0.0d, user26);
        java.lang.Class<?> wildcardClass28 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test00837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00837");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (short) 1, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (byte) 0, user14);
        java.lang.Class<?> wildcardClass16 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00838");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 1L, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (short) 0, user14);
        java.lang.Class<?> wildcardClass16 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00839");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 10L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(0.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 1, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) '4', user14);
        java.lang.Class<?> wildcardClass16 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00840");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) (byte) 10, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (byte) 1, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (-1L), user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 0, user14);
        java.lang.Class<?> wildcardClass16 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00841");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay(0.0d, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 0.0f, user8);
        java.lang.Class<?> wildcardClass10 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00842");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 1, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay(100.0d, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (byte) 1, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 0, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) 10.0f, user20);
        java.lang.Class<?> wildcardClass22 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test00843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00843");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (short) -1, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 1, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (byte) 0, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) (short) 0, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) 0L, user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay(0.0d, user26);
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay((double) (short) 10, user29);
        model.User user32 = null;
        boolean boolean33 = creditCardPayment0.pay((double) '4', user32);
        model.User user35 = null;
        boolean boolean36 = creditCardPayment0.pay((double) 10L, user35);
        java.lang.Class<?> wildcardClass37 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test00844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00844");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay(0.0d, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 100, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 100L, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (byte) 0, user14);
        java.lang.Class<?> wildcardClass16 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00845");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay(0.0d, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (byte) -1, user8);
        java.lang.Class<?> wildcardClass10 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00846");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 10.0f, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 10L, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (byte) -1, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) '4', user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) '#', user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) (byte) -1, user26);
        java.lang.Class<?> wildcardClass28 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test00847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00847");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((-1.0d), user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (-1.0f), user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 1L, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 10, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 0L, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) '#', user20);
        java.lang.Class<?> wildcardClass22 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test00848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00848");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((-1.0d), user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(0.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (short) 100, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (byte) -1, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 10.0f, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) '4', user20);
        java.lang.Class<?> wildcardClass22 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test00849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00849");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 0.0f, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (short) -1, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 1L, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (byte) 1, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (byte) 10, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) 1L, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) 100, user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay(100.0d, user26);
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay((double) (-1.0f), user29);
        java.lang.Class<?> wildcardClass31 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test00850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00850");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 10L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(0.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 1, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (-1), user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (short) 0, user17);
        java.lang.Class<?> wildcardClass19 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00851");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 1, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) '4', user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 1L, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 1.0f, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) (byte) 100, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) (short) 0, user23);
        java.lang.Class<?> wildcardClass25 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test00852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00852");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((-1.0d), user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (-1.0f), user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 1L, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 10L, user14);
        java.lang.Class<?> wildcardClass16 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00853");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay(0.0d, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 0L, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 100, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((-1.0d), user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) 100.0f, user23);
        java.lang.Class<?> wildcardClass25 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test00854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00854");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay(0.0d, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) '#', user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (-1), user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) (short) 10, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) 100.0f, user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay(100.0d, user26);
        java.lang.Class<?> wildcardClass28 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test00855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00855");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay(0.0d, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 1L, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 10, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) '#', user20);
        java.lang.Class<?> wildcardClass22 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test00856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00856");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay(0.0d, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (short) 100, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 10.0f, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay(100.0d, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 100.0f, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) (byte) 1, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay(1.0d, user23);
        java.lang.Class<?> wildcardClass25 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test00857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00857");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) 0.0f, user2);
        java.lang.Class<?> wildcardClass4 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00858");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (byte) -1, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 0.0f, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 1.0f, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 10.0f, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay(0.0d, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) (byte) -1, user23);
        java.lang.Class<?> wildcardClass25 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test00859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00859");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 0.0f, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (short) -1, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (-1L), user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (short) 10, user14);
        java.lang.Class<?> wildcardClass16 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00860");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 10L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(0.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 1, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) '4', user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 1, user17);
        java.lang.Class<?> wildcardClass19 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00861");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) (byte) 10, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (byte) 100, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (byte) 100, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay(1.0d, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 100, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) (short) 10, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) 0.0f, user23);
        java.lang.Class<?> wildcardClass25 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test00862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00862");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((-1.0d), user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(0.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (short) 100, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 10.0f, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (byte) 100, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay(0.0d, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) (byte) 10, user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay(10.0d, user26);
        java.lang.Class<?> wildcardClass28 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test00863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00863");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (-1.0f), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) (byte) 0, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (byte) 10, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 100, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) '#', user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (short) 100, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) (-1.0f), user20);
        java.lang.Class<?> wildcardClass22 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test00864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00864");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 1, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay(100.0d, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (byte) -1, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (short) 100, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay(10.0d, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) (-1L), user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) '#', user26);
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay(100.0d, user29);
        model.User user32 = null;
        boolean boolean33 = creditCardPayment0.pay(100.0d, user32);
        java.lang.Class<?> wildcardClass34 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test00865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00865");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((-1.0d), user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(0.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay(0.0d, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 1, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay(100.0d, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((-1.0d), user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) 10.0f, user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) 0L, user26);
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay((double) (short) 10, user29);
        java.lang.Class<?> wildcardClass31 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test00866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00866");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 0.0f, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (short) -1, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 1L, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (byte) 1, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (short) 1, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) 10, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) (short) 0, user23);
        java.lang.Class<?> wildcardClass25 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test00867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00867");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 1, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) '4', user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay(1.0d, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (byte) 10, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) 10L, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) (short) 100, user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) (byte) 1, user26);
        java.lang.Class<?> wildcardClass28 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test00868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00868");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((-1.0d), user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(0.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (short) 100, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 10.0f, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (byte) -1, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) '4', user20);
        java.lang.Class<?> wildcardClass22 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test00869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00869");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay(0.0d, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (-1.0f), user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay(0.0d, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) (short) 1, user20);
        java.lang.Class<?> wildcardClass22 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test00870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00870");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 10L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (byte) -1, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay(100.0d, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) '#', user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (byte) 10, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) (byte) 0, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) 0, user23);
        java.lang.Class<?> wildcardClass25 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test00871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00871");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 1, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 100, user11);
        java.lang.Class<?> wildcardClass13 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00872");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (-1.0f), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay(10.0d, user5);
        java.lang.Class<?> wildcardClass7 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00873");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay(0.0d, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 100, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 1, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 0L, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (short) 0, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) (byte) 0, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) 100L, user23);
        java.lang.Class<?> wildcardClass25 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test00874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00874");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) (byte) 10, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 10L, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 10L, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 100L, user14);
        java.lang.Class<?> wildcardClass16 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00875");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) (short) 10, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (short) 10, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (-1), user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (byte) 1, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) '#', user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) ' ', user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) 10, user23);
        java.lang.Class<?> wildcardClass25 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test00876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00876");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 10L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(1.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay(1.0d, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((-1.0d), user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (byte) 0, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((-1.0d), user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) (-1L), user23);
        java.lang.Class<?> wildcardClass25 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test00877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00877");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((-1.0d), user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(0.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (short) 100, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 10.0f, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay(0.0d, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) 1.0f, user20);
        java.lang.Class<?> wildcardClass22 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test00878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00878");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) (byte) 10, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (byte) 1, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (-1L), user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((-1.0d), user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) ' ', user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) (byte) 10, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) (-1.0f), user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) 'a', user26);
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay((double) 'a', user29);
        java.lang.Class<?> wildcardClass31 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test00879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00879");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 1L, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (short) 0, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((-1.0d), user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) (byte) 100, user20);
        java.lang.Class<?> wildcardClass22 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test00880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00880");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((-1.0d), user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(0.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (short) 100, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 10.0f, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay(0.0d, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) (short) 10, user20);
        java.lang.Class<?> wildcardClass22 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test00881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00881");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay(0.0d, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) '#', user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (-1), user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay(0.0d, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) 100, user23);
        java.lang.Class<?> wildcardClass25 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test00882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00882");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) (-1L), user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 10, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (byte) 1, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (byte) -1, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (-1.0f), user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay(0.0d, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) (short) -1, user23);
        java.lang.Class<?> wildcardClass25 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test00883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00883");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 0.0f, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 0L, user11);
        java.lang.Class<?> wildcardClass13 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00884");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((-1.0d), user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(0.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (short) 100, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (byte) -1, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 10.0f, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay(0.0d, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay(0.0d, user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) '#', user26);
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay((double) (short) 1, user29);
        java.lang.Class<?> wildcardClass31 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test00885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00885");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) (byte) 10, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 10L, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 0L, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 100L, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (byte) -1, user17);
        java.lang.Class<?> wildcardClass19 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00886");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) ' ', user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) ' ', user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (byte) 1, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (byte) 100, user14);
        java.lang.Class<?> wildcardClass16 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00887");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((-1.0d), user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(0.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 'a', user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 100L, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) '4', user17);
        java.lang.Class<?> wildcardClass19 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00888");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 10L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (byte) -1, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (byte) 1, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 0, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (byte) 10, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) 0L, user20);
        java.lang.Class<?> wildcardClass22 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test00889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00889");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) '#', user8);
        java.lang.Class<?> wildcardClass10 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00890");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((-1.0d), user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 0, user11);
        java.lang.Class<?> wildcardClass13 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00891");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((-1.0d), user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 100, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (-1), user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 'a', user14);
        java.lang.Class<?> wildcardClass16 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00892");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) (byte) 10, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (byte) 1, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (-1L), user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((-1.0d), user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) ' ', user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) (byte) 10, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) (-1.0f), user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) 'a', user26);
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay(100.0d, user29);
        java.lang.Class<?> wildcardClass31 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test00893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00893");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (short) -1, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 1, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (byte) 0, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) (short) 0, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) 0L, user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay(0.0d, user26);
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay((double) (short) 10, user29);
        model.User user32 = null;
        boolean boolean33 = creditCardPayment0.pay((double) '4', user32);
        java.lang.Class<?> wildcardClass34 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test00894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00894");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) (-1L), user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 10, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (-1L), user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay(0.0d, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 100, user17);
        java.lang.Class<?> wildcardClass19 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00895");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 10L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 100, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) '#', user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (short) 1, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 1.0f, user17);
        java.lang.Class<?> wildcardClass19 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00896");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 0.0f, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 100.0f, user8);
        java.lang.Class<?> wildcardClass10 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00897");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) (byte) 10, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (byte) 1, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (-1L), user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (byte) 1, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay(0.0d, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) 0.0f, user20);
        java.lang.Class<?> wildcardClass22 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test00898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00898");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 0.0f, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 0L, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay(1.0d, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 100, user17);
        java.lang.Class<?> wildcardClass19 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00899");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay(0.0d, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (short) 100, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 10.0f, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay(100.0d, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 100.0f, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) 100.0f, user20);
        java.lang.Class<?> wildcardClass22 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test00900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00900");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 10L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (byte) -1, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (byte) 1, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 0, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (byte) 100, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) (short) 1, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay(0.0d, user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) (short) 100, user26);
        java.lang.Class<?> wildcardClass28 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test00901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00901");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((-1.0d), user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(0.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 'a', user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay(1.0d, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 10L, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) 100, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) ' ', user23);
        java.lang.Class<?> wildcardClass25 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test00902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00902");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 10L, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 1.0f, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 'a', user17);
        java.lang.Class<?> wildcardClass19 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00903");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay(0.0d, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (-1.0f), user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (byte) 100, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) 100, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) (-1.0f), user23);
        java.lang.Class<?> wildcardClass25 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test00904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00904");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 10L, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (short) 1, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay(0.0d, user17);
        java.lang.Class<?> wildcardClass19 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00905");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 100L, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 'a', user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay(10.0d, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (short) 0, user17);
        java.lang.Class<?> wildcardClass19 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00906");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (-1.0f), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay(10.0d, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((-1.0d), user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) '4', user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 1, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (-1L), user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) (byte) 1, user20);
        java.lang.Class<?> wildcardClass22 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test00907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00907");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (-1), user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (-1), user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (short) 100, user14);
        java.lang.Class<?> wildcardClass16 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00908");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 1, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay(100.0d, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay(100.0d, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 1.0f, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay(0.0d, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) (byte) 10, user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) 0, user26);
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay((double) 10L, user29);
        java.lang.Class<?> wildcardClass31 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test00909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00909");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (-1.0f), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay(10.0d, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 0L, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) '4', user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay(0.0d, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (-1), user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) (short) -1, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay(0.0d, user23);
        java.lang.Class<?> wildcardClass25 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test00910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00910");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 10L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 100L, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (byte) 10, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 100L, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (byte) 0, user17);
        java.lang.Class<?> wildcardClass19 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00911");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay(0.0d, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 10.0f, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay(100.0d, user11);
        java.lang.Class<?> wildcardClass13 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00912");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay(0.0d, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(1.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (-1.0f), user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay(10.0d, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (byte) 0, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) (-1L), user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) (-1L), user23);
        java.lang.Class<?> wildcardClass25 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test00913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00913");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 1, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) '4', user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 1L, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 1.0f, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) (byte) -1, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay(1.0d, user23);
        java.lang.Class<?> wildcardClass25 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test00914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00914");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay(0.0d, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (-1.0f), user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (byte) 1, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay(0.0d, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) (short) 10, user23);
        java.lang.Class<?> wildcardClass25 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test00915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00915");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay(0.0d, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 10.0f, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) '#', user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 100, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay(10.0d, user17);
        java.lang.Class<?> wildcardClass19 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00916");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 0.0f, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 0L, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay(1.0d, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 100, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay(1.0d, user20);
        java.lang.Class<?> wildcardClass22 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test00917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00917");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) (byte) 10, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 10L, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 0L, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 100L, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (byte) -1, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) (-1), user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) 1.0f, user23);
        java.lang.Class<?> wildcardClass25 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test00918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00918");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 10L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (byte) -1, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (byte) 1, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 0, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (short) 10, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) 100, user20);
        java.lang.Class<?> wildcardClass22 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test00919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00919");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 10L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(1.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay(1.0d, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((-1.0d), user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (byte) 0, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) 0.0f, user20);
        java.lang.Class<?> wildcardClass22 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test00920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00920");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (-1.0f), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay(10.0d, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 0L, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) '4', user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 10.0f, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 100L, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) 1, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) (short) 100, user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay(100.0d, user26);
        java.lang.Class<?> wildcardClass28 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test00921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00921");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 10L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(0.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 1, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 0.0f, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (byte) 0, user17);
        java.lang.Class<?> wildcardClass19 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00922");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 0.0f, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (short) -1, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (-1L), user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay(0.0d, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 100.0f, user17);
        java.lang.Class<?> wildcardClass19 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00923");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((-1.0d), user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(0.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (short) 100, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 10.0f, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay(0.0d, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) 100, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) 0L, user23);
        java.lang.Class<?> wildcardClass25 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test00924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00924");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 10L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (byte) -1, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (byte) 1, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 0, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (byte) 100, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) (short) 1, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay(0.0d, user23);
        java.lang.Class<?> wildcardClass25 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test00925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00925");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay(0.0d, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) '#', user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (-1), user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) (short) 10, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) (-1), user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) (-1L), user26);
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay((double) 10.0f, user29);
        java.lang.Class<?> wildcardClass31 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test00926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00926");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (-1.0f), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay(10.0d, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 0L, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 1.0f, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 10L, user14);
        java.lang.Class<?> wildcardClass16 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00927");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) '#', user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) '4', user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 0, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (-1L), user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 0.0f, user17);
        java.lang.Class<?> wildcardClass19 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00928");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) ' ', user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) ' ', user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (byte) 1, user11);
        java.lang.Class<?> wildcardClass13 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00929");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay(0.0d, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (short) 100, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 10.0f, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay(100.0d, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay(10.0d, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) '#', user20);
        java.lang.Class<?> wildcardClass22 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test00930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00930");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 0.0f, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (short) -1, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 1.0f, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 100, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 100, user17);
        java.lang.Class<?> wildcardClass19 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00931");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (-1), user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (-1L), user11);
        java.lang.Class<?> wildcardClass13 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00932");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((-1.0d), user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(0.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (short) 100, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 10.0f, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (byte) -1, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay(0.0d, user20);
        java.lang.Class<?> wildcardClass22 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test00933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00933");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((-1.0d), user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(0.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 'a', user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay(1.0d, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 10L, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) 100, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) ' ', user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) 1, user26);
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay((double) 1, user29);
        model.User user32 = null;
        boolean boolean33 = creditCardPayment0.pay((double) 'a', user32);
        java.lang.Class<?> wildcardClass34 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test00934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00934");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 1, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay(100.0d, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (byte) 1, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 0, user17);
        java.lang.Class<?> wildcardClass19 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00935");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) '#', user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 100.0f, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 100, user14);
        java.lang.Class<?> wildcardClass16 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00936");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) (byte) 10, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (byte) 1, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 0.0f, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) ' ', user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 100L, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) (short) 10, user20);
        java.lang.Class<?> wildcardClass22 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test00937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00937");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((-1.0d), user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(0.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 'a', user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay(1.0d, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 10L, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) (-1), user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) 10, user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) '#', user26);
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay((double) 'a', user29);
        model.User user32 = null;
        boolean boolean33 = creditCardPayment0.pay((double) (-1.0f), user32);
        model.User user35 = null;
        boolean boolean36 = creditCardPayment0.pay((double) 10, user35);
        java.lang.Class<?> wildcardClass37 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test00938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00938");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay(0.0d, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (short) 100, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 10.0f, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 0L, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay(0.0d, user17);
        java.lang.Class<?> wildcardClass19 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00939");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (short) 1, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 1L, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 1.0f, user17);
        java.lang.Class<?> wildcardClass19 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00940");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 100L, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay(100.0d, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 1L, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 10, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) (byte) 0, user20);
        java.lang.Class<?> wildcardClass22 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test00941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00941");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (short) -1, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 1, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (byte) 0, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) (short) 0, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) 0L, user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) 0, user26);
        java.lang.Class<?> wildcardClass28 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test00942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00942");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((-1.0d), user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(0.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (short) 100, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 1.0f, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay(0.0d, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) (byte) 1, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) 'a', user23);
        java.lang.Class<?> wildcardClass25 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test00943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00943");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) (byte) 10, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 10L, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 1.0f, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (byte) -1, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 0, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay(0.0d, user20);
        java.lang.Class<?> wildcardClass22 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test00944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00944");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) (byte) 10, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 10L, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 1.0f, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (byte) -1, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) ' ', user17);
        java.lang.Class<?> wildcardClass19 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00945");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 1, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) '4', user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 1.0f, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) '#', user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) (short) 1, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) 10, user23);
        java.lang.Class<?> wildcardClass25 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test00946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00946");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (-1), user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (-1), user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (-1), user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 1, user17);
        java.lang.Class<?> wildcardClass19 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00947");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((-1.0d), user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 100, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 'a', user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay(0.0d, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (-1.0f), user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) 10, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) (byte) 1, user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) 0.0f, user26);
        java.lang.Class<?> wildcardClass28 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test00948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00948");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (-1.0f), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay(10.0d, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 0L, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 1.0f, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (short) 1, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 0, user17);
        java.lang.Class<?> wildcardClass19 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00949");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 10L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (short) 0, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 10.0f, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 10L, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (short) -1, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) (byte) 1, user20);
        java.lang.Class<?> wildcardClass22 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test00950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00950");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (-1.0f), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) (byte) 0, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (short) 0, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 100.0f, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) '#', user14);
        java.lang.Class<?> wildcardClass16 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00951");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (-1.0f), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay(10.0d, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 0L, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) '4', user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 10.0f, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 100L, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay(100.0d, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) (-1), user23);
        java.lang.Class<?> wildcardClass25 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test00952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00952");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 100L, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 'a', user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 100, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) ' ', user17);
        java.lang.Class<?> wildcardClass19 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00953");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 1, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) '4', user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay(1.0d, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (byte) 10, user17);
        java.lang.Class<?> wildcardClass19 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00954");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 1, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay(100.0d, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (byte) 0, user14);
        java.lang.Class<?> wildcardClass16 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00955");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (short) -1, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 1, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 'a', user17);
        java.lang.Class<?> wildcardClass19 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00956");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 10L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (byte) 100, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 10.0f, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 0L, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((-1.0d), user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay(0.0d, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) (-1.0f), user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) (short) 10, user26);
        java.lang.Class<?> wildcardClass28 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test00957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00957");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 1, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay(100.0d, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay(100.0d, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 1.0f, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay(0.0d, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay(0.0d, user23);
        java.lang.Class<?> wildcardClass25 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test00958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00958");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) '#', user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 1L, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (short) 100, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 'a', user14);
        java.lang.Class<?> wildcardClass16 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00959");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 0.0f, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 0L, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay(0.0d, user14);
        java.lang.Class<?> wildcardClass16 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00960");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 1, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) '4', user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 1L, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 1.0f, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) (byte) -1, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) (short) 100, user23);
        java.lang.Class<?> wildcardClass25 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test00961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00961");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (-1.0f), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) (byte) 0, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (short) 0, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 100.0f, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (-1), user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (short) 100, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) 10L, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) (-1L), user23);
        java.lang.Class<?> wildcardClass25 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test00962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00962");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((-1.0d), user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(0.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (short) 100, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 10.0f, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay(0.0d, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) (short) 10, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) (short) 100, user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay(10.0d, user26);
        java.lang.Class<?> wildcardClass28 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test00963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00963");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (-1.0f), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay(10.0d, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 0L, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) '4', user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 10.0f, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 100L, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) 1, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) (short) 10, user23);
        java.lang.Class<?> wildcardClass25 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test00964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00964");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 100.0f, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(10.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 0, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (short) 1, user14);
        java.lang.Class<?> wildcardClass16 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00965");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 1, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay(100.0d, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (byte) -1, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (short) 100, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay(10.0d, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) (-1L), user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) 10L, user26);
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay((double) 100, user29);
        java.lang.Class<?> wildcardClass31 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test00966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00966");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) (-1L), user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 0L, user8);
        java.lang.Class<?> wildcardClass10 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00967");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 1, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 100L, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (short) 1, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay(1.0d, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) ' ', user20);
        java.lang.Class<?> wildcardClass22 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test00968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00968");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay(0.0d, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) '#', user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (-1L), user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) (byte) 10, user20);
        java.lang.Class<?> wildcardClass22 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test00969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00969");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((-1.0d), user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(0.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (short) 100, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (byte) -1, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 10.0f, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay(0.0d, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay(0.0d, user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) 0.0f, user26);
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay((double) (-1), user29);
        model.User user32 = null;
        boolean boolean33 = creditCardPayment0.pay((double) '#', user32);
        java.lang.Class<?> wildcardClass34 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test00970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00970");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (short) 100, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay(1.0d, user14);
        java.lang.Class<?> wildcardClass16 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00971");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (-1.0f), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) (byte) 0, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(10.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (short) -1, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (byte) 10, user14);
        java.lang.Class<?> wildcardClass16 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00972");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) ' ', user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(0.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 10L, user11);
        java.lang.Class<?> wildcardClass13 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00973");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) (byte) 10, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 10L, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 0L, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 100L, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (byte) -1, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) (-1), user20);
        java.lang.Class<?> wildcardClass22 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test00974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00974");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 100L, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay(100.0d, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (short) -1, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (short) 10, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) (short) 0, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay(10.0d, user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) (short) 10, user26);
        java.lang.Class<?> wildcardClass28 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test00975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00975");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((-1.0d), user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(0.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (short) 100, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (byte) -1, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 10.0f, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay(0.0d, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) 10.0f, user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) 100.0f, user26);
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay((double) 100.0f, user29);
        model.User user32 = null;
        boolean boolean33 = creditCardPayment0.pay((double) 10.0f, user32);
        java.lang.Class<?> wildcardClass34 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test00976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00976");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) (-1L), user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 10, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (-1L), user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 1.0f, user14);
        java.lang.Class<?> wildcardClass16 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00977");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay(0.0d, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 1L, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (short) 1, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) (short) -1, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) 100, user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) (byte) 1, user26);
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay(0.0d, user29);
        model.User user32 = null;
        boolean boolean33 = creditCardPayment0.pay((double) 10.0f, user32);
        model.User user35 = null;
        boolean boolean36 = creditCardPayment0.pay(0.0d, user35);
        java.lang.Class<?> wildcardClass37 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test00978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00978");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) (byte) 10, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 10L, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (short) 1, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay(0.0d, user14);
        java.lang.Class<?> wildcardClass16 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00979");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (-1.0f), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) (byte) 0, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(0.0d, user8);
        java.lang.Class<?> wildcardClass10 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00980");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((-1.0d), user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(0.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 'a', user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay(1.0d, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 10L, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) (-1), user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) '4', user23);
        java.lang.Class<?> wildcardClass25 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test00981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00981");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 10L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (byte) -1, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (byte) 1, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 0, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (short) 10, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) 1L, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) (-1.0f), user23);
        java.lang.Class<?> wildcardClass25 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test00982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00982");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) (short) 10, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (short) 10, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (-1), user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (byte) 1, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) '#', user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) (-1L), user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) (-1L), user23);
        java.lang.Class<?> wildcardClass25 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test00983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00983");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 1, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) '4', user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 1L, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 100L, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay(100.0d, user20);
        java.lang.Class<?> wildcardClass22 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test00984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00984");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 100L, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay(100.0d, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (short) -1, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (short) 10, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) (short) 0, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) (short) 100, user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) (byte) 10, user26);
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay((double) 0.0f, user29);
        model.User user32 = null;
        boolean boolean33 = creditCardPayment0.pay((double) 1, user32);
        model.User user35 = null;
        boolean boolean36 = creditCardPayment0.pay((double) 0.0f, user35);
        java.lang.Class<?> wildcardClass37 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test00985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00985");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) (-1.0f), user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (short) 10, user8);
        java.lang.Class<?> wildcardClass10 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00986");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 10L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (byte) -1, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (byte) 1, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 0, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (byte) 100, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) ' ', user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) '#', user23);
        java.lang.Class<?> wildcardClass25 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test00987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00987");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (-1.0f), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) (byte) 0, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (short) 0, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 0.0f, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 0L, user14);
        java.lang.Class<?> wildcardClass16 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00988");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 10L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(0.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 1, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay(10.0d, user14);
        java.lang.Class<?> wildcardClass16 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00989");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) '#', user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (short) -1, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 100, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 10, user14);
        java.lang.Class<?> wildcardClass16 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00990");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay(0.0d, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (short) 100, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 10.0f, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay(100.0d, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (short) 10, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) (-1), user20);
        java.lang.Class<?> wildcardClass22 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test00991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00991");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (-1), user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (-1), user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (-1), user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (byte) 0, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) (byte) 10, user20);
        java.lang.Class<?> wildcardClass22 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test00992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00992");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 100L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (-1L), user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((-1.0d), user11);
        java.lang.Class<?> wildcardClass13 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00993");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) (-1L), user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 10, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (-1L), user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 0.0f, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (-1L), user17);
        java.lang.Class<?> wildcardClass19 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00994");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay(0.0d, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (short) 100, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 10.0f, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 0L, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (byte) -1, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) (short) -1, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) (byte) 1, user23);
        java.lang.Class<?> wildcardClass25 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test00995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00995");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((-1.0d), user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(0.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay(0.0d, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 1L, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((-1.0d), user17);
        java.lang.Class<?> wildcardClass19 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00996");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 10L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(0.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 0.0f, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (-1.0f), user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) ' ', user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((-1.0d), user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) '4', user23);
        java.lang.Class<?> wildcardClass25 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test00997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00997");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((-1.0d), user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(0.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (short) 100, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (byte) -1, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((-1.0d), user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) 0.0f, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((-1.0d), user23);
        java.lang.Class<?> wildcardClass25 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test00998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00998");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 10L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (byte) -1, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (byte) 0, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay(10.0d, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay(1.0d, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) (byte) 10, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) (short) 0, user23);
        java.lang.Class<?> wildcardClass25 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test00999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00999");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) '#', user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (short) 100, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 'a', user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (-1), user17);
        java.lang.Class<?> wildcardClass19 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test01000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test01000");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 100L, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay(100.0d, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 1L, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay(0.0d, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((-1.0d), user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay(100.0d, user23);
        java.lang.Class<?> wildcardClass25 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }
}

