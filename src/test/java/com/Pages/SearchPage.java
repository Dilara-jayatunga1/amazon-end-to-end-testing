package com.Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.FindBy;
import com.Baseclass.Library;
import com.ReusableFunctions.SeleniumReusable;

public class SearchPage extends Library{
	SeleniumReusable se;
	
	public SearchPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		  se = new SeleniumReusable(driver);
		
	}
	@FindBy(xpath= "/html/body/div/div[1]/div[3]/div/div/form/div/div/span/span/button")
	WebElement Popup;
	
	
	@FindBy(xpath="//*[@id=\"nav-bb-search\"]")
	WebElement Searchtext;
	
	@FindBy(xpath ="//html[@lang='en']")
	WebElement Homepage;
	
	
	public void Search(String Text)
	{
		 se = new SeleniumReusable(driver);
		 se.enterValue(Searchtext, Text);
	}
	
	public void ClickSearch()
	{
		Searchtext.sendKeys(Keys.ENTER);
	}
	
	public void homescreen() {
		System.out.println(Homepage.isDisplayed());
	}
	
	public void handlepopup() {
		se.click(Popup);
	}
	

}
