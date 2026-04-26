import java.util.Scanner;

class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        
        int Count = 0;
        int Max = 0;

        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i] == 1)
            {
                Count++;
            }

            if(nums[i] == 0)
            {
                Count = 0;
            }

            if(Max < Count)
            {
                Max = Count;
            }
        }

        return Max;
    }
}

// Time Complexity : O(N)

public class Answer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // User-friendly input
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter elements (only 0s and 1s): ");
        for(int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        Solution obj = new Solution();
        int result = obj.findMaxConsecutiveOnes(nums);

        System.out.println("Maximum consecutive 1s: " + result);

        sc.close();
    }
}