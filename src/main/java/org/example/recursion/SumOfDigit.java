package org.example.recursion;

public class SumOfDigit {
    public static void main(String[] args) {
        System.out.println(sumOfDigits(12345));
    }

    public static int sumOfDigits(int input){

        if(input == 0)
            return 0;
        int rem = input% 10;
        return rem + sumOfDigits(input/10);

    }
}
