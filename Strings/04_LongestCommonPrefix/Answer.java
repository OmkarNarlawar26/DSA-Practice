/*

Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".

Example 1

    Input : str = ["flowers" , "flow" , "fly", "flight" ]

    Output : "fl"

    Explanation :
        All strings given in array contains common prefix "fl".

Example 2

    Input : str = ["dog" , "cat" , "animal", "monkey" ]

    Output : ""

    Explanation :
        There is no common prefix among the given strings in array.


Algorithm
    - The common prefix across all strings must exist between the smallest and largest string when sorted lexicographically.

    - Sorting the array helps bring these boundary strings to the extremes.

    - By comparing only the first and last strings, we can determine the full common prefix shared by the entire array.

    - Character-wise comparison from the beginning allows us to identify where the prefix stops.

    - The point at which the characters start differing marks the end of the shared prefix.

    - The portion before this mismatch is the longest common prefix among all strings.

*/

import java.util.Arrays;

class Solution
{
    public String longestCommonPrefix(String[] str)
    {
        // To store the result prefix
        StringBuilder ans = new StringBuilder();

        // Sort the array of strings
        Arrays.sort(str);

        // First string after sorting
        String first = str[0];

        // Last string after sorting
        String last = str[str.length - 1];

        // Compare characters of the first and last strings
        for(int i = 0 ; i < Math.min(first.length(), last.length()); i++)
        {
            // Stop if characters are different
            if(first.charAt(i) != last.charAt(i))
            {
                return ans.toString();
            }

            // Add matching character to result
            ans.append(first.charAt(i));
        }

         // Return the final common prefix
        return ans.toString();
    }
}

public class Answer
{
    public static void main(String A[])
    {
        
        Solution sol = new Solution();

        String[] input = {"interview", "internet", "internal", "interval"};

        String result = sol.longestCommonPrefix(input);

        System.out.println("Longest Common Prefix : " + result);
    }
}

// Time Complexity: O(N * log N + M), where N is the number of strings and M is the minimum length of a string. The sorting operation takes O(N * log N) time, and the comparison of characters in the first and last strings takes O(M) time.

// Space Complexity: O(M), as the ans variable can store the length of the prefix which in the worst case will be O(M).