import java.util.*;

class Solution {
    public int removeDuplicates(int[] nums) {
        
        if(nums.length == 0)
        {
            return 0;
        }

        int i = 0;

        for(int j = 1; j < nums.length; j++)
        {
            if(nums[j] != nums[i])
            {
                i++;
                nums[i] = nums[j];
            }
        }

        return i + 1;
    }
}

class Answer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];

        for(int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        Solution sol = new Solution();
        int k = sol.removeDuplicates(nums);

        System.out.println(k);

        for(int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}

// Time Complexity : O(N)