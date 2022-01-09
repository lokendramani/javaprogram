package org.example.Strings;

public class RemoveChars {
    public static void main(String[] args) {
        String str = "aabccbaa";
        char ch = 'a';
        String str1= "";
        for (int i=0;i<str.length();i++ ) {
            if(str.charAt(i) != ch){
                str1+=str.charAt(i);
            }
        }
        System.out.println(str1);
    }
}
