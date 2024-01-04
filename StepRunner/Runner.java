package StepRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "C:\\Users\\vikas\\eclipse-workspace\\Practice.2.o\\src\\main\\java\\Feature\\Login.feature", glue = "stepDefination", dryRun = false, monochrome = true, plugin = {
		"pretty", "html:target/Cucumber-Reports/reports01.html" })
public class Runner extends AbstractTestNGCucumberTests {

}
