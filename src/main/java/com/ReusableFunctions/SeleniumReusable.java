package com.ReusableFunctions;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SeleniumReusable {

    protected WebDriver driver;

    // Constructor
    public SeleniumReusable(WebDriver driver) {
        this.driver = driver;
    }

    // Enter value into input field
    public void enterValue(WebElement element, String text) {
        try {
            element.sendKeys(text);
        } catch (Exception e) {
            System.err.println("Failed to enter value in element: " + e.getMessage());
        }
    }

    // Click on element
    public void click(WebElement element) {
        try {
            element.click();
        } catch (Exception e) {
            System.err.println("Failed to click element: " + e.getMessage());
        }
    }

    // Get and print page title
    public String getTitle() {
        try {
            String title = driver.getTitle();
            System.out.println(title);
            return title;
        } catch (Exception e) {
            System.err.println("Couldn't get the title: " + e.getMessage());
            return null;
        }
    }

    // Take screenshot
    public void screenshot(String path) {
        try {
            TakesScreenshot ts = (TakesScreenshot) driver;
            File source = ts.getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(source, new File(path));
        } catch (IOException e) {
            System.err.println("Unable to save screenshot: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Screenshot failed: " + e.getMessage());
        }
    }
}