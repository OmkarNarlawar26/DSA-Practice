import java.util.Scanner;

class Solution {
    public int largestElement(int[] nums) {
        
        int i = 0;
        int max = nums[i];

        for(i = 1; i < nums.length; i++)
        {
            if(max < nums[i])
            {
                max = nums[i];
            }
        }

        return max;
    }
}

// Time Complexity : O(N)

public class Answer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter " + n + " elements:");

        for(int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        Solution obj = new Solution();
        int result = obj.largestElement(nums);

        System.out.println("Largest Element: " + result);

        sc.close();
    }
}