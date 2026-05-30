class bankinherit extends Bank
{
	bankinherit(int bal,int accno,String name)
	{
		super(bal,accno,name);
	}
	public static void main(String[]args)
	{
		Bank b=new Bank(10000,01,"Komi");
		b.displayinfo();
		b.deposit(01,5000);
		b.withdrawl(01,2000);
		Bank b2=new Bank(10000,02,"Ammu");
		b2.displayinfo();
		b2.deposit(02,10000);
		b2.withdrawl(02,5000);
	}
}