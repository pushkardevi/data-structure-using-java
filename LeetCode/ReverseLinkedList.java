package LeetCode;

public class ReverseLinkedList {

    private Node head;

    private static class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    void insert(Node newNode) {

        Node node = head;
        if (node == null) {
            head = newNode;
        } else {
            while (node.next != null) {
                node = node.next;
            }
            node.next = newNode;
        }
    }

    void reverseIterate() {

        if(head == null || head.next == null){
            System.out.println("List is empty or having only one value.");
        }

        Node prevNode = head; //10
        Node currNode = head.next; // 20
        while (currNode != null){
            Node nextNode = currNode.next; // 30
            // prev --> curr --> next
            //  10  -->  20  -->  30
            //update curr & next & prev
            currNode.next = prevNode; //  20  --> 10
            prevNode = currNode; //  now prev = 20
            currNode = nextNode; // now curr = 30
        }
        head.next = null;
        head = prevNode;

    }


    int size() {
        Node node = head;
        int counter = 0;
        while (node.next != null) {
            counter++;
            node = node.next;
        }
        return counter;
    }

    void display() {
        Node node = head;
        if (node == null) {
            System.out.println("List is empty before insertion.");
        } else {
            while (node != null) {
                System.out.print(node.data + "-->");
                node = node.next;
            }
        }
    }

    public static void main(String[] args) {
        ReverseLinkedList linkedList = new ReverseLinkedList();
        linkedList.display();
        Node newNode1 = new Node(10);
        Node newNode2 = new Node(20);
        Node newNode3 = new Node(30);
        linkedList.insert(newNode1);
        linkedList.insert(newNode2);
        linkedList.insert(newNode3);
        linkedList.display();
        System.out.println();
        System.out.println("Reversed Linked List");
        linkedList.reverseIterate();
        linkedList.display();
    }


}
