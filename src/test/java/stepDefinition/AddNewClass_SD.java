package stepDefinition;

import static org.testng.Assert.assertTrue;

import java.text.ParseException;
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

public class AddNewClass_SD {
	WebDriver driver=Hooks.driver;
	ClassPage cps = new ClassPage(driver);
	AddnewClasspage anc= new AddnewClasspage(driver);
	Excelreader read;
	
	@Given("Admin is in class detail popup window")
	public void admin_is_in_class_detail_popup_window() {
		 cps.homepage();
		 cps.clickclasslink();
		 cps.clickaddnewclass();
	}

	@When("Admin clicks Batch ID dropdown")
	public void admin_clicks_batch_id_dropdown() {
	   cps.clickdropdownforbatchid();
	}

	@Then("Batch ids in the drop down should match with Batch id manage batch page table")
	public void batch_ids_in_the_drop_down_should_match_with_batch_id_manage_batch_page_table() {
	   List<String> batchidsfromdropdown = cps.checklistforbatchid();
	   List<String> batchidsfrompage= anc.getallbatchidsfrompage();
	   assertTrue(batchidsfromdropdown.equals(batchidsfrompage));
	}

	@When("Admin enters all mandatory {string} values with valid {string} and clicks save button \\( Batch ID , No of Classes, Class Date, Staff Id)")
	public void admin_enters_all_mandatory_values_with_valid_and_clicks_save_button_batch_id_no_of_classes_class_date_staff_id(String string, String string2) {
	    anc.fillmandawithvaliddata();
	    anc.clicksavebutton();
	}

	@Then("Admin should see new class details is added in the data table")
	public void admin_should_see_new_class_details_is_added_in_the_data_table() {
		List<Object> listofentereddata=read.getsetofdata();
	String batchidintable=	anc.searchbatchid();
	read= new Excelreader("mandatoryfieldsvalid");
	String batchidentered=  listofentereddata.get(0).toString();
	   Assert.assertEquals(batchidintable, batchidentered);
	}

	@When("Admin enters all mandatory {string} values with {string} and clicks save button \\( Batch ID , No of Classes, Class Date, Staff Id, )")
	public void admin_enters_all_mandatory_values_with_and_clicks_save_button_batch_id_no_of_classes_class_date_staff_id(String string, String string2) {
	   anc.fillmandawithinvaliddata();
	   anc.clicksavebutton();
	}

	@Then("Error message should appear in alert")
	public void error_message_should_appear_in_alert() {
	   String error=anc.captureerrormessage();
	   Assert.assertEquals(error, "Please enter valid data");
	}

	@When("Admin enters values in all fields with valid data and clicks save button \\(Batch ID , No of Classes, Class Date, Class Topic, Staff Id, Class description, Comments, Notes, Recordings)")
	public void admin_enters_values_in_all_fields_with_valid_data_and_clicks_save_button_batch_id_no_of_classes_class_date_class_topic_staff_id_class_description_comments_notes_recordings() {
	 anc.fillallwithvaliddata();
	 anc.clicksavebutton();
	}

	@When("Admin enters with invalid data in optional fields and clicks save button \\( Batch ID , No of Classes, Class Date, Staff Id)")
	public void admin_enters_with_invalid_data_in_optional_fields_and_clicks_save_button_batch_id_no_of_classes_class_date_staff_id() {
	   anc.filloptionalwithinvaliddata();
	   anc.clicksavebutton();
	}

	@When("Admin enters data missing value in Batch ID and clicks save button \\(No of Classes, Class Date, Staff Id)")
	public void admin_enters_data_missing_value_in_batch_id_and_clicks_save_button_no_of_classes_class_date_staff_id() {
	 anc.missingvalueinbatchid();
	 anc.clicksavebutton();
	}

	@Then("Batch Id is missing")
	public void batch_id_is_missing() {
		  String error=anc.captureerrormessage();
		   Assert.assertEquals(error, "Batch id is missing");
	}

	@When("Admin enters data missing value in No of class and clicks save button \\(Batch ID ,  Class Date, Staff Id, )")
	public void admin_enters_data_missing_value_in_no_of_class_and_clicks_save_button_batch_id_class_date_staff_id() {
	 anc.missingnoofclass();
	 anc.clicksavebutton();
	}

	@Then("No of classes is missing")
	public void no_of_classes_is_missing() {
		 String error=anc.captureerrormessage();
		   Assert.assertEquals(error, "Class no is missing");
	}

	@When("Admin enters data missing value in  class date and clicks save button \\(Batch ID , No of Classes, Staff Id, )")
	public void admin_enters_data_missing_value_in_class_date_and_clicks_save_button_batch_id_no_of_classes_staff_id() {
	  anc.missingclassdate();
	  anc.clicksavebutton();
	}

	@Then("class date is missing")
	public void class_date_is_missing() {
		 String error=anc.captureerrormessage();
		   Assert.assertEquals(error, "Class date is missing");
	}

	@When("Admin enters data missing value in staff id and clicks save button \\(Batch ID , No of Classes, Class Date )")
	public void admin_enters_data_missing_value_in_staff_id_and_clicks_save_button_batch_id_no_of_classes_class_date() {
	   anc.missingstaffid();
	   anc.clicksavebutton();
	}

	@Then("staff id is missing")
	public void staff_id_is_missing() {
		 String error=anc.captureerrormessage();
		   Assert.assertEquals(error, "Staff id is missing");
	}

	@When("Admin enters passed date in the class date field and clicks save button \\( Batch ID , No of Classes, Class Date, Staff Id)")
	public void admin_enters_passed_date_in_the_class_date_field_and_clicks_save_button_batch_id_no_of_classes_class_date_staff_id() {
	  anc.invalidcdate();
	  anc.clicksavebutton();
	}

	@Then("class cannot be  created for the passed date")
	public void class_cannot_be_created_for_the_passed_date() {
		 String error=anc.captureerrormessage();
		   Assert.assertEquals(error, "Invalid date");
	}

	@When("Admin clicks date from date picker")
	public void admin_clicks_date_from_date_picker() {
		anc.clickdate();
		
	}

	@Then("selected date should be their in class date text box")
	public void selected_date_should_be_their_in_class_date_text_box() {
		String classdate=anc.checkclassdate();
		String seldate=anc.selecteddate();
		Assert.assertEquals(classdate, seldate);
	   	}

	@Then("selected date should be in  mm\\/dd\\/yyyy format")
	public void selected_date_should_be_in_mm_dd_yyyy_format() throws ParseException {
	   anc.isvaliddate();
	}

	@When("Admin clicks right arrow in the date picker near month")
	public void admin_clicks_right_arrow_in_the_date_picker_near_month() {
	  anc.clicknextmonth();
	}

	@Then("Next month calender should visible")
	public void next_month_calender_should_visible() {
	   String month = anc.monthincalendar();
	   Assert.assertEquals(month, "October");
	}

	@When("Admin clicks left arrow in the date picker near month")
	public void admin_clicks_left_arrow_in_the_date_picker_near_month() {
	   anc.clickprevmonth();
	}

	@Then("previous month calender should visible")
	public void previous_month_calender_should_visible() {
		 String month = anc.monthincalendar();
		   Assert.assertEquals(month, "August");
	}

	@When("Admin clicks date picker button")
	public void admin_clicks_date_picker_button() {
	  anc.clickdatepicker();
	}

	@Then("Admin should see current date is highlighted in the date picker")
	public void admin_should_see_current_date_is_highlighted_in_the_date_picker() {
	  String hdate= anc.findhighlighteddate();
	  Assert.assertEquals(hdate, "9");
	}

	@When("Admin clicks date picker button and selects future date")
	public void admin_clicks_date_picker_button_and_selects_future_date() {
		 anc.clickdatepicker();
		 anc.clickfuturedate();
	}

	@Then("Admin should see selected date is highlighted in the date picker")
	public void admin_should_see_selected_date_is_highlighted_in_the_date_picker() {
		 String hdate= anc.findhighlighteddate();
		  Assert.assertEquals(hdate, "10");
	}

	@When("Admin clicks Cancel button without entering values in the fields")
	public void admin_clicks_cancel_button_without_entering_values_in_the_fields() {
	   anc.clickcancel();
	}

	@Then("Admin should land on Manage Class page")
	public void admin_should_land_on_manage_class_page() {
	   String titlepage=anc.manageclasspage();
	   Assert.assertEquals(titlepage, "Manage Class");
	}

	@When("Admin clicks Cancel button entering values in the fields")
	public void admin_clicks_cancel_button_entering_values_in_the_fields() {
	  anc.fillallwithvaliddata();
	  anc.clickcancel();
	}

	@Then("Admin should land on Manage Class Page and validate new class is not created in the data table")
	public void admin_should_land_on_manage_class_page_and_validate_new_class_is_not_created_in_the_data_table() {
		  String titlepage=anc.manageclasspage();
		   Assert.assertEquals(titlepage, "Manage Class");
		   cps.clicksearhbox();
		   cps.enterbatchid("1");
			read=new Excelreader("1");
			String batchids= cps.batchidintable();
			 Assert.assertEquals(batchids, read.getdata());
	}


}
