package first; 
 class Rectangle {
    // Data fields
    private double width;
    private double height;
    
    // Constructors
    public Rectangle() {
        this.width = 1.0;
        this.height = 1.0;
    }
    
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    
    // Getter methods
    public double getWidth() {
        return width;
    }
    
    public double getHeight() {
        return height;
    }
    
    // Method to calculate area
    public double getArea() {
        return width * height;
    }
    
    // Method to calculate perimeter
    public double getPerimeter() {
        return 2 * (width + height);
    }
   }
class Prac_3_2{
	public static void main(String[] args) {
        // Create two Rectangle objects
        Rectangle rectangle1 = new Rectangle(40,4);
        Rectangle rectangle2 = new Rectangle(5.6, 34.9);
        
        // Display details of each rectangle
        System.out.println("Rectangle 1:");
        displayDetails(rectangle1);
        
        System.out.println("\nRectangle 2:");
        displayDetails(rectangle2);
    }
    
    // Method to display details of a rectangle
    public static void displayDetails(Rectangle rectangle) {
        System.out.println("Width: " + rectangle.getWidth());
        System.out.println("Height: " + rectangle.getHeight());
        System.out.println("Area: " + rectangle.getArea());
        System.out.println("Perimeter: " + rectangle.getPerimeter());
    }
}
