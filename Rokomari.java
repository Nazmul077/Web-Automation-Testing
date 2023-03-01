package com.bd.Rokomari;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class SignIn extends BaseDriver {

	static String rokomari = "https://www.rokomari.com/book";

	@Test(priority = 0)
	public void openUrl() throws InterruptedException {

		driver.get(rokomari);
		driver.manage().window().maximize();
		Thread.sleep(1000);
	}

	@Test(priority = 1)
	public void Login() throws InterruptedException {

		WebElement signIn = driver.findElement(By.xpath("//a[contains(text(),'Sign in')]"));
		signIn.click();
		Thread.sleep(1000);
		WebElement email = driver.findElement(By.xpath("//input[@id='j_username']"));
		email.sendKeys("nazmulbubt77@gmail.com");
		Thread.sleep(2000);
		WebElement password = driver.findElement(By.xpath("//input[@id='j_password']"));
		password.sendKeys("Nazmul01682844431");
		Thread.sleep(1000);
		WebElement button = driver.findElement(By.xpath("//button[contains(text(),'Sign In')]"));
		button.submit();
		Thread.sleep(2000);

	}

	@Test(priority = 2)
	public void hover() throws InterruptedException {

		Actions action = new Actions(driver);

		WebElement লেখক = driver.findElement(By.xpath("//a[@id='js--authors']"));

		action.moveToElement(লেখক).perform();
		Thread.sleep(2000);

		WebElement হুমায়ূনআহমেদ = driver.findElement(By.xpath("//a[contains(text(),'হুমায়ূন আহমেদ')]"));
		হুমায়ূনআহমেদ.click();
		Thread.sleep(3000);

//		WebElement সমকালীনউপন্যাস = driver.findElement(By.xpath("//label[contains(text(),'সমকালীন উপন্যাস')]"));
//		সমকালীনউপন্যাস.click();
//		Thread.sleep(3000);
//
//		WebElement রচনাসংকলনওসমগ্র = driver.findElement(By.xpath("//label[contains(text(),'রচনা সংকলন ও সমগ্র')]"));
//		রচনাসংকলনওসমগ্র.click();
//		Thread.sleep(3000);

	}

	@Test(priority = 3)
	public void ScrollUsingJS() throws InterruptedException {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,6000);");
		Thread.sleep(2000);
	}

	@Test(priority = 4)

	public void nextbutton() throws InterruptedException {

		WebElement next = driver.findElement(By.xpath("//a[contains(text(),'Next')]"));
		next.click();
		Thread.sleep(2000);

	}

	@Test(priority = 5)
	public void Scroll() throws InterruptedException {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,300);");
		Thread.sleep(2000);
	}

	@Test(priority = 6)

	public void অন্যভুবন() throws InterruptedException {

		WebElement অন্যভুবন = driver.findElement(By.xpath("//p[contains(text(),'অন্যভুবন')]"));
		অন্যভুবন.click();
		Thread.sleep(5000);

	}

}
