package stepDefinition;

import org.testng.Assert;
import org.testng.AssertJUnit;
import org.apache.hc.core5.util.Asserts;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Program_POM;
import pages.batch_POM;
//import pages.batch_POM;

public class batch_SD {
	 
	
	public WebDriver driver;
	batch_POM  batch = new  batch_POM();
	
@Given("Batch_Admin is on dashboard page after Login")
	public void batch_Admin_is_on_dashboard_page_after_Login() {
		 batch.selectFirstCheckbox();
		
	}	
@When("Batch_Admin clicks {string} from navigation bar")
public void batch_Admin_Clicks_from_navigation_bar(String batchlink) {
	batch.Clickbatchlink();

}

@Then("Batch_Admin should see the {string} in the URL")
public void batch_Admin_should_see_the_in_the_url(String Urldata ) {
	String Url= driver.getCurrentUrl(); 
	AssertJUnit.assertEquals(Urldata,Url.contains("manageuser"));
}

@Then("Batch_Admin should see the pagination controls under the data table")
public void batch_Admin_should_see_the_pagination_controls_under_the_data_table() {
	AssertJUnit.assertTrue(batch.verifyPagination());
}

@Then("Batch_Admin Should see the data table with headers Batch name, Batch Description,Batch Status, No. of classes, Program Name, EditDelete")
public void batch_Admin_should_see_the_data_table_with_headers_batch_name_batch_description_batch_status_no_of_classes_program_name_edit_delete(String headers) {
	Assert.assertEquals(batch.verifyColumnHeaderText(headers),headers);	
}

@Then("Batch_Admin should be able to see the {string} icon button that is disabled")
public void batch_Admin_should_be_able_to_see_the_icon_button_that_is_disabled(String string) {
	Assert.assertEquals("Delete Button is disabled", batch.verifyEnableMainBtn());
}

@Then("Batch_Admin should be able to see the {string} button")
public void batch_Admin__should_be_able_to_see_the_button(String  text) {
	if(driver.getPageSource().contains(text))
	{
		System.out.println("Element is present");
	}
	else {
		System.out.println("Element is not present");
	}
}

@Then("Batch_Admin Each row in the data table should have a checkbox")
public void batch_Admin_each_row_in_the_data_table_should_have_a_checkbox() {
	Assert.assertTrue(batch.verifySearchcheckbox());
}

@Then("Batch_Admin Each row in the data table should have a edit icon that is enabled")
public void batch_Admin_each_row_in_the_data_table_should_have_a_edit_icon_that_is_enabled() {
	batch.clickEditBtn();
}

@Then("Batch_Admin Each row in the data table should have a delete icon that is enabled")
public void batch_Admin_each_row_in_the_data_table_should_have_a_delete_icon_that_is_enabled() {
     batch.clickDeleteBtn();
}

@Then("Batch_Admin A new pop up with Batch details appears")
public void batch_Admin_a_new_pop_up_with_batch_details_appears() {
	 batch.verifyNewUserWindow();
}
 

@When("Batch_Admin Fill in all the fields except description with valid values and click save")
public void batch_Admin_fill_in_all_the_fields_except_description_with_valid_values_and_click_save() {
     
}

@Then("Batch_Admin newly added batch should be present in the data table in Manage Batch page")
public void batch_Admin_the_newly_added_batch_should_be_present_in_the_data_table_in_manage_batch_page() {
 
}

@When("Batch_Admin Fill in all the fields with valid values and click save")
public void batch_Admin_fill_in_all_the_fields_with_valid_values_and_click_save() {
     
}

@When("Batch_Admin any of the fields have invalid values")
public void batch_Admin_any_of_the_fields_have_invalid_values() {
    
}

@When("Batch_Admin Any of the mandatory fields are blank")
public void batch_Admin_any_of_the_mandatory_fields_are_blank() {
     
}

@Given("Batch_Admin The delete icon on row level in data table is enabled")
public void batch_Admin_the_delete_icon_on_row_level_in_data_table_is_enabled() {
	Assert.assertTrue(batch.verifyfirstDeletBtn());
}

@When("Batch_Admin clicks the delete icon")
public void batch_Admin_admin_clicks_the_delete_icon() {
	batch.clickDeleteBtn();
}

@Then(" Batch_Admin Alert appears with yes and No option")
public void batch_Admin_alert_appears_with_yes_and_no_option() {
	 batch.getAlertmsg();
}

@Given(" Batch_Admin clicks the delete icon")
public void batch_Admin_admin_clicks_the_deleted_icon() {
	batch.clickDeleteBtn();
	
}

@When("Batch_Admin You click yes option")
public void batch_Admin_you_click_yes_option() {
	 batch.clickYesButton();
}

@Then("Batch_Admin deleted alert pops and batch is no more available in data table")
public void batch_Admin_batch_deleted_alert_pops_and_batch_is_no_more_available_in_data_table(String searchstring) throws Exception {
	batch.verifySearchPrgNameResultFound(searchstring);
}

@When("Batch_Admin you click No option")
public void batch_Admin_you_click_no_option() {
	 batch.clickNoButton();
	
}

@Then("Batch_Admin is still listed in data table")
public void batch_Admin_batch_is_still_listed_in_data_table() {
     
}

@Given("Batch_Admin None of the checkboxes in data table are selected")
public void batch_Admin_none_of_the_checkboxes_in_data_table_are_selected() {
	 batch.verifyAllCheckbox();
	
}

@Then("Batch_Admin The delete icon under the {string} header should be disabled")
public void batch_Admin_the_delete_icon_under_the_header_should_be_disabled(String string) {
	Assert.assertFalse( batch.verifyEnableMainBtn());
}
/*
@Given("Batch_Admin One of the checkbox/ row is selected")
public void batch_Admin_one_of_the_checkbox_row_is_selected() {
	 batch.selectFirstCheckbox();
	
}*/

@When("Batch_Admin Click delete icon below {string} header")
public void batch_Admin_click_delete_icon_below_heade(String string) {
	 batch.clickOnfirstDeleteButton();
}

@Then("Batch_Admin The respective row in the data table is deleted")
public void batch_Admin_the_respective_row_in_the_data_table_is_deleted() throws Exception {
	 batch.verifyPrgmNameExist();
}

@Given("Batch_Admin Two or more checkboxes\\/row is selected")
public void batch_Admin_two_or_more_checkboxes_row_is_selected() {
	batch.selectMultipleCheckboxes();
}



@Given("Batch_Admin The edit icon on row level in data table is enabled")
public void batch_Admin_the_edit_icon_on_row_level_in_data_table_is_enabled() {
	batch.verifyEditWindow();
}



@When("Batch_Admin clicks the edit icon")
public void batch_Admin_admin_clicks_the_edit_icon() {
	batch.clickEditBtn();
}
 

@When("Batch_Admin Update the fields with valid values and click save")
public void batch_Admin_update_the_fields_with_valid_values_and_click_save(String name) {
	batch.enterName(name);
	batch.clickSaveBtn();

}

@Then("Batch_Admin The updated batch details should appear on the data table")
public void batch_Admin_the_updated_batch_details_should_appear_on_the_data_table(String Details) {
	
	batch.batchDetails( );
}

@Then("Batch_Admin Error message should appear")
public void batch_Admin_error_message_should_appear(String expectedmsg  ) {
	String actualmsg =batch.ErrorMessage(expectedmsg);
	Assert.assertEquals(expectedmsg,actualmsg);
	System.out.println(actualmsg); 
}

 

 }



