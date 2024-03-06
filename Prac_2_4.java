import java.util.Scanner; 
 
public class Prac_2_4 { 
    public static void main(String[] args) { 
        
        Scanner sc = new Scanner(System.in); 
         
        
        System.out.println("Enter the elements of the first 3x3 array:"); 
        int[][] array1 = readArray(sc); 
         
        
        System.out.println("Enter the elements of the second 3x3 array:"); 
        int[][] array2 = readArray(sc); 
         
        
        System.out.print("Enter the symbol for the operation (+, -, or *): "); 
        char symbol = sc.next().charAt(0); 
         
        
        int[][] resultArray = null; 
        switch (symbol) { 
            case '+': 
                resultArray = addArrays(array1, array2); 
                break; 
            case '-': 
                resultArray = subtractArrays(array1, array2); 
                break; 
            case '*': 
                resultArray = multiplyArrays(array1, array2); 
                break; 
            default: 
                System.out.println("Invalid symbol! Please enter +, -, or *."); 
                break; 
        } 
         
        if (resultArray != null) { 
            System.out.println("Result:"); 
            displayArray(resultArray); 
        } 
         
        sc.close(); 
    } 
     

    public static int[][] readArray(Scanner sc) { 
        int[][] array = new int[3][3]; 
        for (int i = 0; i < 3; i++) { 
            for (int j = 0; j < 3; j++) { 
                array[i][j] = sc.nextInt(); 
            } 
        } 
        return array; 
    } 
     
    public static int[][] addArrays(int[][] array1, int[][] array2) { 
        int[][] result = new int[3][3]; 
        for (int i = 0; i < 3; i++) { 
            for (int j = 0; j < 3; j++) { 
                result[i][j] = array1[i][j] + array2[i][j]; 
            } 
        } 
        return result; 
    } 
     
    public static int[][] subtractArrays(int[][] array1, int[][] array2) { 
        int[][] result = new int[3][3]; 
        for (int i = 0; i < 3; i++) { 
            for (int j = 0; j < 3; j++) { 
                result[i][j] = array1[i][j] - array2[i][j]; 
            } 
        } 
        return result; 
    } 
     
    public static int[][] multiplyArrays(int[][] array1, int[][] array2) { 
        int[][] result = new int[3][3]; 
        for (int i = 0; i < 3; i++) { 
            for (int j = 0; j < 3; j++) { 
                for (int k = 0; k < 3; k++) { 
                    result[i][j] += array1[i][k] * array2[k][j]; 
                } 
            } 
        } 
        return result; 
    } 
     
    public static void displayArray(int[][] array) { 
        for (int i = 0; i < 3; i++) { 
            for (int j = 0; j < 3; j++) { 
                System.out.print(array[i][j] + " "); 
            } 
            System.out.println(); 
 
 
        } 
    } 
} 