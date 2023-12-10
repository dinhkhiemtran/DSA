package org.khiemtran.structures.dimensional;

public class Diagonals {
  private final int[] principal;
  private final int[] secondary;

  public Diagonals(int[][] array) {
    try {
      principal = new int[array.length];
      secondary = new int[array.length];
      for (int i = 0; i < array.length; i++) {
        principal[i] = array[i][i];
      }
      for (int j = 0; j < array.length; j++) {
        secondary[j] = array[j][array.length - 1 - j];
      }
    } catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
      throw new ArrayIndexOutOfBoundsException();
    }
  }

  public int[] getPrincipal() {
    return principal;
  }

  public int[] getSecondary() {
    return secondary;
  }
}
