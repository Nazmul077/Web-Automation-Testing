package com.bd.Exam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropDown extends DriverSetup {

	@Test(priority = 0)
	public void openUrl() throws InterruptedException {
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}

	@Test(priority = 1)
	public void DropDownpractice() throws InterruptedException {
		WebElement country = driver.findElement(By.xpath("//body/div[1]/div[4]/div[2]/div[1]/select[1]"));

		Select select = new Select(country);

		select.selectByIndex(1);
		Thread.sleep(3000);

	}

}