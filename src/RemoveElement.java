import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;


public class RemoveElement {
    public static void main(String args[]) throws IOException {
        int[] array;
        int n;
        int val = 0;
        // Take the array size from the user
        try (Scanner sc = new Scanner(System.in)) {
            // Take the array size from the user
            System.out.println("Enter the size of the array: ");
            int s = 0;
            if (sc.hasNextInt()) {
                s = sc.nextInt();
            }   // Initialize the array's
            // size using user input
            array = new int[s];
            n = array.length;
            
            // Take user elements for the array
            System.out.println(
                    "Enter the elements of the array: ");
            for (int i = 0; i < s; i++) {
                if (sc.hasNextInt()) {
                    array[i] = sc.nextInt();
                }
            }   System.out.println(
                    "The elements of the array are: ");
            for (int i = 0; i < s; i++) {
                System.out.print(array[i] + " ");
            }
            
            System.out.println("Enter value to be removed");
            val = sc.nextInt();
            for (int i = 0; i < n; i++) {
                if (val != array[i]){
                    System.out.println("Value is invalid");
                } else {
                    System.out.println("Val = " + val);
                }
            }
            
        }
        int k = removeElement(array, val); // Calls your implementation

        assert k == array.length;
        Arrays.sort(array, 0, k);
        System.out.println("k = " + k);
        System.out.println(
            "The new array =  ");
        for(int i = 0; i < k; i++){
            System.out.print(array[i]+ " ");
        }
        
        }
        
        private static int removeElement(int[] array, int val) {
        int k = 0;
        for (int i = 0; i < array.length ;i++){
            if (array[i] != val){
                int temp = array[k];
                array[k] = array[i];
                array[i] = temp;
                k++;
            }
        }
        return k;
    }

}
            


