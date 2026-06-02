import java.util.*;
class StudentName
{
	public static void main(String []args)
	{
		Scanner s=new Scanner(System.in);
		LinkedList<String>list=new LinkedList<>();
		System.out.println("Enter number of student names should be added into the list:");
		int n=s.nextInt();
		System.out.println("Enter student names:");
		for(int i=0;i<n;i++)
		{
			System.out.print((i+1)+". ");
			String name=s.next();
			list.add(name);
		}
		System.out.println("======STUDENTS LIST=======");
		System.out.println("LIST:"+list);
	}
}