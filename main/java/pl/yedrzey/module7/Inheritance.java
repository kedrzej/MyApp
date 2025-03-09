package pl.yedrzey.module7;

public class Inheritance {
    public static void main(String[] args) {

        Thing thing = new Thing();
        LivingThing livingThing = new LivingThing();
        NonLivingThing nonLivingThing = new NonLivingThing();
        Rock rock = new Rock();
        Air air = new Air();
        Animal animal = new Animal();
        Plant plant = new Plant();
        Bird bird = new Bird();
        Reptile reptile = new Reptile();
        Mammal mammal = new Mammal();
        Dog dog = new Dog();
        Cat cat = new Cat();

        System.out.println(thing);
        System.out.println(livingThing);
        System.out.println(nonLivingThing);
        System.out.println(rock);
        System.out.println(air);
        System.out.println(animal);
        System.out.println(plant);
        System.out.println(bird);
        System.out.println(reptile);
        System.out.println(mammal);
        System.out.println(dog);
        System.out.println(cat);
    }
}

    class Thing {

        public String toString() {
            return "Jestem istotą.";
        }
    }

    class LivingThing extends Thing {

        public String toString() {
            return "Jestem istotą żywą.";
        }
    }

    class NonLivingThing extends Thing {

        public String toString() {
            return "Jestem istotą nieożywioną.";
        }
    }

    class Rock extends NonLivingThing {

        public String toString() {
            return "Jestem skałą.";
        }
    }

    class Air extends NonLivingThing {

        public String toString() {
            return "Jestem powietrzem.";
        }
    }

    class Animal extends LivingThing {

        public String toString() {
            return "Jestem zwierzęciem.";
        }
    }

    class Plant extends LivingThing {

        public String toString() {
            return "Jestem rośliną.";
        }
    }

    class Bird extends Animal {

        public String toString() {
            return "Jestem ptakiem.";
        }
    }

    class Reptile extends Animal {

        public String toString() {
            return "Jestem gadem.";
        }
    }

    class Mammal extends Animal {

        public String toString() {
            return "Jestem ssakiem.";
        }
    }

    class Dog extends Mammal {

        public String toString() {
            return "Jestem psem.";
        }
    }

    class Cat extends Mammal {

        public String toString() {
            return "Jestem kotem.";
        }
    }
