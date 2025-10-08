
/*Write a program to read the First Name and Last Name of a person, his weight and height using
command line arguments. Calculate the BMI Index which is defined as the individual's body mass
divided by the square of their height.
(Hint : BMI = Wts. In kgs / (ht)2)*/

public class Slip2Question1 
{
	public static void main(String[] args) 
	{
		// Read values from command line
        String firstName = args[0];
        String lastName = args[1];
        double weight = Double.parseDouble(args[2]); // in kg
        double height = Double.parseDouble(args[3]); // in cm
        
        double htMtr = height/100;
		System.out.println(htMtr);
        double bmi = weight / (htMtr * htMtr);
        
        System.out.println("Name: " + firstName + " " + lastName);
        System.out.println("Weight: " + weight + " kg");
        System.out.println("Height: " + height + " cm");
        System.out.println("BMI: " + bmi);
	}
} 


