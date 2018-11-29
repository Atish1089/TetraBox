package com.stepDefinations;

import javax.swing.plaf.basic.BasicTabbedPaneUI;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.driver.DriverInstance;
import com.pages.BoxEmailPage;
import com.pages.BoxPasswordPage;

import cucumber.api.Scenario;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BoxLoginLogoutSteps {

	DriverInstance instance = DriverInstance.getDriverInstance();
	WebDriver driver = instance.getDriver();
	WebDriverWait wait = instance.getWait();
	BoxEmailPage ep;
	BoxPasswordPage bp;

	@Before("@login,@createfolder")
	public void beforeScenario(Scenario sc) {
		System.out.println(sc.getName());
		ep = new BoxEmailPage(driver);
		bp = new BoxPasswordPage(driver);
	}

	@Before("@login123")
	public void beforeScenario123(Scenario sc) {
		System.out.println("aaaaaaaaaaaaaaaaaaaaaaa " + sc.getName());
		ep = new BoxEmailPage(driver);
		bp = new BoxPasswordPage(driver);
	}

	@Given("^I want to navigate to box website$")
	public void navigateToBox() {
		String appUrl = "https://app.box.com/";
		driver.get(appUrl);

	}

	@Then("^page with title \"([^\"]*)\" should open$")
	public void veriifyPageTitle(String title) {
		boolean titleFlag = ep.pageVerify(title);
		Assert.assertTrue("Given title " + title + " could not be found", titleFlag);
	}

	@When("^user enter \"([^\"]*)\" username$")
	public void enterUserName(String name) {
		ep.enterEmail(name);
	}

	@And("^Click on Next button$")
	public void clickNext() {
		ep.clickNext();

	}

	@Then("^User should be able to enter \"([^\"]*)\" password")
	public void enterPassword(String name) {
		bp.enterPassword(name);
	}

	@And("^user clicks on login button$")
	public void clickLoginButton() {
		bp.clickNext();

	}

	@When("^user clicks on logout button$")
	public void clickLogoutBtn() throws Throwable {
		Thread.sleep(3000);
		WebElement acctmenu = new WebDriverWait(driver, 45).until(ExpectedConditions
				.visibilityOfElementLocated(By.cssSelector("button[data-resin-target=\"accountmenu\"] ")));
		acctmenu.click();

		WebElement logout = wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.cssSelector("ul[data-resin-feature=\"accountmenu\"] [data-resin-target=\"logout\"]")));
		logout.click();
	}

	@Then("^error message \"([^\"]*)\" is displayed$")
	public void getErrorMessage(String error) {
		Assert.assertEquals("Error Message not matched", bp.getErrorMessage(), error);
	}
}