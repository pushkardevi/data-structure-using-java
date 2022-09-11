package ApnaCollege;

public class BinarySearchTree {

    private static class Node {

        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    private static Node insert(Node root, int val) {

        if (root == null) {
            return new Node(val);
        }
        if (root.data > val) {
            // Then Left subtree
            root.left = insert(root.left, val);
        } else {
            root.right = insert(root.right, val);
        }
        return root;
    }

    private static void inOrder(Node root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.printf(root.data + " ");
        inOrder(root.right);
    }

    static boolean search(Node root, int key) { // Time Complexity O(H)

        if (root == null) {
            return false;
        } else if (root.data > key) {
            return search(root.left, key);
        } else if (root.data == key) {
            return true;
        } else {
            return search(root.right, key);
        }
    }

    static Node delete(Node root, int val) {

        if (root.data > val) {
            root.left = delete(root.left, val);

        } else if (root.data < val) {
            root.right = delete(root.right, val);
        } else { // root.data == val;
            // case1
            if (root.left == null && root.right == null) {
                return null;
            }
            // case2
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }
            // case3
            Node IS = inOrderSuccessor(root.right); // Left most node of right subtree
            root.data = IS.data;
            root.right = delete(root.right, IS.data);
        }
        return root;
    }

    static Node inOrderSuccessor(Node root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }

    static void printInRange(Node root, int X, int Y) {

        if (root == null) {
            return;
        }
        if (root.data >= X && root.data <= Y) {
            printInRange(root.left, X, Y);
            System.out.print(root.data + " ");
            printInRange(root.right, X, Y);
        } else if (root.data >= X) {
            printInRange(root.left, X, Y);
        } else {
            printInRange(root.right, X, Y);
        }
    }

    public static void main(String[] args) {
        int[] values = { 5, 1, 3, 4, 2, 7 };
        Node root = null;
        for (int i : values) {
            root = insert(root, i);
        }
        inOrder(root);
        System.out.println();
        int key1 = 5;
        int key2 = 9;
        search(root, key1);
        System.out.println("Key " + key1 + " Found");
        search(root, key2);
        System.out.println("Key " + key2 + " Not Found");

        delete(root, 4);
        inOrder(root);
        System.out.println();
        System.out.print("Values between range 1 & 5 are:- ");
        printInRange(root, 1, 5);

    }
}
