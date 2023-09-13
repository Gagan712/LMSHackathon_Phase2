package stepDefinition;

import org.testng.Assert;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.DashboardPage;
import utilities.LoggerLoad;

public class DashboardPage_SD {
	
	private DashboardPage DashPage = new DashboardPage();
	

	@Then("Dashboard_Admin should see manage program as header")
	public void dashboard_admin_should_see_manage_program_as_header(String header) {
		LoggerLoad.info("Validate admin sees manage program as header");
		String DashPageHeader = DashPage.verifyHeaderText();
		Assert.assertEquals(DashPageHeader, header);
	}

	@Then("Dashboard_Maximum navigation time in milliseconds, defaults to {int} seconds")
	public void dashboard_maximum_navigation_time_in_milliseconds_defaults_to_seconds(Integer int1) throws InterruptedException {
		LoggerLoad.info("Validate navigation time");
		DashPage.Navigation_Time();
	}

	@Then("Dashboard_HTTP response >= {int}. The link is broken") 
	public void dashboard_http_response() {
		LoggerLoad.info("Validate Link");
		DashPage.verifyLink();
	}

	@Then("Dashboard_Admin should see LMS -Learning management system  as title")
	public void dashboard_admin_should_see_lms_learning_management_system_as_title(String LMSTitle) throws InterruptedException {
		LoggerLoad.info("Validate admin sees LMS Title");
		String LMSHeader = DashPage.verifyLMSTitle();
		Assert.assertEquals(LMSHeader, LMSTitle);
		Thread.sleep(500);
	}

	@Then("Dashboard_LMS title should be on the top left corner of page")
	public void dashboard_lms_title_should_be_on_the_top_left_corner_of_page() {
		LoggerLoad.info("Validate LMS Title");
		DashPage.Title_Alignment();
	}

	@Then("Dashboard_Admin should see correct spelling in navigation bar text")
	public void dashboard_admin_should_see_correct_spelling_in_navigation_bar_text() {
		LoggerLoad.info("Validate admin sees correct spellings");
		String[] correctSpellings = {"Student","Program","Batch","Class","User","Assignment","Attendance","Logout"};
		for (String spelling : correctSpellings)
		{Assert.assertTrue(DashPage.Navigation_Bar_Text().contains(spelling));
	}
	}
	
	@Then("Dashboard_Admin should see correct spelling and space in LMS title")
	public void dashboard_admin_should_see_correct_spelling_and_space_in_lms_title() {
		LoggerLoad.info("Validate LMS Title Spelling and Space");
		String expectedLmsTitle = "LMS-Learning Management System";
		Assert.assertEquals(expectedLmsTitle, DashPage.Title_Text());
	}

	@Then("Dashboard_Admin should see the navigation bar text on the top right side")
	public void dashboard_admin_should_see_the_navigation_bar_text_on_the_top_right_side() {
		LoggerLoad.info("Validate navigation bar");
		DashPage.Navigation_Bar_Alignment();
	}

	@Then("Dashboard_Admin should see student in the 1st place")
	public void dashboard_admin_should_see_student_in_the_1st_place() {
		LoggerLoad.info("Validate admin sees student in first place");
		DashPage.StudentPlace();
	}

	@Then("Dashboard_Admin should see program in the 2nd place")
	public void dashboard_admin_should_see_program_in_the_2nd_place() {
		LoggerLoad.info("Validate admin sees program in second place");
		DashPage.ProgramPlace();
	}

	@Then("Dashboard_Admin should see batch in the 3rd place")
	public void dashboard_admin_should_see_batch_in_the_3rd_place() {
		LoggerLoad.info("Validate admin sees batch in third place");
		DashPage.BatchPlace();
	}

	@Then("Dashboard_Admin should see class in the 4th place")
	public void dashboard_admin_should_see_class_in_the_4th_place() {
		LoggerLoad.info("Validate admin sees class in fourth place");
		DashPage.ClassPlace();
	}

	@Then("Dashboard_Admin should see user in the 5th place")
	public void dashboard_admin_should_see_user_in_the_5th_place() {
		LoggerLoad.info("Validate admin sees user in fifth place");
		DashPage.UserPlace();
	}

	@Then("Dashboard_Admin should see assignment in the 6th place")
	public void dashboard_admin_should_see_assignment_in_the_6th_place() {
		LoggerLoad.info("Validate admin sees assignment in sixth place");
		DashPage.AssignmentPlace();;
	}

	@Then("Dashboard_Admin should see attendance in the 7th place")
	public void dashboard_admin_should_see_attendance_in_the_7th_place() {
		LoggerLoad.info("Validate admin sees attendance in seventh place");
		DashPage.AttendancePlace();
	}

	@Then("Dashboard_Admin should see logout in the 8th place")
	public void dashboard_admin_should_see_logout_in_the_8th_place() {
		LoggerLoad.info("Validate admin sees logout in eighth place");
		DashPage.LogoutPlace();
	}

	@Given("Dashboard_Admin is in dashboard page")
	public void dashboard_admin_is_in_dashboard_page() {
		LoggerLoad.info("Validate admin is on dashboard page");
		Assert.assertEquals("Dashboard Page", DashPage.get_Current_Page_Title());
	}

	@When("Dashboard_Admin click Logout button on navigation bar")
	public void dashboard_admin_click_logout_button_on_navigation_bar() {
		LoggerLoad.info("Admin clicks logout button");
	    DashPage.LMS_Logout();
	}

	@Then("Dashboard_Admin should land on login in page")
	public void dashboard_admin_should_land_on_login_in_page() {
		LoggerLoad.info("Validate admin is on login page");
		Assert.assertEquals("Login Page", DashPage.get_Current_Page_Title());
	}
	}
