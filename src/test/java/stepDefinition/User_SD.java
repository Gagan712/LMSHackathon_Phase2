package stepDefinition;



import org.testng.Assert;
import org.testng.AssertJUnit;
import static org.testng.Assert.assertTrue;

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
	public void user_admin_logged_on_the_lms_portal_as_admin() {
		
		
		
	}

	@Given("User Admin is on {string} page after Login")
	public void user_admin_is_on_page_after_login(String dashboard) {
		String Url= driver.getCurrentUrl(); 
		Assert.assertEquals(dashboard,Url.contains("dashboard"));

	
	
	}

	@When("User Admin clicks User from navigation bar")
	public void user_admin_clicks_user_from_navigation_bar() {
		
		user.clickuserlink();
	}
	@Given("User Admin is on {string} page after Login And User Admin clicks User from navigation bar")
	public void user_admin_is_on_page_after_login_and_user_admin_clicks_user_from_navigation_bar(String dashboard) {
		String Url= driver.getCurrentUrl(); 
		Assert.assertEquals(dashboard,Url.contains("dashboard"));
		user.clickuserlink();
	
	
	}

	
	
	
	@Then("User Admin should see the {string} in the URL")
	public void user_admin_should_see_the_in_the_url(String urldata) {
		
		String Url= driver.getCurrentUrl(); 
		Assert.assertEquals(urldata,Url.contains("manageuser"));
	}
	
	
	
	@Then("User Admin should see the {string} in the header")
	public void user_admin_should_see_the_in_the_header(String headerdata) {
		Assert.assertEquals(user.verifyHeaderText(),headerdata);
		
	}

	
	
	

	@Then("User Admin should see the pagination controls under the data table")
	public void user_admin_should_see_the_pagination_controls_under_the_data_table() {
        
		Assert.assertTrue(user.verifyPagination());
	
	}

	@Then("User Admin Should see the data table with {string} Id, Name, location, Phone Number, Edit\\/Delete")
	public void user_admin_should_see_the_data_table_with_id_name_location_phone_number_edit_delete(String headers) {
		Assert.assertEquals(user.verifyColumnHeaderText(headers),headers);	
	}

	

	@Then("User Admin should be able to see the Delete icon button that is disabled")
	public void user_admin_should_be_able_to_see_the_delete_icon_button_that_is_disabled() {
		AssertJUnit.assertFalse("Delete Button is not disabled", user.verifyEnableMainBtn());
	
	}

	@Then("User Admin should be able to see the {string} button")
	public void user_admin_should_be_able_to_see_the_button(String text) {
		//String value=user.newUserOrNewassignText(text);
		//Assert.assertEquals(value, text);
//		if(driver.getPageSource().contains(text))
//		{
//			System.out.println("Element is present");
//		}
//		else {
//			System.out.println("Element is not present");
//		}
		
		Assert.assertTrue(user.verifyButtonVisible(text));
	}

	@Then("User Admin should be able to see the search text box")
	public void user_admin_should_be_able_to_see_the_search_text_box() {
		Assert.assertTrue(user.verifySearchtextbox());
	}

	@Then("User Admin should see each row in the data table should have a {string}")
	public void user_admin_should_see_each_row_in_the_data_table_should_have_a(String options) {
         if(options.equalsIgnoreCase("checkbox"))
         {
        	 user.verifyAllCheckbox();;
         }
         else if(options.equalsIgnoreCase("edit icon"))
         {
        	 user.verifyEditButton();
         }
         else if(options.equalsIgnoreCase("delete icon"))
         {
        	 user.verifyfirstDeletBtn();
        	 user.verifySecondDeletBtn();
         }
	
	
	}

	
	
	
	@When("User Admin clicks + A New User button")
	public void user_admin_clicks_a_new_user_button() {

	user.clickNewUserbtn();
	}

	@Then("User Admin should see new pop up with User details appears")
	public void user_admin_should_see_new_pop_up_with_user_details_appears() {
		Assert.assertTrue(user.verifySwitchToWindow());
		//user.verifyNewUserWindow();
		
	}
	
	//Add User
	
	@When("User Admin The pop up should include the fields First Name,Middle name, Last Name, Location phone, email,linkedin Url,Undergraduate,postgraduate,time zone and user comments as {string} box and User Role ,Role Status ,Visa Status as drop down {string}")
	public void user_admin_the_pop_up_should_include_the_fields_first_name_middle_name_last_name_location_phone_email_linkedin_url_undergraduate_postgraduate_time_zone_and_user_comments_as_box_and_user_role_role_status_visa_status_as_drop_down(String text, String dropdown) {

	user.verifytextboxtype(text);
	user.verifydropdownype(dropdown);
	
	}

	
	@Given("The edit icon on row level in data table is enabled")
	public void user_admin_the_edit_icon_on_row_level_in_data_table_is_enabled() {
       user.clickEditButton();
	
	}

	@When("User Admin clicks the edit icon")
	public void user_admin_clicks_the_edit_icon() {
	       user.clickEditButton();

	}
	
	
	
	

	@When("User Admin fill in fields {string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string}")
	public void user_admin_fill_in_fields(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8, String string9, String string10, String string11, String string12, String string13, String string14) {

	user.setUserWindowDetails(string, string2, string3, string4, string5, string6, string7, string8, string9, string10, string11, string12, string13, string14);
	user.clicksaveButton();
	}

	@Then("User Admin should see the {string}")
	public void user_admin_should_see_the(String msg) {
		
		Assert.assertEquals(user.verifyMsg(), msg);
	}
	
	//Delete User
	@When("A The delete icon on row level in data table is enabled")
	public void user_admin_a_the_delete_icon_on_row_level_in_data_table_is_enabled() {
		Assert.assertTrue(user.verifyfirstDeletBtn());
	}

	@When("User Admin clicks the delete icon")
	public void user_admin_clicks_the_delete_icon() {
        user.clickOnfirstDeleteButton();
	
	
	}

	@Then("User Admin Alert appears with yes and No option")
	public void user_admin_alert_appears_with_yes_and_no_option() {
        user.getAlertmsg();
	
	}

	@When("User Admin click yes option")
	public void user_admin_click_yes_option() {
     user.clickYesButton();
	
	}

	@Then("User Admin  {string} alert pops and user is no more available in data table")
	public void user_admin_user_alert_pops_and_user_is_no_more_available_in_data_table(String popupmsg) {

	  user.verifyPopUPWindow(popupmsg);
	}


	@When("User Admin click No option")
	public void user_admin_click_no_option() {
    user.clickNoButton();
	
	
	}

	@Then("User Admin sees {string} is still listed in data table")
	public void user_admin_sees_is_still_listed_in_data_table(String userName) throws Exception {

	user.verifySearchResultUserName(userName);
	
	}

	

	@When("User Admin None of the checkboxes in data table are selected")
	public void user_admin_none_of_the_checkboxes_in_data_table_are_selected() {
       user.verifyAllCheckbox();
	
	}

	@Then("User Admin The delete icon under the Manage User header should be disabled")
	public void user_admin_the_delete_icon_under_the_manage_user_header_should_be_disabled() {

	Assert.assertFalse(user.verifyEnableMainBtn(),"Delete is not diabled");
	
	}

	@Given("Admin User One of the checkbox row is selected")
	public void user_admin_one_of_the_checkbox_row_is_selected() {
      user.selectFirstCheckbox();
	
	}

	@When("User Admin Click delete icon below Manage User header")
	public void user_admin_click_delete_icon_below_manage_user_header() {
      user.clickOnfirstDeleteButton();
	
	}

	@Then("User Admin The respective row in the data table is deleted")
	public void user_admin_user_admin_the_respective_row_in_the_data_table_is_deleted() throws Exception {

	user.verifyUserNameExist();
	}

	@When("User admin Two or more checkboxes row is selected")
	public void user_admin_two_or_more_checkboxes_row_is_selected() {

	user.selectMultipleCheckboxes();
	}

	


}
