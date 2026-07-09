/*

Given two strings s and goal, return true if and only if s can become goal after some number of shifts on s.

A shift on s consists of moving the leftmost character of s to the rightmost position.

For example, if s = "abcde", then it will be "bcdea" after one shift.

Example 1

    Input : s = "abcde" , goal = "cdeab"

    Output : true

    Explanation :

        After performing 2 shifts we can achieve the goal string from string s.

        After first shift the string s is => bcdea

        After second shift the string s is => cdeab.

Example 2

    Input : s = "abcde" , goal = "adeac"

    Output : false

    Explanation :

        Any number of shift operations cannot convert string s to string goal.

Algorithm

    Start by generating all possible left rotations of the original string using substring slicing and concatenation.

    For each rotated version of the string, compare it with the target (goal) string.

    If a match is found at any point, return true immediately as the goal can be achieved.

    If none of the rotations match the goal string after checking all possibilities, return false.

*/

class Solution
{
    public boolean rotateString(String s, String goal)
    {
        if(s.length() != goal.length())
        {
            return false;
        }

        // Try all possible rotations of s
        for(int i = 0; i < s.length(); i++)
        {
            String rotated = s.substring(i) + s.substring(0, i);

            if(rotated.equals(goal))
            {
                return true;
            }
        }

        return false;
    }
}

public class BruteForceAnswer
{
    public static void main(String A[])    
    {
        Solution sol = new Solution();

        String s1 = "rotation";
        String goal1 = "tionrota";

        System.out.println(sol.rotateString(s1, goal1));
    }
}

// Time Complexity: O(N^2) since generating N rotations and each comparison takes O(N) time.

// Space Complexity: O(N) for the space needed to store each rotated string.


/*

What does substring() do?

Syntax
substring(start)

Returns characters from start to the end.

Example

String s = "rotation";
Index

r o t a t i o n
0 1 2 3 4 5 6 7

Example
s.substring(3)

Starts from index 3.

ation

Now

s.substring(0,3)

Gives

rot

Then

s.substring(3) + s.substring(0,3)

becomes

ation + rot

Result

ationrot

*/