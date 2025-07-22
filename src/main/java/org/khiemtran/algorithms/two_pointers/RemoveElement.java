package org.khiemtran.algorithms.two_pointers;

public class RemoveElement {
  public int solution(int[] array, int ele) {
    int k = 0;
    for (int i = 0; i < array.length; i++) {
      if (array[i] != ele) {
        array[k] = array[i];
        k++;
      }
    }
    return k;
  }
}
