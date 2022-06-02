package me.confidencep.chapter1AdvancedClassDesign.reviewingOCA_Concepts.overloadingAndOverriding;

public class Polymorphism {
    public static void main(String[] args) {

        System.out.println("***** PELICAN CLASS *****");
        Pelican pelican = new Pelican();
        pelican.sing();

        System.out.println("\n***** ROBIN CLASS *****");
        Robin robin = new Robin();
        robin.sing();
        robin.sing(24);
    }
}
