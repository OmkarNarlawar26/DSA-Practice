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

    Double the original string by joining it with itself, creating a new string like s + s.

    Look for the target string goalinside this new doubled string.

    If goal exists within the doubled string, then it's a valid rotation, return true.

    If it's not found, that means the original string cannot be rotated to match goal, return false

*/

class Solution
{
    public boolean rotateString(String s, String goal)
    {
        if(s.length() != goal.length())
        {
            return false;
        }

        String doubledS = s + s;

        return doubledS.contains(goal);
    }
}

public class OptimalAnswer {
    public static void main(String A[]) {
        Solution sol = new Solution();

        System.out.println(sol.rotateString("rotation", "tionrota"));
    }
}

// Time Complexity: O(N), because checking for a substring in s + s is linear in time.

// Space Complexity: O(N) for the space needed to store the concatenated string s + s.

/*

=========================================
ROTATION STRING - DOUBLED STRING TRICK
=========================================

Core Idea:
----------
Instead of generating every rotation one by one, concatenate the original
string with itself.

    doubledString = s + s

Every possible rotation of the original string will always appear as a
continuous substring inside this doubled string.

--------------------------------------------------

Example:

s = "rotation"

doubledString = "rotationrotation"

Inside this string we can find all rotations:

rotationrotation

rotation
 otationr
  tationro
   ationrot
    tionrota
     ionrotat
      onrotati
       nrotatio

Notice that every rotation appears naturally inside the doubled string.

--------------------------------------------------

Why does this work?

Take another example:

Original String

ABCDE

Possible Rotations

ABCDE
BCDEA
CDEAB
DEABC
EABCD

Now concatenate the string with itself:

ABCDEABCDE

Look carefully:

ABCDEABCDE

ABCDE
 BCDEA
  CDEAB
   DEABC
    EABCD

Every rotation can now be read as one continuous substring.

--------------------------------------------------

How is the "wrapped part" handled?

Suppose we rotate:

ABCDE

After rotating left by 2 positions:

CDEAB

Normally, the string wraps around:

CDE + AB

In the doubled string:

ABCDEABCDE
  ↑
Start reading from index 2:

ABCDEABCDE
  C D E A B

You directly get:

CDEAB

No manual rotation is required because the second copy provides the
characters that wrap around to the front.

--------------------------------------------------

Algorithm

1. Check if both strings have the same length.
   If not, return false.

2. Create:

   doubledString = s + s

3. Check:

   doubledString.contains(goal)

4. If goal is found inside doubledString,
   then goal is a valid rotation.
   Otherwise, it is not.

--------------------------------------------------

Memory Trick

Think of writing the same word twice.

rotation
rotation

↓

rotationrotation

Now imagine sliding a window of the original string's length across it.

Every window gives one possible rotation.

Instead of creating every rotation manually,
we simply ask:

"Does goal exist inside this doubled string?"

If YES → goal is a rotation.
If NO  → goal is not a rotation.

--------------------------------------------------

Time Complexity : O(n) (typical)
Space Complexity: O(n)

This is the optimal approach because we avoid generating all rotations
individually.

*/