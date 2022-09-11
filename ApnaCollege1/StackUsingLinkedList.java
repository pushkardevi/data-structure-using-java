package ApnaCollege;

public class StackUsingLinkedList {

    private static class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private static class Stack {

        private static Node head;

        private static void push(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }

        private static int pop() {

            if (head == null) {
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top;

        }

        private static int peek() {
            if (head == null) {
                return -1;
            }
            return head.data;
        }

    }

    public static void main(String[] args) {

        Stack.push(10);
        Stack.push(20);
        Stack.push(30);
        Stack.push(40);
        Stack.push(50);
        while (Stack.head != null) {
            System.out.print(Stack.peek() + "-->");
            Stack.pop();
        }
        System.out.print("NULL");
    }

}
