package ua.devs.ft.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ExpatriationLatviaPage extends BasePage{

    @FindBy(css = ".common-heading")
    WebElement expatriationTitle;

    public ExpatriationLatviaPage(WebDriver driver) {
        super(driver);
    }
}
