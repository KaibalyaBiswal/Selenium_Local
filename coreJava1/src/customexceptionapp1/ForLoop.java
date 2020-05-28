package customexceptionapp1;

public class ForLoop 
{
public static void main(String[] args) 
{

	/*
		 * for (int i = 0,j=1; i<10; i++) { System.out.println("this is i value "+i);
		 * System.out.println("this is j value "+j); }
		 */
	
	/*
		 * int i=0; for (System.out.println("initialization"); i<3; i++) {
		 * 
		 * System.out.println("output"); }
		 */
	
	/*
		 * for (int i = 0; ; i++) { System.out.
		 * println("condition part is optional,compiler will by default give TRUE"); }
		 */
	
	/*
		 * int i=0; for (System.out.println("initialization");i <1;
		 * System.out.println("increment/decrement")) {
		 * System.out.println("all the three parts are independent to each other"); }
		 */

	int i=0;
	for (System.out.println("initialization");i <1; System.out.println("increment/decrement"),i++)
	{
		System.out.println("all the three parts are independent to each other");
	}
	
	
}
}




