package org.example.sorting;

public class BubbleSort {

    public static void main(String[] args) {
        int []arr = {7,2,9,1,6,5,4};
        sort(arr);
        SelectionSort.printArray(arr);
    }
    //{7,2,9,1,6,5,4}
    private static void sort(int[] arr) {
        int temp;
        for (int i = 0; i < arr.length; i++) {
            for(int j =0;j < arr.length -1;j++)
            {
                if(arr[j] > arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
         }

    }
}
