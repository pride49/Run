/*Accept the names of two files and copy the contents of the first to the second. First file having
Book name and Author name in file.*/

import java.io.*;
import java.util.*;

class Slip15Question1
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Source file name:\n");
		String file1 = sc.next();
		System.out.println("Destination file name:\n");
		String file2 = sc.next();
		
		FileReader fin = new FileReader(file1);
	    FileWriter fout = new FileWriter(file2, false);

	    int c;
	    while((c = fin.read()) != -1)
	    {
			fout.write(c);
	    }

		fout.write("\nThe End of file..");
		System.out.println("Copy Finish...");
	
		fin.close();
		fout.close();
	}
}