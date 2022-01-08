package org.example;

import org.example.sorting.SelectionSort;

public class AddTwoNumbers {

    public static void main(String[] args) {
        int arr[]={9,7,6,1};
        int arr1[] = {4,5,9};
        int sum[] = new int[arr.length > arr1.length? arr.length+1: arr1.length+1];
        int d = 0;
        int c = 0;
        int i = arr.length - 1, j= arr1.length - 1, k= sum.length - 1;
        while(k >= 0){
            d = c;
            if(i >= 0){
                d+=arr[i];
            }
            if(j >= 0){
                d+= arr1[j];
            }
            sum[k] = d % 10;
            c = d / 10;
            i--;j--;k--;

        }

        SelectionSort.printArray(sum);
    }
}
