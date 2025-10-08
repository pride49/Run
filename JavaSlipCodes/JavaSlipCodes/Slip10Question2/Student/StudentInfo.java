package Student;

public class StudentInfo 
{
    protected int rollno;
    protected String name;
    protected String studentClass; // Renamed 'class' to 'studentClass' to avoid keyword conflict
    protected double percentage;

    public void displayInfo() 
	{
        System.out.println("Roll Number: " + rollno);
        System.out.println("Name: " + name);
        System.out.println("Class: " + studentClass);
        System.out.println("Percentage: " + String.format("%.2f", percentage) + "%");
    }
}