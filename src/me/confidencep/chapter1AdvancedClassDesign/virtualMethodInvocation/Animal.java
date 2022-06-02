package me.confidencep.chapter1AdvancedClassDesign.virtualMethodInvocation;

abstract class Animal {

    String name = "???";
    public abstract void feed();

    public void printName() {
        System.out.println(name);
    }

    /**
     * Java looks for overridden methods and implements them
     *
     * Method play() is overridden in Lion and so the method override will be invoked
     * */
    public void careFor() {
        play();
    }
    public void play() {
        System.out.println("pet animal");
    }
}
