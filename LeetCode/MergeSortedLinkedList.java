package LeetCode;

public class MergeSortedLinkedList {

    private Node head;
    //private Node head2;

    private static class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    void insert(Node node) {

        if (head == null) {
            head = node;
        } else {
            Node n = head;
            while (n.next != null) {
                n = n.next;
            }
            n.next = node;
        }
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
    void display(Node node) {
        //Node node = head;
        if (node == null) {
            System.out.println("List is empty before insertion.");
        } else {
            while (node != null) {
                System.out.print(node.data + "-->");
                node = node.next;
            }
            System.out.println();
        }
    }

    void sort(Node node) {

        int temp;
        System.out.println("Sorted List");
        display(node);
        while (node.next != null) {
            if (node.data > node.next.data) {
                temp = node.data;
                node.data = node.next.data;
                node.next.data = temp;
                sort(node);
            }
            else {
                node = node.next;
                sort(node);
            }
        }
    }

    void sortAndMerge(MergeSortedLinkedList list1, MergeSortedLinkedList list2) {

        Node temp = list1.head;
        while (temp.next != null){
            temp = temp.next;
        }
        temp.next = list2.head;
        sort(list1.head);
        while (list1.head != null){
            System.out.print(list1.head.data+ " --> ");
            list1.head = list1.head.next;
        }

    }


    public static void main(String[] args) {
        MergeSortedLinkedList linkedList = new MergeSortedLinkedList();
        Node node1 = new Node(40);
        Node node2 = new Node(30);
        Node node3 = new Node(50);
        Node node4 = new Node(12);
        linkedList.insert(node1);
        linkedList.insert(node2);
        linkedList.insert(node3);
        linkedList.insert(node4);

        MergeSortedLinkedList linkedList2 = new MergeSortedLinkedList();
        Node node5 = new Node(11);
        Node node6 = new Node(32);
        Node node7 = new Node(5);
        Node node8 = new Node(16);
        linkedList2.insert(node5);
        linkedList2.insert(node6);
        linkedList2.insert(node7);
        linkedList2.insert(node8);

        linkedList.display();
        System.out.println();
        linkedList2.display();
        System.out.println();
        System.out.println("Sorted Merged List");
        MergeSortedLinkedList merged = new MergeSortedLinkedList();
        merged.sortAndMerge(linkedList, linkedList2);

    }

}
