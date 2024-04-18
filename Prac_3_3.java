class CartesianPoint {
    private int x;
    private int y;

    // Constructors
    public CartesianPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public CartesianPoint(int xy) {
        this(xy, xy); // Invokes the two-parameter constructor
    }

    // Getter methods
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    // Method to move the point
    public void move(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Overloaded move method with single parameter
    public void move(int xy) {
        move(xy, xy); // Invokes the two-parameter move method
    }

    // Method to display the current point
    public void display() {
        System.out.println("Current Point: (" + x + ", " + y + ")");
    }
}

public class Prac_3_3 {
    public static void main(String[] args) {
        // Test various methods of the CartesianPoint class
        CartesianPoint point1 = new CartesianPoint(3, 5);
        point1.display(); // Display current point
        point1.move(7, 9); // Move to new point
        point1.display(); // Display new point

        CartesianPoint point2 = new CartesianPoint(2);
        point2.display(); // Display current point
        point2.move(8); // Move to new point
        point2.display(); // Display new point
    }
}
