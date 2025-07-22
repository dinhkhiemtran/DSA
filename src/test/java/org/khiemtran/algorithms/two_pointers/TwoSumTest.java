package org.khiemtran.algorithms.two_pointers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TwoSumTest {
  private final TwoSum twoSum;

  public TwoSumTest() {
    this.twoSum = new TwoSum();
  }

  @Test
  public void case1() {
    Assertions.assertEquals("Yes", twoSum.solution(new int[]{10, 20, 35, 50}, 70));
  }

  @Test
  public void case2() {
    Assertions.assertEquals("No", twoSum.solution(new int[]{10, 20, 30}, 70));
  }

  @Test
  public void case3() {
    Assertions.assertEquals("Yes", twoSum.solution(new int[]{-8, 1, 4, 6, 10, 45}, 16));
  }
}