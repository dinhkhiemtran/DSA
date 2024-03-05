package org.khiemtran.structures.queue;

public class CircularQueue {
  private int size;
  private int front;
  private int rear;
  private final int[] items;

  public CircularQueue(int capacity) {
    this.size = 0;
    this.front = -1;
    this.rear = -1;
    this.items = new int[capacity];
  }

  public int getSize() {
    return size;
  }

  public int getRear() {
    return rear;
  }

  public int getFront() {
    return front;
  }

  private boolean isFull() {
    return (front == 0 && rear == items.length - 1) || (front == rear + 1);
  }

  private boolean isEmpty() {
    return front == -1;
  }

  public void enQueue(int element) {
    if (isFull()) {
      System.out.println("Circular Queue is full.");
    } else {
      if (front == -1) {
        front = 0;
      }
      items[(++rear) % items.length] = element;
      size++;
    }
  }

  public void deQueue() {
    if (!isEmpty()) {
      if (front == rear) {
        front = -1;
        rear = -1;
      } else {
        front = (front + 1) % items.length;
      }
      size--;
    }
  }

  public void display() {
    int i;
    if (isEmpty()) {
      System.out.println("Empty Queue");
    } else {
      System.out.println("Front -> " + front);
      System.out.println("Items -> ");
      for (i = front; i != rear; i = (i + 1) % items.length)
        System.out.print(items[i] + " ");
      System.out.println(items[i]);
      System.out.println("Rear -> " + rear);
    }
  }
}
