import java.util.*;

class Solution {
    public int[] unionArray(int[] nums1, int[] nums2) {
        
        HashSet<Integer> set = new HashSet<>();

        for(int num : nums1)
        {
            set.add(num);
        }

        for(int num : nums2)
        {
            set.add(num);
        }

        int[] result = new int[set.size()];
        int i = 0;

        for(int num : set)
        {
            result[i++] = num;
        }

        Arrays.sort(result);

        return result;
    }
}

public class Answer {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of first array: ");
        int n = sc.nextInt();
        int[] nums1 = new int[n];

        System.out.println("Enter elements of first array:");
        for(int i = 0; i < n; i++) {
            nums1[i] = sc.nextInt();
        }

        System.out.print("Enter size of second array: ");
        int m = sc.nextInt();
        int[] nums2 = new int[m];

        System.out.println("Enter elements of second array:");
        for(int i = 0; i < m; i++) {
            nums2[i] = sc.nextInt();
        }

        Solution obj = new Solution();
        int[] result = obj.unionArray(nums1, nums2);

        System.out.println("Union of arrays:");
        for(int num : result) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}

// Time Complexity : O((n + m) log(n + m))