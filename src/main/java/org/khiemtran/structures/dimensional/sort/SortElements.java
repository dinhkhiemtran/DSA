package org.khiemtran.structures.dimensional.sort;

public class SortElements {
  public int[][] sort(int[][] array) {
    if (array.length == 0)
      return null;
    int[] temp = new int[array.length * array.length];
    int k = 0;
    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < array.length; j++) {
        temp[k++] = array[i][j];
      }
    }
    int[] sorted = sortTemp(temp);
    int h = 0;
    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < array.length; j++) {
        array[i][j] = sorted[h++];
      }
    }
    return array;
  }

  private int[] sortTemp(int[] temp) {
    for (int i = 0; i < temp.length; i++) {
      for (int j = i + 1; j < temp.length; j++) {
        if (temp[i] > temp[j]) {
          swap(temp, i, j);
        }
      }
    }
    return temp;
  }

  private void swap(int[] temp, int i, int j) {
    int store = temp[i];
    temp[i] = temp[j];
    temp[j] = store;
  }
}
