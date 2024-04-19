import java.util.Scanner;

class VolumeCalculator {
    // Method to calculate volume of a cube
    public double volume(double side) {
        return Math.pow(side, 3);
    }

    // Method to calculate volume of a rectangular cube
    public double volume(double length, double width, double height) {
        return length * width * height;
    }

    // Method to calculate volume of a sphere
    public double volume(double radius, String shape) {
        if (shape.equalsIgnoreCase("sphere"))
            return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
        else
            return -1; // Indicating invalid shape
    }
}

public class Prac_4_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        VolumeCalculator calculator = new VolumeCalculator();

        System.out.println("Choose a shape to find the volume: ");
        System.out.println("1. Cube");
        System.out.println("2. Rectangular Cube");
        System.out.println("3. Sphere");

        int choice = scanner.nextInt();
        double volume;

        switch (choice) {
            case 1:
                System.out.print("Enter the side length of the cube: ");
                double side = scanner.nextDouble();
                volume = calculator.volume(side);
                System.out.println("Volume of the cube: " + volume);
                break;

            case 2:
                System.out.print("Enter the length of the rectangular cube: ");
                double length = scanner.nextDouble();
                System.out.print("Enter the width of the rectangular cube: ");
                double width = scanner.nextDouble();
                System.out.print("Enter the height of the rectangular cube: ");
                double height = scanner.nextDouble();
                volume = calculator.volume(length, width, height);
                System.out.println("Volume of the rectangular cube: " + volume);
                break;

            case 3:
                System.out.print("Enter the radius of the sphere: ");
                double radius = scanner.nextDouble();
                volume = calculator.volume(radius, "sphere");
                if (volume != -1)
                    System.out.println("Volume of the sphere: " + volume);
                else
                    System.out.println("Invalid shape choice. Please choose sphere.");
                break;

            default:
                System.out.println("Invalid choice. Please choose 1, 2, or 3.");
        }

        scanner.close();
    }
}
