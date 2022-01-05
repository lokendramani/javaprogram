package org.example;

public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {0,0,0};
        int secondLargest = findSecondLargest(arr);
        System.out.println(secondLargest);
    }

    private static int findSecondLargest(int[] arr) {
        int secondLargest = -2147483648;
        int largest = -2147483648;
        if(arr.length == 1)
            return secondLargest;
        for (int i = 0; i < arr.length ; i++) {
            if(arr[i] > largest){
                secondLargest = largest;
                largest = arr[i];
            }else if(arr[i] != largest && arr[i] > secondLargest){
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }

}
