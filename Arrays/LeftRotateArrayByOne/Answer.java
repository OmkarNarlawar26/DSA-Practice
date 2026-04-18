import java.util.*;

class Solution {
    public void rotateArrayByOne(int[] nums) {
        int temp = nums[0];

        for(int i = 0; i < nums.length - 1; i++)
        {
            nums[i] = nums[i + 1];
        }

        nums[nums.length - 1] = temp;
    }
}

// Time Complexity : O(N)
// Space Complexity : O(1)

public class Answer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];

        for(int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        Solution obj = new Solution();
        obj.rotateArrayByOne(nums);

        for(int i = 0; i < n; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}