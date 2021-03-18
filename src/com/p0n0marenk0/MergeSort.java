//3*.Реализовать MergeSort
//https://en.wikipedia.org/wiki/Merge_sort
package com.p0n0marenk0;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] myArray = Quicksort.createArrayWithRandomNumbers(10);
        System.out.println("Было");
        System.out.println(Arrays.toString(myArray));
        myArray = sortMerge(myArray);
        System.out.println("Стало");
        System.out.println(Arrays.toString(myArray));
    }

    private static int[] sortMerge(int[] array) {
        int length = array.length;
        if (length < 2) return array;
        int middle = length / 2;
        return merge(sortMerge(Arrays.copyOfRange(array, 0, middle)),
                sortMerge(Arrays.copyOfRange(array, middle, length)));
    }

    private static int[] merge(int[] array1, int[] array2) {
        int len_1 = array1.length, len_2 = array2.length;
        int a = 0, b = 0, len = len_1 + len_2;
        int[] result = new int[len];
        for (int i = 0; i < len; i++) {
            if (b < len_2 && a < len_1) {
                if (array1[a] > array2[b]) result[i] = array2[b++];
                else result[i] = array1[a++];
            } else if (b < len_2) {
                result[i] = array2[b++];
            } else {
                result[i] = array1[a++];
            }
        }
        return result;
    }
}
