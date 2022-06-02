package me.confidencep.chapter1AdvancedClassDesign.reviewingOCA_Concepts.abstractClasses;

abstract class Cat {

    /**
     * 1. An abstract class may contain any number of methods including zero
     * 2. The methods can be abstract or concrete
     * 3. Abstract methods may not appear in a class that is not abstract
     * 4. The first concrete subclass of an abstract class is required to implement all abstract methods that were not
     *    implemented by a superclass
      */
    abstract void clean();
    void clean2() {
        System.out.println("Printing from the Abstract class Cat!");
    }
}
