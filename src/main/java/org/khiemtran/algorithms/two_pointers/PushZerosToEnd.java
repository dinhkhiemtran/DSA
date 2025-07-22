package org.khiemtran.algorithms.two_pointers;

import java.util.Arrays;

public class PushZerosToEnd {
  public int[] solution(int[] array) {
    int[] temp = new int[array.length];
    Arrays.fill(temp, 0);
    int k = 0;
    for (int ele : array) {
      if (ele != 0) {
        temp[k] = ele;
        k++;
      }
    }
    return temp;
  }
}
