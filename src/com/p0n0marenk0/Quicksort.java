//2*.Реализовать QuickSort
//https://en.wikipedia.org/wiki/Quicksort
package com.p0n0marenk0;

import java.util.Arrays;
import java.util.Random;

public class Quicksort {

    public static void main(String[] args) {
        int[] myArray = createArrayWithRandomNumbers(10);
        System.out.println("Было");
        System.out.println(Arrays.toString(myArray));
        int low = 0;
        int high = myArray.length - 1;
        quickSort(myArray, low, high);
        System.out.println("Стало");
        System.out.println(Arrays.toString(myArray));
    }

    public static void quickSort(int[] array, int low, int high) {
        if (array.length == 0)
            return;
        if (low >= high)
            return;
        int middle = low + (high - low) / 2;
        int referenceNumber = array[middle];
        int i = low, j = high;
        while (i <= j) {
            while (array[i] < referenceNumber) {
                i++;
            }
            while (array[j] > referenceNumber) {
                j--;
            }
            if (i <= j) {
                swapArrayElements(array, i, j);
                i++;
                j--;
            }
        }
        if (low < j)
            quickSort(array, low, j);
        if (high > i)
            quickSort(array, i, high);
    }

    public static int[] createArrayWithRandomNumbers(int length) {
        Random random = new Random();
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = random.nextInt(100);
        }
        return array;
    }

    public static void swapArrayElements(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
