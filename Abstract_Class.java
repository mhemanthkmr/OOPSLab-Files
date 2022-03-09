import java.util.Scanner;

abstract class Shape {
    Scanner sc = new Scanner(System.in);
    double a, b;

    abstract void printArea();
}

class Triangle extends Shape {
    void printArea() {
        System.out.println("Calculating Area of Rectangle");
        a = sc.nextDouble();
        b = sc.nextDouble();
        double area = a * b * 0.5;
        System.out.println(area);
    }

}

class Circle extends Shape {
    void printArea() {
        System.out.println("Calculating Area of Rectangle");
        a = sc.nextDouble();
        // b = sc.nextDouble();
        double area = a * a * 3.14;
        System.out.println(area);
    }

}

class Rectangle extends Shape {
    void printArea() {
        System.out.println("Calculating Area of Rectangle");
        a = sc.nextDouble();
        b = sc.nextDouble();
        double area = a * b;
        System.out.println(area);
    }

}

public class Abstract_Class {
    public static void main(String[] args) {
        Shape obj;
        obj = new Rectangle();
        obj.printArea();
        obj = new Circle();
        obj.printArea();
        obj = new Triangle();
        obj.printArea();
    }
}
