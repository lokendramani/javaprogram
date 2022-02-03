package org.example.recursion;

public class FindNumberInArray {

    public static void main(String[] args) {
        int[] input = {};
        System.out.println(checkNumber(input,5));
    }

    private static boolean checkNumber(int[] input,int n) {
        return checkNumber(input,n,0,input.length-1);
    }

    private static boolean checkNumber(int[] input, int n, int startIndex, int lastIndex) {
        if(input.length == 0||startIndex > lastIndex)
            return false;
        if(input[startIndex]==n)
            return true;
        return checkNumber(input,n,startIndex+1,lastIndex);


    }
}
