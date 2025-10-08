/*Write a program to create an abstract class named Shape that contains two integers and an
empty method named printArea(). Provide three classes named Rectangle, Triangle and Circle
such that each one of the classes extends the class Shape. Each one of the classes contain only
the method printArea() that prints the area of the given shape. (use method overriding).*/

abstract class Shape 
{
    int a, b;  
    public Shape(int a, int b) 
	{
        this.a = a;
        this.b = b;
    }
    abstract void printArea();
}

class Rectangle extends Shape 
{
    public Rectangle(int length, int breadth) 
	{
        super(length, breadth);
    }

    void printArea() 
	{
        int area = a * b;
        System.out.println("Area of Rectangle: " + area);
    }
}

class Triangle extends Shape 
{
    public Triangle(int base, int height) 
	{
        super(base, height);
    }

    void printArea() 
	{
        double area = 0.5 * a * b;
        System.out.println("Area of Triangle: " + area);
    }
}

class Circle extends Shape 
{
    public Circle(int radius, int dummy) 
	{
        super(radius, dummy);  
    }

    void printArea() 
	{
        double area = Math.PI * a * a;  
        System.out.println("Area of Circle: " + area);
    }
}

public class Slip22Question1 
{
    public static void main(String[] args) 
	{
        Shape rectangle = new Rectangle(10, 5);
        rectangle.printArea();

        Shape triangle = new Triangle(8, 6);
        triangle.printArea();

        Shape circle = new Circle(7, 0);  
        circle.printArea();
    }
}

