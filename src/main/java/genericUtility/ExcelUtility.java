package genericUtility;

import java.io.FileInputStream;


import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility 
{
	/**
	 * This method is generic method to fetch data from excel
	 * @param Sheetname
	 * @param row
	 * @param cell
	 * @return
	 * @throws Exception
	 */
	public String getDataFromExcel(String sheetname, int row, int cell)throws Exception
	{
		FileInputStream fis=new FileInputStream(IConstantUtility.ExcelPath);		
		Workbook book= WorkbookFactory.create(fis);
		Sheet sh=book.getSheet(sheetname);
		DataFormatter format=new DataFormatter();
		String cellvalue=format.formatCellValue(sh.getRow(row).getCell(cell));
		return cellvalue;
		
	}

}
