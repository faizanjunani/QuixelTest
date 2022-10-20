package Utils;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;


import com.google.common.base.Function;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Util_Methods extends  Driver_Factory{
    public static void wait2Seconds() throws InterruptedException {
        Thread.sleep(1500);
    }

    public static void wait5Seconds() throws InterruptedException {
        Thread.sleep(5000);
    }

    public static void wait10Seconds() throws InterruptedException {
        Thread.sleep(10000);
    }

    public static void waitForVisibility(WebDriver driver, WebElement element) {
        element = (new WebDriverWait(driver,Duration.ofSeconds(10))).until(ExpectedConditions
                .visibilityOf(element));
    }

    public static void waitForClickable(WebElement element) {
        element = (new WebDriverWait(driver,Duration.ofSeconds(10))).until(ExpectedConditions
                .elementToBeClickable(element));
    }

    public static void clickByID(WebDriver driver, String Id)
    {
        driver.findElement(By.id(Id)).click();
    }
    public static void clickByXpath(WebDriver driver, String Xpath)
    {
        driver.findElement(By.xpath(Xpath)).click();
    }
    public static void sendKeysById(WebDriver driver, String Id, String value)
    {
        WebElement element = driver.findElement(By.id(Id));
        element.clear();
        element.sendKeys(value);
        //driver.findElement(By.id(Id)).sendKeys(value);
    }
    public static void sendKeysXpath(WebDriver driver, String Xpath, String value)
    {
        WebElement element = driver.findElement(By.xpath(Xpath));
        element.clear();
        element.sendKeys(value);
        //driver.findElement(By.xpath(Xpath)).sendKeys(value);
    }
    public static void sendTabByXpath(WebDriver driver, String Xpath)
    {
        driver.findElement(By.xpath(Xpath)).sendKeys(Keys.TAB);
    }
    public static void sendTabById(WebDriver driver, String Id)
    {
        driver.findElement(By.id(Id)).sendKeys(Keys.TAB);
    }
    public static void GetTextById(WebDriver driver, String Id)
    {
        driver.findElement(By.id(Id)).getText();
    }
}
