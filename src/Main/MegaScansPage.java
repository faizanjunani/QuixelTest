package Main;

import jdk.jshell.execution.Util;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Utils.Util_Methods;
import org.openqa.selenium.interactions.Actions;

public class MegaScansPage extends Utils.Util_Methods {

    public MegaScansPage() {

    }
    public String NavigateToMegaScansHome(WebDriver driver) throws InterruptedException {
        WebDriver local_Var = driver;
        String error = "";
        WebElement hoverElement = local_Var.findElement(By.xpath(
                "/html/body/div[1]/div/header/div/div[2]/nav/ul/div[2]/li/ul/div/div[1]/span/button"));
        //Creating object of an Actions class
        Actions action = new Actions(local_Var);
        //Performing the mouse hover action on the target element.
        action.moveToElement(hoverElement).perform();
        Util_Methods.wait2Seconds();
        Util_Methods.clickByXpath(local_Var,
                "/html/body/div[1]/div/header/div/div[2]/nav/ul/div[2]/li/ul/div/div[1]/div/div/span/div[1]/li[1]/span/a");
        Util_Methods.wait5Seconds();
        Thread.sleep(5000);
        return error;
    }
    public String AgreeToEULA(WebDriver driver) throws InterruptedException {
        WebDriver local_Var = driver;
        String error = "";
        //Tick Checkbox
        Util_Methods.clickByXpath(local_Var,
                "/html/body/div[1]/div/div/div[2]/section/div[1]/div/label");
        Util_Methods.wait2Seconds();
        //Click Continue
        Util_Methods.clickByXpath(local_Var,
                "/html/body/div[1]/div/div/div[2]/section/div[2]/div/button");
        Util_Methods.wait5Seconds();
        return error;
    }
    public String RemoveSubscriptionPopup(WebDriver driver) throws InterruptedException {
        WebDriver local_Var = driver;
        String error = "";
        Util_Methods.clickByXpath(local_Var,
                "/html/body/div[1]/div/div[1]/div");
        Util_Methods.wait2Seconds();
        return error;
    }
    public String SelectTypeCategory(WebDriver driver) throws InterruptedException {
        WebDriver local_Var = driver;
        String error = "";
        //Go To Free tab
        Util_Methods.clickByXpath(local_Var,
              "/html/body/div[1]/div/div/div/div[1]/div/ul/li[4]/a/div");
        Util_Methods.wait2Seconds();
        //Select Decals Category
        Util_Methods.clickByXpath(local_Var,
                "/html/body/div[1]/div/div/div/div[2]/div/div/section[1]/div/a[4]/span/div/div/div/div[2]/div");
        Util_Methods.wait2Seconds();
        return error;
    }
    public String SelectTypeSubCategory(WebDriver driver) throws InterruptedException {
        WebDriver local_Var = driver;
        String error = "";
        ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 800)");
        //Select Street Sub Category
        Util_Methods.clickByXpath(local_Var,
                "/html/body/div[1]/div/div/div/div[2]/div/div/section[1]/div/a[4]/span/div/div/div/div[2]/div");
        Util_Methods.wait5Seconds();
        return error;
    }
    public String SelectAsset1(WebDriver driver) throws InterruptedException {
        WebDriver local_Var = driver;
        String error = "";
        //Enter search bar parameter as Asset Code
        Util_Methods.sendKeysXpath(driver,
                "/html/body/div[1]/div/div/div/div[4]/div[1]/div[1]/div/div/div/div[2]/div/input",
                "sdus0qk");
        //Press ENTER in search bar
        local_Var.findElement(By.xpath(
                "/html/body/div[1]/div/div/div/div[4]/div[1]/div[1]/div/div[1]/div/div[2]/div/input"))
                .sendKeys(Keys.ENTER);
        ((JavascriptExecutor) local_Var).executeScript("window.scrollTo(0, 500)");
        //Click The Asset
        Util_Methods.clickByXpath(local_Var,
                "/html/body/div[1]/div/div/div/div[2]/div/div/section[2]/div/div/li/div/a/span/div/div/div/div");
        Util_Methods.wait2Seconds();
        //Download Asset
        ((JavascriptExecutor) local_Var).executeScript("window.scrollTo(0, 500)");
        Util_Methods.clickByXpath(local_Var,
                "/html/body/div[1]/div/div/div/div[3]/div/div[2]/div/div/div/div[2]/div[2]/div/span/span/button");
        Util_Methods.wait2Seconds();
        return error;
    }
    public String StartFreeTrial(WebDriver driver) throws InterruptedException {
        WebDriver local_Var = driver;
        String error = "";
        ((JavascriptExecutor) local_Var).executeScript("window.scrollTo(0, 500)");
        //Click Start Free Trial
        Util_Methods.clickByXpath(local_Var,
                "/html/body/div[1]/div/div/div[1]/div[2]/div/section/div[2]/div/div[4]/button");
        Util_Methods.wait5Seconds();
        //Click Get Started
        Util_Methods.clickByXpath(local_Var,
                "/html/body/div[1]/div/div/div[1]/div[2]/div/section/div[2]/div/div/button");
        Util_Methods.wait2Seconds();
        local_Var.navigate().refresh();
        return error;
    }
    public String DownloadAsset(WebDriver driver) throws InterruptedException {
        WebDriver local_Var = driver;
        String error = "";
        Util_Methods.wait5Seconds();
        ((JavascriptExecutor) local_Var).executeScript("window.scrollTo(0, 500)");
        //Change resolution open dropdown
        Util_Methods.clickByXpath(local_Var,
                "/html/body/div[1]/div/div/div/div[3]/div/div[2]/div/div/div/div[2]/div[2]/div/div/div");
        //Select Resolution
        Util_Methods.clickByXpath(local_Var,
                "/html/body/div[1]/div/div/div/div[3]/div/div[2]/div/div/div/div[2]/div[2]/div/div/div/div/ul/li[1]/button");
        //Click Download
        Util_Methods.clickByXpath(local_Var,
                "/html/body/div[1]/div/div/div/div[3]/div/div[2]/div/div/div/div[2]/div[2]/div/span/span/button");
        return error;

    }
    public String SelectAsset2(WebDriver driver) throws InterruptedException {
        WebDriver local_Var = driver;
        String error = "";
        //Close Existing popup
        Util_Methods.clickByXpath(local_Var,
                "/html/body/div[1]/div/div/div/div[3]/div/div[2]/div/div/div/div[1]/div[1]/div/div/div[2]");
        Util_Methods.wait2Seconds();
        //Reset Filter
        Util_Methods.clickByXpath(local_Var,
                "/html/body/div[1]/div/div/div/div[4]/div[1]/div[1]/div/div/span[2]");
        Util_Methods.wait2Seconds();
        //Select Color from dropdown
        Util_Methods.clickByXpath(local_Var,
                "/html/body/div[1]/div/div/div/div[4]/div[2]/div[5]/div/button");
        Util_Methods.wait2Seconds();
        Util_Methods.clickByXpath(local_Var,
                " /html/body/div[1]/div/div/div/div[4]/div[2]/div[5]/div/div/ul/li[5]/button");
        Util_Methods.wait2Seconds();
        //Enter search bar parameter as Asset Code
        Util_Methods.sendKeysXpath(driver,
                "/html/body/div[1]/div/div/div/div[4]/div[1]/div[1]/div/div[1]/div/div[2]/div/input",
                "siEoZ");
        //Press ENTER in search bar
        local_Var.findElement(By.xpath(
                        "/html/body/div[1]/div/div/div/div[4]/div[1]/div[1]/div/div[1]/div/div[2]/div/input"))
                .sendKeys(Keys.ENTER);
        ((JavascriptExecutor) local_Var).executeScript("window.scrollTo(0, 500)");
        //Click The Asset
        Util_Methods.clickByXpath(local_Var,
                "/html/body/div[1]/div/div/div/div[2]/div/div/section[2]/div/div/li/div/a/span/div/div/div/div");
        Util_Methods.wait2Seconds();
        return error;
    }
    public String DownloadAsset2(WebDriver driver) throws InterruptedException {
        WebDriver local_Var = driver;
        String error = "";
        //Download Asset
        ((JavascriptExecutor) local_Var).executeScript("window.scrollTo(0, 500)");
        Util_Methods.clickByXpath(local_Var,
                "/html/body/div[1]/div/div/div/div[3]/div/div[2]/div/div/div/div[2]/div[2]/div/span/span/button");
        Util_Methods.wait2Seconds();
        return error;
    }


}
