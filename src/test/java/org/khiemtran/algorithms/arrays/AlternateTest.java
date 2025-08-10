package org.khiemtran.algorithms.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlternateTest {
  private final Alternate alternate;

  public AlternateTest() {
    this.alternate = new Alternate();
  }

  @Test
  public void case1() {
    String expect = "10 30 50";
    String actual = alternate.getAlternateElements(new int[]{10, 20, 30, 40, 50});
    Assertions.assertEquals(expect, actual);
  }

  @Test
  public void case2() {
    String expect = "-5 4 12";
    String actual = alternate.getAlternateElements(new int[]{-5, 1, 4, 2, 12});
    Assertions.assertEquals(expect, actual);
  }
}