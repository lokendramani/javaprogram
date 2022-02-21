package org.example.recursion;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr={2,3,4,5,6,8};
        int index = binarySearch(arr,5);
        System.out.println(index);
    }

    private static int binarySearch(int[] input, int element) {
       return binarySearch(input,element,0,input.length-1);
    }

    private static int binarySearch(int[] input, int element,int start, int end){
        if(input.length<1)
            return -1;
        if(start >= end)
        {
            if (input[start] == element)
                return start;
            else
                return -1;
        }
        int mid = (start+end) / 2;
        if(input[mid] == element)
            return mid;
        if(element <= input[mid])
            return binarySearch(input,element,start, mid-1);
        else
            return  binarySearch(input,element,mid+1,end);
    }
}
