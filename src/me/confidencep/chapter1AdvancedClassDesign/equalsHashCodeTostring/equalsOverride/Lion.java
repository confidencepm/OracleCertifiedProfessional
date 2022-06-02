package me.confidencep.chapter1AdvancedClassDesign.equalsHashCodeTostring.equalsOverride;

import java.util.Objects;

public class Lion {

    private int idNumber;
    private int age;
    private String name;

    public static void main(String[] args) {
        Lion lion = new Lion(54, 5, "");
        Lion lion1 = new Lion(54, 5, "Leo");
        Lion lion2 = new Lion(54, 5, "Leo");

        // Prints out true | without the equals' method override the answer would be false
        System.out.println(lion2.equals(lion1));

        String name;
        name = ((lion.name == null || lion.name.equals("")) ? "N/A" : lion.name);
        System.out.println(name);
    }

    public Lion(int idNumber, int age, String name) {
        this.idNumber = idNumber;
        this.age = age;
        this.name = name;
    }

    /** Hard coded */
//    @Override
//    public boolean equals(Object obj) {
//        if (!(obj instanceof Lion)) {
//            return false;
//        }
//        Lion otherLion = (Lion) obj;
//        return this.idNumber == otherLion.idNumber;
//    }


    // Generated using intellij
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Lion)) return false;
        Lion lion = (Lion) o;
        return idNumber == lion.idNumber && age == lion.age && name.equals(lion.name);
    }

    @Override
    public String toString() {
        return "Lion{" +
                "idNumber=" + idNumber +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
