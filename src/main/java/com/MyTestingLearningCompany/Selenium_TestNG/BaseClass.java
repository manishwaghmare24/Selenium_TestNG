package com.MyTestingLearningCompany.Selenium_TestNG;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class BaseClass {
	
	public static Properties prop = properties.getproperties();
	public static WebDriver driver = null;
	public ExtentReports reporter = ExtentReport.getReport();
	public ExtentTest logger;
	public  void openbrowser(String Browser) {
		try {
			if (Browser.equalsIgnoreCase("chrome")) {
        System.setProperty("webdriver.chrome.driver", prop.getProperty("driver"));
           driver = new ChromeDriver();
           driver.manage().window().maximize();
           logger.log(Status.INFO, "Browsr launch");
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	
		
		
	}
	
	//URL Call
			public void callUrl(String key) {
				try {
					driver.get(prop.getProperty(key));
					 logger.log(Status.INFO, "URL");
				} catch (Exception e) {
					e.getMessage();
				}
				
				
			}
	

	
	

}
