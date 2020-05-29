package com.libraries;

import org.openqa.selenium.By;

import com.constants.PrimusbankConstants;

public class Adminlogout extends PrimusbankConstants
{
public void AdminLogout()
{
driver.findElement(By.xpath("//tbody/tr/td[3]/a/img")).click();
	
}
}
