/*

Chef has a binary array nums containing only 0s and 1s.

He wants to find the maximum number of consecutive 1s in the array regardless of how many such streaks exist. Can you help Chef determine this?

Function Declaration

Function Name:
findMaxConsecutiveOnes

Description:
findMaxConsecutiveOnes - This function computes the maximum length of a contiguous segment of 1s in a binary array.

Parameters:
nums: A binary array of integers where each element is either 0 or 1.

Return Value:
Returns a single integer representing the maximum number of consecutive 1s in the array.

Constraints:
1 ≤ N ≤ 10^5
nums[i] ∈ {0, 1}

Input Format:
The first line contains a single integer N — the size of the array.
The second line contains N space-separated integers representing the binary array nums.

Output Format:
Print a single integer — the maximum number of consecutive 1s in the array.

Sample 1:

Input:
5
0 1 1 0 1

Output:
2

Explanation:
The two 1s at positions 2 and 3 are consecutive, so the maximum streak is 2.

Sample 2:

Input:
7
1 1 1 0 0 1 1

Output:
3

Explanation:
The first three 1s form the longest consecutive streak, so the maximum is 3.

*/

import java.util.*;

public class Solution {

    public static int findMaxConsecutiveOnes(int[] nums) {

        int maxStrek = 0;
        int currentStreak = 0;

        for (int num : nums) {
            if (num == 1) {
                currentStreak++;

                if (currentStreak > maxStrek) {
                    maxStrek = currentStreak;
                }
            } else {
                currentStreak = 0;
            }
        }

        return maxStrek;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] nums = new int[N];

        for (int i = 0; i < N; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.println(findMaxConsecutiveOnes(nums));

        sc.close();
    }
}