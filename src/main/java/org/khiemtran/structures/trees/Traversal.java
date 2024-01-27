package org.khiemtran.structures.trees;

public class Traversal {
  public static class Node {
    private int data;
    private Node left;
    private Node right;

    public int getData() {
      return data;
    }

    public Node getLeft() {
      return left;
    }

    public Node getRight() {
      return right;
    }

    public void setData(int data) {
      this.data = data;
    }

    public void setLeft(Node left) {
      this.left = left;
    }

    public void setRight(Node right) {
      this.right = right;
    }
  }

  private Node root;

  public Traversal() {
    this.root = null;
  }

  public void setRoot(Node root) {
    this.root = root;
  }

  public Node getRoot() {
    return root;
  }

  public void inorder(Node node) {
    if (node != null) {
      inorder(node.getLeft());
      System.out.print(node.getData() + "->");
      inorder(node.getRight());
    }
  }

  public void preorder(Node node) {
    if (node != null) {
      System.out.print(node.getData() + "->");
      preorder(node.getLeft());
      preorder(node.getRight());
    }
  }

  public void postorder(Node node) {
    if (node != null) {
      postorder(node.getLeft());
      postorder(node.getRight());
      System.out.print(node.getData() + "->");
    }
  }
}
