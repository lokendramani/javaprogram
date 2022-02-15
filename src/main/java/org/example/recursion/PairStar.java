package org.example.recursion;

public class PairStar {
    public static void main(String[] args) {
        System.out.println(addStar("llll"));
    }

    private static String addStar(String s) {
        if(s.length() < 2)
            return s;
        if(s.length() == 2){
            if(s.charAt(0) == s.charAt(1)){
                return s.charAt(0)+"*"+s.charAt(1);
            }else{
                return s;
            }
        }
        if(s.charAt(0) == s.charAt(1)){
            String temp = s.charAt(0)+"*";
            return temp + addStar(s.substring(1));
        }
        return s.charAt(0) + addStar(s.substring(1));
    }
}
