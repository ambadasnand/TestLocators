package com.Wipro.Locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.Helper;

public class TagNameDemo1 {
	
	public static void main (String[] args) {
		
		WebDriver  driver = Helper.startBrowser("GC");
		driver.get("https://naukri.com/");
		driver.manage().window().maximize();
		
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		System.out.println("Total Links on this Page are: " + allLinks.size());
		
		for (WebElement ele : allLinks) {
			
			System.out.println(ele.getText());
			System.out.println(ele.getAttribute("href"));
			
		}
		
		List<WebElement> allImages = driver.findElements(By.tagName("img"));
		System.out.println("Total Images on this Page are: " + allImages.size());
		
        for (WebElement ele : allImages) {
			
			System.out.println(ele.getAttribute("src"));
			
		}
		
	}
	

}
