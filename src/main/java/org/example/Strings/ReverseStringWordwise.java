package org.example.Strings;

public class ReverseStringWordwise {
    public static void main(String[] args) {
        String str = "Welcome to coding ninjas";
        String[] strArray = str.split(" ");
        StringBuffer stringBuffer = new StringBuffer("");
        for (int i=strArray.length -1 ; i >= 0; i--) {
            stringBuffer.append(strArray[i]);
            stringBuffer.append(" ");
            }
        System.out.println(stringBuffer);
    }
}
