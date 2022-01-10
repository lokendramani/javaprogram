package org.example.array;

import org.example.sorting.SelectionSort;

public class RotateArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int n = 6;
        rotateAnArray(arr,n);
        SelectionSort.printArray(arr);
    }

   private static void rotateAnArray(int[] arr, int n) {
        int []temp = new int[n];
        for(int i = 0;i< n;i++){
            temp[i] = arr[i];
        }
       shiftArray(arr,n);
        for(int i = arr.length - n, j=0; i < arr.length;i++){
            arr[i] = temp[j++];
        }

    }

    private static void shiftArray(int[] arr, int n) {
        for (int j = n; j < arr.length ; j++) {
            arr[j-n] = arr[j];
        }
    }
}
