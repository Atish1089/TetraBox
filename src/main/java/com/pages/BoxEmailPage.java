package com.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.controls.WebControls;

public class BoxEmailPage {
	WebDriver driver;
	WebDriverWait wait;
	By emailTextFieldBy;
	By nextButtonBy;
	By pHeaderBy;
	
	public BoxEmailPage(WebDriver driver){
		this.driver = driver;
		wait = new WebDriverWait(driver, 30);
		emailTextFieldBy = By.cssSelector("input[name=\"login\"]");
		nextButtonBy = By.cssSelector("button[type=\"submit\"]");
		pHeaderBy = By.cssSelector("#mod-prompt-login-1>h1");
				
	}
	
	public void enterEmail(String name){
		WebControls emailControl = new WebControls(driver, emailTextFieldBy);
//		boolean elementFlag = emailControl.waitAndFindElement();
//		if(elementFlag)
//			emailControl.getWebElement().sendKeys(name);
		
		emailControl.typeKeys(name);
//		wait.until(ExpectedConditions.presenceOfElementLocated(emailTextFieldBy)).sendKeys(name);
	}
	
	public void clickNext(){
		WebControls obj1 = new WebControls(driver, nextButtonBy);
        obj1.click();
	}
	
	public boolean pageVerify(String title){
		WebControls obj = new WebControls(driver);
		return obj.titleVerify(title);
	}

}
