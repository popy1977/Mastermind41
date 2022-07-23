package com.common;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base { 
	
	public WebDriver driver;
	
public void getDriver() {
	//to setup browser
	WebDriverManager.chromedriver().setup();
	
	//we have to create a object of a class to access the method
	driver=new ChromeDriver();
	driver.get("http://www.amazon.com/");
	System.out.println(driver.getTitle());
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
}

}
