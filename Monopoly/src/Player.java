
public class Player
	{
		private int money;
		private int properties;
		public Player(int m, int p)
			{
				money = m;
				properties = p;
			}
		public int getMoney()
			{
				return money;
			}
		public int setMoney(int money)
			{
				return this.money = money;
			}
		public int getProperties() 
			{
				return properties;
			}
		public int setProperties(int properties) 
			{
				return this.properties = properties;
			}
	}
