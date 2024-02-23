package org.khiemtran.structures.queue;

public class RegularQueue {
  private int front;
  private int rear;
  private final int[] array;
  private int size;

  public RegularQueue(int capacity) {
    this.front = -1;
    this.rear = -1;
    this.array = new int[capacity];
    this.size = 0;
  }

  private boolean isEmpty() {
    return size == 0;
  }

  private boolean isFull() {
    return size == array.length;
  }

  public void add(int element) {
    if (isFull()) {
      System.out.println("Queue is full.");
    } else {
      front = 0;
      array[++rear] = element;
      size++;
    }
  }

  public int remove() {
    if (isEmpty()) {
      front = -1;
      rear = -1;
      System.out.println("Queue is empty.");
      return -1;
    } else {
      int element = array[front++];
      size--;
      return element;
    }
  }

  public int length() {
    return size;
  }

  public void display() {
    System.out.print("Queue: ");
    for (int i = front; i <= rear; i++) {
      System.out.print(array[i] + " ");
    }
  }
}
