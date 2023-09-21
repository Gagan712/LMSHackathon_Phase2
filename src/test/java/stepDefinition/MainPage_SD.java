package stepDefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.MainPage;

public class MainPage_SD {
	
	MainPage main = new MainPage();
	
	@When("Admin gives the correct LMS portal URL")
	public void admin_gives_the_correct_lms_portal_url() {
	    main.mainPageurl();
	}

	@Then("Admin should land on the home page")
	public void admin_should_land_on_the_home_page() {
	    
	}

	@When("Admin gives the invalid LMS portal URL")
	public void admin_gives_the_invalid_lms_portal_url() {
	   
	}

	@Then("Admin should recieve message as {string}")
	public void admin_should_recieve_message_as(String string) {
	   
	}

	@Then("Admin should see each L with message LEARNING")
	public void admin_should_see_each_l_with_message_learning() {
	    
	}

	@Then("Admin should see each M with message MANAGEMENT")
	public void admin_should_see_each_m_with_message_management() {
	    
	}

	@Then("Admin should see each S with message SYSTEM")
	public void admin_should_see_each_s_with_message_system() {
	   
	}

	@Then("Admin see correct logo of the LMS as {string}")
	public void admin_see_correct_logo_of_the_lms_as(String string) {
	    
	}

	@Then("Admin should see logo is properly aligned")
	public void admin_should_see_logo_is_properly_aligned() {
	    
	}

	@Then("Admin should see login button")
	public void admin_should_see_login_button() {
	    
	}

	@Then("Admin should able to click the Login button")
	public void admin_should_able_to_click_the_login_button() {
	   
	}

}
