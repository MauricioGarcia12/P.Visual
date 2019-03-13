package Arreglos;

public class Diagnostico {

    public static void main(String[] args) {
        int[][] matrix
                = {
                    {1, 3, 5, 7},
                    {4, 7, 9, 7},
                    {2, 6, 8, 0},
                    {2, 4, 5, 2}
                };
        int num;
        int pos=3;
        for (int y = 0; y < 4; y++) {

            for (int x = 0; x < 4; x++) {
             
                if (y%2==0) {
                
                    num=matrix[x][y];
                   System.out.print(num+" ");
                } else {
                    
                    num=matrix[pos-x][y];
                    System.out.print(num+" ");

                }
            }
        }
    }

}
