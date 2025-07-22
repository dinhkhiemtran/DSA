package org.khiemtran.algorithms.two_pointers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class RemoveDuplicatesTest {
  private final RemoveDuplicates removeDuplicates;

  public RemoveDuplicatesTest() {
    this.removeDuplicates = new RemoveDuplicates();
  }

  @Test
  public void case1() {
    Assertions.assertArrayEquals(new int[]{2}, removeDuplicates.solution(new int[]{2, 2, 2, 2, 2}));
  }

  @Test
  public void case2() {
    int[] arr = {1, 2, 2, 3, 4, 4, 4, 5, 5};
    int[] result = removeDuplicates.solution(arr);
    Assertions.assertArrayEquals(new int[]{1, 2, 3, 4, 5}, result);
  }

  @Test
  public void case3() {
    Assertions.assertArrayEquals(new int[]{1, 2, 3}, removeDuplicates.solution(new int[]{1, 2, 3}));
  }

  @Test
  public void case4() {
    Assertions.assertArrayEquals(new int[]{}, removeDuplicates.solution(new int[]{}));
  }
}