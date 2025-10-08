
/*Write a program to print an array after changing the rows and columns of a given
two-dimensional array.*/

import java.util.Arrays;

public class Slip4Question1 
{
    public static void main(String[] args) 
    {
        int[][] originalArray = {
            {1, 2},
            {4, 5},
            {7, 8}
        };

        System.out.println("Original Array:");
        print2DArray(originalArray);

        System.out.println("\nArray after changing rows and columns (Transposed):");
        printTransposedArray(originalArray);
    }

    public static void print2DArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void printTransposedArray(int[][] arr) 
    {
        int numRows = arr.length;
        int numCols = arr[0].length;

        for (int j = 0; j < numCols; j++) 
        { 
            for (int i = 0; i < numRows; i++) 
            { 
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}