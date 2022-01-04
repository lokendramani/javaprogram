package org.example.sorting;

public class InsertionSort {

    public static void main(String[] args) {
    int[] arr = {9,8,5,6,2,1};
    sort(arr);
    SelectionSort.printArray(arr);
    }

    private static void sort(int []arr){
        int temp;
        int j=0;
        for (int i = 1; i < arr.length ; i++) {
            j = i -1;
            temp=arr[i];
            while(j >= 0 && temp < arr[j]){
                arr[j+1] = arr[j];
                j--;
            }
            arr[++j] = temp;
        }

    }
}
