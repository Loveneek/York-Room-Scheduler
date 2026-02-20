import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest28 {

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
    public void test14001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14001");
        payment.Payment payment4 = new payment.Payment((long) (short) 0, (double) 0L, "hi!", "");
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
    }

    @Test
    public void test14002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14002");
        payment.Payment payment4 = new payment.Payment((long) 10, 10.0d, "hi!", "hi!");
        payment4.payDeposit();
        boolean boolean6 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test14003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14003");
        payment.Payment payment4 = new payment.Payment(100L, (double) (short) -1, "hi!", "");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment4.payDeposit();
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        payment4.payBalance();
        java.lang.Class<?> wildcardClass12 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test14004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14004");
        payment.Payment payment4 = new payment.Payment((long) (byte) 1, (double) 1, "", "hi!");
        payment4.payBalance();
        java.lang.Class<?> wildcardClass6 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test14005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14005");
        payment.Payment payment4 = new payment.Payment((long) ' ', (double) 10.0f, "hi!", "hi!");
        java.lang.Class<?> wildcardClass5 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test14006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14006");
        payment.Payment payment4 = new payment.Payment((long) '4', (double) 1, "hi!", "hi!");
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
    }

    @Test
    public void test14007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14007");
        payment.Payment payment4 = new payment.Payment((-1L), (double) 'a', "hi!", "");
        payment4.verifyPaymentDetails();
        boolean boolean6 = payment4.paymentCompleted();
        payment4.payDeposit();
        boolean boolean8 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy9 = null;
        payment4.setPaymentStrategy(paymentStrategy9);
        payment.PaymentStrategy paymentStrategy11 = null;
        payment4.setPaymentStrategy(paymentStrategy11);
        boolean boolean13 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test14008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14008");
        payment.Payment payment4 = new payment.Payment(100L, 0.0d, "hi!", "");
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment4.payBalance();
    }

    @Test
    public void test14009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14009");
        payment.Payment payment4 = new payment.Payment(0L, (double) (byte) 0, "", "");
        boolean boolean5 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment4.payDeposit();
        java.lang.Class<?> wildcardClass8 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test14010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14010");
        payment.Payment payment4 = new payment.Payment((long) '4', (double) (short) -1, "", "hi!");
        payment4.payBalance();
        payment4.payDeposit();
        boolean boolean7 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test14011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14011");
        payment.Payment payment4 = new payment.Payment((long) (byte) 100, 0.0d, "", "");
        boolean boolean5 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        java.lang.Class<?> wildcardClass9 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test14012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14012");
        payment.Payment payment4 = new payment.Payment(1L, (double) 1L, "", "hi!");
        payment4.verifyPaymentDetails();
        java.lang.Class<?> wildcardClass6 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test14013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14013");
        payment.Payment payment4 = new payment.Payment((long) (byte) -1, (double) 1L, "hi!", "");
        boolean boolean5 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment4.payDeposit();
        java.lang.Class<?> wildcardClass8 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test14014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14014");
        payment.Payment payment4 = new payment.Payment((long) ' ', (double) 'a', "hi!", "hi!");
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
    }

    @Test
    public void test14015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14015");
        payment.Payment payment4 = new payment.Payment((-1L), (double) 10, "", "hi!");
        boolean boolean5 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test14016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14016");
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
        payment4.payDeposit();
        payment4.payBalance();
        boolean boolean16 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        boolean boolean19 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test14017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14017");
        payment.Payment payment4 = new payment.Payment((long) (-1), (double) (short) -1, "hi!", "");
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        payment.PaymentStrategy paymentStrategy9 = null;
        payment4.setPaymentStrategy(paymentStrategy9);
    }

    @Test
    public void test14018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14018");
        payment.Payment payment4 = new payment.Payment((long) (byte) 10, (double) 1, "", "hi!");
        payment4.verifyPaymentDetails();
        java.lang.Class<?> wildcardClass6 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test14019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14019");
        payment.Payment payment4 = new payment.Payment((long) 1, (double) ' ', "hi!", "");
        payment4.payDeposit();
    }

    @Test
    public void test14020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14020");
        payment.Payment payment4 = new payment.Payment((long) '#', (double) 0L, "", "");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        boolean boolean9 = payment4.paymentCompleted();
        payment4.payBalance();
        payment4.payDeposit();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test14021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14021");
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
        payment4.payBalance();
        boolean boolean15 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment4.payDeposit();
        payment4.payBalance();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test14022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14022");
        payment.Payment payment4 = new payment.Payment((long) '#', (double) 0L, "", "");
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        boolean boolean7 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        boolean boolean10 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy11 = null;
        payment4.setPaymentStrategy(paymentStrategy11);
        boolean boolean13 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test14023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14023");
        payment.Payment payment4 = new payment.Payment(0L, (double) 10.0f, "hi!", "hi!");
        boolean boolean5 = payment4.paymentCompleted();
        boolean boolean6 = payment4.paymentCompleted();
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment4.payBalance();
        payment4.payDeposit();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test14024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14024");
        payment.Payment payment4 = new payment.Payment((long) (short) 1, (double) (-1L), "", "hi!");
        boolean boolean5 = payment4.paymentCompleted();
        boolean boolean6 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test14025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14025");
        payment.Payment payment4 = new payment.Payment(100L, (double) (-1), "hi!", "hi!");
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
    }

    @Test
    public void test14026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14026");
        payment.Payment payment4 = new payment.Payment((long) (short) 100, 10.0d, "", "hi!");
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
    }

    @Test
    public void test14027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14027");
        payment.Payment payment4 = new payment.Payment(0L, (double) 1, "", "hi!");
        boolean boolean5 = payment4.paymentCompleted();
        payment4.payBalance();
        payment4.payBalance();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test14028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14028");
        payment.Payment payment4 = new payment.Payment((long) 1, (double) '4', "", "");
        boolean boolean5 = payment4.paymentCompleted();
        boolean boolean6 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment4.payBalance();
        boolean boolean9 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test14029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14029");
        payment.Payment payment4 = new payment.Payment((long) 10, (double) 'a', "", "");
        payment4.payBalance();
        payment4.payDeposit();
        payment4.payBalance();
        payment4.payBalance();
    }

    @Test
    public void test14030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14030");
        payment.Payment payment4 = new payment.Payment((long) (short) -1, (double) 10, "", "");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
    }

    @Test
    public void test14031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14031");
        payment.Payment payment4 = new payment.Payment(10L, (double) (byte) 100, "", "");
        boolean boolean5 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        payment4.payBalance();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test14032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14032");
        payment.Payment payment4 = new payment.Payment((long) '4', (double) 10, "", "hi!");
        boolean boolean5 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test14033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14033");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) (byte) 10, "", "");
        payment4.payDeposit();
        boolean boolean6 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        boolean boolean10 = payment4.paymentCompleted();
        boolean boolean11 = payment4.paymentCompleted();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy13 = null;
        payment4.setPaymentStrategy(paymentStrategy13);
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        java.lang.Class<?> wildcardClass18 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test14034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14034");
        payment.Payment payment4 = new payment.Payment((long) 10, (double) (-1), "", "hi!");
        payment4.payDeposit();
        payment4.payDeposit();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
    }

    @Test
    public void test14035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14035");
        payment.Payment payment4 = new payment.Payment((long) (short) 100, (double) (byte) 1, "", "hi!");
        payment4.payDeposit();
        payment4.payBalance();
        boolean boolean7 = payment4.paymentCompleted();
        java.lang.Class<?> wildcardClass8 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test14036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14036");
        payment.Payment payment4 = new payment.Payment((long) (byte) 10, (double) 10, "hi!", "");
        boolean boolean5 = payment4.paymentCompleted();
        java.lang.Class<?> wildcardClass6 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test14037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14037");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) 1.0f, "hi!", "hi!");
        payment4.payBalance();
    }

    @Test
    public void test14038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14038");
        payment.Payment payment4 = new payment.Payment((long) (byte) -1, (double) 10L, "hi!", "");
        payment4.payDeposit();
        payment4.payBalance();
        boolean boolean7 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        payment4.payDeposit();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test14039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14039");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) (byte) 10, "", "");
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        payment.PaymentStrategy paymentStrategy10 = null;
        payment4.setPaymentStrategy(paymentStrategy10);
        payment4.verifyPaymentDetails();
        boolean boolean13 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        java.lang.Class<?> wildcardClass16 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test14040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14040");
        payment.Payment payment4 = new payment.Payment((long) (byte) 1, (double) 1, "", "hi!");
        payment4.payBalance();
        boolean boolean6 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test14041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14041");
        payment.Payment payment4 = new payment.Payment((long) (byte) -1, (double) (byte) 10, "", "hi!");
        boolean boolean5 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        boolean boolean8 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test14042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14042");
        payment.Payment payment4 = new payment.Payment((long) (short) -1, 1.0d, "", "hi!");
        boolean boolean5 = payment4.paymentCompleted();
        payment4.payDeposit();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test14043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14043");
        payment.Payment payment4 = new payment.Payment((-1L), (double) (byte) 0, "hi!", "");
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        payment4.payBalance();
        payment4.payBalance();
        boolean boolean12 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment4.payBalance();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test14044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14044");
        payment.Payment payment4 = new payment.Payment((-1L), (double) '#', "", "hi!");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        boolean boolean9 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy10 = null;
        payment4.setPaymentStrategy(paymentStrategy10);
        payment4.verifyPaymentDetails();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test14045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14045");
        payment.Payment payment4 = new payment.Payment(1L, 0.0d, "", "hi!");
        boolean boolean5 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        payment4.verifyPaymentDetails();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test14046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14046");
        payment.Payment payment4 = new payment.Payment((long) '#', (double) 10.0f, "hi!", "");
        payment4.verifyPaymentDetails();
    }

    @Test
    public void test14047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14047");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) (byte) 10, "", "");
        payment4.payBalance();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        payment4.payBalance();
        boolean boolean10 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy11 = null;
        payment4.setPaymentStrategy(paymentStrategy11);
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy18 = null;
        payment4.setPaymentStrategy(paymentStrategy18);
        boolean boolean20 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy21 = null;
        payment4.setPaymentStrategy(paymentStrategy21);
        payment.PaymentStrategy paymentStrategy23 = null;
        payment4.setPaymentStrategy(paymentStrategy23);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test14048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14048");
        payment.Payment payment4 = new payment.Payment((long) (byte) -1, (double) '4', "hi!", "hi!");
        payment4.payBalance();
    }

    @Test
    public void test14049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14049");
        payment.Payment payment4 = new payment.Payment((long) 1, 0.0d, "hi!", "hi!");
        payment4.payBalance();
        boolean boolean6 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy9 = null;
        payment4.setPaymentStrategy(paymentStrategy9);
        payment4.payBalance();
        boolean boolean12 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test14050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14050");
        payment.Payment payment4 = new payment.Payment(0L, (double) (-1L), "hi!", "hi!");
        boolean boolean5 = payment4.paymentCompleted();
        payment4.payDeposit();
        boolean boolean7 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        boolean boolean10 = payment4.paymentCompleted();
        java.lang.Class<?> wildcardClass11 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test14051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14051");
        payment.Payment payment4 = new payment.Payment((long) 'a', (double) 0L, "", "hi!");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        boolean boolean10 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy11 = null;
        payment4.setPaymentStrategy(paymentStrategy11);
        payment4.verifyPaymentDetails();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test14052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14052");
        payment.Payment payment4 = new payment.Payment((long) (short) 10, (double) 0L, "", "");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        payment.PaymentStrategy paymentStrategy9 = null;
        payment4.setPaymentStrategy(paymentStrategy9);
        boolean boolean11 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy12 = null;
        payment4.setPaymentStrategy(paymentStrategy12);
        payment4.payDeposit();
        java.lang.Class<?> wildcardClass15 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test14053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14053");
        payment.Payment payment4 = new payment.Payment((long) 100, (-1.0d), "hi!", "hi!");
        payment4.payBalance();
        boolean boolean6 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test14054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14054");
        payment.Payment payment4 = new payment.Payment((long) (byte) 100, (double) '#', "hi!", "hi!");
    }

    @Test
    public void test14055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14055");
        payment.Payment payment4 = new payment.Payment((long) (byte) 0, 0.0d, "hi!", "hi!");
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        boolean boolean7 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test14056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14056");
        payment.Payment payment4 = new payment.Payment((long) 'a', 100.0d, "hi!", "hi!");
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
    }

    @Test
    public void test14057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14057");
        payment.Payment payment4 = new payment.Payment((long) (byte) 1, 0.0d, "hi!", "");
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy10 = null;
        payment4.setPaymentStrategy(paymentStrategy10);
        payment4.verifyPaymentDetails();
        boolean boolean13 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test14058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14058");
        payment.Payment payment4 = new payment.Payment((long) 'a', (double) 0L, "hi!", "hi!");
        payment4.payDeposit();
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
    }

    @Test
    public void test14059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14059");
        payment.Payment payment4 = new payment.Payment((long) (byte) 100, (double) 0, "", "");
        payment4.verifyPaymentDetails();
    }

    @Test
    public void test14060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14060");
        payment.Payment payment4 = new payment.Payment(1L, (-1.0d), "", "");
        payment4.payBalance();
        payment4.verifyPaymentDetails();
    }

    @Test
    public void test14061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14061");
        payment.Payment payment4 = new payment.Payment(1L, (double) '#', "", "");
        java.lang.Class<?> wildcardClass5 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test14062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14062");
        payment.Payment payment4 = new payment.Payment(0L, (double) (-1L), "hi!", "hi!");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment4.payBalance();
    }

    @Test
    public void test14063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14063");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) (short) 10, "hi!", "");
        payment4.payDeposit();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy10 = null;
        payment4.setPaymentStrategy(paymentStrategy10);
        payment4.verifyPaymentDetails();
    }

    @Test
    public void test14064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14064");
        payment.Payment payment4 = new payment.Payment((long) (byte) 1, 0.0d, "", "hi!");
        payment4.payBalance();
        payment4.payBalance();
        payment4.payDeposit();
        payment4.payBalance();
        payment4.payBalance();
    }

    @Test
    public void test14065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14065");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) (byte) 10, "", "");
        payment4.payBalance();
        boolean boolean6 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        payment4.payBalance();
        payment4.payDeposit();
        payment4.payDeposit();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test14066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14066");
        payment.Payment payment4 = new payment.Payment((long) (-1), (double) (short) -1, "hi!", "");
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        boolean boolean12 = payment4.paymentCompleted();
        boolean boolean13 = payment4.paymentCompleted();
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test14067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14067");
        payment.Payment payment4 = new payment.Payment((long) 10, (double) (byte) 1, "hi!", "hi!");
        payment4.payBalance();
        boolean boolean6 = payment4.paymentCompleted();
        java.lang.Class<?> wildcardClass7 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test14068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14068");
        payment.Payment payment4 = new payment.Payment((long) (short) 100, (double) (short) 1, "", "");
        boolean boolean5 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test14069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14069");
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
        payment4.payBalance();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test14070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14070");
        payment.Payment payment4 = new payment.Payment((long) (byte) -1, (double) 100L, "hi!", "hi!");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment4.verifyPaymentDetails();
    }

    @Test
    public void test14071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14071");
        payment.Payment payment4 = new payment.Payment((long) (byte) 100, (double) ' ', "", "hi!");
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        payment4.payBalance();
    }

    @Test
    public void test14072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14072");
        payment.Payment payment4 = new payment.Payment((long) (short) 100, 10.0d, "", "hi!");
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment4.payBalance();
        payment4.payDeposit();
        payment4.payBalance();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy16 = null;
        payment4.setPaymentStrategy(paymentStrategy16);
        boolean boolean18 = payment4.paymentCompleted();
        java.lang.Class<?> wildcardClass19 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test14073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14073");
        payment.Payment payment4 = new payment.Payment(0L, (double) (byte) 0, "", "");
        boolean boolean5 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        boolean boolean11 = payment4.paymentCompleted();
        boolean boolean12 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy13 = null;
        payment4.setPaymentStrategy(paymentStrategy13);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test14074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14074");
        payment.Payment payment4 = new payment.Payment((long) (byte) 1, 1.0d, "", "hi!");
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        boolean boolean9 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy10 = null;
        payment4.setPaymentStrategy(paymentStrategy10);
        payment4.verifyPaymentDetails();
        boolean boolean13 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy14 = null;
        payment4.setPaymentStrategy(paymentStrategy14);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test14075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14075");
        payment.Payment payment4 = new payment.Payment(100L, (double) 0, "", "");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment4.payDeposit();
        payment4.payDeposit();
    }

    @Test
    public void test14076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14076");
        payment.Payment payment4 = new payment.Payment(0L, (double) 100L, "", "hi!");
        payment4.verifyPaymentDetails();
        java.lang.Class<?> wildcardClass6 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test14077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14077");
        payment.Payment payment4 = new payment.Payment((long) (short) -1, (double) ' ', "", "hi!");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment4.payBalance();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy9 = null;
        payment4.setPaymentStrategy(paymentStrategy9);
        boolean boolean11 = payment4.paymentCompleted();
        payment4.payDeposit();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test14078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14078");
        payment.Payment payment4 = new payment.Payment((long) (short) -1, (double) ' ', "", "hi!");
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        payment4.payBalance();
        boolean boolean10 = payment4.paymentCompleted();
        payment4.payBalance();
        java.lang.Class<?> wildcardClass12 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test14079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14079");
        payment.Payment payment4 = new payment.Payment(1L, (double) (-1), "", "hi!");
        payment4.payBalance();
        payment4.payBalance();
        java.lang.Class<?> wildcardClass7 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test14080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14080");
        payment.Payment payment4 = new payment.Payment(1L, (double) (-1L), "hi!", "hi!");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        payment4.verifyPaymentDetails();
    }

    @Test
    public void test14081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14081");
        payment.Payment payment4 = new payment.Payment((long) (byte) 0, (double) ' ', "", "");
        payment4.verifyPaymentDetails();
        boolean boolean6 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        payment4.verifyPaymentDetails();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test14082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14082");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) (byte) 10, "", "");
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        payment.PaymentStrategy paymentStrategy10 = null;
        payment4.setPaymentStrategy(paymentStrategy10);
        boolean boolean12 = payment4.paymentCompleted();
        boolean boolean13 = payment4.paymentCompleted();
        payment4.payDeposit();
        boolean boolean15 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy16 = null;
        payment4.setPaymentStrategy(paymentStrategy16);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test14083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14083");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) (short) 0, "", "");
        payment4.payBalance();
        boolean boolean6 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test14084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14084");
        payment.Payment payment4 = new payment.Payment((long) 10, (double) 0.0f, "hi!", "hi!");
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment4.payDeposit();
    }

    @Test
    public void test14085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14085");
        payment.Payment payment4 = new payment.Payment((long) (short) 100, (double) (short) 100, "hi!", "hi!");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        boolean boolean7 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment4.payDeposit();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test14086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14086");
        payment.Payment payment4 = new payment.Payment((long) 10, (double) (short) -1, "", "hi!");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment4.payBalance();
        payment4.payDeposit();
    }

    @Test
    public void test14087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14087");
        payment.Payment payment4 = new payment.Payment((-1L), (double) 0L, "hi!", "");
        java.lang.Class<?> wildcardClass5 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test14088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14088");
        payment.Payment payment4 = new payment.Payment(100L, (double) (short) 1, "", "hi!");
        payment4.payBalance();
        payment4.payDeposit();
    }

    @Test
    public void test14089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14089");
        payment.Payment payment4 = new payment.Payment((long) ' ', (double) (short) 100, "", "");
        payment4.payBalance();
        payment4.payDeposit();
    }

    @Test
    public void test14090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14090");
        payment.Payment payment4 = new payment.Payment((-1L), (double) 'a', "hi!", "");
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        boolean boolean8 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy9 = null;
        payment4.setPaymentStrategy(paymentStrategy9);
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        boolean boolean13 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy14 = null;
        payment4.setPaymentStrategy(paymentStrategy14);
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy18 = null;
        payment4.setPaymentStrategy(paymentStrategy18);
        payment.PaymentStrategy paymentStrategy20 = null;
        payment4.setPaymentStrategy(paymentStrategy20);
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy23 = null;
        payment4.setPaymentStrategy(paymentStrategy23);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test14091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14091");
        payment.Payment payment4 = new payment.Payment((long) 'a', (double) 1L, "", "hi!");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        boolean boolean7 = payment4.paymentCompleted();
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy11 = null;
        payment4.setPaymentStrategy(paymentStrategy11);
        payment.PaymentStrategy paymentStrategy13 = null;
        payment4.setPaymentStrategy(paymentStrategy13);
        payment4.payBalance();
        java.lang.Class<?> wildcardClass16 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test14092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14092");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) (byte) 10, "", "");
        payment4.payDeposit();
        boolean boolean6 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        boolean boolean10 = payment4.paymentCompleted();
        boolean boolean11 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy12 = null;
        payment4.setPaymentStrategy(paymentStrategy12);
        payment4.payBalance();
        boolean boolean15 = payment4.paymentCompleted();
        payment4.payDeposit();
        boolean boolean17 = payment4.paymentCompleted();
        boolean boolean18 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy19 = null;
        payment4.setPaymentStrategy(paymentStrategy19);
        payment4.payBalance();
        boolean boolean22 = payment4.paymentCompleted();
        java.lang.Class<?> wildcardClass23 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test14093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14093");
        payment.Payment payment4 = new payment.Payment((long) 10, (double) 100, "hi!", "hi!");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment4.payDeposit();
        java.lang.Class<?> wildcardClass8 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test14094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14094");
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
        payment4.verifyPaymentDetails();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test14095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14095");
        payment.Payment payment4 = new payment.Payment((long) 'a', (-1.0d), "hi!", "hi!");
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        payment.PaymentStrategy paymentStrategy10 = null;
        payment4.setPaymentStrategy(paymentStrategy10);
    }

    @Test
    public void test14096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14096");
        payment.Payment payment4 = new payment.Payment((long) (short) -1, (double) 100.0f, "", "");
        payment4.payBalance();
        payment4.payDeposit();
        payment4.payBalance();
        payment4.payDeposit();
    }

    @Test
    public void test14097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14097");
        payment.Payment payment4 = new payment.Payment((long) (byte) 0, 100.0d, "", "");
        payment4.payDeposit();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        payment.PaymentStrategy paymentStrategy9 = null;
        payment4.setPaymentStrategy(paymentStrategy9);
        payment.PaymentStrategy paymentStrategy11 = null;
        payment4.setPaymentStrategy(paymentStrategy11);
        payment4.verifyPaymentDetails();
        boolean boolean14 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy15 = null;
        payment4.setPaymentStrategy(paymentStrategy15);
        payment.PaymentStrategy paymentStrategy17 = null;
        payment4.setPaymentStrategy(paymentStrategy17);
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test14098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14098");
        payment.Payment payment4 = new payment.Payment((-1L), (double) 1L, "", "");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        java.lang.Class<?> wildcardClass7 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test14099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14099");
        payment.Payment payment4 = new payment.Payment((long) (short) 10, (double) (byte) -1, "hi!", "");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment4.payBalance();
        payment4.payBalance();
    }

    @Test
    public void test14100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14100");
        payment.Payment payment4 = new payment.Payment((long) (-1), (double) (byte) -1, "", "hi!");
        boolean boolean5 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test14101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14101");
        payment.Payment payment4 = new payment.Payment((long) (byte) 100, (double) 'a', "", "");
        payment4.payBalance();
        java.lang.Class<?> wildcardClass6 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test14102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14102");
        payment.Payment payment4 = new payment.Payment((long) 1, (double) (short) 10, "", "");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment4.payBalance();
        payment4.payDeposit();
    }

    @Test
    public void test14103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14103");
        payment.Payment payment4 = new payment.Payment((-1L), (double) 'a', "hi!", "");
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        boolean boolean14 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        boolean boolean17 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test14104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14104");
        payment.Payment payment4 = new payment.Payment(10L, (double) 100L, "", "hi!");
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy10 = null;
        payment4.setPaymentStrategy(paymentStrategy10);
        payment.PaymentStrategy paymentStrategy12 = null;
        payment4.setPaymentStrategy(paymentStrategy12);
    }

    @Test
    public void test14105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14105");
        payment.Payment payment4 = new payment.Payment((long) (-1), (double) (byte) 1, "", "");
        payment4.payDeposit();
        payment4.payDeposit();
        payment4.payDeposit();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy9 = null;
        payment4.setPaymentStrategy(paymentStrategy9);
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
    }

    @Test
    public void test14106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14106");
        payment.Payment payment4 = new payment.Payment((long) (-1), (double) 100L, "", "hi!");
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        boolean boolean7 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test14107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14107");
        payment.Payment payment4 = new payment.Payment((long) (short) 10, (double) 10, "hi!", "");
        payment4.payDeposit();
        boolean boolean6 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test14108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14108");
        payment.Payment payment4 = new payment.Payment((long) '#', (double) 1L, "hi!", "");
        boolean boolean5 = payment4.paymentCompleted();
        boolean boolean6 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test14109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14109");
        payment.Payment payment4 = new payment.Payment((long) (short) 10, 10.0d, "hi!", "hi!");
        payment4.payDeposit();
        java.lang.Class<?> wildcardClass6 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test14110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14110");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) (byte) 10, "", "");
        payment4.payBalance();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy10 = null;
        payment4.setPaymentStrategy(paymentStrategy10);
    }

    @Test
    public void test14111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14111");
        payment.Payment payment4 = new payment.Payment((long) (-1), (double) 10L, "", "");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        payment.PaymentStrategy paymentStrategy10 = null;
        payment4.setPaymentStrategy(paymentStrategy10);
    }

    @Test
    public void test14112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14112");
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
        boolean boolean14 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy17 = null;
        payment4.setPaymentStrategy(paymentStrategy17);
        payment4.verifyPaymentDetails();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test14113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14113");
        payment.Payment payment4 = new payment.Payment((long) (short) 0, 100.0d, "hi!", "");
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
    }

    @Test
    public void test14114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14114");
        payment.Payment payment4 = new payment.Payment((long) (byte) 1, (double) 1.0f, "", "");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        boolean boolean7 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test14115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14115");
        payment.Payment payment4 = new payment.Payment((long) (byte) 100, (double) 0L, "hi!", "hi!");
        payment4.payBalance();
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        java.lang.Class<?> wildcardClass9 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test14116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14116");
        payment.Payment payment4 = new payment.Payment((long) (short) -1, (double) (-1L), "hi!", "hi!");
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
    }

    @Test
    public void test14117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14117");
        payment.Payment payment4 = new payment.Payment((long) 10, (-1.0d), "", "hi!");
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
    }

    @Test
    public void test14118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14118");
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
        payment.PaymentStrategy paymentStrategy14 = null;
        payment4.setPaymentStrategy(paymentStrategy14);
    }

    @Test
    public void test14119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14119");
        payment.Payment payment4 = new payment.Payment((long) (-1), (double) (byte) -1, "", "hi!");
        boolean boolean5 = payment4.paymentCompleted();
        boolean boolean6 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test14120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14120");
        payment.Payment payment4 = new payment.Payment((long) (short) 1, 1.0d, "", "hi!");
        boolean boolean5 = payment4.paymentCompleted();
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test14121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14121");
        payment.Payment payment4 = new payment.Payment((long) 1, 0.0d, "hi!", "hi!");
        payment4.payBalance();
        boolean boolean6 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        java.lang.Class<?> wildcardClass10 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test14122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14122");
        payment.Payment payment4 = new payment.Payment((long) (short) -1, (double) (byte) -1, "hi!", "");
    }

    @Test
    public void test14123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14123");
        payment.Payment payment4 = new payment.Payment((long) '4', (double) 0L, "", "");
        payment4.verifyPaymentDetails();
        java.lang.Class<?> wildcardClass6 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test14124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14124");
        payment.Payment payment4 = new payment.Payment((long) 1, (double) 100, "", "");
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        boolean boolean7 = payment4.paymentCompleted();
        boolean boolean8 = payment4.paymentCompleted();
        boolean boolean9 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment4.payDeposit();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test14125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14125");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) (byte) 10, "", "");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        boolean boolean13 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test14126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14126");
        payment.Payment payment4 = new payment.Payment((long) '4', (double) (short) 100, "hi!", "hi!");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        payment4.payBalance();
        java.lang.Class<?> wildcardClass10 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test14127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14127");
        payment.Payment payment4 = new payment.Payment((long) (-1), (double) (short) -1, "hi!", "");
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        boolean boolean8 = payment4.paymentCompleted();
        boolean boolean9 = payment4.paymentCompleted();
        payment4.payDeposit();
        java.lang.Class<?> wildcardClass11 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test14128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14128");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) (byte) 10, "", "");
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        boolean boolean9 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test14129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14129");
        payment.Payment payment4 = new payment.Payment((-1L), (double) 'a', "hi!", "");
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment4.payDeposit();
        payment4.payBalance();
        payment4.payDeposit();
        payment4.payBalance();
        boolean boolean12 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy14 = null;
        payment4.setPaymentStrategy(paymentStrategy14);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test14130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14130");
        payment.Payment payment4 = new payment.Payment((long) (short) -1, 0.0d, "hi!", "hi!");
        boolean boolean5 = payment4.paymentCompleted();
        boolean boolean6 = payment4.paymentCompleted();
        payment4.payBalance();
        payment4.payDeposit();
        payment4.payBalance();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy11 = null;
        payment4.setPaymentStrategy(paymentStrategy11);
        payment4.payBalance();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test14131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14131");
        payment.Payment payment4 = new payment.Payment(10L, (double) (short) -1, "", "hi!");
        boolean boolean5 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        payment4.verifyPaymentDetails();
        java.lang.Class<?> wildcardClass10 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test14132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14132");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) 10.0f, "", "");
        payment4.payBalance();
        payment4.verifyPaymentDetails();
    }

    @Test
    public void test14133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14133");
        payment.Payment payment4 = new payment.Payment((long) (byte) 10, (double) 0.0f, "hi!", "");
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        boolean boolean8 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test14134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14134");
        payment.Payment payment4 = new payment.Payment((long) '4', 0.0d, "", "hi!");
        boolean boolean5 = payment4.paymentCompleted();
        payment4.payBalance();
        boolean boolean7 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy9 = null;
        payment4.setPaymentStrategy(paymentStrategy9);
        boolean boolean11 = payment4.paymentCompleted();
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test14135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14135");
        payment.Payment payment4 = new payment.Payment((-1L), (double) 'a', "hi!", "");
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment4.payDeposit();
        boolean boolean8 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment4.payDeposit();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test14136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14136");
        payment.Payment payment4 = new payment.Payment((long) 1, (double) (byte) 0, "hi!", "");
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        java.lang.Class<?> wildcardClass7 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test14137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14137");
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
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy15 = null;
        payment4.setPaymentStrategy(paymentStrategy15);
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        java.lang.Class<?> wildcardClass20 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test14138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14138");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) (short) 10, "hi!", "");
        payment4.verifyPaymentDetails();
        boolean boolean6 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        java.lang.Class<?> wildcardClass10 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test14139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14139");
        payment.Payment payment4 = new payment.Payment(0L, (double) (short) 100, "", "hi!");
        payment4.verifyPaymentDetails();
        boolean boolean6 = payment4.paymentCompleted();
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        boolean boolean10 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test14140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14140");
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
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy20 = null;
        payment4.setPaymentStrategy(paymentStrategy20);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test14141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14141");
        payment.Payment payment4 = new payment.Payment(10L, (double) 1L, "", "");
        payment4.payDeposit();
    }

    @Test
    public void test14142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14142");
        payment.Payment payment4 = new payment.Payment((long) 'a', 0.0d, "", "");
        boolean boolean5 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        boolean boolean8 = payment4.paymentCompleted();
        payment4.payDeposit();
        java.lang.Class<?> wildcardClass10 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test14143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14143");
        payment.Payment payment4 = new payment.Payment((long) (byte) -1, (double) 100, "", "");
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment4.payDeposit();
    }

    @Test
    public void test14144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14144");
        payment.Payment payment4 = new payment.Payment((long) 1, (double) '#', "hi!", "");
        java.lang.Class<?> wildcardClass5 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test14145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14145");
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
        payment.PaymentStrategy paymentStrategy16 = null;
        payment4.setPaymentStrategy(paymentStrategy16);
        java.lang.Class<?> wildcardClass18 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test14146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14146");
        payment.Payment payment4 = new payment.Payment((long) (short) -1, (double) 0, "", "hi!");
        payment4.payBalance();
        boolean boolean6 = payment4.paymentCompleted();
        boolean boolean7 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test14147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14147");
        payment.Payment payment4 = new payment.Payment((long) (short) 100, 10.0d, "", "hi!");
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment4.payBalance();
        payment4.payBalance();
    }

    @Test
    public void test14148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14148");
        payment.Payment payment4 = new payment.Payment(0L, (double) '4', "hi!", "hi!");
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        java.lang.Class<?> wildcardClass9 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test14149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14149");
        payment.Payment payment4 = new payment.Payment(10L, (double) (-1), "", "");
        payment4.payDeposit();
        payment4.payBalance();
        payment4.verifyPaymentDetails();
    }

    @Test
    public void test14150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14150");
        payment.Payment payment4 = new payment.Payment((-1L), (double) (byte) 0, "hi!", "");
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
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
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        boolean boolean19 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test14151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14151");
        payment.Payment payment4 = new payment.Payment((long) 'a', (double) (-1), "hi!", "");
        payment4.payDeposit();
        boolean boolean6 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        payment.PaymentStrategy paymentStrategy10 = null;
        payment4.setPaymentStrategy(paymentStrategy10);
        payment.PaymentStrategy paymentStrategy12 = null;
        payment4.setPaymentStrategy(paymentStrategy12);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test14152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14152");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) (byte) 10, "", "");
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        payment.PaymentStrategy paymentStrategy10 = null;
        payment4.setPaymentStrategy(paymentStrategy10);
        payment4.payBalance();
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        boolean boolean15 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy16 = null;
        payment4.setPaymentStrategy(paymentStrategy16);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test14153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14153");
        payment.Payment payment4 = new payment.Payment((long) (short) 10, (double) (-1L), "", "hi!");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment4.payBalance();
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        java.lang.Class<?> wildcardClass11 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test14154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14154");
        payment.Payment payment4 = new payment.Payment((long) (byte) 0, (double) 0L, "hi!", "");
        payment4.payDeposit();
        boolean boolean6 = payment4.paymentCompleted();
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy9 = null;
        payment4.setPaymentStrategy(paymentStrategy9);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test14155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14155");
        payment.Payment payment4 = new payment.Payment((long) ' ', (double) 1.0f, "hi!", "");
        payment4.payBalance();
    }

    @Test
    public void test14156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14156");
        payment.Payment payment4 = new payment.Payment((long) (short) 0, (double) (byte) 100, "hi!", "hi!");
        payment4.payBalance();
        boolean boolean6 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test14157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14157");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) (byte) 10, "", "");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment4.payDeposit();
        boolean boolean8 = payment4.paymentCompleted();
        payment4.payBalance();
        boolean boolean10 = payment4.paymentCompleted();
        boolean boolean11 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test14158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14158");
        payment.Payment payment4 = new payment.Payment((long) '#', (double) (short) 0, "hi!", "hi!");
        payment4.payDeposit();
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy9 = null;
        payment4.setPaymentStrategy(paymentStrategy9);
        payment4.verifyPaymentDetails();
    }

    @Test
    public void test14159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14159");
        payment.Payment payment4 = new payment.Payment((long) (short) 1, (double) 1.0f, "", "");
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy9 = null;
        payment4.setPaymentStrategy(paymentStrategy9);
        payment4.payBalance();
        boolean boolean12 = payment4.paymentCompleted();
        boolean boolean13 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test14160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14160");
        payment.Payment payment4 = new payment.Payment((long) '4', 0.0d, "", "hi!");
        boolean boolean5 = payment4.paymentCompleted();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        payment.PaymentStrategy paymentStrategy9 = null;
        payment4.setPaymentStrategy(paymentStrategy9);
        java.lang.Class<?> wildcardClass11 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test14161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14161");
        payment.Payment payment4 = new payment.Payment((long) (byte) 100, (double) (byte) 100, "", "");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        payment4.verifyPaymentDetails();
        boolean boolean10 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy12 = null;
        payment4.setPaymentStrategy(paymentStrategy12);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test14162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14162");
        payment.Payment payment4 = new payment.Payment((long) (short) -1, (double) (short) 1, "hi!", "hi!");
        payment4.verifyPaymentDetails();
        boolean boolean6 = payment4.paymentCompleted();
        payment4.payBalance();
        boolean boolean8 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy9 = null;
        payment4.setPaymentStrategy(paymentStrategy9);
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test14163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14163");
        payment.Payment payment4 = new payment.Payment((long) '4', (double) (byte) 10, "", "hi!");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        payment.PaymentStrategy paymentStrategy10 = null;
        payment4.setPaymentStrategy(paymentStrategy10);
    }

    @Test
    public void test14164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14164");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) (byte) 10, "", "");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment4.payBalance();
        payment4.payDeposit();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy10 = null;
        payment4.setPaymentStrategy(paymentStrategy10);
        payment.PaymentStrategy paymentStrategy12 = null;
        payment4.setPaymentStrategy(paymentStrategy12);
    }

    @Test
    public void test14165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14165");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) (byte) 10, "", "");
        payment4.payDeposit();
        boolean boolean6 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment4.payBalance();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy13 = null;
        payment4.setPaymentStrategy(paymentStrategy13);
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        boolean boolean17 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy18 = null;
        payment4.setPaymentStrategy(paymentStrategy18);
        payment4.payDeposit();
        payment4.payDeposit();
        boolean boolean22 = payment4.paymentCompleted();
        boolean boolean23 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test14166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14166");
        payment.Payment payment4 = new payment.Payment(0L, (double) 10L, "", "hi!");
        payment4.payBalance();
        boolean boolean6 = payment4.paymentCompleted();
        payment4.payDeposit();
        boolean boolean8 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test14167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14167");
        payment.Payment payment4 = new payment.Payment((long) 10, (double) 0.0f, "", "hi!");
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment4.payDeposit();
    }

    @Test
    public void test14168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14168");
        payment.Payment payment4 = new payment.Payment((long) (byte) 10, (double) ' ', "", "");
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        boolean boolean7 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        boolean boolean10 = payment4.paymentCompleted();
        boolean boolean11 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test14169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14169");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) (byte) 10, "", "");
        payment4.payDeposit();
        boolean boolean6 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy10 = null;
        payment4.setPaymentStrategy(paymentStrategy10);
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy13 = null;
        payment4.setPaymentStrategy(paymentStrategy13);
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        boolean boolean17 = payment4.paymentCompleted();
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test14170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14170");
        payment.Payment payment4 = new payment.Payment((long) (short) -1, (double) (short) 1, "hi!", "hi!");
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy9 = null;
        payment4.setPaymentStrategy(paymentStrategy9);
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment4.payDeposit();
        payment4.payBalance();
        java.lang.Class<?> wildcardClass15 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test14171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14171");
        payment.Payment payment4 = new payment.Payment((long) 'a', (double) 1L, "", "hi!");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy10 = null;
        payment4.setPaymentStrategy(paymentStrategy10);
        java.lang.Class<?> wildcardClass12 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test14172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14172");
        payment.Payment payment4 = new payment.Payment((long) (byte) 10, (double) ' ', "hi!", "hi!");
        boolean boolean5 = payment4.paymentCompleted();
        boolean boolean6 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        payment4.verifyPaymentDetails();
        boolean boolean10 = payment4.paymentCompleted();
        boolean boolean11 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test14173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14173");
        payment.Payment payment4 = new payment.Payment((long) (byte) 0, (double) (byte) 1, "hi!", "hi!");
        boolean boolean5 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        payment.PaymentStrategy paymentStrategy9 = null;
        payment4.setPaymentStrategy(paymentStrategy9);
        payment.PaymentStrategy paymentStrategy11 = null;
        payment4.setPaymentStrategy(paymentStrategy11);
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        java.lang.Class<?> wildcardClass15 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test14174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14174");
        payment.Payment payment4 = new payment.Payment((long) (byte) 1, (double) 1, "hi!", "");
        boolean boolean5 = payment4.paymentCompleted();
        payment4.payBalance();
        java.lang.Class<?> wildcardClass7 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test14175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14175");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) (byte) 10, "", "");
        payment4.payDeposit();
        boolean boolean6 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        payment4.verifyPaymentDetails();
        boolean boolean11 = payment4.paymentCompleted();
        payment4.payBalance();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test14176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14176");
        payment.Payment payment4 = new payment.Payment((long) (short) 1, 0.0d, "", "");
        payment4.payDeposit();
        java.lang.Class<?> wildcardClass6 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test14177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14177");
        payment.Payment payment4 = new payment.Payment((long) '4', (double) ' ', "hi!", "");
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        payment4.payBalance();
    }

    @Test
    public void test14178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14178");
        payment.Payment payment4 = new payment.Payment((long) (-1), (double) (short) -1, "hi!", "");
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment4.payDeposit();
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy11 = null;
        payment4.setPaymentStrategy(paymentStrategy11);
        payment.PaymentStrategy paymentStrategy13 = null;
        payment4.setPaymentStrategy(paymentStrategy13);
    }

    @Test
    public void test14179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14179");
        payment.Payment payment4 = new payment.Payment((long) (short) 100, (double) (short) 100, "hi!", "hi!");
        boolean boolean5 = payment4.paymentCompleted();
        payment4.payDeposit();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test14180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14180");
        payment.Payment payment4 = new payment.Payment((long) 'a', (double) (-1), "", "");
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy9 = null;
        payment4.setPaymentStrategy(paymentStrategy9);
        boolean boolean11 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test14181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14181");
        payment.Payment payment4 = new payment.Payment((long) (-1), (double) (byte) 1, "", "");
        payment4.payDeposit();
        payment4.payDeposit();
        payment4.payDeposit();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy9 = null;
        payment4.setPaymentStrategy(paymentStrategy9);
        boolean boolean11 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test14182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14182");
        payment.Payment payment4 = new payment.Payment(100L, (double) 100.0f, "", "");
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        java.lang.Class<?> wildcardClass7 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test14183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14183");
        payment.Payment payment4 = new payment.Payment((long) 'a', (double) (-1), "hi!", "");
        boolean boolean5 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment4.payBalance();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test14184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14184");
        payment.Payment payment4 = new payment.Payment((long) ' ', (double) (byte) -1, "hi!", "hi!");
        boolean boolean5 = payment4.paymentCompleted();
        payment4.payBalance();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test14185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14185");
        payment.Payment payment4 = new payment.Payment((long) (-1), (double) 0L, "", "");
    }

    @Test
    public void test14186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14186");
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
        payment4.payDeposit();
        boolean boolean16 = payment4.paymentCompleted();
        payment4.payDeposit();
        java.lang.Class<?> wildcardClass18 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test14187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14187");
        payment.Payment payment4 = new payment.Payment((-1L), (double) '#', "", "hi!");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        payment4.payBalance();
        payment4.payDeposit();
        payment4.payDeposit();
        payment4.payDeposit();
        payment4.payDeposit();
        java.lang.Class<?> wildcardClass14 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test14188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14188");
        payment.Payment payment4 = new payment.Payment((long) 'a', 0.0d, "", "");
        payment4.payBalance();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment4.verifyPaymentDetails();
    }

    @Test
    public void test14189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14189");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) (byte) 10, "", "");
        payment4.payDeposit();
        boolean boolean6 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        boolean boolean10 = payment4.paymentCompleted();
        boolean boolean11 = payment4.paymentCompleted();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy13 = null;
        payment4.setPaymentStrategy(paymentStrategy13);
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        boolean boolean17 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy19 = null;
        payment4.setPaymentStrategy(paymentStrategy19);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test14190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14190");
        payment.Payment payment4 = new payment.Payment((long) (short) 0, (double) (short) 100, "hi!", "");
        boolean boolean5 = payment4.paymentCompleted();
        payment4.payBalance();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test14191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14191");
        payment.Payment payment4 = new payment.Payment(1L, (double) 1, "", "hi!");
        payment4.payBalance();
        payment4.payDeposit();
    }

    @Test
    public void test14192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14192");
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
        payment.PaymentStrategy paymentStrategy20 = null;
        payment4.setPaymentStrategy(paymentStrategy20);
        boolean boolean22 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy23 = null;
        payment4.setPaymentStrategy(paymentStrategy23);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test14193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14193");
        payment.Payment payment4 = new payment.Payment((long) (byte) 0, (double) (-1.0f), "hi!", "");
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        payment4.payDeposit();
        payment4.payBalance();
        payment4.payDeposit();
    }

    @Test
    public void test14194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14194");
        payment.Payment payment4 = new payment.Payment((long) (byte) 100, 0.0d, "hi!", "");
        boolean boolean5 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment4.payBalance();
        boolean boolean12 = payment4.paymentCompleted();
        boolean boolean13 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test14195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14195");
        payment.Payment payment4 = new payment.Payment((long) 100, (double) (byte) 1, "hi!", "hi!");
        boolean boolean5 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy11 = null;
        payment4.setPaymentStrategy(paymentStrategy11);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test14196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14196");
        payment.Payment payment4 = new payment.Payment((long) (short) -1, (double) 1.0f, "hi!", "");
        boolean boolean5 = payment4.paymentCompleted();
        payment4.payBalance();
        payment4.payBalance();
        payment4.payBalance();
        java.lang.Class<?> wildcardClass9 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test14197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14197");
        payment.Payment payment4 = new payment.Payment((long) (-1), (double) (byte) -1, "", "hi!");
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        payment4.payBalance();
        boolean boolean10 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test14198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14198");
        payment.Payment payment4 = new payment.Payment((long) (short) 1, (double) 0, "", "hi!");
        boolean boolean5 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test14199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14199");
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
        payment.PaymentStrategy paymentStrategy18 = null;
        payment4.setPaymentStrategy(paymentStrategy18);
        java.lang.Class<?> wildcardClass20 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test14200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14200");
        payment.Payment payment4 = new payment.Payment((long) (-1), (double) (short) -1, "hi!", "");
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        boolean boolean9 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test14201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14201");
        payment.Payment payment4 = new payment.Payment(1L, (double) 10L, "hi!", "");
        payment4.payDeposit();
        payment4.payDeposit();
        payment4.payBalance();
        payment4.payBalance();
        payment4.payBalance();
        payment4.payBalance();
        payment4.verifyPaymentDetails();
    }

    @Test
    public void test14202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14202");
        payment.Payment payment4 = new payment.Payment((long) '4', (double) (short) 1, "", "");
        payment4.payBalance();
        boolean boolean6 = payment4.paymentCompleted();
        boolean boolean7 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test14203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14203");
        payment.Payment payment4 = new payment.Payment((-1L), 1.0d, "", "hi!");
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment4.payBalance();
        java.lang.Class<?> wildcardClass11 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test14204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14204");
        payment.Payment payment4 = new payment.Payment((long) 10, (double) (byte) 1, "hi!", "hi!");
        payment4.verifyPaymentDetails();
        java.lang.Class<?> wildcardClass6 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test14205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14205");
        payment.Payment payment4 = new payment.Payment((-1L), (double) (byte) 1, "hi!", "hi!");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        payment.PaymentStrategy paymentStrategy9 = null;
        payment4.setPaymentStrategy(paymentStrategy9);
        payment.PaymentStrategy paymentStrategy11 = null;
        payment4.setPaymentStrategy(paymentStrategy11);
        payment.PaymentStrategy paymentStrategy13 = null;
        payment4.setPaymentStrategy(paymentStrategy13);
    }

    @Test
    public void test14206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14206");
        payment.Payment payment4 = new payment.Payment((long) ' ', (double) 0L, "", "");
        payment4.payDeposit();
        payment4.payBalance();
        payment4.payDeposit();
    }

    @Test
    public void test14207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14207");
        payment.Payment payment4 = new payment.Payment((long) '#', (double) (byte) 1, "", "");
        payment4.payBalance();
        payment4.payBalance();
    }

    @Test
    public void test14208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14208");
        payment.Payment payment4 = new payment.Payment(0L, (double) (short) 1, "", "hi!");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
    }

    @Test
    public void test14209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14209");
        payment.Payment payment4 = new payment.Payment((long) 'a', (double) 1L, "", "hi!");
        payment4.payBalance();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy10 = null;
        payment4.setPaymentStrategy(paymentStrategy10);
    }

    @Test
    public void test14210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14210");
        payment.Payment payment4 = new payment.Payment((long) (byte) 1, (double) 0, "hi!", "");
        boolean boolean5 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        boolean boolean7 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        payment4.payDeposit();
        boolean boolean11 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test14211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14211");
        payment.Payment payment4 = new payment.Payment((long) 100, 0.0d, "hi!", "");
        payment4.payBalance();
        boolean boolean6 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test14212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14212");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) (byte) 10, "", "");
        payment4.payDeposit();
        boolean boolean6 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        boolean boolean10 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test14213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14213");
        payment.Payment payment4 = new payment.Payment((-1L), (double) 'a', "hi!", "");
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        boolean boolean8 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy9 = null;
        payment4.setPaymentStrategy(paymentStrategy9);
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy13 = null;
        payment4.setPaymentStrategy(paymentStrategy13);
        payment4.payDeposit();
        payment4.payDeposit();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy18 = null;
        payment4.setPaymentStrategy(paymentStrategy18);
        payment4.payBalance();
        java.lang.Class<?> wildcardClass21 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test14214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14214");
        payment.Payment payment4 = new payment.Payment(10L, (-1.0d), "", "");
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        payment4.payDeposit();
    }

    @Test
    public void test14215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14215");
        payment.Payment payment4 = new payment.Payment((long) (byte) 0, (double) (byte) -1, "hi!", "hi!");
    }

    @Test
    public void test14216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14216");
        payment.Payment payment4 = new payment.Payment((long) (byte) -1, (double) '4', "", "");
        java.lang.Class<?> wildcardClass5 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test14217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14217");
        payment.Payment payment4 = new payment.Payment((-1L), (double) 'a', "hi!", "");
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy12 = null;
        payment4.setPaymentStrategy(paymentStrategy12);
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy15 = null;
        payment4.setPaymentStrategy(paymentStrategy15);
        payment4.payBalance();
    }

    @Test
    public void test14218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14218");
        payment.Payment payment4 = new payment.Payment((long) (byte) 100, 0.0d, "", "");
        boolean boolean5 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        payment4.payDeposit();
        java.lang.Class<?> wildcardClass10 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test14219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14219");
        payment.Payment payment4 = new payment.Payment((long) 1, (double) (short) 1, "", "hi!");
        java.lang.Class<?> wildcardClass5 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test14220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14220");
        payment.Payment payment4 = new payment.Payment((long) (-1), (double) 1L, "", "");
        payment4.payBalance();
        payment4.payBalance();
        boolean boolean7 = payment4.paymentCompleted();
        boolean boolean8 = payment4.paymentCompleted();
        java.lang.Class<?> wildcardClass9 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test14221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14221");
        payment.Payment payment4 = new payment.Payment((long) '4', (double) 1L, "hi!", "hi!");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment4.payBalance();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy9 = null;
        payment4.setPaymentStrategy(paymentStrategy9);
        boolean boolean11 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test14222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14222");
        payment.Payment payment4 = new payment.Payment((long) (byte) 10, (double) 0.0f, "hi!", "");
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy9 = null;
        payment4.setPaymentStrategy(paymentStrategy9);
        payment4.payDeposit();
        payment4.payBalance();
    }

    @Test
    public void test14223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14223");
        payment.Payment payment4 = new payment.Payment((long) (short) -1, (double) 'a', "hi!", "hi!");
        payment4.payBalance();
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        java.lang.Class<?> wildcardClass10 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test14224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14224");
        payment.Payment payment4 = new payment.Payment((long) (byte) 100, (double) (short) 10, "", "hi!");
        payment4.verifyPaymentDetails();
        boolean boolean6 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        payment4.payBalance();
        boolean boolean10 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy11 = null;
        payment4.setPaymentStrategy(paymentStrategy11);
        boolean boolean13 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test14225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14225");
        payment.Payment payment4 = new payment.Payment((long) (byte) 100, (double) 1L, "hi!", "hi!");
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
    }

    @Test
    public void test14226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14226");
        payment.Payment payment4 = new payment.Payment((-1L), (double) 'a', "hi!", "");
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment4.payDeposit();
        boolean boolean8 = payment4.paymentCompleted();
        boolean boolean9 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test14227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14227");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) (byte) 10, "", "");
        payment4.payBalance();
        boolean boolean6 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        payment4.payBalance();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy12 = null;
        payment4.setPaymentStrategy(paymentStrategy12);
        payment.PaymentStrategy paymentStrategy14 = null;
        payment4.setPaymentStrategy(paymentStrategy14);
        java.lang.Class<?> wildcardClass16 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test14228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14228");
        payment.Payment payment4 = new payment.Payment((long) (byte) -1, (double) 10L, "", "hi!");
        payment4.payBalance();
    }

    @Test
    public void test14229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14229");
        payment.Payment payment4 = new payment.Payment((long) (short) 1, (double) (short) 100, "hi!", "hi!");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
    }

    @Test
    public void test14230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14230");
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
        payment4.payDeposit();
        payment4.payBalance();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test14231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14231");
        payment.Payment payment4 = new payment.Payment((-1L), (double) 'a', "hi!", "");
        payment4.payBalance();
        payment4.payBalance();
        boolean boolean7 = payment4.paymentCompleted();
        boolean boolean8 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment4.payBalance();
        boolean boolean11 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test14232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14232");
        payment.Payment payment4 = new payment.Payment((long) (short) -1, (double) (short) 1, "hi!", "hi!");
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment4.payDeposit();
        payment4.payBalance();
        boolean boolean10 = payment4.paymentCompleted();
        java.lang.Class<?> wildcardClass11 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test14233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14233");
        payment.Payment payment4 = new payment.Payment((long) 1, 0.0d, "hi!", "hi!");
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        boolean boolean7 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test14234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14234");
        payment.Payment payment4 = new payment.Payment((long) '#', (double) (-1), "", "");
        boolean boolean5 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment4.verifyPaymentDetails();
        boolean boolean9 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test14235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14235");
        payment.Payment payment4 = new payment.Payment((long) (short) 10, (double) (short) 100, "hi!", "");
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        boolean boolean7 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        boolean boolean10 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test14236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14236");
        payment.Payment payment4 = new payment.Payment((long) (byte) 100, (double) (byte) 100, "", "");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy10 = null;
        payment4.setPaymentStrategy(paymentStrategy10);
        payment.PaymentStrategy paymentStrategy12 = null;
        payment4.setPaymentStrategy(paymentStrategy12);
        payment4.payDeposit();
    }

    @Test
    public void test14237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14237");
        payment.Payment payment4 = new payment.Payment((long) 100, 0.0d, "hi!", "");
        boolean boolean5 = payment4.paymentCompleted();
        payment4.payDeposit();
        boolean boolean7 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        payment4.payDeposit();
        payment4.payBalance();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test14238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14238");
        payment.Payment payment4 = new payment.Payment((long) (byte) 100, 0.0d, "", "");
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        boolean boolean8 = payment4.paymentCompleted();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy10 = null;
        payment4.setPaymentStrategy(paymentStrategy10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test14239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14239");
        payment.Payment payment4 = new payment.Payment((-1L), (double) '#', "", "hi!");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment4.payBalance();
        boolean boolean10 = payment4.paymentCompleted();
        payment4.payBalance();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy13 = null;
        payment4.setPaymentStrategy(paymentStrategy13);
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test14240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14240");
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
        payment4.verifyPaymentDetails();
        boolean boolean15 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test14241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14241");
        payment.Payment payment4 = new payment.Payment(0L, (double) (byte) 10, "", "hi!");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        payment.PaymentStrategy paymentStrategy10 = null;
        payment4.setPaymentStrategy(paymentStrategy10);
        payment.PaymentStrategy paymentStrategy12 = null;
        payment4.setPaymentStrategy(paymentStrategy12);
        payment4.payBalance();
    }

    @Test
    public void test14242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14242");
        payment.Payment payment4 = new payment.Payment((long) 'a', 0.0d, "hi!", "hi!");
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
    }

    @Test
    public void test14243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14243");
        payment.Payment payment4 = new payment.Payment((long) 100, (double) '4', "", "");
        payment4.verifyPaymentDetails();
        boolean boolean6 = payment4.paymentCompleted();
        payment4.payDeposit();
        java.lang.Class<?> wildcardClass8 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test14244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14244");
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
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment4.payBalance();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test14245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14245");
        payment.Payment payment4 = new payment.Payment((long) 1, 0.0d, "hi!", "hi!");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
    }

    @Test
    public void test14246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14246");
        payment.Payment payment4 = new payment.Payment((long) (short) 100, (double) '#', "hi!", "hi!");
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        payment4.payDeposit();
        payment4.payDeposit();
    }

    @Test
    public void test14247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14247");
        payment.Payment payment4 = new payment.Payment((long) (short) 100, (double) (byte) -1, "hi!", "");
        java.lang.Class<?> wildcardClass5 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test14248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14248");
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
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy18 = null;
        payment4.setPaymentStrategy(paymentStrategy18);
        payment.PaymentStrategy paymentStrategy20 = null;
        payment4.setPaymentStrategy(paymentStrategy20);
        boolean boolean22 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test14249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14249");
        payment.Payment payment4 = new payment.Payment((long) (byte) -1, 1.0d, "hi!", "");
        payment4.payDeposit();
        boolean boolean6 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        payment.PaymentStrategy paymentStrategy10 = null;
        payment4.setPaymentStrategy(paymentStrategy10);
        boolean boolean12 = payment4.paymentCompleted();
        boolean boolean13 = payment4.paymentCompleted();
        java.lang.Class<?> wildcardClass14 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test14250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14250");
        payment.Payment payment4 = new payment.Payment(1L, 1.0d, "", "");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy10 = null;
        payment4.setPaymentStrategy(paymentStrategy10);
    }

    @Test
    public void test14251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14251");
        payment.Payment payment4 = new payment.Payment((long) (short) 1, (double) 1.0f, "", "");
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
    }

    @Test
    public void test14252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14252");
        payment.Payment payment4 = new payment.Payment((long) 'a', 1.0d, "", "");
        payment4.payBalance();
        java.lang.Class<?> wildcardClass6 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test14253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14253");
        payment.Payment payment4 = new payment.Payment((-1L), (double) (byte) 0, "hi!", "");
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        payment.PaymentStrategy paymentStrategy9 = null;
        payment4.setPaymentStrategy(paymentStrategy9);
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        boolean boolean14 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        payment4.payDeposit();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy19 = null;
        payment4.setPaymentStrategy(paymentStrategy19);
        boolean boolean21 = payment4.paymentCompleted();
        boolean boolean22 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test14254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14254");
        payment.Payment payment4 = new payment.Payment(0L, 100.0d, "hi!", "");
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        boolean boolean8 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy10 = null;
        payment4.setPaymentStrategy(paymentStrategy10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test14255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14255");
        payment.Payment payment4 = new payment.Payment((long) (byte) 100, (double) 10L, "", "hi!");
        payment4.payDeposit();
    }

    @Test
    public void test14256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14256");
        payment.Payment payment4 = new payment.Payment((long) (byte) 0, (-1.0d), "hi!", "");
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        payment.PaymentStrategy paymentStrategy9 = null;
        payment4.setPaymentStrategy(paymentStrategy9);
        payment.PaymentStrategy paymentStrategy11 = null;
        payment4.setPaymentStrategy(paymentStrategy11);
    }

    @Test
    public void test14257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14257");
        payment.Payment payment4 = new payment.Payment((long) 10, (double) 10.0f, "", "hi!");
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        boolean boolean10 = payment4.paymentCompleted();
        payment4.payBalance();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test14258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14258");
        payment.Payment payment4 = new payment.Payment(1L, (double) 10.0f, "hi!", "");
        payment4.payDeposit();
        payment4.payBalance();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        payment4.verifyPaymentDetails();
        java.lang.Class<?> wildcardClass11 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test14259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14259");
        payment.Payment payment4 = new payment.Payment((long) '4', (double) 0, "", "");
        payment4.verifyPaymentDetails();
        java.lang.Class<?> wildcardClass6 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test14260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14260");
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
        payment.PaymentStrategy paymentStrategy14 = null;
        payment4.setPaymentStrategy(paymentStrategy14);
        payment.PaymentStrategy paymentStrategy16 = null;
        payment4.setPaymentStrategy(paymentStrategy16);
        payment4.payDeposit();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy20 = null;
        payment4.setPaymentStrategy(paymentStrategy20);
        payment4.verifyPaymentDetails();
        java.lang.Class<?> wildcardClass23 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test14261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14261");
        payment.Payment payment4 = new payment.Payment((-1L), (double) 0, "", "");
        payment4.payDeposit();
        payment4.payDeposit();
    }

    @Test
    public void test14262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14262");
        payment.Payment payment4 = new payment.Payment((-1L), (double) 1L, "hi!", "");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        boolean boolean7 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment4.payDeposit();
        java.lang.Class<?> wildcardClass10 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test14263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14263");
        payment.Payment payment4 = new payment.Payment(10L, (double) 100L, "", "hi!");
        payment4.payDeposit();
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        boolean boolean8 = payment4.paymentCompleted();
        java.lang.Class<?> wildcardClass9 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test14264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14264");
        payment.Payment payment4 = new payment.Payment((long) (byte) 100, (double) 100.0f, "", "hi!");
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
    }

    @Test
    public void test14265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14265");
        payment.Payment payment4 = new payment.Payment(10L, (double) (-1), "", "hi!");
        payment4.payDeposit();
        java.lang.Class<?> wildcardClass6 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test14266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14266");
        payment.Payment payment4 = new payment.Payment((-1L), (double) '#', "", "hi!");
        boolean boolean5 = payment4.paymentCompleted();
        boolean boolean6 = payment4.paymentCompleted();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        payment4.verifyPaymentDetails();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test14267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14267");
        payment.Payment payment4 = new payment.Payment(1L, (double) 10.0f, "hi!", "");
        payment4.payDeposit();
        payment4.payBalance();
        payment4.payBalance();
        java.lang.Class<?> wildcardClass8 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test14268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14268");
        payment.Payment payment4 = new payment.Payment((long) 1, 1.0d, "hi!", "hi!");
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        boolean boolean8 = payment4.paymentCompleted();
        payment4.payBalance();
        java.lang.Class<?> wildcardClass10 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test14269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14269");
        payment.Payment payment4 = new payment.Payment((long) 'a', (double) 'a', "hi!", "hi!");
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment4.payDeposit();
        java.lang.Class<?> wildcardClass8 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test14270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14270");
        payment.Payment payment4 = new payment.Payment((long) (short) 1, (double) 100.0f, "", "hi!");
        payment4.payBalance();
        payment4.payBalance();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
    }

    @Test
    public void test14271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14271");
        payment.Payment payment4 = new payment.Payment((-1L), (double) (byte) 0, "hi!", "");
        payment4.payBalance();
        boolean boolean6 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        payment.PaymentStrategy paymentStrategy10 = null;
        payment4.setPaymentStrategy(paymentStrategy10);
        boolean boolean12 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test14272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14272");
        payment.Payment payment4 = new payment.Payment((-1L), (double) 'a', "hi!", "");
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy10 = null;
        payment4.setPaymentStrategy(paymentStrategy10);
        payment4.payBalance();
        payment4.payBalance();
        payment4.payDeposit();
        java.lang.Class<?> wildcardClass15 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test14273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14273");
        payment.Payment payment4 = new payment.Payment((long) (byte) 1, 1.0d, "hi!", "");
        payment4.verifyPaymentDetails();
        boolean boolean6 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        boolean boolean8 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        boolean boolean10 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test14274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14274");
        payment.Payment payment4 = new payment.Payment(1L, (double) (short) 10, "hi!", "hi!");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        java.lang.Class<?> wildcardClass7 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test14275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14275");
        payment.Payment payment4 = new payment.Payment((long) 100, (double) 10.0f, "", "hi!");
        boolean boolean5 = payment4.paymentCompleted();
        payment4.payBalance();
        payment4.payDeposit();
        payment4.payBalance();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test14276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14276");
        payment.Payment payment4 = new payment.Payment((-1L), (double) 100L, "hi!", "");
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        boolean boolean7 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment4.payBalance();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test14277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14277");
        payment.Payment payment4 = new payment.Payment(0L, (double) (short) 1, "", "hi!");
        boolean boolean5 = payment4.paymentCompleted();
        payment4.payDeposit();
        boolean boolean7 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        boolean boolean9 = payment4.paymentCompleted();
        boolean boolean10 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy12 = null;
        payment4.setPaymentStrategy(paymentStrategy12);
        payment.PaymentStrategy paymentStrategy14 = null;
        payment4.setPaymentStrategy(paymentStrategy14);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test14278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14278");
        payment.Payment payment4 = new payment.Payment((long) 'a', 100.0d, "", "hi!");
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        boolean boolean8 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test14279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14279");
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
        payment4.payBalance();
        boolean boolean17 = payment4.paymentCompleted();
        boolean boolean18 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        boolean boolean20 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy21 = null;
        payment4.setPaymentStrategy(paymentStrategy21);
        boolean boolean23 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test14280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14280");
        payment.Payment payment4 = new payment.Payment((long) ' ', (double) (byte) 10, "hi!", "");
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        java.lang.Class<?> wildcardClass7 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test14281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14281");
        payment.Payment payment4 = new payment.Payment((-1L), (double) 0L, "hi!", "hi!");
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
    }

    @Test
    public void test14282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14282");
        payment.Payment payment4 = new payment.Payment((long) 10, (double) 10.0f, "", "hi!");
        payment4.payDeposit();
        payment4.payDeposit();
        boolean boolean7 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test14283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14283");
        payment.Payment payment4 = new payment.Payment(0L, (double) 10L, "hi!", "");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        boolean boolean7 = payment4.paymentCompleted();
        payment4.payDeposit();
        boolean boolean9 = payment4.paymentCompleted();
        payment4.payBalance();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test14284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14284");
        payment.Payment payment4 = new payment.Payment((long) (byte) 0, (double) (-1.0f), "hi!", "");
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        payment4.payBalance();
        boolean boolean10 = payment4.paymentCompleted();
        payment4.payBalance();
        payment4.payDeposit();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test14285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14285");
        payment.Payment payment4 = new payment.Payment((long) (short) 1, (double) (byte) 10, "", "");
        payment4.verifyPaymentDetails();
        boolean boolean6 = payment4.paymentCompleted();
        payment4.payBalance();
        java.lang.Class<?> wildcardClass8 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test14286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14286");
        payment.Payment payment4 = new payment.Payment((long) (-1), (double) (short) -1, "hi!", "");
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        boolean boolean10 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        boolean boolean15 = payment4.paymentCompleted();
        payment4.payDeposit();
        boolean boolean17 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test14287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14287");
        payment.Payment payment4 = new payment.Payment((long) 100, 0.0d, "hi!", "");
        boolean boolean5 = payment4.paymentCompleted();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        payment.PaymentStrategy paymentStrategy9 = null;
        payment4.setPaymentStrategy(paymentStrategy9);
        payment4.payBalance();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test14288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14288");
        payment.Payment payment4 = new payment.Payment((long) (short) -1, (double) (short) 1, "hi!", "hi!");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment4.payDeposit();
        boolean boolean8 = payment4.paymentCompleted();
        boolean boolean9 = payment4.paymentCompleted();
        payment4.payBalance();
        payment4.payDeposit();
        java.lang.Class<?> wildcardClass12 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test14289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14289");
        payment.Payment payment4 = new payment.Payment(1L, (double) 0, "hi!", "");
        payment4.payBalance();
    }

    @Test
    public void test14290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14290");
        payment.Payment payment4 = new payment.Payment((long) 'a', (double) '4', "hi!", "hi!");
        boolean boolean5 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        payment.PaymentStrategy paymentStrategy9 = null;
        payment4.setPaymentStrategy(paymentStrategy9);
        boolean boolean11 = payment4.paymentCompleted();
        boolean boolean12 = payment4.paymentCompleted();
        java.lang.Class<?> wildcardClass13 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test14291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14291");
        payment.Payment payment4 = new payment.Payment((long) ' ', (double) (byte) 10, "", "");
        payment4.payDeposit();
        boolean boolean6 = payment4.paymentCompleted();
        payment4.payBalance();
        boolean boolean8 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test14292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14292");
        payment.Payment payment4 = new payment.Payment(100L, (double) (short) 100, "hi!", "hi!");
        payment4.payBalance();
    }

    @Test
    public void test14293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14293");
        payment.Payment payment4 = new payment.Payment(0L, (double) 10L, "hi!", "");
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
    }

    @Test
    public void test14294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14294");
        payment.Payment payment4 = new payment.Payment((long) (byte) 100, 0.0d, "", "");
        payment4.payDeposit();
        boolean boolean6 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test14295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14295");
        payment.Payment payment4 = new payment.Payment((long) 10, (double) (short) 0, "hi!", "");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment4.verifyPaymentDetails();
        boolean boolean8 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy9 = null;
        payment4.setPaymentStrategy(paymentStrategy9);
        boolean boolean11 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test14296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14296");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) 10L, "", "");
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        payment4.payBalance();
    }

    @Test
    public void test14297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14297");
        payment.Payment payment4 = new payment.Payment((long) (short) 100, (double) (-1.0f), "hi!", "");
        payment4.verifyPaymentDetails();
    }

    @Test
    public void test14298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14298");
        payment.Payment payment4 = new payment.Payment(0L, (double) 10.0f, "hi!", "hi!");
        boolean boolean5 = payment4.paymentCompleted();
        boolean boolean6 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        boolean boolean12 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy14 = null;
        payment4.setPaymentStrategy(paymentStrategy14);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test14299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14299");
        payment.Payment payment4 = new payment.Payment((long) 1, (double) 100, "hi!", "hi!");
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        boolean boolean8 = payment4.paymentCompleted();
        boolean boolean9 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy10 = null;
        payment4.setPaymentStrategy(paymentStrategy10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test14300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14300");
        payment.Payment payment4 = new payment.Payment(1L, (double) (short) 1, "", "");
        payment4.payDeposit();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        payment4.verifyPaymentDetails();
    }

    @Test
    public void test14301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14301");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) 100.0f, "", "hi!");
        boolean boolean5 = payment4.paymentCompleted();
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test14302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14302");
        payment.Payment payment4 = new payment.Payment((long) '#', (double) (short) 100, "hi!", "");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment4.payDeposit();
        java.lang.Class<?> wildcardClass8 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test14303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14303");
        payment.Payment payment4 = new payment.Payment((long) (short) 100, (double) 1, "", "hi!");
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        payment4.payDeposit();
    }

    @Test
    public void test14304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14304");
        payment.Payment payment4 = new payment.Payment((long) 1, 0.0d, "hi!", "hi!");
        payment4.payBalance();
        payment4.payDeposit();
        boolean boolean7 = payment4.paymentCompleted();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy9 = null;
        payment4.setPaymentStrategy(paymentStrategy9);
        boolean boolean11 = payment4.paymentCompleted();
        payment4.payDeposit();
        java.lang.Class<?> wildcardClass13 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test14305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14305");
        payment.Payment payment4 = new payment.Payment((long) (short) 100, (double) (short) 0, "", "hi!");
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        java.lang.Class<?> wildcardClass8 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test14306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14306");
        payment.Payment payment4 = new payment.Payment((long) (short) 1, (double) (short) 100, "hi!", "");
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        boolean boolean7 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        boolean boolean10 = payment4.paymentCompleted();
        boolean boolean11 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy12 = null;
        payment4.setPaymentStrategy(paymentStrategy12);
        payment4.payDeposit();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test14307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14307");
        payment.Payment payment4 = new payment.Payment(1L, (double) (short) 10, "hi!", "hi!");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment4.payDeposit();
        boolean boolean8 = payment4.paymentCompleted();
        payment4.payDeposit();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test14308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14308");
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
        payment4.payBalance();
        boolean boolean16 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        boolean boolean19 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test14309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14309");
        payment.Payment payment4 = new payment.Payment((long) (short) -1, (double) (short) 1, "hi!", "hi!");
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy11 = null;
        payment4.setPaymentStrategy(paymentStrategy11);
        payment4.payBalance();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy15 = null;
        payment4.setPaymentStrategy(paymentStrategy15);
    }

    @Test
    public void test14310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14310");
        payment.Payment payment4 = new payment.Payment((long) 10, (double) 10, "hi!", "hi!");
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        boolean boolean7 = payment4.paymentCompleted();
        java.lang.Class<?> wildcardClass8 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test14311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14311");
        payment.Payment payment4 = new payment.Payment((long) (short) -1, (double) 1.0f, "hi!", "");
        boolean boolean5 = payment4.paymentCompleted();
        payment4.payDeposit();
        boolean boolean7 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        boolean boolean10 = payment4.paymentCompleted();
        payment4.payBalance();
        payment4.payBalance();
        payment4.payBalance();
        payment4.payBalance();
        boolean boolean15 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy16 = null;
        payment4.setPaymentStrategy(paymentStrategy16);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test14312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14312");
        payment.Payment payment4 = new payment.Payment((long) (short) -1, (double) (byte) 0, "", "hi!");
        payment4.verifyPaymentDetails();
    }

    @Test
    public void test14313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14313");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) (byte) 10, "", "");
        payment4.payDeposit();
        boolean boolean6 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy10 = null;
        payment4.setPaymentStrategy(paymentStrategy10);
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy13 = null;
        payment4.setPaymentStrategy(paymentStrategy13);
        payment4.payBalance();
        boolean boolean16 = payment4.paymentCompleted();
        payment4.payBalance();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test14314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14314");
        payment.Payment payment4 = new payment.Payment((long) (byte) 1, 1.0d, "hi!", "");
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        payment4.payDeposit();
        boolean boolean8 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy10 = null;
        payment4.setPaymentStrategy(paymentStrategy10);
        payment.PaymentStrategy paymentStrategy12 = null;
        payment4.setPaymentStrategy(paymentStrategy12);
        payment.PaymentStrategy paymentStrategy14 = null;
        payment4.setPaymentStrategy(paymentStrategy14);
        payment4.payDeposit();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test14315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14315");
        payment.Payment payment4 = new payment.Payment((long) (short) 10, (double) (-1.0f), "hi!", "");
        payment4.payDeposit();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
    }

    @Test
    public void test14316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14316");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) (byte) 10, "", "");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        boolean boolean9 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy11 = null;
        payment4.setPaymentStrategy(paymentStrategy11);
        payment4.payBalance();
        boolean boolean14 = payment4.paymentCompleted();
        boolean boolean15 = payment4.paymentCompleted();
        payment4.payDeposit();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test14317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14317");
        payment.Payment payment4 = new payment.Payment((-1L), (double) 'a', "hi!", "");
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        boolean boolean12 = payment4.paymentCompleted();
        boolean boolean13 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test14318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14318");
        payment.Payment payment4 = new payment.Payment((long) (byte) 10, (double) (byte) -1, "", "hi!");
        payment4.payBalance();
        payment4.payBalance();
        payment4.payBalance();
        boolean boolean8 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy9 = null;
        payment4.setPaymentStrategy(paymentStrategy9);
        payment.PaymentStrategy paymentStrategy11 = null;
        payment4.setPaymentStrategy(paymentStrategy11);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test14319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14319");
        payment.Payment payment4 = new payment.Payment((-1L), (double) 'a', "hi!", "");
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        boolean boolean8 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy9 = null;
        payment4.setPaymentStrategy(paymentStrategy9);
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy13 = null;
        payment4.setPaymentStrategy(paymentStrategy13);
        payment4.payDeposit();
        payment4.payDeposit();
        payment4.payDeposit();
        payment4.payDeposit();
        payment4.payDeposit();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test14320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14320");
        payment.Payment payment4 = new payment.Payment((long) (-1), (double) 1L, "", "");
        payment4.payBalance();
        payment4.payBalance();
        boolean boolean7 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test14321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14321");
        payment.Payment payment4 = new payment.Payment((long) (short) 0, (double) 100, "hi!", "");
        boolean boolean5 = payment4.paymentCompleted();
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        boolean boolean8 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test14322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14322");
        payment.Payment payment4 = new payment.Payment((-1L), (double) 'a', "hi!", "");
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        boolean boolean11 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test14323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14323");
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
        java.lang.Class<?> wildcardClass14 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test14324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14324");
        payment.Payment payment4 = new payment.Payment((long) 1, (double) 1L, "", "hi!");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        payment.PaymentStrategy paymentStrategy9 = null;
        payment4.setPaymentStrategy(paymentStrategy9);
        java.lang.Class<?> wildcardClass11 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test14325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14325");
        payment.Payment payment4 = new payment.Payment((-1L), (double) 'a', "hi!", "");
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy15 = null;
        payment4.setPaymentStrategy(paymentStrategy15);
        payment4.verifyPaymentDetails();
        payment4.payBalance();
    }

    @Test
    public void test14326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14326");
        payment.Payment payment4 = new payment.Payment(0L, (double) (short) 1, "", "hi!");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        payment4.payDeposit();
        payment4.payBalance();
        payment4.payBalance();
    }

    @Test
    public void test14327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14327");
        payment.Payment payment4 = new payment.Payment(0L, (double) 10.0f, "", "");
        payment4.payBalance();
        boolean boolean6 = payment4.paymentCompleted();
        payment4.payBalance();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test14328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14328");
        payment.Payment payment4 = new payment.Payment((-1L), (double) 'a', "hi!", "");
        payment4.verifyPaymentDetails();
        boolean boolean6 = payment4.paymentCompleted();
        payment4.payDeposit();
        boolean boolean8 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy9 = null;
        payment4.setPaymentStrategy(paymentStrategy9);
        payment4.payBalance();
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        java.lang.Class<?> wildcardClass15 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test14329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14329");
        payment.Payment payment4 = new payment.Payment((-1L), (double) '#', "", "hi!");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        boolean boolean7 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy9 = null;
        payment4.setPaymentStrategy(paymentStrategy9);
        payment.PaymentStrategy paymentStrategy11 = null;
        payment4.setPaymentStrategy(paymentStrategy11);
        java.lang.Class<?> wildcardClass13 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test14330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14330");
        payment.Payment payment4 = new payment.Payment(1L, (double) 10.0f, "hi!", "");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        boolean boolean7 = payment4.paymentCompleted();
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy10 = null;
        payment4.setPaymentStrategy(paymentStrategy10);
        payment.PaymentStrategy paymentStrategy12 = null;
        payment4.setPaymentStrategy(paymentStrategy12);
        boolean boolean14 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test14331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14331");
        payment.Payment payment4 = new payment.Payment((long) '#', (double) 0L, "", "");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy9 = null;
        payment4.setPaymentStrategy(paymentStrategy9);
        payment4.payBalance();
        boolean boolean12 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test14332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14332");
        payment.Payment payment4 = new payment.Payment((long) 100, (double) 0.0f, "hi!", "");
        payment4.verifyPaymentDetails();
        java.lang.Class<?> wildcardClass6 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test14333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14333");
        payment.Payment payment4 = new payment.Payment((long) (short) 100, (double) 10L, "hi!", "");
        payment4.payDeposit();
        payment4.payDeposit();
        payment4.payBalance();
        boolean boolean8 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test14334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14334");
        payment.Payment payment4 = new payment.Payment((-1L), (double) 'a', "hi!", "");
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        boolean boolean8 = payment4.paymentCompleted();
        boolean boolean9 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment4.payBalance();
        boolean boolean12 = payment4.paymentCompleted();
        java.lang.Class<?> wildcardClass13 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test14335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14335");
        payment.Payment payment4 = new payment.Payment((long) ' ', (double) (byte) -1, "hi!", "");
        boolean boolean5 = payment4.paymentCompleted();
        payment4.payBalance();
        boolean boolean7 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        payment4.verifyPaymentDetails();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test14336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14336");
        payment.Payment payment4 = new payment.Payment((long) (-1), (double) (byte) 1, "", "");
        boolean boolean5 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment4.payBalance();
        payment4.payBalance();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test14337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14337");
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
        payment.PaymentStrategy paymentStrategy14 = null;
        payment4.setPaymentStrategy(paymentStrategy14);
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy17 = null;
        payment4.setPaymentStrategy(paymentStrategy17);
        boolean boolean19 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test14338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14338");
        payment.Payment payment4 = new payment.Payment((long) (short) 100, (double) 1L, "hi!", "hi!");
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        boolean boolean7 = payment4.paymentCompleted();
        java.lang.Class<?> wildcardClass8 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test14339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14339");
        payment.Payment payment4 = new payment.Payment((long) (short) 0, (double) 0.0f, "hi!", "");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        boolean boolean10 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test14340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14340");
        payment.Payment payment4 = new payment.Payment((long) ' ', (double) (-1), "hi!", "hi!");
        payment4.payBalance();
        java.lang.Class<?> wildcardClass6 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test14341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14341");
        payment.Payment payment4 = new payment.Payment((long) 10, (double) 100.0f, "", "hi!");
        payment4.payBalance();
        boolean boolean6 = payment4.paymentCompleted();
        java.lang.Class<?> wildcardClass7 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test14342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14342");
        payment.Payment payment4 = new payment.Payment(0L, 10.0d, "", "hi!");
        boolean boolean5 = payment4.paymentCompleted();
        boolean boolean6 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test14343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14343");
        payment.Payment payment4 = new payment.Payment((long) (short) 1, (double) (short) 100, "hi!", "hi!");
        boolean boolean5 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        java.lang.Class<?> wildcardClass10 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test14344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14344");
        payment.Payment payment4 = new payment.Payment(100L, (double) (byte) 100, "", "");
        boolean boolean5 = payment4.paymentCompleted();
        java.lang.Class<?> wildcardClass6 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test14345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14345");
        payment.Payment payment4 = new payment.Payment(100L, (double) (byte) 0, "hi!", "");
        payment4.payBalance();
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
    }

    @Test
    public void test14346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14346");
        payment.Payment payment4 = new payment.Payment(10L, 100.0d, "", "");
        boolean boolean5 = payment4.paymentCompleted();
        boolean boolean6 = payment4.paymentCompleted();
        boolean boolean7 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        boolean boolean10 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy12 = null;
        payment4.setPaymentStrategy(paymentStrategy12);
        payment.PaymentStrategy paymentStrategy14 = null;
        payment4.setPaymentStrategy(paymentStrategy14);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test14347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14347");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) (byte) 10, "", "");
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy11 = null;
        payment4.setPaymentStrategy(paymentStrategy11);
        payment4.payDeposit();
        payment4.payDeposit();
        boolean boolean15 = payment4.paymentCompleted();
        boolean boolean16 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test14348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14348");
        payment.Payment payment4 = new payment.Payment(1L, 100.0d, "hi!", "hi!");
        payment4.payBalance();
    }

    @Test
    public void test14349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14349");
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
        boolean boolean15 = payment4.paymentCompleted();
        boolean boolean16 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment4.payBalance();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test14350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14350");
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
        payment4.payDeposit();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy16 = null;
        payment4.setPaymentStrategy(paymentStrategy16);
        payment.PaymentStrategy paymentStrategy18 = null;
        payment4.setPaymentStrategy(paymentStrategy18);
        payment4.payDeposit();
        boolean boolean21 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test14351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14351");
        payment.Payment payment4 = new payment.Payment((-1L), (double) (byte) 0, "hi!", "");
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
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
        boolean boolean17 = payment4.paymentCompleted();
        boolean boolean18 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        boolean boolean20 = payment4.paymentCompleted();
        java.lang.Class<?> wildcardClass21 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test14352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14352");
        payment.Payment payment4 = new payment.Payment((-1L), (double) 'a', "hi!", "");
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy11 = null;
        payment4.setPaymentStrategy(paymentStrategy11);
        payment.PaymentStrategy paymentStrategy13 = null;
        payment4.setPaymentStrategy(paymentStrategy13);
        payment4.payDeposit();
        java.lang.Class<?> wildcardClass16 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test14353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14353");
        payment.Payment payment4 = new payment.Payment((long) 1, 1.0d, "hi!", "hi!");
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        boolean boolean8 = payment4.paymentCompleted();
        payment4.payBalance();
        boolean boolean10 = payment4.paymentCompleted();
        boolean boolean11 = payment4.paymentCompleted();
        payment4.payBalance();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy14 = null;
        payment4.setPaymentStrategy(paymentStrategy14);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test14354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14354");
        payment.Payment payment4 = new payment.Payment((long) ' ', (double) 100L, "hi!", "");
        boolean boolean5 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        payment4.payBalance();
        boolean boolean10 = payment4.paymentCompleted();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy12 = null;
        payment4.setPaymentStrategy(paymentStrategy12);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test14355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14355");
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
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
    }

    @Test
    public void test14356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14356");
        payment.Payment payment4 = new payment.Payment(10L, (double) 10, "", "");
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment4.payBalance();
    }

    @Test
    public void test14357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14357");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) (byte) 10, "", "");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment4.payDeposit();
    }

    @Test
    public void test14358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14358");
        payment.Payment payment4 = new payment.Payment(0L, (double) 10L, "hi!", "");
        java.lang.Class<?> wildcardClass5 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test14359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14359");
        payment.Payment payment4 = new payment.Payment(0L, (double) 10.0f, "hi!", "hi!");
        boolean boolean5 = payment4.paymentCompleted();
        boolean boolean6 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        payment4.payDeposit();
        payment4.payBalance();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test14360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14360");
        payment.Payment payment4 = new payment.Payment((long) '#', (double) 0L, "", "");
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
    }

    @Test
    public void test14361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14361");
        payment.Payment payment4 = new payment.Payment(100L, (double) (byte) 10, "", "");
        payment4.payBalance();
    }

    @Test
    public void test14362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14362");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) 0.0f, "", "");
        boolean boolean5 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment4.payDeposit();
        java.lang.Class<?> wildcardClass8 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test14363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14363");
        payment.Payment payment4 = new payment.Payment((-1L), (double) 'a', "hi!", "");
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        boolean boolean8 = payment4.paymentCompleted();
        payment4.payBalance();
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy12 = null;
        payment4.setPaymentStrategy(paymentStrategy12);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test14364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14364");
        payment.Payment payment4 = new payment.Payment((long) (byte) -1, (double) 10, "hi!", "hi!");
        boolean boolean5 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        boolean boolean8 = payment4.paymentCompleted();
        payment4.payBalance();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test14365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14365");
        payment.Payment payment4 = new payment.Payment((long) (byte) 10, 10.0d, "", "hi!");
        payment4.payBalance();
        payment4.payDeposit();
    }

    @Test
    public void test14366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14366");
        payment.Payment payment4 = new payment.Payment((long) (byte) 0, 100.0d, "", "");
        payment4.payDeposit();
        payment4.payBalance();
        payment4.payDeposit();
        boolean boolean8 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test14367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14367");
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
        payment4.payDeposit();
        payment4.payDeposit();
        boolean boolean16 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test14368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14368");
        payment.Payment payment4 = new payment.Payment((long) (short) 10, (double) (byte) -1, "", "");
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        boolean boolean7 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test14369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14369");
        payment.Payment payment4 = new payment.Payment((long) (byte) -1, 10.0d, "hi!", "");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        payment.PaymentStrategy paymentStrategy10 = null;
        payment4.setPaymentStrategy(paymentStrategy10);
    }

    @Test
    public void test14370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14370");
        payment.Payment payment4 = new payment.Payment((-1L), (double) 'a', "hi!", "");
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment4.payBalance();
        payment4.payDeposit();
        payment4.payDeposit();
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        boolean boolean14 = payment4.paymentCompleted();
        boolean boolean15 = payment4.paymentCompleted();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy17 = null;
        payment4.setPaymentStrategy(paymentStrategy17);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test14371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14371");
        payment.Payment payment4 = new payment.Payment((long) (-1), (double) 0, "hi!", "");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment4.payBalance();
        boolean boolean8 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test14372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14372");
        payment.Payment payment4 = new payment.Payment((long) (short) 1, 10.0d, "", "hi!");
        payment4.payDeposit();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        java.lang.Class<?> wildcardClass8 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test14373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14373");
        payment.Payment payment4 = new payment.Payment((long) (short) 0, (double) (short) 100, "hi!", "");
        boolean boolean5 = payment4.paymentCompleted();
        boolean boolean6 = payment4.paymentCompleted();
        payment4.payBalance();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test14374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14374");
        payment.Payment payment4 = new payment.Payment((-1L), (double) 'a', "hi!", "");
        payment4.payBalance();
        payment4.payBalance();
        boolean boolean7 = payment4.paymentCompleted();
        boolean boolean8 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment4.payBalance();
        payment4.payDeposit();
        boolean boolean12 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test14375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14375");
        payment.Payment payment4 = new payment.Payment((long) 10, (double) (-1), "hi!", "");
        boolean boolean5 = payment4.paymentCompleted();
        boolean boolean6 = payment4.paymentCompleted();
        payment4.payDeposit();
        boolean boolean8 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test14376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14376");
        payment.Payment payment4 = new payment.Payment((-1L), (double) '#', "", "hi!");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        boolean boolean7 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test14377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14377");
        payment.Payment payment4 = new payment.Payment((long) (short) -1, (double) (short) 1, "hi!", "hi!");
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        boolean boolean8 = payment4.paymentCompleted();
        java.lang.Class<?> wildcardClass9 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test14378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14378");
        payment.Payment payment4 = new payment.Payment((long) (byte) 10, (double) 10.0f, "", "");
        java.lang.Class<?> wildcardClass5 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test14379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14379");
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
        boolean boolean18 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment4.payDeposit();
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test14380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14380");
        payment.Payment payment4 = new payment.Payment((long) '4', 100.0d, "hi!", "hi!");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        java.lang.Class<?> wildcardClass7 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test14381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14381");
        payment.Payment payment4 = new payment.Payment(100L, (double) (short) 0, "hi!", "hi!");
        boolean boolean5 = payment4.paymentCompleted();
        payment4.payDeposit();
        boolean boolean7 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        boolean boolean10 = payment4.paymentCompleted();
        java.lang.Class<?> wildcardClass11 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test14382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14382");
        payment.Payment payment4 = new payment.Payment((long) (short) 10, (double) (short) 100, "", "");
        java.lang.Class<?> wildcardClass5 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test14383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14383");
        payment.Payment payment4 = new payment.Payment((long) 'a', (double) 1L, "", "hi!");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment4.payDeposit();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy9 = null;
        payment4.setPaymentStrategy(paymentStrategy9);
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy12 = null;
        payment4.setPaymentStrategy(paymentStrategy12);
    }

    @Test
    public void test14384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14384");
        payment.Payment payment4 = new payment.Payment((long) (-1), (double) '#', "", "");
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment4.payDeposit();
        boolean boolean12 = payment4.paymentCompleted();
        boolean boolean13 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test14385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14385");
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
        payment4.payBalance();
        boolean boolean15 = payment4.paymentCompleted();
        boolean boolean16 = payment4.paymentCompleted();
        boolean boolean17 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test14386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14386");
        payment.Payment payment4 = new payment.Payment((long) (short) -1, (double) (short) 1, "hi!", "hi!");
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment4.payDeposit();
        payment4.payDeposit();
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        java.lang.Class<?> wildcardClass13 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test14387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14387");
        payment.Payment payment4 = new payment.Payment((long) (short) -1, (double) (byte) 100, "", "hi!");
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        java.lang.Class<?> wildcardClass9 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test14388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14388");
        payment.Payment payment4 = new payment.Payment((long) (-1), (double) (byte) -1, "", "hi!");
        payment4.payDeposit();
        payment4.payBalance();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        boolean boolean10 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test14389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14389");
        payment.Payment payment4 = new payment.Payment((long) (byte) -1, (double) (short) 100, "", "hi!");
        boolean boolean5 = payment4.paymentCompleted();
        payment4.payBalance();
        payment4.payBalance();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test14390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14390");
        payment.Payment payment4 = new payment.Payment(0L, (double) (short) 1, "", "hi!");
        payment4.payDeposit();
        payment4.payBalance();
        boolean boolean7 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test14391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14391");
        payment.Payment payment4 = new payment.Payment((long) (short) 1, (double) (short) 0, "hi!", "");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        boolean boolean10 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy11 = null;
        payment4.setPaymentStrategy(paymentStrategy11);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test14392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14392");
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
        boolean boolean15 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test14393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14393");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) (byte) 10, "", "");
        payment4.payDeposit();
        boolean boolean6 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment4.payDeposit();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment4.payDeposit();
        payment4.payDeposit();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test14394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14394");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) (byte) 10, "", "");
        payment4.verifyPaymentDetails();
        boolean boolean6 = payment4.paymentCompleted();
        payment4.payDeposit();
        java.lang.Class<?> wildcardClass8 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test14395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14395");
        payment.Payment payment4 = new payment.Payment((long) (short) -1, (double) (short) 1, "hi!", "hi!");
        payment4.verifyPaymentDetails();
        boolean boolean6 = payment4.paymentCompleted();
        payment4.payBalance();
        boolean boolean8 = payment4.paymentCompleted();
        payment4.payBalance();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy12 = null;
        payment4.setPaymentStrategy(paymentStrategy12);
        payment4.payDeposit();
        boolean boolean15 = payment4.paymentCompleted();
        java.lang.Class<?> wildcardClass16 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test14396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14396");
        payment.Payment payment4 = new payment.Payment((long) (-1), (double) 1L, "", "");
        payment4.payBalance();
        payment4.payBalance();
        boolean boolean7 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        boolean boolean10 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        java.lang.Class<?> wildcardClass13 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test14397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14397");
        payment.Payment payment4 = new payment.Payment((long) (short) 0, (double) '#', "", "");
        boolean boolean5 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        boolean boolean12 = payment4.paymentCompleted();
        payment4.payBalance();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test14398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14398");
        payment.Payment payment4 = new payment.Payment((long) (-1), (double) (short) -1, "hi!", "");
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        boolean boolean8 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test14399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14399");
        payment.Payment payment4 = new payment.Payment((long) (byte) -1, (double) (-1L), "hi!", "hi!");
        payment4.payDeposit();
        payment4.payBalance();
        payment4.payBalance();
        payment4.payBalance();
        payment4.payBalance();
    }

    @Test
    public void test14400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14400");
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
        payment.PaymentStrategy paymentStrategy22 = null;
        payment4.setPaymentStrategy(paymentStrategy22);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test14401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14401");
        payment.Payment payment4 = new payment.Payment((long) (short) 10, (double) 0.0f, "hi!", "");
        payment4.verifyPaymentDetails();
        boolean boolean6 = payment4.paymentCompleted();
        boolean boolean7 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test14402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14402");
        payment.Payment payment4 = new payment.Payment(10L, (double) (short) -1, "", "");
        payment4.verifyPaymentDetails();
    }

    @Test
    public void test14403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14403");
        payment.Payment payment4 = new payment.Payment((long) (byte) 1, (double) (byte) 0, "hi!", "");
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        payment4.payDeposit();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy9 = null;
        payment4.setPaymentStrategy(paymentStrategy9);
        boolean boolean11 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test14404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14404");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) (byte) 10, "", "");
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy11 = null;
        payment4.setPaymentStrategy(paymentStrategy11);
    }

    @Test
    public void test14405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14405");
        payment.Payment payment4 = new payment.Payment((-1L), (double) '#', "", "hi!");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy9 = null;
        payment4.setPaymentStrategy(paymentStrategy9);
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy13 = null;
        payment4.setPaymentStrategy(paymentStrategy13);
        payment.PaymentStrategy paymentStrategy15 = null;
        payment4.setPaymentStrategy(paymentStrategy15);
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
    }

    @Test
    public void test14406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14406");
        payment.Payment payment4 = new payment.Payment((long) (byte) -1, (double) (short) 100, "", "hi!");
        boolean boolean5 = payment4.paymentCompleted();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy10 = null;
        payment4.setPaymentStrategy(paymentStrategy10);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test14407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14407");
        payment.Payment payment4 = new payment.Payment((long) (byte) -1, (double) 100, "", "");
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment4.payBalance();
        boolean boolean9 = payment4.paymentCompleted();
        boolean boolean10 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test14408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14408");
        payment.Payment payment4 = new payment.Payment((long) 'a', (double) 100L, "hi!", "hi!");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        payment.PaymentStrategy paymentStrategy9 = null;
        payment4.setPaymentStrategy(paymentStrategy9);
    }

    @Test
    public void test14409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14409");
        payment.Payment payment4 = new payment.Payment((long) '#', (double) 0L, "", "");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment4.payBalance();
        payment4.payBalance();
        java.lang.Class<?> wildcardClass9 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test14410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14410");
        payment.Payment payment4 = new payment.Payment((long) ' ', (double) (byte) 10, "", "");
        boolean boolean5 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test14411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14411");
        payment.Payment payment4 = new payment.Payment((long) (short) 10, (double) 10, "hi!", "");
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        boolean boolean8 = payment4.paymentCompleted();
        java.lang.Class<?> wildcardClass9 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test14412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14412");
        payment.Payment payment4 = new payment.Payment((long) (short) -1, (double) (-1L), "", "");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment4.payBalance();
        payment4.payBalance();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
    }

    @Test
    public void test14413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14413");
        payment.Payment payment4 = new payment.Payment(1L, (double) '#', "hi!", "");
    }

    @Test
    public void test14414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14414");
        payment.Payment payment4 = new payment.Payment((-1L), (double) 'a', "hi!", "");
        payment4.verifyPaymentDetails();
        boolean boolean6 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        payment4.payBalance();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy12 = null;
        payment4.setPaymentStrategy(paymentStrategy12);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test14415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14415");
        payment.Payment payment4 = new payment.Payment(0L, (double) 0L, "hi!", "hi!");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        boolean boolean7 = payment4.paymentCompleted();
        payment4.payDeposit();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test14416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14416");
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
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
    }

    @Test
    public void test14417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14417");
        payment.Payment payment4 = new payment.Payment((long) (byte) -1, (double) (short) -1, "", "");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        boolean boolean10 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test14418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14418");
        payment.Payment payment4 = new payment.Payment((long) 100, (double) 100.0f, "", "");
        boolean boolean5 = payment4.paymentCompleted();
        payment4.payBalance();
        payment4.payBalance();
        boolean boolean8 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test14419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14419");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) (byte) 10, "", "");
        payment4.payBalance();
        boolean boolean6 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        boolean boolean16 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy17 = null;
        payment4.setPaymentStrategy(paymentStrategy17);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test14420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14420");
        payment.Payment payment4 = new payment.Payment((long) (short) 10, (double) 'a', "", "hi!");
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        java.lang.Class<?> wildcardClass7 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test14421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14421");
        payment.Payment payment4 = new payment.Payment((long) 100, (double) (short) 1, "hi!", "");
        boolean boolean5 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test14422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14422");
        payment.Payment payment4 = new payment.Payment((long) (byte) 10, (double) 0L, "", "");
        payment4.verifyPaymentDetails();
        payment4.payBalance();
    }

    @Test
    public void test14423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14423");
        payment.Payment payment4 = new payment.Payment((long) '#', (double) 0L, "", "");
        payment4.payBalance();
        payment4.payBalance();
        boolean boolean7 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        payment.PaymentStrategy paymentStrategy10 = null;
        payment4.setPaymentStrategy(paymentStrategy10);
        payment4.payDeposit();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test14424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14424");
        payment.Payment payment4 = new payment.Payment((long) 100, (double) 100L, "", "hi!");
        payment4.payBalance();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        boolean boolean9 = payment4.paymentCompleted();
        java.lang.Class<?> wildcardClass10 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test14425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14425");
        payment.Payment payment4 = new payment.Payment((long) (-1), (double) (short) -1, "hi!", "");
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        boolean boolean12 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy13 = null;
        payment4.setPaymentStrategy(paymentStrategy13);
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy17 = null;
        payment4.setPaymentStrategy(paymentStrategy17);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test14426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14426");
        payment.Payment payment4 = new payment.Payment((-1L), (double) (byte) 0, "hi!", "");
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        boolean boolean7 = payment4.paymentCompleted();
        payment4.payBalance();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy10 = null;
        payment4.setPaymentStrategy(paymentStrategy10);
        boolean boolean12 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        boolean boolean14 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test14427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14427");
        payment.Payment payment4 = new payment.Payment((-1L), (double) (byte) 0, "hi!", "");
        payment4.payBalance();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        payment.PaymentStrategy paymentStrategy9 = null;
        payment4.setPaymentStrategy(paymentStrategy9);
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy13 = null;
        payment4.setPaymentStrategy(paymentStrategy13);
        payment.PaymentStrategy paymentStrategy15 = null;
        payment4.setPaymentStrategy(paymentStrategy15);
        boolean boolean17 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy19 = null;
        payment4.setPaymentStrategy(paymentStrategy19);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test14428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14428");
        payment.Payment payment4 = new payment.Payment((long) 'a', (double) 1L, "", "hi!");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        boolean boolean7 = payment4.paymentCompleted();
        payment4.payBalance();
        payment4.payDeposit();
        boolean boolean10 = payment4.paymentCompleted();
        boolean boolean11 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy12 = null;
        payment4.setPaymentStrategy(paymentStrategy12);
        payment4.payBalance();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test14429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14429");
        payment.Payment payment4 = new payment.Payment((long) (-1), 10.0d, "", "hi!");
        boolean boolean5 = payment4.paymentCompleted();
        payment4.payBalance();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test14430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14430");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) (byte) 10, "", "");
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment4.payDeposit();
        payment4.payDeposit();
        payment4.payDeposit();
        java.lang.Class<?> wildcardClass11 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test14431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14431");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) (byte) 10, "", "");
        payment4.payBalance();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
    }

    @Test
    public void test14432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14432");
        payment.Payment payment4 = new payment.Payment((long) '#', (double) 0L, "", "");
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
    }

    @Test
    public void test14433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14433");
        payment.Payment payment4 = new payment.Payment((long) 'a', (double) '#', "hi!", "hi!");
        payment4.verifyPaymentDetails();
        java.lang.Class<?> wildcardClass6 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test14434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14434");
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
        java.lang.Class<?> wildcardClass16 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test14435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14435");
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
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy18 = null;
        payment4.setPaymentStrategy(paymentStrategy18);
        payment4.payBalance();
        boolean boolean21 = payment4.paymentCompleted();
        boolean boolean22 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test14436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14436");
        payment.Payment payment4 = new payment.Payment((long) 1, (double) '#', "", "hi!");
        boolean boolean5 = payment4.paymentCompleted();
        payment4.payDeposit();
        java.lang.Class<?> wildcardClass7 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test14437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14437");
        payment.Payment payment4 = new payment.Payment((long) (short) -1, 0.0d, "hi!", "hi!");
        boolean boolean5 = payment4.paymentCompleted();
        boolean boolean6 = payment4.paymentCompleted();
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        boolean boolean10 = payment4.paymentCompleted();
        payment4.payDeposit();
        boolean boolean12 = payment4.paymentCompleted();
        payment4.payBalance();
        boolean boolean14 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test14438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14438");
        payment.Payment payment4 = new payment.Payment((-1L), (double) 'a', "hi!", "");
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy10 = null;
        payment4.setPaymentStrategy(paymentStrategy10);
        payment.PaymentStrategy paymentStrategy12 = null;
        payment4.setPaymentStrategy(paymentStrategy12);
    }

    @Test
    public void test14439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14439");
        payment.Payment payment4 = new payment.Payment((long) '#', (double) 0L, "", "");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment4.payDeposit();
        java.lang.Class<?> wildcardClass8 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test14440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14440");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) (byte) 10, "", "");
        payment4.payDeposit();
        boolean boolean6 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy9 = null;
        payment4.setPaymentStrategy(paymentStrategy9);
        boolean boolean11 = payment4.paymentCompleted();
        boolean boolean12 = payment4.paymentCompleted();
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy15 = null;
        payment4.setPaymentStrategy(paymentStrategy15);
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        boolean boolean19 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test14441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14441");
        payment.Payment payment4 = new payment.Payment((long) (-1), (double) 1L, "", "");
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        boolean boolean7 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        payment4.payDeposit();
        boolean boolean11 = payment4.paymentCompleted();
        boolean boolean12 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy13 = null;
        payment4.setPaymentStrategy(paymentStrategy13);
        boolean boolean15 = payment4.paymentCompleted();
        payment4.payBalance();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test14442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14442");
        payment.Payment payment4 = new payment.Payment((long) (short) -1, (double) (-1.0f), "", "hi!");
        java.lang.Class<?> wildcardClass5 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test14443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14443");
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
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        boolean boolean16 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy17 = null;
        payment4.setPaymentStrategy(paymentStrategy17);
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy20 = null;
        payment4.setPaymentStrategy(paymentStrategy20);
        payment.PaymentStrategy paymentStrategy22 = null;
        payment4.setPaymentStrategy(paymentStrategy22);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test14444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14444");
        payment.Payment payment4 = new payment.Payment(100L, (double) 100L, "hi!", "");
        boolean boolean5 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test14445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14445");
        payment.Payment payment4 = new payment.Payment((long) (short) -1, (double) (short) 1, "hi!", "hi!");
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment4.payDeposit();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy10 = null;
        payment4.setPaymentStrategy(paymentStrategy10);
        payment4.payDeposit();
        payment4.payDeposit();
        payment4.payBalance();
        boolean boolean15 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test14446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14446");
        payment.Payment payment4 = new payment.Payment((long) (short) 1, (double) 100L, "", "hi!");
        payment4.payDeposit();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        java.lang.Class<?> wildcardClass9 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test14447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14447");
        payment.Payment payment4 = new payment.Payment((long) 'a', 0.0d, "", "");
        boolean boolean5 = payment4.paymentCompleted();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy10 = null;
        payment4.setPaymentStrategy(paymentStrategy10);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test14448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14448");
        payment.Payment payment4 = new payment.Payment((-1L), (double) 'a', "hi!", "");
        payment4.payBalance();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
    }

    @Test
    public void test14449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14449");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) (byte) 10, "", "");
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        payment.PaymentStrategy paymentStrategy10 = null;
        payment4.setPaymentStrategy(paymentStrategy10);
        payment4.verifyPaymentDetails();
        payment4.payBalance();
    }

    @Test
    public void test14450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14450");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) (short) 0, "", "");
        payment4.payBalance();
        boolean boolean6 = payment4.paymentCompleted();
        boolean boolean7 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy14 = null;
        payment4.setPaymentStrategy(paymentStrategy14);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test14451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14451");
        payment.Payment payment4 = new payment.Payment((long) 1, (double) 100L, "hi!", "");
    }

    @Test
    public void test14452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14452");
        payment.Payment payment4 = new payment.Payment((long) (short) -1, (double) (-1L), "hi!", "");
    }

    @Test
    public void test14453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14453");
        payment.Payment payment4 = new payment.Payment((-1L), 0.0d, "", "hi!");
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
    }

    @Test
    public void test14454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14454");
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
        boolean boolean15 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        java.lang.Class<?> wildcardClass17 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test14455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14455");
        payment.Payment payment4 = new payment.Payment((long) (-1), (double) (short) -1, "hi!", "");
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy11 = null;
        payment4.setPaymentStrategy(paymentStrategy11);
        payment4.verifyPaymentDetails();
        java.lang.Class<?> wildcardClass14 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test14456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14456");
        payment.Payment payment4 = new payment.Payment((long) 'a', 100.0d, "hi!", "hi!");
        payment4.verifyPaymentDetails();
        java.lang.Class<?> wildcardClass6 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test14457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14457");
        payment.Payment payment4 = new payment.Payment((long) (byte) 1, (double) 1.0f, "hi!", "hi!");
    }

    @Test
    public void test14458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14458");
        payment.Payment payment4 = new payment.Payment((long) 10, (double) 0.0f, "hi!", "");
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
    }

    @Test
    public void test14459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14459");
        payment.Payment payment4 = new payment.Payment(0L, (double) 0, "", "hi!");
        boolean boolean5 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test14460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14460");
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
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy19 = null;
        payment4.setPaymentStrategy(paymentStrategy19);
    }

    @Test
    public void test14461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14461");
        payment.Payment payment4 = new payment.Payment((long) '#', (double) 0L, "", "");
        payment4.payBalance();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
    }

    @Test
    public void test14462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14462");
        payment.Payment payment4 = new payment.Payment((long) (byte) 10, (double) (short) -1, "hi!", "hi!");
        payment4.payDeposit();
        boolean boolean6 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test14463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14463");
        payment.Payment payment4 = new payment.Payment((long) 10, (double) 10L, "", "hi!");
        payment4.verifyPaymentDetails();
    }

    @Test
    public void test14464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14464");
        payment.Payment payment4 = new payment.Payment((-1L), (double) (byte) 0, "hi!", "");
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment4.payDeposit();
        payment4.payDeposit();
        java.lang.Class<?> wildcardClass13 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test14465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14465");
        payment.Payment payment4 = new payment.Payment(100L, (double) (short) -1, "hi!", "");
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        payment4.payBalance();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy13 = null;
        payment4.setPaymentStrategy(paymentStrategy13);
        java.lang.Class<?> wildcardClass15 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test14466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14466");
        payment.Payment payment4 = new payment.Payment((long) (short) 0, (double) 0L, "", "hi!");
        boolean boolean5 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment4.payDeposit();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test14467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14467");
        payment.Payment payment4 = new payment.Payment(100L, (double) (short) -1, "hi!", "");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment4.payDeposit();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy9 = null;
        payment4.setPaymentStrategy(paymentStrategy9);
    }

    @Test
    public void test14468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14468");
        payment.Payment payment4 = new payment.Payment((long) (short) 1, (double) 10, "hi!", "hi!");
        boolean boolean5 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test14469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14469");
        payment.Payment payment4 = new payment.Payment((long) (byte) -1, (double) 1, "", "hi!");
        payment4.payDeposit();
        payment4.payDeposit();
        payment4.payBalance();
        boolean boolean8 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test14470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14470");
        payment.Payment payment4 = new payment.Payment((long) (byte) 100, 0.0d, "", "");
        payment4.payDeposit();
        payment4.payBalance();
        boolean boolean7 = payment4.paymentCompleted();
        payment4.payBalance();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test14471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14471");
        payment.Payment payment4 = new payment.Payment((long) (short) -1, (double) (short) 0, "hi!", "hi!");
        payment4.payDeposit();
    }

    @Test
    public void test14472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14472");
        payment.Payment payment4 = new payment.Payment((long) (short) -1, 10.0d, "", "");
        java.lang.Class<?> wildcardClass5 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test14473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14473");
        payment.Payment payment4 = new payment.Payment((long) '#', 1.0d, "", "");
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
    }

    @Test
    public void test14474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14474");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) (byte) 10, "", "");
        payment4.payBalance();
        boolean boolean6 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        boolean boolean9 = payment4.paymentCompleted();
        boolean boolean10 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy12 = null;
        payment4.setPaymentStrategy(paymentStrategy12);
        boolean boolean14 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test14475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14475");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) 'a', "", "hi!");
        payment4.payBalance();
        payment4.payDeposit();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        payment4.payBalance();
        java.lang.Class<?> wildcardClass11 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test14476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14476");
        payment.Payment payment4 = new payment.Payment((long) 100, (double) 0.0f, "hi!", "");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
    }

    @Test
    public void test14477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14477");
        payment.Payment payment4 = new payment.Payment((long) (short) 100, (double) 100L, "hi!", "hi!");
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
    }

    @Test
    public void test14478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14478");
        payment.Payment payment4 = new payment.Payment(10L, (double) (short) -1, "", "hi!");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
    }

    @Test
    public void test14479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14479");
        payment.Payment payment4 = new payment.Payment((long) (short) 1, (double) (short) 100, "hi!", "hi!");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment4.payDeposit();
        payment4.payBalance();
        payment4.payBalance();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy11 = null;
        payment4.setPaymentStrategy(paymentStrategy11);
    }

    @Test
    public void test14480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14480");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) (byte) 10, "", "");
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        boolean boolean10 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        boolean boolean12 = payment4.paymentCompleted();
        java.lang.Class<?> wildcardClass13 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test14481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14481");
        payment.Payment payment4 = new payment.Payment(10L, 100.0d, "", "");
        payment4.payBalance();
        java.lang.Class<?> wildcardClass6 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test14482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14482");
        payment.Payment payment4 = new payment.Payment((long) '4', (double) '4', "", "hi!");
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        payment4.payBalance();
    }

    @Test
    public void test14483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14483");
        payment.Payment payment4 = new payment.Payment((-1L), (double) 'a', "hi!", "");
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        boolean boolean8 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy9 = null;
        payment4.setPaymentStrategy(paymentStrategy9);
        payment4.payDeposit();
        payment4.payDeposit();
        boolean boolean13 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy14 = null;
        payment4.setPaymentStrategy(paymentStrategy14);
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test14484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14484");
        payment.Payment payment4 = new payment.Payment((long) ' ', (double) (byte) -1, "", "");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        boolean boolean7 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        boolean boolean10 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test14485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14485");
        payment.Payment payment4 = new payment.Payment((long) '#', (double) 1.0f, "", "");
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        payment4.payBalance();
    }

    @Test
    public void test14486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14486");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) (byte) 10, "", "");
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        payment4.verifyPaymentDetails();
        boolean boolean11 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy12 = null;
        payment4.setPaymentStrategy(paymentStrategy12);
        payment4.payDeposit();
        payment4.payBalance();
        payment4.payDeposit();
        boolean boolean17 = payment4.paymentCompleted();
        payment4.payBalance();
        java.lang.Class<?> wildcardClass19 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test14487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14487");
        payment.Payment payment4 = new payment.Payment((long) (short) 100, (-1.0d), "", "");
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        java.lang.Class<?> wildcardClass8 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test14488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14488");
        payment.Payment payment4 = new payment.Payment((long) (byte) 100, (double) (short) 1, "", "hi!");
    }

    @Test
    public void test14489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14489");
        payment.Payment payment4 = new payment.Payment((long) ' ', (double) 100, "hi!", "");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment4.payBalance();
        payment4.payDeposit();
    }

    @Test
    public void test14490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14490");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) (byte) 10, "", "");
        payment4.payBalance();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy13 = null;
        payment4.setPaymentStrategy(paymentStrategy13);
        boolean boolean15 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy17 = null;
        payment4.setPaymentStrategy(paymentStrategy17);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test14491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14491");
        payment.Payment payment4 = new payment.Payment((long) (short) 100, (double) '#', "hi!", "hi!");
        payment4.verifyPaymentDetails();
        boolean boolean6 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        java.lang.Class<?> wildcardClass11 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test14492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14492");
        payment.Payment payment4 = new payment.Payment((long) (-1), (double) 10.0f, "hi!", "hi!");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy10 = null;
        payment4.setPaymentStrategy(paymentStrategy10);
        payment.PaymentStrategy paymentStrategy12 = null;
        payment4.setPaymentStrategy(paymentStrategy12);
        boolean boolean14 = payment4.paymentCompleted();
        payment4.payBalance();
        java.lang.Class<?> wildcardClass16 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test14493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14493");
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
        payment4.verifyPaymentDetails();
        boolean boolean15 = payment4.paymentCompleted();
        payment4.payBalance();
        boolean boolean17 = payment4.paymentCompleted();
        payment4.payBalance();
        payment4.payDeposit();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test14494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14494");
        payment.Payment payment4 = new payment.Payment((-1L), (double) 0L, "hi!", "hi!");
        payment4.payBalance();
        payment4.payDeposit();
    }

    @Test
    public void test14495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14495");
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
        payment4.payDeposit();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test14496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14496");
        payment.Payment payment4 = new payment.Payment((long) '4', (double) (-1.0f), "", "");
        boolean boolean5 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test14497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14497");
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
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy20 = null;
        payment4.setPaymentStrategy(paymentStrategy20);
        java.lang.Class<?> wildcardClass22 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test14498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14498");
        payment.Payment payment4 = new payment.Payment((long) (byte) 0, (double) 100L, "hi!", "");
        payment4.verifyPaymentDetails();
        java.lang.Class<?> wildcardClass6 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test14499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14499");
        payment.Payment payment4 = new payment.Payment((long) 'a', (double) 1L, "", "hi!");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        boolean boolean7 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        boolean boolean9 = payment4.paymentCompleted();
        boolean boolean10 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy11 = null;
        payment4.setPaymentStrategy(paymentStrategy11);
        boolean boolean13 = payment4.paymentCompleted();
        boolean boolean14 = payment4.paymentCompleted();
        boolean boolean15 = payment4.paymentCompleted();
        payment4.payDeposit();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test14500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14500");
        payment.Payment payment4 = new payment.Payment((long) (-1), (double) (byte) 1, "", "");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment4.payBalance();
        payment4.payDeposit();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
    }
}

