package com.Wipro.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import utility.Helper;


public class LocatorsAssignment {
	WebDriver driver;
	
	@Test
	public void testLocators() {
	
	
	driver = Helper.startBrowser("chrome");
	
	// Open "https://demo.opencart.com/index.php	
	driver.navigate().to("https://demo.opencart.com/index.php?route=account/register");
	
	
	// get page title and print it on the console
	String title = driver.getTitle();
	System.out.println(title);
	
	//enter firstname in the textbox
	driver.findElement(By.id("input-firstname")).sendKeys("ambadas");
	
	// enter lastname in the textbox
	driver.findElement(By.name("lastname")).sendKeys("test");
	
	// enter email in the textbox
	driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys("asnmb@ahg.cfr");
	
	// enter password in the textbox
	driver.findElement(By.name("password")).sendKeys("testdemo");
	
	// click on the continue button
	driver.findElement(By.xpath("//*[@id=\"form-register\"]/div/div/button"));
	
	
	// get page title and print it on the console
		String pagetitle = driver.getTitle();
		System.out.println(pagetitle);
		
	// validate warning message of privacy policy
		WebElement elem = driver.findElement(By.xpath("//*[@id=\"form-register\"]/div/div/div/label"));
	
	//driver.close();
	
	// close the browser
	//Helper.closeBrowser(driver);
	
	}

}
