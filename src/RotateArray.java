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

        int k = 4;
        rotateArray(array, k);
        System.out.println(
            "The rotated array = ");
        for(int i = 0; i<array.length; i++){
            System.out.print(array[i]+ " ");
        }
    }

    private static void rotateArray(int[] array, int k) {
        int n = array.length;
        
        for (int i = n-k; i < n; i++) {
            int temp = array[i];
            array[i] = array[n-k];
            array[n-k] = temp;
            i++;
        }
    }
}
