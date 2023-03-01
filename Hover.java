package com.bd.Exam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Hover extends DriverSetup {

	@Test(priority = 0)
	public void startWebSite() {
		driver.get("https://www.daraz.com.bd/");
		driver.manage().window().maximize();
	}

	@Test(priority = 1)
	public void hoverTest() throws InterruptedException {

		Actions action = new Actions(driver);

		WebElement Motorbike = driver.findElement(By.xpath("//span[contains(text(),'Automotive & Motorbike')]"));
		WebElement Motorcycle = driver.findElement(By.xpath("//span[contains(text(),'Motorcycle Riding Gear')]"));
		WebElement Helmet = driver.findElement(By.xpath("//span[contains(text(),'Helmet')]"));

		action.moveToElement(Motorbike).perform();
		Thread.sleep(2000);

		action.moveToElement(Motorcycle).perform();
		Thread.sleep(2000);

		Helmet.click();
		Thread.sleep(3000);

	}

}
