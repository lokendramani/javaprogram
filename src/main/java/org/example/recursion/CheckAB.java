package org.example.recursion;


/*Suppose you have a string, S, made up of only 'a's and 'b's. Write a recursive function that checks if the string was generated using the following rules:
        a. The string begins with an 'a'
        b. Each 'a' is followed by nothing or an 'a' or "bb"
        c. Each "bb" is followed by nothing or an 'a'
        If all the rules are followed by the given string, return true otherwise return false.*/
public class CheckAB {
    public static void main(String[] args) {
        boolean ret = checkAB("aa");
        System.out.println(ret);
    }

    private static boolean checkAB(String input) {
        if (input.length() == 0)
            return true;

        if (input.charAt(0) == 'a')
        {

            if (input.length() > 2 && input.substring(1,3).equals("bb"))
                return checkAB(input.substring(3));
            else
                return checkAB(input.substring(1));
        }
        else
            return false;
    }
}
