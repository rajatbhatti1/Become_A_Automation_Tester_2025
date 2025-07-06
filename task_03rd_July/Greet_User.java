package task_03rd_July;

public class Greet_User {
	void greet()
	{
		System.out.println("Hello");
		
	}
	void greet(String name)
	{
		System.out.println("Hello "+ name);
	}

	public static void main(String[] args) {
		Greet_User obj=new Greet_User();
		obj.greet();
		obj.greet("rajat");
		
	}

}
