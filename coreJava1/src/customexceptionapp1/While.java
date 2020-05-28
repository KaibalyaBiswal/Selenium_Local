package customexceptionapp1;

public class While {

/*	public static void main(String[] args) 
	{

		while (true) {
			System.out.println("it is true");
		}
//		System.out.println("it is false");			//this is unreachable code compiler will give error for this because of "false"

	}

----------------------------------------
	
	/* public static void main(String[] args) 
	 * {
	 
	 
	 * while (false) 
	 * {
	 * System.out.println("it is true");			 //   <---   this commented code is is unreachable code compiler will give error for this because of "false"
	 * }
	  
	 
	 * System.out.println("it is false");
	  
	  }*/

	
	
	public static void main(String[] args) 
	{
	final int i=10,j=20;
	while (true) 
	{
	System.out.println("reachable");	
	}
//	System.out.println("not rechable");			//this is not reachable for the final keyword,because here compiler know the values are fixed
	
	
	}
	
	
	}
