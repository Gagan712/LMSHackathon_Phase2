package stepDefinition;

import org.testng.Assert;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.StudentPage;
import utilities.LoggerLoad;

public class StudentPage_SD {
	
	private StudentPage student = new StudentPage();
	
	
	@Given("Student_Admin is on dashboard page after Login")
	public void student_admin_is_on_dashboard_page_after_login() {
		LoggerLoad.info("Validate admin is on dashboard page after login");
		Assert.assertEquals("Dashboard Page", student.Current_Page_Title());
	}

	@When("Student_Admin clicks {string} on the navigation bar")
	public void student_admin_clicks_on_the_navigation_bar(String string) {
		LoggerLoad.info("Admin clicks on Student Link");
		student.Student();
	}

	@Then("Student_Admin should see the Student details Page Title")
	public void student_admin_should_see_the_student_details_page_title() {
		LoggerLoad.info("Validate Student details Page Title");
		Assert.assertEquals("Dashboard Page", student.Current_Page_Title());
	}

	@Then("Student_Maximum navigation  time in milliseconds, defaults to {int} seconds")
	public void student_maximum_navigation_time_in_milliseconds_defaults_to_seconds(Integer int1) throws InterruptedException {
		LoggerLoad.info("Validate Navigation Time");
		student.Navigation_Time_Student();
	}

	@Then("Student_HTTP response >= {int}. then the link is broken")
	public void student_http_response_then_the_link_is_broken(Integer int1) {
		LoggerLoad.info("Validate the Link");
		student.verifyLink_student();
	}

	@Then("Student_Admin should see LMS - Learning management system  as title")
	public void student_admin_should_see_lms_learning_management_system_as_title(String Title) {
		LoggerLoad.info("Validate LMS Title");
		String LMSHeader = student.verifyTitle();
		Assert.assertEquals(LMSHeader, Title);
	}

	@Then("Student_Student Detail title should be in centre of the page")
	public void student_student_detail_title_should_be_in_centre_of_the_page() throws InterruptedException {
		LoggerLoad.info("Validate Student Details Title");
		student.Student_Title_Alignment();
		Thread.sleep(500);
	}

	@Then("Student_{int} dropdowns should be present in the page")
	public void student_dropdowns_should_be_present_in_the_page(Integer int1) {
		LoggerLoad.info("Validate Two Dropdown are Present");
		student.Click_DropDown();
	}

	@Then("Student_Admin should see search box inside the drop down")
	public void student_admin_should_see_search_box_inside_the_drop_down() throws InterruptedException {
		LoggerLoad.info("Validate Search Box");
		student.StudentSearchBox();
		Thread.sleep(500);
	}

	@Then("Student_Admin should see search box inside  batch id drop down")
	public void student_admin_should_see_search_box_inside_batch_id_drop_down() {
		LoggerLoad.info("Validate Search Box inside Batch ID Drop");
		student.BatchSearchBox();
	}

	@Then("Student_Admin should see correct spelling select student name")
	public void student_admin_should_see_correct_spelling_select_student_name() {
		String[] Correct_Spellings = {"Select Student Name"};
		for (String Spelling : Correct_Spellings)
		Assert.assertTrue(student.Select_Student_Text().contains(Spelling));
		LoggerLoad.info("Validate Spelling of Select Student Name");
	}

	@Then("Student_Admin should see correct spelling select  batch id text")
	public void student_admin_should_see_correct_spelling_select_batch_id_text() throws InterruptedException {
		String[] Correct_Spellings2 = {"Select Student Name"};
		for (String Spellings : Correct_Spellings2)
		Assert.assertTrue(student.Select_BatchID_Text().contains(Spellings));
		LoggerLoad.info("Validate Spelling of Select Student Name");
		Thread.sleep(500);
	}

	@Then("Student_Admin should see only numbers inside batch id drop down")
	public void student_admin_should_see_only_numbers_inside_batch_id_drop_down() {
		LoggerLoad.info("Admin should see only numbers in dropdown");
		student.dropdownvalues();
	}

	@Then("Student_Admin should see select student name in gray color")
	public void student_admin_should_see_select_student_name_in_gray_color() {
		LoggerLoad.info("Validate Grey Color of Select Student Name");
		student.Student_Text_Color();
	}

	@Then("Student_Admin should see select batch ID in gray color")
	public void student_admin_should_see_select_batch_id_in_gray_color() {
		LoggerLoad.info("Validate Grey Color of Select Batch ID");
		student.Batch_Text_Color();
	}

	@Then("Student_Admin should see select student name in first")
	public void student_admin_should_see_select_student_name_in_first(String string) {
		LoggerLoad.info("Verify First DropDown text Select Student Name");
		Assert.assertEquals(string,student.CheckfirstDropdownText());
	}

	@Then("Student_Admin should see select batch id in second")
	public void student_admin_should_see_select_batch_id_in_second(String string) {
		LoggerLoad.info("Verify Second DropDown Text Select Batch ID");
		Assert.assertEquals(string,student.CheckSecondDropdownText());
	}

	@Then("Student_Admin should able to scroll down to select the name")
	public void student_admin_should_able_to_scroll_down_to_select_the_name() {
		LoggerLoad.info("Validate admin should able to scroll");
		student.DropDownScrollStudent();
	}

	@Then("Student_Admin should able to scroll down to select the batch id")
	public void student_admin_should_able_to_scroll_down_to_select_the_batch_id() {
		LoggerLoad.info("Validate admin should able to scroll to select batch id");
		student.DropDownScrollBatch();
	}
	
	@When("Student_Admin select student name from the drop down")
	public void student_admin_select_student_name_from_the_drop_down() {
		LoggerLoad.info("Admin selects student name");
	    student.Select_Student_Name();
	}

	@Then("Student_Admin should not see select student name text")
	public void student_admin_should_not_see_select_student_name_text() {
		LoggerLoad.info("Admin do not see student name text");
	    student.StudentNameTextVisibility();
	}

	@Then("Student_Admin shouldnt see select batch id text")
	public void student_admin_shouldnt_see_select_batch_id_text() {
		LoggerLoad.info("Admin do not see batch id text");
	    student.BatchIDTextVisibility();
	}
	
	@When("Student_Admin select batch id from the drop down")
	public void student_admin_select_batch_id_from_the_drop_down() {
		LoggerLoad.info("Admin selects batch ID");
	    student.Select_BatchID();
	}
	
	@When("Student_Admin selects only student name")
	public void student_admin_selects_only_student_name() {
		LoggerLoad.info("Validate Name is Selected");
		student.Select_Student_Name();
	}
	
	@Then("Student_Student details should not be displayed")
	public void student_student_details_should_not_be_displayed() {
		LoggerLoad.info("Validate Student details not Displayed");
	}

	@When("Student_Admin selects only  batch id")
	public void student_admin_selects_only_batch_id() {
		LoggerLoad.info("Validate ID is Selected");
		student.Select_BatchID();
	}
	
	@When("Student_Admin selects  student name and batch id")
	public void student_admin_selects_student_name_and_batch_id() {
		LoggerLoad.info("Admin enters student batch name");
		student.Select_Student_Name();
		student.Select_BatchID();
	}
	
	@Then("Student_Particular student informations should be display")
	public void student_particular_student_informations_should_be_display() throws Exception {
		LoggerLoad.info("Admin can see student information");
		student.verifystudentinfo();		
	}

	@Given("Student_Admin is on student details page")
	public void student_admin_is_on_student_details_page() {
		LoggerLoad.info("Validate Student details Page");
		Assert.assertEquals("Student Details Page", student.Current_Page_Title());
	}

	@When("Student_Admin clicks on program link on student  page")
	public void student_admin_clicks_on_program_link_on_student_page() {
		LoggerLoad.info("Admin clicks on Program on Student Page");
		student.Click_Program();
	}

	@Then("Student_Admin is redirected to Program page")
	public void student_admin_is_redirected_to_program_page() {
		LoggerLoad.info("Validate Admin is on Program Page");
		String title= student.Page_gettitle();
		System.out.println("the title:"+title);
	}

	@When("Student_Admin clicks on Batch link on student page")
	public void student_admin_clicks_on_batch_link_on_student_page() {
		LoggerLoad.info("Admin clicks on Batch on Student Page");
		student.Click_Batch();
	}

	@Then("Student_Admin is redirected to Batch page")
	public void student_admin_is_redirected_to_batch_page() {
		LoggerLoad.info("Validate Admin is on Batch Page");
		String title= student.Page_gettitle();
		System.out.println("the title:"+title);
	}

	@When("Student_Admin clicks on Class link on student page")
	public void student_admin_clicks_on_class_link_on_student_page() {
		LoggerLoad.info("Admin clicks on Class on Student Page");
		student.Click_Class();
	}

	@Then("Student_Admin is redirected to Class page")
	public void student_admin_is_redirected_to_class_page() {
		LoggerLoad.info("Validate Admin is on Class Page");
		String title= student.Page_gettitle();
		System.out.println("the title:"+title);
	}

	@When("Student_Admin clicks on User link on student page")
	public void student_admin_clicks_on_user_link_on_student_page() {
		LoggerLoad.info("Admin clicks on User on Student Page");
		student.Click_User();
	}

	@Then("Student_Admin is redirected to User page")
	public void student_admin_is_redirected_to_user_page() {
		LoggerLoad.info("Validate Admin is on User Page");
		String title= student.Page_gettitle();
		System.out.println("the title:"+title);
	}

	@When("Student_Admin clicks on Assignment link on student page")
	public void student_admin_clicks_on_assignment_link_on_student_page() {
		LoggerLoad.info("Admin clicks on Assignment on Student Page");
		student.Click_Assignment();
	}

	@Then("Student_Admin is redirected to Assignment page")
	public void student_admin_is_redirected_to_assignment_page() {
		LoggerLoad.info("Validate Admin is on Assignment Page");
		String title= student.Page_gettitle();
		System.out.println("the title:"+title);
	}

	@When("Student_Admin clicks on Attendance link on student page")
	public void student_admin_clicks_on_attendance_link_on_student_page() {
		LoggerLoad.info("Admin clicks on Assignment on Student Page");
		student.Click_Attendance();
	}

	@Then("Student_Admin is redirected to Attendance page")
	public void student_admin_is_redirected_to_attendance_page() {
		LoggerLoad.info("Validate Admin is on Attendance Page");
		String title= student.Page_gettitle();
		System.out.println("the title:"+title);
	}

	@When("Student_Admin clicks on Logout link on student page")
	public void student_admin_clicks_on_logout_link_on_student_page() {
		LoggerLoad.info("Admin clicks logout link");
		student.LMSLogout();
	}

	@Then("Student_Admin is redirected to Login page")
	public void student_admin_is_redirected_to_login_page() {
		Assert.assertEquals("Login Page", student.Current_Page_Title());  
	}
	}
