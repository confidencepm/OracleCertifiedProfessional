package me.confidencep.chapter1AdvancedClassDesign.reviewingOCA_Concepts.overloadingAndOverriding;

public class Bird {
    public void sing() {
        System.out.println("tweet tweet tweet");
    }
    public void sing(String song) {
        System.out.println("The song the bird is singing is " + song + "!");
    }
}
