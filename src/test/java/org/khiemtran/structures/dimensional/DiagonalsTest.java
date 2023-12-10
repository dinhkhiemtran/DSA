package org.khiemtran.structures.dimensional;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class DiagonalsTest {
  public Diagonals diagonals;

  @Test
  @Tag("task1")
  @DisplayName("Get an array of principal")
  public void testGetPrincipal() {
    int[][] matrix = new int[][]{
        {1, 2, 3, 4},
        {4, 3, 2, 1},
        {7, 8, 9, 6},
        {6, 5, 4, 3}
    };
    diagonals = new Diagonals(matrix);
    Assertions.assertEquals(Arrays.toString(new int[]{1, 3, 9, 3}), Arrays.toString(diagonals.getPrincipal()));
  }

  @Test
  @Tag("task2")
  @DisplayName("Get an array of Secondary")
  public void testGetSecondary() {
    int[][] matrix = new int[][]{
        {1, 2, 3, 4},
        {4, 3, 2, 1},
        {7, 8, 9, 6},
        {6, 5, 4, 3}
    };
    diagonals = new Diagonals(matrix);
    Assertions.assertEquals(Arrays.toString(new int[]{4, 2, 8, 6}), Arrays.toString(diagonals.getSecondary()));
  }

  @Test
  @Tag("task3")
  public void testGetPrincipalAndSecondary() {
    int[][] matrix = new int[][]{
        {1, 1, 1},
        {1, 1, 1},
        {1, 1, 1},
    };
    diagonals = new Diagonals(matrix);
    Assertions.assertEquals(Arrays.toString(new int[]{1, 1, 1}), Arrays.toString(diagonals.getPrincipal()));
    Assertions.assertEquals(Arrays.toString(new int[]{1, 1, 1}), Arrays.toString(diagonals.getSecondary()));
  }

  @Test
  @Tag("test4")
  public void testArrayIndexOutOfBoundsException() {
    int[][] matrix = new int[][]{
        {1, 1, 1},
        {1, 1, 1},
        {1, 1, 1},
        {1, 1, 1}
    };
    Assertions.assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
      diagonals = new Diagonals(matrix);
    });
  }
}