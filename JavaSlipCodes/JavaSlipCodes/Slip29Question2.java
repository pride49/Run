/*Write a program to create a super class Vehicle having members Company and price.
Derive two different classes LightMotorVehicle(mileage) and HeavyMotorVehicle
(capacity_in_tons). Accept the information for "n" vehicles and display the information in
appropriate form. While taking data, ask user about the type of vehicle first.*/

import java.util.Scanner;

class Vehicle 
{
    protected String company;
    protected double price;

    public Vehicle(String company, double price) 
	{
        this.company = company;
        this.price = price;
    }

    public void display() 
	{
        System.out.println("Company: " + company);
        System.out.println("Price  : " + price);
    }
}

class LightMotorVehicle extends Vehicle 
{
    private double mileage;

    public LightMotorVehicle(String company, double price, double mileage) 
	{
        super(company, price);
        this.mileage = mileage;
    }

    public void display() 
	{
        super.display();
        System.out.println("Mileage: " + mileage + " km/l");
        System.out.println("Type   : Light Motor Vehicle");
        System.out.println("--------------------------------");
    }
}

class HeavyMotorVehicle extends Vehicle 
{
    private double capacityInTons;

    public HeavyMotorVehicle(String company, double price, double capacityInTons) 
	{
        super(company, price);
        this.capacityInTons = capacityInTons;
    }

    public void display() 
	{
        super.display();
        System.out.println("Capacity: " + capacityInTons + " tons");
        System.out.println("Type    : Heavy Motor Vehicle");
        System.out.println("--------------------------------");
    }
}

public class Slip29Question2 
{
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of vehicles: ");
        int n = Integer.parseInt(sc.nextLine());

        Vehicle[] vehicles = new Vehicle[n];

        for (int i = 0; i < n; i++) 
		{
            System.out.println("\nEnter details for vehicle ");
            System.out.print("Is it a Light (L) or Heavy (H) vehicle? ");
            String type = sc.nextLine().trim().toUpperCase();

            System.out.print("Enter company name: ");
            String company = sc.nextLine();

            System.out.print("Enter price: ");
            double price = Double.parseDouble(sc.nextLine());

            if (type.equals("L")) 
			{
                System.out.print("Enter mileage (km/l): ");
                double mileage = Double.parseDouble(sc.nextLine());
                vehicles[i] = new LightMotorVehicle(company, price, mileage);
            } 
			else if (type.equals("H")) 
			{
                System.out.print("Enter capacity (in tons): ");
                double capacity = Double.parseDouble(sc.nextLine());
                vehicles[i] = new HeavyMotorVehicle(company, price, capacity);
            } 
			else 
			{
                System.out.println("Invalid type entered. Skipping this vehicle.");
                i--; // Repeat this iteration
            }
        }

        System.out.println("\n--- Vehicle Details ---");
        for (Vehicle v : vehicles) 
		{
            if (v != null) 
			{
                v.display();
            }
        }
    }
}
