/*Write a Program to illustrate multilevel Inheritance such that country is inherited from
continent. State is inherited from country. Display the place, state, country and continent.*/

import java.util.Scanner;
class Continent 
{
	Scanner sc = new Scanner(System.in);
    String continent = sc.nextLine();
}

class Country extends Continent 
{
    String country = sc.nextLine();
}

class State extends Country 
{
    String state = sc.nextLine();
    String place = sc.nextLine();
    void display() 
	{
        System.out.println("Continent: " + continent);
        System.out.println("Country: " + country);
        System.out.println("State: " + state);
        System.out.println("Place: " + place);
    }
}

public class Slip20Question1 
{
    public static void main(String[] args) 
	{
    	System.out.println("Enter the name of continent, country, state & place");
    	State obj = new State();
        obj.display();
    }
}