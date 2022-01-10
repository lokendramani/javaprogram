package org.example.array;

public class LeaderElementsInArray {
    public static void main(String[] args) {
        int[] input = {13,17,5,4,6};
        leaders(input);
    }

    private static void leaders(int[] input) {
        boolean leaderFound = false;
        for (int i = 0; i < input.length; i++) {
            leaderFound = true;
            for (int j = i; j < input.length ; j++) {
                if(input[i] < input[j]){
                    leaderFound = false;
                    break;
                }
            }
            if(leaderFound == true){
                System.out.print(input[i]+" ");
            }
        }
    }
}
