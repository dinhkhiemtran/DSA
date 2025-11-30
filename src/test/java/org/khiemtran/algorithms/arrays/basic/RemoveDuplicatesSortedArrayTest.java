package org.khiemtran.algorithms.arrays.basic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RemoveDuplicatesSortedArrayTest {
  private final RemoveDuplicatesSortedArray removeDuplicatesSortedArray;

  public RemoveDuplicatesSortedArrayTest() {
    removeDuplicatesSortedArray = new RemoveDuplicatesSortedArray();
  }

  @Test
  public void case1() {
    Assertions.assertArrayEquals(new int[]{}, removeDuplicatesSortedArray.solution(new int[]{}));
  }

  @Test
  public void case2() {
    Assertions.assertArrayEquals(new int[]{2}, removeDuplicatesSortedArray.solution(new int[]{2, 2, 2, 2, 2,}));
  }

  @Test
  public void case3() {
    Assertions.assertArrayEquals(new int[]{1, 2, 3, 4, 5}, removeDuplicatesSortedArray.solution(new int[]{1, 2, 2, 3, 4, 4, 4, 5, 5}));
  }

  @Test
  public void case4() {
    Assertions.assertArrayEquals(new int[]{1, 2, 3}, removeDuplicatesSortedArray.solution(new int[]{1, 2, 3}));
  }
}