package Tree2;

public class Runner {

    public static void main(String[] args) {

        Node root = BTree.createTree();
        BTree.inOrder(root);

    }
}
