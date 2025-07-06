package task_03rd_July;

public class Find_Maximum {
	void max(int a, int b)
	{
		if(a>b)
		{
			System.out.println(a + "  is greater than " + b);
		}
		else
		{
			System.out.println(b + "  is greater than " + a);
		}
		
	}
	void max(int a, int b, int c)
	{
		if(a>b&a>c)
		{
			System.out.println(a + " is greater then "+ b + " and "+ c);
		}
		else if(b>a&&b>c)
		{
			System.out.println(b + " is greater then "+ a + " and "+ c);
		}
		else
		{
			System.out.println(c + " is greater then "+ a + " and "+ b);
		}
	}
	void max(double a, double b)
	{
		if(a>b)
		{
			System.out.println(a + "  is greater than " + b);
		}
		else
		{
			System.out.println(b + "  is greater than " + a);
		}
	}

	public static void main(String[] args) {
		Find_Maximum obj=new Find_Maximum();
		obj.max(2, 5);
		obj.max(2,0,98);
		obj.max(2.2, 0.5);
		
		

	}

}
