package org.khiemtran.structures.arrays.reverse;

import org.junit.jupiter.api.*;

import java.util.Arrays;

class ReverseArrayTest {
  private ReverseArray reverseArray;
  @BeforeEach
  public void init() {
    reverseArray = new ReverseArray();
  }
  @Test
  @Tag("task1")
  @DisplayName("Array is empty")
  public void testArrayEmpty() {
    int[] array = new int[]{};
    Assertions.assertEquals(Arrays.toString(new int[]{}),
        Arrays.toString(reverseArray.reverseArray(array,0, array.length -1)));
  }
  @Test
  @Tag("task2")
  @DisplayName("Reverse Array")
  public void testReverseArray1() {
    int[] array = new int[]{1, 2, 3};
    Assertions.assertEquals(Arrays.toString(new int[]{3, 2, 1}), Arrays.toString(reverseArray.reverseArray(array,0, array.length -1)));
  }

  @Test
  @Tag("task3")
  @DisplayName("Reverse Array")
  public void testReverseArray2() {
    int[] array = new int[]{4, 5, 1, 2};
    Assertions.assertEquals(Arrays.toString(new int[]{2, 1, 5, 4}), Arrays.toString(reverseArray.reverseArray(array,0, array.length -1)));
  }
}