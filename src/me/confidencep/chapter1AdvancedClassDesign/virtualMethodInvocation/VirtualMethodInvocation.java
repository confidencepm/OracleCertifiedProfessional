package me.confidencep.chapter1AdvancedClassDesign.virtualMethodInvocation;

public class VirtualMethodInvocation {
    public static void main(String[] args) {
        VirtualMethodInvocation virtualMethodInvocation = new VirtualMethodInvocation();
        Cow cow = new Cow();
        Bird bird = new Bird();
        Lion lion = new Lion();

        virtualMethodInvocation.feedAnimal(cow);
        virtualMethodInvocation.feedAnimal(bird);
        virtualMethodInvocation.feedAnimal(lion);
    }

    public void feedAnimal(Animal animal) {
        animal.feed();
    }
}
