package org.khiemtran.structures;

public class Stack {
  private int top;
  private int[] array;
  private int size;

  public Stack(int capacity) {
    this.top = -1;
    this.array = new int[capacity];
    this.size = 0;
  }

  private boolean isEmpty() {
    return size == 0;
  }

  private boolean isFull() {
    return size >= array.length;
  }

  public int length() {
    return size;
  }

  public void push(int element) {
    if (isFull()) {
      System.out.println("Stack is full.");
    } else {
      array[++top] = element;
      size++;
    }
  }

  public int pop() {
    if (isEmpty()) {
      System.out.println("Stack is Empty");
      return -1;
    } else {
      int element = array[top--];
      size--;
      return element;
    }
  }

  public void display() {
    for (int i = 0; i <= top; i++) {
      System.out.println("Stack: " + array[i]);
    }
  }
}
