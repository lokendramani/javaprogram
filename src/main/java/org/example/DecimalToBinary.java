package org.example;

import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        String str = "";
        if(n == 0){
            System.out.println(0);
            return;
        }
        while(n > 0){
            int mod =  n % 2;
            str=mod + str;
            n/=2;
        }

        System.out.println(str);

    }
}
