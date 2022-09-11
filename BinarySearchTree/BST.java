package BST;

public class BST {

    private Node root;

    BST() {
        root = null;
    }

    public void insert(int val) {

        Node temp, ptr;
        temp = new Node();
        temp.data = val;
        temp.left = null;
        temp.right = null;

        if (root == null) {
            root = temp;
        } else {
            ptr = root;
            while (true) {
                if (val > ptr.data) {
                    if (ptr.right == null) {
                        ptr.right = temp;
                        break;
                    } else {
                        ptr = ptr.right;
                    }
                } else if (val < ptr.data) {
                    if (ptr.left == null) {
                        ptr.left = temp;
                        break;
                    } else {
                        ptr = ptr.left;
                    }
                } else {
                    System.out.println("Duplicate values are not allowed");
                    break;
                }

            }

        }

    }

    public void preOrder(Node ptr) {
        if (ptr == null) return;
        System.out.println("\t" + ptr.data);
        preOrder(ptr.left);
        preOrder(ptr.right);

    }

    public void inOrder(Node ptr) {
        if (ptr == null) return;

        preOrder(ptr.left);
        System.out.println("\t" + ptr.data);
        preOrder(ptr.right);

    }

    public void postOrder(Node ptr) {
        if (ptr == null) return;

        preOrder(ptr.left);
        preOrder(ptr.right);
        System.out.println("\t" + ptr.data);
    }

    public void traverse() {

        System.out.println("Preorder Traversal ");
        preOrder(root);

        System.out.println("Inorder Traversal ");
        inOrder(root);

        System.out.println("Postorder Traversal ");
        postOrder(root);
    }

}
