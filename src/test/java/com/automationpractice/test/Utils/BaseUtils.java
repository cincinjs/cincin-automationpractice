package com.automationpractice.test.Utils;

import com.automationpractice.test.configs.DriverBase;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseUtils {
    private int timeOut = 15;
    private int timeOutLong = 30;

    public static ExtentReports extent;
    public static ThreadLocal<ExtentTest> parentTest = new ThreadLocal<ExtentTest>();
    public static ThreadLocal<ExtentTest> test = new ThreadLocal<ExtentTest>();

    WebDriver driver = DriverBase.getDriver();

    public void waitElementVisible(WebElement element){
        WebDriverWait wait = new WebDriverWait(driver, timeOut);
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void waitElementVisibleLong(WebElement element){
        WebDriverWait wait = new WebDriverWait(driver, timeOutLong);
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void waitElementNotVisible(WebElement element){
        WebDriverWait wait = new WebDriverWait(driver, timeOut);
        wait.until(ExpectedConditions.invisibilityOf(element));
    }


}
