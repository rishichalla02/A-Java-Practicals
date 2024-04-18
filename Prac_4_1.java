public class Prac_4_1 {
        public static void main(String[] args) {
            if (args.length != 5) {
                System.out.println("Please provide exactly 5 words as command-line arguments.");
                return;
            }
    
            for (String word : args) {
                System.out.println("Original word: " +word);
                String reversedWord = reverse(word);
                System.out.println("Reversed word: " +reversedWord);
                if (isPalindrome(word)) {
                    System.out.println("The word is a palindrome.");
                } else {
                    System.out.println("The word is not a palindrome.");
                }
                System.out.println();
            }
        }
    
        // Method to reverse a string
        public static String reverse(String str) {
            StringBuilder reversed = new StringBuilder();
            for (int i = str.length() - 1; i >= 0; i--) {
                reversed.append(str.charAt(i));
            }
            return reversed.toString();
        }
    
        // Method to check if a string is palindrome
        public static boolean isPalindrome(String str) {
            String reversed = reverse(str);
            return str.equals(reversed);
        }
    }