package task_03rd_July;

public class Add_Two_Numbers_Overload {
	static int add(int a, int b)
	{
		return a+b;
	}
	static double add(double a, double b)
	{
		return a+b;
	}

	public static void main(String[] args) {
		System.out.println(add(2,5));
		System.out.println(add(2.2,2.3));
		System.out.println(add('a','b')); //char will convert into corresponding int
		
	
	}

}
