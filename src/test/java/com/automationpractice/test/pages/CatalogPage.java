package com.automationpractice.test.pages;

import com.automationpractice.test.Utils.BaseUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class CatalogPage extends BaseUtils {
    public CatalogPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.CSS, using = "#subcategories li:nth-of-type(1) [width]")
    public WebElement lblSubcategoriesTops;

    @FindBy(how = How.CSS, using = "#subcategories li:nth-of-type(2) [width]")
    public WebElement lblSubcategoriesDresses;

    @FindBy(how = How.CSS, using = "#selectProductSort")
    public WebElement ddlSelectProductSort;

    @FindBy(how = How.CSS, using = "[value='price\\:desc']")
    public WebElement ddlSortHighestFirst;

    @FindBy(how = How.CSS, using = "[value='price\\:asc']")
    public WebElement ddlSortLowestFirst;

    @FindBy(how = How.CSS, using = ".icon-th-list")
    public WebElement btnChangeViewToList;

    @FindBy(how = How.CSS, using = ".product_list p:nth-child(1)")
    public WebElement imgSortLoading;

    @FindBy(how = How.CSS, using = "[class='ajax_block_product col-xs-12 col-sm-6 col-md-4 first-in-line first-item-of-tablet-line first-item-of-mobile-line']")
    public WebElement lblFirstProductGrid;

    @FindBy(how = How.CSS, using = "[class='ajax_block_product first-in-line first-item-of-tablet-line first-item-of-mobile-line col-xs-12'] .product-container")
    public WebElement lblFirstProductList;




    public void clickSelectProductSort(){
        waitElementVisible(ddlSelectProductSort);
        ddlSelectProductSort.click();
    }
    public void clickSortHighestFirst() {
        waitElementVisible(ddlSortHighestFirst);
        ddlSortHighestFirst.click();
    }

    public void clickSortLowestFirst() {
        waitElementVisible(ddlSortLowestFirst);
        ddlSortLowestFirst.click();
    }

    public void verifySortResult() {
        waitElementVisible(imgSortLoading);
        //waitElementNotVisible(imgSortLoading);

        boolean LoadingAnimationExist = imgSortLoading.isDisplayed();
        boolean FirstProductExist = lblFirstProductGrid.isDisplayed();
        Assert.assertEquals(FirstProductExist, true);
        Assert.assertEquals(LoadingAnimationExist, false);
    }

    public void clickChangeViewToList(){
        waitElementVisible(btnChangeViewToList);
        btnChangeViewToList.click();
    }

    public void verifyViewIsChangedToList(){
        waitElementVisible(lblFirstProductList);
        boolean ProductListExist = lblFirstProductList.isDisplayed();
        Assert.assertEquals(ProductListExist, true);
    }

}


