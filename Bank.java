class Bank
{
	 private int bal;
	private int accno;
	public void setup(int bal,int accno)
	{
		this.bal=bal;
		this.accno=accno;
	}
	public void withdrawl(int accno,int amt)
	
	{
		if(this.accno==accno){
		if((bal-amt)>=0)
		{
			int rem=bal-amt;
			System.out.println("Withdrawl amount:"+amt);
			System.out.println("Available balance:"+rem);
		}
		else
		{
			System.out.println("No sufficient balance");
		}
	}
	else{
		System.out.print("Incorrect accno");
	}
	}
	public int getbal()
	{
		return bal;
	}
	public static void main(String[]args)
	{
		Bank b=new Bank();
		b.setup(10002,01);
		b.withdrawl(01,102);
		System.out.println(b.getbal());
	}
}