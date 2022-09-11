package ApnaCollege3;

public class BinaryTree {

	private static int index = -1;

	private static class Node {

		int data;
		Node left;
		Node right;

		Node(int data) {
			this.data = data;
			this.left = null;
			this.right = null;
		}

	}

	private static Node buildTree(int[] arr) {

		index++;
		if (arr[index] == -1) {
			return null;
		}

		Node newNode = new Node(arr[index]);
		newNode.right = buildTree(arr);
		newNode.left = buildTree(arr);

		return newNode;
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
		int[] arr = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
		Node root = buildTree(arr);
		inOrder(root);
	}

}
