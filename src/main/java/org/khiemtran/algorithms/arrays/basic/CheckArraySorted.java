package org.khiemtran.algorithms.arrays.basic;

public class CheckArraySorted {
  public boolean solution(int[] array) {
    if (array.length == 0) {
      return false;
    }
    for (int i = 1; i < array.length; i++) {
      if (array[i - 1] > array[i]) {
        return false;
      }
    }
    return true;
  }
}
