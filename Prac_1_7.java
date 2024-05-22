import java.util.Scanner; 
public class Prac_1_7 { 
public static void main(String[] args) { 

Scanner sc = new Scanner(System.in); 

System.out.print("Enter a letter: "); 
char letter = sc.next().charAt(0);

if (Character.isLetter(letter)) { 

letter = Character.toLowerCase(letter); 

if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') { 
System.out.println("The entered letter '" + letter + "' is a vowel."); 
} else { 
System.out.println("The entered letter '" + letter + "' is a consonant."); 
} 
} else { 
System.out.println("Invalid input! Please enter a valid letter."); 
} 

sc.close(); 
} 
}