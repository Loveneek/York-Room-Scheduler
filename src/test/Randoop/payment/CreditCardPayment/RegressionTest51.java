import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest51 {

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
    public void test25501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25501");
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
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) 10, user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) 0, user26);
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay(0.0d, user29);
        model.User user32 = null;
        boolean boolean33 = creditCardPayment0.pay(0.0d, user32);
        model.User user35 = null;
        boolean boolean36 = creditCardPayment0.pay((double) 0.0f, user35);
        model.User user38 = null;
        boolean boolean39 = creditCardPayment0.pay((double) 'a', user38);
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
    }

    @Test
    public void test25502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25502");
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
        boolean boolean18 = creditCardPayment0.pay((double) 0.0f, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) (short) -1, user20);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test25503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25503");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 100L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (-1L), user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 'a', user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (short) -1, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (short) 100, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay(1.0d, user20);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test25504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25504");
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
        boolean boolean21 = creditCardPayment0.pay((double) 100, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) (short) 10, user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) (-1.0f), user26);
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay((double) (-1L), user29);
        model.User user32 = null;
        boolean boolean33 = creditCardPayment0.pay((double) (byte) 0, user32);
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
    public void test25505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25505");
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
        boolean boolean27 = creditCardPayment0.pay((double) '#', user26);
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay((double) (byte) 0, user29);
        model.User user32 = null;
        boolean boolean33 = creditCardPayment0.pay((double) (byte) 0, user32);
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
    public void test25506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25506");
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
        boolean boolean21 = creditCardPayment0.pay((double) (-1.0f), user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay(100.0d, user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) 1.0f, user26);
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay((double) (-1L), user29);
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
    public void test25507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25507");
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
        boolean boolean24 = creditCardPayment0.pay((double) 0, user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) 10, user26);
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay((double) (byte) 1, user29);
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
    public void test25508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25508");
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
        boolean boolean21 = creditCardPayment0.pay((double) (byte) -1, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) (byte) 1, user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay(100.0d, user26);
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay((double) 100.0f, user29);
        model.User user32 = null;
        boolean boolean33 = creditCardPayment0.pay((double) (-1), user32);
        model.User user35 = null;
        boolean boolean36 = creditCardPayment0.pay((double) 0, user35);
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
    public void test25509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25509");
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
        boolean boolean24 = creditCardPayment0.pay((double) 1L, user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) 10, user26);
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay((double) 100, user29);
        model.User user32 = null;
        boolean boolean33 = creditCardPayment0.pay(0.0d, user32);
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
    public void test25510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25510");
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
        boolean boolean27 = creditCardPayment0.pay((-1.0d), user26);
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay((double) 10L, user29);
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
    public void test25511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25511");
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
        boolean boolean27 = creditCardPayment0.pay((double) (-1), user26);
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay((double) (short) 1, user29);
        model.User user32 = null;
        boolean boolean33 = creditCardPayment0.pay(0.0d, user32);
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
    public void test25512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25512");
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
        boolean boolean21 = creditCardPayment0.pay((double) (byte) 10, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay(0.0d, user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((-1.0d), user26);
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay((double) (byte) 0, user29);
        model.User user32 = null;
        boolean boolean33 = creditCardPayment0.pay((double) ' ', user32);
        model.User user35 = null;
        boolean boolean36 = creditCardPayment0.pay((double) (short) 10, user35);
        model.User user38 = null;
        boolean boolean39 = creditCardPayment0.pay((double) (byte) 1, user38);
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
    public void test25513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25513");
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
        model.User user32 = null;
        boolean boolean33 = creditCardPayment0.pay((double) ' ', user32);
        model.User user35 = null;
        boolean boolean36 = creditCardPayment0.pay((double) 1L, user35);
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
    public void test25514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25514");
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
        boolean boolean33 = creditCardPayment0.pay((double) (short) -1, user32);
        model.User user35 = null;
        boolean boolean36 = creditCardPayment0.pay((double) 10L, user35);
        model.User user38 = null;
        boolean boolean39 = creditCardPayment0.pay((double) (byte) 1, user38);
        model.User user41 = null;
        boolean boolean42 = creditCardPayment0.pay((double) 0, user41);
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
    public void test25515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25515");
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
        boolean boolean27 = creditCardPayment0.pay((double) (byte) 0, user26);
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay((double) 1, user29);
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
    public void test25516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25516");
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
        boolean boolean18 = creditCardPayment0.pay((double) ' ', user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((-1.0d), user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) 100, user23);
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
    public void test25517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25517");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (-1.0f), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) (byte) 0, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(10.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay(0.0d, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 'a', user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay(0.0d, user17);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test25518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25518");
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
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) 100.0f, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay(0.0d, user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay(100.0d, user26);
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay((double) '4', user29);
        model.User user32 = null;
        boolean boolean33 = creditCardPayment0.pay((double) (-1), user32);
        model.User user35 = null;
        boolean boolean36 = creditCardPayment0.pay((double) (short) 100, user35);
        model.User user38 = null;
        boolean boolean39 = creditCardPayment0.pay(0.0d, user38);
        model.User user41 = null;
        boolean boolean42 = creditCardPayment0.pay((double) (byte) 0, user41);
        model.User user44 = null;
        boolean boolean45 = creditCardPayment0.pay((double) (byte) -1, user44);
        model.User user47 = null;
        boolean boolean48 = creditCardPayment0.pay((double) (byte) 0, user47);
        model.User user50 = null;
        boolean boolean51 = creditCardPayment0.pay((double) 100, user50);
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
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
    }

    @Test
    public void test25519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25519");
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
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay(100.0d, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay(0.0d, user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) 10, user26);
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay((double) 0L, user29);
        model.User user32 = null;
        boolean boolean33 = creditCardPayment0.pay(10.0d, user32);
        model.User user35 = null;
        boolean boolean36 = creditCardPayment0.pay((double) 0L, user35);
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
    public void test25520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25520");
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
        boolean boolean21 = creditCardPayment0.pay((double) 100, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) 10L, user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) (byte) 0, user26);
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay((double) '4', user29);
        model.User user32 = null;
        boolean boolean33 = creditCardPayment0.pay((-1.0d), user32);
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
    public void test25521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25521");
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
        boolean boolean15 = creditCardPayment0.pay((double) (byte) 100, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 'a', user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) 100, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) (byte) -1, user23);
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
    public void test25522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25522");
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
        boolean boolean21 = creditCardPayment0.pay((double) 1L, user20);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test25523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25523");
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
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (short) -1, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) 0.0f, user20);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test25524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25524");
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
        boolean boolean21 = creditCardPayment0.pay((double) (short) -1, user20);
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
    public void test25525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25525");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) (byte) 10, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 1L, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (short) -1, user11);
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
    public void test25526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25526");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 100.0f, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (byte) 0, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (short) -1, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (-1), user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay(10.0d, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) 100.0f, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) (-1.0f), user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) 100.0f, user26);
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay((double) 10L, user29);
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
    public void test25527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25527");
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
        boolean boolean24 = creditCardPayment0.pay((double) 100, user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) 10L, user26);
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay((double) 10.0f, user29);
        model.User user32 = null;
        boolean boolean33 = creditCardPayment0.pay(0.0d, user32);
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
    public void test25528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25528");
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
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) '4', user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay(100.0d, user26);
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay((double) 1, user29);
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
    public void test25529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25529");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay(0.0d, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(10.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 100L, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 100.0f, user14);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test25530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25530");
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
        boolean boolean18 = creditCardPayment0.pay(100.0d, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) 100, user20);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test25531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25531");
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
        boolean boolean18 = creditCardPayment0.pay((double) 10, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) (byte) 100, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) (-1), user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) (short) 1, user26);
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay((double) (short) 10, user29);
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
    public void test25532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25532");
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
        boolean boolean15 = creditCardPayment0.pay((double) 10L, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay(100.0d, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) 0, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) 10, user23);
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
    public void test25533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25533");
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
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) '4', user23);
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
    public void test25534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25534");
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
        boolean boolean30 = creditCardPayment0.pay((double) '4', user29);
        model.User user32 = null;
        boolean boolean33 = creditCardPayment0.pay((double) (short) -1, user32);
        model.User user35 = null;
        boolean boolean36 = creditCardPayment0.pay(0.0d, user35);
        model.User user38 = null;
        boolean boolean39 = creditCardPayment0.pay((double) 0.0f, user38);
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
    }

    @Test
    public void test25535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25535");
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
    public void test25536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25536");
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
        boolean boolean18 = creditCardPayment0.pay((double) (short) 0, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) (byte) -1, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) 'a', user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) (-1L), user26);
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay((double) '#', user29);
        model.User user32 = null;
        boolean boolean33 = creditCardPayment0.pay((double) 1.0f, user32);
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
    public void test25537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25537");
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
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) (byte) 100, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) ' ', user23);
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
    public void test25538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25538");
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
        boolean boolean27 = creditCardPayment0.pay((double) 0L, user26);
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay((double) 1, user29);
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
    public void test25539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25539");
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
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) 1.0f, user26);
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay((double) (byte) 0, user29);
        model.User user32 = null;
        boolean boolean33 = creditCardPayment0.pay((double) 100L, user32);
        model.User user35 = null;
        boolean boolean36 = creditCardPayment0.pay((double) '#', user35);
        model.User user38 = null;
        boolean boolean39 = creditCardPayment0.pay((double) (byte) 0, user38);
        model.User user41 = null;
        boolean boolean42 = creditCardPayment0.pay((double) 1L, user41);
        model.User user44 = null;
        boolean boolean45 = creditCardPayment0.pay((double) 0L, user44);
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
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
    }

    @Test
    public void test25540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25540");
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
        model.User user35 = null;
        boolean boolean36 = creditCardPayment0.pay((double) (byte) 10, user35);
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
    public void test25541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25541");
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
    public void test25542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25542");
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
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 100L, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) 0.0f, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) 10L, user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) 100L, user26);
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay((double) (short) -1, user29);
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
    public void test25543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25543");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (-1.0f), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay(10.0d, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((-1.0d), user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) '#', user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (short) 100, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay(1.0d, user17);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test25544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25544");
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
        boolean boolean24 = creditCardPayment0.pay((double) 0.0f, user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) 0L, user26);
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay((double) 0L, user29);
        model.User user32 = null;
        boolean boolean33 = creditCardPayment0.pay((double) 100.0f, user32);
        model.User user35 = null;
        boolean boolean36 = creditCardPayment0.pay((double) 10, user35);
        model.User user38 = null;
        boolean boolean39 = creditCardPayment0.pay((double) ' ', user38);
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
    public void test25545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25545");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) (-1L), user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (-1), user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 10, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 10, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay(100.0d, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) (short) 0, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) (-1L), user23);
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
    public void test25546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25546");
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
        boolean boolean18 = creditCardPayment0.pay(100.0d, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) (-1.0f), user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) '#', user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) (byte) 100, user26);
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
    public void test25547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25547");
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
        boolean boolean21 = creditCardPayment0.pay((double) (byte) 1, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) 10, user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) (short) 0, user26);
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
    public void test25548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25548");
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
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay(0.0d, user29);
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
    public void test25549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25549");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (-1.0f), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) (byte) 0, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (short) 0, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (byte) 1, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 1.0f, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 10.0f, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay(0.0d, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) (-1), user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay(10.0d, user26);
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay((double) 10L, user29);
        model.User user32 = null;
        boolean boolean33 = creditCardPayment0.pay((double) 100, user32);
        model.User user35 = null;
        boolean boolean36 = creditCardPayment0.pay(1.0d, user35);
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
    public void test25550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25550");
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
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay(10.0d, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) (short) 10, user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) (-1), user26);
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay((double) 10.0f, user29);
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
    public void test25551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25551");
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
        boolean boolean27 = creditCardPayment0.pay((double) (-1.0f), user26);
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay(100.0d, user29);
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
    public void test25552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25552");
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
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay((double) '4', user29);
        model.User user32 = null;
        boolean boolean33 = creditCardPayment0.pay((double) 10L, user32);
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
    public void test25553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25553");
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
        boolean boolean24 = creditCardPayment0.pay((double) 100L, user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) 1L, user26);
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay((double) 0.0f, user29);
        model.User user32 = null;
        boolean boolean33 = creditCardPayment0.pay((double) (short) 0, user32);
        model.User user35 = null;
        boolean boolean36 = creditCardPayment0.pay((double) (byte) 0, user35);
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
    public void test25554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25554");
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
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay(0.0d, user20);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test25555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25555");
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
    public void test25556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25556");
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
        boolean boolean18 = creditCardPayment0.pay((double) 0.0f, user17);
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
    public void test25557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25557");
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
        boolean boolean27 = creditCardPayment0.pay((double) 10, user26);
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay((double) (byte) 0, user29);
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
    public void test25558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25558");
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
        boolean boolean24 = creditCardPayment0.pay((double) ' ', user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) (byte) 0, user26);
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay((double) (-1), user29);
        model.User user32 = null;
        boolean boolean33 = creditCardPayment0.pay((double) (byte) 1, user32);
        model.User user35 = null;
        boolean boolean36 = creditCardPayment0.pay((double) 10, user35);
        model.User user38 = null;
        boolean boolean39 = creditCardPayment0.pay((double) '#', user38);
        model.User user41 = null;
        boolean boolean42 = creditCardPayment0.pay((double) (byte) 0, user41);
        model.User user44 = null;
        boolean boolean45 = creditCardPayment0.pay((double) '4', user44);
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
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
    }

    @Test
    public void test25559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25559");
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
        boolean boolean30 = creditCardPayment0.pay((double) 0.0f, user29);
        model.User user32 = null;
        boolean boolean33 = creditCardPayment0.pay(0.0d, user32);
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
    public void test25560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25560");
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
        boolean boolean27 = creditCardPayment0.pay((double) 1.0f, user26);
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay((double) (byte) 10, user29);
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
    public void test25561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25561");
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
        boolean boolean27 = creditCardPayment0.pay((double) 1.0f, user26);
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay((double) (short) -1, user29);
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
    public void test25562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25562");
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
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) 10.0f, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) (byte) 0, user23);
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
    public void test25563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25563");
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
        boolean boolean21 = creditCardPayment0.pay((double) 10L, user20);
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
    public void test25564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25564");
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
        boolean boolean18 = creditCardPayment0.pay((double) (byte) 100, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) '4', user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) (byte) 10, user23);
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
    public void test25565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25565");
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
        boolean boolean15 = creditCardPayment0.pay((double) 1L, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (short) 0, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) 1L, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay(1.0d, user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay(1.0d, user26);
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay((double) (byte) 100, user29);
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
    public void test25566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25566");
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
        boolean boolean39 = creditCardPayment0.pay((double) 1L, user38);
        model.User user41 = null;
        boolean boolean42 = creditCardPayment0.pay((double) (short) 0, user41);
        model.User user44 = null;
        boolean boolean45 = creditCardPayment0.pay((double) '#', user44);
        model.User user47 = null;
        boolean boolean48 = creditCardPayment0.pay((double) '4', user47);
        model.User user50 = null;
        boolean boolean51 = creditCardPayment0.pay(0.0d, user50);
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
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
    }

    @Test
    public void test25567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25567");
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
        boolean boolean18 = creditCardPayment0.pay((-1.0d), user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) ' ', user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) (short) 0, user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) '#', user26);
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
    public void test25568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25568");
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
        boolean boolean27 = creditCardPayment0.pay((double) (short) 0, user26);
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay((double) ' ', user29);
        model.User user32 = null;
        boolean boolean33 = creditCardPayment0.pay((double) 10, user32);
        model.User user35 = null;
        boolean boolean36 = creditCardPayment0.pay((double) (-1L), user35);
        model.User user38 = null;
        boolean boolean39 = creditCardPayment0.pay((-1.0d), user38);
        model.User user41 = null;
        boolean boolean42 = creditCardPayment0.pay((double) 10, user41);
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
    public void test25569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25569");
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
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 0L, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) ' ', user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) 1, user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) 1.0f, user26);
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay((double) 1L, user29);
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
    public void test25570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25570");
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
        boolean boolean30 = creditCardPayment0.pay(0.0d, user29);
        model.User user32 = null;
        boolean boolean33 = creditCardPayment0.pay((double) 10L, user32);
        model.User user35 = null;
        boolean boolean36 = creditCardPayment0.pay((double) 1L, user35);
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
    public void test25571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25571");
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
        boolean boolean27 = creditCardPayment0.pay((double) 1L, user26);
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay((double) 10, user29);
        model.User user32 = null;
        boolean boolean33 = creditCardPayment0.pay((double) 100L, user32);
        model.User user35 = null;
        boolean boolean36 = creditCardPayment0.pay((double) 10, user35);
        model.User user38 = null;
        boolean boolean39 = creditCardPayment0.pay((double) 0, user38);
        model.User user41 = null;
        boolean boolean42 = creditCardPayment0.pay((double) (short) 100, user41);
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
    public void test25572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25572");
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
        boolean boolean24 = creditCardPayment0.pay((double) (-1.0f), user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) 10L, user26);
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay((double) 10.0f, user29);
        model.User user32 = null;
        boolean boolean33 = creditCardPayment0.pay((double) (short) 0, user32);
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
    public void test25573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25573");
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
        boolean boolean18 = creditCardPayment0.pay((double) ' ', user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay(1.0d, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay(0.0d, user23);
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
    public void test25574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25574");
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
        boolean boolean15 = creditCardPayment0.pay((double) 0L, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 100, user17);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test25575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25575");
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
        boolean boolean24 = creditCardPayment0.pay((double) ' ', user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) (byte) 0, user26);
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay((double) 100, user29);
        model.User user32 = null;
        boolean boolean33 = creditCardPayment0.pay((double) (short) 100, user32);
        model.User user35 = null;
        boolean boolean36 = creditCardPayment0.pay((double) 0.0f, user35);
        model.User user38 = null;
        boolean boolean39 = creditCardPayment0.pay((double) 10.0f, user38);
        model.User user41 = null;
        boolean boolean42 = creditCardPayment0.pay((double) 1, user41);
        model.User user44 = null;
        boolean boolean45 = creditCardPayment0.pay((double) 100, user44);
        model.User user47 = null;
        boolean boolean48 = creditCardPayment0.pay((double) 10, user47);
        model.User user50 = null;
        boolean boolean51 = creditCardPayment0.pay((double) 1L, user50);
        java.lang.Class<?> wildcardClass52 = creditCardPayment0.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(wildcardClass52);
    }

    @Test
    public void test25576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25576");
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
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) '#', user26);
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay((double) (-1), user29);
        model.User user32 = null;
        boolean boolean33 = creditCardPayment0.pay((double) 'a', user32);
        model.User user35 = null;
        boolean boolean36 = creditCardPayment0.pay((double) 1L, user35);
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
    public void test25577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25577");
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
        boolean boolean15 = creditCardPayment0.pay((double) (byte) 0, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (byte) 0, user17);
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
    public void test25578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25578");
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
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) (byte) -1, user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) '#', user26);
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay((double) (byte) 100, user29);
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
    public void test25579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25579");
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
        model.User user32 = null;
        boolean boolean33 = creditCardPayment0.pay((double) 0L, user32);
        model.User user35 = null;
        boolean boolean36 = creditCardPayment0.pay((double) 100L, user35);
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
    public void test25580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25580");
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
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) 0.0f, user26);
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay((-1.0d), user29);
        model.User user32 = null;
        boolean boolean33 = creditCardPayment0.pay(100.0d, user32);
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
    public void test25581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25581");
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
        boolean boolean30 = creditCardPayment0.pay((double) (-1), user29);
        model.User user32 = null;
        boolean boolean33 = creditCardPayment0.pay(0.0d, user32);
        model.User user35 = null;
        boolean boolean36 = creditCardPayment0.pay(10.0d, user35);
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
    public void test25582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25582");
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
        boolean boolean27 = creditCardPayment0.pay((double) 1.0f, user26);
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay(0.0d, user29);
        model.User user32 = null;
        boolean boolean33 = creditCardPayment0.pay((double) (byte) 1, user32);
        model.User user35 = null;
        boolean boolean36 = creditCardPayment0.pay(0.0d, user35);
        model.User user38 = null;
        boolean boolean39 = creditCardPayment0.pay(0.0d, user38);
        model.User user41 = null;
        boolean boolean42 = creditCardPayment0.pay((double) (byte) -1, user41);
        model.User user44 = null;
        boolean boolean45 = creditCardPayment0.pay((-1.0d), user44);
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
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
    }

    @Test
    public void test25583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25583");
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
        boolean boolean27 = creditCardPayment0.pay((double) 1, user26);
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay((double) 100, user29);
        model.User user32 = null;
        boolean boolean33 = creditCardPayment0.pay((double) (byte) 0, user32);
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
    public void test25584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25584");
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
        boolean boolean24 = creditCardPayment0.pay((double) 1.0f, user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) '4', user26);
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay((double) (short) 10, user29);
        model.User user32 = null;
        boolean boolean33 = creditCardPayment0.pay((double) (byte) 1, user32);
        model.User user35 = null;
        boolean boolean36 = creditCardPayment0.pay((double) (byte) 100, user35);
        model.User user38 = null;
        boolean boolean39 = creditCardPayment0.pay((double) 'a', user38);
        model.User user41 = null;
        boolean boolean42 = creditCardPayment0.pay((double) (byte) 1, user41);
        model.User user44 = null;
        boolean boolean45 = creditCardPayment0.pay((double) 100.0f, user44);
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
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
    }

    @Test
    public void test25585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25585");
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
        boolean boolean18 = creditCardPayment0.pay((double) 'a', user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) 'a', user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay(1.0d, user23);
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
    public void test25586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25586");
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
        boolean boolean18 = creditCardPayment0.pay((double) (byte) 0, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay(1.0d, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) 'a', user23);
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
    public void test25587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25587");
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
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay((double) 1, user29);
        model.User user32 = null;
        boolean boolean33 = creditCardPayment0.pay(1.0d, user32);
        model.User user35 = null;
        boolean boolean36 = creditCardPayment0.pay((double) ' ', user35);
        model.User user38 = null;
        boolean boolean39 = creditCardPayment0.pay((double) (-1), user38);
        model.User user41 = null;
        boolean boolean42 = creditCardPayment0.pay((double) 100.0f, user41);
        model.User user44 = null;
        boolean boolean45 = creditCardPayment0.pay((double) 100L, user44);
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
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
    }

    @Test
    public void test25588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25588");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (byte) -1, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 1.0f, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 100.0f, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 0L, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) 1L, user20);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test25589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25589");
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
        boolean boolean27 = creditCardPayment0.pay((double) (-1), user26);
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay(10.0d, user29);
        model.User user32 = null;
        boolean boolean33 = creditCardPayment0.pay((double) (short) 0, user32);
        model.User user35 = null;
        boolean boolean36 = creditCardPayment0.pay((-1.0d), user35);
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
    public void test25590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25590");
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
        boolean boolean15 = creditCardPayment0.pay(0.0d, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (-1.0f), user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) 1L, user20);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test25591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25591");
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
        boolean boolean21 = creditCardPayment0.pay((double) (short) 100, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) 10L, user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) (-1.0f), user26);
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
    public void test25592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25592");
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
        boolean boolean30 = creditCardPayment0.pay((double) (short) 1, user29);
        model.User user32 = null;
        boolean boolean33 = creditCardPayment0.pay((double) 100L, user32);
        model.User user35 = null;
        boolean boolean36 = creditCardPayment0.pay(0.0d, user35);
        model.User user38 = null;
        boolean boolean39 = creditCardPayment0.pay((double) '#', user38);
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
    }

    @Test
    public void test25593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25593");
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
        boolean boolean39 = creditCardPayment0.pay((double) 10.0f, user38);
        model.User user41 = null;
        boolean boolean42 = creditCardPayment0.pay((double) 0, user41);
        model.User user44 = null;
        boolean boolean45 = creditCardPayment0.pay((double) 10, user44);
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
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
    }

    @Test
    public void test25594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25594");
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
        boolean boolean24 = creditCardPayment0.pay((double) 'a', user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) 100L, user26);
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay((double) 0L, user29);
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
    public void test25595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25595");
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
        boolean boolean18 = creditCardPayment0.pay((double) 10, user17);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test25596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25596");
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
        boolean boolean21 = creditCardPayment0.pay((double) (byte) 1, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) ' ', user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) (short) 1, user26);
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
    public void test25597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25597");
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
        boolean boolean21 = creditCardPayment0.pay((double) '#', user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) (byte) 1, user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay(0.0d, user26);
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
    public void test25598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25598");
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
        boolean boolean30 = creditCardPayment0.pay(1.0d, user29);
        model.User user32 = null;
        boolean boolean33 = creditCardPayment0.pay((double) 0L, user32);
        model.User user35 = null;
        boolean boolean36 = creditCardPayment0.pay((double) (-1.0f), user35);
        model.User user38 = null;
        boolean boolean39 = creditCardPayment0.pay((double) (short) 100, user38);
        model.User user41 = null;
        boolean boolean42 = creditCardPayment0.pay((double) ' ', user41);
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
    public void test25599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25599");
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
        boolean boolean24 = creditCardPayment0.pay((double) 1L, user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) (short) 100, user26);
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay((double) (short) 0, user29);
        model.User user32 = null;
        boolean boolean33 = creditCardPayment0.pay((double) 10, user32);
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
    public void test25600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25600");
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
        model.User user32 = null;
        boolean boolean33 = creditCardPayment0.pay(0.0d, user32);
        model.User user35 = null;
        boolean boolean36 = creditCardPayment0.pay((double) (-1.0f), user35);
        model.User user38 = null;
        boolean boolean39 = creditCardPayment0.pay((double) ' ', user38);
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
    }

    @Test
    public void test25601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25601");
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
        boolean boolean18 = creditCardPayment0.pay((double) (-1L), user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((-1.0d), user20);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test25602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25602");
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
        boolean boolean18 = creditCardPayment0.pay((double) (short) 10, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) 10L, user20);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test25603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25603");
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
        boolean boolean18 = creditCardPayment0.pay((double) '4', user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) 0L, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((-1.0d), user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) 0.0f, user26);
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
    public void test25604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25604");
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
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) 1.0f, user26);
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay((double) (byte) 0, user29);
        model.User user32 = null;
        boolean boolean33 = creditCardPayment0.pay((double) (short) 1, user32);
        model.User user35 = null;
        boolean boolean36 = creditCardPayment0.pay((double) (short) 10, user35);
        model.User user38 = null;
        boolean boolean39 = creditCardPayment0.pay((double) 'a', user38);
        model.User user41 = null;
        boolean boolean42 = creditCardPayment0.pay((double) (short) 100, user41);
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
    public void test25605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25605");
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
        boolean boolean18 = creditCardPayment0.pay((double) '4', user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) 0L, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) 0L, user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) 100L, user26);
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
    public void test25606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25606");
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
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) (-1.0f), user23);
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
    public void test25607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25607");
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
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay((double) 0L, user29);
        model.User user32 = null;
        boolean boolean33 = creditCardPayment0.pay((double) '#', user32);
        model.User user35 = null;
        boolean boolean36 = creditCardPayment0.pay((double) 1L, user35);
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
    public void test25608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25608");
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
        boolean boolean30 = creditCardPayment0.pay((double) (-1.0f), user29);
        model.User user32 = null;
        boolean boolean33 = creditCardPayment0.pay((double) 100.0f, user32);
        model.User user35 = null;
        boolean boolean36 = creditCardPayment0.pay((double) (short) 1, user35);
        model.User user38 = null;
        boolean boolean39 = creditCardPayment0.pay((double) '#', user38);
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
    }

    @Test
    public void test25609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25609");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 100L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 1L, user8);
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
    public void test25610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25610");
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
        boolean boolean27 = creditCardPayment0.pay((double) (short) 10, user26);
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay((double) 10.0f, user29);
        model.User user32 = null;
        boolean boolean33 = creditCardPayment0.pay((double) (short) 0, user32);
        model.User user35 = null;
        boolean boolean36 = creditCardPayment0.pay(10.0d, user35);
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
    public void test25611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25611");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (-1.0f), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) (byte) 0, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(0.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (short) 1, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 0.0f, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (byte) 100, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay(0.0d, user20);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test25612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25612");
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
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) 1.0f, user26);
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay((double) (byte) 0, user29);
        model.User user32 = null;
        boolean boolean33 = creditCardPayment0.pay((double) (short) 1, user32);
        model.User user35 = null;
        boolean boolean36 = creditCardPayment0.pay((double) (-1), user35);
        model.User user38 = null;
        boolean boolean39 = creditCardPayment0.pay((double) 0L, user38);
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
    }

    @Test
    public void test25613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25613");
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
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) 0, user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) 100, user26);
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay((double) 10, user29);
        model.User user32 = null;
        boolean boolean33 = creditCardPayment0.pay((double) (byte) 0, user32);
        model.User user35 = null;
        boolean boolean36 = creditCardPayment0.pay((double) (byte) 0, user35);
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
    public void test25614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25614");
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
        boolean boolean24 = creditCardPayment0.pay((double) 10L, user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) (-1), user26);
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay((double) 'a', user29);
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
    public void test25615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25615");
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
        model.User user32 = null;
        boolean boolean33 = creditCardPayment0.pay((double) (-1.0f), user32);
        model.User user35 = null;
        boolean boolean36 = creditCardPayment0.pay((double) 100, user35);
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
    public void test25616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25616");
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
        boolean boolean15 = creditCardPayment0.pay((double) (short) 10, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 0.0f, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) (short) 0, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) '#', user23);
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
    public void test25617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25617");
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
        boolean boolean21 = creditCardPayment0.pay((double) (byte) 0, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) 1, user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) (short) 100, user26);
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay((double) '#', user29);
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
    public void test25618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25618");
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
        boolean boolean27 = creditCardPayment0.pay(0.0d, user26);
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
    public void test25619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25619");
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
        boolean boolean24 = creditCardPayment0.pay((double) 10, user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) 0L, user26);
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay(1.0d, user29);
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
    public void test25620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25620");
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
        boolean boolean15 = creditCardPayment0.pay((double) (byte) 1, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (short) 0, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay(0.0d, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) 10, user23);
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
    public void test25621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25621");
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
        boolean boolean18 = creditCardPayment0.pay((double) 1L, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay(10.0d, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) '4', user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) 1, user26);
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay((double) 'a', user29);
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
    public void test25622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25622");
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
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) 10.0f, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) (byte) 0, user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) (byte) 1, user26);
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay((double) 10, user29);
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
    public void test25623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25623");
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
    public void test25624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25624");
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
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) (-1.0f), user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) (byte) 100, user26);
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay((double) 10.0f, user29);
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
    public void test25625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25625");
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
        boolean boolean24 = creditCardPayment0.pay((double) 10, user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) 0L, user26);
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
    public void test25626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25626");
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
        boolean boolean18 = creditCardPayment0.pay((double) (short) 1, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) 0, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) 'a', user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) (short) 1, user26);
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
    public void test25627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25627");
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
        boolean boolean18 = creditCardPayment0.pay((double) (byte) 100, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) '4', user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) 1, user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) (-1.0f), user26);
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
    public void test25628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25628");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 10, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (byte) 10, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 100L, user11);
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
    public void test25629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25629");
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
        boolean boolean30 = creditCardPayment0.pay((double) 100.0f, user29);
        model.User user32 = null;
        boolean boolean33 = creditCardPayment0.pay(0.0d, user32);
        model.User user35 = null;
        boolean boolean36 = creditCardPayment0.pay((double) 10, user35);
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
    public void test25630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25630");
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
        boolean boolean18 = creditCardPayment0.pay((double) 10L, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay(100.0d, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay(0.0d, user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) 100L, user26);
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
    public void test25631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25631");
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
        boolean boolean24 = creditCardPayment0.pay((double) '#', user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) 10, user26);
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay((double) (byte) 1, user29);
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
    public void test25632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25632");
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
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) 10.0f, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) (short) 0, user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) 100L, user26);
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay((double) 100.0f, user29);
        model.User user32 = null;
        boolean boolean33 = creditCardPayment0.pay(10.0d, user32);
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
    public void test25633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25633");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) (byte) 10, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 0.0f, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay(100.0d, user11);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test25634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25634");
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
    public void test25635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25635");
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
        boolean boolean21 = creditCardPayment0.pay((double) (-1.0f), user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((-1.0d), user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) (byte) 100, user26);
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
    public void test25636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25636");
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
        boolean boolean21 = creditCardPayment0.pay((double) (-1), user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) 0L, user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) (short) 100, user26);
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay((double) (byte) 1, user29);
        model.User user32 = null;
        boolean boolean33 = creditCardPayment0.pay((double) (-1L), user32);
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
    public void test25637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25637");
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
        boolean boolean15 = creditCardPayment0.pay((double) 1, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (short) -1, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) '#', user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) (short) 0, user23);
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
    public void test25638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25638");
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
        boolean boolean15 = creditCardPayment0.pay((double) (short) 1, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (-1L), user17);
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
    public void test25639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25639");
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
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) (short) -1, user20);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test25640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25640");
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
        boolean boolean15 = creditCardPayment0.pay((double) (short) 1, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (byte) 1, user17);
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
    public void test25641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25641");
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
        boolean boolean15 = creditCardPayment0.pay((double) (byte) 100, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (short) 100, user17);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test25642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25642");
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
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay((double) 10, user29);
        model.User user32 = null;
        boolean boolean33 = creditCardPayment0.pay((double) 0, user32);
        model.User user35 = null;
        boolean boolean36 = creditCardPayment0.pay((double) (short) -1, user35);
        model.User user38 = null;
        boolean boolean39 = creditCardPayment0.pay((double) 0L, user38);
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
    public void test25643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25643");
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
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) '4', user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) 0L, user26);
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
    public void test25644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25644");
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
        boolean boolean21 = creditCardPayment0.pay((double) (-1), user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) 10.0f, user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) (byte) 10, user26);
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
    public void test25645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25645");
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
        boolean boolean18 = creditCardPayment0.pay((double) (short) 0, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) (byte) -1, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) 0L, user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) '#', user26);
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay((double) (short) -1, user29);
        model.User user32 = null;
        boolean boolean33 = creditCardPayment0.pay((double) (short) 10, user32);
        model.User user35 = null;
        boolean boolean36 = creditCardPayment0.pay((double) (byte) 10, user35);
        model.User user38 = null;
        boolean boolean39 = creditCardPayment0.pay(1.0d, user38);
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
    }

    @Test
    public void test25646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25646");
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
    public void test25647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25647");
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
        boolean boolean24 = creditCardPayment0.pay((double) (short) 10, user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) 100L, user26);
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay((double) (byte) 0, user29);
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
    public void test25648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25648");
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
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) ' ', user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) '#', user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) (byte) 1, user26);
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay((double) (short) 10, user29);
        model.User user32 = null;
        boolean boolean33 = creditCardPayment0.pay((double) (byte) 100, user32);
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
    public void test25649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25649");
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
        boolean boolean24 = creditCardPayment0.pay(0.0d, user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay(10.0d, user26);
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay((double) (short) 1, user29);
        model.User user32 = null;
        boolean boolean33 = creditCardPayment0.pay((-1.0d), user32);
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
    public void test25650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25650");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 100.0f, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 0L, user8);
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
    public void test25651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25651");
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
        model.User user32 = null;
        boolean boolean33 = creditCardPayment0.pay(0.0d, user32);
        model.User user35 = null;
        boolean boolean36 = creditCardPayment0.pay((double) (byte) 100, user35);
        model.User user38 = null;
        boolean boolean39 = creditCardPayment0.pay((double) ' ', user38);
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
    }

    @Test
    public void test25652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25652");
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
        boolean boolean21 = creditCardPayment0.pay((double) (-1.0f), user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay(100.0d, user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) 1, user26);
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
    public void test25653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25653");
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
        boolean boolean27 = creditCardPayment0.pay((double) (-1.0f), user26);
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
    public void test25654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25654");
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
        boolean boolean15 = creditCardPayment0.pay(10.0d, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) '4', user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) 100L, user20);
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
    public void test25655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25655");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 100L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (byte) 0, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) '#', user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (-1.0f), user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 10L, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) (byte) 0, user20);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test25656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25656");
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
        boolean boolean21 = creditCardPayment0.pay((double) (byte) 0, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) 0L, user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) (byte) 1, user26);
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay((double) (byte) 10, user29);
        model.User user32 = null;
        boolean boolean33 = creditCardPayment0.pay((double) 10, user32);
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
    public void test25657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25657");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) (-1.0f), user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 100L, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (short) -1, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (byte) 0, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (byte) 10, user17);
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
    public void test25658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25658");
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
        boolean boolean15 = creditCardPayment0.pay(100.0d, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) ' ', user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) (byte) 0, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) (short) 100, user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) 1L, user26);
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay((double) (-1), user29);
        model.User user32 = null;
        boolean boolean33 = creditCardPayment0.pay((double) (-1L), user32);
        model.User user35 = null;
        boolean boolean36 = creditCardPayment0.pay((double) (byte) 0, user35);
        model.User user38 = null;
        boolean boolean39 = creditCardPayment0.pay((double) 1.0f, user38);
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
    }

    @Test
    public void test25659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25659");
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
        boolean boolean18 = creditCardPayment0.pay(0.0d, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) 0L, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) 100.0f, user23);
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
    public void test25660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25660");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) (-1L), user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 10, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 0.0f, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (-1), user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay(10.0d, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) '#', user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) '#', user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) (byte) 0, user26);
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
    public void test25661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25661");
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
        boolean boolean24 = creditCardPayment0.pay((double) ' ', user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) '#', user26);
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay((double) 'a', user29);
        model.User user32 = null;
        boolean boolean33 = creditCardPayment0.pay((double) (short) 10, user32);
        model.User user35 = null;
        boolean boolean36 = creditCardPayment0.pay((double) 0, user35);
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
    public void test25662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25662");
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
        boolean boolean24 = creditCardPayment0.pay((double) '4', user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) (short) 1, user26);
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
    public void test25663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25663");
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
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) 0.0f, user26);
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay((-1.0d), user29);
        model.User user32 = null;
        boolean boolean33 = creditCardPayment0.pay(100.0d, user32);
        model.User user35 = null;
        boolean boolean36 = creditCardPayment0.pay((double) (short) 0, user35);
        model.User user38 = null;
        boolean boolean39 = creditCardPayment0.pay(0.0d, user38);
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
    }

    @Test
    public void test25664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25664");
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
    public void test25665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25665");
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
        boolean boolean30 = creditCardPayment0.pay((double) (-1.0f), user29);
        model.User user32 = null;
        boolean boolean33 = creditCardPayment0.pay((-1.0d), user32);
        model.User user35 = null;
        boolean boolean36 = creditCardPayment0.pay((double) ' ', user35);
        model.User user38 = null;
        boolean boolean39 = creditCardPayment0.pay((double) (short) 0, user38);
        model.User user41 = null;
        boolean boolean42 = creditCardPayment0.pay((double) 0, user41);
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
    public void test25666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25666");
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
        boolean boolean15 = creditCardPayment0.pay((double) 0.0f, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (byte) -1, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) (short) 0, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) (short) 0, user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((-1.0d), user26);
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
    public void test25667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25667");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 100L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) '4', user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 0.0f, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (short) 0, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (short) 0, user17);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test25668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25668");
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
        boolean boolean30 = creditCardPayment0.pay(10.0d, user29);
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
    public void test25669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25669");
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
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((-1.0d), user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) '4', user20);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test25670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25670");
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
        boolean boolean18 = creditCardPayment0.pay((double) 1L, user17);
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
    public void test25671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25671");
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
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay(10.0d, user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((-1.0d), user26);
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay(0.0d, user29);
        model.User user32 = null;
        boolean boolean33 = creditCardPayment0.pay((double) '4', user32);
        model.User user35 = null;
        boolean boolean36 = creditCardPayment0.pay((double) ' ', user35);
        model.User user38 = null;
        boolean boolean39 = creditCardPayment0.pay((double) 100.0f, user38);
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
    }

    @Test
    public void test25672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25672");
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
        boolean boolean18 = creditCardPayment0.pay((double) '#', user17);
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
    public void test25673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25673");
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
        boolean boolean15 = creditCardPayment0.pay((double) (short) 1, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 0L, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) 100L, user20);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test25674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25674");
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
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) (short) 100, user26);
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay((double) 10, user29);
        model.User user32 = null;
        boolean boolean33 = creditCardPayment0.pay((double) 0, user32);
        model.User user35 = null;
        boolean boolean36 = creditCardPayment0.pay((double) 10L, user35);
        model.User user38 = null;
        boolean boolean39 = creditCardPayment0.pay(1.0d, user38);
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
    }

    @Test
    public void test25675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25675");
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
    public void test25676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25676");
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
        boolean boolean24 = creditCardPayment0.pay((double) (short) 10, user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) 0, user26);
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay((double) '#', user29);
        model.User user32 = null;
        boolean boolean33 = creditCardPayment0.pay((double) 'a', user32);
        model.User user35 = null;
        boolean boolean36 = creditCardPayment0.pay((double) (byte) 0, user35);
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
    public void test25677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25677");
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
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay((double) 1, user29);
        model.User user32 = null;
        boolean boolean33 = creditCardPayment0.pay((double) (short) 10, user32);
        model.User user35 = null;
        boolean boolean36 = creditCardPayment0.pay(100.0d, user35);
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
    public void test25678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25678");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (-1), user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (-1L), user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay(10.0d, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 100.0f, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) (byte) 0, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) '#', user23);
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
    public void test25679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25679");
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
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) (short) -1, user26);
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay((double) 0.0f, user29);
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
    public void test25680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25680");
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
        boolean boolean27 = creditCardPayment0.pay((double) 0.0f, user26);
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay((double) (byte) 100, user29);
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
    public void test25681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25681");
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
        boolean boolean21 = creditCardPayment0.pay((double) 10.0f, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay(1.0d, user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) 10.0f, user26);
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay((double) (byte) 1, user29);
        model.User user32 = null;
        boolean boolean33 = creditCardPayment0.pay((double) (short) 100, user32);
        model.User user35 = null;
        boolean boolean36 = creditCardPayment0.pay(0.0d, user35);
        model.User user38 = null;
        boolean boolean39 = creditCardPayment0.pay((double) '4', user38);
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
    }

    @Test
    public void test25682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25682");
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
        boolean boolean21 = creditCardPayment0.pay((double) 1.0f, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) (-1L), user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay(0.0d, user26);
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
    public void test25683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25683");
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
        boolean boolean18 = creditCardPayment0.pay(100.0d, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) (short) 0, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay(100.0d, user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) (byte) 10, user26);
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay((double) (byte) 10, user29);
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
    public void test25684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25684");
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
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) 1.0f, user26);
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay((double) (byte) 0, user29);
        model.User user32 = null;
        boolean boolean33 = creditCardPayment0.pay((double) 100L, user32);
        model.User user35 = null;
        boolean boolean36 = creditCardPayment0.pay((double) 0, user35);
        model.User user38 = null;
        boolean boolean39 = creditCardPayment0.pay((double) 10.0f, user38);
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
    }

    @Test
    public void test25685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25685");
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
        boolean boolean15 = creditCardPayment0.pay((double) (byte) 100, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (byte) 0, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) (short) 100, user20);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test25686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25686");
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
        boolean boolean21 = creditCardPayment0.pay((double) (byte) 100, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((-1.0d), user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) 100L, user26);
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay(100.0d, user29);
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
    public void test25687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25687");
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
        boolean boolean15 = creditCardPayment0.pay((double) (short) 10, user14);
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
    public void test25688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25688");
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
        boolean boolean30 = creditCardPayment0.pay((double) ' ', user29);
        model.User user32 = null;
        boolean boolean33 = creditCardPayment0.pay((double) 'a', user32);
        model.User user35 = null;
        boolean boolean36 = creditCardPayment0.pay((double) (short) 0, user35);
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
    public void test25689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25689");
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
        boolean boolean21 = creditCardPayment0.pay((double) 0.0f, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((-1.0d), user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) 100, user26);
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay(0.0d, user29);
        model.User user32 = null;
        boolean boolean33 = creditCardPayment0.pay((double) (short) 1, user32);
        model.User user35 = null;
        boolean boolean36 = creditCardPayment0.pay((double) (byte) -1, user35);
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
    public void test25690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25690");
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
        boolean boolean24 = creditCardPayment0.pay((double) (byte) 1, user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay(10.0d, user26);
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay((double) (short) 10, user29);
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
    public void test25691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25691");
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
        boolean boolean27 = creditCardPayment0.pay((double) '#', user26);
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay((double) (short) 0, user29);
        model.User user32 = null;
        boolean boolean33 = creditCardPayment0.pay((double) ' ', user32);
        model.User user35 = null;
        boolean boolean36 = creditCardPayment0.pay((double) 10.0f, user35);
        model.User user38 = null;
        boolean boolean39 = creditCardPayment0.pay((double) 0, user38);
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
    }

    @Test
    public void test25692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25692");
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
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) (byte) 100, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) (short) 100, user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay(1.0d, user26);
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay(0.0d, user29);
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
    public void test25693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25693");
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
        boolean boolean18 = creditCardPayment0.pay(0.0d, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) '4', user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay(10.0d, user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) (short) 100, user26);
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay((double) (-1L), user29);
        model.User user32 = null;
        boolean boolean33 = creditCardPayment0.pay(0.0d, user32);
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
    public void test25694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25694");
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
        boolean boolean21 = creditCardPayment0.pay((double) 100.0f, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) (byte) 10, user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) (byte) -1, user26);
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay((double) (-1L), user29);
        model.User user32 = null;
        boolean boolean33 = creditCardPayment0.pay((double) '4', user32);
        model.User user35 = null;
        boolean boolean36 = creditCardPayment0.pay((double) 'a', user35);
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
    public void test25695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25695");
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
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) (short) 10, user26);
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay((double) (-1.0f), user29);
        model.User user32 = null;
        boolean boolean33 = creditCardPayment0.pay(0.0d, user32);
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
    public void test25696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25696");
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
        model.User user32 = null;
        boolean boolean33 = creditCardPayment0.pay((double) 0, user32);
        model.User user35 = null;
        boolean boolean36 = creditCardPayment0.pay((double) (-1.0f), user35);
        model.User user38 = null;
        boolean boolean39 = creditCardPayment0.pay((-1.0d), user38);
        model.User user41 = null;
        boolean boolean42 = creditCardPayment0.pay(100.0d, user41);
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
    public void test25697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25697");
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
        boolean boolean36 = creditCardPayment0.pay((double) (byte) 1, user35);
        model.User user38 = null;
        boolean boolean39 = creditCardPayment0.pay((double) 0L, user38);
        model.User user41 = null;
        boolean boolean42 = creditCardPayment0.pay((double) 10, user41);
        model.User user44 = null;
        boolean boolean45 = creditCardPayment0.pay(0.0d, user44);
        model.User user47 = null;
        boolean boolean48 = creditCardPayment0.pay((double) (byte) 1, user47);
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
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
    }

    @Test
    public void test25698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25698");
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
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) '#', user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) 100L, user26);
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay((double) '#', user29);
        model.User user32 = null;
        boolean boolean33 = creditCardPayment0.pay((double) (byte) 1, user32);
        model.User user35 = null;
        boolean boolean36 = creditCardPayment0.pay((double) (byte) -1, user35);
        model.User user38 = null;
        boolean boolean39 = creditCardPayment0.pay((double) 0L, user38);
        model.User user41 = null;
        boolean boolean42 = creditCardPayment0.pay((double) (-1), user41);
        model.User user44 = null;
        boolean boolean45 = creditCardPayment0.pay((double) 0.0f, user44);
        model.User user47 = null;
        boolean boolean48 = creditCardPayment0.pay(0.0d, user47);
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
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
    }

    @Test
    public void test25699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25699");
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
        boolean boolean21 = creditCardPayment0.pay((double) 10.0f, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) (byte) 0, user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) 0.0f, user26);
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay((double) (-1L), user29);
        model.User user32 = null;
        boolean boolean33 = creditCardPayment0.pay((double) 1.0f, user32);
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
    public void test25700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25700");
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
        boolean boolean18 = creditCardPayment0.pay((double) (-1L), user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) 1.0f, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) (byte) 0, user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) (byte) 1, user26);
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay((double) 'a', user29);
        model.User user32 = null;
        boolean boolean33 = creditCardPayment0.pay((double) (short) 100, user32);
        model.User user35 = null;
        boolean boolean36 = creditCardPayment0.pay((double) (byte) 0, user35);
        model.User user38 = null;
        boolean boolean39 = creditCardPayment0.pay((double) (short) 100, user38);
        model.User user41 = null;
        boolean boolean42 = creditCardPayment0.pay(0.0d, user41);
        model.User user44 = null;
        boolean boolean45 = creditCardPayment0.pay((double) 1L, user44);
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
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
    }

    @Test
    public void test25701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25701");
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
    public void test25702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25702");
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
        boolean boolean18 = creditCardPayment0.pay((double) ' ', user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((-1.0d), user20);
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
    public void test25703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25703");
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
        boolean boolean21 = creditCardPayment0.pay((double) (-1L), user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) 0.0f, user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) (short) -1, user26);
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay((double) (short) 10, user29);
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
    public void test25704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25704");
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
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) (-1L), user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) (byte) 0, user26);
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay((double) (byte) 100, user29);
        model.User user32 = null;
        boolean boolean33 = creditCardPayment0.pay((double) (-1), user32);
        model.User user35 = null;
        boolean boolean36 = creditCardPayment0.pay((double) ' ', user35);
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
    public void test25705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25705");
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
        boolean boolean24 = creditCardPayment0.pay((double) ' ', user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) (short) 1, user26);
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay((double) 100, user29);
        model.User user32 = null;
        boolean boolean33 = creditCardPayment0.pay((double) (byte) 0, user32);
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
    public void test25706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25706");
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
        boolean boolean21 = creditCardPayment0.pay(1.0d, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay(10.0d, user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) 0, user26);
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
    public void test25707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25707");
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
        boolean boolean21 = creditCardPayment0.pay((double) (byte) 1, user20);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test25708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25708");
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
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) 10, user20);
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
    public void test25709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25709");
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
        boolean boolean30 = creditCardPayment0.pay((double) (byte) 10, user29);
        model.User user32 = null;
        boolean boolean33 = creditCardPayment0.pay((double) '4', user32);
        model.User user35 = null;
        boolean boolean36 = creditCardPayment0.pay((double) (short) 10, user35);
        model.User user38 = null;
        boolean boolean39 = creditCardPayment0.pay((double) (byte) 0, user38);
        model.User user41 = null;
        boolean boolean42 = creditCardPayment0.pay((double) ' ', user41);
        model.User user44 = null;
        boolean boolean45 = creditCardPayment0.pay((double) '#', user44);
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
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
    }

    @Test
    public void test25710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25710");
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
        boolean boolean18 = creditCardPayment0.pay((double) 10, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) 0, user20);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test25711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25711");
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
        boolean boolean24 = creditCardPayment0.pay((double) 0L, user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) 10.0f, user26);
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay((double) 0, user29);
        model.User user32 = null;
        boolean boolean33 = creditCardPayment0.pay(1.0d, user32);
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
    public void test25712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25712");
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
        boolean boolean21 = creditCardPayment0.pay((double) (short) -1, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) (-1.0f), user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) (short) 100, user26);
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
    public void test25713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25713");
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
        boolean boolean21 = creditCardPayment0.pay((double) 100L, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) (-1L), user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) 10L, user26);
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay((double) (short) -1, user29);
        model.User user32 = null;
        boolean boolean33 = creditCardPayment0.pay((double) ' ', user32);
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
    public void test25714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25714");
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
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay((double) (byte) -1, user29);
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
    public void test25715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25715");
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
        boolean boolean27 = creditCardPayment0.pay((double) 10.0f, user26);
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay((double) 0L, user29);
        model.User user32 = null;
        boolean boolean33 = creditCardPayment0.pay((-1.0d), user32);
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
    public void test25716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25716");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (-1.0f), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) (byte) 0, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(0.0d, user8);
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
    public void test25717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25717");
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
        boolean boolean18 = creditCardPayment0.pay((double) 100, user17);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test25718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25718");
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
        boolean boolean21 = creditCardPayment0.pay((double) '#', user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay(1.0d, user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) 10L, user26);
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay((double) (byte) 0, user29);
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
    public void test25719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25719");
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
        boolean boolean15 = creditCardPayment0.pay((double) (short) 0, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 10L, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) (-1.0f), user20);
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
    public void test25720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25720");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 100.0f, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((-1.0d), user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay(0.0d, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) ' ', user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 10L, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) 1L, user20);
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
    public void test25721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest51.test25721");
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
        boolean boolean24 = creditCardPayment0.pay((double) ' ', user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) (byte) 0, user26);
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay((double) 100, user29);
        model.User user32 = null;
        boolean boolean33 = creditCardPayment0.pay((double) (short) 100, user32);
        model.User user35 = null;
        boolean boolean36 = creditCardPayment0.pay((double) 0.0f, user35);
        model.User user38 = null;
        boolean boolean39 = creditCardPayment0.pay((double) 10.0f, user38);
        model.User user41 = null;
        boolean boolean42 = creditCardPayment0.pay((double) 1, user41);
        model.User user44 = null;
        boolean boolean45 = creditCardPayment0.pay((double) (short) 100, user44);
        model.User user47 = null;
        boolean boolean48 = creditCardPayment0.pay(100.0d, user47);
        model.User user50 = null;
        boolean boolean51 = creditCardPayment0.pay(100.0d, user50);
        model.User user53 = null;
        boolean boolean54 = creditCardPayment0.pay((double) 0, user53);
        model.User user56 = null;
        boolean boolean57 = creditCardPayment0.pay((double) 100L, user56);
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
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
    }
}

