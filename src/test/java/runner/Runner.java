package runner;


import org.testng.annotations.DataProvider; 



import io.cucumber.testng.AbstractTestNGCucumberTests; 

import io.cucumber.testng.CucumberOptions; 

 
@CucumberOptions(plugin = { "pretty", "html:target/lms.html","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
"io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"}, // reporting purpose 

monochrome = false, // console output 

//tags = "@admin",// tags from feature file 

features = { "src/test/resources/Features/UserPage.feature"}, // location of feature files 

glue = {"stepDefinition","hooks"}) // location of step definition files 





public class Runner extends AbstractTestNGCucumberTests{
	
	
	
	@DataProvider(parallel = false) 

	public Object[][] scenarios() { 

	 

	return super.scenarios(); 


}
}