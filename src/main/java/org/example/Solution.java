package org.example;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int s = sc.nextInt();
        int e = sc.nextInt();
        int w = sc.nextInt();
        int celcius = 0;
        fahrenheitToCelcius(s, e, w);
    }

    private static void fahrenheitToCelcius(int s, int e, int w) {
        int celcius;
        for (int i = s; i <= e; i+= w) {
            celcius = (int) ((i - 32)/1.8);
            System.out.println(i + " "+ celcius);

        }
    }
}
