package stepDefinition;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import hooks.Hooks;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.DeleteAttendancePage;
import pages.ManageAttendancePage;
import utilities.Excelreader;

public class Paginationmanageattendance_SD {
	Excelreader read;
	WebDriver driver=Hooks.driver;
	DeleteAttendancePage dap = new DeleteAttendancePage(driver);
	ManageAttendancePage mn = new ManageAttendancePage(driver);
	@Given("Admin is logged into homepage in attendance")
	public void admin_is_logged_into_homepage_in_attendance() {
	    dap.homepage();
	}

	@When("Admin clicks Attendance link on the navigation bar in attendance")
	public void admin_clicks_attendance_link_on_the_navigation_bar_in_attendance() {
	  mn.clickattendace();
	}

	@Then("Data table should display page {int} when entries available on page in attendance")
	public void data_table_should_display_page_when_entries_available_on_page_in_attendance(Integer int1) {
	   int png= mn.testpagenumber();
	   Assert.assertEquals(png, 1);
	}

	@Then("Right arrow should be enabled in page one when entries are more than {int} available in attendance")
	public void right_arrow_should_be_enabled_in_page_one_when_entries_are_more_than_available_in_attendance(Integer int1) {
		int size=mn.checknoofentries();
		if(size>1) {
	   boolean rl= mn.checkrightarrowenabled();
	   Assert.assertEquals(rl, true);
		}
	   
	}

	@Then("Left arrow should be disabled in page one  when entries are more than {int} available in attendance")
	public void left_arrow_should_be_disabled_in_page_one_when_entries_are_more_than_available_in_attendance(Integer int1) {
		int size=mn.checknoofentries();
		if(size>1) {
	   boolean rl= mn.checkleftarrowenabled();
	   Assert.assertEquals(rl, false);
		}
	}

	@Then("Right arrow should be enabled in page two when entries are more than {int} available in attendance")
	public void right_arrow_should_be_enabled_in_page_two_when_entries_are_more_than_available_in_attendance(Integer int1) {
		
		int size=mn.checknoofentries();
		int pagenumber=mn.testpagenumber();
		if(size>10 && pagenumber==2) {
	   boolean rl= mn.checkrightarrowenabled();
	   Assert.assertEquals(rl, true);
		}
	}

	@Then("Left arrow should be enabled in page two in attendance")
	public void left_arrow_should_be_enabled_in_page_two_in_attendance() {
		int size=mn.checknoofentries();
		int pagenumber=mn.testpagenumber();
		if(size>10 && pagenumber==2) {
			mn.testpagenumber();
	   boolean rl= mn.checkleftarrowenabled();
	   Assert.assertEquals(rl, true);
		}
	}

	@Then("Right arrow should be disabled in page two when entries are less than {int} available in attendance")
	public void right_arrow_should_be_disabled_in_page_two_when_entries_are_less_than_available_in_attendance(Integer int1) {
		int size=mn.checknoofentries();
		int pagenumber=mn.testpagenumber();
		if(size<10 && pagenumber==2) {
			mn.testpagenumber();
	   boolean rl= mn.checkrightarrowenabled();
	   Assert.assertEquals(rl, false);
		}
	}

	@Then("entries are more than {int} in data table pagination controls enabled in attendance")
	public void entries_are_more_than_in_data_table_pagination_controls_enabled_in_attendance(Integer int1) {
		int size=mn.checknoofentries();
		if(size>5) {
	 boolean rl= mn.checkrightarrowenabled();
	 boolean r2= mn.checkleftarrowenabled();
	 Assert.assertEquals(rl, true);
	 Assert.assertEquals(r2, true);
		}
	}

	@Then("entries are less than {int} in data table pagination controls disabled in attendance")
	public void entries_are_less_than_in_data_table_pagination_controls_disabled_in_attendance(Integer int1) {
		int size=mn.checknoofentries();
		if(size<5) {
	 boolean rl= mn.checkrightarrowenabled();
	 boolean r2= mn.checkleftarrowenabled();
	 Assert.assertEquals(rl, false);
	 Assert.assertEquals(r2, false);
		}
	}

}
