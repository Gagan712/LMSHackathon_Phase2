package stepDefinition;



import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import pages.ManageProgramepage;


public class Program_SD {
	
	
	
	public WebDriver driver;
	ManageProgramepage program = new ManageProgramepage();
	@Given("Admin is on dashboard page after Login")
	public void admin_is_on_dashboard_page_after_login() {
	     
		program.homepage();
		
	}

	@When("Admin clicks {string} on the navigation bar")
	public void admin_clicks_on_the_navigation_bar(String Program) {
	     program.clickprogramlink();
	}

	@Then("Admin should see URL with {string}")
	public void admin_should_see_url_with(String string) {
	     
		program.ManageprogramUrl();
	}

	@Then("Admin should see a heading with text {string} on the page")
	public void admin_should_see_a_heading_with_text_on_the_page(String headertext) {
		program.verifyHeaderText(headertext);
	}

	@Then("Admin should see the text as {string} along with Pagination icon below the table.")
	public void admin_should_see_the_text_as_along_with_pagination_icon_below_the_table(String paginatortext) {
		program.verifyPaginatorText(paginatortext);
	}

	@Then("Admin should see a Delete button on the top left hand side as Disabled")
	public void admin_should_see_a_delete_button_on_the_top_left_hand_side_as_disabled() {
		
		program.verifyMainDeleteBtnDisabled();
	}

	@Then("Admin should see a +A New Program button on the program page above the data table")
	public void admin_should_see_a_a_new_program_button_on_the_program_page_above_the_data_table() {
	 		program.clickprogrambtn();
	}
 
	@Then("Admin should see the number of records \\(rows of data in the table) displayed on the page are {int}")
	public void admin_should_see_the_number_of_records_rows_of_data_in_the_table_displayed_on_the_page_are(Integer int1) {
		program.noOfRows(int1);
	}

	@Then("Admin should see the sort arrow icon beside to each column header except Edit and Delete")
	public void admin_should_see_the_sort_arrow_icon_beside_to_each_column_header_except_edit_and_delete() {
		program.clickOnSortBtn_Name();
		program.clickOnSortBtn_Desc();
		program.clickOnSortBtn_Status();
	}

	@Then("Admin should see check box on the left side in all rows of the data table")
	public void admin_should_see_check_box_on_the_left_side_in_all_rows_of_the_data_table() {
		program.clickOnSortBtn_Status();  
	}

	@Then("Admin should see data table on the Manage Program Page with following column headers \\(Program Name, Program Description, Program Status, Edit,Delete)")
	public void admin_should_see_data_table_on_the_manage_program_page_with_following_column_headers_program_name_program_description_program_status_edit_delete() {
	     program.verifyColumnHeaderText();

	}

	@Then("Admin should see Any Edit and Delete buttons on each row of the data table")
	public void admin_should_see_any_edit_and_delete_buttons_on_each_row_of_the_data_table() {
	    	      
		program.clickEditButton();
		program.clickRightDeleteButton();
	}

}
