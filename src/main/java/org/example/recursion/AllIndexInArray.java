package org.example.recursion;

public class AllIndexInArray {
    public static void main(String[] args) {
        int[] input = {5,2,5,5,6,5};
        int[] output = allIndex(input,7);
        if(output !=null)
        for(int i:output)
            System.out.print(i+" ");
    }

    private static int[] allIndex(int[] input, int i) {

        return allIndex(input,i,0,input.length-1);
    }

    private static int[] allIndex(int[] input, int i, int startIndex, int lastIndex) {
        if(input.length == 0 || startIndex > lastIndex)
            return null;
        int[] lefOutput = allIndex(input,i,startIndex+1,lastIndex);
        int[] output = null;
        if(lefOutput == null){
            if(input[startIndex] == i){
                output = new int[1];
                output[0]=startIndex;
            }
        }else{
            if(input[startIndex] == i){
                output = new int[lefOutput.length+1];
                output[0]=startIndex;
                int j=1;
                for(int index:lefOutput){
                    output[j] = index;
                    j++;
                }
            }else{
                output = new int[lefOutput.length];
                return output = lefOutput;
            }

        }

        return output;
    }
}
