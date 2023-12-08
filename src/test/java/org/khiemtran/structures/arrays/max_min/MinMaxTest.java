package org.khiemtran.structures.arrays.max_min;

import org.junit.jupiter.api.*;

import java.util.Arrays;

class MinMaxTest {
  private MinMax minMax;

  @BeforeEach
  public void init() {
    minMax = new MinMax();
  }

  @Test
  @Tag("task1")
  @DisplayName("Check empty for an array")
  public void isArrayEmpty() {
    int[] array = new int[]{};
    Assertions.assertEquals(null, minMax.getMinMax(array));
  }

  @Test
  @Tag("task2")
  @DisplayName("Get array min and max")
  public void testGetMinMax() {
    int[] array = new int[]{3,4,5,9,1,4,6,2,8};
    System.out.println(Arrays.toString(minMax.getMinMax(array)));
    Assertions.assertEquals(Arrays.toString(new int[]{1,9}), Arrays.toString(minMax.getMinMax(array)));
  }
  @Test
  @Tag("task3")
  @DisplayName("Get array min and max test [3, 5, 4, 1, 9]")
  public void testGetMinMax1() {
    int[] array = new int[]{3, 5, 4, 1, 9};
    System.out.println(Arrays.toString(minMax.getMinMax(array)));
    Assertions.assertEquals(Arrays.toString(new int[]{1,9}), Arrays.toString(minMax.getMinMax(array)));
  }
  @Test
  @Tag("task2")
  @DisplayName("Get array min and max test [22, 14, 8, 17, 35, 3]")
  public void testGetMinMax2() {
    int[] array = new int[]{22, 14, 8, 17, 35, 3};
    System.out.println(Arrays.toString(minMax.getMinMax(array)));
    Assertions.assertEquals(Arrays.toString(new int[]{3,35}), Arrays.toString(minMax.getMinMax(array)));
  }
}