package org.example;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class ReverseNumber
{
    public static void main( String[] args )
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        if(n == 0)
            return;
        while(n > 0){

            if(n % 10 != 0)
                break;
            n/=10;
        }
        while(n > 0){
            int mod = n % 10;

            System.out.print(mod);
            n/=10;

        }
    }
}
