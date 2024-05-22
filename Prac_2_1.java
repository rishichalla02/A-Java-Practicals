import java.util.*;
public class Prac_2_1 {
    public static void main(String[] args) {
        int matrix [] [] = new int[6][6];
        Random r = new Random(); 

        int i,j;

        for(i=0;i<6;i++){
            for(j=0;j<6;j++){
                matrix[i][j] = r.nextInt(2);
            }
        }
        System.out.println();
        for(i=0;i<6;i++){
            for(j=0;j<6;j++){
                System.out.println(matrix[i][j] + "\t");
            }
            System.out.println("\n");
        }

        boolean rowodd = true;
        int rowones = 0;
        for(i=0;i<6;i++){
            for(j=0;j<6;j++){
                if(matrix[i][j]==1){
                    rowones++;
                }
            }
            if(rowones%2==0){
                rowodd=false;
            }
        }

        if(rowodd){
            System.out.println("All the rows have odd number of 1's");
        }
        else{
            System.out.println("All the rows do not have odd number of 1's");
        }
        boolean colodd = true;
        int colones = 0;
        for(i=0;i<6;i++){
            for(j=0;j<6;j++){
                if(matrix[i][j]==1){
                    colones++;
                }
            }
            if(colones%2==0){
                colodd = false;
            }
        }
        if(colodd){
            System.out.println("All the cols have odd number of 1's");
        }
        else{
            System.out.println("All the cols do not have odd number of 1's");
        }
    }
}