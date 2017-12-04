package ua.devs.ft.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RMCPage extends BasePage{


    @FindBy(css = ".common-heading")
    WebElement rmcTitle;


    public RMCPage(WebDriver driver) {
        super(driver);
    }
}
