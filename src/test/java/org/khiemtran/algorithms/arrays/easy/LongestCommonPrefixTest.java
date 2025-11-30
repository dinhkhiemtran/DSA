package org.khiemtran.algorithms.arrays.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LongestCommonPrefixTest {
  @Test
  public void case1() {
    LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();
    String actual = longestCommonPrefix.longestCommonPrefix(new String[]{"flower", "flow", "flight"});
    Assertions.assertEquals("fl", actual);
  }

  @Test
  public void case2() {
    LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();
    String actual = longestCommonPrefix.longestCommonPrefix(new String[]{"dog", "racecar", "car"});
    Assertions.assertEquals("", actual);
  }
}