package POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login 
{
@FindBy(id="txtUsername") WebElement uidelement;
@FindBy(id="txtPassword") WebElement pwdelement;
@FindBy(xpath=".//*[@id='btnLogin']") WebElement login;

public void adminLogin(String uid,String pwd)
{
	uidelement.sendKeys(uid);
	pwdelement.sendKeys(pwd);
	login.click();

}
}
