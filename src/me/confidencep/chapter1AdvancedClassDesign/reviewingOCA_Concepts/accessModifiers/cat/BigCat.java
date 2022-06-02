package me.confidencep.chapter1AdvancedClassDesign.reviewingOCA_Concepts.accessModifiers.cat;

public class BigCat {

    public String publicInstanceVar = "publicInstanceVar";
    protected String protectedInstanceVar = "protectedInstanceVar";
    String defaultInstanceVar = "defaultInstanceVar";
    private String privateInstanceVar = "privateInstanceVar";

    public static void main(String[] args) {
        BigCat cat = new BigCat();

        System.out.println("********** INSTANCE VARIABLES **********");
        System.out.println("BigCat: " + cat.publicInstanceVar);
        System.out.println("BigCat: " + cat.protectedInstanceVar);
        System.out.println("BigCat: " + cat.defaultInstanceVar);
        System.out.println("BigCat: " + cat.privateInstanceVar);

        System.out.println("********** METHODS **********");
        cat.publicMethod("BigCat: ");
        cat.protectedMethod("BigCat: ");
        cat.defaultMethod("BigCat: ");
        cat.privateMethod("BigCat: ");

        System.out.println("********** JUST FOR FUN **********");
        System.out.println(cat.testMethod("Checking Test Method: "));
        System.out.println(new BigCat().testMethod("JUST FOR FUN: "));

        System.out.println("********** SOME FUN WITH NESTED CLASSES | ACCESS MODIFIERS **********");
        System.out.println(new AnotherTestClass().testMethod("AnotherTestClass Method running in BigCat: "));
    }

    public void publicMethod(String var) {
        System.out.println(var + "Public Method");
    }

    protected void protectedMethod(String var) {
        System.out.println(var + "Protected Method");
    }

    void defaultMethod(String var) {
        System.out.println(var + "Default Method");
    }

    private void privateMethod(String var) {
        System.out.println(var + "Private Method");
    }

    private String testMethod(String var) {
        return (var + "Test Method");
    }

    String testMethod2(String var) {
        return (var + "Test Method");
    }



    public class TestClassPublic {
        public String testMethod(String var) {
            return var + "Test Class Public";
        }
    }

    protected class TestClassProtected {
        public String testMethod(String var) {
            return var + "Test Class Protected";
        }
    }

    class TestClassDefault {
        public String testMethod(String var) {
            return var + "Test Class Default";
        }
    }

    private class TestClassPrivate {
        public String testMethod(String var) {
            return var + "Test Class Private";
        }
    }


    public static class TestClassPublicStatic {
        public String testMethod(String var) {
            return var + "Test Class Public Static";
        }
    }
    protected static class TestClassProtectedSatic {
        public String testMethod(String var) {
            return var + "Test Class Protected Static";
        }
    }

    static class TestClassDefaultStatic {
        public String testMethod(String var) {
            return var + "Test Class Default Static";
        }
    }

    private static class TestClassPrivateStatic {
        public String testMethod(String var) {
            return var + "Test Class Private Static";
        }
    }
}

class AnotherTestClass {

    public static void main(String[] args) {
        System.out.println(new BigCat().testMethod2("Another Class (AnotherTestClass) on the same file with BigCat: "));
    }

    public String testMethod(String var) {
        return var + "Another Test Class";
    }
}
