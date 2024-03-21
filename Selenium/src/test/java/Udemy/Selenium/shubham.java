package Udemy.Selenium;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import com.google.common.collect.Table.Cell;

public class shubham {
	
	public static String readExcelData(String key, String value) throws IOException
	{
	
		FileInputStream fis=new FileInputStream("//Users//shubham-qa//Downloads//myTestData.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		
		XSSFSheet sheet=wb.getSheetAt(0);
		XSSFRow row1=sheet.getRow(0);
		int colNum=-1;
		String returnValue="";
		for(int i=0;i<row1.getPhysicalNumberOfCells(); i++)
		{
			XSSFCell cell=row1.getCell(i);
			String s=cell.getStringCellValue();
			if(cell.getStringCellValue().contains(value))
			{
				colNum=cell.getColumnIndex();
			}
		}
		
		try {
		for(int i=0; i<sheet.getPhysicalNumberOfRows();i++)
		{
			XSSFRow row=sheet.getRow(i);
			XSSFCell c=row.getCell(0);
			
			if(c.getStringCellValue().equals(key))
			{
				returnValue=row.getCell(colNum).getStringCellValue();
			}
		}
		}
		catch(Exception e)
		{
			System.out.println("Exception occured while getting cell value "+e);
		}
		
		fis.close();
		
		return returnValue;
	}	
	
	
	public static String[] getValues(String testCaseName) throws IOException
	{
		String[] values =readExcelData(testCaseName,"value").split(",");
		return values;
	}
	
	@Test
	public void main1() throws IOException
	{
		System.out.println(readExcelData("Leaders","Pak"));
		String p1=getValues("createOpportunityTest")[0];
		String p2=getValues("createOpportunity")[1];
		String p3=getValues("createOpportunityTest")[2];
		String p4=getValues("createOpportunityTest")[3];
		String p5=getValues("createOpportunityTest")[4];
		
		
		System.out.println(p1+"\t"+p2+"\t"+p3+"\t"+p4+"\t"+p5);
	}

}
