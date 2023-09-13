package stepDefinition;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Attendance;
import pages.MainPage;
import utilities.LoggerLoad;

public class AttendanceSD {
	
	Attendance att = new Attendance();
	MainPage main = new MainPage();
	static String title;
	
	
	@Given("Admin is on Home page of lms portal")
	public void admin_is_on_home_page_of_lms_portal() {
	   main.mainPageurl();
	   att.clickLoginlink();
	}

	@When("Admin enter valid username as {string} and password {string}")
	public void admin_enter_valid_username_as_and_password(String user, String pwd) {
	   main.enterUsername(user);
	   main.enterPassword(pwd);
	}

	@When("Admin click on login button")
	public void admin_click_on_login_button() {
	    main.clickLogin();
	}

	@Then("Admin redirected to Dashboard Page")
	public void admin_redirected_to_dashboard_page() {
	    String DashHeader = main.verifyDashboardheadertext();
		assertEquals(DashHeader,"Manage Program");
		LoggerLoad.info("Admin is on Dashboard page");
	}

	@When("Attendance_ Admin clicks Attendance link on the navigation bar")
	public void attendance_admin_clicks_attendance_link_on_the_navigation_bar() {
		att.clickAttendancelink();
	  
	}

	@Then("Attendance_ Admin should see the {string} in header")
	public void attendance_admin_should_see_the_in_header(String attendanceHeader) {
	    String attHeaderTxt = att.verifyAttendanceHeader();
	    assertEquals(attendanceHeader,attHeaderTxt);
	}

	@Then("Attendance_ Maximum navigation time in milliseconds, defaults to {int} seconds")
	public void attendance_maximum_navigation_time_in_milliseconds_defaults_to_seconds(Integer expectedNavigateTime) {
	   long naviTime = att.calculateNavigateTime();
	   if(naviTime==expectedNavigateTime |naviTime<expectedNavigateTime) {
		   LoggerLoad.info("maximun time is within 30 seconds");
	   }
	   else {
		   LoggerLoad.info("maximun time is more than 30 seconds");
	   }
	}

	@Then("Attendance_ Admin should recieve message for broken link as {string} on attendance page")
	public void attendance_admin_should_recieve_message_for_broken_link_as_on_attendance_page(String brokenlink) throws IOException {
		boolean brokenstatus = att.verifyBrokenlinkonattendance(brokenlink);
	    assertEquals("true",brokenstatus);
	    LoggerLoad.info("Attendance url have broken links");
	}

	@Then("Attendance_ Admin should see {string}  as title")
	public void attendance_admin_should_see_as_title(String lmsTitle) {
		String titleHeader = att.verifylmsTitle();
		assertEquals(titleHeader,lmsTitle);
		LoggerLoad.info("Admin see the correct title");
	}

	@Then("Attendance_ Manage attendance header should be in left side of the page")
	public void attendance_manage_attendance_header_should_be_in_left_side_of_the_page() {
	   att.alignAttendanceHeader();
	   LoggerLoad.info("Admin see the header is on the left");
	}

	@Then("Attendance_ Admin should see correct spelling for the all the fields")
	public void attendance_admin_should_see_correct_spelling_for_the_all_the_fields() {
		String titleHeader = att.verifylmsTitle();
		assertEquals(titleHeader,"LMS-Learning Management System");
		String attHeaderTxt = att.verifyAttendanceHeader();
	    assertEquals(attHeaderTxt,"Manage Attendance");
	}

	@Then("Attendance_ Admin should see disabled delete icon below the Manage Attendance")
	public void attendance_admin_should_see_disabled_delete_icon_below_the_manage_attendance() {
	   att.verifymainDeleteDisabled();
	   LoggerLoad.info("main delete icon is disabled");
	}

	@Then("Attendance_ Admin should see search bar on the attendance page")
	public void attendance_admin_should_see_search_bar_on_the_attendance_page() {
	   att.searchbarisDisplayed();
	   LoggerLoad.info("Search box is displayed");
	}

	@Then("Attendance_ Admin should see +Add New Attendance button on the attendance page")
	public void attendance_admin_should_see_add_new_attendance_button_on_the_attendance_page() {
	    att.addNewAttendanceisDisplayed();
	    LoggerLoad.info("add new attendance is displayed");
	}

	@Then("Attendance_ Admin should see data table on the Manage Attendance Page With following column headers.")
	public void attendance_admin_should_see_data_table_on_the_manage_attendance_page_with_following_column_headers() {
	   att.tableisDisplayed();
	   LoggerLoad.info("table is displayed");
	}

	@Then("Attendance_ Edit Icon in each row of data table only When entries are available")
	public void attendance_edit_icon_in_each_row_of_data_table_only_when_entries_are_available() {
	   att.verifyeditbtn();
	   LoggerLoad.info("verify edit icon with data in it");
	}

	@Then("Attendance_ Edit Icon will not be present in data table")
	public void attendance_edit_icon_will_not_be_present_in_data_table() {
	    att.verifyeditbtn();
	    LoggerLoad.info("verify edit icon with no data");
	}

	@Then("Attendance_ Delete Icon in each row of data table only When entries are available")
	public void attendance_delete_icon_in_each_row_of_data_table_only_when_entries_are_available() {
	    att.verifydeletebtn();
	    LoggerLoad.info("verify delete button with data");
	}

	@Then("Attendance_ Admin cant see delete  Icon in data table")
	public void attendance_admin_cant_see_delete_icon_in_data_table() {
	   att.verifydeletebtn();
	   LoggerLoad.info("verify delete icon with no data");
	}

	@Then("Attendance_ Admin should see sort icon near the column headers except for Edit and Delete")
	public void attendance_admin_should_see_sort_icon_near_the_column_headers_except_for_edit_and_delete() {
	    att.sortbtnisDisplayed();
	    LoggerLoad.info("all sort button are  displayed");
	}

	@Then("Attendance_ Admin should see check box in the all rows  of data table")
	public void attendance_admin_should_see_check_box_in_the_all_rows_of_data_table() {
		LoggerLoad.info("all checkboxes are displayed");
	}

	@Then("Attendance_ Above the footer Admin should see the text as {string} below the table.")
	public void attendance_above_the_footer_admin_should_see_the_text_as_below_the_table(String paginationtext) {
		String paginationT = att.paginationText();
		   assertEquals(paginationT,paginationtext);
		   LoggerLoad.info("pagination text is displayed");
	}

	@Then("Attendance_ Admin should see the pagination controls under the data table")
	public void attendance_admin_should_see_the_pagination_controls_under_the_data_table() {
	   att.paginationisDisplayed();
	   LoggerLoad.info("pagination is displayed");
	}

	@Then("Attendance_ Admin should see the text as {string}")
	public void attendance_admin_should_see_the_text_as(String footertext) {
		String footerT = att.footerText();
		   assertEquals(footerT,footertext);
		   LoggerLoad.info("correct footer text is displayed");

	}
	@Given("Attendance_ Admin is on manage attendance page")
	public void attendance_admin_is_on_manage_attendance_page() {
	   att.clickAttendancelink();
	   String attHeaderTxt = att.verifyAttendanceHeader();
	    assertEquals("Manage Attendance",attHeaderTxt);
	}

	
	// Add new attendance
	
	@When("Attendance_ Admin fills all the values and click save")
	public void attendance_admin_fills_all_the_values_and_click_save() throws InterruptedException {
	    att.selectProgramDD();
	    att.selectStudentDD();
	    att.selectAttendanceDD();
	    att.selectClassDD();
	    att.selectDate();
	    att.clickSavebtn();
	}

	@Then("Attendance_ Admin should see success message in popup window")
	public void attendance_admin_should_see_success_message_in_popup_window() {
	    String successMsg = att.verifySuccessMsg();
	    assertEquals(successMsg,"New Attendance added");
	}

	@When("Attendance_ Admin fills values missing program name and click save")
	public void attendance_admin_fills_values_missing_program_name_and_click_save() throws InterruptedException {
		att.selectStudentDD();
	    att.selectAttendanceDD();
	    att.selectClassDD();
	    att.selectDate();
	    att.clickSavebtn();
	}

	@Then("Attendance_ Admin should see error message for missing program name {string}")
	public void attendance_admin_should_see_error_message_for_missing_program_name(String missingProgram) {
	  String errorProgram = att.verifyErrorMsg();
	  assertEquals(errorProgram,missingProgram);
	}

	@When("Attendance_ Admin fills values missing class name and click save")
	public void attendance_admin_fills_values_missing_class_name_and_click_save() throws InterruptedException {
		att.selectStudentDD();
	    att.selectAttendanceDD();
	    att.selectProgramDD();
	    att.selectDate();
	    att.clickSavebtn();
	}

	@Then("Attendance_ Admin should see error message for missing class name {string}")
	public void attendance_admin_should_see_error_message_for_missing_class_name(String missingClass) {
		String errorClass = att.verifyErrorMsg();
		  assertEquals(errorClass,missingClass);
	}

	@When("Attendance_ Admin fills values missing student name and click save")
	public void attendance_admin_fills_values_missing_student_name_and_click_save() throws InterruptedException {
		att.selectProgramDD();
		att.selectAttendanceDD();
		att.selectClassDD();
		att.selectDate();
		att.clickSavebtn();
	}

	@Then("Attendance_ Admin should see error message for missing student name  {string}")
	public void attendance_admin_should_see_error_message_for_missing_student_name(String missingStudent) {
		String errorStudent = att.verifyErrorMsg();
		  assertEquals(errorStudent,missingStudent);
	}

	@When("Attendance_ Admin fills values missing attendance and click save")
	public void attendance_admin_fills_values_missing_attendance_and_click_save() throws InterruptedException {
		att.selectProgramDD();
	    att.selectStudentDD(); 
		att.selectClassDD();
		att.selectDate();
		att.clickSavebtn();
	}

	@Then("Attendance_ Admin should see error message for missing attendance {string}")
	public void attendance_admin_should_see_error_message_for_missing_attendance(String missingAttendance) {
		  String errorAttendance = att.verifyErrorMsg();
		  assertEquals(errorAttendance,missingAttendance);
	}

	@When("Attendance_ Admin fills values missing attendance date  and click save")
	public void attendance_admin_fills_values_missing_attendance_date_and_click_save() {
		att.selectProgramDD();
	    att.selectStudentDD();
	    att.selectAttendanceDD();
	    att.selectClassDD();
	    att.clickSavebtn();
	}

	@Then("Attendance_ Admin should see error message for missing Attendance date {string}")
	public void attendance_admin_should_see_error_message_for_missing_attendance_date(String missAttendanceDate) {
		  String errorAttendanceDate = att.verifyErrorMsg();
		  assertEquals(errorAttendanceDate,missAttendanceDate);
	}

	@When("Attendance_ Admin fills values with future date  and click save")
	public void attendance_admin_fills_values_with_future_date_and_click_save() throws InterruptedException {
		att.selectProgramDD();
	    att.selectStudentDD();
	    att.selectAttendanceDD();
	    att.selectClassDD();
	    att.selectDate("october2024","2");
	    att.clickSavebtn();
	}

	@Then("Attendance_ Admin should see error message for missing future date {string}")
	public void attendance_admin_should_see_error_message_for_missing_future_date(String invalidDate) {
		String errorDate = att.verifyErrorMsg();
		  assertEquals(errorDate,invalidDate);
	}

	@Given("Attendance_ Admin is in  attendance details popup window")
	public void attendance_admin_is_in_attendance_details_popup_window() {
	    att.clickAddNewAttendance();
	}

	@Given("Attendance_ Admin is in  attendance details popup window after clicking on edit button")
	public void attendance_admin_is_in_attendance_details_popup_window_after_clicking_on_edit_button() {
	    att.clickEditbtn();
	}


	@When("Attendance_ Admin clicks Student button in the navigation bar")
	public void attendance_admin_clicks_student_button_in_the_navigation_bar() {
	   att.clickstudentLink();
	   LoggerLoad.info("click the student link");
	}

	@Then("Attendance_ Admin should able to land on student page")
	public void attendance_admin_should_able_to_land_on_student_page() {
	    title =att.getPageTitle();
	   assertEquals(title,"Manage Student");
	}

	@When("Attendance_ Admin clicks Program button in the navigation bar")
	public void attendance_admin_clicks_program_button_in_the_navigation_bar() {
	    att.clickProgramLink();
	    LoggerLoad.info("click the program link");
	}

	@Then("Attendance_ Admin should able to land on program page")
	public void attendance_admin_should_able_to_land_on_program_page() {
		 title =att.getPageTitle();
		   assertEquals(title,"Manage Program");
	}

	@When("Attendance_ Admin clicks Batch button in the navigation bar")
	public void attendance_admin_clicks_batch_button_in_the_navigation_bar() {
	    att.clickBatchLink();
	    LoggerLoad.info("click the batch link");
	}

	@Then("Attendance_ Admin should able to land on batch page")
	public void attendance_admin_should_able_to_land_on_batch_page() {
		title =att.getPageTitle();
		   assertEquals(title,"Manage Batch");
	}

	@When("Attendance_ Admin clicks User button in the navigation bar")
	public void attendance_admin_clicks_user_button_in_the_navigation_bar() {
	   att.clickUserLink();
	   LoggerLoad.info("click the user link");
	}

	@Then("Attendance_ Admin should able to land on user page")
	public void attendance_admin_should_able_to_land_on_user_page() {
		  title =att.getPageTitle();
		   assertEquals(title,"Manage User");
	}

	@When("Attendance_ Admin clicks Assignment button in the navigation bar")
	public void attendance_admin_clicks_assignment_button_in_the_navigation_bar() {
	   att.clickAssignmentLink();
	   LoggerLoad.info("click the Assignment link");
	}

	@Then("Attendance_ Admin should able to land on Assignment page")
	public void attendance_admin_should_able_to_land_on_assignment_page() {
		  title =att.getPageTitle();
		   assertEquals(title,"Manage Assignment");
	}

	@When("Attendance_ Admin clicks Class button in the navigation bar")
	public void attendance_admin_clicks_class_button_in_the_navigation_bar() {
	    att.clickClassLink();
	    LoggerLoad.info("click the class link");
	}

	@Then("Attendance_ Admin should able to land on Class page")
	public void attendance_admin_should_able_to_land_on_class_page() {
		title =att.getPageTitle();
		   assertEquals(title,"Manage Class");
	}

	@When("Attendance_ Admin clicks Logout button in the navigation bar")
	public void attendance_admin_clicks_logout_button_in_the_navigation_bar() {
	   att.clickLogoutLink();
	   LoggerLoad.info("click the logout link");
	}

	@Then("Attendance_ Admin should able to land on login page")
	public void attendance_admin_should_able_to_land_on_login_page() {
		title =att.getPageTitle();
		   assertEquals(title,"Please login to LMS application");
	}


}
