package util;
import java.util.*;
public class ProductOfArray {
	public static void main(String[]args)
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int[]arr=new int[n];
		int []res=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
		}
		int prod=1;
		for(int i=0;i<n;i++)
		{
			prod=1;
			for(int j=0;j<n;j++)
			{
				if(j!=i)
				{ 
					prod*=arr[j];
				}
			}
				res[i]=prod;	
		}
		for(int num:res)
		{
		System.out.print(num+" ");
		}
		s.close();
}
}
