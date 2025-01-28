package excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingDynamicData {
	
	public static void main  (String args[]) throws IOException
	{
		
		
		XSSFWorkbook book=new XSSFWorkbook();
		
		
		XSSFSheet sheet=book.createSheet("dynamicData");
		Scanner sc=new Scanner(System.in);
		System.out.println("eneter rows");
		int noOfRows=sc.nextInt();
		System.out.println("eneter columns");
		int noOfCols=sc.nextInt();
		
		for(int r=0;r<=noOfRows;r++)
			
		{
			
			XSSFRow currentRow=sheet.createRow(r);
			for(int c=0;c<noOfCols;c++)
			{
				XSSFCell curCell= currentRow.createCell(c);
				curCell.setCellValue(sc.next());
				
				//don't know what value is so using next()
			}
			
		}
		
	
		
		FileOutputStream file1=new FileOutputStream(System.getProperty("user.dir")+"\\testData\\dynamic.xlsx");
		
		book.write(file1);
		book.close();
		file1.close();
		
		
	
	}

}
