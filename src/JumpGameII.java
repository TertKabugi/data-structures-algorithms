import java.util.Scanner;

public class JumpGameII {

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

        minJump(array);
        System.out.println(
            "The Minimum Jumps = " + minJump(array));
       
    }

    private static int minJump(int[] array) {
        int goal = array.length - 1;
        int minJumps = 0;
        
        for (int i = array.length - 1; i >= 0; i--){
            if(i + array[i] >= goal){
                goal = i;
            }
        }

        return goal;

    }
}
