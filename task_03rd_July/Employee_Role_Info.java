package task_03rd_July;

public class Employee_Role_Info {

	public static void main(String[] args) {
		Employee e1=new Employee();
		e1.role();
		
		Tester t1=new Tester();
		t1.role();
		Clerk c1= new Clerk();
		c1.role();
		

	}

}
class Employee {
	void role() {
		System.out.println("general employee");
		
	}
}
class Manager extends Employee{
	@Override
	void role()
	{
		System.out.println("this is manager role");
		
	}
}
class Tester extends Employee{
	@Override
	void role()
	{
		System.out.println("this is tester role");
		
	}
}

class Clerk extends Employee{
	@Override
	void role()
	{
		System.out.println("this is clerk role");
		
	}
}





