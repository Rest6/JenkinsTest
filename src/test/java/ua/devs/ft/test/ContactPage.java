package ua.devs.ft.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactPage extends BasePage{

    @FindBy(css = ".common-heading")
    WebElement contactTitle;

    @FindBy(css = "#contact-descr .wpcfx2-field .wpcfx2-input")
    WebElement name;

    @FindBy(css = "#contact-descr .wpcfx2-field:nth-child(2) .wpcfx2-input")
    WebElement email;

    @FindBy(css = "#contact-descr .wpcfx2-field:nth-child(3) .wpcfx2-input")
    WebElement phone;

    @FindBy(css = "#contact-descr .right .wpcfx2-field .wpcfx2-input")
    WebElement message;

    @FindBy(css = "#contact-descr .wpcfx2-submit")
    WebElement submit;

    @FindBy(css = "#contact-descr .ajax-response")
    WebElement successMessage;

    public ContactPage(WebDriver driver) {
        super(driver);
    }
}
