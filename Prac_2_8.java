import java.util.*;
public class Prac_2_8 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter password: ");
        String password = s.nextLine();

        if(isValidPassword(password)){
            System.out.println("Valid Password..");
        } else{
            System.out.println("Invalid Password....");
        }
        s.close();
    }

    public static boolean isValidPassword(String password) {
        if(password.length()<8){
            return false;
        }

        for (char ch : password.toCharArray()) {
            if (!Character.isLetterOrDigit(ch)) { return false;
            }

         }
            int digitCount = 0;
            for (char ch : password.toCharArray()) {
            if (Character.isDigit(ch)) {
            digitCount++;
            }
        }
            return digitCount >= 2;
    }
}