import java.util.Scanner;

public class MajorityElement {
    public static void main(String[] args) {
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

        // majorityElement(array);
        System.out.println("The Majority Element is: ");
        System.out.print(majorityElement(array));
    }

    private static int majorityElement(int[] array) {
        int i = 0;
        int n = array.length/2;
        for (; i < array.length; i++){
            int count = 0;
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j]) {
                    count++;
                }
            }
            if (count > n){
               return array[i];
            }
        }

        return 0;
    }

}
