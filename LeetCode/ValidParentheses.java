package LeetCode;

import java.util.Stack;

public class ValidParentheses {

    static boolean isValid() {



        String s = "([}}])";

        Stack<Character> stack = new Stack();
        for (char ch : s.toCharArray()) {

            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else if (ch == ')' && !stack.isEmpty() && stack.peek() == '(') {
                stack.pop();
            } else if (ch == '}' && !stack.isEmpty() && stack.peek() == '{') {
                stack.pop();
            } else if (ch == ']' && !stack.isEmpty() && stack.peek() == '[') {
                stack.pop();
            }else{
                stack.push(ch);
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {

        boolean b = isValid();
        System.out.println(b);
    }
}
