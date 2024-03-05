public class Polymorphism {
    public static void main(String[] args) {
            Calculator c1 = new Calculator();
            System.out.println(c1.sum(12, 12));
            System.out.println(c1.sum((float)1.3, (float)3.7));
            System.out.println(c1.sum(12,13,25));

            Deer d1 = new Deer();
            d1.eat();
    }
}

class Calculator {

    // Method Overloading -  Multiple function with same name but different parameter(types and count of parameter are different);
    int sum(int a,int b) {
        return a+b;
    }
    float sum(float a, float b) {
        return a+b;
    }

    int sum(int a, int b, int c) {
        return a+b+c;
    }
}

// Method Overriding -- When parent and child class contain same function with different definition....

class Animal {
    void eat() {
        System.out.println("Eat Anything");
    }
}

class Deer extends Animal {
    void eat() {
        System.out.println("Eat Grass");
    }
}
