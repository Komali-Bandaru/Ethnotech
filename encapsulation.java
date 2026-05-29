/*class Student
{
	private int id;
	public void setid(int id)
	{
		this.id=id;
	}
	public int getid()
	{
		return id;
	}
}
class encapsulation
{
	public static void main(String[]args)
	{
		Student s=new Student();
		s.setid(67);
		System.out.println(s.getid());
	}
}*/
class bank
{
	private int bal;
	public void setup(int bal)
	{
		this.bal=bal;
	}
	public int getbal()
	{
		return bal;
	}
	public static void main(String[]args)
	{
		bank b=new bank();
		b.setup(10002);
		System.out.println(b.getbal());
	}
}