package me.confidencep.chapter1AdvancedClassDesign.annotatingOverriddenMethods;

public class Bobcat {
    public void findDen() {}
}

class BobcatMother extends Bobcat {
    /**
     * The @Override annotation helps to avoid the mistake of overloading instead of overriding or lets you
     * know when you are not overriding if you make a typo in your overriding method name or when your superclass or
     * interface changes method signature.
     * */
    @Override
    public void findDen() {}
}
