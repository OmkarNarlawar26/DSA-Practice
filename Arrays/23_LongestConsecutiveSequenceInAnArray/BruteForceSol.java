import java.util.*;

class Solution {
    // Function to search for a given number in the array
    private boolean linearSearch(int[] a, int num) {
        // Get length of the array
        int n = a.length;
        // Traverse through the array to check if the number exists
        for (int i = 0; i < n; i++) {
            // If element matches the number, return true
            if (a[i] == num)
                return true;
        }
        // Number not found
        return false;
    }

    // Function to find the length of the longest consecutive sequence
    public int longestConsecutive(int[] nums) {
        // If the array is empty, no sequence exists
        if (nums.length == 0) {
            return 0;
        }
        
        // Get length of the array
        int n = nums.length;
        
        // Initialize the longest sequence length to 1 (minimum possible)
        int longest = 1;

        // Iterate over each element of the array
        for (int i = 0; i < n; i++) {
            // Store the current number
            int x = nums[i];
            
            // Start sequence length count from 1
            int cnt = 1;

            // Search for consecutive numbers starting from x + 1
            while (linearSearch(nums, x + 1) == true) {
                // Move to the next consecutive number
                x += 1;
                
                // Increase the count of the current sequence
                cnt += 1;
            }

            // Update the longest sequence length if the current is longer
            longest = Math.max(longest, cnt);
        }
        
        // Return the longest consecutive sequence length found
        return longest;
    }

    public static void main(String[] args) {
        // Input array of integers
        int[] a = {100, 4, 200, 1, 3, 2};

        // Create an instance of Solution class
        Solution solution = new Solution();

        // Call the function and store the result
        int ans = solution.longestConsecutive(a);
        
        // Output the result
        System.out.println("The longest consecutive sequence is " + ans);
    }
}

// Time Complexity: O(n*n)
// Space Complexity: O(1)