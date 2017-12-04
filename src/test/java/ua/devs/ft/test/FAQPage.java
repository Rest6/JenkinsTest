package ua.devs.ft.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FAQPage extends BasePage {

    @FindBy(css = ".common-heading")
    WebElement faqTitle;

    public FAQPage(WebDriver driver) {
        super(driver);
    }
}
