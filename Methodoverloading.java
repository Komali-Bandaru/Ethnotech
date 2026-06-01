class Foodorder
{
	public void orderfood(String name)
	{
		System.out.println("Item name:"+name);
	}
	public void orderfood(String name,int quantity)
	{
		System.out.println("Item name:"+name);
		System.out.println("Item Quantity:"+quantity);
	}
	public void orderfood(String name,int quantity,double price)
	{
		System.out.println("Item name:"+name);
		System.out.println("Item Quantity:"+quantity);
		System.out.println("Item Price:"+price);
	}

	
}
public class Methodoverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Foodorder food=new Foodorder();
		food.orderfood("Chocolate");
		food.orderfood("Momos",10);
		food.orderfood("Biryani",10,100);
		

	}

}