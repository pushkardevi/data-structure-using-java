package ApnaCollege2;

public class LinkedList {

    private Node head;

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addFirst(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);
        list.print();
        list.deleteFirst();
        list.print();
        list.deleteLast();
        list.print();
    }

    private void print() {
        if (head == null) {
            return;
        }
        Node current = head;
        while (current.next != null) {
            System.out.print(current.data + "-->");
            current = current.next;
        }
    }
    private int length() {
        if (head == null) {
            return 0;
        }
        Node current = head;
        int count = 0;
        while (current.next != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    private static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    private void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    private void deleteFirst() {
        if (head == null) {
            return;
        }
        head = head.next;
    }

    private void deleteLast() {
        if (head == null) {
            return;
        }
        if(head.next == null){
            head = null;
            return;
        }
        Node secondLast = head;
        Node last = head.next;
        while (last.next != null) {
            last = last.next;
            secondLast = secondLast.next;
        }
        secondLast.next = null;
    }
}

