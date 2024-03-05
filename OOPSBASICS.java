/**
 * OOPSBASICS
 */
public class OOPSBASICS {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.setColor("Blue");
        System.out.println(p1.getColor());
        p1.setTip(12);
        System.out.println(p1.getTIp());

        Student s1 = new Student();
        Student s2 = new Student("Shivam");
        s2.roll = 13;
        s2.marks[0]=100;
        s2.marks[1]=90;
        s2.marks[2]=80;
        Student s3 = new Student(s2);
        s2.marks[2]=100;
        for(int i=0;i<3;i++) {
            System.out.println(s3.marks[i]);
        }
    }
}

class Pen {
    String color;
    int tip;

    void setColor(String newColor) {
        this.color = newColor;
    }
    String getColor() {
        return this.color;
    }

    void setTip(int newTip) {
        this.tip=newTip;
    }

    int getTIp() {
        return this.tip;
    }
}

class Student {
    String name;
    int roll;
    int marks[];
    Student() {
        marks = new int[3];  // Default Constructor // Non Parameterised Constructor...
        System.out.println("Default Constaructor");
    }

    Student(String name) { 
        marks = new int[3];  // Parameterised Constructor....
        System.out.println("Parametrised Constructor");
    }

    // Shallow Copy Constructor.....
    // Student(Student s2) {
    //     marks = new int[3]; 
    //     System.out.println("Shallow Copy Constructor");
    //     this.name = s2.name;
    //     this.roll=s2.roll;
    //     this.marks=s2.marks;
    // }

    // Deep Copy Constructor...
    Student(Student s2) {
        marks = new int[3];
        System.out.println("Deep Copy Constructor");
        this.name = s2.name;
        this.roll=s2.roll;
        for(int i=0;i<3;i++) {
            this.marks[i]=s2.marks[i]; 
        }
    }
}