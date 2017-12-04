package ua.devs.ft.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountingPage extends BasePage{

    @FindBy(css = ".common-heading")
    WebElement accountingTitle;

    public AccountingPage(WebDriver driver) {
        super(driver);
    }
}
