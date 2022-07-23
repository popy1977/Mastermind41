package com.practicecode;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;


public class dropDown {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
		Select se = new Select(driver.findElement(By.xpath("//select[@id='searchDropdownBox']")));
		se.selectByVisibleText("Amazon Fresh");
		
		//List<WebElement>list=driver.findElements(By.xpath(""));
		List<WebElement>list = se.getOptions();	
		
		System.out.println(list.size());
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i).getText());
			
		}
		
		
		

	}

}
