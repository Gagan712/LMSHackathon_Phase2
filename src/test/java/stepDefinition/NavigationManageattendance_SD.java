package stepDefinition;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import hooks.Hooks;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.DeleteAttendancePage;
import utilities.Excelreader;

public class NavigationManageattendance_SD {
	Excelreader read;
	WebDriver driver=Hooks.driver;
	DeleteAttendancePage dap = new DeleteAttendancePage(driver);
	@Given("Admin is on a manage attendance page")
	public void admin_is_on_a_manage_attendance_page() {
		 dap.homepage();
		   dap.clickAttendance();
	}

	@When("Admin clicks Student button in the navigation bar")
	public void admin_clicks_student_button_in_the_navigation_bar() {
	   dap.clickstudent();
	}

	@Then("Admin should able to land on student page")
	public void admin_should_able_to_land_on_student_page() {
	   String tit = dap.studentpage();
	   Assert.assertEquals(tit, "Student Details");
	}

	@When("Admin clicks Program button in the navigation bar")
	public void admin_clicks_program_button_in_the_navigation_bar() {
	  dap.clickprogram();
	}

	@Then("Admin should able to land on program page")
	public void admin_should_able_to_land_on_program_page() {
		  String tit = dap.programpage();
		   Assert.assertEquals(tit, "Manage Program");
	}

	@When("Admin clicks Batch button in the navigation bar")
	public void admin_clicks_batch_button_in_the_navigation_bar() {
	  dap.clickbatch();
	}

	@Then("Admin should able to land on batch page")
	public void admin_should_able_to_land_on_batch_page() {
		  String tit = dap.batchpage();
		   Assert.assertEquals(tit, "Manage Batch");
	}

	@When("Admin clicks User button in the navigation bar")
	public void admin_clicks_user_button_in_the_navigation_bar() {
	  dap.clickuser();
	}

	@Then("Admin should able to land on user page")
	public void admin_should_able_to_land_on_user_page() {
		 String tit = dap.userpage();
		   Assert.assertEquals(tit, "Manage User");
	}

	@When("Admin clicks Assignment button in the navigation bar")
	public void admin_clicks_assignment_button_in_the_navigation_bar() {
	  dap.assignmentpage();
	}

	@Then("Admin should able to land on Assignment page")
	public void admin_should_able_to_land_on_assignment_page() {
		 String tit = dap.assignmentpage();
		   Assert.assertEquals(tit, "Manage Assignment");
	}

	@When("Admin clicks Class button in the navigation bar")
	public void admin_clicks_class_button_in_the_navigation_bar() {
	  dap.classpage();
	}

	@Then("Admin should able to land on Class page")
	public void admin_should_able_to_land_on_class_page() {
		 String tit = dap.classpage();
		   Assert.assertEquals(tit, "Manage Class");
	}

	@When("Admin clicks Logout button in the navigation bar")
	public void admin_clicks_logout_button_in_the_navigation_bar() {
	   dap.clicklogout();
	}

	@Then("Admin should able to land on login page")
	public void admin_should_able_to_land_on_login_page() {
	String tit= dap.loginpage();
	 Assert.assertEquals(tit, "Please login to LMS Application");
	}


}
