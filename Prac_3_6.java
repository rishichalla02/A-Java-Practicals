<<<<<<< HEAD
import java.util.Scanner;

class Point {
    private int x;
    private int y;

    // Default constructor
    public Point() {
        this.x = 5;
        this.y = 5;

    }

    // Parameterized constructor
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Copy constructor
    public Point(Point other) {
        this.x = other.x;
        this.y = other.y;
    }

    // Getter methods
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    // Setter methods
    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    // Method to display point coordinates
    public void display() {
        System.out.println("Point (" + x + ", " + y + ")");
    }
}

public class Prac_3_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Testing default constructor
        System.out.println("Testing Default Constructor:");
        Point point1 = new Point();
        point1.display();

        // Testing parameterized constructor
        System.out.println("\nTesting Parameterized Constructor:");
        System.out.print("Enter x coordinate: ");
        int x = scanner.nextInt();
        System.out.print("Enter y coordinate: ");
        int y = scanner.nextInt();
        Point point2 = new Point(x, y);
        point2.display();

        // Testing copy constructor
        System.out.println("\nTesting Copy Constructor:");
        Point point3 = new Point(point2);
        point3.display();
        scanner.close();
    }
}
=======
import java.util.Scanner;

class Point {
    private int x;
    private int y;

    // Default constructor
    public Point() {
        this.x = 5;
        this.y = 5;

    }

    // Parameterized constructor
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Copy constructor
    public Point(Point other) {
        this.x = other.x;
        this.y = other.y;
    }

    // Getter methods
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    // Setter methods
    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    // Method to display point coordinates
    public void display() {
        System.out.println("Point (" + x + ", " + y + ")");
    }
}

public class Prac_3_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Testing default constructor
        System.out.println("Testing Default Constructor:");
        Point point1 = new Point();
        point1.display();

        // Testing parameterized constructor
        System.out.println("\nTesting Parameterized Constructor:");
        System.out.print("Enter x coordinate: ");
        int x = scanner.nextInt();
        System.out.print("Enter y coordinate: ");
        int y = scanner.nextInt();
        Point point2 = new Point(x, y);
        point2.display();

        // Testing copy constructor
        System.out.println("\nTesting Copy Constructor:");
        Point point3 = new Point(point2);
        point3.display();
        scanner.close();
    }
}
>>>>>>> 8b7233aaf466f5aada62e4e46a64670873d07dc9
