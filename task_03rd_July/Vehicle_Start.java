package task_03rd_July;

public class Vehicle_Start {

	public static void main(String[] args) {
		Vehicle v1=new Vehicle();
		v1.start();
		
		Bike b1=new Bike();
		b1.start();
		
		
		Car c1=new Car();
		c1.start();
		

	}

}
class Vehicle {
	void start()
	{
		System.out.println("start your vehicle");
	}
}
class Bike extends Vehicle{
	 @Override
	void start()
	{
		System.out.println("Kick start the bike");
	}
	
}
class Car  extends Vehicle{
	@Override
	void start()
	{
		System.out.println("Turn the key to start the car");
	}
	
}
