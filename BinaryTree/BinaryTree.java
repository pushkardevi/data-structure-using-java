package BinaryTree;

import java.util.Scanner;

public class BinaryTree {
	static Scanner sc = new Scanner(System.in);

	static Node createTree() {
		Node root = null;

		System.out.println("Enter data: ");
		int data = sc.nextInt();

		if (data <= 0)
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
		System.out.println(root.data + " ");
		inOrder(root.right);

	}

	static void preOrder(Node root) {

		if (root == null)
			return;

		System.out.println(root.data + " ");
		preOrder(root.left);
		preOrder(root.right);

	}

	static void postOrder(Node root) {

		if (root == null)
			return;

		preOrder(root.left);
		preOrder(root.right);
		System.out.println(root.data + " ");
	}

}
