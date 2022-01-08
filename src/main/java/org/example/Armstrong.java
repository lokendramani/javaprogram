package org.example;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        int n = s.nextInt();
        int num = n;
        int digit=0;
        int mod = 0;
        int sum=0;
        while(num > 0){
            digit++;
            num/=10;
        }
        num = n;
        while(num > 0){
            mod = num % 10;
            sum += Math.pow(mod,digit);
            num/=10;
        }

        if (sum == n ) {
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
}
