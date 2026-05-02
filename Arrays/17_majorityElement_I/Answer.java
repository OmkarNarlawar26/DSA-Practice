import java.util.Scanner;

// class Solution {
//     public int majorityElement(int[] nums) {
        
//         // Time Complexity : O(n²)

//         int n = nums.length;
//         int count = 0;
//         int Max = 0;
//         int temp = 0;

//         for(int i = 0; i < n; i++)
//         {
//             count = 0;

//             for(int j = i; j < n; j++)
//             {
//                 if(nums[i] == nums[j])
//                 {
//                     count++;
//                 }
//             }

//             if(Max < count)
//             {
//                 Max = count;
//                 temp = i;
//             }
//         }

//         return nums[temp];
//     }
// }

class Solution {
    public int majorityElement(int[] nums) {
        
        // Time complexity : O(N)

        int Count = 0;
        int Candidate = 0;

        for(int num : nums)
        {
            if(Count == 0)
            {
                Candidate = num;
            }

            if(num == Candidate)
            {
                Count++;
            }
            else
            {
                Count--;
            }
        }

        return Candidate;
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

        int result = obj.majorityElement(nums);

        System.out.println("Majority Element is: " + result);

        sc.close();
    }
}