/*Write a Java program to create a Package “SY” which has a class SYMarks (members –
ComputerTotal, MathsTotal, and ElectronicsTotal). Create another package TY which has a
class TYMarks (members – Theory, Practicals). Create ‘n’ objects of Student class (having
rollNumber, name, SYMarks and TYMarks). Add the marks of SY and TY computer subjects
and calculate the Grade (‘A’ for >= 70, ‘B’ for >= 60 ‘C’ for >= 50, Pass Class for > =40
else‘FAIL’) and display the result of the student in proper format.*/

import SY.SYMarks;
import TY.TYMarks;
import java.util.*;


class Student
{
	int rollNumber;
    String name;
    SYMarks sy;
    TYMarks ty;

    // Constructor
    Student(int rollNumber, String name, SYMarks sy, TYMarks ty)
	{
        this.rollNumber = rollNumber;
        this.name = name;
        this.sy = sy;
        this.ty = ty;
    }

    // Calculate Computer total (SY Computer + TY Theory + TY Practicals)
    int getComputerTotal()
	{
        return sy.ComputerTotal + ty.Theory + ty.Practicals;
    }

    String getGrade() 
	{
        int total = getComputerTotal();
        if (total >= 70) 
			return "A";
        else if (total >= 60 && total <70) 
			return "B";
        else if (total >= 50 && total<60) 
			return "C";
        else if (total >= 40 && total<50) 
			return "Pass Class";
        else return "FAIL";
    }

    void display() 
	{
        System.out.println("Roll No: " + rollNumber + ", Name: " + name);
        System.out.println("SY Computer Marks: " + sy.ComputerTotal);
        System.out.println("TY Computer (Theory + Practicals): " + ty.Theory + " + " + ty.Practicals);
        System.out.println("Total Computer Marks: " + getComputerTotal());
        System.out.println("Grade: " + getGrade());
        System.out.println("-----------------------------------");
    }
	
	
	public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine();

        Student[] students = new Student[n];

        for (int i = 0; i < n; i++) 
		{
            System.out.println("\nEnter details for Student " + (i + 1));
            System.out.print("Roll No: ");
            int roll = sc.nextInt();
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("SY Computer Marks: ");
            int syComp = sc.nextInt();
            System.out.print("SY Maths Marks: ");
            int syMaths = sc.nextInt();
            System.out.print("SY Electronics Marks: ");
            int syElec = sc.nextInt();

            System.out.print("TY Theory Marks: ");
            int tyTheory = sc.nextInt();
            System.out.print("TY Practicals Marks: ");
            int tyPracs = sc.nextInt();

            SYMarks sy = new SYMarks(syComp, syMaths, syElec);
            TYMarks ty = new TYMarks(tyTheory, tyPracs);

            students[i] = new Student(roll, name, sy, ty);
        }

        System.out.println("\n===== Student Results =====");
        for (Student s : students) 
		{
            s.display();
        }

    }
	
	
	
}