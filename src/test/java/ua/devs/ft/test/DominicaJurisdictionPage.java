package ua.devs.ft.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DominicaJurisdictionPage extends BasePage{

    @FindBy(css = ".common-heading")
    WebElement dominicaTitle;

    @FindBy(css = ".btn #show-checkout-button")
    WebElement Checkout;

    @FindBy(css = ".woocommerce-Price-amount.amount")
    WebElement ammount;

    public DominicaJurisdictionPage(WebDriver driver) {
        super(driver);
    }
}
