package org.example.search;

public class BinarySearch {

    public static void main(String[] args) {
        int []arr = {10,12,15,21,30,32,35,40,42};
        System.out.println(search(arr,10));
    }
    private  static int search(int []arr, int num) {
        int start = 0;
        int end = arr.length - 1;
        int mid;

        while (start <= end) {
            mid = (start + end) / 2;
            if(num == arr[mid])
                return mid;
            else if (num < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }

            }
            return -1;
        }
    }


