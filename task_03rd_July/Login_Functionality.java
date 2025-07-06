package task_03rd_July;

public class Login_Functionality {

	public static void main(String[] args) {
		User u1=new User();
		u1.login();
		
		AdminUser a1=new AdminUser();
		a1.login();
		
		RegularUser r1=new RegularUser();
		r1.login();
		
		

	}

}

class User
{
	void login()
	{
		System.out.println("user login");
	}
}

class AdminUser extends User{
	@Override
	void login()
	{
		System.out.println("admin user login ");
	}
}
class RegularUser extends User{
	@Override
	void login()
	{
		System.out.println("regular user login ");
	}
}

