/*Write program to define class Person with data member as Personname,Aadharno, Panno.
Accept information for 5 objects and display appropriate information (use this keyword).*/

import java.util.Scanner;

class Person 
{
    private String personName;
    private String aadharNo;
    private String panNo;

    public Person(String personName, String aadharNo, String panNo) 
	{
        this.personName = personName;
        this.aadharNo = aadharNo;
        this.panNo = panNo;
    }

    public void display() 
	{
        System.out.println("Name     : " + this.personName);
        System.out.println("Aadhar No: " + this.aadharNo);
        System.out.println("PAN No   : " + this.panNo);
        System.out.println("---------------------------");
    }
}

public class Slip30Question1 
{
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);

        Person[] people = new Person[5];

        for (int i = 0; i < 5; i++) 
		{
            System.out.println("Enter details for person " + (i + 1));

            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Aadhar No: ");
            String aadhar = sc.nextLine();

            System.out.print("Enter PAN No: ");
            String pan = sc.nextLine();

            people[i] = new Person(name, aadhar, pan);
            System.out.println();
        }

        System.out.println("----- Person Details -----");
        for (Person p : people) 
		{
            p.display();
        }
    }
}
