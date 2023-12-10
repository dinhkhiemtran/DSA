package org.khiemtran.structures.dimensional;

public class RowsAndColumns {
  private final int[] rows;
  private final int[] column;

  public RowsAndColumns(int[][] array) {
    int numRows = array.length;
    int numCols = array[0].length;
    rows = new int[numRows * numCols];
    column = new int[numCols * numCols];
    int k = 0;
    for (int i = 0; i < numRows; i++) {
      for (int j = 0; j < numRows; j++) {
        rows[k++] = array[i][j];
      }
    }
    int h = 0;
    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < array.length; j++) {
        column[h++] = array[j][i];
      }
    }
  }

  public int[] getRows() {
    return rows;
  }

  public int[] getColumn() {
    return column;
  }
}
