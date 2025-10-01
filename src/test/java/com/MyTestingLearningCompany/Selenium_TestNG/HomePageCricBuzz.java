package com.MyTestingLearningCompany.Selenium_TestNG;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

public class HomePageCricBuzz extends BaseClass {
      @Test 
	public void test1_HomePage() {
    	logger = reporter.createTest("HompePage Verify");
		openbrowser("chrome");
		
			callUrl("QA_Crickbuzz");
		driver.quit();
		
	}
     
      
      @AfterTest
  	public void endReport() {
    	  reporter.flush();
  		
  	}
	
	
}
