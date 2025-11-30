package org.khiemtran.algorithms.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.khiemtran.algorithms.arrays.basic.Leaders;

class LeadersTest {
  private final Leaders leaders;

  public LeadersTest() {
    leaders = new Leaders();
  }

  @Test
  public void case1() {
    Assertions.assertArrayEquals(new int[]{17, 5, 2}, leaders.solution(new int[]{16, 17, 4, 3, 5, 2}));
  }

  @Test
  public void case2() {
    Assertions.assertArrayEquals(new int[0], leaders.solution(new int[]{}));
  }

  @Test
  public void case3() {
    Assertions.assertArrayEquals(new int[]{5, 2}, leaders.solution(new int[]{1, 2, 3, 4, 5, 2}));
  }
}