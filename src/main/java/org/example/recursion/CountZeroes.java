package org.example.recursion;

public class CountZeroes {
    public static void main(String[] args) {
        System.out.println(countZerosRec(510030));
    }
    public static int countZerosRec(int input){
        // Write your code here
        if(input == 0)
            return 1;
        if(input <=9 ){
            return 0;
        }
        int rem = input % 10;
        int div = input / 10;
        if(rem == 0){
            return 1 + countZerosRec(div);
        }else
        {
            return countZerosRec(div);
        }

    }
}
