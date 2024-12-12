import java.util.Arrays;
import java.util.Scanner;

public class RemovingDuplicatesTwo {
    public static void main(String args[]){
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
            System.out.print(array[i] + " ");
        }
    }

    private static int removeDuplicates(int[] array) {
        Arrays.sort(array);
        int k = 0;
        for (int i = 0; i < array.length; i++){
            if (k < 1 || array[i] != array[k - 1]) {
                array[k] = array[i];
                k++;
            }
        }
        return k;

    }

}
