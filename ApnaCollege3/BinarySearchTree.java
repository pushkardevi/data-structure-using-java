package ApnaCollege3;

public class BinarySearchTree {

	private static class Node {

		int data;
		Node left;
		Node right;

		Node(int data) {
			this.data = data;
		}

	}

	private static Node buildTree(Node root, int data) {

		if (root == null) {
			return new Node(data);
		}

		if (root.data > data) {
			root.left = buildTree(root.left, data);
		} else {
			root.right = buildTree(root.right, data);
		}
		return root;
	}

	private static void inOrder(Node root) {
		if (root == null) {
			return;
		}
		inOrder(root.left);
		System.out.print(root.data + "-->");
		inOrder(root.right);
	}

	public static void main(String[] args) {
		int[] values = { 5, 1, 3, 4, 2, 7 };
		Node root = null;
		for (int i : values) {
			root = buildTree(root, i);
		}
		System.out.println();
		inOrder(root);
	}

}
