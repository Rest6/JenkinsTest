package ua.devs.ft.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FullTransferPage extends BasePage{

    @FindBy(css = ".common-heading")
    WebElement transferTitle;

    public FullTransferPage(WebDriver driver) {
        super(driver);
    }
}
