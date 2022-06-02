package me.confidencep.chapter1AdvancedClassDesign.reviewingOCA_Concepts.overloadingAndOverriding;

public class Robin extends Bird {
    public void sing() {
        System.out.println("twiddledeedee");    // Overrrides Parent class implementation
        super.sing();   // Implementation from Parent class
    }

    // Overloading and Overriding: ALL IN ONE
    public void sing(int numberOfRobins) {
        System.out.println("There are " + numberOfRobins + " Robins singing.");
        sing("Oh, Happy Days!!");
        super.sing("Oh, Happy Days too!!");
    }
    public void sing(String song) {
        System.out.println("The song the bird is singing is " + song + "!");
    }
}
