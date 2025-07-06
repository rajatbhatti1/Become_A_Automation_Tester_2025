package task_03rd_July;

public class Printer {
	/* using constructor
	Printer(String a)
	{
		System.out.println("this is string " +a);
	}
	Printer(int a)
	{
		System.out.println("this is int "+ a);
	}
	Printer(float a)
	{
		System.out.println("this is float data "+ a );
	}
	*/ 
	
	//Using method 
	String Print_Data(String a)
	{
		return a;
	}
	int Print_Data(int a)
	{
		return a;
	}
	float Print_Data(float a)
	{
		return a;
	}

	public static void main(String[] args) {
		
//		Printer obj1=new Printer("rajat");
//		Printer obj2=new Printer(4);
//		Printer obj3=new Printer(3.4f);
		
		Printer obj1= new Printer();
		System.out.println("this is string print data  "+ obj1.Print_Data("rajat") );
		System.out.println("this is int  print data  "+ obj1.Print_Data(444) );
		System.out.println("this is float print data  "+ obj1.Print_Data(3.44f) );
		
		
	
	}

}
