package ua.devs.ft.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage extends ConciseAPI{

    public WebDriver getWebDriver() {
        return driver;
    }

    public BasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    private WebDriver driver;
}
