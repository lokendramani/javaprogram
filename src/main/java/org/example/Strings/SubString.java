package org.example.Strings;

public class SubString {
    public static void main(String[] args) {
        String str = "abc";
        printSubstrings(str);
    }

    private static void printSubstrings(String str) {
        for (int i = 0; i < str.length() ; i++) {
            for(int j= i; j < str.length();j++){
                System.out.println(str.substring(i,j+1));
            }

        }
    }

}
