package com.bd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class HoverHandle extends BaseDriver {

	@Test(priority = 0)
	public void startWebSite() {
		driver.get("https://www.daraz.com.bd/");
		driver.manage().window().maximize();
	}

	@Test(priority = 1)
	public void hoverTest() throws InterruptedException {

		Actions action = new Actions(driver);

		WebElement electronic = driver.findElement(By.xpath("//span[contains(text(),'Electronic Devices')]"));
		WebElement latest = driver.findElement(By.xpath("//span[contains(text(),'Latest Mobile Accessories')]"));

		action.moveToElement(electronic).perform();
		Thread.sleep(3000);

		action.moveToElement(latest).perform();
		Thread.sleep(3000);
		WebElement cable = driver.findElement(By.xpath("//span[contains(text(),'Cable & Converter')]"));
		cable.click();
		Thread.sleep(3000);

		WebElement catagories = driver.findElement(By.xpath("//span[contains(text(),'Categories')]"));
		WebElement automotive = driver.findElement(By.xpath("//span[contains(text(),'Automotive & Motorbike')]"));
		WebElement automobile = driver.findElement(By.xpath("//span[contains(text(),'Automobile')]"));

		action.moveToElement(catagories).perform();
		Thread.sleep(3000);

		action.moveToElement(automotive).perform();
		Thread.sleep(3000);

		action.moveToElement(automobile).perform();
		Thread.sleep(3000);
		WebElement cars = driver.findElement(By.xpath("//span[contains(text(),'Imported Cars')]"));
		cars.click();
		Thread.sleep(5000);

	}

}
