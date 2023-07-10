package readPropretyData;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadDataFromProprety {

	public static void main(String[] args) throws IOException {
		//read the data from config.properties file
		
		FileInputStream fis = new FileInputStream("./data/config.properties");
		
		//create object of properties class
		Properties prop = new Properties();
		
		//make file ready to read
		
		prop.load(fis);
		
		//read the particular property form file
		
		String data = prop.getProperty("Browser");
	    System.out.println(data);
	}

}
