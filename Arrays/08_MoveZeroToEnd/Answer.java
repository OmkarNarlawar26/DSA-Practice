import java.util.*;

// class Solution {
//     public void moveZeroes(int[] nums) {
        
        // BruteForce

        // Time Complexity: O(n)
        // Space Complexity: O(n) (extra array used)
        
//         ArrayList<Integer> temp = new ArrayList<>();

//         // Store non-zero elements
//         for(int i = 0; i < nums.length; i++)
//         {
//             if(nums[i] != 0)
//             {
//                 temp.add(nums[i]);
//             }
//         }

//         int nz = temp.size();

//         // Copy non-zero elements
//         for(int i = 0; i < nz; i++)
//         {
//             nums[i] = temp.get(i);
//         }

//         // Fill remaining with zeroes
//         for(int i = nz; i < nums.length; i++)
//         {
//             nums[i] = 0;
//         }
//     }
// }

class Solution {
    public void moveZeroes(int[] nums) {
        
        // OPTIMAL SOLUTION 

        // Time Complexity: O(n)
        // Space Complexity: O(1)

       int j = 0;

       for(int i = 0; i < nums.length; i++)
       {
            if(nums[i] != 0)
            {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
       }
    }
}

public class Answer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.print("Enter elements: ");
        for(int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        Solution obj = new Solution();
        obj.moveZeroes(nums);

        System.out.print("Array after moving zeroes: ");
        for(int i = 0; i < n; i++) {
            System.out.print(nums[i] + " ");
        }

        sc.close();
    }
}