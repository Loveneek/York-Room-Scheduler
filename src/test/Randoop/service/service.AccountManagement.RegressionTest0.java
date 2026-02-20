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
        model.User user1 = service.AccountManagement.findUserByEmail("hi!");
        org.junit.Assert.assertNull(user1);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        model.User user1 = service.AccountManagement.findUserByEmail("");
        org.junit.Assert.assertNull(user1);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        service.AccountManagement accountManagement0 = service.AccountManagement.getInstance();
        java.lang.Class<?> wildcardClass1 = accountManagement0.getClass();
        org.junit.Assert.assertNotNull(accountManagement0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        service.AccountManagement accountManagement0 = service.AccountManagement.getInstance();
        // The following exception was thrown during execution in test generation
        try {
            model.User user5 = accountManagement0.registerUser("", "hi!", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email format.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(accountManagement0);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        factory.ConcreteUserFactory concreteUserFactory0 = null;
        service.AccountManagement accountManagement1 = new service.AccountManagement(concreteUserFactory0);
        // The following exception was thrown during execution in test generation
        try {
            model.User user6 = accountManagement1.registerUser("", "hi!", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid email format.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        service.AccountManagement accountManagement0 = service.AccountManagement.getInstance();
        model.Chief chief1 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Admin admin4 = accountManagement0.createAdminAccount(chief1, "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Only the Chief Event Coordinator can create admin accounts.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(accountManagement0);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        factory.ConcreteUserFactory concreteUserFactory0 = null;
        service.AccountManagement accountManagement1 = new service.AccountManagement(concreteUserFactory0);
        java.lang.Class<?> wildcardClass2 = accountManagement1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        factory.ConcreteUserFactory concreteUserFactory0 = null;
        service.AccountManagement accountManagement1 = new service.AccountManagement(concreteUserFactory0);
        model.Chief chief2 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Admin admin5 = accountManagement1.createAdminAccount(chief2, "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Only the Chief Event Coordinator can create admin accounts.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        model.User user0 = null;
        service.AccountManagement.addUser(user0);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        service.AccountManagement accountManagement0 = service.AccountManagement.getInstance();
        model.Chief chief1 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Admin admin4 = accountManagement0.createAdminAccount(chief1, "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Only the Chief Event Coordinator can create admin accounts.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(accountManagement0);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        factory.ConcreteUserFactory concreteUserFactory0 = null;
        service.AccountManagement accountManagement1 = new service.AccountManagement(concreteUserFactory0);
        // The following exception was thrown during execution in test generation
        try {
            model.User user6 = accountManagement1.registerUser("", "", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"model.User.getEmail()\" because \"u\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        service.AccountManagement accountManagement0 = service.AccountManagement.getInstance();
        model.Chief chief1 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Admin admin4 = accountManagement0.createAdminAccount(chief1, "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Only the Chief Event Coordinator can create admin accounts.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(accountManagement0);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        factory.ConcreteUserFactory concreteUserFactory0 = null;
        service.AccountManagement accountManagement1 = new service.AccountManagement(concreteUserFactory0);
        model.Chief chief2 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Admin admin5 = accountManagement1.createAdminAccount(chief2, "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Only the Chief Event Coordinator can create admin accounts.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        factory.ConcreteUserFactory concreteUserFactory0 = null;
        service.AccountManagement accountManagement1 = new service.AccountManagement(concreteUserFactory0);
        // The following exception was thrown during execution in test generation
        try {
            model.User user6 = accountManagement1.registerUser("hi!", "hi!", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"model.User.getEmail()\" because \"u\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        factory.ConcreteUserFactory concreteUserFactory0 = null;
        service.AccountManagement accountManagement1 = new service.AccountManagement(concreteUserFactory0);
        // The following exception was thrown during execution in test generation
        try {
            model.User user6 = accountManagement1.registerUser("hi!", "", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"model.User.getEmail()\" because \"u\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        factory.ConcreteUserFactory concreteUserFactory0 = null;
        service.AccountManagement accountManagement1 = new service.AccountManagement(concreteUserFactory0);
        // The following exception was thrown during execution in test generation
        try {
            model.User user6 = accountManagement1.registerUser("", "hi!", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"model.User.getEmail()\" because \"u\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        service.AccountManagement accountManagement0 = service.AccountManagement.getInstance();
        model.Chief chief1 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Admin admin4 = accountManagement0.createAdminAccount(chief1, "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Only the Chief Event Coordinator can create admin accounts.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(accountManagement0);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        factory.ConcreteUserFactory concreteUserFactory0 = null;
        service.AccountManagement accountManagement1 = new service.AccountManagement(concreteUserFactory0);
        // The following exception was thrown during execution in test generation
        try {
            model.User user6 = accountManagement1.registerUser("", "", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"model.User.getEmail()\" because \"u\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        factory.ConcreteUserFactory concreteUserFactory0 = null;
        service.AccountManagement accountManagement1 = new service.AccountManagement(concreteUserFactory0);
        model.Chief chief2 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Admin admin5 = accountManagement1.createAdminAccount(chief2, "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Only the Chief Event Coordinator can create admin accounts.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        factory.ConcreteUserFactory concreteUserFactory0 = null;
        service.AccountManagement accountManagement1 = new service.AccountManagement(concreteUserFactory0);
        // The following exception was thrown during execution in test generation
        try {
            model.User user6 = accountManagement1.registerUser("hi!", "hi!", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"model.User.getEmail()\" because \"u\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        factory.ConcreteUserFactory concreteUserFactory0 = null;
        service.AccountManagement accountManagement1 = new service.AccountManagement(concreteUserFactory0);
        // The following exception was thrown during execution in test generation
        try {
            model.User user6 = accountManagement1.registerUser("hi!", "", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"model.User.getEmail()\" because \"u\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        factory.ConcreteUserFactory concreteUserFactory0 = null;
        service.AccountManagement accountManagement1 = new service.AccountManagement(concreteUserFactory0);
        model.Chief chief2 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Admin admin5 = accountManagement1.createAdminAccount(chief2, "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Only the Chief Event Coordinator can create admin accounts.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        factory.ConcreteUserFactory concreteUserFactory0 = null;
        service.AccountManagement accountManagement1 = new service.AccountManagement(concreteUserFactory0);
        // The following exception was thrown during execution in test generation
        try {
            model.User user6 = accountManagement1.registerUser("hi!", "hi!", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"model.User.getEmail()\" because \"u\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        factory.ConcreteUserFactory concreteUserFactory0 = null;
        service.AccountManagement accountManagement1 = new service.AccountManagement(concreteUserFactory0);
        // The following exception was thrown during execution in test generation
        try {
            model.User user6 = accountManagement1.registerUser("", "", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"model.User.getEmail()\" because \"u\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        factory.ConcreteUserFactory concreteUserFactory0 = null;
        service.AccountManagement accountManagement1 = new service.AccountManagement(concreteUserFactory0);
        // The following exception was thrown during execution in test generation
        try {
            model.User user6 = accountManagement1.registerUser("", "hi!", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"model.User.getEmail()\" because \"u\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        factory.ConcreteUserFactory concreteUserFactory0 = null;
        service.AccountManagement accountManagement1 = new service.AccountManagement(concreteUserFactory0);
        // The following exception was thrown during execution in test generation
        try {
            model.User user6 = accountManagement1.registerUser("", "hi!", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"model.User.getEmail()\" because \"u\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        factory.ConcreteUserFactory concreteUserFactory0 = null;
        service.AccountManagement accountManagement1 = new service.AccountManagement(concreteUserFactory0);
        // The following exception was thrown during execution in test generation
        try {
            model.User user6 = accountManagement1.registerUser("hi!", "hi!", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"model.User.getEmail()\" because \"u\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        factory.ConcreteUserFactory concreteUserFactory0 = null;
        service.AccountManagement accountManagement1 = new service.AccountManagement(concreteUserFactory0);
        // The following exception was thrown during execution in test generation
        try {
            model.User user6 = accountManagement1.registerUser("hi!", "", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"model.User.getEmail()\" because \"u\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        factory.ConcreteUserFactory concreteUserFactory0 = null;
        service.AccountManagement accountManagement1 = new service.AccountManagement(concreteUserFactory0);
        // The following exception was thrown during execution in test generation
        try {
            model.User user6 = accountManagement1.registerUser("hi!", "", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"model.User.getEmail()\" because \"u\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        factory.ConcreteUserFactory concreteUserFactory0 = null;
        service.AccountManagement accountManagement1 = new service.AccountManagement(concreteUserFactory0);
        // The following exception was thrown during execution in test generation
        try {
            model.User user6 = accountManagement1.registerUser("", "", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"model.User.getEmail()\" because \"u\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }
}

