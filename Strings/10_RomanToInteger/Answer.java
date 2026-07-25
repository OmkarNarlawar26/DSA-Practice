/*

Roman numerals are represented by seven different symbols:

I = 1
V = 5
X = 10
L = 50
C = 100
D = 500
M = 1000

Roman numerals are typically written from largest to smallest, left to right. However, in specific cases, a smaller numeral placed before a larger one indicates subtraction.

The following subtractive combinations are valid:

    I before V (5) and X (10) → 4 and 9
    X before L (50) and C (100) → 40 and 90
    C before D (500) and M (1000) → 400 and 900

Given a Roman numeral, convert it to an integer.

    Example 1

        Input: s = "III"

        Output: 3

            Explanation: III = 1 + 1 + 1 = 3

    Example 2

        Input: s = "XLII"

        Output: 42

            Explanation: XL = 40, II = 2 → 40 + 2 = 42

Algorithm:

    Understand that Roman numerals are generally written in descending order of value, and their values are added.

    However, when a smaller value appears before a larger one, it indicates subtraction instead of addition.

    To handle this, scan the string from left to right and compare each character with the one after it.

    If the current symbol is smaller than the next, treat it as a subtractive pair.

    Otherwise, treat the symbol as a standalone value and add it normally.

    The final character is always added since there's nothing after it to compare.

*/

import java.util.*;

class Solution
{
    public int romanToInteger(String s)
    {
        int res = 0;

        Map<Character, Integer> roman = new HashMap<>();

        roman.put('I', 1);
        roman.put('V', 5);
        roman.put('X', 10);
        roman.put('L', 50);
        roman.put('C', 100);
        roman.put('D', 500);
        roman.put('M', 1000);

        for(int i = 0; i < s.length() - 1; i++)
        {
            if(roman.get(s.charAt(i)) < roman.get(s.charAt(i + 1)))
            {
                res = res - roman.get(s.charAt(i));
            }
            else
            {
                res = res + roman.get(s.charAt(i));
            }
        }

        return res + roman.get(s.charAt(s.length() - 1));
    }
}

public class Answer
{
    public static void main(String[] A)
    {
        Solution sol = new Solution();

        String s = "MCMXCIV";

        int result = sol.romanToInteger(s);

        System.out.println("Integr value : " + result);
    }
}

// Time Complexity: O(n), where n is the length of the input string since we traverse the string once.

// Space Complexity: O(1), since we use a fixed-size map for Roman numerals.