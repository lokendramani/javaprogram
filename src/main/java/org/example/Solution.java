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
        int arr1[] = {2,8,10,5,-2,5};
//        swapAlternateElement(arr1);
//        sortZeroAndOnes(arr1);
        System.out.println(pairSum(arr1,10));
        for (int i : arr1) {
            System.out.print(i + " ");
        }
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


}

