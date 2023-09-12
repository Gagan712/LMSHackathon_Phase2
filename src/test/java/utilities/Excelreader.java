package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelreader {
	
	private static String testid;
    private static String columnname;
    private static String testno;
	  public Excelreader(String testid) { 
	      this.testid = testid;
	          }
	
	  public Excelreader(String testno, String columnname) { 
	      this.testno = testno;
	      this.columnname=columnname;
	          }
	  
	  public String getdata() {
		  
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
		    
		    for(int rownum=1; rownum<=12;rownum++) {
		     Row selectedRow =sheet.getRow(rownum);
		     DataFormatter dataformat = new DataFormatter();
		     if(testid.equals(dataformat.formatCellValue(selectedRow.getCell(0)))) 
		     {
		       String data= dataformat.formatCellValue(selectedRow.getCell(1));
		      return data;
		     }
		     
		    }
		    return "";
		  
	  }
	  
	  public List<Object> getsetofdata() {
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
		    		  
		    	  
			return listofdata;
		      
	  }
	  

}
