package me.confidencep.chapter1AdvancedClassDesign.reviewingOCA_Concepts.staticAndFinal;

/**
 * STATIC METHODS CANNOT ACCESS INSTANCE METHODS/VARIABLES DIRECTLY WHILE INSTANCE METHODS CAN ACCESS STATIC
 * VARIABLES AND STATIC METHODS DIRECTLY.
 *
 * INSTANCE METHODS/VARIABLES DO NOT HAVE THE PRECEDING STATIC NON-ACCESS MODIFIER.
 *
 * WE CAN OVERLOAD STATIC METHODS BUT WE CANNOT OVERRIDE THEM.
 *
 * The Class/Static methods are the methods that are called on the class itself, not on a specific object instance.
 *
 * A few Java built-in static/class methods are Math.random(), System.gc(), Math.sqrt(), Math.random() and etc.
 * */

abstract class Cat {
    static String name = "The Cat";    // final and static can be used here
    static void clean() { }     // static cannot be used here if we want to inherit the method
    final void clean2() {}      // final cannot be used here if you want to override the method
    void clean3() {}            // Overriding this method will work
}

class Lion extends Cat {

    static Lion lioness = new Lion();
    int x = 5;

    public static void main(String[] args) {
        clean4();
        clean5();
        System.out.println(new Lion().x);
        System.out.println((int) (Math.random() * 5));
    }

    static void clean() {       // method is not overriding the one in class Cat
        Lion lion = new Lion();
        System.out.println(lion.name);
    }

    final void clean3() {}      // final can be used here since method does not have subclasses

    static void clean4() {
        System.out.println(lioness.name);
        lioness.name = "The lioness is here!";
    }

    static void clean5() {
        System.out.println(lioness.name);
    }
}
