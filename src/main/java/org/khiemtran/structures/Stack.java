package org.khiemtran.structures;

public class Stack {
  private int top;
  private int size;
  private final int[] items;

  public Stack(int capacity) {
    this.top = -1;
    this.size = 0;
    this.items = new int[capacity];
  }

  public int getTop() {
    return top;
  }

  public int getSize() {
    return size;
  }

  public void push(int element) {
    if (isFull()) {
      System.out.println("Stack is full.");
    } else {
      items[++top] = element;
      size++;
    }
  }

  public void pop() {
    if (isEmpty()) {
      System.out.println("Stack is empty");
    } else {
      size--;
      System.out.println("Data is removed: " + items[top--]);
    }
  }

  public void display() {
    for (int i = 0; i <= top; i++) {
      System.out.print(items[i] + ",");
    }
  }

  private boolean isFull() {
    return size > items.length -1;
  }

  private boolean isEmpty() {
    return size == 0;
  }
}
