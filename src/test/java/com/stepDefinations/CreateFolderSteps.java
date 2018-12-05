package com.stepDefinations;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.driver.DriverInstance;
import com.pages.BoxEmailPage;
import com.pages.BoxPasswordPage;

import cucumber.api.DataTable;
import cucumber.api.Scenario;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CreateFolderSteps {

	DriverInstance instance = DriverInstance.getDriverInstance();
	WebDriver driver = instance.getDriver();
	WebDriverWait wait = instance.getWait();

	
	@When("^click on new button$")
	public void clickNewMenu() throws Throwable {
		wait.until(ExpectedConditions.attributeToBe(By.cssSelector("div[class=\"action-bar-create-buttons\"]"), "data-resin-feature", "createbuttons"));
	    WebElement newoption= wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("a[aria-owns=\"menu-newdropdown\"]")));
         newoption.click();
         System.out.println("Demo-Nipun");
	}

	@And("^click on new folder link$")
	public void clickCreateFolderMenu() throws Throwable {
	    WebElement folder= wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button[data-resin-target=\"newfolder\"]")));
	    folder.click();
		
	}

	@Then("^Create folder pop up should get open$")
	public void verifyFolderPopUp() throws Throwable {
	  WebElement Titles= wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("h2[title=\"Create a New Folder\"]")));
	  if(Titles.isDisplayed())	
	  {
		  System.out.println("Title is correct:-Create a New Folder");
	  }
	}

	@Then("^enter folder name given below:$")
	public void enterFolderName(DataTable data) {
	  WebElement foldername= wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("input[placeholder=\"My New Folder\"]")));
	  List<String> appendingNames = data.asList(String.class);
	  
	  for(Object sample:appendingNames) {
		  foldername.sendKeys(sample.toString());  
	  }
	  
	  
		
	}

	@Then("^click on create folder button$")
	public void createFolderBtn() throws Throwable {
	   WebElement create= wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("button[data-resin-target=\"createfolder\"]")));
	   create.click();
	}

	@When("^select the newly created ?(|folder) row$")
	public void selectFolderRow(String folder) throws Throwable {
		System.out.println("val is  "+folder);
		
		WebElement selectElement;
		if(!folder.equals("")){
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='file-list-item-wrapper' and @role='row' and .//a[contains(text(),'Dcfolder')]]/span[contains(text(),'Files')]")));
			selectElement = new WebDriverWait(driver,60).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='file-list-item-wrapper' and @role='row' and .//a[contains(text(),'Dcfolder')]]")));
		}else
			selectElement= new WebDriverWait(driver,60).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='file-list-item-wrapper' and @role='row' and .//a[contains(text(),'java basics.txt')]]")));
		
		
		selectElement.click();
		
	}

	@And("^click on Trash link$")
	public void clickTrash() throws Throwable {
		WebElement Trash=wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button[class=\"btn delete-btn delete-svg\"]")));
		Trash.click(); 
	}

	@Then("^confirm popup should get displayed$")
	public void verifyFolderPopup() throws Throwable {
	WebElement popup= wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("p[class=\"mbn\"]")));
	if(popup.isDisplayed())
	{
		System.out.println("Popup is displayed");
	}
	}

	@Then("^click on ok button$")
	public void confirmOk() throws Throwable {
		WebElement okay= wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button[class=\"btn btn-primary popup-confirm-btn\"]")));
		okay.click();
		System.out.println("Folder Deleted Successfully");
	}


}
