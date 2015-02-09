package com.algorithms.sorters;

public class MergeSort {

  private int[] result = new int[10];

  public static void main(String s[]) {
    MergeSort sorter = new MergeSort();
    int[] input = new int[] { 1, 10, 11, 12, 5, 4, 3, 6, 7, 9 };

    sorter.mergesort(input, 0, input.length - 1);
    sorter.test(input);
  }

  void test(int[] input) {
    for (int i =0 ; i< input.length -1 ;i++) {
      if(input[i] > input[i+1]){
        System.out.print("FAILED");
      }
    }
    System.out.print("PASSED");
  }

  void mergesort(int[] input, int low, int high) {

    if (low < high) {
      int middle = low + (high - low) / 2;
      mergesort(input, low, middle);
      mergesort(input, middle + 1, high);
      merge(input, low, middle, high);
    }
  }

  void merge(int[] input, int low, int middle, int high) {

    for (int i = low; i <= high; i++) {
      result[i] = input[i];
    }
    int j = middle + 1;
    int i = low;
    int k = low;
    while (i <= middle && j <= high) {
      if (result[i] < result[j]) {
        input[k] = result[i];
        i++;
      } else {
        input[k] = result[j];
        j++;
      }
      k++;
    }

    while (i <= middle) {
      input[k] = result[i];
      k++;
      i++;
    }

    // copy the rest

  }

}
