package seleniumAdvance.Framework;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.util.SystemOutLogger;
import org.testng.annotations.Test;


public class Excel {
	
	static String path = System.getProperty("user.dir")+"\\TestData_2.xls";
	
public static FileInputStream getFile(String path) throws FileNotFoundException {
		System.out.println(path);
	return new FileInputStream(path);
}

public static void readCell(String sheet,String Key) throws FileNotFoundException, IOException
{
	HSSFWorkbook workBook = new HSSFWorkbook(getFile(path));
	int numberOfSheet = workBook.getNumberOfSheets();
	System.out.println("Number of Sheets: "+numberOfSheet);
	for (int i =0; i<=numberOfSheet-1;i++)
	{
		
		HSSFSheet sheetName = workBook.getSheetAt(i);
		if (sheetName.getSheetName().equalsIgnoreCase(sheet))
		{
	int rowCount = sheetName.getPhysicalNumberOfRows();
	System.out.println("Total number of rows: "+rowCount);
		for(int j =0;j<=rowCount-1;j++)
		{
			HSSFRow Rows = sheetName.getRow(j);
			int cellCount = Rows.getPhysicalNumberOfCells();
			//System.out.println("Total cell: "+cellCount);
			for (int k =0;k<=cellCount-1;k++)
			{
				HSSFCell cell = Rows.getCell(k);
				
				  if (cell.getStringCellValue().equalsIgnoreCase(Key)) {
				  System.out.println(Rows.getCell(cell.getColumnIndex()+1).getStringCellValue()
				  ); //break; }
				 
			System.out.println(cell);
			}
		}
			//break;	
		}}
		else
		{
			System.out.println("No sheet found!!");
		}
	
}
}
@Test

public static void writeCell() throws IOException
{ /*
	 * String path = System.getProperty("user.dir"); FileInputStream fileOutput =
	 * new FileInputStream(path); HSSFWorkbook wb = new HSSFWorkbook(fileOutput);
	 * HSSFSheet sheet = wb.createSheet("writeExcel.xls"); HSSFRow row =
	 * sheet.createRow(2); row.createCell(0).setCellValue("sumit");
	 */
	HSSFWorkbook workBook = new HSSFWorkbook(getFile(path));
	int numberOfSheet = workBook.getNumberOfSheets();
	System.out.println("Number of Sheets: "+numberOfSheet);
	for (int i =0; i<=numberOfSheet-1;i++)
	{
		
		HSSFSheet sheetName = workBook.getSheetAt(i);
		if (sheetName.getSheetName().equalsIgnoreCase("GeneralConfig"))
		{
		}
	}
}
	
	
@Test
public static void run() throws FileNotFoundException, IOException
{
	readCell("GeneralConfig", "URL");
}
}



