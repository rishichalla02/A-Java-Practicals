import java.util.Scanner;

// Base class Shape
class Shape {
    protected double dimension1;
    protected double dimension2;

    public void getData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter dimensions:");
        System.out.print("Dimension 1: ");
        dimension1 = scanner.nextDouble();
        System.out.print("Dimension 2: ");
        dimension2 = scanner.nextDouble();
    }

    public void displayArea() {
        System.out.println("Area: " + calculateArea());
    }

    // This method will be overridden by subclasses
    public double calculateArea() {
        return 0;
    }
}

// Derived class Triangle
class Triangle extends Shape {
    @Override
    public double calculateArea() {
        return 0.5 * dimension1 * dimension2;
    }
}

// Derived class Rectangle
class Rectangle extends Shape {
    @Override
    public double calculateArea() {
        return dimension1 * dimension2;
    }
}

public class Prac_4_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create a triangle object
        System.out.println("Enter dimensions for triangle:");
        Triangle triangle = new Triangle();
        triangle.getData();
        System.out.print("Area of Triangle: ");
        triangle.displayArea();

        // Create a rectangle object
        System.out.println("\nEnter dimensions for rectangle:");
        Rectangle rectangle = new Rectangle();
        rectangle.getData();
        System.out.print("Area of Rectangle: ");
        rectangle.displayArea();

        scanner.close();
    }
}
