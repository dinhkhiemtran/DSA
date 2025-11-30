package org.khiemtran.algorithms.arrays.basic;

public class RemoveDuplicatesSortedArray {
  public int[] solution(int[] array) {
    if (array.length == 0) {
      return new int[]{};
    }
    int index = 1;
    int[] temp = new int[array.length];
    temp[0] = array[0];
    for (int i = 1; i < array.length; i++) {
      if (array[i] != array[i - 1]) {
        temp[index++] = array[i];
      }
    }
    int[] result = new int[index];
    for (int i = 0; i < index; i++) {
      result[i] = temp[i];
    }
    return result;
  }
}
