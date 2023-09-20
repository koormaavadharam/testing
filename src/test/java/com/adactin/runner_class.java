package com.adactin;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.base.baseclass;

public class runner_class extends baseclass {

	public static void main(String[] args) throws IOException, InterruptedException {

		
        
		browser("chrome");
		
		urllaunch("https://adactinhotelapp.com/");

		maximize();

	    refresh();
	    
	

       WebElement username = driver.findElement(By.id("username"));

		inputelement(username, "rollinss");
		
	    Attribute(username);

		WebElement pass = driver.findElement(By.id("password"));

		inputelement(pass, "8J90DG");

		
		
		WebElement login = driver.findElement(By.xpath("//input[@type='Submit']"));
		


		click(login);
	   
		
		Thread.sleep(3000);
		
		WebElement location = driver.findElement(By.name("location"));
		
		dropdown(location, "index", "2");
		
		
		//Alert("simple");
//		
//		back();
		
		
		screenshot("adactin");
		
		//scrolling("down");
		
		Thread.sleep(2000);
		
		//scrolling("up");
		
		WebElement adactin = driver.findElement(By.linkText("Adactin.com"));
	 
	scrolling("down", null);

		//quit();
		
		
	}

}
