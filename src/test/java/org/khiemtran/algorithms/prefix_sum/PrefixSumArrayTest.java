package org.khiemtran.algorithms.prefix_sum;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class PrefixSumArrayTest {
  private final PrefixSumArray prefixSumArray;

  public PrefixSumArrayTest() {
    this.prefixSumArray = new PrefixSumArray();
  }

  @Test
  public void case1() {
    int[] actual = prefixSumArray.solution(new int[]{1, 2, 3, 4, 5});
    Assertions.assertArrayEquals(new int[]{1, 3, 6, 10, 15}, actual);
  }
}