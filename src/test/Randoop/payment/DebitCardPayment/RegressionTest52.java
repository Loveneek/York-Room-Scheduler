import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest52 {

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
    public void test26001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26001");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 1, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) '4', user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) 1L, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) 1.0f, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) '4', user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) (byte) 10, user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) (byte) -1, user26);
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay((double) (short) 100, user29);
        java.lang.Class<?> wildcardClass31 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
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
    public void test26002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26002");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 1, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay(100.0d, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) (byte) -1, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) (short) 100, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay(10.0d, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) (-1L), user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay(0.0d, user26);
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay((double) (short) 1, user29);
        model.User user32 = null;
        boolean boolean33 = debitCardPayment0.pay((double) 10L, user32);
        model.User user35 = null;
        boolean boolean36 = debitCardPayment0.pay((double) 0.0f, user35);
        model.User user38 = null;
        boolean boolean39 = debitCardPayment0.pay((double) 1, user38);
        model.User user41 = null;
        boolean boolean42 = debitCardPayment0.pay((double) 10, user41);
        model.User user44 = null;
        boolean boolean45 = debitCardPayment0.pay((double) 100L, user44);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
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
    public void test26003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26003");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) (byte) 10, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (byte) 1, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (-1L), user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) '4', user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay(0.0d, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) '4', user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay(10.0d, user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) (short) 100, user26);
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay((double) 100, user29);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
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
    public void test26004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26004");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (-1), user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) '#', user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) 10, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay(0.0d, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((-1.0d), user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) (byte) 0, user23);
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
    public void test26005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26005");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (-1.0f), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) (byte) 0, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (short) 0, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 100.0f, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) '#', user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) 0, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) 1, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) 0, user23);
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
    public void test26006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26006");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay(0.0d, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 10.0f, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay(1.0d, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) 100L, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) 1L, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) (-1.0f), user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) 100.0f, user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) 1.0f, user26);
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay((double) (-1), user29);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
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
    public void test26007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26007");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 0.0f, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (short) 0, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) (byte) 0, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) 100L, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay(100.0d, user20);
        java.lang.Class<?> wildcardClass22 = debitCardPayment0.getClass();
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
    public void test26008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26008");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (-1.0f), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay(10.0d, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 0L, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) '4', user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) (byte) 100, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) ' ', user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) (short) 1, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) 10.0f, user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay(0.0d, user26);
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay((double) (short) 1, user29);
        model.User user32 = null;
        boolean boolean33 = debitCardPayment0.pay((double) 0.0f, user32);
        model.User user35 = null;
        boolean boolean36 = debitCardPayment0.pay((double) 0, user35);
        model.User user38 = null;
        boolean boolean39 = debitCardPayment0.pay((double) 100.0f, user38);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
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
    public void test26009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26009");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) (short) 10, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay(0.0d, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay(0.0d, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) 1.0f, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) (byte) 100, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) ' ', user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay(0.0d, user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay(100.0d, user26);
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay((double) 1L, user29);
        model.User user32 = null;
        boolean boolean33 = debitCardPayment0.pay((double) 10, user32);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
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
    public void test26010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26010");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay(0.0d, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (short) 100, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 10.0f, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay(100.0d, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay(10.0d, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) '#', user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) (short) 1, user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) 10.0f, user26);
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay((double) (byte) 0, user29);
        model.User user32 = null;
        boolean boolean33 = debitCardPayment0.pay(0.0d, user32);
        model.User user35 = null;
        boolean boolean36 = debitCardPayment0.pay((double) '#', user35);
        model.User user38 = null;
        boolean boolean39 = debitCardPayment0.pay((double) '4', user38);
        model.User user41 = null;
        boolean boolean42 = debitCardPayment0.pay((double) (byte) 10, user41);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
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
    public void test26011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26011");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 10L, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (byte) 100, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 10.0f, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) 0L, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) 100L, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) ' ', user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) ' ', user23);
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
    public void test26012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26012");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((-1.0d), user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay(0.0d, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (short) 100, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) 10.0f, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) (byte) -1, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) '4', user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) 100, user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) 1, user26);
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay((double) 10.0f, user29);
        java.lang.Class<?> wildcardClass31 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
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
    public void test26013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26013");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 1, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay(100.0d, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) (byte) -1, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay(10.0d, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) (byte) 1, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) 10L, user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) 1, user26);
        java.lang.Class<?> wildcardClass28 = debitCardPayment0.getClass();
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
    public void test26014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26014");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (short) -1, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) 1, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) (byte) 1, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) 'a', user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) (short) 10, user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) 1L, user26);
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay((double) 1.0f, user29);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
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
    public void test26015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26015");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 10L, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (byte) 100, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 0.0f, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) (byte) 10, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) '4', user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) '4', user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) '4', user23);
        java.lang.Class<?> wildcardClass25 = debitCardPayment0.getClass();
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
    public void test26016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26016");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (-1.0f), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay(10.0d, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 0L, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) '#', user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay(10.0d, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) '#', user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) (short) 100, user20);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test26017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26017");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 1, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay(100.0d, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay(100.0d, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) 1.0f, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay(0.0d, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay(0.0d, user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) 0L, user26);
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay((double) (short) 1, user29);
        java.lang.Class<?> wildcardClass31 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
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
    public void test26018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26018");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((-1.0d), user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay(0.0d, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (short) 100, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) 10.0f, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((-1.0d), user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) 100, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) (-1), user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay(0.0d, user26);
        java.lang.Class<?> wildcardClass28 = debitCardPayment0.getClass();
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
    public void test26019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26019");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) ' ', user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) ' ', user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 100, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay(100.0d, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay(0.0d, user17);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test26020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26020");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) (byte) 10, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (byte) 1, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (-1L), user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) '4', user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay(0.0d, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) (byte) 100, user20);
        java.lang.Class<?> wildcardClass22 = debitCardPayment0.getClass();
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
    public void test26021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26021");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 10L, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 100, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) '#', user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) (short) 1, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) 1.0f, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) (byte) 1, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) 100, user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) 0L, user26);
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay((double) 'a', user29);
        model.User user32 = null;
        boolean boolean33 = debitCardPayment0.pay((double) '#', user32);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
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
    public void test26022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26022");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay(0.0d, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 100, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 1, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) 0L, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) (short) -1, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) 10.0f, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) 0.0f, user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) 10.0f, user26);
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay(100.0d, user29);
        model.User user32 = null;
        boolean boolean33 = debitCardPayment0.pay((double) 1, user32);
        model.User user35 = null;
        boolean boolean36 = debitCardPayment0.pay(0.0d, user35);
        model.User user38 = null;
        boolean boolean39 = debitCardPayment0.pay((double) (-1), user38);
        model.User user41 = null;
        boolean boolean42 = debitCardPayment0.pay((double) (short) 100, user41);
        java.lang.Class<?> wildcardClass43 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
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
    public void test26023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26023");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (short) -1, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) 1, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) (byte) 0, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) (short) 0, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) 0L, user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay(0.0d, user26);
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay((double) 100L, user29);
        model.User user32 = null;
        boolean boolean33 = debitCardPayment0.pay((double) 10L, user32);
        model.User user35 = null;
        boolean boolean36 = debitCardPayment0.pay((-1.0d), user35);
        model.User user38 = null;
        boolean boolean39 = debitCardPayment0.pay((double) 1.0f, user38);
        model.User user41 = null;
        boolean boolean42 = debitCardPayment0.pay((double) 100.0f, user41);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
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
    public void test26024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26024");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 1, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 100L, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) (short) 1, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay(1.0d, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) ' ', user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) 100.0f, user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) 0, user26);
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay((double) 100.0f, user29);
        java.lang.Class<?> wildcardClass31 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
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
    public void test26025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26025");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) (-1L), user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 10, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (byte) 1, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) (byte) -1, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) (short) 0, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) 1, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) 100.0f, user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) (-1.0f), user26);
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay((double) '#', user29);
        model.User user32 = null;
        boolean boolean33 = debitCardPayment0.pay((double) (byte) -1, user32);
        java.lang.Class<?> wildcardClass34 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
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
    public void test26026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26026");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 1, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay(100.0d, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) (byte) -1, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay(1.0d, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((-1.0d), user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) (-1.0f), user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) 10L, user26);
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay(100.0d, user29);
        model.User user32 = null;
        boolean boolean33 = debitCardPayment0.pay((double) 1.0f, user32);
        model.User user35 = null;
        boolean boolean36 = debitCardPayment0.pay((double) (short) 100, user35);
        model.User user38 = null;
        boolean boolean39 = debitCardPayment0.pay(10.0d, user38);
        model.User user41 = null;
        boolean boolean42 = debitCardPayment0.pay((double) (short) -1, user41);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
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
    public void test26027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26027");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) (byte) 10, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (byte) 1, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (-1L), user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) (byte) 1, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay(0.0d, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) 10L, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) 10L, user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) 0, user26);
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay((double) (short) 1, user29);
        model.User user32 = null;
        boolean boolean33 = debitCardPayment0.pay((double) 'a', user32);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
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
    public void test26028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26028");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) ' ', user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) ' ', user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (byte) 1, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) 0, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) (byte) -1, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) ' ', user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) (short) 10, user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) ' ', user26);
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay((double) (byte) 10, user29);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
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
    public void test26029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26029");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) (byte) 10, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 10L, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 100, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay(0.0d, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) (-1L), user17);
        java.lang.Class<?> wildcardClass19 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test26030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26030");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) '#', user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) '4', user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 10.0f, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) (short) 1, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) (short) 10, user17);
        java.lang.Class<?> wildcardClass19 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test26031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26031");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay(0.0d, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) (-1.0f), user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) (byte) 1, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) 10, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay(0.0d, user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) 1L, user26);
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay((double) 0, user29);
        model.User user32 = null;
        boolean boolean33 = debitCardPayment0.pay((double) 1, user32);
        java.lang.Class<?> wildcardClass34 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
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
    public void test26032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26032");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) (byte) 10, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (byte) 1, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (-1.0f), user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) 1.0f, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) (-1L), user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) (-1.0f), user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) 100, user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) (byte) -1, user26);
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay(0.0d, user29);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
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
    public void test26033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26033");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay(0.0d, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 10.0f, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (byte) 0, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) (-1), user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) (-1.0f), user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) 1, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) 0.0f, user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) 10, user26);
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay((double) (short) 0, user29);
        java.lang.Class<?> wildcardClass31 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
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
    public void test26034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26034");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 100L, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 'a', user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) (short) -1, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) (short) 100, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) 100.0f, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) 0.0f, user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay(0.0d, user26);
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay((double) 0L, user29);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
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
    public void test26035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26035");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 100L, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 'a', user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) 'a', user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) 10, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay(1.0d, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) 100L, user23);
        java.lang.Class<?> wildcardClass25 = debitCardPayment0.getClass();
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
    public void test26036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26036");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 10L, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (byte) -1, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay(100.0d, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) (-1L), user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) 100, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) '4', user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay(1.0d, user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay(10.0d, user26);
        java.lang.Class<?> wildcardClass28 = debitCardPayment0.getClass();
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
    public void test26037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26037");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay(0.0d, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) (-1.0f), user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) (byte) 1, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay(0.0d, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) (short) 0, user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) (byte) 10, user26);
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay((double) 100, user29);
        model.User user32 = null;
        boolean boolean33 = debitCardPayment0.pay((double) '4', user32);
        java.lang.Class<?> wildcardClass34 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
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
    public void test26038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26038");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 10L, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (byte) -1, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay(0.0d, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay(10.0d, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) 0.0f, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) (short) 10, user20);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test26039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26039");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 100L, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay(100.0d, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) 1L, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) ' ', user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) 100.0f, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) (byte) 10, user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) (byte) -1, user26);
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay((double) (-1L), user29);
        model.User user32 = null;
        boolean boolean33 = debitCardPayment0.pay((double) '4', user32);
        model.User user35 = null;
        boolean boolean36 = debitCardPayment0.pay((double) (byte) 100, user35);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
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
    public void test26040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26040");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (short) -1, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) 1, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) (byte) 0, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) (short) 0, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) 0L, user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay(0.0d, user26);
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay((double) (short) 10, user29);
        model.User user32 = null;
        boolean boolean33 = debitCardPayment0.pay((double) 10L, user32);
        model.User user35 = null;
        boolean boolean36 = debitCardPayment0.pay((double) 0.0f, user35);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
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
    public void test26041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26041");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (-1.0f), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay(10.0d, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 10.0f, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (byte) 10, user11);
        java.lang.Class<?> wildcardClass13 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test26042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26042");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (-1.0f), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) (byte) 0, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (short) 0, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (byte) 1, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) (byte) -1, user14);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test26043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26043");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) (-1L), user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 10, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (byte) 1, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) (byte) -1, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) 100.0f, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) 0.0f, user20);
        java.lang.Class<?> wildcardClass22 = debitCardPayment0.getClass();
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
    public void test26044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26044");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 10L, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 100, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) '#', user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) (short) 1, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) 1.0f, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) (-1L), user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) (byte) 0, user23);
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
    public void test26045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26045");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (-1.0f), user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) 0.0f, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) (short) 10, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) (-1L), user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((-1.0d), user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) ' ', user26);
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
    public void test26046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26046");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 1L, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) (short) 0, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) (-1L), user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) 100, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay(100.0d, user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) (byte) 100, user26);
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay(1.0d, user29);
        model.User user32 = null;
        boolean boolean33 = debitCardPayment0.pay((double) 100L, user32);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
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
    public void test26047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26047");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 1, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) '4', user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) 1L, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) 1.0f, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) (byte) 100, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) (short) -1, user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) (short) 1, user26);
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay((double) (byte) 1, user29);
        model.User user32 = null;
        boolean boolean33 = debitCardPayment0.pay(0.0d, user32);
        java.lang.Class<?> wildcardClass34 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
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
    public void test26048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26048");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 10L, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (byte) 100, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (byte) 100, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) 0L, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) 0L, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) 1, user20);
        java.lang.Class<?> wildcardClass22 = debitCardPayment0.getClass();
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
    public void test26049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26049");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (short) -1, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) 1, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) (byte) 0, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) (short) 0, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) 0L, user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay(0.0d, user26);
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay((double) 100L, user29);
        model.User user32 = null;
        boolean boolean33 = debitCardPayment0.pay((double) 10L, user32);
        model.User user35 = null;
        boolean boolean36 = debitCardPayment0.pay((-1.0d), user35);
        model.User user38 = null;
        boolean boolean39 = debitCardPayment0.pay((double) 1.0f, user38);
        model.User user41 = null;
        boolean boolean42 = debitCardPayment0.pay((double) (short) 1, user41);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
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
    public void test26050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26050");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (-1.0f), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) (byte) 0, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay(10.0d, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (short) -1, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) (byte) 10, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay(10.0d, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) ' ', user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) (byte) 10, user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) '#', user26);
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay((double) 1.0f, user29);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
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
    public void test26051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26051");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((-1.0d), user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay(0.0d, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (short) 100, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) 10.0f, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) 100.0f, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay(0.0d, user20);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test26052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26052");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay(0.0d, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (short) 100, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 10.0f, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) 0L, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay(0.0d, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) 1L, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) (byte) 10, user23);
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
    public void test26053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26053");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (byte) 1, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (byte) 1, user11);
        java.lang.Class<?> wildcardClass13 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test26054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26054");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 0.0f, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (short) -1, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 1.0f, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) 100, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) (short) 100, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) '#', user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) (-1.0f), user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) (byte) 100, user26);
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay((double) 10.0f, user29);
        model.User user32 = null;
        boolean boolean33 = debitCardPayment0.pay((double) (-1), user32);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
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
    public void test26055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26055");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay(0.0d, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay(1.0d, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (short) -1, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) (short) 1, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) 1.0f, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) 0.0f, user20);
        java.lang.Class<?> wildcardClass22 = debitCardPayment0.getClass();
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
    public void test26056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26056");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) (byte) 10, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (byte) 100, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (-1L), user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) 1.0f, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay(10.0d, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay(10.0d, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay(0.0d, user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) '#', user26);
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay(100.0d, user29);
        model.User user32 = null;
        boolean boolean33 = debitCardPayment0.pay((double) (short) -1, user32);
        model.User user35 = null;
        boolean boolean36 = debitCardPayment0.pay((double) 10, user35);
        java.lang.Class<?> wildcardClass37 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
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
    public void test26057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26057");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 10L, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay(0.0d, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 1, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) (-1), user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) 100L, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) 10L, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) 1.0f, user23);
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
    public void test26058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26058");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 100L, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 'a', user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) (short) -1, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) (short) 100, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) '#', user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) (short) 100, user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay(0.0d, user26);
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay((double) (short) 1, user29);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
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
    public void test26059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26059");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (byte) -1, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) '4', user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) (byte) -1, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) (short) 1, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) (byte) 1, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) (byte) 0, user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) (byte) 10, user26);
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay((double) (short) -1, user29);
        model.User user32 = null;
        boolean boolean33 = debitCardPayment0.pay((double) 1L, user32);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
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
    public void test26060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26060");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 0.0f, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (short) -1, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (-1L), user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) '#', user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) '4', user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay(1.0d, user20);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test26061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26061");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) (-1L), user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 10, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 0.0f, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) 'a', user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) 0L, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) (-1.0f), user20);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test26062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26062");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay(0.0d, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 10.0f, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay(1.0d, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) (-1.0f), user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) 0L, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay(0.0d, user20);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test26063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26063");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((-1.0d), user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay(0.0d, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay(0.0d, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) 1, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay(100.0d, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay(0.0d, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) 0L, user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) (short) 10, user26);
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay((double) 0L, user29);
        model.User user32 = null;
        boolean boolean33 = debitCardPayment0.pay((double) 10, user32);
        model.User user35 = null;
        boolean boolean36 = debitCardPayment0.pay((double) '4', user35);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
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
    public void test26064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26064");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 10L, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) (short) 1, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay(0.0d, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) (short) 1, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) 1L, user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) '#', user26);
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay((double) (short) 10, user29);
        model.User user32 = null;
        boolean boolean33 = debitCardPayment0.pay((double) 10, user32);
        model.User user35 = null;
        boolean boolean36 = debitCardPayment0.pay((double) 0L, user35);
        model.User user38 = null;
        boolean boolean39 = debitCardPayment0.pay(10.0d, user38);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
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
    public void test26065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26065");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (-1.0f), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay(10.0d, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 0L, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) '4', user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay(0.0d, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay(0.0d, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) 1L, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) 1L, user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) (short) 100, user26);
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay((double) (-1), user29);
        model.User user32 = null;
        boolean boolean33 = debitCardPayment0.pay((double) (-1.0f), user32);
        model.User user35 = null;
        boolean boolean36 = debitCardPayment0.pay(10.0d, user35);
        java.lang.Class<?> wildcardClass37 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
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
    public void test26066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26066");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (-1.0f), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay(10.0d, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 0L, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 1.0f, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) (short) 1, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) 0, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) (short) 100, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) 0L, user23);
        java.lang.Class<?> wildcardClass25 = debitCardPayment0.getClass();
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
    public void test26067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26067");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay(0.0d, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (short) 100, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 0.0f, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((-1.0d), user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) 0L, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) (byte) 100, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) (byte) 1, user23);
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
    public void test26068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26068");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 1, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 100L, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) 1, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) (short) -1, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) '#', user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) (short) 0, user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) (-1L), user26);
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay((double) (byte) 0, user29);
        model.User user32 = null;
        boolean boolean33 = debitCardPayment0.pay((double) 10.0f, user32);
        model.User user35 = null;
        boolean boolean36 = debitCardPayment0.pay((double) (byte) -1, user35);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
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
    public void test26069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26069");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((-1.0d), user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay(0.0d, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (short) 100, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) (byte) -1, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) 10.0f, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay(0.0d, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay(0.0d, user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) 0.0f, user26);
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay((double) (-1), user29);
        model.User user32 = null;
        boolean boolean33 = debitCardPayment0.pay((double) '#', user32);
        model.User user35 = null;
        boolean boolean36 = debitCardPayment0.pay((double) (-1L), user35);
        model.User user38 = null;
        boolean boolean39 = debitCardPayment0.pay((double) 0, user38);
        model.User user41 = null;
        boolean boolean42 = debitCardPayment0.pay((double) '4', user41);
        model.User user44 = null;
        boolean boolean45 = debitCardPayment0.pay((double) (-1L), user44);
        java.lang.Class<?> wildcardClass46 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
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
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test26070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26070");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) (short) 10, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (byte) 1, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 0L, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) (short) -1, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) (-1), user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) '4', user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) 1, user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) 10L, user26);
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay((double) (short) 0, user29);
        model.User user32 = null;
        boolean boolean33 = debitCardPayment0.pay((double) (byte) 0, user32);
        java.lang.Class<?> wildcardClass34 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
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
    public void test26071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26071");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 0.0f, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (short) -1, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 1.0f, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) 100, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) (short) 100, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) '#', user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay(0.0d, user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay(100.0d, user26);
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay((double) (byte) 0, user29);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
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
    public void test26072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26072");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (-1.0f), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay(0.0d, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 0.0f, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (short) 100, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) (byte) 100, user14);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test26073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26073");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((-1.0d), user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay(0.0d, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (short) 100, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) (byte) -1, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) 10.0f, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay(0.0d, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay(0.0d, user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) 0.0f, user26);
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay((double) (-1), user29);
        model.User user32 = null;
        boolean boolean33 = debitCardPayment0.pay((double) '#', user32);
        model.User user35 = null;
        boolean boolean36 = debitCardPayment0.pay(0.0d, user35);
        model.User user38 = null;
        boolean boolean39 = debitCardPayment0.pay(100.0d, user38);
        model.User user41 = null;
        boolean boolean42 = debitCardPayment0.pay((double) (byte) 0, user41);
        model.User user44 = null;
        boolean boolean45 = debitCardPayment0.pay((double) 1, user44);
        model.User user47 = null;
        boolean boolean48 = debitCardPayment0.pay(100.0d, user47);
        model.User user50 = null;
        boolean boolean51 = debitCardPayment0.pay((double) 1L, user50);
        model.User user53 = null;
        boolean boolean54 = debitCardPayment0.pay(100.0d, user53);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
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
    }

    @Test
    public void test26074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26074");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) (byte) 10, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (byte) 1, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (-1L), user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((-1.0d), user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) ' ', user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) (byte) 10, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) (-1.0f), user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) 'a', user26);
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay(100.0d, user29);
        model.User user32 = null;
        boolean boolean33 = debitCardPayment0.pay(0.0d, user32);
        model.User user35 = null;
        boolean boolean36 = debitCardPayment0.pay((-1.0d), user35);
        model.User user38 = null;
        boolean boolean39 = debitCardPayment0.pay((double) (short) 10, user38);
        model.User user41 = null;
        boolean boolean42 = debitCardPayment0.pay((double) (short) 10, user41);
        java.lang.Class<?> wildcardClass43 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
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
    public void test26075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26075");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (short) 100, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) '4', user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) 100L, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) (short) 1, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) 1L, user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) (short) -1, user26);
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay((double) 'a', user29);
        model.User user32 = null;
        boolean boolean33 = debitCardPayment0.pay((double) '#', user32);
        model.User user35 = null;
        boolean boolean36 = debitCardPayment0.pay((double) 100, user35);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
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
    public void test26076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26076");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay(0.0d, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) (-1.0f), user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) (byte) 1, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay(0.0d, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) (short) 0, user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) 1.0f, user26);
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay((double) (byte) 10, user29);
        model.User user32 = null;
        boolean boolean33 = debitCardPayment0.pay((double) 1.0f, user32);
        model.User user35 = null;
        boolean boolean36 = debitCardPayment0.pay((double) (short) 10, user35);
        model.User user38 = null;
        boolean boolean39 = debitCardPayment0.pay((double) 10.0f, user38);
        model.User user41 = null;
        boolean boolean42 = debitCardPayment0.pay((double) 'a', user41);
        java.lang.Class<?> wildcardClass43 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
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
    public void test26077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26077");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((-1.0d), user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 100, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (-1), user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) 'a', user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((-1.0d), user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) (short) -1, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) '4', user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) 1.0f, user26);
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay((double) 1.0f, user29);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
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
    public void test26078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26078");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) (-1L), user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 10, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (byte) 1, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) (byte) -1, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) (-1.0f), user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) '#', user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay(10.0d, user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) 0.0f, user26);
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
    public void test26079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26079");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 1, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) '4', user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay(1.0d, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) (byte) 10, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) 10L, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) (short) 100, user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) (byte) 1, user26);
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay((double) (byte) -1, user29);
        model.User user32 = null;
        boolean boolean33 = debitCardPayment0.pay((double) (short) -1, user32);
        model.User user35 = null;
        boolean boolean36 = debitCardPayment0.pay((-1.0d), user35);
        model.User user38 = null;
        boolean boolean39 = debitCardPayment0.pay((double) (short) 100, user38);
        model.User user41 = null;
        boolean boolean42 = debitCardPayment0.pay((double) (short) 0, user41);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
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
    public void test26080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26080");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 100L, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 'a', user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay(10.0d, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) (short) 0, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) (byte) 0, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) (short) 0, user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay(0.0d, user26);
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay((double) 0.0f, user29);
        model.User user32 = null;
        boolean boolean33 = debitCardPayment0.pay((double) (-1L), user32);
        model.User user35 = null;
        boolean boolean36 = debitCardPayment0.pay((double) '4', user35);
        java.lang.Class<?> wildcardClass37 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
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
    public void test26081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26081");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 1L, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) (short) 0, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((-1.0d), user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay(1.0d, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) (short) 1, user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) (-1), user26);
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay((double) '#', user29);
        model.User user32 = null;
        boolean boolean33 = debitCardPayment0.pay((double) 1, user32);
        model.User user35 = null;
        boolean boolean36 = debitCardPayment0.pay(1.0d, user35);
        model.User user38 = null;
        boolean boolean39 = debitCardPayment0.pay((double) 'a', user38);
        model.User user41 = null;
        boolean boolean42 = debitCardPayment0.pay((double) 10L, user41);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
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
    public void test26082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26082");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 10L, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (byte) -1, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (byte) 0, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay(10.0d, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay(1.0d, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay(0.0d, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) (byte) 10, user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay(10.0d, user26);
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay((double) 1, user29);
        model.User user32 = null;
        boolean boolean33 = debitCardPayment0.pay((double) (-1), user32);
        java.lang.Class<?> wildcardClass34 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
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
    public void test26083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26083");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay(0.0d, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) 0L, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) 1.0f, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) (short) 10, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) 10, user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) 0L, user26);
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
    public void test26084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26084");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay(0.0d, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (byte) -1, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (-1.0f), user11);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test26085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26085");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((-1.0d), user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 0, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) (byte) 1, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) 10, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) 0.0f, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((-1.0d), user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay(10.0d, user26);
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay((double) (short) -1, user29);
        model.User user32 = null;
        boolean boolean33 = debitCardPayment0.pay((double) (byte) 100, user32);
        model.User user35 = null;
        boolean boolean36 = debitCardPayment0.pay((double) 1, user35);
        java.lang.Class<?> wildcardClass37 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
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
    public void test26086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26086");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (-1.0f), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay(10.0d, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (byte) 100, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 1L, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) (short) 10, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) ' ', user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay(0.0d, user20);
        java.lang.Class<?> wildcardClass22 = debitCardPayment0.getClass();
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
    public void test26087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26087");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((-1.0d), user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay(0.0d, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 'a', user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay(1.0d, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) 10L, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay(100.0d, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((-1.0d), user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) (-1), user26);
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay((double) (-1), user29);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
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
    public void test26088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26088");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((-1.0d), user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay(0.0d, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (short) -1, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) 'a', user14);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test26089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26089");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((-1.0d), user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay(0.0d, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (short) 100, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) (byte) -1, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) 10.0f, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) (byte) 100, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) (short) 1, user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) (short) 0, user26);
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay((double) (short) 10, user29);
        java.lang.Class<?> wildcardClass31 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
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
    public void test26090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26090");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 10L, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 100, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay(10.0d, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay(0.0d, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) 1, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay(1.0d, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) (-1.0f), user23);
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
    public void test26091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26091");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay(0.0d, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay(1.0d, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (short) -1, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) (-1.0f), user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) 0L, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) 1L, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) (short) 1, user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((-1.0d), user26);
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay((double) 100L, user29);
        model.User user32 = null;
        boolean boolean33 = debitCardPayment0.pay((double) (-1.0f), user32);
        java.lang.Class<?> wildcardClass34 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
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
    public void test26092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26092");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 100L, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 'a', user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) (short) -1, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) (short) 0, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) (byte) -1, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) 'a', user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) (-1L), user26);
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay((double) ' ', user29);
        model.User user32 = null;
        boolean boolean33 = debitCardPayment0.pay((double) (byte) 100, user32);
        model.User user35 = null;
        boolean boolean36 = debitCardPayment0.pay((double) (short) 100, user35);
        model.User user38 = null;
        boolean boolean39 = debitCardPayment0.pay((double) 10.0f, user38);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
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
    public void test26093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26093");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) (byte) 10, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (byte) 100, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (byte) 100, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) 10, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) 1L, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) 10L, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) (short) 10, user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) '#', user26);
        java.lang.Class<?> wildcardClass28 = debitCardPayment0.getClass();
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
    public void test26094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26094");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 100L, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 'a', user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) (short) -1, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) (short) 100, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) 100.0f, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) (byte) 10, user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) 0.0f, user26);
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay((double) (-1), user29);
        model.User user32 = null;
        boolean boolean33 = debitCardPayment0.pay((double) (byte) 1, user32);
        model.User user35 = null;
        boolean boolean36 = debitCardPayment0.pay(0.0d, user35);
        model.User user38 = null;
        boolean boolean39 = debitCardPayment0.pay((double) 10L, user38);
        model.User user41 = null;
        boolean boolean42 = debitCardPayment0.pay(0.0d, user41);
        model.User user44 = null;
        boolean boolean45 = debitCardPayment0.pay((double) 100.0f, user44);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
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
    public void test26095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26095");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 1, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay(100.0d, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) (byte) -1, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) (short) 100, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay(10.0d, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) (-1L), user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) 100, user26);
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay((double) 10, user29);
        model.User user32 = null;
        boolean boolean33 = debitCardPayment0.pay(1.0d, user32);
        model.User user35 = null;
        boolean boolean36 = debitCardPayment0.pay((double) (byte) -1, user35);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
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
    public void test26096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26096");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 100L, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay(100.0d, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) 1L, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) 10, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) (byte) 0, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) 10, user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) (short) 100, user26);
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay(0.0d, user29);
        model.User user32 = null;
        boolean boolean33 = debitCardPayment0.pay((double) (short) 0, user32);
        model.User user35 = null;
        boolean boolean36 = debitCardPayment0.pay((double) 10, user35);
        model.User user38 = null;
        boolean boolean39 = debitCardPayment0.pay((double) 1L, user38);
        model.User user41 = null;
        boolean boolean42 = debitCardPayment0.pay((double) 10, user41);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
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
    public void test26097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26097");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (short) 100, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) '4', user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) 100L, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay(1.0d, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay(10.0d, user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) (byte) 1, user26);
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay((double) (byte) 1, user29);
        model.User user32 = null;
        boolean boolean33 = debitCardPayment0.pay((double) (-1), user32);
        model.User user35 = null;
        boolean boolean36 = debitCardPayment0.pay(0.0d, user35);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
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
    public void test26098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26098");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay(0.0d, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 100, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 1, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) 0L, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) (short) 0, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) (byte) 0, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) 100L, user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) '#', user26);
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay((double) 1.0f, user29);
        model.User user32 = null;
        boolean boolean33 = debitCardPayment0.pay((double) 10, user32);
        model.User user35 = null;
        boolean boolean36 = debitCardPayment0.pay(0.0d, user35);
        model.User user38 = null;
        boolean boolean39 = debitCardPayment0.pay(0.0d, user38);
        model.User user41 = null;
        boolean boolean42 = debitCardPayment0.pay(100.0d, user41);
        model.User user44 = null;
        boolean boolean45 = debitCardPayment0.pay((double) ' ', user44);
        model.User user47 = null;
        boolean boolean48 = debitCardPayment0.pay((double) (short) 1, user47);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
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
    public void test26099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26099");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 10L, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (byte) 100, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 10.0f, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) 0L, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((-1.0d), user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) (-1.0f), user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay(0.0d, user23);
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
    public void test26100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26100");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 10L, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 100L, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay(0.0d, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) 1L, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) (short) 0, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) (short) -1, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) (byte) 0, user23);
        java.lang.Class<?> wildcardClass25 = debitCardPayment0.getClass();
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
    public void test26101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26101");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 10L, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay(0.0d, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 0.0f, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) (-1.0f), user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) 10L, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) '#', user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) (byte) 100, user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) 0L, user26);
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay((double) 1, user29);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
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
    public void test26102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26102");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (-1.0f), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay(10.0d, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 0L, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) '4', user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) (byte) 100, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) ' ', user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) (short) 1, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) 0.0f, user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) (short) 0, user26);
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay(10.0d, user29);
        model.User user32 = null;
        boolean boolean33 = debitCardPayment0.pay(1.0d, user32);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
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
    public void test26103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26103");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) (short) 10, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay(0.0d, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 100.0f, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) 1, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) 0.0f, user17);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test26104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26104");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) (byte) 10, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (byte) 100, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (byte) 100, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay(1.0d, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) 100, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) (short) 10, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) (byte) 1, user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) (-1), user26);
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay(10.0d, user29);
        model.User user32 = null;
        boolean boolean33 = debitCardPayment0.pay((double) 10.0f, user32);
        java.lang.Class<?> wildcardClass34 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
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
    public void test26105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26105");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 10L, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (byte) -1, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (byte) 0, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) 100L, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) (short) -1, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay(0.0d, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) (byte) 0, user23);
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
    public void test26106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26106");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((-1.0d), user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay(0.0d, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 'a', user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay(1.0d, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) (-1), user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) (-1), user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) 0, user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) (byte) 1, user26);
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay((double) (byte) 100, user29);
        model.User user32 = null;
        boolean boolean33 = debitCardPayment0.pay((-1.0d), user32);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
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
    public void test26107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26107");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 100L, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 'a', user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) (short) -1, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) (short) 100, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) 100.0f, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) (byte) 10, user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) (short) 100, user26);
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay((double) 10.0f, user29);
        model.User user32 = null;
        boolean boolean33 = debitCardPayment0.pay((double) 0.0f, user32);
        model.User user35 = null;
        boolean boolean36 = debitCardPayment0.pay(0.0d, user35);
        model.User user38 = null;
        boolean boolean39 = debitCardPayment0.pay((double) (short) 0, user38);
        model.User user41 = null;
        boolean boolean42 = debitCardPayment0.pay(1.0d, user41);
        java.lang.Class<?> wildcardClass43 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
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
    public void test26108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26108");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 1L, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) (byte) 100, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) 0.0f, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay(0.0d, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) 1L, user23);
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
    public void test26109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26109");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 0.0f, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (short) -1, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) '4', user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) 1, user14);
        java.lang.Class<?> wildcardClass16 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test26110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26110");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 1, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay(100.0d, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) (byte) -1, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) (short) 100, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) (short) 100, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay(0.0d, user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) (byte) 0, user26);
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay((double) 0, user29);
        model.User user32 = null;
        boolean boolean33 = debitCardPayment0.pay((double) 1.0f, user32);
        model.User user35 = null;
        boolean boolean36 = debitCardPayment0.pay((double) 10, user35);
        model.User user38 = null;
        boolean boolean39 = debitCardPayment0.pay((double) (short) 0, user38);
        model.User user41 = null;
        boolean boolean42 = debitCardPayment0.pay((double) 100.0f, user41);
        model.User user44 = null;
        boolean boolean45 = debitCardPayment0.pay((double) (short) 10, user44);
        model.User user47 = null;
        boolean boolean48 = debitCardPayment0.pay((double) '#', user47);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
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
    public void test26111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26111");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) (byte) 10, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (byte) 1, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (-1L), user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) '4', user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) (-1), user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay(0.0d, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) 1.0f, user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) 10.0f, user26);
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay((double) 10, user29);
        model.User user32 = null;
        boolean boolean33 = debitCardPayment0.pay((double) 0, user32);
        model.User user35 = null;
        boolean boolean36 = debitCardPayment0.pay((double) (short) 1, user35);
        model.User user38 = null;
        boolean boolean39 = debitCardPayment0.pay((double) ' ', user38);
        model.User user41 = null;
        boolean boolean42 = debitCardPayment0.pay((double) 1, user41);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
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
    public void test26112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26112");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay(0.0d, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay(1.0d, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (short) -1, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) (-1.0f), user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) 1.0f, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) '#', user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) (-1), user23);
        java.lang.Class<?> wildcardClass25 = debitCardPayment0.getClass();
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
    public void test26113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26113");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) (-1.0f), user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (short) 10, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 100L, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) 10L, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) (byte) 10, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) 1.0f, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) '#', user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) 100L, user26);
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay((double) (byte) 10, user29);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
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
    public void test26114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26114");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 0.0f, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (-1.0f), user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) ' ', user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay(0.0d, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) 1, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) 10, user20);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test26115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26115");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (-1.0f), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay(10.0d, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 0L, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) '4', user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) 10.0f, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) 100L, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) 1, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) (short) 100, user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) 100, user26);
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay((-1.0d), user29);
        model.User user32 = null;
        boolean boolean33 = debitCardPayment0.pay((double) 10L, user32);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
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
    public void test26116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26116");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 1, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay(100.0d, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay(100.0d, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) 0L, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) 100.0f, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) 0, user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) 100.0f, user26);
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay((double) 'a', user29);
        model.User user32 = null;
        boolean boolean33 = debitCardPayment0.pay((double) 10.0f, user32);
        model.User user35 = null;
        boolean boolean36 = debitCardPayment0.pay((double) (short) 10, user35);
        model.User user38 = null;
        boolean boolean39 = debitCardPayment0.pay((double) 1, user38);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
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
    public void test26117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26117");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 1, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) '4', user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) 0, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) (-1), user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) 0, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) (byte) 1, user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) (byte) -1, user26);
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
    public void test26118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26118");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 100.0f, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (byte) 0, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (short) -1, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) (-1), user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay(10.0d, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) 100.0f, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) 1L, user23);
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
    public void test26119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26119");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 100L, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay(100.0d, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) 1L, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) (short) 10, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) ' ', user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) 100L, user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay(10.0d, user26);
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay((double) (-1L), user29);
        model.User user32 = null;
        boolean boolean33 = debitCardPayment0.pay((double) 100L, user32);
        java.lang.Class<?> wildcardClass34 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
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
    public void test26120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26120");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay(0.0d, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 10.0f, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay(1.0d, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) 100L, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) ' ', user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay(1.0d, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) '4', user23);
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
    public void test26121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26121");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 0.0f, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (-1.0f), user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) ' ', user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay(0.0d, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) 10L, user17);
        java.lang.Class<?> wildcardClass19 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test26122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26122");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 10L, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (byte) -1, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (byte) 1, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) 0, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) (byte) 100, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) (short) 1, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) (short) 10, user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) (byte) 1, user26);
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay((double) 1L, user29);
        java.lang.Class<?> wildcardClass31 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
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
    public void test26123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26123");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 100L, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay(100.0d, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) 1L, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) ' ', user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) 10L, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) 0, user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) 100.0f, user26);
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay(1.0d, user29);
        model.User user32 = null;
        boolean boolean33 = debitCardPayment0.pay((double) (short) 100, user32);
        java.lang.Class<?> wildcardClass34 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
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
    public void test26124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26124");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (-1.0f), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay(10.0d, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 0L, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) '4', user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) 10.0f, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) 100L, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) 1, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) (short) 100, user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) 100, user26);
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay((double) (-1L), user29);
        model.User user32 = null;
        boolean boolean33 = debitCardPayment0.pay((-1.0d), user32);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
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
    public void test26125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26125");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) (byte) 10, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (byte) 1, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (-1L), user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) '4', user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) 1, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) (-1L), user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay(10.0d, user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) (short) 100, user26);
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay((-1.0d), user29);
        model.User user32 = null;
        boolean boolean33 = debitCardPayment0.pay((double) '4', user32);
        model.User user35 = null;
        boolean boolean36 = debitCardPayment0.pay((double) 100, user35);
        model.User user38 = null;
        boolean boolean39 = debitCardPayment0.pay((double) 0, user38);
        model.User user41 = null;
        boolean boolean42 = debitCardPayment0.pay(1.0d, user41);
        model.User user44 = null;
        boolean boolean45 = debitCardPayment0.pay((double) 'a', user44);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
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
    public void test26126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26126");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 0.0f, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (short) -1, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 1L, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) (byte) 1, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) (byte) 10, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) 1L, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) '#', user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay(0.0d, user26);
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay((double) (byte) 10, user29);
        model.User user32 = null;
        boolean boolean33 = debitCardPayment0.pay((double) 1.0f, user32);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
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
    public void test26127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26127");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay(0.0d, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) '#', user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) (-1L), user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) (-1), user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) '4', user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) 10L, user26);
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay((double) (-1L), user29);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
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
    public void test26128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26128");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((-1.0d), user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (byte) 100, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) (short) 10, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) '#', user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) (-1), user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) 100, user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) 10, user26);
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
    public void test26129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26129");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay(0.0d, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) 0L, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) 100, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) 10.0f, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay(1.0d, user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) (short) 1, user26);
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay((double) 1L, user29);
        model.User user32 = null;
        boolean boolean33 = debitCardPayment0.pay(10.0d, user32);
        model.User user35 = null;
        boolean boolean36 = debitCardPayment0.pay((double) (short) 1, user35);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
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
    public void test26130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26130");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay(0.0d, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (short) 100, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 10.0f, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay(100.0d, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) (-1.0f), user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay(1.0d, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) (short) 10, user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) 0L, user26);
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay((double) (short) 0, user29);
        model.User user32 = null;
        boolean boolean33 = debitCardPayment0.pay((double) (byte) 100, user32);
        model.User user35 = null;
        boolean boolean36 = debitCardPayment0.pay(10.0d, user35);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
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
    public void test26131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26131");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 0.0f, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (-1.0f), user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay(10.0d, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) 10L, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) 100, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay(0.0d, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) (byte) 100, user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay(1.0d, user26);
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay((double) (byte) 100, user29);
        model.User user32 = null;
        boolean boolean33 = debitCardPayment0.pay(0.0d, user32);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
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
    public void test26132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26132");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((-1.0d), user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay(0.0d, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (short) 100, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) (byte) -1, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) 10.0f, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay(0.0d, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay(0.0d, user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) 0.0f, user26);
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay((double) 'a', user29);
        model.User user32 = null;
        boolean boolean33 = debitCardPayment0.pay(100.0d, user32);
        model.User user35 = null;
        boolean boolean36 = debitCardPayment0.pay((double) (byte) 1, user35);
        model.User user38 = null;
        boolean boolean39 = debitCardPayment0.pay((double) (byte) 0, user38);
        model.User user41 = null;
        boolean boolean42 = debitCardPayment0.pay((double) 0.0f, user41);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
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
    public void test26133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26133");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (-1.0f), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay(10.0d, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 0L, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) '4', user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay(0.0d, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay(0.0d, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) (short) 1, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) (short) 1, user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) (short) 0, user26);
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay((double) '4', user29);
        model.User user32 = null;
        boolean boolean33 = debitCardPayment0.pay((double) (byte) 1, user32);
        model.User user35 = null;
        boolean boolean36 = debitCardPayment0.pay((double) 100L, user35);
        java.lang.Class<?> wildcardClass37 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
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
    public void test26134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26134");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (byte) -1, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (byte) 100, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) 100, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) (short) 100, user17);
        java.lang.Class<?> wildcardClass19 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test26135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26135");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 100L, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) '4', user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 0.0f, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) (short) 0, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) 1, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) 0L, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) 10.0f, user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) (byte) 100, user26);
        java.lang.Class<?> wildcardClass28 = debitCardPayment0.getClass();
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
    public void test26136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26136");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((-1.0d), user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay(0.0d, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay(0.0d, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) 1, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay(100.0d, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((-1.0d), user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) 10.0f, user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) 0L, user26);
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay((double) (short) 10, user29);
        model.User user32 = null;
        boolean boolean33 = debitCardPayment0.pay((double) (byte) 0, user32);
        model.User user35 = null;
        boolean boolean36 = debitCardPayment0.pay((double) ' ', user35);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
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
    public void test26137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26137");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 100L, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (byte) 0, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay(1.0d, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) (short) 100, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay(1.0d, user17);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test26138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26138");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 10L, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (byte) 100, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((-1.0d), user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) (-1), user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) (byte) 0, user17);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test26139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26139");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 10L, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (byte) 100, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 10.0f, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) 0L, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) 100L, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay(0.0d, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) ' ', user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) 1.0f, user26);
        java.lang.Class<?> wildcardClass28 = debitCardPayment0.getClass();
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
    public void test26140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26140");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (-1.0f), user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) (byte) 0, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) (short) 100, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((-1.0d), user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) 10L, user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) 10.0f, user26);
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay((double) 100L, user29);
        model.User user32 = null;
        boolean boolean33 = debitCardPayment0.pay((double) (short) 10, user32);
        model.User user35 = null;
        boolean boolean36 = debitCardPayment0.pay((double) '#', user35);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
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
    public void test26141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26141");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) (byte) 10, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (byte) 1, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (-1L), user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) (-1), user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) 10, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) (-1L), user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) 0L, user23);
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
    public void test26142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26142");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 100L, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 'a', user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay(10.0d, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) (short) 0, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) (byte) 0, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) (byte) 1, user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) (-1.0f), user26);
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay((double) '#', user29);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
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
    public void test26143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26143");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (short) 100, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) '4', user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) 100L, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay(1.0d, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay(10.0d, user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) (byte) 1, user26);
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay((double) (-1L), user29);
        model.User user32 = null;
        boolean boolean33 = debitCardPayment0.pay(0.0d, user32);
        model.User user35 = null;
        boolean boolean36 = debitCardPayment0.pay((double) (short) 100, user35);
        model.User user38 = null;
        boolean boolean39 = debitCardPayment0.pay((double) (byte) 10, user38);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
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
    public void test26144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26144");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((-1.0d), user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay(0.0d, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay(0.0d, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) 1, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay(100.0d, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((-1.0d), user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) (short) 100, user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) 10, user26);
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay((double) 10.0f, user29);
        model.User user32 = null;
        boolean boolean33 = debitCardPayment0.pay((double) 1, user32);
        java.lang.Class<?> wildcardClass34 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
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
    public void test26145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26145");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 10L, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (byte) 100, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 0.0f, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((-1.0d), user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) 100.0f, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) 100, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((-1.0d), user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) (short) 100, user26);
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
    public void test26146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26146");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 10L, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 100, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay(10.0d, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) (byte) -1, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) (-1), user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) 1L, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) (byte) 1, user23);
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
    public void test26147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26147");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 10.0f, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) 1, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) (byte) 1, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) (byte) 1, user20);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test26148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26148");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 10L, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (byte) 100, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay(0.0d, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) (short) 1, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay(0.0d, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) 100.0f, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) (byte) 10, user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) 0.0f, user26);
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay((double) (short) -1, user29);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
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
    public void test26149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26149");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 0.0f, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (short) 0, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay(0.0d, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) (byte) 100, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) '4', user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) 100L, user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) ' ', user26);
        java.lang.Class<?> wildcardClass28 = debitCardPayment0.getClass();
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
    public void test26150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26150");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay(0.0d, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 100, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 1, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) 0L, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) (short) -1, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) 10.0f, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) (-1L), user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) 0, user26);
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay((double) 100, user29);
        model.User user32 = null;
        boolean boolean33 = debitCardPayment0.pay((double) 0.0f, user32);
        model.User user35 = null;
        boolean boolean36 = debitCardPayment0.pay((double) ' ', user35);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
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
    public void test26151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26151");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay(0.0d, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay(1.0d, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (short) -1, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) (byte) 100, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) ' ', user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) ' ', user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) (-1), user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) (short) 10, user26);
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay((double) 10.0f, user29);
        java.lang.Class<?> wildcardClass31 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
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
    public void test26152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26152");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 10L, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay(0.0d, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 0.0f, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) (-1), user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) '4', user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) 100L, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) (short) 0, user23);
        java.lang.Class<?> wildcardClass25 = debitCardPayment0.getClass();
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
    public void test26153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26153");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) ' ', user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) ' ', user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (byte) 1, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) (byte) 100, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) 100.0f, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) (short) 100, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) (-1.0f), user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) 10.0f, user26);
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay((double) (short) 0, user29);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
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
    public void test26154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26154");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay(0.0d, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (short) 100, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 10.0f, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) 0L, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) (byte) -1, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) (short) 10, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) 0L, user23);
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
    public void test26155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26155");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((-1.0d), user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay(0.0d, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (short) 100, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) (byte) -1, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) 10.0f, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay(0.0d, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay(0.0d, user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) 10L, user26);
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay((double) '#', user29);
        model.User user32 = null;
        boolean boolean33 = debitCardPayment0.pay((double) (short) 100, user32);
        model.User user35 = null;
        boolean boolean36 = debitCardPayment0.pay((double) 100L, user35);
        model.User user38 = null;
        boolean boolean39 = debitCardPayment0.pay((double) (short) 100, user38);
        model.User user41 = null;
        boolean boolean42 = debitCardPayment0.pay((double) 10.0f, user41);
        model.User user44 = null;
        boolean boolean45 = debitCardPayment0.pay((double) 10.0f, user44);
        model.User user47 = null;
        boolean boolean48 = debitCardPayment0.pay((double) (short) -1, user47);
        java.lang.Class<?> wildcardClass49 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
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
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test26156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26156");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay(0.0d, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 10.0f, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) '#', user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) (byte) 100, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) (-1L), user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay(1.0d, user20);
        java.lang.Class<?> wildcardClass22 = debitCardPayment0.getClass();
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
    public void test26157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26157");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 10L, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (byte) -1, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (byte) 0, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay(10.0d, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) 'a', user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) 100L, user20);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test26158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26158");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (-1.0f), user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) (short) 0, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay(0.0d, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) (byte) 1, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) (short) 0, user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) 100.0f, user26);
        java.lang.Class<?> wildcardClass28 = debitCardPayment0.getClass();
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
    public void test26159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26159");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((-1.0d), user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay(0.0d, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (short) 100, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) (byte) -1, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay(1.0d, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay(1.0d, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) (byte) 1, user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay(100.0d, user26);
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
    public void test26160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26160");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 10L, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (byte) 100, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 10.0f, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) (short) 0, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) 10.0f, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) ' ', user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay(100.0d, user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) (-1.0f), user26);
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay((double) 10, user29);
        model.User user32 = null;
        boolean boolean33 = debitCardPayment0.pay((double) 0.0f, user32);
        java.lang.Class<?> wildcardClass34 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
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
    public void test26161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26161");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (short) 1, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) 10.0f, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) 1L, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) 1.0f, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) (byte) -1, user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) (byte) 0, user26);
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay((-1.0d), user29);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
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
    public void test26162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26162");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((-1.0d), user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 100, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (-1), user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) 'a', user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((-1.0d), user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) '4', user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) (byte) -1, user23);
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
    public void test26163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26163");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay(0.0d, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (short) 100, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 10.0f, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) 0L, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) (-1), user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) '4', user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) 10L, user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) 10L, user26);
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
    public void test26164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26164");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 10L, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay(1.0d, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay(1.0d, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) (byte) 1, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) (short) 100, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) 'a', user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) (-1.0f), user23);
        java.lang.Class<?> wildcardClass25 = debitCardPayment0.getClass();
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
    public void test26165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26165");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay(0.0d, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 10.0f, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 10.0f, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) '#', user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) 10, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) 1L, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay(1.0d, user23);
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
    public void test26166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26166");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((-1.0d), user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (-1.0f), user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 1L, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) 10, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) 0L, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) (short) -1, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay(1.0d, user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) (byte) 100, user26);
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
    public void test26167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26167");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (short) -1, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) 1, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) (byte) 0, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) (short) 0, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) 0L, user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay(0.0d, user26);
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay((double) (short) 10, user29);
        model.User user32 = null;
        boolean boolean33 = debitCardPayment0.pay((double) 1.0f, user32);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
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
    public void test26168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26168");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((-1.0d), user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay(0.0d, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (short) 100, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) 10.0f, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay(0.0d, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) (short) 10, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) (short) 100, user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay(100.0d, user26);
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay((-1.0d), user29);
        model.User user32 = null;
        boolean boolean33 = debitCardPayment0.pay(100.0d, user32);
        java.lang.Class<?> wildcardClass34 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
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
    public void test26169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26169");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 1, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) '4', user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) 1L, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) 100L, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) 'a', user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) 100.0f, user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) (short) 0, user26);
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay((double) (short) -1, user29);
        model.User user32 = null;
        boolean boolean33 = debitCardPayment0.pay((double) 1.0f, user32);
        model.User user35 = null;
        boolean boolean36 = debitCardPayment0.pay((-1.0d), user35);
        model.User user38 = null;
        boolean boolean39 = debitCardPayment0.pay((double) (byte) -1, user38);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
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
    public void test26170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26170");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (-1.0f), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay(10.0d, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 0L, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) '#', user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) 10.0f, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay(10.0d, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) 1, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) (-1L), user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) (short) 0, user26);
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay((double) (byte) -1, user29);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
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
    public void test26171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26171");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) '#', user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) '4', user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 10.0f, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) (byte) 10, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) 0L, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) 100, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) (-1.0f), user23);
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
    public void test26172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26172");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 100L, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay(100.0d, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) (short) -1, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) (byte) 0, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((-1.0d), user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) 1L, user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) (byte) 100, user26);
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay((double) 0L, user29);
        model.User user32 = null;
        boolean boolean33 = debitCardPayment0.pay(10.0d, user32);
        java.lang.Class<?> wildcardClass34 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
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
    public void test26173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26173");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 10L, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 100, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay(1.0d, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) 1.0f, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) (byte) 100, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) (byte) 10, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) (short) 1, user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay(0.0d, user26);
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
    public void test26174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26174");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (-1), user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (-1L), user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) (-1), user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) (byte) 10, user17);
        java.lang.Class<?> wildcardClass19 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test26175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26175");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) (short) 10, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (byte) 1, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay(10.0d, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((-1.0d), user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) (byte) 0, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay(1.0d, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) (-1.0f), user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) '#', user26);
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay((double) 10, user29);
        model.User user32 = null;
        boolean boolean33 = debitCardPayment0.pay((double) (-1.0f), user32);
        model.User user35 = null;
        boolean boolean36 = debitCardPayment0.pay((double) 100L, user35);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
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
    public void test26176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26176");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 10L, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (byte) -1, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (byte) 1, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) 0, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) (byte) 10, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay(100.0d, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay(0.0d, user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) (short) 100, user26);
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay((double) (short) 10, user29);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
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
    public void test26177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26177");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 1, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) '4', user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) 0, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) 0.0f, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) 100, user20);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test26178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26178");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay(0.0d, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) '#', user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) (-1L), user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) (-1), user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) '4', user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) 100, user26);
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay((double) (byte) -1, user29);
        java.lang.Class<?> wildcardClass31 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
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
    public void test26179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26179");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) (byte) 10, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (byte) 100, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (short) -1, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) (short) 100, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) ' ', user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) (-1L), user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) (byte) -1, user23);
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
    public void test26180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26180");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 1, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay(100.0d, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay(100.0d, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) 10, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) (short) 1, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay(0.0d, user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay(100.0d, user26);
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay((double) (byte) 1, user29);
        model.User user32 = null;
        boolean boolean33 = debitCardPayment0.pay((double) (short) -1, user32);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
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
    public void test26181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26181");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay(0.0d, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) (-1.0f), user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) (byte) 100, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) 100, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) (-1.0f), user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) 100.0f, user26);
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay((double) (short) 1, user29);
        model.User user32 = null;
        boolean boolean33 = debitCardPayment0.pay(1.0d, user32);
        model.User user35 = null;
        boolean boolean36 = debitCardPayment0.pay(10.0d, user35);
        model.User user38 = null;
        boolean boolean39 = debitCardPayment0.pay((double) 10L, user38);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
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
    public void test26182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26182");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay(0.0d, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay(0.0d, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay(0.0d, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay(0.0d, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay(0.0d, user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) ' ', user26);
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay((double) (byte) 10, user29);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
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
    public void test26183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26183");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay(0.0d, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay(1.0d, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (-1.0f), user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay(10.0d, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) (byte) 0, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) (-1L), user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay(0.0d, user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay(100.0d, user26);
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay((double) (short) 100, user29);
        model.User user32 = null;
        boolean boolean33 = debitCardPayment0.pay((double) (short) -1, user32);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
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
    public void test26184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26184");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((-1.0d), user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay(0.0d, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (short) 100, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) (byte) -1, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) 10.0f, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay(0.0d, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) 0L, user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) (short) 100, user26);
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay((double) 0L, user29);
        model.User user32 = null;
        boolean boolean33 = debitCardPayment0.pay((double) 10, user32);
        model.User user35 = null;
        boolean boolean36 = debitCardPayment0.pay((double) 100.0f, user35);
        model.User user38 = null;
        boolean boolean39 = debitCardPayment0.pay((double) (byte) 0, user38);
        java.lang.Class<?> wildcardClass40 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
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
    public void test26185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26185");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) (byte) 10, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (byte) 100, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (-1L), user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) 1.0f, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) 10, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) ' ', user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) (byte) 100, user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) (byte) -1, user26);
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
    public void test26186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26186");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (short) 1, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay(100.0d, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) 0, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) 1L, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((-1.0d), user23);
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
    public void test26187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26187");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) '#', user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay(10.0d, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) 0.0f, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) 'a', user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) (byte) 1, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) '#', user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) (-1L), user26);
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
    public void test26188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26188");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay(100.0d, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) 100, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) (byte) 0, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) 0.0f, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) (byte) 1, user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) (byte) 1, user26);
        java.lang.Class<?> wildcardClass28 = debitCardPayment0.getClass();
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
    public void test26189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26189");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay(0.0d, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) '#', user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) (-1L), user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) (byte) 10, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) 0.0f, user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) 10L, user26);
        java.lang.Class<?> wildcardClass28 = debitCardPayment0.getClass();
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
    public void test26190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26190");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((-1.0d), user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (-1.0f), user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 1L, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) 10, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) 0L, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) 0, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) 0L, user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) 100L, user26);
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay((double) '4', user29);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
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
    public void test26191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26191");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((-1.0d), user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay(0.0d, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (short) 100, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) 10.0f, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) (byte) 100, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay(0.0d, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) (byte) 10, user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay(10.0d, user26);
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay((double) 1, user29);
        model.User user32 = null;
        boolean boolean33 = debitCardPayment0.pay(0.0d, user32);
        model.User user35 = null;
        boolean boolean36 = debitCardPayment0.pay((double) 'a', user35);
        model.User user38 = null;
        boolean boolean39 = debitCardPayment0.pay(100.0d, user38);
        model.User user41 = null;
        boolean boolean42 = debitCardPayment0.pay((double) (short) 10, user41);
        model.User user44 = null;
        boolean boolean45 = debitCardPayment0.pay((-1.0d), user44);
        model.User user47 = null;
        boolean boolean48 = debitCardPayment0.pay((double) 0L, user47);
        model.User user50 = null;
        boolean boolean51 = debitCardPayment0.pay((double) 0L, user50);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
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
    public void test26192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26192");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 10L, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (byte) -1, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (-1.0f), user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) (byte) 100, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) 100.0f, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) (short) -1, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) (short) 10, user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) (byte) 1, user26);
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
    public void test26193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26193");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay(0.0d, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 10.0f, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay(1.0d, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) 100L, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) ' ', user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay(1.0d, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay(0.0d, user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay(10.0d, user26);
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay((double) '4', user29);
        model.User user32 = null;
        boolean boolean33 = debitCardPayment0.pay((double) 0, user32);
        model.User user35 = null;
        boolean boolean36 = debitCardPayment0.pay((double) (byte) 100, user35);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
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
    public void test26194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26194");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 10L, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (byte) 100, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 10.0f, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) 0L, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((-1.0d), user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay(0.0d, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) (-1.0f), user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) 1.0f, user26);
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay(0.0d, user29);
        model.User user32 = null;
        boolean boolean33 = debitCardPayment0.pay(0.0d, user32);
        model.User user35 = null;
        boolean boolean36 = debitCardPayment0.pay((double) (-1), user35);
        model.User user38 = null;
        boolean boolean39 = debitCardPayment0.pay((double) (-1.0f), user38);
        model.User user41 = null;
        boolean boolean42 = debitCardPayment0.pay((double) 0L, user41);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
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
    public void test26195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26195");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((-1.0d), user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay(0.0d, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (short) 100, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) (byte) -1, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) 10.0f, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay(0.0d, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay(0.0d, user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) 0.0f, user26);
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay((double) (-1), user29);
        model.User user32 = null;
        boolean boolean33 = debitCardPayment0.pay((double) '#', user32);
        model.User user35 = null;
        boolean boolean36 = debitCardPayment0.pay((double) 100L, user35);
        model.User user38 = null;
        boolean boolean39 = debitCardPayment0.pay((double) 10L, user38);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
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
    public void test26196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26196");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 1, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay(100.0d, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) (byte) -1, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay(1.0d, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((-1.0d), user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) (-1.0f), user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) 10L, user26);
        java.lang.Class<?> wildcardClass28 = debitCardPayment0.getClass();
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
    public void test26197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26197");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 10L, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (byte) 100, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 10.0f, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) (short) 0, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) 10.0f, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) 1, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) (short) -1, user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) (short) 0, user26);
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay((double) (short) -1, user29);
        model.User user32 = null;
        boolean boolean33 = debitCardPayment0.pay((double) 100.0f, user32);
        model.User user35 = null;
        boolean boolean36 = debitCardPayment0.pay((double) 100.0f, user35);
        model.User user38 = null;
        boolean boolean39 = debitCardPayment0.pay((double) 0L, user38);
        model.User user41 = null;
        boolean boolean42 = debitCardPayment0.pay(0.0d, user41);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
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
    public void test26198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26198");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 0.0f, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 10.0f, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (-1L), user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) 10.0f, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) 'a', user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay(0.0d, user20);
        java.lang.Class<?> wildcardClass22 = debitCardPayment0.getClass();
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
    public void test26199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26199");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay(0.0d, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) '#', user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) (-1), user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) (short) 10, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) (-1), user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) (-1L), user26);
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay((double) 100.0f, user29);
        model.User user32 = null;
        boolean boolean33 = debitCardPayment0.pay((double) (short) 1, user32);
        model.User user35 = null;
        boolean boolean36 = debitCardPayment0.pay(0.0d, user35);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
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
    public void test26200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26200");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 100L, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay(100.0d, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) 1L, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) (short) 10, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) ' ', user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay(1.0d, user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) 1.0f, user26);
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay(0.0d, user29);
        model.User user32 = null;
        boolean boolean33 = debitCardPayment0.pay((double) (byte) 1, user32);
        model.User user35 = null;
        boolean boolean36 = debitCardPayment0.pay(0.0d, user35);
        model.User user38 = null;
        boolean boolean39 = debitCardPayment0.pay(0.0d, user38);
        model.User user41 = null;
        boolean boolean42 = debitCardPayment0.pay((double) (byte) -1, user41);
        model.User user44 = null;
        boolean boolean45 = debitCardPayment0.pay((-1.0d), user44);
        java.lang.Class<?> wildcardClass46 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
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
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test26201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26201");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((-1.0d), user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay(0.0d, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (short) 100, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) 10.0f, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay(0.0d, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) (short) 10, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) (short) 100, user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) (short) 0, user26);
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay(1.0d, user29);
        model.User user32 = null;
        boolean boolean33 = debitCardPayment0.pay((double) 0, user32);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
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
    public void test26202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26202");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay(0.0d, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (short) 100, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 10.0f, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) 0L, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) 100, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) (byte) 0, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) (short) -1, user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) (byte) 1, user26);
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay((double) (-1L), user29);
        model.User user32 = null;
        boolean boolean33 = debitCardPayment0.pay(0.0d, user32);
        model.User user35 = null;
        boolean boolean36 = debitCardPayment0.pay((double) (byte) 1, user35);
        java.lang.Class<?> wildcardClass37 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
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
    public void test26203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26203");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 100L, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay(100.0d, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) 1L, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) 10, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) '#', user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) (-1), user23);
        java.lang.Class<?> wildcardClass25 = debitCardPayment0.getClass();
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
    public void test26204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26204");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 'a', user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 'a', user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) 10.0f, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) 'a', user17);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test26205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26205");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 100L, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay(100.0d, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) 1L, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay(0.0d, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((-1.0d), user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay(1.0d, user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) (short) 10, user26);
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay((double) 0, user29);
        model.User user32 = null;
        boolean boolean33 = debitCardPayment0.pay((double) (-1L), user32);
        model.User user35 = null;
        boolean boolean36 = debitCardPayment0.pay((double) (short) 10, user35);
        java.lang.Class<?> wildcardClass37 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
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
    public void test26206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26206");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 10L, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (byte) 100, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 10.0f, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) 0L, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) (-1L), user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) 0, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) 0, user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((-1.0d), user26);
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay((double) (byte) -1, user29);
        model.User user32 = null;
        boolean boolean33 = debitCardPayment0.pay((double) (short) 1, user32);
        model.User user35 = null;
        boolean boolean36 = debitCardPayment0.pay((double) (byte) 0, user35);
        model.User user38 = null;
        boolean boolean39 = debitCardPayment0.pay(0.0d, user38);
        model.User user41 = null;
        boolean boolean42 = debitCardPayment0.pay((-1.0d), user41);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
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
    public void test26207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26207");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 10L, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (byte) -1, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (byte) 0, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay(10.0d, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) (byte) 100, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) 'a', user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) (short) 1, user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) '4', user26);
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay((double) (byte) 1, user29);
        model.User user32 = null;
        boolean boolean33 = debitCardPayment0.pay((double) 100L, user32);
        model.User user35 = null;
        boolean boolean36 = debitCardPayment0.pay((double) (byte) 0, user35);
        model.User user38 = null;
        boolean boolean39 = debitCardPayment0.pay((double) (-1L), user38);
        model.User user41 = null;
        boolean boolean42 = debitCardPayment0.pay(10.0d, user41);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
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
    public void test26208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26208");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 100.0f, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay(10.0d, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 0L, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) 1.0f, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) (byte) 100, user17);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test26209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26209");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay(0.0d, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) '#', user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) (-1), user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) (short) 10, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) 100.0f, user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay(100.0d, user26);
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay(100.0d, user29);
        model.User user32 = null;
        boolean boolean33 = debitCardPayment0.pay((double) (short) 100, user32);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
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
    public void test26210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26210");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 100L, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay(100.0d, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) 1L, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) ' ', user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) (-1), user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) 0, user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) (short) -1, user26);
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay((double) '4', user29);
        model.User user32 = null;
        boolean boolean33 = debitCardPayment0.pay((double) (-1), user32);
        model.User user35 = null;
        boolean boolean36 = debitCardPayment0.pay((double) (short) 1, user35);
        java.lang.Class<?> wildcardClass37 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
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
    public void test26211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26211");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay(0.0d, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (short) 100, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 10.0f, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay(100.0d, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) 100.0f, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) 1.0f, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) (short) 100, user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) 100L, user26);
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay((double) (-1.0f), user29);
        model.User user32 = null;
        boolean boolean33 = debitCardPayment0.pay(0.0d, user32);
        model.User user35 = null;
        boolean boolean36 = debitCardPayment0.pay((double) 10L, user35);
        model.User user38 = null;
        boolean boolean39 = debitCardPayment0.pay((-1.0d), user38);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
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
    public void test26212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26212");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) (byte) 10, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (byte) 1, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (-1L), user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) (-1L), user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) (short) -1, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) 1.0f, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) 0, user23);
        java.lang.Class<?> wildcardClass25 = debitCardPayment0.getClass();
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
    public void test26213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26213");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) (byte) 10, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (byte) 1, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (-1L), user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) (-1L), user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) (short) -1, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) '#', user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) (byte) 0, user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) 0, user26);
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay((double) (-1L), user29);
        model.User user32 = null;
        boolean boolean33 = debitCardPayment0.pay(0.0d, user32);
        model.User user35 = null;
        boolean boolean36 = debitCardPayment0.pay(100.0d, user35);
        model.User user38 = null;
        boolean boolean39 = debitCardPayment0.pay((double) (byte) 10, user38);
        model.User user41 = null;
        boolean boolean42 = debitCardPayment0.pay((-1.0d), user41);
        model.User user44 = null;
        boolean boolean45 = debitCardPayment0.pay((double) 0L, user44);
        model.User user47 = null;
        boolean boolean48 = debitCardPayment0.pay((double) (byte) 100, user47);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
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
    public void test26214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26214");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) (short) 10, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (short) 10, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (-1), user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) 10, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) 0.0f, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) 0.0f, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) ' ', user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay(0.0d, user26);
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay((double) (short) 10, user29);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
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
    public void test26215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26215");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay(0.0d, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 10.0f, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) '#', user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) 100, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) (-1), user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) 0L, user20);
        java.lang.Class<?> wildcardClass22 = debitCardPayment0.getClass();
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
    public void test26216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26216");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) (byte) 10, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (byte) 1, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (-1.0f), user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) (short) 1, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) (byte) 1, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay(0.0d, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((-1.0d), user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) (short) -1, user26);
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay((double) 100, user29);
        java.lang.Class<?> wildcardClass31 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
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
    public void test26217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26217");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((-1.0d), user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (byte) 100, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay(1.0d, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay(100.0d, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) (byte) -1, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay(0.0d, user23);
        java.lang.Class<?> wildcardClass25 = debitCardPayment0.getClass();
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
    public void test26218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26218");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) (byte) 10, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (byte) 1, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (-1L), user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((-1.0d), user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) ' ', user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) (-1), user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay(10.0d, user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) (short) 100, user26);
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay(10.0d, user29);
        model.User user32 = null;
        boolean boolean33 = debitCardPayment0.pay(1.0d, user32);
        model.User user35 = null;
        boolean boolean36 = debitCardPayment0.pay((double) 'a', user35);
        model.User user38 = null;
        boolean boolean39 = debitCardPayment0.pay(1.0d, user38);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
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
    public void test26219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26219");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 0.0f, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (short) -1, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 1.0f, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) 100, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) (short) 100, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) (byte) -1, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) 100.0f, user23);
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
    public void test26220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26220");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) (byte) 10, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (byte) 100, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (byte) 100, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay(1.0d, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) 100, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) (short) 10, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) 0.0f, user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) (short) 1, user26);
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay((double) 100.0f, user29);
        java.lang.Class<?> wildcardClass31 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
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
    public void test26221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26221");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((-1.0d), user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay(0.0d, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 'a', user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) 10L, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) 0L, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) 0, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) '#', user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay(10.0d, user26);
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay(100.0d, user29);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
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
    public void test26222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26222");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((-1.0d), user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) '4', user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (byte) -1, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) 100L, user14);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test26223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26223");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay(0.0d, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) 1L, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) (short) 1, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) (short) -1, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) 100, user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) (byte) 1, user26);
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay((double) (-1), user29);
        model.User user32 = null;
        boolean boolean33 = debitCardPayment0.pay((double) 100.0f, user32);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
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
    public void test26224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26224");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) (-1L), user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 10, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (byte) 1, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) 1L, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) 10.0f, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay(0.0d, user20);
        java.lang.Class<?> wildcardClass22 = debitCardPayment0.getClass();
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
    public void test26225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26225");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 0.0f, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (short) -1, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 1L, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) (-1.0f), user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) 100.0f, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) (-1L), user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) (short) 1, user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay(10.0d, user26);
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
    public void test26226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26226");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 100L, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 'a', user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) 'a', user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) 10, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) 'a', user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay(10.0d, user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay(0.0d, user26);
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay((double) 1, user29);
        model.User user32 = null;
        boolean boolean33 = debitCardPayment0.pay((double) 1.0f, user32);
        model.User user35 = null;
        boolean boolean36 = debitCardPayment0.pay((double) 10L, user35);
        model.User user38 = null;
        boolean boolean39 = debitCardPayment0.pay((double) 0L, user38);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
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
    public void test26227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26227");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 100L, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay(100.0d, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) 1L, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) (short) 10, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) ' ', user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) 100, user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) (byte) 10, user26);
        java.lang.Class<?> wildcardClass28 = debitCardPayment0.getClass();
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
    public void test26228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26228");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) '#', user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) '4', user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 10, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) '#', user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) (short) 0, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) (byte) -1, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) 0L, user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay(10.0d, user26);
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay((double) (-1), user29);
        model.User user32 = null;
        boolean boolean33 = debitCardPayment0.pay(1.0d, user32);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
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
    public void test26229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26229");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 10L, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) 1.0f, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay(100.0d, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay(0.0d, user20);
        java.lang.Class<?> wildcardClass22 = debitCardPayment0.getClass();
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
    public void test26230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26230");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) ' ', user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) ' ', user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (byte) 1, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) 0, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) (byte) -1, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) 1.0f, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay(0.0d, user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) '#', user26);
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
    public void test26231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26231");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay(0.0d, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (short) 100, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 10.0f, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay(100.0d, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) 100.0f, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) (byte) 1, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay(1.0d, user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) 1.0f, user26);
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay((double) (short) 10, user29);
        model.User user32 = null;
        boolean boolean33 = debitCardPayment0.pay((double) (byte) -1, user32);
        java.lang.Class<?> wildcardClass34 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
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
    public void test26232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26232");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 0.0f, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (short) 0, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay(0.0d, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) (byte) 100, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) '4', user20);
        java.lang.Class<?> wildcardClass22 = debitCardPayment0.getClass();
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
    public void test26233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26233");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 1, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) '4', user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) 1.0f, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) (short) 0, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) ' ', user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay(100.0d, user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) (-1L), user26);
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
    public void test26234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26234");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 1, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 100L, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) (short) 100, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) 100.0f, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay(100.0d, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay(0.0d, user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) 10, user26);
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay((double) ' ', user29);
        model.User user32 = null;
        boolean boolean33 = debitCardPayment0.pay(100.0d, user32);
        model.User user35 = null;
        boolean boolean36 = debitCardPayment0.pay(0.0d, user35);
        java.lang.Class<?> wildcardClass37 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
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
    public void test26235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26235");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 1, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) '4', user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((-1.0d), user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) 100.0f, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) 0.0f, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay(0.0d, user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) (short) 10, user26);
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay(0.0d, user29);
        model.User user32 = null;
        boolean boolean33 = debitCardPayment0.pay((double) (byte) 0, user32);
        model.User user35 = null;
        boolean boolean36 = debitCardPayment0.pay((double) 100L, user35);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
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
    public void test26236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26236");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 10L, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (byte) -1, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay(100.0d, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) '#', user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) (-1.0f), user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) (byte) -1, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) (short) 1, user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) (byte) -1, user26);
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay(1.0d, user29);
        model.User user32 = null;
        boolean boolean33 = debitCardPayment0.pay(0.0d, user32);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
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
    public void test26237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26237");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((-1.0d), user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay(0.0d, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (short) 100, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) 10.0f, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) (byte) 100, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) (byte) 1, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) 100.0f, user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay(1.0d, user26);
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay((double) (short) -1, user29);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
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
    public void test26238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26238");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) (short) 10, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (short) 10, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (-1), user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) (byte) 1, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) '#', user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) ' ', user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) (byte) 1, user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay(1.0d, user26);
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay((double) 0, user29);
        model.User user32 = null;
        boolean boolean33 = debitCardPayment0.pay((double) (-1L), user32);
        model.User user35 = null;
        boolean boolean36 = debitCardPayment0.pay((double) 0L, user35);
        model.User user38 = null;
        boolean boolean39 = debitCardPayment0.pay((double) (byte) 1, user38);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
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
    public void test26239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26239");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 1, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay(100.0d, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay(100.0d, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) 1.0f, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay(0.0d, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay(0.0d, user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) (byte) 0, user26);
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay((double) 0L, user29);
        model.User user32 = null;
        boolean boolean33 = debitCardPayment0.pay(0.0d, user32);
        model.User user35 = null;
        boolean boolean36 = debitCardPayment0.pay((double) (short) 100, user35);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
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
    public void test26240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26240");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 100.0f, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (byte) 0, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (short) -1, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) (-1), user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay(10.0d, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) 10, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) (-1.0f), user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) 1L, user26);
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay((-1.0d), user29);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
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
    public void test26241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26241");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 100L, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 'a', user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) (short) -1, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) (short) 100, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) 100.0f, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) 0.0f, user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay(100.0d, user26);
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay(10.0d, user29);
        model.User user32 = null;
        boolean boolean33 = debitCardPayment0.pay((double) (short) 0, user32);
        model.User user35 = null;
        boolean boolean36 = debitCardPayment0.pay((double) (-1), user35);
        java.lang.Class<?> wildcardClass37 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
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
    public void test26242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26242");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 10.0f, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) ' ', user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) (byte) 0, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) 100, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) 100, user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) (byte) 100, user26);
        java.lang.Class<?> wildcardClass28 = debitCardPayment0.getClass();
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
    public void test26243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26243");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) (byte) 10, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (byte) 100, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (byte) 100, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) 1.0f, user14);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test26244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26244");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay(0.0d, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) 0L, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) 100, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) 10.0f, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay(1.0d, user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) 10.0f, user26);
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay((double) (byte) 1, user29);
        model.User user32 = null;
        boolean boolean33 = debitCardPayment0.pay((double) 100.0f, user32);
        model.User user35 = null;
        boolean boolean36 = debitCardPayment0.pay((double) 0, user35);
        model.User user38 = null;
        boolean boolean39 = debitCardPayment0.pay((double) '4', user38);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
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
    public void test26245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26245");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((-1.0d), user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay(0.0d, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (short) 100, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) 10.0f, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) (byte) 100, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay(0.0d, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) (byte) 10, user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay(10.0d, user26);
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay((double) 1, user29);
        model.User user32 = null;
        boolean boolean33 = debitCardPayment0.pay(0.0d, user32);
        model.User user35 = null;
        boolean boolean36 = debitCardPayment0.pay((double) (short) 100, user35);
        model.User user38 = null;
        boolean boolean39 = debitCardPayment0.pay((double) 0, user38);
        model.User user41 = null;
        boolean boolean42 = debitCardPayment0.pay(0.0d, user41);
        model.User user44 = null;
        boolean boolean45 = debitCardPayment0.pay((double) (short) 100, user44);
        model.User user47 = null;
        boolean boolean48 = debitCardPayment0.pay((double) (short) 0, user47);
        model.User user50 = null;
        boolean boolean51 = debitCardPayment0.pay((double) (byte) 100, user50);
        model.User user53 = null;
        boolean boolean54 = debitCardPayment0.pay((double) '4', user53);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
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
    }

    @Test
    public void test26246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26246");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 10L, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (byte) 100, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 10.0f, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) (short) 0, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) 10.0f, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) 1, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) (short) -1, user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) (short) 0, user26);
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay((double) 10, user29);
        model.User user32 = null;
        boolean boolean33 = debitCardPayment0.pay((double) (byte) 1, user32);
        model.User user35 = null;
        boolean boolean36 = debitCardPayment0.pay((double) (short) 1, user35);
        java.lang.Class<?> wildcardClass37 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
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
    public void test26247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26247");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) (-1L), user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 10, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (byte) 1, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) (byte) -1, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) (short) 0, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) (short) -1, user20);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test26248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26248");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 1, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay(100.0d, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) (byte) -1, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay(1.0d, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((-1.0d), user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) (short) -1, user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) 'a', user26);
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay((double) 0.0f, user29);
        model.User user32 = null;
        boolean boolean33 = debitCardPayment0.pay((double) (byte) 10, user32);
        model.User user35 = null;
        boolean boolean36 = debitCardPayment0.pay((double) (short) 0, user35);
        model.User user38 = null;
        boolean boolean39 = debitCardPayment0.pay((double) 10, user38);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
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
    public void test26249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26249");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 100L, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (-1.0f), user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) (short) 10, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay(0.0d, user17);
        java.lang.Class<?> wildcardClass19 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test26250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26250");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 10L, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (byte) -1, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (byte) 1, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) (byte) 0, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay(1.0d, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) (byte) -1, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) 10.0f, user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) (-1L), user26);
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay((double) '#', user29);
        model.User user32 = null;
        boolean boolean33 = debitCardPayment0.pay(10.0d, user32);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
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
    public void test26251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26251");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((-1.0d), user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 100, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (-1), user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) 0, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay(100.0d, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) (short) 0, user20);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test26252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26252");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 0.0f, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (short) -1, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 1.0f, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) 100, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay(1.0d, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) (byte) -1, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay(0.0d, user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) (short) 100, user26);
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
    public void test26253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26253");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) (short) 10, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (short) 10, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (-1), user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) (byte) 1, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) 10.0f, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) 10.0f, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) (byte) 1, user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) (-1L), user26);
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
    public void test26254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26254");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 10L, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (byte) 100, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 10.0f, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) (short) 0, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) 10, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) (short) 10, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) 100.0f, user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((-1.0d), user26);
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay((double) 0, user29);
        java.lang.Class<?> wildcardClass31 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
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
    public void test26255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26255");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((-1.0d), user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay(0.0d, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (short) 100, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) 10.0f, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay(0.0d, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) (short) 10, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) (short) 100, user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) (short) 100, user26);
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay((double) 1.0f, user29);
        model.User user32 = null;
        boolean boolean33 = debitCardPayment0.pay((double) 0L, user32);
        model.User user35 = null;
        boolean boolean36 = debitCardPayment0.pay((double) 0.0f, user35);
        model.User user38 = null;
        boolean boolean39 = debitCardPayment0.pay((double) 1, user38);
        model.User user41 = null;
        boolean boolean42 = debitCardPayment0.pay((double) (byte) 0, user41);
        model.User user44 = null;
        boolean boolean45 = debitCardPayment0.pay((double) '#', user44);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
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
    public void test26256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest52.test26256");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((-1.0d), user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay(0.0d, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 'a', user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay(1.0d, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) 10L, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay(100.0d, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((-1.0d), user23);
        java.lang.Class<?> wildcardClass25 = debitCardPayment0.getClass();
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

