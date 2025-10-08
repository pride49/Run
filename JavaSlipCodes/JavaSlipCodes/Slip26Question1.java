/*Define a Item class (item_number, item_name, item_price). Define a default and parameterized
constructor. Keep a count of objects created. Create objects using parameterized constructor
and display the object count after each object is created.(Use static member and method). Also
display the contents of each object.*/

class Slip26Question1 
{
    private int item_number;
    private String item_name;
    private double item_price;

    private static int count = 0;

    // Default constructor
    public Slip26Question1() 
	{
        item_number = 0;
        item_name = "Not Available";
        item_price = 0.0;
        count++;
    }

    // Parameterized constructor
    public Slip26Question1(int item_number, String item_name, double item_price) 
	{
        this.item_number = item_number;
        this.item_name = item_name;
        this.item_price = item_price;
        count++;  // Increment object count
    }

    public static int getCount() 
	{
        return count;
    }

    public void displayItem() 
	{
        System.out.println("Item Number: " + item_number);
        System.out.println("Item Name  : " + item_name);
        System.out.println("Item Price : Rs. " + item_price);
        System.out.println("-----------------------------");
    }

    public static void main(String[] args) 
	{
        Slip26Question1 item1 = new Slip26Question1(101, "Notebook", 45.50);
        item1.displayItem();
        System.out.println("Items created: " + Slip26Question1.getCount());

        Slip26Question1 item2 = new Slip26Question1(102, "Pen", 10.00);
        item2.displayItem();
        System.out.println("Items created: " + Slip26Question1.getCount());

        Slip26Question1 item3 = new Slip26Question1(103, "Pencil", 5.00);
        item3.displayItem();
        System.out.println("Items created: " + Slip26Question1.getCount());
    }
}
