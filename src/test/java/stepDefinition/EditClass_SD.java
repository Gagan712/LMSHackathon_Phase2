package stepDefinition;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import hooks.Hooks;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AddnewClasspage;
import pages.ClassPage;
import utilities.Excelreader;

public class EditClass_SD {
	WebDriver driver=Hooks.driver;
	ClassPage cps = new ClassPage(driver);
	AddnewClasspage anc= new AddnewClasspage(driver);
	Excelreader read;
	
	@Given("Admin is in  Edit class detail popup window in edit class")
	public void admin_is_in_edit_class_detail_popup_window_in_edit_class() {
		cps.homepage();
		 cps.clickclasslink();
		 cps.clickeditbutton();
	}

	@When("Admin enters all mandatory {string} values with valid {string} and clicks the save button \\( Batch ID , No of Classes, Class Date, Staff Id) in edit class")
	public void admin_enters_all_mandatory_values_with_valid_and_clicks_the_save_button_batch_id_no_of_classes_class_date_staff_id_in_edit_class(String string, String string2) {
	    anc.fillmandawithvaliddata();
	    anc.clicksavebutton();
	}

	@Then("Admin should see particular class details is updated in the data table in edit class")
	public void admin_should_see_particular_class_details_is_updated_in_the_data_table_in_edit_class() {
		List<Object> listofentereddata=read.getsetofdata();
		String batchidintable=	anc.searchbatchid();
		read= new Excelreader("mandatoryfieldsvalid");
		String batchidentered=  listofentereddata.get(0).toString();
		   Assert.assertEquals(batchidintable, batchidentered);
	}

	@When("Admin enters all mandatory {string} values with {string} and clicks the save button \\( Batch ID , No of Classes, Class Date, Staff Id, ) in edit class")
	public void admin_enters_all_mandatory_values_with_and_clicks_the_save_button_batch_id_no_of_classes_class_date_staff_id_in_edit_class(String string, String string2) {
		 anc.fillmandawithinvaliddata();
		   anc.clicksavebutton();
	}

	@Then("Error message should appear in the alert in edit class")
	public void error_message_should_appear_in_the_alert_in_edit_class() {
		  String error=anc.captureerrormessage();
		   Assert.assertEquals(error, "Please enter valid data");
	}

	@When("Admin enters values in all fields with the valid {string} and clicks of save button \\(Batch ID , No of Classes, Class Date, Class Topic, Staff Id, Class description, Comments, Notes, Recordings) in edit class")
	public void admin_enters_values_in_all_fields_with_the_valid_and_clicks_of_save_button_batch_id_no_of_classes_class_date_class_topic_staff_id_class_description_comments_notes_recordings_in_edit_class(String string) {
		 anc.fillallwithvaliddata();
		 anc.clicksavebutton();
	}

	@When("Admin enters with invalid data in the optional fields and clicks save button \\( Batch ID , No of Classes, Class Date, Staff Id) in edit class")
	public void admin_enters_with_invalid_data_in_the_optional_fields_and_clicks_save_button_batch_id_no_of_classes_class_date_staff_id_in_edit_class() {
		anc.filloptionalwithinvaliddata();
		   anc.clicksavebutton();
	}

	@When("Admin enters  data missing value in Batch ID and clicks save button \\(No of Classes, Class Date, Staff Id) in edit class")
	public void admin_enters_data_missing_value_in_batch_id_and_clicks_save_button_no_of_classes_class_date_staff_id_in_edit_class() {
		 anc.missingvalueinbatchid();
		 anc.clicksavebutton();
	}

	@Then("Batch Id should be missing in edit class")
	public void batch_id_should_be_missing_in_edit_class() {
		  String error=anc.captureerrormessage();
		   Assert.assertEquals(error, "Batch id is missing");
	}

	@When("Admin enters data missing value in the No of class and clicks save button \\(Batch ID ,  Class Date, Staff Id, ) in edit class")
	public void admin_enters_data_missing_value_in_the_no_of_class_and_clicks_save_button_batch_id_class_date_staff_id_in_edit_class() {
		anc.missingnoofclass();
		 anc.clicksavebutton();
	}

	@Then("No of classes is of missing in edit class")
	public void no_of_classes_is_of_missing_in_edit_class() {
		 String error=anc.captureerrormessage();
		   Assert.assertEquals(error, "Class no is missing");
	}

	@When("Admin enters data missing value in  the class date and clicks save button \\(Batch ID , No of Classes, Staff Id, ) in edit class")
	public void admin_enters_data_missing_value_in_the_class_date_and_clicks_save_button_batch_id_no_of_classes_staff_id_in_edit_class() {
		  anc.missingclassdate();
		  anc.clicksavebutton();
	}

	@Then("class date is of missing in edit class")
	public void class_date_is_of_missing_in_edit_class() {
		 String error=anc.captureerrormessage();
		   Assert.assertEquals(error, "Class date is missing");
	}

	@When("Admin enters data missing value in the staff id and clicks save button \\(Batch ID , No of Classes, Class Date ) in edit class")
	public void admin_enters_data_missing_value_in_the_staff_id_and_clicks_save_button_batch_id_no_of_classes_class_date_in_edit_class() {
		  anc.missingstaffid();
		   anc.clicksavebutton();
	}

	@Then("staff id is of missing in edit class")
	public void staff_id_is_of_missing_in_edit_class() {
		 String error=anc.captureerrormessage();
		   Assert.assertEquals(error, "Staff id is missing");
	}

	@When("Admin enters the passed date in the class date field and clicks save button \\( Batch ID , No of Classes, Class Date, Staff Id) in edit class")
	public void admin_enters_the_passed_date_in_the_class_date_field_and_clicks_save_button_batch_id_no_of_classes_class_date_staff_id_in_edit_class() {
		  anc.invalidcdate();
		  anc.clicksavebutton();
	}

	@Then("class cannot be updated for passed date in edit class")
	public void class_cannot_be_updated_for_passed_date_in_edit_class() {
		 String error=anc.captureerrormessage();
		   Assert.assertEquals(error, "Invalid date");
	}

	@When("Admin clicks the Cancel button without entering values in the fields in edit class")
	public void admin_clicks_the_cancel_button_without_entering_values_in_the_fields_in_edit_class() {
		 anc.clickcancel();
	}

	@Then("Admin should land on the Manage Class page in edit class")
	public void admin_should_land_on_the_manage_class_page_in_edit_class() {
		 String titlepage=anc.manageclasspage();
		   Assert.assertEquals(titlepage, "Manage Class");
	}

	@When("Admin clicks the Cancel button entering values in the fields in edit class")
	public void admin_clicks_the_cancel_button_entering_values_in_the_fields_in_edit_class() {
		 anc.fillallwithvaliddata();
		  anc.clickcancel();
	}

	@Then("Admin should land on Manage Class Page and validate particular class details are not changed  in the data table in edit class")
	public void admin_should_land_on_manage_class_page_and_validate_particular_class_details_are_not_changed_in_the_data_table_in_edit_class() {
		 String titlepage=anc.manageclasspage();
		   Assert.assertEquals(titlepage, "Manage Class");
		   cps.clicksearhbox();
		   cps.enterbatchid("1");
			read=new Excelreader("1");
			String batchids= cps.batchidintable();
			 Assert.assertEquals(batchids, read.getdata());
	}


}
