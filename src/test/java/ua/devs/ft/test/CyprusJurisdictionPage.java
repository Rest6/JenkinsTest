package ua.devs.ft.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CyprusJurisdictionPage extends BasePage {
    @FindBy(css = ".common-heading")
    WebElement cyprusTitle;

    @FindBy(css = ".btn #show-checkout-button")
    WebElement Checkout;

    @FindBy(css = ".woocommerce-Price-amount.amount")
    WebElement ammount;

    public CyprusJurisdictionPage(WebDriver driver) {
        super(driver);
    }
}
