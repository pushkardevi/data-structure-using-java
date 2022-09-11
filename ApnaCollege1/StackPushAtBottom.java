package ApnaCollege;

import java.util.Stack;

public class StackPushAtBottom {


    private static void pushAtBottom(int data, Stack<Integer> stack) {

        if (stack.isEmpty()) {
            stack.push(data);
            return;
        }

        int top = stack.pop();
        pushAtBottom(data, stack);
        stack.push(top);
    }


    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        pushAtBottom(6,stack);

        while (!stack.isEmpty()) {
            System.out.print(+stack.peek() + "-->");
            stack.pop();
        }
        System.out.print("NULL");
    }
}
