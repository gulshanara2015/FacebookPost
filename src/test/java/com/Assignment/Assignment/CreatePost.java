package com.Assignment.Assignment;

import org.testng.annotations.Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;


public class CreatePost {

	@Test
	public void CreatePosting() throws InterruptedException {
		// TODO Auto-generated constructor stub
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");

		System.setProperty("webdriver.chrome.driver","/Users/gulshannadaph/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");

		
		ForLogin login1 = new ForLogin(driver);
		login1.email().sendKeys("itsgulshannadaph2019@gmail.com");
		login1.password().sendKeys("Test@123");
		login1.ClickOnLogin().click();

//		Actions action = new Actions(driver);
//		action.sendKeys(Keys.ESCAPE).build().perform();

		ForPostingStatus status1 = new ForPostingStatus(driver);
		Thread.sleep(1000);

		status1.ClickPost().click();
		Thread.sleep(5000);
		
		
		status1.WritePost().click();
		Thread.sleep(2000);
		
		status1.PublishPost().click();
		
		//Thread.sleep(3000);
		//status1.WritePost().sendKeys("Hello World!");
//driver.findElement(By.xpath(" //span[@class='_5qtp']")).click();
//driver.findElement(By.xpath("//div[@aria-label='Write something here...']/div/div/div/span/br")).sendKeys("abc");
	//	JavascriptExecutor js = (JavascriptExecutor)driver;
	//	WebElement write = driver.findElement(By.xpath("//div[@class='_1mf _1mj']/span/br")); 
		//WebElement write = driver.findElement(By.xpath("div[@class='_1mwp navigationFocus _395 _1mwq _4c_p _5bu_ _3t-3 _34nd _21mu _5yk1']"));
		//div[@class='_1mwp navigationFocus _395 _1mwq _4c_p _5bu_ _3t-3 _34nd _21mu _5yk1']
		//div[@class='_1mwp navigationFocus _395 _1mwq _4c_p _5bu_ _3t-3 _34nd _21mu _5yk1']    
    
	
		//write.click();
		//Thread.sleep(2000);
		//write.sendKeys("Test");
		//js.executeScript("arguments[0].value='abc';", write);
		//driver.findElement(By.xpath("//input[substring(@data-offset-key, string-length(@data-offset-key) - string-length('-0-0') +1) = '-0-0']"));
//
//String js = "arguments[0].setAttribute('value','ABC')";
			//((JavascriptExecutor) driver).executeScript(js, write);
		
	//new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(write)).sendKeys("anc");


	}
	

}
