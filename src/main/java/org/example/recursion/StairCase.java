package org.example.recursion;
/*A child is running up a staircase with N steps, and can hop either 1 step, 2 steps or 3 steps at a time.
Implement a method to count how many possible ways the child can run up to the stairs.
You need to return number of possible ways W.*/
public class StairCase {
    public static void main(String[] args) {
        int count = countWays(4);
        System.out.println(count);
    }

    private static int countWays(int i) {
        if(i < 0)
            return 0;
        if(i ==0)
            return 1;
        return countWays(i-1)+countWays(i-2)+countWays(i-3);
    }
}
