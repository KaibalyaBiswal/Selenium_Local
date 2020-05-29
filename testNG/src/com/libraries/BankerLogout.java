package com.libraries;

import org.openqa.selenium.By;

import com.constants.PrimusbankConstants;

public class BankerLogout extends PrimusbankConstants
{
public void BankerLogout()
{
	driver.findElement(By.xpath("//table/tbody/tr/td[3]/a/img")).click();
	
}

}
