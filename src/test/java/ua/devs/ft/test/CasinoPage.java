package ua.devs.ft.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CasinoPage extends BasePage {

    @FindBy(css = ".common-heading")
    WebElement casinoTitle;

    public CasinoPage(WebDriver driver) {
        super(driver);
    }
}
