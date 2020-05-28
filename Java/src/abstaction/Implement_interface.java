package abstaction;

public class Implement_interface implements Full_Abstaction,Interface_sameMethod
{

	@Override
	public void method1() 
	{
		System.out.println("implemented first method");
	
	}

	@Override
	public void method2() 
	{
		System.out.println("implemented second method");
	
	}

	@Override
	public void method3() 
	{
		System.out.println("implemented third method");
		
	}

	
	
	public static void main(String[] args) 
	{
	Implement_interface method = new Implement_interface();
	method.method1();
	method.method2();
	method.method3();
	
	
	System.out.println(a);
	}
	
	
	
}




