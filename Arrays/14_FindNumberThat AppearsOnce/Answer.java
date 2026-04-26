import java.util.*;

// class Solution {
//     public int singleNumber(int[] nums) {
        
//         for(int i = 0; i < nums.length; i++)
//         {
//             int Count = 0;

//             for(int j = 0; j < nums.length; j++)
//             {
//                 if(nums[i] == nums[j])
//                 {
//                     Count++;
//                 }   
//             }

//             if(Count == 1)
//             {
//                 return nums[i];
//             }
//         }

//         return -1;
//     }
// }

// Time Complexity : O(n²)

class Solution {
    public int singleNumber(int[] nums) {
        
        int result = 0;

        for(int i = 0; i < nums.length; i++)
        {
            result = result ^ nums[i];      // XOR
        }

        return result;
    }
}

// Time & Space Complexity
// Time: O(n)
// Space: O(1)



class Answer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of elements:");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter elements (every number twice except one):");
        for(int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        Solution obj = new Solution();
        int result = obj.singleNumber(nums);

        System.out.println("The single number is: " + result);

        sc.close();
    }
}