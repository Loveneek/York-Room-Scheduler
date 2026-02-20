import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest56 {

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
    public void test28001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28001");
        payment.Payment payment4 = new payment.Payment((long) 'a', 0.0d, "hi!", "");
        boolean boolean5 = payment4.paymentCompleted();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        payment4.payDeposit();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test28002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28002");
        payment.Payment payment4 = new payment.Payment((long) '#', (double) 0L, "", "");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy9 = null;
        payment4.setPaymentStrategy(paymentStrategy9);
        payment4.payBalance();
        payment4.payDeposit();
        boolean boolean13 = payment4.paymentCompleted();
        payment4.payDeposit();
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test28003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28003");
        payment.Payment payment4 = new payment.Payment((-1L), (double) (byte) 0, "hi!", "");
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy10 = null;
        payment4.setPaymentStrategy(paymentStrategy10);
        payment4.verifyPaymentDetails();
    }

    @Test
    public void test28004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28004");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) (-1.0f), "hi!", "");
        payment4.payBalance();
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment4.payBalance();
    }

    @Test
    public void test28005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28005");
        payment.Payment payment4 = new payment.Payment(100L, (double) (short) 0, "hi!", "hi!");
        boolean boolean5 = payment4.paymentCompleted();
        payment4.payDeposit();
        boolean boolean7 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy13 = null;
        payment4.setPaymentStrategy(paymentStrategy13);
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy17 = null;
        payment4.setPaymentStrategy(paymentStrategy17);
        payment.PaymentStrategy paymentStrategy19 = null;
        payment4.setPaymentStrategy(paymentStrategy19);
        payment.PaymentStrategy paymentStrategy21 = null;
        payment4.setPaymentStrategy(paymentStrategy21);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test28006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28006");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) (byte) 10, "", "");
        payment4.payDeposit();
        boolean boolean6 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        boolean boolean10 = payment4.paymentCompleted();
        payment4.payBalance();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy13 = null;
        payment4.setPaymentStrategy(paymentStrategy13);
        java.lang.Class<?> wildcardClass15 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test28007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28007");
        payment.Payment payment4 = new payment.Payment((long) (short) 1, (double) (short) 100, "hi!", "hi!");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment4.payDeposit();
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy10 = null;
        payment4.setPaymentStrategy(paymentStrategy10);
    }

    @Test
    public void test28008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28008");
        payment.Payment payment4 = new payment.Payment(0L, (double) 10.0f, "hi!", "hi!");
        boolean boolean5 = payment4.paymentCompleted();
        boolean boolean6 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment4.payBalance();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy10 = null;
        payment4.setPaymentStrategy(paymentStrategy10);
        boolean boolean12 = payment4.paymentCompleted();
        payment4.payDeposit();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test28009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28009");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) (byte) 10, "", "");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment4.payBalance();
    }

    @Test
    public void test28010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28010");
        payment.Payment payment4 = new payment.Payment((-1L), (double) 'a', "hi!", "");
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        boolean boolean8 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy10 = null;
        payment4.setPaymentStrategy(paymentStrategy10);
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        boolean boolean16 = payment4.paymentCompleted();
        payment4.payBalance();
        boolean boolean18 = payment4.paymentCompleted();
        java.lang.Class<?> wildcardClass19 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test28011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28011");
        payment.Payment payment4 = new payment.Payment((long) 10, (double) 1.0f, "hi!", "hi!");
        boolean boolean5 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment4.payBalance();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test28012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28012");
        payment.Payment payment4 = new payment.Payment((long) (-1), (double) (short) -1, "hi!", "");
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        boolean boolean8 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy10 = null;
        payment4.setPaymentStrategy(paymentStrategy10);
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test28013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28013");
        payment.Payment payment4 = new payment.Payment((long) (-1), (double) (byte) 1, "", "");
        payment4.payDeposit();
        payment4.payDeposit();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        payment4.payBalance();
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        boolean boolean13 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test28014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28014");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) (byte) 10, "", "");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        payment4.payBalance();
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        boolean boolean13 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy14 = null;
        payment4.setPaymentStrategy(paymentStrategy14);
        boolean boolean16 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy18 = null;
        payment4.setPaymentStrategy(paymentStrategy18);
        java.lang.Class<?> wildcardClass20 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test28015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28015");
        payment.Payment payment4 = new payment.Payment((long) '#', (double) 1, "hi!", "hi!");
        payment4.payBalance();
        boolean boolean6 = payment4.paymentCompleted();
        payment4.payBalance();
        payment4.payDeposit();
        java.lang.Class<?> wildcardClass9 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test28016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28016");
        payment.Payment payment4 = new payment.Payment((long) (byte) -1, (double) 100, "", "");
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        boolean boolean8 = payment4.paymentCompleted();
        boolean boolean9 = payment4.paymentCompleted();
        payment4.payBalance();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test28017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28017");
        payment.Payment payment4 = new payment.Payment((long) (short) 10, (double) 1, "", "");
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
    }

    @Test
    public void test28018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28018");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) (byte) 10, "", "");
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        payment4.payBalance();
        payment4.payBalance();
        boolean boolean13 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test28019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28019");
        payment.Payment payment4 = new payment.Payment((-1L), (double) 'a', "hi!", "");
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        boolean boolean8 = payment4.paymentCompleted();
        boolean boolean9 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy10 = null;
        payment4.setPaymentStrategy(paymentStrategy10);
        payment.PaymentStrategy paymentStrategy12 = null;
        payment4.setPaymentStrategy(paymentStrategy12);
        payment4.payDeposit();
        boolean boolean15 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy16 = null;
        payment4.setPaymentStrategy(paymentStrategy16);
        boolean boolean18 = payment4.paymentCompleted();
        boolean boolean19 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test28020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28020");
        payment.Payment payment4 = new payment.Payment((long) (short) -1, (double) (short) 1, "hi!", "hi!");
        payment4.verifyPaymentDetails();
        boolean boolean6 = payment4.paymentCompleted();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy12 = null;
        payment4.setPaymentStrategy(paymentStrategy12);
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test28021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28021");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) (byte) 10, "", "");
        payment4.payBalance();
        payment4.payDeposit();
        payment4.payBalance();
    }

    @Test
    public void test28022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28022");
        payment.Payment payment4 = new payment.Payment((long) (short) 10, (double) 100, "", "");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment4.payBalance();
        payment4.payBalance();
        boolean boolean9 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        boolean boolean11 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test28023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28023");
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
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy15 = null;
        payment4.setPaymentStrategy(paymentStrategy15);
        payment4.verifyPaymentDetails();
        boolean boolean18 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test28024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28024");
        payment.Payment payment4 = new payment.Payment((long) '4', (double) (-1L), "", "hi!");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        boolean boolean9 = payment4.paymentCompleted();
        payment4.payBalance();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy12 = null;
        payment4.setPaymentStrategy(paymentStrategy12);
        boolean boolean14 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test28025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28025");
        payment.Payment payment4 = new payment.Payment((long) (byte) 0, (double) 0, "hi!", "hi!");
        payment4.payBalance();
        payment4.payBalance();
        boolean boolean7 = payment4.paymentCompleted();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy9 = null;
        payment4.setPaymentStrategy(paymentStrategy9);
        java.lang.Class<?> wildcardClass11 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test28026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28026");
        payment.Payment payment4 = new payment.Payment((long) 1, (double) 100, "hi!", "hi!");
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        boolean boolean7 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test28027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28027");
        payment.Payment payment4 = new payment.Payment((-1L), (double) 'a', "hi!", "");
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        payment4.payBalance();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        boolean boolean12 = payment4.paymentCompleted();
        payment4.payBalance();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test28028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28028");
        payment.Payment payment4 = new payment.Payment((long) (byte) -1, (double) 100, "", "");
        payment4.verifyPaymentDetails();
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
    public void test28029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28029");
        payment.Payment payment4 = new payment.Payment((-1L), (double) 1L, "hi!", "");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment4.verifyPaymentDetails();
        boolean boolean8 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test28030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28030");
        payment.Payment payment4 = new payment.Payment((long) 100, 0.0d, "hi!", "");
        boolean boolean5 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        boolean boolean9 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy10 = null;
        payment4.setPaymentStrategy(paymentStrategy10);
        payment.PaymentStrategy paymentStrategy12 = null;
        payment4.setPaymentStrategy(paymentStrategy12);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test28031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28031");
        payment.Payment payment4 = new payment.Payment(10L, (double) 10L, "", "");
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        boolean boolean9 = payment4.paymentCompleted();
        boolean boolean10 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test28032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28032");
        payment.Payment payment4 = new payment.Payment((long) '#', (double) (short) 1, "", "hi!");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
    }

    @Test
    public void test28033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28033");
        payment.Payment payment4 = new payment.Payment((long) '#', (double) (short) 0, "hi!", "hi!");
        payment4.payDeposit();
        payment4.payBalance();
        boolean boolean7 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        boolean boolean10 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test28034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28034");
        payment.Payment payment4 = new payment.Payment((long) '#', (double) (short) 1, "", "");
        boolean boolean5 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test28035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28035");
        payment.Payment payment4 = new payment.Payment((-1L), (double) 'a', "hi!", "");
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        boolean boolean8 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy10 = null;
        payment4.setPaymentStrategy(paymentStrategy10);
        boolean boolean12 = payment4.paymentCompleted();
        boolean boolean13 = payment4.paymentCompleted();
        payment4.payBalance();
        boolean boolean15 = payment4.paymentCompleted();
        boolean boolean16 = payment4.paymentCompleted();
        java.lang.Class<?> wildcardClass17 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test28036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28036");
        payment.Payment payment4 = new payment.Payment((long) (byte) 0, (double) 0, "hi!", "hi!");
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
    }

    @Test
    public void test28037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28037");
        payment.Payment payment4 = new payment.Payment((long) 0, (-1.0d), "hi!", "hi!");
        payment4.payDeposit();
        payment4.payDeposit();
    }

    @Test
    public void test28038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28038");
        payment.Payment payment4 = new payment.Payment((long) ' ', (double) 0.0f, "", "hi!");
        payment4.payDeposit();
    }

    @Test
    public void test28039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28039");
        payment.Payment payment4 = new payment.Payment((long) (byte) 100, 0.0d, "hi!", "");
        boolean boolean5 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        boolean boolean8 = payment4.paymentCompleted();
        payment4.payDeposit();
        boolean boolean10 = payment4.paymentCompleted();
        payment4.payDeposit();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test28040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28040");
        payment.Payment payment4 = new payment.Payment((long) (-1), (double) 0.0f, "", "");
        boolean boolean5 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment4.payBalance();
        payment4.payBalance();
        java.lang.Class<?> wildcardClass9 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test28041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28041");
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
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy15 = null;
        payment4.setPaymentStrategy(paymentStrategy15);
        payment4.payDeposit();
        java.lang.Class<?> wildcardClass18 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test28042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28042");
        payment.Payment payment4 = new payment.Payment((long) 'a', (double) 0L, "hi!", "hi!");
        payment4.payBalance();
        payment4.payDeposit();
    }

    @Test
    public void test28043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28043");
        payment.Payment payment4 = new payment.Payment((-1L), (double) '#', "", "hi!");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        boolean boolean7 = payment4.paymentCompleted();
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        boolean boolean10 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test28044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28044");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) (byte) 10, "", "");
        payment4.payBalance();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        boolean boolean9 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        payment4.payBalance();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test28045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28045");
        payment.Payment payment4 = new payment.Payment((-1L), (double) 'a', "hi!", "");
        payment4.payDeposit();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        payment.PaymentStrategy paymentStrategy9 = null;
        payment4.setPaymentStrategy(paymentStrategy9);
        payment4.payBalance();
        payment4.payDeposit();
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
    }

    @Test
    public void test28046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28046");
        payment.Payment payment4 = new payment.Payment((long) 0, 10.0d, "hi!", "hi!");
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment4.verifyPaymentDetails();
    }

    @Test
    public void test28047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28047");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) (byte) 10, "", "");
        payment4.payDeposit();
        boolean boolean6 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        boolean boolean10 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy12 = null;
        payment4.setPaymentStrategy(paymentStrategy12);
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        boolean boolean16 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test28048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28048");
        payment.Payment payment4 = new payment.Payment((long) 'a', (double) 1L, "", "hi!");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        boolean boolean7 = payment4.paymentCompleted();
        payment4.payBalance();
        payment4.payBalance();
        boolean boolean10 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        boolean boolean13 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy14 = null;
        payment4.setPaymentStrategy(paymentStrategy14);
        boolean boolean16 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy18 = null;
        payment4.setPaymentStrategy(paymentStrategy18);
        payment.PaymentStrategy paymentStrategy20 = null;
        payment4.setPaymentStrategy(paymentStrategy20);
        payment4.payBalance();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test28049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28049");
        payment.Payment payment4 = new payment.Payment(100L, (double) 1L, "hi!", "");
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment4.payBalance();
        boolean boolean8 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test28050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28050");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) (short) 0, "", "");
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        boolean boolean8 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy9 = null;
        payment4.setPaymentStrategy(paymentStrategy9);
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test28051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28051");
        payment.Payment payment4 = new payment.Payment((-1L), (double) 'a', "hi!", "");
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        boolean boolean11 = payment4.paymentCompleted();
        payment4.payBalance();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test28052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28052");
        payment.Payment payment4 = new payment.Payment((long) '#', (double) (short) 10, "hi!", "hi!");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        payment.PaymentStrategy paymentStrategy9 = null;
        payment4.setPaymentStrategy(paymentStrategy9);
        payment4.payDeposit();
        payment4.payDeposit();
    }

    @Test
    public void test28053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28053");
        payment.Payment payment4 = new payment.Payment(0L, (double) (-1), "hi!", "");
        payment4.payBalance();
    }

    @Test
    public void test28054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28054");
        payment.Payment payment4 = new payment.Payment((long) (byte) 10, (double) (byte) 10, "", "hi!");
        payment4.payDeposit();
        payment4.payDeposit();
        payment4.payDeposit();
        payment4.payBalance();
        payment4.payDeposit();
        java.lang.Class<?> wildcardClass10 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test28055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28055");
        payment.Payment payment4 = new payment.Payment((long) (byte) 100, (double) (-1), "", "hi!");
    }

    @Test
    public void test28056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28056");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) (-1.0f), "hi!", "");
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        java.lang.Class<?> wildcardClass8 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test28057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28057");
        payment.Payment payment4 = new payment.Payment(0L, (double) (byte) -1, "", "hi!");
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        payment.PaymentStrategy paymentStrategy10 = null;
        payment4.setPaymentStrategy(paymentStrategy10);
    }

    @Test
    public void test28058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28058");
        payment.Payment payment4 = new payment.Payment((long) (byte) 0, (double) (short) 0, "", "hi!");
        payment4.payDeposit();
        payment4.payBalance();
        boolean boolean7 = payment4.paymentCompleted();
        java.lang.Class<?> wildcardClass8 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test28059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28059");
        payment.Payment payment4 = new payment.Payment(100L, (double) (short) 0, "hi!", "hi!");
        payment4.payBalance();
        payment4.payBalance();
        boolean boolean7 = payment4.paymentCompleted();
        boolean boolean8 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test28060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28060");
        payment.Payment payment4 = new payment.Payment((long) (-1), (double) (short) -1, "hi!", "");
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        boolean boolean10 = payment4.paymentCompleted();
        boolean boolean11 = payment4.paymentCompleted();
        payment4.payDeposit();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test28061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28061");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) (byte) 10, "", "");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy9 = null;
        payment4.setPaymentStrategy(paymentStrategy9);
        payment4.payDeposit();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy13 = null;
        payment4.setPaymentStrategy(paymentStrategy13);
        payment4.payDeposit();
        boolean boolean16 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test28062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28062");
        payment.Payment payment4 = new payment.Payment((long) (short) -1, (double) (short) 1, "hi!", "hi!");
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        payment.PaymentStrategy paymentStrategy9 = null;
        payment4.setPaymentStrategy(paymentStrategy9);
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy12 = null;
        payment4.setPaymentStrategy(paymentStrategy12);
    }

    @Test
    public void test28063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28063");
        payment.Payment payment4 = new payment.Payment((-1L), (double) 1, "", "");
        payment4.payDeposit();
        payment4.payBalance();
        payment4.payBalance();
        boolean boolean8 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test28064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28064");
        payment.Payment payment4 = new payment.Payment((long) (-1), (double) (byte) 1, "", "");
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment4.payBalance();
        payment4.payBalance();
        payment4.payBalance();
        payment4.verifyPaymentDetails();
    }

    @Test
    public void test28065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28065");
        payment.Payment payment4 = new payment.Payment((-1L), (double) 'a', "hi!", "");
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        boolean boolean11 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy12 = null;
        payment4.setPaymentStrategy(paymentStrategy12);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test28066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28066");
        payment.Payment payment4 = new payment.Payment((long) (short) 100, (double) '#', "hi!", "hi!");
        boolean boolean5 = payment4.paymentCompleted();
        payment4.payBalance();
        payment4.payDeposit();
        java.lang.Class<?> wildcardClass8 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test28067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28067");
        payment.Payment payment4 = new payment.Payment((long) (-1), (double) (short) -1, "hi!", "");
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        boolean boolean10 = payment4.paymentCompleted();
        java.lang.Class<?> wildcardClass11 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test28068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28068");
        payment.Payment payment4 = new payment.Payment((long) (byte) 1, 1.0d, "hi!", "");
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        boolean boolean7 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy9 = null;
        payment4.setPaymentStrategy(paymentStrategy9);
        payment4.payBalance();
        payment4.payBalance();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test28069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28069");
        payment.Payment payment4 = new payment.Payment((-1L), 0.0d, "", "hi!");
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
    }

    @Test
    public void test28070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28070");
        payment.Payment payment4 = new payment.Payment((long) '#', (double) (byte) 10, "hi!", "");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        boolean boolean9 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test28071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28071");
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
        payment4.payDeposit();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test28072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28072");
        payment.Payment payment4 = new payment.Payment(0L, (double) 0L, "", "");
        boolean boolean5 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy10 = null;
        payment4.setPaymentStrategy(paymentStrategy10);
        payment4.payDeposit();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test28073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28073");
        payment.Payment payment4 = new payment.Payment((long) (short) 1, 10.0d, "", "");
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
    }

    @Test
    public void test28074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28074");
        payment.Payment payment4 = new payment.Payment((long) (byte) 100, 0.0d, "", "");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
    }

    @Test
    public void test28075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28075");
        payment.Payment payment4 = new payment.Payment((long) 10, (double) (-1), "", "hi!");
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        payment.PaymentStrategy paymentStrategy10 = null;
        payment4.setPaymentStrategy(paymentStrategy10);
        payment4.payBalance();
        payment4.payDeposit();
    }

    @Test
    public void test28076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28076");
        payment.Payment payment4 = new payment.Payment(1L, (double) (-1.0f), "hi!", "");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment4.payDeposit();
        java.lang.Class<?> wildcardClass8 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test28077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28077");
        payment.Payment payment4 = new payment.Payment((long) ' ', (double) 100.0f, "hi!", "");
        java.lang.Class<?> wildcardClass5 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test28078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28078");
        payment.Payment payment4 = new payment.Payment((-1L), (double) 'a', "hi!", "");
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        boolean boolean8 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy9 = null;
        payment4.setPaymentStrategy(paymentStrategy9);
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        boolean boolean13 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy14 = null;
        payment4.setPaymentStrategy(paymentStrategy14);
        payment.PaymentStrategy paymentStrategy16 = null;
        payment4.setPaymentStrategy(paymentStrategy16);
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy19 = null;
        payment4.setPaymentStrategy(paymentStrategy19);
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        payment4.payBalance();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test28079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28079");
        payment.Payment payment4 = new payment.Payment((long) (byte) 100, (double) (short) 10, "", "hi!");
        payment4.verifyPaymentDetails();
        boolean boolean6 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy12 = null;
        payment4.setPaymentStrategy(paymentStrategy12);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test28080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28080");
        payment.Payment payment4 = new payment.Payment((-1L), (double) 'a', "hi!", "");
        payment4.verifyPaymentDetails();
        boolean boolean6 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        payment.PaymentStrategy paymentStrategy9 = null;
        payment4.setPaymentStrategy(paymentStrategy9);
        payment4.payBalance();
        payment4.payDeposit();
        boolean boolean13 = payment4.paymentCompleted();
        boolean boolean14 = payment4.paymentCompleted();
        payment4.payBalance();
        boolean boolean16 = payment4.paymentCompleted();
        boolean boolean17 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test28081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28081");
        payment.Payment payment4 = new payment.Payment(10L, (double) (short) 100, "hi!", "hi!");
        payment4.payBalance();
        boolean boolean6 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        payment4.payBalance();
        boolean boolean10 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy11 = null;
        payment4.setPaymentStrategy(paymentStrategy11);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test28082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28082");
        payment.Payment payment4 = new payment.Payment((-1L), (double) 'a', "hi!", "");
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        payment.PaymentStrategy paymentStrategy10 = null;
        payment4.setPaymentStrategy(paymentStrategy10);
        payment4.payBalance();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
    }

    @Test
    public void test28083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28083");
        payment.Payment payment4 = new payment.Payment(10L, (double) (byte) 0, "hi!", "hi!");
        boolean boolean5 = payment4.paymentCompleted();
        boolean boolean6 = payment4.paymentCompleted();
        boolean boolean7 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test28084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28084");
        payment.Payment payment4 = new payment.Payment((long) 1, 0.0d, "hi!", "hi!");
        payment4.payBalance();
        payment4.payBalance();
    }

    @Test
    public void test28085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28085");
        payment.Payment payment4 = new payment.Payment((long) 100, (double) (byte) -1, "", "hi!");
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        boolean boolean7 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test28086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28086");
        payment.Payment payment4 = new payment.Payment((long) (short) 0, (double) 1, "", "hi!");
        payment4.payDeposit();
        payment4.payBalance();
    }

    @Test
    public void test28087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28087");
        payment.Payment payment4 = new payment.Payment(0L, (double) 1, "", "hi!");
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment4.verifyPaymentDetails();
    }

    @Test
    public void test28088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28088");
        payment.Payment payment4 = new payment.Payment((long) 10, (-1.0d), "hi!", "hi!");
    }

    @Test
    public void test28089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28089");
        payment.Payment payment4 = new payment.Payment((long) 'a', 0.0d, "", "");
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        boolean boolean8 = payment4.paymentCompleted();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy10 = null;
        payment4.setPaymentStrategy(paymentStrategy10);
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment4.payBalance();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test28090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28090");
        payment.Payment payment4 = new payment.Payment((-1L), (double) 'a', "hi!", "");
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        boolean boolean8 = payment4.paymentCompleted();
        payment4.payBalance();
        boolean boolean10 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test28091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28091");
        payment.Payment payment4 = new payment.Payment((-1L), (double) 'a', "hi!", "");
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy10 = null;
        payment4.setPaymentStrategy(paymentStrategy10);
        payment.PaymentStrategy paymentStrategy12 = null;
        payment4.setPaymentStrategy(paymentStrategy12);
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy15 = null;
        payment4.setPaymentStrategy(paymentStrategy15);
        payment.PaymentStrategy paymentStrategy17 = null;
        payment4.setPaymentStrategy(paymentStrategy17);
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy20 = null;
        payment4.setPaymentStrategy(paymentStrategy20);
        boolean boolean22 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test28092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28092");
        payment.Payment payment4 = new payment.Payment((long) (short) 100, 0.0d, "hi!", "hi!");
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        java.lang.Class<?> wildcardClass7 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test28093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28093");
        payment.Payment payment4 = new payment.Payment((-1L), (double) 100L, "hi!", "");
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        boolean boolean7 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy9 = null;
        payment4.setPaymentStrategy(paymentStrategy9);
        payment4.payDeposit();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test28094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28094");
        payment.Payment payment4 = new payment.Payment((long) 'a', (double) 1L, "", "hi!");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        boolean boolean7 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        boolean boolean9 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test28095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28095");
        payment.Payment payment4 = new payment.Payment(0L, (double) (short) 100, "", "");
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        payment4.payBalance();
    }

    @Test
    public void test28096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28096");
        payment.Payment payment4 = new payment.Payment(10L, (-1.0d), "", "");
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
    }

    @Test
    public void test28097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28097");
        payment.Payment payment4 = new payment.Payment((long) ' ', (double) 100L, "hi!", "");
        payment4.payBalance();
        boolean boolean6 = payment4.paymentCompleted();
        payment4.payDeposit();
        boolean boolean8 = payment4.paymentCompleted();
        boolean boolean9 = payment4.paymentCompleted();
        payment4.payBalance();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test28098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28098");
        payment.Payment payment4 = new payment.Payment((-1L), (double) 'a', "hi!", "");
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        boolean boolean8 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy13 = null;
        payment4.setPaymentStrategy(paymentStrategy13);
        payment4.payDeposit();
        boolean boolean16 = payment4.paymentCompleted();
        boolean boolean17 = payment4.paymentCompleted();
        payment4.payBalance();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test28099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28099");
        payment.Payment payment4 = new payment.Payment((long) 100, (double) (byte) 100, "", "");
        payment4.verifyPaymentDetails();
        boolean boolean6 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test28100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28100");
        payment.Payment payment4 = new payment.Payment((long) (short) 10, (double) (short) 0, "", "hi!");
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment4.payDeposit();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy10 = null;
        payment4.setPaymentStrategy(paymentStrategy10);
        payment.PaymentStrategy paymentStrategy12 = null;
        payment4.setPaymentStrategy(paymentStrategy12);
        payment4.payDeposit();
    }

    @Test
    public void test28101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28101");
        payment.Payment payment4 = new payment.Payment(0L, 0.0d, "hi!", "hi!");
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        boolean boolean8 = payment4.paymentCompleted();
        payment4.payBalance();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test28102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28102");
        payment.Payment payment4 = new payment.Payment((long) (short) 0, (double) (-1L), "", "hi!");
        boolean boolean5 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        boolean boolean7 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment4.payBalance();
        java.lang.Class<?> wildcardClass11 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test28103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28103");
        payment.Payment payment4 = new payment.Payment((long) (-1), (double) (short) -1, "", "hi!");
        payment4.payDeposit();
        payment4.payDeposit();
        java.lang.Class<?> wildcardClass7 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test28104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28104");
        payment.Payment payment4 = new payment.Payment((long) 1, (double) (byte) 100, "", "");
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        boolean boolean8 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test28105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28105");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) (byte) 10, "", "");
        payment4.payBalance();
        boolean boolean6 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        payment4.payDeposit();
        boolean boolean10 = payment4.paymentCompleted();
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        java.lang.Class<?> wildcardClass15 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test28106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28106");
        payment.Payment payment4 = new payment.Payment((long) 1, (double) '#', "", "");
        payment4.verifyPaymentDetails();
    }

    @Test
    public void test28107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28107");
        payment.Payment payment4 = new payment.Payment((long) (byte) 10, (double) (short) -1, "hi!", "");
        payment4.verifyPaymentDetails();
        boolean boolean6 = payment4.paymentCompleted();
        boolean boolean7 = payment4.paymentCompleted();
        boolean boolean8 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment4.payDeposit();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test28108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28108");
        payment.Payment payment4 = new payment.Payment((long) (byte) 100, (double) (byte) 0, "", "");
        java.lang.Class<?> wildcardClass5 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test28109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28109");
        payment.Payment payment4 = new payment.Payment((long) (byte) 100, 0.0d, "hi!", "");
        boolean boolean5 = payment4.paymentCompleted();
        boolean boolean6 = payment4.paymentCompleted();
        payment4.payBalance();
        payment4.payDeposit();
        payment4.payDeposit();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test28110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28110");
        payment.Payment payment4 = new payment.Payment((-1L), (double) (short) 10, "", "");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
    }

    @Test
    public void test28111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28111");
        payment.Payment payment4 = new payment.Payment((-1L), (double) 'a', "hi!", "");
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        boolean boolean8 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy9 = null;
        payment4.setPaymentStrategy(paymentStrategy9);
        payment4.payDeposit();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test28112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28112");
        payment.Payment payment4 = new payment.Payment((long) '#', 0.0d, "", "");
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy9 = null;
        payment4.setPaymentStrategy(paymentStrategy9);
    }

    @Test
    public void test28113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28113");
        payment.Payment payment4 = new payment.Payment(0L, (double) 100, "hi!", "");
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment4.verifyPaymentDetails();
        boolean boolean9 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test28114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28114");
        payment.Payment payment4 = new payment.Payment((long) (short) -1, 0.0d, "hi!", "hi!");
        boolean boolean5 = payment4.paymentCompleted();
        boolean boolean6 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        payment4.payBalance();
        payment4.payBalance();
        boolean boolean12 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy13 = null;
        payment4.setPaymentStrategy(paymentStrategy13);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test28115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28115");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) (short) 1, "hi!", "hi!");
        payment4.payBalance();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        payment.PaymentStrategy paymentStrategy9 = null;
        payment4.setPaymentStrategy(paymentStrategy9);
    }

    @Test
    public void test28116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28116");
        payment.Payment payment4 = new payment.Payment((long) 'a', (double) (-1L), "", "");
        boolean boolean5 = payment4.paymentCompleted();
        payment4.payDeposit();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test28117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28117");
        payment.Payment payment4 = new payment.Payment(0L, (double) (byte) -1, "", "hi!");
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        java.lang.Class<?> wildcardClass9 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test28118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28118");
        payment.Payment payment4 = new payment.Payment((-1L), (double) '#', "", "hi!");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        boolean boolean9 = payment4.paymentCompleted();
        boolean boolean10 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy11 = null;
        payment4.setPaymentStrategy(paymentStrategy11);
        java.lang.Class<?> wildcardClass13 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test28119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28119");
        payment.Payment payment4 = new payment.Payment((long) 'a', (double) '#', "hi!", "hi!");
        payment4.payDeposit();
        payment4.payDeposit();
        payment4.payBalance();
        payment4.payBalance();
        boolean boolean9 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test28120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28120");
        payment.Payment payment4 = new payment.Payment((long) (byte) -1, (double) (short) 100, "hi!", "");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        boolean boolean10 = payment4.paymentCompleted();
        java.lang.Class<?> wildcardClass11 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test28121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28121");
        payment.Payment payment4 = new payment.Payment((long) '#', (double) (byte) -1, "hi!", "");
        payment4.verifyPaymentDetails();
        java.lang.Class<?> wildcardClass6 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test28122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28122");
        payment.Payment payment4 = new payment.Payment((long) 100, (double) (-1.0f), "", "");
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        payment4.payDeposit();
        boolean boolean8 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test28123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28123");
        payment.Payment payment4 = new payment.Payment((long) 1, (double) (-1), "", "");
        payment4.payDeposit();
        payment4.payDeposit();
    }

    @Test
    public void test28124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28124");
        payment.Payment payment4 = new payment.Payment(0L, (double) (byte) 0, "", "");
        boolean boolean5 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        boolean boolean9 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test28125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28125");
        payment.Payment payment4 = new payment.Payment((long) (byte) 100, (double) (byte) 100, "", "");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy10 = null;
        payment4.setPaymentStrategy(paymentStrategy10);
        payment4.verifyPaymentDetails();
        boolean boolean13 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test28126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28126");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) (byte) 10, "", "");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        payment4.verifyPaymentDetails();
        boolean boolean11 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        boolean boolean14 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test28127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28127");
        payment.Payment payment4 = new payment.Payment((-1L), (double) (byte) 1, "hi!", "hi!");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        payment.PaymentStrategy paymentStrategy9 = null;
        payment4.setPaymentStrategy(paymentStrategy9);
        payment.PaymentStrategy paymentStrategy11 = null;
        payment4.setPaymentStrategy(paymentStrategy11);
        boolean boolean13 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        boolean boolean20 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test28128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28128");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) (byte) 10, "", "");
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        boolean boolean10 = payment4.paymentCompleted();
        payment4.payBalance();
        payment4.payBalance();
        payment4.payBalance();
        payment4.payDeposit();
        payment4.payDeposit();
        boolean boolean16 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test28129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28129");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) (byte) 1, "hi!", "");
        payment4.payBalance();
    }

    @Test
    public void test28130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28130");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) 'a', "", "hi!");
        payment4.payBalance();
        payment4.payBalance();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        payment.PaymentStrategy paymentStrategy10 = null;
        payment4.setPaymentStrategy(paymentStrategy10);
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
    }

    @Test
    public void test28131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28131");
        payment.Payment payment4 = new payment.Payment((-1L), (double) 'a', "hi!", "");
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        boolean boolean8 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy9 = null;
        payment4.setPaymentStrategy(paymentStrategy9);
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        boolean boolean13 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy16 = null;
        payment4.setPaymentStrategy(paymentStrategy16);
        boolean boolean18 = payment4.paymentCompleted();
        boolean boolean19 = payment4.paymentCompleted();
        payment4.payDeposit();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test28132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28132");
        payment.Payment payment4 = new payment.Payment(10L, (double) 0.0f, "hi!", "");
        payment4.payDeposit();
        boolean boolean6 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        payment4.verifyPaymentDetails();
        boolean boolean10 = payment4.paymentCompleted();
        java.lang.Class<?> wildcardClass11 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test28133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28133");
        payment.Payment payment4 = new payment.Payment((long) (short) -1, (double) (short) 1, "hi!", "hi!");
        payment4.verifyPaymentDetails();
        boolean boolean6 = payment4.paymentCompleted();
        payment4.payBalance();
        boolean boolean8 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        boolean boolean10 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy11 = null;
        payment4.setPaymentStrategy(paymentStrategy11);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test28134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28134");
        payment.Payment payment4 = new payment.Payment((long) 'a', (double) (short) 0, "hi!", "");
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
    }

    @Test
    public void test28135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28135");
        payment.Payment payment4 = new payment.Payment((long) 100, 10.0d, "hi!", "");
        payment4.payDeposit();
        payment4.payBalance();
        payment4.payDeposit();
    }

    @Test
    public void test28136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28136");
        payment.Payment payment4 = new payment.Payment((-1L), (double) '#', "", "hi!");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy9 = null;
        payment4.setPaymentStrategy(paymentStrategy9);
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        payment4.payBalance();
        boolean boolean14 = payment4.paymentCompleted();
        payment4.payBalance();
        java.lang.Class<?> wildcardClass16 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test28137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28137");
        payment.Payment payment4 = new payment.Payment((long) (byte) 1, (double) 0.0f, "hi!", "");
        payment4.payBalance();
        payment4.payDeposit();
        boolean boolean7 = payment4.paymentCompleted();
        boolean boolean8 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy9 = null;
        payment4.setPaymentStrategy(paymentStrategy9);
        payment4.payBalance();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test28138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28138");
        payment.Payment payment4 = new payment.Payment((-1L), (double) '#', "", "hi!");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        boolean boolean7 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        payment.PaymentStrategy paymentStrategy10 = null;
        payment4.setPaymentStrategy(paymentStrategy10);
        payment4.payDeposit();
        payment4.payDeposit();
        java.lang.Class<?> wildcardClass14 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test28139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28139");
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
        boolean boolean14 = payment4.paymentCompleted();
        payment4.payBalance();
        payment4.payBalance();
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test28140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28140");
        payment.Payment payment4 = new payment.Payment((-1L), (double) (byte) 0, "hi!", "");
        boolean boolean5 = payment4.paymentCompleted();
        payment4.payBalance();
        payment4.payDeposit();
        boolean boolean8 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy10 = null;
        payment4.setPaymentStrategy(paymentStrategy10);
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy13 = null;
        payment4.setPaymentStrategy(paymentStrategy13);
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy16 = null;
        payment4.setPaymentStrategy(paymentStrategy16);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test28141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28141");
        payment.Payment payment4 = new payment.Payment((long) (byte) -1, (double) (byte) 0, "", "hi!");
        payment4.payBalance();
        boolean boolean6 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        boolean boolean9 = payment4.paymentCompleted();
        java.lang.Class<?> wildcardClass10 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test28142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28142");
        payment.Payment payment4 = new payment.Payment((long) (byte) 1, 0.0d, "hi!", "");
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy10 = null;
        payment4.setPaymentStrategy(paymentStrategy10);
        payment4.payBalance();
        java.lang.Class<?> wildcardClass13 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test28143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28143");
        payment.Payment payment4 = new payment.Payment((-1L), (double) 'a', "hi!", "");
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment4.payDeposit();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        boolean boolean12 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment4.payBalance();
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test28144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28144");
        payment.Payment payment4 = new payment.Payment((long) (byte) 10, (double) ' ', "", "");
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        boolean boolean7 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test28145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28145");
        payment.Payment payment4 = new payment.Payment((long) (byte) -1, 1.0d, "hi!", "");
        payment4.payDeposit();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment4.payBalance();
    }

    @Test
    public void test28146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28146");
        payment.Payment payment4 = new payment.Payment((long) (-1), (double) '#', "", "");
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
    }

    @Test
    public void test28147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28147");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) (byte) 10, "", "");
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy9 = null;
        payment4.setPaymentStrategy(paymentStrategy9);
        boolean boolean11 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test28148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28148");
        payment.Payment payment4 = new payment.Payment((long) (short) -1, (double) (short) 1, "hi!", "hi!");
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment4.payDeposit();
        payment4.payDeposit();
        boolean boolean10 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy12 = null;
        payment4.setPaymentStrategy(paymentStrategy12);
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy15 = null;
        payment4.setPaymentStrategy(paymentStrategy15);
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy18 = null;
        payment4.setPaymentStrategy(paymentStrategy18);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test28149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28149");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) (-1.0f), "hi!", "");
        payment4.payBalance();
        payment4.payBalance();
        payment4.payBalance();
        payment4.payBalance();
        payment4.payBalance();
    }

    @Test
    public void test28150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28150");
        payment.Payment payment4 = new payment.Payment((long) (byte) 100, (double) (short) 0, "hi!", "");
        boolean boolean5 = payment4.paymentCompleted();
        payment4.payBalance();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test28151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28151");
        payment.Payment payment4 = new payment.Payment((long) (byte) 0, (double) 1, "hi!", "hi!");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        boolean boolean7 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test28152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28152");
        payment.Payment payment4 = new payment.Payment((long) 'a', (double) 1L, "", "hi!");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        boolean boolean7 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        boolean boolean9 = payment4.paymentCompleted();
        boolean boolean10 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy11 = null;
        payment4.setPaymentStrategy(paymentStrategy11);
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy14 = null;
        payment4.setPaymentStrategy(paymentStrategy14);
        boolean boolean16 = payment4.paymentCompleted();
        boolean boolean17 = payment4.paymentCompleted();
        boolean boolean18 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy19 = null;
        payment4.setPaymentStrategy(paymentStrategy19);
        payment.PaymentStrategy paymentStrategy21 = null;
        payment4.setPaymentStrategy(paymentStrategy21);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test28153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28153");
        payment.Payment payment4 = new payment.Payment((long) (short) 100, (double) 100.0f, "", "hi!");
    }

    @Test
    public void test28154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28154");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) (byte) 10, "", "");
        payment4.payDeposit();
        boolean boolean6 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment4.payBalance();
        payment4.payDeposit();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy13 = null;
        payment4.setPaymentStrategy(paymentStrategy13);
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        payment4.payDeposit();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy19 = null;
        payment4.setPaymentStrategy(paymentStrategy19);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test28155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28155");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) (byte) 10, "", "");
        payment4.payBalance();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        payment.PaymentStrategy paymentStrategy9 = null;
        payment4.setPaymentStrategy(paymentStrategy9);
        payment4.payDeposit();
        boolean boolean12 = payment4.paymentCompleted();
        payment4.payDeposit();
        boolean boolean14 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        boolean boolean16 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test28156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28156");
        payment.Payment payment4 = new payment.Payment((long) 1, (double) (short) 10, "", "hi!");
        payment4.payDeposit();
        boolean boolean6 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test28157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28157");
        payment.Payment payment4 = new payment.Payment((-1L), (double) 'a', "hi!", "");
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment4.payDeposit();
        boolean boolean13 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy14 = null;
        payment4.setPaymentStrategy(paymentStrategy14);
        payment.PaymentStrategy paymentStrategy16 = null;
        payment4.setPaymentStrategy(paymentStrategy16);
        boolean boolean18 = payment4.paymentCompleted();
        payment4.payBalance();
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test28158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28158");
        payment.Payment payment4 = new payment.Payment((long) (byte) 100, (double) (short) 10, "", "hi!");
        payment4.verifyPaymentDetails();
        boolean boolean6 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment4.payDeposit();
        payment4.payDeposit();
        boolean boolean10 = payment4.paymentCompleted();
        boolean boolean11 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test28159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28159");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) (byte) 10, "", "");
        payment4.payBalance();
        boolean boolean6 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        boolean boolean10 = payment4.paymentCompleted();
        payment4.payBalance();
        boolean boolean12 = payment4.paymentCompleted();
        payment4.payBalance();
        payment4.payDeposit();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy16 = null;
        payment4.setPaymentStrategy(paymentStrategy16);
        java.lang.Class<?> wildcardClass18 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test28160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28160");
        payment.Payment payment4 = new payment.Payment((-1L), 10.0d, "", "hi!");
        boolean boolean5 = payment4.paymentCompleted();
        payment4.payBalance();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        java.lang.Class<?> wildcardClass12 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test28161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28161");
        payment.Payment payment4 = new payment.Payment(0L, (double) 10.0f, "hi!", "hi!");
        boolean boolean5 = payment4.paymentCompleted();
        payment4.payBalance();
        boolean boolean7 = payment4.paymentCompleted();
        payment4.payDeposit();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test28162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28162");
        payment.Payment payment4 = new payment.Payment((long) (-1), (double) 0, "", "");
        boolean boolean5 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test28163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28163");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) (byte) 10, "", "");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        boolean boolean9 = payment4.paymentCompleted();
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        boolean boolean12 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        java.lang.Class<?> wildcardClass17 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test28164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28164");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) (byte) 10, "", "");
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        boolean boolean10 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy11 = null;
        payment4.setPaymentStrategy(paymentStrategy11);
        boolean boolean13 = payment4.paymentCompleted();
        payment4.payDeposit();
        boolean boolean15 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test28165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28165");
        payment.Payment payment4 = new payment.Payment(1L, (double) (byte) 10, "hi!", "hi!");
        payment4.payBalance();
        payment4.payDeposit();
        payment4.payBalance();
    }

    @Test
    public void test28166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28166");
        payment.Payment payment4 = new payment.Payment((long) '#', (double) 10.0f, "", "hi!");
        boolean boolean5 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        payment.PaymentStrategy paymentStrategy10 = null;
        payment4.setPaymentStrategy(paymentStrategy10);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test28167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28167");
        payment.Payment payment4 = new payment.Payment((long) (byte) -1, 1.0d, "hi!", "");
        payment4.payDeposit();
        boolean boolean6 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        java.lang.Class<?> wildcardClass10 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test28168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28168");
        payment.Payment payment4 = new payment.Payment((long) (byte) 10, (double) (byte) 10, "", "");
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        boolean boolean7 = payment4.paymentCompleted();
        boolean boolean8 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy9 = null;
        payment4.setPaymentStrategy(paymentStrategy9);
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy12 = null;
        payment4.setPaymentStrategy(paymentStrategy12);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test28169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28169");
        payment.Payment payment4 = new payment.Payment((long) 100, (double) 10L, "", "");
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
    }

    @Test
    public void test28170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28170");
        payment.Payment payment4 = new payment.Payment((long) (short) 1, (double) 1L, "hi!", "hi!");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment4.payBalance();
    }

    @Test
    public void test28171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28171");
        payment.Payment payment4 = new payment.Payment((long) (short) 1, (double) 10L, "hi!", "hi!");
        boolean boolean5 = payment4.paymentCompleted();
        payment4.payBalance();
        boolean boolean7 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test28172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28172");
        payment.Payment payment4 = new payment.Payment((-1L), (double) 'a', "hi!", "");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        payment4.payDeposit();
        boolean boolean10 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy11 = null;
        payment4.setPaymentStrategy(paymentStrategy11);
        payment4.payBalance();
        payment4.payDeposit();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test28173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28173");
        payment.Payment payment4 = new payment.Payment((long) 10, (double) (byte) 1, "", "");
        boolean boolean5 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment4.payBalance();
        payment4.payBalance();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test28174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28174");
        payment.Payment payment4 = new payment.Payment((long) (-1), (double) 0.0f, "", "");
        boolean boolean5 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        payment.PaymentStrategy paymentStrategy10 = null;
        payment4.setPaymentStrategy(paymentStrategy10);
        payment4.verifyPaymentDetails();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test28175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28175");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) (byte) 10, "", "");
        payment4.payBalance();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment4.payBalance();
        payment4.payDeposit();
        payment4.payDeposit();
        payment4.payBalance();
    }

    @Test
    public void test28176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28176");
        payment.Payment payment4 = new payment.Payment((-1L), (double) 'a', "hi!", "");
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy11 = null;
        payment4.setPaymentStrategy(paymentStrategy11);
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment4.payBalance();
        boolean boolean16 = payment4.paymentCompleted();
        payment4.payBalance();
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test28177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28177");
        payment.Payment payment4 = new payment.Payment((long) (short) 1, (double) (byte) -1, "", "");
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
    }

    @Test
    public void test28178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28178");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) 10, "hi!", "hi!");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
    }

    @Test
    public void test28179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28179");
        payment.Payment payment4 = new payment.Payment((long) (short) -1, 0.0d, "hi!", "hi!");
        boolean boolean5 = payment4.paymentCompleted();
        boolean boolean6 = payment4.paymentCompleted();
        payment4.payBalance();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy11 = null;
        payment4.setPaymentStrategy(paymentStrategy11);
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy15 = null;
        payment4.setPaymentStrategy(paymentStrategy15);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test28180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28180");
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
        boolean boolean14 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy15 = null;
        payment4.setPaymentStrategy(paymentStrategy15);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test28181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28181");
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
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy19 = null;
        payment4.setPaymentStrategy(paymentStrategy19);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test28182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28182");
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
        payment4.payDeposit();
        boolean boolean15 = payment4.paymentCompleted();
        payment4.payDeposit();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test28183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28183");
        payment.Payment payment4 = new payment.Payment(100L, (double) (short) 0, "hi!", "hi!");
        boolean boolean5 = payment4.paymentCompleted();
        payment4.payDeposit();
        boolean boolean7 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        payment.PaymentStrategy paymentStrategy10 = null;
        payment4.setPaymentStrategy(paymentStrategy10);
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test28184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28184");
        payment.Payment payment4 = new payment.Payment((long) (short) 100, (double) 0L, "", "");
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
    }

    @Test
    public void test28185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28185");
        payment.Payment payment4 = new payment.Payment(0L, (double) (-1L), "hi!", "hi!");
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy10 = null;
        payment4.setPaymentStrategy(paymentStrategy10);
        payment.PaymentStrategy paymentStrategy12 = null;
        payment4.setPaymentStrategy(paymentStrategy12);
        payment4.verifyPaymentDetails();
    }

    @Test
    public void test28186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28186");
        payment.Payment payment4 = new payment.Payment((long) '#', (double) (byte) 100, "hi!", "hi!");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        boolean boolean7 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test28187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28187");
        payment.Payment payment4 = new payment.Payment((long) (byte) 0, (double) ' ', "", "");
        boolean boolean5 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        boolean boolean7 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test28188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28188");
        payment.Payment payment4 = new payment.Payment(0L, (double) (short) 100, "", "");
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        payment4.payDeposit();
    }

    @Test
    public void test28189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28189");
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
        payment4.payBalance();
        payment4.payBalance();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test28190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28190");
        payment.Payment payment4 = new payment.Payment((-1L), (double) '4', "hi!", "");
        payment4.payBalance();
    }

    @Test
    public void test28191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28191");
        payment.Payment payment4 = new payment.Payment((long) (short) 100, (double) 100L, "", "hi!");
        payment4.payDeposit();
        payment4.payDeposit();
        payment4.payDeposit();
    }

    @Test
    public void test28192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28192");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) (byte) 10, "", "");
        payment4.payBalance();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        boolean boolean12 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test28193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28193");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) (short) 0, "", "");
        payment4.payBalance();
        payment4.payDeposit();
        payment4.payBalance();
        payment4.payBalance();
        boolean boolean9 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy12 = null;
        payment4.setPaymentStrategy(paymentStrategy12);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test28194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28194");
        payment.Payment payment4 = new payment.Payment((-1L), (double) '#', "", "hi!");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy10 = null;
        payment4.setPaymentStrategy(paymentStrategy10);
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy13 = null;
        payment4.setPaymentStrategy(paymentStrategy13);
        payment4.verifyPaymentDetails();
    }

    @Test
    public void test28195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28195");
        payment.Payment payment4 = new payment.Payment((long) (-1), (double) (short) -1, "hi!", "");
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy14 = null;
        payment4.setPaymentStrategy(paymentStrategy14);
    }

    @Test
    public void test28196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28196");
        payment.Payment payment4 = new payment.Payment((long) '4', (double) (-1L), "", "hi!");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        payment.PaymentStrategy paymentStrategy9 = null;
        payment4.setPaymentStrategy(paymentStrategy9);
        payment.PaymentStrategy paymentStrategy11 = null;
        payment4.setPaymentStrategy(paymentStrategy11);
        payment4.payBalance();
        payment4.payBalance();
    }

    @Test
    public void test28197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28197");
        payment.Payment payment4 = new payment.Payment((long) (byte) 1, 0.0d, "hi!", "");
        payment4.payBalance();
        payment4.payBalance();
    }

    @Test
    public void test28198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28198");
        payment.Payment payment4 = new payment.Payment((long) 100, (double) (-1L), "hi!", "hi!");
        payment4.payDeposit();
        payment4.payDeposit();
    }

    @Test
    public void test28199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28199");
        payment.Payment payment4 = new payment.Payment((long) 100, 100.0d, "hi!", "");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment4.payBalance();
        java.lang.Class<?> wildcardClass8 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test28200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28200");
        payment.Payment payment4 = new payment.Payment(0L, (double) (-1L), "hi!", "");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        payment.PaymentStrategy paymentStrategy9 = null;
        payment4.setPaymentStrategy(paymentStrategy9);
        payment.PaymentStrategy paymentStrategy11 = null;
        payment4.setPaymentStrategy(paymentStrategy11);
        boolean boolean13 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test28201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28201");
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
        payment4.payDeposit();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        boolean boolean18 = payment4.paymentCompleted();
        payment4.payBalance();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test28202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28202");
        payment.Payment payment4 = new payment.Payment((long) 10, (double) 100L, "hi!", "");
        boolean boolean5 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        boolean boolean8 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test28203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28203");
        payment.Payment payment4 = new payment.Payment(100L, (double) (byte) 100, "", "hi!");
        payment4.verifyPaymentDetails();
        boolean boolean6 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test28204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28204");
        payment.Payment payment4 = new payment.Payment(0L, (double) (short) 1, "", "hi!");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        boolean boolean10 = payment4.paymentCompleted();
        payment4.payBalance();
        payment4.payBalance();
        payment4.payDeposit();
        payment4.payDeposit();
        boolean boolean15 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy18 = null;
        payment4.setPaymentStrategy(paymentStrategy18);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test28205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28205");
        payment.Payment payment4 = new payment.Payment((long) (byte) 100, (double) 10.0f, "", "hi!");
        payment4.verifyPaymentDetails();
        boolean boolean6 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test28206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28206");
        payment.Payment payment4 = new payment.Payment((long) 1, (double) (byte) -1, "", "hi!");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
    }

    @Test
    public void test28207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28207");
        payment.Payment payment4 = new payment.Payment((long) '#', (double) 10.0f, "hi!", "hi!");
        boolean boolean5 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test28208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28208");
        payment.Payment payment4 = new payment.Payment((long) ' ', (double) 100L, "hi!", "");
        boolean boolean5 = payment4.paymentCompleted();
        payment4.payBalance();
        payment4.payDeposit();
        boolean boolean8 = payment4.paymentCompleted();
        payment4.payBalance();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test28209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28209");
        payment.Payment payment4 = new payment.Payment(0L, 100.0d, "hi!", "hi!");
        payment4.payBalance();
        java.lang.Class<?> wildcardClass6 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test28210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28210");
        payment.Payment payment4 = new payment.Payment(0L, (double) (byte) 0, "", "");
        boolean boolean5 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment4.verifyPaymentDetails();
        boolean boolean9 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment4.payBalance();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test28211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28211");
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
        boolean boolean14 = payment4.paymentCompleted();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy16 = null;
        payment4.setPaymentStrategy(paymentStrategy16);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test28212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28212");
        payment.Payment payment4 = new payment.Payment((long) (-1), (double) (short) -1, "hi!", "");
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        boolean boolean10 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy11 = null;
        payment4.setPaymentStrategy(paymentStrategy11);
        payment4.payBalance();
        java.lang.Class<?> wildcardClass14 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test28213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28213");
        payment.Payment payment4 = new payment.Payment(0L, (double) (byte) -1, "", "hi!");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment4.payDeposit();
        payment4.payBalance();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy10 = null;
        payment4.setPaymentStrategy(paymentStrategy10);
    }

    @Test
    public void test28214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28214");
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
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment4.payBalance();
        boolean boolean17 = payment4.paymentCompleted();
        payment4.payDeposit();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test28215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28215");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) (byte) 10, "", "");
        payment4.payBalance();
        boolean boolean6 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        boolean boolean9 = payment4.paymentCompleted();
        boolean boolean10 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        boolean boolean13 = payment4.paymentCompleted();
        payment4.payBalance();
        boolean boolean15 = payment4.paymentCompleted();
        payment4.payBalance();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test28216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28216");
        payment.Payment payment4 = new payment.Payment((long) (byte) -1, (double) 0L, "", "");
        payment4.verifyPaymentDetails();
    }

    @Test
    public void test28217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28217");
        payment.Payment payment4 = new payment.Payment((long) 100, (double) (byte) -1, "", "hi!");
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        payment.PaymentStrategy paymentStrategy9 = null;
        payment4.setPaymentStrategy(paymentStrategy9);
    }

    @Test
    public void test28218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28218");
        payment.Payment payment4 = new payment.Payment(1L, 0.0d, "", "");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment4.payBalance();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
    }

    @Test
    public void test28219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28219");
        payment.Payment payment4 = new payment.Payment((-1L), (double) 'a', "hi!", "");
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment4.payDeposit();
        payment4.payDeposit();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy11 = null;
        payment4.setPaymentStrategy(paymentStrategy11);
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy14 = null;
        payment4.setPaymentStrategy(paymentStrategy14);
        payment4.payDeposit();
        payment4.payDeposit();
    }

    @Test
    public void test28220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28220");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) (short) 0, "", "");
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        payment4.payDeposit();
    }

    @Test
    public void test28221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28221");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) (byte) 10, "", "");
        payment4.payBalance();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy14 = null;
        payment4.setPaymentStrategy(paymentStrategy14);
    }

    @Test
    public void test28222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28222");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) (byte) 10, "", "");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        boolean boolean7 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        boolean boolean9 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment4.payDeposit();
        payment4.payDeposit();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test28223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28223");
        payment.Payment payment4 = new payment.Payment((long) (-1), (double) (byte) 0, "hi!", "");
    }

    @Test
    public void test28224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28224");
        payment.Payment payment4 = new payment.Payment((long) (short) 0, (double) (-1L), "", "hi!");
        boolean boolean5 = payment4.paymentCompleted();
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        payment4.payBalance();
        payment4.payDeposit();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test28225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28225");
        payment.Payment payment4 = new payment.Payment((long) (short) 100, (double) (byte) -1, "", "");
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        payment4.verifyPaymentDetails();
    }

    @Test
    public void test28226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28226");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) (byte) 10, "", "");
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment4.payBalance();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
    }

    @Test
    public void test28227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28227");
        payment.Payment payment4 = new payment.Payment((long) (byte) -1, (double) (short) -1, "", "");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy10 = null;
        payment4.setPaymentStrategy(paymentStrategy10);
        payment4.payBalance();
        payment4.payBalance();
    }

    @Test
    public void test28228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28228");
        payment.Payment payment4 = new payment.Payment(10L, (double) 10L, "", "");
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        java.lang.Class<?> wildcardClass10 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test28229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28229");
        payment.Payment payment4 = new payment.Payment((long) (byte) 100, (double) (short) 10, "", "hi!");
        payment4.payBalance();
        payment4.payBalance();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
    }

    @Test
    public void test28230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28230");
        payment.Payment payment4 = new payment.Payment((long) (byte) -1, (double) (byte) 1, "hi!", "");
        boolean boolean5 = payment4.paymentCompleted();
        payment4.payDeposit();
        boolean boolean7 = payment4.paymentCompleted();
        payment4.payDeposit();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test28231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28231");
        payment.Payment payment4 = new payment.Payment(0L, 0.0d, "hi!", "hi!");
        payment4.payBalance();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        boolean boolean8 = payment4.paymentCompleted();
        boolean boolean9 = payment4.paymentCompleted();
        payment4.payDeposit();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test28232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28232");
        payment.Payment payment4 = new payment.Payment((long) (short) 1, (double) 1.0f, "", "");
        boolean boolean5 = payment4.paymentCompleted();
        boolean boolean6 = payment4.paymentCompleted();
        boolean boolean7 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy9 = null;
        payment4.setPaymentStrategy(paymentStrategy9);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test28233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28233");
        payment.Payment payment4 = new payment.Payment((-1L), (double) (byte) 0, "hi!", "");
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        boolean boolean7 = payment4.paymentCompleted();
        payment4.payBalance();
        payment4.payBalance();
        boolean boolean10 = payment4.paymentCompleted();
        payment4.payBalance();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test28234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28234");
        payment.Payment payment4 = new payment.Payment((-1L), (double) 'a', "hi!", "");
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        boolean boolean9 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy10 = null;
        payment4.setPaymentStrategy(paymentStrategy10);
        payment4.payBalance();
        payment4.payBalance();
        boolean boolean14 = payment4.paymentCompleted();
        boolean boolean15 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        boolean boolean17 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test28235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28235");
        payment.Payment payment4 = new payment.Payment((-1L), (double) 'a', "hi!", "");
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        boolean boolean9 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy10 = null;
        payment4.setPaymentStrategy(paymentStrategy10);
        payment4.payBalance();
        payment4.payBalance();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy15 = null;
        payment4.setPaymentStrategy(paymentStrategy15);
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test28236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28236");
        payment.Payment payment4 = new payment.Payment((long) 'a', 0.0d, "", "");
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        boolean boolean9 = payment4.paymentCompleted();
        payment4.payDeposit();
        boolean boolean11 = payment4.paymentCompleted();
        boolean boolean12 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test28237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28237");
        payment.Payment payment4 = new payment.Payment(100L, 10.0d, "", "");
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
    }

    @Test
    public void test28238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28238");
        payment.Payment payment4 = new payment.Payment(10L, (double) 100.0f, "", "hi!");
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy12 = null;
        payment4.setPaymentStrategy(paymentStrategy12);
        payment4.verifyPaymentDetails();
    }

    @Test
    public void test28239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28239");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) (byte) 10, "", "");
        payment4.payDeposit();
        boolean boolean6 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment4.payBalance();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy12 = null;
        payment4.setPaymentStrategy(paymentStrategy12);
        java.lang.Class<?> wildcardClass14 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test28240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28240");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) (byte) 10, "", "");
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        boolean boolean8 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy9 = null;
        payment4.setPaymentStrategy(paymentStrategy9);
        payment4.payDeposit();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy13 = null;
        payment4.setPaymentStrategy(paymentStrategy13);
        boolean boolean15 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test28241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28241");
        payment.Payment payment4 = new payment.Payment((-1L), (double) (byte) 0, "hi!", "");
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        payment4.payDeposit();
        payment4.payDeposit();
        payment4.payBalance();
        payment4.payBalance();
        boolean boolean14 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test28242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28242");
        payment.Payment payment4 = new payment.Payment((long) (short) 100, (double) (short) 100, "hi!", "hi!");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment4.payDeposit();
    }

    @Test
    public void test28243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28243");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) 100L, "hi!", "");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        java.lang.Class<?> wildcardClass7 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test28244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28244");
        payment.Payment payment4 = new payment.Payment((long) (byte) 1, (double) 10L, "hi!", "");
        payment4.payDeposit();
        boolean boolean6 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test28245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28245");
        payment.Payment payment4 = new payment.Payment((long) (byte) -1, (double) 0, "", "hi!");
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
    }

    @Test
    public void test28246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28246");
        payment.Payment payment4 = new payment.Payment(0L, (double) 10.0f, "hi!", "hi!");
        boolean boolean5 = payment4.paymentCompleted();
        boolean boolean6 = payment4.paymentCompleted();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        boolean boolean10 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test28247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28247");
        payment.Payment payment4 = new payment.Payment((long) (byte) 100, (double) (short) 100, "", "hi!");
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        payment.PaymentStrategy paymentStrategy9 = null;
        payment4.setPaymentStrategy(paymentStrategy9);
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment4.payDeposit();
        java.lang.Class<?> wildcardClass14 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test28248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28248");
        payment.Payment payment4 = new payment.Payment((long) (short) -1, (double) 1.0f, "hi!", "");
        boolean boolean5 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        java.lang.Class<?> wildcardClass8 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test28249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28249");
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
        boolean boolean15 = payment4.paymentCompleted();
        java.lang.Class<?> wildcardClass16 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test28250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28250");
        payment.Payment payment4 = new payment.Payment((long) (byte) 0, (double) 'a', "", "hi!");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        boolean boolean7 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test28251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28251");
        payment.Payment payment4 = new payment.Payment((-1L), (double) (-1), "", "hi!");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        boolean boolean7 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy9 = null;
        payment4.setPaymentStrategy(paymentStrategy9);
        payment.PaymentStrategy paymentStrategy11 = null;
        payment4.setPaymentStrategy(paymentStrategy11);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test28252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28252");
        payment.Payment payment4 = new payment.Payment((long) (byte) 100, (double) (byte) 0, "hi!", "");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
    }

    @Test
    public void test28253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28253");
        payment.Payment payment4 = new payment.Payment((long) 'a', (double) 1L, "", "hi!");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        boolean boolean7 = payment4.paymentCompleted();
        payment4.payBalance();
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy11 = null;
        payment4.setPaymentStrategy(paymentStrategy11);
        java.lang.Class<?> wildcardClass13 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test28254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28254");
        payment.Payment payment4 = new payment.Payment(100L, (double) (byte) 1, "hi!", "");
        payment4.verifyPaymentDetails();
        boolean boolean6 = payment4.paymentCompleted();
        payment4.payBalance();
        boolean boolean8 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test28255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28255");
        payment.Payment payment4 = new payment.Payment((long) 0, 10.0d, "hi!", "");
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        payment4.payBalance();
        payment4.payBalance();
    }

    @Test
    public void test28256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28256");
        payment.Payment payment4 = new payment.Payment((-1L), (double) (byte) 0, "hi!", "");
        boolean boolean5 = payment4.paymentCompleted();
        payment4.payBalance();
        payment4.payDeposit();
        boolean boolean8 = payment4.paymentCompleted();
        payment4.payBalance();
        boolean boolean10 = payment4.paymentCompleted();
        payment4.payBalance();
        payment4.payBalance();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy16 = null;
        payment4.setPaymentStrategy(paymentStrategy16);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test28257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28257");
        payment.Payment payment4 = new payment.Payment((long) 'a', (double) 1L, "", "hi!");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment4.payDeposit();
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy10 = null;
        payment4.setPaymentStrategy(paymentStrategy10);
        payment.PaymentStrategy paymentStrategy12 = null;
        payment4.setPaymentStrategy(paymentStrategy12);
    }

    @Test
    public void test28258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28258");
        payment.Payment payment4 = new payment.Payment((-1L), (double) (byte) 0, "hi!", "");
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy11 = null;
        payment4.setPaymentStrategy(paymentStrategy11);
        payment4.payBalance();
    }

    @Test
    public void test28259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28259");
        payment.Payment payment4 = new payment.Payment(10L, (double) ' ', "", "hi!");
        payment4.payBalance();
        payment4.payBalance();
        payment4.payDeposit();
    }

    @Test
    public void test28260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28260");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) '4', "hi!", "");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment4.payBalance();
    }

    @Test
    public void test28261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28261");
        payment.Payment payment4 = new payment.Payment((long) (byte) 1, 0.0d, "hi!", "hi!");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment4.payDeposit();
        payment4.payDeposit();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy11 = null;
        payment4.setPaymentStrategy(paymentStrategy11);
        payment.PaymentStrategy paymentStrategy13 = null;
        payment4.setPaymentStrategy(paymentStrategy13);
    }

    @Test
    public void test28262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28262");
        payment.Payment payment4 = new payment.Payment((long) (short) 10, (double) (-1.0f), "", "");
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment4.payBalance();
    }

    @Test
    public void test28263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28263");
        payment.Payment payment4 = new payment.Payment((long) (byte) -1, (double) (short) 100, "hi!", "hi!");
        boolean boolean5 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test28264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28264");
        payment.Payment payment4 = new payment.Payment((long) (short) 100, (double) (short) 100, "", "hi!");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
    }

    @Test
    public void test28265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28265");
        payment.Payment payment4 = new payment.Payment((long) (byte) 10, (double) 'a', "", "");
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        boolean boolean9 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy10 = null;
        payment4.setPaymentStrategy(paymentStrategy10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test28266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28266");
        payment.Payment payment4 = new payment.Payment((long) (short) 1, 10.0d, "hi!", "hi!");
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        boolean boolean9 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test28267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28267");
        payment.Payment payment4 = new payment.Payment((-1L), (double) 'a', "hi!", "");
        payment4.payBalance();
        payment4.payBalance();
        payment4.payDeposit();
        boolean boolean8 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy9 = null;
        payment4.setPaymentStrategy(paymentStrategy9);
        payment4.payBalance();
        payment4.payDeposit();
        payment4.payDeposit();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test28268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28268");
        payment.Payment payment4 = new payment.Payment((long) (short) 1, (double) (short) 100, "hi!", "hi!");
        boolean boolean5 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        boolean boolean9 = payment4.paymentCompleted();
        java.lang.Class<?> wildcardClass10 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test28269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28269");
        payment.Payment payment4 = new payment.Payment((long) (byte) 100, (double) (byte) 1, "", "");
        boolean boolean5 = payment4.paymentCompleted();
        payment4.payBalance();
        boolean boolean7 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test28270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28270");
        payment.Payment payment4 = new payment.Payment((long) 'a', 0.0d, "hi!", "");
        boolean boolean5 = payment4.paymentCompleted();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        payment4.verifyPaymentDetails();
        java.lang.Class<?> wildcardClass10 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test28271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28271");
        payment.Payment payment4 = new payment.Payment((long) (byte) 10, 10.0d, "", "hi!");
        payment4.payBalance();
        boolean boolean6 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test28272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28272");
        payment.Payment payment4 = new payment.Payment((-1L), (double) 'a', "hi!", "");
        payment4.payBalance();
        payment4.payBalance();
        boolean boolean7 = payment4.paymentCompleted();
        boolean boolean8 = payment4.paymentCompleted();
        payment4.payDeposit();
        boolean boolean10 = payment4.paymentCompleted();
        boolean boolean11 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy13 = null;
        payment4.setPaymentStrategy(paymentStrategy13);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test28273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28273");
        payment.Payment payment4 = new payment.Payment((-1L), (double) 'a', "hi!", "");
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment4.payDeposit();
        payment4.payDeposit();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment4.payBalance();
        payment4.payDeposit();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy17 = null;
        payment4.setPaymentStrategy(paymentStrategy17);
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
    }

    @Test
    public void test28274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28274");
        payment.Payment payment4 = new payment.Payment((-1L), (double) 'a', "hi!", "");
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        boolean boolean8 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy9 = null;
        payment4.setPaymentStrategy(paymentStrategy9);
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy14 = null;
        payment4.setPaymentStrategy(paymentStrategy14);
        payment4.payDeposit();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test28275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28275");
        payment.Payment payment4 = new payment.Payment(10L, (double) (short) -1, "", "hi!");
        boolean boolean5 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        boolean boolean7 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        boolean boolean10 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        boolean boolean12 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test28276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28276");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) (byte) 10, "", "");
        payment4.payBalance();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        payment4.payBalance();
        boolean boolean10 = payment4.paymentCompleted();
        boolean boolean11 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy12 = null;
        payment4.setPaymentStrategy(paymentStrategy12);
        payment4.verifyPaymentDetails();
        boolean boolean15 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test28277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28277");
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
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy16 = null;
        payment4.setPaymentStrategy(paymentStrategy16);
        payment4.payDeposit();
        boolean boolean19 = payment4.paymentCompleted();
        payment4.payBalance();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test28278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28278");
        payment.Payment payment4 = new payment.Payment((long) ' ', (double) (byte) 10, "hi!", "");
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        boolean boolean10 = payment4.paymentCompleted();
        payment4.payDeposit();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test28279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28279");
        payment.Payment payment4 = new payment.Payment((long) 'a', 10.0d, "", "hi!");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        java.lang.Class<?> wildcardClass7 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test28280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28280");
        payment.Payment payment4 = new payment.Payment((-1L), (double) 'a', "hi!", "");
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        boolean boolean8 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy11 = null;
        payment4.setPaymentStrategy(paymentStrategy11);
        payment4.payDeposit();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy15 = null;
        payment4.setPaymentStrategy(paymentStrategy15);
        boolean boolean17 = payment4.paymentCompleted();
        boolean boolean18 = payment4.paymentCompleted();
        boolean boolean19 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test28281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28281");
        payment.Payment payment4 = new payment.Payment(100L, (double) (byte) 1, "hi!", "");
        boolean boolean5 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        boolean boolean7 = payment4.paymentCompleted();
        payment4.payDeposit();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test28282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28282");
        payment.Payment payment4 = new payment.Payment((long) '#', (double) (-1), "", "");
        boolean boolean5 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test28283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28283");
        payment.Payment payment4 = new payment.Payment((long) '#', (double) 100L, "hi!", "");
        payment4.payDeposit();
    }

    @Test
    public void test28284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28284");
        payment.Payment payment4 = new payment.Payment((long) (byte) 0, 1.0d, "", "");
        boolean boolean5 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        boolean boolean8 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment4.payDeposit();
        payment4.payDeposit();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test28285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28285");
        payment.Payment payment4 = new payment.Payment((long) '4', (double) 1, "", "");
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        boolean boolean10 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test28286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28286");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) (byte) 10, "", "");
        payment4.payDeposit();
        boolean boolean6 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy11 = null;
        payment4.setPaymentStrategy(paymentStrategy11);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test28287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28287");
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
        boolean boolean19 = payment4.paymentCompleted();
        boolean boolean20 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test28288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28288");
        payment.Payment payment4 = new payment.Payment((-1L), 10.0d, "", "hi!");
        boolean boolean5 = payment4.paymentCompleted();
        boolean boolean6 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        payment4.payDeposit();
        boolean boolean10 = payment4.paymentCompleted();
        payment4.payBalance();
        payment4.payBalance();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test28289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28289");
        payment.Payment payment4 = new payment.Payment((long) (byte) -1, (double) 100L, "hi!", "hi!");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment4.payDeposit();
        payment4.payDeposit();
    }

    @Test
    public void test28290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28290");
        payment.Payment payment4 = new payment.Payment((-1L), (double) 'a', "hi!", "");
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy9 = null;
        payment4.setPaymentStrategy(paymentStrategy9);
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy12 = null;
        payment4.setPaymentStrategy(paymentStrategy12);
        payment4.verifyPaymentDetails();
    }

    @Test
    public void test28291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28291");
        payment.Payment payment4 = new payment.Payment((long) (short) 0, (double) (-1L), "", "hi!");
        boolean boolean5 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        boolean boolean9 = payment4.paymentCompleted();
        java.lang.Class<?> wildcardClass10 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test28292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28292");
        payment.Payment payment4 = new payment.Payment((long) (byte) -1, (double) (short) 100, "", "");
        payment4.payDeposit();
    }

    @Test
    public void test28293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28293");
        payment.Payment payment4 = new payment.Payment((long) (byte) 10, (double) (short) -1, "hi!", "");
        payment4.verifyPaymentDetails();
        boolean boolean6 = payment4.paymentCompleted();
        boolean boolean7 = payment4.paymentCompleted();
        boolean boolean8 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy10 = null;
        payment4.setPaymentStrategy(paymentStrategy10);
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy13 = null;
        payment4.setPaymentStrategy(paymentStrategy13);
        payment4.payDeposit();
        payment4.payBalance();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test28294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28294");
        payment.Payment payment4 = new payment.Payment((long) 'a', 100.0d, "", "hi!");
        payment4.payBalance();
        payment4.payBalance();
        boolean boolean7 = payment4.paymentCompleted();
        boolean boolean8 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test28295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28295");
        payment.Payment payment4 = new payment.Payment((-1L), (double) 'a', "hi!", "");
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment4.payDeposit();
        payment4.payDeposit();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment4.verifyPaymentDetails();
    }

    @Test
    public void test28296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28296");
        payment.Payment payment4 = new payment.Payment((long) ' ', (double) (byte) -1, "", "");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment4.payBalance();
        payment4.payBalance();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        java.lang.Class<?> wildcardClass11 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test28297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28297");
        payment.Payment payment4 = new payment.Payment((-1L), (double) '#', "", "hi!");
        boolean boolean5 = payment4.paymentCompleted();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        payment4.payDeposit();
        payment4.payDeposit();
        payment4.payBalance();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy13 = null;
        payment4.setPaymentStrategy(paymentStrategy13);
        payment4.verifyPaymentDetails();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test28298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28298");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) 'a', "", "hi!");
        payment4.payBalance();
        payment4.payDeposit();
        payment4.payDeposit();
        payment4.payDeposit();
        payment4.payBalance();
        boolean boolean10 = payment4.paymentCompleted();
        payment4.payDeposit();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test28299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28299");
        payment.Payment payment4 = new payment.Payment((long) '4', (double) 1L, "", "hi!");
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        boolean boolean8 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test28300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28300");
        payment.Payment payment4 = new payment.Payment((long) (short) -1, (double) (short) 1, "hi!", "hi!");
        payment4.payBalance();
        payment4.payDeposit();
        boolean boolean7 = payment4.paymentCompleted();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy9 = null;
        payment4.setPaymentStrategy(paymentStrategy9);
        payment4.payBalance();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test28301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28301");
        payment.Payment payment4 = new payment.Payment((long) (short) 1, (double) '#', "", "hi!");
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment4.payDeposit();
        boolean boolean9 = payment4.paymentCompleted();
        payment4.payBalance();
        boolean boolean11 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test28302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28302");
        payment.Payment payment4 = new payment.Payment((long) '#', (double) 0L, "", "");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment4.payBalance();
        payment4.payDeposit();
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        boolean boolean12 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test28303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28303");
        payment.Payment payment4 = new payment.Payment((long) 10, (double) (-1), "", "hi!");
        payment4.payDeposit();
        payment4.payDeposit();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy9 = null;
        payment4.setPaymentStrategy(paymentStrategy9);
        boolean boolean11 = payment4.paymentCompleted();
        boolean boolean12 = payment4.paymentCompleted();
        boolean boolean13 = payment4.paymentCompleted();
        boolean boolean14 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test28304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28304");
        payment.Payment payment4 = new payment.Payment((long) (short) -1, (double) (short) 1, "hi!", "hi!");
        payment4.payBalance();
        boolean boolean6 = payment4.paymentCompleted();
        boolean boolean7 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test28305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28305");
        payment.Payment payment4 = new payment.Payment(0L, (double) 1L, "hi!", "");
        payment4.payBalance();
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy11 = null;
        payment4.setPaymentStrategy(paymentStrategy11);
    }

    @Test
    public void test28306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28306");
        payment.Payment payment4 = new payment.Payment((long) (short) 10, (double) ' ', "", "hi!");
        boolean boolean5 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment4.payDeposit();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test28307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28307");
        payment.Payment payment4 = new payment.Payment((-1L), (double) 'a', "hi!", "");
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        boolean boolean9 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy10 = null;
        payment4.setPaymentStrategy(paymentStrategy10);
        payment4.payBalance();
        payment4.payBalance();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy15 = null;
        payment4.setPaymentStrategy(paymentStrategy15);
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        payment4.payDeposit();
        payment4.payBalance();
        payment4.payDeposit();
        payment4.payDeposit();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test28308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28308");
        payment.Payment payment4 = new payment.Payment((long) (short) -1, 0.0d, "hi!", "");
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        java.lang.Class<?> wildcardClass7 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test28309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28309");
        payment.Payment payment4 = new payment.Payment((-1L), (double) (byte) 0, "hi!", "");
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment4.payDeposit();
        boolean boolean9 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test28310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28310");
        payment.Payment payment4 = new payment.Payment(0L, (double) 1.0f, "hi!", "");
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        java.lang.Class<?> wildcardClass7 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test28311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28311");
        payment.Payment payment4 = new payment.Payment((long) (byte) 0, (double) 1.0f, "", "");
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
    }

    @Test
    public void test28312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28312");
        payment.Payment payment4 = new payment.Payment((long) 100, (double) (byte) -1, "", "");
        boolean boolean5 = payment4.paymentCompleted();
        payment4.payDeposit();
        boolean boolean7 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test28313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28313");
        payment.Payment payment4 = new payment.Payment(0L, (double) (-1L), "hi!", "hi!");
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        boolean boolean8 = payment4.paymentCompleted();
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        payment4.payDeposit();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test28314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28314");
        payment.Payment payment4 = new payment.Payment((long) (short) 0, (double) (short) 1, "", "");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment4.payDeposit();
    }

    @Test
    public void test28315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28315");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) (byte) 10, "", "");
        payment4.payBalance();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        payment4.payBalance();
        boolean boolean10 = payment4.paymentCompleted();
        boolean boolean11 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy12 = null;
        payment4.setPaymentStrategy(paymentStrategy12);
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy18 = null;
        payment4.setPaymentStrategy(paymentStrategy18);
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test28316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28316");
        payment.Payment payment4 = new payment.Payment((long) (short) 10, (double) 1L, "", "hi!");
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        payment4.payBalance();
        payment4.verifyPaymentDetails();
    }

    @Test
    public void test28317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28317");
        payment.Payment payment4 = new payment.Payment((long) ' ', (double) 100, "hi!", "");
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        boolean boolean7 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment4.payDeposit();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy11 = null;
        payment4.setPaymentStrategy(paymentStrategy11);
        payment4.verifyPaymentDetails();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test28318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28318");
        payment.Payment payment4 = new payment.Payment((long) (short) 1, (double) (-1.0f), "", "");
        payment4.verifyPaymentDetails();
        boolean boolean6 = payment4.paymentCompleted();
        payment4.payBalance();
        boolean boolean8 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test28319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28319");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) 100.0f, "hi!", "");
        payment4.payBalance();
        java.lang.Class<?> wildcardClass6 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test28320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28320");
        payment.Payment payment4 = new payment.Payment((long) (byte) 0, (double) 0L, "hi!", "");
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        java.lang.Class<?> wildcardClass9 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test28321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28321");
        payment.Payment payment4 = new payment.Payment((-1L), (double) 'a', "hi!", "");
        payment4.payBalance();
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
    }

    @Test
    public void test28322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28322");
        payment.Payment payment4 = new payment.Payment((-1L), (double) 'a', "hi!", "");
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        payment4.payBalance();
        payment4.payDeposit();
        payment4.payDeposit();
        boolean boolean12 = payment4.paymentCompleted();
        payment4.payBalance();
        payment4.payDeposit();
        payment4.payDeposit();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test28323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28323");
        payment.Payment payment4 = new payment.Payment((long) (byte) 1, (double) 10, "hi!", "");
        payment4.payDeposit();
        boolean boolean6 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test28324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28324");
        payment.Payment payment4 = new payment.Payment((long) (byte) -1, (double) (byte) 0, "", "hi!");
        payment4.payDeposit();
        payment4.payDeposit();
        boolean boolean7 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test28325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28325");
        payment.Payment payment4 = new payment.Payment((long) (byte) 0, (double) 0, "hi!", "hi!");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
    }

    @Test
    public void test28326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28326");
        payment.Payment payment4 = new payment.Payment((long) '4', (double) 100L, "", "");
        payment4.payBalance();
        boolean boolean6 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        payment4.verifyPaymentDetails();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test28327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28327");
        payment.Payment payment4 = new payment.Payment(0L, (double) 10, "hi!", "");
        payment4.payBalance();
        boolean boolean6 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test28328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28328");
        payment.Payment payment4 = new payment.Payment(0L, (double) (byte) 0, "", "");
        boolean boolean5 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        boolean boolean10 = payment4.paymentCompleted();
        java.lang.Class<?> wildcardClass11 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test28329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28329");
        payment.Payment payment4 = new payment.Payment(1L, (double) (byte) -1, "hi!", "hi!");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        boolean boolean7 = payment4.paymentCompleted();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy9 = null;
        payment4.setPaymentStrategy(paymentStrategy9);
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy12 = null;
        payment4.setPaymentStrategy(paymentStrategy12);
        payment.PaymentStrategy paymentStrategy14 = null;
        payment4.setPaymentStrategy(paymentStrategy14);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test28330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28330");
        payment.Payment payment4 = new payment.Payment(0L, (double) (short) 1, "", "hi!");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy10 = null;
        payment4.setPaymentStrategy(paymentStrategy10);
        payment4.payBalance();
        payment4.payDeposit();
        payment4.payBalance();
        java.lang.Class<?> wildcardClass15 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test28331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28331");
        payment.Payment payment4 = new payment.Payment((long) (short) 1, 10.0d, "", "");
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        payment4.payBalance();
    }

    @Test
    public void test28332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28332");
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
        payment4.payDeposit();
        payment4.payDeposit();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test28333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28333");
        payment.Payment payment4 = new payment.Payment((long) '4', (double) (-1L), "", "hi!");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        boolean boolean9 = payment4.paymentCompleted();
        java.lang.Class<?> wildcardClass10 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test28334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28334");
        payment.Payment payment4 = new payment.Payment((long) (byte) 100, 0.0d, "", "");
        payment4.payDeposit();
        boolean boolean6 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        boolean boolean9 = payment4.paymentCompleted();
        boolean boolean10 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy13 = null;
        payment4.setPaymentStrategy(paymentStrategy13);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test28335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28335");
        payment.Payment payment4 = new payment.Payment((long) (byte) 10, (double) ' ', "", "");
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        boolean boolean7 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        boolean boolean10 = payment4.paymentCompleted();
        payment4.payDeposit();
        boolean boolean12 = payment4.paymentCompleted();
        java.lang.Class<?> wildcardClass13 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test28336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28336");
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
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment4.payDeposit();
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test28337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28337");
        payment.Payment payment4 = new payment.Payment((long) (byte) 1, (double) (byte) 10, "hi!", "hi!");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        payment4.payBalance();
    }

    @Test
    public void test28338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28338");
        payment.Payment payment4 = new payment.Payment((long) (byte) 0, (double) 0, "hi!", "hi!");
        boolean boolean5 = payment4.paymentCompleted();
        payment4.payBalance();
        boolean boolean7 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test28339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28339");
        payment.Payment payment4 = new payment.Payment(10L, (double) (short) 10, "hi!", "hi!");
        payment4.payDeposit();
        boolean boolean6 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        boolean boolean8 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test28340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28340");
        payment.Payment payment4 = new payment.Payment((long) 100, (double) (-1), "", "");
        boolean boolean5 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test28341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28341");
        payment.Payment payment4 = new payment.Payment((long) 'a', (double) 1L, "", "hi!");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        boolean boolean7 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        boolean boolean9 = payment4.paymentCompleted();
        boolean boolean10 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy11 = null;
        payment4.setPaymentStrategy(paymentStrategy11);
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        java.lang.Class<?> wildcardClass16 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test28342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28342");
        payment.Payment payment4 = new payment.Payment((long) '4', (double) (-1L), "", "hi!");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        boolean boolean9 = payment4.paymentCompleted();
        boolean boolean10 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy11 = null;
        payment4.setPaymentStrategy(paymentStrategy11);
        payment4.verifyPaymentDetails();
        java.lang.Class<?> wildcardClass14 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test28343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28343");
        payment.Payment payment4 = new payment.Payment((long) (byte) 1, 1.0d, "", "hi!");
        boolean boolean5 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment4.payBalance();
        java.lang.Class<?> wildcardClass9 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test28344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28344");
        payment.Payment payment4 = new payment.Payment((long) 100, (double) (byte) 0, "", "");
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
    }

    @Test
    public void test28345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28345");
        payment.Payment payment4 = new payment.Payment((long) (short) 100, 10.0d, "", "hi!");
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        payment4.payBalance();
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
    }

    @Test
    public void test28346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28346");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) (-1.0f), "hi!", "hi!");
        boolean boolean5 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        boolean boolean8 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test28347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28347");
        payment.Payment payment4 = new payment.Payment((long) (-1), (double) (byte) 1, "", "");
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy9 = null;
        payment4.setPaymentStrategy(paymentStrategy9);
        boolean boolean11 = payment4.paymentCompleted();
        java.lang.Class<?> wildcardClass12 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test28348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28348");
        payment.Payment payment4 = new payment.Payment((long) (short) 0, (double) (-1.0f), "hi!", "");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
    }

    @Test
    public void test28349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28349");
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
        payment4.payDeposit();
        payment4.payBalance();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test28350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28350");
        payment.Payment payment4 = new payment.Payment((long) (byte) 100, (double) 10L, "hi!", "hi!");
        boolean boolean5 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test28351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28351");
        payment.Payment payment4 = new payment.Payment((-1L), (double) (byte) 0, "hi!", "");
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        payment.PaymentStrategy paymentStrategy9 = null;
        payment4.setPaymentStrategy(paymentStrategy9);
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy13 = null;
        payment4.setPaymentStrategy(paymentStrategy13);
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        boolean boolean17 = payment4.paymentCompleted();
        boolean boolean18 = payment4.paymentCompleted();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy20 = null;
        payment4.setPaymentStrategy(paymentStrategy20);
        payment.PaymentStrategy paymentStrategy22 = null;
        payment4.setPaymentStrategy(paymentStrategy22);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test28352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28352");
        payment.Payment payment4 = new payment.Payment((long) (byte) -1, (double) (short) -1, "", "");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        payment.PaymentStrategy paymentStrategy9 = null;
        payment4.setPaymentStrategy(paymentStrategy9);
        boolean boolean11 = payment4.paymentCompleted();
        boolean boolean12 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test28353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28353");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) (-1.0f), "hi!", "hi!");
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        payment4.verifyPaymentDetails();
    }

    @Test
    public void test28354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28354");
        payment.Payment payment4 = new payment.Payment((long) (short) 1, (double) 1L, "hi!", "hi!");
        boolean boolean5 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        java.lang.Class<?> wildcardClass10 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test28355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28355");
        payment.Payment payment4 = new payment.Payment(100L, (double) (-1), "hi!", "hi!");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment4.payBalance();
        boolean boolean8 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy9 = null;
        payment4.setPaymentStrategy(paymentStrategy9);
        payment4.verifyPaymentDetails();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test28356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28356");
        payment.Payment payment4 = new payment.Payment((long) ' ', 0.0d, "hi!", "");
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        boolean boolean7 = payment4.paymentCompleted();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy9 = null;
        payment4.setPaymentStrategy(paymentStrategy9);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test28357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28357");
        payment.Payment payment4 = new payment.Payment((long) 10, (double) (short) -1, "", "hi!");
        payment4.payBalance();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
    }

    @Test
    public void test28358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28358");
        payment.Payment payment4 = new payment.Payment((long) (byte) 10, (double) (short) -1, "", "hi!");
        payment4.payBalance();
        boolean boolean6 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        boolean boolean8 = payment4.paymentCompleted();
        boolean boolean9 = payment4.paymentCompleted();
        java.lang.Class<?> wildcardClass10 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test28359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28359");
        payment.Payment payment4 = new payment.Payment((long) (byte) 0, 100.0d, "", "");
        payment4.payDeposit();
        payment4.payBalance();
        payment4.payDeposit();
        payment4.payBalance();
    }

    @Test
    public void test28360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28360");
        payment.Payment payment4 = new payment.Payment(1L, (double) (byte) 0, "", "");
        boolean boolean5 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment4.payBalance();
        payment4.payBalance();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test28361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28361");
        payment.Payment payment4 = new payment.Payment(100L, (double) (byte) 1, "", "hi!");
        payment4.payBalance();
        boolean boolean6 = payment4.paymentCompleted();
        boolean boolean7 = payment4.paymentCompleted();
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test28362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28362");
        payment.Payment payment4 = new payment.Payment((long) (short) 100, 0.0d, "hi!", "hi!");
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment4.payBalance();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        java.lang.Class<?> wildcardClass11 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test28363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28363");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) (byte) 10, "", "");
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        payment4.payDeposit();
        boolean boolean13 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test28364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28364");
        payment.Payment payment4 = new payment.Payment((long) (byte) 1, (double) (short) 100, "", "hi!");
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment4.verifyPaymentDetails();
    }

    @Test
    public void test28365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28365");
        payment.Payment payment4 = new payment.Payment((long) (byte) -1, (double) (byte) 100, "", "");
        payment4.payDeposit();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        java.lang.Class<?> wildcardClass9 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test28366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28366");
        payment.Payment payment4 = new payment.Payment((long) 'a', 0.0d, "", "");
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        payment4.payDeposit();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy9 = null;
        payment4.setPaymentStrategy(paymentStrategy9);
        payment4.payDeposit();
        payment4.payBalance();
    }

    @Test
    public void test28367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28367");
        payment.Payment payment4 = new payment.Payment((-1L), (double) (byte) 0, "hi!", "");
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        boolean boolean10 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test28368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28368");
        payment.Payment payment4 = new payment.Payment((long) '4', (double) (-1L), "", "hi!");
        payment4.payBalance();
        boolean boolean6 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test28369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28369");
        payment.Payment payment4 = new payment.Payment((long) (byte) -1, (double) 1L, "hi!", "hi!");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
    }

    @Test
    public void test28370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28370");
        payment.Payment payment4 = new payment.Payment(0L, (double) (-1L), "hi!", "hi!");
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        boolean boolean7 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment4.payBalance();
        payment4.payDeposit();
        payment4.payDeposit();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test28371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28371");
        payment.Payment payment4 = new payment.Payment((long) (byte) 1, (double) 100L, "", "hi!");
        payment4.payDeposit();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        payment4.verifyPaymentDetails();
        boolean boolean10 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test28372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28372");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) (byte) 10, "", "");
        payment4.payBalance();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        payment.PaymentStrategy paymentStrategy9 = null;
        payment4.setPaymentStrategy(paymentStrategy9);
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy15 = null;
        payment4.setPaymentStrategy(paymentStrategy15);
        payment4.payDeposit();
        payment4.payBalance();
        payment4.payBalance();
    }

    @Test
    public void test28373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28373");
        payment.Payment payment4 = new payment.Payment((long) '4', (double) ' ', "hi!", "");
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        payment4.verifyPaymentDetails();
        boolean boolean11 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test28374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28374");
        payment.Payment payment4 = new payment.Payment((long) (byte) -1, (double) 'a', "hi!", "");
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        boolean boolean8 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy9 = null;
        payment4.setPaymentStrategy(paymentStrategy9);
        payment4.payDeposit();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test28375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28375");
        payment.Payment payment4 = new payment.Payment((-1L), (double) (byte) 0, "hi!", "");
        payment4.payBalance();
        payment4.payDeposit();
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
        payment4.payDeposit();
        payment4.payBalance();
        payment4.payBalance();
        payment4.payDeposit();
        java.lang.Class<?> wildcardClass21 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test28376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28376");
        payment.Payment payment4 = new payment.Payment((long) (short) 10, (double) 10, "", "hi!");
        payment4.payDeposit();
        payment4.payBalance();
        java.lang.Class<?> wildcardClass7 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test28377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28377");
        payment.Payment payment4 = new payment.Payment(10L, (double) 10, "hi!", "");
        payment4.payBalance();
        payment4.verifyPaymentDetails();
    }

    @Test
    public void test28378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28378");
        payment.Payment payment4 = new payment.Payment((long) (short) 100, (double) 10.0f, "hi!", "");
        payment4.payBalance();
        payment4.payBalance();
        payment4.payDeposit();
        boolean boolean8 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test28379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28379");
        payment.Payment payment4 = new payment.Payment((long) 10, (double) (-1), "", "hi!");
        payment4.payDeposit();
        payment4.payBalance();
        boolean boolean7 = payment4.paymentCompleted();
        boolean boolean8 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test28380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28380");
        payment.Payment payment4 = new payment.Payment((long) (-1), (double) (byte) 1, "", "");
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy9 = null;
        payment4.setPaymentStrategy(paymentStrategy9);
        payment4.verifyPaymentDetails();
        boolean boolean12 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test28381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28381");
        payment.Payment payment4 = new payment.Payment((long) (short) 1, (double) (short) 100, "hi!", "");
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy9 = null;
        payment4.setPaymentStrategy(paymentStrategy9);
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy12 = null;
        payment4.setPaymentStrategy(paymentStrategy12);
    }

    @Test
    public void test28382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28382");
        payment.Payment payment4 = new payment.Payment((long) ' ', (double) (byte) 10, "hi!", "");
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        java.lang.Class<?> wildcardClass8 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test28383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28383");
        payment.Payment payment4 = new payment.Payment((-1L), (double) 'a', "hi!", "");
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment4.payBalance();
        boolean boolean9 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test28384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28384");
        payment.Payment payment4 = new payment.Payment((long) 10, (double) (byte) 1, "", "");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        boolean boolean7 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment4.payBalance();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy13 = null;
        payment4.setPaymentStrategy(paymentStrategy13);
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy16 = null;
        payment4.setPaymentStrategy(paymentStrategy16);
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test28385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28385");
        payment.Payment payment4 = new payment.Payment((long) (short) -1, (double) (-1.0f), "hi!", "");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        boolean boolean7 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test28386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28386");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) (byte) 10, "", "");
        payment4.payBalance();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        payment.PaymentStrategy paymentStrategy9 = null;
        payment4.setPaymentStrategy(paymentStrategy9);
        payment4.payDeposit();
        boolean boolean12 = payment4.paymentCompleted();
        payment4.payDeposit();
        boolean boolean14 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        payment4.payDeposit();
        payment4.payBalance();
        boolean boolean19 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test28387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28387");
        payment.Payment payment4 = new payment.Payment((long) (short) 0, (double) ' ', "hi!", "");
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        boolean boolean9 = payment4.paymentCompleted();
        payment4.payBalance();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test28388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28388");
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
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy16 = null;
        payment4.setPaymentStrategy(paymentStrategy16);
        payment.PaymentStrategy paymentStrategy18 = null;
        payment4.setPaymentStrategy(paymentStrategy18);
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test28389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28389");
        payment.Payment payment4 = new payment.Payment(1L, (double) 10.0f, "hi!", "");
        payment4.payDeposit();
        payment4.payDeposit();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        payment4.payDeposit();
    }

    @Test
    public void test28390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28390");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) (byte) 10, "", "");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        payment4.payBalance();
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        boolean boolean13 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy14 = null;
        payment4.setPaymentStrategy(paymentStrategy14);
        boolean boolean16 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy18 = null;
        payment4.setPaymentStrategy(paymentStrategy18);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test28391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28391");
        payment.Payment payment4 = new payment.Payment((-1L), (double) '#', "", "hi!");
        boolean boolean5 = payment4.paymentCompleted();
        boolean boolean6 = payment4.paymentCompleted();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        boolean boolean10 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test28392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28392");
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
        payment4.payDeposit();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test28393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28393");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) (short) 0, "", "");
        payment4.payBalance();
        payment4.payDeposit();
        payment4.payBalance();
        payment4.payBalance();
        boolean boolean9 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy11 = null;
        payment4.setPaymentStrategy(paymentStrategy11);
        payment4.verifyPaymentDetails();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test28394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28394");
        payment.Payment payment4 = new payment.Payment((long) (-1), (double) (short) 10, "hi!", "hi!");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment4.payBalance();
        boolean boolean8 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test28395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28395");
        payment.Payment payment4 = new payment.Payment((long) 10, (double) (-1), "", "hi!");
        payment4.payDeposit();
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        payment4.payDeposit();
        boolean boolean11 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test28396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28396");
        payment.Payment payment4 = new payment.Payment((long) '4', (double) 10.0f, "", "");
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        boolean boolean8 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test28397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28397");
        payment.Payment payment4 = new payment.Payment((long) (short) -1, (double) (short) 10, "hi!", "hi!");
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
    }

    @Test
    public void test28398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28398");
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
        payment.PaymentStrategy paymentStrategy21 = null;
        payment4.setPaymentStrategy(paymentStrategy21);
        payment.PaymentStrategy paymentStrategy23 = null;
        payment4.setPaymentStrategy(paymentStrategy23);
        boolean boolean25 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test28399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28399");
        payment.Payment payment4 = new payment.Payment((long) 'a', (double) '#', "hi!", "hi!");
        payment4.payDeposit();
        payment4.payDeposit();
        payment4.payBalance();
        payment4.payBalance();
        payment4.payBalance();
    }

    @Test
    public void test28400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28400");
        payment.Payment payment4 = new payment.Payment((-1L), (double) 'a', "hi!", "");
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment4.payDeposit();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy12 = null;
        payment4.setPaymentStrategy(paymentStrategy12);
        payment4.payDeposit();
        payment4.payBalance();
        payment4.payDeposit();
        payment4.payBalance();
        payment4.payBalance();
        payment4.payBalance();
        payment4.payDeposit();
    }

    @Test
    public void test28401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28401");
        payment.Payment payment4 = new payment.Payment((-1L), (double) 'a', "hi!", "");
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment4.payBalance();
        payment4.payDeposit();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy11 = null;
        payment4.setPaymentStrategy(paymentStrategy11);
        payment.PaymentStrategy paymentStrategy13 = null;
        payment4.setPaymentStrategy(paymentStrategy13);
    }

    @Test
    public void test28402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28402");
        payment.Payment payment4 = new payment.Payment((long) (byte) 100, 0.0d, "", "");
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        payment4.payBalance();
    }

    @Test
    public void test28403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28403");
        payment.Payment payment4 = new payment.Payment((long) (short) -1, (double) (byte) -1, "hi!", "hi!");
        payment4.payBalance();
    }

    @Test
    public void test28404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28404");
        payment.Payment payment4 = new payment.Payment((-1L), (double) 'a', "hi!", "");
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        boolean boolean9 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy10 = null;
        payment4.setPaymentStrategy(paymentStrategy10);
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy13 = null;
        payment4.setPaymentStrategy(paymentStrategy13);
        boolean boolean15 = payment4.paymentCompleted();
        payment4.payDeposit();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test28405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28405");
        payment.Payment payment4 = new payment.Payment((long) '#', (-1.0d), "hi!", "");
        payment4.payDeposit();
    }

    @Test
    public void test28406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28406");
        payment.Payment payment4 = new payment.Payment((long) (short) 10, (double) (-1L), "", "hi!");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment4.payBalance();
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        boolean boolean10 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy11 = null;
        payment4.setPaymentStrategy(paymentStrategy11);
        payment4.payDeposit();
        payment4.payBalance();
        boolean boolean15 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test28407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28407");
        payment.Payment payment4 = new payment.Payment((long) (short) 0, (double) 100.0f, "hi!", "");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        payment4.payBalance();
    }

    @Test
    public void test28408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28408");
        payment.Payment payment4 = new payment.Payment((long) 1, (double) (short) 10, "", "");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        payment.PaymentStrategy paymentStrategy10 = null;
        payment4.setPaymentStrategy(paymentStrategy10);
        payment4.payDeposit();
        payment4.payBalance();
    }

    @Test
    public void test28409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28409");
        payment.Payment payment4 = new payment.Payment((long) (short) 1, (double) 100.0f, "", "hi!");
        payment4.payBalance();
        payment4.payBalance();
        payment4.payDeposit();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy10 = null;
        payment4.setPaymentStrategy(paymentStrategy10);
        payment4.payDeposit();
    }

    @Test
    public void test28410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28410");
        payment.Payment payment4 = new payment.Payment(10L, (double) (short) 0, "hi!", "");
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment4.payDeposit();
    }

    @Test
    public void test28411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28411");
        payment.Payment payment4 = new payment.Payment((long) 100, (double) '4', "hi!", "hi!");
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
    }

    @Test
    public void test28412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28412");
        payment.Payment payment4 = new payment.Payment(100L, (double) (short) -1, "hi!", "");
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        boolean boolean11 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test28413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28413");
        payment.Payment payment4 = new payment.Payment((long) (byte) 100, 0.0d, "hi!", "");
        boolean boolean5 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment4.payDeposit();
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        boolean boolean11 = payment4.paymentCompleted();
        boolean boolean12 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy15 = null;
        payment4.setPaymentStrategy(paymentStrategy15);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test28414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28414");
        payment.Payment payment4 = new payment.Payment((long) (byte) 0, (double) 1, "", "hi!");
    }

    @Test
    public void test28415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28415");
        payment.Payment payment4 = new payment.Payment((long) ' ', (double) 0, "", "hi!");
        boolean boolean5 = payment4.paymentCompleted();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        payment.PaymentStrategy paymentStrategy9 = null;
        payment4.setPaymentStrategy(paymentStrategy9);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test28416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28416");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) (short) 0, "", "");
        payment4.payBalance();
        boolean boolean6 = payment4.paymentCompleted();
        boolean boolean7 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        payment4.payBalance();
        payment4.payDeposit();
        boolean boolean12 = payment4.paymentCompleted();
        boolean boolean13 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test28417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28417");
        payment.Payment payment4 = new payment.Payment((long) 10, (double) (-1), "", "hi!");
        payment4.payDeposit();
        payment4.payDeposit();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy9 = null;
        payment4.setPaymentStrategy(paymentStrategy9);
        payment.PaymentStrategy paymentStrategy11 = null;
        payment4.setPaymentStrategy(paymentStrategy11);
        boolean boolean13 = payment4.paymentCompleted();
        boolean boolean14 = payment4.paymentCompleted();
        boolean boolean15 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy16 = null;
        payment4.setPaymentStrategy(paymentStrategy16);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test28418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28418");
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
        payment4.verifyPaymentDetails();
        boolean boolean16 = payment4.paymentCompleted();
        boolean boolean17 = payment4.paymentCompleted();
        boolean boolean18 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        boolean boolean20 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test28419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28419");
        payment.Payment payment4 = new payment.Payment((long) (short) 10, (double) 0.0f, "hi!", "");
        boolean boolean5 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy11 = null;
        payment4.setPaymentStrategy(paymentStrategy11);
        payment4.verifyPaymentDetails();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test28420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28420");
        payment.Payment payment4 = new payment.Payment((long) 1, (double) (short) 0, "", "hi!");
    }

    @Test
    public void test28421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28421");
        payment.Payment payment4 = new payment.Payment(10L, (double) 10, "", "hi!");
        boolean boolean5 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment4.payDeposit();
        payment4.payDeposit();
        boolean boolean10 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy11 = null;
        payment4.setPaymentStrategy(paymentStrategy11);
        boolean boolean13 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test28422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28422");
        payment.Payment payment4 = new payment.Payment((long) 10, (double) (-1), "", "hi!");
        payment4.payDeposit();
        payment4.payDeposit();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy9 = null;
        payment4.setPaymentStrategy(paymentStrategy9);
        payment.PaymentStrategy paymentStrategy11 = null;
        payment4.setPaymentStrategy(paymentStrategy11);
        boolean boolean13 = payment4.paymentCompleted();
        payment4.payDeposit();
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test28423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28423");
        payment.Payment payment4 = new payment.Payment((long) 1, 0.0d, "hi!", "hi!");
        payment4.verifyPaymentDetails();
        boolean boolean6 = payment4.paymentCompleted();
        java.lang.Class<?> wildcardClass7 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test28424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28424");
        payment.Payment payment4 = new payment.Payment((long) 'a', (double) 0L, "hi!", "hi!");
        payment4.payDeposit();
        boolean boolean6 = payment4.paymentCompleted();
        payment4.payBalance();
        java.lang.Class<?> wildcardClass8 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test28425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28425");
        payment.Payment payment4 = new payment.Payment((-1L), (double) 'a', "hi!", "");
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment4.payDeposit();
        boolean boolean9 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy12 = null;
        payment4.setPaymentStrategy(paymentStrategy12);
        payment4.payBalance();
        payment4.payDeposit();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test28426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28426");
        payment.Payment payment4 = new payment.Payment((long) 100, (double) (-1.0f), "", "");
        payment4.payBalance();
        java.lang.Class<?> wildcardClass6 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test28427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28427");
        payment.Payment payment4 = new payment.Payment((long) (short) -1, (double) (short) 1, "hi!", "hi!");
        payment4.verifyPaymentDetails();
        boolean boolean6 = payment4.paymentCompleted();
        payment4.payBalance();
        boolean boolean8 = payment4.paymentCompleted();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy10 = null;
        payment4.setPaymentStrategy(paymentStrategy10);
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy13 = null;
        payment4.setPaymentStrategy(paymentStrategy13);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test28428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28428");
        payment.Payment payment4 = new payment.Payment((long) (short) -1, (double) (short) 1, "hi!", "hi!");
        payment4.verifyPaymentDetails();
        boolean boolean6 = payment4.paymentCompleted();
        payment4.payBalance();
        payment4.payDeposit();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy10 = null;
        payment4.setPaymentStrategy(paymentStrategy10);
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy13 = null;
        payment4.setPaymentStrategy(paymentStrategy13);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test28429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28429");
        payment.Payment payment4 = new payment.Payment(0L, (double) (short) 100, "", "");
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy10 = null;
        payment4.setPaymentStrategy(paymentStrategy10);
        payment4.payDeposit();
    }

    @Test
    public void test28430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28430");
        payment.Payment payment4 = new payment.Payment(0L, (-1.0d), "hi!", "hi!");
        payment4.payBalance();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
    }

    @Test
    public void test28431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28431");
        payment.Payment payment4 = new payment.Payment((long) 10, (double) (-1), "", "hi!");
        payment4.payDeposit();
        payment4.payDeposit();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        boolean boolean10 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test28432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28432");
        payment.Payment payment4 = new payment.Payment(0L, (double) 10.0f, "hi!", "");
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment4.payDeposit();
        payment4.payBalance();
    }

    @Test
    public void test28433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28433");
        payment.Payment payment4 = new payment.Payment((long) 10, 1.0d, "", "");
        boolean boolean5 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment4.payDeposit();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test28434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28434");
        payment.Payment payment4 = new payment.Payment(0L, (double) (byte) 0, "", "");
        boolean boolean5 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment4.verifyPaymentDetails();
        boolean boolean9 = payment4.paymentCompleted();
        payment4.payDeposit();
        boolean boolean11 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test28435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28435");
        payment.Payment payment4 = new payment.Payment((long) (short) -1, 0.0d, "hi!", "hi!");
        boolean boolean5 = payment4.paymentCompleted();
        boolean boolean6 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        boolean boolean13 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test28436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28436");
        payment.Payment payment4 = new payment.Payment((long) (byte) -1, (double) (short) -1, "", "");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        payment.PaymentStrategy paymentStrategy9 = null;
        payment4.setPaymentStrategy(paymentStrategy9);
        boolean boolean11 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        boolean boolean13 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy14 = null;
        payment4.setPaymentStrategy(paymentStrategy14);
        java.lang.Class<?> wildcardClass16 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test28437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28437");
        payment.Payment payment4 = new payment.Payment((long) (short) 0, (double) 1.0f, "", "");
        payment4.payBalance();
        payment4.payDeposit();
    }

    @Test
    public void test28438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28438");
        payment.Payment payment4 = new payment.Payment((long) (short) 0, (double) (byte) 1, "", "hi!");
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment4.payDeposit();
        java.lang.Class<?> wildcardClass9 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test28439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28439");
        payment.Payment payment4 = new payment.Payment((long) (short) 100, (-1.0d), "", "hi!");
        boolean boolean5 = payment4.paymentCompleted();
        payment4.payDeposit();
        boolean boolean7 = payment4.paymentCompleted();
        payment4.payBalance();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test28440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28440");
        payment.Payment payment4 = new payment.Payment(1L, 10.0d, "", "");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        boolean boolean7 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test28441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28441");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) (byte) 10, "", "");
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        boolean boolean10 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test28442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28442");
        payment.Payment payment4 = new payment.Payment((-1L), (double) (byte) 0, "hi!", "");
        payment4.payBalance();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        payment.PaymentStrategy paymentStrategy9 = null;
        payment4.setPaymentStrategy(paymentStrategy9);
        boolean boolean11 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        boolean boolean13 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment4.payDeposit();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test28443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28443");
        payment.Payment payment4 = new payment.Payment((long) (short) -1, (double) (short) 1, "hi!", "hi!");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment4.payDeposit();
        boolean boolean8 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        boolean boolean10 = payment4.paymentCompleted();
        boolean boolean11 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test28444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28444");
        payment.Payment payment4 = new payment.Payment((long) 1, (double) (byte) 0, "hi!", "");
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment4.verifyPaymentDetails();
        boolean boolean9 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test28445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28445");
        payment.Payment payment4 = new payment.Payment((long) (byte) -1, 1.0d, "hi!", "");
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        payment.PaymentStrategy paymentStrategy10 = null;
        payment4.setPaymentStrategy(paymentStrategy10);
        payment.PaymentStrategy paymentStrategy12 = null;
        payment4.setPaymentStrategy(paymentStrategy12);
        payment.PaymentStrategy paymentStrategy14 = null;
        payment4.setPaymentStrategy(paymentStrategy14);
        payment.PaymentStrategy paymentStrategy16 = null;
        payment4.setPaymentStrategy(paymentStrategy16);
        payment.PaymentStrategy paymentStrategy18 = null;
        payment4.setPaymentStrategy(paymentStrategy18);
        boolean boolean20 = payment4.paymentCompleted();
        boolean boolean21 = payment4.paymentCompleted();
        payment4.payDeposit();
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test28446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28446");
        payment.Payment payment4 = new payment.Payment((long) (byte) 10, (double) (short) -1, "hi!", "hi!");
        payment4.payDeposit();
        payment4.payBalance();
        payment4.payBalance();
        payment4.payDeposit();
        boolean boolean9 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test28447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28447");
        payment.Payment payment4 = new payment.Payment((long) (short) 0, (double) (-1L), "", "hi!");
        boolean boolean5 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        boolean boolean7 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test28448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28448");
        payment.Payment payment4 = new payment.Payment((long) '#', (double) (short) 0, "hi!", "");
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
    }

    @Test
    public void test28449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28449");
        payment.Payment payment4 = new payment.Payment((long) (short) 100, (double) (short) 100, "", "");
        payment4.payBalance();
        payment4.payBalance();
        boolean boolean7 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test28450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28450");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) (byte) 10, "", "");
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        payment4.payDeposit();
        payment4.payDeposit();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy11 = null;
        payment4.setPaymentStrategy(paymentStrategy11);
        payment4.payBalance();
    }

    @Test
    public void test28451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28451");
        payment.Payment payment4 = new payment.Payment((long) '4', (-1.0d), "", "");
        payment4.payBalance();
        boolean boolean6 = payment4.paymentCompleted();
        payment4.payBalance();
        java.lang.Class<?> wildcardClass8 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test28452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28452");
        payment.Payment payment4 = new payment.Payment((long) (short) -1, (double) (byte) -1, "", "hi!");
        payment4.verifyPaymentDetails();
    }

    @Test
    public void test28453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28453");
        payment.Payment payment4 = new payment.Payment(100L, (double) (-1), "hi!", "hi!");
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        boolean boolean8 = payment4.paymentCompleted();
        payment4.payBalance();
        payment4.payDeposit();
        payment4.payDeposit();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test28454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28454");
        payment.Payment payment4 = new payment.Payment((long) 'a', (double) '#', "hi!", "hi!");
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy9 = null;
        payment4.setPaymentStrategy(paymentStrategy9);
        payment4.payBalance();
        payment4.payDeposit();
        payment4.payBalance();
    }

    @Test
    public void test28455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28455");
        payment.Payment payment4 = new payment.Payment((long) 1, (double) 0.0f, "", "hi!");
        payment4.verifyPaymentDetails();
        boolean boolean6 = payment4.paymentCompleted();
        boolean boolean7 = payment4.paymentCompleted();
        payment4.payBalance();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test28456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28456");
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
        payment.PaymentStrategy paymentStrategy16 = null;
        payment4.setPaymentStrategy(paymentStrategy16);
        payment4.payBalance();
        java.lang.Class<?> wildcardClass19 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test28457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28457");
        payment.Payment payment4 = new payment.Payment((long) (short) -1, (double) (short) 1, "hi!", "hi!");
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment4.payDeposit();
        boolean boolean9 = payment4.paymentCompleted();
        boolean boolean10 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test28458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28458");
        payment.Payment payment4 = new payment.Payment((long) (byte) 10, (double) ' ', "", "");
        payment4.payBalance();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        boolean boolean10 = payment4.paymentCompleted();
        boolean boolean11 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test28459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28459");
        payment.Payment payment4 = new payment.Payment((long) (short) 0, (double) 'a', "", "hi!");
        boolean boolean5 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment4.payBalance();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test28460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28460");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) (byte) 10, "", "");
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        payment4.payDeposit();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy10 = null;
        payment4.setPaymentStrategy(paymentStrategy10);
        boolean boolean12 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy15 = null;
        payment4.setPaymentStrategy(paymentStrategy15);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test28461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28461");
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
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy18 = null;
        payment4.setPaymentStrategy(paymentStrategy18);
        boolean boolean20 = payment4.paymentCompleted();
        boolean boolean21 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test28462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28462");
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
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test28463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28463");
        payment.Payment payment4 = new payment.Payment((long) (byte) 100, (double) 100L, "", "");
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy9 = null;
        payment4.setPaymentStrategy(paymentStrategy9);
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        boolean boolean13 = payment4.paymentCompleted();
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy16 = null;
        payment4.setPaymentStrategy(paymentStrategy16);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test28464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28464");
        payment.Payment payment4 = new payment.Payment((-1L), (double) 'a', "hi!", "");
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        boolean boolean8 = payment4.paymentCompleted();
        boolean boolean9 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy10 = null;
        payment4.setPaymentStrategy(paymentStrategy10);
        payment.PaymentStrategy paymentStrategy12 = null;
        payment4.setPaymentStrategy(paymentStrategy12);
        payment.PaymentStrategy paymentStrategy14 = null;
        payment4.setPaymentStrategy(paymentStrategy14);
        boolean boolean16 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy17 = null;
        payment4.setPaymentStrategy(paymentStrategy17);
        boolean boolean19 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test28465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28465");
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
        payment4.payDeposit();
        java.lang.Class<?> wildcardClass15 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test28466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28466");
        payment.Payment payment4 = new payment.Payment((long) (-1), (double) (short) -1, "hi!", "");
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy10 = null;
        payment4.setPaymentStrategy(paymentStrategy10);
        boolean boolean12 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test28467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28467");
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
        payment.PaymentStrategy paymentStrategy15 = null;
        payment4.setPaymentStrategy(paymentStrategy15);
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        payment4.payBalance();
    }

    @Test
    public void test28468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28468");
        payment.Payment payment4 = new payment.Payment((-1L), (double) 'a', "hi!", "");
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment4.payDeposit();
        boolean boolean13 = payment4.paymentCompleted();
        boolean boolean14 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        payment4.payBalance();
        payment4.payDeposit();
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test28469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28469");
        payment.Payment payment4 = new payment.Payment(1L, (double) 1.0f, "", "hi!");
        boolean boolean5 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test28470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28470");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) '#', "hi!", "hi!");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment4.payBalance();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        boolean boolean10 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test28471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28471");
        payment.Payment payment4 = new payment.Payment((-1L), (double) 1L, "hi!", "");
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment4.payBalance();
        boolean boolean9 = payment4.paymentCompleted();
        payment4.payDeposit();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test28472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28472");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) (byte) 10, "", "");
        payment4.payDeposit();
        boolean boolean6 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        payment4.payBalance();
        boolean boolean11 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy12 = null;
        payment4.setPaymentStrategy(paymentStrategy12);
        payment.PaymentStrategy paymentStrategy14 = null;
        payment4.setPaymentStrategy(paymentStrategy14);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test28473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28473");
        payment.Payment payment4 = new payment.Payment((long) (short) 1, (double) (short) 10, "hi!", "hi!");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment4.payBalance();
    }

    @Test
    public void test28474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28474");
        payment.Payment payment4 = new payment.Payment((long) '#', (double) 10.0f, "", "hi!");
        payment4.payBalance();
        payment4.payBalance();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
    }

    @Test
    public void test28475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28475");
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
        payment.PaymentStrategy paymentStrategy17 = null;
        payment4.setPaymentStrategy(paymentStrategy17);
        payment4.payDeposit();
        boolean boolean20 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy21 = null;
        payment4.setPaymentStrategy(paymentStrategy21);
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test28476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28476");
        payment.Payment payment4 = new payment.Payment((long) (-1), (double) 1L, "", "");
        payment4.payDeposit();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        payment4.verifyPaymentDetails();
    }

    @Test
    public void test28477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28477");
        payment.Payment payment4 = new payment.Payment((long) '4', (double) (-1L), "", "hi!");
        boolean boolean5 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        java.lang.Class<?> wildcardClass8 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test28478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28478");
        payment.Payment payment4 = new payment.Payment((long) (-1), (double) 0.0f, "", "");
        payment4.payDeposit();
        boolean boolean6 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test28479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28479");
        payment.Payment payment4 = new payment.Payment((long) ' ', (double) 1L, "hi!", "");
        boolean boolean5 = payment4.paymentCompleted();
        payment4.payBalance();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test28480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28480");
        payment.Payment payment4 = new payment.Payment(10L, (double) 100L, "", "hi!");
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment4.verifyPaymentDetails();
    }

    @Test
    public void test28481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28481");
        payment.Payment payment4 = new payment.Payment((long) 'a', 0.0d, "", "");
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        boolean boolean8 = payment4.paymentCompleted();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy10 = null;
        payment4.setPaymentStrategy(paymentStrategy10);
        payment4.payDeposit();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy14 = null;
        payment4.setPaymentStrategy(paymentStrategy14);
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        boolean boolean18 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test28482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28482");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) (byte) 10, "", "");
        payment4.payBalance();
        boolean boolean6 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy11 = null;
        payment4.setPaymentStrategy(paymentStrategy11);
        boolean boolean13 = payment4.paymentCompleted();
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        boolean boolean17 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test28483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28483");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) (byte) 10, "", "");
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        boolean boolean10 = payment4.paymentCompleted();
        payment4.payBalance();
        payment4.payBalance();
        payment4.payBalance();
        payment4.payDeposit();
        java.lang.Class<?> wildcardClass15 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test28484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28484");
        payment.Payment payment4 = new payment.Payment(0L, (double) 1L, "", "");
        boolean boolean5 = payment4.paymentCompleted();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        boolean boolean9 = payment4.paymentCompleted();
        payment4.payDeposit();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test28485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28485");
        payment.Payment payment4 = new payment.Payment((long) (byte) 1, 1.0d, "", "hi!");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        boolean boolean7 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy9 = null;
        payment4.setPaymentStrategy(paymentStrategy9);
        payment.PaymentStrategy paymentStrategy11 = null;
        payment4.setPaymentStrategy(paymentStrategy11);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test28486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28486");
        payment.Payment payment4 = new payment.Payment((long) (-1), (double) (short) -1, "hi!", "");
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy13 = null;
        payment4.setPaymentStrategy(paymentStrategy13);
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
    }

    @Test
    public void test28487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28487");
        payment.Payment payment4 = new payment.Payment((long) (byte) 10, (double) 10L, "", "hi!");
        payment4.verifyPaymentDetails();
        boolean boolean6 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test28488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28488");
        payment.Payment payment4 = new payment.Payment(0L, (double) 10.0f, "hi!", "hi!");
        boolean boolean5 = payment4.paymentCompleted();
        boolean boolean6 = payment4.paymentCompleted();
        payment4.payDeposit();
        boolean boolean8 = payment4.paymentCompleted();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy10 = null;
        payment4.setPaymentStrategy(paymentStrategy10);
        payment4.payBalance();
        payment4.payDeposit();
        payment4.payBalance();
        payment4.payBalance();
        java.lang.Class<?> wildcardClass16 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test28489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28489");
        payment.Payment payment4 = new payment.Payment((long) (-1), (double) '4', "", "hi!");
        payment4.payBalance();
    }

    @Test
    public void test28490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28490");
        payment.Payment payment4 = new payment.Payment((long) ' ', (double) (short) -1, "hi!", "");
        boolean boolean5 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test28491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28491");
        payment.Payment payment4 = new payment.Payment((long) (short) 100, (double) ' ', "hi!", "");
        boolean boolean5 = payment4.paymentCompleted();
        java.lang.Class<?> wildcardClass6 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test28492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28492");
        payment.Payment payment4 = new payment.Payment((long) 'a', 100.0d, "", "");
        payment4.payDeposit();
        boolean boolean6 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test28493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28493");
        payment.Payment payment4 = new payment.Payment((long) (byte) 1, 0.0d, "", "hi!");
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment4.payDeposit();
        java.lang.Class<?> wildcardClass9 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test28494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28494");
        payment.Payment payment4 = new payment.Payment((long) '#', (double) 1.0f, "hi!", "hi!");
        payment4.verifyPaymentDetails();
        boolean boolean6 = payment4.paymentCompleted();
        payment4.payBalance();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test28495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28495");
        payment.Payment payment4 = new payment.Payment((long) 'a', 100.0d, "", "hi!");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        boolean boolean9 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy10 = null;
        payment4.setPaymentStrategy(paymentStrategy10);
        payment4.payDeposit();
        payment4.payDeposit();
        boolean boolean14 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy15 = null;
        payment4.setPaymentStrategy(paymentStrategy15);
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test28496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28496");
        payment.Payment payment4 = new payment.Payment((-1L), (double) '#', "", "hi!");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        boolean boolean7 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        payment.PaymentStrategy paymentStrategy10 = null;
        payment4.setPaymentStrategy(paymentStrategy10);
        payment4.payDeposit();
        payment4.payDeposit();
        payment4.payBalance();
        payment4.payDeposit();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test28497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28497");
        payment.Payment payment4 = new payment.Payment((long) ' ', (double) 100, "hi!", "");
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
    }

    @Test
    public void test28498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28498");
        payment.Payment payment4 = new payment.Payment((long) 'a', 100.0d, "", "hi!");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment4.payBalance();
        payment4.payDeposit();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy10 = null;
        payment4.setPaymentStrategy(paymentStrategy10);
        payment4.verifyPaymentDetails();
        boolean boolean13 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy14 = null;
        payment4.setPaymentStrategy(paymentStrategy14);
        payment4.payBalance();
        payment4.payDeposit();
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test28499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28499");
        payment.Payment payment4 = new payment.Payment((long) (short) -1, (double) '4', "hi!", "");
        payment4.verifyPaymentDetails();
        payment4.payBalance();
    }

    @Test
    public void test28500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest56.test28500");
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
        payment.PaymentStrategy paymentStrategy16 = null;
        payment4.setPaymentStrategy(paymentStrategy16);
        payment.PaymentStrategy paymentStrategy18 = null;
        payment4.setPaymentStrategy(paymentStrategy18);
        payment4.payBalance();
        payment4.payDeposit();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }
}

