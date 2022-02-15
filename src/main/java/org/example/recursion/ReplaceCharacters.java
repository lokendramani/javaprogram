package org.example.recursion;

public class ReplaceCharacters {
    public static void main(String[] args) {

        System.out.println(replaceCharacter("x",'a','x'));

    }

    public static String replaceCharacter(String input, char c1, char c2) {
    if(input.length()== 0 ){
        return input;
    }
    if(input.charAt(0) == c1){
        String ans = String.valueOf(c2);
        return ans+replaceCharacter(input.substring(1),c1,c2);
    }
    return String.valueOf(input.charAt(0))+replaceCharacter(input.substring(1),c1,c2);

    }
}
