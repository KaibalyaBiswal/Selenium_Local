package script_Jar;

import org.testng.TestNG;

public class RunnableJar 
{

	public static void main(String[] args) 
	{
	
		TestNG test = new TestNG();
		test.setTestClasses(new Class[] {RunnableJar.class});
		test.run();
		
		// we have to export the project to runnable jar for creation of jar file
	}
	
	
	
}






