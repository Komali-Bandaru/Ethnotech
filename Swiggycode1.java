import java.util.Scanner;

abstract class FoodItem
{
    String item;
    int price;
    int availquantity;

    FoodItem(String item, int price, int availquantity)
    {
        this.item = item;
        this.price = price;
        this.availquantity = availquantity;
    }

    void displayMenu(int index)
    {
        System.out.println(index + ". " + item +
                " - Price: " + price );
    }

    abstract boolean placeOrder(int quantity);
}

class RestaurantItem extends FoodItem
{
    RestaurantItem(String item, int price, int availquantity)
    {
        super(item, price, availquantity);
    }

    boolean placeOrder(int reqquantity)
    {
        if(reqquantity <= availquantity)
        {
            availquantity -= reqquantity;
            return true;
        }
        else
        {
            return false;
        }
    }
}

class SwiggyCode1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

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

        int totalAmount = 0;

        System.out.println("========== WELCOME TO SWIGGY ==========");
        char choice='y';
        do
        {
            System.out.println("\n=========== MENU ===========");

            for(int i = 0; i < menu.length; i++)
            {
                menu[i].displayMenu(i + 1);
            }

            System.out.print("\nEnter Item Number: ");
            int itemNo = sc.nextInt();

            if(itemNo < 1 || itemNo > menu.length)
            {
                System.out.println("Invalid Item Number!");
                continue;
            }

            System.out.print("Enter Quantity: ");
            int quantity = sc.nextInt();

            FoodItem selectedItem = menu[itemNo - 1];

            if(selectedItem.placeOrder(quantity))
            {
                int amount = selectedItem.price * quantity;

                totalAmount += amount;

                System.out.println("\nItem Added To Cart Successfully!");
                System.out.println("Item: " + selectedItem.item);
                System.out.println("Quantity: " + quantity);
                System.out.println("Amount: ₹" + amount);
            }
            else
            {
                System.out.println("\nSorry! Out Of Stock");
            }

            System.out.print("\nDo you want to order more? (y/n): ");
            choice = sc.next().charAt(0);

        } while(choice == 'y' || choice == 'Y');

        // BILL GENERATION
        double discount = totalAmount * 0.10;
        double finalAmount = totalAmount - discount;

        System.out.println("\n\n=========== FINAL BILL ===========");
        System.out.println("Actual Amount      : ₹" + totalAmount);
        System.out.println("Discount (10%)     : ₹" + discount);
        System.out.println("----------------------------------");
        System.out.println("Final Amount       : ₹" + finalAmount);
        System.out.println("==================================");
        System.out.println("      THANK YOU FOR ORDERING      ");

        sc.close();
    }
}