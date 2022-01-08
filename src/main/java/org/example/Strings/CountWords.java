package org.example.Strings;

public class CountWords {
    public static void main(String[] args) {
        String str  = "Coding ninjas!";
        int spaceCount= 0;
        for(int i = 0;i < str.length();i++){
            if(str.charAt(i) == ' '){

                spaceCount++;
            }
        }
        System.out.println("WordCount:"+ ++spaceCount);
    }
}
