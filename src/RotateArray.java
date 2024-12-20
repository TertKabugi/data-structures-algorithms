import java.util.Scanner;

public class RotateArray {
    public static void main(String[] args){
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

        int k = 2;
        rotateArray(array, k);
        System.out.println(
            "The rotated array = ");
        for(int i = 0; i<array.length; i++){
            System.out.print(array[i]+ " ");
        }
    }

    private static void rotateArray(int[] array, int k) {
        int n = array.length;
        k %= n;
        reverseArray(array, 1, n);
        reverseArray(array, 0, k-1);
        reverseArray(array, k, n-1);

    }

    private static void reverseArray(int[] array, int start, int end) {
        while (start < end) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
        
        
    }

    
}
