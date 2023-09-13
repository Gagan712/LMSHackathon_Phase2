package stepDefinition;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import hooks.Hooks;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Attendancepopuppage;
import pages.ClassPage;
import utilities.Excelreader;

public class Attendancedetailspopup_SD {
	WebDriver driver=Hooks.driver;
	ClassPage cps = new ClassPage(driver);
	Attendancepopuppage atp= new Attendancepopuppage(driver);
Excelreader read;
	
	@Given("Admin is on manage attendance page in attendance")
	public void admin_is_on_manage_attendance_page_in_attendance() {
		 cps.homepage();
		 atp.clickAttendance();
	}

	@When("Admin clicks + a new attendance button in attendance")
	public void admin_clicks_a_new_attendance_button_in_attendance() {
	   atp.clickNewAttendance();
	}

	@Then("Admin should see correct spellings in the label in attendance")
	public void admin_should_see_correct_spellings_in_the_label_in_attendance() {
	 atp.spellingfortextbox();
	 List<String> actualnames = new ArrayList<String>();
	 read= new Excelreader("1", "textboxnames");
	 List<Object> correctnamestobechecked=read.getsetofdata();
	 CollectionUtils.isEqualCollection(actualnames, correctnamestobechecked);
	 
	}

	@Then("Admin Should see there are four dropdowns in attendance")
	public void admin_should_see_there_are_four_dropdowns_in_attendance() {
		 int noofdropdowns= atp.noofdropdown();
		 Assert.assertEquals(noofdropdowns, 4);
	}

	@Then("Admin should see  close button on the attendance details popup window in attendance")
	public void admin_should_see_close_button_on_the_attendance_details_popup_window_in_attendance() {
	    boolean cond=atp.closedisplay();
	    Assert.assertEquals(cond, true);
	}

	@Then("Close button should on the top right corner in attendance")
	public void close_button_should_on_the_top_right_corner_in_attendance() {
	 boolean rslt=atp.positionofclose();
	 Assert.assertEquals(rslt, true);
	 
	}

	@Then("First dropdown box {string} text  should be present in attendance")
	public void first_dropdown_box_text_should_be_present_in_attendance(String string) {
		 List<Object> expectednames = new ArrayList<Object>();
		read= new Excelreader("12", "Textboxlabelsinside" );
	  String actualname = atp.textboxprogname();
	  List<Object> names =read.getsetofdata();
	  String expectedname= names.get(0).toString();
	  Assert.assertEquals(actualname, expectedname);
	}

	@Then("Second dropdown box {string} text  should be present in attendance")
	public void second_dropdown_box_text_should_be_present_in_attendance(String string) {
		 List<Object> expectednames = new ArrayList<Object>();
			read= new Excelreader("12", "Textboxlabelsinside" );
		  String actualname = atp.textboxclassname();
		  List<Object> names =read.getsetofdata();
		  String expectedname= names.get(1).toString();
		  Assert.assertEquals(actualname, expectedname);
	}

	@Then("Third dropdown box {string} text  should be present in attendance")
	public void third_dropdown_box_text_should_be_present_in_attendance(String string) {
		 List<Object> expectednames = new ArrayList<Object>();
			read= new Excelreader("12", "Textboxlabelsinside" );
		  String actualname = atp.textboxstudentname();
		  List<Object> names =read.getsetofdata();
		  String expectedname= names.get(2).toString();
		  Assert.assertEquals(actualname, expectedname);
	}

	@Then("Fourth dropdown box {string} text  should be present in attendance")
	public void fourth_dropdown_box_text_should_be_present_in_attendance(String string) {
		 List<Object> expectednames = new ArrayList<Object>();
			read= new Excelreader("12", "Textboxlabelsinside" );
		  String actualname = atp.textboxsattendancee();
		  List<Object> names =read.getsetofdata();
		  String expectedname= names.get(3).toString();
		  Assert.assertEquals(actualname, expectedname);
	}

	@Then("Admin  should text in gray color in attendance")
	public void admin_should_text_in_gray_color_in_attendance() {
	  String colorofprogname=atp.textboxprogname();
	  String colorofclassname=atp.getcoloroftextclass();
	  String colorofstudentname= atp.getcolorofstudentclass();
	  String colorofattendance=atp.getcolorofattendance();
	  Assert.assertEquals(colorofprogname, "gray");
	  Assert.assertEquals(colorofclassname, "gray");
	  Assert.assertEquals(colorofstudentname, "gray");
	  Assert.assertEquals(colorofattendance, "gray");
	}

	@Then("Admin should see a save button in the class detail popup window in attendance")
	public void admin_should_see_a_save_button_in_the_class_detail_popup_window_in_attendance() {
	   boolean rslt=atp.checksavebutton();
	   Assert.assertEquals(rslt, true);
	}

	@Then("Admin should see a cancel button in the class detail popup window in attendance")
	public void admin_should_see_a_cancel_button_in_the_class_detail_popup_window_in_attendance() {
		boolean rslts=atp.checkcancelbutton();
		Assert.assertEquals(rslts, true);
	}

	@Then("Order of the label should be Program name, Class Name, Student Name, Attendance, Attendance Date. in attendance")
	public void order_of_the_label_should_be_program_name_class_name_student_name_attendance_attendance_date_in_attendance() {
	    LinkedHashSet<Object> orderoftexts= atp.checkorderoftexts();
	    read=new Excelreader("2", "Textboxlabel");
	    LinkedHashSet<Object> expectedorder = new LinkedHashSet<Object>();
	    expectedorder.add(read.getsetofdata());	
	    CollectionUtils.isEqualCollection(orderoftexts, expectedorder);
	}

	@Given("Admin is in  attendance details popup window in attendance")
	public void admin_is_in_attendance_details_popup_window_in_attendance() {
		 cps.homepage();
		 atp.clickAttendance();
		 atp.clickNewAttendance();
	}

	@When("Admin clicks  program name dropdown in attendance")
	public void admin_clicks_program_name_dropdown_in_attendance() {
	    atp.clickprognamedropdown();
	}

	@Then("Program Name in the drop down should match with  program name in  manage program page table in attendance")
	public void program_name_in_the_drop_down_should_match_with_program_name_in_manage_program_page_table_in_attendance() {
	 String txtindropdown= atp.textinprognamedd();
	 String txtintable=atp.textboxprogname();
	 Assert.assertEquals(txtindropdown, txtintable);
	}

	@When("Admin clicks class name dropdown in attendance")
	public void admin_clicks_class_name_dropdown_in_attendance() {
	   atp.clickclassnamedropdown();
	}

	@Then("Class Name in the drop down should match with  class name in  manage class page table in attendance")
	public void class_name_in_the_drop_down_should_match_with_class_name_in_manage_class_page_table_in_attendance() {
		 String txtindropdown= atp.textinclassnamedd();
		 String txtintable=atp.textboxclassname();
		 Assert.assertEquals(txtindropdown, txtintable);
	}

	@When("Admin clicks attendance dropdown in attendance")
	public void admin_clicks_attendance_dropdown_in_attendance() {
	   atp.clickattenddropdown();
	}

	@Then("Attendance field should have keywords such as - present, absent, late, excused in attendance")
	public void attendance_field_should_have_keywords_such_as_present_absent_late_excused_in_attendance() {
		boolean rstl = atp.checkattendanceddspelling();
		Assert.assertEquals(rstl, true);
	
	}

	@Then("Admin should see correct spellings in dropdown text in attendance")
	public void admin_should_see_correct_spellings_in_dropdown_text_in_attendance() {
		read=new Excelreader("13", "Dditems");
		 List<String> dd= atp.checkattendancedd();
		 List<Object> expecteddd = read.getsetofdata();
		 CollectionUtils.isEqualCollection(dd, expecteddd);
	}

	@When("Admin clicks the date from date picker in attendance")
	public void admin_clicks_the_date_from_date_picker_in_attendance() {
	   atp.clickdatepicker();
	   atp.selectdate();
	}

	@Then("selected date should be there in class date text box in attendance")
	public void selected_date_should_be_there_in_class_date_text_box_in_attendance() {
	   String seldate = atp.gethighdate();
	   String classtextbox=atp.textboxsattendancee();
	   Assert.assertEquals(seldate, classtextbox);
	}

	@Then("The selected date should be in  mm\\/dd\\/yyyy format in attendance")
	public void the_selected_date_should_be_in_mm_dd_yyyy_format_in_attendance() throws ParseException {
	 atp.isvaliddate();
	}

	@When("Admin clicks the right arrow in the date picker near month in attendance")
	public void admin_clicks_the_right_arrow_in_the_date_picker_near_month_in_attendance() {
	  atp.clicknextmonth();
	}

	@Then("Next month calender should be visible in attendance")
	public void next_month_calender_should_be_visible_in_attendance() {
		  String month = atp.monthincalendar();
		   Assert.assertEquals(month, "October");
	}

	@When("Admin clicks the left arrow in the date picker near month in attendance")
	public void admin_clicks_the_left_arrow_in_the_date_picker_near_month_in_attendance() {
	   atp.clickprevmonth();
	}

	@Then("previous month calender should be visible in attendance")
	public void previous_month_calender_should_be_visible_in_attendance() {
		 String month = atp.monthincalendar();
		   Assert.assertEquals(month, "August");
	}

	@When("Admin clicks the date picker button in attendance")
	public void admin_clicks_the_date_picker_button_in_attendance() {
	  atp.clickdatepicker();
	}

	@Then("Admin should see current date is highled in the date picker in attendance")
	public void admin_should_see_current_date_is_highled_in_the_date_picker_in_attendance() {
		  String hdate= atp.findhighlighteddate();
		  Assert.assertEquals(hdate, "9");
	}

	@When("Admin clicks the date picker button and selects future date in attendance")
	public void admin_clicks_the_date_picker_button_and_selects_future_date_in_attendance() {
		 atp.clickdatepicker();
		 atp.clickfuturedate();;
	}

	@Then("Admin should see selected date is highled in the date picker in attendance")
	public void admin_should_see_selected_date_is_highled_in_the_date_picker_in_attendance() {
		String hdate= atp.findhighlighteddate();
		  Assert.assertEquals(hdate, "10");
	}

}
