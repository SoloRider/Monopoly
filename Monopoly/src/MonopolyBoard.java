import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class MonopolyBoard
	{
		static Scanner user1nput = new Scanner (System.in);
		public static void main(String[] args) throws IOException
			{
				int i = 0;
				Scanner file = new Scanner(new File("StarWarsMonopoly.txt"));
				Scanner file1 = new Scanner(new File("RegularMonopoly.txt"));
				System.out.println("What category do you want Star Wars(1) or Regular(2)?");
				String category = user1nput.nextLine();
				ArrayList<Properties> inventory = new ArrayList<Properties>();
				Player p = new Player(1500, 0);
				int spot = 0;
				boolean game = true;
				ArrayList<String> stuff = new ArrayList<String>();
				if(category.equals("1"))
					{
						while(file.hasNext())
							{
								stuff.add(file.nextLine());
							}
					}
				else
					{
						while(file1.hasNext())
							{
								stuff.add(file.nextLine());
							}
					}
				ArrayList<Properties> board = new ArrayList<Properties>();
				board.add(new Properties(stuff.get(i), 0));
				
				board.add(new Properties(stuff.get(i), 60));
				
				board.add(new Properties(stuff.get(i), 0));
				
				board.add(new Properties(stuff.get(i), 60));
				
				board.add(new Properties(stuff.get(i), -200));
				
				board.add(new Properties(stuff.get(i), -200));
				
				board.add(new Properties(stuff.get(i), 100));
				
				board.add(new Properties(stuff.get(i), 0));
				
				board.add(new Properties(stuff.get(i), 100));
				
				board.add(new Properties(stuff.get(i), 120));
				
				board.add(new Properties(stuff.get(i), 0));
				
				board.add(new Properties(stuff.get(i), 140));
				
				board.add(new Properties(stuff.get(i), -150));
				
				board.add(new Properties(stuff.get(i), 140));
				
				board.add(new Properties(stuff.get(i), 160));
				
				board.add(new Properties(stuff.get(i), -200));
				
				board.add(new Properties(stuff.get(i), 180));
				
				board.add(new Properties(stuff.get(i), 0));
				
				board.add(new Properties(stuff.get(i), 180));
				
				board.add(new Properties(stuff.get(i), 200));
				
				board.add(new Properties(stuff.get(i), 0));
				
				board.add(new Properties(stuff.get(i), 220));
				
				board.add(new Properties(stuff.get(i), 0));
				
				board.add(new Properties(stuff.get(i), 220));
				
				board.add(new Properties(stuff.get(i), 240));
				
				board.add(new Properties(stuff.get(i), -200));
				
				board.add(new Properties(stuff.get(i), 260));
				
				board.add(new Properties(stuff.get(i), 260));
				
				board.add(new Properties(stuff.get(i), -150));
				
				board.add(new Properties(stuff.get(i), 280));
				
				board.add(new Properties(stuff.get(i), 0));
				
				board.add(new Properties(stuff.get(i), 300));
				
				board.add(new Properties(stuff.get(i), 300));
				
				board.add(new Properties(stuff.get(i), 0));
				
				board.add(new Properties(stuff.get(i), 320));
				
				board.add(new Properties(stuff.get(i), -200));
				
				board.add(new Properties(stuff.get(i), 0));
				
				board.add(new Properties(stuff.get(i), 350));
				
				board.add(new Properties(stuff.get(i), -100));
				
				board.add(new Properties(stuff.get(i), 400));
				while(game = true)
					{
						System.out.println("You have " + p.getMoney() + " credits.");
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
								System.out.println("Do you want to buy " + board.get(spot).getName() + " for " + board.get(spot).getPrice() + " credits? (1) Purchase it. (2) Pass.");
								String buy = user1nput.nextLine();
								if(buy.equals("1"))
									{
										System.out.println("Your new amount of money is " + (p.setMoney(p.getMoney() - board.get(spot).getPrice())) + " credits." );
										System.out.println("Your properties are: ");
										inventory.add(board.get(spot));
										for(Properties b : inventory)
											{
												System.out.println("You now own " + b.getName() + ".");
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
