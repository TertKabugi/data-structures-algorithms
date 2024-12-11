import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class RemovingDuplicates {
    public static void main(String args[]) throws IOException {
        int[] array;
        int n = 0;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the size of the array: ");
            int s = 0;
            if (sc.hasNextInt()) {
                s= sc.nextInt();
            }
            array = new int[s];
            n = array.length;

            System.out.println("Enter the elements of the array: ");
            for (int i = 0; i < s; i++){
                if (sc.hasNextInt()) {
                    array[i] = sc.nextInt();
                }
            }

            System.out.println("The elements of the array are: " );
            for (int i = 0; i < s; i++){
                System.out.print(array[i]+ " ");
            }

        }

        int k = removeDuplicates(array);
        assert k == array.length;
        System.out.println("k = " + k);
        System.out.println("The new array is: ");
        for (int i = 0; i < k; i++){
            System.out.print(array[i]+ " ");
        }
    }

    private static int removeDuplicates(int[] array) {
        Arrays.sort(array);
        int k = 1;
        for (int i = 1; i < array.length; i++){
            if (array[i] != array[k]) {
                k++;
                array[k] = array[i];
            }
        }
        return k;
    }
}
