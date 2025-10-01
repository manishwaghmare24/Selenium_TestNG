package com.MyTestingLearningCompany.Selenium_TestNG;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

public class HomePageLinks extends BaseClass {
	 @Test
     public void linksCount() {
   	  logger = reporter.createTest("Links Name");
   	  openbrowser("chrome");
 		
			callUrl("QA_Crickbuzz");
			logger.log(Status.INFO, "Links Name");
   	  List<WebElement> links = driver.findElements(By.tagName("a"));
   	  //String linksname = null;
   	  for(WebElement link : links) {
   		  String stringurl = link.getText();
   		  if (stringurl != null && !stringurl.isEmpty()) {
   			  logger.log(Status.INFO, link.getText());
       		  System.out.println("Links Name:"+ stringurl);
			}
   		 
   	  }
   	  driver.quit();

     }
}
