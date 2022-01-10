package org.example.array.twoDArray;

public class SpiralPrint {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3,4},{14,15,16,5},{13,20,17,6},{12,19,18,7},{11,10,9,8}};
        int count = 0;
        int cs=0;
        int ce=arr[0].length;
        int rs=0;
        int re = arr.length;
        while(count < arr.length * arr[0].length){
            for (int i = cs; i < ce; i++) {
                System.out.print(arr[rs][i]+" ");
                count++;
            }
            rs++;
            for(int i=rs;i< re;i++){
                System.out.print(arr[i][ce-1]+ " ");
                count++;
            }
            ce--;
            for(int i=ce-1;i >= cs;i--){
                System.out.print(arr[re-1][i]+ " ");
                count++;
            }
            re--;
            for(int i=re-1;i >= rs;i--){
                System.out.print(arr[i][cs]+ " ");
                count++;
            }
            cs++;
        }
    }
}
