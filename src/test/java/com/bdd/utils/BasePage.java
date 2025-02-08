package com.bdd.utils;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage extends PageObject {

    public void waitAndClick(WebElement element) {
        WebDriverWait wait = new WebDriverWait(getDriver(), 10);
        wait.until(ExpectedConditions.elementToBeClickable(element)).click();
    }

    public void waitAndSendKeys(WebElement element, String text) {
        WebDriverWait wait = new WebDriverWait(getDriver(), 10);
        wait.until(ExpectedConditions.visibilityOf(element)).sendKeys(text);
    }

    public String waitAndGetText(WebElement element) {
        WebDriverWait wait = new WebDriverWait(getDriver(), 10);
        return wait.until(ExpectedConditions.visibilityOf(element)).getText();
    }
}
