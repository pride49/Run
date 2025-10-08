/*Write a program that reads on file name from the user, then displays information about
whether the file exists, whether the file is readable, whether the file is writable, the type of
file and the length of the file in bytes.*/

import java.io.File;
import java.util.Scanner;

public class Slip28Question1 
{
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the file name or path: ");
        String filePath = sc.nextLine();

        File file = new File(filePath);

        System.out.println("\n--- File Information ---");

        if (file.exists()) 
		{
            System.out.println("File exists       : Yes");
            System.out.println("Readable          : " + file.canRead());
            System.out.println("Writable          : " + file.canWrite());
            System.out.println("Type              : " + (file.isFile() ? "Regular File" : "Directory"));
            System.out.println("Length (in bytes) : " + file.length());
        } 
		else 
		{
            System.out.println("File exists       : No");
        }
    }
}
