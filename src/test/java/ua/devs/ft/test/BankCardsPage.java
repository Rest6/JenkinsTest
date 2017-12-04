package ua.devs.ft.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BankCardsPage extends BasePage {

    @FindBy(css = ".common-heading")
    WebElement cardsTitle;

    public BankCardsPage(WebDriver driver) {
        super(driver);
    }
}
