package Tree;

public class BinaryTree {

    private TNode root;

    private static class TNode {
        int data;
        TNode left;
        TNode right;

        TNode(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    private TNode buildTree() {
        TNode first = new TNode(1);
        TNode second = new TNode(2);
        TNode third = new TNode(3);
        TNode fourth = new TNode(4);
        TNode fifth = new TNode(5);

        root = first;
        first.left =second;
        first.right = third;

        second.left = fourth;
        second.right = fifth;

        return root;
    }

    private static void inOrder(TNode root){
        if(root == null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data+"-->");
        inOrder(root.right);
    }

    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        TNode node = binaryTree.buildTree();
        inOrder(node);
    }

}
