package Demo;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class Test 
{
	@BeforeSuite
	public void bSuite() 
	{
	System.out.println("Before Suite Executed");	
	}

@BeforeTest
public void bTest()
{
System.out.println("Before Test Executed ");	
}

@BeforeClass
public void bClass()
{
	System.out.println("Before Class Executed");
}

@BeforeMethod
public void bMethod()
{
	System.out.println("Before Method Executed");
}

@org.testng.annotations.Test
public void test()
{
System.out.println("Test Case Executed");	
}

@AfterMethod
public void aMethod()
{
	System.out.println("After Method Executed");
}

@AfterClass
public void aClass()
{
	System.out.println("After Class Executed");
}

@AfterTest
public void aTest()
{
	System.out.println("After Test Executed");
}

@AfterSuite
public void aSuite()
{
	System.out.println("After Suite Executed");
}
}
