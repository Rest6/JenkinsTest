package ua.devs.ft.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TransportPage extends BasePage{

    @FindBy(css = ".common-heading")
    WebElement transportTitle;

    public TransportPage(WebDriver driver) {
        super(driver);
    }
}
