import java.util.Scanner;

public class Prac_1_5 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter weight in pounds: ");
        double weightPounds = scanner.nextDouble();

        System.out.print("Enter height in inches: ");
        double heightInches = scanner.nextDouble();

        double weightKg = weightPounds * 0.45359237;
        double heightMeters = heightInches * 0.0254;

        double bmi = weightKg / (heightMeters * heightMeters);

        System.out.println("BMI is : " + bmi);

        scanner.close();
    }
}