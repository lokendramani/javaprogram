package org.example.Strings;

public class RemoveDuplicate {
    public static void main(String[] args) {
        String str = "aabccbaa";
        System.out.println(removeConsecutiveDuplicates(str));
    }

    private static String removeConsecutiveDuplicates(String str) {
        String string="";
        int i = 0;
        int j;
        while ( i < str.length()) {
            char ch = str.charAt(i);
            string = string+ch;
            j=i+1;
            while(j < str.length()){
                if(ch != str.charAt(j)){
                    i = j;
                    break;
                }
                j++;
            }
            if(j==str.length())
                i=j;

        }
        return string;
    }
}
