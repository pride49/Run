/*Write a program to define a class Account having members custname, accno. Define default
and parameterized constructor. Create a subclass called SavingAccount with member savingbal,
minbal. Create a derived class AccountDetail that extends the class SavingAccount with
members, depositamt and withdrawalamt. Write a appropriate method to display customer
details.*/

class Account 
{
    String custname;
    String accno;

    public Account() 
	{
        custname = "";
        accno = "";
    }

    public Account(String custname, String accno) 
	{
        this.custname = custname;
        this.accno = accno;
    }
}

class SavingAccount extends Account 
{
    double savingbal;
    double minbal;

    public SavingAccount() 
	{
        super();
        savingbal = 0.0;
        minbal = 0.0;
    }

    public SavingAccount(String custname, String accno, double savingbal, double minbal) 
	{
        super(custname, accno);
        this.savingbal = savingbal;
        this.minbal = minbal;
    }
}

class AccountDetail extends SavingAccount 
{
    double depositamt;
    double withdrawalamt;

    public AccountDetail() 
	{
        super();
        depositamt = 0.0;
        withdrawalamt = 0.0;
    }

    public AccountDetail(String custname, String accno, double savingbal, double minbal, double depositamt, double withdrawalamt) {
        super(custname, accno, savingbal, minbal);
        this.depositamt = depositamt;
        this.withdrawalamt = withdrawalamt;
    }

    public void displayDetails() 
	{
        System.out.println("Customer Name: " + custname);
        System.out.println("Account Number: " + accno);
        System.out.println("Saving Balance: " + savingbal);
        System.out.println("Minimum Balance: " + minbal);
        System.out.println("Deposit Amount: " + depositamt);
        System.out.println("Withdrawal Amount: " + withdrawalamt);
    }
}

public class Slip15Question2
{
    public static void main(String[] args) 
	{
        AccountDetail account1 = new AccountDetail("Alice Smith", "A12345", 10000.0, 500.0, 2000.0, 1500.0);
        account1.displayDetails();

        System.out.println("\n--- Default Account ---");

        AccountDetail account2 = new AccountDetail();
        account2.displayDetails();
    }
}
