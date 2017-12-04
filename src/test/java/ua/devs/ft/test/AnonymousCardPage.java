package ua.devs.ft.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AnonymousCardPage extends BasePage {

    @FindBy(css = ".common-heading")
    WebElement anonymousTitle;

    public AnonymousCardPage(WebDriver driver) {
        super(driver);
    }
}
