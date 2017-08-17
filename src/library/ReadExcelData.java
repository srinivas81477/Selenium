package library;

import java.io.FileInputStream;


import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadExcelData 
{
	public static String getCellData(String xpath,String sheetName, int row, int col)
	{
		String value =" ";
		try{
			FileInputStream f=new FileInputStream(xpath);
			Workbook wb=WorkbookFactory.create(f);
			Sheet s=wb.getSheet(sheetName);
			value=s.getRow(row).getCell(col).getStringCellValue().toString();
		}
		catch(Exception e){
			System.out.println(e.getStackTrace());
		}
		return value;
	}	
}
