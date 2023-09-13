package stepDefinition;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import hooks.Hooks;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ClassPage;

public class ManageClassPage_SD {
	WebDriver driver=Hooks.driver;
	ClassPage cp = new ClassPage(driver);
	
	@Given("Admin is on dashboard page after login in class")
	public void admin_is_on_dashboard_page_after_login_in_class() {
	  cp.homepage();
	}

	@When("Admin clicks {string} button on the navigation bar in class")
	public void admin_clicks_button_on_the_navigation_bar_in_class(String string) {
	  cp.clickclasslink();
	}

	@Then("Admin should see URL with {string} in class")
	public void admin_should_see_url_with_in_class(String string) {
		String url = cp.ManageclassUrl();
		Assert.assertEquals("manageclass",url.contains("manageclass"));
	}

	@Then("Get the response time for navigation from dashboard page to manage class page in class")
	public void get_the_response_time_for_navigation_from_dashboard_page_to_manage_class_page_in_class() {
	  long responsetime= cp.pageloadtime();
	  System.out.println("Total responsetime is "+responsetime);
	}

	@Then("Admin should see header with {string} in class")
	public void admin_should_see_header_with_in_class(String string) {
	  String headertext=cp.verifyHeaderText();
	  Assert.assertEquals(headertext, "Manage Class");
	}

	@Then("Admin should see all the {string} and the correct spelling in class")
	public void admin_should_see_all_the_batch_id_and_the_correct_spelling_in_class() {
		
		List<Object> headerslist= cp.verifyColumnHeaderText();
		assertEquals(headerslist.get(0), "Batch Id");
		assertEquals(headerslist.get(1), "Class No");
		assertEquals(headerslist.get(2), "Class Date");
		assertEquals(headerslist.get(3), "Class Topic");
		assertEquals(headerslist.get(4), "Staff Id");
		assertEquals(headerslist.get(5), "Description");
		assertEquals(headerslist.get(6), "Comments");
		assertEquals(headerslist.get(7), "Notes");
		assertEquals(headerslist.get(8), "Recording");
		assertEquals(headerslist.get(9), "Edit");
		assertEquals(headerslist.get(10), "Delete");			
}

	@Then("Admin should see disabled delete icon below the {string} in class")
	public void admin_should_see_disabled_delete_icon_below_the_in_class(String string) {
		boolean result = cp.verifymaindeletedisabled();
	   Assert.assertEquals(false, result);
	}

	@Then("Admin should see search bar on the class page in class")
	public void admin_should_see_search_bar_on_the_class_page_in_class() {
	   boolean condition= cp.searchbarpresent();
	   Assert.assertEquals(condition, true);
	}

	@Then("Admin should see +Add New Class button on the class page in class")
	public void admin_should_see_add_new_class_button_on_the_class_page_in_class() {
		  boolean rslt= cp.addnewclasspresent();
		   Assert.assertEquals(rslt, true);
	}

	@Then("Edit Icon in each row of data table only  when entries are available in class")
	public void edit_icon_in_each_row_of_data_table_only_when_entries_are_available_in_class() {
		boolean cond= cp.verifydataintable(); //shd return true
		if(cond == true) {
			 boolean r= cp.editbuttonenabled(); //shd return true
			   Assert.assertEquals(r, true);
		} 
		 
	}

	@Then("Edit Icon will not be present in data table in class")
	public void edit_icon_will_not_be_present_in_data_table_in_class() {
		boolean cond2= cp.verifydataintable(); //shd return false
		if(cond2 == false) {
		 boolean c= cp.editbuttonenabled(); //shd return false
		 Assert.assertEquals(c, false);
	}
	}

	@Then("Delete Icon in each row of data table only when entries are available in class")
	public void delete_icon_in_each_row_of_data_table_only_when_entries_are_available_in_class() {
		boolean delcond= cp.verifydataintable(); //shd return true
		if(delcond == true) {
			boolean ena = cp.deletebuttonenabled();
			  Assert.assertEquals(ena, true);
		}
	}

	@Then("Admin cant see delete Icon in data table in class")
	public void admin_cant_see_delete_icon_in_data_table_in_class() {
		boolean delcond2= cp.verifydataintable(); //shd return false
		if(delcond2 == false) {
		 boolean disa= cp.deletebuttonenabled(); //shd return false
		 Assert.assertEquals(disa, false);
	}
	}

	@Then("Admin should see sort icon near the column headers except for Edit and Delete in class")
	public void admin_should_see_sort_icon_near_the_column_headers_except_for_edit_and_delete_in_class() {
	   boolean sortresult=  cp.sortinginheaders();
	   Assert.assertEquals(sortresult, true);
	}

	@Then("Admin should see check box in the all rows  of data table in class")
	public void admin_should_see_check_box_in_the_all_rows_of_data_table_in_class() {
	  boolean checkforchkbox= cp.checkboxesclick();
	  Assert.assertEquals(checkforchkbox, true);
	}

	@Then("Admin should see the text as {string} below the table above the footer in class")
	public void admin_should_see_the_text_as_below_the_table_above_the_footer_in_class(String string) {
	  String txt = cp.entriestext();
	  Assert.assertEquals(txt, "Showing 1 to 2 of 2 entries");
	}

	@Then("Admin should see the pagination controls under the data table in class")
	public void admin_should_see_the_pagination_controls_under_the_data_table_in_class() {
	boolean nextpagefinal= cp.nextpage();
	boolean prevpagefinal= cp.previouspage();
	boolean firstpagefinal= cp.firstpage();
	boolean lastpagefinal= cp.lastpage();
	Assert.assertEquals(nextpagefinal, true);
	Assert.assertEquals(prevpagefinal, true);
	Assert.assertEquals(firstpagefinal, true);
	Assert.assertEquals(lastpagefinal, true);
	}

	@Then("Admin should see the text with total number classes in the data table {string} in class")
	public void admin_should_see_the_text_with_total_number_classes_in_the_data_table_in_class(String string) {
	String cls= cp.totallyclasses();
	Assert.assertEquals(cls, "In total there are 3 classes");
	}



}
