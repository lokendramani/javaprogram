package org.example.recursion;

public class SumOfArray {

    public static void main(String[] args) {
        int[] input = {};
        System.out.println(sumOfArray(input));

    }

    private static int sumOfArray(int[] input) {

      return sumOfArray(input,0, input.length-1);
    }

    private static int sumOfArray(int[] input,int startIndex, int endIndex) {

        if(input.length == 0){
            return 0;
        }
        if(input.length == 1 || (startIndex==endIndex && startIndex == 0))
            return input[0];
        return input[endIndex]+sumOfArray(input, startIndex,endIndex-1);
    }
}
