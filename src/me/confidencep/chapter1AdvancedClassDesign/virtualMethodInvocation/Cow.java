package me.confidencep.chapter1AdvancedClassDesign.virtualMethodInvocation;

public class Cow extends Animal {

    @Override
    public void feed() {
        addHay();
    }

    private void addHay() {
        System.out.println("Hay Added!!!");
    }
}
