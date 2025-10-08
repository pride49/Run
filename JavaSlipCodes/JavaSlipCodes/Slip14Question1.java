/*Write a program to accept a number from the user, if number is zero then throw user defined
exception “Number is 0” otherwise check whether no is prime or not (Use static keyword).*/

import java.util.Scanner;

class ZeroNumberException extends Exception 
{
    public ZeroNumberException(String message) 
	{
        super(message);
    }
}

public class Slip14Question1 
{
    public static boolean isPrime(int num) 
	{
        if (num <= 1) 
		{
			return false;
		}
        for (int i = 2; i <= Math.sqrt(num); i++) 
		{
            if (num % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) 
	{
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");

        int number = scanner.nextInt();

        try 
		{
            if (number == 0) 
			{
                throw new ZeroNumberException("Number is 0");
            }
            else if (isPrime(number)) 
			{
                System.out.println(number + " is a prime number.");
            } 
			else
			{
                System.out.println(number + " is not a prime number.");
            }
        } 
		catch (ZeroNumberException e) 
		{
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
