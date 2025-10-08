/*Write a program to display the Employee(Empid, Empname, Empdesignation, Empsal)
information using toString().*/

import java.util.Scanner;

public class Slip6Question1 
{

	int id;
	String name;
	String department;
	double salary;
	static int cnt=0;

	public Slip6Question1(int id, String name, String department, double salary)
	{
		this.id = id;
		this.name = name;
		this.department = department;
		this.salary = salary;
	}
	
	public String toString() {
        return "Employee ID: " + id + ", Name: " + name + ", Designation: " + department + ", Salary: " + salary;
    }
	
	
	public static void main(String[] args) 
	{

		Scanner sc = new Scanner(System.in);
		System.out.println("How many employee you want to enter?");
		int n = sc.nextInt();
		Slip6Question1[] emp=new Slip6Question1[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter Id of employee :");
			int id=sc.nextInt();
			System.out.println("Enter Name of employee :");
			sc.nextLine();
			String name= sc.nextLine();
			System.out.println("Enter dept name of employee :");
			String deptname=sc.nextLine();
			System.out.println("Enter salary of employee :");
			float salary = sc.nextFloat();
			emp[i]=new Slip6Question1(id,name,deptname,salary);

		}
		
		
		for(int i=0;i<n;i++)
		{
			System.out.println(emp[i]);
		}
	}
}