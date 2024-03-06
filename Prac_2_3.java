import java.util.*;
public class Prac_2_3 {
    public static void main(String[] args) {
        int AAray[] = new int[10];
        int newArray[] = duplicate(AAray);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element of matrix :");
        for(int i=0;i<AAray.length;i++){
            AAray[i] = sc.nextInt();
        }
        System.out.println("Original array: " + Arrays.toString(AAray)); 
        System.out.println("New array after eliminating duplicates: " + 
        Arrays.toString(newArray)); 

        sc.close();
    }

    public static int[] duplicate(int AAray[]) {
        Arrays.sort(AAray);

        int length = AAray.length;
        int UniqueCount = 1;
        for(int i=0;i<length;i++){
            if(AAray[i]!=AAray[i-1]){
                UniqueCount++;
            }
        }
        int[] newArray = new int[UniqueCount]; 
        newArray[0] = AAray[0]; 
         
        int newIndex = 1; 

        for (int i = 1; i < length; i++) { 
            if (AAray[i] != AAray[i - 1]) { 
                newArray[newIndex] = AAray[i]; 
                newIndex++; 
            } 
        }      
        return newArray; 
    } 
} 
