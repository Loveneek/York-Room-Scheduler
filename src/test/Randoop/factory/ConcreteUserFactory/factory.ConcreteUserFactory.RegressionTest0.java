import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

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
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test01");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        factory.ConcreteUserFactory concreteUserFactory0 = new factory.ConcreteUserFactory();
        java.lang.Class<?> wildcardClass1 = concreteUserFactory0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        factory.ConcreteUserFactory concreteUserFactory0 = new factory.ConcreteUserFactory();
        // The following exception was thrown during execution in test generation
        try {
            model.User user5 = concreteUserFactory0.createUser("hi!", "", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown user type: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        factory.ConcreteUserFactory concreteUserFactory0 = new factory.ConcreteUserFactory();
        // The following exception was thrown during execution in test generation
        try {
            model.User user5 = concreteUserFactory0.createUser("", "hi!", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown user type: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        factory.ConcreteUserFactory concreteUserFactory0 = new factory.ConcreteUserFactory();
        // The following exception was thrown during execution in test generation
        try {
            model.User user5 = concreteUserFactory0.createUser("", "hi!", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown user type: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        factory.ConcreteUserFactory concreteUserFactory0 = new factory.ConcreteUserFactory();
        // The following exception was thrown during execution in test generation
        try {
            model.User user5 = concreteUserFactory0.createUser("hi!", "hi!", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown user type: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        factory.ConcreteUserFactory concreteUserFactory0 = new factory.ConcreteUserFactory();
        // The following exception was thrown during execution in test generation
        try {
            model.User user5 = concreteUserFactory0.createUser("", "hi!", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown user type: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        factory.ConcreteUserFactory concreteUserFactory0 = new factory.ConcreteUserFactory();
        // The following exception was thrown during execution in test generation
        try {
            model.User user5 = concreteUserFactory0.createUser("hi!", "", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown user type: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        factory.ConcreteUserFactory concreteUserFactory0 = new factory.ConcreteUserFactory();
        // The following exception was thrown during execution in test generation
        try {
            model.User user5 = concreteUserFactory0.createUser("hi!", "hi!", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown user type: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        factory.ConcreteUserFactory concreteUserFactory0 = new factory.ConcreteUserFactory();
        // The following exception was thrown during execution in test generation
        try {
            model.User user5 = concreteUserFactory0.createUser("", "", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown user type: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        factory.ConcreteUserFactory concreteUserFactory0 = new factory.ConcreteUserFactory();
        // The following exception was thrown during execution in test generation
        try {
            model.User user5 = concreteUserFactory0.createUser("hi!", "hi!", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown user type: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        factory.ConcreteUserFactory concreteUserFactory0 = new factory.ConcreteUserFactory();
        // The following exception was thrown during execution in test generation
        try {
            model.User user5 = concreteUserFactory0.createUser("", "", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown user type: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        factory.ConcreteUserFactory concreteUserFactory0 = new factory.ConcreteUserFactory();
        // The following exception was thrown during execution in test generation
        try {
            model.User user5 = concreteUserFactory0.createUser("hi!", "hi!", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown user type: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        factory.ConcreteUserFactory concreteUserFactory0 = new factory.ConcreteUserFactory();
        // The following exception was thrown during execution in test generation
        try {
            model.User user5 = concreteUserFactory0.createUser("hi!", "", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown user type: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        factory.ConcreteUserFactory concreteUserFactory0 = new factory.ConcreteUserFactory();
        // The following exception was thrown during execution in test generation
        try {
            model.User user5 = concreteUserFactory0.createUser("", "", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown user type: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        factory.ConcreteUserFactory concreteUserFactory0 = new factory.ConcreteUserFactory();
        // The following exception was thrown during execution in test generation
        try {
            model.User user5 = concreteUserFactory0.createUser("", "", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown user type: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        factory.ConcreteUserFactory concreteUserFactory0 = new factory.ConcreteUserFactory();
        // The following exception was thrown during execution in test generation
        try {
            model.User user5 = concreteUserFactory0.createUser("hi!", "", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown user type: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        factory.ConcreteUserFactory concreteUserFactory0 = new factory.ConcreteUserFactory();
        // The following exception was thrown during execution in test generation
        try {
            model.User user5 = concreteUserFactory0.createUser("", "hi!", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown user type: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }
}

