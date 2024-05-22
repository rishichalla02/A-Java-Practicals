import java.util.Scanner;
public class Prac_2_5 {
    public static void main(String[] args) {
        int arr[] = new int[10]; 
        int n = arr.length;
        int i,j;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the 10 elements of aaray: ");
        for(i=0;i<n-1;i++){
            arr[i] = sc.nextInt();
        }
        int min=0;
        int min_i=0;
        int temp=0;
        for( i=0; i<n-1;i++){
            min = arr[i]; 
            for( j=0;j<n;j++){
                if(arr[j]<min){
                    min = arr[j];
                    min_i = j;
                }
            }
            temp = arr[i];
            arr[i] = min;
            arr[min_i] = temp;
        }
            for(int x:arr){
            System.out.println(x+ " ");
            }
        sc.close();

    }
}