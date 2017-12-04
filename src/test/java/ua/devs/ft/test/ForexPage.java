package ua.devs.ft.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ForexPage extends BasePage{

    @FindBy(css = ".common-heading")
    WebElement forexTitle;

    public ForexPage(WebDriver driver) {
        super(driver);
    }
}
