/* Write a program to create parent class College(cno, cname, caddr) and derived class
Department(dno, dname) from College. Write a necessary methods to display College details */

class College 
{
    int cno;
    String cname;
    String caddr;

    College(int cno, String cname, String caddr) 
	{
        this.cno = cno;
        this.cname = cname;
        this.caddr = caddr;
    }

    void displayCollegeDetails() 
	{
        System.out.println("College Number: " + cno);
        System.out.println("College Name  : " + cname);
        System.out.println("College Address: " + caddr);
    }
}

class Department extends College 
{
    int dno;
    String dname;

    Department(int cno, String cname, String caddr, int dno, String dname) 
	{
        super(cno, cname, caddr);  // call parent constructor
        this.dno = dno;
        this.dname = dname;
    }

    void displayDetails()
	{
        displayCollegeDetails();  
        System.out.println("Department Number: " + dno);
        System.out.println("Department Name  : " + dname);
    }
}

public class Slip12Question1 
{
    public static void main(String[] args) 
	{
        Department dept = new Department(101, "ABC College", "Pune", 10, "Computer Science");
        dept.displayDetails();
    }
}
