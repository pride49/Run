/*Define a class MyNumber having one private int data member. Write a default constructor to
initialize it to 0 and another constructor to initialize it to a value (Use this). Write methods
isNegative, isPositive, isZero, isOdd, isEven. Create an object in main.Use command line
arguments to pass a value to the Object.*/

public class Slip23Question1 
{
    private int number;

    public Slip23Question1() 
	{
        this.number = 0;
    }

    public Slip23Question1(int number) 
	{
        this.number = number;
    }

    public boolean isNegative() 
	{
        return number < 0;
    }

    public boolean isPositive() 
	{
        return number > 0;
    }

    public boolean isZero() 
	{
        return number == 0;
    }

    public boolean isOdd() 
	{
        return number % 2 != 0;
    }

    public boolean isEven() 
	{
        return number % 2 == 0;
    }

    public void displayProperties() 
	{
        System.out.println("Number: " + number);
        System.out.println("Is Negative? " + isNegative());
        System.out.println("Is Positive? " + isPositive());
        System.out.println("Is Zero? " + isZero());
        System.out.println("Is Odd? " + isOdd());
        System.out.println("Is Even? " + isEven());
    }

    public static void main(String[] args) 
	{
        Slip23Question1 num;

        if (args.length > 0) 
		{
            try 
			{
                int val = Integer.parseInt(args[0]);
                num = new Slip23Question1(val);
            } 
			catch (NumberFormatException e) 
			{
                System.out.println("Invalid input! Using default value 0.");
                num = new Slip23Question1();
            }
        } 
		else 
		{
            System.out.println("No input provided! Using default value 0.");
            num = new Slip23Question1();
        }
        num.displayProperties();
    }
}
