/*Write a program to find the cube of given number using functional interface.*/

import java.util.*;

interface CubeCalculator 
{
    int cube(int n);
}

public class Slip10Question1 
{
    public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
        // Lambda expression to implement cube
        CubeCalculator cube = (n) -> n * n * n;
		
		System.out.println("Enter the number : ");
        int number = sc.nextInt();
		
        System.out.println("Number: " + number);
        System.out.println("Cube: " + cube.cube(number));
    }
}
