/*Define a class MyDate(Day, Month, year) with methods to accept and display a MyDateobject.
Accept date as dd,mm,yyyy. Throw user defined exception "InvalidDateException" if the date
is invalid.*/

class InvalidDateException extends Exception 
{
    public InvalidDateException(String message) 
	{
        super(message);
    }
}

public class Slip21Question1 
{
    private int day;
    private int month;
    private int year;

    public Slip21Question1(int day, int month, int year) throws InvalidDateException 
	{
        this.day = day;
        this.month = month;
        this.year = year;
        if (!isValidDate()) 
		{
            throw new InvalidDateException("Invalid date: " + day + "/" + month + "/" + year);
        }
    }
	
    private boolean isValidDate() 
	{
        if (year <= 0) return false;
        if (month < 1 || month > 12) return false;

        int daysInMonth;
		
        switch (month) 
		{
            case 1: 
			case 3: 
			case 5: 
			case 7: 
			case 8: 
			case 10: 
			case 12:
                daysInMonth = 31;
                break;
            case 4: 
			case 6: 
			case 9: 
			case 11:
                daysInMonth = 30;
                break;
            case 2:
                if (isLeapYear()) 
				{
                    daysInMonth = 29;
                } 
				else 
				{
                    daysInMonth = 28;
                }
                break;
            default:
                return false;
        }
        return day >= 1 && day <= daysInMonth;
    }

    private boolean isLeapYear() 
	{
        if ((year % 400) == 0) 
		{
            return true;
        }
        if ((year % 100) == 0) 
		{
            return false;
        }
        return (year % 4) == 0;
    }

    public void display() 
	{
        System.out.printf("Date: %02d/%02d/%04d%n", day, month, year);
    }

    public static void main(String[] args) 
	{
        try 
		{
            Slip21Question1 date1 = new Slip21Question1(29, 2, 2024);  // Valid leap year date
            date1.display();

            Slip21Question1 date2 = new Slip21Question1(31, 4, 2023);  // Invalid date (April has 30 days)
            date2.display();
        } 
		catch (InvalidDateException e) 
		{
            System.out.println(e.getMessage());
        }
    }
}
