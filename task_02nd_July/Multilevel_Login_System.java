package task_02nd_July;



public class Multilevel_Login_System {

	public static void main(String[] args) {
		superadmin obj=new superadmin();
		obj.login();
		obj.accessAdminPanel();
		obj.shutDownSystem();
		
		

	}

}
class user{
	void login()
	{
		System.out.println("this is login method");
	}
}
class adminUser extends user{
	void accessAdminPanel()
	{
		System.out.println("this is the access admin panel");
	}
	
}
class superadmin extends adminUser {
	void shutDownSystem()
	{
		System.out.println("this the shut down system method");
	}
}

