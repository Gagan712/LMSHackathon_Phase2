package stepDefinition;

import static org.testng.Assert.assertFalse;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import hooks.Hooks;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AddnewClasspage;
import pages.ClassPage;
import pages.DeleteClassPage;
import utilities.Excelreader;

public class DeleteClass_SD {
	WebDriver driver=Hooks.driver;
	ClassPage cps = new ClassPage(driver);
	AddnewClasspage anc= new AddnewClasspage(driver);
	DeleteClassPage dp = new DeleteClassPage(driver);
	Excelreader read;
	
	@Given("Admin is in Manage class page")
	public void admin_is_in_manage_class_page() {
		 cps.homepage();
		  cps.clickclasslink();
	}

	@When("Admin clicks delete button in data table row level")
	public void admin_clicks_delete_button_in_data_table_row_level() {
		dp.clickdeleteicon();
	}

	@Then("Admin should see alert")
	public void admin_should_see_alert() {
		  String error=dp.captureerrormessage();
		   Assert.assertEquals(error, "Please enter valid data");
	}

	@Then("Alert should have {string} button to accept")
	public void alert_should_have_button_to_accept(String string) {
	  boolean rslt=  dp.yesbuttondisplay();
	  Assert.assertEquals(rslt, true);
	}

	@Then("Alert should have {string} button to reject")
	public void alert_should_have_button_to_reject(String string) {
		 boolean rslt=  dp.nobuttondisplay();
		  Assert.assertEquals(rslt, true);
	}

	@Given("Admin is in delete alert")
	public void admin_is_in_delete_alert() {
		 cps.homepage();
		  cps.clickclasslink();
		dp.clickdeleteicon();
	}

	@When("Admin clicks yes button")
	public void admin_clicks_yes_button() {
	   dp.clickyes();
	}

	@Then("Success message and validate particular class details are deleted from the data table")
	public void success_message_and_validate_particular_class_details_are_deleted_from_the_data_table() {
		read=new Excelreader("1");
	    String msg= dp.successmessagefordelete();
	    Assert.assertEquals(msg, "Successfully deleted");
	    dp.enterbatchid();
	    String enteredbatchid= read.getdata();
	 String batchidintables=  dp.checkbatchid();
	 Assert.assertNotEquals(enteredbatchid, "Class detail is not present", batchidintables);
	    
	}

	@When("Admin clicks no button")
	public void admin_clicks_no_button() {
	   dp.clickno();
	}

	@Then("Admin should land on manage class page and validate particular class details are not deleted from the data table")
	public void admin_should_land_on_manage_class_page_and_validate_particular_class_details_are_not_deleted_from_the_data_table() {
	 String ptitle= dp.checkclasspagetitle();
	 Assert.assertEquals(ptitle, "Manage Class");
	 dp.enterbatchid();
	 String enteredbatchid= read.getdata();
	 String batchidintables=  dp.checkbatchid();
	 Assert.assertEquals(enteredbatchid, "Class detail is present", batchidintables);
	}


}
