package ApnaCollege;

import java.util.Stack;

public class QueueUsingStacks {

    private static class Queue {

        private static final Stack<Integer> s1 = new Stack<>();
        private static final Stack<Integer> s2 = new Stack<>();

        private static boolean isEmpty() {
            return s1.isEmpty();
        }

        private static void add(int data) {

            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
            s1.push(data);
            while (!s2.isEmpty()) {
                s1.push(s2.pop());
            }
        }

        private static int peek() {

            if (isEmpty()) {
                return -1;
            }
            return s1.peek();
        }

        private static void remove() {

            if (isEmpty()) {
                return;
            }
            s1.pop();
        }
    }


    public static void main(String[] args) {
        
        Queue.add(10);
        Queue.add(20);
        Queue.add(30);
        Queue.add(40);
        Queue.add(50);

        while (!Queue.isEmpty()) {
            System.out.print(Queue.peek() + "-->");
            Queue.remove();
        }

    }

}
