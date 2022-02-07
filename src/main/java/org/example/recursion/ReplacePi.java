package org.example.recursion;

public class ReplacePi {
    public static void main(String[] args) {
        System.out.println(replace("xpixpi"));
    }
    public static String replace(String input){

        int num = input.indexOf("pi");
        String before = input.substring(0,num);
        String after = input.substring(num+2,input.length());
        System.out.println(before);
        System.out.println(after);

        return input.replace("pi","3.14");
    }
}
