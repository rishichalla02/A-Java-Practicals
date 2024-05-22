public class Prac_2_2 {
    public static void main(String[] args) {
        int matrix[][] = {{2,41,9},{3,31,96},{10,6,32}};
        int min = matrix[0][0];
        int min_i = 0,  min_j = 0;

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