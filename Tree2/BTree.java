package Tree2;

import java.util.Scanner;

public class BTree {


    static Scanner sc;

    static Node createTree() {
        Node root = null;
        sc = new Scanner(System.in);
        System.out.println("Enter Data: ");
        int data = sc.nextInt();

        if (data < 0)
            return null;

        else
            root = new Node(data);
        System.out.println("Enter left for " + data);
        root.left = createTree();
        System.out.println("Enter right for " + data);
        root.right = createTree();
        return root;
    }

    static void inOrder(Node root) {
        if (root == null)
            return;
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }


}
