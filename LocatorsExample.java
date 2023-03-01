package com.bd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class LocatorsExample extends BaseDriver {

	@Test(priority = 0)
	public void testLocators() throws InterruptedException {
		driver.get(yahoo);
		driver.manage().window().maximize();

	}

	@Test(priority = 1)
	private void testLocator() throws InterruptedException {
		// Id
		WebElement id = driver.findElement(By.id("login-username"));
		id.sendKeys("test@yahoo.com");
		Thread.sleep(3000);
		id.clear();
		Thread.sleep(2000);

		// Name
		WebElement name = driver.findElement(By.name("username"));
		name.sendKeys("test1@yahoo.com");
		Thread.sleep(3000);
		name.clear();
		Thread.sleep(2000);

//		// ClassName
//		WebElement className = driver.findElement(By.className("phone-no"));
//		className.sendKeys("test2@yahoo.com");
//		Thread.sleep(3000);

		// Css ID #value // Class.value
		WebElement cssId = driver.findElement(By.cssSelector("#login-username"));
		cssId.sendKeys("test3@yahoo.com");
		Thread.sleep(3000);

//		WebElement linkText = driver.findElement(By.linkText("Forgot username?"));
//		linkText.click();
//		Thread.sleep(3000);

		// Xpath = //tagName[@attributeName = 'value']

	}

}
