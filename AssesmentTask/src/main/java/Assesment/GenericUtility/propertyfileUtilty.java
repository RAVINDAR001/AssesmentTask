package Assesment.GenericUtility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class propertyfileUtilty {
	
	
	
	/**
	 * This method is used to read the data from property file if key is passed
	 * 
	 * @param key
	 * @return
	 * @throws IOException
	 */
	public String toReadDataFromPropertyFile(String key) throws IOException {
		FileInputStream fis = new FileInputStream(".\\src\\test\\resources\\TestData.properties");
		Properties prop = new Properties();
		prop.load(fis);
		String value = prop.getProperty(key);
		return value;
	}
		
		
	}


