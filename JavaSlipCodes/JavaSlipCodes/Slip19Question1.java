/*Write a program to accept the two dimensional array from user and display sum of its diagonal elements.*/

import java.util.Scanner;
public class Slip19Question1 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size");
		int size_i = sc.nextInt();
		int size_j = sc.nextInt();
		int a[][] = new int[size_i][size_j];
		System.out.println("Enter Array Elements: ");
		for(int i=0;i<size_i;i++)
		{
			for(int j=0;j<size_j;j++)
			{
				a[i][j] = sc.nextInt();
			}
			System.out.println();
		}
		System.out.println("Array is ");
		for(int i=0;i<size_i;i++)
		{
			for(int j=0;j<size_j;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		int sum=0;
		for(int i=0;i<size_i;i++)
		{
			for(int j=0;j<size_j;j++)
			{
				if(a[i]==a[j])
				{
					sum = sum + a[i][j]; 
				}
			}
			System.out.println();
		}
		System.out.println("Addition of diagonal element is " + sum);
	}
}