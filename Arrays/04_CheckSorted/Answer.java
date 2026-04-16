import java.util.*;

// First class (your original logic unchanged)
class Solution {
    public boolean isSorted(ArrayList<Integer> nums) {
        
        for(int i = 0; i < (nums.size() - 1); i++)
        {
            if(nums.get(i) > nums.get(i+1))
            {
                return false;
            }
        }

        return true;
    }
}

// Second class (Main class)
public class Answer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        ArrayList<Integer> nums = new ArrayList<>();

        System.out.println("Enter elements:");
        for(int i = 0; i < n; i++) {
            nums.add(sc.nextInt());
        }

        Solution obj = new Solution();
        boolean result = obj.isSorted(nums);

        if(result) {
            System.out.println("Array is sorted.");
        } else {
            System.out.println("Array is NOT sorted.");
        }

        sc.close();
    }
}

// Time COmplexity : O(N)