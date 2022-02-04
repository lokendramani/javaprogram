package org.example.recursion;

public class Pallindrome {
    public static void main(String[] args) {
        System.out.println(isStringPalindrome("racecara"));
    }

    public static boolean isStringPalindrome(String input) {
        if(input.length() <=1){
            return true;
        }
        if(input.charAt(0) != input.charAt(input.length()-1)){
            return false;
        }
        return isStringPalindrome(input.substring(1,input.length()-1));


    }
}
