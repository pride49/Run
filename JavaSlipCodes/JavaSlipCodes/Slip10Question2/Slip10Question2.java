/* Write a program to create a package name student. Define class StudentInfo with method to
display information about student such as rollno, class, and percentage. Create another class
StudentPer with method to find percentage of the student. Accept student details like
rollno, name, class and marks of 6 subject from user. */

import Student.StudentPer;
import java.util.Scanner;

public class Slip10Question2 
{
    public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter Roll Number: ");
        int rollno = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Class: ");
        String studentClass = sc.nextLine();

        int[] marks = new int[6];
        System.out.println("Enter marks for 6 subjects:");
        for (int i = 0; i < 6; i++) 
		{
            System.out.print("Subject " + (i + 1) + " marks: ");
            marks[i] = sc.nextInt();
        }

        StudentPer student = new StudentPer(rollno, name, studentClass, marks);
        System.out.println("\n--- Student Information ---");
        student.displayInfo();
    }
}