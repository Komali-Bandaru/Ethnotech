class Bank
{
	 private int bal;
	private int accno;
	public String name;
	Bank(int bal,int accno,String name)
	{
		this.bal=bal;
		this.accno=accno;
		this.name=name;
	}
	public void withdrawl(int accno,int amt)
	
	{
		if(this.accno==accno){
		if((this.bal-amt)>=0)
		{
			System.out.println("Withdrawl Amount:"+amt);
			System.out.println("Withdrawl completed......");
			this.bal=bal-amt;
			System.out.println("Available balance:"+this.bal);
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
		return this.bal;
	}
	public void displayinfo()
	{
		System.out.println("Name:"+this.name);
		System.out.println("Account Number:"+this.accno);
		System.out.println("Balance:"+this.bal);
		
	}
	public void deposit(int accno,int amt)
	{
		if(this.accno==accno){
		System.out.println("Deposit Amount:"+amt);
		System.out.println("Deposit completed...");
		this.bal=bal+amt;
		System.out.println("Available balance:"+this.bal);
		}
		else{
			System.out.println("Incorrect account");
		}
	}
}