/*Write a program to display the system date and time in various formats shown below:
Current date is : 31/08/2021
Current date is : 08-31-2021
Current date is : Tuesday August 31 2021
Current date and time is : Fri August 31 15:25:59 IST 2021
Current date and time is : 31/08/21 15:25:59 PM +0530 */

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class Slip13Question2 {

    public static void main(String[] args) {
        Date currentDate = new Date();
        Calendar calendar = new GregorianCalendar();
        calendar.setTime(currentDate);
        calendar.setTimeZone(TimeZone.getTimeZone("IST"));

        SimpleDateFormat formatter;

        // Current date is: 31/08/2021
        formatter = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Current date is : " + formatter.format(currentDate));

        // Current date is 08-31-2021
        formatter = new SimpleDateFormat("MM-dd-yyyy");
        System.out.println("Current date is : " + formatter.format(currentDate));

        // Current date is Tuesday August 31 2021
        formatter = new SimpleDateFormat("EEEE MMMM dd yyyy");
        System.out.println("Current date is : " + formatter.format(currentDate));

        // Current date and time is Fri August 31 15:25:59 IST 2021
        formatter = new SimpleDateFormat("EEE MMMM dd HH:mm:ss z yyyy");
        System.out.println("Current date and time is : " + formatter.format(currentDate));

        // 31/08/21 15:25:59 PM +0530 Current date and time is
        formatter = new SimpleDateFormat("dd/MM/yy hh:mm:ss a Z");
        System.out.println("Current date and time is : " +formatter.format(currentDate));

        
    }
}