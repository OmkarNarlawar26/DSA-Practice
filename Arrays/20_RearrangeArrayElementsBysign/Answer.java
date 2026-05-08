import java.util.Scanner;

class Solution {
    public int[] rearrangeArray(int[] nums) {
        
        int[] ans = new int[nums.length];
        int Positive = 0;       // EVEN index
        int Negative = 1;       // ODD index

        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i] > 0)
            {
                ans[Positive] = nums[i];
                Positive = Positive + 2;
            }
            else
            {
                ans[Negative] = nums[i];
                Negative = Negative + 2;
            }
        }

        return ans;
    }
}

// Time Complexity : O(N)
// Space COmplexity : O(N)

class Answer {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter the elements of the array:");
        for(int i = 0; i < n; i++)
        {
            nums[i] = sc.nextInt();
        }

        Solution sol = new Solution();

        int[] result = sol.rearrangeArray(nums);

        System.out.println("Rearranged array:");
        for(int num : result)
        {
            System.out.print(num + " ");
        }

        System.out.println();

        sc.close();
    }
}