/*Write a program to accept a text file from user and display the contents of a file in
reverse order and change its case. */

import java.io.*;
import java.util.*;
class Slip7Question2
{
	public static void main(String args[]) throws IOException
	{
		FileReader f = new FileReader("sample.txt");
		Scanner sc = new Scanner(f);
		String CH,CH2;
		while(sc.hasNext())
		{
			StringBuilder CH1 = new StringBuilder();
			CH = sc.next();
			System.out.println(CH);
			CH2=CH.toUpperCase();
			System.out.println(CH2);
			CH1.append(CH2);
			CH1.reverse();
			System.out.println(CH1);
		}
		f.close();
	}
}