package org.khiemtran.structures.queue;

public class SimpleQueue {
  private int rear;
  private int front;
  private int[] items;
  private int size;

  public SimpleQueue(int capacity) {
    this.rear = -1;
    this.front = -1;
    this.size = 0;
    this.items = new int[capacity];
  }

  public int getRear() {
    return rear;
  }

  public int getFront() {
    return front;
  }

  public int getSize() {
    return size;
  }

  public void add(int element) {
    if (isFull()) {
      System.out.println("Queue is full.");
    } else {
      if (front == -1) {
        front = 0;
      }
      size++;
      items[++rear] = element;
    }
  }

  public void delete() {
    if (!isEmpty()) {
      if (front >= rear) {
        front = -1;
        rear = -1;
      } else {
        front++;
      }
      size--;
    }
  }

  public void display() {
    if (isEmpty()) {
      System.out.println("Queue is empty");
    } else {
      for (int i = front; i <= rear; i++) {
        System.out.print(items[i] + ",");
      }
    }
    System.out.println();
  }

  private boolean isEmpty() {
    return size == 0;
  }

  private boolean isFull() {
    return size > items.length - 1;
  }
}
