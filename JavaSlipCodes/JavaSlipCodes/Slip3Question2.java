
/*Define a class patient (patient_name, patient_age, patient_oxy_level,patient_HRCT_report).
Create an object of patient. Handle appropriate exception while patient oxygen level less than
95% and HRCT scan report greater than 10, then throw user defined Exception “Patient is Covid
Positive(+) and Need to Hospitalized” otherwise display its information. */

import java.util.*;
import java.util.Scanner;

class LessOxygenandLowHRCT extends Exception    // USER DEFINE EXCEPTION
{
  public String toString()
  {
  	return "patient is covid Positive and need to hospitalized..!";
  }
}

class Patient
{
 String pname;
 int page,plevel,hrct;
 void patientinfo() 
 {
 	try
 	{
 		Scanner s = new Scanner(System.in);
 		System.out.println("Enter the name of paitent :");
 		pname = s.next();
 		System.out.println("Enter the age of paitent :");
 		page = s.nextInt();
 		System.out.println("Enter the Oxygen level :");
 		plevel = s.nextInt();
 		System.out.println("Enter the HRCT level :");
 		hrct = s.nextInt();
 		if(plevel<95 && hrct>10 )
 		{
 			throw new LessOxygenandLowHRCT();
 		}
 		else
 		{
 		 System.out.println("Paitient information:");
 		 System.out.println("Paitient name:"+pname);
 		 System.out.println("Paitient Age:"+page);
 		 System.out.println("Paitient Oxygen Level:"+plevel);
 		 System.out.println("Paitient HRCT:"+hrct);
 		}
 	}
    catch(LessOxygenandLowHRCT e)
    {
        System.out.println(e);
    }
 }
}

public class Slip3Question2
{
	public static void main(String args[]) 
	{
		Patient p =new Patient();
		p. patientinfo();
	}
}
