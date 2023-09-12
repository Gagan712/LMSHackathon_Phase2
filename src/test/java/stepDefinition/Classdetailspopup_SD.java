package stepDefinition;

import static org.testng.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import hooks.Hooks;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ClassPage;
import utilities.Excelreader;

public class Classdetailspopup_SD {
	
	WebDriver driver=Hooks.driver;
	ClassPage cps = new ClassPage(driver);
Excelreader read;
	@Given("Admin is on ManageClass page after clicking class button")
	public void admin_is_on_manage_class_page_after_clicking_class_button() {
	  cps.homepage();
	  cps.clickclasslink();
	}

	@When("Admin enters the {string} into search box")
	public void admin_enters_the_into_search_box(String testid) {
	    cps.clicksearhbox();
	    cps.enterbatchid(testid);
	  
	}

	@Then("Displays entries with that {string}")
	public void displays_entries_with_that_batch_id(String testid) {
		read=new Excelreader("1");
	String batchids= cps.batchidintable();
	  Assert.assertEquals(batchids, read.getdata());
	}

	@When("Admin enters invalid {string}> which is not existing the table into search box")
	public void admin_enters_invalid_which_is_not_existing_the_table_into_search_box(String testid) {
		 cps.clicksearhbox();
		 cps.invalidbatchid(testid);
	}

	@Then("Displays empty details in the data table")
	public void displays_empty_details_in_the_data_table() {
	 boolean results= cps.emptybatchdetails();
	 Assert.assertEquals(true, true);
	}

	@When("Admin enters the {string}> into the search box")
	public void admin_enters_into_search_box(String testid) {
		   cps.clicksearhbox();
		   cps.enterclassno(testid);
	}

	@Then("Displays entries with that the {string}")
	public void displays_entries_with_that_the(String testid) {
		read=new Excelreader("4");
		int classnos= cps.classnointable();
		  Assert.assertEquals(classnos, read.getdata());
	}

	@When("Admin enters {string} which is not existing the table into search box")
	public void admin_enters_which_is_not_existing_the_table_into_search_box(String testid) {
		 cps.clicksearhbox();
		 cps.invalidclassno(testid);
	}
	
	@When("Admin enters a {string} into search box")
	public void admin_enters_a_into_search_box(String testid) {
		 cps.clicksearhbox();
		 cps.enterclasstopic(testid);
	}

	@When("Admin enters {string}> into of search box")
	public void admin_enters_into_of_search_box(String testid) {
	  //staffid
		 cps.clicksearhbox();
		 cps.enterstaffid(testid);
	}
	@When("Admin enters an {string}> into search box")
	public void admin_enters_an_into_search_box(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	
	@When("Admin enters {string} which is not the existing the table into search box")
	public void admin_enters_which_is_not_the_existing_the_table_into_search_box(String testid) {
		 cps.clicksearhbox();
		 cps.invalidclasstopic(testid);
	}


	@Then("Displays entries with that of {string}")
	public void displays_entries_with_that_of(String testid) {
		read=new Excelreader("6");
		String classtopic= cps.classtopicintable();
		  Assert.assertEquals(classtopic, read.getdata());
	}

	@Then("Displays entries with that of the {string}")
	public void displays_entries_with_that_of_the(String testid) {
		//staffid
		read=new Excelreader("8");
		int staffid= cps.staffidintable();
		  Assert.assertEquals(staffid, read.getdata());
	}

	@When("Admin enters {string} which is not existing the table into the search box")
	public void admin_enters_which_is_not_existing_the_table_into_the_search_box(String testid) {
	 //invalid staffid
		 cps.clicksearhbox();
		 cps.invalidstaffid(testid);
	}
	
	@When("Admin enters {string} into of the the search box")
	public void admin_enters_into_of_the_the_search_box(String testid) {
	   //classdate
		 cps.clicksearhbox();
		 cps.enterclassdate(testid);
		
	}
	@Then("Displays entries with that the of the {string}")
	public void displays_entries_with_that_the_of_the(String string) {
	  //classdate
		read=new Excelreader("10");
		String classdate= cps.classdateintable();
		  Assert.assertEquals(classdate, read.getdata());
	}

	@When("Admin enters invalid {string}> into search box")
	public void admin_enters_invalid_into_search_box(String testid) {
	 //invalid class date
		 cps.clicksearhbox();
		 cps.invalidclassdate(testid);
		 
	}
	
	@When("Admin clicks +Add New Class button")
	public void admin_clicks_add_new_class_button() {
	    cps.clickaddnewclass();
	}

	@Then("Admin should see a popup  with  heading {string} and all {string}")
	public void admin_should_see_a_popup_with_heading_and_all(String string, String string2, io.cucumber.datatable.DataTable fieldsinclass) {
	  List<String> headerslist = fieldsinclass.asList();
	  Assert.assertEquals(headerslist.get(0), "Batch Id");
	  Assert.assertEquals(headerslist.get(1), "No of Classes");
	  Assert.assertEquals(headerslist.get(2), "Class Date");
	  Assert.assertEquals(headerslist.get(3), "Class Topic");
	  Assert.assertEquals(headerslist.get(4), "Staff Id");
	  Assert.assertEquals(headerslist.get(5), "Class Description");
	  Assert.assertEquals(headerslist.get(6), "Comments");
	  Assert.assertEquals(headerslist.get(7), "Notes");
	  Assert.assertEquals(headerslist.get(8), "Recording");
	}


	@Then("Admin should see dropdown list for Batch ID")
	public void admin_should_see_dropdown_list_for_batch_id() {
	    cps.clickdropdownforbatchid();
	    	List<String> listofdropdown= cps.checklistforbatchid();
	    	for(String id: listofdropdown) {
	    	 System.out.println(id);
	    	}
	}

	@Then("Admin should see  dropdown list for Staff ID")
	public void admin_should_see_dropdown_list_for_staff_id() {
	   cps.checklistforstaffid();
	   List<Object> listofstaffid= cps.checklistforstaffid();
   	for(Object ids: listofstaffid) {
   	 System.out.println(ids);
   	}
	}

	@Then("Admin should see  calendar icon for class date")
	public void admin_should_see_calendar_icon_for_class_date() {
	boolean rstl= cps.calendarclick();
	Assert.assertEquals(rstl, true);
	 
	}

	@Then("Admin should see  save button in the class detail popup window")
	public void admin_should_see_save_button_in_the_class_detail_popup_window() {
	   boolean seesave=cps.viewsave();
	   Assert.assertEquals(seesave, true);
	}

	@Then("Admin should see  cancel button in the class detail popup window")
	public void admin_should_see_cancel_button_in_the_class_detail_popup_window() {
		  boolean seedel=cps.viewdelete();
		   Assert.assertEquals(seedel, true);
	}
	
	@Then("Admin should see  close button on the class details popup window")
	public void admin_should_see_close_button_on_the_class_details_popup_window() {
		 boolean seeclose=cps.viewclose();
		   Assert.assertEquals(seeclose, true);
	}
	@When("Admin clicks Edit button in data table")
	public void admin_clicks_edit_button_in_data_table() {
	  cps.clickeditbutton();
	}

	@Then("Edit popup window appears with heading {string} and same values in fields")
	public void edit_popup_window_appears_with_heading_and_same_values_in_fields(String string) {
	 String heading= cps.checkheading();
	 Assert.assertEquals(heading, "Manage Class");
	 List<Object> valuesintext= cps.checkvaluesintextbox();
	 List<Object> valuesintable=cps.checkvaluesintable();
	 assertTrue(valuesintext.equals(valuesintable));
	}




}
