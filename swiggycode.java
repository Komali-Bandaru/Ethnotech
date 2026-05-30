abstract class FoodItem
{
    String item;
    int price;
    int availquantity;

    FoodItem(String item,int price,int availquantity)
    {
        this.item = item;
        this.price = price;
        this.availquantity = availquantity;
    }

    void display()
    {
        System.out.println("\n\n\nWelcome, Do you want to order something...");
    }

    void displayMenu()
    {
        System.out.println(item +
        " Price:" + price );
    }

    // Abstract Method
    abstract boolean placeOrder(int quantity);

    void generateBill(int quantity)
    {
        System.out.println("\n====== Swiggy Bill =======");
        System.out.println("Ordered item: " + item);
        System.out.println("Price: " + price);
        System.out.println("Quantity Ordered: " + quantity);
        System.out.println("Amount: " + (price * quantity));
        System.out.println("---- Thank you ----");
    }
}

class RestaurantItem extends FoodItem
{
    RestaurantItem(String item,int price,int availquantity)
    {
        super(item,price,availquantity);
    }

    // Method Overriding
    boolean placeOrder(int reqquantity)
    {
        if(reqquantity <= availquantity)
        {
            availquantity = availquantity - reqquantity;
            return true;
        }
        else
        {
            return false;
        }
    }
}

class swiggycode
{
    public static void main(String []args)
    {
        FoodItem menu[] =
        {
            new RestaurantItem("Chicken Biryani", 250, 12),
            new RestaurantItem("Veg Fried Rice", 180, 8),
            new RestaurantItem("Pizza", 300, 5),
            new RestaurantItem("Burger", 120, 15),
            new RestaurantItem("Waffle", 150, 6),
            new RestaurantItem("Roti", 25, 40),
            new RestaurantItem("Paneer Curry", 220, 7),
            new RestaurantItem("Ice Cream", 90, 20),
            new RestaurantItem("Noodles", 160, 9),
            new RestaurantItem("Shawarma", 140, 12)
        };
	
		menu[0].display();
        System.out.println("\n\n======= Swiggy Menu ========");

        for(int i = 0; i < menu.length; i++)
        {
            System.out.print((i + 1) + ". ");
            menu[i].displayMenu();
        }

        System.out.println("\n========= CUSTOMER ORDERS =========");

        // Order 1
        if(menu[0].placeOrder(2))
        {
            System.out.println("\nChicken Biryani Order Confirmed");
            menu[0].generateBill(2);
        }
        else
        {
            System.out.println("Chicken Biryani Out Of Stock");
        }
		  System.out.println("\n\n\n========= CUSTOMER ORDERS =========");
        // Order 2
        if(menu[3].placeOrder(5))
        {
            System.out.println("\nBurger Order Confirmed");
            menu[3].generateBill(5);
        }
        else
        {
            System.out.println("Burger Out Of Stock");
        }
		  System.out.println("\n\n\n========= CUSTOMER ORDERS =========");
        // Order 3
        if(menu[4].placeOrder(10))
        {
            System.out.println("\nWaffle Order Confirmed");
            menu[4].generateBill(10);
        }
        else
        {
            System.out.println("\nWaffle Out Of Stock");
        }

        System.out.println("\n\n\n========= UPDATED STOCK ==========\n");

        // Updated Stock
        for(int i = 0; i < menu.length; i++)
        {
            System.out.print((i + 1) + ". ");
            menu[i].displayMenu();
        }
    }
}