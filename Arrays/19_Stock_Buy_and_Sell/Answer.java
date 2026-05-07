import java.util.Scanner;

class Solution {
    public int stockBuySell(int[] arr, int n) {
       
       int minprice = arr[0];
       int maxprofit = 0;

       for(int i = 0; i < arr.length; i++)
       {
            int profit = arr[i] - minprice;

            maxprofit = Math.max(maxprofit, profit);

            minprice = Math.min(minprice, arr[i]);
       }

       return maxprofit;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of days: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter prices:");
        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }

        Solution sol = new Solution();

        int profit = sol.stockBuySell(arr, n);
        System.out.println("Maximum profit: " + profit);
    }
}