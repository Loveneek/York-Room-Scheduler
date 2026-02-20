import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest40 {

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
    public void test20001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20001");
        payment.Payment payment4 = new payment.Payment((long) '4', (double) 1L, "hi!", "hi!");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        boolean boolean9 = payment4.paymentCompleted();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy11 = null;
        payment4.setPaymentStrategy(paymentStrategy11);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test20002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20002");
        payment.Payment payment4 = new payment.Payment((long) (byte) 1, (double) 0, "", "hi!");
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        java.lang.Class<?> wildcardClass9 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test20003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20003");
        payment.Payment payment4 = new payment.Payment((long) (byte) 10, (double) '#', "hi!", "hi!");
        boolean boolean5 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        payment4.payDeposit();
        boolean boolean10 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test20004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20004");
        payment.Payment payment4 = new payment.Payment((-1L), (double) 'a', "hi!", "");
        payment4.verifyPaymentDetails();
        boolean boolean6 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        payment.PaymentStrategy paymentStrategy9 = null;
        payment4.setPaymentStrategy(paymentStrategy9);
        payment4.payBalance();
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        boolean boolean15 = payment4.paymentCompleted();
        payment4.payDeposit();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test20005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20005");
        payment.Payment payment4 = new payment.Payment((long) (short) 1, (double) 10L, "hi!", "hi!");
        boolean boolean5 = payment4.paymentCompleted();
        payment4.payBalance();
        payment4.payDeposit();
        boolean boolean8 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test20006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20006");
        payment.Payment payment4 = new payment.Payment((long) (byte) -1, (double) 10, "", "hi!");
        boolean boolean5 = payment4.paymentCompleted();
        payment4.payDeposit();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test20007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20007");
        payment.Payment payment4 = new payment.Payment((long) '#', (double) 0L, "", "");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        payment4.verifyPaymentDetails();
    }

    @Test
    public void test20008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20008");
        payment.Payment payment4 = new payment.Payment((-1L), (double) 'a', "hi!", "");
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        boolean boolean8 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment4.payDeposit();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy13 = null;
        payment4.setPaymentStrategy(paymentStrategy13);
        payment4.payBalance();
        payment4.payBalance();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test20009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20009");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) (byte) 10, "", "");
        payment4.payDeposit();
        boolean boolean6 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        boolean boolean10 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        payment4.payBalance();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test20010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20010");
        payment.Payment payment4 = new payment.Payment(0L, (double) (short) 1, "", "hi!");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        boolean boolean7 = payment4.paymentCompleted();
        boolean boolean8 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test20011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20011");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) (byte) 10, "", "");
        payment4.payDeposit();
        boolean boolean6 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        boolean boolean10 = payment4.paymentCompleted();
        payment4.payBalance();
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        boolean boolean15 = payment4.paymentCompleted();
        boolean boolean16 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy17 = null;
        payment4.setPaymentStrategy(paymentStrategy17);
        payment.PaymentStrategy paymentStrategy19 = null;
        payment4.setPaymentStrategy(paymentStrategy19);
        java.lang.Class<?> wildcardClass21 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test20012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20012");
        payment.Payment payment4 = new payment.Payment((long) (byte) -1, (double) 0.0f, "hi!", "hi!");
        payment4.payDeposit();
    }

    @Test
    public void test20013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20013");
        payment.Payment payment4 = new payment.Payment((long) (byte) 0, (double) 100L, "hi!", "hi!");
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment4.payDeposit();
        payment4.payDeposit();
        payment4.payBalance();
    }

    @Test
    public void test20014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20014");
        payment.Payment payment4 = new payment.Payment(1L, 1.0d, "hi!", "");
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy10 = null;
        payment4.setPaymentStrategy(paymentStrategy10);
        boolean boolean12 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test20015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20015");
        payment.Payment payment4 = new payment.Payment((-1L), (double) 'a', "hi!", "");
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        java.lang.Class<?> wildcardClass15 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test20016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20016");
        payment.Payment payment4 = new payment.Payment((-1L), (double) 'a', "hi!", "");
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        boolean boolean8 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy10 = null;
        payment4.setPaymentStrategy(paymentStrategy10);
        payment4.payDeposit();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy14 = null;
        payment4.setPaymentStrategy(paymentStrategy14);
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        boolean boolean18 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        boolean boolean20 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test20017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20017");
        payment.Payment payment4 = new payment.Payment((long) (byte) 0, 0.0d, "hi!", "hi!");
        payment4.payDeposit();
        boolean boolean6 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        payment.PaymentStrategy paymentStrategy9 = null;
        payment4.setPaymentStrategy(paymentStrategy9);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test20018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20018");
        payment.Payment payment4 = new payment.Payment((-1L), (double) 'a', "hi!", "");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment4.payDeposit();
        payment4.payBalance();
        boolean boolean9 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy10 = null;
        payment4.setPaymentStrategy(paymentStrategy10);
        payment.PaymentStrategy paymentStrategy12 = null;
        payment4.setPaymentStrategy(paymentStrategy12);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test20019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20019");
        payment.Payment payment4 = new payment.Payment((long) 'a', (double) 1L, "", "hi!");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        boolean boolean7 = payment4.paymentCompleted();
        payment4.payBalance();
        payment4.payBalance();
        payment4.payDeposit();
        payment4.payDeposit();
        boolean boolean12 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test20020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20020");
        payment.Payment payment4 = new payment.Payment((long) (short) 0, (double) (short) 1, "", "");
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
    }

    @Test
    public void test20021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20021");
        payment.Payment payment4 = new payment.Payment((long) 1, (double) '4', "", "");
        boolean boolean5 = payment4.paymentCompleted();
        boolean boolean6 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        boolean boolean8 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test20022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20022");
        payment.Payment payment4 = new payment.Payment((long) (byte) -1, (double) 100, "", "");
        payment4.payDeposit();
        payment4.payBalance();
        payment4.payBalance();
        payment4.payDeposit();
    }

    @Test
    public void test20023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20023");
        payment.Payment payment4 = new payment.Payment(1L, (double) 10L, "", "");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment4.verifyPaymentDetails();
        java.lang.Class<?> wildcardClass8 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test20024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20024");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) (byte) 10, "", "");
        payment4.payBalance();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        payment4.payBalance();
        boolean boolean10 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy11 = null;
        payment4.setPaymentStrategy(paymentStrategy11);
        payment.PaymentStrategy paymentStrategy13 = null;
        payment4.setPaymentStrategy(paymentStrategy13);
        payment4.verifyPaymentDetails();
        boolean boolean16 = payment4.paymentCompleted();
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment4.payBalance();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test20025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20025");
        payment.Payment payment4 = new payment.Payment((long) (-1), (double) (short) -1, "hi!", "");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
    }

    @Test
    public void test20026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20026");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) (-1), "hi!", "hi!");
        boolean boolean5 = payment4.paymentCompleted();
        boolean boolean6 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        payment4.payDeposit();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test20027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20027");
        payment.Payment payment4 = new payment.Payment((long) (byte) 0, (double) (-1.0f), "", "hi!");
        payment4.payBalance();
        payment4.payDeposit();
        payment4.payDeposit();
    }

    @Test
    public void test20028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20028");
        payment.Payment payment4 = new payment.Payment((long) (byte) 10, (double) (short) -1, "hi!", "");
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
    }

    @Test
    public void test20029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20029");
        payment.Payment payment4 = new payment.Payment((long) (short) -1, (double) (short) 1, "hi!", "hi!");
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment4.payDeposit();
        payment4.payDeposit();
        boolean boolean10 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy11 = null;
        payment4.setPaymentStrategy(paymentStrategy11);
        boolean boolean13 = payment4.paymentCompleted();
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        java.lang.Class<?> wildcardClass16 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test20030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20030");
        payment.Payment payment4 = new payment.Payment((long) 'a', (double) 1L, "", "hi!");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        boolean boolean10 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment4.payBalance();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test20031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20031");
        payment.Payment payment4 = new payment.Payment((long) (byte) 1, (double) (-1), "", "");
    }

    @Test
    public void test20032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20032");
        payment.Payment payment4 = new payment.Payment(100L, (double) (-1L), "", "");
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        boolean boolean7 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        payment.PaymentStrategy paymentStrategy10 = null;
        payment4.setPaymentStrategy(paymentStrategy10);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test20033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20033");
        payment.Payment payment4 = new payment.Payment((long) (short) -1, (double) (short) 1, "hi!", "hi!");
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment4.payDeposit();
        payment4.payDeposit();
        boolean boolean10 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy11 = null;
        payment4.setPaymentStrategy(paymentStrategy11);
        payment4.payBalance();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        boolean boolean18 = payment4.paymentCompleted();
        boolean boolean19 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test20034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20034");
        payment.Payment payment4 = new payment.Payment((-1L), (double) 'a', "hi!", "");
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        boolean boolean8 = payment4.paymentCompleted();
        boolean boolean9 = payment4.paymentCompleted();
        boolean boolean10 = payment4.paymentCompleted();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy12 = null;
        payment4.setPaymentStrategy(paymentStrategy12);
        payment4.payDeposit();
        payment4.payBalance();
        payment4.payBalance();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test20035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20035");
        payment.Payment payment4 = new payment.Payment(10L, (double) (-1.0f), "hi!", "hi!");
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        payment4.payBalance();
    }

    @Test
    public void test20036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20036");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) (byte) 10, "", "");
        payment4.payBalance();
        boolean boolean6 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        boolean boolean10 = payment4.paymentCompleted();
        payment4.payBalance();
        boolean boolean12 = payment4.paymentCompleted();
        boolean boolean13 = payment4.paymentCompleted();
        boolean boolean14 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        payment4.payDeposit();
        boolean boolean18 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy20 = null;
        payment4.setPaymentStrategy(paymentStrategy20);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test20037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20037");
        payment.Payment payment4 = new payment.Payment((long) (short) -1, (double) (short) 1, "hi!", "hi!");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        boolean boolean7 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        payment.PaymentStrategy paymentStrategy10 = null;
        payment4.setPaymentStrategy(paymentStrategy10);
        payment4.verifyPaymentDetails();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test20038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20038");
        payment.Payment payment4 = new payment.Payment((long) ' ', (double) (-1), "hi!", "");
        payment4.payDeposit();
        boolean boolean6 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        java.lang.Class<?> wildcardClass10 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test20039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20039");
        payment.Payment payment4 = new payment.Payment((long) ' ', (double) 1L, "hi!", "hi!");
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment4.payDeposit();
    }

    @Test
    public void test20040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20040");
        payment.Payment payment4 = new payment.Payment((long) (short) 0, (double) '#', "", "");
        payment4.verifyPaymentDetails();
        payment4.payBalance();
    }

    @Test
    public void test20041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20041");
        payment.Payment payment4 = new payment.Payment((-1L), (double) 'a', "hi!", "");
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy12 = null;
        payment4.setPaymentStrategy(paymentStrategy12);
    }

    @Test
    public void test20042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20042");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) (byte) 10, "", "");
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        payment.PaymentStrategy paymentStrategy10 = null;
        payment4.setPaymentStrategy(paymentStrategy10);
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        boolean boolean14 = payment4.paymentCompleted();
        boolean boolean15 = payment4.paymentCompleted();
        payment4.payBalance();
        payment4.payDeposit();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        boolean boolean21 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test20043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20043");
        payment.Payment payment4 = new payment.Payment((long) (short) -1, (double) (short) 100, "", "");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment4.payBalance();
        payment4.payDeposit();
        payment4.payBalance();
    }

    @Test
    public void test20044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20044");
        payment.Payment payment4 = new payment.Payment(0L, (double) (byte) 0, "", "");
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
    }

    @Test
    public void test20045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20045");
        payment.Payment payment4 = new payment.Payment((-1L), (double) 'a', "hi!", "");
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment4.payDeposit();
        payment4.payBalance();
        boolean boolean10 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy11 = null;
        payment4.setPaymentStrategy(paymentStrategy11);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test20046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20046");
        payment.Payment payment4 = new payment.Payment((-1L), (double) 'a', "hi!", "");
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        payment4.payDeposit();
        payment4.payDeposit();
        boolean boolean11 = payment4.paymentCompleted();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy13 = null;
        payment4.setPaymentStrategy(paymentStrategy13);
        payment4.payBalance();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy17 = null;
        payment4.setPaymentStrategy(paymentStrategy17);
        java.lang.Class<?> wildcardClass19 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test20047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20047");
        payment.Payment payment4 = new payment.Payment(100L, 10.0d, "hi!", "");
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
    }

    @Test
    public void test20048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20048");
        payment.Payment payment4 = new payment.Payment((long) (short) 100, (double) 100, "hi!", "hi!");
    }

    @Test
    public void test20049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20049");
        payment.Payment payment4 = new payment.Payment((long) 100, (double) 0, "hi!", "hi!");
        boolean boolean5 = payment4.paymentCompleted();
        boolean boolean6 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test20050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20050");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) (byte) 10, "", "");
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        payment.PaymentStrategy paymentStrategy10 = null;
        payment4.setPaymentStrategy(paymentStrategy10);
        payment4.payBalance();
        payment4.payDeposit();
        boolean boolean14 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        boolean boolean16 = payment4.paymentCompleted();
        payment4.payBalance();
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test20051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20051");
        payment.Payment payment4 = new payment.Payment((long) '#', (double) (short) 100, "hi!", "");
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy10 = null;
        payment4.setPaymentStrategy(paymentStrategy10);
    }

    @Test
    public void test20052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20052");
        payment.Payment payment4 = new payment.Payment((long) (byte) 1, (double) '#', "hi!", "hi!");
        payment4.verifyPaymentDetails();
        payment4.payBalance();
    }

    @Test
    public void test20053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20053");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) (byte) 10, "", "");
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        boolean boolean8 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy9 = null;
        payment4.setPaymentStrategy(paymentStrategy9);
        payment4.payDeposit();
        boolean boolean12 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy13 = null;
        payment4.setPaymentStrategy(paymentStrategy13);
        payment4.payDeposit();
        boolean boolean16 = payment4.paymentCompleted();
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test20054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20054");
        payment.Payment payment4 = new payment.Payment((long) (byte) 100, 0.0d, "", "");
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
    }

    @Test
    public void test20055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20055");
        payment.Payment payment4 = new payment.Payment((long) (byte) 100, (double) 1.0f, "hi!", "hi!");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        boolean boolean10 = payment4.paymentCompleted();
        payment4.payDeposit();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test20056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20056");
        payment.Payment payment4 = new payment.Payment((-1L), (double) 'a', "hi!", "");
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        boolean boolean8 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy10 = null;
        payment4.setPaymentStrategy(paymentStrategy10);
        boolean boolean12 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy13 = null;
        payment4.setPaymentStrategy(paymentStrategy13);
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy18 = null;
        payment4.setPaymentStrategy(paymentStrategy18);
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test20057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20057");
        payment.Payment payment4 = new payment.Payment((long) (byte) -1, (double) (short) -1, "hi!", "");
        payment4.payDeposit();
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy9 = null;
        payment4.setPaymentStrategy(paymentStrategy9);
    }

    @Test
    public void test20058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20058");
        payment.Payment payment4 = new payment.Payment((-1L), (double) 'a', "hi!", "");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy9 = null;
        payment4.setPaymentStrategy(paymentStrategy9);
    }

    @Test
    public void test20059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20059");
        payment.Payment payment4 = new payment.Payment((long) (short) 100, (-1.0d), "hi!", "");
    }

    @Test
    public void test20060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20060");
        payment.Payment payment4 = new payment.Payment((long) 10, 0.0d, "", "hi!");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment4.payDeposit();
        payment4.payBalance();
    }

    @Test
    public void test20061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20061");
        payment.Payment payment4 = new payment.Payment(0L, (double) (short) 1, "", "hi!");
        boolean boolean5 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        payment4.payDeposit();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test20062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20062");
        payment.Payment payment4 = new payment.Payment(100L, (double) (short) 0, "hi!", "hi!");
        boolean boolean5 = payment4.paymentCompleted();
        boolean boolean6 = payment4.paymentCompleted();
        boolean boolean7 = payment4.paymentCompleted();
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy10 = null;
        payment4.setPaymentStrategy(paymentStrategy10);
        boolean boolean12 = payment4.paymentCompleted();
        payment4.payDeposit();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test20063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20063");
        payment.Payment payment4 = new payment.Payment((long) 1, (double) 100, "", "");
        boolean boolean5 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test20064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20064");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) 0.0f, "hi!", "");
        payment4.payBalance();
        java.lang.Class<?> wildcardClass6 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test20065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20065");
        payment.Payment payment4 = new payment.Payment((long) (short) 0, (double) '#', "", "");
        boolean boolean5 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test20066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20066");
        payment.Payment payment4 = new payment.Payment((long) '4', (double) (-1.0f), "", "");
        payment4.verifyPaymentDetails();
        java.lang.Class<?> wildcardClass6 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test20067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20067");
        payment.Payment payment4 = new payment.Payment((long) (byte) 10, (double) (byte) -1, "", "hi!");
        payment4.payBalance();
        payment4.payBalance();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
    }

    @Test
    public void test20068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20068");
        payment.Payment payment4 = new payment.Payment((long) ' ', (double) (byte) -1, "hi!", "");
        payment4.payBalance();
    }

    @Test
    public void test20069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20069");
        payment.Payment payment4 = new payment.Payment((long) '4', (double) (-1L), "", "hi!");
        payment4.payBalance();
        payment4.payBalance();
        payment4.payDeposit();
        payment4.payDeposit();
        boolean boolean9 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        java.lang.Class<?> wildcardClass11 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test20070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20070");
        payment.Payment payment4 = new payment.Payment(10L, (double) 100L, "", "hi!");
        boolean boolean5 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment4.payDeposit();
        payment4.payBalance();
        boolean boolean9 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test20071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20071");
        payment.Payment payment4 = new payment.Payment((-1L), (double) 'a', "hi!", "");
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy10 = null;
        payment4.setPaymentStrategy(paymentStrategy10);
        boolean boolean12 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment4.payBalance();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test20072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20072");
        payment.Payment payment4 = new payment.Payment((long) '#', (double) (byte) 0, "hi!", "hi!");
        payment4.verifyPaymentDetails();
    }

    @Test
    public void test20073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20073");
        payment.Payment payment4 = new payment.Payment((long) 10, (double) (byte) 1, "hi!", "");
        boolean boolean5 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test20074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20074");
        payment.Payment payment4 = new payment.Payment((long) 'a', (double) 1L, "", "hi!");
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        boolean boolean10 = payment4.paymentCompleted();
        payment4.payBalance();
        boolean boolean12 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        java.lang.Class<?> wildcardClass15 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test20075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20075");
        payment.Payment payment4 = new payment.Payment((long) 100, 10.0d, "", "hi!");
        payment4.payBalance();
    }

    @Test
    public void test20076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20076");
        payment.Payment payment4 = new payment.Payment((long) 'a', 100.0d, "hi!", "hi!");
        payment4.verifyPaymentDetails();
        payment4.payBalance();
    }

    @Test
    public void test20077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20077");
        payment.Payment payment4 = new payment.Payment((-1L), (double) 'a', "hi!", "");
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        boolean boolean9 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy10 = null;
        payment4.setPaymentStrategy(paymentStrategy10);
        payment4.payBalance();
        boolean boolean13 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment4.payDeposit();
        payment4.payDeposit();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test20078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20078");
        payment.Payment payment4 = new payment.Payment((long) (byte) 1, 1.0d, "", "hi!");
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
    }

    @Test
    public void test20079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20079");
        payment.Payment payment4 = new payment.Payment((long) 10, (double) 1.0f, "hi!", "hi!");
        boolean boolean5 = payment4.paymentCompleted();
        java.lang.Class<?> wildcardClass6 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test20080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20080");
        payment.Payment payment4 = new payment.Payment((long) (short) 0, (double) (-1L), "", "hi!");
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        payment4.payDeposit();
        boolean boolean11 = payment4.paymentCompleted();
        payment4.payDeposit();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test20081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20081");
        payment.Payment payment4 = new payment.Payment((long) (short) 10, (double) 0L, "", "");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        payment4.verifyPaymentDetails();
        boolean boolean11 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test20082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20082");
        payment.Payment payment4 = new payment.Payment((long) (byte) 10, 10.0d, "", "hi!");
        boolean boolean5 = payment4.paymentCompleted();
        boolean boolean6 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test20083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20083");
        payment.Payment payment4 = new payment.Payment(100L, (double) (byte) -1, "", "");
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        payment.PaymentStrategy paymentStrategy10 = null;
        payment4.setPaymentStrategy(paymentStrategy10);
        payment.PaymentStrategy paymentStrategy12 = null;
        payment4.setPaymentStrategy(paymentStrategy12);
    }

    @Test
    public void test20084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20084");
        payment.Payment payment4 = new payment.Payment((long) (byte) 10, (double) (short) -1, "hi!", "");
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        boolean boolean7 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        boolean boolean10 = payment4.paymentCompleted();
        payment4.payBalance();
        boolean boolean12 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test20085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20085");
        payment.Payment payment4 = new payment.Payment((-1L), (double) 0L, "hi!", "hi!");
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment4.payBalance();
        payment4.payBalance();
        payment4.verifyPaymentDetails();
    }

    @Test
    public void test20086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20086");
        payment.Payment payment4 = new payment.Payment((long) 10, (double) (byte) 1, "", "");
        boolean boolean5 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment4.payBalance();
        boolean boolean8 = payment4.paymentCompleted();
        boolean boolean9 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test20087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20087");
        payment.Payment payment4 = new payment.Payment((long) 10, (-1.0d), "", "hi!");
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
    }

    @Test
    public void test20088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20088");
        payment.Payment payment4 = new payment.Payment((long) (byte) 1, (double) (-1L), "hi!", "");
        payment4.payDeposit();
        java.lang.Class<?> wildcardClass6 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test20089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20089");
        payment.Payment payment4 = new payment.Payment((long) (byte) 1, (double) 0.0f, "hi!", "");
        payment4.payBalance();
        boolean boolean6 = payment4.paymentCompleted();
        payment4.payDeposit();
        java.lang.Class<?> wildcardClass8 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test20090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20090");
        payment.Payment payment4 = new payment.Payment((-1L), (double) 'a', "hi!", "");
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        boolean boolean12 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment4.payBalance();
        boolean boolean15 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy16 = null;
        payment4.setPaymentStrategy(paymentStrategy16);
        payment4.payBalance();
        java.lang.Class<?> wildcardClass19 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test20091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20091");
        payment.Payment payment4 = new payment.Payment((long) (-1), (double) (short) 100, "hi!", "hi!");
        payment4.verifyPaymentDetails();
    }

    @Test
    public void test20092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20092");
        payment.Payment payment4 = new payment.Payment((long) (short) 100, (double) 1, "", "");
        payment4.payBalance();
        payment4.payDeposit();
        payment4.payBalance();
    }

    @Test
    public void test20093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20093");
        payment.Payment payment4 = new payment.Payment((long) '#', (double) (short) 0, "hi!", "hi!");
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
    }

    @Test
    public void test20094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20094");
        payment.Payment payment4 = new payment.Payment((long) (short) -1, (double) ' ', "", "hi!");
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment4.verifyPaymentDetails();
    }

    @Test
    public void test20095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20095");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) (byte) 10, "", "");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        boolean boolean9 = payment4.paymentCompleted();
        payment4.payBalance();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy12 = null;
        payment4.setPaymentStrategy(paymentStrategy12);
        payment4.verifyPaymentDetails();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test20096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20096");
        payment.Payment payment4 = new payment.Payment((long) (-1), (double) (byte) 1, "", "");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        boolean boolean10 = payment4.paymentCompleted();
        payment4.payBalance();
        payment4.payBalance();
        boolean boolean13 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test20097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20097");
        payment.Payment payment4 = new payment.Payment((long) (byte) -1, (double) (-1), "", "");
        payment4.payDeposit();
        payment4.payDeposit();
        payment4.payBalance();
    }

    @Test
    public void test20098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20098");
        payment.Payment payment4 = new payment.Payment((long) 100, (double) (short) 1, "hi!", "");
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
    }

    @Test
    public void test20099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20099");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) (byte) 10, "", "");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment4.payDeposit();
        boolean boolean8 = payment4.paymentCompleted();
        boolean boolean9 = payment4.paymentCompleted();
        boolean boolean10 = payment4.paymentCompleted();
        payment4.payBalance();
        boolean boolean12 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test20100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20100");
        payment.Payment payment4 = new payment.Payment((-1L), (double) 'a', "hi!", "");
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        boolean boolean8 = payment4.paymentCompleted();
        boolean boolean9 = payment4.paymentCompleted();
        boolean boolean10 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy12 = null;
        payment4.setPaymentStrategy(paymentStrategy12);
        payment4.payDeposit();
        payment4.payBalance();
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        java.lang.Class<?> wildcardClass18 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test20101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20101");
        payment.Payment payment4 = new payment.Payment((long) (short) -1, (double) 'a', "hi!", "hi!");
        payment4.payBalance();
        boolean boolean6 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test20102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20102");
        payment.Payment payment4 = new payment.Payment(0L, (double) (short) 1, "", "hi!");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        payment4.payDeposit();
        payment4.payBalance();
        payment4.payBalance();
        boolean boolean13 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy14 = null;
        payment4.setPaymentStrategy(paymentStrategy14);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test20103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20103");
        payment.Payment payment4 = new payment.Payment(100L, (double) (short) 0, "hi!", "hi!");
        boolean boolean5 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        payment.PaymentStrategy paymentStrategy9 = null;
        payment4.setPaymentStrategy(paymentStrategy9);
        payment4.payBalance();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test20104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20104");
        payment.Payment payment4 = new payment.Payment((long) 0, 10.0d, "hi!", "");
        payment4.payDeposit();
        boolean boolean6 = payment4.paymentCompleted();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        payment4.verifyPaymentDetails();
        boolean boolean11 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test20105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20105");
        payment.Payment payment4 = new payment.Payment(100L, (double) (byte) 10, "", "");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
    }

    @Test
    public void test20106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20106");
        payment.Payment payment4 = new payment.Payment(100L, 0.0d, "hi!", "");
        payment4.payBalance();
        payment4.verifyPaymentDetails();
    }

    @Test
    public void test20107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20107");
        payment.Payment payment4 = new payment.Payment((-1L), (double) 'a', "hi!", "");
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment4.payDeposit();
        payment4.payDeposit();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        boolean boolean14 = payment4.paymentCompleted();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy16 = null;
        payment4.setPaymentStrategy(paymentStrategy16);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test20108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20108");
        payment.Payment payment4 = new payment.Payment((-1L), (double) '#', "", "hi!");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        boolean boolean11 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test20109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20109");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) (byte) 10, "", "");
        payment4.payBalance();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        payment4.payBalance();
        boolean boolean10 = payment4.paymentCompleted();
        boolean boolean11 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy16 = null;
        payment4.setPaymentStrategy(paymentStrategy16);
        boolean boolean18 = payment4.paymentCompleted();
        boolean boolean19 = payment4.paymentCompleted();
        payment4.payDeposit();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test20110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20110");
        payment.Payment payment4 = new payment.Payment((long) (short) -1, (double) (byte) 1, "hi!", "");
        payment4.payDeposit();
        boolean boolean6 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test20111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20111");
        payment.Payment payment4 = new payment.Payment((-1L), (double) 'a', "hi!", "");
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        boolean boolean9 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy10 = null;
        payment4.setPaymentStrategy(paymentStrategy10);
        boolean boolean12 = payment4.paymentCompleted();
        boolean boolean13 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy16 = null;
        payment4.setPaymentStrategy(paymentStrategy16);
        payment4.verifyPaymentDetails();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test20112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20112");
        payment.Payment payment4 = new payment.Payment((long) (byte) -1, (double) (byte) -1, "hi!", "hi!");
        java.lang.Class<?> wildcardClass5 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test20113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20113");
        payment.Payment payment4 = new payment.Payment((-1L), (double) 'a', "hi!", "");
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        payment4.payDeposit();
        payment4.payDeposit();
        boolean boolean11 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy14 = null;
        payment4.setPaymentStrategy(paymentStrategy14);
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        boolean boolean19 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test20114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20114");
        payment.Payment payment4 = new payment.Payment((long) (byte) 1, (double) (byte) 0, "hi!", "");
        payment4.payBalance();
        java.lang.Class<?> wildcardClass6 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test20115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20115");
        payment.Payment payment4 = new payment.Payment((long) (byte) -1, (double) (short) 100, "hi!", "");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment4.payDeposit();
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
    }

    @Test
    public void test20116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20116");
        payment.Payment payment4 = new payment.Payment((long) (byte) 1, (double) (short) 100, "hi!", "");
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
    }

    @Test
    public void test20117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20117");
        payment.Payment payment4 = new payment.Payment((long) 'a', (double) 10.0f, "hi!", "");
        payment4.payDeposit();
        payment4.payDeposit();
        boolean boolean7 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test20118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20118");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) (byte) 10, "", "");
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        boolean boolean8 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy9 = null;
        payment4.setPaymentStrategy(paymentStrategy9);
        payment.PaymentStrategy paymentStrategy11 = null;
        payment4.setPaymentStrategy(paymentStrategy11);
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy14 = null;
        payment4.setPaymentStrategy(paymentStrategy14);
        boolean boolean16 = payment4.paymentCompleted();
        payment4.payDeposit();
        boolean boolean18 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test20119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20119");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) (byte) 10, "", "");
        payment4.payBalance();
        boolean boolean6 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        boolean boolean10 = payment4.paymentCompleted();
        payment4.payBalance();
        payment4.payDeposit();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy14 = null;
        payment4.setPaymentStrategy(paymentStrategy14);
        payment.PaymentStrategy paymentStrategy16 = null;
        payment4.setPaymentStrategy(paymentStrategy16);
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy19 = null;
        payment4.setPaymentStrategy(paymentStrategy19);
        payment4.verifyPaymentDetails();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test20120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20120");
        payment.Payment payment4 = new payment.Payment(1L, (double) ' ', "hi!", "");
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        payment4.payBalance();
        payment4.payBalance();
        payment4.payDeposit();
    }

    @Test
    public void test20121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20121");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) (byte) 10, "", "");
        payment4.payDeposit();
        boolean boolean6 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment4.payDeposit();
        payment4.payDeposit();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy14 = null;
        payment4.setPaymentStrategy(paymentStrategy14);
        payment4.payDeposit();
        payment4.payBalance();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test20122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20122");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) (byte) 10, "", "");
        payment4.payBalance();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        payment.PaymentStrategy paymentStrategy9 = null;
        payment4.setPaymentStrategy(paymentStrategy9);
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy13 = null;
        payment4.setPaymentStrategy(paymentStrategy13);
        payment4.payBalance();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy17 = null;
        payment4.setPaymentStrategy(paymentStrategy17);
        payment4.payBalance();
        payment4.payBalance();
    }

    @Test
    public void test20123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20123");
        payment.Payment payment4 = new payment.Payment((long) (short) 0, (double) (-1L), "", "hi!");
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        payment4.payBalance();
        java.lang.Class<?> wildcardClass10 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test20124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20124");
        payment.Payment payment4 = new payment.Payment((-1L), (double) '#', "", "hi!");
        boolean boolean5 = payment4.paymentCompleted();
        boolean boolean6 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        boolean boolean11 = payment4.paymentCompleted();
        payment4.payDeposit();
        boolean boolean13 = payment4.paymentCompleted();
        java.lang.Class<?> wildcardClass14 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test20125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20125");
        payment.Payment payment4 = new payment.Payment((long) (short) 100, (double) 0, "hi!", "hi!");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        payment4.payBalance();
        payment4.payDeposit();
    }

    @Test
    public void test20126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20126");
        payment.Payment payment4 = new payment.Payment((long) (short) 1, 10.0d, "hi!", "hi!");
        payment4.payBalance();
        payment4.payBalance();
    }

    @Test
    public void test20127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20127");
        payment.Payment payment4 = new payment.Payment((long) 'a', (double) 1L, "", "hi!");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        boolean boolean7 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        boolean boolean9 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        boolean boolean11 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy12 = null;
        payment4.setPaymentStrategy(paymentStrategy12);
        payment4.payDeposit();
        payment4.payDeposit();
        payment4.payBalance();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test20128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20128");
        payment.Payment payment4 = new payment.Payment((long) (byte) 10, (double) (-1), "hi!", "");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        java.lang.Class<?> wildcardClass7 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test20129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20129");
        payment.Payment payment4 = new payment.Payment((-1L), (double) (byte) 10, "hi!", "");
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        java.lang.Class<?> wildcardClass7 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test20130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20130");
        payment.Payment payment4 = new payment.Payment((long) ' ', (double) 100L, "hi!", "");
        payment4.payBalance();
        boolean boolean6 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment4.payDeposit();
        boolean boolean9 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment4.payBalance();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test20131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20131");
        payment.Payment payment4 = new payment.Payment(0L, (double) 10L, "hi!", "");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        boolean boolean7 = payment4.paymentCompleted();
        boolean boolean8 = payment4.paymentCompleted();
        payment4.payDeposit();
        boolean boolean10 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test20132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20132");
        payment.Payment payment4 = new payment.Payment((long) (byte) 10, (double) 'a', "", "");
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        payment.PaymentStrategy paymentStrategy9 = null;
        payment4.setPaymentStrategy(paymentStrategy9);
    }

    @Test
    public void test20133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20133");
        payment.Payment payment4 = new payment.Payment((long) (byte) 0, 10.0d, "", "hi!");
        payment4.verifyPaymentDetails();
    }

    @Test
    public void test20134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20134");
        payment.Payment payment4 = new payment.Payment(10L, 0.0d, "hi!", "hi!");
        payment4.verifyPaymentDetails();
        boolean boolean6 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test20135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20135");
        payment.Payment payment4 = new payment.Payment((-1L), (double) 'a', "hi!", "");
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        payment4.payDeposit();
        payment4.payDeposit();
        boolean boolean11 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy14 = null;
        payment4.setPaymentStrategy(paymentStrategy14);
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy17 = null;
        payment4.setPaymentStrategy(paymentStrategy17);
        payment4.payBalance();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test20136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20136");
        payment.Payment payment4 = new payment.Payment((long) '4', 100.0d, "hi!", "hi!");
        payment4.payDeposit();
        java.lang.Class<?> wildcardClass6 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test20137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20137");
        payment.Payment payment4 = new payment.Payment((long) '#', (double) 1.0f, "", "");
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        payment4.payDeposit();
    }

    @Test
    public void test20138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20138");
        payment.Payment payment4 = new payment.Payment((long) '4', 0.0d, "", "hi!");
        boolean boolean5 = payment4.paymentCompleted();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy10 = null;
        payment4.setPaymentStrategy(paymentStrategy10);
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy13 = null;
        payment4.setPaymentStrategy(paymentStrategy13);
        java.lang.Class<?> wildcardClass15 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test20139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20139");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) (byte) 10, "", "");
        payment4.payDeposit();
        boolean boolean6 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        boolean boolean10 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy11 = null;
        payment4.setPaymentStrategy(paymentStrategy11);
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy15 = null;
        payment4.setPaymentStrategy(paymentStrategy15);
        boolean boolean17 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy18 = null;
        payment4.setPaymentStrategy(paymentStrategy18);
        payment.PaymentStrategy paymentStrategy20 = null;
        payment4.setPaymentStrategy(paymentStrategy20);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test20140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20140");
        payment.Payment payment4 = new payment.Payment((long) 'a', 100.0d, "", "hi!");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment4.payBalance();
        payment4.payDeposit();
        payment4.payBalance();
        payment4.payDeposit();
        payment4.payDeposit();
        boolean boolean12 = payment4.paymentCompleted();
        payment4.payBalance();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test20141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20141");
        payment.Payment payment4 = new payment.Payment((long) (byte) 100, (double) 10.0f, "hi!", "hi!");
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
    }

    @Test
    public void test20142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20142");
        payment.Payment payment4 = new payment.Payment((long) 100, (double) 100L, "", "hi!");
        payment4.payBalance();
        payment4.payDeposit();
        java.lang.Class<?> wildcardClass7 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test20143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20143");
        payment.Payment payment4 = new payment.Payment((-1L), (double) (byte) 0, "hi!", "");
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        boolean boolean12 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test20144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20144");
        payment.Payment payment4 = new payment.Payment((long) (short) 0, (double) (short) 0, "", "");
        boolean boolean5 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment4.verifyPaymentDetails();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test20145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20145");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) (byte) 100, "", "hi!");
        boolean boolean5 = payment4.paymentCompleted();
        java.lang.Class<?> wildcardClass6 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test20146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20146");
        payment.Payment payment4 = new payment.Payment(0L, 0.0d, "hi!", "hi!");
        payment4.payDeposit();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        java.lang.Class<?> wildcardClass8 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test20147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20147");
        payment.Payment payment4 = new payment.Payment((long) 100, (double) 10, "", "");
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        payment4.verifyPaymentDetails();
    }

    @Test
    public void test20148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20148");
        payment.Payment payment4 = new payment.Payment((long) (byte) -1, (double) 100.0f, "", "");
        payment4.verifyPaymentDetails();
        boolean boolean6 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        boolean boolean8 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy10 = null;
        payment4.setPaymentStrategy(paymentStrategy10);
        payment.PaymentStrategy paymentStrategy12 = null;
        payment4.setPaymentStrategy(paymentStrategy12);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test20149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20149");
        payment.Payment payment4 = new payment.Payment((-1L), (double) '#', "", "hi!");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
    }

    @Test
    public void test20150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20150");
        payment.Payment payment4 = new payment.Payment((long) (byte) 100, (double) (short) 0, "hi!", "");
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        java.lang.Class<?> wildcardClass7 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test20151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20151");
        payment.Payment payment4 = new payment.Payment((long) 'a', 0.0d, "", "");
        payment4.payBalance();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment4.payBalance();
        payment4.payBalance();
    }

    @Test
    public void test20152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20152");
        payment.Payment payment4 = new payment.Payment((long) (byte) 10, (double) ' ', "", "");
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        boolean boolean8 = payment4.paymentCompleted();
        payment4.payBalance();
        boolean boolean10 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        boolean boolean12 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy13 = null;
        payment4.setPaymentStrategy(paymentStrategy13);
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test20153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20153");
        payment.Payment payment4 = new payment.Payment((long) ' ', (double) (short) 1, "", "hi!");
        boolean boolean5 = payment4.paymentCompleted();
        payment4.payDeposit();
        boolean boolean7 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test20154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20154");
        payment.Payment payment4 = new payment.Payment((long) 10, (double) 1.0f, "hi!", "hi!");
        boolean boolean5 = payment4.paymentCompleted();
        boolean boolean6 = payment4.paymentCompleted();
        boolean boolean7 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test20155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20155");
        payment.Payment payment4 = new payment.Payment((long) (byte) 1, 1.0d, "hi!", "");
        payment4.verifyPaymentDetails();
        boolean boolean6 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        boolean boolean8 = payment4.paymentCompleted();
        payment4.payBalance();
        boolean boolean10 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment4.payDeposit();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test20156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20156");
        payment.Payment payment4 = new payment.Payment((long) (byte) 0, (double) (byte) 1, "hi!", "hi!");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        boolean boolean12 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test20157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20157");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) (byte) 10, "", "");
        payment4.verifyPaymentDetails();
        boolean boolean6 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        boolean boolean8 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy9 = null;
        payment4.setPaymentStrategy(paymentStrategy9);
        payment4.verifyPaymentDetails();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test20158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20158");
        payment.Payment payment4 = new payment.Payment((long) 1, 0.0d, "hi!", "hi!");
        payment4.payBalance();
        payment4.payDeposit();
        boolean boolean7 = payment4.paymentCompleted();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy9 = null;
        payment4.setPaymentStrategy(paymentStrategy9);
        boolean boolean11 = payment4.paymentCompleted();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy13 = null;
        payment4.setPaymentStrategy(paymentStrategy13);
        payment4.payDeposit();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test20159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20159");
        payment.Payment payment4 = new payment.Payment((long) (short) -1, (double) (short) 1, "hi!", "hi!");
        payment4.payBalance();
        boolean boolean6 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        boolean boolean10 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test20160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20160");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) (byte) 10, "", "");
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        boolean boolean8 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy9 = null;
        payment4.setPaymentStrategy(paymentStrategy9);
        payment.PaymentStrategy paymentStrategy11 = null;
        payment4.setPaymentStrategy(paymentStrategy11);
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy16 = null;
        payment4.setPaymentStrategy(paymentStrategy16);
        boolean boolean18 = payment4.paymentCompleted();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy20 = null;
        payment4.setPaymentStrategy(paymentStrategy20);
        payment.PaymentStrategy paymentStrategy22 = null;
        payment4.setPaymentStrategy(paymentStrategy22);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test20161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20161");
        payment.Payment payment4 = new payment.Payment(0L, (double) (short) 100, "", "");
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment4.payDeposit();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy10 = null;
        payment4.setPaymentStrategy(paymentStrategy10);
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy13 = null;
        payment4.setPaymentStrategy(paymentStrategy13);
    }

    @Test
    public void test20162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20162");
        payment.Payment payment4 = new payment.Payment((long) (byte) 100, (double) (short) 10, "", "hi!");
        payment4.verifyPaymentDetails();
        boolean boolean6 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy10 = null;
        payment4.setPaymentStrategy(paymentStrategy10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test20163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20163");
        payment.Payment payment4 = new payment.Payment((-1L), (double) 'a', "hi!", "");
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment4.payBalance();
        boolean boolean9 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        boolean boolean13 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        boolean boolean15 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test20164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20164");
        payment.Payment payment4 = new payment.Payment((long) 1, (double) 10, "", "hi!");
        payment4.verifyPaymentDetails();
        java.lang.Class<?> wildcardClass6 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test20165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20165");
        payment.Payment payment4 = new payment.Payment((-1L), (double) 'a', "hi!", "");
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        boolean boolean9 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy10 = null;
        payment4.setPaymentStrategy(paymentStrategy10);
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test20166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20166");
        payment.Payment payment4 = new payment.Payment((long) (short) 1, (double) (-1), "", "");
        payment4.payDeposit();
        payment4.payDeposit();
    }

    @Test
    public void test20167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20167");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) (byte) 10, "", "");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        boolean boolean9 = payment4.paymentCompleted();
        payment4.payBalance();
        payment4.payBalance();
        boolean boolean12 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment4.payDeposit();
        payment4.payDeposit();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test20168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20168");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) (byte) 10, "", "");
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        payment.PaymentStrategy paymentStrategy10 = null;
        payment4.setPaymentStrategy(paymentStrategy10);
        payment4.payBalance();
        payment4.payDeposit();
        boolean boolean14 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        java.lang.Class<?> wildcardClass16 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test20169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20169");
        payment.Payment payment4 = new payment.Payment((long) (byte) 0, (double) (byte) 1, "hi!", "hi!");
        boolean boolean5 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        payment.PaymentStrategy paymentStrategy9 = null;
        payment4.setPaymentStrategy(paymentStrategy9);
        payment4.payDeposit();
        java.lang.Class<?> wildcardClass12 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test20170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20170");
        payment.Payment payment4 = new payment.Payment((long) 100, (double) 0L, "", "");
    }

    @Test
    public void test20171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20171");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) (byte) 10, "", "");
        payment4.payBalance();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        payment.PaymentStrategy paymentStrategy9 = null;
        payment4.setPaymentStrategy(paymentStrategy9);
        payment4.payDeposit();
        boolean boolean12 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy13 = null;
        payment4.setPaymentStrategy(paymentStrategy13);
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy16 = null;
        payment4.setPaymentStrategy(paymentStrategy16);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test20172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20172");
        payment.Payment payment4 = new payment.Payment((-1L), (double) 'a', "hi!", "");
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment4.payDeposit();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy13 = null;
        payment4.setPaymentStrategy(paymentStrategy13);
        payment4.payBalance();
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
    }

    @Test
    public void test20173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20173");
        payment.Payment payment4 = new payment.Payment((-1L), (double) 'a', "hi!", "");
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        boolean boolean13 = payment4.paymentCompleted();
        payment4.payDeposit();
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test20174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20174");
        payment.Payment payment4 = new payment.Payment((long) (byte) 10, (double) ' ', "hi!", "hi!");
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        payment4.payBalance();
        payment4.payBalance();
        java.lang.Class<?> wildcardClass9 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test20175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20175");
        payment.Payment payment4 = new payment.Payment((long) '#', (double) (short) 0, "hi!", "hi!");
        payment4.payDeposit();
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
    }

    @Test
    public void test20176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20176");
        payment.Payment payment4 = new payment.Payment((long) (short) 10, (double) 0L, "hi!", "hi!");
        boolean boolean5 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test20177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20177");
        payment.Payment payment4 = new payment.Payment(0L, (double) (-1L), "hi!", "");
        boolean boolean5 = payment4.paymentCompleted();
        boolean boolean6 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        payment4.verifyPaymentDetails();
        java.lang.Class<?> wildcardClass11 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test20178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20178");
        payment.Payment payment4 = new payment.Payment((long) (short) 1, (double) 1L, "hi!", "hi!");
        boolean boolean5 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        boolean boolean8 = payment4.paymentCompleted();
        payment4.payBalance();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test20179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20179");
        payment.Payment payment4 = new payment.Payment((-1L), (double) 'a', "hi!", "");
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        payment4.payDeposit();
        payment4.payDeposit();
        boolean boolean11 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment4.payBalance();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy15 = null;
        payment4.setPaymentStrategy(paymentStrategy15);
        payment4.payBalance();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test20180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20180");
        payment.Payment payment4 = new payment.Payment((long) (short) 10, (double) 0.0f, "", "hi!");
        payment4.payBalance();
        java.lang.Class<?> wildcardClass6 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test20181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20181");
        payment.Payment payment4 = new payment.Payment((long) (-1), (double) (short) -1, "hi!", "");
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        boolean boolean14 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test20182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20182");
        payment.Payment payment4 = new payment.Payment((long) 'a', (double) '#', "hi!", "hi!");
        payment4.payDeposit();
        boolean boolean6 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment4.payDeposit();
        java.lang.Class<?> wildcardClass9 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test20183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20183");
        payment.Payment payment4 = new payment.Payment((long) (byte) 0, (double) (-1L), "", "hi!");
        boolean boolean5 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy11 = null;
        payment4.setPaymentStrategy(paymentStrategy11);
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test20184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20184");
        payment.Payment payment4 = new payment.Payment((long) (byte) 0, 100.0d, "", "");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        boolean boolean7 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        boolean boolean10 = payment4.paymentCompleted();
        boolean boolean11 = payment4.paymentCompleted();
        java.lang.Class<?> wildcardClass12 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test20185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20185");
        payment.Payment payment4 = new payment.Payment((-1L), (double) (byte) 0, "hi!", "");
        payment4.payBalance();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        boolean boolean9 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy11 = null;
        payment4.setPaymentStrategy(paymentStrategy11);
        payment4.payDeposit();
        boolean boolean14 = payment4.paymentCompleted();
        boolean boolean15 = payment4.paymentCompleted();
        boolean boolean16 = payment4.paymentCompleted();
        java.lang.Class<?> wildcardClass17 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test20186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20186");
        payment.Payment payment4 = new payment.Payment((-1L), (double) 'a', "hi!", "");
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        boolean boolean8 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy9 = null;
        payment4.setPaymentStrategy(paymentStrategy9);
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment4.payDeposit();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        java.lang.Class<?> wildcardClass20 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test20187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20187");
        payment.Payment payment4 = new payment.Payment((-1L), 0.0d, "hi!", "hi!");
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
    }

    @Test
    public void test20188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20188");
        payment.Payment payment4 = new payment.Payment((long) (short) 10, (double) 0L, "", "");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        payment.PaymentStrategy paymentStrategy9 = null;
        payment4.setPaymentStrategy(paymentStrategy9);
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy12 = null;
        payment4.setPaymentStrategy(paymentStrategy12);
        payment4.payDeposit();
    }

    @Test
    public void test20189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20189");
        payment.Payment payment4 = new payment.Payment((long) '4', (double) 1L, "hi!", "hi!");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        boolean boolean9 = payment4.paymentCompleted();
        payment4.payBalance();
        payment4.payDeposit();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test20190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20190");
        payment.Payment payment4 = new payment.Payment(0L, (double) (short) -1, "", "hi!");
        payment4.verifyPaymentDetails();
        boolean boolean6 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test20191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20191");
        payment.Payment payment4 = new payment.Payment(0L, (double) (byte) 0, "", "hi!");
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        boolean boolean8 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test20192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20192");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) '#', "hi!", "hi!");
        payment4.payBalance();
        boolean boolean6 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test20193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20193");
        payment.Payment payment4 = new payment.Payment(0L, (double) 10.0f, "hi!", "hi!");
        boolean boolean5 = payment4.paymentCompleted();
        boolean boolean6 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment4.payBalance();
        boolean boolean9 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy10 = null;
        payment4.setPaymentStrategy(paymentStrategy10);
        java.lang.Class<?> wildcardClass12 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test20194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20194");
        payment.Payment payment4 = new payment.Payment((long) (byte) 100, 0.0d, "hi!", "");
        boolean boolean5 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment4.payDeposit();
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        payment4.payDeposit();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy14 = null;
        payment4.setPaymentStrategy(paymentStrategy14);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test20195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20195");
        payment.Payment payment4 = new payment.Payment((long) 10, (double) (-1), "", "hi!");
        payment4.payDeposit();
        payment4.payDeposit();
        payment4.payDeposit();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy10 = null;
        payment4.setPaymentStrategy(paymentStrategy10);
    }

    @Test
    public void test20196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20196");
        payment.Payment payment4 = new payment.Payment((long) (short) 100, (double) 100L, "", "");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        boolean boolean9 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test20197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20197");
        payment.Payment payment4 = new payment.Payment(0L, (double) (short) 1, "", "hi!");
        boolean boolean5 = payment4.paymentCompleted();
        payment4.payDeposit();
        boolean boolean7 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        boolean boolean9 = payment4.paymentCompleted();
        payment4.payBalance();
        boolean boolean11 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        boolean boolean14 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test20198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20198");
        payment.Payment payment4 = new payment.Payment((long) (-1), (double) (short) 0, "hi!", "");
        payment4.payDeposit();
        payment4.payDeposit();
    }

    @Test
    public void test20199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20199");
        payment.Payment payment4 = new payment.Payment((long) (byte) 0, (double) (byte) -1, "", "hi!");
        payment4.payDeposit();
        payment4.payDeposit();
        boolean boolean7 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test20200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20200");
        payment.Payment payment4 = new payment.Payment((long) 10, (double) (short) -1, "", "");
        payment4.payBalance();
        boolean boolean6 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test20201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20201");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) (byte) 10, "", "");
        payment4.payDeposit();
        boolean boolean6 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment4.payBalance();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test20202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20202");
        payment.Payment payment4 = new payment.Payment((long) 10, (double) 100L, "hi!", "");
        boolean boolean5 = payment4.paymentCompleted();
        boolean boolean6 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        payment4.payBalance();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test20203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20203");
        payment.Payment payment4 = new payment.Payment((-1L), (double) 'a', "hi!", "");
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy9 = null;
        payment4.setPaymentStrategy(paymentStrategy9);
        payment4.payBalance();
        payment4.verifyPaymentDetails();
    }

    @Test
    public void test20204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20204");
        payment.Payment payment4 = new payment.Payment((long) (byte) 0, (double) (short) 10, "", "");
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment4.verifyPaymentDetails();
    }

    @Test
    public void test20205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20205");
        payment.Payment payment4 = new payment.Payment((-1L), (double) 'a', "hi!", "");
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment4.payDeposit();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        boolean boolean16 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy18 = null;
        payment4.setPaymentStrategy(paymentStrategy18);
        payment4.verifyPaymentDetails();
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test20206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20206");
        payment.Payment payment4 = new payment.Payment((long) ' ', (double) 1.0f, "", "hi!");
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
    }

    @Test
    public void test20207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20207");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) 0.0f, "", "hi!");
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
    }

    @Test
    public void test20208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20208");
        payment.Payment payment4 = new payment.Payment((long) (byte) 100, 0.0d, "", "");
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment4.payBalance();
        payment4.payDeposit();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy10 = null;
        payment4.setPaymentStrategy(paymentStrategy10);
        boolean boolean12 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test20209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20209");
        payment.Payment payment4 = new payment.Payment((long) 100, (double) 1L, "hi!", "");
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
    }

    @Test
    public void test20210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20210");
        payment.Payment payment4 = new payment.Payment((-1L), (double) 'a', "hi!", "");
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        boolean boolean8 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy11 = null;
        payment4.setPaymentStrategy(paymentStrategy11);
        boolean boolean13 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy14 = null;
        payment4.setPaymentStrategy(paymentStrategy14);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test20211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20211");
        payment.Payment payment4 = new payment.Payment((long) 10, (double) (-1L), "", "");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        boolean boolean10 = payment4.paymentCompleted();
        payment4.payDeposit();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test20212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20212");
        payment.Payment payment4 = new payment.Payment((long) (short) 1, (double) (short) 100, "hi!", "hi!");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        payment4.payBalance();
        java.lang.Class<?> wildcardClass10 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test20213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20213");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) (byte) 10, "", "");
        payment4.payDeposit();
        boolean boolean6 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        payment4.payBalance();
        java.lang.Class<?> wildcardClass12 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test20214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20214");
        payment.Payment payment4 = new payment.Payment((long) (byte) 0, (double) 0.0f, "", "hi!");
        payment4.payDeposit();
        payment4.payDeposit();
        boolean boolean7 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test20215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20215");
        payment.Payment payment4 = new payment.Payment((long) (short) 1, (double) '4', "", "");
        java.lang.Class<?> wildcardClass5 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test20216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20216");
        payment.Payment payment4 = new payment.Payment((-1L), (double) 'a', "hi!", "");
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        boolean boolean8 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy11 = null;
        payment4.setPaymentStrategy(paymentStrategy11);
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test20217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20217");
        payment.Payment payment4 = new payment.Payment((long) (byte) 10, (double) (byte) -1, "hi!", "hi!");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment4.payDeposit();
        java.lang.Class<?> wildcardClass8 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test20218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20218");
        payment.Payment payment4 = new payment.Payment((long) (byte) -1, (double) (short) 100, "", "hi!");
        boolean boolean5 = payment4.paymentCompleted();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        payment4.payDeposit();
        boolean boolean10 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test20219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20219");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) (byte) 10, "", "");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy9 = null;
        payment4.setPaymentStrategy(paymentStrategy9);
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy12 = null;
        payment4.setPaymentStrategy(paymentStrategy12);
        payment4.payBalance();
        boolean boolean15 = payment4.paymentCompleted();
        boolean boolean16 = payment4.paymentCompleted();
        boolean boolean17 = payment4.paymentCompleted();
        payment4.payDeposit();
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test20220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20220");
        payment.Payment payment4 = new payment.Payment((long) (short) -1, (double) (short) 1, "hi!", "hi!");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment4.payDeposit();
        boolean boolean8 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        boolean boolean10 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        boolean boolean13 = payment4.paymentCompleted();
        payment4.payBalance();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test20221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20221");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) 10, "", "");
    }

    @Test
    public void test20222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20222");
        payment.Payment payment4 = new payment.Payment(1L, (double) 100, "hi!", "hi!");
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
    }

    @Test
    public void test20223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20223");
        payment.Payment payment4 = new payment.Payment((long) 100, (double) 1, "hi!", "");
        payment4.payDeposit();
        boolean boolean6 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test20224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20224");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) (short) 10, "hi!", "");
        payment4.verifyPaymentDetails();
        boolean boolean6 = payment4.paymentCompleted();
        payment4.payDeposit();
        boolean boolean8 = payment4.paymentCompleted();
        payment4.payBalance();
        java.lang.Class<?> wildcardClass10 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test20225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20225");
        payment.Payment payment4 = new payment.Payment(0L, (double) 10, "", "");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        payment.PaymentStrategy paymentStrategy10 = null;
        payment4.setPaymentStrategy(paymentStrategy10);
        payment4.verifyPaymentDetails();
    }

    @Test
    public void test20226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20226");
        payment.Payment payment4 = new payment.Payment((-1L), (double) 'a', "hi!", "");
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        java.lang.Class<?> wildcardClass11 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test20227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20227");
        payment.Payment payment4 = new payment.Payment((long) 100, (double) (short) 1, "", "");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        payment.PaymentStrategy paymentStrategy9 = null;
        payment4.setPaymentStrategy(paymentStrategy9);
    }

    @Test
    public void test20228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20228");
        payment.Payment payment4 = new payment.Payment((long) 100, (double) (short) 10, "hi!", "hi!");
        payment4.verifyPaymentDetails();
    }

    @Test
    public void test20229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20229");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) (byte) 10, "", "");
        payment4.payBalance();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        payment4.payBalance();
        boolean boolean10 = payment4.paymentCompleted();
        boolean boolean11 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment4.payBalance();
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        boolean boolean18 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test20230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20230");
        payment.Payment payment4 = new payment.Payment((long) (byte) 0, (double) (byte) 1, "hi!", "hi!");
        boolean boolean5 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        payment.PaymentStrategy paymentStrategy10 = null;
        payment4.setPaymentStrategy(paymentStrategy10);
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy13 = null;
        payment4.setPaymentStrategy(paymentStrategy13);
        java.lang.Class<?> wildcardClass15 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test20231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20231");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) (byte) 10, "", "");
        payment4.payBalance();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        payment4.payBalance();
        boolean boolean10 = payment4.paymentCompleted();
        boolean boolean11 = payment4.paymentCompleted();
        payment4.payDeposit();
        boolean boolean13 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment4.payDeposit();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test20232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20232");
        payment.Payment payment4 = new payment.Payment(10L, (double) (short) 100, "hi!", "hi!");
        payment4.payBalance();
        boolean boolean6 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        payment4.payBalance();
        boolean boolean10 = payment4.paymentCompleted();
        boolean boolean11 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test20233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20233");
        payment.Payment payment4 = new payment.Payment((long) 100, (double) (byte) 10, "hi!", "");
        payment4.payDeposit();
    }

    @Test
    public void test20234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20234");
        payment.Payment payment4 = new payment.Payment(0L, (double) (byte) -1, "", "hi!");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        payment4.payBalance();
        boolean boolean10 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test20235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20235");
        payment.Payment payment4 = new payment.Payment(0L, (double) (-1L), "hi!", "hi!");
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment4.payDeposit();
        payment4.payDeposit();
        payment4.payDeposit();
    }

    @Test
    public void test20236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20236");
        payment.Payment payment4 = new payment.Payment((long) 'a', (double) 1L, "", "hi!");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment4.verifyPaymentDetails();
        boolean boolean8 = payment4.paymentCompleted();
        payment4.payBalance();
        payment4.payDeposit();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy12 = null;
        payment4.setPaymentStrategy(paymentStrategy12);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test20237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20237");
        payment.Payment payment4 = new payment.Payment(10L, (double) 10, "", "hi!");
        payment4.payDeposit();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
    }

    @Test
    public void test20238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20238");
        payment.Payment payment4 = new payment.Payment((long) ' ', (double) 100.0f, "hi!", "");
        payment4.payDeposit();
        payment4.payBalance();
    }

    @Test
    public void test20239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20239");
        payment.Payment payment4 = new payment.Payment((long) (short) 1, (double) (short) 100, "hi!", "hi!");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        payment4.payBalance();
        payment4.payBalance();
        payment4.payBalance();
    }

    @Test
    public void test20240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20240");
        payment.Payment payment4 = new payment.Payment((long) 'a', (double) '#', "", "");
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        boolean boolean7 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test20241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20241");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) '4', "", "");
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment4.payDeposit();
    }

    @Test
    public void test20242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20242");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) 1, "hi!", "hi!");
        payment4.payBalance();
        payment4.payDeposit();
    }

    @Test
    public void test20243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20243");
        payment.Payment payment4 = new payment.Payment(0L, (double) 1L, "", "");
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        boolean boolean7 = payment4.paymentCompleted();
        boolean boolean8 = payment4.paymentCompleted();
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test20244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20244");
        payment.Payment payment4 = new payment.Payment((long) '4', (double) 10, "", "hi!");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment4.payBalance();
    }

    @Test
    public void test20245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20245");
        payment.Payment payment4 = new payment.Payment((long) (byte) 10, (double) (short) 1, "hi!", "hi!");
        boolean boolean5 = payment4.paymentCompleted();
        payment4.payDeposit();
        java.lang.Class<?> wildcardClass7 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test20246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20246");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) (byte) 10, "", "");
        payment4.payBalance();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        payment.PaymentStrategy paymentStrategy9 = null;
        payment4.setPaymentStrategy(paymentStrategy9);
        payment4.payDeposit();
        boolean boolean12 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy13 = null;
        payment4.setPaymentStrategy(paymentStrategy13);
        boolean boolean15 = payment4.paymentCompleted();
        boolean boolean16 = payment4.paymentCompleted();
        java.lang.Class<?> wildcardClass17 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test20247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20247");
        payment.Payment payment4 = new payment.Payment((long) ' ', (double) 10L, "hi!", "");
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        boolean boolean8 = payment4.paymentCompleted();
        payment4.payDeposit();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test20248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20248");
        payment.Payment payment4 = new payment.Payment(100L, (double) 1L, "hi!", "hi!");
        boolean boolean5 = payment4.paymentCompleted();
        payment4.payBalance();
        java.lang.Class<?> wildcardClass7 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test20249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20249");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) (byte) 10, "", "");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        java.lang.Class<?> wildcardClass10 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test20250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20250");
        payment.Payment payment4 = new payment.Payment(100L, (double) (-1), "hi!", "hi!");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        payment4.payDeposit();
        payment4.payBalance();
        payment4.payDeposit();
        payment4.payDeposit();
    }

    @Test
    public void test20251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20251");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) (byte) 10, "", "");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy9 = null;
        payment4.setPaymentStrategy(paymentStrategy9);
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
    }

    @Test
    public void test20252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20252");
        payment.Payment payment4 = new payment.Payment((-1L), (double) 'a', "hi!", "");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        boolean boolean7 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy12 = null;
        payment4.setPaymentStrategy(paymentStrategy12);
        payment4.payDeposit();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test20253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20253");
        payment.Payment payment4 = new payment.Payment((long) (short) 10, (double) 0L, "", "");
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment4.verifyPaymentDetails();
        boolean boolean9 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test20254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20254");
        payment.Payment payment4 = new payment.Payment(0L, (double) (-1L), "hi!", "");
        boolean boolean5 = payment4.paymentCompleted();
        boolean boolean6 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy12 = null;
        payment4.setPaymentStrategy(paymentStrategy12);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test20255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20255");
        payment.Payment payment4 = new payment.Payment((long) (short) 1, (double) 1L, "hi!", "hi!");
        payment4.payDeposit();
        payment4.payBalance();
    }

    @Test
    public void test20256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20256");
        payment.Payment payment4 = new payment.Payment((long) 'a', (double) 1L, "", "hi!");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        boolean boolean7 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        boolean boolean9 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        boolean boolean11 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        boolean boolean14 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test20257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20257");
        payment.Payment payment4 = new payment.Payment((long) (short) -1, (double) (short) 1, "hi!", "hi!");
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment4.payDeposit();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy10 = null;
        payment4.setPaymentStrategy(paymentStrategy10);
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy13 = null;
        payment4.setPaymentStrategy(paymentStrategy13);
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy16 = null;
        payment4.setPaymentStrategy(paymentStrategy16);
        payment4.verifyPaymentDetails();
    }

    @Test
    public void test20258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20258");
        payment.Payment payment4 = new payment.Payment((long) 'a', 0.0d, "", "");
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        payment.PaymentStrategy paymentStrategy9 = null;
        payment4.setPaymentStrategy(paymentStrategy9);
        payment.PaymentStrategy paymentStrategy11 = null;
        payment4.setPaymentStrategy(paymentStrategy11);
        boolean boolean13 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment4.payBalance();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy17 = null;
        payment4.setPaymentStrategy(paymentStrategy17);
        payment4.payBalance();
        payment4.payDeposit();
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test20259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20259");
        payment.Payment payment4 = new payment.Payment((long) ' ', (double) (short) 10, "hi!", "");
        payment4.payDeposit();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
    }

    @Test
    public void test20260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20260");
        payment.Payment payment4 = new payment.Payment((-1L), (double) (byte) 0, "hi!", "");
        boolean boolean5 = payment4.paymentCompleted();
        payment4.payBalance();
        payment4.payDeposit();
        boolean boolean8 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy12 = null;
        payment4.setPaymentStrategy(paymentStrategy12);
        java.lang.Class<?> wildcardClass14 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test20261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20261");
        payment.Payment payment4 = new payment.Payment(1L, (double) 10.0f, "hi!", "");
        payment4.payDeposit();
        payment4.payDeposit();
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        boolean boolean9 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        boolean boolean12 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test20262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20262");
        payment.Payment payment4 = new payment.Payment((long) (-1), (double) (byte) 1, "", "");
        payment4.payDeposit();
        payment4.payDeposit();
        payment4.payDeposit();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy9 = null;
        payment4.setPaymentStrategy(paymentStrategy9);
        payment4.payDeposit();
    }

    @Test
    public void test20263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20263");
        payment.Payment payment4 = new payment.Payment(10L, (double) 100.0f, "", "hi!");
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        boolean boolean7 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test20264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20264");
        payment.Payment payment4 = new payment.Payment((long) 1, (double) 10L, "", "hi!");
        java.lang.Class<?> wildcardClass5 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test20265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20265");
        payment.Payment payment4 = new payment.Payment((long) (short) 100, (double) 1.0f, "hi!", "hi!");
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment4.verifyPaymentDetails();
    }

    @Test
    public void test20266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20266");
        payment.Payment payment4 = new payment.Payment((long) (byte) 0, (double) (short) 0, "", "");
        boolean boolean5 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        java.lang.Class<?> wildcardClass13 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test20267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20267");
        payment.Payment payment4 = new payment.Payment((long) (byte) -1, 1.0d, "hi!", "");
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
    }

    @Test
    public void test20268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20268");
        payment.Payment payment4 = new payment.Payment((long) (-1), (double) 0.0f, "hi!", "");
        payment4.payBalance();
    }

    @Test
    public void test20269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20269");
        payment.Payment payment4 = new payment.Payment((long) (short) 0, (double) 1L, "hi!", "");
    }

    @Test
    public void test20270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20270");
        payment.Payment payment4 = new payment.Payment((long) (short) 100, (double) (byte) 100, "", "");
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment4.payDeposit();
    }

    @Test
    public void test20271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20271");
        payment.Payment payment4 = new payment.Payment((long) (-1), (double) (short) 10, "hi!", "hi!");
        payment4.payBalance();
        payment4.payBalance();
        boolean boolean7 = payment4.paymentCompleted();
        payment4.payDeposit();
        java.lang.Class<?> wildcardClass9 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test20272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20272");
        payment.Payment payment4 = new payment.Payment(10L, (double) 10, "", "hi!");
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment4.payDeposit();
    }

    @Test
    public void test20273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20273");
        payment.Payment payment4 = new payment.Payment((long) (byte) -1, 10.0d, "hi!", "");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        payment4.verifyPaymentDetails();
        java.lang.Class<?> wildcardClass10 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test20274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20274");
        payment.Payment payment4 = new payment.Payment((long) 10, (double) (-1), "", "hi!");
        payment4.payDeposit();
        payment4.payDeposit();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy9 = null;
        payment4.setPaymentStrategy(paymentStrategy9);
        payment4.payDeposit();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy13 = null;
        payment4.setPaymentStrategy(paymentStrategy13);
        payment.PaymentStrategy paymentStrategy15 = null;
        payment4.setPaymentStrategy(paymentStrategy15);
        payment4.payBalance();
        boolean boolean18 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy19 = null;
        payment4.setPaymentStrategy(paymentStrategy19);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test20275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20275");
        payment.Payment payment4 = new payment.Payment((-1L), (double) (byte) 1, "hi!", "hi!");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        boolean boolean7 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test20276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20276");
        payment.Payment payment4 = new payment.Payment((long) (-1), (double) (short) -1, "hi!", "");
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        boolean boolean10 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy11 = null;
        payment4.setPaymentStrategy(paymentStrategy11);
        payment.PaymentStrategy paymentStrategy13 = null;
        payment4.setPaymentStrategy(paymentStrategy13);
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test20277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20277");
        payment.Payment payment4 = new payment.Payment((long) ' ', (double) 0, "hi!", "hi!");
        payment4.payBalance();
    }

    @Test
    public void test20278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20278");
        payment.Payment payment4 = new payment.Payment((long) (short) 100, 100.0d, "hi!", "");
        payment4.verifyPaymentDetails();
        boolean boolean6 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test20279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20279");
        payment.Payment payment4 = new payment.Payment((long) (-1), (double) (short) -1, "hi!", "");
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment4.payDeposit();
    }

    @Test
    public void test20280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20280");
        payment.Payment payment4 = new payment.Payment((long) ' ', (double) (-1), "hi!", "");
        payment4.payBalance();
        payment4.payDeposit();
    }

    @Test
    public void test20281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20281");
        payment.Payment payment4 = new payment.Payment(100L, (double) (short) 0, "hi!", "hi!");
        boolean boolean5 = payment4.paymentCompleted();
        payment4.payDeposit();
        boolean boolean7 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        boolean boolean10 = payment4.paymentCompleted();
        payment4.payBalance();
        java.lang.Class<?> wildcardClass12 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test20282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20282");
        payment.Payment payment4 = new payment.Payment((long) (-1), (double) 0.0f, "", "hi!");
        boolean boolean5 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test20283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20283");
        payment.Payment payment4 = new payment.Payment(0L, (double) (short) 100, "", "hi!");
        payment4.verifyPaymentDetails();
        boolean boolean6 = payment4.paymentCompleted();
        payment4.payBalance();
        payment4.payDeposit();
        boolean boolean9 = payment4.paymentCompleted();
        payment4.payBalance();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test20284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20284");
        payment.Payment payment4 = new payment.Payment((long) (byte) 100, 0.0d, "", "");
        payment4.verifyPaymentDetails();
        boolean boolean6 = payment4.paymentCompleted();
        payment4.payBalance();
        boolean boolean8 = payment4.paymentCompleted();
        payment4.payBalance();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test20285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20285");
        payment.Payment payment4 = new payment.Payment(10L, (double) 0, "", "");
        payment4.payBalance();
        boolean boolean6 = payment4.paymentCompleted();
        payment4.payDeposit();
        boolean boolean8 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy10 = null;
        payment4.setPaymentStrategy(paymentStrategy10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test20286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20286");
        payment.Payment payment4 = new payment.Payment((-1L), 1.0d, "", "");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
    }

    @Test
    public void test20287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20287");
        payment.Payment payment4 = new payment.Payment((long) ' ', (double) (short) 0, "hi!", "hi!");
        payment4.payBalance();
        boolean boolean6 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test20288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20288");
        payment.Payment payment4 = new payment.Payment((long) (-1), (double) (byte) 1, "", "");
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        boolean boolean8 = payment4.paymentCompleted();
        boolean boolean9 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy11 = null;
        payment4.setPaymentStrategy(paymentStrategy11);
        payment.PaymentStrategy paymentStrategy13 = null;
        payment4.setPaymentStrategy(paymentStrategy13);
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        boolean boolean17 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test20289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20289");
        payment.Payment payment4 = new payment.Payment((long) (byte) 100, (double) (short) -1, "", "");
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        payment4.payDeposit();
    }

    @Test
    public void test20290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20290");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) 'a', "", "hi!");
        payment4.payBalance();
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        payment.PaymentStrategy paymentStrategy10 = null;
        payment4.setPaymentStrategy(paymentStrategy10);
        payment4.payDeposit();
    }

    @Test
    public void test20291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20291");
        payment.Payment payment4 = new payment.Payment((long) 10, (double) (-1), "", "hi!");
        payment4.payDeposit();
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
    }

    @Test
    public void test20292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20292");
        payment.Payment payment4 = new payment.Payment(0L, (double) (-1), "hi!", "hi!");
        payment4.payDeposit();
        payment4.payBalance();
        boolean boolean7 = payment4.paymentCompleted();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy9 = null;
        payment4.setPaymentStrategy(paymentStrategy9);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test20293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20293");
        payment.Payment payment4 = new payment.Payment((long) (short) 10, (double) 'a', "", "hi!");
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        java.lang.Class<?> wildcardClass7 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test20294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20294");
        payment.Payment payment4 = new payment.Payment((-1L), (double) 'a', "hi!", "");
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy9 = null;
        payment4.setPaymentStrategy(paymentStrategy9);
        boolean boolean11 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy12 = null;
        payment4.setPaymentStrategy(paymentStrategy12);
        payment4.verifyPaymentDetails();
        boolean boolean15 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy16 = null;
        payment4.setPaymentStrategy(paymentStrategy16);
        payment.PaymentStrategy paymentStrategy18 = null;
        payment4.setPaymentStrategy(paymentStrategy18);
        payment.PaymentStrategy paymentStrategy20 = null;
        payment4.setPaymentStrategy(paymentStrategy20);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test20295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20295");
        payment.Payment payment4 = new payment.Payment(100L, (double) (-1.0f), "hi!", "hi!");
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        boolean boolean12 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test20296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20296");
        payment.Payment payment4 = new payment.Payment((-1L), (double) 'a', "hi!", "");
        payment4.verifyPaymentDetails();
        boolean boolean6 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        payment.PaymentStrategy paymentStrategy9 = null;
        payment4.setPaymentStrategy(paymentStrategy9);
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy12 = null;
        payment4.setPaymentStrategy(paymentStrategy12);
        payment4.payBalance();
        boolean boolean15 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test20297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20297");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) (byte) 10, "", "");
        payment4.payDeposit();
        boolean boolean6 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy10 = null;
        payment4.setPaymentStrategy(paymentStrategy10);
        payment4.payDeposit();
        boolean boolean13 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy16 = null;
        payment4.setPaymentStrategy(paymentStrategy16);
        payment4.verifyPaymentDetails();
        boolean boolean19 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test20298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20298");
        payment.Payment payment4 = new payment.Payment((long) 10, (double) 100.0f, "", "");
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy10 = null;
        payment4.setPaymentStrategy(paymentStrategy10);
        payment4.verifyPaymentDetails();
    }

    @Test
    public void test20299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20299");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) (byte) 10, "", "");
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        payment.PaymentStrategy paymentStrategy10 = null;
        payment4.setPaymentStrategy(paymentStrategy10);
        payment4.payBalance();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy14 = null;
        payment4.setPaymentStrategy(paymentStrategy14);
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy17 = null;
        payment4.setPaymentStrategy(paymentStrategy17);
    }

    @Test
    public void test20300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20300");
        payment.Payment payment4 = new payment.Payment(1L, (double) (byte) 0, "", "");
        boolean boolean5 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        boolean boolean8 = payment4.paymentCompleted();
        payment4.payDeposit();
        boolean boolean10 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment4.payBalance();
        payment4.payBalance();
        boolean boolean14 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test20301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20301");
        payment.Payment payment4 = new payment.Payment((long) (byte) 1, (double) (byte) 100, "", "");
        payment4.payDeposit();
    }

    @Test
    public void test20302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20302");
        payment.Payment payment4 = new payment.Payment((long) (byte) 10, (double) 1, "", "hi!");
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        java.lang.Class<?> wildcardClass10 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test20303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20303");
        payment.Payment payment4 = new payment.Payment((-1L), (double) (byte) 0, "hi!", "");
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        payment4.payBalance();
        payment4.payBalance();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy14 = null;
        payment4.setPaymentStrategy(paymentStrategy14);
        payment.PaymentStrategy paymentStrategy16 = null;
        payment4.setPaymentStrategy(paymentStrategy16);
        payment.PaymentStrategy paymentStrategy18 = null;
        payment4.setPaymentStrategy(paymentStrategy18);
    }

    @Test
    public void test20304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20304");
        payment.Payment payment4 = new payment.Payment((long) (byte) 1, 0.0d, "hi!", "");
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy10 = null;
        payment4.setPaymentStrategy(paymentStrategy10);
        boolean boolean12 = payment4.paymentCompleted();
        payment4.payDeposit();
        java.lang.Class<?> wildcardClass14 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test20305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20305");
        payment.Payment payment4 = new payment.Payment((long) (byte) 100, (double) (short) 100, "", "hi!");
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        payment4.payDeposit();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy9 = null;
        payment4.setPaymentStrategy(paymentStrategy9);
        payment.PaymentStrategy paymentStrategy11 = null;
        payment4.setPaymentStrategy(paymentStrategy11);
        boolean boolean13 = payment4.paymentCompleted();
        boolean boolean14 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy16 = null;
        payment4.setPaymentStrategy(paymentStrategy16);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test20306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20306");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) (byte) 10, "", "");
        payment4.payDeposit();
        boolean boolean6 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        boolean boolean10 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy12 = null;
        payment4.setPaymentStrategy(paymentStrategy12);
        payment.PaymentStrategy paymentStrategy14 = null;
        payment4.setPaymentStrategy(paymentStrategy14);
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy19 = null;
        payment4.setPaymentStrategy(paymentStrategy19);
        boolean boolean21 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test20307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20307");
        payment.Payment payment4 = new payment.Payment(100L, (double) (-1), "hi!", "hi!");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment4.payBalance();
        boolean boolean8 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        boolean boolean11 = payment4.paymentCompleted();
        boolean boolean12 = payment4.paymentCompleted();
        payment4.payBalance();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test20308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20308");
        payment.Payment payment4 = new payment.Payment((long) (byte) 10, (double) 0L, "hi!", "");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        boolean boolean7 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test20309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20309");
        payment.Payment payment4 = new payment.Payment((long) '#', (double) 10.0f, "", "hi!");
        payment4.payBalance();
        payment4.payBalance();
        boolean boolean7 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        boolean boolean10 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test20310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20310");
        payment.Payment payment4 = new payment.Payment((long) (short) 0, (double) 0.0f, "hi!", "");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment4.payDeposit();
        boolean boolean8 = payment4.paymentCompleted();
        java.lang.Class<?> wildcardClass9 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test20311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20311");
        payment.Payment payment4 = new payment.Payment((-1L), 0.0d, "", "hi!");
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
    }

    @Test
    public void test20312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20312");
        payment.Payment payment4 = new payment.Payment((-1L), (double) 'a', "hi!", "");
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        boolean boolean9 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy10 = null;
        payment4.setPaymentStrategy(paymentStrategy10);
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        boolean boolean19 = payment4.paymentCompleted();
        boolean boolean20 = payment4.paymentCompleted();
        payment4.payDeposit();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test20313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20313");
        payment.Payment payment4 = new payment.Payment(1L, (double) (byte) 0, "", "");
        boolean boolean5 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy9 = null;
        payment4.setPaymentStrategy(paymentStrategy9);
        payment.PaymentStrategy paymentStrategy11 = null;
        payment4.setPaymentStrategy(paymentStrategy11);
        payment4.payBalance();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test20314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20314");
        payment.Payment payment4 = new payment.Payment((-1L), (double) 'a', "hi!", "");
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        payment4.payDeposit();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy11 = null;
        payment4.setPaymentStrategy(paymentStrategy11);
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy16 = null;
        payment4.setPaymentStrategy(paymentStrategy16);
        boolean boolean18 = payment4.paymentCompleted();
        payment4.payBalance();
        payment4.payDeposit();
        boolean boolean21 = payment4.paymentCompleted();
        java.lang.Class<?> wildcardClass22 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test20315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20315");
        payment.Payment payment4 = new payment.Payment((long) (short) 100, (double) 10L, "", "");
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
    }

    @Test
    public void test20316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20316");
        payment.Payment payment4 = new payment.Payment((long) (-1), (double) (byte) 1, "", "");
        boolean boolean5 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        payment.PaymentStrategy paymentStrategy10 = null;
        payment4.setPaymentStrategy(paymentStrategy10);
        payment4.payDeposit();
        boolean boolean13 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy14 = null;
        payment4.setPaymentStrategy(paymentStrategy14);
        payment.PaymentStrategy paymentStrategy16 = null;
        payment4.setPaymentStrategy(paymentStrategy16);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test20317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20317");
        payment.Payment payment4 = new payment.Payment((-1L), (double) (byte) 0, "hi!", "");
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        payment4.payBalance();
        payment4.payBalance();
        payment4.payDeposit();
        java.lang.Class<?> wildcardClass13 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test20318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20318");
        payment.Payment payment4 = new payment.Payment((long) (short) 100, (double) (byte) 1, "", "hi!");
        payment4.payDeposit();
        payment4.payBalance();
        boolean boolean7 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test20319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20319");
        payment.Payment payment4 = new payment.Payment((long) (-1), (double) (byte) 1, "", "");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
    }

    @Test
    public void test20320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20320");
        payment.Payment payment4 = new payment.Payment((long) (-1), (double) (short) -1, "hi!", "");
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy9 = null;
        payment4.setPaymentStrategy(paymentStrategy9);
        payment4.payBalance();
        boolean boolean12 = payment4.paymentCompleted();
        boolean boolean13 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        boolean boolean16 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy17 = null;
        payment4.setPaymentStrategy(paymentStrategy17);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test20321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20321");
        payment.Payment payment4 = new payment.Payment(100L, (double) '4', "hi!", "");
        payment4.payBalance();
        payment4.payDeposit();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
    }

    @Test
    public void test20322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20322");
        payment.Payment payment4 = new payment.Payment(100L, (double) (byte) 0, "", "hi!");
        boolean boolean5 = payment4.paymentCompleted();
        boolean boolean6 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test20323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20323");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) (byte) 10, "", "");
        payment4.payDeposit();
        boolean boolean6 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        payment4.payBalance();
        boolean boolean11 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy13 = null;
        payment4.setPaymentStrategy(paymentStrategy13);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test20324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20324");
        payment.Payment payment4 = new payment.Payment(10L, (double) 10L, "hi!", "hi!");
        boolean boolean5 = payment4.paymentCompleted();
        boolean boolean6 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test20325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20325");
        payment.Payment payment4 = new payment.Payment((long) (-1), (double) (short) -1, "hi!", "");
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy9 = null;
        payment4.setPaymentStrategy(paymentStrategy9);
        payment4.payBalance();
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        boolean boolean14 = payment4.paymentCompleted();
        boolean boolean15 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test20326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20326");
        payment.Payment payment4 = new payment.Payment((long) (short) 10, (double) (-1L), "", "hi!");
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
    }

    @Test
    public void test20327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20327");
        payment.Payment payment4 = new payment.Payment((long) (-1), (double) (short) -1, "hi!", "");
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        boolean boolean10 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        boolean boolean13 = payment4.paymentCompleted();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy15 = null;
        payment4.setPaymentStrategy(paymentStrategy15);
        payment.PaymentStrategy paymentStrategy17 = null;
        payment4.setPaymentStrategy(paymentStrategy17);
        payment4.payDeposit();
        payment4.payBalance();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test20328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20328");
        payment.Payment payment4 = new payment.Payment((long) (short) -1, (double) (short) 1, "hi!", "hi!");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        boolean boolean7 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        java.lang.Class<?> wildcardClass10 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test20329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20329");
        payment.Payment payment4 = new payment.Payment((long) (short) -1, (double) (short) 1, "hi!", "hi!");
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy12 = null;
        payment4.setPaymentStrategy(paymentStrategy12);
        payment.PaymentStrategy paymentStrategy14 = null;
        payment4.setPaymentStrategy(paymentStrategy14);
    }

    @Test
    public void test20330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20330");
        payment.Payment payment4 = new payment.Payment((long) (byte) 1, (double) (short) 1, "", "");
        boolean boolean5 = payment4.paymentCompleted();
        payment4.payBalance();
        boolean boolean7 = payment4.paymentCompleted();
        payment4.payBalance();
        boolean boolean9 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test20331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20331");
        payment.Payment payment4 = new payment.Payment((-1L), (double) 'a', "hi!", "");
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        boolean boolean8 = payment4.paymentCompleted();
        boolean boolean9 = payment4.paymentCompleted();
        boolean boolean10 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy12 = null;
        payment4.setPaymentStrategy(paymentStrategy12);
        payment4.payDeposit();
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        boolean boolean17 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy18 = null;
        payment4.setPaymentStrategy(paymentStrategy18);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test20332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20332");
        payment.Payment payment4 = new payment.Payment((long) (byte) 1, (double) 0.0f, "hi!", "");
        payment4.payBalance();
        payment4.payDeposit();
        payment4.payDeposit();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy9 = null;
        payment4.setPaymentStrategy(paymentStrategy9);
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy12 = null;
        payment4.setPaymentStrategy(paymentStrategy12);
    }

    @Test
    public void test20333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20333");
        payment.Payment payment4 = new payment.Payment((-1L), (double) 'a', "hi!", "");
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        payment4.payBalance();
        boolean boolean11 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test20334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20334");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) (byte) 10, "", "");
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy9 = null;
        payment4.setPaymentStrategy(paymentStrategy9);
    }

    @Test
    public void test20335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20335");
        payment.Payment payment4 = new payment.Payment((long) (byte) 0, (double) (short) 0, "hi!", "hi!");
        boolean boolean5 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test20336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20336");
        payment.Payment payment4 = new payment.Payment((-1L), (double) (byte) 0, "hi!", "");
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        payment.PaymentStrategy paymentStrategy10 = null;
        payment4.setPaymentStrategy(paymentStrategy10);
        payment4.payDeposit();
        payment4.payDeposit();
        payment4.payDeposit();
        java.lang.Class<?> wildcardClass15 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test20337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20337");
        payment.Payment payment4 = new payment.Payment(1L, (double) 10.0f, "hi!", "");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        boolean boolean7 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy9 = null;
        payment4.setPaymentStrategy(paymentStrategy9);
        boolean boolean11 = payment4.paymentCompleted();
        payment4.payDeposit();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test20338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20338");
        payment.Payment payment4 = new payment.Payment(10L, (double) (byte) -1, "hi!", "");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        java.lang.Class<?> wildcardClass7 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test20339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20339");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) (byte) 10, "", "");
        payment4.payDeposit();
        boolean boolean6 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        boolean boolean10 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy11 = null;
        payment4.setPaymentStrategy(paymentStrategy11);
        payment.PaymentStrategy paymentStrategy13 = null;
        payment4.setPaymentStrategy(paymentStrategy13);
        boolean boolean15 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy17 = null;
        payment4.setPaymentStrategy(paymentStrategy17);
        payment4.payDeposit();
        payment4.payBalance();
        payment4.payDeposit();
        payment4.payBalance();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy24 = null;
        payment4.setPaymentStrategy(paymentStrategy24);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test20340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20340");
        payment.Payment payment4 = new payment.Payment((long) (short) 0, (double) (short) 0, "", "");
        boolean boolean5 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy10 = null;
        payment4.setPaymentStrategy(paymentStrategy10);
        payment4.payDeposit();
        java.lang.Class<?> wildcardClass13 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test20341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20341");
        payment.Payment payment4 = new payment.Payment((-1L), (double) (byte) 0, "hi!", "");
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        payment.PaymentStrategy paymentStrategy9 = null;
        payment4.setPaymentStrategy(paymentStrategy9);
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy12 = null;
        payment4.setPaymentStrategy(paymentStrategy12);
        payment.PaymentStrategy paymentStrategy14 = null;
        payment4.setPaymentStrategy(paymentStrategy14);
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy17 = null;
        payment4.setPaymentStrategy(paymentStrategy17);
        boolean boolean19 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test20342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20342");
        payment.Payment payment4 = new payment.Payment((long) '#', (double) 0L, "", "");
        payment4.payBalance();
        payment4.payBalance();
        boolean boolean7 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        payment.PaymentStrategy paymentStrategy10 = null;
        payment4.setPaymentStrategy(paymentStrategy10);
        payment.PaymentStrategy paymentStrategy12 = null;
        payment4.setPaymentStrategy(paymentStrategy12);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test20343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20343");
        payment.Payment payment4 = new payment.Payment((long) (byte) 100, (double) (byte) 100, "hi!", "hi!");
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        boolean boolean8 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test20344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20344");
        payment.Payment payment4 = new payment.Payment((long) ' ', (double) (-1.0f), "hi!", "hi!");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        boolean boolean7 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment4.payDeposit();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test20345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20345");
        payment.Payment payment4 = new payment.Payment((-1L), (double) (-1.0f), "hi!", "hi!");
        payment4.payBalance();
    }

    @Test
    public void test20346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20346");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) (byte) 10, "", "");
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        payment4.payBalance();
        payment4.payBalance();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy13 = null;
        payment4.setPaymentStrategy(paymentStrategy13);
        payment.PaymentStrategy paymentStrategy15 = null;
        payment4.setPaymentStrategy(paymentStrategy15);
        boolean boolean17 = payment4.paymentCompleted();
        boolean boolean18 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy19 = null;
        payment4.setPaymentStrategy(paymentStrategy19);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test20347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20347");
        payment.Payment payment4 = new payment.Payment((long) (-1), (double) (byte) 1, "", "");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        boolean boolean10 = payment4.paymentCompleted();
        payment4.payBalance();
        payment4.payBalance();
        payment4.payDeposit();
        boolean boolean14 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test20348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20348");
        payment.Payment payment4 = new payment.Payment((long) (short) 100, (double) 1, "hi!", "hi!");
        payment4.payDeposit();
        payment4.payBalance();
        boolean boolean7 = payment4.paymentCompleted();
        payment4.payBalance();
        boolean boolean9 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test20349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20349");
        payment.Payment payment4 = new payment.Payment((long) (short) -1, (double) (short) 1, "hi!", "hi!");
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment4.payDeposit();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy10 = null;
        payment4.setPaymentStrategy(paymentStrategy10);
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy14 = null;
        payment4.setPaymentStrategy(paymentStrategy14);
        payment4.payBalance();
        payment4.payBalance();
    }

    @Test
    public void test20350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20350");
        payment.Payment payment4 = new payment.Payment((-1L), (double) 'a', "hi!", "");
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        boolean boolean9 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy10 = null;
        payment4.setPaymentStrategy(paymentStrategy10);
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test20351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20351");
        payment.Payment payment4 = new payment.Payment((long) (byte) 0, (double) 10, "", "");
        payment4.verifyPaymentDetails();
        java.lang.Class<?> wildcardClass6 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test20352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20352");
        payment.Payment payment4 = new payment.Payment((-1L), (double) 1, "", "");
        payment4.payDeposit();
        payment4.payBalance();
        payment4.payBalance();
        payment4.payBalance();
        payment4.payBalance();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
    }

    @Test
    public void test20353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20353");
        payment.Payment payment4 = new payment.Payment((long) (short) 100, (double) (short) 1, "", "");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        boolean boolean7 = payment4.paymentCompleted();
        payment4.payDeposit();
        java.lang.Class<?> wildcardClass9 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test20354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20354");
        payment.Payment payment4 = new payment.Payment((-1L), (double) 'a', "hi!", "");
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment4.payDeposit();
        payment4.payDeposit();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy12 = null;
        payment4.setPaymentStrategy(paymentStrategy12);
        payment.PaymentStrategy paymentStrategy14 = null;
        payment4.setPaymentStrategy(paymentStrategy14);
        boolean boolean16 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test20355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20355");
        payment.Payment payment4 = new payment.Payment((long) (byte) 1, (double) 'a', "hi!", "hi!");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        boolean boolean7 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test20356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20356");
        payment.Payment payment4 = new payment.Payment((long) (-1), (double) ' ', "", "");
        payment4.payDeposit();
        payment4.payDeposit();
    }

    @Test
    public void test20357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20357");
        payment.Payment payment4 = new payment.Payment((-1L), (double) 'a', "hi!", "");
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        boolean boolean8 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy9 = null;
        payment4.setPaymentStrategy(paymentStrategy9);
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy12 = null;
        payment4.setPaymentStrategy(paymentStrategy12);
        payment4.payBalance();
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        payment4.payDeposit();
        payment4.payDeposit();
        payment4.payDeposit();
        payment4.payBalance();
        payment4.payBalance();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test20358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20358");
        payment.Payment payment4 = new payment.Payment((-1L), (double) 'a', "hi!", "");
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        boolean boolean11 = payment4.paymentCompleted();
        payment4.payBalance();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test20359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20359");
        payment.Payment payment4 = new payment.Payment((long) 'a', 100.0d, "", "hi!");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy11 = null;
        payment4.setPaymentStrategy(paymentStrategy11);
        boolean boolean13 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy14 = null;
        payment4.setPaymentStrategy(paymentStrategy14);
        boolean boolean16 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test20360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20360");
        payment.Payment payment4 = new payment.Payment(0L, (double) (short) 1, "", "hi!");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        boolean boolean9 = payment4.paymentCompleted();
        payment4.payBalance();
        payment4.payDeposit();
        boolean boolean12 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy13 = null;
        payment4.setPaymentStrategy(paymentStrategy13);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test20361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20361");
        payment.Payment payment4 = new payment.Payment((long) 'a', 0.0d, "", "");
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        java.lang.Class<?> wildcardClass9 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test20362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20362");
        payment.Payment payment4 = new payment.Payment((long) 100, (double) '4', "", "");
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment4.payDeposit();
        payment4.payBalance();
        java.lang.Class<?> wildcardClass10 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test20363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20363");
        payment.Payment payment4 = new payment.Payment(0L, (double) '4', "", "");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment4.payBalance();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
    }

    @Test
    public void test20364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20364");
        payment.Payment payment4 = new payment.Payment((long) '#', (double) 0L, "", "");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy9 = null;
        payment4.setPaymentStrategy(paymentStrategy9);
        boolean boolean11 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test20365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20365");
        payment.Payment payment4 = new payment.Payment((long) (short) 10, (double) 0L, "", "");
        payment4.payDeposit();
        payment4.payDeposit();
        payment4.payBalance();
        payment4.payBalance();
        payment4.payBalance();
        payment4.verifyPaymentDetails();
    }

    @Test
    public void test20366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20366");
        payment.Payment payment4 = new payment.Payment((long) (short) 100, (double) 10L, "", "hi!");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment4.payDeposit();
        payment4.payBalance();
    }

    @Test
    public void test20367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20367");
        payment.Payment payment4 = new payment.Payment((long) 1, (-1.0d), "", "hi!");
    }

    @Test
    public void test20368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20368");
        payment.Payment payment4 = new payment.Payment(0L, (double) 100L, "hi!", "");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        java.lang.Class<?> wildcardClass7 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test20369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20369");
        payment.Payment payment4 = new payment.Payment((long) (byte) -1, 0.0d, "", "hi!");
        payment4.payDeposit();
        payment4.payDeposit();
    }

    @Test
    public void test20370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20370");
        payment.Payment payment4 = new payment.Payment((-1L), (double) 'a', "hi!", "");
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment4.payBalance();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy10 = null;
        payment4.setPaymentStrategy(paymentStrategy10);
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy13 = null;
        payment4.setPaymentStrategy(paymentStrategy13);
        payment4.payBalance();
        payment4.payDeposit();
    }

    @Test
    public void test20371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20371");
        payment.Payment payment4 = new payment.Payment((long) (short) -1, (double) (short) 1, "hi!", "hi!");
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        payment4.payDeposit();
        payment4.payDeposit();
        java.lang.Class<?> wildcardClass12 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test20372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20372");
        payment.Payment payment4 = new payment.Payment((-1L), (double) 0, "", "hi!");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        java.lang.Class<?> wildcardClass9 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test20373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20373");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) (byte) 10, "", "");
        payment4.payBalance();
        boolean boolean6 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy11 = null;
        payment4.setPaymentStrategy(paymentStrategy11);
        payment.PaymentStrategy paymentStrategy13 = null;
        payment4.setPaymentStrategy(paymentStrategy13);
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy16 = null;
        payment4.setPaymentStrategy(paymentStrategy16);
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        payment4.payDeposit();
        payment4.payDeposit();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test20374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20374");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) (byte) 10, "", "");
        payment4.payDeposit();
        boolean boolean6 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy10 = null;
        payment4.setPaymentStrategy(paymentStrategy10);
        payment4.payBalance();
        boolean boolean13 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy15 = null;
        payment4.setPaymentStrategy(paymentStrategy15);
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy18 = null;
        payment4.setPaymentStrategy(paymentStrategy18);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test20375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20375");
        payment.Payment payment4 = new payment.Payment((-1L), (double) (-1L), "", "hi!");
        payment4.payDeposit();
        java.lang.Class<?> wildcardClass6 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test20376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20376");
        payment.Payment payment4 = new payment.Payment((long) (-1), (double) 1L, "", "");
        payment4.payBalance();
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        boolean boolean10 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy12 = null;
        payment4.setPaymentStrategy(paymentStrategy12);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test20377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20377");
        payment.Payment payment4 = new payment.Payment((long) 100, 10.0d, "", "hi!");
        payment4.payDeposit();
    }

    @Test
    public void test20378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20378");
        payment.Payment payment4 = new payment.Payment((long) (byte) 1, (double) 'a', "", "");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy10 = null;
        payment4.setPaymentStrategy(paymentStrategy10);
    }

    @Test
    public void test20379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20379");
        payment.Payment payment4 = new payment.Payment((long) 10, (double) 0L, "", "hi!");
        payment4.payBalance();
    }

    @Test
    public void test20380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20380");
        payment.Payment payment4 = new payment.Payment((-1L), (double) 'a', "hi!", "");
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        boolean boolean9 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        boolean boolean11 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy12 = null;
        payment4.setPaymentStrategy(paymentStrategy12);
        payment4.verifyPaymentDetails();
        java.lang.Class<?> wildcardClass15 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test20381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20381");
        payment.Payment payment4 = new payment.Payment((long) 1, (double) 10, "hi!", "");
        payment4.payBalance();
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        boolean boolean8 = payment4.paymentCompleted();
        payment4.payBalance();
        boolean boolean10 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test20382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20382");
        payment.Payment payment4 = new payment.Payment((long) (byte) -1, (double) (byte) 0, "", "hi!");
        payment4.payBalance();
        boolean boolean6 = payment4.paymentCompleted();
        boolean boolean7 = payment4.paymentCompleted();
        payment4.payDeposit();
        java.lang.Class<?> wildcardClass9 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test20383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20383");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) (byte) 10, "", "");
        payment4.payDeposit();
        boolean boolean6 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy10 = null;
        payment4.setPaymentStrategy(paymentStrategy10);
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        boolean boolean18 = payment4.paymentCompleted();
        payment4.payDeposit();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test20384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20384");
        payment.Payment payment4 = new payment.Payment(100L, (double) (short) -1, "hi!", "");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment4.payDeposit();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy15 = null;
        payment4.setPaymentStrategy(paymentStrategy15);
    }

    @Test
    public void test20385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20385");
        payment.Payment payment4 = new payment.Payment(0L, (double) (short) 100, "", "");
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy10 = null;
        payment4.setPaymentStrategy(paymentStrategy10);
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy13 = null;
        payment4.setPaymentStrategy(paymentStrategy13);
    }

    @Test
    public void test20386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20386");
        payment.Payment payment4 = new payment.Payment((-1L), (double) 'a', "hi!", "");
        payment4.verifyPaymentDetails();
        boolean boolean6 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        payment4.payDeposit();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        boolean boolean12 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test20387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20387");
        payment.Payment payment4 = new payment.Payment((long) (short) -1, (double) 1.0f, "hi!", "");
        boolean boolean5 = payment4.paymentCompleted();
        payment4.payDeposit();
        boolean boolean7 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        boolean boolean13 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy16 = null;
        payment4.setPaymentStrategy(paymentStrategy16);
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy19 = null;
        payment4.setPaymentStrategy(paymentStrategy19);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test20388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20388");
        payment.Payment payment4 = new payment.Payment((long) (short) 0, (double) 0.0f, "", "hi!");
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        boolean boolean8 = payment4.paymentCompleted();
        payment4.payDeposit();
        boolean boolean10 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test20389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20389");
        payment.Payment payment4 = new payment.Payment((long) (-1), (double) (short) -1, "hi!", "");
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment4.payBalance();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy10 = null;
        payment4.setPaymentStrategy(paymentStrategy10);
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy13 = null;
        payment4.setPaymentStrategy(paymentStrategy13);
        payment4.payDeposit();
        java.lang.Class<?> wildcardClass16 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test20390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20390");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) (byte) 10, "", "");
        payment4.payBalance();
        boolean boolean6 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy10 = null;
        payment4.setPaymentStrategy(paymentStrategy10);
        payment4.verifyPaymentDetails();
        boolean boolean13 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy16 = null;
        payment4.setPaymentStrategy(paymentStrategy16);
        payment4.payBalance();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test20391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20391");
        payment.Payment payment4 = new payment.Payment((-1L), (double) 'a', "hi!", "");
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment4.payDeposit();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment4.payBalance();
        boolean boolean17 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment4.payBalance();
        payment4.payDeposit();
        boolean boolean21 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy23 = null;
        payment4.setPaymentStrategy(paymentStrategy23);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test20392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20392");
        payment.Payment payment4 = new payment.Payment((long) (byte) 1, (double) (short) -1, "hi!", "hi!");
        payment4.payDeposit();
        payment4.payDeposit();
        boolean boolean7 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test20393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20393");
        payment.Payment payment4 = new payment.Payment((long) (byte) -1, (double) (short) -1, "", "");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment4.payBalance();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy11 = null;
        payment4.setPaymentStrategy(paymentStrategy11);
        boolean boolean13 = payment4.paymentCompleted();
        payment4.payDeposit();
        boolean boolean15 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test20394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20394");
        payment.Payment payment4 = new payment.Payment((long) (byte) 1, (double) ' ', "hi!", "");
    }

    @Test
    public void test20395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20395");
        payment.Payment payment4 = new payment.Payment((long) '4', (double) 'a', "hi!", "hi!");
        boolean boolean5 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test20396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20396");
        payment.Payment payment4 = new payment.Payment((long) (byte) 10, (double) 0.0f, "hi!", "");
        boolean boolean5 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        payment4.payBalance();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test20397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20397");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) (byte) 10, "", "");
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment4.payDeposit();
        payment4.payDeposit();
        payment4.payBalance();
        payment4.payDeposit();
    }

    @Test
    public void test20398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20398");
        payment.Payment payment4 = new payment.Payment((-1L), (double) '#', "", "hi!");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        boolean boolean7 = payment4.paymentCompleted();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy9 = null;
        payment4.setPaymentStrategy(paymentStrategy9);
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy13 = null;
        payment4.setPaymentStrategy(paymentStrategy13);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test20399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20399");
        payment.Payment payment4 = new payment.Payment((long) ' ', 10.0d, "", "hi!");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        boolean boolean7 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test20400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20400");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) (byte) 10, "", "");
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        payment4.payBalance();
        boolean boolean10 = payment4.paymentCompleted();
        payment4.payDeposit();
        boolean boolean12 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test20401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20401");
        payment.Payment payment4 = new payment.Payment((long) 'a', 100.0d, "", "hi!");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        payment4.payDeposit();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy11 = null;
        payment4.setPaymentStrategy(paymentStrategy11);
        boolean boolean13 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        java.lang.Class<?> wildcardClass16 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test20402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20402");
        payment.Payment payment4 = new payment.Payment((long) (byte) 0, (double) 0, "hi!", "hi!");
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy10 = null;
        payment4.setPaymentStrategy(paymentStrategy10);
        payment.PaymentStrategy paymentStrategy12 = null;
        payment4.setPaymentStrategy(paymentStrategy12);
    }

    @Test
    public void test20403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20403");
        payment.Payment payment4 = new payment.Payment((long) (short) 100, (double) 1, "hi!", "hi!");
        payment4.payBalance();
        payment4.payDeposit();
        java.lang.Class<?> wildcardClass7 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test20404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20404");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) (byte) 10, "", "");
        payment4.payBalance();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        payment4.payBalance();
        boolean boolean10 = payment4.paymentCompleted();
        payment4.payDeposit();
        boolean boolean12 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy13 = null;
        payment4.setPaymentStrategy(paymentStrategy13);
        boolean boolean15 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test20405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20405");
        payment.Payment payment4 = new payment.Payment((long) (byte) 0, (double) (-1.0f), "hi!", "");
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy13 = null;
        payment4.setPaymentStrategy(paymentStrategy13);
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy16 = null;
        payment4.setPaymentStrategy(paymentStrategy16);
    }

    @Test
    public void test20406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20406");
        payment.Payment payment4 = new payment.Payment((-1L), (double) 'a', "hi!", "");
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy9 = null;
        payment4.setPaymentStrategy(paymentStrategy9);
    }

    @Test
    public void test20407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20407");
        payment.Payment payment4 = new payment.Payment(0L, 0.0d, "hi!", "hi!");
        payment4.payBalance();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        payment4.payBalance();
    }

    @Test
    public void test20408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20408");
        payment.Payment payment4 = new payment.Payment((long) (-1), (double) (byte) 1, "", "");
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        boolean boolean8 = payment4.paymentCompleted();
        boolean boolean9 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment4.payBalance();
        payment4.payDeposit();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test20409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20409");
        payment.Payment payment4 = new payment.Payment((-1L), (double) 'a', "hi!", "");
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        boolean boolean8 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy10 = null;
        payment4.setPaymentStrategy(paymentStrategy10);
        boolean boolean12 = payment4.paymentCompleted();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy14 = null;
        payment4.setPaymentStrategy(paymentStrategy14);
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy18 = null;
        payment4.setPaymentStrategy(paymentStrategy18);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test20410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20410");
        payment.Payment payment4 = new payment.Payment((long) (byte) 10, (double) (short) -1, "hi!", "");
        payment4.payBalance();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy9 = null;
        payment4.setPaymentStrategy(paymentStrategy9);
    }

    @Test
    public void test20411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20411");
        payment.Payment payment4 = new payment.Payment((long) 'a', 100.0d, "", "hi!");
        payment4.payBalance();
        payment4.payDeposit();
        payment4.payDeposit();
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        java.lang.Class<?> wildcardClass10 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test20412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20412");
        payment.Payment payment4 = new payment.Payment((long) 100, (double) 1L, "", "");
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        boolean boolean7 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        java.lang.Class<?> wildcardClass10 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test20413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20413");
        payment.Payment payment4 = new payment.Payment(0L, (double) (-1L), "hi!", "");
        boolean boolean5 = payment4.paymentCompleted();
        boolean boolean6 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test20414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20414");
        payment.Payment payment4 = new payment.Payment((long) (byte) 1, 0.0d, "", "hi!");
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment4.payDeposit();
        payment4.payDeposit();
    }

    @Test
    public void test20415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20415");
        payment.Payment payment4 = new payment.Payment((long) (-1), (double) (short) -1, "hi!", "");
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        boolean boolean11 = payment4.paymentCompleted();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy13 = null;
        payment4.setPaymentStrategy(paymentStrategy13);
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment4.payBalance();
        boolean boolean19 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test20416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20416");
        payment.Payment payment4 = new payment.Payment((long) 10, (double) (byte) 1, "", "");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        boolean boolean7 = payment4.paymentCompleted();
        boolean boolean8 = payment4.paymentCompleted();
        payment4.payDeposit();
        java.lang.Class<?> wildcardClass10 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test20417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20417");
        payment.Payment payment4 = new payment.Payment((-1L), (double) 'a', "hi!", "");
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        boolean boolean9 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy10 = null;
        payment4.setPaymentStrategy(paymentStrategy10);
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy17 = null;
        payment4.setPaymentStrategy(paymentStrategy17);
        payment4.payBalance();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test20418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20418");
        payment.Payment payment4 = new payment.Payment((long) 'a', (double) 10L, "", "");
        payment4.payDeposit();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
    }

    @Test
    public void test20419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20419");
        payment.Payment payment4 = new payment.Payment(100L, 0.0d, "hi!", "");
        boolean boolean5 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        boolean boolean7 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        boolean boolean9 = payment4.paymentCompleted();
        payment4.payDeposit();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test20420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20420");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) (byte) 10, "", "");
        payment4.payBalance();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        payment.PaymentStrategy paymentStrategy9 = null;
        payment4.setPaymentStrategy(paymentStrategy9);
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy13 = null;
        payment4.setPaymentStrategy(paymentStrategy13);
        boolean boolean15 = payment4.paymentCompleted();
        boolean boolean16 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy17 = null;
        payment4.setPaymentStrategy(paymentStrategy17);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test20421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20421");
        payment.Payment payment4 = new payment.Payment((long) (byte) 0, (double) (-1.0f), "hi!", "");
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy10 = null;
        payment4.setPaymentStrategy(paymentStrategy10);
        payment.PaymentStrategy paymentStrategy12 = null;
        payment4.setPaymentStrategy(paymentStrategy12);
    }

    @Test
    public void test20422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20422");
        payment.Payment payment4 = new payment.Payment((long) (byte) 100, 0.0d, "", "");
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment4.payBalance();
        payment4.payBalance();
        payment4.verifyPaymentDetails();
    }

    @Test
    public void test20423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20423");
        payment.Payment payment4 = new payment.Payment((long) '4', (double) 1, "", "");
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        payment4.verifyPaymentDetails();
    }

    @Test
    public void test20424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20424");
        payment.Payment payment4 = new payment.Payment((long) 1, (double) 100, "hi!", "hi!");
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
    }

    @Test
    public void test20425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20425");
        payment.Payment payment4 = new payment.Payment(10L, (double) 100.0f, "", "hi!");
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        boolean boolean10 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test20426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20426");
        payment.Payment payment4 = new payment.Payment((long) (byte) 1, (double) 0.0f, "", "");
        boolean boolean5 = payment4.paymentCompleted();
        java.lang.Class<?> wildcardClass6 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test20427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20427");
        payment.Payment payment4 = new payment.Payment(100L, (double) (short) -1, "hi!", "");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment4.payDeposit();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        boolean boolean10 = payment4.paymentCompleted();
        boolean boolean11 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test20428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20428");
        payment.Payment payment4 = new payment.Payment((long) (-1), (double) 0.0f, "", "hi!");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        payment4.payBalance();
    }

    @Test
    public void test20429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20429");
        payment.Payment payment4 = new payment.Payment((long) 1, (double) 1L, "", "hi!");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        payment4.payBalance();
        payment4.verifyPaymentDetails();
    }

    @Test
    public void test20430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20430");
        payment.Payment payment4 = new payment.Payment((long) (byte) 0, 0.0d, "hi!", "hi!");
        payment4.payDeposit();
        boolean boolean6 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        payment4.payBalance();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test20431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20431");
        payment.Payment payment4 = new payment.Payment((long) 100, (double) (byte) 10, "hi!", "");
        boolean boolean5 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test20432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20432");
        payment.Payment payment4 = new payment.Payment((long) '#', (double) 0L, "", "");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy9 = null;
        payment4.setPaymentStrategy(paymentStrategy9);
        payment4.payDeposit();
        boolean boolean12 = payment4.paymentCompleted();
        payment4.payBalance();
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test20433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20433");
        payment.Payment payment4 = new payment.Payment(100L, (double) (byte) 1, "hi!", "");
        payment4.payDeposit();
        boolean boolean6 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test20434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20434");
        payment.Payment payment4 = new payment.Payment(0L, (double) (-1L), "hi!", "hi!");
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        java.lang.Class<?> wildcardClass9 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test20435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20435");
        payment.Payment payment4 = new payment.Payment((long) (short) -1, (double) 1.0f, "hi!", "");
        boolean boolean5 = payment4.paymentCompleted();
        payment4.payDeposit();
        boolean boolean7 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy12 = null;
        payment4.setPaymentStrategy(paymentStrategy12);
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        boolean boolean16 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test20436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20436");
        payment.Payment payment4 = new payment.Payment((long) ' ', (double) (short) 10, "hi!", "");
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment4.payDeposit();
        payment4.payDeposit();
    }

    @Test
    public void test20437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20437");
        payment.Payment payment4 = new payment.Payment((long) (short) 10, (double) 0L, "hi!", "");
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        boolean boolean7 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test20438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20438");
        payment.Payment payment4 = new payment.Payment((long) (short) -1, (double) ' ', "", "hi!");
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        payment4.payBalance();
        boolean boolean10 = payment4.paymentCompleted();
        payment4.payDeposit();
        boolean boolean12 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test20439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20439");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) (byte) 10, "", "");
        payment4.payDeposit();
        boolean boolean6 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment4.payDeposit();
        payment4.payDeposit();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy14 = null;
        payment4.setPaymentStrategy(paymentStrategy14);
        payment4.verifyPaymentDetails();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test20440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20440");
        payment.Payment payment4 = new payment.Payment((-1L), (double) (byte) 0, "hi!", "");
        payment4.payBalance();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        payment.PaymentStrategy paymentStrategy9 = null;
        payment4.setPaymentStrategy(paymentStrategy9);
        payment4.verifyPaymentDetails();
        boolean boolean12 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test20441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20441");
        payment.Payment payment4 = new payment.Payment((long) 10, (double) (-1), "", "");
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
    }

    @Test
    public void test20442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20442");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) 0, "", "hi!");
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        boolean boolean7 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test20443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20443");
        payment.Payment payment4 = new payment.Payment((-1L), (double) 'a', "hi!", "");
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy10 = null;
        payment4.setPaymentStrategy(paymentStrategy10);
        payment4.payBalance();
        boolean boolean13 = payment4.paymentCompleted();
        payment4.payBalance();
        java.lang.Class<?> wildcardClass15 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test20444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20444");
        payment.Payment payment4 = new payment.Payment((long) (-1), (double) 0.0f, "", "");
        boolean boolean5 = payment4.paymentCompleted();
        payment4.payDeposit();
        boolean boolean7 = payment4.paymentCompleted();
        payment4.payBalance();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy10 = null;
        payment4.setPaymentStrategy(paymentStrategy10);
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test20445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20445");
        payment.Payment payment4 = new payment.Payment((long) 0, (-1.0d), "hi!", "");
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        payment.PaymentStrategy paymentStrategy10 = null;
        payment4.setPaymentStrategy(paymentStrategy10);
        payment4.payBalance();
    }

    @Test
    public void test20446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20446");
        payment.Payment payment4 = new payment.Payment((long) '#', (double) (-1.0f), "hi!", "");
        boolean boolean5 = payment4.paymentCompleted();
        payment4.payDeposit();
        boolean boolean7 = payment4.paymentCompleted();
        payment4.payDeposit();
        java.lang.Class<?> wildcardClass9 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test20447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20447");
        payment.Payment payment4 = new payment.Payment((-1L), (double) 'a', "hi!", "");
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        payment4.payDeposit();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy11 = null;
        payment4.setPaymentStrategy(paymentStrategy11);
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy14 = null;
        payment4.setPaymentStrategy(paymentStrategy14);
    }

    @Test
    public void test20448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20448");
        payment.Payment payment4 = new payment.Payment((long) (byte) -1, (double) 0, "", "hi!");
        payment4.payBalance();
        payment4.payDeposit();
        java.lang.Class<?> wildcardClass7 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test20449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20449");
        payment.Payment payment4 = new payment.Payment((long) '4', (double) (byte) 10, "hi!", "");
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        boolean boolean7 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        boolean boolean9 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy10 = null;
        payment4.setPaymentStrategy(paymentStrategy10);
        java.lang.Class<?> wildcardClass12 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test20450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20450");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) (byte) 10, "", "");
        payment4.payDeposit();
        boolean boolean6 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        boolean boolean10 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy11 = null;
        payment4.setPaymentStrategy(paymentStrategy11);
        payment4.payBalance();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        boolean boolean16 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment4.payDeposit();
        payment4.payDeposit();
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test20451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20451");
        payment.Payment payment4 = new payment.Payment((long) (-1), (double) (short) -1, "hi!", "");
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        boolean boolean10 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy12 = null;
        payment4.setPaymentStrategy(paymentStrategy12);
        boolean boolean14 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        java.lang.Class<?> wildcardClass16 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test20452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20452");
        payment.Payment payment4 = new payment.Payment((long) (short) 10, (double) (byte) 100, "hi!", "");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
    }

    @Test
    public void test20453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20453");
        payment.Payment payment4 = new payment.Payment((long) (byte) 1, 1.0d, "", "hi!");
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        payment4.payBalance();
        payment4.payBalance();
    }

    @Test
    public void test20454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20454");
        payment.Payment payment4 = new payment.Payment((long) 10, (double) 10, "hi!", "");
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
    }

    @Test
    public void test20455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20455");
        payment.Payment payment4 = new payment.Payment((long) (-1), (double) (byte) 1, "", "");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment4.payBalance();
        payment4.payDeposit();
        boolean boolean9 = payment4.paymentCompleted();
        boolean boolean10 = payment4.paymentCompleted();
        payment4.payDeposit();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test20456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20456");
        payment.Payment payment4 = new payment.Payment(10L, (double) 100L, "", "hi!");
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment4.verifyPaymentDetails();
    }

    @Test
    public void test20457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20457");
        payment.Payment payment4 = new payment.Payment((long) (short) 1, (double) (-1L), "", "hi!");
        boolean boolean5 = payment4.paymentCompleted();
        boolean boolean6 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        boolean boolean8 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy9 = null;
        payment4.setPaymentStrategy(paymentStrategy9);
        payment.PaymentStrategy paymentStrategy11 = null;
        payment4.setPaymentStrategy(paymentStrategy11);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test20458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20458");
        payment.Payment payment4 = new payment.Payment((long) (byte) 10, 100.0d, "", "hi!");
        boolean boolean5 = payment4.paymentCompleted();
        boolean boolean6 = payment4.paymentCompleted();
        java.lang.Class<?> wildcardClass7 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test20459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20459");
        payment.Payment payment4 = new payment.Payment((long) (byte) -1, (double) (short) 100, "hi!", "");
        boolean boolean5 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test20460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20460");
        payment.Payment payment4 = new payment.Payment((long) (short) 10, (double) 0L, "", "");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        payment.PaymentStrategy paymentStrategy9 = null;
        payment4.setPaymentStrategy(paymentStrategy9);
        payment4.payBalance();
        payment4.payDeposit();
        payment4.payDeposit();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
    }

    @Test
    public void test20461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20461");
        payment.Payment payment4 = new payment.Payment((long) (-1), (double) (-1), "hi!", "hi!");
        payment4.payDeposit();
    }

    @Test
    public void test20462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20462");
        payment.Payment payment4 = new payment.Payment((long) ' ', (double) (short) 10, "hi!", "");
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        boolean boolean8 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy11 = null;
        payment4.setPaymentStrategy(paymentStrategy11);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test20463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20463");
        payment.Payment payment4 = new payment.Payment(0L, (double) 10.0f, "hi!", "hi!");
        boolean boolean5 = payment4.paymentCompleted();
        boolean boolean6 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        boolean boolean12 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy14 = null;
        payment4.setPaymentStrategy(paymentStrategy14);
        payment.PaymentStrategy paymentStrategy16 = null;
        payment4.setPaymentStrategy(paymentStrategy16);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test20464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20464");
        payment.Payment payment4 = new payment.Payment((-1L), (double) 'a', "hi!", "");
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        boolean boolean8 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy9 = null;
        payment4.setPaymentStrategy(paymentStrategy9);
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy13 = null;
        payment4.setPaymentStrategy(paymentStrategy13);
        payment.PaymentStrategy paymentStrategy15 = null;
        payment4.setPaymentStrategy(paymentStrategy15);
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy19 = null;
        payment4.setPaymentStrategy(paymentStrategy19);
        payment4.verifyPaymentDetails();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test20465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20465");
        payment.Payment payment4 = new payment.Payment((long) '#', (double) (short) 100, "hi!", "hi!");
    }

    @Test
    public void test20466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20466");
        payment.Payment payment4 = new payment.Payment((long) 1, 10.0d, "hi!", "hi!");
        payment4.payDeposit();
    }

    @Test
    public void test20467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20467");
        payment.Payment payment4 = new payment.Payment((long) 'a', (double) 10L, "hi!", "");
        payment4.payBalance();
    }

    @Test
    public void test20468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20468");
        payment.Payment payment4 = new payment.Payment((long) (byte) 100, (double) (short) 0, "", "");
    }

    @Test
    public void test20469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20469");
        payment.Payment payment4 = new payment.Payment((long) 'a', 100.0d, "", "hi!");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment4.payBalance();
        payment4.payDeposit();
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy11 = null;
        payment4.setPaymentStrategy(paymentStrategy11);
        payment.PaymentStrategy paymentStrategy13 = null;
        payment4.setPaymentStrategy(paymentStrategy13);
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy16 = null;
        payment4.setPaymentStrategy(paymentStrategy16);
        payment4.payBalance();
    }

    @Test
    public void test20470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20470");
        payment.Payment payment4 = new payment.Payment((long) (short) 0, (double) 100, "hi!", "hi!");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        java.lang.Class<?> wildcardClass7 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test20471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20471");
        payment.Payment payment4 = new payment.Payment(1L, (double) (-1L), "hi!", "hi!");
        payment4.verifyPaymentDetails();
        boolean boolean6 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test20472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20472");
        payment.Payment payment4 = new payment.Payment(100L, 1.0d, "hi!", "hi!");
        payment4.payBalance();
        payment4.payBalance();
    }

    @Test
    public void test20473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20473");
        payment.Payment payment4 = new payment.Payment((long) (short) 10, (double) 0.0f, "hi!", "");
        boolean boolean5 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment4.payDeposit();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy9 = null;
        payment4.setPaymentStrategy(paymentStrategy9);
        payment4.payBalance();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test20474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20474");
        payment.Payment payment4 = new payment.Payment((-1L), (double) (byte) -1, "", "hi!");
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        payment4.payDeposit();
    }

    @Test
    public void test20475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20475");
        payment.Payment payment4 = new payment.Payment(0L, (-1.0d), "hi!", "hi!");
        payment4.payBalance();
        payment4.payDeposit();
        java.lang.Class<?> wildcardClass7 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test20476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20476");
        payment.Payment payment4 = new payment.Payment((long) '4', (double) (byte) 10, "hi!", "");
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        boolean boolean7 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        boolean boolean9 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        boolean boolean13 = payment4.paymentCompleted();
        boolean boolean14 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test20477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20477");
        payment.Payment payment4 = new payment.Payment((long) '#', (double) 0L, "", "");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment4.payBalance();
        payment4.payDeposit();
        payment4.payBalance();
        boolean boolean10 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test20478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20478");
        payment.Payment payment4 = new payment.Payment(10L, (double) (short) 1, "hi!", "");
    }

    @Test
    public void test20479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20479");
        payment.Payment payment4 = new payment.Payment((long) '#', (double) (short) 100, "hi!", "");
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        payment4.payBalance();
    }

    @Test
    public void test20480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20480");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) (byte) 10, "", "");
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        payment4.verifyPaymentDetails();
        boolean boolean11 = payment4.paymentCompleted();
        payment4.payBalance();
        payment4.payBalance();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test20481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20481");
        payment.Payment payment4 = new payment.Payment((long) '4', (double) (byte) 10, "", "hi!");
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment4.payDeposit();
        payment4.payBalance();
    }

    @Test
    public void test20482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20482");
        payment.Payment payment4 = new payment.Payment(10L, (double) 10, "", "hi!");
        boolean boolean5 = payment4.paymentCompleted();
        boolean boolean6 = payment4.paymentCompleted();
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy9 = null;
        payment4.setPaymentStrategy(paymentStrategy9);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test20483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20483");
        payment.Payment payment4 = new payment.Payment((long) 'a', (double) (-1), "", "");
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        java.lang.Class<?> wildcardClass10 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test20484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20484");
        payment.Payment payment4 = new payment.Payment((long) (byte) 0, (double) 0, "hi!", "hi!");
        boolean boolean5 = payment4.paymentCompleted();
        boolean boolean6 = payment4.paymentCompleted();
        boolean boolean7 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        payment4.payBalance();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test20485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20485");
        payment.Payment payment4 = new payment.Payment((long) 'a', (double) 1L, "", "hi!");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        boolean boolean7 = payment4.paymentCompleted();
        payment4.payBalance();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy10 = null;
        payment4.setPaymentStrategy(paymentStrategy10);
        boolean boolean12 = payment4.paymentCompleted();
        boolean boolean13 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy14 = null;
        payment4.setPaymentStrategy(paymentStrategy14);
        java.lang.Class<?> wildcardClass16 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test20486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20486");
        payment.Payment payment4 = new payment.Payment((long) (-1), (double) 1L, "", "");
        payment4.payBalance();
        payment4.payBalance();
        boolean boolean7 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        boolean boolean11 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test20487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20487");
        payment.Payment payment4 = new payment.Payment((long) (short) -1, (double) (short) 1, "hi!", "hi!");
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        boolean boolean10 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        java.lang.Class<?> wildcardClass13 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test20488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20488");
        payment.Payment payment4 = new payment.Payment((long) 10, 100.0d, "hi!", "hi!");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
    }

    @Test
    public void test20489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20489");
        payment.Payment payment4 = new payment.Payment((long) '4', 0.0d, "", "hi!");
        boolean boolean5 = payment4.paymentCompleted();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy10 = null;
        payment4.setPaymentStrategy(paymentStrategy10);
        payment4.payBalance();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test20490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20490");
        payment.Payment payment4 = new payment.Payment(10L, (double) 10L, "", "");
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        boolean boolean9 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy10 = null;
        payment4.setPaymentStrategy(paymentStrategy10);
        boolean boolean12 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test20491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20491");
        payment.Payment payment4 = new payment.Payment((long) (short) 10, (double) 0L, "", "hi!");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        payment4.verifyPaymentDetails();
        boolean boolean10 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test20492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20492");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) (byte) 10, "", "");
        payment4.payBalance();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        boolean boolean14 = payment4.paymentCompleted();
        boolean boolean15 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test20493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20493");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) (byte) 10, "", "");
        payment4.payDeposit();
        boolean boolean6 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment4.payBalance();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        boolean boolean14 = payment4.paymentCompleted();
        payment4.payBalance();
        boolean boolean16 = payment4.paymentCompleted();
        payment4.payBalance();
        boolean boolean18 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment4.payBalance();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy22 = null;
        payment4.setPaymentStrategy(paymentStrategy22);
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test20494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20494");
        payment.Payment payment4 = new payment.Payment((-1L), (double) 'a', "hi!", "");
        payment4.verifyPaymentDetails();
        boolean boolean6 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy10 = null;
        payment4.setPaymentStrategy(paymentStrategy10);
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment4.payBalance();
        payment4.payBalance();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test20495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20495");
        payment.Payment payment4 = new payment.Payment((long) (short) 0, (double) 10L, "", "");
        payment4.verifyPaymentDetails();
        boolean boolean6 = payment4.paymentCompleted();
        payment4.payDeposit();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test20496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20496");
        payment.Payment payment4 = new payment.Payment((-1L), (double) (byte) 0, "hi!", "");
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment4.payBalance();
        payment4.payBalance();
        boolean boolean13 = payment4.paymentCompleted();
        boolean boolean14 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test20497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20497");
        payment.Payment payment4 = new payment.Payment(100L, (double) (-1L), "hi!", "hi!");
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
    }

    @Test
    public void test20498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20498");
        payment.Payment payment4 = new payment.Payment((long) (byte) 0, (double) 100L, "", "hi!");
        payment4.payBalance();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
    }

    @Test
    public void test20499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20499");
        payment.Payment payment4 = new payment.Payment((long) 0, 10.0d, "hi!", "");
        payment4.payDeposit();
        boolean boolean6 = payment4.paymentCompleted();
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment4.payBalance();
        payment4.payDeposit();
        payment4.payDeposit();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test20500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test20500");
        payment.Payment payment4 = new payment.Payment((long) (byte) 10, (double) (short) 100, "hi!", "hi!");
    }
}

