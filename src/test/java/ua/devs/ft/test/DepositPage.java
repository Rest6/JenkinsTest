package ua.devs.ft.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DepositPage extends BasePage{

    @FindBy(css = ".common-heading")
    WebElement depositTitle;

    @FindBy(css = ".bottom>ul>li>a")
    WebElement personalLink;

    @FindBy(css = ".bottom>ul>li:nth-child(2)>a")
    WebElement corporateLink;

    @FindBy(css = ".bottom>ul>li:nth-child(3)>a")
    WebElement banksLink;

    @FindBy(css = ".bottom>ul>li:nth-child(4)>a")
    WebElement faq;

    @FindBy(css = ".slider-4-pager .pager:nth-child(2)>h2")
    WebElement section1;

    @FindBy(css = ".slider-4 .slide:nth-child(2)>ul>li")
    WebElement section1Text;

    public DepositPage(WebDriver driver) {
        super(driver);
    }
}
