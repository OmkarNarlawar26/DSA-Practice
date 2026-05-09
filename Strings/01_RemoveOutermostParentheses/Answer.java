import java.util.Scanner;

class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder result = new StringBuilder();
        int level = 0;

        for(char ch : s.toCharArray())
        {
            if(ch == '(')
            {
                if(level > 0)
                {
                    result.append(ch);
                }
                
                level++;
            }
            else if(ch == ')')
            {
                level--;

                if(level > 0)
                {
                    result.append(ch);
                }
            }
        }

        return result.toString();
    }
}

// Time Complexity : O(N)
// Space Complexity : O(1)

public class Answer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Remove Outer Parentheses ===");
        System.out.print("Enter the parentheses string: ");

        String s = sc.nextLine();

        Solution obj = new Solution();

        String answer = obj.removeOuterParentheses(s);

        System.out.println("Result after removing outer parentheses:");
        System.out.println(answer);

        sc.close();
    }
}