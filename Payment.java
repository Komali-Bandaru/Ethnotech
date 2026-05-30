interface cash
{
	void handcash(int amt);
}
interface upi
{
	void onlinepay(int amt,int tranid);
}
class paymode implements cash,upi{
	public void handcash(int amt)
	{
		System.out.println("Payment done by Hand Cash:"+amt);
	}
	public void onlinepay(int amt,int tranid)
	{
		System.out.println("Payment done in online mode or upi\nDetails of the payment:\n1.Transcation id:"+tranid+"\n2.Amount:"+amt);
	}
}
class Payment
{
	public static void main(String[]args){
	paymode p=new paymode();
	p.handcash(5000);
	p.onlinepay(2000,10020003);
}
}