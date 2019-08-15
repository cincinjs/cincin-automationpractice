package com.automationpractice.test.pages;

import com.automationpractice.test.Utils.BaseUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePg extends BaseUtils {
    public HomePg(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.CSS, using = "[title='Contact Us']")
    public WebElement btnContactUs;

    @FindBy(how = How.CSS, using = ".header_user_info [rel]")
    public WebElement btnSignIn;

    @FindBy(how = How.ID, using = "search_query_top")
    public WebElement txtKeyword;

    @FindBy(how = How.NAME, using = "submit_search")
    public WebElement btnSubmitSearch;

    @FindBy(how = How.CSS, using = "[title='View my shopping cart']")
    public WebElement btnCart;

    @FindBy(how = How.LINK_TEXT, using = "WOMEN")
    public WebElement lblCatagoryWoman;

    @FindBy(how = How.CSS, using = "#block_top_menu > ul:nth-child(2) > li:nth-of-type(2) .sf-with-ul")
    public WebElement lblCatagoryDresses;

    @FindBy(how = How.LINK_TEXT, using = "T-SHIRTS")
    public WebElement lblCatagoryTShirts;


    public void clickBtnContactUs() {
        waitElementVisible(btnContactUs);
        btnContactUs.click();
    }

    public void clickBtnSignIn() {
        waitElementVisible(btnContactUs);
        btnSignIn.click();
    }

    public void inputKeyword(String keyword) {
        waitElementVisible(txtKeyword);
        txtKeyword.sendKeys(keyword);
    }

    public void clickBtnSubmitSearch() {
        waitElementVisible(btnSubmitSearch);
        btnSubmitSearch.click();
    }

    public void clickBtnCart(){
        waitElementVisible(btnCart);
        btnCart.click();
    }

    public void clickCategoryWoman(){
        waitElementVisible(lblCatagoryWoman);
        lblCatagoryWoman.click();
    }

    public void clickCategoryDresses(){
        waitElementVisible(lblCatagoryDresses);
        lblCatagoryDresses.click();
    }

    public void clickCategoryTShirts(){
        waitElementVisible(lblCatagoryTShirts);
        lblCatagoryTShirts.click();
    }


}