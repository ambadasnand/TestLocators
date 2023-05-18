package com.Wipro.Locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.Helper;

public class CaseStudyAgeCalculator {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver  driver = Helper.startBrowser("GC");
		//driver.get("https://www.easycalculation.com/index.php");
		driver.get("https://www.easycalculation.com/date-day/age-calculator.php");
		driver.manage().window().maximize();
		//driver.findElement(By.linkText("Age Calculator")).click();
		
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		System.out.println("Total Links on this Page are: " + allLinks.size());
		
		
		for (int i=0; i<5; i++) {
			
			System.out.println(allLinks.get(i).getText());
			System.out.println(allLinks.get(i).getAttribute("href"));
			
			
		}
		
		
		
		List<WebElement> allImages = driver.findElements(By.tagName("img"));
		System.out.println("Total Images on this Page are: " + allImages.size());
		
        for (int i=0; i<5; i++) {
			
			System.out.println(allImages.get(i).getAttribute("src"));
			
		}
        
        Thread.sleep(2000);
        driver.navigate().refresh();
        
     
        	
        driver.findElement(By.xpath("//*[@id=\"i21\"]")).sendKeys("26");
        driver.findElement(By.id("i22")).sendKeys("12");
        driver.findElement(By.id("i23")).sendKeys("1993");
        driver.findElement(By.name("but")).click();
        
        
        Thread.sleep(4000);
        
        WebElement elem1 = driver.findElement(By.id("r1"));
        String age = elem1.getAttribute("value");
        
        WebElement elem2 = driver.findElement(By.id("r4"));
        String days = elem2.getAttribute("value");
        
        WebElement elem3 = driver.findElement(By.id("r3"));
        String hours = elem3.getAttribute("value");
        
        WebElement elem4 = driver.findElement(By.id("r2"));
        String minutes = elem4.getAttribute("value");
        
        System.out.println("Your Age is: " + age);
        System.out.println("Your Age in Days: " + days);
        System.out.println("Your Age in Hours: " + hours);
        System.out.println("Your Age in Minutes: " + minutes);
        
        
        driver.findElement(By.xpath("//*[@id=\"dispCalcConts\"]/div[3]/form/table/tbody/tr[10]/td/input[2]"));
        
        
        

	}

}
