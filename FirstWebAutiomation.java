package com.bd;


import org.testng.annotations.Test;

public class FirstWebAutiomation extends BaseDriver {

	// static String baseUrl = "https://www.daraz.com.bd/";
	static String foodpanda = "https://www.foodpanda.com.bd/";

	@Test(priority = 0)
	public void openUrl() throws InterruptedException {
		// driver.get(baseUrl);
		driver.get(foodpanda);
		driver.manage().window().maximize();
		// Thread.sleep(5000); // 1000ms = 1s
	}

	@Test(priority = 1)
	public void login() throws InterruptedException {
		String title = driver.getTitle();
		System.out.println(title);
		String actual = "foodpanda: Food & Groceries delivery service in Bangladesh";
		if (title.equals(actual)) {
			System.out.println("Verified");
		}
//		WebElement LoginText = driver.findElement(By.xpath("//span[contains(text(),'Login')]"));
//		LoginText.click();
//		Thread.sleep(5000);
	}

}
