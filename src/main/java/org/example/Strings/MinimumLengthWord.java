package org.example.Strings;

public class MinimumLengthWord {
    public static void main(String[] args) {
        String input = "abc de ghihjk a uvw h j";
        System.out.println(minLengthWord(input));
    }

    private static String minLengthWord(String input) {
    String minWord = null;
    int startWord = 0;
    int length=Integer.MAX_VALUE;
        for (int i = 0; i < input.length(); i++) {
            if(input.charAt(i) == ' '){
                if( (i - startWord) < length ){
                    //extract minWord
                    minWord = input.substring(startWord,i);
                    length = minWord.length();
                }
//                update start
                startWord = i+1;
            }
        }
        String lastWord = input.substring(startWord,input.length());


    return lastWord.length() < minWord.length()?lastWord:minWord;
    }
}
