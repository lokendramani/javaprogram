package org.example.sorting;

public class SelectionSort {

    public static void main(String[] args) {
        int []arr = {7,2,9,1,6,5,4};
        sort(arr);
        printArray(arr);

    }

    public static void printArray(int []arr) {
        for (int i: arr)
        {
            System.out.print(i+ " ");
        }
    }

    //{7,2,9,1,6,5,4}
    private static void sort(int[] arr) {
        int min;
        int pos = -1;
        int temp;
        for (int i = 0; i < arr.length - 1; i++) {
            min = arr[i];
            pos = i;
            for(int j = i+1; j < arr.length; j++){
                if(min > arr[j]){
                    min = arr[j];
                    pos = j;
                }
            }
            if(pos != i){
                temp = arr[pos];
                arr[pos] = arr[i];
                arr[i] = temp;
            }

        }

    }
}
