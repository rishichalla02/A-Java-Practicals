public class Prac_2_5_static {

    public static void main(String[] args) {
        
        int[] array = {5, 3, 9, 7, 1, 8, 6, 2, 4, 10};

        System.out.println("Original array:");
        printArray(array);

        selectionSort(array);

        System.out.println("\nSorted array:");
        printArray(array);
    }

    public static void selectionSort(int[] array) {
        int n = array.length;

        for (int i = 0; i < n - 1; i++) {

            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }

    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}