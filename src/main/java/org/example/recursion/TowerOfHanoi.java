package org.example.recursion;

public class TowerOfHanoi {
    public static void main(String[] args) {
        towerOfHanoi(3,'A','B','C');
    }

    private static void towerOfHanoi(int disks, char source, char auxiliary, char destination) {
        if(disks == 1 )
            System.out.println(source+" "+destination);
        else {

            towerOfHanoi(disks - 1, source, destination,auxiliary);
            towerOfHanoi(1,source,auxiliary,destination);
            towerOfHanoi(disks-1,auxiliary,source,destination);
        }

    }
}
