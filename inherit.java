/*class Animal
{
	void sound()
	{
		System.out.println("Roaring...");
	}
}
class Lion extends Animal
{
		Animal a=new Animal();
		void breed()
		{
			a.sound();
			System.out.println("Lionn");
		}
}
class inherit extends Lion
{
	public static void main(String[]args)
	{
		Lion l=new Lion();
		l.breed();
	}
}*/
class Employee
{
	void name()
	{
		System.out.println("Employee name:Komsss");
	}
}
class Salary extends Employee
{
	Employee e=new Employee();
	void sal()
	{
		e.name();
		System.out.println("Salary:300000");
	}
}
class Role extends Salary
{
		Salary s=new Salary();
		void role(String str)
		{
			s.sal();
			System.out.println("Role:"+str);
		}
}
class inherit extends Role
{
	public static void main(String[]args)
	{
		Role r=new Role();
		r.role("Developer");
		r.role("Tester");
		r.role("Devops");
	}
}
