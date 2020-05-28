package abstaction;

public class Implement_Class implements Interface1,Interface2
{

	@Override
	public void method1() 
	{
	System.out.println("implemented interface method");
		
	}

	public static void main(String[] args) 
	{
	Implement_Class methods = new Implement_Class();
	methods.method1();
	
	}	
	
}
