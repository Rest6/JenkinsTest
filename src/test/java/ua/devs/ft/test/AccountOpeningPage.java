package ua.devs.ft.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountOpeningPage extends BasePage{

    @FindBy(css = ".common-heading")
    WebElement openingTitle;

    public AccountOpeningPage(WebDriver driver) {
        super(driver);
    }
}
