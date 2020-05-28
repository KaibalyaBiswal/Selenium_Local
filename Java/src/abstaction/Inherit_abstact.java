package abstaction;

public class Inherit_abstact extends AbstractClass
{

	@Override
	public void abstact_method() 
	{
	
	System.out.println("implemented abstract method");
	
	}

	public static void main(String[] args) 
	{
	
		Inherit_abstact object = new Inherit_abstact();
		object.normal_method();
		object.abstact_method();
		
	}
	
}
