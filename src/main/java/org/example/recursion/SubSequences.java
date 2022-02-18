package org.example.recursion;

import java.util.Arrays;

public class SubSequences {
    public static void main(String[] args) {
        String str = "xyz";
        String[] subSeq = subSequences(str);

        Arrays.asList(subSeq).forEach(System.out::println);
    }

    private static String[] subSequences(String str) {

        if(str.length() == 0){
            String []ans = {""};
            return ans;

        }
        String smallAns[] = subSequences(str.substring(1));
        String [] ans = new String[smallAns.length*2];
        int i=0;
        for(String tmp:smallAns){
            ans[i] = tmp;
            i++;
        }
        for(String tmp: smallAns){
            ans[i] = str.charAt(0)+tmp;
            i++;
        }

        return ans;

    }
}
