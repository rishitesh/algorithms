package com.algorithms.sorters;

public class QuickSort {

  private static int[] array = new int[] { 111, 18, 21, 9, 4, 12, 7 };

  public static void main(String s[]) {

    QuickSort sorter = new QuickSort();
    sorter.qucikSort(array, 0, array.length - 1);
    sorter.test(array);
  }

  /**
   * Test to verify sorting worked properly or not.
   * 
   * @param input
   */
  void test(int[] input) {
    for (int i = 0; i < input.length; i++) {
      System.out.print(input[i] + ",");
    }
  }

  int partition(int[] array, int low, int high) {

    int p = high;
    int firstHigh = low;

    for (int i = low; i < high; i++) {
      if (array[i] < array[p]) {
        swap(array, i, firstHigh);
        firstHigh++;
      }
    }
    swap(array, p, firstHigh);
    return firstHigh;
  }

  void qucikSort(int[] array, int low, int high) {
    int p;
    if (low < high) {
      p = partition(array, low, high);
      qucikSort(array, low, p - 1);
      qucikSort(array, p + 1, high);
    }
  }

  void swap(int[] s, int i, int j) {
    int temp = s[i];
    s[i] = s[j];
    s[j] = temp;
  }
}
