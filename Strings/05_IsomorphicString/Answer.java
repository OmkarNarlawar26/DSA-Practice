/*

Given two strings s and t, determine if they are isomorphic. Two strings s and t are isomorphic if the characters in s can be replaced to get t.

All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character, but a character may map to itself.

Example 1

Input : s = "egg" , t = "add"

Output : true

Explanation :

The 'e' in string s can be replaced with 'a' of string t.

The 'g' in string s can be replaced with 'd' of t.

Hence all characters in s can be replaced to get t.

Example 2

Input : s = "apple" , t = "bbnbm"

Output : false

Explanation :

Strings are matched index by index.

At index 0, 'a' maps to 'b'.

At index 1, 'p' also maps to 'b'.

This is invalid because two different characters (a and p) cannot map to the same character (b) in a one-to-one mapping.

Therefore, no valid mapping exists and the output is false.

*/

class Solution {
      // Method to check if two strings are isomorphic
      public boolean isomorphicString(String s, String t) {
          // Arrays to track last seen positions of characters in s and t
          int[] m1 = new int[256], m2 = new int[256];
  
          // Get length of the strings
          int n = s.length();
  
          // Loop through all characters in the strings
          for (int i = 0; i < n; ++i) {
              // Return false if mapping is inconsistent
              if (m1[s.charAt(i)] != m2[t.charAt(i)]) return false;
  
              // Update last seen index for both characters
              m1[s.charAt(i)] = i + 1;
              m2[t.charAt(i)] = i + 1;
          }
  
          // Return true if all character mappings are consistent
          return true;
      }
  }
  
  public class Answer {
      public static void main(String[] args) {
          // Create instance of Solution class
          Solution solution = new Solution();
  
          // Define input strings
          String s = "paper";
          String t = "title";
  
          // Check if strings are isomorphic
          if (solution.isomorphicString(s, t)) {
              System.out.println("Strings are isomorphic.");
          } else {
              System.out.println("Strings are not isomorphic.");
          }
      }
  }