class employesalary
{
	public void calculatesalary()
	{
		System.out.println("Calculating Employee Salary");
	}
}
class Fulltimeemployee extends employesalary
{
	public void calculatesalary()
	{
		System.out.println("FULL TIME EMPLOYEE");
		System.out.println("calculating employee salary:50000");
	}
}
class Internmeemployee extends employesalary
{
	public void calculatesalary()
	{
		System.out.println("INTERN");
		System.out.println("calculating employee salary:25000");
	}
}
class Remoteemployee extends employesalary
{
	public void calculatesalary()
	{
		System.out.println("REMOTE EMPLOYEE");
		System.out.println("calculating employee salary:52000");
	}
}
class Hybridemployee extends employesalary
{
	public void calculatesalary()
	{
		System.out.println("HYBRID EMPLOYEE");
		System.out.println("calculating employee salary:55000");
	}
}

public class Employeesalary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		employesalary e=new employesalary();
		e.calculatesalary();
		Fulltimeemployee ft=new Fulltimeemployee();
		ft.calculatesalary();
		Internmeemployee intern=new Internmeemployee();
		intern.calculatesalary();
		Remoteemployee rm=new Remoteemployee();
		rm.calculatesalary();
		Hybridemployee h=new Hybridemployee();
		h.calculatesalary();
		
		

	}

}