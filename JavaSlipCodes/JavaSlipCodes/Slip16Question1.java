/*Write a program to find the Square of given number using function interface.*/

import java.util.*;

interface SquareCalculator 
{
    int square(int n);
}

public class Slip16Question1 
{
    public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
        // Lambda expression to implement square
        SquareCalculator square = (n) -> n * n;
		
		System.out.println("Enter the number : ");
        int number = sc.nextInt();
		
        System.out.println("Number: " + number);
        System.out.println("Square: " + square.square(number));
    }
}