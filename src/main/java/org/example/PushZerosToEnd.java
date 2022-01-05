package org.example;

import org.example.sorting.SelectionSort;

public class PushZerosToEnd {
    public static void main(String[] args) {
        int [] arr={1, 0, 0, 1, 3, 0, 0};
        pushZerosToEnd(arr);
        SelectionSort.printArray(arr);
    }

    private static void pushZerosToEnd(int[] arr) {
    int nonZero=0;
        for (int i = 0; i < arr.length ; i++) {
            if(arr[i] != 0){
                arr[nonZero++] = arr[i];
            }
        }
        while(nonZero < arr.length){
            arr[nonZero++] = 0;
        }

    }
}
