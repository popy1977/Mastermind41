package com.stepdefinition;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.common.Base;
import com.pageobjectmodel.SearchPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Searchfield extends Base {
	
	SearchPage sp;
	 
	@Given("user on home page")
	public void user_on_home_page() {
		
		getDriver();
		sp=PageFactory.initElements(driver, SearchPage.class);
		
	   
	}



	@When("user enter text in search field")
	public void user_enter_text_in_search_field() {
		//driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		  
	   sp.getsearchField();
	   
	}

	@When("user click search button")
	public void user_click_search_button() {
	  
sp.getsearchButton();

	   
	}

	@Then("user on expected search page")
	public void user_on_expected_search_page() {
		//System.out.println(driver.getTitle());
		
		Assert.assertEquals(driver.getTitle(), "");
	  
	   
	}



}
