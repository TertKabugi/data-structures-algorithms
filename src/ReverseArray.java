import java.io.*;
import java.util.Scanner;


public class ReverseArray {
    
    public static void main(String args[]) throws IOException {
        int[] array;
        int n;
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
        }
            
        revArray(array, n);
        System.out.println(
            "The sorted array =: ");
        for(int i = 0; i<array.length; i++){
            System.out.print(array[i]+ "");
        }
    }

    private static void revArray(int[] array, int n) {
        
        // NOT-IN-PLACE Implementation
        // int[] newArray = new int[n];

        // for(int i = 0; i < n; i++){
        //     newArray[n-i-1] = array[i];
        // }

        // System.arraycopy(newArray, 0, array, 0, n);


        // IN-PLACE Implementation
        for (int i = 0; i < n/2; i++){
            int temp = array[i];
            array[i] = array[n-i-1];
            array[n-i-1] = temp;
        }
        
    }
    
}

