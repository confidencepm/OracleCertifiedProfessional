package me.confidencep.chapter1AdvancedClassDesign.virtualMethodInvocation;

public class Lion extends Animal {

    String name = "Leo";

    @Override
    public void feed() {
        addMeat();
    }

    private void addMeat() {
        System.out.println("Meat Added!!!");
    }

    /**
     * Java looks for overridden methods and implements them
     *
     * Method play() is overriding the one in abstract class Animal and so the method play here will be invoked
     * */
    @Override
    public void play() {
        System.out.println("toss in meat");
    }
}
