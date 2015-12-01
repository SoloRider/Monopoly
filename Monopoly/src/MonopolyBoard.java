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
				board.add(new Properties("Dagobah: Swamp", 60));
				board.add(new Properties("Republic Card", 0));
				board.add(new Properties("Dagobah: Yoda's Hut", 60));
				board.add(new Properties("Docking Tax", 200));
				board.add(new Properties("Tie Fighter", 200));
				board.add(new Properties("Hoth: Frozen Plain", 100));
				board.add(new Properties("Imperial Card", 0));
				board.add(new Properties("Hoth: North Bridge", 100));
				board.add(new Properties("Hoth: Echo Base", 120));
				board.add(new Properties("Jail", 0));
				board.add(new Properties("Tatooine: Lars Homestead", 140));
				board.add(new Properties("Rebel Core", 150));
				board.add(new Properties("Tatooine: Mos Eisley", 140));
				board.add(new Properties("Tatooine: Jabba's Palace", 160));
				board.add(new Properties("Millenium Falcon", 200));
				board.add(new Properties("Yavin Four: War Room", 180));
				board.add(new Properties("Rebel Card", 0));
				board.add(new Properties("Yavin Four: Massassi Temple", 180));
				board.add(new Properties("Yavin Four: Temple Throne Room", 200));
				board.add(new Properties("Free Parking", 0));
				board.add(new Properties("Cloud City: Landing Platform", 220));
				board.add(new Properties("Imperial Card", 0));
				board.add(new Properties("Cloud City: Carbon Freezing Chamber", 220));
				board.add(new Properties("Cloud City: Reactor Control Room", 240));
				board.add(new Properties("X-Wing Fighter", 200));
				board.add(new Properties("Death Star: Landing Bay", 260));
				board.add(new Properties("Death Star: Central Core", 260));
				board.add(new Properties("Moisture Farm", 150));
				board.add(new Properties("Death star: Throne Room", 280));
				board.add(new Properties("Go To Jail", 0));
				board.add(new Properties("Endor: Forest", 300));
				board.add(new Properties("Endor: Sheild Generator", 300));
				board.add(new Properties("Rebel Card", 0));
				board.add(new Properties("Endor: Ewok Village", 320));
				board.add(new Properties("Star Destroyer", 200));
				board.add(new Properties("Imperial card", 0));
				board.add(new Properties("Coruscant: Monument Square", 350));
				board.add(new Properties("Bounty", 100));
				board.add(new Properties("Coruscant: Imperial Palace", 400));
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
//								System.out.println("You passed go and you get $200.");
//								player.get(0).getMoney();
							}
						System.out.println("You rolled a " + dice + " and a " + dice1 + " and you are now on " + board.get(spot).getName() + ".");
						if(board.get(spot).getPrice() > 0)
							{
								System.out.println("Do you want to buy " + board.get(spot).getName() + " for $" + board.get(spot).getPrice() + "? (1) Purchase it. (2) Pass.");
								String buy = user1nput.nextLine();
								if(buy.equals("1"))
									{
										System.out.println("Your new amount of money is $" + (p.setMoney(p.getMoney() - board.get(spot).getPrice())) + "." );
										System.out.println("Your properties are: ");
										for(int i = 0; i > player.size(); i++)
											{
												System.out.println( + ", ");
											}
									}
								else
									{
										
									}
							}
						System.out.println();
					}
			}
	}
