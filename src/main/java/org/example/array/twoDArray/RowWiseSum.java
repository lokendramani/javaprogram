package org.example.array.twoDArray;

public class RowWiseSum {


    public static void main(String[] args) {
        int [][] arr = {{1,2},{3,4},{5,6},{7,8}};
        for (int i = 0; i < arr.length; i++) {
            int sum =0;
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
            System.out.print(sum + " ");
        }
    }

}
