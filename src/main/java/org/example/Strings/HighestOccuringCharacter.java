package org.example.Strings;

public class HighestOccuringCharacter {
    public static void main(String[] args) {
        String str = "abdefgbabfba";
        int [] arr = new int[256];
        for(int i = 0 ;i< str.length();i++){
            char c = str.charAt(i);
            arr[c]++;
        }
        int count = arr[str.charAt(0)];
        char ch = str.charAt(0);
        for(int i = 1 ;i< str.length();i++){
           if(count < arr[str.charAt(i)]) {
               count = arr[str.charAt(i)];
               ch = str.charAt(i);
           }
        }
        System.out.println("Highest occuring character is "+ch+" "+count+" times.");

    }
}
