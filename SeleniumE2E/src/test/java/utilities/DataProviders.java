package utilities;

import java.io.IOException;

import org.testng.annotations.DataProvider;

public class DataProviders {
	
	
	@DataProvider(name="LoginData")
	public String[][] testData() throws IOException
	{
	String path=".\\testData\\Login.xlsx";
	XLUtility xl=new XLUtility(path);
	int totalRows=xl.getRowCount("Sheet1");
	int totalCols=xl.getCellCount("Sheet1",1);
	String[][] data=new String[totalRows][totalCols];
	
	for(int i=1;i<=totalRows;i++)
	{
		for(int j=0;j<totalCols;j++)
		{
			
			//i-1 is array sizing
			data[i-1][j]=xl.getCellData("Sheet1", i, j);
		}
	}
	
	return data;
	
	}
}
