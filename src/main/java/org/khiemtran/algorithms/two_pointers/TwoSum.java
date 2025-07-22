package org.khiemtran.algorithms.two_pointers;

public class TwoSum {
  public String solution(int[] array, int target) {
    int left = 0;
    int right = array.length - 1;
    while (left < right) {
      int sum = array[left] + array[right];
      if (sum == target) {
        return "Yes";
      }
      if (sum < target) {
        left++;
      } else {
        right--;
      }
    }
    return "No";
  }
}
