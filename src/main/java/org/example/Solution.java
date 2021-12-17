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
        return  false;

    }

    public static int sum(int[] arr) {
        //Your code goes here
        int sum =0;
        for (int j : arr) {
            sum += j;

        }
        return sum;
    }

}

