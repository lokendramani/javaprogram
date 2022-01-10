package org.example.array.twoDArray;

public class SumOfBoundry {
    public static void main(String[] args) {
        int [][]arr = {{1,2,3,4},
                       {5,6,7,8},
                       {9,10,11,12},
                       {13,14,15,16}};
        int sum = 0;
        int ldc = 0;
        int rdc = arr[0].length - 1;
        int lde=0;
        int rde=0;

        for (int i = 0; i < arr.length; i++) {
            lde = 0;rde = 0;
            for (int j = 0; j < arr[0].length; j++) {
                if( i == 0 || i == arr.length-1 || j == 0 || j == arr[0].length - 1){
                    sum += arr[i][j];
                }

            }
            if(ldc != rdc){
                lde = arr[i][ldc];
                rde = arr[i][rdc];
            }else{
                lde = arr[i][ldc];
            }
                ldc++;rdc--;
            if(!(i == 0 || i == arr.length - 1)){
                sum += lde + rde;
            }
        }
        System.out.println("Sum="+sum);

    }
}
