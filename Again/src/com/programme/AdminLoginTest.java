package com.programme;

import com.oops.Primusbankhomepage;

public class AdminLoginTest {

	public static void main(String[] args) {
		boolean res;
		Primusbankhomepage.lunchApp(Primusbankhomepage.url);
		Primusbankhomepage phome = new Primusbankhomepage();

		phome.adminuid = "Admin";
		phome.adminpwd = "Admin";
		res = phome.adminlogin(phome.adminuid, phome.adminpwd);
		if (res) {
			System.out.println("Admin Login Test Pass");
		} else {
			System.out.println("Admin Login Test Fail");
		}
		Primusbankhomepage.closeApp();

	}

}
