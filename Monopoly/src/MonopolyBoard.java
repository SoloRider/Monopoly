import java.util.ArrayList;
import java.util.Scanner;

public class MonopolyBoard
	{
		public static void main(String[] args)
			{
				boolean game = true;
				ArrayList <String> board = new ArrayList<String>();
				board.add("Go");
				board.add("Mediterranean Avenue");
				board.add("Community Chest");
				board.add("Baltic Avenue");
				board.add("Income Tax");
				board.add("Reading Railroad");
				board.add("Oriental Avenue");
				board.add("Chance");
				board.add("Vermont Avenue");
				board.add("Connecticut Avenue");
				board.add("Jail");
				board.add("St. Charles Place");
				board.add("Electric Company");
				board.add("States Avenue");
				board.add("Virginia Avenue");
				board.add("Pennsylvania Railroad");
				board.add("St. James Place");
				board.add("Community Chest");
				board.add("Tennesse Avenue");
				board.add("New York Avenue");
				board.add("Free Parking");
				board.add("Kentucky Avenue");
				board.add("Chance");
				board.add("Indiana Avenue");
				board.add("Illinois Avenue");
				board.add("B. & O. Railroad");
				board.add("Atlantic Avenue");
				board.add("Ventor Avenue");
				board.add("Water Works");
				board.add("Marviin Gardens");
				board.add("Go To Jail");
				board.add("Pacific Avenue");
				board.add("North Carolina Avenue");
				board.add("Community Chest");
				board.add("Pennsylvania Avenue");
				board.add("Short Line");
				board.add("Chance");
				board.add("Park Place");
				board.add("Luxury Tax");
				board.add("Boardwalk");
				for(String bob : board)
					{
						System.out.print(board);
					}
				while(game = true)
					{
						int spot = 0;
						int dice = (int)(Math.random()* 6);
						int dice1 = (int)(Math.random()* 6);
						spot = spot + dice + dice1;
						if(spot > 40)
							{
								spot = spot - 40;
							}
						System.out.println("You rolled a " + dice + " and a " + dice1 + " and you are now on " + spot + ".");
						System.out.println("You are on " + board.get(spot));
					}
			}
	}
