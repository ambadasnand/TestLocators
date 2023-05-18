package com.Wipro.Locators;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import utility.Helper;

public class LocatorsAssignment2 {
	
	WebDriver  driver;
	int total = 0;
	
	@Test
	public void LocatorsAssignment() throws InterruptedException {
	
	driver = Helper.startBrowser("GC");
	driver.navigate().to("https://www.easemytrip.com/flights.html");
	
	String parent=driver.getWindowHandle();
	
	System.out.println(parent);
	
	driver.manage().window().maximize();
	
	driver.findElement(By.linkText("Holidays")).click();
	
	Set<String>s=driver.getWindowHandles();

	
	Iterator<String> I1 = s.iterator();
    
	I1.next();
	
	String childwindow1 = I1.next();
	
	System.out.println(childwindow1);
	
	
	
	driver.switchTo().window(childwindow1);
	
	String Title1 = driver.getTitle();
	System.out.println("Title of the Holidays Page is: "+ Title1);
	
	
	WebElement elem1 = driver.findElement(By.xpath("//h1[contains(text(),'Turn Your Dream Holiday Into A Reality')]"));
	String msg1 = elem1.getText();
	System.out.println("Message on Holidays Page is: " +msg1);
	if (msg1.equals("Turn Your Dream Holiday Into A Reality")) {
		
		System.out.println("Message on Holidays page is correct");
	
	}
	else
	{
		System.out.println("Message on Holidays page is Incorrect");
	}
	
	driver.findElement(By.linkText("HOTELS")).click();
	
	//I1.next();
	//String childwindow2 = I1.next();
	
	//driver.switchTo().window(childwindow2);
	String Title2 = driver.getTitle();
	System.out.println("Title of the Hotels Page is: "+ Title2);
	
	WebElement elem2 = driver.findElement(By.xpath("//body/div[3]/div[1]/h1[1]"));
	String msg2 = elem2.getText();
	System.out.println("Message on Hotels Page is: " +msg2);
	if (msg2.equals("Same hotel, Cheapest price. Guaranteed!")) {
		
		System.out.println("Message on Hotels page is correct");
	
	}
	else
	{
		System.out.println("Message on Hotels page is Incorrect");
	}
	
	}

}
