package com.Wipro.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import utility.Helper;

public class DemoID {
	
	WebDriver driver;
	
	@Test
	public void TestNameDemo() throws InterruptedException {
		
		//driver = Helper.startBrowser("Google Chrome");
		driver = Helper.startBrowser("Edge");
		driver.navigate().to("https://www.login.hiox.com/login?referrer=easycalculation.com");
		driver.findElement(By.id("log_email")).sendKeys("7620278186");
		driver.findElement(By.name("log_password")).sendKeys("Skbnath26#%");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"log_frm\"]/div[4]/input[1]")).click();
		driver.close();
		//Helper.closeBrowser(driver);
	}

}
