package com.stepDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.driver.DriverInstance;

import cucumber.api.DataTable;
import cucumber.api.java.en.Then;

public class UploadSteps {
	
	WebDriver driver;
	WebDriverWait wait;
	
	@Then("^click on foldername hyperlink$")
	public void click_on_foldername_hyperlink() {
		DriverInstance instance = DriverInstance.getDriverInstance();
		driver = instance.getDriver();
		wait = instance.getWait();
		WebElement serious= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[contains(text(),'serious123')]")));
	    serious.click();
	}

	@Then("^click on upload button$")
	public void click_on_upload_button()  {
	
	    WebElement upload= wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("li[class=\"upload-file-handler-target\"] input[class=\"upload-handler-picker\"][type=\"file\"]")));
	    upload.sendKeys("C:\\Dumps\\java basics.txt");
	    Boolean uploaded=wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("div[class=\"uploads-manager is-inactive\" ]")));
	    if(uploaded==true)
	    {
	    	System.out.println("Loading has started");
	    	
	    }
	    Boolean uploading =wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("div[class=\"uploads-manager is-uploading\"]")));
	    if(uploading)
	    {
	    	System.out.println("file is uploaded");
	    }
	    Boolean uploadedd=wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("div[class=\"uploads-manager is-inactive\" ]")));
	    if(uploadedd)
	    {
	    	System.out.println("Loading completed");
	    	
	    }
	    
	}

	@Then("^Check the confirmation (message|popup) displayed$")
	public void confirmation_message_displayed(String type) throws InterruptedException  {
		System.out.println(type);
	    boolean confirmmsg= wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("span[contains(text(),'item was uploaded successfully')]")));
	    if(confirmmsg)
	    {
	    	System.out.println("confirmation message get displayed");
	    }
	    Thread.sleep(9000);
	}

}
