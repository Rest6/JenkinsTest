package ua.devs.ft.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BankAccountPage extends BasePage{

    @FindBy(css = ".common-heading")
    WebElement bankTitle;

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

    @FindBy(css = ".links>a")
    WebElement currentLink;

    @FindBy(css = ".links>a:nth-child(2)")
    WebElement depositLink;

    @FindBy(css = ".container .block:nth-child(2) .links>a")
    WebElement corporateLink;

    @FindBy(css = ".container .block:nth-child(2) .links>a:nth-child(2)")
    WebElement eCommerceLink;

    @FindBy(css = ".container .block:nth-child(4) .links>a")
    WebElement visaLink;

    @FindBy(css = ".container .block:nth-child(4) .links>a:nth-child(2)")
    WebElement anonymousLink;

    @FindBy(css = ".container .block:nth-child(5) .links>a")
    WebElement ourBanksLink;

    public BankAccountPage(WebDriver driver) {
        super(driver);
    }
}
