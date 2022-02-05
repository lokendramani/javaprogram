package org.example.recursion;

public class RemoveString {
    public static void main(String[] args) {
        System.out.println(removeX("xaxb"));
    }

    private static String removeX(String input) {
        if(input.length() <= 0)
            return "";
        if(input.length() == 1){
            if(input.charAt(0)=='x')
                return "";
            else
                return input;
        }
        if(input.charAt(0) == 'x'){
            return removeX(input.substring(1));
        }
        return input.substring(0,1) + removeX(input.substring(1));
    }
}
