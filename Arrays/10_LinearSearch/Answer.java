import java.util.Scanner;

class Solution {
    public int linearSearch(int nums[], int target) {
		
        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i] == target)
            {
                return i;
            }
        }

        return -1;
    }
}

public class Answer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int nums[] = new int[n];

        System.out.println("Enter elements:");
        for(int i = 0; i < n; i++)
        {
            nums[i] = sc.nextInt();
        }

        System.out.print("Enter target element: ");
        int target = sc.nextInt();

        Solution obj = new Solution();
        int result = obj.linearSearch(nums, target);

        if(result != -1)
        {
            System.out.println("Element Found at index: " + result);
        }
        else
        {
            System.out.println("Element Not Found");
        }

        sc.close();
    }
}

// Time Complexity : O(N)