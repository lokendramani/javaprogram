package org.example.Strings;

public class ReverseEachWord {
    public static void main(String[] args) {
        String str = "Hello, I am Adil!!";
        int start=0;
        int i=0;
        String str1="";
        String tmp="";
        while(i < str.length()){
            if(str.charAt(i) == ' '){
                tmp ="";
                for(int j=start;j < i;j++){
                    tmp = str.charAt(j)+tmp;
                }
                tmp += " ";
                start = i+1;
                str1 += tmp;
            }

            i++;
        }
        tmp = "";
        for(int j=start;j<str.length();j++){
            tmp = str.charAt(j)+tmp;
        }
        str1 += tmp;

        System.out.println(str1);
    }
}
