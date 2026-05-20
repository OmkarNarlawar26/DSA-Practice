import java.util.*;

class Solution
{
    // Function to find leaders in an array
    public ArrayList<Integer> leaders(int[] nums)
    {
        ArrayList<Integer> ans = new ArrayList<>();

        // Iterate through each element in nums
        for(int i = 0; i < nums.length; i++)
        {
            boolean leader = true;

            /* Check whether nums[i] is greater
            than all elements to its right */
            for(int j = i + 1; j < nums.length; j++)
            {
                /* If any element to the right is greater 
                    or equal, nums[i] is not a leader */
                if(nums[j] >= nums[i])
                {
                    leader = false;
                    break;
                }
            }

            // If nums[i] is a leader, add it to the ans list
            if(leader)
            {
                ans.add(nums[i]);
            }
        }

        return ans;

    }
}

public class BruteForceAnswer
{
    public static void main(String[] A)
    {
        int[] nums = {1,2,5,3,1,2};

        Solution sobj = new Solution();

        ArrayList<Integer> ans = sobj.leaders(nums);

        System.out.println("Leaders in the array are :");

        for(int leader : ans)
        {
            System.out.print(leader + " ");
        }

        System.out.println();
    }
}

// Time Complexity: O(N2)
// Space Complexity: O(1)