package org.example.Strings;

public class Pallindrome {
    public static void main(String[] args) {
        String str  = "malayalam";
        System.out.println(isPallindrome(str));
    }

    private static boolean isPallindrome(String str) {
        int i =0;
        int j = str.length()-1;
        while(i<j){
            if(str.charAt(i) != str.charAt(j))
                return false;
            else
                i++;j--;
        }
        return true;
    }
}
