package org.khiemtran.structures;

public class SingleLinkedList {
  public static class Node {
    private int data;
    private Node next;

    public int getData() {
      return data;
    }

    public Node getNext() {
      return next;
    }

    public void setData(int data) {
      this.data = data;
    }

    public void setNext(Node next) {
      this.next = next;
    }
  }

  private Node head;
  private int size;

  public SingleLinkedList() {
    this.head = null;
    this.size = 0;
  }

  private boolean isEmpty() {
    return size == 0;
  }

  public int length() {
    return size;
  }

  public Node peak() {
    return head;
  }

  public void add(int data) {
    Node newNode = new Node();
    newNode.setData(data);
    if (isEmpty()) {
      head = newNode;
    } else {
      Node current = head;
      while (current.getNext() != null) {
        current = current.getNext();
      }
      current.setNext(newNode);
    }
    size++;
  }

  public void insert(int data, int index) {
    if (index == 0 || index == length()) {
      add(data);
    } else {
      Node newNode = new Node();
      newNode.setData(data);
      Node current = head;
      int currentIndex = 0;
      while (current != null && currentIndex < index - 1) {
        current = current.getNext();
        currentIndex++;
      }
      if (current == null) {
        System.out.println("Index out of Single Linked List");
      } else {
        newNode.setNext(current.getNext());
        current.setNext(newNode);
        size++;
      }
    }
  }

  public void insertHead(int data) {
    Node newNode = new Node();
    newNode.setData(data);
    if (isEmpty()) {
      head = newNode;
      size++;
    } else {
      newNode.setNext(head);
      head = newNode;
      size++;
    }
  }

  public int removeLastNode() {
    if (isEmpty()) {
      System.out.println("Single Linked List is empty.");
      return -1;
    }
    if (length() == 1) {
      return processOnlyOneDataRemains();
    } else {
      Node current = head;
      while (current.getNext().getNext() != null) {
        current = current.getNext();
      }
      int data = current.getNext().getData();
      current.setNext(null);
      size--;
      return data;
    }
  }

  public int removeFirstNode() {
    if (isEmpty()) {
      System.out.println("Single Linked List is empty.");
      return -1;
    }
    if (length() == 1) {
      return processOnlyOneDataRemains();
    } else {
      Node current = head;
      head = head.getNext();
      int data = current.getData();
      current.setNext(null);
      size--;
      return data;
    }
  }

  public int removeAtIndex(int index) {
    if (isEmpty()) {
      System.out.println("Single Linked List is empty");
      return -1;
    }
    if (index == 0) {
      return removeFirstNode();
    } else {
      Node current = head;
      int currentIndex = 0;
      while (current != null && currentIndex < index - 1) {
        current = current.getNext();
        currentIndex++;
      }
      if (current == null) {
        System.out.println("Index out of Single Linked List");
        return -1;
      } else {
        int data = current.getNext().getData();
        current.setNext(current.getNext().getNext());
        size--;
        return data;
      }
    }
  }

  private int processOnlyOneDataRemains() {
    int data = head.getData();
    head = null;
    size--;
    return data;
  }

  public void display() {
    Node current = head;
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("head->");
    while (current != null) {
      stringBuilder.append(current.getData()).append("->");
      current = current.getNext();
    }
    stringBuilder.append("null");
    System.out.println(stringBuilder);
  }
}
