package org.khiemtran.structures.arrays.max_min;

public class MinMax {
  public int[] getMinMax(int[] array) {
    if (array.length == 0) {
      return null;
    }
    for (int i = 0 ; i < array.length; i++) {
      for (int j = i + 1; j < array.length; j++) {
        sortArray(i, j, array);
      }
    }
    return new int[]{array[0], array[array.length - 1]};
  }

  private void sortArray(int i, int j, int[] array) {
    if (array[i] > array[j]) {
      int temp = array[i];
      array[i] = array[j];
      array[j] = temp;
    }
  }
}
