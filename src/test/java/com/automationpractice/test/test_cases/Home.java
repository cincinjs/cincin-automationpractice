package com.automationpractice.test.test_cases;

import com.automationpractice.test.configs.DriverBase;
import com.automationpractice.test.pages.HomePg;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Home extends DriverBase{

    @BeforeMethod
    public void init() {
        WebDriver driver = DriverBase.getDriver();
        driver.get("http://automationpractice.com");
        driver.manage().window().maximize();
    }

    @Test
    public void Test1() {
        test = extent.createTest("Test1");
        test.log(Status.INFO,"TEST START");
        HomePg homePg = new HomePg(getDriver());
        homePg.inputKeyword("Shirt");
//        homePg.clickBtnSubmitSearch();
        String keywd = homePg.txtKeyword.getText().toString();
        Assert.assertEquals(keywd,"Shirt");
    }
}
