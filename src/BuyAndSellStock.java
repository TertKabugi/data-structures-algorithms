import java.util.Scanner;

public class BuyAndSellStock {
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

        
        maxProfit(array);
        // System.out.println(
        //     "The largest element = " + largest(array));

        // System.out.println(
        //     "The smallest element = " + smallest(array));
        System.out.println(
            "The maximum profit = " + maxProfit(array));
       
    }

    // private static int largest(int[] array) {
    //     int max = array[0];
    //     for (int i = 0; i < array.length; i++){
    //         if (array[i] > max) {
    //             max = array[i];
    //         }
    //     }
    //     return max;

    // }

    // private static int smallest(int[] array) {
    //     int min = array[0];

    //     for (int i = 0; i < array.length; i++) {
    //         if (array[i] < min){
    //             min = array[i];
    //         }
    //     }
    //     return min;
    // }

    private static int maxProfit(int[] array) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price = 0; price < array.length; price++){
            if (price < minPrice) {
                minPrice = price;
            }
            int profit = price - minPrice;
            if (profit > maxProfit) {
                maxProfit = profit;
            }
        }
        

        return maxProfit;
    }

}
