import java.util.*;

class Solution {
    public int secondLargestElement(int[] nums) {
        int Largest = nums[0];
        int sLargest = -1;

        for(int i = 1; i < nums.length; i++)
        {
            if(nums[i] > Largest)
            {
                sLargest = Largest;
                Largest = nums[i];
            }
            else if(nums[i] < Largest && nums[i] > sLargest)
            {
                sLargest = nums[i];
            }
        }

        return sLargest;
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

        System.out.println("Enter elements:");
        for(int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        Solution obj = new Solution();
        int result = obj.secondLargestElement(nums);

        System.out.println("Second Largest Element is: " + result);

        sc.close();
    }
}