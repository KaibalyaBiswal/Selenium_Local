package Questions;

public class QAdemo 
{

//	How to switch back from a frame ?
    //--> Syntax – driver.switchTo().defaultContent();
	
//  How to type text in a new line inside a text area ?
	//--> syntax- webelement.sendKeys(“kaibalya\n biswal”);
    //ex-  kaibalya
    //biswal
	
//	How to perform double click using WebDriver ?	
	//-->Syntax- Actions act = new Actions(driver);
	//-->act.doubleClick(webelement);
	
//	How to press Shift+Tab ?
	//-->ess = Keys.chord(Keys.SHIFT,Keys.ENTER);
	//-->webelement.sendKeys(press);
	
//What are different components of your framework ?
    //Ans- Library- Assertion, ConfigLibrary, GenericLibrary, ProjectSpecificLibrary, Modules.
	//Drivers folder, Jars folder, excel file.
	
}
