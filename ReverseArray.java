import java.util.Scanner;
class ReverseArray
{
	public static void main(String[]args)
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();  //reading array size
		int[]arr=new int[n];
		int[]res=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=s.nextInt();   //reading array elements
		}
		int k=s.nextInt();	//reading k value to rotate
		int ind=0;
			for(int j=k+1;j<n;j++)
			{
				res[ind]=arr[j];
				ind++;
			}
			for(int i=0;i<=k;i++)
			{
				res[ind]=arr[i];
				ind++;
			}
	 for(int num:res){
		 System.out.print(num+" ");
	}
	s.close();
}
}

// alternate code
import java.util.Scanner;
class ReverseArray {
    static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();		   // Reading array elements
        }
        int k = s.nextInt();
        reverse(arr, 0, n - 1);
        reverse(arr, 0, k - 1);
        reverse(arr, k, n - 1);
        for (int num : arr) {
            System.out.print(num + " ");
        }
        s.close();
    }
}