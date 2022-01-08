package org.example;

import org.example.sorting.SelectionSort;

public class SortZeroOneTwo {

    public static void main(String[] args) {
        int []arr = {2,1,1,2,1,0,0};
        sortZeroOneTwo(arr);
        SelectionSort.printArray(arr);

    }

    private static void sortZeroOneTwo(int[] arr) {
        int lo = 0, mid = 0;
        int hi= arr.length - 1;
        int i=0,temp;
        while(mid <= hi){
            switch(arr[i]) {
                case 0:
                    temp = arr[i];
                    arr[i] = arr[lo];
                    arr[lo] = temp;
                    lo++;mid++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    temp = arr[i];
                    arr[i] = arr[hi];
                    arr[hi] = temp;
                    hi--; i--;
                    break;
            }

            i++;
        }
    }
}
