package com.controls;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import gherkin.formatter.Reporter;


public class WebControls {

	protected WebDriver webDriver;
	protected WebElement webElement;
	protected WebDriverWait wait;
	protected By by;
	Long maxWaitTimeToFindElement = 30L;
	
	public WebControls(WebDriver webDriver) {
		super();
		this.webDriver = webDriver;
		this.wait = new WebDriverWait(webDriver, maxWaitTimeToFindElement);
	}
	public WebControls(WebDriver webDriver, By by) {
		// TODO Auto-generated constructor stub
		this.webDriver = webDriver;
		this.wait = new WebDriverWait(webDriver, maxWaitTimeToFindElement);
		this.by = by;
	}
	
	public boolean waitAndFindElement() {
		String message = "Searching element " + by.toString()
				+ " for presence, will wait by " + maxWaitTimeToFindElement
				+ " seconds";
		System.out.println(message);
		//Reporter.log(message, true);
		boolean present = true;
		try {
//			System.out.println(webDriver.toString());
//			System.out.println(message);
			webElement = wait.until(ExpectedConditions.presenceOfElementLocated(by));
//			Reporter.log(by.toString() + " is present and available", true);
		} catch (Exception e) {
			present = false;
//			Reporter.log(by.toString() + " is not available", true);
//			takeScreenshot();
			e.printStackTrace();
			// throw new NoSuchElementException(e.getMessage());
		}
		
		return present;
	}
	
	public void typeKeys(String name){
		if(waitAndFindElement())
			webElement.sendKeys(name);
	}

	public WebElement getWebElement() {
		return webElement;
	}
	
	public boolean titleVerify(String title){
		 boolean flag = wait.until(ExpectedConditions.titleIs(title));
		return flag;
	}
	public void click() {
		if(waitAndFindElement())
			webElement.click();
		
	}


}
