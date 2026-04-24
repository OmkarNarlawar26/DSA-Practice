import java.util.Scanner;

class Solution {
    public int missingNumber(int[] nums) {

        int n = nums.length;

        int ExpectedSum = n * (n + 1) / 2;

        int ActualSum = 0;

        for(int i = 0; i < n; i++)
        {
            ActualSum = ActualSum + nums[i];
        }

        return ExpectedSum - ActualSum;
    }
}

public class Answer {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter elements:");
        for(int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        Solution obj = new Solution();
        int result = obj.missingNumber(nums);

        System.out.println("Missing Number is: " + result);

        sc.close();
    }
}

// Time Complexity: O(n)