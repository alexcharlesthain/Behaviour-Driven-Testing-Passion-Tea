package com.qa.alex.com.qa.alex.teatesting;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.LogStatus;
import com.relevantcodes.extentreports.ExtentTest;

public class TeaTestCheckoutPage {
	
	public ExtentReports report;
	public ExtentTest test;
	public WebDriver driver;

	@Test
	  public void testPassionTeaTestCase() throws Exception {
		
	    driver.findElement(By.linkText("Check Out")).click();
	    driver.findElement(By.id("email")).click();
	    driver.findElement(By.id("email")).clear();
	    driver.findElement(By.id("email")).sendKeys("alexcharlesthain@gmail.com");
	    driver.findElement(By.id("name")).clear();
	    driver.findElement(By.id("name")).sendKeys("Alex Thain");
	    driver.findElement(By.id("address")).clear();
	    driver.findElement(By.id("address")).sendKeys("540 Liverpool Street");
	    driver.findElement(By.id("name")).click();
	    driver.findElement(By.id("address")).click();
	    driver.findElement(By.id("card_type")).click();
	    driver.findElement(By.id("card_type")).click();
	    driver.findElement(By.id("card_number")).click();
	    driver.findElement(By.id("card_number")).clear();
	    driver.findElement(By.id("card_number")).sendKeys("6757567567575878678");
	    driver.findElement(By.id("cardholder_name")).click();
	    driver.findElement(By.id("cardholder_name")).clear();
	    driver.findElement(By.id("cardholder_name")).sendKeys("alex thain");
	    driver.findElement(By.id("verification_code")).click();
	    driver.findElement(By.id("verification_code")).clear();
	    driver.findElement(By.id("verification_code")).sendKeys("678");
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Cancel'])[1]/following::button[1]")).click();

	}
	
		//Check-Out button
		@FindBy(xpath = "//*[@id=\"wsb-button-00000000-0000-0000-0000-000451955160\"]")
		private WebElement checkoutButton;
		
		public void checkoutButton() {
		checkoutButton.click();
		
		
		}
	
		public void OpenPage() {	
		report = new ExtentReports("C:\\Users\\Admin\\Documents\\CheckoutPageReport.html", true);
		test = report.startTest("Open Menu page & Check Heading");
		test.log(LogStatus.PASS, "Website opened");
		test.log(LogStatus.INFO, "Checkout page opened");

		// Login unsuccessful
		/*String expected = "Menu";
		try {
			assertEquals(expected, elements.getText());
			test.log(LogStatus.PASS, "Menu page heading = " + elements.getText());
		} catch (AssertionError e) {
			test.log(LogStatus.FAIL, "Menu page heading = " + elements.getText());
		}		
		report.endTest(test);
		report.flush();
	}*/
	    }
}
