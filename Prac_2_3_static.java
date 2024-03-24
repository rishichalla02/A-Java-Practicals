import java.util.Arrays;
public class Prac_2_3_static {

        public static void main(String[] args) {

            int[] originalArray = {1, 2, 2,3,3,4,5,5,6,7};
            int[] newArray = eliminateDuplicates(originalArray);

            System.out.println("Original array: " + Arrays.toString(originalArray));
            System.out.println("New array after eliminating duplicates: " + Arrays.toString(newArray));
        }

        public static int[] eliminateDuplicates(int[] array) {

            Arrays.sort(array);

            int length = array.length;

            int uniqueCount = 1;
            for (int i = 1; i < length; i++) {
                if (array[i] != array[i - 1]) {
                    uniqueCount++;
                }
            }

            int[] newArray = new int[uniqueCount];
            newArray[0] = array[0];

            int newIndex = 1;

            for (int i = 1; i < length; i++) {
                if (array[i] != array[i - 1]) {
                    newArray[newIndex] = array[i];
                    newIndex++;
                }
            }
            return newArray;
        }
    }
