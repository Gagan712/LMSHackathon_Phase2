package stepDefinition;



import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ManageProgramepage;
import pages.UserPage;



public class User_SD {
	
	public WebDriver driver;
	UserPage user = new UserPage();
	
	
	@Given("Logged on the LMS portal as admin")
	public void logged_on_the_lms_portal_as_admin() {
		
		
		
	}

	

	@When("Admin clicks User from navigation bar")
	public void admin_clicks_user_from_navigation_bar() {
		
		user.clickuserlink();
	}
	
	@Then("Admin should see the {string} in the URL")
	public void admin_should_see_the_in_the_url(String urldata) {
		
		String Url= driver.getCurrentUrl(); 
		Assert.assertEquals(urldata,Url.contains("manageuser"));
	}
	
	@Then("Admin should see the {string} in the header")
	public void admin_should_see_the_in_the_header(String headerdata) {
		Assert.assertEquals(user.verifyHeaderText(),headerdata);
		
	}

	
	
	

	@Then("Admin should see the pagination controls under the data table")
	public void admin_should_see_the_pagination_controls_under_the_data_table() {
        
	
	}

	@Then("Admin Should see the data table with {string} Id, Name, location, Phone Number, Edit\\/Delete")
	public void admin_should_see_the_data_table_with_id_name_location_phone_number_edit_delete(String headers) {
		Assert.assertEquals(user.verifyColumnHeaderText(headers),headers);	
	}

	

	@Then("Admin should be able to see the Delete icon button that is disabled")
	public void admin_should_be_able_to_see_the_delete_icon_button_that_is_disabled() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Admin should be able to see the + A New User button")
	public void admin_should_be_able_to_see_the_a_new_user_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Admin should be able to see the + Assign staff button")
	public void admin_should_be_able_to_see_the_assign_staff_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Admin should be able to see the search text box")
	public void admin_should_be_able_to_see_the_search_text_box() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Admin should see each row in the data table should have a {string}")
	public void admin_should_see_each_row_in_the_data_table_should_have_a(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Given("Admin is on dashboard page after Login and Admin clicks {string} from navigation bar")
	public void admin_is_on_dashboard_page_after_login_and_admin_clicks_from_navigation_bar(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Admin clicks + A New User button")
	public void admin_clicks_a_new_user_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Admin should see new pop up with User details appears")
	public void admin_should_see_new_pop_up_with_user_details_appears() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}


}
