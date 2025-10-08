
/*Write a menu driven program to perform the following operations on multidimensional array
ie matrices :
 Addition
 Multiplication
 Exit
*/

import java.util.Scanner;

public class Slip5Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter rows and columns of matrices: ");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();

        int[][] A = new int[r1][c1];
        int[][] B = new int[r1][c1];
        int[][] sum = new int[r1][c1];
        int[][] product = new int[r1][c1];

        System.out.println("Enter elements of Matrix A:");
        for (int i = 0; i < r1; i++)
		{
            for (int j = 0; j < c1; j++)
			{
                A[i][j] = sc.nextInt();
			}
		}
			
		System.out.println("Matrix A is:");
        for (int i = 0; i < r1; i++)
		{
            for (int j = 0; j < c1; j++)
			{
                System.out.print(A[i][j]+" ");
			}
			System.out.println();
		}

        System.out.println("Enter elements of Matrix B:");
        for (int i = 0; i < r1; i++)
		{
            for (int j = 0; j < c1; j++)
			{
                B[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Matrix B is:");
        for (int i = 0; i < r1; i++)
		{
            for (int j = 0; j < c1; j++)
			{
                System.out.print(B[i][j]+" ");
			}
			System.out.println();
		}
			

        int choice;
        do {
            System.out.println("\n===== Matrix Operations Menu =====");
            System.out.println("1. Addition");
            System.out.println("2. Multiplication");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1: // Matrix Addition

                    System.out.println("Resultant Matrix (A+B):");
                    for (int i = 0; i < r1; i++) 
					{
                        for (int j = 0; j < c1; j++) 
						{
                            sum[i][j] = A[i][j] + B[i][j];
                            System.out.print(sum[i][j] + " ");
                        }
                        System.out.println();
                    }
                    break;

                case 2: // Matrix Multiplication
                    
                    for (int i = 0; i < r1; i++) 
					{
                        for (int j = 0; j < c1; j++) 
						{
                            product[i][j] = 0;
                            for (int k = 0; k < c1; k++) 
							{
                                product[i][j] += A[i][k] * B[k][j];
                            }
                        }
                    }

                    System.out.println("Resultant Matrix (A*B):");
                    for (int i = 0; i < r1; i++) 
					{
                        for (int j = 0; j < c1; j++) 
						{
                            System.out.print(product[i][j] + " ");
                        }
                        System.out.println();
                    }
                    break;

                case 3:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 3);

        sc.close();
    }
}
