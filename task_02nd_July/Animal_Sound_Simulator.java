package task_02nd_July;


public class Animal_Sound_Simulator {
	
	

	public static void main(String[] args) {
		Cat obj1=new Cat();
		obj1.meow();
		obj1.makeSound();
		

	}
}
	class Animal{
		public void makeSound()
		{
			System.out.println("this is the make sound method");
		}
	}
	class Cat extends Animal{
		void meow()
		{
			System.out.println("this is meow sound of cat");
		}
	}



