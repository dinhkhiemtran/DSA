package org.khiemtran.structures.dimensional.sort;

import org.junit.jupiter.api.*;

import java.util.Arrays;

class SortElementsTest {
  private SortElements sortElements;

  @BeforeEach
  public void init() {
    sortElements = new SortElements();
  }

  @Test
  @Tag("task1")
  @DisplayName("Matrix is null")
  public void isMatrixNull() {
    Assertions.assertEquals(null, sortElements.sort(new int[][]{}));
  }

  @Test
  @Tag("task2")
  @DisplayName("Matrix is sorted")
  public void testSortMatrix() {
    int[][] expect = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
    int[][] array = {{5, 4, 7},
        {1, 3, 8},
        {2, 9, 6}};
    Assertions.assertEquals(Arrays.deepToString(expect), Arrays.deepToString(sortElements.sort(array)));
  }
}