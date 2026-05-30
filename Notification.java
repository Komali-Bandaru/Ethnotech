interface Notify
{
	void sending(String msg);
	void Receving(String msg);
	static void Notifi(String msg)
	{
		System.out.println("\nNotification:"+msg+" Your mobile data is completedddddd.....");
	}
}
class Mobile implements Notify
{
	public void sending(String msg)
	{
	System.out.println("\nMessage:"+msg+" Send Successfully");}
		public void Receving(String msg)
		{
			System.out.println("\nMessage:"+msg+" from the sender is received Successfully");
		}
	public void Notifi(String msg)
	{
		System.out.println("\nNotification:"+msg+" Your mobile data is completed");
	}
}
class Instagram implements Notify
{
	public void sending(String msg)
	{
	System.out.println("\nMessage:"+msg+" send to Komali");}
		public void Receving(String msg)
		{
			System.out.println("\nMessage:"+msg+" got from Komss");
		}
	public void Notifi(String msg)
	{
		System.out.println("\nNotification:"+msg+" You have a new post to see");
	}
}
class Whatsapp implements Notify
{
	public void sending(String msg)
	{
	System.out.println("\nMessage:"+msg+" Send to Rashmi");}
		public void Receving(String msg)
		{
			System.out.println("\nMessage:"+msg+" got from raashu");
		}
	public void Notifi(String msg)
	{
		System.out.println("\nNotification:"+msg+" You have a missed video call from Rashmi");
	}
}
class Notification{
public static void main(String[]args)
{
	Mobile m=new Mobile();
	System.out.println("\n=========MOBILE NOTIFICATIONS==========");
	m.sending("Hii");
	m.Receving("Hii");
	Notify.Notifi("hey, ");
	Instagram i=new Instagram();
	System.out.println("\n=========INSTAGRAM NOTIFICATIONS==========");
	i.sending("Hii");
	i.Receving("Hii");
	i.Notifi("hey, ");
	Whatsapp w=new Whatsapp();
	System.out.println("\n=========WHATSAPP NOTIFICATIONS==========");
	w.sending("Hii");
	w.Receving("Hii");
	w.Notifi("hey, ");
} 
}