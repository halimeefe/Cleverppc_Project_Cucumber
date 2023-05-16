package Pages;

import Utilities.BaseDriver;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class Parent {

    WebDriverWait wait = new WebDriverWait(BaseDriver.getDriver(), Duration.ofSeconds(15));


    public void sendKeysFunction(WebElement element, String input) {
        waitUntilVisible(element);
        scroollToElement(element);
        element.clear();
        element.sendKeys(input);


    }

    public void clickFunction(WebElement element) {
        waitUntilClickable(element);
        scroollToElement(element);
        element.click();


    }

    public void verifyContainsTextFunction(WebElement element, String value) {
        wait.until(ExpectedConditions.textToBePresentInElement(element, value));
        Assert.assertTrue(element.getText().toLowerCase().contains(value.toLowerCase()), "No such text");
        new Actions(BaseDriver.getDriver()).sendKeys(Keys.ESCAPE).perform();
    }


    public void scroollToElement(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) BaseDriver.getDriver();
        js.executeScript("arguments[0].scrollIntoView(false);", element);
    }

    public void waitUntilVisible(WebElement element) {

        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void waitUntilClickable(WebElement element) {
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }


    public static String rndGmail() {
        return RandomStringUtils.randomAlphabetic(8).toLowerCase().concat("@gmail.com");
    }
}
