package runner;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

public class Runner {
	@CucumberOptions(
			plugin = {"pretty", "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
			glue =  "stepDefinition",
			features = {"src/test/resources/Features/"})
			
	@Test
public class AllureReport extends AbstractTestNGCucumberTests {
      @Override
	@DataProvider(parallel = false)
		public Object[][] scenarios(){
	return super.scenarios();
	}
	}

}
