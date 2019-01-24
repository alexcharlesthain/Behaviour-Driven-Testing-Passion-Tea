package com.qa.alex.teatesting;

import static org.junit.Assert.fail;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.qa.alex.com.qa.alex.teatesting.TeaConstants;
import com.qa.alex.com.qa.alex.teatesting.TeaTestCheckoutPage;
import com.qa.alex.com.qa.alex.teatesting.TeaTestHomePage;
import com.qa.alex.com.qa.alex.teatesting.TeaTestMenuPage;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TeaStackSteps {
	
	private WebDriver driver;
	private WebElement element;
	
	@Before
	  public void setUp() throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Documents\\chromedriver_win32\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}    
	
	@After
	public void tearDown() throws Exception {
		Thread.sleep(4000);    
		driver.quit();
	}
	
	@Given("^the correct web address$")
	public void the_correct_web_address() {
	    // Write code here that turns the phrase above into concrete actions
	    driver.get(TeaConstants.URL1);
	    TeaTestHomePage page = PageFactory.initElements(driver, TeaTestHomePage.class);
	    page.OpenPage();
	}

	@When("^I navigate to the 'Menu' page$")
	public void i_navigate_to_the_Menu_page() {
	    // Write code here that turns the phrase above into concrete actions
		driver.get(TeaConstants.URL2);
		TeaTestMenuPage page = PageFactory.initElements(driver, TeaTestMenuPage.class);
		page.OpenPage();
	}

	@Then("^I can browse a list of the available products\\.$")
	public void i_can_browse_a_list_of_the_available_products() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@When("^I click the checkout button$")
	public void i_click_the_checkout_button() {
	    // Write code here that turns the phrase above into concrete actions
		driver.get(TeaConstants.URL2);
		TeaTestCheckoutPage page = PageFactory.initElements(driver, TeaTestCheckoutPage.class);
		page.checkoutButton();
	}

	@Then("^I am taken to the checkout page$")
	public void i_am_taken_to_the_checkout_page() {
	    // Write code here that turns the phrase above into concrete actions
		driver.get(TeaConstants.URL3);
		TeaTestCheckoutPage page = PageFactory.initElements(driver, TeaTestCheckoutPage.class);
		
	}

}
