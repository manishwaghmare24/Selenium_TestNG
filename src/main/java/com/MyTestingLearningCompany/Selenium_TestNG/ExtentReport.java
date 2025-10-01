package com.MyTestingLearningCompany.Selenium_TestNG;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReport {
	
	public static ExtentReports report;
	public static ExtentReports getReport() {
		if(report == null) {
			String reportname = "CrickBuzz" + DateUtility.getTimeStamp() + ".html";
			ExtentSparkReporter sparkconfig = new ExtentSparkReporter(System.getProperty("user.dir") + "\\test-output\\" + reportname);
			report = new ExtentReports();
			report.attachReporter(sparkconfig);
			report.setSystemInfo("OS", "Windows10");
			report.setSystemInfo("Environment", "UAT");
			report.setSystemInfo("Brwoser", "Chrome");
			sparkconfig.config().setDocumentTitle("UAT UI Automation Results");
			sparkconfig.config().setReportName("All Headlines UI Test Report");
		
			sparkconfig.config().setTimeStampFormat("MM dd, yyyy HH:mm:ss");
		}
		
		return report;
		
	}                                                                                                                                                                                                                                                                                                                                                           

}
