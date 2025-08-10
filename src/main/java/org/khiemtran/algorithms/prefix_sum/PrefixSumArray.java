package org.khiemtran.algorithms.prefix_sum;

public class PrefixSumArray {
  public int[] solution(int[] array) {
    int[] prefixSumArray = new int[array.length];
    prefixSumArray[0] = array[0];
    for (int i = 1; i < array.length; i++) {
      prefixSumArray[i] = prefixSumArray[i - 1] + array[i];
    }
    return prefixSumArray;
  }
}
