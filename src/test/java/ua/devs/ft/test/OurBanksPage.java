package ua.devs.ft.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OurBanksPage extends BasePage {

    @FindBy(css = ".common-heading")
    WebElement ourBanksTitle;

    @FindBy(css = ".bottom>ul>li>a")
    WebElement PresentationsLink;

    @FindBy(css = ".bottom>ul>li:nth-child(2)>a")
    WebElement faqLink;

    @FindBy(css = ".bottom>ul>li:nth-child(3)>a")
    WebElement ukLink;

    @FindBy(css = ".bottom>ul>li:nth-child(4)>a")
    WebElement hkLink;

    @FindBy(css = ".bottom>ul>li:nth-child(5)>a")
    WebElement scotlandLink;

    public OurBanksPage(WebDriver driver) {
        super(driver);
    }
}
