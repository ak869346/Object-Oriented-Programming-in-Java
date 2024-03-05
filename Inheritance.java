public class Inheritance {
    public static void main(String[] args) {
        Fish f1 = new Fish();
        f1.eat();
        f1.swim();
        f1.breathe();

        Dog d1 = new Dog();
        d1.eat();
        d1.breathe();
    }
}

// Single Level - Animal ---->>>>> Mammal
// Multilevel -  Animal ---->>>Mammal----->>>Dog

// Heirarchical ---  Animal---->Mammal
//                   Animal---->Fish
//                   Animal----->Bird
class Animal {
    String color;

    void eat() {
        System.out.println("Animal Eats");
    }

    void breathe() {
        System.out.println("Animal Breathe");
    }
}
// Multilevel Inheritance....
class Mammal extends Animal {
    int legs;

    void walk() {
        System.out.println("Mammal walk");
    }
}

class Dog extends Mammal {
    String breed;
}

// Single level Inheritance...

class Fish extends Animal {
    int fins;

    void swim() {
        System.out.println("Fish Swim");
    }
}

class Bird {
    void fly() {
        System.out.println("Bird FLy");
    }
}

