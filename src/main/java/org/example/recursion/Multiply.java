package org.example.recursion;

public class Multiply {
    public static void main(String[] args) {
        System.out.println(multiplyTwoIntegers(3,5));
    }

    public static int multiplyTwoIntegers(int m, int n){
        // Write your code here
        if(n == 0)
            return 0;
        if(n == 1)
            return m;

        return m + multiplyTwoIntegers(m, n-1);
    }
}
