package org.khiemtran.structures.dimensional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class PrintElementsTest {
  private PrintElements printElements;

  @BeforeEach
  public void init() {
    printElements = new PrintElements();
  }

  @Test
  @Tag("task1")
  @DisplayName("Display 2D dimensional")
  public void testPrint() {
    int[][] dimensional = new int[][]{
        {0, 1, 2},
        {3, 4, 5},
        {6, 7, 8}
    };
    printElements.print(dimensional);
  }
}