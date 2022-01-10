package org.example.array.twoDArray;


//Given a 2D integer array with n rows and m columns.
// Print the 0th row from input n times, 1st row n-1 times…..(n-1)th row will be printed 1 time.
public class Print2DArray {
    public static void main(String[] args) {
        int [][] input={{1,2,3},{4,5,6},{7,8,9}};
        int n = input.length, k;
        for (int i = 0; i < input.length; i++) {
            k = 0;
            while(k < n){
                for (int j = 0; j < input[0].length; j++) {
                    System.out.print(input[i][j]+" ");
                }
                System.out.println();
                k++;
            }
            n--;
        }
    }
}
