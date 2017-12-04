package ua.devs.ft.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FiduciariPage extends BasePage{

    @FindBy(css = ".common-heading")
    WebElement fiduciariTitle;

    public FiduciariPage(WebDriver driver) {
        super(driver);
    }
}
