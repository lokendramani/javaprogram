package org.example.recursion;

public class PrintSubsetOfArray {
    public static void main(String[] args) {
        int[] arr = {19,3,9};
        printSubSetOfArray(arr);

    }

    private static void printSubSetOfArray(int[] input){
        int [][]ans=new int[1][0];
        printSubSetOfArray(input,0,input.length-1, ans);
    }

    private static void printSubSetOfArray(int[] input, int start, int end, int[][] ans) {
        if(start > end){
            print2DArray(ans);
            return;
        }
        ans = addElementToAns(ans,input[end]);
        printSubSetOfArray(input,start,end-1,ans);
    }

    private static int[][] addElementToAns(int[][] ans, int element) {
        int[][] newAns = new int[ans.length*2][];
        int rowCount=0;

        for(int i=0;i< ans.length;i++){
            newAns[i] = new int[ans[i].length];
            newAns[i] = ans[i];
            rowCount++;
        }

        for(int i=0;i<ans.length;i++){
            newAns[rowCount] = new int[ans[i].length+1];
            newAns[rowCount][0] = element;
            for(int j=0;j<ans[i].length;j++){
                newAns[rowCount][j+1] = ans[i][j];
            }
            rowCount++;
        }
        return newAns;
    }

    private static void print2DArray(int[][] ans) {
        for(int i =0;i<ans.length;i++){
            for(int j=0;j<ans[i].length;j++){
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }
    }
}
