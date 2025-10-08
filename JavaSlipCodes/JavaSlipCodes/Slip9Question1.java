/*Define a “Clock” class that does the following ;
a. Accept Hours, Minutes and Seconds
b. Check the validity of numbers
c. Set the time to AM/PM mode
Use the necessary constructors and methods to do the above task*/

import java.util.*;
class Clock 
{
    private int hours;
    private int minutes;
    private int seconds;

    public Clock(int h, int m, int s) 
	{
        if (isValid(h, m, s)) 
		{
            this.hours = h;
            this.minutes = m;
            this.seconds = s;
        } 
		else 
		{
            System.out.println("Invalid time! Setting default 12:00:00");
            this.hours = 12;
            this.minutes = 0;
            this.seconds = 0;
        }
    }

    private boolean isValid(int h, int m, int s) 
	{
        return (h >= 0 && h < 24) && (m >= 0 && m < 60) && (s >= 0 && s < 60);
    }

    public void displayTimeAMPM() 
	{
        String period = (hours >= 12) ? "PM" : "AM";
        int displayHour = hours % 12;
        if (displayHour == 0) displayHour = 12; 

        System.out.printf("Time: %02d:%02d:%02d %s%n", displayHour, minutes, seconds, period);
    }

    public void displayTime24() 
	{
        System.out.printf("Time (24-hr): %02d:%02d:%02d%n", hours, minutes, seconds);
    }
}

public class Slip9Question1 
{
    public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter hours, minutes & seconds : ");
		int hr = sc.nextInt();
		int min = sc.nextInt();
		int sec = sc.nextInt();
		
        Clock c1 = new Clock(hr, min, sec); 
        c1.displayTime24();    
        c1.displayTimeAMPM();  

        Clock c2 = new Clock(hr, min, sec); 
        c2.displayTime24();
        c2.displayTimeAMPM();
    }
}
