package org.example;

import java.util.Scanner;

public class ZeroStarPattern {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for (int i = 1; i <= n; i++) {
            for(int j=1;j<=i;j++){
                if(i==j){
                    System.out.print("*");
                }else{
                    System.out.print("0");

                }
            }
            for(int j=n - i;j >= 1;j--){
                    System.out.print("0");

                }
            System.out.print("*");

            for(int j=1;j <= n;j++){
                if(j == n-(i-1)){
                    System.out.print("*");
                }else{
                    System.out.print("0");

                }
            }

            System.out.println();
                        }


        }



}
