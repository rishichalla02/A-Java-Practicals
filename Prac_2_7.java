import java.util.*;
public class Prac_2_7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String str1;
        String str2;
        System.out.println("Enter First String : ");
        str1 = s.nextLine();
        System.out.println("Enter Second String : ");
        str2 = s.nextLine();

        String commonPrefix = findCommonPrefix(str1,str2);

        if(commonPrefix.isEmpty()){
            System.out.println("No Common String Found ");
        } else {
            System.out.println("Largest Common prefix : " +commonPrefix);
        }
        s.close();
    }

    public static String findCommonPrefix(String str1, String str2) {
        int minLength = Math.min(str1.length(), str2.length());

        int i = 0;

        while (i<minLength && str1.charAt(i) ==  str2.charAt(i)) {
            i++;
        }
        return str1.substring(0,i);
    }
}
