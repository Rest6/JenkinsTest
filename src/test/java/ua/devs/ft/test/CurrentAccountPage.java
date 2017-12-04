package ua.devs.ft.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CurrentAccountPage extends BasePage{

    @FindBy(css = ".common-heading")
    WebElement currentTitle;

    @FindBy(css = ".btn #show-checkout-button")
    WebElement Checkout;

    @FindBy(css = ".woocommerce-Price-amount.amount")
    WebElement ammount;

    public CurrentAccountPage(WebDriver driver) {
        super(driver);
    }
}
