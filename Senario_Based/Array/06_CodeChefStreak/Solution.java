/*

CodeChef Streak Count

Problem Statement
-----------------
CodeChef offers a feature called "streak count". A streak is maintained if you solve
at least one problem daily.

Om and Addy actively maintain their streaks on CodeChef. Over a span of N
consecutive days, you have observed the count of problems solved by each of them.

Your task is to determine the maximum streak achieved by Om and Addy and find
who had the longer maximum streak.

Input Format
------------
- The first line of input contains a single integer T, denoting the number of test cases.
- Each test case consists of:
  1. An integer N — the number of days.
  2. N space-separated integers A₁, A₂, ..., Aₙ representing the number of
     problems solved by Om on each day.
  3. N space-separated integers B₁, B₂, ..., Bₙ representing the number of
     problems solved by Addy on each day.

Output Format
-------------
For each test case, output:

- "OM"    : if Om has a longer maximum streak than Addy.
- "ADDY"  : if Addy has a longer maximum streak than Om.
- "DRAW"  : if both have equal maximum streaks.

Note:
You may print the answer in any combination of uppercase and lowercase letters.
For example: OM, om, Om, and oM are all accepted.

Constraints
-----------
1 ≤ T ≤ 10^5
1 ≤ N ≤ 10^5
0 ≤ Aᵢ, Bᵢ ≤ 10^9

The sum of N over all test cases does not exceed 6 × 10^5.

Sample Input
------------
3
6
1 7 3 0 2 13
0 2 3 4 5 0
3
1 3 4
3 1 2
5
1 2 3 0 1
1 2 0 2 3

Sample Output
-------------
ADDY
DRAW
OM

Explanation
-----------
Test Case 1:
Om's solved counts:
1 7 3 0 2 13

Maximum consecutive non-zero streak = 3 days.

Addy's solved counts:
0 2 3 4 5 0

Maximum consecutive non-zero streak = 4 days.

Since 4 > 3, output:
ADDY

Test Case 2:
Om's maximum streak = 3 days.
Addy's maximum streak = 3 days.

Since both streaks are equal, output:
DRAW

Test Case 3:
Om's maximum streak = 3 days.
Addy's maximum streak = 2 days.

Since 3 > 2, output:
OM

*/

import java.util.Scanner;

public class Solution {
    // Helper method to find the maximum streak
    public static int getMaxStreak(int[] arr, int n) {
        int maxStreak = 0;
        int currentStreak = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                currentStreak++;
                if (currentStreak > maxStreak) {
                    maxStreak = currentStreak;
                }
            } else {
                currentStreak = 0;
            }
        }
        return maxStreak;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (!scanner.hasNextInt()) return;
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];

            for (int i = 0; i < n; i++) a[i] = scanner.nextInt();
            for (int i = 0; i < n; i++) b[i] = scanner.nextInt();

            int omMax = getMaxStreak(a, n);
            int addyMax = getMaxStreak(b, n);

            if (omMax > addyMax) System.out.println("OM");
            else if (addyMax > omMax) System.out.println("ADDY");
            else System.out.println("DRAW");
        }
        scanner.close();
    }
}