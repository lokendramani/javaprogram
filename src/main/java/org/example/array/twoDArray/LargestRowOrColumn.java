package org.example.array.twoDArray;

public class LargestRowOrColumn {
    public static void main(String[] args) {
        //int [][] arr={{3,6,9},{1,4,7},{2,8,9}};
//        int [][] arr={{0,0}};
        int[][] arr = {{3,2},{6,9},{8,5},{9,2}};
        int row[] = new int[arr.length];
        int cols[] = new int[arr[0].length];

        int rowmax = Integer.MIN_VALUE;
        int rowIndex = -1;
        int colmax = Integer.MIN_VALUE;
        int colIndex = -1;
        for(int i=0;i< arr.length;i++){
            int rowSum = 0;
            for (int j = 0; j < arr[i].length; j++) {
                rowSum += arr[i][j];
                cols[j] += arr[i][j];
            }
            row[i] = rowSum;
            if(rowSum > rowmax) {
                rowmax = rowSum;
                rowIndex = i;
            }
        }
        for (int i = 0; i < cols.length; i++) {
            if(rowmax < cols[i]){
                colmax = cols[i];
                rowmax = colmax;
                colIndex = i;
            }
        }

        if(colIndex == -1){
            System.out.println("row "+rowIndex+" "+rowmax);
        }else{
            System.out.println("column "+colIndex+ " "+colmax);
        }
    }
}
