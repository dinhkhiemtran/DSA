package org.khiemtran.algorithms.arrays.basic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CheckArraySortedTest {
  private final CheckArraySorted checkArraySorted;

  public CheckArraySortedTest() {
    checkArraySorted = new CheckArraySorted();
  }

  @Test
  public void case1() {
    Assertions.assertFalse(checkArraySorted.solution(new int[]{}));
  }

  @Test
  public void case2() {
    Assertions.assertTrue(checkArraySorted.solution(new int[]{10, 20, 30, 40, 50}));
  }

  @Test
  public void case3() {
    Assertions.assertFalse(checkArraySorted.solution(new int[]{90, 80, 100, 70, 40, 30}));
  }
}