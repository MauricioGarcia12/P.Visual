package Arreglos;

public class Tarea1 {

    public static void main(String[] args) {
//Creating the matrix, 6x6
        int matrix[][]
                = {
				{-9,-9,-9, 1, 1, 1},
				{ 0,-9, 0, 4, 3, 2},
				{-9,-9,-9, 1, 2, 3},
				{ 0, 0, 8, 6, 6, 0},
				{ 0, 0, 0,-2, 0, 0},
				{ 0, 0, 1, 2, 4, 0}};
        //Creating the array that will get the sum of each "I"
        int array[] = new int[16];
        //This variable is used as an iterator for the array, we can't use X or Y for it
        int cont = 0;
        //The first for is for the Y count
        for (int y = 0; y < 4; y++) {
            //Second for is the X
            for (int x = 0; x < 4; x++) {
                //We do the operation of adding each position
                array[cont] = matrix[y][x] + matrix[y][x + 1] + matrix[y][x + 2] + matrix[y + 1][x + 1]
                        + matrix[y + 2][x] + matrix[y + 2][x + 1] + matrix[y + 2][x + 2];
                cont++;
            }
        }
     //This for is to print the array that will show the sum of the Matrix
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
         
    }
}
    
