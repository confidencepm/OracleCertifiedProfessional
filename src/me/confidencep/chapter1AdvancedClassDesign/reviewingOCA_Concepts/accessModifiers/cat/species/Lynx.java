package me.confidencep.chapter1AdvancedClassDesign.reviewingOCA_Concepts.accessModifiers.cat.species;

import me.confidencep.chapter1AdvancedClassDesign.reviewingOCA_Concepts.accessModifiers.cat.BigCat;

public class Lynx extends BigCat {

    /** WE COULD OVERRIDE PUBLIC METHOD HERE */
    //    public void publicMethod(String var) {
    //        System.out.println(var + "We are in in Lynx Public Method");
    //    }

    public static void main(String[] args) {

        System.out.println("********** INSTANCE VARIABLES **********");

        /** Only public instance variables will be accessed */
        BigCat cat = new BigCat();
        System.out.println("Lynx: " + cat.publicInstanceVar);

        /** Public and Protected instance variables are accessible */
        Lynx cat2 = new Lynx();
        System.out.println("Lynx: " + cat2.publicInstanceVar);
        System.out.println("Lynx: " + cat2.protectedInstanceVar);

        /** Only public instance variables will be accessed
         *
         * [SUPER_CLASS] <variable> = new [SUPER_CLASS]  ✔✔✔✔✔
         * [SUPER_CLASS] <variable> = new [CHILD_CLASS]  ✔✔✔✔✔
         * [CHILD_CLASS] <variable> = new [CHILD_CLASS]  ✔✔✔✔✔
         * [CHILD_CLASS] <variable> = new [SUPER_CLASS]  Does not compile (Error will state that SUPER_CLASS type provided where CHILD_CLASS is required)
         * [CHILD_CLASS] <variable> = ([CHILD_CLASS]) new [SUPER_CLASS] xxxxx Compiles but ClassCastException will be thrown at runtime.
         * */
        BigCat cat3 = new Lynx();
        System.out.println("Lynx: " + cat3.publicInstanceVar);

        /**
         *     ************** ClassCastException will be thrown **************
         *
         * Public and Protected instance variables are accessible but exception will be thrown
         * at runtime
         *
         * ClassCastException is a runtime exception raised in Java when we try to improperly
         * cast a class from one type to another. It's thrown to indicate that the code has
         * attempted to cast an object to a related class, but of which it is not an instance.
         * */
        /*
            Lynx cat4 = (Lynx) new BigCat();
            System.out.println(cat4.publicInstanceVar);
            System.out.println(cat4.protectedInstanceVar);
        */

        System.out.println("********** METHODS **********");
        cat.publicMethod("Lynx (BigCat cat = new BigCat): ");
        cat2.publicMethod("Lynx (Lynx cat2 = new Lynx): ");
        cat2.protectedMethod("Lynx (Lynx cat2 = new Lynx): ");
        cat3.publicMethod("Lynx (BigCat cat2 = new Lynx): ");
    }
}
