/*Write a program to accept a file name from command prompt, if the file exits then display
number of words and lines in that file.*/

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Slip13Question1 
{

    public static void main(String[] args) 
	{
        if (args.length != 1) 
		{
            System.out.println("Usage: java FileStats <filename>");
            return;
        }

        String fileName = args[0];
        File file = new File(fileName);

        if (!file.exists() || !file.isFile()) 
		{
            System.out.println("File '" + fileName + "' does not exist.");
            return;
        }

        int lineCount = 0;
        int wordCount = 0;

        try (Scanner scanner = new Scanner(file)) 
		{
            while (scanner.hasNextLine()) 
			{
                String line = scanner.nextLine();
                lineCount++;

                String[] words = line.trim().split("\\s+");
                if (!line.trim().isEmpty()) 
				{
                    wordCount += words.length;
                }
            }

            System.out.println("Number of lines: " + lineCount);
            System.out.println("Number of words: " + wordCount);

        } 
		catch (FileNotFoundException e) 
		{
            System.out.println("Error reading the file: " + e.getMessage());
        }
    }
}
