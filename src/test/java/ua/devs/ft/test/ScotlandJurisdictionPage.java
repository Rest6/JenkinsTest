package ua.devs.ft.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ScotlandJurisdictionPage extends BasePage {

    @FindBy(css = ".common-heading")
    WebElement scotlandTitle;

    @FindBy(css = ".btn #show-checkout-button")
    WebElement scotCheckout;

    @FindBy(css = ".woocommerce-Price-amount.amount")
    WebElement ammount;

    public ScotlandJurisdictionPage(WebDriver driver) {
        super(driver);
    }
}
