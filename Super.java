public class Super {
        public static void main(String[] args) {
            Horse h1 = new Horse();
            System.out.println(h1.color);
        }   
}

class Animal {
    String color;
    Animal() {
        System.out.println("Animal Constructor is called");
    }
}

class Horse extends Animal {
    Horse() {
        // super();
        super.color="Blue";
        System.out.println("Horse Constructor called");
    }
}
