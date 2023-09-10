package runner;


import org.testng.annotations.DataProvider; 



import io.cucumber.testng.AbstractTestNGCucumberTests; 

import io.cucumber.testng.CucumberOptions; 

 
@CucumberOptions(plugin = { "pretty", "html:target/lms.html" }, // reporting purpose 

monochrome = false, // console output 

//tags = "@admin",// tags from feature file 

features = { "src/test/resources/Features"}, // location of feature files 

glue = {"stepDefinition","hooks"}) // location of step definition files 





public class Runner extends AbstractTestNGCucumberTests{
	
	
	
	@DataProvider(parallel = false) 

	public Object[][] scenarios() { 

	 

	return super.scenarios(); 


}
}