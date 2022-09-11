package BinaryTree;

public class Runner {

	public static void main(String[] args) {

		Node tree = BinaryTree.createTree();
		BinaryTree.inOrder(tree);
		System.out.println();
		BinaryTree.preOrder(tree);
		System.out.println();
		BinaryTree.postOrder(tree);
	}

}
