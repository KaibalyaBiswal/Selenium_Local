package com.xpathmultiproperties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ExpAct {

	public static void main(String[] args) {
		
String v1,v2,res;
v1="100";
v2="250";
int expres,actres;

expres=Integer.parseInt(v1)+Integer.parseInt(v2);
WebDriver driver=new FirefoxDriver();
driver.get("http://calc.qedgetech.com");
for(int i=0;i<v1.length();i++)
{
	char temp=v1.charAt(i);
	driver.findElement(By.xpath("//*[@value='"+temp+"']")).click();
}
driver.findElement(By.xpath("//*[@value='+']")).click();
for(int i=0;i<v2.length();i++)
{
char temp=v2.charAt(i);
driver.findElement(By.xpath("//*[@value='"+temp+"']")).click();
}
driver.findElement(By.xpath("//*[@value='=']")).click();
res=driver.findElement(By.name("display")).getAttribute("value");

actres=Integer.parseInt(res);

if(expres==actres)
{
	System.out.println("Test Pass");	
}else
{
	System.out.println("Test Fail");
}
	}

}
