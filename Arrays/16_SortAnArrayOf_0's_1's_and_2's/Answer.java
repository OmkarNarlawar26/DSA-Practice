import java.util.Scanner;

// class Solution {
//     public void sortZeroOneTwo(int[] nums) {
        
//         int n = nums.length;
//         int temp = 0;

//         Time Complexity : O(n²)

//         for(int i = 0; i < n; i++)
//         {
//             for(int j = i + 1; j < n; j++)
//             {
//                 if(nums[i] > nums[j])
//                 {
//                     temp = nums[i];
//                     nums[i] = nums[j];
//                     nums[j] = temp;
//                 }
//             }
//         }
//     }
// }


// NOW IT CAN BE SOLVED USING DUTCH NATIONAL FLAG ALGORITHM

class Solution {
    public void sortZeroOneTwo(int[] nums) {
        
        int low = 0, mid = 0, high = nums.length - 1;
        int temp = 0;

        // Time COmplexity : O(N)

        while(mid <= high)
        {
            if(nums[mid] == 0)
            {
                temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;

                low++;
                mid++;
            }
            else if(nums[mid] == 1)
            {
                mid++;
            }
            else // if mid == 2
            {
                temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;

                high--;
            }
        }

    }
}



class Answer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of elements:");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter elements (only 0, 1, 2):");
        for(int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        Solution obj = new Solution();
        obj.sortZeroOneTwo(nums);

        System.out.println("Sorted Array:");
        for(int i = 0; i < n; i++) {
            System.out.print(nums[i] + " ");
        }

        sc.close();
    }
}