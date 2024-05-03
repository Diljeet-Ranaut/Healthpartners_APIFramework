package com.health.UI.test;

import com.health.UI.Object.CommonMethod;
import com.health.UI.Object.HomePage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class HomeTests extends CommonMethod {

    static WebDriver driver;
    static HomePage homePage;

    @BeforeTest
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://selectorshub.com/xpath-practice-page/");
    }

    @Test
    public static void clickOnProduct() throws InterruptedException {
        homePage = new HomePage(driver);

        homePage.clickOnProduct();
        homePage.itemClick();

    }

    @Test
    public static void verifyTitle() throws InterruptedException {
        homePage = new HomePage(driver);
        homePage.getTitle();
    }

    @AfterTest
    public void closeBrowser() {
        driver.close();
    }
}
