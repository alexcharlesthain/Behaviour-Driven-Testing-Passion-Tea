package com.qa.alex.com.qa.alex.teatesting;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.LogStatus;
import com.relevantcodes.extentreports.ExtentTest;

public class TeaTestHomePage {
	
	public ExtentReports report;
	public ExtentTest test;
	public WebDriver driver;
	
	//Welcome/ Landing Page
	@FindBy(xpath = "//*[@id=\"wsb-nav-00000000-0000-0000-0000-000450914915\"]/ul/li[1]/a")
	private WebElement welcomePage;
	
	//Welcome Page Text
	@FindBy(xpath = "//*[@id=\"wsb-element-00000000-0000-0000-0000-000450914886\"]/div/h1")
	private WebElement elements;

public void OpenPage() {	
	report = new ExtentReports("C:\\Users\\Admin\\Documents\\WelcomePageReport.html", true);
	test = report.startTest("Open Welcome page & Check Heading");
	test.log(LogStatus.PASS, "Website opened");
	test.log(LogStatus.INFO, "Welcome page opened");
	
	// Login unsuccessful
	String expected = "We're passionate about tea. ";
		try {
				assertEquals(expected, elements.getText());
				test.log(LogStatus.PASS, "Welcome page heading = " + elements.getText());
		} catch (AssertionError e) {
				test.log(LogStatus.FAIL, "Welcome page heading = " + elements.getText());
			}		
		report.endTest(test);
		report.flush();
		}

}
