/*Define a class ‘Donor’ to store the below mentioned details of a blood donor. name, age,
address, contactnumber, bloodgroup, date of last donation. Create ‘n’ objects of this class for
all the regular donors at Pune. Write these objects to a file. Read these objects from the file and
display only those donors’ details whose blood group is ‘A+ve’ and had not donated for the
recent six months.*/

import java.io.*;
import java.util.*;
import java.time.*;
import java.time.format.DateTimeFormatter;

class Slip26Question2 implements Serializable 
{
    private String name;
    private int age;
    private String address;
    private String contactNumber;
    private String bloodGroup;
    private LocalDate lastDonationDate;

    // Constructor
    public Slip26Question2(String name, int age, String address, String contactNumber, String bloodGroup, LocalDate lastDonationDate) 
	{
        this.name = name;
        this.age = age;
        this.address = address;
        this.contactNumber = contactNumber;
        this.bloodGroup = bloodGroup;
        this.lastDonationDate = lastDonationDate;
    }

    public boolean isEligible() 
	{
        return bloodGroup.equalsIgnoreCase("A+ve") &&
               lastDonationDate.isBefore(LocalDate.now().minusMonths(6));
    }

    public void display() 
	{
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        System.out.println("Name          : " + name);
        System.out.println("Age           : " + age);
        System.out.println("Address       : " + address);
        System.out.println("Contact No.   : " + contactNumber);
        System.out.println("Blood Group   : " + bloodGroup);
        System.out.println("Last Donation : " + lastDonationDate.format(formatter));
        System.out.println("----------------------------------------");
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException 
	{
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of donors: ");
        int n = sc.nextInt();
        sc.nextLine();

        List<Slip26Question2> donorList = new ArrayList<>();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        for (int i = 0; i < n; i++) 
		{
            System.out.println("\nEnter details for donor " + (i + 1) + ":");

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Age: ");
            int age = Integer.parseInt(sc.nextLine());

            System.out.print("Address: ");
            String address = sc.nextLine();

            System.out.print("Contact Number: ");
            String contact = sc.nextLine();

            System.out.print("Blood Group: ");
            String bloodGroup = sc.nextLine();

            System.out.print("Date of Last Donation (dd-MM-yyyy): ");
            String dateStr = sc.nextLine();
            LocalDate lastDonationDate = LocalDate.parse(dateStr, formatter);

            donorList.add(new Slip26Question2(name, age, address, contact, bloodGroup, lastDonationDate));
        }

        FileOutputStream fos = new FileOutputStream("donors.dat");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(donorList);
        oos.close();
        fos.close();

        FileInputStream fis = new FileInputStream("donors.dat");
        ObjectInputStream ois = new ObjectInputStream(fis);
        List<Slip26Question2> savedDonors = (List<Slip26Question2>) ois.readObject();
        ois.close();
        fis.close();

        System.out.println("\n\nEligible Donors (A+ve & not donated in last 6 months):");
        System.out.println("--------------------------------------------------------");
        boolean found = false;
        for (Slip26Question2 d : savedDonors) 
		{
            if (d.isEligible()) 
			{
                d.display();
                found = true;
            }
        }

        if (!found) 
		{
            System.out.println("No eligible donors found.");
        }
    }
}
