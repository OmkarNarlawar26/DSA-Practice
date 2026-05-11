import java.util.Scanner;

class Solution {
    public String reverseWords(String s) {
        
        int i = s.length() - 1;

        StringBuilder sb = new StringBuilder();

        while(i >= 0)
        {
            while(i >= 0 && s.charAt(i) == ' ')  // run till spaces ar found and decrement it
            {
                i--;
            }

            if(i < 0) // if only spaces are present
            {
                break;
            }

            int end = i;  // here actual word start

            while(i >= 0 && s.charAt(i) != ' ')  // jab tak space nahi ata tab tak decrement krte raho
            {
                i--;
            }

            if(sb.length() > 0)
            {
                sb.append(" ");
            }

            String word = s.substring(i + 1, end + 1);

            sb.append(word);
        }

        return sb.toString();
    }
}

public class Answer {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a sentence:");
        String input = sc.nextLine();

        Solution obj = new Solution();

        String result = obj.reverseWords(input);

        System.out.println("Reversed Words:");
        System.out.println(result);

        sc.close();
    }
}