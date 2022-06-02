package me.confidencep.chapter1AdvancedClassDesign.reviewingOCA_Concepts.accessModifiers.cat;

public class CatAdmirer {
    public static void main(String[] args) {
        BigCat cat = new BigCat();
        System.out.println("CatAdmirer: " + cat.publicInstanceVar);
        System.out.println("CatAdmirer: " + cat.protectedInstanceVar);
        System.out.println("CatAdmirer: " + cat.defaultInstanceVar);

        /** ********** TESTING ACCESSIBILITY OF A DEFAULT STATIC NESTED CLASS IN SUB CLASS **********
         *
         * NB:: Nested class has to be static to be accessible here in this case
         *
         * */
        BigCat testClass = new BigCat();
        BigCat.TestClassPublic check = testClass.new TestClassPublic();
        System.out.println(check.testMethod("Checking Public (None Static): "));
        System.out.println(testClass.testMethod2("Checking TestClass in CatAdmirer: "));

        BigCat.TestClassPublicStatic xyz = new BigCat.TestClassPublicStatic();
        System.out.println(xyz.testMethod("Checking Public Static: "));
    }
}
