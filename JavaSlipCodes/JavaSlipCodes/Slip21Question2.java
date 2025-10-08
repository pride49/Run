/*Create an employee class(id,name,deptname,salary). Define a default and parameterized
constructor. Use ‘this’ keyword to initialize instance variables. Keep a count of objects
created. Create objects using parameterized constructor and display the object count after
each object is created. (Use static member and method). Also display the contents of each
object.*/

public class Slip21Question2 
{
    private int id;
    private String name;
    private String deptname;
    private double salary;

    private static int count = 0;

    public Slip21Question2() 
	{
        this.id = 0;
        this.name = "Unknown";
        this.deptname = "Unknown";
        this.salary = 0.0;
        count++;
    }

    public Slip21Question2(int id, String name, String deptname, double salary) 
	{
        this.id = id;
        this.name = name;
        this.deptname = deptname;
        this.salary = salary;
        count++;
    }

    public static int getCount() 
	{
        return count;
    }

    public void display() 
	{
        System.out.println("Employee ID: " + id);
        System.out.println("Name       : " + name);
        System.out.println("Dept Name  : " + deptname);
        System.out.println("Salary     : $" + salary);
        System.out.println("-------------------------");
    }

    public static void main(String[] args) 
	{
        Slip21Question2 e1 = new Slip21Question2(101, "Alice", "HR", 50000);
        e1.display();
        System.out.println("Total employees: " + Slip21Question2.getCount());

        Slip21Question2 e2 = new Slip21Question2(102, "Bob", "Finance", 60000);
        e2.display();
        System.out.println("Total employees: " + Slip21Question2.getCount());

        Slip21Question2 e3 = new Slip21Question2(103, "Charlie", "IT", 70000);
        e3.display();
        System.out.println("Total employees: " + Slip21Question2.getCount());
    }
}
