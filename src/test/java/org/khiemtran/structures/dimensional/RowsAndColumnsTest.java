package org.khiemtran.structures.dimensional;

import org.junit.jupiter.api.*;

import java.util.Arrays;

class RowsAndColumnsTest {
  private RowsAndColumns rowsAndColumns;

  @BeforeEach
  public void init() {
    int[][] array = {
        {1, 2, 3},
        {4, 5, 6},
        {7, 8, 9}
    };
    rowsAndColumns = new RowsAndColumns(array);
  }

  @Test
  @Tag("task1")
  @DisplayName("Get rows")
  public void testGetRows() {
    Assertions.assertEquals(
        Arrays.toString(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}),
        Arrays.toString(rowsAndColumns.getRows()));
  }

  @Test
  @Tag("task2")
  @DisplayName("Get columns")
  public void testGetColumns() {
    Assertions.assertEquals(Arrays.toString(new int[]{1, 4, 7, 2, 5, 8, 3, 6, 9}),
        Arrays.toString(rowsAndColumns.getColumn()));
  }
}