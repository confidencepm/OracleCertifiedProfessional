package me.confidencep.chapter1AdvancedClassDesign.instanceOf;

public class InstanceOf {
    public static void main(String[] args) {
        HeavyAnimal hippo = new Hippo();
        hippo.name = "Baby Hippo";
        System.out.println(hippo instanceof Hippo);         // true
        System.out.println(hippo instanceof HeavyAnimal);   // true
        System.out.println(hippo instanceof Elephant);      // false

        /** x instance of Object is usually true unless x is null */
        System.out.println(hippo instanceof Object);        // true
        Hippo nullHippo = null;
        System.out.println(nullHippo instanceof Object);    // false

        /** DOES NOT COMPILE */
        // Hippo anotherHippo = new Hippo();
        // System.out.println(anotherHippo instanceof Elephant);

        /**
         * Instance of interface not implemented by the class will return false
         * Compiler allows it since interface might be implemented by subclasses of the class
         * */
        System.out.println(hippo instanceof Mother);

        MotherHippo motherHippo = new MotherHippo();
        if (motherHippo instanceof Mother) {
            System.out.println(true);
        }

        Mother mother = new Mother() {
            @Override
            public int hashCode() {
                return super.hashCode();
            }

            @Override
            public boolean equals(Object obj) {
                return super.equals(obj);
            }

            @Override
            protected Object clone() throws CloneNotSupportedException {
                return super.clone();
            }

            @Override
            public String toString() {
                return super.toString();
            }

            @Override
            protected void finalize() throws Throwable {
                super.finalize();
            }
        };

        System.out.println(mother instanceof MotherHippo);  // Super class cannot be an instance of a sub class

        Lion lion = new Lion();
        new InstanceOf().feedAnimal(lion);
    }

    public void feedAnimal (Animal animal) {
        if(animal instanceof Cow) {
            animal.addHay();
            System.out.println("Cow fed");
        } else if(animal instanceof Bird) {
            animal.addSeed();
            System.out.println("Bird fed");
        } else if(animal instanceof Lion) {
            animal.addMeat();
            System.out.println("Lion fed");
        } else {
            throw new RuntimeException("Unsupported animal");
        }
    }

}
