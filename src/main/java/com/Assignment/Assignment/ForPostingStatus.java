package com.Assignment.Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ForPostingStatus {

		WebDriver driver;
		By PostBox = By.xpath("//*[contains(@aria-label,'Create a post')]");
		By TextBox = By.xpath("//div[@class='_1mf _1mj']/span/br");
		By PostButton = By.xpath("//span[contains(text(),'Post')]");
		public ForPostingStatus(WebDriver driver)
	{
		
		this.driver=driver;
	}
	public WebElement ClickPost() {
		return driver.findElement(PostBox);
		
	}
	public WebElement WritePost() throws InterruptedException {
		
		Actions action = new Actions (driver);
	    action.moveToElement((WebElement) TextBox);
	    action.build().perform();
	    Thread.sleep(3000);
	    action.sendKeys("Test");
	    action.build().perform();
		return driver.findElement(TextBox);
		
	}
	public WebElement PublishPost(){

		return driver.findElement(PostButton);
	}
}
