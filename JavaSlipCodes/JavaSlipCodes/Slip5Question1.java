
/*Write a program for multilevel inheritance such that Country is inherited from Continent.
State is inherited from Country. Display the place, State, Country and Continent. */

import java.util.Scanner;

class Continent {
	Scanner sc = new Scanner(System.in);
    String continent = sc.nextLine();
}

class Country extends Continent {
    String country = sc.nextLine();
}

class State extends Country {
    String state = sc.nextLine();
    String place = sc.nextLine();

    void display() {
        System.out.println("Continent: " + continent);
        System.out.println("Country: " + country);
        System.out.println("State: " + state);
        System.out.println("Place: " + place);
    }
}

public class Slip5Question1 {
    public static void main(String[] args) {
    	
    	System.out.println("Enter the name of continent, country, state & place");
        
    	State obj = new State();
        obj.display();
    }
}