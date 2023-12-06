package org.khiemtran.structures.arrays.reverse;

public class ReverseArray {
  public int[] reverseArray(int[] arr, int start, int end) {
    if (arr.length == 0) {
      return new int[]{};
    }
    for (; start < end; start++, end--) {
      swap(arr, start, end);
    }
    return arr;
  }

  private void swap(int[] arr, int start, int end) {
    int temp = arr[start];
    arr[start] = arr[end];
    arr[end] = temp;
  }
}
