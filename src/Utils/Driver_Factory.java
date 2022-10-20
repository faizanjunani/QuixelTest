package Utils;

import org.openqa.selenium.WebDriver;

    public class Driver_Factory {
        protected static WebDriver driver;

        public Driver_Factory() {

        }

        public static void quitDriver() {
            driver.quit();
            driver = null;
        }
    }
