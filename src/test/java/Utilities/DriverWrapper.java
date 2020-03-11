package Utilities;

import io.cucumber.core.gherkin.Scenario;
import org.apache.commons.io.FileUtils;
import org.junit.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;

public class DriverWrapper {

    public static WebDriver driver;

    public static WebDriver getDriver() {
        return driver;
    }

    public static void initializeDriver(){

        String browserType = "chrome";

        if (browserType.equals("chrome")){
            System.setProperty("webdriver.chrome.driver", "libs/chromedriver.exe");
            driver = new ChromeDriver();
        } else {
            System.setProperty("webdriver.gecko.driver", "libs/geckodriver.exe");
            driver = new FirefoxDriver();
        }
    }
}
