package org.khiemtran.structures.dimensional;

public class SearchElement {
  public int search(int[][] matrix, int number) {
    System.out.println(matrix.length);
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix.length; j++) {
        if (number == matrix[i][j]) {
          return matrix[i][j];
        }
      }
    }
    return -1;
  }
}
