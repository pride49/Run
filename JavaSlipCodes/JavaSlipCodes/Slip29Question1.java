/*Write a program to create a class Customer(custno,custname,contactnumber,custaddr).
Write a method to search the customer name with given contact number and display the
details.*/

import java.util.Scanner;

class Customer 
{
    private int custno;
    private String custname;
    private String contactnumber;
    private String custaddr;

    public Customer(int custno, String custname, String contactnumber, String custaddr) 
	{
        this.custno = custno;
        this.custname = custname;
        this.contactnumber = contactnumber;
        this.custaddr = custaddr;
    }

    public String getContactNumber() 
	{
        return contactnumber;
    }

    public void displayDetails() 
	{
        System.out.println("Customer Number : " + custno);
        System.out.println("Customer Name   : " + custname);
        System.out.println("Contact Number  : " + contactnumber);
        System.out.println("Address         : " + custaddr);
        System.out.println("----------------------------------");
    }
}

public class Slip29Question1 
{
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of customers: ");
        int n = Integer.parseInt(sc.nextLine());

        Customer[] customers = new Customer[n];

        for (int i = 0; i < n; i++) 
		{
            System.out.println("\nEnter details for customer " + (i + 1));
            System.out.print("Customer Number: ");
            int custno = Integer.parseInt(sc.nextLine());

            System.out.print("Customer Name: ");
            String name = sc.nextLine();

            System.out.print("Contact Number: ");
            String contact = sc.nextLine();

            System.out.print("Customer Address: ");
            String address = sc.nextLine();

            customers[i] = new Customer(custno, name, contact, address);
        }

        System.out.print("\nEnter contact number to search: ");
        String searchContact = sc.nextLine();

        boolean found = false;
        for (Customer c : customers) 
		{
            if (c.getContactNumber().equals(searchContact)) 
			{
                System.out.println("\nCustomer found:");
                c.displayDetails();
                found = true;
                break;
            }
        }

        if (!found) 
		{
            System.out.println("No customer found with contact number: " + searchContact);
        }
    }
}
