package abstaction;

public abstract class AbstractClass 
{

	//can we declare concrete method without body in normal class?
	//no, it will give compile time error(below method is concrete method)
	
	//public void test();			---compile time error
	
	abstract void abstact_method();
	
	public void normal_method()
	{
		
		System.out.println("normal method in abstact class");
	}
	
	
}


