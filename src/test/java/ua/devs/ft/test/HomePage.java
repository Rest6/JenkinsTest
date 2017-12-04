package ua.devs.ft.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    @FindBy(css = ".container>h1")
    WebElement mainTitle;

    @FindBy(css = "#french_number")
    WebElement frenchPhone;

    @FindBy(css = "#uk_number")
    WebElement englishPhone;

    @FindBy(css = ".btn>a")
    WebElement contactUsButton;

    @FindBy(css = ".section-1 .btn>a")
    WebElement hkButton;

    @FindBy(css = ".section-1 .block:nth-child(2) .btn>a")
    WebElement scotlandButton;

    @FindBy(css = ".section-1 .block:nth-child(3) .btn>a")
    WebElement ukButton;

    @FindBy(css = ".section-1 .block:nth-child(4) .btn>a")
    WebElement seychellesButton;

    @FindBy(css = ".juridictions-btn>a")
    WebElement jurisdictionButton;

    @FindBy(css = ".container:nth-child(2) .btn>a")
    WebElement secondJurisdictionButton;

    @FindBy(css = ".home-link")
    WebElement jurisdictionLink;

    @FindBy(css = ".section-3 .block:nth-child(2) .home-link")
    WebElement fullTransferLink;

    @FindBy(css = ".section-3 .block:nth-child(4) .home-link")
    WebElement taxLink;

    @FindBy(css = ".section-3 .block:nth-child(5) .home-link")
    WebElement bankLink;

    @FindBy(xpath = "//section/div[2]/div[6]/div/a[5]/span/span/h2")
    WebElement foundsButton;

    @FindBy(xpath = "//section/div[2]/div[7]/div[1]/div/div[5]/p")
    WebElement foundsText;

    @FindBy(xpath = "//section/div[2]/div[6]/div/a[1]/span/span/h2")
    WebElement registrationButton;

    @FindBy(xpath = "//section/div[2]/div[7]/div[1]/div/div[1]/p")
    WebElement registrationText;

    @FindBy(css = ".read-more-section .btn>a")
    WebElement learnMoreButton;

    @FindBy(css = "#menu-item-44>a")
    WebElement servicesLink;

    @FindBy(css = "#menu-item-45>a")
    WebElement contactLink;

    @FindBy(css = "#menu-item-46>a")
    WebElement faqLink;

    @FindBy(css = "#menu-item-1702>a")
    WebElement blogLink;

    @FindBy(css = "#menu-item-1282>a")
    WebElement jurisdictionsTab;

    @FindBy(css = "#menu-item-1024>a")
    WebElement bankTab;

    @FindBy(css = "#menu-item-1283>a")
    WebElement presentationsTab;

    @FindBy(css = "#menu-item-122>a")
    WebElement faqTab;

    @FindBy(css = "#menu-item-1229>a")
    WebElement fiduciariTab;

    @FindBy(css = "#menu-item-104>a")
    WebElement contactTab;

    public HomePage(WebDriver driver) {
        super(driver);
    }
}
