import java.util.*;
import java.lang.Math;
import java.util.random.*;
public class Prac_2_2Random {
    public static void main(String[] args) {
        double[][] matrix = Random();
        double min = matrix[0][0];
        double min_i=0,  min_j=0;

        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]<min){
                    min = matrix[i][j];
                    min_i=i;
                     min_j=j;
                }
            }
        }
        System.out.println("Minimum element is :" +min);
    }
}