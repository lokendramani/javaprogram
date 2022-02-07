package org.example.recursion;

public class StringToInt {

    public static void main(String[] args) {
        String str = "3000";
        System.out.println(stringToInt(str));

    }
    private static int stringToInt(String str){

        if(str.length() == 0){
            return 0;
        }
        if(str.length() == 1)
            return Integer.parseInt(str);
        int length = str.length();
        int placeValue = (int)Math.pow(10,length-1);
        int digitValue = Integer.parseInt(str.substring(0,1)) * placeValue;

         return digitValue +(stringToInt(str.substring(1)));
    }
}
