package stepDefinition;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
//import org.testng.AssertJUnit;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Assignment;

public class Assignment_SD

{

	public WebDriver driver;

	Assignment Assignment = new Assignment(driver);

	@Given("Admin is on ManageAssignment_ page after clicking Assignment_ button")
	public void admin_is_on_manage_Assignment_page_after_clicking_Assignment_button() {

		Assignment.clickAssignmentlink();
		String Url= driver.getCurrentUrl(); 
		Assert.assertTrue(Url.contains("manageAssignment_"));

	}

	@When("Admin click on Batch id column header to sort")
	public void admin_click_on_batch_id_column_header_to_sort() {

		Assignment.clickonBatchID();

	}

	@Then("Admin should see data table sorted in descending order")
	public void admin_should_see_data_table_sorted_in_descending_order() {

		Assignment.verifyDESCOrder_Batchid();

	}

	@When("Admin double click on Batch id column header to sort")
	public void admin_double_click_on_batch_id_column_header_to_sort() {

		Assignment.doubleclickonBatchID();
	}

	@Then("Admin should see data table sorted in ascending  order")
	public void admin_should_see_data_table_sorted_in_ascending_order() {
		Assignment.verifyASCOrder_Batchid();

	}
	
	//Pagination Assignment page
	@Then("Data table should display one page  when entries available")
	public void data_table_should_display_one_page_when_entries_available() {

		Assert.assertTrue(Assignment.verifyPageAvailableFirstPage());
		
	
	}

	@Then("Right arrow should be enabled in page one  when entries are more than {string} available")
	public void right_arrow_should_be_enabled_in_page_one_when_entries_are_more_than_available(String entry) {

	   Assert.assertTrue(Assignment.verifyleftRightArrowinFirstPage(entry));
	}

	@Then("Left arrow should be disabled in page one when entries are more than {string} available")
	public void left_arrow_should_be_disabled_in_page_one_when_entries_are_more_than_available(String entry) {

		Assert.assertTrue(Assignment.verifyleftRightArrowinFirstPage(entry));
	}

	@Then("Right arrow should be enabled in page two when entries are more than {string} available")
	public void right_arrow_should_be_enabled_in_page_two_when_entries_are_more_than_available(String entry) {

		Assert.assertTrue(Assignment.verifyLeftRightPageTwo(entry));

	
	}

	@Then("Left arrow should be enabled in page two")
	public void left_arrow_should_be_enabled_in_page_two() {

		Assert.assertTrue(Assignment.verifyLeftArrowPagetwo());

	
	}
	
	@When("Admin clicks {string} button in the navigation bar")
	public void admin_clicks_button_in_the_navigation_bar(String string) {

	
	}

	@Then("Admin should able to land on {string} page")
	public void admin_should_able_to_land_on_page(String string) {

		String Url= driver.getCurrentUrl(); 
		Assert.assertTrue(Url.contains("string"));
	
	}
	
	//Delete multiple
	
	
	@When("Admin clicks single  row level check box in the data table")
	public void admin_clicks_single_row_level_check_box_in_the_data_table() {
	  Assignment.selectFirstcheckbox();
	}

	@Then("Admin should see delete icon below the header is enabled")
	public void admin_should_see_delete_icon_below_the_header_is_enabled() {

		
		Assert.assertTrue(Assignment.verifymaindeletedisabled());
	}

	@Then("Admin should see tick mark in check box")
	public void admin_should_see_tick_mark_in_check_box() {
		Assert.assertTrue(Assignment.Firstcheckboxclick());
	}

	@When("Admin clicks multiple row level check box in the data table")
	public void admin_clicks_multiple_row_level_check_box_in_the_data_table() {
		  Assert.assertTrue(Assignment.checkboxesclick());

	
	}

	@Then("Admin should see tick mark in check box  of the selected rows")
	public void admin_should_see_tick_mark_in_check_box_of_the_selected_rows() {

		  Assert.assertTrue(Assignment.verifycheckboxesclick());

	
	}

	@When("Admin clicks delete button under header after selecting the check box in the data table")
	public void admin_clicks_delete_button_under_header_after_selecting_the_check_box_in_the_data_table() {
		Assignment.Firstcheckboxclick();
	          Assignment.clickOndeleteheader();
	}

	@When("Admin is in delete alert and clicks yes button")
	public void admin_is_in_delete_alert_and_clicks_yes_button() {
	
		
		Assignment.clickYesButton();
	}

	@Then("Success message {string} and validate particular Assignment details are deleted from the data table")
	public void success_message_and_validate_particular_Assignment_details_are_deleted_from_the_data_table(String message) {

	Assert.assertEquals(Assignment.verifyMsg(), message);
	
	
	}


	@Then("Admin should land on manage Assignment page and validate particular {string} details are not deleted from the data table")
	public void admin_should_land_on_manage_Assignment_page_and_validate_particular_details_are_not_deleted_from_the_data_table(String Assignmentname) throws Exception {

	 Assignment.verifySearchResultAssignmentName(Assignmentname);
	}


	@When("Admin clicks delete button under header after selecting the multiple check box in the data table")
	public void admin_clicks_delete_button_under_header_after_selecting_the_multiple_check_box_in_the_data_table() {
         Assignment.clickonBatchID();
	
	}

	

	@When("Admin is in delete alert and clicks no button")
	public void admin_is_in_delete_alert_and_clicks_no_button() {
	
		Assignment.clickNoButton();
	}





}
