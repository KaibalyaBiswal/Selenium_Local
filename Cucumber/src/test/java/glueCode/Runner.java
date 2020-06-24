package glueCode;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="D:\\c\\Workspaceeclipse1\\Cucumber\\src\\test\\resources\\Features",glue= {"glueCode"},
monochrome=true,plugin= {"pretty","junit:target/JunitReports/report.xml",
								  "json:target/JsonReports/report.json",
								  "html:target/HtmlReport"})
public class Runner
{

}
