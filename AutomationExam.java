package com.bd.Exam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class AutomationExam extends DriverSetup {

	@Test(priority = 0)
	public void openUrl() throws InterruptedException {
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}

	@Test(priority = 1)
	public void idLocators() throws InterruptedException {
		WebElement name = driver.findElement(By.id("name"));
		name.sendKeys("Md Nazmul Rahman");
		Thread.sleep(2000);

		WebElement mobile = driver.findElement(By.id("phone"));
		mobile.sendKeys("01728362078");
		Thread.sleep(2000);

		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("nazmulshojol@gmail.com");
		Thread.sleep(2000);

		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("123456789");
		Thread.sleep(2000);

		WebElement address = driver.findElement(By.id("address"));
		address.sendKeys("Mirpur Dhaka Bangladesh");
		Thread.sleep(2000);

		WebElement submit = driver.findElement(By.name("submit"));
		submit.click();
		Thread.sleep(3000);

	}
}
