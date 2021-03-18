//4*.Реализовать HeapSort
//https://en.wikipedia.org/wiki/Heapsort
package com.p0n0marenk0;

import java.util.Arrays;

public class HeapSort {

    public static void main(String[] args) {
        int[] myArray = Quicksort.createArrayWithRandomNumbers(10);
        System.out.println("Было : ");
        System.out.println(Arrays.toString(myArray));
        heapSort(myArray);
        System.out.println("Стало : ");
        System.out.println(Arrays.toString(myArray));
    }

    public static void buildheap(int[] arr) {
        for (int i = (arr.length - 1) / 2; i >= 0; i--) {
            heapify(arr, i, arr.length - 1);
        }
    }

    public static void heapify(int[] arr, int i, int size) {
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        int max;
        if (left <= size && arr[left] > arr[i]) {
            max = left;
        } else {
            max = i;
        }
        if (right <= size && arr[right] > arr[max]) {
            max = right;
        }
        if (max != i) {
            Quicksort.swapArrayElements(arr, i, max);
            heapify(arr, max, size);
        }
    }

    public static void heapSort(int[] builtArray) {
        buildheap(builtArray);
        int sizeOfHeap = builtArray.length - 1;
        for (int i = sizeOfHeap; i > 0; i--) {
            Quicksort.swapArrayElements(builtArray, 0, i);
            sizeOfHeap = sizeOfHeap - 1;
            heapify(builtArray, 0, sizeOfHeap);
        }
    }
}
