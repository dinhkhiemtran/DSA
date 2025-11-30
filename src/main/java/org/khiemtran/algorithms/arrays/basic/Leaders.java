package org.khiemtran.algorithms.arrays.basic;

public class Leaders {
  public int[] solution(int[] array) {
    if (array.length == 0) {
      return new int[0];
    }
    int[] temp = new int[array.length];
    int index = 0;
    for (int i = 0; i < array.length; i++) {
      for (int j = i; j < array.length; j++) {
        if (array[i] < array[j]) {
          break;
        }
        if (j == array.length - 1) {
          temp[index++] = array[i];
        }
      }
    }
    int[] result = new int[index];
    for (int i = 0; i < index; i++) {
      result[i] = temp[i];
    }
    return result;
  }
}
