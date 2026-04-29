import java.util.Scanner;

class Solution {
    public int[] selectionSort(int[] nums) {

        int temp = 0;

        for(int i = 0; i < nums.length; i++)
        {
            int minIndex = i;

            for(int j = i + 1; j < nums.length; j++)
            {
                if(nums[j] < nums[minIndex])
                {
                    minIndex = j;
                }
            }

            temp = nums[i];
            nums[i] = nums[minIndex];
            nums[minIndex] = temp;
        }

        return nums;
    }
}

// Time Complexity : O(n²)

public class Answer {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter elements:");
        for(int i = 0; i < n; i++)
        {
            nums[i] = sc.nextInt();
        }

        Solution obj = new Solution();

        int[] result = obj.selectionSort(nums);

        System.out.println("Sorted Array:");
        for(int i = 0; i < result.length; i++)
        {
            System.out.print(result[i] + " ");
        }

        sc.close();
    }
}