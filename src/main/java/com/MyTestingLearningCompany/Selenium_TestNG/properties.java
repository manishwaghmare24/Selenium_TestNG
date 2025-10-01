package com.MyTestingLearningCompany.Selenium_TestNG;

import java.io.FileInputStream;
import java.util.Properties;

public class properties {
	
	public static Properties prop;
	
	public static Properties getproperties() {
		if(prop == null) {
			try {
			prop = 	new Properties();
			FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\resources\\config.properties");
			prop.load(file);
			
			
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			
		}
		return prop;
		
	} 

}
