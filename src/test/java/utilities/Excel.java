package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel {
	
	 public static void getsetofdata(String columnname) {
		  List<Object> listofdata = new ArrayList<Object>();
		  String excelpath = System.getProperty("user.dir")+"/src/test/resources/TestData/dataforhackathon.xlsx";
		    File newfile = new File(excelpath);
		      FileInputStream readexcel = null;
		    try {
		      readexcel = new FileInputStream(newfile);
		    } catch (FileNotFoundException e) {
		      
		      e.printStackTrace();
		    }
		      XSSFWorkbook excel = null;
		    try {
		      excel = new XSSFWorkbook(readexcel);
		    } catch (IOException e) {
		      
		      e.printStackTrace();
		    }
		      XSSFSheet sheet = excel.getSheet("Sheet1");
		      for(int rownum=19; rownum<=25;rownum++) {
		    	  Row selectedRow =sheet.getRow(rownum);
		    	  DataFormatter dataformat = new DataFormatter();
		    	  if(columnname.equals(dataformat.formatCellValue(selectedRow.getCell(0)))) {
		    		 for(int column=1; column<10; column++) {
		    			 Cell selectedcell=selectedRow.getCell(column);
		    			  listofdata.add(dataformat.formatCellValue(selectedcell));
		    			   }
		    	  } 
		    		  
		    	  }
			
		      System.out.println(listofdata);
	  }
	 public static void isvaliddate() throws ParseException {
		 SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-mm-dd");
	        Date date1 = simpleDateFormat.parse("2022-11-06");
	        Date date2 = simpleDateFormat.parse("2022-11-06");
	        System.out.println(date2.compareTo(date1));
	 }

	public static void main(String[] args) throws ParseException {
		isvaliddate();

	}

}
