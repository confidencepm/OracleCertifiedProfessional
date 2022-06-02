package me.confidencep.chapter1AdvancedClassDesign.reviewingOCA_Concepts.overloadingAndOverriding;

public class Pelican extends Bird {
    public void sing() {
        super.sing();   // Implementation from Super class
        new Robin().sing(); // Implementation from Robin class (Overriding not necessary)
        System.out.println("KWAAH KWAHAH KWAHA");   // Implementation from Child class
    }
}
