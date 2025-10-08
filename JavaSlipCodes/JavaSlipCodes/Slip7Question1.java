
/*Design a class for Bank. Bank Class should support following operations;
a. Deposit a certain amount into an account
b. Withdraw a certain amount from an account
c. Return a Balance value specifying the amount with details*/

class Bank 
{
    private int accountNumber;
    private String accountHolderName;
    private double balance;

    public Bank(int accountNumber, String accountHolderName, double initialBalance) 
	{
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = initialBalance;
    }

    public void deposit(double amount) 
	{
        if (amount > 0) 
		{
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else 
		{
            System.out.println("Deposit amount must be positive!");
        }
    }

    public void withdraw(double amount) 
	{
        if (amount > 0 && amount <= balance) 
		{
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else 
		{
            System.out.println("Insufficient balance or invalid amount!");
        }
    }

    public void getBalanceDetails() 
	{
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Current Balance: " + balance);
    }
}

public class Slip7Question1 
{
    public static void main(String[] args) 
	{
        Bank account1 = new Bank(101, "Mr. Rajesh", 5000.0);

        account1.getBalanceDetails();  

        account1.deposit(2000);        
        account1.withdraw(1500);       

        account1.getBalanceDetails();  
    }
}




// 2nd way... Using switch-case.

/*import java.util.Scanner;

class Bank 
{
    private int accountNumber;
    private String accountHolderName;
    private double balance;

    public Bank(int accountNumber, String accountHolderName, double initialBalance) 
	{
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = initialBalance;
    }

    public void deposit(double amount) 
	{
        if (amount > 0) 
		{
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else 
		{
            System.out.println("Deposit amount must be positive!");
        }
    }

    public void withdraw(double amount) 
	{
        if (amount > 0 && amount <= balance) 
		{
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else 
		{
            System.out.println("Insufficient balance or invalid amount!");
        }
    }

    public void getBalanceDetails() 
	{
        System.out.println("\n--- Account Details ---");
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Account Holder : " + accountHolderName);
        System.out.println("Current Balance: " + balance);
        System.out.println("------------------------\n");
    }
}

public class Slip7Question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Bank account = new Bank(101, "Mr. Amit", 5000.0);

        int choice;
        do {
            System.out.println("====== Bank Menu ======");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = sc.nextDouble();
                    account.deposit(depositAmount);
                    break;

                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = sc.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;

                case 3:
                    account.getBalanceDetails();
                    break;

                case 4:
                    System.out.println("Thank you...");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 4);

    }
}
*/
