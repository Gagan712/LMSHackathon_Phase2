package stepDefinition;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Program_POM;

public class Program_SD {
	public WebDriver driver;
	Program_POM program = new Program_POM();
	@Given("Program_Admin is on dashboard page after Login")
	public void program_admin_is_on_dashboard_page_after_login() {
	     		program.homepage();
	     		String title = driver.getTitle();
	    		Assert.assertEquals("Manage Program",title);
	    		System.out.println("User is on " +title);
		
	}

	@When("Program_Admin clicks {string} on the navigation bar")
	public void program_admin_clicks_on_the_navigation_bar(String Program) {
	     program.clickprogramlink();
	}

	@Then("Program_Admin should see URL with {string}")
	public void program_admin_should_see_url_with(String string) {
	     
		program.ManageprogramUrl();
	}

	@Then("Program_Admin should see a heading with text {string} on the page")
	public void program_admin_should_see_a_heading_with_text_on_the_page(String expectedMsg) {
		program.verifyHeaderText(expectedMsg);
		String actualMsg = program.Message(expectedMsg);
		Assert.assertEquals(expectedMsg,actualMsg);
		System.out.println(actualMsg);
	}

	@Then("Program_Admin should see the text as {string} along with Pagination icon below the table.")
	public void program_admin_should_see_the_text_as_along_with_pagination_icon_below_the_table(String expectedMsg) {
		program.verifyPaginatorText(expectedMsg);
		String actualMsg = program.Message(expectedMsg);
		Assert.assertEquals(expectedMsg,actualMsg);
		System.out.println(actualMsg);
	}

	@Then("Program_Admin should see a Delete button on the top left hand side as Disabled")
	public void program_admin_should_see_a_delete_button_on_the_top_left_hand_side_as_disabled() {
		
		program.verifyMainDeleteBtnDisabled();
	}

	@Then("Program_Admin should see a +A New Program button on the program page above the data table")
	public void program_admin_should_see_a_a_new_program_button_on_the_program_page_above_the_data_table() {
	 		program.clickprogrambtn();
	}
 
	@Then("Program_Admin should see the number of records \\(rows of data in the table) displayed on the page are {int}")
	public void program_admin_should_see_the_number_of_records_rows_of_data_in_the_table_displayed_on_the_page_are(Integer int1) {
		program.noOfRows(int1);
	}

	@Then("Program_Admin should see the sort arrow icon beside to each column header except Edit and Delete")
	public void program_admin_should_see_the_sort_arrow_icon_beside_to_each_column_header_except_edit_and_delete() {
		program.clickOnSortBtn_Name();
		program.clickOnSortBtn_Desc();
		program.clickOnSortBtn_Status();
	}

	@Then("Program_Admin should see check box on the left side in all rows of the data table")
	public void program_admin_should_see_check_box_on_the_left_side_in_all_rows_of_the_data_table() {
		program.clickOnSortBtn_Status();  
	}

	@Then("Program_Admin should see data table on the Manage Program Page with following column headers \\(Program Name, Program Description, Program Status, Edit,Delete)")
	public void program_admin_should_see_data_table_on_the_manage_program_page_with_following_column_headers_program_name_program_description_program_status_edit_delete() {
	     program.verifyColumnHeaderText();
	      
	}

	@Then("Program_Admin should see Any Edit and Delete buttons on each row of the data table")
	public void program_admin_should_see_any_edit_and_delete_buttons_on_each_row_of_the_data_table() {
	    	      
		program.clickEditButton();
		program.clickRightDeleteButton();
	}


	@Then("Program_Admin should see Search bar with text as {string}")
	public void program_admin_should_see_search_bar_with_text_as(String search) {
	     
	    program.verifySearchText(search);
	}

	@Then("Program_Admin should see the Programs displayed based on the Program Name")
	public void program_admin_should_see_the_programs_displayed_based_on_the_program_name() {
	
	}

	@Given("Admin is on Manage Program Page")
	public void program_admin_is_on_manage_program_page(String user, String staff) {
		program.validUserStaff(user, staff);
		   program.clickprogramlink();
	}

	@When("Program_Admin enters <Program description phrase> into search box")
	public void program_admin_enters_program_description_phrase_into_search_box(String newdes)  {
	     
	    program.setProgramDescription(newdes);
	    program.clicksaveButton();

	}

	@Then("Program_Admin should see the Programs displayed based on the Program Description")
	public void program_admin_should_see_the_programs_displayed_based_on_the_program_description(String Desc ) {
		program.enterSearchText(Desc);
		
	}   

	@When("Program_Admin enters <Program description Status> into search box")
	public void program_admin_enters_program_description_status_into_search_box(String newdes) {
		program.enterSearchText(newdes);
	}

	@Then("Program_Admin should see the Programs displayed based on the Program Status")
	public void program_admin_should_see_the_programs_displayed_based_on_the_program_status(String status) {
	    program.enterSearchText(status);
	}

	@When("Program_Admin enters the keywords not present in the data table on the Search box")
	public void program_admin_enters_the_keywords_not_present_in_the_data_table_on_the_search_box() {
	     
	}

	@Then("Program_Admin should see zero entries on the data table")
	public void program_admin_should_see_zero_entries_on_the_data_table() {
	    
	}

	@When("Program_Admin clicks <A New Program>button")
	public void program_admin_clicks_a_new_program_button() {
	     
	}

	@Then("Program_Admin should see a popup open for Program details with empty form along with <SAVE> and <CANCEL> button and Close\\(X) Icon on the top right corner of the window")
	public void program_admin_should_see_a_popup_open_for_program_details_with_empty_form_along_with_save_and_cancel_button_and_close_x_icon_on_the_top_right_corner_of_the_window() {
	     
	}

	@Then("Program_Admin should see two radio button for Program Status")
	public void program_admin_should_see_two_radio_button_for_program_status() {
	     
	}

	@When("Program_Admin clicks <Edit> button on the data table for any row")
	public void program_admin_clicks_edit_button_on_the_data_table_for_any_row() {
	     
	}

	@Then("Program_Admin should see a popup open for Program details to edit")
	public void program_admin_should_see_a_popup_open_for_program_details_to_edit(String newname)  {
	    program.enterSearchText(newname);
	}

	@Given("Program_Admin is on Program Details Popup window to Edit")
	public void program_admin_is_on_program_details_popup_window_to_edit() {
	    
	}
	@When("Program_Admin edits the Name column and clicks save button")
	public void program_admin_edits_the_name_column_and_clicks_save_button() {
	    
	}

	@Then("Program_Admin gets a message {string} alert and able to see the updated name in the table for the particular program")
	public void program_admin_gets_a_message_alert_and_able_to_see_the_updated_name_in_the_table_for_the_particular_program(String string) {
	     
	}

	@When("Program_Admin edits the Description column and clicks save button")
	public void program_admin_edits_the_description_column_and_clicks_save_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Program_Admin gets a message {string} alert and able to see the updated description in the table for the particular program")
	public void program_admin_gets_a_message_alert_and_able_to_see_the_updated_description_in_the_table_for_the_particular_program(String string) {
	     
	}

	@When("Program_Admin changes the Status and clicks save button")
	public void program_admin_changes_the_status_and_clicks_save_button(String Status) {
	    program.setProgramstatus(Status);
	    program.clicksaveButton();
	}

	@Then("Program_Admin gets a message {string} alert and able to see the updated status in the table for the particular program")
	public void program_admin_gets_a_message_alert_and_able_to_see_the_updated_status_in_the_table_for_the_particular_program(String string) {
	    
	}

	@When("Program_Admin enters only numbers or special char in name and desc column")
	public void program_admin_enters_only_numbers_or_special_char_in_name_and_desc_column() {
	     
	}

	@Then("Program_Admin gets a Error message alert")
	public void program_admin_gets_a_error_message_alert() {
	     
	}

	@When("Program_Admin clicks <Cancel>button on edit popup")
	public void program_admin_clicks_cancel_button_on_edit_popup() {
	    program.clickCancelButton();
	}

	@Then("Program_Admin can see the Program details popup disappears and can see nothing changed for particular program")
	public void program_admin_can_see_the_program_details_popup_disappears_and_can_see_nothing_changed_for_particular_program() {
	     
	}

	@When("Program_Admin clicks <Save>button on edit popup")
	public void program_admin_clicks_save_button_on_edit_popup() {
	    
	}

	@Then("Program_Admin gets a message {string} alert and able to see the updated details in the table for the particular program")
	public void program_admin_gets_a_message_alert_and_able_to_see_the_updated_details_in_the_table_for_the_particular_program(String string) {
	     
	}

	@When("Program_Admin clicks <Delete> button on the data table for any row")
	public void program_admin_clicks_delete_button_on_the_data_table_for_any_row() {
	     
	}

	@Then("Program_Admin should see a alert open with heading {string} along with  <YES> and <NO> button for deletion")
	public void program_admin_should_see_a_alert_open_with_heading_along_with_yes_and_no_button_for_deletion(String string) {
	     
	}

	@Then("Program_Admin should see a message {string}")
	public void program_admin_should_see_a_message(String string) {
	     
	}

	@Given("Admin is on Confirm Deletion alert")
	public void program_admin_is_on_confirm_deletion_alert() {
	     
	}

	@When("Program_Admin clicks <YES> button on the alert")
	public void program_admin_clicks_yes_button_on_the_alert() {
	     
	}

	@Then("Program_Admin gets a message {string} alert and able to see that program deleted in the data table")
	public void program_admin_gets_a_message_alert_and_able_to_see_that_program_deleted_in_the_data_table(String string) {
	   
	}

	@When("Program_Admin clicks <NO> button on the alert")
	public void program_admin_clicks_no_button_on_the_alert() {
	     
	}

	@Then("Program_Admin can see the deletion alert disappears without deleting")
	public void program_admin_can_see_the_deletion_alert_disappears_without_deleting() {
	    
	}

	@Given("Program_Admin is in Manage Program page")
	public void program_admin_is_in_manage_program_page() {
	    
	}

	@When("Program_Admin clicks any checkbox in the data table")
	public void program_admin_clicks_any_checkbox_in_the_data_table() {
	     
	}

	@Then("Program_Admin should see common delete option enabled under header Manage Program")
	public void program_admin_should_see_common_delete_option_enabled_under_header_manage_program() {
	     
	}

	@Then("Program_Admin should land on Manage Program page and can see the selected program is deleted from the data table")
	public void program_admin_should_land_on_manage_program_page_and_can_see_the_selected_program_is_deleted_from_the_data_table() {
	    program.clickRightDeleteButton();
	}

	@Then("Program_Admin should land on Manage Program page and can see the selected programs are not deleted from the data table")
	public void program_admin_should_land_on_manage_program_page_and_can_see_the_selected_programs_are_not_deleted_from_the_data_table() {
	    
	}

	 

	@Given("Program_Admin is on Manage Program page")
	public void program_admin_is_on_manage_program_page() {
	     
	}

	@When("Program_Admin clicks the sort icon of program name column")
	public void program_admin_clicks_the_sort_icon_of_program_name_column() {
	     
	}

	@Then("Program_The data get sorted on the table based on the program name column values in descending order")
	public void program_admin_the_data_get_sorted_on_the_table_based_on_the_program_name_column_values_in_descending_order() {
		program.verifyDESCOrder_Name();
	}

	@Given("The data is in the ascending order on the table based on Program Name column")
	public void program_the_data_is_in_the_ascending_order_on_the_table_based_on_program_name_column() {
	    program.clickOnSortBtn_Name();
	}

	@When("Program_Admin clicks the sort icon of program Desc column")
	public void program_admin_clicks_the_sort_icon_of_program_desc_column() {
		   program.clickOnSortBtn_Desc();
	     
	}

	@Then("Program_The data get sorted on the table based on the program description column values in ascending order")
	public void program_the_data_get_sorted_on_the_table_based_on_the_program_description_column_values_in_ascending_order() {
	    program.verifyDESCOrder_Name();
	}

	@Given("Program_The data is in the ascending order on the table based on Program Description column")
	public void program_the_data_is_in_the_ascending_order_on_the_table_based_on_program_description_column() {
	     
	}

	@Then("Program_The data get sorted on the table based on the program description column values in descending order")
	public void program_the_data_get_sorted_on_the_table_based_on_the_program_description_column_values_in_descending_order() {
	    
	}

	@Then("Program_The data get sorted on the table based on the program status column values in ascending order")
	public void program_the_data_get_sorted_on_the_table_based_on_the_program_status_column_values_in_ascending_order() {
	    program.clickOnSortBtn_Status();
	     
	}

	@Then("Program_The data get sorted on the table based on the program status column values in descending order")
	public void program_the_data_get_sorted_on_the_table_based_on_the_program_status_column_values_in_descending_order() {
	    program.verifyDESCOrder_Status();
	}

	@When("Program_Admin clicks Next page link on the program table")
	public void program_admin_clicks_next_page_link_on_the_program_table() {
	     
	}

	@Then("Program_Admin should see the Pagination has {string} link")
	public void program_admin_should_see_the_pagination_has_link(String paginatortext) {
		   program.verifyPaginatorText(paginatortext);
	}

	@When("Program_Admin clicks Last page link")
	public void program_admin_clicks_last_page_link() throws Exception {
		program.clickLastPage();
	}

	@Then("Program_Admin should see the last page record on the table with Next page link are disabled")
	public void program_admin_should_see_the_last_page_record_on_the_table_with_next_page_link_are_disabled() throws Exception {
	    program.clickNextPage();
	}

	@Given("Program_Admin is on last page of Program table")
	public void program_admin_is_on_last_page_of_program_table() throws Exception {
	    program.clickLastPage();
	}

	@When("Program_Admin clicks First page link")
	public void program_admin_clicks_first_page_link() throws Exception {
	    program.clickFirstPage();   
	}

	@Then("Program_Admin should see the previous page record on the table with pagination has previous page link")
	public void program_admin_should_see_the_previous_page_record_on_the_table_with_pagination_has_previous_page_link() throws Exception {
		program.clickPrevPage();
	}

	@Given("Admin is on Previous Program page")
	public void program_admin_is_on_previous_program_page() throws Exception {
		   program.clickPrevPage();
	}

	@When("Program_Admin clicks Start page link")
	public void program_admin_clicks_start_page_link() {
	     program.clickstartpage();
	}

	@Then("Program_Admin should see the very first page record on the table with Previous page link are disabled")
	public void program_admin_should_see_the_very_first_page_record_on_the_table_with_previous_page_link_are_disabled() throws Exception {
		   program.clickPrevPage();
	}

	@When("Program_Admin clicks on Student link on Manage Program page")
	public void program_admin_clicks_on_student_link_on_manage_program_page() {
	     program.ClickStudentpage();
	}

	@Then("Program_Admin is re-directed to Student page")
	public void program_admin_is_re_directed_to_student_page() {
	    program.Studentpage();
	}

	@When("Program_Admin clicks on Batch link on Manage Program page")
	public void program_admin_clicks_on_batch_link_on_manage_program_page() {
		program.ClickBatchlink();
	}

	@Then("Program_Admin is re-directed to Batch page")
	public void program_admin_is_re_directed_to_batch_page() {
		  program.batchpage();
	}

	@When("Program_Admin clicks on Class link on Manage Program page")
	public void program_admin_clicks_on_class_link_on_manage_program_page() {
		 program.clickClasslink();
	}
	 
	@Then("Program_Admin is re-directed to Class page")
	public void program_admin_is_re_directed_to_class_page() {
	     program.Class();
	}

	@When("Program_Admin clicks on User link on Manage Program page")
	public void program_admin_clicks_on_user_link_on_manage_program_page() {
	     program.ClickUser();
	}

	@Then("Program_Admin is re-directed to User page")
	public void program_admin_is_re_directed_to_user_page() {
		program.User();
	}

	@When("Program_Admin clicks on Assignment link on Manage Program page")
	public void program_admin_clicks_on_assignment_link_on_manage_program_page() {
		program.ClickAssignmentlink();
	}

	@Then("Program_Admin is re-directed to Assignment page")
	public void program_admin_is_re_directed_to_assignment_page() {
		program.Assignment();
	}

	@When("Program_Admin clicks on Attendance link on Manage Program page")
	public void program_admin_clicks_on_attendance_link_on_manage_program_page() {
		program.ClickAttendance ();
	}

	@Then("Program_Admin is re-directed to Attendance page")
	public void program_admin_is_re_directed_to_attendance_page() {
		program.Attendance();
	}

	@When("Program_Admin clicks on Logout link on Manage Program page")
	public void program_admin_clicks_on_logout_link_on_manage_program_page() {
		program.Clicklogout();
	}

	@Then("Program_Admin is re-directed to Login page")
	public void program_admin_is_re_directed_to_login_page() {
	    program.loginpage();
	}


}



