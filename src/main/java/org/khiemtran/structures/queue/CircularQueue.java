package org.khiemtran.structures.queue;

public class CircularQueue {
  private int front;
  private int rear;
  private final int size;
  private final int[] items;

  public CircularQueue(int capacity) {
    this.front = -1;
    this.rear = -1;
    this.size = capacity;
    this.items = new int[size];
  }

  private boolean isFull() {
    return front == 0 && rear == size - 1 || front == rear + 1;
  }

  private boolean isEmpty() {
    return front == -1;
  }

  public int getFront() {
    return front;
  }

  public int getRear() {
    return rear;
  }

  public void enQueue(int element) {
    if (isFull()) {
      System.out.println("Queue is full");
    } else {
      if (front == -1) {
        front = 0;
      }
      rear = (rear + 1) % size;
      items[rear] = element;
      System.out.println("Item inserted: " + element);
    }
  }

  public int deQueue() {
    int element = 0;
    if (isEmpty()) {
      System.out.println("Queue is Empty");
      return -1;
    } else {
      element = items[front];
      if (front == rear) {
        front = -1;
        rear = -1;
      } else {
        front = (front + 1) % size;
      }
    }
    return element;
  }

  public void display() {
    int i;
    if (isEmpty()) {
      System.out.println("Empty Queue");
    } else {
      System.out.print("Items -> ");
      for (i = front; i != rear; i = (i + 1) % size) {
        System.out.print(items[i] + " ");
      }
      System.out.println(items[i]);
    }
  }
}
