package org.example;

import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int pos = 0;
        int sum = 0;

        while ( n > 0){
            if(n%10 == 1){
                sum+=Math.pow(2,pos);
            }
            pos++;
            n/=10;
        }
        System.out.println(sum);


    }
}
