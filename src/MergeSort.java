import java.io.*;
import java.util.Scanner;


public class MergeSort {
    
    public static void main(String args[]) throws IOException {
        int[] array;
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
            
        mergeSort(array);
        System.out.println(
            "The sorted array =: ");
        for(int i = 0; i<array.length; i++){
            System.out.print(array[i]+ " ");
        }
    }

    private static void mergeSort(int[] array) {

        int length = array.length;
        if (length <=1 ) return; //recursion start point

        int middle = length / 2;
        int[] leftArray = new int [middle];
        int[] rightArray = new int[length - middle];

        int i = 0; //Left Array Indices
        int j = 0; //Right Array Indices

        for(; i<length; i++){
            if (i < middle){
                leftArray[i] = array[i];
            } else {
                rightArray[j] = array[i];
                j++;
            }
        }
        mergeSort(leftArray);
        mergeSort(rightArray);

        merge(leftArray, rightArray, array);
    }

    private static void merge(int[] leftArray, int[] rightArray, int[] array) {
        
        int leftSize = array.length / 2;
        int rightSize = array.length - leftSize;
        int i = 0, l = 0, r = 0;

        while(l < leftSize && r < rightSize){
            if (leftArray[l] < rightArray[r]) {
                array[i] = leftArray[l];
                i++;
                l++;
            } else {
                array[i] = rightArray[r];
                i++;
                r++;
            }
        }
        while(l < leftSize){
            array[i] = leftArray[l];
            i++;
            l++;
        }
        while(r < rightSize){
            array[i] = rightArray[r];
            i++;
            r++;
        }
    }

    
}

