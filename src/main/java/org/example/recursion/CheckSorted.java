package org.example.recursion;

public class CheckSorted {

    public static boolean checkSorted(int[] arr){
        if(arr.length <= 1 )
            return true;
        int [] smallarr = new int[arr.length -1];
        for(int i=1;i< arr.length;i++){
            smallarr[i-1] = arr[i];
        }
        if(checkSorted(smallarr)){
            if(arr[0] <= arr[1]){
                return true;
            }else{
                return false;
            }
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        System.out.println(checkSorted(arr));
    }
}
