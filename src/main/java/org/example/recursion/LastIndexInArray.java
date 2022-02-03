package org.example.recursion;

public class LastIndexInArray {
    public static void main(String[] args) {
        int[] input = {5,2,5,5,6,5};
        System.out.println(lastIndex(input,6));
    }

    private static int lastIndex(int[] input, int i) {
        return lastIndex(input,i,0,input.length-1);
    }

    private static int lastIndex(int[] input, int i, int startIndex, int lastIndex) {
        if(input.length == 0 || startIndex > lastIndex)
            return -1;

        int index = lastIndex(input,i,startIndex+1,lastIndex);
        if(index == -1)
        {
            if(input[startIndex] == i)
                return startIndex;
            else
                return -1;
        } else{
            return index;
        }


    }
}
