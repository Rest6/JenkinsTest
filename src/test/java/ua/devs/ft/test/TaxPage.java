package ua.devs.ft.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TaxPage extends BasePage{

    @FindBy(css = ".common-heading")
    WebElement taxTitle;


    public TaxPage(WebDriver driver) {
        super(driver);
    }
}
