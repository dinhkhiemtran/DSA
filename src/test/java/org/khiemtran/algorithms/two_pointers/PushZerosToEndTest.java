package org.khiemtran.algorithms.two_pointers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PushZerosToEndTest {
  private final PushZerosToEnd pushZerosToEnd;

  public PushZerosToEndTest() {
    this.pushZerosToEnd = new PushZerosToEnd();
  }

  @Test
  public void case1() {
    int[] array = new int[]{1, 2, 0, 4, 3, 0, 5, 0};
    int[] solution = pushZerosToEnd.solution(array);
    Assertions.assertArrayEquals(new int[]{1, 2, 4, 3, 5, 0, 0, 0}, solution);
  }

  @Test
  public void case2() {
    int[] array = new int[]{10, 20, 30};
    int[] solution = pushZerosToEnd.solution(array);
    Assertions.assertArrayEquals(new int[]{10, 20, 30}, solution);
  }

  @Test
  public void case3() {
    int[] array = new int[]{0, 0};
    int[] solution = pushZerosToEnd.solution(array);
    Assertions.assertArrayEquals(new int[]{0, 0}, solution);
  }
}