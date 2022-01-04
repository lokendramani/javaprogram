package org.example;

import org.example.sorting.SelectionSort;

public class MergeSortedArrays {
    public static void main(String[] args) {
        int[] arr1 = {2, 6, 9, 15};
        int[] arr2 = {1, 2, 3, 4, 5, 7};
        int[] arr3 = mergArrays(arr1, arr2);
        SelectionSort.printArray(arr3);
    }

    private static int[] mergArrays(int[] arr1, int[] arr2) {
        int[] arr = new int[arr1.length + arr2.length];
        int j = 0, k = 0;
        int i = 0;
        while (k < arr2.length && j < arr1.length) {
            if (arr1[j] > arr2[k]) {
                arr[i] = arr2[k];
                k++;
            } else {
                arr[i] = arr1[j];
                j++;
            }
            i++;
        }
        if (j == arr1.length) {
            while (k < arr2.length) {
                arr[i] = arr2[k];
                k++;i++;
            }
        } else {
            while (j < arr1.length) {
                arr[i] = arr1[j];
                j++; i++;
            }

        }

        return arr;
    }
}