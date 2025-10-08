/*Write a program to accept a string as command line argument and check whether it is a file or
directory. Also perform operations as follows:
i)If it is a directory,delete all text files in that directory. Confirm delete operation from
user before deleting text files. Also, display a count showing the number of files deleted,
if any, from the directory.
ii)If it is a file display various details of that file.*/

import java.io.*;
import java.util.Scanner;

public class Slip27Question2 
{

    public static void main(String[] args) 
	{
        if (args.length != 1) 
		{
            System.out.println("Usage: java FileDirectoryOperations <file-or-directory-path>");
            return;
        }

        File file = new File(args[0]);

        if (!file.exists()) 
		{
            System.out.println("The specified path does not exist.");
            return;
        }

        if (file.isDirectory()) 
		{
            System.out.println("It is a directory.");

            File[] textFiles = file.listFiles((dir, name) -> name.toLowerCase().endsWith(".txt"));

            if (textFiles == null || textFiles.length == 0) 
			{
                System.out.println("No .txt files found in the directory.");
                return;
            }

            System.out.println("Text files found:");
            for (File f : textFiles) 
			{
                System.out.println(" - " + f.getName());
            }

            Scanner sc = new Scanner(System.in);
            System.out.print("Do you want to delete all these .txt files? (yes/no): ");
            String response = sc.nextLine().trim().toLowerCase();

            if (response.equals("yes")) 
			{
                int deleteCount = 0;
                for (File f : textFiles) 
				{
                    if (f.delete()) 
					{
                        deleteCount++;
                    }
                }
                System.out.println(deleteCount + " .txt file(s) deleted.");
            } 
			else 
			{
                System.out.println("Deletion cancelled.");
            }
        }

        else if (file.isFile()) 
		{
            System.out.println("It is a file.");
            System.out.println("File Name   : " + file.getName());
            System.out.println("Absolute Path: " + file.getAbsolutePath());
            System.out.println("Size (bytes): " + file.length());
            System.out.println("Readable    : " + file.canRead());
            System.out.println("Writable    : " + file.canWrite());
            System.out.println("Executable  : " + file.canExecute());
            System.out.println("Last Modified: " + new java.util.Date(file.lastModified()));
        } 
		else 
		{
            System.out.println("The specified path is neither a file nor a directory.");
        }
    }
}
