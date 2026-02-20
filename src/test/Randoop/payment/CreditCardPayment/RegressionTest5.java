import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest5 {

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
    public void test02501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02501");
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
        boolean boolean15 = creditCardPayment0.pay((double) (short) 0, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) ' ', user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) 0.0f, user20);
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
    public void test02502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02502");
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
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) (short) 1, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) (short) 1, user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) 'a', user26);
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
    public void test02503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02503");
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
        boolean boolean27 = creditCardPayment0.pay((double) 100, user26);
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay((double) (byte) -1, user29);
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
    public void test02504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02504");
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
    public void test02505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02505");
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
        boolean boolean18 = creditCardPayment0.pay((double) 1.0f, user17);
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
    public void test02506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02506");
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
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (short) -1, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) '#', user20);
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
    public void test02507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02507");
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
    public void test02508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02508");
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
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) 0, user20);
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
    public void test02509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02509");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) (short) 10, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) '#', user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (byte) 0, user11);
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
    public void test02510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02510");
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
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) (short) 1, user20);
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
    public void test02511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02511");
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
        boolean boolean18 = creditCardPayment0.pay((double) (short) 0, user17);
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
    public void test02512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02512");
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
        boolean boolean27 = creditCardPayment0.pay((double) (byte) 100, user26);
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay((double) 1L, user29);
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
    public void test02513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02513");
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
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay(100.0d, user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) (short) 100, user26);
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay((double) ' ', user29);
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
    public void test02514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02514");
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
    public void test02515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02515");
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
        boolean boolean24 = creditCardPayment0.pay((double) 1.0f, user23);
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
    public void test02516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02516");
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
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) (short) 0, user26);
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay((double) '4', user29);
        model.User user32 = null;
        boolean boolean33 = creditCardPayment0.pay(10.0d, user32);
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
    public void test02517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02517");
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
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) 100, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) 10.0f, user23);
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
    public void test02518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02518");
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
        boolean boolean18 = creditCardPayment0.pay((double) (-1L), user17);
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
    public void test02519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02519");
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
        boolean boolean18 = creditCardPayment0.pay((double) (-1.0f), user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) (byte) -1, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) (short) 1, user23);
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
    public void test02520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02520");
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
        boolean boolean18 = creditCardPayment0.pay((double) 'a', user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) 10L, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) 'a', user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay(10.0d, user26);
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay((double) 1L, user29);
        model.User user32 = null;
        boolean boolean33 = creditCardPayment0.pay((double) 100, user32);
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
    public void test02521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02521");
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
        boolean boolean18 = creditCardPayment0.pay(100.0d, user17);
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
    public void test02522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02522");
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
    public void test02523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02523");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 100L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (-1L), user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 'a', user11);
        java.lang.Class<?> wildcardClass13 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test02524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02524");
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
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) (short) 100, user26);
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
    public void test02525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02525");
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
    public void test02526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02526");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((-1.0d), user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (-1), user11);
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
    public void test02527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02527");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 0.0f, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (short) 0, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay(0.0d, user14);
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
    public void test02528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02528");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) '#', user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (short) 1, user8);
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
    public void test02529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02529");
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
        boolean boolean21 = creditCardPayment0.pay((double) 0.0f, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) 10L, user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) 1, user26);
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
    public void test02530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02530");
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
        boolean boolean24 = creditCardPayment0.pay(0.0d, user23);
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
    public void test02531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02531");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 100.0f, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(10.0d, user8);
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
    public void test02532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02532");
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
        boolean boolean24 = creditCardPayment0.pay(0.0d, user23);
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
    public void test02533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02533");
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
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay(10.0d, user29);
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
    public void test02534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02534");
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
        boolean boolean24 = creditCardPayment0.pay((double) 1, user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) 10.0f, user26);
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
    public void test02535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02535");
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
    public void test02536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02536");
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
        boolean boolean21 = creditCardPayment0.pay((double) 0.0f, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) 10L, user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) 1, user26);
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay((double) 10, user29);
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
    public void test02537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02537");
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
    public void test02538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02538");
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
        model.User user32 = null;
        boolean boolean33 = creditCardPayment0.pay((double) (short) 10, user32);
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
    public void test02539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02539");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) '#', user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (short) 1, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) '#', user11);
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
    public void test02540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02540");
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
        model.User user38 = null;
        boolean boolean39 = creditCardPayment0.pay((double) (byte) 1, user38);
        model.User user41 = null;
        boolean boolean42 = creditCardPayment0.pay((double) (short) -1, user41);
        java.lang.Class<?> wildcardClass43 = creditCardPayment0.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test02541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02541");
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
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (short) -1, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) '#', user20);
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
    public void test02542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02542");
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
    public void test02543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02543");
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
        boolean boolean21 = creditCardPayment0.pay((double) 0.0f, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((-1.0d), user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) 10.0f, user26);
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
    public void test02544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02544");
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
    public void test02545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02545");
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
    public void test02546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02546");
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
        boolean boolean15 = creditCardPayment0.pay((-1.0d), user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (-1.0f), user17);
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
    public void test02547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02547");
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
        boolean boolean15 = creditCardPayment0.pay((double) (-1.0f), user14);
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
    public void test02548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02548");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(0.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (short) 10, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (-1L), user14);
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
    public void test02549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02549");
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
    public void test02550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02550");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) ' ', user8);
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
    public void test02551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02551");
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
        model.User user35 = null;
        boolean boolean36 = creditCardPayment0.pay(0.0d, user35);
        model.User user38 = null;
        boolean boolean39 = creditCardPayment0.pay((double) 1, user38);
        model.User user41 = null;
        boolean boolean42 = creditCardPayment0.pay((double) 100.0f, user41);
        java.lang.Class<?> wildcardClass43 = creditCardPayment0.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test02552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02552");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (-1.0f), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) (byte) 100, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (byte) 10, user8);
        java.lang.Class<?> wildcardClass10 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test02553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02553");
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
        boolean boolean21 = creditCardPayment0.pay((double) 1, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) 100, user23);
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
    public void test02554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02554");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (-1.0f), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay(0.0d, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 100, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 1, user11);
        java.lang.Class<?> wildcardClass13 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test02555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02555");
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
        boolean boolean18 = creditCardPayment0.pay((double) (-1), user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) (-1L), user20);
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
    public void test02556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02556");
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
        boolean boolean15 = creditCardPayment0.pay((double) (-1), user14);
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
    public void test02557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02557");
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
        boolean boolean15 = creditCardPayment0.pay((double) 1.0f, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (short) 100, user17);
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
    public void test02558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02558");
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
    public void test02559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02559");
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
        boolean boolean24 = creditCardPayment0.pay((double) (short) 1, user23);
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
    public void test02560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02560");
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
        boolean boolean15 = creditCardPayment0.pay((double) '#', user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (short) 100, user17);
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
    public void test02561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02561");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) ' ', user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) ' ', user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (-1.0f), user11);
        java.lang.Class<?> wildcardClass13 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test02562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02562");
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
    public void test02563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02563");
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
    public void test02564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02564");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay(0.0d, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(1.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (short) -1, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (-1.0f), user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 1.0f, user17);
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
    public void test02565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02565");
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
        boolean boolean27 = creditCardPayment0.pay(0.0d, user26);
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay((double) (-1.0f), user29);
        model.User user32 = null;
        boolean boolean33 = creditCardPayment0.pay((double) (short) 10, user32);
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
    public void test02566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02566");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 100.0f, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(10.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) ' ', user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 1L, user14);
        java.lang.Class<?> wildcardClass16 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test02567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02567");
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
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) 10, user20);
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
    public void test02568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02568");
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
        boolean boolean18 = creditCardPayment0.pay((double) (byte) 100, user17);
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
    public void test02569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02569");
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
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) '4', user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay(100.0d, user26);
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay((double) (short) 100, user29);
        model.User user32 = null;
        boolean boolean33 = creditCardPayment0.pay(1.0d, user32);
        model.User user35 = null;
        boolean boolean36 = creditCardPayment0.pay((double) (-1), user35);
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
    public void test02570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02570");
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
        boolean boolean18 = creditCardPayment0.pay((double) (short) 100, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) '#', user20);
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
    public void test02571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02571");
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
        boolean boolean21 = creditCardPayment0.pay(100.0d, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((-1.0d), user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) (short) 0, user26);
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay(1.0d, user29);
        model.User user32 = null;
        boolean boolean33 = creditCardPayment0.pay((double) (byte) 100, user32);
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
    public void test02572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02572");
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
    public void test02573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02573");
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
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (short) -1, user17);
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
    public void test02574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02574");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((-1.0d), user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(0.0d, user8);
        java.lang.Class<?> wildcardClass10 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test02575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02575");
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
        boolean boolean18 = creditCardPayment0.pay((double) 100, user17);
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
    public void test02576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02576");
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
        boolean boolean15 = creditCardPayment0.pay((double) 1.0f, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (short) 100, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) 10.0f, user20);
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
    public void test02577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02577");
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
    public void test02578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02578");
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
        boolean boolean15 = creditCardPayment0.pay((double) 10, user14);
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
    public void test02579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02579");
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
    public void test02580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02580");
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
        boolean boolean18 = creditCardPayment0.pay((double) (short) -1, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) 100L, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) 1, user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) 10, user26);
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
    public void test02581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02581");
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
        boolean boolean18 = creditCardPayment0.pay((double) ' ', user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) (short) 1, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) 10.0f, user23);
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
    public void test02582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02582");
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
    public void test02583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02583");
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
    public void test02584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02584");
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
        boolean boolean15 = creditCardPayment0.pay((double) 100L, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 1L, user17);
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
    public void test02585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02585");
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
        boolean boolean15 = creditCardPayment0.pay((double) (short) 0, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((-1.0d), user17);
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
    public void test02586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02586");
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
        boolean boolean24 = creditCardPayment0.pay(0.0d, user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) (-1), user26);
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay((double) ' ', user29);
        model.User user32 = null;
        boolean boolean33 = creditCardPayment0.pay((-1.0d), user32);
        model.User user35 = null;
        boolean boolean36 = creditCardPayment0.pay((double) 1L, user35);
        model.User user38 = null;
        boolean boolean39 = creditCardPayment0.pay((double) 0.0f, user38);
        java.lang.Class<?> wildcardClass40 = creditCardPayment0.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test02587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02587");
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
        boolean boolean30 = creditCardPayment0.pay((double) '4', user29);
        model.User user32 = null;
        boolean boolean33 = creditCardPayment0.pay(1.0d, user32);
        model.User user35 = null;
        boolean boolean36 = creditCardPayment0.pay((double) 'a', user35);
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
    public void test02588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02588");
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
        boolean boolean21 = creditCardPayment0.pay((double) (-1L), user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) 1.0f, user23);
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
    public void test02589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02589");
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
        boolean boolean24 = creditCardPayment0.pay((double) (-1L), user23);
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
    public void test02590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02590");
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
        boolean boolean18 = creditCardPayment0.pay((double) 10.0f, user17);
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
    public void test02591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02591");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) '#', user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (short) 1, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) '#', user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 10.0f, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (byte) 100, user17);
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
    public void test02592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02592");
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
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay((double) (short) 0, user29);
        model.User user32 = null;
        boolean boolean33 = creditCardPayment0.pay((double) 10L, user32);
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
    public void test02593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02593");
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
    public void test02594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02594");
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
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) ' ', user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) 100L, user23);
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
    public void test02595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02595");
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
        boolean boolean15 = creditCardPayment0.pay((double) 1L, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) '4', user17);
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
    public void test02596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02596");
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
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) ' ', user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) 100.0f, user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) 10L, user26);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test02597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02597");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 100L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (-1L), user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((-1.0d), user11);
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
    public void test02598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02598");
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
    public void test02599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02599");
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
        boolean boolean21 = creditCardPayment0.pay(0.0d, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) (-1L), user23);
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
    public void test02600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02600");
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
    public void test02601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02601");
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
        boolean boolean24 = creditCardPayment0.pay(1.0d, user23);
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
    public void test02602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02602");
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
        boolean boolean15 = creditCardPayment0.pay((double) '4', user14);
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
    public void test02603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02603");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay(100.0d, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 100, user14);
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
    public void test02604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02604");
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
        boolean boolean27 = creditCardPayment0.pay((double) (byte) 10, user26);
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay((double) (short) 100, user29);
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
    }

    @Test
    public void test02605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02605");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 100L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (byte) 0, user8);
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
    public void test02606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02606");
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
        boolean boolean15 = creditCardPayment0.pay(10.0d, user14);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test02607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02607");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 100.0f, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(10.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) ' ', user11);
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
    public void test02608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02608");
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
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay((double) (short) 0, user29);
        model.User user32 = null;
        boolean boolean33 = creditCardPayment0.pay((double) 10L, user32);
        model.User user35 = null;
        boolean boolean36 = creditCardPayment0.pay((double) (-1), user35);
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
    public void test02609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02609");
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
        boolean boolean18 = creditCardPayment0.pay((double) 10L, user17);
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
    public void test02610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02610");
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
        boolean boolean15 = creditCardPayment0.pay((double) 10, user14);
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
    public void test02611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02611");
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
    public void test02612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02612");
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
        boolean boolean15 = creditCardPayment0.pay((double) (-1.0f), user14);
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
    public void test02613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02613");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 100.0f, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (byte) 100, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay(1.0d, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 0L, user14);
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
    public void test02614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02614");
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
    public void test02615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02615");
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
        boolean boolean18 = creditCardPayment0.pay((double) 1, user17);
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
    public void test02616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02616");
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
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) ' ', user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) 100.0f, user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) 0L, user26);
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
    public void test02617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02617");
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
    public void test02618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02618");
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
        boolean boolean21 = creditCardPayment0.pay((double) 10, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) 10L, user23);
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
    public void test02619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02619");
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
    public void test02620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02620");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 10L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (byte) 100, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (byte) 100, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 100L, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (short) -1, user17);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test02621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02621");
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
        boolean boolean21 = creditCardPayment0.pay(100.0d, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((-1.0d), user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) '4', user26);
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
    public void test02622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02622");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay(0.0d, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 0.0f, user8);
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
    public void test02623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02623");
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
    public void test02624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02624");
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
        boolean boolean15 = creditCardPayment0.pay((double) '4', user14);
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
    public void test02625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02625");
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
        boolean boolean15 = creditCardPayment0.pay((-1.0d), user14);
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
    public void test02626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02626");
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
    public void test02627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02627");
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
        boolean boolean18 = creditCardPayment0.pay((double) (byte) 0, user17);
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
    public void test02628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02628");
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
    public void test02629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02629");
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
        boolean boolean18 = creditCardPayment0.pay((double) (short) 0, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) (short) 10, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) (byte) 100, user23);
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
    public void test02630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02630");
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
        boolean boolean18 = creditCardPayment0.pay(1.0d, user17);
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
    public void test02631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02631");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 100L, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay(0.0d, user11);
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
    public void test02632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02632");
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
        boolean boolean21 = creditCardPayment0.pay((double) (short) 100, user20);
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
    public void test02633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02633");
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
    public void test02634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02634");
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
        boolean boolean15 = creditCardPayment0.pay((double) 10L, user14);
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
    public void test02635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02635");
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
        boolean boolean27 = creditCardPayment0.pay((double) 100, user26);
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay(10.0d, user29);
        model.User user32 = null;
        boolean boolean33 = creditCardPayment0.pay((double) ' ', user32);
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
    public void test02636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02636");
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
    public void test02637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02637");
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
        boolean boolean27 = creditCardPayment0.pay((double) (byte) 100, user26);
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay((double) 'a', user29);
        model.User user32 = null;
        boolean boolean33 = creditCardPayment0.pay(1.0d, user32);
        model.User user35 = null;
        boolean boolean36 = creditCardPayment0.pay((double) (byte) 10, user35);
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
    public void test02638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02638");
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
    public void test02639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02639");
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
        boolean boolean15 = creditCardPayment0.pay((double) (byte) 0, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 0, user17);
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
    public void test02640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02640");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) ' ', user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) ' ', user8);
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
    public void test02641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02641");
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
        boolean boolean27 = creditCardPayment0.pay((double) (short) 100, user26);
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay((double) 1.0f, user29);
        model.User user32 = null;
        boolean boolean33 = creditCardPayment0.pay((double) (short) 10, user32);
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
    public void test02642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02642");
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
    public void test02643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02643");
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
        boolean boolean15 = creditCardPayment0.pay((double) 100, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 1, user17);
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
    public void test02644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02644");
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
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) '#', user26);
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
    public void test02645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02645");
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
    public void test02646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02646");
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
    public void test02647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02647");
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
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay((double) '#', user29);
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
    public void test02648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02648");
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
    public void test02649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02649");
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
    public void test02650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02650");
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
        boolean boolean18 = creditCardPayment0.pay((double) '#', user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) (byte) -1, user20);
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
    public void test02651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02651");
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
        boolean boolean15 = creditCardPayment0.pay((double) 0.0f, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 1L, user17);
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
    public void test02652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02652");
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
    public void test02653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02653");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 100L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (-1L), user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (short) 1, user11);
        java.lang.Class<?> wildcardClass13 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test02654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02654");
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
        boolean boolean15 = creditCardPayment0.pay(1.0d, user14);
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
    public void test02655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02655");
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
        boolean boolean24 = creditCardPayment0.pay((double) (byte) 1, user23);
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
    public void test02656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02656");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) (short) 10, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (byte) 0, user8);
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
    public void test02657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02657");
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
        boolean boolean18 = creditCardPayment0.pay((double) (byte) -1, user17);
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
    public void test02658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02658");
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
        boolean boolean15 = creditCardPayment0.pay((double) (short) 100, user14);
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
    public void test02659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02659");
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
    public void test02660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02660");
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
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) 1L, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) 1L, user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) 100.0f, user26);
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay((double) 0L, user29);
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
    public void test02661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02661");
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
        boolean boolean15 = creditCardPayment0.pay(1.0d, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (-1.0f), user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) (byte) -1, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) 100L, user23);
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
    public void test02662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02662");
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
        boolean boolean18 = creditCardPayment0.pay((double) '#', user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) '#', user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) (-1), user23);
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
    public void test02663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02663");
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
    public void test02664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02664");
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
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) '4', user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay(100.0d, user26);
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay((double) (short) 100, user29);
        model.User user32 = null;
        boolean boolean33 = creditCardPayment0.pay((double) (byte) 100, user32);
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
    public void test02665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02665");
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
        boolean boolean24 = creditCardPayment0.pay((double) (short) 1, user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) (byte) 0, user26);
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
    public void test02666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02666");
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
        boolean boolean15 = creditCardPayment0.pay((double) (byte) 0, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 0, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) 'a', user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) 1.0f, user23);
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
    public void test02667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02667");
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
        boolean boolean24 = creditCardPayment0.pay(0.0d, user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) '#', user26);
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay(1.0d, user29);
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
    public void test02668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02668");
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
    public void test02669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02669");
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
        boolean boolean18 = creditCardPayment0.pay((double) (-1), user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay(0.0d, user20);
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
    public void test02670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02670");
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
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) '4', user26);
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
    public void test02671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02671");
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
        boolean boolean33 = creditCardPayment0.pay((double) (-1), user32);
        model.User user35 = null;
        boolean boolean36 = creditCardPayment0.pay((double) 10.0f, user35);
        model.User user38 = null;
        boolean boolean39 = creditCardPayment0.pay(0.0d, user38);
        java.lang.Class<?> wildcardClass40 = creditCardPayment0.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test02672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02672");
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
        boolean boolean21 = creditCardPayment0.pay((double) '4', user20);
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
    public void test02673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02673");
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
        boolean boolean18 = creditCardPayment0.pay((double) 10, user17);
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
    public void test02674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02674");
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
        boolean boolean30 = creditCardPayment0.pay((double) 100.0f, user29);
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
    public void test02675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02675");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 0.0f, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (short) 0, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (-1), user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 0L, user17);
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
    public void test02676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02676");
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
        boolean boolean21 = creditCardPayment0.pay(1.0d, user20);
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
    public void test02677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02677");
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
        boolean boolean18 = creditCardPayment0.pay((double) 10.0f, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) 10.0f, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay(0.0d, user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) 1.0f, user26);
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
    public void test02678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02678");
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
        boolean boolean15 = creditCardPayment0.pay((double) 0, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay(1.0d, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) (byte) -1, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) 0, user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) 10, user26);
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay((double) 10, user29);
        model.User user32 = null;
        boolean boolean33 = creditCardPayment0.pay((double) (short) 1, user32);
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
    public void test02679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02679");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((-1.0d), user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 0, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (byte) 1, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 10, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) 0.0f, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((-1.0d), user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay(10.0d, user26);
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay(0.0d, user29);
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
    public void test02680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02680");
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
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (short) 100, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) (byte) -1, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay(0.0d, user23);
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
    public void test02681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02681");
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
        boolean boolean18 = creditCardPayment0.pay((double) (byte) -1, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) ' ', user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) (byte) 10, user23);
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
    public void test02682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02682");
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
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) 0, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) (-1), user23);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test02683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02683");
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
        model.User user35 = null;
        boolean boolean36 = creditCardPayment0.pay((double) 1L, user35);
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
    public void test02684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02684");
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
        boolean boolean15 = creditCardPayment0.pay((double) (byte) 0, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay(1.0d, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) (short) -1, user20);
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
    public void test02685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02685");
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
        boolean boolean18 = creditCardPayment0.pay(100.0d, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay(100.0d, user20);
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
    public void test02686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02686");
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
        boolean boolean18 = creditCardPayment0.pay((double) 1.0f, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) (-1), user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) 100.0f, user23);
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
    public void test02687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02687");
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
    public void test02688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02688");
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
        boolean boolean15 = creditCardPayment0.pay((double) 10, user14);
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
    public void test02689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02689");
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
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) (short) 100, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) 100, user23);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test02690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02690");
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
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay((double) (short) 1, user29);
        model.User user32 = null;
        boolean boolean33 = creditCardPayment0.pay(1.0d, user32);
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
    public void test02691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02691");
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
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((-1.0d), user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) (byte) 0, user23);
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
    public void test02692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02692");
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
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay((-1.0d), user29);
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
    public void test02693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02693");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 0.0f, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (short) -1, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((-1.0d), user14);
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
    public void test02694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02694");
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
    public void test02695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02695");
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
    public void test02696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02696");
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
        boolean boolean30 = creditCardPayment0.pay((double) (short) 0, user29);
        model.User user32 = null;
        boolean boolean33 = creditCardPayment0.pay((double) 10L, user32);
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
    public void test02697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02697");
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
    public void test02698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02698");
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
        boolean boolean18 = creditCardPayment0.pay((double) 10L, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) (byte) 100, user20);
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
    public void test02699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02699");
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
        boolean boolean21 = creditCardPayment0.pay((double) (-1L), user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) (byte) 0, user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay(1.0d, user26);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test02700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02700");
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
        boolean boolean18 = creditCardPayment0.pay((double) '4', user17);
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
    public void test02701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02701");
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
        boolean boolean21 = creditCardPayment0.pay((double) (short) 100, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) (byte) 0, user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) 0, user26);
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay((double) 100L, user29);
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
    }

    @Test
    public void test02702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02702");
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
    public void test02703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02703");
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
    public void test02704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02704");
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
        boolean boolean18 = creditCardPayment0.pay((double) 'a', user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) 10L, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) (byte) -1, user23);
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
    public void test02705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02705");
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
        boolean boolean27 = creditCardPayment0.pay((double) 100, user26);
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay((double) (short) 100, user29);
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
    public void test02706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02706");
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
        boolean boolean15 = creditCardPayment0.pay((double) (byte) 10, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (short) -1, user17);
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
    public void test02707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02707");
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
        model.User user32 = null;
        boolean boolean33 = creditCardPayment0.pay((double) 100.0f, user32);
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
    }

    @Test
    public void test02708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02708");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) (short) 10, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(0.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay(0.0d, user11);
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
    public void test02709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02709");
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
        boolean boolean21 = creditCardPayment0.pay((double) (byte) 1, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) 10.0f, user23);
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
    public void test02710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02710");
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
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (short) 100, user17);
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
    public void test02711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02711");
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
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) (short) 0, user20);
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
    public void test02712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02712");
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
    public void test02713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02713");
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
    public void test02714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02714");
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
        boolean boolean21 = creditCardPayment0.pay((double) 100L, user20);
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
    public void test02715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02715");
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
    public void test02716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02716");
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
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) (short) 0, user26);
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay((double) '4', user29);
        model.User user32 = null;
        boolean boolean33 = creditCardPayment0.pay((double) 100.0f, user32);
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
    public void test02717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02717");
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
    public void test02718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02718");
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
        boolean boolean18 = creditCardPayment0.pay((double) 0.0f, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) 'a', user20);
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
    public void test02719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02719");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 0.0f, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (byte) -1, user8);
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
    public void test02720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02720");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 100.0f, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (byte) 100, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay(1.0d, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay(0.0d, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 0.0f, user17);
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
    public void test02721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02721");
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
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) 100.0f, user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) (byte) -1, user26);
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay(0.0d, user29);
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
    public void test02722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02722");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((-1.0d), user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (short) 100, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (short) 10, user11);
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
    public void test02723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02723");
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
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay((double) '4', user29);
        model.User user32 = null;
        boolean boolean33 = creditCardPayment0.pay((double) (byte) 1, user32);
        model.User user35 = null;
        boolean boolean36 = creditCardPayment0.pay((double) '4', user35);
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
    public void test02724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02724");
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
        boolean boolean27 = creditCardPayment0.pay((double) 1.0f, user26);
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay(0.0d, user29);
        model.User user32 = null;
        boolean boolean33 = creditCardPayment0.pay((double) 1.0f, user32);
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
    public void test02725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02725");
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
    public void test02726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02726");
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
        boolean boolean27 = creditCardPayment0.pay(0.0d, user26);
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay((double) (short) -1, user29);
        model.User user32 = null;
        boolean boolean33 = creditCardPayment0.pay((double) (byte) 0, user32);
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
    public void test02727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02727");
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
        boolean boolean18 = creditCardPayment0.pay(1.0d, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) 0L, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) 100.0f, user23);
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
    public void test02728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02728");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay(0.0d, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(1.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (short) -1, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (-1.0f), user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 100L, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) 100L, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) (byte) 100, user23);
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
    public void test02729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02729");
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
    public void test02730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02730");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) '#', user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (short) 1, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) '#', user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 10.0f, user14);
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
    public void test02731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02731");
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
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) ' ', user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) 1, user23);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test02732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02732");
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
        model.User user32 = null;
        boolean boolean33 = creditCardPayment0.pay((double) (byte) 10, user32);
        model.User user35 = null;
        boolean boolean36 = creditCardPayment0.pay((double) (-1.0f), user35);
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
    public void test02733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02733");
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
        boolean boolean18 = creditCardPayment0.pay((double) 0.0f, user17);
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
    public void test02734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02734");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) 1, user2);
        java.lang.Class<?> wildcardClass4 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test02735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02735");
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
    public void test02736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02736");
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
        boolean boolean18 = creditCardPayment0.pay((double) 100L, user17);
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
    public void test02737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02737");
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
    public void test02738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02738");
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
    public void test02739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02739");
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
        boolean boolean21 = creditCardPayment0.pay(1.0d, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) (short) 1, user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) (-1), user26);
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay((double) '#', user29);
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
    public void test02740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02740");
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
        boolean boolean24 = creditCardPayment0.pay((double) 1L, user23);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test02741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02741");
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
    public void test02742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02742");
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
        boolean boolean15 = creditCardPayment0.pay((double) ' ', user14);
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
    public void test02743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02743");
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
        boolean boolean15 = creditCardPayment0.pay((double) '4', user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 100L, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay(1.0d, user20);
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
    public void test02744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02744");
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
    public void test02745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02745");
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
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (byte) 1, user17);
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
    public void test02746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02746");
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
        boolean boolean24 = creditCardPayment0.pay((double) (short) 0, user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((-1.0d), user26);
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
    public void test02747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02747");
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
    public void test02748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02748");
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
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) (short) 100, user23);
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
    public void test02749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02749");
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
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay(0.0d, user26);
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay((double) 'a', user29);
        model.User user32 = null;
        boolean boolean33 = creditCardPayment0.pay((double) 100L, user32);
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
    public void test02750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02750");
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
    public void test02751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02751");
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
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) ' ', user26);
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay((double) 0L, user29);
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
    }

    @Test
    public void test02752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02752");
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
        boolean boolean15 = creditCardPayment0.pay((double) 1L, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 1, user17);
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
    public void test02753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02753");
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
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay((double) (short) 1, user29);
        model.User user32 = null;
        boolean boolean33 = creditCardPayment0.pay((double) 1L, user32);
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
    public void test02754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02754");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 0.0f, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(100.0d, user8);
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
    public void test02755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02755");
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
        boolean boolean15 = creditCardPayment0.pay((double) (byte) 0, user14);
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
    public void test02756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02756");
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
        boolean boolean15 = creditCardPayment0.pay((double) (short) 1, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 1L, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) 10, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) (byte) 100, user23);
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
    public void test02757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02757");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
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
    public void test02758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02758");
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
        boolean boolean18 = creditCardPayment0.pay((double) 10.0f, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay(0.0d, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) 100, user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) 10, user26);
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
    public void test02759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02759");
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
        boolean boolean21 = creditCardPayment0.pay((double) '4', user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) (byte) 10, user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) '#', user26);
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay((double) '4', user29);
        model.User user32 = null;
        boolean boolean33 = creditCardPayment0.pay((double) 100.0f, user32);
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
    public void test02760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02760");
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
        boolean boolean15 = creditCardPayment0.pay((double) 1L, user14);
        java.lang.Class<?> wildcardClass16 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test02761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02761");
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
        model.User user38 = null;
        boolean boolean39 = creditCardPayment0.pay((double) (byte) 1, user38);
        model.User user41 = null;
        boolean boolean42 = creditCardPayment0.pay((double) 100.0f, user41);
        java.lang.Class<?> wildcardClass43 = creditCardPayment0.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test02762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02762");
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
    public void test02763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02763");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 0.0f, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (-1.0f), user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) ' ', user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (short) -1, user14);
        java.lang.Class<?> wildcardClass16 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test02764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02764");
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
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay((double) 0.0f, user29);
        model.User user32 = null;
        boolean boolean33 = creditCardPayment0.pay(1.0d, user32);
        model.User user35 = null;
        boolean boolean36 = creditCardPayment0.pay((double) (short) 100, user35);
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
    public void test02765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02765");
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
    public void test02766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02766");
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
        boolean boolean27 = creditCardPayment0.pay((double) 10, user26);
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay(0.0d, user29);
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
    public void test02767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02767");
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
    public void test02768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02768");
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
        boolean boolean24 = creditCardPayment0.pay((double) (short) 0, user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) 10.0f, user26);
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
    public void test02769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02769");
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
        boolean boolean18 = creditCardPayment0.pay((-1.0d), user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) (short) 1, user20);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test02770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02770");
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
        boolean boolean15 = creditCardPayment0.pay((double) (short) -1, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (-1), user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) '4', user20);
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
    public void test02771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02771");
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
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay(100.0d, user23);
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
    public void test02772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02772");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 1, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (-1), user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 100, user14);
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
    public void test02773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02773");
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
        boolean boolean15 = creditCardPayment0.pay((double) (short) -1, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (-1), user17);
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
    public void test02774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02774");
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
    public void test02775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02775");
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
        model.User user35 = null;
        boolean boolean36 = creditCardPayment0.pay((double) 100L, user35);
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
    public void test02776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02776");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 10L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (byte) -1, user8);
        java.lang.Class<?> wildcardClass10 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test02777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02777");
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
        boolean boolean15 = creditCardPayment0.pay((double) 10.0f, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (-1L), user17);
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
    public void test02778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02778");
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
    public void test02779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02779");
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
        boolean boolean15 = creditCardPayment0.pay((double) 0, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay(1.0d, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) (byte) -1, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) 0, user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) 10, user26);
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay(0.0d, user29);
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
    public void test02780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02780");
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
    public void test02781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02781");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) '#', user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay(10.0d, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (short) -1, user14);
        java.lang.Class<?> wildcardClass16 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test02782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02782");
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
    public void test02783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02783");
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
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) 1.0f, user26);
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
    public void test02784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02784");
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
    public void test02785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02785");
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
    public void test02786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02786");
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
        model.User user35 = null;
        boolean boolean36 = creditCardPayment0.pay((double) (short) 1, user35);
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
    public void test02787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02787");
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
        boolean boolean15 = creditCardPayment0.pay((double) '4', user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 100L, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((-1.0d), user20);
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
    public void test02788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02788");
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
        model.User user32 = null;
        boolean boolean33 = creditCardPayment0.pay((double) (short) 100, user32);
        model.User user35 = null;
        boolean boolean36 = creditCardPayment0.pay((double) 100L, user35);
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
    public void test02789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02789");
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
        model.User user38 = null;
        boolean boolean39 = creditCardPayment0.pay((double) 1L, user38);
        model.User user41 = null;
        boolean boolean42 = creditCardPayment0.pay((double) 100, user41);
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
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
    }

    @Test
    public void test02790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02790");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 'a', user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (byte) -1, user11);
        java.lang.Class<?> wildcardClass13 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test02791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02791");
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
    public void test02792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02792");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 100.0f, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (byte) 10, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (byte) 0, user11);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test02793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02793");
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
        boolean boolean30 = creditCardPayment0.pay((double) 100L, user29);
        model.User user32 = null;
        boolean boolean33 = creditCardPayment0.pay((double) 100.0f, user32);
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
    public void test02794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02794");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay(0.0d, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 0.0f, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay(0.0d, user11);
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
    public void test02795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02795");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay(0.0d, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 10.0f, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (byte) 10, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) '#', user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 100, user17);
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
    public void test02796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02796");
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
        model.User user35 = null;
        boolean boolean36 = creditCardPayment0.pay((double) (short) 10, user35);
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
    public void test02797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02797");
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
        boolean boolean15 = creditCardPayment0.pay((double) 0.0f, user14);
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
    public void test02798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02798");
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
        boolean boolean24 = creditCardPayment0.pay(0.0d, user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) (-1), user26);
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay((double) ' ', user29);
        model.User user32 = null;
        boolean boolean33 = creditCardPayment0.pay((-1.0d), user32);
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
    public void test02799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02799");
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
    public void test02800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02800");
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
    public void test02801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02801");
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
        boolean boolean15 = creditCardPayment0.pay((double) 0, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay(1.0d, user17);
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
    public void test02802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02802");
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
        boolean boolean18 = creditCardPayment0.pay((double) 0L, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) '#', user20);
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
    public void test02803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02803");
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
        boolean boolean27 = creditCardPayment0.pay((double) (byte) 100, user26);
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay((double) 'a', user29);
        model.User user32 = null;
        boolean boolean33 = creditCardPayment0.pay(1.0d, user32);
        model.User user35 = null;
        boolean boolean36 = creditCardPayment0.pay((double) (byte) 100, user35);
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
    public void test02804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02804");
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
    public void test02805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02805");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 1, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (-1), user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((-1.0d), user14);
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
    public void test02806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02806");
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
    public void test02807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02807");
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
        boolean boolean15 = creditCardPayment0.pay((double) '#', user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (short) 100, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) 100, user20);
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
    public void test02808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02808");
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
        boolean boolean24 = creditCardPayment0.pay((double) ' ', user23);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test02809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02809");
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
        boolean boolean18 = creditCardPayment0.pay((double) (short) 1, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) 0, user20);
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
    public void test02810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02810");
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
        boolean boolean21 = creditCardPayment0.pay((double) (byte) 0, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) '#', user23);
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
    public void test02811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02811");
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
        boolean boolean15 = creditCardPayment0.pay((double) (short) 0, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay(1.0d, user17);
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
    public void test02812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02812");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay(100.0d, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 100, user14);
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
    public void test02813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02813");
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
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) '#', user26);
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay((double) 'a', user29);
        model.User user32 = null;
        boolean boolean33 = creditCardPayment0.pay(100.0d, user32);
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
    }

    @Test
    public void test02814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02814");
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
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) 'a', user23);
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
    public void test02815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02815");
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
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) (short) 1, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay(100.0d, user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay(10.0d, user26);
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay(0.0d, user29);
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
    public void test02816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02816");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (-1.0f), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) (byte) 100, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (byte) 10, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 1.0f, user11);
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
    public void test02817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02817");
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
    public void test02818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02818");
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
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) 100L, user20);
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
    public void test02819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02819");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay(0.0d, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 0.0f, user8);
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
    public void test02820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02820");
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
        boolean boolean24 = creditCardPayment0.pay((double) 100.0f, user23);
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
    public void test02821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02821");
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
    public void test02822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02822");
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
        boolean boolean18 = creditCardPayment0.pay((double) 100L, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay(10.0d, user20);
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
    public void test02823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02823");
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
        boolean boolean18 = creditCardPayment0.pay((double) 0.0f, user17);
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
    public void test02824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02824");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) ' ', user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) ' ', user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 100, user11);
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
    public void test02825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02825");
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
        boolean boolean21 = creditCardPayment0.pay((double) 1, user20);
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
    public void test02826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02826");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((-1.0d), user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 0L, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (-1L), user14);
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
    public void test02827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02827");
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
    public void test02828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02828");
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
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (short) -1, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) '#', user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) (byte) 0, user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) 0, user26);
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
    public void test02829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02829");
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
        boolean boolean18 = creditCardPayment0.pay((double) 'a', user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) 10L, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) 'a', user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) 'a', user26);
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay((double) (short) 0, user29);
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
    public void test02830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02830");
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
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) 1L, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) 1L, user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) 'a', user26);
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
    public void test02831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02831");
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
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) 1.0f, user26);
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
    public void test02832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02832");
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
    public void test02833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02833");
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
        boolean boolean15 = creditCardPayment0.pay((double) (-1.0f), user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 1.0f, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) (short) 100, user20);
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
    public void test02834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02834");
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
        boolean boolean18 = creditCardPayment0.pay(1.0d, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay(10.0d, user20);
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
    public void test02835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02835");
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
        boolean boolean21 = creditCardPayment0.pay((double) (byte) 100, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) (short) 10, user23);
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
    public void test02836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02836");
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
    public void test02837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02837");
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
        boolean boolean15 = creditCardPayment0.pay((double) '#', user14);
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
    public void test02838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02838");
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
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((-1.0d), user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) (byte) 0, user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) (short) 0, user26);
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
    public void test02839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02839");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 'a', user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (short) 10, user14);
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
    public void test02840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02840");
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
        boolean boolean18 = creditCardPayment0.pay(1.0d, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) 0L, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) 100.0f, user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay(10.0d, user26);
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay((double) 1.0f, user29);
        model.User user32 = null;
        boolean boolean33 = creditCardPayment0.pay((double) (byte) 10, user32);
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
    }

    @Test
    public void test02841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02841");
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
        boolean boolean18 = creditCardPayment0.pay((double) 0L, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) (short) 0, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) (byte) 100, user23);
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
    public void test02842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02842");
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
    public void test02843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02843");
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
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay(10.0d, user20);
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
    public void test02844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02844");
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
    public void test02845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02845");
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
        boolean boolean21 = creditCardPayment0.pay(0.0d, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) (-1), user23);
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
    public void test02846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02846");
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
        boolean boolean21 = creditCardPayment0.pay((double) 0.0f, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) (byte) 100, user23);
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
    public void test02847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02847");
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
    public void test02848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02848");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 100.0f, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((-1.0d), user8);
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
    public void test02849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02849");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) (-1.0f), user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (short) 10, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 0.0f, user11);
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
    public void test02850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02850");
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
    public void test02851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02851");
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
        boolean boolean15 = creditCardPayment0.pay((double) (short) 0, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (short) 1, user17);
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
    public void test02852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02852");
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
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) 0, user26);
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
    public void test02853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02853");
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
        boolean boolean27 = creditCardPayment0.pay((-1.0d), user26);
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay((double) (-1.0f), user29);
        model.User user32 = null;
        boolean boolean33 = creditCardPayment0.pay((double) (short) 1, user32);
        model.User user35 = null;
        boolean boolean36 = creditCardPayment0.pay((double) (short) -1, user35);
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
    }

    @Test
    public void test02854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02854");
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
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) 10.0f, user26);
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay(0.0d, user29);
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
    public void test02855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02855");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay(0.0d, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 0.0f, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (byte) 0, user11);
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
    public void test02856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02856");
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
        boolean boolean15 = creditCardPayment0.pay((double) (-1.0f), user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 1.0f, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) 100L, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) 0L, user23);
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
    public void test02857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02857");
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
        boolean boolean21 = creditCardPayment0.pay((double) 'a', user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) (byte) -1, user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((-1.0d), user26);
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay(1.0d, user29);
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
    public void test02858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02858");
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
        boolean boolean24 = creditCardPayment0.pay((double) 1, user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) 0L, user26);
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay((-1.0d), user29);
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
    public void test02859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02859");
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
        boolean boolean18 = creditCardPayment0.pay((double) '4', user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) (-1L), user20);
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
    public void test02860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02860");
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
        boolean boolean24 = creditCardPayment0.pay((double) (-1L), user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) 0, user26);
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay((double) 100L, user29);
        model.User user32 = null;
        boolean boolean33 = creditCardPayment0.pay((double) 1, user32);
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
    public void test02861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02861");
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
        boolean boolean15 = creditCardPayment0.pay((double) 100.0f, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 10.0f, user17);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test02862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02862");
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
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (-1), user17);
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
    public void test02863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02863");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (short) -1, user8);
        java.lang.Class<?> wildcardClass10 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test02864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02864");
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
        boolean boolean27 = creditCardPayment0.pay((double) (-1.0f), user26);
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay((double) (-1), user29);
        model.User user32 = null;
        boolean boolean33 = creditCardPayment0.pay((double) ' ', user32);
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
    public void test02865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02865");
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
        boolean boolean18 = creditCardPayment0.pay((double) (short) 0, user17);
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
    public void test02866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02866");
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
    public void test02867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02867");
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
        boolean boolean21 = creditCardPayment0.pay((double) 'a', user20);
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
    public void test02868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02868");
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
        boolean boolean18 = creditCardPayment0.pay((double) (byte) -1, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) ' ', user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay(0.0d, user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) 0L, user26);
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
    public void test02869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02869");
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
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay(0.0d, user26);
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay((double) (byte) 1, user29);
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
    public void test02870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02870");
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
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 10, user17);
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
    public void test02871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02871");
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
        model.User user32 = null;
        boolean boolean33 = creditCardPayment0.pay((double) (short) 100, user32);
        model.User user35 = null;
        boolean boolean36 = creditCardPayment0.pay((double) (byte) 10, user35);
        model.User user38 = null;
        boolean boolean39 = creditCardPayment0.pay((double) 0L, user38);
        model.User user41 = null;
        boolean boolean42 = creditCardPayment0.pay((double) 0.0f, user41);
        java.lang.Class<?> wildcardClass43 = creditCardPayment0.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test02872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02872");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 100.0f, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (byte) 0, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (byte) 10, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (short) -1, user14);
        java.lang.Class<?> wildcardClass16 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test02873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02873");
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
        boolean boolean18 = creditCardPayment0.pay(10.0d, user17);
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
    public void test02874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02874");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (-1.0f), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) (byte) 100, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (short) 1, user8);
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
    public void test02875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02875");
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
    public void test02876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02876");
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
    public void test02877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02877");
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
        boolean boolean18 = creditCardPayment0.pay((double) ' ', user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) (short) 1, user20);
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
    public void test02878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02878");
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
        boolean boolean18 = creditCardPayment0.pay((double) (-1), user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay(0.0d, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) (byte) -1, user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) (short) 0, user26);
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
    public void test02879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02879");
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
    public void test02880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02880");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (-1), user8);
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
    public void test02881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02881");
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
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) (short) 100, user26);
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay(0.0d, user29);
        model.User user32 = null;
        boolean boolean33 = creditCardPayment0.pay((double) (short) 0, user32);
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
    public void test02882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02882");
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
    public void test02883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02883");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (-1), user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) '#', user11);
        java.lang.Class<?> wildcardClass13 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test02884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02884");
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
        boolean boolean15 = creditCardPayment0.pay((double) (byte) 0, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (short) 100, user17);
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
    public void test02885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02885");
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
    public void test02886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02886");
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
        boolean boolean21 = creditCardPayment0.pay((double) (byte) 0, user20);
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
    public void test02887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02887");
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
        boolean boolean24 = creditCardPayment0.pay((double) (-1L), user23);
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
    public void test02888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02888");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 1, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) '4', user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((-1.0d), user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 100.0f, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) 0.0f, user20);
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
    public void test02889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02889");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (-1.0f), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay(10.0d, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (byte) 100, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (-1.0f), user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay(0.0d, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 1L, user17);
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
    public void test02890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02890");
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
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (-1), user17);
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
    public void test02891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02891");
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
        boolean boolean24 = creditCardPayment0.pay(100.0d, user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) 100.0f, user26);
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay((double) 10L, user29);
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
    public void test02892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02892");
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
    public void test02893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02893");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (-1.0f), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay(10.0d, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) ' ', user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay(0.0d, user11);
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
    public void test02894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02894");
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
        boolean boolean21 = creditCardPayment0.pay(1.0d, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) (short) 1, user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) (-1), user26);
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
    public void test02895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02895");
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
        boolean boolean21 = creditCardPayment0.pay((double) 'a', user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay(100.0d, user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) ' ', user26);
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay((double) (byte) -1, user29);
        model.User user32 = null;
        boolean boolean33 = creditCardPayment0.pay((double) (short) 1, user32);
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
    public void test02896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02896");
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
        boolean boolean15 = creditCardPayment0.pay(100.0d, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay(0.0d, user17);
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
    public void test02897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02897");
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
    public void test02898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02898");
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
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (short) -1, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) '#', user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) (byte) 0, user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay(1.0d, user26);
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay(1.0d, user29);
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
    public void test02899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02899");
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
        boolean boolean15 = creditCardPayment0.pay((double) 100L, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay(0.0d, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((-1.0d), user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) (-1.0f), user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) 1.0f, user26);
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
    public void test02900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02900");
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
        boolean boolean30 = creditCardPayment0.pay((double) 100.0f, user29);
        model.User user32 = null;
        boolean boolean33 = creditCardPayment0.pay((double) (byte) 1, user32);
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
    public void test02901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02901");
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
        boolean boolean18 = creditCardPayment0.pay((double) (-1), user17);
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
    public void test02902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02902");
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
        boolean boolean15 = creditCardPayment0.pay((double) 1, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 10, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) (short) 0, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay(1.0d, user23);
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
    public void test02903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02903");
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
    public void test02904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02904");
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
        boolean boolean18 = creditCardPayment0.pay((double) 10L, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) (byte) 100, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay(100.0d, user23);
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
    public void test02905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02905");
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
    public void test02906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02906");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (-1.0f), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay(10.0d, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 0L, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (byte) -1, user11);
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
    public void test02907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02907");
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
    public void test02908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02908");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay(0.0d, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (short) 100, user8);
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
    public void test02909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02909");
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
        boolean boolean18 = creditCardPayment0.pay((double) (-1), user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) 1L, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) 10L, user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) ' ', user26);
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay((double) 100.0f, user29);
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
    public void test02910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02910");
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
        boolean boolean18 = creditCardPayment0.pay((double) 1.0f, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay(10.0d, user20);
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
    public void test02911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02911");
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
        boolean boolean24 = creditCardPayment0.pay((double) (short) -1, user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) (byte) 100, user26);
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay(0.0d, user29);
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
    public void test02912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02912");
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
    public void test02913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02913");
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
        boolean boolean27 = creditCardPayment0.pay((double) 100, user26);
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
    public void test02914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02914");
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
        boolean boolean24 = creditCardPayment0.pay(1.0d, user23);
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
    public void test02915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02915");
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
    public void test02916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02916");
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
        boolean boolean33 = creditCardPayment0.pay((double) (byte) -1, user32);
        model.User user35 = null;
        boolean boolean36 = creditCardPayment0.pay(0.0d, user35);
        model.User user38 = null;
        boolean boolean39 = creditCardPayment0.pay(100.0d, user38);
        java.lang.Class<?> wildcardClass40 = creditCardPayment0.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test02917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02917");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (byte) -1, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (short) 0, user11);
        java.lang.Class<?> wildcardClass13 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test02918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02918");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 0.0f, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (short) 0, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay(0.0d, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 1, user17);
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
    public void test02919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02919");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (-1.0f), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) (byte) 0, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (byte) 10, user8);
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
    public void test02920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02920");
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
        boolean boolean18 = creditCardPayment0.pay((double) (byte) 10, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay(100.0d, user20);
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
    public void test02921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02921");
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
    public void test02922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02922");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (-1.0f), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay(0.0d, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 100, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay(0.0d, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 'a', user14);
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
    public void test02923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02923");
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
    public void test02924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02924");
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
        boolean boolean18 = creditCardPayment0.pay((double) 100L, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) (short) 1, user20);
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
    public void test02925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02925");
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
    public void test02926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02926");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) (short) 10, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(0.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay(0.0d, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 10.0f, user14);
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
    public void test02927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02927");
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
    public void test02928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02928");
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
        boolean boolean21 = creditCardPayment0.pay((double) (short) 0, user20);
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
    public void test02929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02929");
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
    public void test02930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02930");
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
        boolean boolean27 = creditCardPayment0.pay((double) 100, user26);
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay((double) (short) 0, user29);
        model.User user32 = null;
        boolean boolean33 = creditCardPayment0.pay((double) 100L, user32);
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
    public void test02931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02931");
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
    public void test02932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02932");
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
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay(1.0d, user26);
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay(0.0d, user29);
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
    public void test02933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02933");
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
    public void test02934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02934");
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
    public void test02935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02935");
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
        boolean boolean15 = creditCardPayment0.pay((double) 1, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 10, user17);
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
    public void test02936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02936");
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
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) (byte) 100, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay(0.0d, user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) (byte) -1, user26);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test02937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02937");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) ' ', user8);
        java.lang.Class<?> wildcardClass10 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test02938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02938");
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
        boolean boolean30 = creditCardPayment0.pay((double) 100L, user29);
        model.User user32 = null;
        boolean boolean33 = creditCardPayment0.pay((double) 10L, user32);
        model.User user35 = null;
        boolean boolean36 = creditCardPayment0.pay((double) 0L, user35);
        model.User user38 = null;
        boolean boolean39 = creditCardPayment0.pay((-1.0d), user38);
        java.lang.Class<?> wildcardClass40 = creditCardPayment0.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test02939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02939");
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
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay((double) ' ', user29);
        model.User user32 = null;
        boolean boolean33 = creditCardPayment0.pay((double) 100.0f, user32);
        model.User user35 = null;
        boolean boolean36 = creditCardPayment0.pay((double) 100.0f, user35);
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
    public void test02940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02940");
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
        boolean boolean18 = creditCardPayment0.pay((double) (byte) 10, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) 'a', user20);
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
    public void test02941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02941");
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
        boolean boolean30 = creditCardPayment0.pay((double) (short) 0, user29);
        model.User user32 = null;
        boolean boolean33 = creditCardPayment0.pay((double) 0L, user32);
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
    public void test02942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02942");
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
        boolean boolean18 = creditCardPayment0.pay((double) (short) 0, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) 0L, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) (short) 1, user23);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test02943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02943");
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
    public void test02944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02944");
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
        java.lang.Class<?> wildcardClass16 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test02945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02945");
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
        boolean boolean33 = creditCardPayment0.pay((double) (-1), user32);
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
    public void test02946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02946");
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
        boolean boolean21 = creditCardPayment0.pay((double) 'a', user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) (byte) -1, user23);
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
    public void test02947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02947");
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
        boolean boolean21 = creditCardPayment0.pay((double) (short) 100, user20);
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
    public void test02948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02948");
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
        model.User user32 = null;
        boolean boolean33 = creditCardPayment0.pay((double) 10L, user32);
        model.User user35 = null;
        boolean boolean36 = creditCardPayment0.pay((double) (short) 0, user35);
        model.User user38 = null;
        boolean boolean39 = creditCardPayment0.pay((double) 'a', user38);
        model.User user41 = null;
        boolean boolean42 = creditCardPayment0.pay((double) 'a', user41);
        java.lang.Class<?> wildcardClass43 = creditCardPayment0.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test02949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02949");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) '4', user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 10L, user8);
        java.lang.Class<?> wildcardClass10 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test02950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02950");
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
    public void test02951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02951");
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
        boolean boolean30 = creditCardPayment0.pay((double) 100L, user29);
        model.User user32 = null;
        boolean boolean33 = creditCardPayment0.pay((double) 100.0f, user32);
        model.User user35 = null;
        boolean boolean36 = creditCardPayment0.pay((double) (short) -1, user35);
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
    public void test02952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02952");
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
    public void test02953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02953");
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
        boolean boolean15 = creditCardPayment0.pay((double) 100L, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay(0.0d, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((-1.0d), user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) (-1.0f), user23);
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
    public void test02954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02954");
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
        boolean boolean18 = creditCardPayment0.pay((double) 1, user17);
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
    public void test02955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02955");
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
        boolean boolean21 = creditCardPayment0.pay((double) (short) 0, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) (short) 100, user23);
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
    public void test02956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02956");
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
        boolean boolean18 = creditCardPayment0.pay((double) (short) 1, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) (-1), user20);
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
    public void test02957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02957");
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
        boolean boolean18 = creditCardPayment0.pay((double) (-1.0f), user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) (byte) -1, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) (short) 1, user23);
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
    public void test02958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02958");
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
        boolean boolean15 = creditCardPayment0.pay((double) 10, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 0, user17);
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
    public void test02959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02959");
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
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (-1), user17);
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
    public void test02960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02960");
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
        boolean boolean15 = creditCardPayment0.pay((double) (byte) 0, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (short) 100, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) (byte) 10, user20);
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
    public void test02961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02961");
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
        boolean boolean15 = creditCardPayment0.pay((-1.0d), user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) '#', user17);
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
    public void test02962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02962");
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
        boolean boolean21 = creditCardPayment0.pay((double) 10, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) (byte) 100, user23);
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
    public void test02963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02963");
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
        boolean boolean24 = creditCardPayment0.pay((double) 100L, user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay(1.0d, user26);
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay((double) (short) -1, user29);
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
    public void test02964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02964");
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
        boolean boolean21 = creditCardPayment0.pay((double) (byte) 1, user20);
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
    public void test02965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02965");
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
    public void test02966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02966");
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
    public void test02967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02967");
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
        boolean boolean21 = creditCardPayment0.pay((double) (-1), user20);
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
    public void test02968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02968");
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
    public void test02969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02969");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) (-1.0f), user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(100.0d, user8);
        java.lang.Class<?> wildcardClass10 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test02970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02970");
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
        model.User user32 = null;
        boolean boolean33 = creditCardPayment0.pay((double) 10, user32);
        model.User user35 = null;
        boolean boolean36 = creditCardPayment0.pay((double) '4', user35);
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
    public void test02971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02971");
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
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) (short) 0, user26);
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay((double) (-1), user29);
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
    }

    @Test
    public void test02972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02972");
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
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) (short) 0, user23);
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
    public void test02973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02973");
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
    public void test02974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02974");
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
        boolean boolean21 = creditCardPayment0.pay((double) (short) -1, user20);
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
    public void test02975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02975");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay(0.0d, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 0.0f, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 1, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 100.0f, user14);
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
    public void test02976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02976");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) (short) 10, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (short) 10, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) ' ', user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (byte) -1, user14);
        java.lang.Class<?> wildcardClass16 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test02977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02977");
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
        boolean boolean24 = creditCardPayment0.pay((double) 100, user23);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test02978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02978");
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
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay(0.0d, user26);
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay((double) 0, user29);
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
    public void test02979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02979");
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
    public void test02980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02980");
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
        boolean boolean18 = creditCardPayment0.pay((double) (byte) -1, user17);
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
    public void test02981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02981");
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
        boolean boolean18 = creditCardPayment0.pay(1.0d, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) 0L, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) 100.0f, user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay(10.0d, user26);
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
    public void test02982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02982");
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
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay(0.0d, user29);
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
    public void test02983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02983");
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
        boolean boolean15 = creditCardPayment0.pay((double) (byte) 0, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay(1.0d, user17);
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
    public void test02984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02984");
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
        boolean boolean15 = creditCardPayment0.pay((double) (-1.0f), user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 1.0f, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) 0, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) ' ', user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) (-1.0f), user26);
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
    public void test02985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02985");
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
        boolean boolean24 = creditCardPayment0.pay(0.0d, user23);
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
    public void test02986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02986");
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
        boolean boolean21 = creditCardPayment0.pay((double) 0, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) 1.0f, user23);
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
    public void test02987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02987");
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
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) 0.0f, user23);
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
    public void test02988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02988");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 0.0f, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 10.0f, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (-1L), user11);
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
    public void test02989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02989");
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
    public void test02990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02990");
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
        boolean boolean27 = creditCardPayment0.pay((double) (byte) 1, user26);
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay((double) (-1.0f), user29);
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
    public void test02991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02991");
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
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (-1), user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay(10.0d, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) 100L, user23);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test02992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02992");
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
        boolean boolean18 = creditCardPayment0.pay((double) 100, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) 100, user20);
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
    public void test02993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02993");
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
    public void test02994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02994");
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
        boolean boolean21 = creditCardPayment0.pay((double) 100, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) 10L, user23);
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
    public void test02995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02995");
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
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay(0.0d, user29);
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
    public void test02996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02996");
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
    public void test02997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02997");
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
    public void test02998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02998");
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
    public void test02999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02999");
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
    public void test03000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test03000");
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
}

