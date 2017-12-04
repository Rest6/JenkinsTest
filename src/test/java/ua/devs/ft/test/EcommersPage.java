package ua.devs.ft.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EcommersPage extends BasePage {

    @FindBy(css = ".common-heading")
    WebElement ecommerceTitle;

    @FindBy(css = ".bottom>ul>li>a")
    WebElement corporateLink;

    @FindBy(css = ".bottom>ul>li:nth-child(2)>a")
    WebElement cardsLink;

    @FindBy(css = ".bottom>ul>li:nth-child(3)>a")
    WebElement anonCardLink;

    @FindBy(css = ".bottom>ul>li:nth-child(4)>a")
    WebElement banksLink;

    public EcommersPage(WebDriver driver) {
        super(driver);
    }
}
