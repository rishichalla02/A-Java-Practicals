import java.util.*;
public class Prac_2_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter String : ");
        String input = sc.nextLine().toLowerCase();

        int vowelCount = 0;
        int constantCount = 0;

        for(int i=0; i<input.length();i++){
            char ch = input.charAt(i);
            if(Character.isLetter(ch)){
                if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                    vowelCount++;
                } else{
                    constantCount++;
                }
            }
        }
        System.out.println("Number of Vowel = " +vowelCount);
        System.out.println("Number of Constant = " +constantCount);
        sc.close();
    }
}
