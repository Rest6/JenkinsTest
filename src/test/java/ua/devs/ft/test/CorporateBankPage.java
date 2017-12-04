package ua.devs.ft.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CorporateBankPage extends BasePage{

    @FindBy(css = ".common-heading")
    WebElement corporateTitle;

    @FindBy(css = ".btn #show-checkout-button")
    WebElement Checkout;

    @FindBy(css = ".woocommerce-Price-amount.amount")
    WebElement ammount;

    @FindBy(css = ".close>i")
    WebElement close;

    @FindBy(css = ".bottom>ul>li:nth-child(5)>a")
    WebElement scotlandLink;

    public CorporateBankPage(WebDriver driver) {
        super(driver);
    }
}
