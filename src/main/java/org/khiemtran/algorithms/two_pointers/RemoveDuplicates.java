package org.khiemtran.algorithms.two_pointers;

public class RemoveDuplicates {
  public int[] solution(int[] array) {
    if (array.length == 0) {
      return new int[]{};
    }
    int index = 1;
    for (int i = 1; i < array.length; i++) {
      if (array[index - 1] != array[i]) {
        array[index] = array[i];
        index++;
      }
    }
    int[] result = new int[index];
    for (int i = 0; i < index; i++) {
      result[i] = array[i];
    }
    return result;
  }
}
