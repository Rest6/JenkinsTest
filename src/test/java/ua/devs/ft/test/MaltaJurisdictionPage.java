package ua.devs.ft.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MaltaJurisdictionPage extends BasePage {

    @FindBy(css = ".common-heading")
    WebElement maltaTitle;

    @FindBy(css = ".btn #show-checkout-button")
    WebElement Checkout;

    @FindBy(css = ".woocommerce-Price-amount.amount")
    WebElement ammount;

    public MaltaJurisdictionPage(WebDriver driver) {
        super(driver);
    }
}
