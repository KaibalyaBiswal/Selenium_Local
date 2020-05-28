package com.programme;

import org.testng.annotations.Test;

public class DemoTest {
	@Test(priority = 0)
	public void sendmail() {
		System.out.println("send mail test");
	}

	@Test(priority = 1)
	public void receivemail() {
		System.out.println("receive mail test");

	}

}
