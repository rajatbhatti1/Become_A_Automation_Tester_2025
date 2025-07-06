package task_03rd_July;

public class MathOperations {
	int multiply(int a, int b)
	{
		return a*b;
		
	}
	int multiply(int a, int b,int c)
	{
		return a*b*c;
		
	}
	
	public static void main(String[] args) {
		MathOperations obj=new MathOperations();
		System.out.println(obj.multiply(5, 4));
		System.out.println(obj.multiply(5, 4,3));
	
		
		
	}

}
