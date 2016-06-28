package com.michalvich.cucumber.selenium.example;

import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class GoogleSearchScenario {

	private WebDriver driver;
	String webpage = "";
	String title = "";

	public GoogleSearchScenario() {
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		this.driver = new ChromeDriver();

	}

	@Given("^the page is open \"([^\"]*)\"$")
	public void the_page_is_open(String page) throws Throwable {
		driver.get(page);
		webpage = page;
	}

	@When("^I search for \"([^\"]*)\"$")
	public void I_search_for(String search) throws Throwable {
		WebElement element = driver.findElement(By.name("q"));
		element.sendKeys(search);
		element.submit();
	}

	@Then("^a browser title should contains \"([^\"]*)\"$")
	public void a_browser_title_should_contains(String text) throws Throwable {
		assertTrue(driver.getTitle().contains(text));
	}

	@When("^I click on a link$")
	public void I_click_on_a_link() {
    // Express the Regexp above with the code you wish you had
		WebElement my_yahoo = driver.findElement(By.linkText("My Yahoo"));
		title = driver.getTitle();
		my_yahoo.click();
	}

	@Then("^I am no longer on the page$")
	public void I_am_no_longer_on_the_page() {
    // Express the Regexp above with the code you wish you had
    	assertFalse(driver.getTitle() == title);
	}
}
