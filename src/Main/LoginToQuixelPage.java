package Main;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Utils.Util_Methods;

public class LoginToQuixelPage {

    public LoginToQuixelPage()
    {

    }
    public String NavigateToLogin(WebDriver driver) throws InterruptedException {
        WebDriver local_Var = driver;
        String error = "";
        WebElement element = local_Var.findElement(By.xpath("/html/body/div[1]/div/header/div/div[2]/nav/ul/div[6]/li/span/a"));
        Util_Methods.waitForVisibility(local_Var,element);
        Util_Methods.clickByXpath(local_Var,
                "/html/body/div[1]/div/header/div/div[2]/nav/ul/div[6]/li/span/a");
        Util_Methods.wait10Seconds();
        System.out.println("Navigate to Login Executed");
        return error;

    }
    public String SignInWithEpicGames(WebDriver driver) throws InterruptedException {
        WebDriver local_Var = driver;
        String error = "";
        Util_Methods.clickByXpath(local_Var,
                "/html/body/div[1]/div/div[2]/div/div/div[1]/div/div/form/div/div[1]/button");
                        ///html/body/div[1]/div/div[1]/div/div/form/div/div[1]/button"

        Util_Methods.wait5Seconds();
        System.out.println("Switching from Quixel to Epic Games Login");
        Util_Methods.clickByXpath(local_Var,
                "/html/body/div[2]/div[2]/div/div/div[2]/div/div[1]/ul/div[1]");
        Util_Methods.wait2Seconds();
        System.out.println("Sign In With Epic Games Executed");
        return error;
    }
    public String EnterUserName(WebDriver driver)throws Exception {
        WebDriver local_Var = driver;
        String error = "";
        //Enter email
        Util_Methods.sendKeysXpath(local_Var,
                "/html/body/div[2]/div[2]/div/div/div[2]/div/form/div[1]/div/input",
                "alfa9291@gmail.com");
        Util_Methods.wait2Seconds();
        System.out.println("Enter User Name Executed");
        return error;
    }
    public String EnterPasword(WebDriver driver)throws Exception {
        WebDriver local_Var = driver;
        String error = "";
        //Enter Password
        Util_Methods.sendKeysXpath(local_Var,
                "/html/body/div[2]/div[2]/div/div/div[2]/div/form/div[2]/div/input",
                "P@$$w0rd@$@$");
        Util_Methods.wait2Seconds();
        System.out.println("Enter Password Executed");
        return error;
    }
    public String ClickSignIn(WebDriver driver) throws InterruptedException {
        WebDriver local_Var = driver;
        String error = "";
        System.out.println("Wait for Login button to load");
        Thread.sleep(7000);
        //Click Sign In
        Util_Methods.clickByXpath(local_Var,
                "/html/body/div[2]/div[2]/div/div/div[2]/div/form/div[5]/button");
        Thread.sleep(10000);
        System.out.println("Sign In Executed");
        return error;

    }
}
