package ua.devs.ft.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PayPallPage extends BasePage{
    @FindBy(css = ".headerText")
    WebElement PayPallTitle;

    public PayPallPage(WebDriver driver) {
        super(driver);
    }
}
