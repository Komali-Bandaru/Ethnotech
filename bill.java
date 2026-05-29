import java.util.Scanner;
public class bill {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int units=s.nextInt();
		int bill=0;
		if(units>250)
		{
			int extra=units-250;
			int temp=(extra+49)/50;
			bill=(temp<<5)+(temp<<4)+(temp<<1);
		}
	
			System.out.println(bill);
		s.close();
	}
}

