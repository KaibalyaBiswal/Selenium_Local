package test;

import org.junit.Assert;
import org.testng.annotations.Test;

import com.constants.PrimusbankConstants;
import com.libraries.BankerLogout;
import com.libraries.LoginLogoutPrimusbankHomepage;

public class BankerloginTestcase extends PrimusbankConstants
{

	  @Test
   public void   bankerlogintest() 
   {
		  
		LoginLogoutPrimusbankHomepage bhome= new LoginLogoutPrimusbankHomepage();
		bhome.branch="Ameerpet";
		bhome.buid="Kaibalya";
		bhome.bpwd="Kaibalya";
	     boolean res=bhome.bankerLogin(bhome.branch, bhome.buid, bhome.bpwd);
	    Assert.assertTrue(res);
	    BankerLogout cool=new BankerLogout();
	    cool.BankerLogout();
	}
	
}
