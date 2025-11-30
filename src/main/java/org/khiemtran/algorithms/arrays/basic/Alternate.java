package org.khiemtran.algorithms.arrays.basic;

public class Alternate {
  public String getAlternateElements(int[] array) {
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < array.length; i = i + 2) {
      if (i == array.length - 1) {
        sb.append(array[i]);
      } else {
        sb.append(array[i]).append(" ");
      }
    }
    return sb.toString();
  }
}
