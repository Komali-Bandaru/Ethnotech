class Jagged
{
	public static void main(String[]args)
	{
		int [][]arr=new int[3][];
		arr[0]=new int[2];
		arr[1]=new int[3];
		arr[2]=new int[5];
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				arr[i][j]=(i+1)*(j+1)*10;
			}
		}
		for(int i[]:arr)
		{
			for(int num:i)
			{
				System.out.print(num+" ");
			}
			System.out.println();
		}
	}
}