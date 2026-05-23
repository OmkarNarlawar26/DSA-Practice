import java.util.*;

class Solution {
    public int longestConsecutive(int[] nums) {
        // Store the size of the array
        int n = nums.length;

        // Return 0 if array is empty
        if (n == 0) return 0; 

        // Sort the array to bring consecutive numbers together
        Arrays.sort(nums); 

        // Variable to track the last smaller element in sequence
        int lastSmaller = Integer.MIN_VALUE; 

        // Variable to store the current sequence length
        int cnt = 0; 

        // Variable to store the longest sequence length found
        int longest = 1; 

        // Iterate through the sorted array
        for (int i = 0; i < n; i++) {
            // Case 1: Current element is exactly one greater than lastSmaller → part of sequence
            if (nums[i] - 1 == lastSmaller) {
                // Increment the sequence length
                cnt += 1; 
                // Update the last smaller element
                lastSmaller = nums[i]; 
            } 
            // Case 2: Current element is not consecutive and not a duplicate
            else if (nums[i] != lastSmaller) {
                // Reset the sequence length count to 1
                cnt = 1; 
                // Update the last smaller element
                lastSmaller = nums[i]; 
            }
            // Update the longest sequence length if the current sequence is longer
            longest = Math.max(longest, cnt); 
        }
        
        // Return the length of the longest consecutive sequence
        return longest;
    }

    public static void main(String[] args) {
        // Input array
        int[] a = {100, 4, 200, 1, 3, 2}; 

        // Create an instance of Solution class
        Solution solution = new Solution(); 
        
        // Function call for finding longest consecutive sequence
        int ans = solution.longestConsecutive(a); 
        
        // Output the result
        System.out.println("The longest consecutive sequence is " + ans);
    }
}

// Time Complexity: O(n log n)
// Space Complexity: O(1)