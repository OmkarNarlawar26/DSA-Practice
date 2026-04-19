import java.util.*;

// class Solution {
//     public void rotateArray(int[] nums, int k) {

        //  BRUTE FORCE METHOD

        // k = k % nums.length;
        // int[] temp = new int[k];

        // for(int i = 0; i < k; i++)
        // {
        //     temp[i] = nums[i];
        // }

        // for(int i = k; i < nums.length; i++)
        // {
        //     nums[i-k] = nums[i];
        // }

        // for(int i = nums.length - k; i < nums.length; i++)
        // {
        //     nums[i] = temp[i - (nums.length - k)];
        // }
//     }
// }

// OPTIMAL SOLUTION 
class Solution{
    public void rotateArray(int[] nums, int k) {
        int n = nums.length;
        k = k % n;

        reverse(nums, 0, k - 1);
        reverse(nums, k, n - 1);
        reverse(nums, 0, n - 1);
    }

    private void reverse(int[] nums, int start, int end) {
        while(start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}

public class Answer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];

        for(int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int k = sc.nextInt();

        Solution obj = new Solution();
        obj.rotateArray(nums, k);

        for(int i = 0; i < n; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}