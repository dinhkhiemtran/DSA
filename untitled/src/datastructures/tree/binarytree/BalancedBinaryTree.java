package datastructures.tree.binarytree;

public class BalancedBinaryTree {

    Node root;

    static class Node {
        int data;
        Node left, right;
        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    static class Height {
        int height;

        Height() {
            height = 0;
        }
    }

    public boolean checkHeightBalance(Node root, Height height) {
        // Check for emptiness
        if (root == null) {
            height.height = 0;
            return true;
        }

        Height leftHeightEight = new Height(), rightHeightEight = new Height();
        boolean l = checkHeightBalance(root.left, leftHeightEight);
        boolean r = checkHeightBalance(root.right, rightHeightEight);
        int leftHeight = leftHeightEight.height, rightHeight = rightHeightEight.height;

        height.height = (leftHeight > rightHeight ? leftHeight : rightHeight) + 1;

        if ((leftHeight - rightHeight >= 2) || (rightHeight - leftHeight >= 2))
            return false;

        else
            return l && r;
    }

    public void isBalancedBinaryTree(Node root, Height height) {
        if (checkHeightBalance(root, height)) {
            System.out.println("The tree is balanced");
        } else {
            System.out.println("The tree is not balanced");
        }
    }

    public static void main(String[] args) {
        Height height = new Height();

        BalancedBinaryTree tree = new BalancedBinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.isBalancedBinaryTree(tree.root, height);
    }
}
