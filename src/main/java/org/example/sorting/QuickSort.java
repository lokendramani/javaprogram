package org.example.sorting;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {11,1,17,13,2,9};

        quickSort(arr);
//        partition(arr,2,5);
        for (int i:arr){
            System.out.print(i+" ");
        }
    }

    private static void quickSort(int[] arr) {
        quickSort(arr,0,arr.length-1);
    }

    private static void quickSort(int[] arr, int start, int end) {
        if(start >= end){
            return;
        }
        int pivotPos = partition(arr,start,end);
        quickSort(arr,start,pivotPos-1);
        quickSort(arr,pivotPos+1,end);
    }

    //{13,1,17,9,2,11};
    private static int partition(int[] arr, int start, int end) {
        int pivotPos = start;
        int pivotElem = arr[start];
        int count = 0;
        int ptr = start+1;
        if(start == end){
            return start;
        }
        //Count how many elements are lesser than pivot
        while(ptr <= end){
            if(pivotElem >= arr[ptr]){
                count++;
            }
            ptr++;
        }
        //position pivot element
        pivotPos = start+count;
        int temp = arr[start];
        arr[start] = arr[pivotPos];
        arr[pivotPos] = temp;
        //{2,1,17,9,13,11};
       //{2,1,11,9,13,17}
        //on left all elements should be lesser than pivot and on the right elements should be greater than pivotElem.
        int i=start;
        int j= end;
        while(i < pivotPos && j > pivotPos){
            while(arr[i]<= arr[pivotPos]){
                i++;
            }
            while(arr[j]>arr[pivotPos]){
                j--;
            }
            //swap two elements.
            if(i < pivotPos && j > pivotPos) {
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        return pivotPos;
    }
}
