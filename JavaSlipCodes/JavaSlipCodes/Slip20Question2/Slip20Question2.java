/*Write a package for Operation, which has two classes, Addition and Maximum. Addition has two methods 
add () and subtract (), which are used to add two integers and subtract two, float values respectively. 
Maximum has a method max () to display the maximum of two integers*/

import operation.Addition;
import operation.Maximum;
import java.util.*;

public class Slip20Question2 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        Addition addObj = new Addition();
        Maximum maxObj = new Maximum();
        
        System.out.println("Enter Two Numbers for addition");
        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum = addObj.add(a, b);
        
        System.out.println("Enter Two Numbers for Subtraction");
        float c = sc.nextFloat();
        float d = sc.nextFloat();
        
        float diff = addObj.subtract(c, d);

        int maximum = maxObj.max(a, b);

        System.out.println("Addition of integers: " + sum);
        System.out.println("Subtraction of floats: " + diff);
        System.out.println("Maximum of integers: " + maximum);
    }
}
