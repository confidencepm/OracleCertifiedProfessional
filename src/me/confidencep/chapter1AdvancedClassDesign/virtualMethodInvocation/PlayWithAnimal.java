package me.confidencep.chapter1AdvancedClassDesign.virtualMethodInvocation;

public class PlayWithAnimal {
    public static void main(String[] args) {
        Animal animal = new Lion();
        animal.printName();
        animal.careFor();
    }
}
