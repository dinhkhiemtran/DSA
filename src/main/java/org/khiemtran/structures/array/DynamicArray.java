package org.khiemtran.structures.array;

public class DynamicArray {
  private int[] array;
  private int size;
  private int capacity;

  public DynamicArray() {
    this.size = 0;
    this.capacity = 2;
    this.array = new int[capacity];
  }

  private void resize() {
    this.capacity *= 2;
    int[] temp = new int[capacity];
    for (int i = 0; i < size; i++) {
      temp[i] = array[i];
    }
    array = temp;
  }

  private boolean isFull() {
    return getCapacity() == getSize();
  }

  public int getSize() {
    return this.size;
  }

  public int getCapacity() {
    return this.capacity;
  }

  public void addElement(int element) {
    if (isFull()) {
      resize();
    }
    this.array[size] = element;
    this.size++;
  }

  public int removeElement(int index) {
    if (index < 0 || index >= size) {
      throw new IndexOutOfBoundsException();
    }
    for (int i = index; i < size - 1; i++) {
      array[i] = array[i + 1];
    }
    size--;
    return array[index];
  }
}
