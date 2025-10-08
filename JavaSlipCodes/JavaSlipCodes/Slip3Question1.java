
/*Write a program to accept ‘n’ name of cities from the user and sort them in ascending
order.*/

import java.util.*;

public class Slip3Question1 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of cities: ");
        int n = sc.nextInt();
        sc.nextLine(); // to consume newline
        String cities[] = new String[n];
        for (int i = 0; i < n; i++) 
        {
            System.out.print("Enter city name: ");
            cities[i] = sc.nextLine();
        }
        
        Arrays.sort(cities);

        System.out.println("Sorted city names:");
        for(int i=0;i<n;i++)
        {
        	System.out.println(cities[i]);
        }

	}

}
