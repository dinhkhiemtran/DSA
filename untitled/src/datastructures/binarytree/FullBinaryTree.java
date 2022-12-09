package datastructures.binarytree;

public class FullBinaryTree {

    NodeOfFullBinaryTree root;

    public boolean isFullBinaryTree(NodeOfFullBinaryTree node) {
        if (node == null) {
            return true;
        }
        if (node.left == null && node.right == null) {
            return true;
        }
        if (node.left != null && node.right != null) {
            return isFullBinaryTree(node.left) && isFullBinaryTree(node.right);
        }
        return false;
    }

    public static void main(String[] args) {
        FullBinaryTree fullBinaryTree = new FullBinaryTree();
        fullBinaryTree.root = new NodeOfFullBinaryTree(1);
        fullBinaryTree.root.left = new NodeOfFullBinaryTree(2);
        fullBinaryTree.root.right = new NodeOfFullBinaryTree(3);
        fullBinaryTree.root.left.left = new NodeOfFullBinaryTree(4);
        fullBinaryTree.root.left.right = new NodeOfFullBinaryTree(5);
        fullBinaryTree.root.right.left = new NodeOfFullBinaryTree(6);
        fullBinaryTree.root.right.right = new NodeOfFullBinaryTree(7);
        if (fullBinaryTree.isFullBinaryTree(fullBinaryTree.root))
            System.out.print("The tree is a full binary tree.");
        else
            System.out.print("The tree is not a full binary tree.");
    }
}

class NodeOfFullBinaryTree {
    int data;
    NodeOfFullBinaryTree left;
    NodeOfFullBinaryTree right;

    NodeOfFullBinaryTree(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}