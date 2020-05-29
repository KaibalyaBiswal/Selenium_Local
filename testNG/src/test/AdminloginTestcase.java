package test;

import org.junit.Test;
import com.constants.PrimusbankConstants;
import com.libraries.Adminlogout;
import com.libraries.LoginLogoutPrimusbankHomepage;

import junit.framework.Assert;

@SuppressWarnings("deprecation")
public class AdminloginTestcase extends PrimusbankConstants
{
	@Test
    public void adminLogintest() 
    {
		LoginLogoutPrimusbankHomepage phome=new LoginLogoutPrimusbankHomepage();
		phome.uid="Admin";
		phome.pwd="Admin";
	 boolean res=phome.adminLogin(phome.uid, phome.pwd);
	 Assert.assertTrue(res);
	 Adminlogout out=new Adminlogout();
	 out.AdminLogout();
	}
}
