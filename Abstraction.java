public class Abstraction {
    public static void main(String[] args) {
        Horse h1 = new Horse();
        h1.eat();
        h1.walk();

        Chicken c1 = new Chicken();
        c1.eat();
        c1.walk();
        System.out.println(h1.color);
        h1.changeColor();
        System.out.println(h1.color);
    }
}

abstract class Animal {
    String color;
    Animal() {
        System.out.println("Animal Constructor");
        color="Brown";
    }
    void eat() {
        System.out.println("Animal Eats");
    }

    abstract void walk();
}

class Horse extends Animal {
    Horse() {
        System.out.println("Mustang Constructor ");
    }
    void changeColor() {
        color="Blue";
    }
    void walk() {
        System.out.println("Horse walk on 4 legs");
    }
}

class Chicken extends Animal {
    void walk() {
        System.out.println("Chicken walk on 2 legs");
    }
}


