import java.util.*;

class Solution {
    public int countNonMinimum(int[] nums) {
        
        if (nums.length == 0) return 0;
        
        int Min = nums[0];
        
        for(int i = 1; i < nums.length; i++)
        {
            if(Min > nums[i])
            {
                Min = nums[i];
            }
        }
        
        int Count = 0;
        
        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i] != Min)
            {
                Count = Count + 1;
            }
        }
        
        return Count;
    }
}

// Time Complexity: O(n)
// Space Complexity: O(1)

public class Answer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];

        for(int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        Solution obj = new Solution();
        int result = obj.countNonMinimum(nums);

        System.out.println(result);
    }
}