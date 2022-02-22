package org.example.recursion;
/*Given an integer array (of length n), find and return all the subsets of input array.
Subsets are of length varying from 0 to n, that contain elements of the array.
But the order of elements should remain same as in the input array.*/

public class SubsetOfArray {
    public static void main(String[] args) {
        int[] arr = {15,20,12};
        int[][] ans = subSetOfArray(arr);

    }

    private static int[][] subSetOfArray(int[] input){
        return subSetOfArray(input,0,input.length-1);
    }
    private static int[][] subSetOfArray(int[] input,int start,int end) {
        int [][]ans;
        if( start > end){
            ans = new int[1][0];
            return ans;
        }

        int smallAns[][] = subSetOfArray(input,start+1,input.length-1);
        ans = new int[smallAns.length*2][];
        int rowCount=0;

        for(int i=0;i< smallAns.length;i++){
            ans[i] = new int[smallAns[i].length];
            ans[i] = smallAns[i];
            rowCount++;
        }

        for(int i=0;i< smallAns.length;i++){
            ans[rowCount] = new int[smallAns[i].length+1];
            ans[rowCount][0] = input[start];
            for(int j=0;j<smallAns[i].length;j++){
                ans[rowCount][j+1]= smallAns[i][j];

            }
            rowCount++;

        }
       return ans;
    }
}
