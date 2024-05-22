import java.util.*;
public class Prac_2_3 {
    public static void main(String[] args) {
        int[] Array = new int[10];
        int[] newArray = duplicate(Array);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element of matrix :");
        for(int i=0;i<Array.length;i++){
            Array[i] = sc.nextInt();
        }
        System.out.println("Original array: \t " + Arrays.toString(Array));
        System.out.println("New array after eliminating duplicates: " + 
        Arrays.toString(duplicate(Array)));

        sc.close();
    }

    public static int[] duplicate(int[] Array) {
        Arrays.sort(Array);

        int length = Array.length;
        int UniqueCount = 1;
        for(int i=1;i<length;i++){
            if(Array[i]!=Array[i-1]){
                UniqueCount++;
            }
        }
        int[] newArray = new int[UniqueCount];
        newArray[0] = Array[0];
         
        int newIndex = 1; 

        for (int i = 1; i < length; i++) { 
            if (Array[i] != Array[i - 1]) {
                newArray[newIndex] = Array[i];
                newIndex++; 
            } 
        }      
        return newArray; 
    } 
} 