package org.example;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*int s = sc.nextInt();
        int e = sc.nextInt();
        int w = sc.nextInt();
        int celcius = 0;
        fahrenheitToCelcius(s, e, w);*/
        System.out.println(isInFibo(13));
        int[] arr = new int[9];
        arrange(arr, 9);
        for (int i : arr
        ) {
            System.out.print(i + " ");
        }
        System.out.println();
        int arr1[] = {2,1,2,2};
        int arr2[] = {2,2,2,2};
//        swapAlternateElement(arr1);
//        sortZeroAndOnes(arr1);
//        System.out.println(pairSum(arr1,10));
//        System.out.println(findUnique(arr1));
        intersections(arr1,arr2);
//        for (int i : arr1) {
//            System.out.print(i + " ");
//        }
    }

    private static void fahrenheitToCelcius(int s, int e, int w) {
        int celcius;
        for (int i = s; i <= e; i += w) {
            celcius = (int) ((i - 32) / 1.8);
            System.out.println(i + " " + celcius);

        }
    }

    private static boolean isInFibo(int n) {
        int fiboTerm1 = 0;
        int fiboTerm2 = 0;
        int fiboTerm = 0;
        int i = 0;
        while (fiboTerm <= n) {
            if (i == 0) {
                fiboTerm1 = 0;
                fiboTerm = 0;
            } else if (i == 1) {
                fiboTerm2 = 0;
                fiboTerm1 = 1;
                fiboTerm = 1;
            } else {
                fiboTerm = fiboTerm1 + fiboTerm2;
                fiboTerm2 = fiboTerm1;
                fiboTerm1 = fiboTerm;
            }
            if (fiboTerm == n)
                return true;
            i++;

        }
        return false;

    }

    public static int sum(int[] arr) {
        //Your code goes here
        int sum = 0;
        for (int j : arr) {
            sum += j;

        }
        return sum;
    }

    public static void arrange(int[] arr, int n) {
        int num = 1;
        int condition = (int) Math.ceil((float) (n) / 2);
        for (int i = 0; i < n; i++) {

            if (i == condition) {
                if (n % 2 == 1) {
                    num -= 3;
                } else {
                    num--;
                }
            }
            arr[i] = num;
            if (i < condition) {
                num += 2;
            } else {
                num -= 2;
            }

        }


    }

    private static void swapAlternateElement(int[] arr) {
        int elem = 1;
        int i = 0;

        while (elem < arr.length) {
            int temp;
            temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
            i += 2;
            elem += 2;
        }
    }

    private static void sortZeroAndOnes(int[] arr) {
        int i = 0;
        int zeroCount = 0;
        while (i < arr.length) {
            if (arr[i] == 0)
                zeroCount++;
            i++;
        }
        for (int j = 0; j < arr.length; j++) {
            if (j < zeroCount)
                arr[j] = 0;
            else
                arr[j] = 1;
        }
    }

    //You have been given an integer array/list(ARR) and a number X.
    // Find and return the total number of pairs in the array/list which sum to X.
    //1 3 6 2 5 4 3 2 4
    //n=7 pair should be 7


    private static int pairSum(int arr[], int x) {
        int pairCount = 0;
        for (int i = 0; i < arr.length; i++) {

            for (int j = i+1; j < arr.length; j++) {
                 if (arr[i] + arr[j] == x) {
                    pairCount++;
                }
            }

        }
        return pairCount;
    }

    //You have been given an integer array/list(ARR) of size N. Where N is equal to [2M + 1].
    //Now, in the given array/list, 'M' numbers are present twice and one number is present only once.
    //You need to find and return that number which is unique in the array/list.
    //2 3 1 6 3 6 2
    private static int findUnique(int[] arr){
        //Your code goes here
        boolean isUnique=true;
        int digitCount;
        for(int i=0;i<arr.length;i++){
            isUnique = true;
            digitCount = 1;
            for(int j=0;j<arr.length;j++){
                if(i == j)
                    continue;
                if(arr[i] == arr[j]){
                    digitCount++;
                    break;
                }
            }
            if(digitCount == 1){
                return arr[i];
            }
        }
        return 0;
    }

    //0, 7, 2, 5, 4, 7, 1, 3, 6
    private static int findDuplicate(int[] arr){
       boolean isUnique=true;
        int digitCount;
        for(int i=0;i<arr.length;i++){
            isUnique = true;
            digitCount = 1;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i] == arr[j]){
                    digitCount++;
                    break;
                }
            }
            if(digitCount == 2){
                return arr[i];
            }
        }
        return -1;
    }

    private static void intersections(int arr1[], int arr2[]) {

        boolean posFound = false;

        for (int i =0;i < arr1.length;i++){

            for(int j=0;j<arr2.length;j++){
               if(arr1[i] == arr2[j]){
                    System.out.print(arr1[i] + " ");
                    arr2[j] = -99999;
                    break;
                }
            }
        }
    }

    private static boolean linearSearch(int[] arr3, int i) {
        boolean isFound = false;
        for (int j:arr3){
            if(i == j)
            {
                isFound = true;
                break;
            }
        }
        return isFound;
    }


}

