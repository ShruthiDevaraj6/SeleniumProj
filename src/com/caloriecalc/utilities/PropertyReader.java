package com.caloriecalc.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyReader {
	public static Properties prop = new Properties();
	public static FileInputStream inputStream =null;
	
	public static String ReadProperty(String propertyName) throws IOException {
		String PropertyValue= null;
		inputStream = new FileInputStream(new File("./src/com/caloriecalc/config/config.properties"));
		prop.load(inputStream);
		PropertyValue = prop.getProperty(propertyName);
		return PropertyValue;
		
	}

}
