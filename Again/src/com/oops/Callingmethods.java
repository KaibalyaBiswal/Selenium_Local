package com.oops;


public class Callingmethods {
	
	public static void main(String[] args) 
	{
		boolean res;
		Primusbankhomepage.lunchApp(Primusbankhomepage.url);
		Primusbankhomepage pHome=new Primusbankhomepage();
		
		pHome.adminuid="Admin";
		pHome.adminpwd="Admin";
	
		res=pHome.adminlogin(pHome.adminuid,pHome.adminpwd);
		if (res) 
		{
		System.out.println("Admin login test pass");
		
		} else 
		{
System.out.println("Admin login test fail");

		}
		Primusbankhomepage.closeApp();
		
	}

}







