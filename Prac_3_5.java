<<<<<<< HEAD
package first;
import java.util.Scanner;

public class Prac_3_5 {
    private int hours;
    private int minutes;

    // Method to initialize data
    public void initialize(int hours, int minutes) {
        this.hours = hours;
        this.minutes = minutes;
    }

    // Method to display data
    public void display() {
        System.out.println("time: " + hours + " hours " + minutes + " minutes");
    }

    // Method to add two Prac_3_5 objects
    public void sum(Prac_3_5 t1, Prac_3_5 t2) {
        int totalMinutes = t1.hours * 60 + t1.minutes + t2.hours * 60 + t2.minutes;
        hours = totalMinutes / 60;
        minutes = totalMinutes % 60;
    }

    // Main method to test the Prac_3_5 class
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Prac_3_5 t1 = new Prac_3_5();
        System.out.print("Enter hours for time 1: ");
        int hours1 = scanner.nextInt();
        System.out.print("Enter minutes for time 1: ");
        int minutes1 = scanner.nextInt();
        t1.initialize(hours1, minutes1);

        Prac_3_5 t2 = new Prac_3_5();
        System.out.print("Enter hours for time 2: ");
        int hours2 = scanner.nextInt();
        System.out.print("Enter minutes for timee 2: ");
        int minutes2 = scanner.nextInt();
        t2.initialize(hours2, minutes2);

        Prac_3_5 t3 = new Prac_3_5();
        t3.sum(t1, t2);

        System.out.println("\ntime 1:");
        t1.display();
        System.out.println("\ntime 2:");
        t2.display();
        System.out.println("\nSum of time 1 and time 2:");
        t3.display();
        scanner.close();
    }
}
=======
package first;
import java.util.Scanner;

public class Prac_3_5 {
    private int hours;
    private int minutes;

    // Method to initialize data
    public void initialize(int hours, int minutes) {
        this.hours = hours;
        this.minutes = minutes;
    }

    // Method to display data
    public void display() {
        System.out.println("time: " + hours + " hours " + minutes + " minutes");
    }

    // Method to add two Prac_3_5 objects
    public void sum(Prac_3_5 t1, Prac_3_5 t2) {
        int totalMinutes = t1.hours * 60 + t1.minutes + t2.hours * 60 + t2.minutes;
        hours = totalMinutes / 60;
        minutes = totalMinutes % 60;
    }

    // Main method to test the Prac_3_5 class
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Prac_3_5 t1 = new Prac_3_5();
        System.out.print("Enter hours for time 1: ");
        int hours1 = scanner.nextInt();
        System.out.print("Enter minutes for time 1: ");
        int minutes1 = scanner.nextInt();
        t1.initialize(hours1, minutes1);

        Prac_3_5 t2 = new Prac_3_5();
        System.out.print("Enter hours for time 2: ");
        int hours2 = scanner.nextInt();
        System.out.print("Enter minutes for timee 2: ");
        int minutes2 = scanner.nextInt();
        t2.initialize(hours2, minutes2);

        Prac_3_5 t3 = new Prac_3_5();
        t3.sum(t1, t2);

        System.out.println("\ntime 1:");
        t1.display();
        System.out.println("\ntime 2:");
        t2.display();
        System.out.println("\nSum of time 1 and time 2:");
        t3.display();
        scanner.close();
    }
}
>>>>>>> 8b7233aaf466f5aada62e4e46a64670873d07dc9
