package org.example.recursion;

import java.util.Arrays;

public class Keypad {
    public static void main(String[] args) {
        String[] arr;

        arr = keypad(23);
        Arrays.asList(arr).forEach(System.out::println);
    }
    public static String[] keypad(int n) {
        if (n == 0 || n == 1) {
            return new String[]{""};
        }
        // Write your code here
        int mod = n % 10;
        int smallInt = n / 10;

        String[] ans;
        String[] smallAns = keypad(smallInt);
        String[] combination;
        combination = helper(mod);
        ans = new String[smallAns.length * combination.length];
        int i = 0;
        for (String str : smallAns) {
            for (String str1 : combination) {
                ans[i] = str + str1;
                i++;
            }
        }
        return  ans;
    }



    private static String[] helper(int n) {
        switch (n){
            case 2:
                return new String[]{"a","b","c"};
            case 3:
                return new String[]{"d","e","f"};
            case 4:
                return new String[]{"g","h","i"};
            case 5:
                return new String[]{"j","k","l"};
            case 6:
                return new String[]{"m","n","o"};
            case 7:
                return new String[]{"p","q","r","s"};
            case 8:
                return new String[]{"t","u","v"};
            case 9:
                return new String[]{"w","x","y","z"};
            default:
                return new String[]{""};
        }
    }
}
