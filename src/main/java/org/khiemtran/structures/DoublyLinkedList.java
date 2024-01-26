package org.khiemtran.structures;

public class DoublyLinkedList {
  public static class Node {
    private int data;
    private Node next;
    private Node prev;

    public int getData() {
      return data;
    }

    public Node getNext() {
      return next;
    }

    public Node getPrev() {
      return prev;
    }

    public void setData(int data) {
      this.data = data;
    }

    public void setNext(Node next) {
      this.next = next;
    }

    public void setPrev(Node prev) {
      this.prev = prev;
    }
  }

  private Node head;
  private Node tail;
  private int size;

  public DoublyLinkedList() {
    this.head = null;
    this.tail = null;
    this.size = 0;
  }

  public Node getHead() {
    return head;
  }

  public Node getTail() {
    return tail;
  }

  public int length() {
    return size;
  }

  private boolean isEmpty() {
    return size == 0;
  }

  public void add(int data) {
    Node newNode = new Node();
    newNode.setData(data);
    if (isEmpty()) {
      head = newNode;
    } else {
      tail.setNext(newNode);
      newNode.setPrev(tail);
    }
    tail = newNode;
    size++;
  }

  public void insertHeadNode(int data) {
    Node newNode = new Node();
    newNode.setData(data);
    if (isEmpty()) {
      head = newNode;
      tail = newNode;
    } else {
      newNode.setNext(head);
      head.setPrev(newNode);
      head = newNode;
    }
    size++;
  }

  public void insert(int data, int index) {
    if (isEmpty() || index == 0) {
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
      if (current != null) {
        newNode.setPrev(current);
        newNode.setNext(current.getNext());
        current.getNext().setPrev(newNode);
        current.setNext(newNode);
        size++;
      } else {
        System.out.println("Invalid index");
      }
    }
  }

  public int remove() {
    if (isEmpty()) {
      System.out.println("Invalid index or empty list.");
      return -1;
    } else {
      Node current = tail;
      tail = tail.getPrev();
      current.setPrev(null);
      tail.setNext(null);
      size--;
      return current.getData();
    }
  }

  public int removeHead() {
    Node current = head;
    if (isEmpty()) {
      System.out.println("Invalid index or empty list.");
      return -1;
    }
    if (length() == 1) {
      head = null;
      tail = null;
      size--;
      return current.getData();
    } else {
      head = head.getNext();
      current.setNext(null);
      head.setPrev(null);
      size--;
      return current.getData();
    }
  }

  public int removeAtIndex(int index) {
    if (isEmpty() || index < 0 || index >= size) {
      System.out.println("Invalid index or empty list.");
      return -1;
    }
    if (index == 0) {
      return removeHead();
    }
    Node current = head;
    int currentIndex = 0;
    while (currentIndex < index) {
      current = current.getNext();
      currentIndex++;
    }
    current.getPrev().setNext(current.getNext());
    current.getNext().setPrev(current.getPrev());
    size--;
    return current.getData();
  }

  public void display() {
    StringBuilder stringBuilder = new StringBuilder();
    Node current = head;
    stringBuilder.append("head->");
    while (current != null) {
      stringBuilder.append(current.getData()).append("->");
      current = current.getNext();
    }
    stringBuilder.append("null");
    System.out.println(stringBuilder);
  }
}
