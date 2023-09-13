package runner;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

public class Runner {
	@CucumberOptions(
			plugin = {"pretty", "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
			glue =  "stepDefinition",
			features = {"src/test/resources/Features/AddNewClass.feature", 
			"src/test/resources/Features//Attendancedetailspopup.feature",
			"src/test/resources/Features//Classdetailpopupwindow.feature",
			"src/test/resources/Features//DeleteAttendance.feature",
			"src/test/resources/Features//DeleteClass.feature",
			"src/test/resources/Features//EditClass.feature",
			"src/test/resources/Features//ManageClass.feature",
			"src/test/resources/Features//Navigationmanageattendance.feature",
			"src/test/resources/Features//Paginationinmanageattendance.feature"})
			
	@Test
public class AllureReport extends AbstractTestNGCucumberTests {
      @Override
	@DataProvider(parallel = false)
		public Object[][] scenarios(){
	return super.scenarios();
	}
	}

}
