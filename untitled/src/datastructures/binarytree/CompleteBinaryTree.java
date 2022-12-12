package datastructures.binarytree;

public class CompleteBinaryTree {

    Node root;

    static class Node{
        int data;
        Node left, right;

        Node(int item) {
            data = item;
            left = right = null;
        }
    }

    //Count the number of nodes
    public static int countNumNodes(Node root){
        if (root == null){
            return 0;
        }
        return (1 + countNumNodes(root.left) + countNumNodes(root.right));
    }

    //Check for complete binary tree
    public static boolean checkComplete(Node root, int index, int numberNodes){
        // Check if the tree is empty
        if (root == null)
            return true;

        if (index >= numberNodes)
            return false;

        return (checkComplete(root.left, 2 * index + 1, numberNodes)
                && checkComplete(root.right, 2 * index + 2, numberNodes));
    }

    public void isCompleteBinaryTree(Node root, int index, int node_count){
        if (checkComplete(root, index, node_count)){
            System.out.println("The tree is a complete binary tree.");
        }
        else{
            System.out.println("The tree is not a complete binary tree");
        }
    }

    public static void main(String[] args) {
        CompleteBinaryTree completeBinaryTree = new CompleteBinaryTree();
        completeBinaryTree.root = new Node(1);
        completeBinaryTree.root.left = new Node(2);
        completeBinaryTree.root.right = new Node(3);
        completeBinaryTree.root.left.right = new Node(5);
        completeBinaryTree.root.left.left = new Node(4);
        completeBinaryTree.root.right.left = new Node(6);

        int node_count = completeBinaryTree.countNumNodes(completeBinaryTree.root);
        int index = 0;
        completeBinaryTree.isCompleteBinaryTree(completeBinaryTree.root, index, node_count);
    }
}
