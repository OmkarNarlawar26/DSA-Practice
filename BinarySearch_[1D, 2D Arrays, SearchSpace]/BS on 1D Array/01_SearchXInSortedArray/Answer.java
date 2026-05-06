import java.util.Scanner;

// BRUTE FORCE O(N)

// class Solution {
//     public int search(int[] nums, int target) {
       
//        for(int i = 0; i < nums.length; i++)
//        {
//             if(nums[i] == target)
//             {
//                 return i;
//             }
//        }

//        return -1;
//     }
// }

// BETTER APPROACH 

// class Solution {
//     public int search(int[] nums, int target) {
//         for(int i = 0; i < nums.length; i++) {
//             if(nums[i] == target) return i;
            
//             // optimization: stop if element exceeds target
//             if(nums[i] > target) break;
//         }
//         return -1;
//     }
// }

// OPTIMAL Solution : O(log n)

class Solution {
    public int search(int [] nums, int target) {

        int low = 0, high = nums.length - 1;

        while(low <= high)
        {
            int mid = low + (high - low)/2;

            if(nums[mid] == target)
            {
                return mid;
            }
            else if(nums[mid] < target)
            {
                low = mid + 1;
            }
            else
            {
                high = mid - 1;
            }
        }
        return -1;
    }
}

class Answer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Please enter the number of elements in the array:");
        int n = scanner.nextInt();
        
        int[] nums = new int[n];
        System.out.println("Enter the sorted array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }
        
        System.out.println("Enter the target value to search:");
        int target = scanner.nextInt();
        
        Solution solution = new Solution();
        int result = solution.search(nums, target);
        
        if (result != -1) {
            System.out.println("Target found at index: " + result);
        } else {
            System.out.println("Target not found in the array.");
        }
        
        scanner.close();
    }
}

