package ua.devs.ft.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class VasselsPage extends BasePage {

    @FindBy(css = ".common-heading")
    WebElement vasselsTitle;

    public VasselsPage(WebDriver driver) {
        super(driver);
    }
}
