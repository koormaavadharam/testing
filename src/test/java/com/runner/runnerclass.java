package com.runner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.base.baseclass;

public class runnerclass extends baseclass {
	


	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\R Vishal\\eclipse-workspace\\Selenium\\driver1\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demoqa.com/alerts");

		WebElement alert = driver.findElement(By.id("alertButton"));
		

		
		click(alert);
	}
;
}
