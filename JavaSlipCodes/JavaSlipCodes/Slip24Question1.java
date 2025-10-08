/*Create an abstract class 'Bank' with an abstract method 'getBalance'. Rs.100, Rs.150 and
Rs.200 are deposited in banks A, B and C respectively. 'BankA', 'BankB' and 'BankC'
are subclasses of class 'Bank', each having a method named 'getBalance'. Call this method
by creating an object of each of the three classes.*/

abstract class Bank 
{
    abstract int getBalance();
}

class BankA extends Bank 
{
    private final int balance = 100;

    int getBalance() 
	{
        return balance;
    }
}

class BankB extends Bank 
{
    private final int balance = 150;

    int getBalance() 
	{
        return balance;
    }
}

class BankC extends Bank 
{
    private final int balance = 200;

    int getBalance() 
	{
        return balance;
    }
}

public class Slip24Question1 
{
    public static void main(String[] args) 
	{
        Bank bankA = new BankA();
        Bank bankB = new BankB();
        Bank bankC = new BankC();

        System.out.println("Balance in Bank A: Rs." + bankA.getBalance());
        System.out.println("Balance in Bank B: Rs." + bankB.getBalance());
        System.out.println("Balance in Bank C: Rs." + bankC.getBalance());
    }
}
