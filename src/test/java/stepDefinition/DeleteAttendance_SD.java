package stepDefinition;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import hooks.Hooks;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Attendancepopuppage;
import pages.DeleteAttendancePage;
import utilities.Excelreader;

public class DeleteAttendance_SD {
	Excelreader read;
	WebDriver driver=Hooks.driver;
	DeleteAttendancePage dap = new DeleteAttendancePage(driver);
	@Given("Admin is on the manage attendance page")
	public void admin_is_on_the_manage_attendance_page() {
	   dap.homepage();
	   dap.clickAttendance();
	}

	@When("Admin clicks the delete button in data table row level")
	public void admin_clicks_the_delete_button_in_data_table_row_level() {
	   dap.clickdeletrow();
	}

	@Then("Admin should see alert message")
	public void admin_should_see_alert_message() {
		 String error=dap.captureerrormessage();
		   Assert.assertEquals(error, "Please click checkbox");
	}

	@Then("Alert should have a {string} button to accept")
	public void alert_should_have_a_button_to_accept(String string) {
	    boolean yesr= dap.yesdisplay();
	    Assert.assertEquals(yesr, true);
	}

	@Then("Alert should have a {string} button to reject")
	public void alert_should_have_a_button_to_reject(String string) {
		boolean nor= dap.nodisplay();
	    Assert.assertEquals(nor, true);
	}

	@Given("Admin is in delete alert after clicking on delete button")
	public void admin_is_in_delete_alert_after_clicking_on_delete_button() {
		//dap.clickdeletrow();
	}

	@When("Admin clicks the yes button")
	public void admin_clicks_the_yes_button() {
	  dap.clickyes();
	}

	@Then("Success message and selected attendance details are deleted from the data table")
	public void success_message_and_selected_attendance_details_are_deleted_from_the_data_table() {
		read=new Excelreader("12");
	    String msg= dap.successmessagefordelete();
	    Assert.assertEquals(msg, "Successfully deleted");
	    dap.enterclassid();
	    int enteredclassid= Integer.parseInt(read.getdata());
	 int classidintables=  dap.checkclassidintable();
	 Assert.assertNotEquals(enteredclassid, classidintables);
	}

	@When("Admin clicks the no button")
	public void admin_clicks_the_no_button() {
	   dap.clickno();
	}

	@Then("Redirected attendance page and selected attendance details are not deleted from the data table")
	public void redirected_attendance_page_and_selected_attendance_details_are_not_deleted_from_the_data_table() {
	  String tit= dap.attendancepage();
	  Assert.assertEquals(tit, "Manage Attendance");
	  dap.enterclassid();
	    int enteredclassid= Integer.parseInt(read.getdata());
	 int classidintables=  dap.checkclassidintable();
	 Assert.assertEquals(enteredclassid, classidintables);
	  
	}

	@When("Admin clicks single row level check box in the data table")
	public void admin_clicks_single_row_level_check_box_in_the_data_table() {
	 dap.clickcheckbox();
	}

	@Then("Admin should see delete icon below the header is enabled")
	public void admin_should_see_delete_icon_below_the_header_is_enabled() {
	 boolean rslt=  dap.deleticon();
	 Assert.assertEquals(rslt, true);
	}

	@Then("Admin should see tick mark in check box")
	public void admin_should_see_tick_mark_in_check_box() {
	   boolean r = dap.clickonecheckbox();
	   Assert.assertEquals(r, true);
	}

	@When("Admin clicks multiple row level check box in the data table")
	public void admin_clicks_multiple_row_level_check_box_in_the_data_table() {
	  dap.clickmulticheckbox();
	}

	@Then("Admin should see tick mark in check box  of the selected rows")
	public void admin_should_see_tick_mark_in_check_box_of_the_selected_rows() {
		 boolean r = dap.clickcheckboxtest();
		   Assert.assertEquals(r, true);
	}

	@Given("Admin is in delete alert after clicks delete button under header after selecting the check box")
	public void admin_is_in_delete_alert_after_clicks_delete_button_under_header_after_selecting_the_check_box() {
		dap.clickcheckbox();
	    dap.clickmultirowdelete();
	}


	@Given("Admin is in delete alert after clicks delete button under header after selecting multiple the check boxes")
	public void admin_is_in_delete_alert_after_clicks_delete_button_under_header_after_selecting_multiple_the_check_boxes() {
		 dap.clickmulticheckbox();
		 dap.clickmultirowdelete();
	}

}
