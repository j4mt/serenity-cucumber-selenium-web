package com.j4mt.seleniumframework.steps;

import com.j4mt.seleniumframework.core.driver.DriverProvider;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.runtime.java.guice.ScenarioScoped;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class GoogleSearchScenario {


	String webpage = "";
	String title = "";

	public GoogleSearchScenario() {

		DriverProvider.getDriver();

	}

	@Given("^the page is open \"([^\"]*)\"$")
	public void the_page_is_open(String page) throws Throwable {
		DriverProvider.getDriver().get(page);
		webpage = page;
	}

	@When("^I search for \"([^\"]*)\"$")
	public void I_search_for(String search) throws Throwable {
		WebElement element = DriverProvider.getDriver().findElement(By.name("q"));
		element.sendKeys(search);
		element.submit();
	}

	@Then("^a browser title should contains \"([^\"]*)\"$")
	public void a_browser_title_should_contains(String text) throws Throwable {
		assertTrue(DriverProvider.getDriver().getTitle().contains(text));
	}

	@When("^I click on a link$")
	public void I_click_on_a_link() {
    // Express the Regexp above with the code you wish you had
		WebElement my_yahoo = DriverProvider.getDriver().findElement(By.linkText("My Yahoo"));
		title = DriverProvider.getDriver().getTitle();
		my_yahoo.click();
	}

	@Then("^I am no longer on the page$")
	public void I_am_no_longer_on_the_page() {
    // Express the Regexp above with the code you wish you had
    	assertFalse(DriverProvider.getDriver().getTitle() == title);
	}
}
