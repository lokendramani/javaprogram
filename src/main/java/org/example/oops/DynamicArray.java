package org.example.oops;

public class DynamicArray {
    int[] array;
    int size;
    int length;

    public DynamicArray() {
        size = 5;
        length = 0;
        array = new int[size];
    }
    public void add(int elem){
        if(length == size){
            int [] temp = new int[length*2];
            size = length * 2;
            for(int i =0;i<array.length;i++){
                temp[i] = array[i];

            }
            array = temp;
        }
        array[length++] = elem;
    }

    public static void main(String[] args) {
        DynamicArray dn = new DynamicArray();
        for (int i=0;i<10;i++){
            dn.add(i*10);
        }

    }
}
