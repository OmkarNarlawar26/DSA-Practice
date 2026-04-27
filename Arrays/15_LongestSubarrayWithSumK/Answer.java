import java.util.*;

class Solution {
    public int longestSubarray(int[] nums, int k) {
        
        int maxLength = 0;

        for(int i = 0; i < nums.length; i++)
        {
            int Sum = 0;

            for(int j = i; j < nums.length; j++)
            {
                Sum = Sum + nums[j];

                if(Sum == k)
                {
                    int Length = j - i + 1;
                    
                    if(Length > maxLength)
                    {
                        maxLength = Length;
                    }
                }
            }
        }

        return maxLength;
    }
}

// Time Complexity : O(n²)

public class Answer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter elements:");
        for(int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.print("Enter target sum (k): ");
        int k = sc.nextInt();

        Solution sol = new Solution();
        int result = sol.longestSubarray(nums, k);

        System.out.println("Longest subarray length with sum " + k + " is: " + result);

        sc.close();
    }
}