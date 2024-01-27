package org.khiemtran.structures.trees;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class TraversalTreeTest {
  @Test
  @DisplayName("Test inorder traversal")
  public void testInOrderTraversal() {
    Traversal traversal = new Traversal();
    Traversal.Node root = new Traversal.Node();
    root.setData(0);
    Traversal.Node leftNode = new Traversal.Node();
    leftNode.setData(1);
    Traversal.Node rightNode = new Traversal.Node();
    rightNode.setData(2);
    root.setLeft(leftNode);
    root.setRight(rightNode);
    traversal.setRoot(root);
    traversal.inorder(traversal.getRoot());
    Assertions.assertEquals(0, traversal.getRoot().getData());
    Assertions.assertEquals(1, traversal.getRoot().getLeft().getData());
    Assertions.assertEquals(2, traversal.getRoot().getRight().getData());
  }

  @Test
  @DisplayName("Test preorder traversal")
  public void testPreOrder() {
    Traversal traversal = new Traversal();
    Traversal.Node root = new Traversal.Node();
    root.setData(0);
    Traversal.Node leftNode = new Traversal.Node();
    leftNode.setData(1);
    Traversal.Node rightNode = new Traversal.Node();
    rightNode.setData(2);
    Traversal.Node leftLeftNode = new Traversal.Node();
    leftLeftNode.setData(3);
    root.setLeft(leftNode);
    root.getLeft().setLeft(leftLeftNode);
    root.setRight(rightNode);
    traversal.setRoot(root);
    traversal.preorder(traversal.getRoot());
    Assertions.assertEquals(0, traversal.getRoot().getData());
    Assertions.assertEquals(1, traversal.getRoot().getLeft().getData());
    Assertions.assertEquals(2, traversal.getRoot().getRight().getData());
    Assertions.assertEquals(3, traversal.getRoot().getLeft().getLeft().getData());
  }

  @Test
  @DisplayName("post order")
  public void testPostOrder() {
    Traversal traversal = new Traversal();
    Traversal.Node root = new Traversal.Node();
    root.setData(0);
    Traversal.Node leftNode = new Traversal.Node();
    leftNode.setData(1);
    Traversal.Node leftLeftNode = new Traversal.Node();
    leftLeftNode.setData(2);
    Traversal.Node leftLeftLeftNode = new Traversal.Node();
    leftLeftLeftNode.setData(3);
    Traversal.Node rightNode = new Traversal.Node();
    rightNode.setData(4);
    Traversal.Node rightRightNode = new Traversal.Node();
    rightRightNode.setData(5);
    Traversal.Node rightRightRightNode = new Traversal.Node();
    rightRightRightNode.setData(6);
    root.setLeft(leftNode);
    root.getLeft().setLeft(leftLeftNode);
    root.getLeft().getLeft().setLeft(leftLeftLeftNode);
    root.setRight(rightNode);
    root.getRight().setRight(rightRightNode);
    root.getRight().getRight().setRight(rightRightRightNode);
    traversal.setRoot(root);
    traversal.postorder(traversal.getRoot());
    Assertions.assertEquals(0, traversal.getRoot().getData());
    Assertions.assertEquals(1, traversal.getRoot().getLeft().getData());
    Assertions.assertEquals(2, traversal.getRoot().getLeft().getLeft().getData());
    Assertions.assertEquals(3, traversal.getRoot().getLeft().getLeft().getLeft().getData());
    Assertions.assertEquals(4, traversal.getRoot().getRight().getData());
    Assertions.assertEquals(5, traversal.getRoot().getRight().getRight().getData());
    Assertions.assertEquals(6, traversal.getRoot().getRight().getRight().getRight().getData());
  }
}