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

    First, check if the lengths of both strings are equal. If not, return false immediately as they cannot be anagrams.

    Initialize a frequency array of size 26 (for all uppercase English letters) and set all elements to 0.

    Traverse the first string and increment the frequency of each character.
    
    Traverse the second string and decrement the frequency of each character.

    Finally, check if all elements in the frequency array are zero. If any element is not zero, return false as the characters do not match in frequency.

    If all frequencies are zero, the strings are anagrams and the function returns true.

*/

class Solution
{
    public boolean CheckAnagrams(String str1, String str2)
    {
        if (str1.length() != str2.length())
        {
            return false;
        }

        int[] freq = new int[26];

        // Count frequency of each character in str1
        for (int i = 0; i < str1.length(); i++)
        {
            freq[str1.charAt(i) - 'A']++;  // Increment frequency for each character in str1
        }

        // Decrement frequency for each character in str2
        for (int i = 0; i < str2.length(); i++)
        {
            freq[str2.charAt(i) - 'A']--;  // Decrement frequency for each character in str2
        }

        // Check if all frequencies are zero, meaning both strings have the same characters
        for (int i = 0; i < 26; i++)
        {
            if (freq[i] != 0)
            {
                // If any frequency is non-zero, they are not anagrams
                return false;
            }
        }

        return true;  // The strings are anagrams
    }
}

public class OptimalAnswer
{
    public static void main(String A[])
    {
        Solution solution = new Solution();

        String Str1 = "INTEGER";
        String Str2 = "TEGERNI";

        if(solution.CheckAnagrams(Str1, Str2))
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
    }
}

// Time Complexity: O(N), where N is the length of the strings. Each string is traversed once, and the frequency array is checked in constant time (26 iterations).

// Space Complexity: O(1), as a fixed-size array of 26 elements is used regardless of the input size.