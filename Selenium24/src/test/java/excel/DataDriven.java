package excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDriven {
	
	public static void main  (String args[]) throws IOException
	{
		
		FileInputStream fin=new FileInputStream(System.getProperty("user.dir")+"\\testData\\Data.xlsx");
		XSSFWorkbook book=new XSSFWorkbook(fin);
		XSSFSheet sheet=book.getSheet("Sheet1");
		int totalRows=sheet.getLastRowNum();
		int totalCells=sheet.getRow(1).getLastCellNum();
		
		System.out.println(totalRows);
		System.out.println(totalCells);
		
		for(int r=0;r<=totalRows;r++)
		{
			for(int c=0;c<totalCells;c++)
			{
				XSSFRow currentRow=sheet.getRow(r);
				XSSFCell val=currentRow.getCell(c);
				System.out.print(val.toString()+"\t");
			}
			System.out.println();
		}
		
		
		book.close();
		fin.close();
		
	}

}
