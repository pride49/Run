

import java.util.*;

abstract class Staff 
{
	protected int id;
	protected String name;

	Staff(int id, String name) 
	{
		this.id = id;
		this.name = name;
	}

	abstract void display();
}

class OfficeStaff extends Staff 
{
	private String department;

	OfficeStaff(int id, String name, String department) 
	{
		super(id, name);
		this.department = department;
	}

	void display() 
	{
		System.out.println("ID: " + id + ", Name: " + name + ", Department: " + department);
	}
}

//Main class
public class Slip1Question2 
{
	public static void main(String[] args) 
	{

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter No. of employees");
		int n = sc.nextInt();

		OfficeStaff[] staffList = new OfficeStaff[n];

		for (int i = 0; i < n; i++) 
		{
			System.out.print("Id: ");
			int id = sc.nextInt();
			System.out.print("Name: ");
			String name = sc.next();
			System.out.print("Department: ");
			String dept = sc.next();

			sc.nextLine();

			staffList[i] = new OfficeStaff(id, name, dept);
		}

		System.out.println("Office Staff Details:");
		for (int i = 0; i < n; i++) {
			staffList[i].display();
		}
	}
}