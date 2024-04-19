import java.util.Scanner;

class AreaCalculator {
    // Method to calculate area of a square
    public double area(double side) {
        return side * side;
    }

    // Method to calculate area of a rectangle
    public double area(double length, double width) {
        return length * width;
    }

    // Method to calculate area of a triangle
    public double area(double base, double height, String shape) {
        if (shape.equalsIgnoreCase("triangle"))
            return 0.5 * base * height;
        else
            return -1; // Indicating invalid shape
    }
}

public class Prac_4_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AreaCalculator calculator = new AreaCalculator();

        System.out.println("Choose a shape to find the area: ");
        System.out.println("1. Square");
        System.out.println("2. Rectangle");
        System.out.println("3. Triangle");

        int choice = scanner.nextInt();
        double area;

        switch (choice) {
            case 1:
                System.out.print("Enter the side length of the square: ");
                double side = scanner.nextDouble();
                area = calculator.area(side);
                System.out.println("Area of the square: " + area);
                break;

            case 2:
                System.out.print("Enter the length of the rectangle: ");
                double length = scanner.nextDouble();
                System.out.print("Enter the width of the rectangle: ");
                double width = scanner.nextDouble();
                area = calculator.area(length, width);
                System.out.println("Area of the rectangle: " + area);
                break;

            case 3:
                System.out.print("Enter the base length of the triangle: ");
                double base = scanner.nextDouble();
                System.out.print("Enter the height of the triangle: ");
                double height = scanner.nextDouble();
                area = calculator.area(base, height, "triangle");
                if (area != -1)
                    System.out.println("Area of the triangle: " + area);
                else
                    System.out.println("Invalid shape choice. Please choose triangle.");
                break;

            default:
                System.out.println("Invalid choice. Please choose 1, 2, or 3.");
        }

        scanner.close();
    }
}
