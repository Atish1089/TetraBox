package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.controls.WebControls;

public class BoxPasswordPage {
	WebDriver driver;
	WebDriverWait wait;
	By passwordTextFieldBy;
	By loginButtonBy;
	By errorMessageBy;
	// By pHeaderBy;

	public BoxPasswordPage(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(driver, 30);
		passwordTextFieldBy = By.cssSelector("input[name=\"password\"]");
		loginButtonBy = By.cssSelector("button[type=\"submit\"]");
		errorMessageBy = By.cssSelector("div.form-error");
		// pHeaderBy = By.cssSelector("#mod-prompt-login-1>h1");

	}

	public void enterPassword(String name) {

		WebControls emailControl = new WebControls(driver, passwordTextFieldBy);
		emailControl.typeKeys(name);
	}

	public void clickNext() {
		WebControls obj1 = new WebControls(driver, loginButtonBy);
		obj1.click();
	}

	public String getErrorMessage() {
		return wait.until(ExpectedConditions.presenceOfElementLocated(errorMessageBy)).getText();
	}

}
