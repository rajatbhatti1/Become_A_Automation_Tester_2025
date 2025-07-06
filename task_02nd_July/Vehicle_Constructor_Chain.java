package task_02nd_July;

public class Vehicle_Constructor_Chain {

	public static void main(String[] args) {
		bike obj=new bike();
		
	}

}
class vehicle{
	vehicle()
	{
		System.out.println("your vehicle is ready");
	}
}
class bike extends vehicle{
	bike()
	{
		System.out.println("bike is ready");
	}
}
