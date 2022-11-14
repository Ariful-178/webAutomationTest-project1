package testCasePakage;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import driverPackage.BaseDriver;

public class tc001 extends BaseDriver {

	String baseurl = "https://rahulshettyacademy.com/locatorspractice/";

	@Test
	private void locatorlearn() throws InterruptedException {

		driver.get(baseurl);
		driver.manage().window().maximize();
		Thread.sleep(2000);

		driver.findElement(By.id("inputUsername")).sendKeys("arif");

		driver.findElement(By.name("inputPassword")).sendKeys("islam");

		driver.findElement(By.className("signInBtn")).click();
		Thread.sleep(1000);

		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("newName");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@type='text'][2]")).sendKeys("newEmail");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@type='text'][3]")).sendKeys("0123654789");
		Thread.sleep(1000);

		driver.findElement(By.xpath("//button[@class='go-to-login-btn']")).click();
		Thread.sleep(1000);
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='reset-pwd-btn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='go-to-login-btn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("inputUsername")).sendKeys("rahulshettyacademy");

		driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");

		driver.findElement(By.className("signInBtn")).click();
		Thread.sleep(5000);

	}

}
