import java.util.Scanner;

// BRUTE FORCE  (O(n³))

// class Solution {
//     public int maxSubArray(int[] nums) {
//         int n = nums.length;
//         int maxSum = Integer.MIN_VALUE;

//         for(int i = 0; i < n; i++) {
//             for(int j = i; j < n; j++) {
//                 int sum = 0;

//                 for(int k = i; k <= j; k++) {
//                     sum += nums[k];
//                 }

//                 maxSum = Math.max(maxSum, sum);
//             }
//         }

//         return maxSum;
//     }
// }


// BETTER APPROACH  (O(n²))

// class Solution {
//     public int maxSubArray(int[] nums) {
//         int n = nums.length;
//         int maxSum = Integer.MIN_VALUE;

//         for(int i = 0; i < n; i++) {
//             int sum = 0;

//             for(int j = i; j < n; j++) {
//                 sum += nums[j];
//                 maxSum = Math.max(maxSum, sum);
//             }
//         }

//         return maxSum;
//     }
// }



// KADANE'S ALGORITHM  (optimal)   O(N)

class Solution {
    public int maxSubArray(int[] nums) {
        
        int Sum = 0;
        int Max = nums[0];

        for(int i = 0; i < nums.length; i++)
        {
            Sum = Sum + nums[i];

            if(Sum > Max)
            {
                Max = Sum;
            }

            if(Sum < 0)
            {
                Sum = 0;
            }
        }

        return Max;
    }
}

class Answer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter elements:");
        for(int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        Solution obj = new Solution();
        int result = obj.maxSubArray(nums);

        System.out.println("Maximum Subarray Sum: " + result);
    }
}