// Abstract class Shape
abstract class Shape {
    // Abstract method to calculate area
    public abstract double area();
}

// Subclass Triangle
class Triangle extends Shape {
    private double base;
    private double height;

    // Constructor
    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    // Override method to calculate area of triangle
    @Override
    public double area() {
        return 0.5 * base * height;
    }
}

// Subclass Rectangle
class Rectangle extends Shape {
    private double length;
    private double width;

    // Constructor
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Override method to calculate area of rectangle
    @Override
    public double area() {
        return length * width;
    }
}

// Subclass Circle
class Circle extends Shape {
    private double radius;

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Override method to calculate area of circle
    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}

public class Prac_5_1 {
    public static void main(String[] args) {
        // Creating objects of different shapes
        Triangle triangle = new Triangle(5, 3);
        Rectangle rectangle = new Rectangle(4, 6);
        Circle circle = new Circle(5);

        // Displaying areas of shapes
        System.out.println("Area of Triangle: " + triangle.area());
        System.out.println("Area of Rectangle: " + rectangle.area());
        System.out.println("Area of Circle: " + circle.area());
    }
}
