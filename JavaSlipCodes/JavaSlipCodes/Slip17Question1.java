/*Design a Super class Customer (name, phone-number). Derive a class Depositor(accno , balance)
from Customer. Again, derive a class Borrower (loan-no, loan-amt) from Depositor. Write
necessary member functions to read and display the details of ‘n’customers.*/

import java.util.Scanner;
class Customer 
{
    protected String name;
    protected String phoneNumber;

    public void readCustomerDetails(Scanner sc) 
	{
        System.out.print("Enter Customer Name: ");
        name = sc.nextLine();
        System.out.print("Enter Phone Number: ");
        phoneNumber = sc.nextLine();
    }

    public void displayCustomerDetails() 
	{
        System.out.println("Customer Name: " + name);
        System.out.println("Phone Number: " + phoneNumber);
    }
}

class Depositor extends Customer 
{
    protected String accno;
    protected double balance;

    public void readDepositorDetails(Scanner sc) 
	{
        readCustomerDetails(sc);  // read customer info first
        System.out.print("Enter Account Number: ");
        accno = sc.nextLine();
        System.out.print("Enter Balance: ");
        balance = sc.nextDouble();
        sc.nextLine();  // consume newline
    }

    public void displayDepositorDetails() 
	{
        displayCustomerDetails();
        System.out.println("Account Number: " + accno);
        System.out.println("Balance: " + balance);
    }
}

class Borrower extends Depositor 
{
    private String loanNo;
    private double loanAmt;

    public void readBorrowerDetails(Scanner sc) 
	{
        readDepositorDetails(sc);  // read depositor info first
        System.out.print("Enter Loan Number: ");
        loanNo = sc.nextLine();
        System.out.print("Enter Loan Amount: ");
        loanAmt = sc.nextDouble();
        sc.nextLine();  // consume newline
    }

    public void displayBorrowerDetails() {
        displayDepositorDetails();
        System.out.println("Loan Number: " + loanNo);
        System.out.println("Loan Amount: " + loanAmt);
    }
}

public class Slip17Question1 
{
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of customers: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        Borrower[] customers = new Borrower[n];

        for (int i = 0; i < n; i++) 
		{
            System.out.println("\nEnter details for customer " + (i + 1) + ":");
            customers[i] = new Borrower();
            customers[i].readBorrowerDetails(sc);
        }

        System.out.println("\n--- Customer Details ---");
        for (int i = 0; i < n; i++) 
		{
            System.out.println("\nCustomer " + (i + 1) + ":");
            customers[i].displayBorrowerDetails();
        }
    }
}
