abstract class foodorder
{
	String customername;
	int price;
	String flavour;
	int quantity;
	foodorder(String customername,int price,String flavour,int quantity)
	{
		this.customername=customername;
		this.price=price;
		this.flavour=flavour;
		this.quantity=quantity;
	}
	void display()
	{
		System.out.println("Welcome,Do you want to order something........");
	}
	abstract boolean orderfood(int quantity,String flavour);
	void displaybill()
	{
		System.out.println("  Happy order ");
		System.out.println("------------------");
		System.out.println("CustomerName:"+customername);
		System.out.println("Ordered item:"+flavour);
		System.out.println("Quantity Ordered:"+quantity);
		System.out.println("Amount:"+(price*quantity));
		System.out.println("----Thank you----");
	}
}
class abstfoodorder extends foodorder
{
	abstfoodorder(String customername,int price,String flavour,int quantity)
	{
		super(customername,price,flavour,quantity);
	}
	boolean orderfood(int quantity,String flavour)
	{
		if(this.flavour.equals(flavour))
		{
			this.quantity=quantity;
			return true;
		}
		else
		{
			return false;
		}
	}
	public static void main(String []args)
	{
		foodorder a=new abstfoodorder("komi",100,"chocolate",2);
		a.display();
		if(a.orderfood(2,"chocolate"))
		{
			System.out.println("Order confirmed..");
			a.displaybill();
		}
		else{
			System.out.println("Choosen flavour is not available");
	}
	foodorder a2=new abstfoodorder("Ammu",150,"butterscoth",4);
	if(a2.orderfood(4,"strawberry"))
		{
			System.out.println("Order confirmed..");
			a.displaybill();
		}
		else{
			System.out.println("Choosen flavour is not available");
	}
	}
}