package org.example.recursion;

public class ReplaceString {

    public static void main(String[] args) {
        System.out.println(replace("pippiippip"));
    }
    public static String replace(String input){
        String temp=null;
        if(input == null || input.length() <= 0 )
            return "";
        if(input.length() == 1)
            return input;
        if(input.charAt(0)=='p' && input.charAt(1)== 'i')
        {
             temp = input.substring(2);
             temp = "3.14"+ replace(temp);
        }else{
            return input.substring(0,1)+ (replace(input.substring(1)));
        }
        return temp;
    }
}
