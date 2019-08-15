package com.automationpractice.test.test_cases;

import com.automationpractice.test.configs.DriverBase;
import com.automationpractice.test.pages.CatalogPage;
import com.automationpractice.test.pages.HomePg;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Catalog extends DriverBase {

    @BeforeMethod
    public void init() {
        WebDriver driver = DriverBase.getDriver();
        driver.manage().window().maximize();
        driver.get("http://automationpractice.com");
    }

    @Test
    public void SortHighestFirst() {
        HomePg homePg = new HomePg(getDriver());
        CatalogPage catalogPage = new CatalogPage(getDriver());
        test = extent.createTest("Sort Product by Highest First");
        test.log(Status.INFO, "TEST START");

        homePg.clickCategoryWoman();
        catalogPage.ddlSelectProductSort.click();
        catalogPage.ddlSortHighestFirst.click();
        catalogPage.verifySortResult();
    }

    @Test
    public void changeViewToList() {
        HomePg homePg = new HomePg(getDriver());
        CatalogPage catalogPage = new CatalogPage(getDriver());
        test = extent.createTest("Change product view to list view");
        test.log(Status.INFO,"TEST START");

        homePg.clickCategoryWoman();
        catalogPage.clickChangeViewToList();
        catalogPage.verifyViewIsChangedToList();

    }
}
