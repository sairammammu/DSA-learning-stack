package Conversions;

import java.util.Scanner;
import java.util.Stack;

/*
To convert Infix → Prefix:

1️⃣ Reverse the infix expression
2️⃣ Swap brackets

( becomes )

) becomes (
3️⃣ Convert the new expression to Postfix
4️⃣ Reverse the postfix result → that is Prefix

That’s it.
 */
public class InfixToPrefix {

    static String reverse(String input)
    {
        StringBuilder rev = new StringBuilder();
        for(int i=input.length()-1;i>=0;i--)
        {
            char ch = input.charAt(i);
            if(ch=='(')
            {
                rev.append(')');
            }
            else if(ch==')')
            {
                rev.append('(');
            }
            else{
                rev.append(ch);
            }
        }
        return rev.toString();
    }
    static void infixtoprefix(String input)
    {


        String rev = reverse(input);

        //postfix
        String postfix = toPostfix(rev.toString());

        String result = reverse(postfix);

        System.out.print(result);


    }

    static String toPostfix(String input)
    {
        Stack<Character> st = new Stack<>();
        StringBuilder res = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            // Operand
            if ((ch >= 'A' && ch <= 'Z') ||
                    (ch >= 'a' && ch <= 'z') ||
                    (ch >= '0' && ch <= '9')) {

                res.append(ch);
            }

            // Opening bracket
            else if (ch == '(') {
                st.push(ch);
            }

            // Closing bracket
            else if (ch == ')') {
                while (!st.isEmpty() &&
                        ((priority(st.peek()) > priority(ch)) ||
                                (priority(st.peek()) == priority(ch) && ch == '^'))) {

                }
                st.pop(); // remove '('
            }

            // Operator
            else {
                while (!st.isEmpty() &&
                        priority(st.peek()) >= priority(ch)) {
                    res.append(st.pop());
                }
                st.push(ch);
            }
        }

        // Pop remaining operators
        while (!st.isEmpty()) {
            res.append(st.pop());
        }

        return res.toString();

    }

    private static int priority(char ch) {
        if (ch == '^') {
            return 3;
        } else if (ch == '*' || ch == '/') {
            return 2;
        } else if (ch == '+' || ch == '-') {
            return 1;
        } else {
            return -1;
        }
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
    
        String input = sc.next();
        infixtoprefix(input);

        
    }

}
