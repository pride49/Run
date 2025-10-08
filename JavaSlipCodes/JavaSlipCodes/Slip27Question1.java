/*Define an Employee class with suitable attributes having getSalary() method, which returns
salary withdrawn by a particular employee. Write a class Manager which extends a class
Employee, override the getSalary() method, which will return salary of manager by adding
traveling allowance, house rent allowance etc.*/

class Employee 
{
    protected String name;
    protected int id;
    protected double baseSalary;

    public Employee(String name, int id, double baseSalary) 
	{
        this.name = name;
        this.id = id;
        this.baseSalary = baseSalary;
    }

    public double getSalary() 
	{
        return baseSalary;
    }

    public void display() 
	{
        System.out.println("Employee ID   : " + id);
        System.out.println("Employee Name : " + name);
        System.out.println("Salary        : " + getSalary());
    }
}

class Manager extends Employee 
{
    private double travelAllowance;
    private double houseRentAllowance;

    public Manager(String name, int id, double baseSalary, double travelAllowance, double houseRentAllowance) 
	{
        super(name, id, baseSalary);
        this.travelAllowance = travelAllowance;
        this.houseRentAllowance = houseRentAllowance;
    }

    public double getSalary() 
	{
        return baseSalary + travelAllowance + houseRentAllowance;
    }

    public void display() 
	{
        System.out.println("Manager ID    : " + id);
        System.out.println("Manager Name  : " + name);
        System.out.println("Base Salary   : " + baseSalary);
        System.out.println("Travel Allow. : " + travelAllowance);
        System.out.println("HRA           : " + houseRentAllowance);
        System.out.println("Total Salary  : " + getSalary());
    }
}

public class Slip27Question1 
{
    public static void main(String[] args) 
	{
        Employee emp = new Employee("John", 101, 30000);
        System.out.println("=== Employee Details ===");
        emp.display();

        System.out.println();

        Manager mgr = new Manager("Alice", 201, 50000, 5000, 7000);
        System.out.println("=== Manager Details ===");
        mgr.display();
    }
}
