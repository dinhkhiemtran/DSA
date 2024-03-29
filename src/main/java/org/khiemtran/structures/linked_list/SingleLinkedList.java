package org.khiemtran.structures.linked_list;

public class SingleLinkedList {
  public static class Node {
    private int data;
    private Node next;

    public Node() {
    }

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

  private boolean isEmpty() {
    return size == 0;
  }

  public Node getHead() {
    return head;
  }

  public int getSize() {
    return size;
  }

  public void add(int element) {
    Node newNode = new Node();
    newNode.setData(element);
    if (isEmpty()) {
      this.head = newNode;
    } else {
      Node current = head;
      while (current.getNext() != null) {
        current = current.getNext();
      }
      current.setNext(newNode);
    }
    this.size++;
  }

  public void addHead(int element) {
    Node newNode = new Node();
    newNode.setData(element);
    if (isEmpty()) {
      this.head = newNode;
    } else {
      Node current = head;
      newNode.setNext(current);
      head = newNode;
    }
    this.size++;
  }

  public void insert(int element, int index) {
    if (index == size || isEmpty()) {
      add(element);
    } else {
      if (index == 0) {
        addHead(element);
      } else {
        Node newNode = new Node();
        newNode.setData(element);
        Node current = head;
        int currentIndex = 0;
        while (current != null && currentIndex < index - 1) {
          current = current.getNext();
          currentIndex++;
        }
        if (current != null) {
          newNode.setNext(current.getNext());
          current.setNext(newNode);
          size++;
        }
      }
    }
  }

  public int remove() {
    int data;
    if (isEmpty()) {
      System.out.println("Linked List is empty.");
      return -1;
    }
    if (size == 1) {
      data = head.getData();
      head.setNext(null);
    } else {
      Node current = head;
      while (current.getNext().getNext() != null) {
        current = current.getNext();
      }
      data = current.getNext().getData();
      current.setNext(null);
    }
    size--;
    return data;
  }

  public int removeHead() {
    int data;
    if (isEmpty()) {
      System.out.println("Linked List is empty.");
      return -1;
    }
    if (size == 1) {
      data = head.getData();
      head.setNext(null);
    } else {
      Node current = head;
      head = current.getNext();
      data = current.getData();
      current.setNext(null);
    }
    size--;
    return data;
  }

  public int removeIndex(int index) {
    int data;
    if (index == size || isEmpty()) {
      return remove();
    } else {
      if (index == 0) {
        return removeHead();
      } else {
        Node current = head;
        int currentIndex = 0;
        while (current != null && currentIndex < index - 1) {
          current = current.getNext();
          currentIndex++;
        }
        assert current != null;
        data = current.getNext().getData();
        current.setNext(current.getNext().getNext());
      }
      size--;
      return data;
    }
  }

  public void display() {
    if (isEmpty()) {
      System.out.println("Linked List is empty.");
    } else {
      Node current = head;
      System.out.print("head->");
      while (current != null) {
        System.out.print(current.getData() + "->");
        current = current.getNext();
      }
      System.out.println("null");
    }
  }
}
