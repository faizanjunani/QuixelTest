package Main;

import Utils.Driver_Factory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import Utils.Util_Methods;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import java.sql.Connection;
import java.sql.SQLException;

public class Test_Class {
    WebDriver driver;
    String error;
    WebElement element;
    LoginToQuixelPage loginQuixel;
    MegaScansPage megaScans;

    public static void main(String[] args) throws Exception {
        Test_Class tc = new Test_Class();
        tc.StartBrowser();
        tc.InitializeObjects();
        Thread.sleep(300000);
        //tc.LoginToQuixel();
        tc.DownloadAsset1();
        tc.DownloadAsset2();
    }

    public void StartBrowser() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:/Users/FaizanJunani/Downloads/chromedriver_win32/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.quixel.com");
        System.out.println("Before Thread Sleep");
        Thread.sleep(1000);
        System.out.println("Driver Started");
        /*ChromeOptions options = new ChromeOptions();
        System.out.print("line 41 executed");
        options.setExperimentalOption("debuggerAddress", "127.0.0.1:9222");
        System.out.print("line 43 executed");
        WebDriver driver = new ChromeDriver(options);
        System.out.print("line 45 executed");
        System.out.println(driver.getTitle());
        System.out.print("line 47 executed");
        driver.get("www.quixel.com");*/

    }
    public void InitializeObjects() throws ClassNotFoundException
    {
        loginQuixel = new LoginToQuixelPage();
        megaScans = new MegaScansPage();
        System.out.println("Initialization Complete");
    }
    public void LoginToQuixel() throws Exception {
        loginQuixel.NavigateToLogin(driver);
        loginQuixel.SignInWithEpicGames(driver);
        loginQuixel.EnterUserName(driver);
        loginQuixel.EnterPasword(driver);
        loginQuixel.ClickSignIn(driver);

    }
    public void DownloadAsset1() throws InterruptedException {
        megaScans.NavigateToMegaScansHome(driver);
        megaScans.AgreeToEULA(driver);
        megaScans.RemoveSubscriptionPopup(driver);
        megaScans.SelectTypeCategory(driver);
        megaScans.SelectTypeSubCategory(driver);
        megaScans.StartFreeTrial(driver);
        megaScans.SelectAsset1(driver);
        megaScans.StartFreeTrial(driver);
        megaScans.DownloadAsset(driver);
    }
    public void DownloadAsset2() throws InterruptedException {
        megaScans.SelectAsset2(driver);
        megaScans.DownloadAsset2(driver);
    }
}
