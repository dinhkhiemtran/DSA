package org.khiemtran.structures.dimensional;

import org.junit.jupiter.api.*;

class SearchElementTest {
  private SearchElement searchElement;

  @BeforeEach
  public void init() {
    searchElement = new SearchElement();
  }

  @Test
  @Tag("task1")
  @DisplayName("Search an element")
  public void searchElement() {
    int[][] matrix = new int[][]{
        {1, 5, 9},
        {14, 20, 21},
        {30, 34, 43}
    };
    Assertions.assertEquals(14, searchElement.search(matrix, 14));
  }
}