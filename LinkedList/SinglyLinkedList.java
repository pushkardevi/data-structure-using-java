package LinkedList;

public class SinglyLinkedList {

    private ListNode head;

    private static class ListNode {

        private int data;
        private ListNode next;

        ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {

        SinglyLinkedList linkedList = new SinglyLinkedList();
        linkedList.head = new ListNode(10);
        ListNode second = new ListNode(20);
        ListNode third = new ListNode(30);
        ListNode fourth = new ListNode(40);

        linkedList.head.next = second;
        second.next = third;
        third.next = fourth;
        linkedList.display();
        System.out.println(" Length: " + linkedList.length());
        linkedList.insertAtBegin();
        linkedList.display();
        System.out.println(" Length: " + linkedList.length());
        linkedList.insertAtEnd();
        linkedList.display();
        System.out.println(" Length: " + linkedList.length());
        linkedList.insertAtUsingForLoop();
        linkedList.display();
        System.out.println(" Length: " + linkedList.length());
        linkedList.deleteFirst();
        linkedList.display();
        System.out.println(" Length: " + linkedList.length());
        linkedList.deleteLast();
        linkedList.display();
        System.out.println(" Length: " + linkedList.length());
        linkedList.deleteAt();
        linkedList.display();
        System.out.println(" Length: " + linkedList.length());

    }

    void display() {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.data + " --> ");
            current = current.next;
        }
    }

    int length() {
        if (head.next == null) {
            return 0;
        }
        ListNode current = head;
        int count = 0;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    void insertAtBegin() {
        ListNode begin;
        if (head == null) {
            begin = new ListNode(5);
            head = begin;
        }
        begin = new ListNode(5);
        begin.next = head;
        head = begin;
    }

    void insertAtEnd() {
        ListNode end;
        if (head == null) {
            end = new ListNode(50);
            head = end;
        }
        end = new ListNode(50);
        ListNode node = head;
        while (node.next != null) {
            node = node.next;
        }
        node.next = end;
    }

    void insertAtUsingWhile() {

        ListNode newNode = new ListNode(60);
        int position = 4;
        int pointer = 1;
        if (head.next == null) {
            head = newNode;
        }
        ListNode current = head;
        while (pointer < position - 1) {
            current = current.next;
            pointer++;
        }
        newNode.next = current.next;
        current.next = newNode;
    }

    void insertAtUsingForLoop() {

        ListNode newNode = new ListNode(60);
        int position = 4;
        if (head.next == null) {
            head = newNode;
        }
        ListNode current = head;
        for (int i = 0; i < position - 1; i++) {
            current = current.next;
            System.out.println("Loop: " + i);
        }
        System.out.println("Current: " + current.data);
        newNode.next = current.next;// 60 ka next ye 30 ka next hoga
        current.next = newNode; //30 ka next newNode(60) hoga
    }

    void deleteFirst() {
        if (head == null) {
            System.out.println("List is empty");
        }
        head = head.next;
    }

    void deleteLast() {
        if (head == null) {
            System.out.println("List is empty");
        }
        if (head.next == null) {
            head = null;
        }
        ListNode secondLast = head;
        ListNode last = head.next;
        while (last.next != null) {
            last = last.next;
            secondLast = secondLast.next;
        }
        secondLast.next = null;
    }

    void deleteAt() {
        int position = 2;
        if (head == null) {
            System.out.println("List is empty");
        } else {
            ListNode node1 = head;
            ListNode node2;
            for (int i = 0; i < position - 1; i++) {
                node1 = node1.next;
            }
            System.out.println("nod1: " + node1.data);
            node2 = node1.next;
            System.out.println("nod2: "+ node2.data);
            node1.next = node2.next;
            node2 = null;
        }
    }
}
