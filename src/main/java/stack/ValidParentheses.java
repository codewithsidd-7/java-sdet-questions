package stack;

import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        String str = "[{()}]";
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == '[' || ch == '{' || ch == '(') {
                stack.push(ch);
            }

            if (ch == ')') {
                if (stack.isEmpty() || stack.peek() != '(') {
                    System.out.println("Invalid");
                    return;
                }
                stack.pop();
            } else if (ch == '}') {
                if (stack.isEmpty() || stack.peek() != '{') {
                    System.out.println("Invalid");
                    return;
                }
                stack.pop();

            } else if (ch == ']') {
                if (stack.isEmpty() || stack.peek() != '[') {
                    System.out.println("Invalid");
                    return;
                }
                stack.pop();

            }

        }

        if (stack.isEmpty()) {
            System.out.println("Valid");

        } else {
            System.out.println("Invalid");
        }
    }
}
