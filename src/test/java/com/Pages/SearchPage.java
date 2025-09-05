package com.Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

import com.Baseclass.Library;
import com.ReusableFunctions.SeleniumReusable;

public class SearchPage extends Library {
    SeleniumReusable se;

    @FindBy(xpath = "/html/body/div/div[1]/div[3]/div/div/form/div/div/span/span/button")
    WebElement Popup;

    @FindBy(id = "twotabsearchtextbox")
    WebElement Searchtext;

    @FindBy(id = "nav-logo-sprites")
    WebElement logo;  // Use logo to verify homepage

    public SearchPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        se = new SeleniumReusable(driver);
    }

    public void handlepopup() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(Popup));
        se.click(Popup);
    }

    public void homescreen() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(logo));
        System.out.println(logo.isDisplayed());
    }

    public void Search(String Text) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(Searchtext));
        se.enterValue(Searchtext, Text);
    }

    public void ClickSearch() {
        Searchtext.sendKeys(Keys.ENTER);
    }
}