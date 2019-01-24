package com.qa.alex.com.qa.alex.teatesting;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.LogStatus;
import com.relevantcodes.extentreports.ExtentTest;

public class TeaTestMenuPage {

	public ExtentReports report;
	public ExtentTest test;
	public WebDriver driver;

	//Menu Page
	@FindBy(xpath = "//*[@id=\"wsb-nav-00000000-0000-0000-0000-000450914915\"]/ul/li[3]/a")
	private WebElement menuPage;

	//Menu Page Text
	@FindBy(xpath = "//*[@id=\"wsb-element-00000000-0000-0000-0000-000450914921\"]/div/h1")
	private WebElement elements;
	
	

	public void OpenPage() {	
		report = new ExtentReports("C:\\Users\\Admin\\Documents\\MenuPageReport.html", true);
		test = report.startTest("Open Menu page & Check Heading");
		test.log(LogStatus.PASS, "Website opened");
		test.log(LogStatus.INFO, "Menu page opened");

		// Menu Text Check
		String expected = "Menu";
		try {
			assertEquals(expected, elements.getText());
			test.log(LogStatus.PASS, "Menu page heading = " + elements.getText());
		} catch (AssertionError e) {
			test.log(LogStatus.FAIL, "Menu page heading = " + elements.getText());
		}		
		report.endTest(test);
		report.flush();
	}


}
