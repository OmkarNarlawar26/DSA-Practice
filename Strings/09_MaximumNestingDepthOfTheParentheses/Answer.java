/*

A string s is a valid parentheses string (VPS) if it meets the following conditions:

It only contains digits 0-9, arithmetic operators +, -, *, /, and parentheses (, ).
The parentheses are balanced and correctly nested.

Your task is to compute the maximum nesting depth of parentheses in s. The nesting depth is the highest number of parentheses that are open at the same time at any point in the string.

Example 1

    Input: s = "(1+(2*3)+((8)/4))+1"

    Output: 3

    Explanation:
        The deepest nested sub-expression is ((8)/4), which has 3 layers of parentheses.

Example 2

    Input: s = "(1)+((2))+(((3)))"

    Output: 3

    Explanation:
        The digit '3' is enclosed in 3 pairs of parentheses.

Algorithm: 

    We're interested in measuring how deeply nested the parentheses are at any point in the string.

    Each opening bracket indicates going deeper into a new level of nesting.

    Each closing bracket signals returning to the previous level of nesting.

    By tracking how deep we go at each step, we can monitor the peak nesting level.

    The deepest level we reach during this traversal is the answer.

*/

class Solution
{
    public int maxDepth(String s)
    {
        int p = 0;
        int ans = 0;

        for(char ch : s.toCharArray())
        {
            if(ch == '(')
            {
                p++;
            }
            else if(ch == ')')
            {
                p--;
            }

            ans = Math.max(ans, p);
        }

        return ans;
    }
}

public class Answer
{
    public static void main(String[] A)
    {
        Solution sol = new Solution();

        String s = "(1+(2*3)+((8)/4))+1";

        int result = sol.maxDepth(s);

        System.out.println(result);
    }
}

// Time Complexity: O(n), where n is the length of the string.

// Space Complexity: O(1), as only constant extra space is used.