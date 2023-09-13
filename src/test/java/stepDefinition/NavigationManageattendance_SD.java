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
	@Given("Admin is on a manage attendance page in attendance")
	public void admin_is_on_a_manage_attendance_page_in_attendance() {
		 dap.homepage();
		   dap.clickAttendance();
	}

	@When("Admin clicks Student button in the navigation bar in attendance")
	public void admin_clicks_student_button_in_the_navigation_bar_in_attendance() {
	   dap.clickstudent();
	}

	@Then("Admin should able to land on student page in attendance")
	public void admin_should_able_to_land_on_student_page_in_attendance() {
	   String tit = dap.studentpage();
	   Assert.assertEquals(tit, "Student Details");
	}

	@When("Admin clicks Program button in the navigation bar in attendance")
	public void admin_clicks_program_button_in_the_navigation_bar_in_attendance() {
	  dap.clickprogram();
	}

	@Then("Admin should able to land on program page in attendance")
	public void admin_should_able_to_land_on_program_page_in_attendance() {
		  String tit = dap.programpage();
		   Assert.assertEquals(tit, "Manage Program");
	}

	@When("Admin clicks Batch button in the navigation bar in attendance")
	public void admin_clicks_batch_button_in_the_navigation_bar_in_attendance() {
	  dap.clickbatch();
	}

	@Then("Admin should able to land on batch page in attendance")
	public void admin_should_able_to_land_on_batch_page_in_attendance() {
		  String tit = dap.batchpage();
		   Assert.assertEquals(tit, "Manage Batch");
	}

	@When("Admin clicks User button in the navigation bar in attendance")
	public void admin_clicks_user_button_in_the_navigation_bar_in_attendance() {
	  dap.clickuser();
	}

	@Then("Admin should able to land on user page in attendance")
	public void admin_should_able_to_land_on_user_page_in_attendance() {
		 String tit = dap.userpage();
		   Assert.assertEquals(tit, "Manage User");
	}

	@When("Admin clicks Assignment button in the navigation bar in attendance")
	public void admin_clicks_assignment_button_in_the_navigation_bar_in_attendance() {
	  dap.assignmentpage();
	}

	@Then("Admin should able to land on Assignment page in attendance")
	public void admin_should_able_to_land_on_assignment_page_in_attendance() {
		 String tit = dap.assignmentpage();
		   Assert.assertEquals(tit, "Manage Assignment");
	}

	@When("Admin clicks Class button in the navigation bar in attendance")
	public void admin_clicks_class_button_in_the_navigation_bar_in_attendance() {
	  dap.classpage();
	}

	@Then("Admin should able to land on Class page in attendance")
	public void admin_should_able_to_land_on_class_page_in_attendance() {
		 String tit = dap.classpage();
		   Assert.assertEquals(tit, "Manage Class");
	}

	@When("Admin clicks Logout button in the navigation bar in attendance")
	public void admin_clicks_logout_button_in_the_navigation_bar_in_attendance() {
	   dap.clicklogout();
	}

	@Then("Admin should able to land on login page in attendance")
	public void admin_should_able_to_land_on_login_page_in_attendance() {
	String tit= dap.loginpage();
	 Assert.assertEquals(tit, "Please login to LMS Application");
	}


}
