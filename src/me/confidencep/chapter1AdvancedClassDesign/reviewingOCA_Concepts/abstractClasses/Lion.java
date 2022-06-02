package me.confidencep.chapter1AdvancedClassDesign.reviewingOCA_Concepts.abstractClasses;

public class Lion extends Cat {
    void clean() {
        System.out.println("Implements clean method in Abstract class Cat!");
    }

    @Override
    void clean2() {
        super.clean2();
    }
}
