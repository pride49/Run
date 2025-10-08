
/*Write a program to accept the username and password from user 
if username and password are not same then raise "Invalid Password" 
with appropriate msg.*/

import java.util.Scanner;
class InvalidPasswordException extends Exception 
{
    public InvalidPasswordException(String message) 
	{
        super(message);
    }
}

public class Slip11Question2 
{
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
		
        try 
		{
            System.out.print("Enter Username: ");
            String username = sc.nextLine();

            System.out.print("Enter Password: ");
            String password = sc.nextLine();

            if (!username.equals(password)) 
			{
                throw new InvalidPasswordException("Invalid Password! Username and Password must be same.");
            }
            System.out.println("Login Successful! Welcome, " + username);
        } 
		catch (InvalidPasswordException e) 
		{
            System.out.println(e.getMessage());
        } 
		finally 
		{
            sc.close();
        }
    }
}
