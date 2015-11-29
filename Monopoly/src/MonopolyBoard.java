import java.util.ArrayList;
import java.util.Scanner;

public class MonopolyBoard
	{
		static Scanner user1nput = new Scanner (System.in);
		static ArrayList<Player> player = new ArrayList<Player>();
		public static void main(String[] args)
			{
				Player p = new Player(1500, 0);
				int spot = 0;
				boolean game = true;
				ArrayList<Properties> board = new ArrayList<Properties>();
				board.add(new Properties("Go", 0));
				board.add(new Properties("Mediterranean Avenue", 60));
				board.add(new Properties("Community Chest", 0));
				board.add(new Properties("Baltic Avenue", 60));
				board.add(new Properties("Income Tax", 200));
				board.add(new Properties("Reading Railroad", 200));
				board.add(new Properties("Oriental Avenue", 100));
				board.add(new Properties("Chance", 0));
				board.add(new Properties("Vermont Avenue", 100));
				board.add(new Properties("Connecticut Avenue", 120));
				board.add(new Properties("Jail", 0));
				board.add(new Properties("St. Charles Place", 140));
				board.add(new Properties("Electric Company", 150));
				board.add(new Properties("States Avenue", 140));
				board.add(new Properties("Virginia Avenue", 160));
				board.add(new Properties("Pennsylvania Railroad", 200));
				board.add(new Properties("St. James Place", 180));
				board.add(new Properties("Community Chest", 0));
				board.add(new Properties("Tennesse Avenue", 180));
				board.add(new Properties("New York Avenue", 200));
				board.add(new Properties("Free Parking", 0));
				board.add(new Properties("Kentucky Avenue", 220));
				board.add(new Properties("Chance", 0));
				board.add(new Properties("Indiana Avenue", 220));
				board.add(new Properties("Illinois Avenue", 240));
				board.add(new Properties("B. & O. Railroad", 200));
				board.add(new Properties("Atlantic Avenue", 260));
				board.add(new Properties("Ventor Avenue", 260));
				board.add(new Properties("Water Works", 150));
				board.add(new Properties("Marvin Gardens", 280));
				board.add(new Properties("Go To Jail", 0));
				board.add(new Properties("Pacific Avenue", 300));
				board.add(new Properties("North Carolina Avenue", 300));
				board.add(new Properties("Community Chest", 0));
				board.add(new Properties("Pennsylvania Avenue", 320));
				board.add(new Properties("Short Line", 200));
				board.add(new Properties("Chance", 0));
				board.add(new Properties("Park Place", 350));
				board.add(new Properties("Luxury Tax", 100));
				board.add(new Properties("Boardwalk", 400));
//				for(String bob : board)
//					{
//						System.out.print(board);
//					}
				while(game = true)
					{
						System.out.println("You have $" + p.getMoney() + ".");
						System.out.println("You are on " + board.get(spot).getName());
						int dice = (int)(Math.random()* 6) + 1;
						int dice1 = (int)(Math.random()* 6) + 1;
						spot = spot + dice + dice1;
						if(spot >= 40)
						{
							spot = spot - 40;
							System.out.println("You passed go and you get $200.");
							player.get(0).getMoney();
						}
						System.out.println("You rolled a " + dice + " and a " + dice1 + " and you are now on " + board.get(spot).getName() + ".");
						if(board.get(spot).getPrice() > 0)
							{
								System.out.println("Do you want to buy " + board.get(spot).getName() + " for $" + board.get(spot).getPrice() + "? (1) Purchase it. (2) Pass.");
								String buy = user1nput.nextLine();
								if(buy.equals("1"))
									{
										System.out.println("Your new amount of money is $" + (p.setMoney(p.getMoney() - board.get(spot).getPrice())) + "." );
										System.out.println("Your list of properties that you own are: ");
										
										System.out.println(p);
									}
								else
									{
										
									}
							}
					}
			}
	}
