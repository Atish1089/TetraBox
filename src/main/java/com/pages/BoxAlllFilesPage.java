package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BoxAlllFilesPage {
	
	WebDriver driver;
	WebDriverWait wait;
	By clickNewMenuBy;
	By clickCreateFolderMenuBy;
	By verifyFolderPopUpBy;
	By enterFolderNameBy;
	By createFolderBtnBy;
	
	public BoxAlllFilesPage(WebDriver driver){
		this.driver = driver;
		wait = new WebDriverWait(driver, 30);
		clickNewMenuBy = By.cssSelector("input[name=\"password\"]");
		clickCreateFolderMenuBy = By.cssSelector("button[type=\"submit\"]");
		verifyFolderPopUpBy = By.cssSelector("button[type=\"submit\"]");
		enterFolderNameBy = By.cssSelector("button[type=\"submit\"]");
		createFolderBtnBy = By.cssSelector("button[type=\"submit\"]");
				
	}
	

}
