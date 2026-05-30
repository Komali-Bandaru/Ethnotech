class User
{
	public int bookaride()
	{
		System.out.println("=========Booking a ride============");
		return 0;
	}
}
class Bike extends User
{
	public int bookaride()
	{
		System.out.println("The amount for the bike ride is: 100");
		return 100;
	}
}
class Car extends User
{
	public int bookaride()
	{
		System.out.println("The amount for the Car ride is: 300");
		return 300;
	}
}
class Auto extends User
{
	public int bookaride()
	{
		System.out.println("The fare amount for the Auto ride is: 200");
		return 200;
	}
}
class ridebooking
{
	public static void main (String[]args)
	{
			User u=new User();
			u.bookaride();
			Bike b=new Bike();
			int br=b.bookaride();
			Car c=new Car();
			int cr=c.bookaride();
			Auto a=new Auto();
			int ar=a.bookaride();
			if(br<=cr&&br<=ar)
			{
				System.out.println("Best ride for you is:Bike\nFare amount for the ride is: 100");
			}
			else if(cr<=br&&cr<=ar)
			{
				System.out.println("Best ride for you is:Car\nFare amount for the car is: 200");
			}
			else
			{
				System.out.println("Best ride for you is:Auto\nFare amount for the auto is: 300");
			}

	}
}