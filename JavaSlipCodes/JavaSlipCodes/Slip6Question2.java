
/*Create an abstract class “order” having members id, description. Create two subclasses
“PurchaseOrder” and “Sales Order” having members customer name and Vendor name
respectively. Definemethods accept and display in all cases. Create 3 objects each of Purchase
Order and Sales Order and accept and display details.*/

import java.util.Scanner;

abstract class Order 
{
 int id;
 String description;

 abstract void accept(Scanner sc);
 abstract void display();
}

class PurchaseOrder extends Order 
{
 String customerName;

 void accept(Scanner sc) 
 {
     System.out.print("Enter Purchase Order ID: ");
     id = sc.nextInt();
     sc.nextLine(); 
     System.out.print("Enter Description: ");
     description = sc.nextLine();
     System.out.print("Enter Customer Name: ");
     customerName = sc.nextLine();
 }

 void display() 
 {
     System.out.println("Purchase Order => ID: " + id + ", Description: " + description + ", Customer: " + customerName);
 }
}

class SalesOrder extends Order 
{
 String vendorName;

 void accept(Scanner sc) 
 {
     System.out.print("Enter Sales Order ID: ");
     id = sc.nextInt();
     sc.nextLine(); // clear buffer
     System.out.print("Enter Description: ");
     description = sc.nextLine();
     System.out.print("Enter Vendor Name: ");
     vendorName = sc.nextLine();
 }

 void display() 
 {
     System.out.println("Sales Order => ID: " + id + ", Description: " + description + ", Vendor: " + vendorName);
 }
}

public class Slip6Question2 
{
 public static void main(String[] args) 
 {
     Scanner sc = new Scanner(System.in);

     PurchaseOrder[] pOrders = new PurchaseOrder[3];
     for (int i = 0; i < 3; i++) 
     {
         System.out.println("\nEnter details for Purchase Order " + (i + 1));
         pOrders[i] = new PurchaseOrder();
         pOrders[i].accept(sc);
     }

     SalesOrder[] sOrders = new SalesOrder[3];
     for (int i = 0; i < 3; i++) 
     {
         System.out.println("\nEnter details for Sales Order " + (i + 1));
         sOrders[i] = new SalesOrder();
         sOrders[i].accept(sc);
     }

     System.out.println("\n--- Purchase Orders ---");
     for (PurchaseOrder po : pOrders) 
     {
         po.display();
     }

     System.out.println("\n--- Sales Orders ---");
     for (SalesOrder so : sOrders) 
     {
         so.display();
     }

 }
}