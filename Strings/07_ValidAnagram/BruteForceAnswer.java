/*

Given two strings s and t, return true if t is an anagram of s, and false otherwise.

An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

Example 1

    Input : s = "anagram" , t = "nagaram"

    Output : true

    Explanation :

        s frequency of all characters from both strings is same.

Example 2

    Input : s = "dog" , t = "cat"

    Output : false

    Explanation :

        We cannot rearrange the characters of string s to get string t as frequency of all characters from both strings is not same.

Algorithm :

    First, check if the lengths of both strings are equal. If not, they can't be anagrams and return false immediately.

    If the lengths match, sort both strings using a built-in sorting algorithm.

    Once sorted, iterate through each character of both strings and compare them one by one.

    If any character mismatch is found, return false.

    If all characters match, return true, confirming that the strings are anagrams.

*/

class Solution
{
    public static boolean CheckAnagrams(String str1, String str2)
    {
        if(str1.length() != str2.length())
        {
            return false;
        }

        // Convert strings to char arrays and sort them
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();

        java.util.Arrays.sort(charArray1);
        java.util.Arrays.sort(charArray2);

         // Case 2: check if every character of str1 and str2 matches with each other
        for(int i = 0; i < str1.length(); i++)
        {
            if(charArray1[i] != charArray2[i])
            {
                 // If any character doesn't match, they aren't anagrams
                return false;
            }
        }

        // Strings are anagrams
        return true;
    }
}


public class BruteForceAnswer
{
    public static void main(String[] args)
    {

        Solution sol = new Solution();

        String Str1 = "INTEGER";
        String Str2 = "TEGERNI";

        // Check if the strings are anagrams and output the result
        if (sol.CheckAnagrams(Str1, Str2)) {
            System.out.println("True");  // Output "True" if they are anagrams
        } else {
            System.out.println("False");  // Output "False" if they aren't anagrams
        }
    }
}

// Time Complexity: O(N log N), where N is the length of the strings. This is due to the sorting step performed on both strings.

// Space Complexity: O(1), as the sorting is done in-place and no extra space proportional to input size is used (excluding the input strings themselves).