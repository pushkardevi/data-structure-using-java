package LinkedList;

public class Demo1 {

    public static void main(String[] args) {
        insert(10);
        insert(20);
        insert(30);
        insert(40);
        print();
    }

    private static void print() {

        if (head == null) {
            return;
        }
        Node current = head;
        while (current.next != null) {
            System.out.print(current.data + "-->");
            current = current.next;
        }
        System.out.println(current.data+"-->NULL");

    }

    private static Node head;

    private static class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }

    }

    private static void insert(int data) {

        if (head == null) {
            head = new Node(data);
            return;
        }
        Node newNode = new Node(data);
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }
}
