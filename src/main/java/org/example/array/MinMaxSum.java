package org.example.array;

//Given five positive integers, find the minimum and maximum values that can be calculated by summing exactly four of the five
// integers. Then print the respective minimum and maximum values as a single line of two space-separated long integers.
//example arr=[1,2,3,4,5]
//minimum sum is 1+2+3+4 = 10
//max sum is 5+4+3+2 = 14


import java.util.ArrayList;
import java.util.List;

public class MinMaxSum {

    public static void main(String[] args) {
    List<Integer> arr = new ArrayList<>(5);
    arr.add(2);
    arr.add(3);
    arr.add(1);
    arr.add(3);

    miniMaxSum(arr);

    }

    public static void miniMaxSum(List<Integer> arr) {
        // Write your code here
        long minimum = arr.get(0);
        long maximum = arr.get(0);
        long sum = 0;
        long minisum=0;
        long maxSum=0;
        for (Integer num:arr){
            if(minimum >= num ){
                minimum = num;
            }
            if(maximum <= num){
                maximum = num;
            }
            sum += num;
        }
        maxSum = sum -minimum;
        minisum = sum - maximum;

        System.out.println( minisum+" "+maxSum);

    }
}
