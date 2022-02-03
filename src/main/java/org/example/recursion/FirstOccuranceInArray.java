package org.example.recursion;

public class FirstOccuranceInArray {
    public static void main(String[] args) {
        int[] input = {5,2,5,4,5};
        System.out.println(firstOccurance(input,6));
    }

    private static int firstOccurance(int[] input, int x) {
        return firstOccurance(input,x,0,input.length-1);
    }

    private static int firstOccurance(int[] input, int n, int startIndex, int lastIndex) {
        if(input.length == 0||startIndex > lastIndex)
            return -1;
        if(input[startIndex]==n)
            return startIndex;
        return firstOccurance(input,n,startIndex+1,lastIndex);


    }
}
