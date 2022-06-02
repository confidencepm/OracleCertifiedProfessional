package me.confidencep.chapter1AdvancedClassDesign.equalsHashCodeTostring.toStringOverride;

public class Hippo {
    private String name;
    private double weight;

    public Hippo(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return weight + "";
    }

    public static void main(String[] args) {
        Hippo h1 = new Hippo("Harry", 3600);
        System.out.println(h1);
    }
}
