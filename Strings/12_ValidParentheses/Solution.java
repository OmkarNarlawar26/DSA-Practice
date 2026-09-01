// Valid Parentheses

// Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', 
// determine if the input string is valid.

// An input string is valid if:

// 1. Open brackets must be closed by the same type of brackets.
// 2. Open brackets must be closed in the correct order.
// 3. Every close bracket has a corresponding open bracket of the same type.

// Example 1:
// Input: s = "()"
// Output: true

// Example 2:
// Input: s = "()[]{}"
// Output: true

// Example 3:
// Input: s = "(]"
// Output: false

// Example 4:
// Input: s = "([])"
// Output: true

// Example 5:
// Input: s = "([)]"
// Output: false

// class Solution {
//     public boolean isValid(String s)
//     {
//         Stack<Character> stack = new Stack<>();

//         for(char i : s.toCharArray())
//         {
//             if(isBracketOpen(i))
//             {
//                 stack.push(i);
//             }
//             else
//             {
//                 if(stack.size() == 0)
//                 {
//                     return false;
//                 }
//                 else
//                 {
//                     if(areBracketMatching(stack.peek(), i))
//                     {
//                         stack.pop();
//                     }
//                     else
//                     {
//                         return false;
//                     }
//                 }  
//             }
//         }

//         return stack.size() == 0;
//     }

//     private boolean isBracketOpen(char c)
//     {
//         switch(c)
//         {
//             case '(':
//             case '[':
//             case '{':
//                 return true;
//             default :
//                 return false;
//         }
//     }

//     private boolean areBracketMatching(char c, char d)
//     {
//         if(c == '(' && d == ')')
//         {
//             return true;
//         }
//         else if(c == '[' && d == ']')
//         {
//             return true;
//         }
//         else if(c == '{' && d == '}')
//         {
//             return true;
//         }
//         else
//         {
//             return false;
//         }
//     }
// }

// Made own Stack

class MyStack
{
    class Node
    {
        char val;
        Node next;
        Node(char c)
        {
            val = c;
            next = null;
        }
    } 

    Node top;
    MyStack()
    {
        top = null;
    }

    void push(char ch)
    {
        if(top == null)
        {
            top = new Node(ch);
        }
        else
        {
            Node newNode = new Node(ch);
            newNode.next = top;
            top = newNode;
        }
    }

    void pop()
    {
        top = top.next;
    }

    char peek()
    {
        return top.val;
    }

    boolean isEmpty()
    {
        return top == null;
    }
}

class Solution {
    public boolean isValid(String s)
    {
        // We can make stack data structure
        // Create object of MyStack
         MyStack st = new MyStack();

        // This is inbuilt stack is little bit slower
        // Stack<Character> st = new Stack<>();

        for(int i = 0; i < s.length(); i++)
        {
            char ch = s.charAt(i);

            switch(ch)
            {
                case '(':
                case '[':
                case '{':
                    st.push(ch);
                    break;

                case ')':
                    if(st.isEmpty()) return false;
                    if(st.peek() != '(') return false;
                    st.pop();
                    break;
                
                case '}':
                    if(st.isEmpty()) return false;
                    if(st.peek() != '{') return false;
                    st.pop();
                    break;

                case ']':
                    if(st.isEmpty()) return false;
                    if(st.peek() != '[') return false;
                    st.pop();
                    break;
            }
        }

        return st.isEmpty();
    }
    
    public static void main(String[] args)
    {
        Solution obj = new Solution();

        System.out.println(obj.isValid("()"));
        System.out.println(obj.isValid("()[]{}"));
        System.out.println(obj.isValid("(]"));
        System.out.println(obj.isValid("([])"));
        System.out.println(obj.isValid("([)]"));
    }
}