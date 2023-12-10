package org.khiemtran.structures.dimensional;

public class PrintElements {
  public void print(int[][] array) {
    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < array.length; j++) {
        System.out.print(array[i][j]);
      }
      System.out.println();
    }
  }
}
