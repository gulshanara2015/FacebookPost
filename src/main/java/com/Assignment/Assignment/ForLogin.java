package com.Assignment.Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ForLogin {
	WebDriver driver;
	
	By emailField = By.xpath("//input[@id='email']");
	By password = By.xpath("//input[@id='pass']");
	By LoginButton = By.xpath("//label[@id='loginbutton']");
	

	public ForLogin(WebDriver driver) {
		this.driver=driver;
	}
	public WebElement email()
	{
		return driver.findElement(emailField);
		
	}

	public WebElement password()
	{
		return driver.findElement(password);
		
	}
	public WebElement ClickOnLogin()
	{
		return driver.findElement(LoginButton);
		
	}
	

}
