package ApnaCollege;

public class BinaryTree {

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

    private static class BTree {

        private static int index = -1;

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

        private static void preOrder(Node root) {

            if (root == null) {
                return;
            }
            System.out.print(root.data + "-->");
            preOrder(root.left);
            preOrder(root.right);
        }

        private static void inOrder(Node root) {

            if (root == null) {
                return;
            }
            inOrder(root.left);
            System.out.print(root.data + "-->");
            inOrder(root.right);
        }

        private static void postOrder(Node root) {

            if (root == null) {
                return;
            }
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data + "-->");
        }

        private static int countOfNodes(Node root) {

            if (root == null) {
                return 0;
            }
            int leftNode = countOfNodes(root.left);
            int rightNode = countOfNodes(root.right);
            return leftNode + rightNode + 1;
        }

        private static int sumOfNodes(Node root) {
            if (root == null) {
                return 0;
            }
            int leftNode = sumOfNodes(root.left);
            int rightNode = sumOfNodes(root.right);
            return leftNode + rightNode + root.data;
        }

        private static int heightOfTree(Node root) {

            if(root == null){
                return 0;
            }
            int leftHeight = heightOfTree(root.left);
            int rightHeight = heightOfTree(root.right);
            return Math.max(leftHeight, rightHeight) + 1;
        }

        private static int diameterOfTree(Node root){

            if(root == null){
                return 0;
            }

            int diam1 = diameterOfTree(root.left);
            int diam2 = diameterOfTree(root.right);
            int diam3 = heightOfTree(root.left) + heightOfTree(root.right) +1;
            return Math.max(diam3,Math.max(diam1,diam2));
        }
    }


    public static void main(String[] args) {

        int[] arr = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        Node root = BTree.buildTree(arr);
        System.out.println("Count: " + BTree.countOfNodes(root));
        System.out.println("Sum: " + BTree.sumOfNodes(root));
        System.out.println("Height: "+ BTree.heightOfTree(root));
        System.out.println("Diameter: "+BTree.diameterOfTree(root));

        //BTree.preOrder(root);
        //System.out.println();
        //BTree.inOrder(root);
        //System.out.println();
        //BTree.postOrder(root);
    }
}
