package org.example.array;

//Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
//You may assume that each input would have exactly one solution, and you may not use the same element twice.
//You can return the answer in any order.
//Example 1:
//Input: nums = [2,7,11,15], target = 9
//Output: [0,1]
//Explanation: Because nums[0] + nums[1] == 9, we return [0, 1]

public class TwoSum {

    public static void main(String[] args) {
        int[] arr = {11,2,7,15};
        int[] twoSum = twoSum(arr,9);
        System.out.println(twoSum[0]+" "+twoSum[1]);
    }

    private static int[] twoSum(int[] arr, int target) {
        int[] twoSum = new int[2];

        boolean found  = false;
        for(int i = 0;i <= arr.length;i++){
            twoSum[0]=i;
            for(int j= i+1;j<arr.length;j++){
                if(arr[j] == target - arr[i]){
                    twoSum[1] = j;
                    found = true;
                    break;
                }
            }
            if(found == true)
                break;
        }
        return twoSum;
    }
}
