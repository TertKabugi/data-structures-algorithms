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
        System.out.println(
            "The maximum profit = " + maxProfit(array));
       
    }


    private static int maxProfit(int[] array) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : array){
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
