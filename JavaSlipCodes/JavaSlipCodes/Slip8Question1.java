
/*) Create a class Sphere, to calculate the volume and surface area of sphere.
(Hint : Surface area=4*3.14(r*r), Volume=(4/3)3.14(r*r*r))*/

import java.util.Scanner;
class Sphere 
{
    private double radius;

    public Sphere(double radius) 
	{
        this.radius = radius;
    }

    public double getSurfaceArea() 
	{
        return 4 * 3.14 * (radius * radius);
    }

    public double getVolume() 
	{
        return (4.0 / 3.0) * 3.14 * (radius * radius * radius);
    }
}

public class Slip8Question1 
{
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius of the sphere: ");
        double r = sc.nextDouble();

        Sphere s = new Sphere(r);

        System.out.println("Surface Area of Sphere: " + s.getSurfaceArea());
        System.out.println("Volume of Sphere: " + s.getVolume());

        sc.close();
    }
}
