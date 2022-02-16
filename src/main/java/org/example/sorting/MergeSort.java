package org.example.sorting;

public class MergeSort {

    public static void main(String[] args) {
        int[] arr = {0,2,9,7,8,1};
        mergeSort(arr);
//        merge(arr,0,5);
        for(int i:arr){
            System.out.print(i+" ");
        }
    }

    private static void mergeSort(int[] arr){
        mergeSort(arr,0,arr.length-1);

    }


    private static void mergeSort(int[] arr, int start, int end) {
        if(start >= end)
            return;
        int mid = (start+end)/2;
        mergeSort(arr,start,mid);
        mergeSort(arr,mid+1,end);
        merge(arr,start,end);
        }

    private static void merge(int[] arr, int start, int end) {
        int ptr1 = ((start+end)/2);
        int ptr2 = ((start+end)/2)+1;
        int temp;

        while(ptr2<= end){
            ptr1 = ptr2 -1;
            if(arr[ptr2]< arr[ptr1])
            {
                temp = arr[ptr2];
                while( ptr1 >= start && temp < arr[ptr1]){
                arr[ptr1+1] = arr[ptr1];
                ptr1--;
                }
                arr[ptr1+1] = temp;
            }
            ptr2++;
        }

    }

}
