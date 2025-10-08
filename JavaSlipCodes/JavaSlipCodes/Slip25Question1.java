/*Create a class Student(rollno, name ,class, per), to read student information from the console
and display them (Using BufferedReader class)*/

import java.io.*;

class Slip25Question1 
{
    private int rollno;
    private String name;
    private String className;
    private float per;

    public void readData() throws IOException 
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter Roll Number: ");
        rollno = Integer.parseInt(br.readLine());

        System.out.print("Enter Name: ");
        name = br.readLine();

        System.out.print("Enter Class: ");
        className = br.readLine();

        System.out.print("Enter Percentage: ");
        per = Float.parseFloat(br.readLine());
    }
	
	// Use display method also insted of toString
    public String toString() 
	{
        return "\n--- Student Details ---\n"
             + "Roll Number : " + rollno + "\n"
             + "Name        : " + name + "\n"
             + "Class       : " + className + "\n"
             + "Percentage  : " + per + "%\n";
    }

    public static void main(String[] args) throws IOException 
	{
        Slip25Question1 s = new Slip25Question1();
        s.readData();
        System.out.println(s);  // Calls toString() automatically
    }
}

