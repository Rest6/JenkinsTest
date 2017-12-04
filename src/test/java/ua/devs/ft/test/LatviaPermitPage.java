package ua.devs.ft.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LatviaPermitPage extends BasePage {

    @FindBy(css = ".common-heading")
    WebElement permitTitle;

    public LatviaPermitPage(WebDriver driver) {
        super(driver);
    }
}
