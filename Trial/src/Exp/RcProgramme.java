package Exp;

import com.thoughtworks.selenium.DefaultSelenium;

public class RcProgramme 
{
public static void main(String[] args) 
{
	DefaultSelenium selenium = new DefaultSelenium("localhost", 8080, "*firefox C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe","http://www.google.com");	
selenium.start(); //start browser	
selenium.open("/");
selenium.type("lst-ib", "naukri");
selenium.click("submit");
}
}
//not executed