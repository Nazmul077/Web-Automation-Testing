package com.bd.Exam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class CheckBox extends DriverSetup {

	@Test(priority = 0)
	public void openUrl() throws InterruptedException {
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}

	@Test(priority = 1)
	public void DropDownpractice() throws InterruptedException {
		// for Female
		WebElement genderFemale = driver.findElement(By.xpath("//input[@id='female']"));
		genderFemale.click();
		Thread.sleep(2000);

		// for Male
		WebElement genderMale = driver.findElement(By.xpath("//input[@id='male']"));
		genderMale.click();
		Thread.sleep(2000);

		WebElement Tuesday = driver.findElement(By.xpath("//input[@id='tuesday']"));
		Tuesday.click();
		Thread.sleep(2000);

		WebElement Friday = driver.findElement(By.xpath("//input[@id='friday']"));
		Friday.click();
		Thread.sleep(3000);

	}

}
