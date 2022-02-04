package org.example.recursion;

public class GeometricSum {
    public static void main(String[] args) {
        System.out.println(findGeometricSum(3));
    }
    public static double findGeometricSum(int k){
        // Write your code here
        if(k==0)
            return 1;
        int temp = (int) Math.pow(2,k);
        double d = 1.0/temp;
        return d+findGeometricSum(k-1);


    }
}
