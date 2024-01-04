package Basic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ReadDataFromExcel {
	
	@Test(dataProvider="searchdata")
	public void getdata()
	{
		
	}
	@DataProvider(name="searchdata")
	public Object[][]dataProvider()
	{
		String filePath="";
		Object[][]data=getData(filePath,"sheet1");
		return data;
	}
	public String[][]getData(String fileName,String sheetName)
	{
		String[][] Data=null;
		try {
			FileInputStream file=new FileInputStream(fileName);
			XSSFWorkbook workbook=new XSSFWorkbook(file);
			XSSFSheet sheet=workbook.getSheet(sheetName);
			int row=sheet.getLastRowNum()+1;
			int cell=sheet.getRow(0).getLastCellNum();
			Data=new String[row-1][cell];
			for(int currentRow=1;currentRow<row;currentRow++)
			{
				for(int currentCell=0;currentCell<cell;currentCell++)
				{
				Data[currentRow-1][currentCell]=sheet.getRow(currentRow).getCell(currentCell).getStringCellValue();	
				}
			}
			workbook.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return Data;
		
	}
	

}
