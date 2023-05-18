package com.Wipro.Locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import utility.Helper;

public class FindElementsByLinks {
	
	WebDriver  driver;
	int total = 0;
	
	@Test
	public void LinksLocator() {
		
		driver = Helper.startBrowser("GC");
		driver.navigate().to("https://www.easycalculation.com/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Calculators")).click();
		
		List<WebElement> links = driver.findElements(By.xpath("//a"));
		int linkcount = links.size();
		total = total + linkcount;
		System.out.println("Number of Links: " + linkcount);
		
		for (int i = 1; i < links.size(); i++) {
			
			System.out.println(links.get(i).getText());
		}
		
	}

}
