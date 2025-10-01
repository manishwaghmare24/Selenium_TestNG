package com.MyTestingLearningCompany.Selenium_TestNG;

import java.util.Date;

public class DateUtility {
	
	public static String getTimeStamp() {
		
		Date date = new Date();
		return date.toString().replaceAll(":", "_").replaceAll(" ", "_");
	}

}
