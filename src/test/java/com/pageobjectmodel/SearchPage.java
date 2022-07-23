package com.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {
	
	public WebDriver driver; //instance variable
	
	public SearchPage(WebDriver driver) {
		
		this.driver=driver; //'this' is a key word for constructor
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//input[@id='twotabsearchtextbox")
	public WebElement searchField;
	public void getsearchField() {
		searchField.sendKeys("Qa testing");
	}
	
	@FindBy(xpath="")
	public WebElement searchButton;
	public void getsearchButton() {
		searchField.click();
		
	}

}
