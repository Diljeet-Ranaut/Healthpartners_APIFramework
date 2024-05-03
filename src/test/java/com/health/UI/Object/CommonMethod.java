package com.health.UI.Object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class CommonMethod {

    Actions action;

    public void mouseHover(WebDriver driver, WebElement element) throws InterruptedException {
        action = new Actions(driver);
        try {
            waitFiveSec();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        action.moveToElement(element).perform();
        waitFiveSec();
    }

    public void elementClick(WebDriver driver, WebElement element) throws InterruptedException {
        waitFiveSec();
        element.click();

    }

    public String verifyTitle(WebDriver driver){
       return driver.getTitle();
    }


    public void waitFiveSec() throws InterruptedException {
        Thread.sleep(5000);
    }

    public void waitTenSec() throws InterruptedException {
        Thread.sleep(10000);
    }
}
