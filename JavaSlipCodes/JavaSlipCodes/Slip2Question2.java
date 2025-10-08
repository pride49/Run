
/*Define a class CricketPlayer (name,no_of_innings,no_of_times_notout, totatruns, bat_avg).
Create an array of n player objects .Calculate the batting average for each player using static
method avg(). Define a static sort method which sorts the array on the basis of average. Display
the player details in sorted order.*/

import java.util.*;

class CricketPlayer {
    String name;
    int no_of_innings;
    int no_of_times_notout;
    int totalruns;
    double bat_avg;

    CricketPlayer(String name, int innings, int notout, int runs) 
    {
        this.name = name;
        this.no_of_innings = innings;
        this.no_of_times_notout = notout;
        this.totalruns = runs;
        this.bat_avg = 0.0;  // will be calculated
    }

    static void avg(CricketPlayer player) 
    {
        int outs = player.no_of_innings - player.no_of_times_notout;
        if (outs > 0)
            player.bat_avg = (double) player.totalruns / outs;
        else
            player.bat_avg = player.totalruns; // if never out
    }

    static void sortPlayers(CricketPlayer[] players) 
    {
        Arrays.sort(players, (p1, p2) -> Double.compare(p2.bat_avg, p1.bat_avg));
    }

    void display() 
    {
        System.out.println(name+", "+no_of_innings+", "+no_of_times_notout+", "+totalruns+", "+bat_avg);
    }
}


public class Slip2Question2 {
	
	 public static void main(String[] args) 
	 {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter number of players: ");
	        int n = sc.nextInt();
	        sc.nextLine();

	        CricketPlayer[] players = new CricketPlayer[n];

	        for (int i = 0; i < n; i++) {
	            System.out.println("\nEnter details for player " + (i + 1));
	            System.out.print("Name: ");
	            String name = sc.nextLine();
	            System.out.print("No. of Innings: ");
	            int innings = sc.nextInt();
	            System.out.print("No. of Times Not Out: ");
	            int notout = sc.nextInt();
	            System.out.print("Total Runs: ");
	            int runs = sc.nextInt();
	            sc.nextLine();

	            players[i] = new CricketPlayer(name, innings, notout, runs);

	            CricketPlayer.avg(players[i]);
	        }

	        CricketPlayer.sortPlayers(players);

	        System.out.println("\n===== Player Statistics (Sorted by Batting Average) =====");
	        System.out.println("Name, Innings, NotOut, Runs, Average");
	        System.out.println("-------------------------------------------------------------");

	        for (CricketPlayer p : players) 
	        {
	            p.display();
	        }

	    }

}
