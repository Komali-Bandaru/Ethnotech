import java.util.Scanner;
class Temparature
{
	public static void main(String[]args)
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();  //reading array size
		int[]arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=s.nextInt();   //reading array elements
		}
		int min=Integer.MAX_VALUE,max=Integer.MIN_VALUE;
		int sum=0;
		for(int num:arr)
		{
			sum+=num;
			min=Math.min(min,num);
			max=Math.max(max,num);
		}
		System.out.println("Maximum Temparature:"+max);
		System.out.println("Minimum Temparature:"+min);
		System.out.println("Average Temparature:"+(sum/n));
		System.out.println("Hard days:");
		for(int i:arr)
		{
			if(i>35)
			{
				System.out.print(i+" ");
			}
		}
		s.close();
	}
}
		
//Alternate code
import java.util.Scanner;
class Temperature {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int sum = 0;
        StringBuilder hardDays = new StringBuilder();
        for (int i = 0; i < n; i++) {
            int temp = s.nextInt();
            sum += temp;
            if (temp < min)
                min = temp;
            if (temp > max)
                max = temp;
            if (temp > 35)
                hardDays.append(temp).append(" ");
        }
        System.out.println("Maximum Temperature: " + max);
        System.out.println("Minimum Temperature: " + min);
        System.out.println("Average Temperature: " + (sum / n));
        System.out.println("Hard days:");
        System.out.print(hardDays);
        s.close();
    }
}