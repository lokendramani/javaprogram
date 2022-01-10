package org.example.Strings;

public class CompressString {
    public static void main(String[] args) {
        String str = "aaabbcddeeeee";
        int i=0;
        String str1="";
        while (i<str.length()){
            int j = i+1;
            int count = 1;

            while(j < str.length() && str.charAt(i) == str.charAt(j)){
                count++;
                j++;
            }

            str1 = (count == 1)?str1 + str.charAt(i):str1 + str.charAt(i)+count;

            i = j;
        }
        System.out.println("compressed string is:"+str1);
    }
}
