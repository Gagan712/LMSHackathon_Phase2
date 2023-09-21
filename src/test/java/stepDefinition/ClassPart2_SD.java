package stepDefinition;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.AssertJUnit;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ClassPage2;

public class ClassPart2_SD

{

	public WebDriver driver;

	ClassPage2 class2 = new ClassPage2(driver);

	@Given("Class Admin is on ManageClass page after clicking class button")
	public void Class_Admin_is_on_manage_class_page_after_clicking_class_button() {

		class2.clickclasslink();
		String Url= driver.getCurrentUrl(); 
		Assert.assertTrue(Url.contains("manageclass"));

	}

	@When("Class Admin click on Batch id column header to sort")
	public void Class_Admin_click_on_batch_id_column_header_to_sort() {

		class2.clickonBatchID();

	}

	@Then("Class Admin should see data table sorted in descending order")
	public void Class_Admin_should_see_data_table_sorted_in_descending_order() {

		class2.verifyDESCOrder_Batchid();

	}

	@When("Class Admin double click on Batch id column header to sort")
	public void Class_Admin_double_click_on_batch_id_column_header_to_sort() {

		class2.doubleclickonBatchID();
	}

	@Then("Class Admin should see data table sorted in ascending  order")
	public void Class_Admin_should_see_data_table_sorted_in_ascending_order() {
		class2.verifyASCOrder_Batchid();

	}
	
	//Pagination Class page
	@Then("Class Admin Data table should display one page  when entries available")
	public void Class_Admin_data_table_should_display_one_page_when_entries_available() {

		Assert.assertTrue(class2.verifyPageAvailableFirstPage());
		
	
	}

	@Then("Class Admin Right arrow should be enabled in page one  when entries are more than {string} available")
	public void Class_Admin_right_arrow_should_be_enabled_in_page_one_when_entries_are_more_than_available(String entry) {

	   Assert.assertTrue(class2.verifyleftRightArrowinFirstPage(entry));
	}

	@Then("Class Admin Left arrow should be disabled in page one when entries are more than {string} available")
	public void Class_Admin_left_arrow_should_be_disabled_in_page_one_when_entries_are_more_than_available(String entry) {

		Assert.assertTrue(class2.verifyleftRightArrowinFirstPage(entry));
	}

	@Then("Class Admin Right arrow should be enabled in page two when entries are more than {string} available")
	public void Class_Admin_right_arrow_should_be_enabled_in_page_two_when_entries_are_more_than_available(String entry) {

		Assert.assertTrue(class2.verifyLeftRightPageTwo(entry));

	
	}

	@Then("Class Admin Left arrow should be enabled in page two")
	public void Class_Admin_left_arrow_should_be_enabled_in_page_two() {

		Assert.assertTrue(class2.verifyLeftArrowPagetwo());

	
	}
	
	@When("Class Admin clicks {string} button in the navigation bar")
	public void Class_Admin_clicks_button_in_the_navigation_bar(String string) {

	
	}

	@Then("Class Admin should able to land on {string} page")
	public void Class_Admin_should_able_to_land_on_page(String string) {

		String Url= driver.getCurrentUrl(); 
		Assert.assertTrue(Url.contains("string"));
	
	}
	
	//Delete multiple
	
	
	@When("Class Admin clicks single  row level check box in the data table")
	public void Class_Admin_clicks_single_row_level_check_box_in_the_data_table() {
	  class2.selectFirstcheckbox();
	}

	@Then("Class Admin should see delete icon below the header is enabled")
	public void Class_Admin_should_see_delete_icon_below_the_header_is_enabled() {

		
		Assert.assertTrue(class2.verifymaindeletedisabled());
	}

	@Then("Class Admin should see tick mark in check box")
	public void Class_Admin_should_see_tick_mark_in_check_box() {
		Assert.assertTrue(class2.Firstcheckboxclick());
	}

	@When("Class Admin clicks multiple row level check box in the data table")
	public void Class_Admin_clicks_multiple_row_level_check_box_in_the_data_table() {
		  Assert.assertTrue(class2.checkboxesclick());

	
	}

	@Then("Class Admin should see tick mark in check box  of the selected rows")
	public void Class_Admin_should_see_tick_mark_in_check_box_of_the_selected_rows() {

		  Assert.assertTrue(class2.verifycheckboxesclick());

	
	}

	@When("Class Admin clicks delete button under header after selecting the check box in the data table")
	public void Class_Admin_clicks_delete_button_under_header_after_selecting_the_check_box_in_the_data_table() {
		class2.Firstcheckboxclick();
	          class2.clickOndeleteheader();
	}

	@When("Class Admin is in delete alert and clicks yes button")
	public void Class_Admin_is_in_delete_alert_and_clicks_yes_button() {
	
		
		class2.clickYesButton();
	}

	@Then("Class Admin Success message {string} and validate particular class details are deleted from the data table")
	public void Class_Admin_success_message_and_validate_particular_class_details_are_deleted_from_the_data_table(String message) {

	Assert.assertEquals(class2.verifyMsg(), message);
	
	
	}


	

	@Then("Class Admin should land on manage class page and validate particular {string} details are not deleted from the data table")
	public void Class_Admin_should_land_on_manage_class_page_and_validate_particular_details_are_not_deleted_from_the_data_table(String classname) throws Exception {

	 class2.verifySearchResultClassName(classname);
	}


	@When("Class Admin clicks delete button under header after selecting the multiple check box in the data table")
	public void Class_Admin_clicks_delete_button_under_header_after_selecting_the_multiple_check_box_in_the_data_table() {
         class2.clickonBatchID();
	
	}

	

	@When("Class Admin is in delete alert and clicks no button")
	public void Class_Admin_is_in_delete_alert_and_clicks_no_button() {
	
		class2.clickNoButton();
	}





}
