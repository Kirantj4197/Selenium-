package excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesLoad {

	public static void main(String[] args) throws IOException {
	
		FileInputStream fon=new FileInputStream(System.getProperty("user.dir")+"\\testData\\input.properties");
		Properties pro=new Properties();
		pro.load(fon);
		pro.getProperty("url");
		
		fon.close();

	}

}
