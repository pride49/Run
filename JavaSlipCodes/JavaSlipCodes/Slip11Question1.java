/*Define an interface “Operation” which has method volume( ).Define a constant PI having a value
3.142 Create a class cylinder which implements this interface (members – radius,height). Create
one object and calculate the volume.*/

import java.util.*;

interface Operation 
{
	double PI = 3.142;   

	double area();       
	double volume();     
}

class Cylinder implements Operation 
{
	private double radius;
	private double height;

	Cylinder(double radius, double height) 
	{
		this.radius = radius;
		this.height = height;
	}

	public double area() {
		return (2 * PI * radius * height) + (2 * PI * radius * radius);
	}

	public double volume() 
	{
		return PI * radius * radius * height;
	}
}

public class Slip11Question1 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the redius");
		int r = sc.nextInt();
		System.out.println("Enter the heignt");
		int h = sc.nextInt();

		Cylinder c = new Cylinder(r, h);

		System.out.println("Cylinder Details:");
		System.out.println("Area   = " + c.area());
		System.out.println("Volume = " + c.volume());
	}
}
