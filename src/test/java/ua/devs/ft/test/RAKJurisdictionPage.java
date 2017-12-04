package ua.devs.ft.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RAKJurisdictionPage extends BasePage {

    @FindBy(css = ".common-heading")
    WebElement rakTitle;

    @FindBy(css = ".btn #show-checkout-button")
    WebElement Checkout;

    @FindBy(css = ".woocommerce-Price-amount.amount")
    WebElement ammount;

    public RAKJurisdictionPage(WebDriver driver) {
        super(driver);
    }
}
