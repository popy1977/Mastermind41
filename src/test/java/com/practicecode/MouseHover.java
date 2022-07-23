package com.practicecode;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseHover {

	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		List<WebElement>list=driver.findElements(By.tagName("iframe")); // 'a' is use for html link
	    System.out.println(list.size());
		
		
		Actions action= new Actions(driver);
		
		WebElement a=driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
		WebElement b=driver.findElement(By.xpath("//span[contains(text(),'AmazonSmile Charity Lists')]"));
		
		//action.moveToElement(driver.findElement(By.xpath("//a[@id='nav-link-accountList']"))).moveToElement(driver.findElement(By.xpath("//span[contains(text(),'AmazonSmile Charity Lists')]"))).click().build().perform();
		
		action.moveToElement(a).moveToElement(b).click().build().perform();
		
		//how to use the keyboard by using action method
		//action.sendKeys(Keys.ENTER);
	}
}
