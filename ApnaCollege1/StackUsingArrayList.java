package ApnaCollege;

import java.util.ArrayList;
import java.util.List;

public class StackUsingArrayList {

    private static class Stack {

        static List<Integer> list = new ArrayList<>();

        private static void push(int data) {
            list.add(data);
        }

        private static int pop() {
            if (list.isEmpty()) {
                return -1;
            }

            int top = list.get(list.size() - 1);
            list.remove(list.size() - 1);
            return top;
        }

        private static int peek() {

            if (list.isEmpty()) {
                return -1;
            }
            return list.get(list.size() - 1);
        }

    }


    public static void main(String[] args) {

        Stack.push(10);
        Stack.push(20);
        Stack.push(30);
        Stack.push(40);
        Stack.push(50);
        while (!Stack.list.isEmpty()) {
            System.out.print(Stack.peek() + "-->");
            Stack.pop();
        }
        System.out.print("NULL");
    }

}
