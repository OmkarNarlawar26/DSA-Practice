/*

You are given a string s. Return the array of unique characters, sorted by highest to lowest occurring characters.

If two or more characters have same frequency then arrange them in alphabetic order.

Example 1

    Input : s = "tree"

    Output : ['e', 'r', 't' ]

    Explanation :

        The occurrences of each character are as shown below :

        e --> 2

        r --> 1

        t --> 1.

    The r and t have same occurrences , so we arrange them by alphabetic order.

Example 2

    Input : s = "raaaajj"

    Output : ['a' , 'j', 'r' ]

    Explanation :

        The occurrences of each character are as shown below :

        a --> 4

        j --> 2

        r --> 1

Algorithm

    - The goal is to rank characters based on how frequently they appear in the string.

    - We need a structure that can track both the character and how often it occurs.
    
    - Sorting the characters by frequency helps surface the most significant ones first.

    - To maintain consistency when frequencies match, tie-breaking is done alphabetically.

    - Once sorted, the characters with non-zero occurrences form the final ranked result.

*/

import java.util.*;

class Solution
{
    public List<Character> frequencySort(String s)
    {
        // Array to hold frequency and character for 'a' to 'z'
        Pair[] freq = new Pair[26];

        // Initialize the frequency array
        for(int i = 0; i < 26; i++)
        {
            freq[i] = new Pair(0, (char)(i + 'a'));
        }

        // Count frequency of each character in the string
        for(char ch : s.toCharArray())
        {
            freq[ch - 'a'].freq++;
        }

        // Sort array by frequency descending, then by character ascending
        Arrays.sort(freq, (p1, p2) -> 
        {
            if(p1.freq != p2.freq)
            {
                return p2.freq - p1.freq;
            }

            return p1.ch - p2.ch;
        });

        // Collect characters with non-zero frequency into result list
        List<Character> result = new ArrayList<>();

        for(Pair p : freq)
        {
            if(p.freq > 0)
            {
                result.add(p.ch);
            }
        }

        // Return the final list
        return result;
    }

    // Inner class to store frequency and character
    class Pair
    {
        int freq;
        char ch;

        Pair(int f, char c)
        {
            this.freq = f;
            this.ch = c;
        }
    }
}

public class Answer
{
    public static void main(String[] A)
    {
        Solution sol = new Solution();

        String s = "tree";

        // Get characters sorted by frequency
        List<Character> result = sol.frequencySort(s);

        System.out.println(result);
    }
}

// Time Complexity: O(n + k log k), where n is the length of the string and k is the constant 26 for the alphabet.

// Space Complexity: O(k) , where k is the constant 26 for the frequency array.