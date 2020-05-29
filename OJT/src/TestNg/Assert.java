package TestNg;

import org.testng.annotations.Test;

public class Assert 
{

	@Test
	public void ValidateTitles()
	{
	
		String acttitle="Gmail";
		String exptitle="Gmail";
		org.testng.Assert.assertEquals(acttitle, exptitle);
		
		
		
	}	
}
