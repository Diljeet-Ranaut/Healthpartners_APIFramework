package com.health.UI.Object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class HomePage extends CommonMethod {
    WebDriver driver;

    @FindBy(xpath = "//a[@class=\"hfe-menu-item\" and contains(text(),\"Products\") ]")
    WebElement ProductHoverClick;
    @FindBy(xpath = "//a[@class='hfe-sub-menu-item' and contains(text(),'SelectorsHub Pro')]/parent::li[@id=\"menu-item-6293\"]")
    WebElement itemClick;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

    public void clickOnProduct() throws InterruptedException {
        mouseHover(driver, ProductHoverClick);
    }

    public void itemClick() throws InterruptedException {
        elementClick(driver, itemClick);
    }

    public void getTitle() {
        String title = verifyTitle(driver);
        Assert.assertEquals(title, "The Next Gen XPath and Css Selectors IDE - SelectorsHub Pro");

    }
}
