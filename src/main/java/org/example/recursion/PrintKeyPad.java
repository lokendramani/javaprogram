package org.example.recursion;

import java.util.Arrays;

public class PrintKeyPad {
    public static void main(String[] args) {
        String[] arr;

         printKeypad(23);

    }

    private static void printKeypad(int i) {
        printKeypad(i,"");
    }

    private static void printKeypad(int i, String outputSoFar) {
        if(i == 0) {
            System.out.println(outputSoFar);
            return;
        }
        int mod = i % 10;
        int smallInt = i / 10;

        String[] combination = helper(mod);

        for(String str:combination){
            printKeypad(smallInt,str+outputSoFar);
        }
    }

    private static String[] helper(int n) {
            switch (n){
                case 2:
                    return new String[]{"a","b","c"};
                case 3:
                    return new String[]{"d","e","f"};
                case 4:
                    return new String[]{"g","h","i"};
                case 5:
                    return new String[]{"j","k","l"};
                case 6:
                    return new String[]{"m","n","o"};
                case 7:
                    return new String[]{"p","q","r","s"};
                case 8:
                    return new String[]{"t","u","v"};
                case 9:
                    return new String[]{"w","x","y","z"};
                default:
                    return new String[]{""};
            }
        }

}
