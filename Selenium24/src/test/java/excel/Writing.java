package excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Writing {
	
	public static void main  (String args[]) throws IOException
	{
		
		
		XSSFWorkbook book=new XSSFWorkbook();
		
		
		XSSFSheet sheet=book.createSheet("ranjith");
		XSSFRow row1=sheet.createRow(0);
		row1.createCell(0).setCellValue("tj");
		row1.createCell(1).setCellValue("musiri");
		
		XSSFRow row2=sheet.createRow(1);
		row2.createCell(0).setCellValue(123);
		row2.createCell(1).setCellValue("musiri");
		row2.createCell(2).setCellValue(true);
		
		XSSFRow row3=sheet.createRow(2);
		row3.createCell(0).setCellValue(1235);
		row3.createCell(1).setCellValue("musiri trichy");
		row3.createCell(2).setCellValue(12.0);
		
		FileOutputStream file=new FileOutputStream(System.getProperty("user.dir")+"\\testData\\myFile.xlsx");
		book.write(file);
		book.close();
		file.close();
		
		
	
	}

}
