package ua.devs.ft.test;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class BaseTest extends ConciseAPI{

    static WebDriver driver;

    @BeforeClass
    public static void setUp() {
        System.setProperty("webdriver.chrome.driver", "//home//qa//Downloads//chromedriver");
        driver = new ChromeDriver();
        //driver.manage().window().setPosition(new Point(1900,1050));
    }

    @AfterClass
    public static void tearDown() {

        driver.quit();
    }


    public WebDriver getWebDriver() {
        return driver;
    }
}
