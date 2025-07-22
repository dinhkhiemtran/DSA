package org.khiemtran.algorithms.two_pointers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RemoveElementTest {
  private final RemoveElement removeElement;

  public RemoveElementTest() {
    this.removeElement = new RemoveElement();
  }

  @Test
    public void case1() {
      Assertions.assertEquals(2, removeElement.solution(new int[]{3, 2, 2, 3}, 3));
  }

  @Test
  public void case2() {
    Assertions.assertEquals(5, removeElement.solution(new int[]{0, 1, 3, 0, 2, 2, 4, 2}, 2));
  }
}